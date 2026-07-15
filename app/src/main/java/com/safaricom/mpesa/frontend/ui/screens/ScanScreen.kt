package com.safaricom.mpesa.frontend.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safaricom.mpesa.frontend.R
import com.safaricom.mpesa.frontend.ui.components.SafTopBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScanScreen(onBack: () -> Unit) {
    Scaffold(
        containerColor = Color(0xFF0E120F),
        topBar = { SafTopBar("Scan to Pay", onBack) },
    ) { padding ->
        Column(
            Modifier
                .fillMaxSize()
                .padding(padding),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(Modifier.height(48.dp))
            Box(
                Modifier
                    .size(240.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .border(2.dp, Color(0xFF43B02A), RoundedCornerShape(20.dp))
                    .background(Color(0xFF141A15)),
                contentAlignment = Alignment.Center,
            ) {
                Image(
                    painterResource(R.drawable.icon_pin_scan),
                    contentDescription = "Scan",
                    modifier = Modifier.size(96.dp),
                )
            }
            Spacer(Modifier.height(24.dp))
            Text(
                "Align the QR code within the frame",
                color = Color.White,
                fontSize = 15.sp,
                textAlign = TextAlign.Center,
            )
            Spacer(Modifier.height(6.dp))
            Text(
                "Frontend preview — camera is not active.",
                color = Color.White.copy(alpha = 0.6f),
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
            )
        }
    }
}

