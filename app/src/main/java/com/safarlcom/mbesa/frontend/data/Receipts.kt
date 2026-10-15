package com.safarlcom.mbesa.frontend.data

import java.util.Calendar
import java.util.Locale
import java.util.TimeZone

/**
 * How a completed transfer is written down.
 *
 * EVERYTHING HERE IS IN EAST AFRICA TIME, always, regardless of where the handset thinks it is.
 * M-PESA stamps every confirmation in EAT and the server's own message builder (invest254
 * apps/api/src/mpesa.ts) does the same, so formatting in the device's local zone would make the
 * receipt disagree with the SMS text and the statement for the same transaction — most visibly for
 * a marketer whose phone is on automatic time while roaming. EAT is UTC+3 with no daylight saving,
 * so the offset is a constant and no zone database is consulted.
 *
 * java.time is deliberately not used: minSdk is 24 and core-library desugaring is not enabled, so
 * it would crash on exactly the older handsets this app is built for.
 */
object Receipts {

    private val EAT: TimeZone = TimeZone.getTimeZone("Africa/Nairobi")
    private val MONTHS = arrayOf("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec")

    private fun eat(ms: Long): Calendar = Calendar.getInstance(EAT, Locale.UK).apply { timeInMillis = ms }

    /** "1st", "2nd", "3rd", "4th" … "11th", "12th", "13th" … "21st". The teens are the trap. */
    fun ordinal(day: Int): String {
        val suffix = when {
            day in 11..13 -> "th"
            day % 10 == 1 -> "st"
            day % 10 == 2 -> "nd"
            day % 10 == 3 -> "rd"
            else -> "th"
        }
        return "$day$suffix"
    }

    /** "14th Oct 2026" */
    fun date(ms: Long): String {
        val c = eat(ms)
        return "${ordinal(c.get(Calendar.DAY_OF_MONTH))} ${MONTHS[c.get(Calendar.MONTH)]} ${c.get(Calendar.YEAR)}"
    }

    /** "9:03", 12-hour, no leading zero on the hour — midnight and noon read as 12. */
    private fun clock(c: Calendar): String {
        val h24 = c.get(Calendar.HOUR_OF_DAY)
        val h12 = if (h24 % 12 == 0) 12 else h24 % 12
        return "%d:%02d".format(h12, c.get(Calendar.MINUTE))
    }

    /**
     * "15 Oct 2026" — no ordinal, zero-padded.
     *
     * The statement's own date form, and deliberately not [date]'s. A receipt is addressed to a
     * person and reads like a sentence ("14th Oct"); a statement is a document whose dates sit in a
     * column beside each other, where an ordinal is noise and a ragged first digit is worse.
     */
    fun dayPlain(ms: Long): String {
        val c = eat(ms)
        return "%02d %s %d".format(c.get(Calendar.DAY_OF_MONTH), MONTHS[c.get(Calendar.MONTH)], c.get(Calendar.YEAR))
    }

    /** "14th Oct 2026 | 9:03 pm" — the confirmation screen. */
    fun stampLower(ms: Long): String {
        val c = eat(ms)
        val ampm = if (c.get(Calendar.AM_PM) == Calendar.AM) "am" else "pm"
        return "${date(ms)} | ${clock(c)} $ampm"
    }

    /** "14th Oct 2026 9:03 PM" — the printed receipt. */
    fun stampUpper(ms: Long): String {
        val c = eat(ms)
        val ampm = if (c.get(Calendar.AM_PM) == Calendar.AM) "AM" else "PM"
        return "${date(ms)} ${clock(c)} $ampm"
    }

    /**
     * "079866***061" — the mask the printed receipt uses for the party paid.
     *
     * Wider than [NameUtils.maskPhone] (which keeps 3 and 2) because this is the shape the real
     * M-PESA receipt prints, and narrower than showing it whole because THE RECEIPT IS MEANT TO BE
     * SHARED. The confirmation screen shows the number in full — the sender typed it, so it is not
     * news to them — but the moment the same fact is put on a page with a share button it is going
     * to reach somebody who did not type it.
     */
    fun maskForPrint(phone: String): String {
        val p = phone.trim()
        if (p.length < 10) return p          // too short to mask without hiding everything
        return p.take(6) + "***" + p.takeLast(3)
    }

    /**
     * "0748 057 157" — the sender's own number, grouped as the receipt prints it. Not masked: it is
     * the reader's own number, and the receipt is addressed to them by name in the line above it.
     */
    fun grouped(phone: String): String {
        // Normalised first, because the sender's number is whatever they typed at sign-in — a
        // marketer who entered +254… would otherwise see the one number on the page that is not in
        // the form the page uses everywhere else. Anything that will not normalise (a masked
        // display value, say) is printed exactly as handed over rather than mangled.
        val d = Msisdn.normalize(phone) ?: return phone
        return if (d.length == 10) "${d.take(4)} ${d.substring(4, 7)} ${d.takeLast(3)}" else phone
    }

    /**
     * "1" for a whole shilling, "1,234.50" when there are cents.
     *
     * The printed receipt drops a trailing ".00" — the reference prints "KES 1", not "KES 1.00" —
     * while every in-app figure keeps two decimals. Two renderings on purpose: the app is a ledger
     * view, where a column of aligned decimals is the point, and the receipt is a document, where
     * nobody writes the cents they do not have.
     */
    fun kes(cents: Long): String {
        val whole = cents % 100L == 0L
        return if (whole) "%,d".format(cents / 100) else Msisdn.money(cents)
    }

    /**
     * "254748057157" — the international form without a plus, as the export screen heads the page.
     *
     * Normalised first for the same reason [grouped] is: the marketer typed whatever they typed at
     * sign-in, and the page should not be the one place that shows it back in a different shape.
     */
    fun intl(phone: String): String {
        val d = Msisdn.normalize(phone) ?: return phone
        return if (d.length == 10 && d.startsWith("0")) "254" + d.drop(1) else d
    }

    /** "Faith" — the first word of a name, for the receipt's greeting. */
    fun firstName(full: String): String =
        full.trim().split(Regex("\\s+")).firstOrNull { it.isNotBlank() }?.replaceFirstChar { it.uppercase() } ?: ""
}
