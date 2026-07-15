package com.safaricom.mpesa.frontend.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safaricom.mpesa.frontend.ui.TxFlow
import com.safaricom.mpesa.frontend.ui.components.NumericKeypad
import com.safaricom.mpesa.frontend.ui.components.PinDots
import com.safaricom.mpesa.frontend.ui.components.SafTopBar
import kotlinx.coroutines.delay

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PinEntryScreen(
    onBack: () -> Unit,
    onDone: () -> Unit,
) {
    var pin by remember { mutableStateOf("") }

    LaunchedEffect(pin) {
        if (pin.length == 4) {
            delay(450)
            onDone()
        }
    }

    Scaffold(
        containerColor = Color.White,
        topBar = { SafTopBar(TxFlow.title.ifBlank { "Confirm Payment" }, onBack) },
    ) { padding ->
        Column(
            Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(Modifier.height(24.dp))
            Text(
                "Enter your M-PESA PIN",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
            )
            Spacer(Modifier.height(8.dp))
            val summary = buildString {
                if (TxFlow.amount.isNotBlank()) append("Ksh ${TxFlow.amount}")
                if (TxFlow.recipient.isNotBlank()) append(" to ${TxFlow.recipient}")
            }
            if (summary.isNotBlank()) {
                Text(
                    summary,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    textAlign = TextAlign.Center,
                )
            }
            Spacer(Modifier.height(32.dp))
            PinDots(length = 4, filled = pin.length)
            Spacer(Modifier.weight(1f))
            NumericKeypad(
                onDigit = { d -> if (pin.length < 4) pin += d },
                onDelete = { if (pin.isNotEmpty()) pin = pin.dropLast(1) },
                modifier = Modifier.fillMaxWidth(),
            )
            Spacer(Modifier.height(8.dp))
            Text(
                "Frontend preview — any 4 digits work.",
                style = MaterialTheme.typography.labelSmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
            )
        }
    }
}

