package com.safarlcom.mbesa.frontend.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safarlcom.mbesa.frontend.data.AppState
import com.safarlcom.mbesa.frontend.data.MarketerSession
import com.safarlcom.mbesa.frontend.data.Msisdn
import com.safarlcom.mbesa.frontend.ui.SendFlow
import com.safarlcom.mbesa.frontend.ui.components.NumericKeypad
import com.safarlcom.mbesa.frontend.ui.components.PinDots
import com.safarlcom.mbesa.frontend.ui.components.SafTopBar
import com.safarlcom.mbesa.frontend.ui.theme.Danger
import com.safarlcom.mbesa.frontend.ui.theme.TextSecondary
import kotlinx.coroutines.delay

private enum class Step { IDLE, CHECKING, WRONG, NO_IDENTITY }

/**
 * The PIN that authorises a transfer.
 *
 * NOT [PinEntryScreen]. That one accepts any four digits — it says so on itself — because it fronts
 * the offline sample flows, where nothing is at stake. This one moves real-feeling money between two
 * live wallets, so the PIN is checked against the SERVER (`fn_marketer_login`), which is also what
 * gives it the account's existing lockout: a wrong PIN here counts exactly as a wrong PIN at the
 * lock screen, which is the behaviour M-PESA has and the behaviour a payment PIN should have.
 *
 * It authenticates with [MarketerSession.loginPhone] — the number the marketer typed at sign-in —
 * and never with `AppState.phone`, which is masked for display (invest254 docs/58) and cannot
 * authenticate anything (BUGLOG #142). A session with no real number cannot reach here: `AppNav`
 * routes those to sign-in. The guard below is the belt to that braces, so a future caller that gets
 * it wrong fails visibly rather than by telling the sender their PIN is bad.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SendPinScreen(onBack: () -> Unit, onVerified: () -> Unit) {
    var pin by remember { mutableStateOf("") }
    var step by remember { mutableStateOf(Step.IDLE) }
    val phone = MarketerSession.loginPhone

    LaunchedEffect(pin) {
        if (pin.length == 4 && step == Step.IDLE) {
            if (phone == null) { step = Step.NO_IDENTITY; return@LaunchedEffect }
            step = Step.CHECKING
            val profile = MarketerSession.login(phone, pin)
            if (profile != null) {
                AppState.applyMarketer(profile)
                onVerified()
            } else {
                step = Step.WRONG
                delay(800)
                pin = ""
                step = Step.IDLE
            }
        }
    }

    Scaffold(
        containerColor = Color.White,
        topBar = { SafTopBar("Enter PIN", onBack) },
    ) { padding ->
        Column(
            Modifier.fillMaxSize().padding(padding).padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(Modifier.height(24.dp))
            Text("Enter your M-PESA PIN", fontSize = 18.sp, fontWeight = FontWeight.Bold)
            Spacer(Modifier.height(8.dp))
            Text(
                "Ksh ${Msisdn.money(SendFlow.totalCents)} to ${SendFlow.recipientName}",
                color = TextSecondary,
                textAlign = TextAlign.Center,
            )
            Spacer(Modifier.height(32.dp))
            PinDots(length = 4, filled = pin.length)
            Spacer(Modifier.height(16.dp))
            Text(
                when (step) {
                    Step.WRONG -> "Wrong PIN. Try again."
                    Step.CHECKING -> "Checking…"
                    Step.NO_IDENTITY -> "Please sign out and sign in again to authorise payments."
                    Step.IDLE -> ""
                },
                color = if (step == Step.IDLE || step == Step.CHECKING) TextSecondary else Danger,
                style = MaterialTheme.typography.labelLarge,
            )
            Spacer(Modifier.height(8.dp))
            NumericKeypad(
                onDigit = { d -> if (step == Step.IDLE && pin.length < 4) pin += d },
                onDelete = { if (step == Step.IDLE && pin.isNotEmpty()) pin = pin.dropLast(1) },
                modifier = Modifier.fillMaxWidth(),
            )
            Spacer(Modifier.height(8.dp))
        }
    }
}
