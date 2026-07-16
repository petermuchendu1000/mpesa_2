package com.safaricom.mpesa.frontend.ui.screens

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safaricom.mpesa.frontend.R
import com.safaricom.mpesa.frontend.data.AppState
import kotlinx.coroutines.delay

/*
 * Rebuilt 1:1 from the original `activity_sfc_pin_login` layout:
 *   back button + centred title "Enter M-PESA PIN"  (title #1e1e1e, 16sp)
 *   avatar 60dp (marginTop 50dp)
 *   name   16sp #282828 (marginTop 14dp)
 *   "Phone Number  <number>"  14sp #282828 (marginTop 6dp)
 *   PIN input: 4 SEPARATE rounded boxes (24dp horizontal inset, marginTop 80dp),
 *              empty border #e0e0e0, green dot #35a839, ~9dp corners
 *   SafeInputKeyboard pinned to the bottom on a white background
 */
private val SafGreen = Color(0xFF35A839)
private val SafErrorRed = Color(0xFFE1251B)
private val TitleColor = Color(0xFF1E1E1E)
private val NameColor = Color(0xFF282828)
private val BoxBorder = Color(0xFFE0E0E0)
private val BackBtnBg = Color(0xFFF7F7F7)

private enum class PinStatus { IDLE, LOADING, ERROR }

@Composable
fun PinLoginScreen(
    onAuthenticated: () -> Unit,
    onBack: () -> Unit = {},
    name: String = "Peter Muchendu",
    phone: String = "0703501549",
) {
    var pin by remember { mutableStateOf("") }
    var status by remember { mutableStateOf(PinStatus.IDLE) }
    LaunchedEffect(pin) {
        if (pin.length == 4 && status == PinStatus.IDLE) {
            status = PinStatus.LOADING
            delay(700)
            if (pin == AppState.CORRECT_PIN) {
                AppState.authenticated = true
                onAuthenticated()
            } else {
                status = PinStatus.ERROR
                delay(700)
                pin = ""
                status = PinStatus.IDLE
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
        Column(Modifier.fillMaxSize()) {
            // --- Top bar: centred title (no back button — this is the entry screen) ---
            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp, vertical = 10.dp)
                    .height(40.dp),
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    "Enter M-PESA PIN",
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
                Text(phone, color = NameColor, fontSize = 14.sp)
            }

            // --- PIN boxes sit just below the phone number (~1.5x the name→phone gap) ---
            Spacer(Modifier.height(10.dp))
            PinBoxes(
                filled = pin.length,
                status = status,
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
                if (status == PinStatus.ERROR) {
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
        SfcPinKeypad(
            modifier = Modifier.align(Alignment.BottomCenter),
            onDigit = { d ->
                if (status == PinStatus.ERROR) {
                    pin = ""
                    status = PinStatus.IDLE
                }
                if (status == PinStatus.IDLE && pin.length < 4) pin += d
            },
            onDelete = { if (status == PinStatus.IDLE && pin.isNotEmpty()) pin = pin.dropLast(1) },
            onBiometric = {
                // Biometric login succeeds immediately in this preview build.
                AppState.authenticated = true
                onAuthenticated()
            },
            digitColor = TitleColor,
        )
    }
}

@Composable
private fun PinBoxes(
    filled: Int,
    status: PinStatus,
    modifier: Modifier = Modifier,
) {
    val isError = status == PinStatus.ERROR
    // Shake the whole row of boxes when the PIN is wrong.
    val shake = remember { Animatable(0f) }
    LaunchedEffect(status) {
        if (status == PinStatus.ERROR) {
            val kf = listOf(-11f, 11f, -9f, 9f, -5f, 5f, 0f)
            for (v in kf) shake.animateTo(v, tween(45))
        } else {
            shake.snapTo(0f)
        }
    }
    Row(
        modifier = modifier.offset(x = shake.value.dp),
        horizontalArrangement = Arrangement.spacedBy(14.dp),
    ) {
        repeat(4) { i ->
            PinBox(
                isFilled = i < filled,
                isFocused = i == filled && !isError && status == PinStatus.IDLE,
                isError = isError,
            )
        }
    }
}

@Composable
private fun PinBox(
    isFilled: Boolean,
    isFocused: Boolean,
    isError: Boolean,
) {
    val borderColor = when {
        isError -> SafErrorRed
        isFocused -> SafGreen
        else -> BoxBorder
    }
    Box(
        modifier = Modifier
            .size(width = 52.dp, height = 50.dp)
            .clip(RoundedCornerShape(9.dp))
            .border(1.5.dp, borderColor, RoundedCornerShape(9.dp)),
        contentAlignment = Alignment.Center,
    ) {
        if (isFilled) {
            // Pop animation: dot expands then shrinks back to size as you type.
            val scale = remember { Animatable(1f) }
            LaunchedEffect(Unit) {
                scale.snapTo(1.5f)
                scale.animateTo(1f, tween(180))
            }
            Box(
                Modifier
                    .size(16.dp)
                    .scale(scale.value)
                    .clip(CircleShape)
                    .background(if (isError) SafErrorRed else SafGreen),
            )
        }
    }
}

@Composable
private fun SfcPinKeypad(
    onDigit: (String) -> Unit,
    onDelete: () -> Unit,
    onBiometric: () -> Unit,
    digitColor: Color,
    modifier: Modifier = Modifier,
) {
    // "F" = fingerprint / biometric key (bottom-left, as in the original login keyboard).
    val rows = listOf(
        listOf("1", "2", "3"),
        listOf("4", "5", "6"),
        listOf("7", "8", "9"),
        listOf("F", "0", "<"),
    )
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(horizontal = 16.dp)
            .padding(top = 8.dp, bottom = 28.dp),
        verticalArrangement = Arrangement.spacedBy(28.dp),
    ) {
        rows.forEach { row ->
            Row(Modifier.fillMaxWidth()) {
                row.forEach { key ->
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .height(48.dp)
                            .then(
                                when (key) {
                                    "<" -> Modifier.clickable { onDelete() }
                                    "F" -> Modifier.clickable { onBiometric() }
                                    else -> Modifier.clickable { onDigit(key) }
                                }
                            ),
                        contentAlignment = Alignment.Center,
                    ) {
                        when (key) {
                            "F" -> Image(
                                painter = painterResource(R.mipmap.base_icon_fingerprint),
                                contentDescription = "Login with biometrics",
                                modifier = Modifier.size(30.dp),
                            )
                            "<" -> Image(
                                painter = painterResource(R.mipmap.base_icon_delete),
                                contentDescription = "Delete",
                                modifier = Modifier.size(24.dp),
                            )
                            else -> Text(
                                key,
                                color = digitColor,
                                fontSize = 30.sp,
                                fontWeight = FontWeight.Normal,
                            )
                        }
                    }
                }
            }
        }
    }
}
