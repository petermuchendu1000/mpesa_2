package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivityWithdrawBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    public final ComposeView composeTabs;
    public final ViewPager2 viewPager;

    protected ActivityWithdrawBinding(Object obj, View view, int i, ComposeView composeView, ViewPager2 viewPager2) {
        super(obj, view, i);
        this.composeTabs = composeView;
        this.viewPager = viewPager2;
    }

    public static ActivityWithdrawBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityWithdrawBinding activityWithdrawBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
        return activityWithdrawBindingInflate;
    }

    @Deprecated
    public static ActivityWithdrawBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityWithdrawBinding activityWithdrawBinding = (ActivityWithdrawBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_withdraw, viewGroup, z, obj);
        int i4 = ShareDataUIState + 103;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activityWithdrawBinding;
    }

    public static ActivityWithdrawBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityWithdrawBinding activityWithdrawBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 55;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityWithdrawBindingInflate;
    }

    @Deprecated
    public static ActivityWithdrawBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return (ActivityWithdrawBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_withdraw, null, false, obj);
    }

    public static ActivityWithdrawBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 21;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityWithdrawBinding activityWithdrawBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 75;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activityWithdrawBindingBind;
    }

    @Deprecated
    public static ActivityWithdrawBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 103;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityWithdrawBinding activityWithdrawBinding = (ActivityWithdrawBinding) bind(obj, view, R.layout.activity_withdraw);
        int i4 = component3 + 63;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
        return activityWithdrawBinding;
    }
}
