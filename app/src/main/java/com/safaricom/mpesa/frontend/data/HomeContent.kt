package com.safaricom.mpesa.frontend.data

import com.safaricom.mpesa.frontend.R

/**
 * Hard-coded Home-feed content transcribed verbatim from the original app screenshots.
 * The real app loads these sections from the server (they aren't in local resources), so the
 * screenshots are the ground truth. Colours/emoji are chosen to match the originals.
 */

/** A Quick-Actions tile. [actionId] maps into [SfcCatalog.actions]. */
data class QuickAction(val label: String, val iconRes: Int, val actionId: String)

/** A "Do more with M-PESA" category tile (pastel card + 3D emoji illustration). */
data class DoMoreCategory(val label: String, val emoji: String, val bg: Long, val iconRes: Int? = null)

/** A "My Finances" partner entry (brand text logo). */
data class FinanceItem(val label: String, val logo: String, val logoColor: Long, val circle: Boolean = false)

/** An "Entertainment" tile. */
data class EntertainmentItem(val label: String, val emoji: String, val bg: Long)

/** An "Explore & Discover" auto-scrolling ad banner. */
data class AdBanner(val title: String, val subtitle: String, val bg: Long, val textColor: Long, val accent: Long)

object HomeContent {

    const val USER_NAME = "Peter"
    const val USER_INITIALS = "PM"
    const val PHONE = "0703501549"
    const val BALANCE = "514.75"
    const val AIRTIME = "20.00"

    /** The 8 Quick Actions in the exact order shown. */
    val quickActions = listOf(
        QuickAction("Send Money", R.mipmap.icon_send_money, "send_money"),
        QuickAction("Lipa na\nM-PESA", R.mipmap.icon_buy_goods, "buygoods"),
        QuickAction("Withdraw\nMoney", R.mipmap.icon_cash_out, "withdraw"),
        QuickAction("Buy Bundles", R.mipmap.icon_purchase_bundle, "bundles"),
        QuickAction("International\nTransfers", R.mipmap.icon_international_transfers, "global"),
        QuickAction("Airtime Top\nup", R.mipmap.icon_airtime_recharge, "airtime"),
        QuickAction("Tunukiwa\nBundles", R.mipmap.icon_bundle_tunukiwa, "tunukiwa"),
        QuickAction("Home\nInternet", R.drawable.icon_sfc_home_fibre, "homefibre"),
    )

    /** Frequents tabs. */
    val frequentTabs = listOf("Apps", "Send", "Pay", "Buy")

    /** Explore & Discover Deals — auto-scrolling ad carousel (~5 banners, left→right). */
    val ads = listOf(
        AdBanner("Unlock MORE Surprises", "Shell Club · Spend · Earn · Redeem", 0xFFFFD400, 0xFFD0021B, 0xFFD0021B),
        AdBanner("Fresh Friday Deals", "Get bigger data bundles every Friday", 0xFF1E7A34, 0xFFFFFFFF, 0xFFB9F0C4),
        AdBanner("Send Money to the Bank", "Move cash straight to any bank account", 0xFF14489B, 0xFFFFFFFF, 0xFFBFD4FF),
        AdBanner("Fuliza Umeleft?", "Complete payments with Fuliza M-PESA", 0xFF6A1B9A, 0xFFFFFFFF, 0xFFE9CCF7),
        AdBanner("M-PESA GO 5G", "Blazing fast internet for your home", 0xFFC2185B, 0xFFFFFFFF, 0xFFFFD1E3),
    )

    /** My Finances partners. */
    val finances = listOf(
        FinanceItem("ZiiDi\nTrader", "ZiiDi", 0xFF0A2E6E),
        FinanceItem("ZiiDi\nInvest & Save", "ZiiDi", 0xFF1FA84B),
        FinanceItem("M-Shwari", "M-Shwari", 0xFF14A54B),
        FinanceItem("Tuunza\nMapato", "TUUNZA\nMAPATO", 0xFFFFFFFF, circle = true),
    )

    /** Entertainment tiles. */
    val entertainment = listOf(
        EntertainmentItem("Baze", "🅱️", 0xFFFBE3EE),
        EntertainmentItem("Games", "🎮", 0xFFFBE9D6),
        EntertainmentItem("Newspaper", "📰", 0xFFF6E9DC),
    )

    /**
     * "Do more with M-PESA" — 18 category tiles laid out in the original's alternating
     * 3-2-3-2-3-2-3 masonry. Colours/emoji chosen to match the screenshots.
     */
    val doMore = listOf(
        DoMoreCategory("Financial Services", "💰", 0xFFE7F3EE),
        DoMoreCategory("Global Payments", "💳", 0xFFECEAF8),
        DoMoreCategory("Safaricom Business", "📊", 0xFFFBEEDD, R.mipmap.icon_business),
        DoMoreCategory("Transport & Travel", "🚌", 0xFFE4F1F8, R.mipmap.ic_travel),
        DoMoreCategory("Shop & Gift", "🎁", 0xFFF3EAF8, R.mipmap.ic_gift),
        DoMoreCategory("Govt Services", "🏛️", 0xFFFBE7EA, R.mipmap.ic_govt),
        DoMoreCategory("Get Insurance", "🛡️", 0xFFE7F3EE, R.mipmap.ic_insurance),
        DoMoreCategory("Manage My Services", "🧩", 0xFFFBEEDD),
        DoMoreCategory("Mobile Games", "🎮", 0xFFFBF3D6, R.mipmap.ic_gaming),
        DoMoreCategory("Money Management", "💰", 0xFFEFEFEF),
        DoMoreCategory("Betting", "🎮", 0xFFE4F1F0, R.mipmap.ic_gaming),
        DoMoreCategory("Loyalty & Marketing", "🏅", 0xFFECEAF8, R.mipmap.ic_loyalty),
        DoMoreCategory("Health & Wellness", "🩺", 0xFFFBEEDD, R.mipmap.ic_health),
        DoMoreCategory("Entertainment", "🍿", 0xFFE4F1F8, R.mipmap.ic_entertainment),
        DoMoreCategory("Utilities", "🧾", 0xFFF3EAF8, R.mipmap.ic_utilities),
        DoMoreCategory("Education", "🎒", 0xFFFBE7EA, R.mipmap.ic_education),
        DoMoreCategory("Trading", "📈", 0xFFE7F3EE, R.mipmap.icon_business),
        DoMoreCategory("News", "📰", 0xFFFBEEDD),
    )

    /** Row pattern for the Do-more masonry (tiles-per-row). */
    val doMoreRowPattern = listOf(3, 2, 3, 2, 3, 2, 3)
}

