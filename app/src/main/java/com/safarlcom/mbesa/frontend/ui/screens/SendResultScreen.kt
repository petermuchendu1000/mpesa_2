package com.safarlcom.mbesa.frontend.ui.screens

import android.content.Intent
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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ClipboardManager
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safarlcom.mbesa.frontend.R
import com.safarlcom.mbesa.frontend.data.AppState
import com.safarlcom.mbesa.frontend.data.Favourites
import com.safarlcom.mbesa.frontend.data.MarketerSession
import com.safarlcom.mbesa.frontend.data.Msisdn
import com.safarlcom.mbesa.frontend.data.Receipts
import com.safarlcom.mbesa.frontend.data.TransferResult
import com.safarlcom.mbesa.frontend.ui.SendFlow
import com.safarlcom.mbesa.frontend.ui.SendMode
import com.safarlcom.mbesa.frontend.ui.SendReceipt
import com.safarlcom.mbesa.frontend.ui.theme.BrandGreen
import com.safarlcom.mbesa.frontend.ui.theme.Danger
import com.safarlcom.mbesa.frontend.ui.theme.TextPrimary
import com.safarlcom.mbesa.frontend.ui.theme.TextSecondary

private val ScreenBg = Color(0xFFF2F3F5)
private val CardWhite = Color(0xFFFFFFFF)
private val ChipGrey = Color(0xFFEDEEF1)
private val PanelGrey = Color(0xFFF4F5F7)
private val AccentPink = Color(0xFFFF2A58)
private val AvatarRed = Color(0xFFC94A2B)
private val RuleBlue = Color(0xFF1E9BE0)

/**
 * SENDING / RESULT — where the transfer actually happens, and the confirmation it produces.
 *
 * It owns the call so the screens before it stay pure: Confirm collects, this one commits. The
 * attempt runs once on arrival, and a retry REUSES [SendFlow.ref] — never a fresh one — so the
 * server's replay path can tell "do this again" from "you already did this".
 *
 * A TIMEOUT IS NOT A FAILURE and is never shown as one. The server may have moved the money and
 * lost the reply, so [TransferResult.Unknown] offers a retry on the same ref, which either
 * completes the transfer or reports the completion that already happened. Telling the sender it
 * failed would invite them to send again — the exact mistake idempotency exists to prevent.
 *
 * THE CONFIRMATION PRINTS WHAT THE SERVER SAID. The code and the timestamp come from the transfer
 * response (invest254 migration 0205) and are stashed in [SendReceipt] so the receipt screen can be
 * opened, backed out of, and opened again without any of it being re-derived from this phone.
 */
@Composable
fun SendResultScreen(onDone: () -> Unit, onReceipt: () -> Unit) {
    // Already settled? Then this is a return trip from the receipt, not a fresh arrival. Re-sending
    // would be answered "already done" by the server and cost nothing but a pointless round trip —
    // and would fail outright if the sender has lost signal since. See SendReceipt.matches.
    var state by remember {
        mutableStateOf<TransferResult?>(if (SendReceipt.matches(SendFlow.ref)) SendReceipt.asOk() else null)
    }
    var attempt by remember { mutableStateOf(0) }
    val settled = state is TransferResult.Ok

    LaunchedEffect(attempt) {
        if (attempt == 0 && settled) return@LaunchedEffect
        // Nothing to send. Reached only when the process was killed and Navigation restored this
        // destination without the flow behind it — SendFlow is process-scoped state, not saved
        // state. Refusing here is the difference between a clear message and a request with an
        // empty phone and an empty ref, which the server would reject as a validation error the
        // sender cannot act on.
        if (SendFlow.recipientPhone.isBlank() || SendFlow.ref.isBlank()) {
            state = TransferResult.Failed("This transfer was interrupted. Start it again — nothing was sent.")
            return@LaunchedEffect
        }
        state = null
        val r = MarketerSession.transfer(
            phone = SendFlow.recipientPhone,
            amountCents = SendFlow.totalCents,
            chargeCents = SendFlow.chargeCents,
            ref = SendFlow.ref,
        )
        if (r is TransferResult.Ok) {
            // The wallet figure the server just returned is authoritative; apply it so Home and the
            // Send screen stop showing the pre-send balance.
            AppState.applyBalance(r.balanceCents)
            SendReceipt.record(r, SendFlow.recipientPhone, SendFlow.mode == SendMode.POCHI, SendFlow.ref)
        }
        state = r
    }

    when (val s = state) {
        is TransferResult.Ok -> SuccessScreen(s, onDone = onDone, onReceipt = onReceipt)
        else -> PendingOrFailed(s, onRetry = { attempt++ }, onDone = onDone)
    }
}

// ── The confirmation ──────────────────────────────────────────────────────────────────────────────

@Composable
private fun SuccessScreen(s: TransferResult.Ok, onDone: () -> Unit, onReceipt: () -> Unit) {
    val ctx = LocalContext.current
    val clipboard: ClipboardManager = LocalClipboardManager.current
    var copied by remember { mutableStateOf(false) }
    // Idempotent, and cheap. The Send screen attaches storage on the way in, but Navigation can
    // restore straight to this destination after a process death, and a favourites list with no
    // storage attached accepts an add and silently forgets it.
    LaunchedEffect(Unit) { Favourites.init(ctx) }
    // DERIVED, not remembered: Favourites.items is a snapshot list, so reading it here subscribes
    // this screen to it. A remembered boolean would have been seeded before init() attached storage
    // and then never corrected.
    val saved = Favourites.contains(SendReceipt.recipientPhone)
    var unavailable by remember { mutableStateOf<String?>(null) }

    val amountText = "Ksh ${Msisdn.money(s.sentCents)}"
    val shareText = buildString {
        append("M-PESA confirmation")
        if (s.code.isNotBlank()) append(" ${s.code}")
        append("\n$amountText sent to ${SendReceipt.recipientName.uppercase()}")
        append("\n${Receipts.stampLower(s.createdAtMs)}")
        append("\nTransaction cost: Ksh 0.00")
    }

    Scaffold(containerColor = ScreenBg) { padding ->
        Column(
            Modifier.fillMaxSize().padding(padding).padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(Modifier.height(8.dp))
            Row(Modifier.fillMaxWidth().height(48.dp), verticalAlignment = Alignment.CenterVertically) {
                Box(
                    Modifier.size(40.dp).clip(CircleShape).background(ChipGrey)
                        .clickable { SendFlow.clear(); SendReceipt.clear(); onDone() },
                    contentAlignment = Alignment.Center,
                ) { Text("✕", color = AccentPink, fontSize = 17.sp, fontWeight = FontWeight.Bold) }
                Spacer(Modifier.weight(1f))
                Row(
                    Modifier.clip(RoundedCornerShape(22.dp)).background(ChipGrey)
                        .clickable {
                            // A real share sheet with the real figures. Nothing here is composed to
                            // look like a Safaricom SMS: the code and time are the server's, and the
                            // text says what it is rather than impersonating a confirmation message.
                            runCatching {
                                ctx.startActivity(Intent.createChooser(
                                    Intent(Intent.ACTION_SEND).apply {
                                        type = "text/plain"
                                        putExtra(Intent.EXTRA_TEXT, shareText)
                                    }, "Share transaction details"))
                            }
                        }
                        .padding(horizontal = 14.dp, vertical = 10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(painterResource(R.drawable.icon_sfc_share_details), null, Modifier.size(18.dp))
                    Spacer(Modifier.width(8.dp))
                    Text("Share Details", color = TextPrimary, fontSize = 14.sp, fontWeight = FontWeight.Medium)
                }
            }

            Spacer(Modifier.height(16.dp))

            Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.TopCenter) {
                Column(
                    Modifier.fillMaxWidth().padding(top = 34.dp).clip(RoundedCornerShape(16.dp)).background(CardWhite),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Box(
                        Modifier.fillMaxWidth().height(3.dp)
                            .background(Brush.horizontalGradient(listOf(RuleBlue, BrandGreen))),
                    )
                    Spacer(Modifier.height(42.dp))
                    Text(
                        "Your transaction was successful",
                        fontSize = 21.sp, fontWeight = FontWeight.Medium, color = TextPrimary,
                        textAlign = TextAlign.Center, modifier = Modifier.padding(horizontal = 28.dp),
                    )
                    Spacer(Modifier.height(10.dp))
                    Text(Receipts.stampLower(s.createdAtMs), color = TextSecondary, fontSize = 13.sp)
                    Spacer(Modifier.height(14.dp))
                    Text(amountText, fontSize = 27.sp, fontWeight = FontWeight.Bold, color = TextPrimary)
                    Spacer(Modifier.height(6.dp))
                    // No fee exists in this product, on any amount. Stated rather than omitted: a
                    // payment screen silent about cost invites the reader to assume one is hidden.
                    Row {
                        Text("Transaction cost:", color = TextSecondary, fontSize = 13.sp)
                        Text("Ksh 0.00", color = TextPrimary, fontSize = 13.sp, fontWeight = FontWeight.SemiBold)
                    }

                    if (s.code.isNotBlank()) {
                        Spacer(Modifier.height(12.dp))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text("ID: ", color = TextSecondary, fontSize = 14.sp)
                            Text(s.code, color = BrandGreen, fontSize = 14.sp, fontWeight = FontWeight.Bold)
                            Spacer(Modifier.width(10.dp))
                            Row(
                                Modifier.clip(RoundedCornerShape(8.dp))
                                    .clickable {
                                        clipboard.setText(AnnotatedString(s.code))
                                        copied = true
                                    }
                                    .padding(horizontal = 4.dp, vertical = 2.dp),
                                verticalAlignment = Alignment.CenterVertically,
                            ) {
                                Image(painterResource(R.drawable.icon_sfc_copy), null, Modifier.size(16.dp))
                                Spacer(Modifier.width(5.dp))
                                Text(if (copied) "Copied" else "Copy", color = BrandGreen, fontSize = 14.sp)
                            }
                        }
                    }

                    if (s.idempotent) {
                        Spacer(Modifier.height(10.dp))
                        // The first attempt HAD gone through; this reply is the server telling us so.
                        // Saying it plainly stops the sender wondering whether they sent twice.
                        Text(
                            "This transfer had already gone through — it was not sent twice.",
                            color = TextSecondary, fontSize = 12.sp, textAlign = TextAlign.Center,
                            modifier = Modifier.padding(horizontal = 24.dp),
                        )
                    }

                    Spacer(Modifier.height(18.dp))
                    Column(
                        Modifier.fillMaxWidth().padding(horizontal = 14.dp)
                            .clip(RoundedCornerShape(12.dp)).background(PanelGrey)
                            .padding(horizontal = 14.dp, vertical = 14.dp),
                    ) {
                        Text(if (SendReceipt.pochi) "Paid to:" else "Send to:", color = TextSecondary, fontSize = 12.sp)
                        Spacer(Modifier.height(10.dp))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Box(
                                Modifier.size(40.dp).clip(CircleShape).background(AvatarRed),
                                contentAlignment = Alignment.Center,
                            ) {
                                Text(
                                    initialsOf(SendReceipt.recipientName),
                                    color = Color.White, fontWeight = FontWeight.Bold, fontSize = 14.sp,
                                )
                            }
                            Spacer(Modifier.width(12.dp))
                            Column {
                                Text(
                                    SendReceipt.recipientName.uppercase(),
                                    color = TextPrimary, fontSize = 14.sp, fontWeight = FontWeight.SemiBold,
                                )
                                Spacer(Modifier.height(2.dp))
                                Row {
                                    Text("Phone number:", color = TextSecondary, fontSize = 13.sp)
                                    // In full, not masked: the sender typed this number a minute
                                    // ago. The RECEIPT masks it, because the receipt gets shared.
                                    Text(SendReceipt.recipientPhone, color = TextPrimary, fontSize = 13.sp)
                                }
                            }
                        }
                    }
                    Spacer(Modifier.height(18.dp))
                }

                Box(
                    Modifier.size(68.dp).clip(CircleShape).background(CardWhite)
                        .border(1.dp, ChipGrey, CircleShape),
                    contentAlignment = Alignment.Center,
                ) { Text("🎉", fontSize = 30.sp) }
            }

            Spacer(Modifier.weight(1f))

            Row(
                Modifier.fillMaxWidth().padding(bottom = 10.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.Top,
            ) {
                ActionTile(
                    R.drawable.icon_sfc_add_favourites,
                    if (saved) "Saved to favourites" else "Add to favourites",
                    enabled = !saved,
                ) { Favourites.add(SendReceipt.recipientName, SendReceipt.recipientPhone) }
                // Both of these are drawn, dimmed, and explain themselves on a tap. They are on the
                // reference screen and leaving them out would make this screen read as a different
                // product; pretending they work would be worse. See docs/64 — a reversal is a
                // clawback that this platform's owner has not decided to allow, and a scheduled
                // payment needs a server-side scheduler that does not exist.
                ActionTile(R.drawable.icon_sfc_reverse_transaction, "Reverse transaction", enabled = false) {
                    unavailable = "Reversing a transfer would take money back out of another marketer's " +
                        "wallet after they have been told it arrived. It isn't available here — ask an " +
                        "administrator if a transfer needs undoing."
                }
                ActionTile(R.drawable.icon_sfc_schedule_payment, "Schedule payment", enabled = false) {
                    unavailable = "Scheduled payments aren't available yet. A transfer is sent the moment " +
                        "you confirm it."
                }
                ActionTile(R.drawable.icon_sfc_download_receipt, "Download receipt", enabled = true) { onReceipt() }
            }
            Spacer(Modifier.height(8.dp))
        }
    }

    unavailable?.let { message ->
        AlertDialog(
            onDismissRequest = { unavailable = null },
            confirmButton = { TextButton(onClick = { unavailable = null }) { Text("OK", color = BrandGreen) } },
            title = { Text("Not available", fontWeight = FontWeight.SemiBold) },
            text = { Text(message, color = TextSecondary) },
            containerColor = CardWhite,
        )
    }
}

@Composable
private fun ActionTile(iconRes: Int, label: String, enabled: Boolean, onClick: () -> Unit) {
    Column(
        Modifier.width(78.dp).clip(RoundedCornerShape(12.dp)).clickable(onClick = onClick).padding(vertical = 4.dp)
            // Dimmed BEFORE the tap, not only explained after it: an control that looks live and
            // then refuses is a worse answer than one that looks unavailable and says why.
            .alpha(if (enabled) 1f else 0.45f),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Box(
            Modifier.size(46.dp).clip(CircleShape).background(ChipGrey),
            contentAlignment = Alignment.Center,
        ) { Image(painterResource(iconRes), null, Modifier.size(22.dp)) }
        Spacer(Modifier.height(7.dp))
        Text(label, fontSize = 11.sp, color = TextSecondary, textAlign = TextAlign.Center, lineHeight = 14.sp)
    }
}

// ── Still going, or it did not go ─────────────────────────────────────────────────────────────────

@Composable
private fun PendingOrFailed(s: TransferResult?, onRetry: () -> Unit, onDone: () -> Unit) {
    Scaffold(containerColor = ScreenBg) { padding ->
        Column(
            Modifier.fillMaxSize().padding(padding).padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            when (s) {
                null -> {
                    CircularProgressIndicator(color = BrandGreen)
                    Spacer(Modifier.height(18.dp))
                    Text("Sending…", color = TextSecondary)
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
                        onClick = { SendFlow.clear(); SendReceipt.clear(); onDone() },
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
                        onClick = onRetry,
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = BrandGreen),
                        modifier = Modifier.fillMaxWidth().height(52.dp),
                    ) { Text("Check again", fontWeight = FontWeight.SemiBold) }
                    Spacer(Modifier.height(10.dp))
                    Text(
                        "Close",
                        color = TextSecondary,
                        modifier = Modifier.clickable { SendFlow.clear(); SendReceipt.clear(); onDone() }.padding(12.dp),
                    )
                }
                is TransferResult.Ok -> Unit   // handled by SuccessScreen
            }
        }
    }
}
