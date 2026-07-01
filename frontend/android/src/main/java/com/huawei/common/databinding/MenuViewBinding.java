package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.R;
import com.huawei.common.widget.BubblesView;

public abstract class MenuViewBinding extends ViewDataBinding {
    public final ImageView ivFunctionIcon;
    public final ImageView ivMarker;
    public final TextView tvFunctionName;
    public final BubblesView tvRedDot;
    public final View viewGuideLine;

    protected MenuViewBinding(Object obj, View view, int i, ImageView imageView, ImageView imageView2, TextView textView, BubblesView bubblesView, View view2) {
        super(obj, view, i);
        this.ivFunctionIcon = imageView;
        this.ivMarker = imageView2;
        this.tvFunctionName = textView;
        this.tvRedDot = bubblesView;
        this.viewGuideLine = view2;
    }

    public static MenuViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static MenuViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (MenuViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.menu_view, viewGroup, z, obj);
    }

    public static MenuViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static MenuViewBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (MenuViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.menu_view, null, false, obj);
    }

    public static MenuViewBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static MenuViewBinding bind(View view, Object obj) {
        return (MenuViewBinding) bind(obj, view, R.layout.menu_view);
    }
}
