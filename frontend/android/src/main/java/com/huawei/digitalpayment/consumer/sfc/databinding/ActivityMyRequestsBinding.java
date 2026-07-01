package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivityMyRequestsBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component3;
    public final TabLayout tabLayout;
    public final ViewPager2 viewPager;

    protected ActivityMyRequestsBinding(Object obj, View view, int i, TabLayout tabLayout, ViewPager2 viewPager2) {
        super(obj, view, i);
        this.tabLayout = tabLayout;
        this.viewPager = viewPager2;
    }

    public static ActivityMyRequestsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 7;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityMyRequestsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_my_requests, viewGroup, z, obj);
        if (i3 == 0) {
            return (ActivityMyRequestsBinding) viewDataBindingInflateInternal;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ActivityMyRequestsBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityMyRequestsBinding activityMyRequestsBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 105;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activityMyRequestsBindingInflate;
    }

    @Deprecated
    public static ActivityMyRequestsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 47;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return (ActivityMyRequestsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_my_requests, null, false, obj);
    }

    public static ActivityMyRequestsBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 13;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivityMyRequestsBinding activityMyRequestsBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = ShareDataUIState + 3;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return activityMyRequestsBindingBind;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityMyRequestsBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityMyRequestsBinding activityMyRequestsBinding = (ActivityMyRequestsBinding) bind(obj, view, R.layout.activity_my_requests);
        int i4 = ShareDataUIState + 9;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activityMyRequestsBinding;
    }
}
