package com.safarlcom.mbesa.frontend.ui.screens

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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safarlcom.mbesa.frontend.data.AppState
import com.safarlcom.mbesa.frontend.data.MarketerSession
import com.safarlcom.mbesa.frontend.data.Msisdn
import com.safarlcom.mbesa.frontend.data.TransferResult
import com.safarlcom.mbesa.frontend.ui.SendFlow
import com.safarlcom.mbesa.frontend.ui.SendMode
import com.safarlcom.mbesa.frontend.ui.theme.BrandGreen
import com.safarlcom.mbesa.frontend.ui.theme.Danger
import com.safarlcom.mbesa.frontend.ui.theme.TextPrimary
import com.safarlcom.mbesa.frontend.ui.theme.TextSecondary

private val ScreenBg = Color(0xFFF2F3F5)
private val CardWhite = Color(0xFFFFFFFF)
private val ChipGrey = Color(0xFFEDEEF1)
private val HairLine = Color(0xFFE4E6EA)

/**
 * CONFIRM — the last thing the sender sees before the money moves.
 *
 * Everything on it comes from [SendFlow], which the Send Money screen filled from the SERVER's own
 * answers: the recipient's name is the one `/marketers/recipients/lookup` returned for the number
 * typed, never something the app composed. A confirm screen that restated the sender's own input
 * back to them would confirm nothing.
 *
 * It mints the idempotency ref ([SendFlow.beginAttempt]) on arrival, once. Every retry from here —
 * including the automatic one after a timeout — reuses it, which is what makes a lost reply cost
 * nothing instead of sending twice.
 *
 * "Transaction cost: N/A" is the truth, not a placeholder: no fee is charged anywhere in this
 * product. The withdrawal charge the sender may have ticked is not a cost to them either — it is
 * added to what the recipient RECEIVES, so it is shown as part of the total being sent.
 */
@Composable
fun SendConfirmScreen(
    onBack: () -> Unit,
    onSend: () -> Unit,
) {
    // Once per arrival at Confirm. Going back and returning deliberately mints a new one: that is a
    // new decision by the sender, not a retry of the old one.
    LaunchedEffect(Unit) { if (SendFlow.ref.isBlank()) SendFlow.beginAttempt() }

    val pochi = SendFlow.mode == SendMode.POCHI
    Scaffold(containerColor = ScreenBg) { padding ->
        Column(
            Modifier.fillMaxSize().padding(padding).padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(Modifier.height(8.dp))
            Box(Modifier.fillMaxWidth().height(48.dp), contentAlignment = Alignment.Center) {
                Box(
                    Modifier.align(Alignment.CenterStart).size(40.dp).clip(CircleShape)
                        .background(ChipGrey).clickable(onClick = onBack),
                    contentAlignment = Alignment.Center,
                ) { Icon(Icons.AutoMirrored.Filled.ArrowBack, "Back", tint = TextPrimary) }
                Text("Confirm", fontSize = 19.sp, fontWeight = FontWeight.SemiBold, color = TextPrimary)
            }

            Spacer(Modifier.weight(1f))

            // The card, with the recipient's initials riding its top edge — the reference's shape.
            Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.TopCenter) {
                Column(
                    Modifier.fillMaxWidth().padding(top = 34.dp).clip(RoundedCornerShape(16.dp))
                        .background(CardWhite),
                ) {
                    // The brand's two-tone rule across the top, as in the reference.
                    Box(
                        Modifier.fillMaxWidth().height(3.dp)
                            .background(Brush.horizontalGradient(listOf(Color(0xFF1E9BE0), BrandGreen))),
                    )
                    Spacer(Modifier.height(36.dp))
                    Text(
                        if (pochi) "Pay to Pochi La Biashara" else "Send Money",
                        fontSize = 16.sp, color = TextPrimary, textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth(),
                    )
                    Spacer(Modifier.height(18.dp))
                    Box(Modifier.fillMaxWidth().height(1.dp).background(HairLine))

                    Column(Modifier.padding(horizontal = 20.dp, vertical = 4.dp)) {
                        ConfirmRow("Amount", "Ksh ${Msisdn.money(SendFlow.amountCents)}")
                        if (SendFlow.chargeCents > 0) {
                            // Shown as its own line rather than folded silently into the amount:
                            // the sender ticked a box and is entitled to see what it did.
                            ConfirmRow("Withdrawal charges you're covering", "Ksh ${Msisdn.money(SendFlow.chargeCents)}")
                            ConfirmRow("Total to send", "Ksh ${Msisdn.money(SendFlow.totalCents)}", emphasise = true)
                        }
                        ConfirmRow("Send to", SendFlow.recipientName)
                        // No fee exists in this product. Saying N/A is accurate; a figure would not be.
                        ConfirmRow("Transaction cost", "N/A", last = true)
                    }
                    Spacer(Modifier.height(10.dp))
                }

                Box(
                    Modifier.size(68.dp).clip(CircleShape).background(Color(0xFFC94A2B))
                        .border(4.dp, ScreenBg, CircleShape),
                    contentAlignment = Alignment.Center,
                ) {
                    Text(
                        initialsOf(SendFlow.recipientName),
                        color = Color.White, fontWeight = FontWeight.Bold, fontSize = 22.sp,
                    )
                }
            }

            Spacer(Modifier.weight(1f))

            Button(
                onClick = onSend,
                enabled = SendFlow.amountCents > 0 && SendFlow.recipientPhone.isNotBlank(),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(containerColor = BrandGreen, disabledContainerColor = ChipGrey),
                modifier = Modifier.fillMaxWidth().height(54.dp),
            ) { Text("Send", fontSize = 16.sp, fontWeight = FontWeight.SemiBold) }
            Spacer(Modifier.height(20.dp))
        }
    }
}

@Composable
private fun ConfirmRow(label: String, value: String, emphasise: Boolean = false, last: Boolean = false) {
    Column(Modifier.fillMaxWidth().padding(top = 16.dp)) {
        Text(label, color = TextSecondary, fontSize = 13.sp)
        Spacer(Modifier.height(4.dp))
        Text(
            value,
            color = if (emphasise) BrandGreen else TextPrimary,
            fontWeight = FontWeight.Bold,
            fontSize = 17.sp,
        )
        Spacer(Modifier.height(14.dp))
        if (!last) Box(Modifier.fillMaxWidth().height(1.dp).background(HairLine))
    }
}

private fun initialsOf(name: String): String =
    name.trim().split(Regex("\\s+")).filter { it.isNotBlank() }
        .take(2).joinToString("") { it.first().uppercase() }.ifBlank { "?" }

/**
 * SENDING / RESULT — where the transfer actually happens.
 *
 * It owns the call so the screens before it stay pure: Confirm collects, this one commits. The
 * attempt runs once on arrival, and a retry REUSES [SendFlow.ref] — never a fresh one — so the
 * server's replay path can tell "do this again" from "you already did this".
 *
 * A TIMEOUT IS NOT A FAILURE and is never shown as one. The server may have moved the money and
 * lost the reply, so [TransferResult.Unknown] offers a retry on the same ref, which either
 * completes the transfer or reports the completion that already happened. Telling the sender it
 * failed would invite them to send again — the exact mistake idempotency exists to prevent.
 */
@Composable
fun SendResultScreen(onDone: () -> Unit) {
    var state by remember { mutableStateOf<TransferResult?>(null) }
    var attempt by remember { mutableStateOf(0) }

    LaunchedEffect(attempt) {
        state = null
        state = MarketerSession.transfer(
            phone = SendFlow.recipientPhone,
            amountCents = SendFlow.totalCents,
            chargeCents = SendFlow.chargeCents,
            ref = SendFlow.ref,
        )
        // The wallet figure the server just returned is authoritative; apply it so Home and the
        // Send screen stop showing the pre-send balance.
        (state as? TransferResult.Ok)?.let { AppState.applyBalance(it.balanceCents) }
    }

    Scaffold(containerColor = ScreenBg) { padding ->
        Column(
            Modifier.fillMaxSize().padding(padding).padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            when (val s = state) {
                null -> {
                    CircularProgressIndicator(color = BrandGreen)
                    Spacer(Modifier.height(18.dp))
                    Text("Sending…", color = TextSecondary)
                }
                is TransferResult.Ok -> {
                    Box(
                        Modifier.size(72.dp).clip(CircleShape).background(BrandGreen),
                        contentAlignment = Alignment.Center,
                    ) { Text("✓", color = Color.White, fontSize = 36.sp, fontWeight = FontWeight.Bold) }
                    Spacer(Modifier.height(20.dp))
                    Text(
                        "Ksh ${Msisdn.money(s.sentCents)} sent to ${s.recipientName}",
                        fontSize = 18.sp, fontWeight = FontWeight.Bold, color = TextPrimary,
                        textAlign = TextAlign.Center,
                    )
                    Spacer(Modifier.height(8.dp))
                    Text("New M-PESA balance is Ksh ${Msisdn.money(s.balanceCents)}", color = TextSecondary)
                    if (s.idempotent) {
                        Spacer(Modifier.height(8.dp))
                        // The first attempt HAD gone through; this reply is the server telling us so.
                        // Saying it plainly stops the sender wondering whether they sent twice.
                        Text("This transfer had already gone through — it was not sent twice.",
                            color = TextSecondary, fontSize = 13.sp, textAlign = TextAlign.Center)
                    }
                    Spacer(Modifier.height(28.dp))
                    Button(
                        onClick = { SendFlow.clear(); onDone() },
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = BrandGreen),
                        modifier = Modifier.fillMaxWidth().height(52.dp),
                    ) { Text("Done", fontWeight = FontWeight.SemiBold) }
                }
                is TransferResult.Failed -> {
                    Box(
                        Modifier.size(72.dp).clip(CircleShape).background(Danger),
                        contentAlignment = Alignment.Center,
                    ) { Text("!", color = Color.White, fontSize = 36.sp, fontWeight = FontWeight.Bold) }
                    Spacer(Modifier.height(20.dp))
                    Text(s.message, fontSize = 16.sp, color = TextPrimary, textAlign = TextAlign.Center)
                    Spacer(Modifier.height(28.dp))
                    Button(
                        onClick = { SendFlow.clear(); onDone() },
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = BrandGreen),
                        modifier = Modifier.fillMaxWidth().height(52.dp),
                    ) { Text("Close", fontWeight = FontWeight.SemiBold) }
                }
                TransferResult.Unknown -> {
                    Text("Couldn't confirm this transfer", fontSize = 17.sp, fontWeight = FontWeight.Bold, color = TextPrimary)
                    Spacer(Modifier.height(10.dp))
                    Text(
                        "The network dropped before we heard back. It may already have gone through — " +
                            "check again rather than sending a second time.",
                        color = TextSecondary, textAlign = TextAlign.Center,
                    )
                    Spacer(Modifier.height(24.dp))
                    Button(
                        // Same ref. The server settles which of the two it is.
                        onClick = { attempt++ },
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = BrandGreen),
                        modifier = Modifier.fillMaxWidth().height(52.dp),
                    ) { Text("Check again", fontWeight = FontWeight.SemiBold) }
                    Spacer(Modifier.height(10.dp))
                    Text(
                        "Close",
                        color = TextSecondary,
                        modifier = Modifier.clickable { SendFlow.clear(); onDone() }.padding(12.dp),
                    )
                }
            }
        }
    }
}
