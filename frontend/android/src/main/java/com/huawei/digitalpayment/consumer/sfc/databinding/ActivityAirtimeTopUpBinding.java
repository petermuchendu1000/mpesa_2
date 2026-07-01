package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivityAirtimeTopUpBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    public final RoundImageView ivBack;
    public final RoundLinearLayout rlTabContainer;
    public final TabLayout tabLayout;
    public final TextView tvTitle;
    public final ViewPager2 viewPager;

    protected ActivityAirtimeTopUpBinding(Object obj, View view, int i, RoundImageView roundImageView, RoundLinearLayout roundLinearLayout, TabLayout tabLayout, TextView textView, ViewPager2 viewPager2) {
        super(obj, view, i);
        this.ivBack = roundImageView;
        this.rlTabContainer = roundLinearLayout;
        this.tabLayout = tabLayout;
        this.tvTitle = textView;
        this.viewPager = viewPager2;
    }

    public static ActivityAirtimeTopUpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        ActivityAirtimeTopUpBinding activityAirtimeTopUpBindingInflate;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            activityAirtimeTopUpBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            int i3 = 85 / 0;
        } else {
            activityAirtimeTopUpBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component1 + 75;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return activityAirtimeTopUpBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivityAirtimeTopUpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 97;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ActivityAirtimeTopUpBinding activityAirtimeTopUpBinding = (ActivityAirtimeTopUpBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_airtime_top_up, viewGroup, z, obj);
        int i3 = ShareDataUIState + 67;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return activityAirtimeTopUpBinding;
    }

    public static ActivityAirtimeTopUpBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 99;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityAirtimeTopUpBinding activityAirtimeTopUpBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 31;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityAirtimeTopUpBindingInflate;
    }

    @Deprecated
    public static ActivityAirtimeTopUpBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 107;
        ShareDataUIState = i2 % 128;
        ActivityAirtimeTopUpBinding activityAirtimeTopUpBinding = (ActivityAirtimeTopUpBinding) (i2 % 2 != 0 ? ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_airtime_top_up, null, true, obj) : ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_airtime_top_up, null, false, obj));
        int i3 = ShareDataUIState + 57;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 21 / 0;
        }
        return activityAirtimeTopUpBinding;
    }

    public static ActivityAirtimeTopUpBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 51;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityAirtimeTopUpBinding activityAirtimeTopUpBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 19;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return activityAirtimeTopUpBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityAirtimeTopUpBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        component1 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        ActivityAirtimeTopUpBinding activityAirtimeTopUpBinding = (ActivityAirtimeTopUpBinding) bind(obj, view, R.layout.activity_airtime_top_up);
        int i3 = ShareDataUIState + 85;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return activityAirtimeTopUpBinding;
        }
        obj2.hashCode();
        throw null;
    }
}
