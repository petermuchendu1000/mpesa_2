package com.safaricom.mpesa.frontend.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.safaricom.mpesa.frontend.data.SfcCatalog
import com.safaricom.mpesa.frontend.ui.screens.AllServicesScreen
import com.safaricom.mpesa.frontend.ui.screens.BundlesListScreen
import com.safaricom.mpesa.frontend.ui.screens.DetailScreen
import com.safaricom.mpesa.frontend.ui.screens.EntryScreen
import com.safaricom.mpesa.frontend.ui.screens.HistoryScreen
import com.safaricom.mpesa.frontend.ui.screens.HomeShell
import com.safaricom.mpesa.frontend.ui.screens.InfoScreen
import com.safaricom.mpesa.frontend.ui.screens.NotificationsScreen
import com.safaricom.mpesa.frontend.ui.screens.PinLoginScreen
import com.safaricom.mpesa.frontend.ui.screens.PinEntryScreen
import com.safaricom.mpesa.frontend.ui.screens.ReceiptScreen
import com.safaricom.mpesa.frontend.ui.screens.ScanScreen
import com.safaricom.mpesa.frontend.ui.screens.SplashScreen

@Composable
fun AppNavHost() {
    val nav = rememberNavController()
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
                onDone = { nav.navigate(Routes.RECEIPT) { popUpTo(Routes.HOME) } },
            )
        }
        composable(Routes.RECEIPT) {
            ReceiptScreen(onDone = { nav.popBackStack(Routes.HOME, inclusive = false) })
        }
    }
}






