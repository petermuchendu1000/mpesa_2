package com.safaricom.mpesa.frontend.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safaricom.mpesa.frontend.data.FakeData
import com.safaricom.mpesa.frontend.ui.components.SafTopBar
import com.safaricom.mpesa.frontend.ui.theme.TextSecondary

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HistoryScreen(onBack: () -> Unit) {
    Scaffold(
        containerColor = Color(0xFFF5F6F8),
        topBar = { SafTopBar("M-PESA Statement", onBack) },
    ) { padding ->
        Column(
            Modifier
                .fillMaxSize()
                .padding(padding)
                .verticalScroll(rememberScrollState())
                .padding(16.dp)
        ) {
            Text("Recent activity", fontSize = 15.sp, fontWeight = FontWeight.Bold)
            Text("Balance: ${FakeData.BALANCE}", color = TextSecondary, fontSize = 13.sp)
            Spacer(Modifier.height(12.dp))
            Column(
                Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(16.dp))
                    .background(Color.White)
            ) {
                FakeData.transactions.forEachIndexed { i, tx ->
                    TransactionRow(tx)
                    if (i < FakeData.transactions.lastIndex) {
                        Spacer(
                            Modifier
                                .padding(start = 62.dp)
                                .fillMaxWidth()
                                .height(1.dp)
                                .background(Color(0xFFEDEEF1))
                        )
                    }
                }
            }
            Spacer(Modifier.height(24.dp))
        }
    }
}

