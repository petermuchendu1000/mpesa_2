package com.huawei.digitalpayment.consumer.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.login.R;

public abstract class ActivityResetPinWarningBinding extends ViewDataBinding {
    private static int component3 = 1;
    private static int copydefault;
    public final LoadingButton btnNext;
    public final ImageView imageView2;
    public final TextView textView6;
    public final TextView tvTips;

    protected ActivityResetPinWarningBinding(Object obj, View view, int i, LoadingButton loadingButton, ImageView imageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.btnNext = loadingButton;
        this.imageView2 = imageView;
        this.textView6 = textView;
        this.tvTips = textView2;
    }

    public static ActivityResetPinWarningBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityResetPinWarningBinding activityResetPinWarningBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 115;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return activityResetPinWarningBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivityResetPinWarningBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityResetPinWarningBinding activityResetPinWarningBinding = (ActivityResetPinWarningBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_reset_pin_warning, viewGroup, z, obj);
        int i4 = component3 + 97;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
        return activityResetPinWarningBinding;
    }

    public static ActivityResetPinWarningBinding inflate(LayoutInflater layoutInflater) {
        ActivityResetPinWarningBinding activityResetPinWarningBindingInflate;
        int i = 2 % 2;
        int i2 = component3 + 45;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            activityResetPinWarningBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            int i3 = 23 / 0;
        } else {
            activityResetPinWarningBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        }
        int i4 = copydefault + 41;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return activityResetPinWarningBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivityResetPinWarningBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = copydefault + 91;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.activity_reset_pin_warning;
            z = true;
        } else {
            i = R.layout.activity_reset_pin_warning;
            z = false;
        }
        ActivityResetPinWarningBinding activityResetPinWarningBinding = (ActivityResetPinWarningBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = component3 + 41;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return activityResetPinWarningBinding;
        }
        throw null;
    }

    public static ActivityResetPinWarningBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 65;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ActivityResetPinWarningBinding activityResetPinWarningBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component3 + 5;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return activityResetPinWarningBindingBind;
    }

    @Deprecated
    public static ActivityResetPinWarningBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.activity_reset_pin_warning);
        if (i3 != 0) {
            return (ActivityResetPinWarningBinding) viewDataBindingBind;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
