package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundRecyclerView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class ItemHomePinGroupFunctionBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int copydefault;
    public final RoundRecyclerView groupFunctionRecycler;

    protected ItemHomePinGroupFunctionBinding(Object obj, View view, int i, RoundRecyclerView roundRecyclerView) {
        super(obj, view, i);
        this.groupFunctionRecycler = roundRecyclerView;
    }

    public static ItemHomePinGroupFunctionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemHomePinGroupFunctionBinding itemHomePinGroupFunctionBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 9;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return itemHomePinGroupFunctionBindingInflate;
    }

    @Deprecated
    public static ItemHomePinGroupFunctionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 95;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_home_pin_group_function, viewGroup, z, obj);
        if (i3 == 0) {
            return (ItemHomePinGroupFunctionBinding) viewDataBindingInflateInternal;
        }
        int i4 = 47 / 0;
        return (ItemHomePinGroupFunctionBinding) viewDataBindingInflateInternal;
    }

    public static ItemHomePinGroupFunctionBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ItemHomePinGroupFunctionBinding itemHomePinGroupFunctionBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = copydefault + 15;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 10 / 0;
        }
        return itemHomePinGroupFunctionBindingInflate;
    }

    @Deprecated
    public static ItemHomePinGroupFunctionBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 79;
        copydefault = i2 % 128;
        return (ItemHomePinGroupFunctionBinding) ViewDataBinding.inflateInternal(layoutInflater, i2 % 2 != 0 ? R.layout.item_home_pin_group_function : R.layout.item_home_pin_group_function, null, false, obj);
    }

    public static ItemHomePinGroupFunctionBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ItemHomePinGroupFunctionBinding itemHomePinGroupFunctionBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = copydefault + 117;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return itemHomePinGroupFunctionBindingBind;
    }

    @Deprecated
    public static ItemHomePinGroupFunctionBinding bind(View view, Object obj) {
        ItemHomePinGroupFunctionBinding itemHomePinGroupFunctionBinding;
        int i = 2 % 2;
        int i2 = copydefault + 61;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            itemHomePinGroupFunctionBinding = (ItemHomePinGroupFunctionBinding) bind(obj, view, R.layout.item_home_pin_group_function);
            int i3 = 45 / 0;
        } else {
            itemHomePinGroupFunctionBinding = (ItemHomePinGroupFunctionBinding) bind(obj, view, R.layout.item_home_pin_group_function);
        }
        int i4 = copydefault + 91;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return itemHomePinGroupFunctionBinding;
        }
        throw null;
    }
}
