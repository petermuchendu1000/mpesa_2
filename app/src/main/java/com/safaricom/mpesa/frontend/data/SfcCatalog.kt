package com.safaricom.mpesa.frontend.data

import com.safaricom.mpesa.frontend.R

/** How a service behaves when tapped. */
enum class ActionKind { TRANSACT, DETAIL, LIST }

/** One input field for a transaction entry screen. */
data class InputSpec(val label: String, val kind: FieldKind)
enum class FieldKind { PHONE, NUMBER, AMOUNT, TEXT }

/** A Safaricom / M-PESA service tile (icon + behaviour). */
data class SfcAction(
    val id: String,
    val title: String,
    val iconRes: Int,
    val kind: ActionKind = ActionKind.TRANSACT,
    val inputs: List<InputSpec> = listOf(
        InputSpec("Phone number", FieldKind.PHONE),
        InputSpec("Amount", FieldKind.AMOUNT),
    ),
    val detail: String = "",
)

/** A grouped list row for the "My" menu. */
data class MenuItem(val title: String, val iconRes: Int, val badge: String? = null)
data class MenuGroup(val header: String, val items: List<MenuItem>)

object SfcCatalog {

    private val phoneAmount = listOf(
        InputSpec("Phone number", FieldKind.PHONE),
        InputSpec("Amount", FieldKind.AMOUNT),
    )

    val actions: Map<String, SfcAction> = listOf(
        SfcAction("send_money", "Send Money", R.drawable.icon_sfc_send_money, inputs = phoneAmount),
        SfcAction(
            "withdraw", "Withdraw", R.drawable.icon_sfc_withdraw_at_agent,
            inputs = listOf(
                InputSpec("Agent number", FieldKind.NUMBER),
                InputSpec("Store number", FieldKind.NUMBER),
                InputSpec("Amount", FieldKind.AMOUNT),
            )
        ),
        SfcAction(
            "paybill", "Pay Bill", R.drawable.ic_statement_pay_bill,
            inputs = listOf(
                InputSpec("Business number", FieldKind.NUMBER),
                InputSpec("Account number", FieldKind.TEXT),
                InputSpec("Amount", FieldKind.AMOUNT),
            )
        ),
        SfcAction(
            "buygoods", "Buy Goods", R.drawable.ic_statement_buy_goods,
            inputs = listOf(
                InputSpec("Till number", FieldKind.NUMBER),
                InputSpec("Amount", FieldKind.AMOUNT),
            )
        ),
        SfcAction(
            "airtime", "Buy Airtime", R.drawable.icon_sfc_airtime,
            inputs = listOf(
                InputSpec("Phone number (self or other)", FieldKind.PHONE),
                InputSpec("Amount", FieldKind.AMOUNT),
            )
        ),
        SfcAction("bundles", "Buy Bundles", R.drawable.icon_sfc_buy_bundles, kind = ActionKind.LIST),
        SfcAction("pochi", "Pochi la Biashara", R.drawable.icon_sfc_pochi, inputs = phoneAmount),
        SfcAction(
            "fuliza", "Fuliza", R.drawable.icon_sfc_fuliza, kind = ActionKind.DETAIL,
            detail = "Fuliza M-PESA lets you complete M-PESA payments when you have " +
                "insufficient funds. Your available limit is based on your usage."
        ),

        // Extended / All services
        SfcAction("global", "M-PESA Global", R.drawable.icon_sfc_mpesa_global, inputs = phoneAmount),
        SfcAction("homefibre", "Home Internet", R.drawable.icon_sfc_home_fibre, kind = ActionKind.LIST),
        SfcAction("bonga", "Pay with Bonga", R.drawable.ic_lipa_na_bonga, inputs = phoneAmount),
        SfcAction("request", "Request Money", R.drawable.ic_request_money, inputs = phoneAmount),
        SfcAction("sendbank", "Send to Bank", R.drawable.ic_one_app_action_send_to_bank, inputs = phoneAmount),
        SfcAction("sendmobile", "Send to Mobile", R.drawable.ic_one_app_action_send_to_mobile, inputs = phoneAmount),
        SfcAction("westernunion", "Western Union", R.drawable.ic_one_app_action_send_to_western_union, inputs = phoneAmount),
        SfcAction("sambaza", "Sambaza", R.drawable.icon_sfc_sambaza, inputs = phoneAmount),
        SfcAction("tunukiwa", "Tunukiwa", R.drawable.icon_sfc_tunukiwa, kind = ActionKind.LIST),
        SfcAction("coupons", "My Coupons", R.drawable.icon_sfc_my_coupons, kind = ActionKind.DETAIL,
            detail = "You have no active coupons right now. Coupons you earn will appear here."),
        SfcAction("subscriptions", "My Subscriptions", R.drawable.icon_sfc_my_subscriptions, kind = ActionKind.LIST),
        SfcAction("usage", "Check My Usage", R.drawable.icon_sfc_check_my_usage, kind = ActionKind.DETAIL,
            detail = "Data used: 3.2 GB of 10 GB\nMinutes: 240 of 400\nSMS: 120 of 500"),
        SfcAction("manageline", "Manage My Line", R.drawable.icon_sfc_manage_my_line, kind = ActionKind.DETAIL,
            detail = "Manage SIM services, call barring, and line settings."),
        SfcAction("esim", "Request eSIM", R.drawable.icon_sfc_request_e_sim, kind = ActionKind.DETAIL,
            detail = "Request a new eSIM profile for your device."),
        SfcAction("mpesapay", "M-PESA Pay", R.drawable.icon_sfc_mpesa_pay, inputs = phoneAmount),
        SfcAction(
            "postpay", "Postpay Bill", R.drawable.ic_postpay_bill,
            inputs = listOf(
                InputSpec("Account number", FieldKind.NUMBER),
                InputSpec("Amount", FieldKind.AMOUNT),
            )
        ),
    ).associateBy { it.id }

    /** Home dashboard quick-action grid (first screen). */
    val homeQuickActions = listOf(
        "send_money", "withdraw", "paybill", "buygoods",
        "airtime", "bundles", "pochi", "fuliza",
    ).map { actions.getValue(it) }

    /** Full "Send & Request Money / All Services" grid. */
    val allServices = listOf(
        "send_money", "withdraw", "paybill", "buygoods",
        "airtime", "bundles", "pochi", "fuliza",
        "global", "homefibre", "bonga", "request",
        "sendbank", "sendmobile", "westernunion", "sambaza",
        "tunukiwa", "mpesapay", "postpay", "esim",
    ).map { actions.getValue(it) }

    /** Home "Do more with M-PESA" grid (secondary functions, shown under quick actions). */
    val doMoreServices = listOf(
        "global", "homefibre", "bonga", "request",
        "sendbank", "sendmobile", "westernunion", "sambaza",
    ).map { actions.getValue(it) }

    /** Life tab services (icon + subtitle rows). */
    val lifeServices = listOf(
        Triple("homefibre", "Home Internet", "Discover Home Fibre & 5G plans"),
        Triple("tunukiwa", "Tunukiwa", "Bundles tailored just for you"),
        Triple("bonga", "Bonga Points", "Redeem your Bonga Points"),
        Triple("coupons", "My Coupons", "Deals and offers for you"),
        Triple("subscriptions", "My Subscriptions", "Manage your bundles & services"),
        Triple("usage", "Check My Usage", "Data, minutes and SMS balance"),
        Triple("sambaza", "Sambaza", "Share airtime with friends"),
        Triple("esim", "Request eSIM", "Go digital with an eSIM"),
    )

    /** "My" tab grouped menu (all icons are exact originals). */
    val myMenu = listOf(
        MenuGroup(
            "Account & Security", listOf(
                MenuItem("Security Center", R.drawable.icon_sfc_security_center),
                MenuItem("Manage Service PIN", R.drawable.icon_sfc_mange_service_pin),
                MenuItem("Forgot M-PESA PIN", R.drawable.icon_sfc_forget_pin),
                MenuItem("Biometric Authentication", R.drawable.icon_sfc_biometric_authentication),
                MenuItem("SIM Card", R.drawable.icon_sfc_sim_card),
                MenuItem("Get PUK", R.drawable.icon_sfc_get_puk),
                MenuItem("Blocked Businesses", R.drawable.icon_sfc_blocked_businesses),
            )
        ),
        MenuGroup(
            "Favourites", listOf(
                MenuItem("Add Favourites", R.drawable.icon_sfc_add_favourites),
                MenuItem("Manage Favourites", R.drawable.icon_sfc_manage_favorites),
            )
        ),
        MenuGroup(
            "Support & Tools", listOf(
                MenuItem("Get Help", R.drawable.icon_sfc_get_help),
                MenuItem("Report Fraud", R.drawable.icon_sfc_report_fraud),
                MenuItem("Find a Safaricom Shop", R.drawable.icon_sfc_find_a_safaricom_shop),
                MenuItem("Network Tools (Mtandao)", R.drawable.icon_sfc_mtandao),
                MenuItem("Reverse Transaction", R.drawable.icon_sfc_reverse_transaction),
            )
        ),
        MenuGroup(
            "App", listOf(
                MenuItem("Appearance", R.drawable.icon_sfc_appearance),
                MenuItem("Offline Mode", R.drawable.icon_sfc_offline_mode),
                MenuItem("Share App", R.drawable.icon_sfc_share_app),
                MenuItem("About My OneApp", R.drawable.icon_sfc_about_app),
            )
        ),
    )
}


