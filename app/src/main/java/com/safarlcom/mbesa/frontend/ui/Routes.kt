package com.safarlcom.mbesa.frontend.ui

import android.net.Uri
import com.safarlcom.mbesa.frontend.data.ActionKind
import com.safarlcom.mbesa.frontend.data.SfcAction

/** Holds the in-progress (mock) transaction as the user moves Entry → PIN → Receipt. */
object TxFlow {
    var actionId: String = ""
    var title: String = ""
    var recipient: String = ""
    var amount: String = ""
    var reference: String = ""

    // Result populated after the PIN is confirmed and the wallet is charged.
    var fulizaUsed: Double = 0.0
    var newBalance: String = ""
    var success: Boolean = true
}

/** Which form of the Send Money screen: a person's number, or a trader's Pochi till. */
enum class SendMode(val label: String) {
    MOBILE("Mobile number"),
    POCHI("Pochi la Biashara"),
}

/**
 * The marketer-to-marketer transfer in progress, carried from Send Money to Confirm.
 *
 * Separate from [TxFlow], which drives the OFFLINE sample flows (airtime, bundles, paybill) and
 * ends in a locally-faked receipt. This one ends in a real transfer between two marketer wallets on
 * the server, so it keeps the fields that transfer needs — the normalised number, the name the
 * SERVER resolved (never one the user typed), and cents rather than a display string.
 */
object SendFlow {
    var mode: SendMode = SendMode.MOBILE
    var recipientPhone: String = ""
    var recipientName: String = ""
    var amountCents: Long = 0L
    /** Simulated agent-withdrawal charge the sender chose to cover; 0 when the box is unticked. */
    var chargeCents: Long = 0L

    val totalCents: Long get() = amountCents + chargeCents

    fun clear() {
        mode = SendMode.MOBILE
        recipientPhone = ""; recipientName = ""
        amountCents = 0L; chargeCents = 0L
    }
}

object Routes {
    const val SPLASH = "splash"
    const val SIGNIN = "signin"   // phone + password
    const val LOGIN = "login"     // M-PESA PIN lock screen
    const val HOME = "home"
    const val ALL_SERVICES = "allservices"
    const val HISTORY = "history"
    const val NOTIFICATIONS = "notifications"
    const val SCAN = "scan"
    const val PIN = "pin"
    const val RECEIPT = "receipt"
    const val SEND_MONEY = "send/mobile"
    const val SEND_POCHI = "send/pochi"

    fun entry(id: String) = "entry/$id"
    fun detail(id: String) = "detail/$id"
    fun list(id: String) = "list/$id"
    fun info(title: String) = "info/${Uri.encode(title)}"

    /**
     * Where a service tile goes.
     *
     * Send Money and Pochi are intercepted HERE rather than at each call site, because the tiles are
     * rendered from the catalogue in four places (Quick Actions, Frequents, All Services and the
     * Life tab) and routing them one by one is how three of them would keep the old generic form.
     * Everything else still falls through to the catalogue-driven [EntryScreen].
     */
    fun forAction(a: SfcAction): String = when {
        a.id == "send_money" -> SEND_MONEY
        a.id == "pochi" -> SEND_POCHI
        else -> when (a.kind) {
            ActionKind.TRANSACT -> entry(a.id)
            ActionKind.DETAIL -> detail(a.id)
            ActionKind.LIST -> list(a.id)
        }
    }
}



