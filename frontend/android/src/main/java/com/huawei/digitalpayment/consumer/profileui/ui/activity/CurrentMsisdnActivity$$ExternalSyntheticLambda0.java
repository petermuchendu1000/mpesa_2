package com.huawei.digitalpayment.consumer.profileui.ui.activity;

import android.view.View;
import kotlin.progress;
import kotlin.swipeEdge;

public final class CurrentMsisdnActivity$$ExternalSyntheticLambda0 implements View.OnClickListener {
    private static int component1 = 1;
    private static int copydefault;
    public final CurrentMsisdnActivity f$0;

    public CurrentMsisdnActivity$$ExternalSyntheticLambda0(CurrentMsisdnActivity currentMsisdnActivity) {
        this.f$0 = currentMsisdnActivity;
    }

    public static void copydefault() {
        progress.ShareDataUIState[0] = swipeEdge.component2[0];
    }

    @Override
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            CurrentMsisdnActivity.$r8$lambda$xxtgX2WIhV2WSBQlOjHWAtyHKIM(this.f$0, view);
            int i3 = 17 / 0;
        } else {
            CurrentMsisdnActivity.$r8$lambda$xxtgX2WIhV2WSBQlOjHWAtyHKIM(this.f$0, view);
        }
        int i4 = component1 + 35;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
