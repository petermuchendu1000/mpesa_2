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

public abstract class HomeV5LifeGroupFunctionBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int component3;
    public final RecyclerView groupFunctionRecycler;
    public final ImageView ivArrow;
    public final ImageView ivMarker;
    public final TextView tvTitle;

    protected HomeV5LifeGroupFunctionBinding(Object obj, View view, int i, RecyclerView recyclerView, ImageView imageView, ImageView imageView2, TextView textView) {
        super(obj, view, i);
        this.groupFunctionRecycler = recyclerView;
        this.ivArrow = imageView;
        this.ivMarker = imageView2;
        this.tvTitle = textView;
    }

    public static HomeV5LifeGroupFunctionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 39;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        HomeV5LifeGroupFunctionBinding homeV5LifeGroupFunctionBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 97;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return homeV5LifeGroupFunctionBindingInflate;
    }

    @Deprecated
    public static HomeV5LifeGroupFunctionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 113;
        component3 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        HomeV5LifeGroupFunctionBinding homeV5LifeGroupFunctionBinding = (HomeV5LifeGroupFunctionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.home_v5_life_group_function, viewGroup, z, obj);
        int i3 = component2 + 59;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return homeV5LifeGroupFunctionBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static HomeV5LifeGroupFunctionBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 93;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        HomeV5LifeGroupFunctionBinding homeV5LifeGroupFunctionBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 44 / 0;
        }
        return homeV5LifeGroupFunctionBindingInflate;
    }

    @Deprecated
    public static HomeV5LifeGroupFunctionBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 109;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        HomeV5LifeGroupFunctionBinding homeV5LifeGroupFunctionBinding = (HomeV5LifeGroupFunctionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.home_v5_life_group_function, null, false, obj);
        int i4 = component3 + 75;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return homeV5LifeGroupFunctionBinding;
        }
        throw null;
    }

    public static HomeV5LifeGroupFunctionBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 71;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        HomeV5LifeGroupFunctionBinding homeV5LifeGroupFunctionBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 67;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return homeV5LifeGroupFunctionBindingBind;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static HomeV5LifeGroupFunctionBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 57;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        HomeV5LifeGroupFunctionBinding homeV5LifeGroupFunctionBinding = (HomeV5LifeGroupFunctionBinding) bind(obj, view, R.layout.home_v5_life_group_function);
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
        return homeV5LifeGroupFunctionBinding;
    }
}
