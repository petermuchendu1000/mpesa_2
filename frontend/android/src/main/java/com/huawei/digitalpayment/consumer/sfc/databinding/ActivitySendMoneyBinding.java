package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivitySendMoneyBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component3 = 1;
    public final ComposeView composeTabs;
    public final ViewPager2 viewPager;

    protected ActivitySendMoneyBinding(Object obj, View view, int i, ComposeView composeView, ViewPager2 viewPager2) {
        super(obj, view, i);
        this.composeTabs = composeView;
        this.viewPager = viewPager2;
    }

    public static ActivitySendMoneyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 117;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySendMoneyBinding activitySendMoneyBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
        return activitySendMoneyBindingInflate;
    }

    @Deprecated
    public static ActivitySendMoneyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 37;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySendMoneyBinding activitySendMoneyBinding = (ActivitySendMoneyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_send_money, viewGroup, z, obj);
        int i4 = component3 + 85;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySendMoneyBinding;
        }
        throw null;
    }

    public static ActivitySendMoneyBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 41;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySendMoneyBinding activitySendMoneyBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return activitySendMoneyBindingInflate;
    }

    @Deprecated
    public static ActivitySendMoneyBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 29;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySendMoneyBinding activitySendMoneyBinding = (ActivitySendMoneyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_send_money, null, false, obj);
        int i4 = component1 + 31;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return activitySendMoneyBinding;
        }
        throw null;
    }

    public static ActivitySendMoneyBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 89;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySendMoneyBinding activitySendMoneyBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 81;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySendMoneyBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivitySendMoneyBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 73;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.activity_send_money);
        if (i3 != 0) {
            return (ActivitySendMoneyBinding) viewDataBindingBind;
        }
        int i4 = 31 / 0;
        return (ActivitySendMoneyBinding) viewDataBindingBind;
    }
}
