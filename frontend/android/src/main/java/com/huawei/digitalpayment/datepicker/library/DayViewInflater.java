package com.huawei.digitalpayment.datepicker.library;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public abstract class DayViewInflater {
    protected Context mContext;
    protected LayoutInflater mLayoutInflater;

    public abstract DayViewHolder inflateDayView(ViewGroup viewGroup);

    public DayViewInflater(Context context) {
        this.mContext = context;
        this.mLayoutInflater = LayoutInflater.from(context);
    }
}
