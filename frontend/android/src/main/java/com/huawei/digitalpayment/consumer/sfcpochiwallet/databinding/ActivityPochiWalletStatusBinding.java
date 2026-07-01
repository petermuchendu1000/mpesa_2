package com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.sfcpochiwallet.R;

public abstract class ActivityPochiWalletStatusBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int copydefault;
    public final FrameLayout root;

    protected ActivityPochiWalletStatusBinding(Object obj, View view, int i, FrameLayout frameLayout) {
        super(obj, view, i);
        this.root = frameLayout;
    }

    public static ActivityPochiWalletStatusBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 75;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityPochiWalletStatusBinding activityPochiWalletStatusBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 93;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activityPochiWalletStatusBindingInflate;
    }

    @Deprecated
    public static ActivityPochiWalletStatusBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityPochiWalletStatusBinding activityPochiWalletStatusBinding = (ActivityPochiWalletStatusBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_pochi_wallet_status, viewGroup, z, obj);
        int i4 = copydefault + 87;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activityPochiWalletStatusBinding;
    }

    public static ActivityPochiWalletStatusBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 97;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        ActivityPochiWalletStatusBinding activityPochiWalletStatusBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 15;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            return activityPochiWalletStatusBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityPochiWalletStatusBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityPochiWalletStatusBinding activityPochiWalletStatusBinding = (ActivityPochiWalletStatusBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_pochi_wallet_status, null, false, obj);
        int i4 = copydefault + 105;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activityPochiWalletStatusBinding;
    }

    public static ActivityPochiWalletStatusBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityPochiWalletStatusBinding activityPochiWalletStatusBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 41;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityPochiWalletStatusBindingBind;
    }

    @Deprecated
    public static ActivityPochiWalletStatusBinding bind(View view, Object obj) {
        ActivityPochiWalletStatusBinding activityPochiWalletStatusBinding;
        int i = 2 % 2;
        int i2 = copydefault + 115;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            activityPochiWalletStatusBinding = (ActivityPochiWalletStatusBinding) bind(obj, view, R.layout.activity_pochi_wallet_status);
            int i3 = 98 / 0;
        } else {
            activityPochiWalletStatusBinding = (ActivityPochiWalletStatusBinding) bind(obj, view, R.layout.activity_pochi_wallet_status);
        }
        int i4 = component2 + 59;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityPochiWalletStatusBinding;
    }
}
