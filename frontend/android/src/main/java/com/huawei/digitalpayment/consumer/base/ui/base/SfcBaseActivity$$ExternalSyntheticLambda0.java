package com.huawei.digitalpayment.consumer.base.ui.base;

import android.os.SystemClock;
import android.view.View;

public final class SfcBaseActivity$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public static int ShareDataUIState = 0;
    private static int component1 = 1;
    public static int component2;
    private static int copydefault;
    public final SfcBaseActivity f$0;

    public SfcBaseActivity$$ExternalSyntheticLambda0(SfcBaseActivity sfcBaseActivity) {
        this.f$0 = sfcBaseActivity;
    }

    public static int component3() {
        int i = component2;
        int i2 = i % 6181895;
        component2 = i + 1;
        if (i2 != 0) {
            return ShareDataUIState;
        }
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        ShareDataUIState = iElapsedRealtime;
        return iElapsedRealtime;
    }

    @Override
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 109;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        SfcBaseActivity.m10160$r8$lambda$7x8VxsCsoVuzjimKJJQ6cCfD8(this.f$0, view);
        int i4 = component1 + 51;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
    }
}
