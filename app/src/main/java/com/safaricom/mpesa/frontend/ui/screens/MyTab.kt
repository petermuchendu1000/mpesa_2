package com.safaricom.mpesa.frontend.ui.screens

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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.automirrored.filled.Logout
import androidx.compose.material3.Icon
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safaricom.mpesa.frontend.data.FakeData
import com.safaricom.mpesa.frontend.data.MenuItem
import com.safaricom.mpesa.frontend.data.SfcCatalog
import com.safaricom.mpesa.frontend.ui.Routes
import com.safaricom.mpesa.frontend.ui.theme.BrandGreen
import com.safaricom.mpesa.frontend.ui.theme.BrandGreenDark
import com.safaricom.mpesa.frontend.ui.theme.Danger
import com.safaricom.mpesa.frontend.ui.theme.TextSecondary

@Composable
fun MyTab(
    modifier: Modifier = Modifier,
    onOpenRoute: (String) -> Unit,
    onLogout: () -> Unit,
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(Color(0xFFF5F6F8))
            .verticalScroll(rememberScrollState())
    ) {
        ProfileHeader(onClick = { onOpenRoute(Routes.info("My Account")) })

        Column(Modifier.padding(16.dp)) {
            SfcCatalog.myMenu.forEach { group ->
                Text(
                    group.header,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = TextSecondary,
                    modifier = Modifier.padding(start = 4.dp, bottom = 8.dp, top = 4.dp),
                )
                Column(
                    Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color.White)
                ) {
                    group.items.forEachIndexed { index, item ->
                        MenuRow(item) { onOpenRoute(Routes.info(item.title)) }
                        if (index < group.items.lastIndex) {
                            Spacer(
                                Modifier
                                    .padding(start = 64.dp)
                                    .fillMaxWidth()
                                    .height(1.dp)
                                    .background(Color(0xFFEDEEF1))
                            )
                        }
                    }
                }
                Spacer(Modifier.height(20.dp))
            }

            OutlinedButton(
                onClick = onLogout,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
            ) {
                Icon(Icons.AutoMirrored.Filled.Logout, contentDescription = null, tint = Danger)
                Spacer(Modifier.size(8.dp))
                Text("Log out", color = Danger, fontWeight = FontWeight.SemiBold)
            }
            Spacer(Modifier.height(12.dp))
            Text(
                "My OneApp · v5.1.9-frontend",
                style = MaterialTheme.typography.labelSmall,
                color = TextSecondary,
                modifier = Modifier.fillMaxWidth(),
            )
            Spacer(Modifier.height(16.dp))
        }
    }
}

@Composable
private fun ProfileHeader(onClick: () -> Unit) {
    Row(
        Modifier
            .fillMaxWidth()
            .background(BrandGreen)
            .clickable(onClick = onClick)
            .padding(20.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            Modifier
                .size(58.dp)
                .clip(CircleShape)
                .background(Color.White.copy(alpha = 0.2f)),
            contentAlignment = Alignment.Center,
        ) {
            Text(FakeData.USER_NAME.first().toString(), color = Color.White, fontSize = 26.sp, fontWeight = FontWeight.Bold)
        }
        Spacer(Modifier.size(14.dp))
        Column(Modifier.weight(1f)) {
            Text(FakeData.USER_NAME, color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Text(FakeData.PHONE, color = Color.White.copy(alpha = 0.9f), fontSize = 13.sp)
        }
        Icon(Icons.AutoMirrored.Filled.KeyboardArrowRight, null, tint = Color.White)
    }
}

@Composable
private fun MenuRow(item: MenuItem, onClick: () -> Unit) {
    Row(
        Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(horizontal = 16.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            Modifier
                .size(36.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(Color(0xFFEAF6EE)),
            contentAlignment = Alignment.Center,
        ) {
            Image(painterResource(item.iconRes), item.title, modifier = Modifier.size(22.dp))
        }
        Spacer(Modifier.size(14.dp))
        Text(item.title, modifier = Modifier.weight(1f))
        Icon(
            Icons.AutoMirrored.Filled.KeyboardArrowRight,
            contentDescription = null,
            tint = BrandGreenDark,
        )
    }
}




