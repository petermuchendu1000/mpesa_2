package com.safarlcom.mbesa.frontend.data

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import java.util.TimeZone

/**
 * The statement period — the one piece of the export screen with a right answer.
 *
 * A period is a pair of CALENDAR DATES, and the three places it is written differ: the picker hands
 * back UTC midnight, the API takes `YYYY-MM-DD`, and the field shows `dd/MM/yyyy`. Carrying an
 * instant between those is how a statement starts a day early for anyone east of Greenwich, so
 * these pin the conversions and the length arithmetic the six-month rule is measured with.
 */
class YmdTest {

    @Test
    fun `the three forms of one date`() {
        val day = Ymd(2026, 10, 15)
        assertEquals("2026-10-15", day.iso())
        assertEquals("15/10/2026", day.ui())
        // Single digits are padded in both: an API that takes 2026-6-1 is not this one, and a
        // column of ragged dates is not a document.
        assertEquals("2026-06-01", Ymd(2026, 6, 1).iso())
        assertEquals("01/06/2026", Ymd(2026, 6, 1).ui())
    }

    @Test
    fun `a date survives the round trip through the picker`() {
        for (day in listOf(Ymd(2026, 1, 1), Ymd(2026, 6, 15), Ymd(2026, 12, 31), Ymd(2028, 2, 29))) {
            assertEquals(day, Ymd.fromPickerMillis(day.toPickerMillis()))
        }
    }

    @Test
    fun `the picker's millis are read in UTC, whatever the handset's zone is`() {
        // The picker writes UTC midnight. Reading it back in the device's zone would land on the
        // previous day for anyone west of Greenwich and still read correctly east of it — which is
        // the worst kind of bug, because it passes every test written in Nairobi.
        val original = TimeZone.getDefault()
        try {
            for (zone in listOf("UTC", "America/New_York", "Pacific/Honolulu", "Asia/Tokyo", "Africa/Nairobi")) {
                TimeZone.setDefault(TimeZone.getTimeZone(zone))
                assertEquals("wrong date read back on $zone",
                    Ymd(2026, 10, 15), Ymd.fromPickerMillis(Ymd(2026, 10, 15).toPickerMillis()))
            }
        } finally {
            TimeZone.setDefault(original)
        }
    }

    @Test
    fun `days are counted inclusively at both ends`() {
        assertEquals(1L, daysInclusive(Ymd(2026, 10, 15), Ymd(2026, 10, 15)))
        assertEquals(2L, daysInclusive(Ymd(2026, 10, 14), Ymd(2026, 10, 15)))
        assertEquals(31L, daysInclusive(Ymd(2026, 1, 1), Ymd(2026, 1, 31)))
        // The period in the reference screenshot.
        assertEquals(137L, daysInclusive(Ymd(2026, 6, 1), Ymd(2026, 10, 15)))
        // Across a leap day, which is the length people get wrong.
        assertEquals(366L, daysInclusive(Ymd(2028, 1, 1), Ymd(2028, 12, 31)))
        assertEquals(365L, daysInclusive(Ymd(2026, 1, 1), Ymd(2026, 12, 31)))
    }

    @Test
    fun `the six-month rule bites at 184 days, not 183`() {
        val start = Ymd(2026, 1, 1)
        // 183 days inclusive ends on 2 July.
        val lastAllowed = Ymd(2026, 7, 2)
        assertEquals(STATEMENT_IN_APP_MAX_DAYS, daysInclusive(start, lastAllowed))
        assertFalse(daysInclusive(start, lastAllowed) > STATEMENT_IN_APP_MAX_DAYS)
        assertTrue(daysInclusive(start, Ymd(2026, 7, 3)) > STATEMENT_IN_APP_MAX_DAYS)
    }

    @Test
    fun `stepping back whole months clamps to the shorter month`() {
        // 31 March has no counterpart in February; it must not roll into March the other way.
        assertEquals(Ymd(2026, 2, 28), Ymd.monthsBefore(Ymd(2026, 3, 31), 1))
        assertEquals(Ymd(2028, 2, 29), Ymd.monthsBefore(Ymd(2028, 3, 31), 1))
        assertEquals(Ymd(2026, 4, 30), Ymd.monthsBefore(Ymd(2026, 5, 31), 1))
        // Ordinary cases, including across a year boundary.
        assertEquals(Ymd(2026, 9, 15), Ymd.monthsBefore(Ymd(2026, 10, 15), 1))
        assertEquals(Ymd(2026, 4, 15), Ymd.monthsBefore(Ymd(2026, 10, 15), 6))
        assertEquals(Ymd(2025, 12, 10), Ymd.monthsBefore(Ymd(2026, 1, 10), 1))
    }

    @Test
    fun `dates order as dates, not as strings`() {
        assertTrue(Ymd(2026, 2, 1) > Ymd(2026, 1, 31))
        assertTrue(Ymd(2026, 1, 9) < Ymd(2026, 1, 10))   // "9" > "10" as text
        assertTrue(Ymd(2025, 12, 31) < Ymd(2026, 1, 1))
        assertEquals(0, Ymd(2026, 6, 1).compareTo(Ymd(2026, 6, 1)))
    }

    @Test
    fun `the QR matrix reports its own modules`() {
        // 3x3: row-major, so bit 5 is row 1 column 2.
        val qr = StatementQr(3, "100" + "001" + "010")
        assertTrue(qr.isDark(0, 0))
        assertFalse(qr.isDark(0, 1))
        assertTrue(qr.isDark(1, 2))
        assertTrue(qr.isDark(2, 1))
        // Out of range is dark-free rather than an exception: the matrix is server data, and a
        // short one must not crash the page it is drawn on.
        assertFalse(qr.isDark(-1, 0))
        assertFalse(qr.isDark(3, 0))
        assertFalse(qr.isDark(0, 3))
    }

    @Test
    fun `the export screen heads the page with the international number`() {
        assertEquals("254748057157", Receipts.intl("0748057157"))
        assertEquals("254798661061", Receipts.intl("+254798661061"))
        assertEquals("254712345678", Receipts.intl("254712345678"))
        // A masked display value will not normalise; it is printed as given rather than mangled.
        assertEquals("0798****061", Receipts.intl("0798****061"))
    }

    @Test
    fun `the statement prints dates without ordinals`() {
        // 14 Oct 2026, 18:03 UTC == 21:03 EAT.
        val ms = Ymd(2026, 10, 14).toPickerMillis() + 18 * 3_600_000L
        assertEquals("14 Oct 2026", Receipts.dayPlain(ms))
        // …while the receipt, which reads like a sentence, keeps its ordinal.
        assertEquals("14th Oct 2026", Receipts.date(ms))
    }
}
