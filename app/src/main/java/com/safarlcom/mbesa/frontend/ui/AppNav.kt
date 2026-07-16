package com.safarlcom.mbesa.frontend.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.safarlcom.mbesa.frontend.data.AppState
import com.safarlcom.mbesa.frontend.data.SfcCatalog
import com.safarlcom.mbesa.frontend.ui.screens.AllServicesScreen
import com.safarlcom.mbesa.frontend.ui.screens.BundlesListScreen
import com.safarlcom.mbesa.frontend.ui.screens.DetailScreen
import com.safarlcom.mbesa.frontend.ui.screens.EntryScreen
import com.safarlcom.mbesa.frontend.ui.screens.HistoryScreen
import com.safarlcom.mbesa.frontend.ui.screens.HomeShell
import com.safarlcom.mbesa.frontend.ui.screens.InfoScreen
import com.safarlcom.mbesa.frontend.ui.screens.NotificationsScreen
import com.safarlcom.mbesa.frontend.ui.screens.PinLoginScreen
import com.safarlcom.mbesa.frontend.ui.screens.PinEntryScreen
import com.safarlcom.mbesa.frontend.ui.screens.ReceiptScreen
import com.safarlcom.mbesa.frontend.ui.screens.ScanScreen
import com.safarlcom.mbesa.frontend.ui.screens.SplashScreen

@Composable
fun AppNavHost() {
    val nav = rememberNavController()

    // When the app is backgrounded, AppState.authenticated is cleared. As soon as we're
    // back and composing, bounce any protected screen to the lock (PIN login) screen.
    LaunchedEffect(AppState.authenticated) {
        if (!AppState.authenticated) {
            val route = nav.currentBackStackEntry?.destination?.route
            if (route != null && route != Routes.LOGIN && route != Routes.SPLASH) {
                nav.navigate(Routes.LOGIN) { popUpTo(0) { inclusive = true } }
            }
        }
    }

    NavHost(navController = nav, startDestination = Routes.SPLASH) {
        composable(Routes.SPLASH) {
            SplashScreen(onDone = {
                nav.navigate(Routes.LOGIN) { popUpTo(Routes.SPLASH) { inclusive = true } }
            })
        }
        composable(Routes.LOGIN) {
            PinLoginScreen(onAuthenticated = {
                nav.navigate(Routes.HOME) { popUpTo(Routes.LOGIN) { inclusive = true } }
            })
        }
        composable(Routes.HOME) {
            HomeShell(
                onOpenRoute = { route -> nav.navigate(route) },
                onLogout = {
                    AppState.lock()
                    nav.navigate(Routes.LOGIN) { popUpTo(Routes.HOME) { inclusive = true } }
                },
            )
        }
        composable(Routes.ALL_SERVICES) {
            AllServicesScreen(
                onBack = { nav.popBackStack() },
                onOpenRoute = { route -> nav.navigate(route) },
            )
        }
        composable(Routes.HISTORY) { HistoryScreen(onBack = { nav.popBackStack() }) }
        composable(Routes.NOTIFICATIONS) { NotificationsScreen(onBack = { nav.popBackStack() }) }
        composable(Routes.SCAN) { ScanScreen(onBack = { nav.popBackStack() }) }

        composable(
            "info/{title}",
            arguments = listOf(navArgument("title") { type = NavType.StringType }),
        ) { entry ->
            val title = entry.arguments?.getString("title").orEmpty()
            InfoScreen(title = title, onBack = { nav.popBackStack() })
        }

        composable(
            "entry/{id}",
            arguments = listOf(navArgument("id") { type = NavType.StringType }),
        ) { entry ->
            val id = entry.arguments?.getString("id").orEmpty()
            EntryScreen(
                actionId = id,
                onBack = { nav.popBackStack() },
                onContinue = { nav.navigate(Routes.PIN) },
            )
        }
        composable(
            "detail/{id}",
            arguments = listOf(navArgument("id") { type = NavType.StringType }),
        ) { entry ->
            val id = entry.arguments?.getString("id").orEmpty()
            DetailScreen(actionId = id, onBack = { nav.popBackStack() })
        }
        composable(
            "list/{id}",
            arguments = listOf(navArgument("id") { type = NavType.StringType }),
        ) { entry ->
            val id = entry.arguments?.getString("id").orEmpty()
            BundlesListScreen(
                actionId = id,
                onBack = { nav.popBackStack() },
                onBuy = {
                    val a = SfcCatalog.actions[id]
                    TxFlow.actionId = id
                    TxFlow.title = a?.title ?: "Purchase"
                    nav.navigate(Routes.PIN)
                },
            )
        }
        composable(Routes.PIN) {
            PinEntryScreen(
                onBack = { nav.popBackStack() },
                onDone = {
                    // Charge the wallet (balance first, Fuliza covers any shortfall).
                    val amt = TxFlow.amount.toDoubleOrNull() ?: 0.0
                    val res = AppState.performTransaction(
                        TxFlow.actionId, TxFlow.title, amt, TxFlow.recipient,
                    )
                    TxFlow.success = res.success
                    TxFlow.fulizaUsed = res.fromFuliza
                    TxFlow.newBalance = AppState.balanceStr
                    nav.navigate(Routes.RECEIPT) { popUpTo(Routes.HOME) }
                },
            )
        }
        composable(Routes.RECEIPT) {
            ReceiptScreen(onDone = { nav.popBackStack(Routes.HOME, inclusive = false) })
        }
    }
}






