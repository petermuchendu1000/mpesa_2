package com.safarlcom.mbesa.frontend.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
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
import com.safarlcom.mbesa.frontend.data.NameUtils
import com.safarlcom.mbesa.frontend.ui.components.SafPinBoxes
import com.safarlcom.mbesa.frontend.ui.components.SafPinKeypad
import com.safarlcom.mbesa.frontend.ui.components.SafPinState
import kotlinx.coroutines.delay

/*
 * Rebuilt 1:1 from the original `activity_sfc_pin_login` layout:
 *   centred title "Enter your M-PESA PIN" below the status bar (title #1e1e1e, 16sp)
 *   avatar 60dp (marginTop 50dp)
 *   name   16sp #282828 (marginTop 14dp)
 *   "Phone Number  <number>"  14sp #282828 (marginTop 6dp)
 *   PIN input: 4 SEPARATE rounded boxes (24dp horizontal inset, marginTop 80dp),
 *              empty border #e0e0e0, green dot #35a839, ~9dp corners
 *   SafeInputKeyboard pinned to the bottom on a white background
 */
private val SafErrorRed = Color(0xFFE1251B)
private val TitleColor = Color(0xFF1E1E1E)
private val NameColor = Color(0xFF282828)
private val BackBtnBg = Color(0xFFF7F7F7)

// The boxes, the keypad and their animations now live in components/SafPin.kt, so the send-money
// PIN screen renders the same control rather than a second approximation of it.
@Composable
fun PinLoginScreen(
    onAuthenticated: () -> Unit,
    onBack: () -> Unit = {},
    // Identity is fetched at sign-in and applied to AppState, so the PIN screen shows the real
    // marketer name + number rather than a hardcoded demo identity.
    name: String = AppState.fullName,
    /**
     * The number to AUTHENTICATE with — the one the marketer typed at sign-in, not the masked one
     * the server returns for display. `AppState.phone` is `0798****061` (invest254 docs/58) and
     * `fn_phone_sig9` of that is 7 digits where every marketer lookup needs 9, so a PIN login sent
     * with it was refused every single time (BUGLOG #142). Falls back to the display value only so
     * this screen still compiles for a caller that has neither; `canPinLogin` is what stops a
     * session without a real number ever reaching here.
     */
    phone: String = MarketerSession.loginPhone ?: AppState.phone,
) {
    var pin by remember { mutableStateOf("") }
    var status by remember { mutableStateOf(SafPinState.IDLE) }
    LaunchedEffect(pin) {
        if (pin.length == 4 && status == SafPinState.IDLE) {
            status = SafPinState.LOADING
            // Authenticate against the backend (phone + PIN). Every failure — wrong PIN, unknown
            // phone, disabled/suspended account, lockout — is surfaced identically, so nothing about
            // the account (or why the app exists) is ever revealed.
            val profile = MarketerSession.login(phone, pin)
            if (profile != null) {
                AppState.applyMarketer(profile)
                AppState.authenticated = true
                onAuthenticated()
            } else {
                status = SafPinState.ERROR
                delay(700)
                pin = ""
                status = SafPinState.IDLE
            }
        }
    }
    val initials = remember(name) {
        name.trim().split(" ").filter { it.isNotEmpty() }.let { parts ->
            when {
                parts.isEmpty() -> "?"
                parts.size == 1 -> parts[0].take(1).uppercase()
                else -> (parts.first().first().toString() + parts.last().first()).uppercase()
            }
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
    ) {
        // statusBarsPadding keeps the title clear of the status bar / camera notch — without it
        // the centred title is jammed against the very top of the screen (and behind the notch
        // on devices with a cutout). This inset is the safe-area top the login screen was missing.
        Column(
            Modifier
                .fillMaxSize()
                .statusBarsPadding(),
        ) {
            // --- Top bar: centred title (no back button — this is the entry screen) ---
            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp, vertical = 10.dp)
                    .height(40.dp),
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    "Enter your M-PESA PIN",
                    color = TitleColor,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                )
            }

            // --- Profile block, stacked from the top (not vertically centred) ---
            Spacer(Modifier.height(50.dp))
            Box(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .size(60.dp)
                    .clip(CircleShape)
                    .background(Color(0xFFDCE8FB)),
                contentAlignment = Alignment.Center,
            ) {
                Text(initials, color = Color(0xFF2E6CD4), fontSize = 20.sp, fontWeight = FontWeight.SemiBold)
            }
            Spacer(Modifier.height(14.dp))
            Text(
                name,
                color = NameColor,
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.align(Alignment.CenterHorizontally),
            )
            Spacer(Modifier.height(6.dp))
            Row(Modifier.align(Alignment.CenterHorizontally)) {
                Text("Phone Number", color = NameColor, fontSize = 14.sp)
                Spacer(Modifier.width(5.dp))
                Text(NameUtils.maskPhone(phone), color = NameColor, fontSize = 14.sp)
            }

            // --- PIN boxes sit just below the phone number (~1.5x the name→phone gap) ---
            Spacer(Modifier.height(10.dp))
            SafPinBoxes(
                filled = pin.length,
                state = status,
                modifier = Modifier.align(Alignment.CenterHorizontally),
            )
            // Error message directly under the boxes (as in CodeWithErrorInputView)
            Box(
                Modifier
                    .align(Alignment.CenterHorizontally)
                    .height(28.dp)
                    .padding(top = 8.dp),
                contentAlignment = Alignment.Center,
            ) {
                if (status == SafPinState.ERROR) {
                    Text(
                        "Incorrect M-PESA PIN. Please try again.",
                        color = SafErrorRed,
                        fontSize = 13.sp,
                        textAlign = TextAlign.Center,
                    )
                }
            }
        }

        // --- Keyboard pinned to the bottom on white ---
        SafPinKeypad(
            modifier = Modifier.align(Alignment.BottomCenter),
            onDigit = { d ->
                if (status == SafPinState.ERROR) {
                    pin = ""
                    status = SafPinState.IDLE
                }
                if (status == SafPinState.IDLE && pin.length < 4) pin += d
            },
            onDelete = { if (status == SafPinState.IDLE && pin.isNotEmpty()) pin = pin.dropLast(1) },
            onBiometric = {
                // Biometric login succeeds immediately in this preview build.
                AppState.authenticated = true
                onAuthenticated()
            },
            digitColor = TitleColor,
        )
    }
}
