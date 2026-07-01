package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.validation;

import com.safaricom.android.design.templates.amountinput.model.AmountValidatorType;
import com.safaricom.android.design.templates.amountinput.model.OverdraftInfo;
import com.safaricom.android.design.templates.amountinput.validation.AmountValidationRule;
import com.safaricom.android.design.templates.amountinput.validation.ValidationResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/validation/RoamingCashOutMultipleOf100Rule;", "Lcom/safaricom/android/design/templates/amountinput/validation/AmountValidationRule;", "<init>", "()V", "validate", "Lcom/safaricom/android/design/templates/amountinput/validation/ValidationResult;", "input", "", "amount", "", "currentBalance", "overdraftInfo", "Lcom/safaricom/android/design/templates/amountinput/model/OverdraftInfo;", "(Ljava/lang/String;DLjava/lang/Double;Lcom/safaricom/android/design/templates/amountinput/model/OverdraftInfo;)Lcom/safaricom/android/design/templates/amountinput/validation/ValidationResult;", "Companion", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoamingCashOutMultipleOf100Rule implements AmountValidationRule {
    public static final int $stable = 0;

    public static final Companion INSTANCE = new Companion(null);
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static final int copydefault = 100;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/validation/RoamingCashOutMultipleOf100Rule$Companion;", "", "<init>", "()V", "ALLOW_MULTIPLE_AMOUNTS_OF", "", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override
    public ValidationResult validate(String input, double amount, Double currentBalance, OverdraftInfo overdraftInfo) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(input, "");
        if (amount > 0.0d) {
            if (((long) amount) % ((long) 100) != 0) {
                return new ValidationResult.Invalid(AmountValidatorType.CONSTRAINTS_VIOLATED, "Amount must be a multiple of 100");
            }
            int i2 = component2 + 67;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return ValidationResult.Valid.INSTANCE;
        }
        int i4 = component2 + 79;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return ValidationResult.Valid.INSTANCE;
        }
        ValidationResult.Valid valid = ValidationResult.Valid.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component3 + 71;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }
}
