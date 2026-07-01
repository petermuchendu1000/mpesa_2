package com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.huawei.digitalpayment.consumer.sfcpochiwallet.R;

public abstract class ActivityPochiWalletPayBinding extends ViewDataBinding {
    private static int component2 = 0;
    private static int component3 = 1;
    public final TabLayout tabLayout;
    public final ViewPager2 viewPager;

    protected ActivityPochiWalletPayBinding(Object obj, View view, int i, TabLayout tabLayout, ViewPager2 viewPager2) {
        super(obj, view, i);
        this.tabLayout = tabLayout;
        this.viewPager = viewPager2;
    }

    public static ActivityPochiWalletPayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 11;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityPochiWalletPayBinding activityPochiWalletPayBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 57;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return activityPochiWalletPayBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityPochiWalletPayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 89;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityPochiWalletPayBinding activityPochiWalletPayBinding = (ActivityPochiWalletPayBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_pochi_wallet_pay, viewGroup, z, obj);
        if (i3 == 0) {
            int i4 = 0 / 0;
        }
        return activityPochiWalletPayBinding;
    }

    public static ActivityPochiWalletPayBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 57;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityPochiWalletPayBinding activityPochiWalletPayBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 113;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activityPochiWalletPayBindingInflate;
    }

    @Deprecated
    public static ActivityPochiWalletPayBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 43;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityPochiWalletPayBinding activityPochiWalletPayBinding = (ActivityPochiWalletPayBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_pochi_wallet_pay, null, false, obj);
        int i4 = component2 + 101;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activityPochiWalletPayBinding;
    }

    public static ActivityPochiWalletPayBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 85;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityPochiWalletPayBinding activityPochiWalletPayBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 57;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return activityPochiWalletPayBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static ActivityPochiWalletPayBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 81;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityPochiWalletPayBinding activityPochiWalletPayBinding = (ActivityPochiWalletPayBinding) bind(obj, view, R.layout.activity_pochi_wallet_pay);
        int i4 = component3 + 59;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activityPochiWalletPayBinding;
    }
}
