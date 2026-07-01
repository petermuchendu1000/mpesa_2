package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivityMtandaoCombinedLayoutBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    public final TabLayout tabLayout;
    public final ViewPager2 viewPager;

    protected ActivityMtandaoCombinedLayoutBinding(Object obj, View view, int i, TabLayout tabLayout, ViewPager2 viewPager2) {
        super(obj, view, i);
        this.tabLayout = tabLayout;
        this.viewPager = viewPager2;
    }

    public static ActivityMtandaoCombinedLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 123;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityMtandaoCombinedLayoutBinding activityMtandaoCombinedLayoutBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 45;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return activityMtandaoCombinedLayoutBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivityMtandaoCombinedLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 23;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_mtandao_combined_layout, viewGroup, z, obj);
        if (i3 == 0) {
            return (ActivityMtandaoCombinedLayoutBinding) viewDataBindingInflateInternal;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ActivityMtandaoCombinedLayoutBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityMtandaoCombinedLayoutBinding activityMtandaoCombinedLayoutBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 115;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return activityMtandaoCombinedLayoutBindingInflate;
    }

    @Deprecated
    public static ActivityMtandaoCombinedLayoutBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityMtandaoCombinedLayoutBinding activityMtandaoCombinedLayoutBinding = (ActivityMtandaoCombinedLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_mtandao_combined_layout, null, false, obj);
        int i4 = ShareDataUIState + 115;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activityMtandaoCombinedLayoutBinding;
    }

    public static ActivityMtandaoCombinedLayoutBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 59;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivityMtandaoCombinedLayoutBinding activityMtandaoCombinedLayoutBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = ShareDataUIState + 125;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return activityMtandaoCombinedLayoutBindingBind;
    }

    @Deprecated
    public static ActivityMtandaoCombinedLayoutBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 11;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityMtandaoCombinedLayoutBinding activityMtandaoCombinedLayoutBinding = (ActivityMtandaoCombinedLayoutBinding) bind(obj, view, R.layout.activity_mtandao_combined_layout);
        int i4 = ShareDataUIState + 13;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return activityMtandaoCombinedLayoutBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
