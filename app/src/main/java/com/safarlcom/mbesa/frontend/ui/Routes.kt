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

object Routes {
    const val SPLASH = "splash"
    const val LOGIN = "login"
    const val HOME = "home"
    const val ALL_SERVICES = "allservices"
    const val HISTORY = "history"
    const val NOTIFICATIONS = "notifications"
    const val SCAN = "scan"
    const val PIN = "pin"
    const val RECEIPT = "receipt"

    fun entry(id: String) = "entry/$id"
    fun detail(id: String) = "detail/$id"
    fun list(id: String) = "list/$id"
    fun info(title: String) = "info/${Uri.encode(title)}"

    fun forAction(a: SfcAction): String = when (a.kind) {
        ActionKind.TRANSACT -> entry(a.id)
        ActionKind.DETAIL -> detail(a.id)
        ActionKind.LIST -> list(a.id)
    }
}



