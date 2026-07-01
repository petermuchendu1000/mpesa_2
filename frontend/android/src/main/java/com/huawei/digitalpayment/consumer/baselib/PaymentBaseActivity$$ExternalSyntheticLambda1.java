package com.huawei.digitalpayment.consumer.baselib;

import android.os.Process;
import android.view.View;

public final class PaymentBaseActivity$$ExternalSyntheticLambda1 implements View.OnClickListener {
    public static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    public static int copydefault;
    public final PaymentBaseActivity f$0;

    public PaymentBaseActivity$$ExternalSyntheticLambda1(PaymentBaseActivity paymentBaseActivity) {
        this.f$0 = paymentBaseActivity;
    }

    public static int ShareDataUIState() {
        int i = copydefault;
        int i2 = i % 9071660;
        copydefault = i + 1;
        if (i2 != 0) {
            return ShareDataUIState;
        }
        int iMyUid = Process.myUid();
        ShareDataUIState = iMyUid;
        return iMyUid;
    }

    @Override
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = component1 + 57;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        PaymentBaseActivity.m10219$r8$lambda$oqDJ7eOJBU55YiuquiMBXGK9A(this.f$0, view);
        int i4 = component1 + 39;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
