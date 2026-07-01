package com.huawei.digitalpayment.consumer.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.login.R;

public abstract class ActivitySfcRegisterKycBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component2;
    public final LoadingButton btnNext;
    public final ImageView ivBack;
    public final LinearLayout llContainer;
    public final TextView tvLoginTitle;

    protected ActivitySfcRegisterKycBinding(Object obj, View view, int i, LoadingButton loadingButton, ImageView imageView, LinearLayout linearLayout, TextView textView) {
        super(obj, view, i);
        this.btnNext = loadingButton;
        this.ivBack = imageView;
        this.llContainer = linearLayout;
        this.tvLoginTitle = textView;
    }

    public static ActivitySfcRegisterKycBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 109;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        ActivitySfcRegisterKycBinding activitySfcRegisterKycBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 43;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return activitySfcRegisterKycBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivitySfcRegisterKycBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 75;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_register_kyc, viewGroup, z, obj);
        if (i3 == 0) {
            return (ActivitySfcRegisterKycBinding) viewDataBindingInflateInternal;
        }
        int i4 = 92 / 0;
        return (ActivitySfcRegisterKycBinding) viewDataBindingInflateInternal;
    }

    public static ActivitySfcRegisterKycBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 19;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ActivitySfcRegisterKycBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 115;
        component2 = i2 % 128;
        ActivitySfcRegisterKycBinding activitySfcRegisterKycBinding = (ActivitySfcRegisterKycBinding) ViewDataBinding.inflateInternal(layoutInflater, i2 % 2 != 0 ? R.layout.activity_sfc_register_kyc : R.layout.activity_sfc_register_kyc, null, false, obj);
        int i3 = component1 + 75;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return activitySfcRegisterKycBinding;
    }

    public static ActivitySfcRegisterKycBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 35;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivitySfcRegisterKycBinding activitySfcRegisterKycBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 59;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return activitySfcRegisterKycBindingBind;
    }

    @Deprecated
    public static ActivitySfcRegisterKycBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 11;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcRegisterKycBinding activitySfcRegisterKycBinding = (ActivitySfcRegisterKycBinding) bind(obj, view, R.layout.activity_sfc_register_kyc);
        int i4 = component2 + 33;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
        return activitySfcRegisterKycBinding;
    }
}
