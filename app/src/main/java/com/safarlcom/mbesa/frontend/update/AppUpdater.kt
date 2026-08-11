package com.safarlcom.mbesa.frontend.update

import android.app.Activity
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.lifecycleScope
import com.gumloop.updater.UpdateChecker
import kotlinx.coroutines.launch

/** Launch-time OTA update check for the M-PESA frontend. */
object AppUpdater {

    const val MANIFEST_URL = "https://raw.githubusercontent.com/petermuchendu1000/mpesa_2/main/ota/version.json"

    fun checkOnLaunch(activity: androidx.activity.ComponentActivity) {
        activity.lifecycleScope.launch {
            when (val r = UpdateChecker.check(activity, MANIFEST_URL)) {
                is UpdateChecker.Result.Available -> showDialog(activity, r.info)
                else -> Unit // UpToDate or Error: stay silent on launch
            }
        }
    }

    private fun showDialog(activity: Activity, info: UpdateChecker.UpdateInfo) {
        if (activity.isFinishing || activity.isDestroyed) return
        val mandatory = info.isMandatory(UpdateChecker.currentVersionCode(activity))
        val dlg = AlertDialog.Builder(activity)
            .setTitle("Update available — ${info.versionName}")
            .setMessage(if (info.notes.isBlank()) "A new version is available." else info.notes)
            .setPositiveButton("Update now") { _, _ -> downloadAndInstall(activity, info) }
            .setCancelable(!mandatory)
        if (!mandatory) dlg.setNegativeButton("Later", null)
        dlg.show()
    }

    private fun downloadAndInstall(activity: Activity, info: UpdateChecker.UpdateInfo) {
        (activity as androidx.activity.ComponentActivity).lifecycleScope.launch {
            try {
                val apk = UpdateChecker.downloadVerified(activity, info)
                UpdateChecker.install(activity, apk)
            } catch (e: Exception) {
                AlertDialog.Builder(activity)
                    .setTitle("Update failed")
                    .setMessage(e.message ?: "Could not download the update.")
                    .setPositiveButton("OK", null)
                    .show()
            }
        }
    }
}
