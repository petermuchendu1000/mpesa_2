package com.huawei.digitalpayment.datepicker.library;

import android.content.Context;
import android.view.ViewGroup;
import com.huawei.digitalpayment.datepicker.R;

public final class DefaultDayViewInflater extends DayViewInflater {
    private static int ShareDataUIState = 1;
    private static int component1;

    public DefaultDayViewInflater(Context context) {
        super(context);
    }

    @Override
    public DayViewHolder inflateDayView(ViewGroup viewGroup) {
        int i = 2 % 2;
        DefaultDayViewHolder defaultDayViewHolder = new DefaultDayViewHolder(this.mLayoutInflater.inflate(R.layout.datepicker_layout_dayview_default, viewGroup, false));
        int i2 = component1 + 51;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return defaultDayViewHolder;
    }
}
