package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ItemMiniappListBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int copydefault;
    public final ImageView imgIcon;
    public final TextView tvAppName;

    protected ItemMiniappListBinding(Object obj, View view, int i, ImageView imageView, TextView textView) {
        super(obj, view, i);
        this.imgIcon = imageView;
        this.tvAppName = textView;
    }

    public static ItemMiniappListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemMiniappListBinding itemMiniappListBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
        return itemMiniappListBindingInflate;
    }

    @Deprecated
    public static ItemMiniappListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemMiniappListBinding itemMiniappListBinding = (ItemMiniappListBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_miniapp_list, viewGroup, z, obj);
        int i4 = component2 + 35;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return itemMiniappListBinding;
        }
        throw null;
    }

    public static ItemMiniappListBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 77;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ItemMiniappListBinding itemMiniappListBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 79;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return itemMiniappListBindingInflate;
    }

    @Deprecated
    public static ItemMiniappListBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemMiniappListBinding itemMiniappListBinding = (ItemMiniappListBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_miniapp_list, null, false, obj);
        int i4 = copydefault + 69;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return itemMiniappListBinding;
    }

    public static ItemMiniappListBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemMiniappListBinding itemMiniappListBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 13;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return itemMiniappListBindingBind;
    }

    @Deprecated
    public static ItemMiniappListBinding bind(View view, Object obj) {
        ItemMiniappListBinding itemMiniappListBinding;
        int i = 2 % 2;
        int i2 = component2 + 61;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            itemMiniappListBinding = (ItemMiniappListBinding) bind(obj, view, R.layout.item_miniapp_list);
            int i3 = 80 / 0;
        } else {
            itemMiniappListBinding = (ItemMiniappListBinding) bind(obj, view, R.layout.item_miniapp_list);
        }
        int i4 = copydefault + 61;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return itemMiniappListBinding;
    }
}
