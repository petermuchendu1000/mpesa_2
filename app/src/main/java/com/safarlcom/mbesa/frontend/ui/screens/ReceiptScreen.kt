package com.safarlcom.mbesa.frontend.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safarlcom.mbesa.frontend.R
import com.safarlcom.mbesa.frontend.data.AppState
import com.safarlcom.mbesa.frontend.data.FakeData
import com.safarlcom.mbesa.frontend.ui.TxFlow
import com.safarlcom.mbesa.frontend.ui.components.KeyValueRow
import com.safarlcom.mbesa.frontend.ui.theme.BrandGreen

@Composable
fun ReceiptScreen(onDone: () -> Unit) {
    val amount = TxFlow.amount.ifBlank { "0" }
    Column(
        Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F6F8))
            .verticalScroll(rememberScrollState())
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(Modifier.height(24.dp))
        Image(
            painterResource(R.drawable.history_transaction_icon_success),
            contentDescription = null,
            modifier = Modifier.size(84.dp),
        )
        Spacer(Modifier.height(16.dp))
        Text("${TxFlow.title} Successful", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Spacer(Modifier.height(4.dp))
        Text(
            "Ksh $amount" + if (TxFlow.recipient.isNotBlank()) " to ${TxFlow.recipient}" else "",
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            textAlign = TextAlign.Center,
        )
        Spacer(Modifier.height(24.dp))

        Column(
            Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(16.dp))
                .background(Color.White)
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            KeyValueRow("Amount", "Ksh $amount", emphasize = true)
            Divider()
            if (TxFlow.recipient.isNotBlank()) {
                KeyValueRow("Recipient", TxFlow.recipient); Divider()
            }
            KeyValueRow("Transaction cost", "Ksh 0.00"); Divider()
            KeyValueRow("Date", "01 Jul 2026, 14:35"); Divider()
            KeyValueRow("New M-PESA balance", FakeData.BALANCE); Divider()
            KeyValueRow("Reference", TxFlow.reference.ifBlank { FakeData.newReference() })
        }

        Spacer(Modifier.height(24.dp))
        OutlinedButton(
            onClick = onDone,
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
        ) {
            Image(
                painterResource(R.drawable.icon_sfc_download_receipt),
                contentDescription = null,
                modifier = Modifier.size(20.dp),
            )
            Spacer(Modifier.size(8.dp))
            Text("Download Receipt", color = BrandGreen, fontWeight = FontWeight.SemiBold)
        }
        Spacer(Modifier.height(12.dp))
        Button(
            onClick = onDone,
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp),
            colors = ButtonDefaults.buttonColors(containerColor = BrandGreen),
        ) {
            Text("Done", fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
        }
        Spacer(Modifier.height(16.dp))
    }
}

@Composable
private fun Divider() {
    Spacer(
        Modifier
            .fillMaxWidth()
            .height(1.dp)
            .background(Color(0xFFEDEEF1))
    )
}


