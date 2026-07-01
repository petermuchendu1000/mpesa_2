package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ItemRegisteredMsisdnBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component2;
    public final TextView tvMsisdn;

    protected ItemRegisteredMsisdnBinding(Object obj, View view, int i, TextView textView) {
        super(obj, view, i);
        this.tvMsisdn = textView;
    }

    public static ItemRegisteredMsisdnBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 97;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemRegisteredMsisdnBinding itemRegisteredMsisdnBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 49;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return itemRegisteredMsisdnBindingInflate;
    }

    @Deprecated
    public static ItemRegisteredMsisdnBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        ItemRegisteredMsisdnBinding itemRegisteredMsisdnBinding;
        int i = 2 % 2;
        int i2 = component1 + 11;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            itemRegisteredMsisdnBinding = (ItemRegisteredMsisdnBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_registered_msisdn, viewGroup, z, obj);
            int i3 = 17 / 0;
        } else {
            itemRegisteredMsisdnBinding = (ItemRegisteredMsisdnBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_registered_msisdn, viewGroup, z, obj);
        }
        int i4 = component1 + 15;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
        return itemRegisteredMsisdnBinding;
    }

    public static ItemRegisteredMsisdnBinding inflate(LayoutInflater layoutInflater) {
        ItemRegisteredMsisdnBinding itemRegisteredMsisdnBindingInflate;
        int i = 2 % 2;
        int i2 = component2 + 33;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            itemRegisteredMsisdnBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            int i3 = 58 / 0;
        } else {
            itemRegisteredMsisdnBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component1 + 93;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return itemRegisteredMsisdnBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ItemRegisteredMsisdnBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 73;
        component2 = i2 % 128;
        Object obj2 = null;
        ItemRegisteredMsisdnBinding itemRegisteredMsisdnBinding = (ItemRegisteredMsisdnBinding) ViewDataBinding.inflateInternal(layoutInflater, i2 % 2 != 0 ? R.layout.item_registered_msisdn : R.layout.item_registered_msisdn, null, false, obj);
        int i3 = component2 + 115;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return itemRegisteredMsisdnBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ItemRegisteredMsisdnBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 57;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemRegisteredMsisdnBinding itemRegisteredMsisdnBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 105;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
        return itemRegisteredMsisdnBindingBind;
    }

    @Deprecated
    public static ItemRegisteredMsisdnBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 77;
        component2 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        ItemRegisteredMsisdnBinding itemRegisteredMsisdnBinding = (ItemRegisteredMsisdnBinding) bind(obj, view, R.layout.item_registered_msisdn);
        int i3 = component1 + 77;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return itemRegisteredMsisdnBinding;
        }
        obj2.hashCode();
        throw null;
    }
}
