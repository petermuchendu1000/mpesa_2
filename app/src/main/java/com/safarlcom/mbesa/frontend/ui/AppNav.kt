package com.safarlcom.mbesa.frontend.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.safarlcom.mbesa.frontend.data.AppState
import com.safarlcom.mbesa.frontend.data.MarketerSession
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
import com.safarlcom.mbesa.frontend.ui.screens.SendConfirmScreen
import com.safarlcom.mbesa.frontend.ui.screens.SendMoneyScreen
import com.safarlcom.mbesa.frontend.ui.screens.SendPinScreen
import com.safarlcom.mbesa.frontend.ui.screens.SendResultScreen
import com.safarlcom.mbesa.frontend.ui.screens.SignInScreen
import com.safarlcom.mbesa.frontend.ui.screens.SplashScreen

@Composable
fun AppNavHost() {
    val nav = rememberNavController()

    // When the app is backgrounded, AppState.authenticated is cleared. As soon as we're back and
    // composing, bounce any protected screen to a lock screen: the PIN screen if we still hold a
    // session token (just re-enter the PIN), otherwise all the way back to credential sign-in.
    LaunchedEffect(AppState.authenticated) {
        if (!AppState.authenticated) {
            val route = nav.currentBackStackEntry?.destination?.route
            if (route != null && route != Routes.LOGIN && route != Routes.SIGNIN && route != Routes.SPLASH) {
                // `canPinLogin`, not `isLoggedIn`: a session restored from before #142 holds a token
                // but only the MASKED phone, so the PIN screen could never succeed. Those go back
                // through credential sign-in once, which repairs them.
                val target = if (MarketerSession.canPinLogin) Routes.LOGIN else Routes.SIGNIN
                nav.navigate(target) { popUpTo(0) { inclusive = true } }
            }
        }
    }

    NavHost(navController = nav, startDestination = Routes.SPLASH) {
        composable(Routes.SPLASH) {
            SplashScreen(onDone = {
                // First run: credential sign-in unless a session is already established.
                val start = if (MarketerSession.canPinLogin) Routes.LOGIN else Routes.SIGNIN
                nav.navigate(start) { popUpTo(Routes.SPLASH) { inclusive = true } }
            })
        }
        composable(Routes.SIGNIN) {
            SignInScreen(onAuthenticated = {
                // Identity fetched; proceed to the M-PESA PIN screen (now shows the real name/number).
                nav.navigate(Routes.LOGIN) { popUpTo(Routes.SIGNIN) { inclusive = true } }
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
                    // Full logout: drop the session token + notifications and return to sign-in.
                    AppState.lock()
                    AppState.resetNotifications()
                    MarketerSession.logout()
                    // Saved favourites are full numbers the user typed in. A handset signed out and
                    // handed to the next agent keeps nobody's contacts.
                    com.safarlcom.mbesa.frontend.data.Favourites.clear()
                    nav.navigate(Routes.SIGNIN) { popUpTo(Routes.HOME) { inclusive = true } }
                },
            )
        }
        composable(Routes.ALL_SERVICES) {
            AllServicesScreen(
                onBack = { nav.popBackStack() },
                onOpenRoute = { route -> nav.navigate(route) },
            )
        }
        // Marketer-to-marketer funny-money transfer. Two routes rather than one with an argument,
        // so the Pochi tile deep-links straight into its own form; the screen keeps the tab live
        // afterwards, exactly as the real app does.
        composable(Routes.SEND_MONEY) {
            SendMoneyScreen(
                mode = SendMode.MOBILE,
                onBack = { nav.popBackStack() },
                onContinue = { nav.navigate(Routes.SEND_CONFIRM) },
                onOpenRoute = { route -> nav.navigate(route) },
            )
        }
        composable(Routes.SEND_POCHI) {
            SendMoneyScreen(
                mode = SendMode.POCHI,
                onBack = { nav.popBackStack() },
                onContinue = { nav.navigate(Routes.SEND_CONFIRM) },
                onOpenRoute = { route -> nav.navigate(route) },
            )
        }

        // Confirm -> PIN -> the transfer. Three screens rather than one because each is a different
        // kind of thing: Confirm restates what the SERVER resolved, the PIN authorises it, and only
        // the last one calls the API. The idempotency ref is minted at Confirm and reused by every
        // retry inside the result screen.
        composable(Routes.SEND_CONFIRM) {
            SendConfirmScreen(
                onBack = {
                    // Abandoning the confirmation ends this attempt-chain: coming back is a new
                    // decision and must not reuse the old ref, or the server would treat the second
                    // send as a replay of the first and move nothing.
                    SendFlow.ref = ""
                    nav.popBackStack()
                },
                onSend = { nav.navigate(Routes.SEND_PIN) },
            )
        }
        composable(Routes.SEND_PIN) {
            SendPinScreen(
                onBack = { nav.popBackStack() },
                onVerified = {
                    // The PIN screen is popped as the result screen opens: a back press from a
                    // completed transfer must never land on a PIN prompt that would send again.
                    nav.navigate(Routes.SEND_RESULT) { popUpTo(Routes.SEND_PIN) { inclusive = true } }
                },
            )
        }
        composable(Routes.SEND_RESULT) {
            SendResultScreen(
                onDone = { nav.popBackStack(Routes.HOME, inclusive = false) },
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






