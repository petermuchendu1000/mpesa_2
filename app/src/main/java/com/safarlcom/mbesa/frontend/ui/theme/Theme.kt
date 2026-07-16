package com.safarlcom.mbesa.frontend.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(
    primary = BrandGreen,
    onPrimary = Color.White,
    primaryContainer = BrandGreenLight,
    onPrimaryContainer = BrandGreenDark,
    secondary = BrandGreenDark,
    onSecondary = Color.White,
    background = NeutralBg,
    onBackground = TextPrimary,
    surface = CardWhite,
    onSurface = TextPrimary,
    error = Danger,
)

@Composable
fun MyOneAppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColors,
        typography = ProximaTypography,
    ) {
        // Make Proxima Nova the default for every bare Text() as well.
        CompositionLocalProvider(
            LocalTextStyle provides LocalTextStyle.current.copy(fontFamily = ProximaNova),
            content = content,
        )
    }
}





