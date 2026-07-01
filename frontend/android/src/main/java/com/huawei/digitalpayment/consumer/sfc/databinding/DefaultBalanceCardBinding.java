package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class DefaultBalanceCardBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component1;

    protected DefaultBalanceCardBinding(Object obj, View view, int i) {
        super(obj, view, i);
    }

    public static DefaultBalanceCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 41;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static DefaultBalanceCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 49;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DefaultBalanceCardBinding defaultBalanceCardBinding = (DefaultBalanceCardBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.default_balance_card, viewGroup, z, obj);
        int i4 = component1 + 65;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return defaultBalanceCardBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static DefaultBalanceCardBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 25;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DefaultBalanceCardBinding defaultBalanceCardBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 59;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return defaultBalanceCardBindingInflate;
    }

    @Deprecated
    public static DefaultBalanceCardBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 69;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DefaultBalanceCardBinding defaultBalanceCardBinding = (DefaultBalanceCardBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.default_balance_card, null, false, obj);
        int i4 = component1 + 121;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return defaultBalanceCardBinding;
    }

    public static DefaultBalanceCardBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 79;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        DefaultBalanceCardBinding defaultBalanceCardBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 97;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            return defaultBalanceCardBindingBind;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static DefaultBalanceCardBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 97;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        DefaultBalanceCardBinding defaultBalanceCardBinding = (DefaultBalanceCardBinding) bind(obj, view, R.layout.default_balance_card);
        int i3 = ShareDataUIState + 69;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 87 / 0;
        }
        return defaultBalanceCardBinding;
    }
}
