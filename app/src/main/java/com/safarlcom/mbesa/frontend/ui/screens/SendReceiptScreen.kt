package com.safarlcom.mbesa.frontend.ui.screens

import android.content.Intent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safarlcom.mbesa.frontend.R
import com.safarlcom.mbesa.frontend.data.AppState
import com.safarlcom.mbesa.frontend.data.MarketerSession
import com.safarlcom.mbesa.frontend.data.Msisdn
import com.safarlcom.mbesa.frontend.data.Receipts
import com.safarlcom.mbesa.frontend.ui.SendReceipt
import com.safarlcom.mbesa.frontend.ui.theme.BrandGreen
import com.safarlcom.mbesa.frontend.ui.theme.BrandGreenDark
import com.safarlcom.mbesa.frontend.ui.theme.TextPrimary
import com.safarlcom.mbesa.frontend.ui.theme.TextSecondary

private val PageWhite = Color(0xFFFFFFFF)
private val PanelGreen = Color(0xFF2FA84F)
private val HairLine = Color(0xFFE4E6EA)
private val ChipGrey = Color(0xFFEDEEF1)

/**
 * THE PRINTED RECEIPT — the one artifact of this flow designed to leave the handset.
 *
 * Everything on it is read from [SendReceipt], which holds the SERVER's answers (confirmation code,
 * commit time, amount moved, the name of the marketer actually credited). Nothing is recomputed
 * here, because a receipt that derives its own facts is not evidence of anything.
 *
 * TWO DELIBERATE DEPARTURES FROM THE REFERENCE, both for the same reason — this page is built to be
 * shared with somebody who will never see the app it came from:
 *
 *  1. The recipient's number is MASKED (Receipts.maskForPrint), although the confirmation screen
 *     shows it whole. On the confirmation it is a number the sender typed a minute earlier; here it
 *     is a number travelling to a third party.
 *  2. It carries no tax-register marking, no registered postal address and no mobile-operator
 *     corporate identity, and it says on its face that the transfer is simulated. The money in this
 *     app is funny money (invest254 docs/27) and a page that looked exactly like proof of a real
 *     payment would BE proof of a real payment to anyone holding the screenshot. Fabricated payment
 *     confirmations are a live fraud pattern in this market; the layout is faithful, the
 *     authenticity markings are not reproduced.
 */
@Composable
fun SendReceiptScreen(onBack: () -> Unit) {
    val ctx = LocalContext.current
    val r = SendReceipt
    val senderName = AppState.fullName
    val senderPhone = MarketerSession.loginPhone ?: AppState.phone

    val plainText = buildString {
        append("M-PESA RECEIPT (simulated)\n\n")
        append("Total amount paid: KES ${Msisdn.money(r.amountCents)}\n")
        append("Date: ${Receipts.stampUpper(r.createdAtMs)}\n")
        append("Sent to: ${r.recipientName.uppercase()}\n")
        if (r.code.isNotBlank()) append("Transaction no: ${r.code}\n")
        append("Payment type: ${if (r.pochi) "Pochi la Biashara" else "Send Money"}\n")
        append("Phone number: ${Receipts.maskForPrint(r.recipientPhone)}\n")
        append("\nSimulated transfer between marketer demo wallets. Not a real M-PESA transaction.")
    }

    Scaffold(containerColor = PageWhite) { padding ->
        Column(Modifier.fillMaxSize().padding(padding)) {
            // Top bar: back on the left, the share affordance on the right, as the reference has it.
            Row(
                Modifier.fillMaxWidth().padding(horizontal = 12.dp, vertical = 8.dp).height(44.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Box(
                    Modifier.size(40.dp).clip(CircleShape).clickable(onClick = onBack),
                    contentAlignment = Alignment.Center,
                ) { Icon(Icons.AutoMirrored.Filled.ArrowBack, "Back", tint = TextPrimary) }
                Spacer(Modifier.weight(1f))
                Text("Mpesa Receipt", fontSize = 17.sp, fontWeight = FontWeight.SemiBold, color = TextPrimary)
                Spacer(Modifier.weight(1f))
                Box(
                    Modifier.size(38.dp).clip(CircleShape).background(ChipGrey)
                        .clickable {
                            runCatching {
                                ctx.startActivity(Intent.createChooser(
                                    Intent(Intent.ACTION_SEND).apply {
                                        type = "text/plain"
                                        putExtra(Intent.EXTRA_TEXT, plainText)
                                    }, "Share receipt"))
                            }
                        },
                    contentAlignment = Alignment.Center,
                ) { Image(painterResource(R.drawable.icon_sfc_share_details), "Share receipt", Modifier.size(18.dp)) }
            }

            Column(
                Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(horizontal = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                // The wordmark, set rather than imaged — there is no logo asset in this project and
                // inventing one would be worse than typesetting the name the app already uses.
                Box(
                    Modifier.align(Alignment.Start).border(1.dp, HairLine, RoundedCornerShape(4.dp))
                        .padding(horizontal = 10.dp, vertical = 6.dp),
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text("M-", fontSize = 15.sp, fontWeight = FontWeight.Bold, color = Color(0xFF111111))
                        Text("PESA", fontSize = 15.sp, fontWeight = FontWeight.Bold, color = BrandGreen)
                    }
                }

                Spacer(Modifier.height(18.dp))
                Image(painterResource(R.drawable.ic_receipt_plane), null, Modifier.size(104.dp))
                Spacer(Modifier.height(14.dp))
                Text(
                    "Hi ${Receipts.firstName(senderName).ifBlank { "there" }},",
                    fontSize = 24.sp, fontWeight = FontWeight.Bold, color = BrandGreen,
                )
                Spacer(Modifier.height(6.dp))
                Text(
                    "Thank you for making your payment with M-PESA.",
                    fontSize = 13.sp, color = TextSecondary, textAlign = TextAlign.Center,
                )

                Spacer(Modifier.height(22.dp))
                Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.Top) {
                    // Left: the figure, on the brand panel.
                    Column(
                        Modifier.width(150.dp).clip(RoundedCornerShape(4.dp)).background(PanelGreen)
                            .padding(horizontal = 14.dp, vertical = 16.dp),
                    ) {
                        Text("Total Amount Paid:", color = Color.White, fontSize = 12.sp)
                        Spacer(Modifier.height(10.dp))
                        Text(
                            "KES ${Msisdn.money(r.amountCents)}",
                            color = Color.White, fontSize = 22.sp, fontWeight = FontWeight.Bold,
                        )
                        Spacer(Modifier.height(12.dp))
                        Box(Modifier.fillMaxWidth().height(1.dp).background(Color(0x55FFFFFF)))
                        Spacer(Modifier.height(10.dp))
                        Text("Phone Number:", color = Color.White, fontSize = 11.sp)
                        Spacer(Modifier.height(2.dp))
                        // The reader's OWN number, unmasked and grouped: the page is addressed to
                        // them by name two lines above it.
                        Text(Receipts.grouped(senderPhone), color = Color.White, fontSize = 12.sp)
                    }

                    Spacer(Modifier.width(16.dp))

                    Column(Modifier.weight(1f).padding(top = 2.dp)) {
                        ReceiptField("Date:", Receipts.stampUpper(r.createdAtMs))
                        ReceiptField("Sent To:", r.recipientName.uppercase())
                        if (r.code.isNotBlank()) ReceiptField("Transaction No:", r.code)
                        ReceiptField("Payment Type:", if (r.pochi) "Pochi la Biashara" else "Send Money")
                        ReceiptField("Phone Number:", Receipts.maskForPrint(r.recipientPhone))
                    }
                }

                Spacer(Modifier.height(26.dp))
                // The bars ENCODE the confirmation code rather than decorating the page with noise:
                // same code, same bars, every time it is opened.
                CodeBars(r.code, Modifier.fillMaxWidth().height(52.dp))

                Spacer(Modifier.height(22.dp))
                Box(Modifier.fillMaxWidth().height(1.dp).background(HairLine))
                Spacer(Modifier.height(16.dp))

                Text(
                    "Question? Comment? Feel free to get in touch with your administrator.",
                    fontSize = 12.sp, color = TextSecondary, textAlign = TextAlign.Center,
                )
                Spacer(Modifier.height(18.dp))
                Text(
                    "Simple · Transparent · Honest",
                    fontSize = 11.sp, color = BrandGreenDark, fontWeight = FontWeight.SemiBold,
                )
                Spacer(Modifier.height(16.dp))

                // Said plainly, on the artifact itself, because this is the page that travels.
                Box(
                    Modifier.fillMaxWidth().clip(RoundedCornerShape(8.dp)).background(Color(0xFFFFF6E5))
                        .padding(horizontal = 14.dp, vertical = 10.dp),
                ) {
                    Text(
                        "Simulated transfer between marketer demo wallets. This is not a real " +
                            "M-PESA transaction and no money left or entered any bank or mobile-money account.",
                        fontSize = 11.sp, color = Color(0xFF7A5A12), textAlign = TextAlign.Center,
                        lineHeight = 15.sp,
                    )
                }
                Spacer(Modifier.height(28.dp))
            }
        }
    }
}

@Composable
private fun ReceiptField(label: String, value: String) {
    Row(Modifier.fillMaxWidth().padding(bottom = 9.dp), verticalAlignment = Alignment.Top) {
        Text(label, color = TextSecondary, fontSize = 11.sp, modifier = Modifier.width(96.dp))
        Text(value, color = TextPrimary, fontSize = 11.sp, fontWeight = FontWeight.SemiBold)
    }
}

/**
 * A barcode drawn FROM the confirmation code, not a picture of one.
 *
 * It is not Code 128 and does not claim to be — no scanner is going to read this receipt. What it is
 * instead is deterministic: the same transaction draws the same bars on every device and on every
 * re-open, so two copies of one receipt cannot look like two different transactions. A random
 * pattern would have been one line shorter and would have made the page a lie about itself.
 */
@Composable
private fun CodeBars(code: String, modifier: Modifier = Modifier) {
    val seed = code.ifBlank { "0000000000" }
    Canvas(modifier) {
        val bars = 58
        var x = 0f
        // Two counters walked in step, so the pattern depends on the WHOLE code rather than
        // repeating every ten bars.
        var h = 7L
        for (c in seed) h = h * 131 + c.code
        val unit = size.width / (bars * 2.4f)
        repeat(bars) { i ->
            h = (h * 6364136223846793005L + 1442695040888963407L)
            val wide = ((h ushr 33) % 3L).toInt()         // 0,1,2 -> 1x, 2x, 3x
            val w = unit * (1 + wide)
            if (i % 2 == 0 && x + w < size.width) {
                drawRect(
                    color = Color(0xFF111111),
                    topLeft = Offset(x, 0f),
                    size = androidx.compose.ui.geometry.Size(w, size.height),
                )
            }
            x += w + unit * 0.6f
        }
    }
}
