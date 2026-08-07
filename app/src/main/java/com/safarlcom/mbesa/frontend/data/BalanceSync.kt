package com.safarlcom.mbesa.frontend.data

import android.content.Context
import org.json.JSONObject
import java.io.File

/**
 * Writes the current wallet state to a small JSON file in the app's external files dir so that
 * companion apps (e.g. the Truecaller SMS demo) can read the exact same M-PESA balance and
 * Fuliza state. This keeps the balance shown inside simulated SMS messages in sync with the
 * balance shown in this app.
 *
 * Path: /sdcard/Android/data/com.safarlcom.mbesa.frontend/files/mpesa_balance.json
 * No permissions are required for an app to write its own external files dir; other apps can
 * read it if they know the path (same-device companion apps).
 */
object BalanceSync {

    private const val FILE_NAME = "mpesa_balance.json"

    /** Persist the current balance + Fuliza state. Call after every mutation. */
    @JvmStatic
    fun publish(ctx: Context) {
        try {
            val dir = ctx.getExternalFilesDir(null) ?: return
            val f = File(dir, FILE_NAME)
            val o = JSONObject()
            o.put("balanceCents", (AppState.balance * 100).toLong())
            o.put("fulizaUsedCents", (AppState.fulizaUsed * 100).toLong())
            o.put("fulizaLimitCents", (AppState.fulizaLimit * 100).toLong())
            o.put("updatedAtMs", System.currentTimeMillis())
            f.writeText(o.toString())
        } catch (_: Exception) { /* best-effort sync; never crash the app */ }
    }
}
