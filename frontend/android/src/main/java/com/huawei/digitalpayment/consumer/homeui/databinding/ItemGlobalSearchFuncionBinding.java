package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class ItemGlobalSearchFuncionBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    public final RoundImageView ivFunction;
    public final TextView tvFunction;

    protected ItemGlobalSearchFuncionBinding(Object obj, View view, int i, RoundImageView roundImageView, TextView textView) {
        super(obj, view, i);
        this.ivFunction = roundImageView;
        this.tvFunction = textView;
    }

    public static ItemGlobalSearchFuncionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemGlobalSearchFuncionBinding itemGlobalSearchFuncionBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 73;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
        return itemGlobalSearchFuncionBindingInflate;
    }

    @Deprecated
    public static ItemGlobalSearchFuncionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemGlobalSearchFuncionBinding itemGlobalSearchFuncionBinding = (ItemGlobalSearchFuncionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_global_search_funcion, viewGroup, z, obj);
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
        return itemGlobalSearchFuncionBinding;
    }

    public static ItemGlobalSearchFuncionBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemGlobalSearchFuncionBinding itemGlobalSearchFuncionBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 21;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return itemGlobalSearchFuncionBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ItemGlobalSearchFuncionBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        copydefault = i2 % 128;
        return (ItemGlobalSearchFuncionBinding) ViewDataBinding.inflateInternal(layoutInflater, i2 % 2 != 0 ? R.layout.item_global_search_funcion : R.layout.item_global_search_funcion, null, false, obj);
    }

    public static ItemGlobalSearchFuncionBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 107;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ItemGlobalSearchFuncionBinding itemGlobalSearchFuncionBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = copydefault + 67;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return itemGlobalSearchFuncionBindingBind;
    }

    @Deprecated
    public static ItemGlobalSearchFuncionBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.item_global_search_funcion);
        if (i3 == 0) {
            return (ItemGlobalSearchFuncionBinding) viewDataBindingBind;
        }
        throw null;
    }
}
