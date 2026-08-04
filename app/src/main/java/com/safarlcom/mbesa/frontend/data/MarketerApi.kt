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
    val balanceCents: Long,
    val availableFulizaCents: Long,
    val airtimeCents: Long,
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
        balanceCents = o.optLong("balance_cents", 0L),
        availableFulizaCents = o.optLong("available_fuliza_cents", 0L),
        airtimeCents = o.optLong("airtime_balance_cents", 0L),
    )

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
}
