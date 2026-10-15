package com.safarlcom.mbesa.frontend.ui.screens

import android.content.Intent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
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
import androidx.compose.ui.geometry.Size
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
import com.safarlcom.mbesa.frontend.data.Receipts
import com.safarlcom.mbesa.frontend.ui.SendReceipt
import com.safarlcom.mbesa.frontend.ui.theme.BrandGreen
import com.safarlcom.mbesa.frontend.ui.theme.BrandGreenLight
import com.safarlcom.mbesa.frontend.ui.theme.TextPrimary
import com.safarlcom.mbesa.frontend.ui.theme.TextSecondary

private val PageWhite = Color(0xFFFFFFFF)
private val PanelGreen = Color(0xFF2FA84F)
private val HairLine = Color(0xFFE4E6EA)
private val FooterInk = Color(0xFF4A4A4A)
private val ForYouInk = Color(0xFF2B2B2B)

/**
 * THE PRINTED RECEIPT — a 1:1 rebuild of the reference page.
 *
 * Everything factual on it is read from [SendReceipt], which holds the SERVER's answers
 * (confirmation code, commit time, amount moved, the name of the marketer actually credited).
 * Nothing is recomputed here, because a receipt that derives its own facts is not evidence of
 * anything.
 *
 * ON FIDELITY. An earlier revision of this screen left out the tax-register marking and the
 * operator's registered address, care number and corporate lockup, and carried a banner saying the
 * transfer was simulated — on the reasoning that this is the one artifact of the flow designed to
 * leave the handset, and that a page carrying a real operator's authenticity markings would not
 * merely LOOK like proof of a real payment to whoever holds the screenshot. That concern was put to
 * the owner, who asked for the reference reproduced exactly; it is their product and their call, and
 * the reasoning on both sides is kept in invest254 docs/64 §5 rather than re-argued here.
 *
 * The one thing that still differs from the confirmation screen is the masking: the party paid is
 * shown `079866***061`, which is what the reference page itself prints. On the confirmation screen
 * the number is whole, because there it is a number the sender typed a minute earlier.
 */
@Composable
fun SendReceiptScreen(onBack: () -> Unit) {
    val ctx = LocalContext.current
    val r = SendReceipt
    val senderName = AppState.fullName
    val senderPhone = MarketerSession.loginPhone ?: AppState.phone

    val plainText = buildString {
        append("M-PESA RECEIPT\n\n")
        append("Total amount paid: KES ${Receipts.kes(r.amountCents)}\n")
        append("Date: ${Receipts.stampUpper(r.createdAtMs)}\n")
        append("Sent to: ${r.recipientName.uppercase()}\n")
        if (r.code.isNotBlank()) append("Transaction no: ${r.code}\n")
        append("Payment type: ${if (r.pochi) "Pochi la Biashara" else "Send Money"}\n")
        append("Phone number: ${Receipts.maskForPrint(r.recipientPhone)}")
    }
    val share = {
        runCatching {
            ctx.startActivity(Intent.createChooser(
                Intent(Intent.ACTION_SEND).apply {
                    type = "text/plain"
                    putExtra(Intent.EXTRA_TEXT, plainText)
                }, "Share receipt"))
        }
        Unit
    }

    Scaffold(containerColor = PageWhite) { padding ->
        Column(Modifier.fillMaxSize().padding(padding)) {
            // Top bar: back on the left, the title centred, and the reference's PAIR of round
            // actions on the right — the statement glyph and the export arrow.
            Row(
                Modifier.fillMaxWidth().padding(horizontal = 10.dp, vertical = 8.dp).height(44.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Box(
                    Modifier.size(40.dp).clip(CircleShape).clickable(onClick = onBack),
                    contentAlignment = Alignment.Center,
                ) { Icon(Icons.AutoMirrored.Filled.ArrowBack, "Back", tint = TextPrimary) }
                Spacer(Modifier.weight(1f))
                Text("Mpesa Receipt", fontSize = 17.sp, fontWeight = FontWeight.SemiBold, color = TextPrimary)
                Spacer(Modifier.weight(1f))
                RoundAction(R.drawable.icon_sfc_download_receipt, "Receipt details", onClick = share)
                Spacer(Modifier.width(8.dp))
                RoundAction(R.drawable.icon_sfc_share_details, "Share receipt", onClick = share)
            }
            Box(Modifier.fillMaxWidth().height(1.dp).background(HairLine))

            Column(
                Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(horizontal = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Spacer(Modifier.height(16.dp))
                // The brand lockup, top-left on its own card, as the reference has it.
                Row(
                    Modifier.align(Alignment.Start).clip(RoundedCornerShape(4.dp))
                        .background(PageWhite).padding(end = 10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(painterResource(R.drawable.ic_mpesa_mark), null, Modifier.size(34.dp))
                    Spacer(Modifier.width(8.dp))
                    Row {
                        Text("M-", fontSize = 17.sp, fontWeight = FontWeight.Bold, color = Color(0xFF1A1A1A))
                        Text("PESA", fontSize = 17.sp, fontWeight = FontWeight.Bold, color = BrandGreen)
                    }
                }

                Spacer(Modifier.height(20.dp))
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
                            "KES ${Receipts.kes(r.amountCents)}",
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
                Spacer(Modifier.height(10.dp))
                Text("ETR", fontSize = 11.sp, color = BrandGreen, fontWeight = FontWeight.SemiBold)

                Spacer(Modifier.height(20.dp))
                Text(
                    "Question? Comment? Feel free to get in touch!",
                    fontSize = 12.sp, color = BrandGreen, textAlign = TextAlign.Center,
                )
                Spacer(Modifier.height(12.dp))
                Text("Safaricom House Waiyaki Way", fontSize = 11.sp, color = FooterInk)
                Spacer(Modifier.height(3.dp))
                Text("P.O Box 66827 – 00800, Nairobi", fontSize = 11.sp, color = FooterInk)
                Spacer(Modifier.height(3.dp))
                Text("+254 722 003 272", fontSize = 11.sp, color = FooterInk)

                Spacer(Modifier.height(22.dp))
                Text(
                    "Simple • Transparent • Honest",
                    fontSize = 11.sp, color = BrandGreen, fontWeight = FontWeight.Bold,
                )
                Spacer(Modifier.height(2.dp))
                Text(
                    "FOR YOU",
                    fontSize = 27.sp, color = ForYouInk, fontWeight = FontWeight.Bold,
                    letterSpacing = 1.sp,
                )

                Spacer(Modifier.height(18.dp))
                Box(Modifier.fillMaxWidth().height(1.5.dp).background(BrandGreen))
                Spacer(Modifier.height(12.dp))
                Row(
                    Modifier.align(Alignment.End),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(painterResource(R.drawable.ic_safaricom_mark), null, Modifier.size(width = 40.dp, height = 30.dp))
                    Spacer(Modifier.width(6.dp))
                    Text("Safaricom", fontSize = 19.sp, color = BrandGreen, fontWeight = FontWeight.Bold)
                }
                Spacer(Modifier.height(28.dp))
            }
        }
    }
}

/** One of the pair of round actions in the title bar. */
@Composable
private fun RoundAction(iconRes: Int, label: String, onClick: () -> Unit) {
    Box(
        Modifier.size(38.dp).clip(CircleShape).background(BrandGreenLight).clickable(onClick = onClick),
        contentAlignment = Alignment.Center,
    ) { Image(painterResource(iconRes), label, Modifier.size(18.dp)) }
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
                    size = Size(w, size.height),
                )
            }
            x += w + unit * 0.6f
        }
    }
}
