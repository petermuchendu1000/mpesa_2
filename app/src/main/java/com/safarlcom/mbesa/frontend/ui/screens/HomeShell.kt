package com.safarlcom.mbesa.frontend.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.safarlcom.mbesa.frontend.R
import com.safarlcom.mbesa.frontend.ui.theme.BrandGreen

private data class TabDef(val label: String, val icon: Int, val iconHot: Int)

@Composable
fun HomeShell(
    onOpenRoute: (String) -> Unit,
    onLogout: () -> Unit,
) {
    val tabs = remember {
        listOf(
            TabDef("Home", R.mipmap.home_v3_icon_home, R.mipmap.home_v3_icon_home_hot),
            TabDef("Life", R.mipmap.home_v3_icon_life, R.mipmap.home_v3_icon_life_hot),
            TabDef("My", R.mipmap.home_v3_icon_my, R.mipmap.home_v3_icon_my_hot),
        )
    }
    var selected by remember { mutableIntStateOf(0) }

    Scaffold(
        containerColor = Color(0xFFF5F6F8),
        bottomBar = {
            NavigationBar(containerColor = Color.White) {
                tabs.forEachIndexed { index, tab ->
                    NavigationBarItem(
                        selected = selected == index,
                        onClick = { selected = index },
                        icon = {
                            Image(
                                painter = painterResource(
                                    if (selected == index) tab.iconHot else tab.icon
                                ),
                                contentDescription = tab.label,
                                modifier = Modifier.size(24.dp),
                            )
                        },
                        label = { Text(tab.label) },
                        colors = NavigationBarItemDefaults.colors(
                            selectedTextColor = BrandGreen,
                            unselectedTextColor = Color(0xFF9AA0A6),
                            indicatorColor = BrandGreen.copy(alpha = 0.10f),
                        ),
                    )
                }
            }
        },
    ) { innerPadding ->
        when (selected) {
            0 -> HomeTab(Modifier.padding(innerPadding), onOpenRoute)
            1 -> LifeTab(Modifier.padding(innerPadding), onOpenRoute)
            else -> MyTab(Modifier.padding(innerPadding), onOpenRoute, onLogout)
        }
    }
}


