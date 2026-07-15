package com.safaricom.mpesa.frontend.ui.screens

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.StartOffset
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
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
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.isSystemInDarkTheme
import kotlinx.coroutines.delay

// Brand + state colours recovered from the original resources.
private val SafGreen = Color(0xFF35A839)   // #35a839 brand green (filled dot)
private val SafErrorRed = Color(0xFFFF2A58) // #ff2a58 pin error colour

private enum class PinStatus { IDLE, LOADING, ERROR }

/**
 * M-PESA PIN login — faithful recreation of `SFCPinLoginActivity` / `activity_sfc_base_pin`.
 *
 * Structure (top → bottom): centered title, avatar (initials fallback), name,
 * "Phone Number <msisdn>", 4-box [PinPadView], custom [SafeInputKeyboard].
 *
 * Behaviour (extracted from PinPadView + SafeInputKeyboard + SFCPinLoginActivity):
 *  - digit → selectDot() fills the next box with a green dot; 4th digit auto-submits.
 *  - submit → startLoadingAnimation(): staggered 200ms wave across the dots while verifying.
 *  - success → onAuthenticated(); error → red dots + shake, then auto-clear to retry.
 *  - delete → deselectDot() un-fills the last box.
 *
 * Mock verify: PIN "0000" demonstrates the error path; any other 4 digits succeed.
 */
@Composable
fun PinLoginScreen(
    onAuthenticated: () -> Unit,
    name: String = "Peter Muchendu",
    phone: String = "0703501549",
) {
    val dark = isSystemInDarkTheme()
    val background = if (dark) Color(0xFF121212) else Color.White
    val textPrimary = if (dark) Color.White else Color(0xFF121212)
    val textSecondary = if (dark) Color(0xFFBFBFBF) else Color(0xFF6B6B6B)
    val boxBorderIdle = if (dark) Color(0xFF4A4A4A) else Color(0xFFCBD5E1)

    var pin by remember { mutableStateOf("") }
    var status by remember { mutableStateOf(PinStatus.IDLE) }

    // 4th digit → loading wave → verify → success / error, exactly like onConfirmClick().
    LaunchedEffect(pin) {
        if (pin.length == 4 && status == PinStatus.IDLE) {
            status = PinStatus.LOADING
            delay(1100) // ~ 4 dots * 200ms wave + verify latency
            if (pin == "0000") {
                status = PinStatus.ERROR
                delay(600)  // showErrorAnimation() duration
                pin = ""    // clearDots()
                status = PinStatus.IDLE
            } else {
                onAuthenticated()
            }
        }
    }

    val initials = remember(name) {
        name.trim().split(" ").filter { it.isNotEmpty() }
            .take(2).joinToString("") { it.first().uppercase() }
            .ifEmpty { "?" }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(background)
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(Modifier.height(24.dp))
        Text(
            text = "Enter your M-PESA PIN",
            color = textPrimary,
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
        )

        Spacer(Modifier.height(28.dp))

        // Avatar — initials fallback (cardAbbr + tvAbbr), light-blue like the original.
        Box(
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape)
                .background(Color(0xFF8AB4E8)),
            contentAlignment = Alignment.Center,
        ) {
            Text(initials, color = Color(0xFF2F6FD6), fontSize = 18.sp, fontWeight = FontWeight.Bold)
        }

        Spacer(Modifier.height(14.dp))
        Text(name, color = textPrimary, fontSize = 18.sp, fontWeight = FontWeight.SemiBold)

        Spacer(Modifier.height(6.dp))
        Row {
            Text("Phone Number", color = textPrimary, fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
            Spacer(Modifier.size(5.dp))
            Text(phone, color = textPrimary, fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
        }

        Spacer(Modifier.height(32.dp))

        PinPadBoxes(
            filled = pin.length,
            status = status,
            idleBorder = boxBorderIdle,
        )

        // Error message (tvPinError) — shown only during the error animation.
        Spacer(Modifier.height(12.dp))
        Text(
            text = if (status == PinStatus.ERROR) "Incorrect M-PESA PIN. Please try again." else "",
            color = SafErrorRed,
            fontSize = 14.sp,
            textAlign = TextAlign.Center,
        )

        Spacer(Modifier.weight(1f))

        SfcPinKeypad(
            onDigit = { d ->
                // selectDot(): if in error, clear + reset first, then take this digit.
                if (status == PinStatus.ERROR) {
                    pin = ""
                    status = PinStatus.IDLE
                }
                if (status == PinStatus.IDLE && pin.length < 4) pin += d
            },
            onDelete = {
                if (status == PinStatus.IDLE && pin.isNotEmpty()) pin = pin.dropLast(1)
            },
            digitColor = textPrimary,
            secondaryColor = textSecondary,
        )
        Spacer(Modifier.height(16.dp))
    }
}

/** The 4 PIN boxes with green-dot fill, staggered loading wave, and error shake. */
@Composable
private fun PinPadBoxes(
    filled: Int,
    status: PinStatus,
    idleBorder: Color,
) {
    // Horizontal shake on error (showErrorAnimation()).
    val shake = remember { Animatable(0f) }
    LaunchedEffect(status) {
        if (status == PinStatus.ERROR) {
            val kf = listOf(-10f, 10f, -8f, 8f, -4f, 4f, 0f)
            for (v in kf) shake.animateTo(v, tween(45))
        } else {
            shake.snapTo(0f)
        }
    }

    val transition = rememberInfiniteTransition(label = "pinWave")

    Row(
        modifier = Modifier.offset(x = shake.value.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        repeat(4) { i ->
            val isFilled = i < filled
            val isError = status == PinStatus.ERROR
            val borderColor = if (isError) SafErrorRed else idleBorder
            val dotColor = if (isError) SafErrorRed else SafGreen

            // Green dot scale-in on select.
            val dotScale by animateFloatAsState(
                targetValue = if (isFilled || isError) 1f else 0f,
                animationSpec = tween(160),
                label = "dotScale",
            )

            // Staggered loading pulse — each dot offset by 200ms (LOADING_DELAY).
            val pulse by transition.animateFloat(
                initialValue = 1f,
                targetValue = 0.35f,
                animationSpec = infiniteRepeatable(
                    animation = tween(400),
                    repeatMode = RepeatMode.Reverse,
                    initialStartOffset = StartOffset(i * 200),
                ),
                label = "pulse$i",
            )
            val dotAlpha = if (status == PinStatus.LOADING) pulse else 1f

            Box(
                modifier = Modifier
                    .size(48.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .border(1.5.dp, borderColor, RoundedCornerShape(12.dp)),
                contentAlignment = Alignment.Center,
            ) {
                Box(
                    modifier = Modifier
                        .size(14.dp)
                        .scale(dotScale)
                        .clip(CircleShape)
                        .background(dotColor.copy(alpha = dotAlpha)),
                )
            }
        }
    }
}

/** Custom numeric keypad (SafeInputKeyboard): digits + green circular delete. */
@Composable
private fun SfcPinKeypad(
    onDigit: (String) -> Unit,
    onDelete: () -> Unit,
    digitColor: Color,
    secondaryColor: Color,
) {
    val rows = listOf(
        listOf("1", "2", "3"),
        listOf("4", "5", "6"),
        listOf("7", "8", "9"),
        listOf("", "0", "<"),
    )
    Column(Modifier.fillMaxWidth(), verticalArrangement = Arrangement.spacedBy(6.dp)) {
        rows.forEach { row ->
            Row(Modifier.fillMaxWidth()) {
                row.forEach { key ->
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .height(64.dp)
                            .then(
                                if (key.isEmpty()) Modifier
                                else Modifier.clickable(
                                    interactionSource = remember { MutableInteractionSource() },
                                    indication = null,
                                ) { if (key == "<") onDelete() else onDigit(key) }
                            ),
                        contentAlignment = Alignment.Center,
                    ) {
                        when (key) {
                            "" -> {}
                            "<" -> Box(
                                modifier = Modifier
                                    .size(34.dp)
                                    .clip(CircleShape)
                                    .border(1.5.dp, SafGreen, CircleShape),
                                contentAlignment = Alignment.Center,
                            ) {
                                Icon(
                                    Icons.Filled.Close,
                                    contentDescription = "Delete",
                                    tint = SafGreen,
                                    modifier = Modifier.size(16.dp),
                                )
                            }
                            else -> Text(key, color = digitColor, fontSize = 28.sp, fontWeight = FontWeight.Normal)
                        }
                    }
                }
            }
        }
    }
}


