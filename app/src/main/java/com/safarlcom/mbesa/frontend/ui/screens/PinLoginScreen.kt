package com.safarlcom.mbesa.frontend.ui.screens

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safarlcom.mbesa.frontend.data.AppState
import kotlinx.coroutines.delay

/*
 * PIN login / lock screen — rebuilt to match My OneApp v5.1.9 (activity_pin_login).
 * Layout: tvTitle "Enter your M-PESA PIN", red avatar w/ gold initials, name (tvWelcome),
 * masked MSISDN, green "no data bundles" banner (tvDescription), CodeEditText (4 outlined
 * boxes) + SafeInputKeyboard (custom numeric keypad w/ green delete). Dark (black) theme.
 */
private val ScreenBlack = Color(0xFF000000)
private val AvatarRed = Color(0xFFE62634)   // Safaricom red (APK palette)
private val InitialsGold = Color(0xFFFFB81C) // Safaricom gold (APK palette)
private val BannerGreen = Color(0xFF43B02A)  // brand green (APK palette)
private val KeyWhite = Color(0xFFFFFFFF)
private val PhoneGrey = Color(0xFFCFCFCF)
private val BoxBorderIdle = Color(0xFF5B5B5B)
private val ErrorRed = Color(0xFFE62634)

private enum class PinStatus { IDLE, LOADING, ERROR }

/** Mask a MSISDN as 3-leading + asterisks + 2-trailing, e.g. 0717000003 -> 071*****03 */
private fun maskPhone(p: String): String {
    val d = p.filter { it.isDigit() }
    if (d.length < 6) return p
    return d.take(3) + "*".repeat(d.length - 5) + d.takeLast(2)
}

@Composable
fun PinLoginScreen(
    onAuthenticated: () -> Unit,
    onBack: () -> Unit = {},
    name: String = "Peter Muchendu",
    phone: String = "0717000003",
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

    // Horizontal shake on error.
    val shake = remember { Animatable(0f) }
    LaunchedEffect(status) {
        if (status == PinStatus.ERROR) {
            repeat(3) {
                shake.animateTo(12f, tween(50)); shake.animateTo(-12f, tween(50))
            }
            shake.animateTo(0f, tween(50))
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(ScreenBlack),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(Modifier.height(56.dp))
        Text("Enter your M-PESA PIN", color = KeyWhite, fontSize = 18.sp, fontWeight = FontWeight.SemiBold)

        Spacer(Modifier.height(40.dp))
        Box(
            Modifier.size(104.dp).clip(CircleShape).background(AvatarRed),
            contentAlignment = Alignment.Center,
        ) {
            Text(initials, color = InitialsGold, fontSize = 32.sp, fontWeight = FontWeight.Bold)
        }

        Spacer(Modifier.height(18.dp))
        Text(name, color = KeyWhite, fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
        Spacer(Modifier.height(6.dp))
        Text(maskPhone(phone), color = PhoneGrey, fontSize = 15.sp)

        // --- Green "no data bundles" banner ---
        Spacer(Modifier.height(22.dp))
        Row(
            modifier = Modifier
                .padding(horizontal = 24.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(10.dp))
                .background(BannerGreen)
                .padding(horizontal = 16.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ) {
            // info seal badge
            Box(
                Modifier.size(18.dp).clip(CircleShape).background(Color.White),
                contentAlignment = Alignment.Center,
            ) { Text("i", color = BannerGreen, fontSize = 12.sp, fontWeight = FontWeight.Bold) }
            Spacer(Modifier.width(10.dp))
            Text(
                "This app will not use any of your data bundles",
                color = KeyWhite, fontSize = 13.sp, fontWeight = FontWeight.Bold,
            )
        }

        // --- 4 outlined PIN boxes ---
        Spacer(Modifier.height(48.dp))
        Row(
            modifier = Modifier
                .offset(x = shake.value.dp)
                .padding(horizontal = 24.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            repeat(4) { i ->
                val filled = i < pin.length
                val border = if (status == PinStatus.ERROR) ErrorRed else BoxBorderIdle
                Box(
                    Modifier
                        .size(64.dp)
                        .clip(RoundedCornerShape(14.dp))
                        .border(1.5.dp, border, RoundedCornerShape(14.dp)),
                    contentAlignment = Alignment.Center,
                ) {
                    if (filled) {
                        Box(Modifier.size(16.dp).clip(CircleShape).background(KeyWhite))
                    }
                }
            }
        }

        Spacer(Modifier.weight(1f))

        // --- Keypad ---
        val rows = listOf(
            listOf("1", "2", "3"),
            listOf("4", "5", "6"),
            listOf("7", "8", "9"),
            listOf("", "0", "<"),
        )
        Column(
            Modifier.fillMaxWidth().padding(horizontal = 24.dp, vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            rows.forEach { row ->
                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                    row.forEach { key ->
                        Box(
                            Modifier
                                .weight(1f)
                                .height(70.dp)
                                .clickable(enabled = key.isNotEmpty() && status != PinStatus.LOADING) {
                                    when (key) {
                                        "<" -> if (pin.isNotEmpty()) pin = pin.dropLast(1)
                                        "" -> {}
                                        else -> if (pin.length < 4 && status == PinStatus.IDLE) pin += key
                                    }
                                },
                            contentAlignment = Alignment.Center,
                        ) {
                            when (key) {
                                "" -> {}
                                "<" -> Box(
                                    Modifier.size(34.dp).clip(CircleShape)
                                        .border(1.5.dp, BannerGreen, CircleShape),
                                    contentAlignment = Alignment.Center,
                                ) { Icon(Icons.Filled.Close, "Delete", tint = BannerGreen, modifier = Modifier.size(18.dp)) }
                                else -> Text(key, color = KeyWhite, fontSize = 30.sp)
                            }
                        }
                    }
                }
            }
        }
        Spacer(Modifier.height(12.dp))
    }
}
