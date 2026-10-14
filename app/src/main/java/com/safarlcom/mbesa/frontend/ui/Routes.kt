package com.safarlcom.mbesa.frontend.ui

import android.net.Uri
import com.safarlcom.mbesa.frontend.data.ActionKind
import com.safarlcom.mbesa.frontend.data.SfcAction
import com.safarlcom.mbesa.frontend.data.TransferResult

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

    /**
     * The idempotency key for THIS attempt-chain, minted once on Confirm and reused by every retry.
     *
     * It is the difference between a timeout costing nothing and a timeout sending twice. A new one
     * per press would make the retry a second transfer; one per chain makes the server's replay
     * path do its job. Cleared only when the flow is finished or abandoned.
     */
    var ref: String = ""

    /** What actually left the wallet: the amount plus any withdrawal charge the sender covered. */
    val totalCents: Long get() = amountCents + chargeCents

    /** Mint the ref. Called once, when the sender reaches Confirm. */
    fun beginAttempt() {
        ref = "snd-" + java.util.UUID.randomUUID().toString().replace("-", "").take(24)
    }

    fun clear() {
        mode = SendMode.MOBILE
        recipientPhone = ""; recipientName = ""
        amountCents = 0L; chargeCents = 0L; ref = ""
    }
}

/**
 * A COMPLETED transfer, kept so the confirmation and the receipt can be re-read after the fact.
 *
 * Deliberately separate from [SendFlow]. SendFlow is an intention — it is mutable while the sender
 * is still deciding, and it is cleared the moment they leave. This is a record of something that
 * happened, and every field in it is the SERVER's answer: the confirmation code, the time the money
 * moved, the amount it moved and the name of the marketer it reached. The only field taken from the
 * app is the recipient's number, because the sender typed it and the server never sends it back
 * (invest254 docs/58).
 *
 * It exists because the receipt is a separate screen. Re-deriving a receipt from SendFlow after the
 * fact would mean printing a time and an ID the handset made up for a transaction it does not own.
 */
object SendReceipt {
    var code: String = ""
    var createdAtMs: Long = 0L
    var amountCents: Long = 0L
    var recipientName: String = ""
    var recipientPhone: String = ""
    var balanceCents: Long = 0L
    var pochi: Boolean = false
    /** True when the server reported this as a replay of an earlier send rather than a new one. */
    var idempotent: Boolean = false
    /** The [SendFlow.ref] this receipt belongs to — see [matches]. */
    var ref: String = ""

    val isEmpty: Boolean get() = createdAtMs == 0L

    /**
     * Is this the receipt for the transfer currently in flight?
     *
     * The result screen asks before sending. Navigation recreates a destination when it is popped
     * back to, so walking to the receipt and pressing back re-enters the result screen and would
     * otherwise re-run the transfer. The same ref makes that harmless on the server — it answers
     * "already done" — but it is a pointless round trip that puts "Sending…" back on a screen the
     * sender has already read, and it would fail visibly when they are offline by then.
     */
    fun matches(flowRef: String): Boolean = !isEmpty && ref.isNotBlank() && ref == flowRef

    fun record(ok: TransferResult.Ok, phone: String, isPochi: Boolean, flowRef: String) {
        code = ok.code
        createdAtMs = ok.createdAtMs
        amountCents = ok.sentCents
        recipientName = ok.recipientName
        recipientPhone = phone
        balanceCents = ok.balanceCents
        idempotent = ok.idempotent
        pochi = isPochi
        ref = flowRef
    }

    fun asOk(): TransferResult.Ok = TransferResult.Ok(
        balanceCents = balanceCents, sentCents = amountCents, recipientName = recipientName,
        idempotent = idempotent, code = code, createdAtMs = createdAtMs,
    )

    fun clear() {
        code = ""; createdAtMs = 0L; amountCents = 0L
        recipientName = ""; recipientPhone = ""; balanceCents = 0L
        pochi = false; idempotent = false; ref = ""
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
    const val SEND_CONFIRM = "send/confirm"
    const val SEND_PIN = "send/pin"
    const val SEND_RESULT = "send/result"
    const val SEND_RECEIPT = "send/receipt"

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



