package com.safarlcom.mbesa.frontend.data

import com.safarlcom.mbesa.frontend.R
import kotlin.random.Random

/**
 * Static, in-memory mock content. There is NO backend / networking in this build —
 * every value here is hard-coded so the frontend runs fully offline.
 */

enum class TxStatus(val iconRes: Int) {
    SUCCESS(R.drawable.history_transaction_icon_success),
    FAILED(R.drawable.history_transaction_icon_error),
    INFO(R.drawable.history_transaction_icon_info),
}

data class TxItem(
    val title: String,
    val subtitle: String,
    val amount: String,
    val incoming: Boolean,
    val status: TxStatus = TxStatus.SUCCESS,
)

data class NotificationItem(val title: String, val body: String, val time: String)
data class BundlePlan(val name: String, val price: String, val validity: String)

/** Home promo banner ("Entertainment", "Home Internet", …). */
data class Banner(val title: String, val subtitle: String, val iconRes: Int, val actionId: String)
/** Home "Suggested for you" card. */
data class Suggestion(val title: String, val iconRes: Int, val actionId: String)
/** Home "Frequents" chip (a recent recipient). */
data class Frequent(val name: String, val phone: String)

object FakeData {
    const val USER_NAME = "Baraka"
    const val PHONE = "0722 000 000"
    const val BALANCE = "Ksh 24,850.00"
    const val FULIZA_LIMIT = "Ksh 8,000.00"
    const val FULIZA_AVAILABLE = "Ksh 6,450.00"
    const val POINTS = "1,240"

    val transactions = listOf(
        TxItem("John Doe", "Send Money · Today, 14:32", "- Ksh 1,500.00", false),
        TxItem("KPLC Prepaid", "Pay Bill · Today, 09:10", "- Ksh 1,000.00", false),
        TxItem("Naivas Supermarket", "Buy Goods · 28 Jun", "- Ksh 3,240.00", false),
        TxItem("Salary", "Received · 25 Jun", "+ Ksh 45,000.00", true),
        TxItem("Airtime", "Buy Airtime · 24 Jun", "- Ksh 100.00", false),
        TxItem("Jane W.", "Send Money · 23 Jun", "- Ksh 500.00", false, TxStatus.FAILED),
        TxItem("Zuku Fibre", "Pay Bill · 22 Jun", "- Ksh 2,999.00", false),
        TxItem("Fuliza Repayment", "Auto · 21 Jun", "- Ksh 320.00", false, TxStatus.INFO),
        TxItem("M-PESA Global", "Received from UK · 20 Jun", "+ Ksh 12,300.00", true),
        TxItem("Withdraw", "Agent 123456 · 19 Jun", "- Ksh 2,000.00", false),
    )

    val notifications = listOf(
        NotificationItem("Payment received", "You have received Ksh 45,000.00 from Salary.", "2h ago"),
        NotificationItem("Fuliza", "Your Fuliza limit has been reviewed to Ksh 8,000.00.", "Yesterday"),
        NotificationItem("Data bundle", "Your 10 GB monthly bundle expires in 3 days.", "Yesterday"),
        NotificationItem("Security", "A new device signed in to your account.", "2 days ago"),
        NotificationItem("Tunukiwa", "You have a special bundle offer waiting.", "3 days ago"),
    )

    val bundlePlans = listOf(
        BundlePlan("1.5 GB", "Ksh 50", "24 hours"),
        BundlePlan("3 GB", "Ksh 99", "7 days"),
        BundlePlan("10 GB", "Ksh 250", "30 days"),
        BundlePlan("25 GB", "Ksh 1,000", "30 days"),
        BundlePlan("Unlimited Weekly", "Ksh 999", "7 days"),
    )

    val banners = listOf(
        Banner("Bring entertainment home", "Discover Home Internet", R.drawable.icon_sfc_home_fibre, "homefibre"),
        Banner("Smart plans, just for you", "Buy Tunukiwa Bundles", R.drawable.icon_sfc_tunukiwa, "tunukiwa"),
        Banner("Explore & Discover Deals", "Redeem your Bonga Points", R.drawable.ic_lipa_na_bonga, "bonga"),
    )

    val suggestions = listOf(
        Suggestion("Buy Airtime", R.drawable.icon_sfc_airtime, "airtime"),
        Suggestion("Buy Bundles", R.drawable.icon_sfc_buy_bundles, "bundles"),
        Suggestion("Pay Bill", R.drawable.ic_statement_pay_bill, "paybill"),
        Suggestion("Withdraw", R.drawable.icon_sfc_withdraw_at_agent, "withdraw"),
    )

    val frequents = listOf(
        Frequent("John Doe", "0722 123 456"),
        Frequent("Jane W.", "0711 987 654"),
        Frequent("KPLC Prepaid", "888880"),
        Frequent("Mama Mboga", "0733 456 789"),
    )

    fun newReference(): String {
        val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
        return "T" + (1..9).map { chars[Random.nextInt(chars.length)] }.joinToString("")
    }
}




