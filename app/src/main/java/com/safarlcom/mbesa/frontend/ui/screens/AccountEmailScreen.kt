package com.safarlcom.mbesa.frontend.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safarlcom.mbesa.frontend.data.AppState
import com.safarlcom.mbesa.frontend.data.MarketerAccount
import com.safarlcom.mbesa.frontend.data.SaveEmailResult
import com.safarlcom.mbesa.frontend.ui.theme.BrandGreen
import com.safarlcom.mbesa.frontend.ui.theme.Danger
import com.safarlcom.mbesa.frontend.ui.theme.TextPrimary
import com.safarlcom.mbesa.frontend.ui.theme.TextSecondary
import kotlinx.coroutines.launch

private val ChipGrey = Color(0xFFEDEEF1)
private val FieldBorder = Color(0xFFD5D8DD)

/**
 * The address this marketer's statements are emailed to.
 *
 * It exists so the export screen stops asking for one every time (invest254 docs/65 §5). Before
 * this there was nowhere at all to read an address from: the marketers table had no email column
 * and the website profile has none either.
 *
 * WHAT IS SAVED IS WHAT THE SERVER STORED, not what was typed. The server trims and lower-cases,
 * so a marketer who typed "Faith@Example.COM " is shown "faith@example.com" — the inbox that will
 * actually receive their statements, rather than what their thumbs produced.
 *
 * Removing it is offered plainly, because an address somebody has lost access to is worse than no
 * address: statements keep going somewhere nobody reads.
 */
@Composable
fun AccountEmailScreen(onBack: () -> Unit) {
    val scope = rememberCoroutineScope()
    var value by remember { mutableStateOf(AppState.email.orEmpty()) }
    var busy by remember { mutableStateOf(false) }
    var error by remember { mutableStateOf<String?>(null) }
    var saved by remember { mutableStateOf(false) }

    fun save(address: String?) {
        error = null; saved = false; busy = true
        scope.launch {
            when (val r = MarketerAccount.setEmail(address)) {
                is SaveEmailResult.Ok -> {
                    AppState.applyEmail(r.email)
                    value = r.email.orEmpty()
                    saved = true
                }
                is SaveEmailResult.Failed -> error = r.message
                SaveEmailResult.Unavailable ->
                    error = "Couldn't reach the server. Check your connection and try again."
            }
            busy = false
        }
    }

    Scaffold(containerColor = Color.White) { padding ->
        Column(
            Modifier.fillMaxSize().padding(padding).statusBarsPadding().padding(horizontal = 20.dp),
        ) {
            Box(Modifier.fillMaxWidth().height(48.dp), contentAlignment = Alignment.Center) {
                Box(
                    Modifier.align(Alignment.CenterStart).size(40.dp).clip(CircleShape)
                        .background(ChipGrey).clickable(onClick = onBack),
                    contentAlignment = Alignment.Center,
                ) { Icon(Icons.AutoMirrored.Filled.ArrowBack, "Back", tint = TextPrimary) }
                Text("Email address", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = TextPrimary)
            }

            Spacer(Modifier.height(24.dp))
            Text(
                "Statements you export are sent here. You can still type a different address on " +
                    "the export screen for a one-off.",
                color = TextSecondary, fontSize = 14.sp, lineHeight = 20.sp,
            )

            Spacer(Modifier.height(22.dp))
            OutlinedTextField(
                value = value,
                onValueChange = { value = it; saved = false; error = null },
                singleLine = true,
                label = { Text("Email address") },
                placeholder = { Text("you@example.com") },
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

            error?.let {
                Spacer(Modifier.height(10.dp))
                Text(it, color = Danger, fontSize = 13.sp)
            }
            if (saved) {
                Spacer(Modifier.height(10.dp))
                Text(
                    if (value.isBlank()) "Removed. Statements will ask for an address."
                    else "Saved. Statements will be sent to $value.",
                    color = BrandGreen, fontSize = 13.sp,
                )
            }

            Spacer(Modifier.height(24.dp))
            Button(
                onClick = { save(value.trim()) },
                enabled = !busy && value.isNotBlank() && value.trim() != AppState.email,
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(containerColor = BrandGreen, disabledContainerColor = ChipGrey),
                modifier = Modifier.fillMaxWidth().height(54.dp),
            ) {
                if (busy) CircularProgressIndicator(color = Color.White, strokeWidth = 2.dp, modifier = Modifier.size(20.dp))
                else Text("Save", fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
            }

            if (!AppState.email.isNullOrBlank()) {
                Spacer(Modifier.height(6.dp))
                TextButton(
                    onClick = { value = ""; save(null) },
                    enabled = !busy,
                    modifier = Modifier.fillMaxWidth(),
                ) { Text("Remove this address", color = Danger) }
            }
        }
    }
}
