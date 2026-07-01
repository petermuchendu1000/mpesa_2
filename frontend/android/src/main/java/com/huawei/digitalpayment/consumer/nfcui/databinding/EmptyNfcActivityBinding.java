package com.huawei.digitalpayment.consumer.nfcui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.nfcui.R;

public abstract class EmptyNfcActivityBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int copydefault = 1;

    protected EmptyNfcActivityBinding(Object obj, View view, int i) {
        super(obj, view, i);
    }

    public static EmptyNfcActivityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 51;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        EmptyNfcActivityBinding emptyNfcActivityBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 3;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            return emptyNfcActivityBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static EmptyNfcActivityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        EmptyNfcActivityBinding emptyNfcActivityBinding = (EmptyNfcActivityBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.empty_nfc_activity, viewGroup, z, obj);
        int i4 = copydefault + 5;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return emptyNfcActivityBinding;
    }

    public static EmptyNfcActivityBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        EmptyNfcActivityBinding emptyNfcActivityBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 119;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return emptyNfcActivityBindingInflate;
    }

    @Deprecated
    public static EmptyNfcActivityBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component1 + 15;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.empty_nfc_activity;
            z = true;
        } else {
            i = R.layout.empty_nfc_activity;
            z = false;
        }
        EmptyNfcActivityBinding emptyNfcActivityBinding = (EmptyNfcActivityBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = copydefault + 93;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return emptyNfcActivityBinding;
    }

    public static EmptyNfcActivityBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 77;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        EmptyNfcActivityBinding emptyNfcActivityBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 93;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return emptyNfcActivityBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static EmptyNfcActivityBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 41;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        EmptyNfcActivityBinding emptyNfcActivityBinding = (EmptyNfcActivityBinding) bind(obj, view, R.layout.empty_nfc_activity);
        int i3 = component1 + 69;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return emptyNfcActivityBinding;
    }
}
