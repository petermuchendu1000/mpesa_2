package com.safaricom.android.design.templates.amountinput.validation;

import com.iap.ac.config.lite.ConfigMerger;
import com.safaricom.android.design.templates.amountinput.model.AmountInputConfig;
import com.safaricom.android.design.templates.amountinput.model.AmountValidatorType;
import com.safaricom.android.design.templates.amountinput.model.OverdraftInfo;
import com.safaricom.android.design.templates.amountinput.validation.ValidationResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bJ'\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J)\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/safaricom/android/design/templates/amountinput/validation/AmountInputValidator;", "", ConfigMerger.COMMON_CONFIG_SECTION, "Lcom/safaricom/android/design/templates/amountinput/model/AmountInputConfig;", "calculateAmount", "Lkotlin/Function0;", "", "<init>", "(Lcom/safaricom/android/design/templates/amountinput/model/AmountInputConfig;Lkotlin/jvm/functions/Function0;)V", "validators", "", "Lcom/safaricom/android/design/templates/amountinput/validation/AmountValidationRule;", "addRule", "", "rule", "validate", "Lcom/safaricom/android/design/templates/amountinput/validation/ValidationResult;", "input", "", "currentBalance", "overdraftInfo", "Lcom/safaricom/android/design/templates/amountinput/model/OverdraftInfo;", "(Ljava/lang/String;Ljava/lang/Double;Lcom/safaricom/android/design/templates/amountinput/model/OverdraftInfo;)Lcom/safaricom/android/design/templates/amountinput/validation/ValidationResult;", "validateNonEmpty", "ConsumerSfcAmountInput_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AmountInputValidator {
    public static final int $stable = 8;
    private final AmountInputConfig ShareDataUIState;
    private final Function0<Double> component2;
    private final List<AmountValidationRule> copydefault;

    public AmountInputValidator(AmountInputConfig amountInputConfig, Function0<Double> function0) {
        Intrinsics.checkNotNullParameter(amountInputConfig, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.ShareDataUIState = amountInputConfig;
        this.component2 = function0;
        this.copydefault = new ArrayList();
    }

    public final void addRule(AmountValidationRule rule) {
        Intrinsics.checkNotNullParameter(rule, "");
        this.copydefault.add(rule);
    }

    public final ValidationResult validate(String input, Double currentBalance, OverdraftInfo overdraftInfo) {
        Intrinsics.checkNotNullParameter(input, "");
        if (input.length() == 0) {
            return ValidationResult.Empty.INSTANCE;
        }
        return copydefault(input, currentBalance, overdraftInfo);
    }

    private final ValidationResult copydefault(String str, Double d2, OverdraftInfo overdraftInfo) {
        double dDoubleValue = this.component2.invoke().doubleValue();
        Double minAmount = this.ShareDataUIState.getMinAmount();
        if (minAmount != null && dDoubleValue < minAmount.doubleValue()) {
            return new ValidationResult.Invalid(AmountValidatorType.BELOW_MIN_AMOUNT, null, 2, null);
        }
        Double maxAmount = this.ShareDataUIState.getMaxAmount();
        if (maxAmount != null && dDoubleValue > maxAmount.doubleValue()) {
            return new ValidationResult.Invalid(AmountValidatorType.ABOVE_MAX_AMOUNT, null, 2, null);
        }
        if (this.ShareDataUIState.isBalanceCheckEnabled() && d2 != null) {
            double dDoubleValue2 = d2.doubleValue() + (overdraftInfo != null ? overdraftInfo.getBalance() : 0.0d);
            if (this.ShareDataUIState.getSupportsOverdraw() && overdraftInfo != null && dDoubleValue > dDoubleValue2) {
                return new ValidationResult.Invalid(AmountValidatorType.ABOVE_CURRENT_OVERDRAW_BALANCE, null, 2, null);
            }
            if (this.ShareDataUIState.getSupportsOverdraw() && overdraftInfo != null && overdraftInfo.isActive() && dDoubleValue > d2.doubleValue() && dDoubleValue <= dDoubleValue2) {
                return new ValidationResult.Warning(AmountValidatorType.USE_OVERDRAW_BALANCE, null, 2, null);
            }
            if (dDoubleValue > d2.doubleValue()) {
                return new ValidationResult.Invalid(AmountValidatorType.ABOVE_CURRENT_BALANCE, null, 2, null);
            }
        }
        Iterator<T> it = this.copydefault.iterator();
        while (it.hasNext()) {
            ValidationResult validationResultValidate = ((AmountValidationRule) it.next()).validate(str, dDoubleValue, d2, overdraftInfo);
            if (!(validationResultValidate instanceof ValidationResult.Valid)) {
                return validationResultValidate;
            }
        }
        return ValidationResult.Valid.INSTANCE;
    }
}
