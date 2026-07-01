package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class ItemLifeGroupFunctionBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component2 = 1;
    public final RecyclerView groupFunctionRecycler;
    public final ImageView ivArrow;
    public final ImageView ivMarker;
    public final TextView tvTitle;
    public final View viewMargin;

    protected ItemLifeGroupFunctionBinding(Object obj, View view, int i, RecyclerView recyclerView, ImageView imageView, ImageView imageView2, TextView textView, View view2) {
        super(obj, view, i);
        this.groupFunctionRecycler = recyclerView;
        this.ivArrow = imageView;
        this.ivMarker = imageView2;
        this.tvTitle = textView;
        this.viewMargin = view2;
    }

    public static ItemLifeGroupFunctionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 97;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemLifeGroupFunctionBinding itemLifeGroupFunctionBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 71;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return itemLifeGroupFunctionBindingInflate;
    }

    @Deprecated
    public static ItemLifeGroupFunctionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 25;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemLifeGroupFunctionBinding itemLifeGroupFunctionBinding = (ItemLifeGroupFunctionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_life_group_function, viewGroup, z, obj);
        if (i3 != 0) {
            return itemLifeGroupFunctionBinding;
        }
        throw null;
    }

    public static ItemLifeGroupFunctionBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 75;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemLifeGroupFunctionBinding itemLifeGroupFunctionBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 77 / 0;
        }
        return itemLifeGroupFunctionBindingInflate;
    }

    @Deprecated
    public static ItemLifeGroupFunctionBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 51;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        ItemLifeGroupFunctionBinding itemLifeGroupFunctionBinding = (ItemLifeGroupFunctionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_life_group_function, null, false, obj);
        int i4 = component1 + 57;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return itemLifeGroupFunctionBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ItemLifeGroupFunctionBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 59;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemLifeGroupFunctionBinding itemLifeGroupFunctionBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 55;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return itemLifeGroupFunctionBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static ItemLifeGroupFunctionBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 51;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemLifeGroupFunctionBinding itemLifeGroupFunctionBinding = (ItemLifeGroupFunctionBinding) bind(obj, view, R.layout.item_life_group_function);
        int i4 = component1 + 61;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return itemLifeGroupFunctionBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
