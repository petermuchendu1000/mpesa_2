package com.safarlcom.mbesa.frontend.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL

/**
 * Backend wiring for the marketer profile shown on the Home screen.
 *
 * When [ApiConfig] is filled in, the app loads the marketer's live name / M-PESA balance /
 * Available Fuliza / airtime from the invest254 API (GET /admin/marketers/:id) and applies it to
 * [AppState]. When left blank the app runs fully offline on the bundled sample data.
 *
 * SECURITY: /admin/marketers is an ADMIN-gated endpoint, so [ApiConfig.ADMIN_TOKEN] is a
 * privileged credential. Do NOT commit a real token or ship it in a public build — inject it at
 * build time for internal testing only. Production should expose a marketer-scoped read endpoint
 * (or a backend-for-frontend) instead of embedding an admin token in the client.
 */
object ApiConfig {
    const val BASE_URL = "https://invest254-api.fly.dev/api/v1"

    /** UUID of the marketer this install represents. Empty string = offline mode. */
    const val MARKETER_ID = ""

    /** Admin bearer token (internal/testing only). Empty string = offline mode. */
    const val ADMIN_TOKEN = ""
}

/** Profile fields the Home screen needs, in integer cents (KES). */
data class MarketerProfile(
    val fullName: String,
    val balanceCents: Long,
    val availableFulizaCents: Long,
    val airtimeCents: Long,
)

object MarketerApi {
    /**
     * Fetch the configured marketer's profile. Returns null when unconfigured or on any error,
     * so the caller transparently falls back to offline sample data.
     */
    suspend fun fetchProfile(
        marketerId: String = ApiConfig.MARKETER_ID,
        token: String = ApiConfig.ADMIN_TOKEN,
        baseUrl: String = ApiConfig.BASE_URL,
    ): MarketerProfile? = withContext(Dispatchers.IO) {
        if (marketerId.isBlank() || token.isBlank()) return@withContext null
        var conn: HttpURLConnection? = null
        try {
            conn = (URL("$baseUrl/admin/marketers/$marketerId").openConnection() as HttpURLConnection).apply {
                requestMethod = "GET"
                setRequestProperty("Authorization", "Bearer $token")
                setRequestProperty("Accept", "application/json")
                connectTimeout = 8_000
                readTimeout = 8_000
            }
            if (conn.responseCode !in 200..299) return@withContext null
            val body = conn.inputStream.bufferedReader().use { it.readText() }
            val o = JSONObject(body)
            MarketerProfile(
                fullName = o.optString("name", ""),
                balanceCents = o.optLong("balance_cents", 0L),
                availableFulizaCents = o.optLong("available_fuliza_cents", 0L),
                airtimeCents = o.optLong("airtime_balance_cents", 0L),
            )
        } catch (_: Exception) {
            null
        } finally {
            conn?.disconnect()
        }
    }
}
