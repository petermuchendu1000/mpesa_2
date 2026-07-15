package com.safaricom.mpesa.frontend.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.safaricom.mpesa.frontend.data.TxItem
import com.safaricom.mpesa.frontend.ui.theme.BrandGreen
import com.safaricom.mpesa.frontend.ui.theme.TextSecondary

/** A single transaction row (shared by History and any recent-activity list). */
@Composable
fun TransactionRow(tx: TxItem) {
    Row(
        Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(painterResource(tx.status.iconRes), null, modifier = Modifier.size(34.dp))
        Spacer(Modifier.size(12.dp))
        Column(Modifier.weight(1f)) {
            Text(tx.title, fontWeight = FontWeight.SemiBold)
            Text(tx.subtitle, style = MaterialTheme.typography.bodySmall, color = TextSecondary)
        }
        Text(
            tx.amount, fontWeight = FontWeight.SemiBold,
            color = if (tx.incoming) BrandGreen else Color(0xFF1A1A1A),
        )
    }
}

