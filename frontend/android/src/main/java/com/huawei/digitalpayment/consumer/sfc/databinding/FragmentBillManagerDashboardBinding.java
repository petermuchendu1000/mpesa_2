package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class FragmentBillManagerDashboardBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int copydefault;
    public final ComposeView composeView;

    protected FragmentBillManagerDashboardBinding(Object obj, View view, int i, ComposeView composeView) {
        super(obj, view, i);
        this.composeView = composeView;
    }

    public static FragmentBillManagerDashboardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentBillManagerDashboardBinding fragmentBillManagerDashboardBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 35;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return fragmentBillManagerDashboardBindingInflate;
    }

    @Deprecated
    public static FragmentBillManagerDashboardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentBillManagerDashboardBinding fragmentBillManagerDashboardBinding = (FragmentBillManagerDashboardBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_bill_manager_dashboard, viewGroup, z, obj);
        int i4 = copydefault + 37;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentBillManagerDashboardBinding;
        }
        throw null;
    }

    public static FragmentBillManagerDashboardBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 25;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentBillManagerDashboardBinding fragmentBillManagerDashboardBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 85;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return fragmentBillManagerDashboardBindingInflate;
    }

    @Deprecated
    public static FragmentBillManagerDashboardBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 45;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentBillManagerDashboardBinding fragmentBillManagerDashboardBinding = (FragmentBillManagerDashboardBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_bill_manager_dashboard, null, false, obj);
        int i4 = copydefault + 97;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentBillManagerDashboardBinding;
    }

    public static FragmentBillManagerDashboardBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 49;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentBillManagerDashboardBinding fragmentBillManagerDashboardBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 17 / 0;
        }
        return fragmentBillManagerDashboardBindingBind;
    }

    @Deprecated
    public static FragmentBillManagerDashboardBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 93;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.fragment_bill_manager_dashboard);
        if (i3 == 0) {
            return (FragmentBillManagerDashboardBinding) viewDataBindingBind;
        }
        throw null;
    }
}
