package com.safarlcom.mbesa.frontend.data

import kotlin.math.roundToLong

/**
 * Kenyan mobile numbers, and what M-PESA charges to take cash out.
 *
 * Both live here rather than inside a screen because both are decisions with a RIGHT answer that a
 * composable is the wrong place to argue about, and both are now covered by unit tests.
 */
object Msisdn {

    /**
     * The canonical local form (`07XXXXXXXX` / `01XXXXXXXX`), or null if this is not a Kenyan mobile
     * number at all.
     *
     * Deliberately the same rule as the server's `normalizeMsisdn` (packages/shared/payments.ts), to
     * the digit: `07…`/`0.1…` as typed, `2547…`/`2541…` and a bare `7…`/`1…` all fold to the same
     * local number, and spaces, dashes, brackets and a leading `+` are ignored. They have to agree —
     * the app uses this to decide WHEN to ask the server who a number belongs to, and the server uses
     * its own copy to decide WHO. A looser rule here would fire lookups the server always refuses; a
     * stricter one would refuse to look up numbers the server would have resolved.
     *
     * Returning null rather than throwing is the shape the caller wants: the field is read on every
     * keystroke, and a half-typed number is the normal case, not an error.
     */
    fun normalize(input: String): String? {
        val raw = input.filter { !it.isWhitespace() && it != '-' && it != '(' && it != ')' }.removePrefix("+")
        if (raw.any { !it.isDigit() }) return null
        val local = when {
            raw.length == 10 && raw.startsWith("07") -> raw
            raw.length == 10 && raw.startsWith("01") -> raw
            raw.length == 12 && (raw.startsWith("2547") || raw.startsWith("2541")) -> "0" + raw.substring(3)
            raw.length == 9 && (raw.startsWith("7") || raw.startsWith("1")) -> "0$raw"
            else -> return null
        }
        return local.takeIf { it.length == 10 && (it.startsWith("07") || it.startsWith("01")) }
    }

    /** Is this typed text a complete, dialable Kenyan mobile number? */
    fun isComplete(input: String): Boolean = normalize(input) != null

    /**
     * What Safaricom charges an agent withdrawal of [amountCents], in cents.
     *
     * This is what the "Add withdrawal charges" tick on the Send Money screen adds: the sender
     * covers what it will cost the recipient to take the money out, so the recipient walks away with
     * the round number that was actually promised them. It is a SIMULATION — no fee is charged
     * anywhere in this product, and no funny money is destroyed by it; the tick simply increases the
     * amount transferred.
     *
     * TARIFF, checked 2026-10-14. The KSh 11 band for KSh 50–100 is confirmed on Safaricom's own
     * M-PESA rates page, and is the band the reference screenshot shows (Ksh 100 -> Ksh 11.00). The
     * bands above KSh 100 are consistent across several independent Kenyan tariff trackers but are
     * NOT confirmed against Safaricom's own published table, which was not current at the time of
     * writing — treat them as reported, not verified, and re-check before quoting them anywhere that
     * matters. Withdrawals below KSh 50 are not possible at an agent, so there is no band for them.
     */
    fun withdrawalChargeCents(amountCents: Long): Long {
        if (amountCents < 5_000L) return 0L                 // under KSh 50: not withdrawable at an agent
        val ksh = amountCents / 100.0
        val charge = when {
            ksh <= 100 -> 11
            ksh <= 2_500 -> 29
            ksh <= 3_500 -> 52
            ksh <= 5_000 -> 69
            ksh <= 7_500 -> 87
            ksh <= 10_000 -> 115
            ksh <= 15_000 -> 167
            ksh <= 20_000 -> 185
            ksh <= 35_000 -> 197
            ksh <= 50_000 -> 278
            else -> 309
        }
        return charge * 100L
    }

    /** Parse a typed amount ("100", "1,250.50", "") into cents, or null when it is not a number. */
    fun amountToCents(typed: String): Long? {
        val cleaned = typed.replace(",", "").trim()
        if (cleaned.isEmpty()) return null
        val v = cleaned.toDoubleOrNull() ?: return null
        if (!v.isFinite() || v < 0) return null
        return (v * 100).roundToLong()
    }

    /** Cents as the app prints money everywhere else: thousands separated, always two decimals. */
    fun money(cents: Long): String = "%,.2f".format(cents / 100.0)
}
