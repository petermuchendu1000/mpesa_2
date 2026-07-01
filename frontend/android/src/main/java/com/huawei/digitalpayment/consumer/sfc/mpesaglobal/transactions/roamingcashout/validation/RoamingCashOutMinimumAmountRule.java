package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.validation;

import com.safaricom.android.design.templates.amountinput.model.AmountValidatorType;
import com.safaricom.android.design.templates.amountinput.model.OverdraftInfo;
import com.safaricom.android.design.templates.amountinput.validation.AmountValidationRule;
import com.safaricom.android.design.templates.amountinput.validation.ValidationResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/validation/RoamingCashOutMinimumAmountRule;", "Lcom/safaricom/android/design/templates/amountinput/validation/AmountValidationRule;", "minimumAmount", "", "<init>", "(D)V", "validate", "Lcom/safaricom/android/design/templates/amountinput/validation/ValidationResult;", "input", "", "amount", "currentBalance", "overdraftInfo", "Lcom/safaricom/android/design/templates/amountinput/model/OverdraftInfo;", "(Ljava/lang/String;DLjava/lang/Double;Lcom/safaricom/android/design/templates/amountinput/model/OverdraftInfo;)Lcom/safaricom/android/design/templates/amountinput/validation/ValidationResult;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoamingCashOutMinimumAmountRule implements AmountValidationRule {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component2 = 89 % 128;
    private static int component3;
    private static int copydefault;
    private final double component1;

    public RoamingCashOutMinimumAmountRule(double d2) {
        this.component1 = d2;
    }

    @Override
    public ValidationResult validate(String input, double amount, Double currentBalance, OverdraftInfo overdraftInfo) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(input, "");
        if (amount > 0.0d) {
            if (amount >= this.component1) {
                return ValidationResult.Valid.INSTANCE;
            }
            return new ValidationResult.Invalid(AmountValidatorType.BELOW_MIN_AMOUNT, "Amount must not be less than " + this.component1);
        }
        int i2 = ShareDataUIState + 77;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ValidationResult.Valid valid = ValidationResult.Valid.INSTANCE;
        int i4 = component3 + 57;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return valid;
    }

    static {
        if (89 % 2 == 0) {
            int i = 7 / 0;
        }
    }
}
