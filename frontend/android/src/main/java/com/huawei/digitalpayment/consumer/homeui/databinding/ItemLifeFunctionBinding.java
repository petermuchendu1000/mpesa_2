package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class ItemLifeFunctionBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component3 = 1;
    public final ImageView ivFunctionIcon;
    public final ImageView ivMarker;
    public final TextView tvFunctionName;
    public final RoundTextView tvRedDot;
    public final View viewNotification;

    protected ItemLifeFunctionBinding(Object obj, View view, int i, ImageView imageView, ImageView imageView2, TextView textView, RoundTextView roundTextView, View view2) {
        super(obj, view, i);
        this.ivFunctionIcon = imageView;
        this.ivMarker = imageView2;
        this.tvFunctionName = textView;
        this.tvRedDot = roundTextView;
        this.viewNotification = view2;
    }

    public static ItemLifeFunctionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 89;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemLifeFunctionBinding itemLifeFunctionBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 57 / 0;
        }
        return itemLifeFunctionBindingInflate;
    }

    @Deprecated
    public static ItemLifeFunctionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 7;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemLifeFunctionBinding itemLifeFunctionBinding = (ItemLifeFunctionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_life_function, viewGroup, z, obj);
        int i4 = component1 + 41;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemLifeFunctionBinding;
    }

    public static ItemLifeFunctionBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 9;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemLifeFunctionBinding itemLifeFunctionBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 45;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemLifeFunctionBindingInflate;
    }

    @Deprecated
    public static ItemLifeFunctionBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 91;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemLifeFunctionBinding itemLifeFunctionBinding = (ItemLifeFunctionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_life_function, null, false, obj);
        int i4 = component3 + 73;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return itemLifeFunctionBinding;
    }

    public static ItemLifeFunctionBinding bind(View view) {
        ItemLifeFunctionBinding itemLifeFunctionBindingBind;
        int i = 2 % 2;
        int i2 = component1 + 13;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            itemLifeFunctionBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
            int i3 = 0 / 0;
        } else {
            itemLifeFunctionBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component3 + 65;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return itemLifeFunctionBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ItemLifeFunctionBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 3;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemLifeFunctionBinding itemLifeFunctionBinding = (ItemLifeFunctionBinding) bind(obj, view, R.layout.item_life_function);
        int i4 = component1 + 3;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return itemLifeFunctionBinding;
        }
        throw null;
    }
}
