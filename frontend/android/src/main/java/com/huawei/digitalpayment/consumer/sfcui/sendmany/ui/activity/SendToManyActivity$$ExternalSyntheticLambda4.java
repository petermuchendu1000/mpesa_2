package com.huawei.digitalpayment.consumer.sfcui.sendmany.ui.activity;

import android.view.View;
import java.util.Random;

public final class SendToManyActivity$$ExternalSyntheticLambda4 implements View.OnClickListener {
    public static int ShareDataUIState = 0;
    public static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault;
    public final SendToManyActivity f$0;

    public SendToManyActivity$$ExternalSyntheticLambda4(SendToManyActivity sendToManyActivity) {
        this.f$0 = sendToManyActivity;
    }

    public static int component2() {
        int i = ShareDataUIState;
        int i2 = i % 8310585;
        ShareDataUIState = i + 1;
        if (i2 != 0) {
            return component1;
        }
        int iNextInt = new Random().nextInt();
        component1 = iNextInt;
        return iNextInt;
    }

    @Override
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = component3 + 9;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        SendToManyActivity.m11892$r8$lambda$RZzWt43KltKBz2AuOo38xeDJw(this.f$0, view);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
