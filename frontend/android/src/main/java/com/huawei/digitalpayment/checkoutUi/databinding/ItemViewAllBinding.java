package com.huawei.digitalpayment.checkoutUi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.checkoutUi.R;

public abstract class ItemViewAllBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component2;
    public final ImageView imViewall;
    public final ConstraintLayout llItem;
    public final TextView tvViewAll;

    protected ItemViewAllBinding(Object obj, View view, int i, ImageView imageView, ConstraintLayout constraintLayout, TextView textView) {
        super(obj, view, i);
        this.imViewall = imageView;
        this.llItem = constraintLayout;
        this.tvViewAll = textView;
    }

    public static ItemViewAllBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 15;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ItemViewAllBinding itemViewAllBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 27;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return itemViewAllBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ItemViewAllBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 79;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemViewAllBinding itemViewAllBinding = (ItemViewAllBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_view_all, viewGroup, z, obj);
        int i4 = component2 + 111;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return itemViewAllBinding;
    }

    public static ItemViewAllBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 55;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemViewAllBinding itemViewAllBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 107;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 7 / 0;
        }
        return itemViewAllBindingInflate;
    }

    @Deprecated
    public static ItemViewAllBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 119;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemViewAllBinding itemViewAllBinding = (ItemViewAllBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_view_all, null, false, obj);
        int i4 = component1 + 75;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return itemViewAllBinding;
        }
        throw null;
    }

    public static ItemViewAllBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 27;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemViewAllBinding itemViewAllBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 49;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
        return itemViewAllBindingBind;
    }

    @Deprecated
    public static ItemViewAllBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 1;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.item_view_all);
        if (i3 == 0) {
            return (ItemViewAllBinding) viewDataBindingBind;
        }
        throw null;
    }
}
