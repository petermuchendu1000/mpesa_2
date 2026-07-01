package com.huawei.digitalpayment.consumer.basic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.base.ui.widget.ViewPager2Indicator;
import com.huawei.digitalpayment.consumer.basic.R;

public abstract class ActivitySfcGuideBinding extends ViewDataBinding {
    private static int component3 = 0;
    private static int copydefault = 1;
    public final ViewPager2Indicator indicator;
    public final LoadingButton lbStart;
    public final ViewPager2 viewpager;

    protected ActivitySfcGuideBinding(Object obj, View view, int i, ViewPager2Indicator viewPager2Indicator, LoadingButton loadingButton, ViewPager2 viewPager2) {
        super(obj, view, i);
        this.indicator = viewPager2Indicator;
        this.lbStart = loadingButton;
        this.viewpager = viewPager2;
    }

    public static ActivitySfcGuideBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcGuideBinding activitySfcGuideBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 83;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySfcGuideBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivitySfcGuideBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 25;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcGuideBinding activitySfcGuideBinding = (ActivitySfcGuideBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_guide, viewGroup, z, obj);
        int i4 = copydefault + 83;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcGuideBinding;
    }

    public static ActivitySfcGuideBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 43;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivitySfcGuideBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 53;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcGuideBinding activitySfcGuideBinding = (ActivitySfcGuideBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_guide, null, false, obj);
        int i4 = component3 + 57;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcGuideBinding;
    }

    public static ActivitySfcGuideBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 77;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcGuideBinding activitySfcGuideBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 49;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySfcGuideBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivitySfcGuideBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 31;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcGuideBinding activitySfcGuideBinding = (ActivitySfcGuideBinding) bind(obj, view, R.layout.activity_sfc_guide);
        int i4 = copydefault + 113;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcGuideBinding;
    }
}
