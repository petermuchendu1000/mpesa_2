package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.input.MenuView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class ItemHomeServiceBinding extends ViewDataBinding {
    private static int component3 = 0;
    private static int copydefault = 1;
    public final MenuView menuView;

    protected ItemHomeServiceBinding(Object obj, View view, int i, MenuView menuView) {
        super(obj, view, i);
        this.menuView = menuView;
    }

    public static ItemHomeServiceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        ItemHomeServiceBinding itemHomeServiceBindingInflate;
        int i = 2 % 2;
        int i2 = copydefault + 41;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            itemHomeServiceBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            int i3 = 23 / 0;
        } else {
            itemHomeServiceBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component3 + 71;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
        return itemHomeServiceBindingInflate;
    }

    @Deprecated
    public static ItemHomeServiceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 75;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_home_service, viewGroup, z, obj);
        if (i3 != 0) {
            return (ItemHomeServiceBinding) viewDataBindingInflateInternal;
        }
        throw null;
    }

    public static ItemHomeServiceBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemHomeServiceBinding itemHomeServiceBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 79;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
        return itemHomeServiceBindingInflate;
    }

    @Deprecated
    public static ItemHomeServiceBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component3 + 51;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.item_home_service;
            z = true;
        } else {
            i = R.layout.item_home_service;
            z = false;
        }
        return (ItemHomeServiceBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
    }

    public static ItemHomeServiceBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 81;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ItemHomeServiceBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemHomeServiceBinding itemHomeServiceBinding = (ItemHomeServiceBinding) bind(obj, view, R.layout.item_home_service);
        int i4 = copydefault + 55;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
        return itemHomeServiceBinding;
    }
}
