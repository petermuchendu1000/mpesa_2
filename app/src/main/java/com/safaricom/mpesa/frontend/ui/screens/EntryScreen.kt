package com.safaricom.mpesa.frontend.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safaricom.mpesa.frontend.data.FakeData
import com.safaricom.mpesa.frontend.data.FieldKind
import com.safaricom.mpesa.frontend.data.SfcCatalog
import com.safaricom.mpesa.frontend.ui.TxFlow
import com.safaricom.mpesa.frontend.ui.components.SafTopBar
import com.safaricom.mpesa.frontend.ui.theme.BrandGreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EntryScreen(
    actionId: String,
    onBack: () -> Unit,
    onContinue: () -> Unit,
) {
    val action = SfcCatalog.actions[actionId] ?: return
    val values = remember(actionId) { mutableStateListOf(*Array(action.inputs.size) { "" }) }

    val amountIndex = action.inputs.indexOfFirst { it.kind == FieldKind.AMOUNT }
    val allFilled = values.all { it.isNotBlank() }

    Scaffold(
        containerColor = Color(0xFFF5F6F8),
        topBar = { SafTopBar(action.title, onBack) },
    ) { padding ->
        Column(
            Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(20.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(painterResource(action.iconRes), action.title, modifier = Modifier.size(40.dp))
                Spacer(Modifier.size(12.dp))
                Column {
                    Text(action.title, fontWeight = FontWeight.Bold, fontSize = 18.sp)
                    Text("Enter details", color = MaterialTheme.colorScheme.onSurfaceVariant, fontSize = 13.sp)
                }
            }
            Spacer(Modifier.height(20.dp))

            action.inputs.forEachIndexed { index, spec ->
                OutlinedTextField(
                    value = values[index],
                    onValueChange = { new ->
                        values[index] = when (spec.kind) {
                            FieldKind.AMOUNT, FieldKind.NUMBER, FieldKind.PHONE -> new.filter { it.isDigit() }
                            FieldKind.TEXT -> new
                        }
                    },
                    label = { Text(spec.label) },
                    singleLine = true,
                    prefix = if (spec.kind == FieldKind.AMOUNT) {
                        { Text("Ksh ") }
                    } else null,
                    keyboardOptions = KeyboardOptions(
                        keyboardType = when (spec.kind) {
                            FieldKind.PHONE -> KeyboardType.Phone
                            FieldKind.TEXT -> KeyboardType.Text
                            else -> KeyboardType.Number
                        }
                    ),
                    modifier = Modifier.fillMaxWidth(),
                )
                Spacer(Modifier.height(14.dp))
            }

            Spacer(Modifier.weight(1f))

            Button(
                onClick = {
                    TxFlow.actionId = action.id
                    TxFlow.title = action.title
                    TxFlow.amount = if (amountIndex >= 0) values[amountIndex] else ""
                    TxFlow.recipient = values.getOrNull(0).takeIf { amountIndex != 0 } ?: ""
                    TxFlow.reference = FakeData.newReference()
                    onContinue()
                },
                enabled = allFilled,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp),
                colors = ButtonDefaults.buttonColors(containerColor = BrandGreen),
            ) {
                Text("Continue", fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
            }
            Spacer(Modifier.height(8.dp))
            Text(
                "Frontend preview — no real transaction is performed.",
                style = MaterialTheme.typography.labelSmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(8.dp)),
            )
        }
    }
}

