package com.safarlcom.mbesa.frontend.ui.screens

import androidx.compose.runtime.Composable
import com.safarlcom.mbesa.frontend.ui.Routes

/**
 * Home shell.
 *
 * The provided build has **no Home / Life / My bottom-navigation bar** — the home is a single
 * scrolling screen (SFCChildHomeFragment hosting the function / frequents / recommended /
 * entertainment / my-finances sections). Account / "My" details are reached by tapping the
 * profile avatar in the home top bar, which pushes the [Routes.MY] screen.
 */
@Composable
fun HomeShell(onOpenRoute: (String) -> Unit) {
    HomeTab(
        onOpenRoute = onOpenRoute,
        onOpenProfile = { onOpenRoute(Routes.MY) },
    )
}
