package com.huawei.digitalpayment.checkoutUi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.checkoutUi.R;

public abstract class ItemBnplBinding extends ViewDataBinding {
    private static int component2 = 0;
    private static int copydefault = 1;
    public final RoundLinearLayout llContent;
    public final TextView tvFee;
    public final TextView tvProducts;
    public final TextView tvTitle;

    protected ItemBnplBinding(Object obj, View view, int i, RoundLinearLayout roundLinearLayout, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.llContent = roundLinearLayout;
        this.tvFee = textView;
        this.tvProducts = textView2;
        this.tvTitle = textView3;
    }

    public static ItemBnplBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 107;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemBnplBinding itemBnplBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 13;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return itemBnplBindingInflate;
    }

    @Deprecated
    public static ItemBnplBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 37;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemBnplBinding itemBnplBinding = (ItemBnplBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_bnpl, viewGroup, z, obj);
        int i4 = copydefault + 13;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return itemBnplBinding;
    }

    public static ItemBnplBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 25;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemBnplBinding itemBnplBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 16 / 0;
        }
        return itemBnplBindingInflate;
    }

    @Deprecated
    public static ItemBnplBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 125;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return (ItemBnplBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_bnpl, null, false, obj);
    }

    public static ItemBnplBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemBnplBinding itemBnplBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 117;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return itemBnplBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static ItemBnplBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 41;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemBnplBinding itemBnplBinding = (ItemBnplBinding) bind(obj, view, R.layout.item_bnpl);
        int i4 = component2 + 81;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return itemBnplBinding;
        }
        throw null;
    }
}
