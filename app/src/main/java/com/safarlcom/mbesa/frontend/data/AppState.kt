package com.safarlcom.mbesa.frontend.data

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.runtime.mutableStateListOf

/**
 * Single in-memory source of truth for the wallet. Everything is Compose-observable so the
 * balance / Fuliza / history update live across the whole app.
 *
 * FULIZA (how it works): Fuliza M-PESA is an overdraft. When a payment is larger than the
 * available M-PESA balance, Fuliza automatically tops up the shortfall (up to the granted
 * limit). The borrowed amount becomes a debt (fulizaUsed) which reduces the available Fuliza,
 * and any money received afterwards repays the Fuliza first before topping up the balance.
 */
object AppState {

    /** The default demo PIN. Enter this to log in / authorise; anything else is "wrong". */
    const val CORRECT_PIN = "0000"

    var balance by mutableDoubleStateOf(914.88)
        private set
    var airtime by mutableDoubleStateOf(20.00)
        private set

    /** Total granted Fuliza limit and how much of it is currently borrowed. */
    var fulizaLimit by mutableDoubleStateOf(300.00)
        private set
    var fulizaUsed by mutableDoubleStateOf(0.00)
        private set

    val fulizaAvailable: Double get() = (fulizaLimit - fulizaUsed).coerceAtLeast(0.0)

    /** Session flag – cleared when the app goes to the background so the PIN is required again. */
    var authenticated by mutableStateOf(false)

    /** Newest-first list of transactions the user performs this session. */
    val transactions: SnapshotStateList<TxItem> = mutableStateListOf()

    fun money(v: Double): String = "%,.2f".format(v)

    val balanceStr: String get() = money(balance)
    val airtimeStr: String get() = money(airtime)
    val fulizaAvailableStr: String get() = money(fulizaAvailable)

    /** Can this amount be paid at all (balance + remaining Fuliza)? */
    fun canAfford(amount: Double): Boolean = amount > 0 && amount <= balance + fulizaAvailable

    data class PayResult(
        val success: Boolean,
        val fromBalance: Double = 0.0,
        val fromFuliza: Double = 0.0,
    )

    /**
     * Runs a transaction for [actionId]. Deducts from the balance and, when short, draws the
     * remainder from Fuliza. "request" is treated as an incoming money request (no deduction),
     * and "airtime" also tops up the airtime balance.
     */
    fun performTransaction(
        actionId: String,
        title: String,
        amount: Double,
        recipient: String,
    ): PayResult {
        // Non-deducting flows (money requests just notify the other party).
        if (actionId == "request" || amount <= 0.0) {
            addTx(title, recipient, amount, incoming = actionId == "request", fuliza = 0.0)
            return PayResult(success = true)
        }
        if (!canAfford(amount)) return PayResult(success = false)

        val fromBalance = minOf(amount, balance)
        val fromFuliza = amount - fromBalance
        balance -= fromBalance
        fulizaUsed += fromFuliza
        if (actionId == "airtime") airtime += amount

        addTx(title, recipient, amount, incoming = false, fuliza = fromFuliza)
        return PayResult(success = true, fromBalance = fromBalance, fromFuliza = fromFuliza)
    }

    /** Receiving money: repay Fuliza first, then top up the balance. */
    fun receive(amount: Double) {
        if (amount <= 0) return
        val repay = minOf(amount, fulizaUsed)
        fulizaUsed -= repay
        balance += (amount - repay)
    }

    private fun addTx(title: String, recipient: String, amount: Double, incoming: Boolean, fuliza: Double) {
        val sub = buildString {
            if (recipient.isNotBlank()) append(recipient) else append("M-PESA")
            if (fuliza > 0.0) append(" · Fuliza Ksh ${money(fuliza)}")
        }
        val sign = if (incoming) "+ " else "- "
        transactions.add(
            0,
            TxItem(
                title = title.ifBlank { "M-PESA" },
                subtitle = sub,
                amount = "$sign Ksh ${money(amount)}",
                incoming = incoming,
            ),
        )
    }

    /** Reset the session lock (called on logout / when the app is backgrounded). */
    fun lock() {
        authenticated = false
    }
}

