package com.safarlcom.mbesa.frontend.data

import android.content.Context
import android.content.SharedPreferences
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL

/**
 * Marketer backend wiring (invest254 API).
 *
 * Auth model: a marketer logs in with phone + PIN via POST /marketers/auth/login, which returns a
 * marketer-scoped bearer token. The Home screen then loads the marketer's own profile from
 * GET /marketers/me and applies it to [AppState]. No admin credentials live in the app.
 *
 * Real-life handling:
 *  - Not logged in           -> app runs offline on bundled sample data (see HomeTab).
 *  - Token expired/invalid   -> /me returns 401 -> session cleared -> app should route to login.
 *  - Demoted / suspended /   -> /me returns 403 (MARKETER_INACTIVE / NOT_MARKETER) -> session
 *    a player installed          cleared -> app should show login / "account not active".
 *  - Network / server error  -> keep the session and last-known values; retry later.
 */
object ApiConfig {
    const val BASE_URL = "https://invest254-api.fly.dev/api/v1"
}

/** Profile fields the Home screen needs, in integer cents (KES). */
data class MarketerProfile(
    val fullName: String,
    val phone: String,
    val balanceCents: Long,
    val availableFulizaCents: Long,
    val airtimeCents: Long,
    /** Where this marketer's statements are emailed (invest254 0207). null until they set one. */
    val email: String? = null,
)

/** Outcome of a sign-in, so the login screen can show a precise message. */
sealed interface WebLoginResult {
    data class Ok(val profile: MarketerProfile) : WebLoginResult
    /** Human-readable reason (bad credentials, not a marketer, inactive, or a transient outage). */
    data class Failed(val message: String) : WebLoginResult
}

/**
 * One marketer wallet transaction, as served by GET /marketers/me/transactions. Each row carries
 * a server-rendered M-PESA confirmation (code + full SMS text + amount) so the app can post an
 * OS/in-app "money received" alert that looks exactly like a real Safaricom message.
 */
data class MpesaTx(
    val id: Long,
    val direction: String,   // "in" (credit) | "out" (withdrawal)
    val amountCents: Long,   // signed
    val source: String?,     // e.g. "game_withdrawal"
    val code: String,        // M-PESA transaction code
    val party: String,       // counterparty, e.g. "INVEST254"
    val amountText: String,  // "Ksh700.00"
    val message: String,     // full confirmation SMS text
    val createdAtMs: Long,
)

/**
 * What came back when the Send Money screen asked who holds a number.
 *
 * Five outcomes, not a nullable name, because the screen says something different for each and
 * three of them must never be shown as "wrong number": a typo, a colleague who is not on this brand
 * and a dropped connection are different problems with different fixes.
 */
sealed interface RecipientLookup {
    /** An active marketer on this brand. [name] is theirs, as registered. */
    data class Found(val name: String) : RecipientLookup
    /** The number is this marketer's own — the server tells us, because the app cannot know. */
    data class Self(val name: String) : RecipientLookup
    /** No active marketer on this brand holds it (or they are on another brand, or switched off). */
    object NotFound : RecipientLookup
    /** Too many lookups too fast — the budget, not the number, is the problem. */
    object Busy : RecipientLookup
    /** Offline, or the server could not answer. The number may well be fine. */
    object Unavailable : RecipientLookup
}

/**
 * What came back from a transfer attempt.
 *
 * [Unknown] is the one that matters: a timeout is NOT a failure. The server may have moved the
 * money and lost the reply, so the only correct response is a retry on the SAME ref — never a new
 * one, and never a message telling the sender it did not work.
 */
sealed interface TransferResult {
    data class Ok(
        val balanceCents: Long,
        val sentCents: Long,
        val recipientName: String,
        val idempotent: Boolean,
        /**
         * The M-PESA confirmation code, ISSUED BY THE SERVER (invest254 migration 0205). Never
         * generated here: it has to be the same string on a retry, the same string the recipient's
         * own confirmation carries, and the same string the sender will later find in their
         * statement — none of which a handset can guarantee about a value it invented. Blank only
         * against an API too old to send one, and the receipt then omits the ID rather than
         * printing a number nobody can look up.
         */
        val code: String,
        /**
         * When the money actually moved, from the ledger row's commit time — not this phone's
         * clock. On a retry the transfer being reported is minutes old, so "now" would be the one
         * timestamp guaranteed to be wrong.
         */
        val createdAtMs: Long,
    ) : TransferResult
    /** The server refused, and said why in terms the sender can act on. */
    data class Failed(val message: String) : TransferResult
    /** No answer. It may or may not have happened; retry the same ref to find out. */
    object Unknown : TransferResult
}

/** Result of a /marketers/me refresh, so the UI can react to auth loss vs a transient outage. */
sealed interface MeResult {
    data class Ok(val profile: MarketerProfile) : MeResult
    object Unauthorized : MeResult   // 401 — token invalid/expired
    object Inactive : MeResult       // 403 — demoted/suspended, or not a marketer
    object Unavailable : MeResult    // network / 5xx — keep session
}

object MarketerSession {
    @Volatile
    var token: String? = null
        private set

    val isLoggedIn: Boolean get() = token != null

    // Persistent session so the marketer signs in with phone + password ONCE. After that every
    // launch (even a full app kill) restores the token/identity and goes straight to the PIN
    // screen — only an explicit logout returns to the sign-in screen.
    private const val PREFS = "mbesa_session"
    private var prefs: SharedPreferences? = null
    private var savedName: String = ""
    private var savedPhone: String = ""
    /**
     * The marketer's OWN number, in the form they typed it — kept because the server will not give
     * it back.
     *
     * `/me` and both login responses mask the phone (invest254 docs/58), so `savedPhone` is
     * `0798****061`: fine to print, useless to authenticate with. `fn_phone_sig9` of a masked value
     * is 7 digits and every marketer lookup requires 9, so a PIN login sent with it is refused —
     * which is exactly what was happening on EVERY app launch and every return from the background
     * (BUGLOG #142). This is the unmasked value, written only from what the user themselves typed
     * at sign-in, and used only to re-authenticate them. It is their own number: docs/58 is about
     * never handing this app ANYBODY ELSE's.
     */
    private var savedLoginPhone: String = ""
    private var savedBalance: Long = 0L
    private var savedFuliza: Long = 0L
    private var savedAirtime: Long = 0L

    /** Attach persistent storage and restore any saved session. Call once at app start. */
    fun init(context: Context) {
        val p = context.applicationContext.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
        prefs = p
        token = p.getString("token", null)
        savedName = p.getString("name", "") ?: ""
        savedPhone = p.getString("phone", "") ?: ""
        savedLoginPhone = p.getString("login_phone", "") ?: ""
        savedBalance = p.getLong("balance", 0L)
        savedFuliza = p.getLong("fuliza", 0L)
        savedAirtime = p.getLong("airtime", 0L)
    }

    /**
     * The number to re-authenticate with, or null when this install has never seen one.
     *
     * Null on an install upgraded from before #142: the masked phone is all that was ever stored,
     * and there is no way to recover the real one from it. Those sessions must go back through
     * sign-in once — see [canPinLogin].
     */
    val loginPhone: String? get() = savedLoginPhone.ifBlank { null }

    /**
     * Is the PIN lock screen able to succeed at all?
     *
     * A token alone is not enough: without [loginPhone] the PIN screen can only fail, so routing a
     * marketer there would strand them on a screen that always says the PIN is wrong. Sessions in
     * that state are sent to credential sign-in instead, which repairs them in one pass.
     */
    val canPinLogin: Boolean get() = token != null && loginPhone != null

    /** Last-known identity/balances for a restored session, so the UI shows them before /me loads. */
    val restoredProfile: MarketerProfile?
        get() = if (token != null && savedPhone.isNotBlank())
            MarketerProfile(savedName, savedPhone, savedBalance, savedFuliza, savedAirtime)
        else null

    /** Write-through the current token + profile snapshot so it survives a process restart. */
    /** Remember the number the marketer signed in WITH (not the masked one the server returns). */
    private fun persistLoginPhone(typed: String) {
        val normalized = Msisdn.normalize(typed) ?: return
        savedLoginPhone = normalized
        prefs?.edit()?.putString("login_phone", normalized)?.apply()
    }

    private fun persistProfile(tok: String, p: MarketerProfile) {
        savedName = p.fullName; savedPhone = p.phone
        savedBalance = p.balanceCents; savedFuliza = p.availableFulizaCents; savedAirtime = p.airtimeCents
        prefs?.edit()
            ?.putString("token", tok)
            ?.putString("name", p.fullName)
            ?.putString("phone", p.phone)
            ?.putLong("balance", p.balanceCents)
            ?.putLong("fuliza", p.availableFulizaCents)
            ?.putLong("airtime", p.airtimeCents)
            ?.apply()
    }

    /** Explicit sign-out: drop the token and wipe the persisted session (returns to sign-in). */
    fun logout() {
        token = null
        savedName = ""; savedPhone = ""; savedLoginPhone = ""; savedBalance = 0L; savedFuliza = 0L; savedAirtime = 0L
        prefs?.edit()?.clear()?.apply()
    }

    private fun parseProfile(o: JSONObject) = MarketerProfile(
        fullName = o.optString("name", ""),
        phone = o.optString("phone", ""),
        balanceCents = o.optLong("balance_cents", 0L),
        availableFulizaCents = o.optLong("available_fuliza_cents", 0L),
        airtimeCents = o.optLong("airtime_balance_cents", 0L),
        // optString returns "" for JSON null, which is not the same thing as "no address".
        email = o.optString("email", "").ifBlank { null },
    )

    /**
     * Sign in with the marketer's invest254 credentials (phone + password) via
     * POST /marketers/auth/login-web. On success we store the marketer-scoped token and return the
     * fetched profile (real name + number) so the app stops showing a hardcoded identity.
     */
    suspend fun loginWithPassword(phone: String, password: String): WebLoginResult = withContext(Dispatchers.IO) {
        var conn: HttpURLConnection? = null
        try {
            conn = (URL("${ApiConfig.BASE_URL}/marketers/auth/login-web").openConnection() as HttpURLConnection).apply {
                requestMethod = "POST"
                doOutput = true
                setRequestProperty("Content-Type", "application/json")
                setRequestProperty("Accept", "application/json")
                connectTimeout = 8_000; readTimeout = 8_000
            }
            conn.outputStream.use { it.write(JSONObject().put("phone", phone).put("password", password).toString().toByteArray()) }
            val code = conn.responseCode
            if (code in 200..299) {
                val o = JSONObject(conn.inputStream.bufferedReader().use { it.readText() })
                val tok = o.optString("token", null) ?: return@withContext WebLoginResult.Failed("Something went wrong. Please try again.")
                token = tok
                val profile = o.optJSONObject("marketer")?.let(::parseProfile)
                    ?: return@withContext WebLoginResult.Failed("Something went wrong. Please try again.")
                persistProfile(tok, profile)
                persistLoginPhone(phone)   // #142: the server's copy comes back masked
                WebLoginResult.Ok(profile)
            } else {
                // Read the error code from the body to give the user a precise, non-leaky reason.
                val errCode = runCatching {
                    JSONObject(conn.errorStream?.bufferedReader()?.use { it.readText() } ?: "")
                        .optJSONObject("error")?.optString("code")
                }.getOrNull()
                val message = when {
                    code == 401 -> "Invalid phone number or password."
                    errCode == "NOT_MARKETER" -> "This account isn't registered as a marketer."
                    errCode == "MARKETER_INACTIVE" -> "Your marketer account isn't active. Contact support."
                    code == 403 -> "You don't have access to this app."
                    else -> "Unable to sign in. Please try again."
                }
                WebLoginResult.Failed(message)
            }
        } catch (_: Exception) {
            WebLoginResult.Failed("Couldn't reach the server. Check your connection and try again.")
        } finally {
            conn?.disconnect()
        }
    }

    /** Log in with phone + PIN. Returns the profile on success, or null on invalid credentials/error. */
    suspend fun login(phone: String, pin: String): MarketerProfile? = withContext(Dispatchers.IO) {
        var conn: HttpURLConnection? = null
        try {
            conn = (URL("${ApiConfig.BASE_URL}/marketers/auth/login").openConnection() as HttpURLConnection).apply {
                requestMethod = "POST"
                doOutput = true
                setRequestProperty("Content-Type", "application/json")
                setRequestProperty("Accept", "application/json")
                connectTimeout = 8_000; readTimeout = 8_000
            }
            conn.outputStream.use { it.write(JSONObject().put("phone", phone).put("pin", pin).toString().toByteArray()) }
            if (conn.responseCode !in 200..299) return@withContext null
            val o = JSONObject(conn.inputStream.bufferedReader().use { it.readText() })
            val tok = o.optString("token", null) ?: return@withContext null
            token = tok
            val profile = o.optJSONObject("marketer")?.let(::parseProfile)
            if (profile != null) { persistProfile(tok, profile); persistLoginPhone(phone) }
            profile
        } catch (_: Exception) {
            null
        } finally {
            conn?.disconnect()
        }
    }

    /** Refresh the authenticated marketer's profile. */
    suspend fun me(): MeResult = withContext(Dispatchers.IO) {
        val t = token ?: return@withContext MeResult.Unauthorized
        var conn: HttpURLConnection? = null
        try {
            conn = (URL("${ApiConfig.BASE_URL}/marketers/me").openConnection() as HttpURLConnection).apply {
                requestMethod = "GET"
                setRequestProperty("Authorization", "Bearer $t")
                setRequestProperty("Accept", "application/json")
                connectTimeout = 8_000; readTimeout = 8_000
            }
            when (conn.responseCode) {
                in 200..299 -> {
                    val profile = parseProfile(JSONObject(conn.inputStream.bufferedReader().use { it.readText() }))
                    token?.let { persistProfile(it, profile) }  // keep the stored snapshot fresh
                    MeResult.Ok(profile)
                }
                401 -> { logout(); MeResult.Unauthorized }
                403 -> { logout(); MeResult.Inactive }
                else -> MeResult.Unavailable
            }
        } catch (_: Exception) {
            MeResult.Unavailable
        } finally {
            conn?.disconnect()
        }
    }

    /**
     * Who holds this number? — the Send Money screen's recipient check.
     *
     * Funny money can only land in another marketer's wallet, so the number typed on that screen has
     * to be an ACTIVE marketer on this marketer's own brand, and the sender has to see whose name is
     * about to receive it. The server answers with the name and nothing else (not the number, not an
     * id, not a balance): the full number of anyone but this user never comes back to this app.
     *
     * [RecipientLookup.Self] is answered by the server because this app CANNOT work it out. `/me`
     * gives the marketer their own number already masked (`0798****061`), so there is nothing here to
     * compare a typed number against — the one party that can tell a send-to-self is the one holding
     * both numbers.
     *
     * POST, although it reads: the number is the thing being protected and a query string travels
     * into access logs, history and Referer headers in a way a body does not.
     *
     * Every failure is deliberately coarse. [RecipientLookup.NotFound] is returned for "nobody has
     * this number", "they are on another brand" and "their account is switched off" alike, because
     * the server refuses to distinguish them — telling them apart would turn this into a way to map
     * which numbers belong to which brand.
     */
    suspend fun lookupRecipient(phone: String): RecipientLookup = withContext(Dispatchers.IO) {
        val t = token ?: return@withContext RecipientLookup.Unavailable
        var conn: HttpURLConnection? = null
        try {
            conn = (URL("${ApiConfig.BASE_URL}/marketers/recipients/lookup").openConnection() as HttpURLConnection).apply {
                requestMethod = "POST"
                doOutput = true
                setRequestProperty("Authorization", "Bearer $t")
                setRequestProperty("Content-Type", "application/json")
                setRequestProperty("Accept", "application/json")
                connectTimeout = 8_000; readTimeout = 8_000
            }
            conn.outputStream.use { it.write(JSONObject().put("phone", phone).toString().toByteArray()) }
            when (val code = conn.responseCode) {
                in 200..299 -> {
                    val o = JSONObject(conn.inputStream.bufferedReader().use { it.readText() })
                    val name = o.optString("name", "")
                    if (name.isBlank()) RecipientLookup.Unavailable
                    else if (o.optBoolean("self", false)) RecipientLookup.Self(name)
                    else RecipientLookup.Found(name)
                }
                400, 404 -> RecipientLookup.NotFound
                // 429 is the per-marketer lookup budget. It is not "this number is wrong", so it must
                // not read as NotFound on the screen — the sender would retype a correct number.
                429 -> RecipientLookup.Busy
                401, 403 -> { if (code == 401) logout(); RecipientLookup.Unavailable }
                else -> RecipientLookup.Unavailable
            }
        } catch (_: Exception) {
            RecipientLookup.Unavailable
        } finally {
            conn?.disconnect()
        }
    }

    /**
     * Send funny money to a colleague. The second half of the Send Money flow.
     *
     * [ref] is the IDEMPOTENCY KEY and the single most important argument here. A phone on Kenyan
     * mobile data will time out mid-send; without a ref a retry is a second transfer of
     * real-feeling money. The caller generates ONE ref per attempt-chain and reuses it on every
     * retry — the server stores it on both ledger rows and a replay returns the original result
     * having moved nothing, which is why [TransferResult.Ok.idempotent] is surfaced rather than
     * hidden.
     *
     * A timeout or a dropped connection is [TransferResult.Unknown], NOT a failure: the server may
     * well have completed it. The only safe response is to retry with the SAME ref, which either
     * completes it or reports the completion that already happened.
     */
    suspend fun transfer(phone: String, amountCents: Long, chargeCents: Long, ref: String): TransferResult = withContext(Dispatchers.IO) {
        val t = token ?: return@withContext TransferResult.Failed("Please sign in again.")
        var conn: HttpURLConnection? = null
        try {
            conn = (URL("${ApiConfig.BASE_URL}/marketers/me/transfer").openConnection() as HttpURLConnection).apply {
                requestMethod = "POST"
                doOutput = true
                setRequestProperty("Authorization", "Bearer $t")
                setRequestProperty("Content-Type", "application/json")
                setRequestProperty("Accept", "application/json")
                // Longer than the other calls: this one moves money, and giving up early on a
                // request the server is still processing is what turns one send into two.
                connectTimeout = 10_000; readTimeout = 20_000
            }
            conn.outputStream.use {
                it.write(JSONObject()
                    .put("phone", phone)
                    .put("amountCents", amountCents)
                    .put("chargeCents", chargeCents)
                    .put("ref", ref)
                    .toString().toByteArray())
            }
            val code = conn.responseCode
            if (code in 200..299) {
                val o = JSONObject(conn.inputStream.bufferedReader().use { it.readText() })
                TransferResult.Ok(
                    balanceCents = o.optLong("balanceCents", 0L),
                    sentCents = o.optLong("sentCents", amountCents),
                    recipientName = o.optString("recipientName", ""),
                    idempotent = o.optBoolean("idempotent", false),
                    // Both are the server's to issue — see TransferResult.Ok. The fallbacks only
                    // cover an API that predates them; they are never preferred to what it sent.
                    code = o.optString("code", ""),
                    createdAtMs = o.optLong("createdAtMs", 0L)
                        .let { if (it > 0L) it else System.currentTimeMillis() },
                )
            } else {
                val err = runCatching {
                    JSONObject(conn.errorStream?.bufferedReader()?.use { it.readText() } ?: "")
                        .optJSONObject("error")?.optString("code")
                }.getOrNull()
                if (code == 401) logout()
                // Each of these is a different thing for the sender to DO, so none of them collapse
                // into "something went wrong".
                TransferResult.Failed(when (err) {
                    "INSUFFICIENT_FUNDS" -> "Not enough balance for this transfer."
                    "TRANSFER_TO_SELF" -> "You can't send to yourself."
                    "RECIPIENT_NOT_FOUND" -> "No marketer is registered on this number."
                    "TRANSFER_DAILY_CAP" -> "You've reached today's sending limit."
                    "AMOUNT_BELOW_MINIMUM" -> "Enter at least Ksh 1."
                    "MARKETER_INACTIVE", "NOT_MARKETER" -> "Your account isn't active. Contact support."
                    "SESSION_REVOKED" -> "Your session ended. Please sign in again."
                    else -> if (code == 429) "Too many attempts. Wait a moment and try again."
                            else "Couldn't complete the transfer. Please try again."
                })
            }
        } catch (_: java.io.InterruptedIOException) {
            // Timed out WAITING FOR THE ANSWER: the send may have gone through. Never report this
            // as a failure — the caller retries on the same ref, which settles it either way.
            TransferResult.Unknown
        } catch (_: Exception) {
            TransferResult.Unknown
        } finally {
            conn?.disconnect()
        }
    }

    /**
     * Fetch the marketer's own transaction feed (newest-first). Used to detect a fresh game
     * withdrawal credited to the wallet and raise the matching M-PESA notification. Returns an
     * empty list on any error or when not logged in (the caller just retries on the next poll).
     */
    suspend fun transactions(limit: Int = 20): List<MpesaTx> = withContext(Dispatchers.IO) {
        val t = token ?: return@withContext emptyList()
        var conn: HttpURLConnection? = null
        try {
            conn = (URL("${ApiConfig.BASE_URL}/marketers/me/transactions?limit=$limit").openConnection() as HttpURLConnection).apply {
                requestMethod = "GET"
                setRequestProperty("Authorization", "Bearer $t")
                setRequestProperty("Accept", "application/json")
                connectTimeout = 8_000; readTimeout = 8_000
            }
            if (conn.responseCode !in 200..299) return@withContext emptyList()
            val root = JSONObject(conn.inputStream.bufferedReader().use { it.readText() })
            val items = root.optJSONArray("items") ?: return@withContext emptyList()
            buildList {
                for (i in 0 until items.length()) {
                    val o = items.optJSONObject(i) ?: continue
                    val m = o.optJSONObject("mpesa")
                    add(
                        MpesaTx(
                            id = o.optLong("id", 0L),
                            direction = o.optString("direction", "in"),
                            amountCents = o.optLong("amountCents", 0L),
                            source = o.optString("source", "").ifEmpty { null },
                            code = m?.optString("code", "") ?: "",
                            party = m?.optString("party", "M-PESA") ?: "M-PESA",
                            amountText = m?.optString("amountText", "") ?: "",
                            message = m?.optString("message", "") ?: "",
                            createdAtMs = o.optLong("createdAtMs", 0L),
                        )
                    )
                }
            }
        } catch (_: Exception) {
            emptyList()
        } finally {
            conn?.disconnect()
        }
    }
}
