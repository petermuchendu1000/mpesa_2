package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.input.MenuView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class ItemLifeServiceBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int copydefault;
    public final MenuView menuView;

    protected ItemLifeServiceBinding(Object obj, View view, int i, MenuView menuView) {
        super(obj, view, i);
        this.menuView = menuView;
    }

    public static ItemLifeServiceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemLifeServiceBinding itemLifeServiceBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 55;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return itemLifeServiceBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ItemLifeServiceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 19;
        component2 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        ItemLifeServiceBinding itemLifeServiceBinding = (ItemLifeServiceBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_life_service, viewGroup, z, obj);
        int i3 = copydefault + 77;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            return itemLifeServiceBinding;
        }
        throw null;
    }

    public static ItemLifeServiceBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 107;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ItemLifeServiceBinding itemLifeServiceBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = copydefault + 35;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return itemLifeServiceBindingInflate;
    }

    @Deprecated
    public static ItemLifeServiceBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        ItemLifeServiceBinding itemLifeServiceBinding = (ItemLifeServiceBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_life_service, null, false, obj);
        int i4 = component2 + 125;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return itemLifeServiceBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ItemLifeServiceBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ItemLifeServiceBinding itemLifeServiceBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = copydefault + 81;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return itemLifeServiceBindingBind;
    }

    @Deprecated
    public static ItemLifeServiceBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemLifeServiceBinding itemLifeServiceBinding = (ItemLifeServiceBinding) bind(obj, view, R.layout.item_life_service);
        int i4 = copydefault + 11;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return itemLifeServiceBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
