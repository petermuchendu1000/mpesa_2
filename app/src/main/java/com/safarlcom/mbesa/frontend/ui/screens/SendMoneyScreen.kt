package com.safarlcom.mbesa.frontend.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.QrCodeScanner
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safarlcom.mbesa.frontend.data.AppState
import com.safarlcom.mbesa.frontend.data.Favourite
import com.safarlcom.mbesa.frontend.data.Favourites
import com.safarlcom.mbesa.frontend.data.MarketerSession
import com.safarlcom.mbesa.frontend.data.Msisdn
import com.safarlcom.mbesa.frontend.data.RecipientLookup
import com.safarlcom.mbesa.frontend.ui.SendFlow
import com.safarlcom.mbesa.frontend.ui.SendMode
import com.safarlcom.mbesa.frontend.ui.theme.BrandGreen
import com.safarlcom.mbesa.frontend.ui.theme.Danger
import com.safarlcom.mbesa.frontend.ui.theme.TextPrimary
import com.safarlcom.mbesa.frontend.ui.theme.TextSecondary
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/* The screen's own palette, in the app's EXISTING light scheme. The reference screenshots are the
   real M-PESA app in dark mode; the layout below is theirs, the colours are this app's, because a
   dark screen reached from this app's light Home would be the only dark surface in the product. */
private val ScreenBg = Color(0xFFF2F3F5)
private val CardWhite = Color(0xFFFFFFFF)
private val FieldBorder = Color(0xFFD9DBDF)
private val TrackGrey = Color(0xFFE9EBEE)
private val ChipGrey = Color(0xFFEDEEF1)

/**
 * SEND MONEY — one marketer sending funny money to another.
 *
 * WHY THIS SCREEN EXISTS. A marketer who runs out of simulated balance used to have exactly one
 * way to get more: wait for an admin (or a platform admin) to credit them. That is a person in the
 * loop for something no real money passes through. A marketer can now ring a colleague and be sent
 * some, and this is where the colleague sends it from.
 *
 * WHAT MAKES IT DIFFERENT FROM REAL M-PESA, AND WHY THE DIFFERENCE IS LOAD-BEARING. Real M-PESA
 * will send to any Safaricom line. This cannot: funny money only exists inside a marketer wallet,
 * so the recipient has to BE an active marketer on the same brand. That is why the number is
 * checked against the server before Continue will light up, rather than after — a send that was
 * going to fail should fail while the sender is still looking at the number they typed, not three
 * screens later. The check is `MarketerSession.lookupRecipient`, which answers with the registered
 * name and nothing else.
 *
 * TWO TABS, ONE TRANSFER. "Mobile number" and "Pochi la Biashara" move the same funny money between
 * the same two wallets. Pochi is a lighter form of the same screen — no QR, no withdrawal-charge
 * tick, no Do More — exactly as the reference shows, because a Pochi payment in the real product is
 * a payment to a trader's till rather than cash to a person: there is nothing to withdraw and
 * nothing to scan.
 *
 * THIS SCREEN MOVES NOTHING. It collects and validates, then hands [SendFlow] to the Confirm step,
 * which is where the transfer is actually made. Nothing here debits anybody.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SendMoneyScreen(
    mode: SendMode,
    onBack: () -> Unit,
    onContinue: () -> Unit,
    onOpenRoute: (String) -> Unit,
) {
    val context = LocalContext.current
    LaunchedEffect(Unit) { Favourites.init(context) }

    var tab by remember { mutableStateOf(mode) }
    var phone by remember { mutableStateOf("") }
    var amount by remember { mutableStateOf("") }
    var addCharges by remember { mutableStateOf(false) }
    var lookup by remember { mutableStateOf<RecipientLookup?>(null) }
    var looking by remember { mutableStateOf(false) }
    var showAll by remember { mutableStateOf(false) }
    val snackbar = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()

    val normalized = Msisdn.normalize(phone)

    /**
     * Ask the server who this is — once the number is COMPLETE, and not before.
     *
     * Keyed on the normalised number, so re-typing the same person in another format does not
     * re-ask, and the 350ms wait means a number typed straight through costs one request rather
     * than one per digit. Re-running the effect cancels the previous wait, which is what makes a
     * correction land on the corrected number instead of racing the old one.
     */
    LaunchedEffect(normalized) {
        lookup = null
        if (normalized == null) { looking = false; return@LaunchedEffect }
        delay(350)
        looking = true
        lookup = MarketerSession.lookupRecipient(normalized)
        looking = false
    }

    val amountCents = Msisdn.amountToCents(amount)
    // The tick is a simulation of what the recipient will pay an agent to take the money out; the
    // sender covers it so the recipient nets the round number. Mobile tab only — see the header.
    val chargeCents = if (tab == SendMode.MOBILE && addCharges && amountCents != null) {
        Msisdn.withdrawalChargeCents(amountCents)
    } else 0L
    val totalCents = (amountCents ?: 0L) + chargeCents
    val spendableCents = ((AppState.balance + AppState.fulizaAvailable) * 100).toLong()
    val overLimit = amountCents != null && amountCents > 0 && totalCents > spendableCents

    val recipientName = when (val l = lookup) {
        is RecipientLookup.Found -> l.name
        else -> null
    }
    val canContinue = recipientName != null && amountCents != null && amountCents > 0 && !overLimit && !looking

    Scaffold(
        containerColor = ScreenBg,
        snackbarHost = { SnackbarHost(snackbar) },
    ) { padding ->
        Column(
            Modifier
                .fillMaxSize()
                .padding(padding)
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 16.dp),
        ) {
            Spacer(Modifier.height(8.dp))
            ScreenHeader(title = "Send Money", onBack = onBack)
            Spacer(Modifier.height(14.dp))

            ModeToggle(tab) { picked ->
                if (picked != tab) {
                    tab = picked
                    // The tick belongs to the Mobile form only; carrying a ticked box into Pochi
                    // would silently add a charge to a screen that does not show one.
                    addCharges = false
                }
            }
            Spacer(Modifier.height(18.dp))

            FavouritesRow(
                favourites = Favourites.items,
                showViewAll = Favourites.items.isNotEmpty(),
                onViewAll = { showAll = true },
                onPick = { phone = it.phone },
                onAdd = {
                    val name = recipientName
                    when {
                        name == null -> scope.launch {
                            snackbar.showSnackbar("Enter a number first — we'll save the name with it.")
                        }
                        Favourites.contains(phone) -> scope.launch { snackbar.showSnackbar("$name is already saved.") }
                        else -> {
                            Favourites.add(name, phone)
                            scope.launch { snackbar.showSnackbar("Saved $name to favourites.") }
                        }
                    }
                },
            )
            Spacer(Modifier.height(18.dp))

            FieldLabel("Enter Phone Number")
            Spacer(Modifier.height(8.dp))
            OutlinedTextField(
                value = phone,
                onValueChange = { typed -> phone = typed.filter { it.isDigit() || it == '+' }.take(13) },
                placeholder = { Text("Enter Phone Number", color = Color(0xFF9AA0A6)) },
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                trailingIcon = {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        if (looking) {
                            CircularProgressIndicator(
                                strokeWidth = 2.dp,
                                color = BrandGreen,
                                modifier = Modifier.size(18.dp),
                            )
                            Spacer(Modifier.width(12.dp))
                        }
                        Icon(
                            Icons.Outlined.AccountCircle,
                            contentDescription = "Pick from contacts",
                            tint = BrandGreen,
                            modifier = Modifier
                                .size(26.dp)
                                .clickable {
                                    scope.launch {
                                        snackbar.showSnackbar("Type the number your colleague gave you.")
                                    }
                                },
                        )
                        // Pochi has no QR on the reference screen: a till is paid by number, not scanned.
                        if (tab == SendMode.MOBILE) {
                            Spacer(Modifier.width(10.dp))
                            Box(Modifier.height(22.dp).width(1.dp).background(FieldBorder))
                            Spacer(Modifier.width(10.dp))
                            Icon(
                                Icons.Outlined.QrCodeScanner,
                                contentDescription = "Scan a QR code",
                                tint = Color(0xFFFF2A58),
                                modifier = Modifier
                                    .size(24.dp)
                                    .clickable { onOpenRoute(com.safarlcom.mbesa.frontend.ui.Routes.SCAN) },
                            )
                        }
                        Spacer(Modifier.width(12.dp))
                    }
                },
                shape = RoundedCornerShape(12.dp),
                colors = fieldColors(valid = recipientName != null),
                modifier = Modifier.fillMaxWidth(),
            )

            // The one line that tells the sender whether this is going to work, and to whom.
            RecipientLine(lookup = lookup, looking = looking, typedComplete = normalized != null)

            Spacer(Modifier.height(14.dp))
            FieldLabel("Enter Amount")
            Spacer(Modifier.height(8.dp))
            OutlinedTextField(
                value = amount,
                onValueChange = { typed -> amount = typed.filter { it.isDigit() }.take(9) },
                placeholder = { Text("0", color = Color(0xFF9AA0A6)) },
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                trailingIcon = { Text("Ksh", color = TextPrimary, fontSize = 15.sp, modifier = Modifier.padding(end = 14.dp)) },
                shape = RoundedCornerShape(12.dp),
                colors = fieldColors(valid = amountCents != null && amountCents > 0 && !overLimit),
                isError = overLimit,
                modifier = Modifier.fillMaxWidth(),
            )
            Spacer(Modifier.height(6.dp))
            Text(
                "Balance: Ksh ${AppState.balanceStr} - Fuliza: Ksh ${AppState.fulizaAvailableStr}",
                color = if (overLimit) Danger else TextSecondary,
                fontSize = 13.sp,
            )
            if (overLimit) {
                Spacer(Modifier.height(4.dp))
                Text(
                    "That is more than the balance and Fuliza together.",
                    color = Danger,
                    fontSize = 12.sp,
                )
            }

            // Mobile tab only, and only once there is an amount to charge against — an unticked box
            // offering "(Ksh 0.00)" before anything is typed reads as a bug.
            if (tab == SendMode.MOBILE && amountCents != null && amountCents > 0) {
                Spacer(Modifier.height(12.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Checkbox(
                        checked = addCharges,
                        onCheckedChange = { addCharges = it },
                        colors = CheckboxDefaults.colors(checkedColor = BrandGreen, uncheckedColor = Color(0xFF9AA0A6)),
                    )
                    Text("Add withdrawal charges", color = BrandGreen, fontSize = 14.sp)
                    Spacer(Modifier.width(6.dp))
                    Text(
                        "(Ksh ${Msisdn.money(Msisdn.withdrawalChargeCents(amountCents))})",
                        color = TextSecondary,
                        fontSize = 14.sp,
                    )
                }
            }

            Spacer(Modifier.height(18.dp))
            Text("Select Payment Method", fontWeight = FontWeight.Bold, fontSize = 16.sp, color = TextPrimary)
            Spacer(Modifier.height(10.dp))
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                PaymentMethodCard(
                    title = "M-PESA",
                    subtitle = "Bal. Ksh. ${AppState.balanceStr}",
                    selected = true,
                    modifier = Modifier.weight(1f),
                    onClick = {},
                )
                PaymentMethodCard(
                    title = "Shiriki Pay",
                    subtitle = "Select",
                    selected = false,
                    modifier = Modifier.weight(1f),
                    onClick = {
                        // Rendered because the reference screen has it; honest about what it is.
                        scope.launch { snackbar.showSnackbar("Shiriki Pay isn't linked to this account.") }
                    },
                )
            }

            Spacer(Modifier.height(22.dp))
            Button(
                onClick = {
                    SendFlow.mode = tab
                    SendFlow.recipientPhone = normalized.orEmpty()
                    SendFlow.recipientName = recipientName.orEmpty()
                    SendFlow.amountCents = amountCents ?: 0L
                    SendFlow.chargeCents = chargeCents
                    onContinue()
                },
                enabled = canContinue,
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = BrandGreen,
                    disabledContainerColor = ChipGrey,
                    disabledContentColor = Color(0xFF9AA0A6),
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(54.dp),
            ) {
                Text("Continue", fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
            }

            // Pochi's reference screen ends at Continue; only the Mobile form carries Do More.
            if (tab == SendMode.MOBILE) {
                Spacer(Modifier.height(24.dp))
                Text("Do More", fontWeight = FontWeight.Bold, fontSize = 16.sp, color = TextPrimary)
                Spacer(Modifier.height(10.dp))
                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                    DoMoreTile("Send to\nMany", Modifier.weight(1f)) {
                        onOpenRoute(com.safarlcom.mbesa.frontend.ui.Routes.info("Send to Many"))
                    }
                    DoMoreTile("Request\nMoney", Modifier.weight(1f)) {
                        onOpenRoute(com.safarlcom.mbesa.frontend.ui.Routes.entry("request"))
                    }
                    DoMoreTile("Invest to\nZiiDi", Modifier.weight(1f)) {
                        onOpenRoute(com.safarlcom.mbesa.frontend.ui.Routes.info("Invest to ZiiDi"))
                    }
                }
            }
            Spacer(Modifier.height(28.dp))
        }
    }

    if (showAll) {
        FavouritesDialog(
            favourites = Favourites.items,
            onPick = { showAll = false; phone = it.phone },
            onRemove = { Favourites.remove(it) },
            onDismiss = { showAll = false },
        )
    }
}

/* ── pieces ─────────────────────────────────────────────────────────────────────────────────── */

/** The reference's header: a round back chip on the page itself, with the title centred over it. */
@Composable
private fun ScreenHeader(title: String, onBack: () -> Unit) {
    Box(Modifier.fillMaxWidth().height(48.dp), contentAlignment = Alignment.Center) {
        Box(
            Modifier
                .align(Alignment.CenterStart)
                .size(40.dp)
                .clip(CircleShape)
                .background(ChipGrey)
                .clickable(onClick = onBack),
            contentAlignment = Alignment.Center,
        ) {
            Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back", tint = TextPrimary)
        }
        Text(title, fontSize = 19.sp, fontWeight = FontWeight.SemiBold, color = TextPrimary)
    }
}

/** The two-up pill: Mobile number | Pochi la Biashara. */
@Composable
private fun ModeToggle(selected: SendMode, onSelect: (SendMode) -> Unit) {
    Row(
        Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(26.dp))
            .background(TrackGrey)
            .padding(5.dp),
        horizontalArrangement = Arrangement.spacedBy(4.dp),
    ) {
        for (m in SendMode.entries) {
            val on = m == selected
            Box(
                Modifier
                    .weight(1f)
                    .height(44.dp)
                    .clip(RoundedCornerShape(22.dp))
                    .background(if (on) BrandGreen else Color.Transparent)
                    .clickable { onSelect(m) },
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    m.label,
                    color = if (on) Color.White else TextSecondary,
                    fontWeight = if (on) FontWeight.Bold else FontWeight.Medium,
                    fontSize = 15.sp,
                )
            }
        }
    }
}

@Composable
private fun FieldLabel(text: String) {
    Text(text, color = TextPrimary, fontSize = 15.sp)
}

@Composable
private fun FavouritesRow(
    favourites: List<Favourite>,
    showViewAll: Boolean,
    onViewAll: () -> Unit,
    onPick: (Favourite) -> Unit,
    onAdd: () -> Unit,
) {
    Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        Text("Favourites", fontWeight = FontWeight.Bold, fontSize = 16.sp, color = TextPrimary, modifier = Modifier.weight(1f))
        if (showViewAll) {
            Text(
                "View All",
                color = BrandGreen,
                fontSize = 14.sp,
                modifier = Modifier
                    .clip(RoundedCornerShape(8.dp))
                    .clickable(onClick = onViewAll)
                    .padding(horizontal = 6.dp, vertical = 2.dp),
            )
        }
    }
    Spacer(Modifier.height(10.dp))
    Row(
        Modifier.fillMaxWidth().horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.spacedBy(18.dp),
    ) {
        FavouriteChip(label = "Add", initials = null, onClick = onAdd)
        for (f in favourites) {
            FavouriteChip(label = f.name, initials = f.initials, onClick = { onPick(f) })
        }
    }
}

/** One round favourite, or the "+" that saves whoever is currently resolved in the field. */
@Composable
private fun FavouriteChip(label: String, initials: String?, onClick: () -> Unit) {
    Column(
        Modifier.width(72.dp).clip(RoundedCornerShape(12.dp)).clickable(onClick = onClick),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Box(
            Modifier.size(52.dp).clip(CircleShape).background(if (initials == null) ChipGrey else chipColour(label)),
            contentAlignment = Alignment.Center,
        ) {
            if (initials == null) {
                Icon(Icons.Filled.Add, contentDescription = "Add a favourite", tint = BrandGreen)
            } else {
                Text(initials, color = Color.White, fontWeight = FontWeight.SemiBold, fontSize = 16.sp)
            }
        }
        Spacer(Modifier.height(6.dp))
        Text(
            label,
            fontSize = 12.sp,
            color = TextSecondary,
            textAlign = TextAlign.Center,
            maxLines = 2,
            lineHeight = 14.sp,
        )
    }
}

/** A stable colour per saved name, so a given person keeps the same chip between launches. */
private fun chipColour(seed: String): Color {
    val palette = listOf(
        Color(0xFF2E6CD4), Color(0xFF7B2E9E), Color(0xFF1E9E4A),
        Color(0xFFCB5A1F), Color(0xFF0E7490), Color(0xFFB03060),
    )
    val h = seed.fold(0) { acc, c -> (acc * 31 + c.code) and 0x7fffffff }
    return palette[h % palette.size]
}

/**
 * What sits under the phone field.
 *
 * Four different things, deliberately: the resolved name, "that's you", "no marketer on this
 * number", and "we couldn't check". The last two must never be the same sentence — one means
 * retype the number, the other means try again in a moment, and telling a sender to retype a
 * number that was right is how the feature gets abandoned.
 */
@Composable
private fun RecipientLine(lookup: RecipientLookup?, looking: Boolean, typedComplete: Boolean) {
    val (text, colour) = when {
        looking -> "Checking…" to TextSecondary
        lookup is RecipientLookup.Found -> lookup.name.uppercase() to BrandGreen
        lookup is RecipientLookup.Self -> "You can't send to yourself." to Danger
        lookup is RecipientLookup.NotFound -> "No marketer is registered on this number." to Danger
        lookup is RecipientLookup.Busy -> "Too many checks just now — try again in a moment." to TextSecondary
        lookup is RecipientLookup.Unavailable -> "Couldn't check this number. Check your connection." to TextSecondary
        else -> null to TextSecondary
    }
    if (text != null) {
        Spacer(Modifier.height(6.dp))
        Text(text, color = colour, fontSize = 13.sp, fontWeight = FontWeight.SemiBold)
    } else if (typedComplete) {
        Spacer(Modifier.height(6.dp))
    }
}

@Composable
private fun PaymentMethodCard(
    title: String,
    subtitle: String,
    selected: Boolean,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    Box(modifier) {
        Row(
            Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
                .background(CardWhite)
                .clickable(onClick = onClick)
                .then(
                    if (selected) Modifier.background(Color.Transparent) else Modifier
                )
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Box(
                Modifier.size(28.dp).clip(CircleShape).background(if (selected) Color(0xFFFDE8E8) else Color(0xFFE6F4EA)),
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    if (selected) "M" else "S",
                    color = if (selected) Color(0xFFE1251B) else Color(0xFF1E9E4A),
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                )
            }
            Spacer(Modifier.width(10.dp))
            Column(Modifier.weight(1f)) {
                Text(title, fontWeight = FontWeight.Bold, fontSize = 14.sp, color = TextPrimary, maxLines = 1)
                Text(subtitle, color = TextSecondary, fontSize = 12.sp, maxLines = 1)
            }
            if (selected) {
                Box(
                    Modifier.size(20.dp).clip(CircleShape).background(BrandGreen),
                    contentAlignment = Alignment.Center,
                ) {
                    Icon(Icons.Filled.Check, contentDescription = "Selected", tint = Color.White, modifier = Modifier.size(14.dp))
                }
            }
        }
        // The selected card is outlined, which is how the reference marks it.
        if (selected) {
            Box(
                Modifier
                    .matchParentSize()
                    .clip(RoundedCornerShape(12.dp))
                    .border(BorderStroke(1.5.dp, BrandGreen), RoundedCornerShape(12.dp)),
            )
        }
    }
}

@Composable
private fun DoMoreTile(label: String, modifier: Modifier = Modifier, onClick: () -> Unit) {
    Column(
        modifier
            .clip(RoundedCornerShape(14.dp))
            .background(CardWhite)
            .clickable(onClick = onClick)
            .padding(vertical = 18.dp, horizontal = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(label, fontSize = 13.sp, color = TextPrimary, textAlign = TextAlign.Center, lineHeight = 17.sp)
    }
}

@Composable
private fun FavouritesDialog(
    favourites: List<Favourite>,
    onPick: (Favourite) -> Unit,
    onRemove: (Favourite) -> Unit,
    onDismiss: () -> Unit,
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        confirmButton = { TextButton(onClick = onDismiss) { Text("Close", color = BrandGreen) } },
        title = { Text("Favourites") },
        text = {
            Column(Modifier.verticalScroll(rememberScrollState())) {
                if (favourites.isEmpty()) {
                    Text("Nothing saved yet.", color = TextSecondary)
                }
                for (f in favourites) {
                    Row(
                        Modifier
                            .fillMaxWidth()
                            .clickable { onPick(f) }
                            .padding(vertical = 10.dp),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Column(Modifier.weight(1f)) {
                            Text(f.name, fontWeight = FontWeight.SemiBold, color = TextPrimary)
                            // The number is shown because the user typed it into THIS handset; it is
                            // not something the server ever told the app (docs/58).
                            Text(f.phone, color = TextSecondary, fontSize = 12.sp)
                        }
                        Icon(
                            Icons.Outlined.Delete,
                            contentDescription = "Remove ${f.name}",
                            tint = TextSecondary,
                            modifier = Modifier.clickable { onRemove(f) },
                        )
                    }
                }
            }
        },
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun fieldColors(valid: Boolean) = OutlinedTextFieldDefaults.colors(
    focusedBorderColor = if (valid) BrandGreen else FieldBorder,
    unfocusedBorderColor = if (valid) BrandGreen else FieldBorder,
    focusedContainerColor = CardWhite,
    unfocusedContainerColor = CardWhite,
    errorBorderColor = Danger,
    cursorColor = BrandGreen,
)
