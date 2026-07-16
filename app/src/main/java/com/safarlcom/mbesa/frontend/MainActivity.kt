package com.safarlcom.mbesa.frontend

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.core.view.WindowCompat
import com.safarlcom.mbesa.frontend.data.AppState
import com.safarlcom.mbesa.frontend.ui.AppNavHost
import com.safarlcom.mbesa.frontend.ui.theme.MyOneAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Plain white top: white status bar with dark icons.
        window.statusBarColor = Color.WHITE
        WindowCompat.getInsetsController(window, window.decorView).isAppearanceLightStatusBars = true
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


