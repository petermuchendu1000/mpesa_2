package com.safarlcom.mbesa.frontend.data

import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.Calendar
import java.util.Locale
import java.util.TimeZone

/**
 * How a completed transfer is written down.
 *
 * The receipt is the one thing in this flow a marketer can hand to somebody else, so the date on it
 * has to be the date the money moved as MPESA would state it — East Africa Time, always, whatever
 * the handset's own zone is set to. Several of these tests therefore build their instants in a
 * zone that is NOT EAT and assert the EAT rendering, which is the only way to catch the formatter
 * quietly following the device.
 */
class ReceiptsTest {

    /** An instant, built from UTC fields so each case reads as the moment it is. */
    private fun utc(y: Int, mon: Int, d: Int, h: Int, min: Int): Long =
        Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.UK).apply {
            clear(); set(y, mon - 1, d, h, min, 0)
        }.timeInMillis

    @Test
    fun `the reference transaction renders exactly as the receipt shows it`() {
        // 14 Oct 2026, 18:03 UTC == 21:03 EAT — the transfer in the reference screenshots.
        val ms = utc(2026, 10, 14, 18, 3)
        assertEquals("14th Oct 2026", Receipts.date(ms))
        assertEquals("14th Oct 2026 | 9:03 pm", Receipts.stampLower(ms))
        assertEquals("14th Oct 2026 9:03 PM", Receipts.stampUpper(ms))
    }

    @Test
    fun `the device's own time zone cannot change the stamp`() {
        val ms = utc(2026, 10, 14, 18, 3)
        val original = TimeZone.getDefault()
        try {
            for (zone in listOf("UTC", "America/New_York", "Asia/Tokyo", "Pacific/Kiritimati")) {
                TimeZone.setDefault(TimeZone.getTimeZone(zone))
                assertEquals("wrong stamp while the device is on $zone",
                    "14th Oct 2026 | 9:03 pm", Receipts.stampLower(ms))
            }
        } finally {
            TimeZone.setDefault(original)
        }
    }

    @Test
    fun `an instant that is a different DAY locally is still stamped in EAT`() {
        // 22:30 UTC on the 14th is 01:30 EAT on the 15th. A formatter using the device zone would
        // print the 14th for a transfer the server recorded on the 15th.
        val ms = utc(2026, 10, 14, 22, 30)
        assertEquals("15th Oct 2026 | 1:30 am", Receipts.stampLower(ms))
    }

    @Test
    fun `noon and midnight are 12, not 0`() {
        assertEquals("1st Jan 2026 | 12:00 am", Receipts.stampLower(utc(2025, 12, 31, 21, 0)))
        assertEquals("1st Jan 2026 | 12:00 pm", Receipts.stampLower(utc(2026, 1, 1, 9, 0)))
    }

    @Test
    fun `ordinals — the teens are the trap`() {
        assertEquals("1st", Receipts.ordinal(1))
        assertEquals("2nd", Receipts.ordinal(2))
        assertEquals("3rd", Receipts.ordinal(3))
        assertEquals("4th", Receipts.ordinal(4))
        assertEquals("11th", Receipts.ordinal(11))
        assertEquals("12th", Receipts.ordinal(12))
        assertEquals("13th", Receipts.ordinal(13))
        assertEquals("21st", Receipts.ordinal(21))
        assertEquals("22nd", Receipts.ordinal(22))
        assertEquals("23rd", Receipts.ordinal(23))
        assertEquals("31st", Receipts.ordinal(31))
    }

    @Test
    fun `the printed receipt masks the party who was paid`() {
        assertEquals("079866***061", Receipts.maskForPrint("0798661061"))
        assertEquals("011234***678", Receipts.maskForPrint("0112345678"))
    }

    @Test
    fun `a number too short to mask is left alone rather than erased`() {
        // Better to show what there is than to print a row of stars that says nothing. Normalised
        // numbers are always ten digits; this only guards a caller that has something else.
        assertEquals("0798", Receipts.maskForPrint("0798"))
        assertEquals("079866106", Receipts.maskForPrint("079866106"))
    }

    @Test
    fun `the sender's own number is grouped, not masked`() {
        assertEquals("0748 057 157", Receipts.grouped("0748057157"))
        assertEquals("0798 661 061", Receipts.grouped("+254798661061"))
    }

    @Test
    fun `a number that is not ten digits is printed as given`() {
        assertEquals("0798****061", Receipts.grouped("0798****061"))
    }

    @Test
    fun `the printed amount drops a trailing double zero, as the reference page does`() {
        // The reference prints "KES 1", not "KES 1.00".
        assertEquals("1", Receipts.kes(100))
        assertEquals("0", Receipts.kes(0))
        assertEquals("250", Receipts.kes(25_000))
        assertEquals("1,234", Receipts.kes(123_400))
        assertEquals("100,000", Receipts.kes(10_000_000))
    }

    @Test
    fun `cents are kept whenever there are any`() {
        assertEquals("1.50", Receipts.kes(150))
        assertEquals("0.01", Receipts.kes(1))
        assertEquals("1,234.56", Receipts.kes(123_456))
        assertEquals("99.99", Receipts.kes(9_999))
    }

    @Test
    fun `the greeting takes the first name`() {
        assertEquals("Faith", Receipts.firstName("Faith Wanjiru"))
        assertEquals("Peter", Receipts.firstName("  peter muchendu "))
        assertEquals("Tony", Receipts.firstName("Tony"))
        assertEquals("", Receipts.firstName("   "))
    }
}
