package com.safarlcom.mbesa.frontend.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safarlcom.mbesa.frontend.data.SfcCatalog
import com.safarlcom.mbesa.frontend.ui.Routes
import com.safarlcom.mbesa.frontend.ui.components.SafTopBar
import com.safarlcom.mbesa.frontend.ui.components.ServiceTile

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AllServicesScreen(
    onBack: () -> Unit,
    onOpenRoute: (String) -> Unit,
) {
    Scaffold(
        containerColor = Color(0xFFF5F6F8),
        topBar = { SafTopBar("All Services", onBack) },
    ) { padding ->
        Column(
            Modifier
                .fillMaxSize()
                .padding(padding)
                .verticalScroll(rememberScrollState())
                .padding(16.dp)
        ) {
            Text("Send & Request Money", fontSize = 15.sp, fontWeight = FontWeight.Bold)
            Spacer(Modifier.height(10.dp))
            Grid(SfcCatalog.allServices.take(8), onOpenRoute)

            Spacer(Modifier.height(20.dp))
            Text("More Services", fontSize = 15.sp, fontWeight = FontWeight.Bold)
            Spacer(Modifier.height(10.dp))
            Grid(SfcCatalog.allServices.drop(8), onOpenRoute)
            Spacer(Modifier.height(24.dp))
        }
    }
}

@Composable
private fun Grid(items: List<com.safarlcom.mbesa.frontend.data.SfcAction>, onOpenRoute: (String) -> Unit) {
    Column(
        Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(Color.White)
            .padding(vertical = 8.dp)
    ) {
        items.chunked(4).forEach { row ->
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                row.forEach { a ->
                    ServiceTile(
                        iconRes = a.iconRes,
                        label = a.title,
                        modifier = Modifier.weight(1f),
                        onClick = { onOpenRoute(Routes.forAction(a)) },
                    )
                }
                repeat(4 - row.size) { Spacer(Modifier.weight(1f)) }
            }
        }
    }
}

