package com.safarlcom.mbesa.frontend.notify

import android.Manifest
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat
import com.safarlcom.mbesa.frontend.R
import com.safarlcom.mbesa.frontend.data.MpesaTx

/**
 * Posts real OS notifications that mirror an M-PESA "money received" SMS. When a marketer
 * withdraws game winnings on invest254 the amount is credited instantly into this wallet, and
 * the Home poll turns that new credit into a heads-up notification exactly like the one Safaricom
 * sends ("MPESA … You have received Ksh700.00 from INVEST254 … New M-PESA balance is …").
 */
object MpesaNotifications {
    private const val CHANNEL_ID = "mpesa_transactions"
    private const val CHANNEL_NAME = "M-PESA transactions"
    private val BRAND_GREEN = 0xFF43A047.toInt()

    /** Create the (idempotent) high-importance channel so alerts pop as heads-up on Android 8+. */
    fun ensureChannel(context: Context) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) return
        val mgr = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        if (mgr.getNotificationChannel(CHANNEL_ID) != null) return
        val channel = NotificationChannel(CHANNEL_ID, CHANNEL_NAME, NotificationManager.IMPORTANCE_HIGH).apply {
            description = "Money received, sent and withdrawal alerts"
            enableVibration(true)
        }
        mgr.createNotificationChannel(channel)
    }

    /** True when we're allowed to post notifications (POST_NOTIFICATIONS is runtime-gated on 13+). */
    private fun canPost(context: Context): Boolean {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU) return true
        return ContextCompat.checkSelfPermission(context, Manifest.permission.POST_NOTIFICATIONS) ==
            PackageManager.PERMISSION_GRANTED
    }

    /** Post an M-PESA-styled notification for a received (incoming) transaction. */
    fun showReceived(context: Context, tx: MpesaTx) {
        ensureChannel(context)
        if (!canPost(context)) return
        val notification = NotificationCompat.Builder(context, CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_notifications)
            .setContentTitle("MPESA")
            .setContentText(tx.message)
            .setStyle(NotificationCompat.BigTextStyle().bigText(tx.message))
            .setSubText(tx.amountText)
            .setColor(BRAND_GREEN)
            .setColorized(true)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setCategory(NotificationCompat.CATEGORY_MESSAGE)
            .setAutoCancel(true)
            .build()
        // Stable id per ledger entry so a re-poll of the same tx updates rather than duplicates.
        NotificationManagerCompat.from(context).notify(tx.id.toInt(), notification)
    }
}
