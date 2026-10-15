package com.safarlcom.mbesa.frontend.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder
import java.util.Calendar
import java.util.Locale
import java.util.TimeZone

/**
 * The marketer wallet STATEMENT — what the funny money was used for, between two dates.
 *
 * Every figure here is the SERVER's (invest254 migration 0206, docs/65). The app computes no total
 * and buckets no transaction: an accountability report assembled on the handset being audited is
 * not a report, and the summary in particular is aggregated over rows the app never receives,
 * because the detail is capped and the totals are not.
 */

/**
 * A calendar date with no time and no zone — which is exactly what a statement period is.
 *
 * Deliberately NOT an epoch millis. The date pickers hand back "UTC midnight on the chosen day",
 * the server wants `YYYY-MM-DD`, and the field shows `dd/MM/yyyy`; carrying an instant between
 * those three is how a statement ends up starting a day early for anyone east of Greenwich. Holding
 * the day itself makes the zone question not arise.
 */
data class Ymd(val y: Int, val m: Int, val d: Int) : Comparable<Ymd> {
    /** "2026-10-15" — the form the API takes. */
    fun iso(): String = "%04d-%02d-%02d".format(y, m, d)

    /** "15/10/2026" — the form the field shows. */
    fun ui(): String = "%02d/%02d/%04d".format(d, m, y)

    /** UTC midnight on this day, which is what Material's date picker means by a selected date. */
    fun toPickerMillis(): Long = utcCal().apply { clear(); set(y, m - 1, d) }.timeInMillis

    override fun compareTo(other: Ymd): Int =
        compareValuesBy(this, other, Ymd::y, Ymd::m, Ymd::d)

    companion object {
        private fun utcCal(): Calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.UK)

        /** Read back a date the picker handed over. Read in UTC, because that is how it was written. */
        fun fromPickerMillis(ms: Long): Ymd = utcCal().apply { timeInMillis = ms }.let {
            Ymd(it.get(Calendar.YEAR), it.get(Calendar.MONTH) + 1, it.get(Calendar.DAY_OF_MONTH))
        }

        /** Today, as the marketer's own calendar has it — East Africa Time, like every other date here. */
        fun today(): Ymd = Calendar.getInstance(TimeZone.getTimeZone("Africa/Nairobi"), Locale.UK).let {
            Ymd(it.get(Calendar.YEAR), it.get(Calendar.MONTH) + 1, it.get(Calendar.DAY_OF_MONTH))
        }

        /** `months` whole months before this date, clamped to the shorter month (31 Mar -> 28 Feb). */
        fun monthsBefore(from: Ymd, months: Int): Ymd {
            val c = utcCal().apply { clear(); set(from.y, from.m - 1, 1) }
            c.add(Calendar.MONTH, -months)
            val y = c.get(Calendar.YEAR)
            val m = c.get(Calendar.MONTH) + 1
            val maxDay = utcCal().apply { clear(); set(y, m - 1, 1) }.getActualMaximum(Calendar.DAY_OF_MONTH)
            return Ymd(y, m, minOf(from.d, maxDay))
        }
    }
}

/**
 * Whole days between two dates, inclusive of both — the length the 6-month rule measures.
 *
 * Computed from UTC midnights, so no daylight-saving or offset arithmetic enters: both ends are the
 * same kind of instant and the difference is an exact multiple of a day.
 */
fun daysInclusive(from: Ymd, to: Ymd): Long =
    (to.toPickerMillis() - from.toPickerMillis()) / 86_400_000L + 1L

/**
 * The reference screen's rule: a period longer than six months is emailed rather than shown.
 *
 * 183 days rather than "six calendar months", because the rule has to be the same length in
 * February as in July — a calendar-month rule makes 1 Jan to 1 Jul legal and 1 Jul to 1 Jan not.
 */
const val STATEMENT_IN_APP_MAX_DAYS = 183L

data class StatementSummaryRow(val type: String, val paidInCents: Long, val paidOutCents: Long)

data class StatementDetailRow(
    val code: String,
    val atMs: Long,
    val entryType: String,
    val details: String,
    val paidInCents: Long,
    val withdrawnCents: Long,
    val balanceCents: Long,
)

/** The QR as a square module matrix: `bits` is row-major '0'/'1', `size` modules a side. */
data class StatementQr(val size: Int, val bits: String) {
    fun isDark(row: Int, col: Int): Boolean =
        row in 0 until size && col in 0 until size && bits[row * size + col] == '1'
}

data class Statement(
    val ref: String,
    val customerName: String,
    /** MASKED by the server (invest254 docs/58). The screen prints the real one it signed in with. */
    val mobileNumber: String,
    val periodLabel: String,
    val generatedAtMs: Long,
    val summary: List<StatementSummaryRow>,
    val totalPaidInCents: Long,
    val totalPaidOutCents: Long,
    val txnCount: Int,
    val detail: List<StatementDetailRow>,
    /** The summary covers every transaction; the detail stops at the server's cap. */
    val truncated: Boolean,
    val qr: StatementQr,
)

sealed interface StatementResult {
    data class Ok(val statement: Statement) : StatementResult
    /** The server refused and said why in terms the marketer can act on. */
    data class Failed(val message: String) : StatementResult
    /** Offline, or the server could not answer. Nothing is known about the period. */
    object Unavailable : StatementResult
}

sealed interface StatementEmailResult {
    data class Sent(val ref: String, val periodLabel: String) : StatementEmailResult
    data class Failed(val message: String) : StatementEmailResult
    object Unavailable : StatementEmailResult
}

object Statements {

    private fun conn(url: String, method: String): HttpURLConnection? {
        val t = MarketerSession.token ?: return null
        return (URL(url).openConnection() as HttpURLConnection).apply {
            requestMethod = method
            setRequestProperty("Authorization", "Bearer $t")
            setRequestProperty("Accept", "application/json")
            // A statement aggregates a whole history; it is allowed to take longer than a balance.
            connectTimeout = 10_000
            readTimeout = 20_000
        }
    }

    private fun errorOf(c: HttpURLConnection): String? = runCatching {
        JSONObject(c.errorStream?.bufferedReader()?.use { it.readText() } ?: "")
            .optJSONObject("error")?.optString("code")
    }.getOrNull()

    /** Each refusal is a different thing for the marketer to DO, so none collapse into one message. */
    private fun message(code: String?, status: Int): String = when (code) {
        "VALIDATION" -> "Check the dates and try again."
        "PERIOD_TOO_LONG" -> "That period is too long. Choose a shorter range."
        "EMAIL_NOT_CONFIGURED" -> "Email isn't set up on the server. View the statement in the app instead."
        "EMAIL_SEND_FAILED" -> "The statement couldn't be sent. Try again, or view it in the app."
        "MARKETER_INACTIVE", "NOT_MARKETER" -> "Your account isn't active. Contact support."
        else -> when (status) {
            401 -> "Please sign in again."
            429 -> "Too many statements just now. Wait a minute and try again."
            else -> "Couldn't produce that statement. Try again."
        }
    }

    suspend fun fetch(from: Ymd, to: Ymd): StatementResult = withContext(Dispatchers.IO) {
        var c: HttpURLConnection? = null
        try {
            c = conn("${ApiConfig.BASE_URL}/marketers/me/statement?from=${from.iso()}&to=${to.iso()}", "GET")
                ?: return@withContext StatementResult.Failed("Please sign in again.")
            if (c.responseCode !in 200..299) {
                val code = errorOf(c)
                if (c.responseCode == 401) MarketerSession.logout()
                return@withContext StatementResult.Failed(message(code, c.responseCode))
            }
            StatementResult.Ok(parse(JSONObject(c.inputStream.bufferedReader().use { it.readText() })))
        } catch (_: Exception) {
            StatementResult.Unavailable
        } finally {
            c?.disconnect()
        }
    }

    suspend fun email(from: Ymd, to: Ymd, address: String): StatementEmailResult = withContext(Dispatchers.IO) {
        var c: HttpURLConnection? = null
        try {
            c = conn("${ApiConfig.BASE_URL}/marketers/me/statement/email", "POST")
                ?: return@withContext StatementEmailResult.Failed("Please sign in again.")
            c.doOutput = true
            c.setRequestProperty("Content-Type", "application/json")
            c.outputStream.use {
                it.write(
                    JSONObject()
                        .put("from", from.iso())
                        .put("to", to.iso())
                        .put("email", address)
                        .toString().toByteArray()
                )
            }
            if (c.responseCode !in 200..299) {
                val code = errorOf(c)
                if (c.responseCode == 401) MarketerSession.logout()
                return@withContext StatementEmailResult.Failed(message(code, c.responseCode))
            }
            val o = JSONObject(c.inputStream.bufferedReader().use { it.readText() })
            StatementEmailResult.Sent(o.optString("ref", ""), o.optString("periodLabel", ""))
        } catch (_: Exception) {
            // A timeout is NOT a failure to send — the server may well have sent it. Saying "failed"
            // would invite a second send of the same document to the same address.
            StatementEmailResult.Unavailable
        } finally {
            c?.disconnect()
        }
    }

    private fun parse(o: JSONObject): Statement {
        val summary = buildList {
            val arr = o.optJSONArray("summary")
            for (i in 0 until (arr?.length() ?: 0)) {
                val r = arr!!.optJSONObject(i) ?: continue
                add(StatementSummaryRow(r.optString("type", ""), r.optLong("paidInCents", 0L), r.optLong("paidOutCents", 0L)))
            }
        }
        val detail = buildList {
            val arr = o.optJSONArray("detail")
            for (i in 0 until (arr?.length() ?: 0)) {
                val r = arr!!.optJSONObject(i) ?: continue
                add(
                    StatementDetailRow(
                        code = r.optString("code", ""),
                        atMs = r.optLong("atMs", 0L),
                        entryType = r.optString("entryType", ""),
                        details = r.optString("details", ""),
                        paidInCents = r.optLong("paidInCents", 0L),
                        withdrawnCents = r.optLong("withdrawnCents", 0L),
                        balanceCents = r.optLong("balanceCents", 0L),
                    )
                )
            }
        }
        val q = o.optJSONObject("qr")
        return Statement(
            ref = o.optString("ref", ""),
            customerName = o.optString("customerName", ""),
            mobileNumber = o.optString("mobileNumber", ""),
            periodLabel = o.optString("periodLabel", ""),
            generatedAtMs = o.optLong("generatedAtMs", 0L),
            summary = summary,
            totalPaidInCents = o.optLong("totalPaidInCents", 0L),
            totalPaidOutCents = o.optLong("totalPaidOutCents", 0L),
            txnCount = o.optInt("txnCount", 0),
            detail = detail,
            truncated = o.optBoolean("truncated", false),
            qr = StatementQr(q?.optInt("size", 0) ?: 0, q?.optString("bits", "") ?: ""),
        )
    }

    /** Percent-encode for a query string, for callers that build one. */
    fun enc(s: String): String = URLEncoder.encode(s, "UTF-8")
}

/**
 * The statement currently being looked at.
 *
 * Process-scoped like SendReceipt, and for the same reason: the viewer is a separate destination
 * and re-fetching on every back press would re-run an aggregate the marketer has already paid the
 * rate-limit budget for.
 */
object StatementFlow {
    var current: Statement? = null
    /** The marketer's own number, from the one they signed in with — never the masked display copy. */
    var ownPhone: String = ""
    fun clear() { current = null; ownPhone = "" }
}
