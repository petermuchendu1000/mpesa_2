package com.safarlcom.mbesa.frontend.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
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
import com.safarlcom.mbesa.frontend.data.SfcCatalog
import com.safarlcom.mbesa.frontend.ui.Routes
import com.safarlcom.mbesa.frontend.ui.theme.BrandGreen
import com.safarlcom.mbesa.frontend.ui.theme.BrandGreenDark
import com.safarlcom.mbesa.frontend.ui.theme.TextSecondary

@Composable
fun LifeTab(
    modifier: Modifier = Modifier,
    onOpenRoute: (String) -> Unit,
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(Color(0xFFF5F6F8))
            .verticalScroll(rememberScrollState())
    ) {
        Column(
            Modifier
                .fillMaxWidth()
                .background(BrandGreen)
                .padding(16.dp)
        ) {
            Text("Life", color = Color.White, fontSize = 22.sp, fontWeight = FontWeight.Bold)
            Text(
                "Explore services, offers and lifestyle",
                color = Color.White.copy(alpha = 0.9f),
                fontSize = 13.sp,
            )
        }
        Column(Modifier.padding(16.dp)) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(16.dp))
                    .background(Color.White)
            ) {
                SfcCatalog.lifeServices.forEachIndexed { index, (id, title, subtitle) ->
                    val action = SfcCatalog.actions.getValue(id)
                    ServiceRow(
                        iconRes = action.iconRes,
                        title = title,
                        subtitle = subtitle,
                        onClick = { onOpenRoute(Routes.forAction(action)) },
                    )
                    if (index < SfcCatalog.lifeServices.lastIndex) {
                        Spacer(
                            Modifier
                                .padding(start = 68.dp)
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

@Composable
private fun ServiceRow(iconRes: Int, title: String, subtitle: String, onClick: () -> Unit) {
    Row(
        Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            Modifier
                .size(44.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(Color(0xFFEAF6EE)),
            contentAlignment = Alignment.Center,
        ) {
            Image(painterResource(iconRes), title, modifier = Modifier.size(26.dp))
        }
        Spacer(Modifier.size(14.dp))
        Column(Modifier.weight(1f)) {
            Text(title, fontWeight = FontWeight.SemiBold)
            Text(subtitle, style = MaterialTheme.typography.bodySmall, color = TextSecondary)
        }
        Icon(
            Icons.AutoMirrored.Filled.KeyboardArrowRight,
            contentDescription = null,
            tint = BrandGreenDark,
        )
    }
}


