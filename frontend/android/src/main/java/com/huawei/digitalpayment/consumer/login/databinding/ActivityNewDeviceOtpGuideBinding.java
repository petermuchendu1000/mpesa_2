package com.huawei.digitalpayment.consumer.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.login.R;

public abstract class ActivityNewDeviceOtpGuideBinding extends ViewDataBinding {
    private static int component2 = 0;
    private static int copydefault = 1;
    public final LoadingButton btnConfirm;
    public final RoundImageView ivNewDeviceOtpGuide;
    public final TextView tvNewDeviceOtpGuide;
    public final TextView tvNewDeviceOtpGuideDesc;

    protected ActivityNewDeviceOtpGuideBinding(Object obj, View view, int i, LoadingButton loadingButton, RoundImageView roundImageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.ivNewDeviceOtpGuide = roundImageView;
        this.tvNewDeviceOtpGuide = textView;
        this.tvNewDeviceOtpGuideDesc = textView2;
    }

    public static ActivityNewDeviceOtpGuideBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityNewDeviceOtpGuideBinding activityNewDeviceOtpGuideBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 6 / 0;
        }
        return activityNewDeviceOtpGuideBindingInflate;
    }

    @Deprecated
    public static ActivityNewDeviceOtpGuideBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_new_device_otp_guide, viewGroup, z, obj);
        if (i3 != 0) {
            return (ActivityNewDeviceOtpGuideBinding) viewDataBindingInflateInternal;
        }
        throw null;
    }

    public static ActivityNewDeviceOtpGuideBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 3;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityNewDeviceOtpGuideBinding activityNewDeviceOtpGuideBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 15;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
        return activityNewDeviceOtpGuideBindingInflate;
    }

    @Deprecated
    public static ActivityNewDeviceOtpGuideBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityNewDeviceOtpGuideBinding activityNewDeviceOtpGuideBinding = (ActivityNewDeviceOtpGuideBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_new_device_otp_guide, null, false, obj);
        int i4 = component2 + 115;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityNewDeviceOtpGuideBinding;
    }

    public static ActivityNewDeviceOtpGuideBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 37;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivityNewDeviceOtpGuideBinding activityNewDeviceOtpGuideBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = copydefault + 9;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return activityNewDeviceOtpGuideBindingBind;
    }

    @Deprecated
    public static ActivityNewDeviceOtpGuideBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 65;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        ActivityNewDeviceOtpGuideBinding activityNewDeviceOtpGuideBinding = (ActivityNewDeviceOtpGuideBinding) bind(obj, view, R.layout.activity_new_device_otp_guide);
        int i3 = copydefault + 115;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return activityNewDeviceOtpGuideBinding;
    }
}
