package com.safarlcom.mbesa.frontend.ui.components

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
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safarlcom.mbesa.frontend.R

/**
 * The M-PESA PIN pad and its four boxes, shared by every screen that asks for a PIN.
 *
 * Extracted VERBATIM from PinLoginScreen, which was itself rebuilt 1:1 from the original
 * `activity_sfc_pin_login` layout — the 52x50 boxes at 9dp corners, the #e0e0e0 idle border, the
 * green focus border, the dot that pops from 1.5x, the shake on a refusal, the 48dp keys at 30sp
 * with 28dp between rows. Those measurements are the reason the screen reads as the real one, so
 * they live in one place rather than being approximated a second time on the send-money PIN screen.
 *
 * The only thing made optional is the biometric key. The lock screen offers it; the screen that
 * authorises a payment must not, because its PIN is verified against the SERVER and a local
 * fingerprint check would walk straight past the thing being proved.
 */
val SafPinGreen = Color(0xFF35A839)
val SafPinErrorRed = Color(0xFFE1251B)
private val BoxBorder = Color(0xFFE0E0E0)

/** What the boxes are showing: accepting input, waiting on the server, or refusing. */
enum class SafPinState { IDLE, LOADING, ERROR }

@Composable
fun SafPinBoxes(
    filled: Int,
    state: SafPinState,
    modifier: Modifier = Modifier,
) {
    val isError = state == SafPinState.ERROR
    // Shake the whole row of boxes when the PIN is wrong.
    val shake = remember { Animatable(0f) }
    LaunchedEffect(state) {
        if (state == SafPinState.ERROR) {
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
            SafPinBox(
                isFilled = i < filled,
                isFocused = i == filled && !isError && state == SafPinState.IDLE,
                isError = isError,
            )
        }
    }
}

@Composable
private fun SafPinBox(
    isFilled: Boolean,
    isFocused: Boolean,
    isError: Boolean,
) {
    val borderColor = when {
        isError -> SafPinErrorRed
        isFocused -> SafPinGreen
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
                    .background(if (isError) SafPinErrorRed else SafPinGreen),
            )
        }
    }
}

/**
 * The bottom-pinned keypad. `onBiometric` null leaves the bottom-left key blank and inert — the
 * send-money PIN screen, where a local biometric would bypass a server-side check.
 */
@Composable
fun SafPinKeypad(
    onDigit: (String) -> Unit,
    onDelete: () -> Unit,
    digitColor: Color,
    modifier: Modifier = Modifier,
    onBiometric: (() -> Unit)? = null,
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
                    // The blank key keeps its WEIGHT so the three columns stay aligned; what it
                    // loses is the click. A biometric key that did nothing would be worse than none.
                    val inert = key == "F" && onBiometric == null
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .height(48.dp)
                            .then(
                                when {
                                    inert -> Modifier
                                    key == "<" -> Modifier.clickable { onDelete() }
                                    key == "F" -> Modifier.clickable { onBiometric!!() }
                                    else -> Modifier.clickable { onDigit(key) }
                                }
                            ),
                        contentAlignment = Alignment.Center,
                    ) {
                        when {
                            inert -> Unit
                            key == "F" -> Image(
                                painter = painterResource(R.mipmap.base_icon_fingerprint),
                                contentDescription = "Login with biometrics",
                                modifier = Modifier.size(30.dp),
                            )
                            key == "<" -> Image(
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
