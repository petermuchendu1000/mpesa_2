package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.R;
import com.huawei.common.widget.DisplayView;

public abstract class CommonItemDisplayBinding extends ViewDataBinding {
    public final DisplayView displayView;

    protected CommonItemDisplayBinding(Object obj, View view, int i, DisplayView displayView) {
        super(obj, view, i);
        this.displayView = displayView;
    }

    public static CommonItemDisplayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CommonItemDisplayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (CommonItemDisplayBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.common_item_display, viewGroup, z, obj);
    }

    public static CommonItemDisplayBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CommonItemDisplayBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (CommonItemDisplayBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.common_item_display, null, false, obj);
    }

    public static CommonItemDisplayBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CommonItemDisplayBinding bind(View view, Object obj) {
        return (CommonItemDisplayBinding) bind(obj, view, R.layout.common_item_display);
    }
}
