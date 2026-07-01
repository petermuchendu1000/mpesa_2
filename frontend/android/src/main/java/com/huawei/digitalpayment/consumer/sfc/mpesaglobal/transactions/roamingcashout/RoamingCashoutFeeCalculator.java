package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout;

import com.safaricom.android.design.templates.amountinput.provider.FeeCalculator;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

@Singleton
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/RoamingCashoutFeeCalculator;", "Lcom/safaricom/android/design/templates/amountinput/provider/FeeCalculator;", "<init>", "()V", "calculateStandardFee", "", "amount", "calculateFastWithdrawFee", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoamingCashoutFeeCalculator implements FeeCalculator {
    public static final int $stable = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;

    @Inject
    public RoamingCashoutFeeCalculator() {
    }

    static {
        int i = 1 + 9;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    @Override
    public double calculateFastWithdrawFee(double amount) {
        int i = 2 % 2;
        int i2 = component1 + 83;
        component2 = i2 % 128;
        return i2 % 2 == 0 ? 1.0d : 0.0d;
    }

    @Override
    public double calculateStandardFee(double amount) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 83;
        component2 = i3 % 128;
        double d2 = i3 % 2 == 0 ? 1.0d : 0.0d;
        int i4 = i2 + 3;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return d2;
    }
}
