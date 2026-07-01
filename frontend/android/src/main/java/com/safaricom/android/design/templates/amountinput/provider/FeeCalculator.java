package com.safaricom.android.design.templates.amountinput.provider;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/safaricom/android/design/templates/amountinput/provider/FeeCalculator;", "", "calculateStandardFee", "", "amount", "calculateFastWithdrawFee", "ConsumerSfcAmountInput_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FeeCalculator {
    double calculateFastWithdrawFee(double amount);

    double calculateStandardFee(double amount);
}
