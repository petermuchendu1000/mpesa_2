package com.safarlcom.mbesa.frontend.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.safarlcom.mbesa.frontend.R

/**
 * Proxima Nova — extracted **byte-identical** from My OneApp v5.1.9 (`assets/fonts/`).
 *
 * The production app ships EXACTLY three weights and no others:
 *   - Regular.ttf  -> Proxima Nova Regular   (usWeightClass 400)
 *   - Medium.ttf   -> Proxima Nova Semibold  (usWeightClass 600)  ← the app's "Medium" file IS Semibold
 *   - Bold.ttf     -> Proxima Nova Bold      (usWeightClass 700)
 * unitsPerEm 1000, ascent/descent 920/-298, 1435 glyphs (all three).
 *
 * There is no Light (300) or Black (900) in the app, so this family exposes only the real
 * weights. Compose resolves any heavier request (e.g. FontWeight.Black) to the nearest
 * available weight (Bold 700) — matching how the app itself renders.
 */
val ProximaNova = FontFamily(
    Font(R.font.proxima_nova_regular, FontWeight.Normal),    // 400
    Font(R.font.proxima_nova_semibold, FontWeight.Medium),   // 500 -> Semibold file (app mapping)
    Font(R.font.proxima_nova_semibold, FontWeight.SemiBold), // 600 -> Semibold file (exact)
    Font(R.font.proxima_nova_bold, FontWeight.Bold),         // 700
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
