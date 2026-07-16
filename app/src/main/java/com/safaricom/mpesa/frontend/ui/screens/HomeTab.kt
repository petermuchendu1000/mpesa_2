package com.safaricom.mpesa.frontend.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandHorizontally
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkHorizontally
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safaricom.mpesa.frontend.R
import com.safaricom.mpesa.frontend.data.AdBanner
import com.safaricom.mpesa.frontend.data.AppState
import com.safaricom.mpesa.frontend.data.DoMoreCategory
import com.safaricom.mpesa.frontend.data.EntertainmentItem
import com.safaricom.mpesa.frontend.data.FinanceItem
import com.safaricom.mpesa.frontend.data.HomeContent
import com.safaricom.mpesa.frontend.data.QuickAction
import com.safaricom.mpesa.frontend.data.SfcCatalog
import com.safaricom.mpesa.frontend.ui.Routes
import java.util.Calendar

private val ScreenBg = Color(0xFFF2F3F5)
private val SafGreen = Color(0xFF35A839)
private val TextDark = Color(0xFF1A1A1A)
private val TextGrey = Color(0xFF7B7F87)
private val ChipGrey = Color(0xFFF3F4F6)

@Composable
fun HomeTab(
    modifier: Modifier = Modifier,
    onOpenRoute: (String) -> Unit,
    onOpenProfile: () -> Unit = {},
) {
    val listState = rememberLazyListState()
    // Scan-to-pay collapses to just the QR icon once the feed is scrolled.
    val scanCollapsed by remember {
        derivedStateOf { listState.firstVisibleItemIndex > 0 || listState.firstVisibleItemScrollOffset > 24 }
    }

    Box(modifier.fillMaxSize().background(ScreenBg)) {
        Column(Modifier.fillMaxSize()) {
            HomeTopBar(
                onBell = { onOpenRoute(Routes.NOTIFICATIONS) },
                onSearch = { onOpenRoute(Routes.ALL_SERVICES) },
                onProfile = onOpenProfile,
            )
            LazyColumn(
                state = listState,
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(bottom = 28.dp),
            ) {
                item { Spacer(Modifier.height(12.dp)); BalanceCarousel(onOpenRoute) }
                item { Spacer(Modifier.height(14.dp)); QuickActionsSection(onOpenRoute) }
                item { Spacer(Modifier.height(14.dp)); FrequentsSection(onOpenRoute) }
                item { Spacer(Modifier.height(16.dp)); ExploreDiscoverSection() }
                item { Spacer(Modifier.height(16.dp)); MyFinancesSection() }
                item { Spacer(Modifier.height(14.dp)); EntertainmentSection() }
                item { Spacer(Modifier.height(16.dp)); DoMoreSection() }
            }
        }

        // Floating "Ask Zuri" assistant — the transparent-cut avatar on a white bubble.
        Box(
            Modifier
                .align(Alignment.BottomEnd)
                .padding(end = 16.dp, bottom = 84.dp)
                .size(58.dp)
                .shadow(6.dp, CircleShape)
                .clip(CircleShape)
                .background(Color.White)
                .clickable { onOpenRoute(Routes.ALL_SERVICES) }
                .padding(5.dp),
            contentAlignment = Alignment.Center,
        ) {
            Image(
                painterResource(R.drawable.ic_ask_zuri),
                contentDescription = "Ask Zuri",
                contentScale = ContentScale.Fit,
                modifier = Modifier.fillMaxSize(),
            )
        }

        // Floating Scan-to-pay — a pill that collapses to the QR icon on scroll.
        ScanToPayFab(
            collapsed = scanCollapsed,
            onClick = { onOpenRoute(Routes.SCAN) },
            modifier = Modifier.align(Alignment.BottomEnd).padding(end = 16.dp, bottom = 20.dp),
        )
    }
}

/* ------------------------------------------------------------------ Top bar */

@Composable
private fun HomeTopBar(onBell: () -> Unit, onSearch: () -> Unit, onProfile: () -> Unit) {
    val greeting = remember {
        when (Calendar.getInstance().get(Calendar.HOUR_OF_DAY)) {
            in 0..11 -> "Good morning,"
            in 12..16 -> "Good afternoon,"
            else -> "Good evening,"
        }
    }
    Row(
        Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(start = 16.dp, end = 16.dp, top = 14.dp, bottom = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        // Avatar with account-switcher chevron badge (pale-blue initials chip, per original).
        Box(
            contentAlignment = Alignment.BottomEnd,
            modifier = Modifier.clickable(onClick = onProfile),
        ) {
            Box(
                Modifier.size(44.dp).clip(CircleShape).background(Color(0xFFDCE8FB)),
                contentAlignment = Alignment.Center,
            ) {
                Text(HomeContent.USER_INITIALS, color = Color(0xFF2E6CD4), fontWeight = FontWeight.SemiBold, fontSize = 15.sp)
            }
            Box(
                Modifier
                    .offset(x = 2.dp, y = 2.dp)
                    .size(16.dp)
                    .clip(CircleShape)
                    .background(Color.White)
                    .border(1.dp, SafGreen, CircleShape),
                contentAlignment = Alignment.Center,
            ) { Icon(Icons.Filled.KeyboardArrowDown, null, tint = SafGreen, modifier = Modifier.size(12.dp)) }
        }
        Spacer(Modifier.width(10.dp))
        Column(Modifier.weight(1f)) {
            Text(greeting, color = TextGrey, fontSize = 13.sp)
            Text("${HomeContent.USER_NAME} \uD83D\uDC4B", color = TextDark, fontWeight = FontWeight.SemiBold, fontSize = 18.sp)
        }
        CircleIconButton(onClick = onBell) {
            Image(
                painterResource(R.drawable.ic_notifications), "Notifications",
                modifier = Modifier.size(22.dp),
            )
        }
        Spacer(Modifier.width(12.dp))
        CircleIconButton(onClick = onSearch) {
            Image(painterResource(R.drawable.ic_one_app_search), "Search", modifier = Modifier.size(20.dp))
        }
    }
}

@Composable
private fun CircleIconButton(onClick: () -> Unit, content: @Composable () -> Unit) {
    Surface(shape = CircleShape, color = Color.White, shadowElevation = 2.dp) {
        Box(
            Modifier.size(40.dp).clip(CircleShape).clickable(onClick = onClick),
            contentAlignment = Alignment.Center,
        ) { content() }
    }
}

/* ------------------------------------------------------------------ Balance carousel */

@Composable
private fun BalanceCarousel(onOpenRoute: (String) -> Unit) {
    val pager = rememberPagerState(pageCount = { 2 })
    Column {
        HorizontalPager(
            state = pager,
            contentPadding = PaddingValues(start = 16.dp, end = 40.dp),
            pageSpacing = 12.dp,
        ) { page ->
            if (page == 0) MpesaBalanceCard(onOpenRoute) else MyBalancesCard()
        }
        Spacer(Modifier.height(10.dp))
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            repeat(2) { i ->
                val active = pager.currentPage == i
                Box(
                    Modifier
                        .padding(horizontal = 3.dp)
                        .height(6.dp)
                        .width(if (active) 18.dp else 6.dp)
                        .clip(CircleShape)
                        .background(if (active) SafGreen else Color(0xFFCFD3DA)),
                )
            }
        }
    }
}

@Composable
private fun MpesaBalanceCard(onOpenRoute: (String) -> Unit) {
    var hidden by remember { mutableStateOf(false) }
    Box(
        Modifier
            .fillMaxWidth()
            .height(168.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(Color.White),
    ) {
        // Faint geometric watermark from the original card background.
        Image(
            painterResource(R.mipmap.bg_pesa_balance),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize(),
            alpha = 0.5f,
        )
        // Left green→blue accent bar.
        Box(
            Modifier
                .fillMaxHeight()
                .width(5.dp)
                .background(Brush.verticalGradient(listOf(SafGreen, Color(0xFF1E9BE0)))),
        )
        Column(Modifier.fillMaxSize().padding(start = 18.dp, end = 16.dp, top = 16.dp, bottom = 16.dp)) {
            Text("M-PESA Balance", color = SafGreen, fontSize = 14.sp, fontWeight = FontWeight.Medium)
            Spacer(Modifier.height(6.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                if (hidden) {
                    Text("Ksh ••••••", color = TextDark, fontSize = 24.sp, fontWeight = FontWeight.SemiBold)
                } else {
                    Text(
                        "Ksh ${AppState.balanceStr}",
                        color = TextDark,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.SemiBold,
                    )
                }
                Spacer(Modifier.width(8.dp))
                Image(
                    painterResource(R.drawable.icon_hide_balance),
                    "Hide balance",
                    modifier = Modifier.size(20.dp).clickable { hidden = !hidden },
                )
            }
            Spacer(Modifier.height(4.dp))
            Text(
                "Available Fuliza: Ksh ${AppState.fulizaAvailableStr}",
                color = TextGrey,
                fontSize = 13.sp,
                fontWeight = FontWeight.Normal,
            )
            Spacer(Modifier.weight(1f))
            OutlinedPill("View Statements") { onOpenRoute(Routes.HISTORY) }
        }
    }
}

@Composable
private fun MyBalancesCard() {
    Box(
        Modifier
            .fillMaxWidth()
            .height(172.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(Color.White),
    ) {
        Box(
            Modifier
                .fillMaxHeight()
                .width(5.dp)
                .background(Brush.verticalGradient(listOf(Color(0xFF1E9BE0), SafGreen))),
        )
        Column(Modifier.fillMaxSize().padding(start = 18.dp, end = 16.dp, top = 16.dp, bottom = 16.dp)) {
            Text("My Balances", color = SafGreen, fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
            Spacer(Modifier.height(8.dp))
            Text("Airtime", color = TextGrey, fontSize = 12.sp)
            Text("Ksh. ${AppState.airtimeStr}", color = TextDark, fontSize = 22.sp, fontWeight = FontWeight.SemiBold)
            Spacer(Modifier.weight(1f))
            OutlinedPill("Buy Airtime") { }
        }
    }
}

@Composable
private fun OutlinedPill(text: String, onClick: () -> Unit) {
    Box(
        Modifier
            .fillMaxWidth()
            .height(44.dp)
            .clip(RoundedCornerShape(10.dp))
            .border(1.5.dp, SafGreen, RoundedCornerShape(10.dp))
            .clickable(onClick = onClick),
        contentAlignment = Alignment.Center,
    ) { Text(text, color = SafGreen, fontWeight = FontWeight.SemiBold, fontSize = 15.sp) }
}

/* ------------------------------------------------------------------ Section shell */

@Composable
private fun WhiteCard(content: @Composable () -> Unit) {
    Column(
        Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(Color.White)
            .padding(16.dp),
    ) { content() }
}

@Composable
private fun SectionTitleRow(title: String, action: String? = null, onAction: () -> Unit = {}) {
    Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        Text(title, fontSize = 17.sp, fontWeight = FontWeight.SemiBold, color = TextDark, modifier = Modifier.weight(1f))
        if (action != null) {
            Row(Modifier.clickable(onClick = onAction), verticalAlignment = Alignment.CenterVertically) {
                Text(action, color = SafGreen, fontSize = 14.sp, fontWeight = FontWeight.Medium)
                Icon(Icons.AutoMirrored.Filled.KeyboardArrowRight, null, tint = SafGreen, modifier = Modifier.size(18.dp))
            }
        }
    }
}

/* ------------------------------------------------------------------ Quick Actions */

@Composable
private fun QuickActionsSection(onOpenRoute: (String) -> Unit) {
    WhiteCard {
        SectionTitleRow("Quick Actions", action = "View all") { onOpenRoute(Routes.ALL_SERVICES) }
        Spacer(Modifier.height(14.dp))
        HomeContent.quickActions.chunked(4).forEach { row ->
            Row(Modifier.fillMaxWidth()) {
                row.forEach { qa ->
                    QuickActionTile(qa, Modifier.weight(1f)) {
                        SfcCatalog.actions[qa.actionId]?.let { onOpenRoute(Routes.forAction(it)) }
                    }
                }
                repeat(4 - row.size) { Spacer(Modifier.weight(1f)) }
            }
            Spacer(Modifier.height(14.dp))
        }
    }
}

@Composable
private fun QuickActionTile(qa: QuickAction, modifier: Modifier, onClick: () -> Unit) {
    Column(modifier.clickable(onClick = onClick), horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            Modifier.size(52.dp).clip(CircleShape).background(ChipGrey),
            contentAlignment = Alignment.Center,
        ) { Image(painterResource(qa.iconRes), qa.label, modifier = Modifier.size(28.dp)) }
        Spacer(Modifier.height(6.dp))
        Text(
            qa.label, fontSize = 11.sp, color = TextDark, textAlign = TextAlign.Center,
            fontWeight = FontWeight.Medium, lineHeight = 13.sp, minLines = 2, maxLines = 2,
        )
    }
}

/* ------------------------------------------------------------------ Frequents */

@Composable
private fun FrequentsSection(onOpenRoute: (String) -> Unit) {
    var expanded by remember { mutableStateOf(true) }
    var tab by remember { mutableIntStateOf(0) }
    // Each tab shows its own empty-state glyph, exactly like the original app.
    val tabGlyphs = listOf(
        R.drawable.ic_frequents_empty_state_mini_apps, // Apps
        R.drawable.ic_frequents_empty_state_send,      // Send
        R.drawable.ic_frequents_empty_state_pay,       // Pay
        R.drawable.ic_frequents_empty_state_withdraw,  // Buy
    )
    WhiteCard {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("Frequents", fontSize = 17.sp, fontWeight = FontWeight.SemiBold, color = TextDark, modifier = Modifier.weight(1f))
            Icon(
                if (expanded) Icons.Filled.KeyboardArrowUp else Icons.Filled.KeyboardArrowDown,
                "Toggle", tint = TextGrey,
                modifier = Modifier.size(24.dp).clickable { expanded = !expanded },
            )
        }
        if (expanded) {
            Spacer(Modifier.height(14.dp))
            // Segmented tab strip: light-grey rounded container with a green active pill.
            Box(
                Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(24.dp))
                    .background(ChipGrey)
                    .padding(4.dp),
            ) {
                Row(Modifier.horizontalScroll(rememberScrollState())) {
                    HomeContent.frequentTabs.forEachIndexed { i, t ->
                        val active = i == tab
                        Box(
                            Modifier
                                .clip(RoundedCornerShape(20.dp))
                                .background(if (active) SafGreen else Color.Transparent)
                                .clickable { tab = i }
                                .padding(horizontal = 24.dp, vertical = 8.dp),
                        ) {
                            Text(
                                t, color = if (active) Color.White else TextGrey,
                                fontWeight = if (active) FontWeight.SemiBold else FontWeight.Normal, fontSize = 14.sp,
                            )
                        }
                    }
                }
            }
            Spacer(Modifier.height(22.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                FreshIllustration(tabGlyphs[tab])
                Spacer(Modifier.width(16.dp))
                Text(
                    "It looks like you're starting fresh here. See the services we offer",
                    color = TextGrey, fontSize = 14.sp, lineHeight = 20.sp, modifier = Modifier.weight(1f),
                )
            }
            Spacer(Modifier.height(16.dp))
            Row(
                Modifier.fillMaxWidth().clickable { onOpenRoute(Routes.ALL_SERVICES) },
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text("Explore Apps", color = SafGreen, fontWeight = FontWeight.SemiBold, fontSize = 14.sp)
                Icon(Icons.AutoMirrored.Filled.KeyboardArrowRight, null, tint = SafGreen, modifier = Modifier.size(18.dp))
            }
        }
    }
}

@Composable
private fun FreshIllustration(glyphRes: Int) {
    // Original composition: pale-green "cloud" (ic_frequents_empty_state) with the
    // per-tab glyph overlaid slightly left of centre.
    Box(Modifier.size(width = 118.dp, height = 56.dp), contentAlignment = Alignment.Center) {
        Image(
            painterResource(R.drawable.ic_frequents_empty_state),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier.fillMaxWidth().height(50.dp),
        )
        Image(
            painterResource(glyphRes),
            contentDescription = null,
            modifier = Modifier.size(34.dp).offset(x = (-8).dp),
        )
    }
}

/* ------------------------------------------------------------------ Explore & Discover (ads) */

@Composable
private fun ExploreDiscoverSection() {
    val ads = HomeContent.ads
    val pager = rememberPagerState(pageCount = { ads.size })
    // Auto-advance left→right every 3s.
    LaunchedEffect(pager) {
        while (true) {
            kotlinx.coroutines.delay(3000)
            val next = (pager.currentPage + 1) % ads.size
            pager.animateScrollToPage(next)
        }
    }
    Column {
        Text(
            "Explore & Discover Deals \uD83D\uDD25",
            fontSize = 17.sp, fontWeight = FontWeight.SemiBold, color = TextDark,
            modifier = Modifier.padding(horizontal = 16.dp),
        )
        Spacer(Modifier.height(12.dp))
        HorizontalPager(
            state = pager,
            contentPadding = PaddingValues(horizontal = 16.dp),
            pageSpacing = 12.dp,
        ) { page -> AdBannerCard(ads[page]) }
        Spacer(Modifier.height(10.dp))
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            repeat(ads.size) { i ->
                val active = pager.currentPage == i
                Box(
                    Modifier
                        .padding(horizontal = 3.dp)
                        .height(6.dp)
                        .width(if (active) 16.dp else 6.dp)
                        .clip(CircleShape)
                        .background(if (active) SafGreen else Color(0xFFCFD3DA)),
                )
            }
        }
    }
}

@Composable
private fun AdBannerCard(ad: AdBanner) {
    Box(
        Modifier
            .fillMaxWidth()
            .height(120.dp)
            .clip(RoundedCornerShape(14.dp))
            .background(Color(ad.bg))
            .padding(18.dp),
    ) {
        Column(Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Center) {
            Text(ad.title, color = Color(ad.textColor), fontSize = 20.sp, fontWeight = FontWeight.Black, lineHeight = 24.sp)
            Spacer(Modifier.height(6.dp))
            Text(ad.subtitle, color = Color(ad.textColor).copy(alpha = 0.85f), fontSize = 12.sp)
        }
        Box(
            Modifier
                .align(Alignment.CenterEnd)
                .size(56.dp)
                .clip(CircleShape)
                .background(Color(ad.accent).copy(alpha = 0.25f)),
        )
    }
}

/* ------------------------------------------------------------------ My Finances */

@Composable
private fun MyFinancesSection() {
    WhiteCard {
        SectionTitleRow("My Finances", action = "View all") { }
        Spacer(Modifier.height(16.dp))
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            HomeContent.finances.forEach { FinanceCell(it, Modifier.weight(1f)) }
        }
    }
}

@Composable
private fun FinanceCell(item: FinanceItem, modifier: Modifier) {
    Column(modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            Modifier.size(52.dp).clip(if (item.circle) CircleShape else RoundedCornerShape(10.dp))
                .background(if (item.circle) Color(0xFF1E9E4A) else ChipGrey),
            contentAlignment = Alignment.Center,
        ) {
            Text(
                item.logo, color = Color(item.logoColor), fontWeight = FontWeight.Bold,
                fontSize = if (item.circle) 8.sp else 11.sp, textAlign = TextAlign.Center, lineHeight = 10.sp,
            )
        }
        Spacer(Modifier.height(8.dp))
        Text(item.label, fontSize = 12.sp, color = TextDark, textAlign = TextAlign.Center, lineHeight = 15.sp, minLines = 2)
    }
}

/* ------------------------------------------------------------------ Entertainment */

@Composable
private fun EntertainmentSection() {
    WhiteCard {
        Text("Entertainment", fontSize = 17.sp, fontWeight = FontWeight.SemiBold, color = TextDark)
        Spacer(Modifier.height(16.dp))
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(24.dp)) {
            HomeContent.entertainment.forEach { EntertainmentCell(it) }
        }
    }
}

@Composable
private fun EntertainmentCell(item: EntertainmentItem) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            Modifier.size(64.dp).clip(RoundedCornerShape(16.dp)).background(Color(item.bg)),
            contentAlignment = Alignment.Center,
        ) { Text(item.emoji, fontSize = 28.sp) }
        Spacer(Modifier.height(8.dp))
        Text(item.label, fontSize = 13.sp, color = TextDark)
    }
}

/* ------------------------------------------------------------------ Do more with M-PESA */

@Composable
private fun DoMoreSection() {
    val rows = remember {
        val out = mutableListOf<List<DoMoreCategory>>()
        var idx = 0
        for (n in HomeContent.doMoreRowPattern) {
            if (idx >= HomeContent.doMore.size) break
            val end = (idx + n).coerceAtMost(HomeContent.doMore.size)
            out.add(HomeContent.doMore.subList(idx, end))
            idx = end
        }
        out
    }
    Column(Modifier.padding(horizontal = 16.dp)) {
        Text("Do more with M-PESA", fontSize = 17.sp, fontWeight = FontWeight.SemiBold, color = TextDark)
        Spacer(Modifier.height(12.dp))
        rows.forEach { row ->
            val tall = row.size == 2
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                row.forEach { cat -> DoMoreTile(cat, tall, Modifier.weight(1f)) }
                repeat((if (tall) 2 else 3) - row.size) { Spacer(Modifier.weight(1f)) }
            }
            Spacer(Modifier.height(10.dp))
        }
    }
}

@Composable
private fun DoMoreTile(cat: DoMoreCategory, tall: Boolean, modifier: Modifier) {
    Box(
        modifier
            .height(if (tall) 118.dp else 104.dp)
            .clip(RoundedCornerShape(14.dp))
            .background(Color(cat.bg))
            .clickable { }
            .padding(12.dp),
    ) {
        Text(
            cat.label, color = TextDark, fontSize = 14.sp, fontWeight = FontWeight.SemiBold,
            lineHeight = 18.sp, modifier = Modifier.align(Alignment.TopStart),
        )
        if (cat.iconRes != null) {
            // Real bundled 3D illustration (ic_travel, ic_gift, icon_business, …).
            Image(
                painterResource(cat.iconRes), cat.label,
                modifier = Modifier.align(Alignment.BottomEnd).size(if (tall) 52.dp else 44.dp),
            )
        } else {
            Text(cat.emoji, fontSize = if (tall) 34.sp else 28.sp, modifier = Modifier.align(Alignment.BottomEnd))
        }
    }
}

/* ------------------------------------------------------------------ Scan-to-pay FAB */

@Composable
private fun ScanToPayFab(collapsed: Boolean, onClick: () -> Unit, modifier: Modifier = Modifier) {
    Surface(modifier = modifier, shape = RoundedCornerShape(28.dp), color = Color.White, shadowElevation = 6.dp) {
        Row(
            Modifier.clickable(onClick = onClick).padding(horizontal = 14.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(painterResource(R.drawable.ic_scan_to_pay), "Scan to pay", modifier = Modifier.size(28.dp))
            AnimatedVisibility(
                visible = !collapsed,
                enter = expandHorizontally(tween(200)) + fadeIn(tween(200)),
                exit = shrinkHorizontally(tween(200)) + fadeOut(tween(200)),
            ) {
                Text("  Scan to pay", color = TextDark, fontSize = 15.sp, fontWeight = FontWeight.SemiBold)
            }
        }
    }
}

