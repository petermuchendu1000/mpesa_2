package com.huawei.digitalpayment.datepicker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.datepicker.R;

public abstract class FragmentRangeDatepickerBinding extends ViewDataBinding {
    private static int component3 = 1;
    private static int copydefault;
    public final LoadingButton apply;
    public final LinearLayout llTop;
    public final RecyclerView rvCalendar;
    public final DatepickerLayoutSundayStartBinding sundayStart;
    public final TextView tvTitle;

    protected FragmentRangeDatepickerBinding(Object obj, View view, int i, LoadingButton loadingButton, LinearLayout linearLayout, RecyclerView recyclerView, DatepickerLayoutSundayStartBinding datepickerLayoutSundayStartBinding, TextView textView) {
        super(obj, view, i);
        this.apply = loadingButton;
        this.llTop = linearLayout;
        this.rvCalendar = recyclerView;
        this.sundayStart = datepickerLayoutSundayStartBinding;
        this.tvTitle = textView;
    }

    public static FragmentRangeDatepickerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentRangeDatepickerBinding fragmentRangeDatepickerBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 53;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return fragmentRangeDatepickerBindingInflate;
    }

    @Deprecated
    public static FragmentRangeDatepickerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 5;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentRangeDatepickerBinding fragmentRangeDatepickerBinding = (FragmentRangeDatepickerBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_range_datepicker, viewGroup, z, obj);
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
        return fragmentRangeDatepickerBinding;
    }

    public static FragmentRangeDatepickerBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentRangeDatepickerBinding fragmentRangeDatepickerBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 0 / 0;
        }
        return fragmentRangeDatepickerBindingInflate;
    }

    @Deprecated
    public static FragmentRangeDatepickerBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component3 + 99;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.fragment_range_datepicker;
            z = true;
        } else {
            i = R.layout.fragment_range_datepicker;
            z = false;
        }
        FragmentRangeDatepickerBinding fragmentRangeDatepickerBinding = (FragmentRangeDatepickerBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = component3 + 85;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return fragmentRangeDatepickerBinding;
    }

    public static FragmentRangeDatepickerBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 5;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentRangeDatepickerBinding fragmentRangeDatepickerBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 47 / 0;
        }
        return fragmentRangeDatepickerBindingBind;
    }

    @Deprecated
    public static FragmentRangeDatepickerBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 29;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentRangeDatepickerBinding fragmentRangeDatepickerBinding = (FragmentRangeDatepickerBinding) bind(obj, view, R.layout.fragment_range_datepicker);
        int i4 = component3 + 3;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return fragmentRangeDatepickerBinding;
    }
}
