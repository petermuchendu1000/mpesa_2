package com.safarlcom.mbesa.frontend.ui.screens

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
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safarlcom.mbesa.frontend.R
import com.safarlcom.mbesa.frontend.data.AppState
import com.safarlcom.mbesa.frontend.data.MarketerSession
import com.safarlcom.mbesa.frontend.data.Receipts
import com.safarlcom.mbesa.frontend.data.STATEMENT_IN_APP_MAX_DAYS
import com.safarlcom.mbesa.frontend.data.StatementEmailResult
import com.safarlcom.mbesa.frontend.data.StatementFlow
import com.safarlcom.mbesa.frontend.data.StatementResult
import com.safarlcom.mbesa.frontend.data.Statements
import com.safarlcom.mbesa.frontend.data.Ymd
import com.safarlcom.mbesa.frontend.data.daysInclusive
import com.safarlcom.mbesa.frontend.ui.theme.BrandGreen
import com.safarlcom.mbesa.frontend.ui.theme.Danger
import com.safarlcom.mbesa.frontend.ui.theme.TextPrimary
import com.safarlcom.mbesa.frontend.ui.theme.TextSecondary
import kotlinx.coroutines.launch

private val ChipGrey = Color(0xFFEDEEF1)
private val FieldBorder = Color(0xFFD5D8DD)
private val AvatarBg = Color(0xFFDCE8FB)
private val AvatarFg = Color(0xFF2E6CD4)
private val NoteGreen = Color(0xFF2FA84F)

/** How the statement is delivered. The reference offers exactly these two. */
private enum class Deliver { IN_APP, EMAIL }

/**
 * EXPORT STATEMENTS — choose a period, and how to receive it.
 *
 * THE SIX-MONTH RULE IS ENFORCED, not merely announced. The reference prints a note saying periods
 * over six months are emailed; a note that the screen then ignores is decoration. Past
 * [STATEMENT_IN_APP_MAX_DAYS] the in-app option is disabled and the choice snaps to email, and the
 * note turns to say which range is doing it.
 *
 * ONE DEPARTURE FROM THE REFERENCE: choosing email reveals an address field. The real product has
 * the customer's address on file; this system has no email column on `marketers` and none on
 * `profiles` either (invest254 docs/65 §5), so there is nowhere to read one from. Asking is the
 * honest alternative to a button that silently sends nowhere.
 *
 * Nothing on this screen computes a figure. It picks two dates and asks the server, because a
 * report about a marketer that the marketer's own handset assembled is not a report.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExportStatementsScreen(onBack: () -> Unit, onViewStatement: () -> Unit) {
    val scope = rememberCoroutineScope()
    val today = remember { Ymd.today() }

    var start by remember { mutableStateOf(Ymd.monthsBefore(today, 1)) }
    var end by remember { mutableStateOf(today) }
    var deliver by remember { mutableStateOf(Deliver.IN_APP) }
    var email by remember { mutableStateOf("") }
    var picking by remember { mutableStateOf<Boolean?>(null) }   // true = start, false = end, null = closed
    var busy by remember { mutableStateOf(false) }
    var error by remember { mutableStateOf<String?>(null) }
    var done by remember { mutableStateOf<Deliver?>(null) }      // which sheet to show

    val span = daysInclusive(start, end)
    val backwards = end < start
    val tooLongForApp = span > STATEMENT_IN_APP_MAX_DAYS
    // Snap the choice rather than letting a disabled option stay selected.
    LaunchedEffect(tooLongForApp) { if (tooLongForApp) deliver = Deliver.EMAIL }

    val canGenerate = !busy && !backwards &&
        (deliver == Deliver.IN_APP || email.isNotBlank())

    fun generate() {
        error = null
        busy = true
        scope.launch {
            if (deliver == Deliver.IN_APP) {
                when (val r = Statements.fetch(start, end)) {
                    is StatementResult.Ok -> {
                        StatementFlow.current = r.statement
                        StatementFlow.ownPhone = MarketerSession.loginPhone ?: AppState.phone
                        done = Deliver.IN_APP
                    }
                    is StatementResult.Failed -> error = r.message
                    StatementResult.Unavailable ->
                        error = "Couldn't reach the server. Check your connection and try again."
                }
            } else {
                when (val r = Statements.email(start, end, email.trim())) {
                    is StatementEmailResult.Sent -> done = Deliver.EMAIL
                    is StatementEmailResult.Failed -> error = r.message
                    // Deliberately not reported as a failure: the server may well have sent it, and
                    // "failed" would invite a second copy of the same document to the same inbox.
                    StatementEmailResult.Unavailable ->
                        error = "We didn't hear back. The statement may already be on its way — " +
                            "check your inbox before sending again."
                }
            }
            busy = false
        }
    }

    Scaffold(containerColor = Color.White) { padding ->
        Column(
            Modifier.fillMaxSize().padding(padding).statusBarsPadding()
                .verticalScroll(rememberScrollState()).padding(horizontal = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Box(Modifier.fillMaxWidth().height(48.dp), contentAlignment = Alignment.Center) {
                Box(
                    Modifier.align(Alignment.CenterStart).size(40.dp).clip(CircleShape)
                        .background(ChipGrey).clickable(onClick = onBack),
                    contentAlignment = Alignment.Center,
                ) { Icon(Icons.AutoMirrored.Filled.ArrowBack, "Back", tint = TextPrimary) }
                Text("Export Statements", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = TextPrimary)
            }

            Spacer(Modifier.height(26.dp))
            Box(
                Modifier.size(78.dp).clip(CircleShape).background(AvatarBg),
                contentAlignment = Alignment.Center,
            ) {
                Text(initialsOf(AppState.fullName), color = AvatarFg, fontSize = 24.sp, fontWeight = FontWeight.SemiBold)
            }
            Spacer(Modifier.height(14.dp))
            Text(AppState.fullName, fontSize = 17.sp, fontWeight = FontWeight.Bold, color = TextPrimary)
            Spacer(Modifier.height(5.dp))
            Row {
                Text("Phone Number ", fontSize = 15.sp, color = TextPrimary)
                // The marketer's OWN number, in full. /me returns it masked (docs/58); this is the
                // one it signed in with, and it is their own.
                Text(
                    Receipts.intl(MarketerSession.loginPhone ?: AppState.phone),
                    fontSize = 15.sp, fontWeight = FontWeight.Bold, color = TextPrimary,
                )
            }

            Spacer(Modifier.height(26.dp))
            DashedNote(
                if (tooLongForApp)
                    "This period is longer than 6 months, so the statement will be shared via email."
                else
                    "Please note that for periods over 6 months, your statement will be shared via email.",
            )

            Spacer(Modifier.height(26.dp))
            FieldLabel("Start Date")
            DateField(start.ui()) { picking = true }
            Spacer(Modifier.height(18.dp))
            FieldLabel("End Date")
            DateField(end.ui()) { picking = false }

            if (backwards) {
                Spacer(Modifier.height(8.dp))
                Text(
                    "The end date is before the start date.",
                    color = Danger, fontSize = 12.sp, modifier = Modifier.fillMaxWidth(),
                )
            }

            Spacer(Modifier.height(24.dp))
            Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                DeliverOption("View in app", deliver == Deliver.IN_APP, enabled = !tooLongForApp) { deliver = Deliver.IN_APP }
                Spacer(Modifier.width(24.dp))
                DeliverOption("Send via E-mail", deliver == Deliver.EMAIL, enabled = true) { deliver = Deliver.EMAIL }
            }

            if (deliver == Deliver.EMAIL) {
                Spacer(Modifier.height(16.dp))
                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    singleLine = true,
                    label = { Text("Email address") },
                    // Said plainly rather than left to be discovered: this app holds no address.
                    supportingText = { Text("We don't have an address on file, so tell us where to send it.") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                    shape = RoundedCornerShape(10.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = BrandGreen,
                        unfocusedBorderColor = FieldBorder,
                        cursorColor = BrandGreen,
                        focusedLabelColor = BrandGreen,
                    ),
                    modifier = Modifier.fillMaxWidth(),
                )
            }

            error?.let {
                Spacer(Modifier.height(14.dp))
                Text(it, color = Danger, fontSize = 13.sp, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
            }

            Spacer(Modifier.height(32.dp))
            Button(
                onClick = { generate() },
                enabled = canGenerate,
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(containerColor = BrandGreen, disabledContainerColor = ChipGrey),
                modifier = Modifier.fillMaxWidth().height(56.dp),
            ) {
                if (busy) CircularProgressIndicator(color = Color.White, strokeWidth = 2.dp, modifier = Modifier.size(20.dp))
                else Text("Generate Statement", fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
            }
            Spacer(Modifier.height(28.dp))
        }
    }

    // ── The pickers ───────────────────────────────────────────────────────────────────────────────
    picking?.let { isStart ->
        val initial = (if (isStart) start else end).toPickerMillis()
        val state = rememberDatePickerState(initialSelectedDateMillis = initial)
        DatePickerDialog(
            onDismissRequest = { picking = null },
            confirmButton = {
                TextButton(onClick = {
                    state.selectedDateMillis?.let { ms ->
                        val picked = Ymd.fromPickerMillis(ms)
                        if (isStart) start = picked else end = picked
                    }
                    picking = null
                }) { Text("OK", color = BrandGreen) }
            },
            dismissButton = { TextButton(onClick = { picking = null }) { Text("Cancel", color = TextSecondary) } },
        ) { DatePicker(state = state) }
    }

    // ── Success ───────────────────────────────────────────────────────────────────────────────────
    done?.let { how ->
        val sheet = rememberModalBottomSheetState()
        ModalBottomSheet(
            onDismissRequest = { done = null },
            sheetState = sheet,
            containerColor = Color.White,
        ) {
            Column(
                Modifier.fillMaxWidth().padding(horizontal = 24.dp).padding(bottom = 32.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text("Success", fontSize = 17.sp, fontWeight = FontWeight.SemiBold, color = TextPrimary)
                Spacer(Modifier.height(26.dp))
                Box(
                    Modifier.size(84.dp).clip(RoundedCornerShape(26.dp)).background(BrandGreen),
                    contentAlignment = Alignment.Center,
                ) { Text("✓", color = Color.White, fontSize = 44.sp, fontWeight = FontWeight.Bold) }
                Spacer(Modifier.height(22.dp))
                Text(
                    // The reference's own words for the in-app case. The email case says what
                    // actually happened instead of borrowing them.
                    if (how == Deliver.IN_APP) "The statements have been downloaded successfully"
                    else "The statement has been sent to ${email.trim()}",
                    fontSize = 16.sp, color = TextPrimary, textAlign = TextAlign.Center,
                )
                Spacer(Modifier.height(26.dp))
                Button(
                    onClick = {
                        done = null
                        if (how == Deliver.IN_APP) onViewStatement()
                    },
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = BrandGreen),
                    modifier = Modifier.fillMaxWidth().height(54.dp),
                ) {
                    Text(
                        if (how == Deliver.IN_APP) "View Statements" else "Done",
                        fontSize = 16.sp, fontWeight = FontWeight.SemiBold,
                    )
                }
            }
        }
    }
}

@Composable
private fun FieldLabel(text: String) {
    Text(
        text, fontSize = 14.sp, color = TextSecondary,
        modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp),
    )
}

/** A read-only date field: tapping it opens the picker, because a typed date is a date to validate. */
@Composable
private fun DateField(value: String, onClick: () -> Unit) {
    Row(
        Modifier.fillMaxWidth().height(56.dp).clip(RoundedCornerShape(10.dp))
            .border(1.dp, FieldBorder, RoundedCornerShape(10.dp))
            .clickable(onClick = onClick)
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(value, fontSize = 16.sp, color = TextPrimary, modifier = Modifier.weight(1f))
        Image(painterResource(R.drawable.ic_calendar_field), null, Modifier.size(22.dp))
    }
}

/** The reference's dashed callout. Drawn, because Compose has no dashed border. */
@Composable
private fun DashedNote(text: String) {
    val dash = remember { PathEffect.dashPathEffect(floatArrayOf(10f, 9f), 0f) }
    Box(
        Modifier.fillMaxWidth()
            .drawBehind {
                drawRoundRect(
                    color = NoteGreen,
                    size = Size(size.width, size.height),
                    cornerRadius = CornerRadius(8.dp.toPx(), 8.dp.toPx()),
                    style = Stroke(width = 1.4.dp.toPx(), pathEffect = dash),
                )
            }
            .padding(horizontal = 18.dp, vertical = 16.dp),
        contentAlignment = Alignment.Center,
    ) {
        Text(text, color = NoteGreen, fontSize = 13.sp, textAlign = TextAlign.Center, lineHeight = 19.sp)
    }
}

@Composable
private fun DeliverOption(label: String, selected: Boolean, enabled: Boolean, onSelect: () -> Unit) {
    Row(
        Modifier.clip(RoundedCornerShape(8.dp)).clickable(enabled = enabled, onClick = onSelect),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
    ) {
        RadioButton(
            selected = selected,
            onClick = onSelect,
            enabled = enabled,
            colors = RadioButtonDefaults.colors(selectedColor = BrandGreen, unselectedColor = BrandGreen),
        )
        Text(
            label,
            fontSize = 15.sp,
            color = if (enabled) TextPrimary else TextSecondary,
        )
    }
}
