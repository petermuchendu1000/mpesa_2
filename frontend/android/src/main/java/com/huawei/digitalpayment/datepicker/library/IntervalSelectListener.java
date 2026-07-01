package com.huawei.digitalpayment.datepicker.library;

import java.util.List;
import kotlin.ReportDrawnCompositioncheckReporter1;

public abstract class IntervalSelectListener {
    private static int component2 = 0;
    private static int copydefault = 1;

    public abstract void onIntervalSelect(List<FullDay> list);

    public boolean onInterceptSelect(List<FullDay> list, FullDay fullDay) {
        int i = 2 % 2;
        int i2 = copydefault + 113;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 27;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 18 / 0;
        }
        return false;
    }

    public static void copydefault() {
        ReportDrawnCompositioncheckReporter1.ShareDataUIState[0] = Class.forName("com.google.android.gms.measurement.internal.zzha").getDeclaredField("component1");
    }
}
