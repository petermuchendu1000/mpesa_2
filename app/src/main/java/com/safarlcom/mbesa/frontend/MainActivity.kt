package com.safarlcom.mbesa.frontend

import android.Manifest
import android.content.pm.PackageManager
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat
import com.safarlcom.mbesa.frontend.data.AppState
import com.safarlcom.mbesa.frontend.notify.MpesaNotifications
import com.safarlcom.mbesa.frontend.ui.AppNavHost
import com.safarlcom.mbesa.frontend.ui.theme.MyOneAppTheme

class MainActivity : ComponentActivity() {
    // Registered before the activity is STARTED so it can be launched from onCreate.
    private val requestNotifPermission =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) { /* best-effort */ }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Plain white top: white status bar with dark icons.
        window.statusBarColor = Color.WHITE
        WindowCompat.getInsetsController(window, window.decorView).isAppearanceLightStatusBars = true

        // Notifications for incoming M-PESA credits: create the channel and ask for POST_NOTIFICATIONS
        // on Android 13+ (older versions grant it at install time).
        MpesaNotifications.ensureChannel(this)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU &&
            ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED
        ) {
            requestNotifPermission.launch(Manifest.permission.POST_NOTIFICATIONS)
        }
        setContent {
            MyOneAppTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    AppNavHost()
                }
            }
        }
    }

    /** Lock the app whenever it leaves the foreground so the PIN is required to return. */
    override fun onStop() {
        super.onStop()
        AppState.lock()
    }
}


