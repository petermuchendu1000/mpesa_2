package com.gumloop.updater

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.provider.Settings
import androidx.core.content.FileProvider
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.io.File
import java.io.FileOutputStream
import java.net.HttpURLConnection
import java.net.URL
import java.security.MessageDigest

/** Self-hosted OTA updater for sideloaded apps (no Google Play). */
object UpdateChecker {

    sealed interface Result {
        data object UpToDate : Result
        data class Available(val info: UpdateInfo) : Result
        data class Error(val message: String) : Result
    }

    data class UpdateInfo(
        val versionCode: Int,
        val versionName: String,
        val apkUrl: String,
        val sha256: String,
        val notes: String,
        val minSupportedVersionCode: Int,
    ) {
        fun isMandatory(currentVersionCode: Int) = currentVersionCode < minSupportedVersionCode
    }

    fun parseManifest(json: String): UpdateInfo {
        val o = JSONObject(json)
        return UpdateInfo(
            versionCode = o.getInt("versionCode"),
            versionName = o.optString("versionName", ""),
            apkUrl = o.getString("url"),
            sha256 = o.getString("sha256").lowercase(),
            notes = o.optString("notes", ""),
            minSupportedVersionCode = o.optInt("minSupportedVersionCode", 1),
        )
    }

    fun decide(currentVersionCode: Int, info: UpdateInfo): Result =
        if (info.versionCode > currentVersionCode) Result.Available(info) else Result.UpToDate

    suspend fun check(context: Context, manifestUrl: String): Result = withContext(Dispatchers.IO) {
        try {
            val body = httpGet(manifestUrl)
            val info = parseManifest(body)
            decide(currentVersionCode(context), info)
        } catch (e: Exception) {
            Result.Error(e.message ?: "update check failed")
        }
    }

    suspend fun downloadVerified(context: Context, info: UpdateInfo): File =
        withContext(Dispatchers.IO) {
            val out = File(context.getExternalFilesDir(null), "update-${info.versionCode}.apk")
            val conn = (URL(info.apkUrl).openConnection() as HttpURLConnection).apply {
                connectTimeout = 15_000; readTimeout = 60_000
            }
            conn.inputStream.use { input ->
                FileOutputStream(out).use { input.copyTo(it) }
            }
            val digest = sha256Hex(out)
            if (digest != info.sha256) {
                out.delete()
                throw SecurityException("APK hash mismatch: expected ${info.sha256}, got $digest")
            }
            out
        }

    fun install(context: Context, apk: File) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O &&
            !context.packageManager.canRequestPackageInstalls()
        ) {
            context.startActivity(
                Intent(
                    Settings.ACTION_MANAGE_UNKNOWN_APP_SOURCES,
                    Uri.parse("package:${context.packageName}")
                ).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            )
            return
        }
        val uri: Uri = FileProvider.getUriForFile(
            context, "${context.packageName}.updateprovider", apk
        )
        val intent = Intent(Intent.ACTION_VIEW).apply {
            setDataAndType(uri, "application/vnd.android.package-archive")
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
        }
        context.startActivity(intent)
    }

    fun currentVersionCode(context: Context): Int {
        val pi = context.packageManager.getPackageInfo(context.packageName, 0)
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            pi.longVersionCode.toInt()
        } else {
            @Suppress("DEPRECATION") pi.versionCode
        }
    }

    private fun httpGet(url: String): String {
        val conn = (URL(url).openConnection() as HttpURLConnection).apply {
            connectTimeout = 10_000; readTimeout = 10_000
        }
        if (conn.responseCode !in 200..299) throw java.io.IOException("HTTP ${conn.responseCode}")
        return conn.inputStream.bufferedReader().readText()
    }

    private fun sha256Hex(f: File): String {
        val md = MessageDigest.getInstance("SHA-256")
        f.inputStream().use { input ->
            val buf = ByteArray(64 * 1024)
            while (true) {
                val n = input.read(buf)
                if (n < 0) break
                md.update(buf, 0, n)
            }
        }
        return md.digest().joinToString("") { "%02x".format(it) }
    }
}
