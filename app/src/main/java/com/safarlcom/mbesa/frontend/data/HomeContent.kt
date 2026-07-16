package com.safarlcom.mbesa.frontend.data

import com.safarlcom.mbesa.frontend.R

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
    const val BALANCE = "914.88"
    const val FULIZA = "300.00"
    const val AIRTIME = "20.00"

    /**
     * The 8 Quick Actions in the exact order shown.
     *
     * Icons use the consistent `icon_sfc_*` vector set (brand green #35A839 + red line-art),
     * which matches the live home screen. The older `mipmap/icon_*` PNGs were a mismatched set —
     * several (buy goods, cash out, purchase bundle, airtime) are flat light-grey glyphs that are
     * nearly invisible on the grey icon chip.
     */
    val quickActions = listOf(
        QuickAction("Send Money", R.drawable.icon_sfc_send_money, "send_money"),
        QuickAction("Lipa na\nM-PESA", R.drawable.icon_sfc_mpesa_pay, "buygoods"),
        QuickAction("Withdraw\nMoney", R.drawable.icon_sfc_withdraw_at_agent, "withdraw"),
        QuickAction("Buy Bundles", R.drawable.icon_sfc_buy_bundles, "bundles"),
        QuickAction("International\nTransfers", R.drawable.icon_sfc_mpesa_global, "global"),
        QuickAction("Airtime Top\nup", R.drawable.icon_sfc_airtime, "airtime"),
        QuickAction("Tunukiwa\nBundles", R.drawable.icon_sfc_tunukiwa, "tunukiwa"),
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

