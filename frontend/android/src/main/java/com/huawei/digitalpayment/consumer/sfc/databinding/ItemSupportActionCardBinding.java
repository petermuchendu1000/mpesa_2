package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ItemSupportActionCardBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int copydefault;
    public final ConstraintLayout csImgIcon;
    public final ImageView imgIcon;
    public final TextView tvTitle;

    protected ItemSupportActionCardBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        super(obj, view, i);
        this.csImgIcon = constraintLayout;
        this.imgIcon = imageView;
        this.tvTitle = textView;
    }

    public static ItemSupportActionCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 63;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ItemSupportActionCardBinding itemSupportActionCardBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 23;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return itemSupportActionCardBindingInflate;
    }

    @Deprecated
    public static ItemSupportActionCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 113;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemSupportActionCardBinding itemSupportActionCardBinding = (ItemSupportActionCardBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_support_action_card, viewGroup, z, obj);
        int i4 = component2 + 55;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return itemSupportActionCardBinding;
    }

    public static ItemSupportActionCardBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemSupportActionCardBinding itemSupportActionCardBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 71;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
        return itemSupportActionCardBindingInflate;
    }

    @Deprecated
    public static ItemSupportActionCardBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        ItemSupportActionCardBinding itemSupportActionCardBinding = (ItemSupportActionCardBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_support_action_card, null, false, obj);
        int i4 = copydefault + 101;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return itemSupportActionCardBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ItemSupportActionCardBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 3;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ItemSupportActionCardBinding itemSupportActionCardBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 63;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 36 / 0;
        }
        return itemSupportActionCardBindingBind;
    }

    @Deprecated
    public static ItemSupportActionCardBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 51;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        ItemSupportActionCardBinding itemSupportActionCardBinding = (ItemSupportActionCardBinding) bind(obj, view, R.layout.item_support_action_card);
        int i3 = component2 + 25;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 74 / 0;
        }
        return itemSupportActionCardBinding;
    }
}
