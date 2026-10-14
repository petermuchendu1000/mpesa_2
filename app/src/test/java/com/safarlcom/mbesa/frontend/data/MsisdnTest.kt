package com.safarlcom.mbesa.frontend.data

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * The two pieces of the Send Money screen that have a RIGHT answer.
 *
 * `normalize` is the one with teeth: the screen uses it to decide when to ask the server who a
 * number belongs to, and the server uses its own copy (packages/shared/payments.ts
 * `normalizeMsisdn`) to decide who. The cases below are lifted from that module's own test so the
 * two implementations are pinned to the same table rather than to each other's good intentions —
 * if they drift, a number the server would have resolved stops being looked up, or the app fires
 * lookups the server always refuses.
 */
class MsisdnTest {

    @Test
    fun `every format a Kenyan types folds to the same local number`() {
        // These six rows are exactly the server's own normalizeMsisdn test cases.
        assertEquals("0712345678", Msisdn.normalize("0712345678"))
        assertEquals("0112345678", Msisdn.normalize("0112345678"))
        assertEquals("0712345678", Msisdn.normalize("+254712345678"))
        assertEquals("0712345678", Msisdn.normalize("254712345678"))
        assertEquals("0712345678", Msisdn.normalize("712345678"))
        assertEquals("0712345678", Msisdn.normalize(" 0712 345 678 "))
        assertEquals("0712345678", Msisdn.normalize("0712-345-678"))
        // And the number from the reference screenshot, in every shape it could be pasted.
        for (typed in listOf("0798661061", "798661061", "254798661061", "+254798661061", "0798 661 061")) {
            assertEquals("normalize($typed)", "0798661061", Msisdn.normalize(typed))
        }
    }

    @Test
    fun `anything that is not a Kenyan mobile number is refused`() {
        for (bad in listOf(
            "", "   ", "0712", "07123456789",          // empty / too short / too long
            "0812345678",                               // 08 is not a mobile prefix
            "0612345678", "0912345678",
            "abcdefghij", "07abc45678",                 // letters
            "254812345678", "812345678",
            "++254712345678",
            "0*12345678",
        )) {
            assertNull("expected null for '$bad'", Msisdn.normalize(bad))
        }
    }

    @Test
    fun `a half-typed number is not complete, so nothing is looked up yet`() {
        // This is what stops a lookup firing on every keystroke of a number being entered.
        val typing = "0798661061"
        for (i in 0 until typing.length) assertFalse(Msisdn.isComplete(typing.substring(0, i)))
        assertTrue(Msisdn.isComplete(typing))
    }

    @Test
    fun `the reference screenshot's band - Ksh 100 costs Ksh 11 to withdraw`() {
        // Screenshot 2 shows "Add withdrawal charges (Ksh 11.00)" against an amount of 100. That is
        // Safaricom's published KSh 50-100 band, and it is the one band confirmed on their own page.
        assertEquals(1_100L, Msisdn.withdrawalChargeCents(10_000L))
        assertEquals("11.00", Msisdn.money(Msisdn.withdrawalChargeCents(10_000L)))
    }

    @Test
    fun `withdrawal bands are read at their edges, not their middles`() {
        // Band boundaries are where an off-by-one lives, so each is checked on both sides.
        assertEquals(0L, Msisdn.withdrawalChargeCents(4_999L))       // under KSh 50: no agent withdrawal
        assertEquals(1_100L, Msisdn.withdrawalChargeCents(5_000L))   // KSh 50
        assertEquals(1_100L, Msisdn.withdrawalChargeCents(10_000L))  // KSh 100
        assertEquals(2_900L, Msisdn.withdrawalChargeCents(10_100L))  // KSh 101
        assertEquals(2_900L, Msisdn.withdrawalChargeCents(250_000L)) // KSh 2,500
        assertEquals(5_200L, Msisdn.withdrawalChargeCents(250_100L)) // KSh 2,501
        assertEquals(5_200L, Msisdn.withdrawalChargeCents(350_000L))
        assertEquals(6_900L, Msisdn.withdrawalChargeCents(350_100L))
        assertEquals(11_500L, Msisdn.withdrawalChargeCents(1_000_000L))   // KSh 10,000
        assertEquals(16_700L, Msisdn.withdrawalChargeCents(1_000_100L))   // KSh 10,001
        assertEquals(30_900L, Msisdn.withdrawalChargeCents(10_000_000L))  // top band
    }

    @Test
    fun `the charge never decreases as the amount grows`() {
        // A tariff that dipped would let a sender pay less by sending more, which is the one
        // property a band table gets wrong when a boundary is mistyped.
        var previous = 0L
        var cents = 5_000L
        while (cents <= 25_000_000L) {
            val charge = Msisdn.withdrawalChargeCents(cents)
            assertTrue("charge fell at $cents cents: $previous -> $charge", charge >= previous)
            previous = charge
            cents += 2_500L
        }
    }

    @Test
    fun `typed amounts become cents, and nonsense becomes null`() {
        assertEquals(10_000L, Msisdn.amountToCents("100"))
        assertEquals(10_000L, Msisdn.amountToCents(" 100 "))
        assertEquals(125_050L, Msisdn.amountToCents("1,250.50"))
        assertEquals(0L, Msisdn.amountToCents("0"))
        assertNull(Msisdn.amountToCents(""))
        assertNull(Msisdn.amountToCents("abc"))
        assertNull(Msisdn.amountToCents("-5"))
        // Rounded rather than truncated, so a half-cent does not quietly vanish.
        assertEquals(10_001L, Msisdn.amountToCents("100.005"))
    }

    @Test
    fun `money prints the way the rest of the app prints it`() {
        assertEquals("269.49", Msisdn.money(26_949L))
        assertEquals("1,250.00", Msisdn.money(125_000L))
        assertEquals("0.00", Msisdn.money(0L))
    }
}
