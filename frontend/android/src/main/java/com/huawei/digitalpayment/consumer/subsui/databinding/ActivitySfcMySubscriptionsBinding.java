package com.huawei.digitalpayment.consumer.subsui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.subsui.R;

public abstract class ActivitySfcMySubscriptionsBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component2;
    public final ComposeView composeView;

    protected ActivitySfcMySubscriptionsBinding(Object obj, View view, int i, ComposeView composeView) {
        super(obj, view, i);
        this.composeView = composeView;
    }

    public static ActivitySfcMySubscriptionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 51;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcMySubscriptionsBinding activitySfcMySubscriptionsBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 49;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcMySubscriptionsBindingInflate;
    }

    @Deprecated
    public static ActivitySfcMySubscriptionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 55;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        ActivitySfcMySubscriptionsBinding activitySfcMySubscriptionsBinding = (ActivitySfcMySubscriptionsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_my_subscriptions, viewGroup, z, obj);
        int i3 = component2 + 43;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return activitySfcMySubscriptionsBinding;
    }

    public static ActivitySfcMySubscriptionsBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 27;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcMySubscriptionsBinding activitySfcMySubscriptionsBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 61;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcMySubscriptionsBindingInflate;
    }

    @Deprecated
    public static ActivitySfcMySubscriptionsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 109;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        ActivitySfcMySubscriptionsBinding activitySfcMySubscriptionsBinding = (ActivitySfcMySubscriptionsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_my_subscriptions, null, false, obj);
        int i4 = component1 + 59;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySfcMySubscriptionsBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ActivitySfcMySubscriptionsBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 101;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcMySubscriptionsBinding activitySfcMySubscriptionsBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 99;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcMySubscriptionsBindingBind;
    }

    @Deprecated
    public static ActivitySfcMySubscriptionsBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 49;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcMySubscriptionsBinding activitySfcMySubscriptionsBinding = (ActivitySfcMySubscriptionsBinding) bind(obj, view, R.layout.activity_sfc_my_subscriptions);
        int i4 = component2 + 65;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcMySubscriptionsBinding;
    }
}
