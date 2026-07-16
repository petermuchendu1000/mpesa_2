package com.safaricom.mpesa.frontend.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.safaricom.mpesa.frontend.R

/**
 * The original My OneApp bundles **Proxima Nova** (extracted byte-exact from the APK's
 * res/font family: Light 300, Regular 400, Semibold 500/600, Bold 700, Black 900).
 * This is the single typeface used across every screen.
 */
val ProximaNova = FontFamily(
    Font(R.font.proxima_nova_light, FontWeight.Light),        // 300
    Font(R.font.proxima_nova_regular, FontWeight.Normal),     // 400
    Font(R.font.proxima_nova_semibold, FontWeight.Medium),    // 500  (app maps Medium→Semibold)
    Font(R.font.proxima_nova_semibold, FontWeight.SemiBold),  // 600
    Font(R.font.proxima_nova_bold, FontWeight.Bold),          // 700
    Font(R.font.proxima_nova_black, FontWeight.Black),        // 900
)

/** Material3 typography re-based onto Proxima Nova (weights unchanged from defaults). */
val ProximaTypography: Typography = Typography().run {
    fun TextStyle.pn() = copy(fontFamily = ProximaNova)
    Typography(
        displayLarge = displayLarge.pn(),
        displayMedium = displayMedium.pn(),
        displaySmall = displaySmall.pn(),
        headlineLarge = headlineLarge.pn(),
        headlineMedium = headlineMedium.pn(),
        headlineSmall = headlineSmall.pn(),
        titleLarge = titleLarge.pn(),
        titleMedium = titleMedium.pn(),
        titleSmall = titleSmall.pn(),
        bodyLarge = bodyLarge.pn(),
        bodyMedium = bodyMedium.pn(),
        bodySmall = bodySmall.pn(),
        labelLarge = labelLarge.pn(),
        labelMedium = labelMedium.pn(),
        labelSmall = labelSmall.pn(),
    )
}

