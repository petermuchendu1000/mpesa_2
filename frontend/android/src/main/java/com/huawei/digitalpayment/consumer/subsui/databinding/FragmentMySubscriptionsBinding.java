package com.huawei.digitalpayment.consumer.subsui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.subsui.R;

public abstract class FragmentMySubscriptionsBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;

    protected FragmentMySubscriptionsBinding(Object obj, View view, int i) {
        super(obj, view, i);
    }

    public static FragmentMySubscriptionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentMySubscriptionsBinding fragmentMySubscriptionsBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 13;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentMySubscriptionsBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentMySubscriptionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentMySubscriptionsBinding fragmentMySubscriptionsBinding = (FragmentMySubscriptionsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_my_subscriptions, viewGroup, z, obj);
        int i4 = copydefault + 93;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return fragmentMySubscriptionsBinding;
    }

    public static FragmentMySubscriptionsBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        throw null;
    }

    @Deprecated
    public static FragmentMySubscriptionsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 49;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.fragment_my_subscriptions;
            z = true;
        } else {
            i = R.layout.fragment_my_subscriptions;
            z = false;
        }
        FragmentMySubscriptionsBinding fragmentMySubscriptionsBinding = (FragmentMySubscriptionsBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = copydefault + 41;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentMySubscriptionsBinding;
        }
        throw null;
    }

    public static FragmentMySubscriptionsBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentMySubscriptionsBinding fragmentMySubscriptionsBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        return fragmentMySubscriptionsBindingBind;
    }

    @Deprecated
    public static FragmentMySubscriptionsBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentMySubscriptionsBinding fragmentMySubscriptionsBinding = (FragmentMySubscriptionsBinding) bind(obj, view, R.layout.fragment_my_subscriptions);
        int i4 = ShareDataUIState + 83;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return fragmentMySubscriptionsBinding;
    }
}
