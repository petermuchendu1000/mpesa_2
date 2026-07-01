package com.huawei.digitalpayment.consumer.manageandviewdata.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.manageandviewdata.R;

public abstract class ActivitySfcManageAndViewDataBinding extends ViewDataBinding {
    private static int component3 = 1;
    private static int copydefault;
    public final RoundLinearLayout tabContainer;
    public final TabLayout tabLayout;
    public final ViewPager2 viewPager;

    protected ActivitySfcManageAndViewDataBinding(Object obj, View view, int i, RoundLinearLayout roundLinearLayout, TabLayout tabLayout, ViewPager2 viewPager2) {
        super(obj, view, i);
        this.tabContainer = roundLinearLayout;
        this.tabLayout = tabLayout;
        this.viewPager = viewPager2;
    }

    public static ActivitySfcManageAndViewDataBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 9;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcManageAndViewDataBinding activitySfcManageAndViewDataBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 35;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcManageAndViewDataBindingInflate;
    }

    @Deprecated
    public static ActivitySfcManageAndViewDataBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcManageAndViewDataBinding activitySfcManageAndViewDataBinding = (ActivitySfcManageAndViewDataBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_manage_and_view_data, viewGroup, z, obj);
        int i4 = component3 + 23;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySfcManageAndViewDataBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ActivitySfcManageAndViewDataBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ActivitySfcManageAndViewDataBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return (ActivitySfcManageAndViewDataBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_manage_and_view_data, null, false, obj);
    }

    public static ActivitySfcManageAndViewDataBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 9;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcManageAndViewDataBinding activitySfcManageAndViewDataBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 7;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return activitySfcManageAndViewDataBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivitySfcManageAndViewDataBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        ActivitySfcManageAndViewDataBinding activitySfcManageAndViewDataBinding = (ActivitySfcManageAndViewDataBinding) bind(obj, view, R.layout.activity_sfc_manage_and_view_data);
        int i3 = copydefault + 117;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return activitySfcManageAndViewDataBinding;
    }
}
