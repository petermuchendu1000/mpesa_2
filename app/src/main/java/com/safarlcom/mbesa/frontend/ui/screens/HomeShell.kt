package com.safarlcom.mbesa.frontend.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun HomeShell(
    onOpenRoute: (String) -> Unit,
    @Suppress("UNUSED_PARAMETER") onLogout: () -> Unit,
) {
    // Bottom navigation (Home / Life / My) removed — the shell now renders the Home content only.
    Scaffold(
        containerColor = Color(0xFFF5F6F8),
    ) { innerPadding ->
        HomeTab(Modifier.padding(innerPadding), onOpenRoute)
    }
}
