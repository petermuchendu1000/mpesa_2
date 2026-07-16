package com.safarlcom.mbesa.frontend.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.safarlcom.mbesa.frontend.R
import kotlinx.coroutines.delay

/**
 * Splash / launch screen — faithful recreation of the original SplashActivity
 * (`basic_activity_splash`).
 *
 * Original spec (recovered from decoded resources):
 *  - Root ConstraintLayout, background `@color 0x7f060057` = #FFFFFF (day) / #121212 (night).
 *  - `new_splash` "Safaricom | m-pesa" lockup (1009×130) in a 180dp square, centered on all
 *    four sides with fitCenter → appears ~180dp wide, vertically centred.
 *  - No tagline text; a top-end Skip button exists but is GONE by default.
 *  - Logo is set statically, then after a short hold the app proceeds (login check).
 */
@Composable
fun SplashScreen(onDone: () -> Unit) {
    LaunchedEffect(Unit) {
        delay(1300)
        onDone()
    }

    // The whole app is forced-light, and the launch windowBackground is white, so the splash
    // is white too (the day value of the original splash colour #ffffff) — no white→dark flash.
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center,
    ) {
        Image(
            painter = painterResource(R.mipmap.new_splash),
            contentDescription = "Safaricom M-PESA",
            contentScale = ContentScale.Fit,
            // 180dp logo box from the original; keep the exact lockup aspect ratio.
            modifier = Modifier
                .width(180.dp)
                .aspectRatio(1009f / 130f),
        )
    }
}



