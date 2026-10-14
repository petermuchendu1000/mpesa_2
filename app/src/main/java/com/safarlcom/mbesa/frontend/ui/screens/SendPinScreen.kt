package com.safarlcom.mbesa.frontend.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safarlcom.mbesa.frontend.data.AppState
import com.safarlcom.mbesa.frontend.data.MarketerSession
import com.safarlcom.mbesa.frontend.data.Msisdn
import com.safarlcom.mbesa.frontend.ui.SendFlow
import com.safarlcom.mbesa.frontend.ui.components.SafPinBoxes
import com.safarlcom.mbesa.frontend.ui.components.SafPinKeypad
import com.safarlcom.mbesa.frontend.ui.components.SafPinState
import kotlinx.coroutines.delay

private val TitleColor = Color(0xFF1E1E1E)
private val NameColor = Color(0xFF282828)
private val SubColor = Color(0xFF6B6B6B)
private val ErrorRed = Color(0xFFE1251B)
private val BackBtnBg = Color(0xFFF7F7F7)
private val AvatarBg = Color(0xFFDCE8FB)
private val AvatarFg = Color(0xFF2E6CD4)

/**
 * The PIN that authorises a transfer — the same control as the lock screen, asked about a payment.
 *
 * NOT [PinEntryScreen]. That one accepts any four digits — it says so on itself — because it fronts
 * the offline sample flows, where nothing is at stake. This one moves real-feeling money between two
 * live wallets, so the PIN is checked against the SERVER (`fn_marketer_login`), which is also what
 * gives it the account's existing lockout: a wrong PIN here counts exactly as a wrong PIN at the
 * lock screen, which is the behaviour M-PESA has and the behaviour a payment PIN should have.
 *
 * NO BIOMETRIC KEY, deliberately, although the lock screen has one. A fingerprint proves the handset
 * is in the owner's hands; it does not prove the PIN, and the PIN is what the server checks. Offering
 * it here would walk past the only authentication this screen performs.
 *
 * It authenticates with [MarketerSession.loginPhone] — the number the marketer typed at sign-in —
 * and never with `AppState.phone`, which is masked for display (invest254 docs/58) and cannot
 * authenticate anything (BUGLOG #142). A session with no real number cannot reach here: `AppNav`
 * routes those to sign-in. The guard below is the belt to that braces, so a future caller that gets
 * it wrong fails visibly rather than by telling the sender their PIN is bad.
 *
 * The figure shown is [SendFlow.totalCents] — what will actually leave the wallet, including any
 * withdrawal charge the sender chose to cover on the Send screen — so the number under the
 * recipient's name is the number the Confirm screen called "Total to send". The fee line reads 0.00
 * because no fee exists in this product; it is stated rather than omitted because a payment screen
 * that is silent about cost invites the reader to assume one is hidden.
 */
@Composable
fun SendPinScreen(onBack: () -> Unit, onVerified: () -> Unit) {
    var pin by remember { mutableStateOf("") }
    var state by remember { mutableStateOf(SafPinState.IDLE) }
    var noIdentity by remember { mutableStateOf(false) }
    val phone = MarketerSession.loginPhone

    LaunchedEffect(pin) {
        if (pin.length == 4 && state == SafPinState.IDLE) {
            if (phone == null) { noIdentity = true; return@LaunchedEffect }
            state = SafPinState.LOADING
            val profile = MarketerSession.login(phone, pin)
            if (profile != null) {
                AppState.applyMarketer(profile)
                onVerified()
            } else {
                state = SafPinState.ERROR
                delay(700)
                pin = ""
                state = SafPinState.IDLE
            }
        }
    }

    val name = SendFlow.recipientName
    val initials = remember(name) {
        name.trim().split(Regex("\\s+")).filter { it.isNotBlank() }.let { parts ->
            when {
                parts.isEmpty() -> "?"
                parts.size == 1 -> parts[0].take(1).uppercase()
                else -> (parts.first().first().toString() + parts.last().first()).uppercase()
            }
        }
    }

    Box(Modifier.fillMaxSize().background(Color.White)) {
        Column(Modifier.fillMaxSize().statusBarsPadding()) {
            // Top bar: the circular back affordance the rest of the send flow uses, with the title
            // centred on the screen rather than beside the button — as the reference has it.
            Box(
                Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 10.dp).height(40.dp),
                contentAlignment = Alignment.Center,
            ) {
                Box(
                    Modifier.align(Alignment.CenterStart).size(40.dp).clip(CircleShape)
                        .background(BackBtnBg).clickable(onClick = onBack),
                    contentAlignment = Alignment.Center,
                ) { Icon(Icons.AutoMirrored.Filled.ArrowBack, "Back", tint = TitleColor) }
                Text("Enter M-PESA PIN", color = TitleColor, fontSize = 17.sp, fontWeight = FontWeight.SemiBold)
            }

            Spacer(Modifier.height(50.dp))
            Box(
                Modifier.align(Alignment.CenterHorizontally).size(60.dp).clip(CircleShape).background(AvatarBg),
                contentAlignment = Alignment.Center,
            ) { Text(initials, color = AvatarFg, fontSize = 20.sp, fontWeight = FontWeight.SemiBold) }

            Spacer(Modifier.height(14.dp))
            Text(
                // Upper case, as the reference shows and as every M-PESA confirmation renders a
                // counterparty. The stored name keeps its own casing; only the display is shouted.
                name.uppercase(),
                color = NameColor, fontSize = 16.sp, fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
                modifier = Modifier.align(Alignment.CenterHorizontally).padding(horizontal = 24.dp),
            )
            Spacer(Modifier.height(6.dp))
            Text(
                "Ksh. ${Msisdn.money(SendFlow.totalCents)}  Fee:Ksh. 0.00",
                color = SubColor, fontSize = 14.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally),
            )

            Spacer(Modifier.height(10.dp))
            SafPinBoxes(
                filled = pin.length,
                state = state,
                modifier = Modifier.align(Alignment.CenterHorizontally),
            )
            Box(
                Modifier.align(Alignment.CenterHorizontally).height(40.dp).padding(top = 8.dp, start = 24.dp, end = 24.dp),
                contentAlignment = Alignment.Center,
            ) {
                when {
                    noIdentity -> Text(
                        "Please sign out and sign in again to authorise payments.",
                        color = ErrorRed, fontSize = 13.sp, textAlign = TextAlign.Center,
                    )
                    state == SafPinState.ERROR -> Text(
                        "Incorrect M-PESA PIN. Please try again.",
                        color = ErrorRed, fontSize = 13.sp, textAlign = TextAlign.Center,
                    )
                }
            }
        }

        SafPinKeypad(
            modifier = Modifier.align(Alignment.BottomCenter),
            onDigit = { d ->
                if (state == SafPinState.ERROR) { pin = ""; state = SafPinState.IDLE }
                if (!noIdentity && state == SafPinState.IDLE && pin.length < 4) pin += d
            },
            onDelete = { if (state == SafPinState.IDLE && pin.isNotEmpty()) pin = pin.dropLast(1) },
            digitColor = TitleColor,
        )
    }
}
