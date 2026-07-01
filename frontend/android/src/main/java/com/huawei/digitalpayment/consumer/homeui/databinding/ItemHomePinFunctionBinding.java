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

public abstract class ItemHomePinFunctionBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component3;
    public final ImageView ivFunctionIcon;
    public final TextView tvFunctionName;
    public final RoundTextView tvRedDot;
    public final View viewNotification;

    protected ItemHomePinFunctionBinding(Object obj, View view, int i, ImageView imageView, TextView textView, RoundTextView roundTextView, View view2) {
        super(obj, view, i);
        this.ivFunctionIcon = imageView;
        this.tvFunctionName = textView;
        this.tvRedDot = roundTextView;
        this.viewNotification = view2;
    }

    public static ItemHomePinFunctionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 33;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemHomePinFunctionBinding itemHomePinFunctionBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 35;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return itemHomePinFunctionBindingInflate;
    }

    @Deprecated
    public static ItemHomePinFunctionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 19;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemHomePinFunctionBinding itemHomePinFunctionBinding = (ItemHomePinFunctionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_home_pin_function, viewGroup, z, obj);
        int i4 = component3 + 13;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return itemHomePinFunctionBinding;
    }

    public static ItemHomePinFunctionBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 45;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemHomePinFunctionBinding itemHomePinFunctionBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 5;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return itemHomePinFunctionBindingInflate;
    }

    @Deprecated
    public static ItemHomePinFunctionBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 81;
        component3 = i2 % 128;
        ItemHomePinFunctionBinding itemHomePinFunctionBinding = (ItemHomePinFunctionBinding) (i2 % 2 != 0 ? ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_home_pin_function, null, true, obj) : ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_home_pin_function, null, false, obj));
        int i3 = component1 + 59;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 9 / 0;
        }
        return itemHomePinFunctionBinding;
    }

    public static ItemHomePinFunctionBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 45;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemHomePinFunctionBinding itemHomePinFunctionBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 99;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return itemHomePinFunctionBindingBind;
    }

    @Deprecated
    public static ItemHomePinFunctionBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 27;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ItemHomePinFunctionBinding itemHomePinFunctionBinding = (ItemHomePinFunctionBinding) bind(obj, view, R.layout.item_home_pin_function);
        int i3 = component1 + 25;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return itemHomePinFunctionBinding;
    }
}
