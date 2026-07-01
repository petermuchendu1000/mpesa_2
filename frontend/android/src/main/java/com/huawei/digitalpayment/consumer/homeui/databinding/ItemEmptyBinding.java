package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class ItemEmptyBinding extends ViewDataBinding {
    private static int component2 = 0;
    private static int component3 = 1;

    protected ItemEmptyBinding(Object obj, View view, int i) {
        super(obj, view, i);
    }

    public static ItemEmptyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        ItemEmptyBinding itemEmptyBindingInflate;
        int i = 2 % 2;
        int i2 = component2 + 59;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            itemEmptyBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            int i3 = 59 / 0;
        } else {
            itemEmptyBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component2 + 23;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemEmptyBindingInflate;
    }

    @Deprecated
    public static ItemEmptyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        ItemEmptyBinding itemEmptyBinding;
        int i = 2 % 2;
        int i2 = component2 + 105;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            itemEmptyBinding = (ItemEmptyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_empty, viewGroup, z, obj);
            int i3 = 36 / 0;
        } else {
            itemEmptyBinding = (ItemEmptyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_empty, viewGroup, z, obj);
        }
        int i4 = component2 + 61;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemEmptyBinding;
    }

    public static ItemEmptyBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 83;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemEmptyBinding itemEmptyBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 53;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
        return itemEmptyBindingInflate;
    }

    @Deprecated
    public static ItemEmptyBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 55;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemEmptyBinding itemEmptyBinding = (ItemEmptyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_empty, null, false, obj);
        int i4 = component2 + 79;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemEmptyBinding;
    }

    public static ItemEmptyBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 79;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemEmptyBinding itemEmptyBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 1;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemEmptyBindingBind;
    }

    @Deprecated
    public static ItemEmptyBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 1;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ItemEmptyBinding itemEmptyBinding = (ItemEmptyBinding) bind(obj, view, R.layout.item_empty);
        int i3 = component2 + 57;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return itemEmptyBinding;
    }
}
