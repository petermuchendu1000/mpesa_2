package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.validation;

import com.safaricom.android.design.templates.amountinput.validation.AmountValidationRule;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/validation/RoamingCashOutMaximumAmountRule;", "Lcom/safaricom/android/design/templates/amountinput/validation/AmountValidationRule;", "maximumAmount", "", "<init>", "(D)V", "validate", "Lcom/safaricom/android/design/templates/amountinput/validation/ValidationResult;", "input", "", "amount", "currentBalance", "overdraftInfo", "Lcom/safaricom/android/design/templates/amountinput/model/OverdraftInfo;", "(Ljava/lang/String;DLjava/lang/Double;Lcom/safaricom/android/design/templates/amountinput/model/OverdraftInfo;)Lcom/safaricom/android/design/templates/amountinput/validation/ValidationResult;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoamingCashOutMaximumAmountRule implements AmountValidationRule {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private final double copydefault;

    public RoamingCashOutMaximumAmountRule(double d2) {
        this.copydefault = d2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if ((r4 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        r5 = 40 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        return com.safaricom.android.design.templates.amountinput.validation.ValidationResult.Valid.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        return com.safaricom.android.design.templates.amountinput.validation.ValidationResult.Valid.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r5 <= r3.copydefault) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        return com.safaricom.android.design.templates.amountinput.validation.ValidationResult.Valid.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return new com.safaricom.android.design.templates.amountinput.validation.ValidationResult.Invalid(com.safaricom.android.design.templates.amountinput.model.AmountValidatorType.ABOVE_MAX_AMOUNT, "Amount must not exceed " + r3.copydefault);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r5 <= 0.0d) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r5 <= 0.0d) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r4 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.validation.RoamingCashOutMaximumAmountRule.component3 + 45;
        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.validation.RoamingCashOutMaximumAmountRule.component1 = r4 % 128;
     */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.safaricom.android.design.templates.amountinput.validation.ValidationResult validate(java.lang.String r4, double r5, java.lang.Double r7, com.safaricom.android.design.templates.amountinput.model.OverdraftInfo r8) {
        /*
            r3 = this;
            r7 = 2
            int r8 = r7 % r7
            int r8 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.validation.RoamingCashOutMaximumAmountRule.component3
            int r8 = r8 + 7
            int r0 = r8 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.validation.RoamingCashOutMaximumAmountRule.component1 = r0
            int r8 = r8 % r7
            r0 = 0
            java.lang.String r2 = ""
            if (r8 == 0) goto L1a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 > 0) goto L3a
            goto L21
        L1a:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 > 0) goto L3a
        L21:
            int r4 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.validation.RoamingCashOutMaximumAmountRule.component3
            int r4 = r4 + 45
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.validation.RoamingCashOutMaximumAmountRule.component1 = r5
            int r4 = r4 % r7
            if (r4 == 0) goto L35
            com.safaricom.android.design.templates.amountinput.validation.ValidationResult$Valid r4 = com.safaricom.android.design.templates.amountinput.validation.ValidationResult.Valid.INSTANCE
            com.safaricom.android.design.templates.amountinput.validation.ValidationResult r4 = (com.safaricom.android.design.templates.amountinput.validation.ValidationResult) r4
            r5 = 40
            int r5 = r5 / 0
            return r4
        L35:
            com.safaricom.android.design.templates.amountinput.validation.ValidationResult$Valid r4 = com.safaricom.android.design.templates.amountinput.validation.ValidationResult.Valid.INSTANCE
            com.safaricom.android.design.templates.amountinput.validation.ValidationResult r4 = (com.safaricom.android.design.templates.amountinput.validation.ValidationResult) r4
            return r4
        L3a:
            double r7 = r3.copydefault
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 <= 0) goto L5a
            com.safaricom.android.design.templates.amountinput.model.AmountValidatorType r4 = com.safaricom.android.design.templates.amountinput.model.AmountValidatorType.ABOVE_MAX_AMOUNT
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Amount must not exceed "
            r5.<init>(r6)
            double r6 = r3.copydefault
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.safaricom.android.design.templates.amountinput.validation.ValidationResult$Invalid r6 = new com.safaricom.android.design.templates.amountinput.validation.ValidationResult$Invalid
            r6.<init>(r4, r5)
            com.safaricom.android.design.templates.amountinput.validation.ValidationResult r6 = (com.safaricom.android.design.templates.amountinput.validation.ValidationResult) r6
            goto L5f
        L5a:
            com.safaricom.android.design.templates.amountinput.validation.ValidationResult$Valid r4 = com.safaricom.android.design.templates.amountinput.validation.ValidationResult.Valid.INSTANCE
            r6 = r4
            com.safaricom.android.design.templates.amountinput.validation.ValidationResult r6 = (com.safaricom.android.design.templates.amountinput.validation.ValidationResult) r6
        L5f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.validation.RoamingCashOutMaximumAmountRule.validate(java.lang.String, double, java.lang.Double, com.safaricom.android.design.templates.amountinput.model.OverdraftInfo):com.safaricom.android.design.templates.amountinput.validation.ValidationResult");
    }

    static {
        int i = 1 + 43;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }
}
