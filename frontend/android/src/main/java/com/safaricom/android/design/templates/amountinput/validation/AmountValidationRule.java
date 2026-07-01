package com.safaricom.android.design.templates.amountinput.validation;

import com.safaricom.android.design.templates.amountinput.model.OverdraftInfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J1\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/safaricom/android/design/templates/amountinput/validation/AmountValidationRule;", "", "validate", "Lcom/safaricom/android/design/templates/amountinput/validation/ValidationResult;", "input", "", "amount", "", "currentBalance", "overdraftInfo", "Lcom/safaricom/android/design/templates/amountinput/model/OverdraftInfo;", "(Ljava/lang/String;DLjava/lang/Double;Lcom/safaricom/android/design/templates/amountinput/model/OverdraftInfo;)Lcom/safaricom/android/design/templates/amountinput/validation/ValidationResult;", "ConsumerSfcAmountInput_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AmountValidationRule {
    ValidationResult validate(String input, double amount, Double currentBalance, OverdraftInfo overdraftInfo);
}
