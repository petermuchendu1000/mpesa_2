package com.safarlcom.mbesa.frontend.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safarlcom.mbesa.frontend.R
import com.safarlcom.mbesa.frontend.data.FakeData
import com.safarlcom.mbesa.frontend.ui.components.SafTopBar
import com.safarlcom.mbesa.frontend.ui.theme.TextSecondary

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HistoryScreen(onBack: () -> Unit, onExport: () -> Unit = {}) {
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
            // The way to a REAL statement. Everything below this on the screen is the bundled
            // offline sample (FakeData); the export produces the marketer's actual wallet history
            // from the server, which is the only thing on this screen anyone can be accountable for.
            Row(
                Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .background(Color.White)
                    .clickable(onClick = onExport)
                    .padding(horizontal = 14.dp, vertical = 14.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    painterResource(R.drawable.icon_sfc_download_receipt),
                    contentDescription = null,
                    modifier = Modifier.size(22.dp),
                )
                Spacer(Modifier.width(12.dp))
                Column(Modifier.weight(1f)) {
                    Text("Export Statements", fontSize = 15.sp, fontWeight = FontWeight.SemiBold)
                    Text(
                        "Your wallet history for any period, from the server",
                        color = TextSecondary, fontSize = 12.sp,
                    )
                }
                Text("›", color = TextSecondary, fontSize = 22.sp)
            }
            Spacer(Modifier.height(20.dp))

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

