package com.safarlcom.mbesa.frontend.data

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
)

/** Outcome of a website-credential sign-in, so the login screen can show a precise message. */
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

    fun logout() { token = null }

    private fun parseProfile(o: JSONObject) = MarketerProfile(
        fullName = o.optString("name", ""),
        phone = o.optString("phone", ""),
        balanceCents = o.optLong("balance_cents", 0L),
        availableFulizaCents = o.optLong("available_fuliza_cents", 0L),
        airtimeCents = o.optLong("airtime_balance_cents", 0L),
    )

    /**
     * Sign in with the marketer's invest254 WEBSITE credentials (phone + password) via
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
                token = o.optString("token", null) ?: return@withContext WebLoginResult.Failed("Something went wrong. Please try again.")
                val profile = o.optJSONObject("marketer")?.let(::parseProfile)
                    ?: return@withContext WebLoginResult.Failed("Something went wrong. Please try again.")
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
            token = o.optString("token", null) ?: return@withContext null
            o.optJSONObject("marketer")?.let(::parseProfile)
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
                in 200..299 -> MeResult.Ok(parseProfile(JSONObject(conn.inputStream.bufferedReader().use { it.readText() })))
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
