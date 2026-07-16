package com.safaricom.mpesa.frontend.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.automirrored.filled.Logout
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safaricom.mpesa.frontend.R
import com.safaricom.mpesa.frontend.data.FakeData
import com.safaricom.mpesa.frontend.data.MenuItem
import com.safaricom.mpesa.frontend.data.SfcCatalog
import com.safaricom.mpesa.frontend.ui.Routes
import com.safaricom.mpesa.frontend.ui.theme.BrandGreenDark
import com.safaricom.mpesa.frontend.ui.theme.Danger
import com.safaricom.mpesa.frontend.ui.theme.TextSecondary
import java.util.Calendar

private val MyGreen = Color(0xFF35A839)
private val GreetGrey = Color(0xFF757575)
private val NameDark = Color(0xFF303030)

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
        ProfileHeader(
            onBell = { onOpenRoute(Routes.NOTIFICATIONS) },
            onSearch = { onOpenRoute(Routes.ALL_SERVICES) },
        )

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
private fun ProfileHeader(onBell: () -> Unit, onSearch: () -> Unit) {
    val greeting = remember {
        when (Calendar.getInstance().get(Calendar.HOUR_OF_DAY)) {
            in 0..11 -> "Good morning"
            in 12..16 -> "Good afternoon"
            else -> "Good evening"
        }
    }
    val initials = FakeData.USER_NAME.trim().split(" ").filter { it.isNotEmpty() }.let { p ->
        when {
            p.isEmpty() -> "?"
            p.size == 1 -> p[0].take(1).uppercase()
            else -> (p.first().first().toString() + p.last().first()).uppercase()
        }
    }
    Column(Modifier.fillMaxWidth().background(Color.White)) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, top = 14.dp, bottom = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            // Avatar (40dp) with account-switcher chevron badge.
            Box(contentAlignment = Alignment.BottomEnd) {
                Box(
                    Modifier.size(40.dp).clip(CircleShape).background(Color(0xFFDCE8FB)),
                    contentAlignment = Alignment.Center,
                ) {
                    Text(initials, color = Color(0xFF2E6CD4), fontWeight = FontWeight.SemiBold, fontSize = 14.sp)
                }
                Box(
                    Modifier
                        .offset(x = 2.dp, y = 2.dp)
                        .size(15.dp)
                        .clip(CircleShape)
                        .background(Color.White)
                        .border(1.dp, MyGreen, CircleShape),
                    contentAlignment = Alignment.Center,
                ) { Icon(Icons.Filled.KeyboardArrowDown, null, tint = MyGreen, modifier = Modifier.size(11.dp)) }
            }
            Spacer(Modifier.width(10.dp))
            Column(Modifier.weight(1f)) {
                Text(greeting, color = GreetGrey, fontSize = 14.sp)
                Text(FakeData.USER_NAME, color = NameDark, fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
            }
            HeaderCircleIcon(R.drawable.ic_notifications, "Notifications", onBell)
            Spacer(Modifier.width(12.dp))
            HeaderCircleIcon(R.drawable.ic_one_app_search, "Search", onSearch)
        }
        Spacer(Modifier.fillMaxWidth().height(1.dp).background(Color(0xFFEDEEF1)))
    }
}

@Composable
private fun HeaderCircleIcon(iconRes: Int, desc: String, onClick: () -> Unit) {
    Surface(shape = CircleShape, color = Color.White, shadowElevation = 2.dp) {
        Box(
            Modifier.size(40.dp).clip(CircleShape).clickable(onClick = onClick),
            contentAlignment = Alignment.Center,
        ) { Image(painterResource(iconRes), desc, modifier = Modifier.size(20.dp)) }
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






