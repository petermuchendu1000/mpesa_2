package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

public abstract class ActivityBongaOnboardingBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int copydefault = 1;
    public final LoadingButton btnConfirm;
    public final DotsIndicator dotsIndicator;
    public final RoundImageView ivBack;
    public final TextView tvTitle;
    public final ViewPager2 viewPager;

    protected ActivityBongaOnboardingBinding(Object obj, View view, int i, LoadingButton loadingButton, DotsIndicator dotsIndicator, RoundImageView roundImageView, TextView textView, ViewPager2 viewPager2) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.dotsIndicator = dotsIndicator;
        this.ivBack = roundImageView;
        this.tvTitle = textView;
        this.viewPager = viewPager2;
    }

    public static ActivityBongaOnboardingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 85;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityBongaOnboardingBinding activityBongaOnboardingBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 29;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return activityBongaOnboardingBindingInflate;
    }

    @Deprecated
    public static ActivityBongaOnboardingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 49;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_bonga_onboarding, viewGroup, z, obj);
        if (i3 != 0) {
            return (ActivityBongaOnboardingBinding) viewDataBindingInflateInternal;
        }
        throw null;
    }

    public static ActivityBongaOnboardingBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityBongaOnboardingBinding activityBongaOnboardingBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 74 / 0;
        }
        return activityBongaOnboardingBindingInflate;
    }

    @Deprecated
    public static ActivityBongaOnboardingBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityBongaOnboardingBinding activityBongaOnboardingBinding = (ActivityBongaOnboardingBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_bonga_onboarding, null, false, obj);
        int i4 = component1 + 101;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityBongaOnboardingBinding;
    }

    public static ActivityBongaOnboardingBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 41;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityBongaOnboardingBinding activityBongaOnboardingBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 101;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return activityBongaOnboardingBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityBongaOnboardingBinding bind(View view, Object obj) {
        ActivityBongaOnboardingBinding activityBongaOnboardingBinding;
        int i = 2 % 2;
        int i2 = copydefault + 49;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            activityBongaOnboardingBinding = (ActivityBongaOnboardingBinding) bind(obj, view, R.layout.activity_bonga_onboarding);
            int i3 = 2 / 0;
        } else {
            activityBongaOnboardingBinding = (ActivityBongaOnboardingBinding) bind(obj, view, R.layout.activity_bonga_onboarding);
        }
        int i4 = component1 + 117;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityBongaOnboardingBinding;
    }
}
