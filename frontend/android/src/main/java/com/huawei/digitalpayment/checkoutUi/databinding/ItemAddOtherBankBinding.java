package com.huawei.digitalpayment.checkoutUi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.checkoutUi.R;

public abstract class ItemAddOtherBankBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component2 = 1;
    public final ImageView imViewall;
    public final LinearLayout llViewAll;
    public final TextView tvViewall;

    protected ItemAddOtherBankBinding(Object obj, View view, int i, ImageView imageView, LinearLayout linearLayout, TextView textView) {
        super(obj, view, i);
        this.imViewall = imageView;
        this.llViewAll = linearLayout;
        this.tvViewall = textView;
    }

    public static ItemAddOtherBankBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 83;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemAddOtherBankBinding itemAddOtherBankBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        return itemAddOtherBankBindingInflate;
    }

    @Deprecated
    public static ItemAddOtherBankBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 99;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_add_other_bank, viewGroup, z, obj);
        if (i3 == 0) {
            return (ItemAddOtherBankBinding) viewDataBindingInflateInternal;
        }
        throw null;
    }

    public static ItemAddOtherBankBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 37;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ItemAddOtherBankBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component2 + 5;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.item_add_other_bank;
            z = true;
        } else {
            i = R.layout.item_add_other_bank;
            z = false;
        }
        return (ItemAddOtherBankBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
    }

    public static ItemAddOtherBankBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 51;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemAddOtherBankBinding itemAddOtherBankBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 31;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return itemAddOtherBankBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static ItemAddOtherBankBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 45;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemAddOtherBankBinding itemAddOtherBankBinding = (ItemAddOtherBankBinding) bind(obj, view, R.layout.item_add_other_bank);
        int i4 = component1 + 47;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return itemAddOtherBankBinding;
        }
        throw null;
    }
}
