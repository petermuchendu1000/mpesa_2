package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundRecyclerView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class ItemMyFunctionGroupBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component1;
    public final RoundRecyclerView myRecycler;

    protected ItemMyFunctionGroupBinding(Object obj, View view, int i, RoundRecyclerView roundRecyclerView) {
        super(obj, view, i);
        this.myRecycler = roundRecyclerView;
    }

    public static ItemMyFunctionGroupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 53;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemMyFunctionGroupBinding itemMyFunctionGroupBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        return itemMyFunctionGroupBindingInflate;
    }

    @Deprecated
    public static ItemMyFunctionGroupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_my_function_group, viewGroup, z, obj);
        if (i3 == 0) {
            return (ItemMyFunctionGroupBinding) viewDataBindingInflateInternal;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ItemMyFunctionGroupBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemMyFunctionGroupBinding itemMyFunctionGroupBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 25;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return itemMyFunctionGroupBindingInflate;
    }

    @Deprecated
    public static ItemMyFunctionGroupBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 63;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemMyFunctionGroupBinding itemMyFunctionGroupBinding = (ItemMyFunctionGroupBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_my_function_group, null, false, obj);
        int i4 = component1 + 107;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return itemMyFunctionGroupBinding;
    }

    public static ItemMyFunctionGroupBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ItemMyFunctionGroupBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.item_my_function_group);
        if (i3 == 0) {
            return (ItemMyFunctionGroupBinding) viewDataBindingBind;
        }
        throw null;
    }
}
