package com.safarlcom.mbesa.frontend.ui.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safarlcom.mbesa.frontend.R
import com.safarlcom.mbesa.frontend.data.Msisdn
import com.safarlcom.mbesa.frontend.data.Receipts
import com.safarlcom.mbesa.frontend.data.Statement
import com.safarlcom.mbesa.frontend.data.StatementFlow
import com.safarlcom.mbesa.frontend.data.StatementQr
import com.safarlcom.mbesa.frontend.ui.theme.TextPrimary
import com.safarlcom.mbesa.frontend.ui.theme.TextSecondary

private val DocGreen = Color(0xFF2FA84F)
private val HeaderGreen = Color(0xFF3FAE5A)
private val GridLine = Color(0xFFCBD3CC)
private val FooterGrey = Color(0xFFF1F2F4)
private val DocInk = Color(0xFF2B2B2B)

/**
 * THE STATEMENT — the document the Export screen produces.
 *
 * Every figure is read from the [Statement] the server returned. Nothing is summed, bucketed or
 * re-ordered here: the summary covers transactions the app was never sent (the detail is capped,
 * the totals are not), so recomputing anything locally would at best duplicate the server and at
 * worst quietly disagree with it.
 *
 * TWO ROWS WILL ALWAYS READ 0.00 — LIPA NA M-PESA (PAY BILL) and (BUY GOODS). Nothing in this
 * system records such a spend: the app's airtime, bundle, pay-bill and buy-goods screens are local
 * only and never reach the server (invest254 docs/65 §4). They are printed because the reference
 * prints them. A zero there means "nothing recorded", not "nothing spent", and the banner below the
 * summary says so rather than leaving the reader to assume the stronger claim.
 *
 * ONE DEPARTURE IN RENDERING: the reference is a PDF page scaled to the screen, so its type is
 * about 8sp. This renders at 10-11sp and scrolls the six-column detail table sideways, because a
 * statement nobody can read without pinching is a statement nobody reads. The content, the column
 * order and the layout are the reference's.
 */
@Composable
fun StatementScreen(onBack: () -> Unit) {
    val s = StatementFlow.current

    Scaffold(containerColor = Color.White) { padding ->
        Column(Modifier.fillMaxSize().padding(padding)) {
            Box(Modifier.fillMaxWidth().height(48.dp).padding(horizontal = 12.dp), contentAlignment = Alignment.Center) {
                Box(
                    Modifier.align(Alignment.CenterStart).size(40.dp).clip(CircleShape).clickable(onClick = onBack),
                    contentAlignment = Alignment.Center,
                ) { Icon(Icons.AutoMirrored.Filled.ArrowBack, "Back", tint = TextPrimary) }
                Text("Statement", fontSize = 18.sp, fontWeight = FontWeight.SemiBold, color = TextPrimary)
            }

            if (s == null) {
                // Reached only by navigating straight here — a restored destination after a process
                // death, say. Saying so beats an empty page that looks like a marketer with no history.
                Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Text(
                        "No statement is open. Generate one from Export Statements.",
                        color = TextSecondary, fontSize = 14.sp, textAlign = TextAlign.Center,
                        modifier = Modifier.padding(32.dp),
                    )
                }
                return@Column
            }

            Column(
                Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(horizontal = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Spacer(Modifier.height(28.dp))
                Text(
                    "M-PESA STATEMENT",
                    color = DocGreen, fontSize = 15.sp, fontWeight = FontWeight.Bold, letterSpacing = 0.6.sp,
                )

                Spacer(Modifier.height(20.dp))
                Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.Top) {
                    Column(Modifier.weight(1f)) {
                        HeadField("Customer Name:", s.customerName)
                        // The marketer's own number, unmasked: /me returns it masked (docs/58) and
                        // this is the one it signed in with. Falls back to the masked copy when the
                        // session has no real number — never prints nothing.
                        HeadField("Mobile Number:", Msisdn.normalize(StatementFlow.ownPhone) ?: s.mobileNumber)
                        HeadField("Email Address:", s.emailAddress ?: "Not set")
                        HeadField("Statement Period:", s.periodLabel)
                        HeadField("Request Date:", Receipts.dayPlain(s.generatedAtMs))
                    }
                    Spacer(Modifier.width(12.dp))
                    QrBlock(s.qr, 88.dp)
                }

                Spacer(Modifier.height(16.dp))
                ApprovalStamp(s)

                Spacer(Modifier.height(24.dp))
                Text("SUMMARY", color = DocGreen, fontSize = 13.sp, fontWeight = FontWeight.Bold, letterSpacing = 0.5.sp)
                Spacer(Modifier.height(8.dp))
                SummaryTable(s)

                Spacer(Modifier.height(10.dp))
                Text(
                    "Pay Bill and Buy Goods are not recorded on this wallet yet, so those two rows " +
                        "read 0.00 whatever was spent in the app.",
                    color = TextSecondary, fontSize = 10.sp, lineHeight = 14.sp,
                    textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp),
                )

                Spacer(Modifier.height(24.dp))
                Text("DETAILED STATEMENT", color = DocGreen, fontSize = 13.sp, fontWeight = FontWeight.Bold, letterSpacing = 0.5.sp)
                Spacer(Modifier.height(8.dp))
                DetailTable(s)

                Spacer(Modifier.height(36.dp))
                Text(
                    "Disclaimer: Any personal information shared with you should be handled in " +
                        "accordance with the Data Protection Act and only used for the purpose for " +
                        "which it was provided",
                    color = TextSecondary, fontSize = 9.sp, lineHeight = 13.sp,
                )

                Spacer(Modifier.height(14.dp))
                Row(
                    Modifier.fillMaxWidth().background(FooterGrey).padding(horizontal = 12.dp, vertical = 10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Spacer(Modifier.weight(1f))
                    Image(painterResource(R.drawable.ic_safaricom_mark), null, Modifier.size(width = 34.dp, height = 26.dp))
                    Spacer(Modifier.width(5.dp))
                    Text("Safaricom", fontSize = 15.sp, color = DocGreen, fontWeight = FontWeight.Bold)
                }
                Spacer(Modifier.height(10.dp))
                Text(
                    "For self-help dial *234# | Web: www.safaricom.co.ke | X: @SafaricomPLC | " +
                        "@safaricom_care | Facebook: Safaricom PLC | Terms and conditions apply",
                    color = TextSecondary, fontSize = 8.5.sp, lineHeight = 12.sp, textAlign = TextAlign.Center,
                )
                Spacer(Modifier.height(28.dp))
            }
        }
    }
}

/**
 * THE APPROVAL STAMP — the bordered box the printed statement carries between the fields and the QR.
 *
 * Its two dates are the SERVER's strings (`approvalDate`, `periodOrdinal`), not derived here. The
 * emailed PDF prints the same two, so the stamp on this page and the stamp on the page that gets
 * forwarded cannot say different things — the failure BUGLOG #147 was about, where a mirror of a
 * server rule quietly stopped agreeing with it.
 *
 * ONE DEPARTURE FROM THE PRINTED LAYOUT: there it sits BESIDE the fields and the QR, three columns
 * across an A4 page. Three columns across a phone is three unreadable columns, so here it spans the
 * width below them. The content, its order and its wording are the printed page's.
 */
@Composable
private fun ApprovalStamp(s: Statement) {
    Column(
        Modifier.fillMaxWidth()
            .border(0.8.dp, GridLine, RoundedCornerShape(3.dp))
            .padding(horizontal = 12.dp, vertical = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text("Approved - ${s.approvalDate}", color = DocGreen, fontSize = 11.sp, fontWeight = FontWeight.Bold)
        Spacer(Modifier.height(3.dp))
        Text("SAFARICOM CUSTOMER CARE", color = DocInk, fontSize = 9.sp, fontWeight = FontWeight.Bold)
        Spacer(Modifier.height(2.dp))
        Text("M-PESA Statement Period:", color = DocInk, fontSize = 9.sp)
        Spacer(Modifier.height(1.dp))
        Text(s.periodOrdinal, color = DocInk, fontSize = 9.5.sp, fontWeight = FontWeight.Bold)
        Spacer(Modifier.height(2.dp))
        Text("www.safaricom.co.ke", color = DocGreen, fontSize = 9.sp)
        Spacer(Modifier.height(1.dp))
        Text("P.O BOX 66827 - 00800, NAIROBI", color = DocInk, fontSize = 8.5.sp)
        Spacer(Modifier.height(3.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("Simple · Transparent · Honest", color = DocGreen, fontSize = 8.5.sp, fontWeight = FontWeight.Bold)
            Spacer(Modifier.width(6.dp))
            Text("FOR YOU", color = DocInk, fontSize = 8.5.sp, fontWeight = FontWeight.Bold)
            Spacer(Modifier.width(10.dp))
            Image(painterResource(R.drawable.ic_safaricom_mark), null, Modifier.size(width = 22.dp, height = 17.dp))
            Spacer(Modifier.width(3.dp))
            Text("Safaricom", color = DocGreen, fontSize = 10.sp, fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
private fun HeadField(label: String, value: String) {
    Row(Modifier.fillMaxWidth().padding(bottom = 5.dp), verticalAlignment = Alignment.Top) {
        Text(label, color = DocGreen, fontSize = 10.sp, modifier = Modifier.width(104.dp))
        Text(value, color = DocInk, fontSize = 10.sp, fontWeight = FontWeight.Medium)
    }
}

// ── The two tables ────────────────────────────────────────────────────────────────────────────────

@Composable
private fun SummaryTable(s: Statement) {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.fillMaxWidth().background(HeaderGreen).padding(vertical = 5.dp, horizontal = 6.dp)) {
            Cell("TRANSACTION TYPE", Modifier.weight(2.2f), Color.White, bold = true)
            Cell("PAID IN", Modifier.weight(1f), Color.White, bold = true, end = true)
            Cell("PAID OUT", Modifier.weight(1f), Color.White, bold = true, end = true)
        }
        for (r in s.summary) {
            Row(Modifier.fillMaxWidth().padding(vertical = 4.dp, horizontal = 6.dp)) {
                Cell(r.type, Modifier.weight(2.2f), DocInk)
                Cell(Msisdn.money(r.paidInCents), Modifier.weight(1f), DocInk, end = true)
                Cell(Msisdn.money(r.paidOutCents), Modifier.weight(1f), DocInk, end = true)
            }
            Box(Modifier.fillMaxWidth().height(0.6.dp).background(GridLine))
        }
        Row(Modifier.fillMaxWidth().padding(vertical = 5.dp, horizontal = 6.dp)) {
            Cell("TOTAL", Modifier.weight(2.2f), DocInk, bold = true)
            Cell(Msisdn.money(s.totalPaidInCents), Modifier.weight(1f), DocInk, bold = true, end = true)
            Cell(Msisdn.money(s.totalPaidOutCents), Modifier.weight(1f), DocInk, bold = true, end = true)
        }
        Box(Modifier.fillMaxWidth().height(0.6.dp).background(GridLine))
    }
}

@Composable
private fun DetailTable(s: Statement) {
    if (s.detail.isEmpty()) {
        Text(
            "No transactions in this period.",
            color = TextSecondary, fontSize = 11.sp,
            textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth().padding(vertical = 14.dp),
        )
        return
    }
    // Six columns do not fit a phone at a readable size, so the table scrolls rather than shrinks.
    Column(Modifier.fillMaxWidth().horizontalScroll(rememberScrollState())) {
        Row(Modifier.width(786.dp).background(HeaderGreen).padding(vertical = 5.dp, horizontal = 6.dp)) {
            Cell("RECEIPT NO.", Modifier.width(100.dp), Color.White, bold = true)
            Cell("COMPLETION TIME", Modifier.width(150.dp), Color.White, bold = true)
            Cell("DETAILS", Modifier.width(210.dp), Color.White, bold = true)
            Cell("TRANSACTION STATUS", Modifier.width(86.dp), Color.White, bold = true)
            Cell("PAID IN", Modifier.width(80.dp), Color.White, bold = true, end = true)
            Cell("WITHDRAWN", Modifier.width(90.dp), Color.White, bold = true, end = true)
            Cell("BALANCE", Modifier.width(70.dp), Color.White, bold = true, end = true)
        }
        for (r in s.detail) {
            Row(Modifier.width(786.dp).padding(vertical = 4.dp, horizontal = 6.dp)) {
                Cell(r.code, Modifier.width(100.dp), DocInk)
                Cell(Receipts.timestamp(r.atMs), Modifier.width(150.dp), DocInk)
                Cell(r.details, Modifier.width(210.dp), DocInk)
                Cell(r.status, Modifier.width(86.dp), DocInk)
                // An empty cell rather than 0.00: a statement line is either a credit or a debit,
                // and printing both every row makes the column impossible to scan.
                Cell(if (r.paidInCents > 0) Msisdn.money(r.paidInCents) else "", Modifier.width(80.dp), DocInk, end = true)
                Cell(if (r.withdrawnCents > 0) Msisdn.money(r.withdrawnCents) else "", Modifier.width(90.dp), DocInk, end = true)
                Cell(Msisdn.money(r.balanceCents), Modifier.width(70.dp), DocInk, end = true)
            }
            Box(Modifier.width(786.dp).height(0.6.dp).background(GridLine))
        }
    }
    if (s.truncated) {
        Spacer(Modifier.height(8.dp))
        Text(
            "Showing the most recent ${s.detail.size} of ${s.txnCount} transactions. " +
                "The summary above covers all ${s.txnCount}.",
            color = TextSecondary, fontSize = 10.sp, lineHeight = 14.sp,
            textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth(),
        )
    }
}

@Composable
private fun Cell(text: String, modifier: Modifier, color: Color, bold: Boolean = false, end: Boolean = false) {
    Text(
        text,
        modifier = modifier,
        color = color,
        fontSize = 10.sp,
        lineHeight = 13.sp,
        fontWeight = if (bold) FontWeight.Bold else FontWeight.Normal,
        textAlign = if (end) TextAlign.End else TextAlign.Start,
    )
}

// ── The QR ────────────────────────────────────────────────────────────────────────────────────────

/**
 * Drawn from the module matrix the server computed — the app owns no QR encoder.
 *
 * One implementation, on the server, means the printed page, the emailed copy and anything added
 * later cannot disagree about what the code says. The quiet zone is drawn here rather than shipped
 * as padding in the matrix, because the matrix is the code and the margin is presentation.
 */
@Composable
private fun QrBlock(qr: StatementQr, side: Dp) {
    if (qr.size <= 0 || qr.bits.length != qr.size * qr.size) return
    Canvas(Modifier.size(side).background(Color.White)) {
        val quiet = 2                                     // modules of margin, the minimum that scans
        val step = size.minDimension / (qr.size + quiet * 2)
        for (row in 0 until qr.size) {
            for (col in 0 until qr.size) {
                if (!qr.isDark(row, col)) continue
                drawRect(
                    color = Color(0xFF111111),
                    topLeft = Offset((col + quiet) * step, (row + quiet) * step),
                    // A hair over one module: adjacent modules must not leave a seam when `step`
                    // is fractional, which it almost always is.
                    size = Size(step + 0.6f, step + 0.6f),
                )
            }
        }
    }
}
