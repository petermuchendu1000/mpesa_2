package com.huawei.digitalpayment.datepicker.library;

public abstract class SegmentSelectListener {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;

    public abstract void onSegmentSelect(FullDay fullDay, FullDay fullDay2);

    public boolean onInterceptSelect(FullDay fullDay) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        component1 = i2 % 128;
        return i2 % 2 == 0;
    }

    public boolean onInterceptSelect(FullDay fullDay, FullDay fullDay2) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 89;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 1;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 96 / 0;
        }
        return false;
    }

    public void selectedSameDay(FullDay fullDay) {
        int i = 2 % 2;
        int i2 = component1 + 103;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }
}
