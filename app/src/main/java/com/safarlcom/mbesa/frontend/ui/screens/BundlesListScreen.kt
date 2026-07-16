package com.safarlcom.mbesa.frontend.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safarlcom.mbesa.frontend.data.BundlePlan
import com.safarlcom.mbesa.frontend.data.FakeData
import com.safarlcom.mbesa.frontend.data.SfcCatalog
import com.safarlcom.mbesa.frontend.ui.TxFlow
import com.safarlcom.mbesa.frontend.ui.components.SafTopBar
import com.safarlcom.mbesa.frontend.ui.theme.BrandGreen
import com.safarlcom.mbesa.frontend.ui.theme.TextSecondary

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BundlesListScreen(
    actionId: String,
    onBack: () -> Unit,
    onBuy: () -> Unit,
) {
    val title = SfcCatalog.actions[actionId]?.title ?: "Choose a plan"
    Scaffold(
        containerColor = Color(0xFFF5F6F8),
        topBar = { SafTopBar(title, onBack) },
    ) { padding ->
        Column(
            Modifier
                .fillMaxSize()
                .padding(padding)
                .verticalScroll(rememberScrollState())
                .padding(16.dp)
        ) {
            Text("Choose a plan", fontSize = 15.sp, fontWeight = FontWeight.Bold)
            Spacer(Modifier.height(12.dp))
            FakeData.bundlePlans.forEach { plan ->
                PlanCard(plan) {
                    TxFlow.recipient = ""
                    TxFlow.amount = plan.price.filter { it.isDigit() }
                    TxFlow.reference = FakeData.newReference()
                    onBuy()
                }
                Spacer(Modifier.height(12.dp))
            }
        }
    }
}

@Composable
private fun PlanCard(plan: BundlePlan, onClick: () -> Unit) {
    Row(
        Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(14.dp))
            .background(Color.White)
            .clickable(onClick = onClick)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Column(Modifier.weight(1f)) {
            Text(plan.name, fontWeight = FontWeight.Bold, fontSize = 16.sp)
            Text("Valid for ${plan.validity}", color = TextSecondary, fontSize = 13.sp)
        }
        Text(plan.price, color = BrandGreen, fontWeight = FontWeight.Bold, fontSize = 16.sp)
    }
}

