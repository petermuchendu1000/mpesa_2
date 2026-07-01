package com.huawei.digitalpayment.datepicker.library;

import android.content.Context;
import android.view.View;

public abstract class DayViewHolder {
    private static int component2 = 0;
    private static int copydefault = 1;
    protected View dayView;
    protected Context mContext;

    public abstract void setBeyondRangeDayText(FullDay fullDay);

    public abstract void setCurrentMonthDayText(FullDay fullDay, boolean z);

    public abstract void setNextMonthDayText(FullDay fullDay);

    public abstract void setPrevMonthDayText(FullDay fullDay);

    public DayViewHolder(View view) {
        this.dayView = view;
        this.mContext = view.getContext();
    }

    public View getDayView() {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        View view = this.dayView;
        int i4 = i3 + 35;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return view;
    }
}
