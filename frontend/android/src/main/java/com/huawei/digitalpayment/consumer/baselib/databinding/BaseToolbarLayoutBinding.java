package com.huawei.digitalpayment.consumer.baselib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.baselib.R;

public abstract class BaseToolbarLayoutBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int copydefault;
    public final ImageView ivBack;
    public final ImageView ivEndButton;
    public final ConstraintLayout toolbarRoot;
    public final TextView tvEndButton;
    public final TextView tvTitle;

    protected BaseToolbarLayoutBinding(Object obj, View view, int i, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.ivBack = imageView;
        this.ivEndButton = imageView2;
        this.toolbarRoot = constraintLayout;
        this.tvEndButton = textView;
        this.tvTitle = textView2;
    }

    public static BaseToolbarLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 45;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        BaseToolbarLayoutBinding baseToolbarLayoutBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = copydefault + 5;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return baseToolbarLayoutBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static BaseToolbarLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.base_toolbar_layout, viewGroup, z, obj);
        if (i3 != 0) {
            return (BaseToolbarLayoutBinding) viewDataBindingInflateInternal;
        }
        throw null;
    }

    public static BaseToolbarLayoutBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        BaseToolbarLayoutBinding baseToolbarLayoutBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 33;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return baseToolbarLayoutBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static BaseToolbarLayoutBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 85;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        BaseToolbarLayoutBinding baseToolbarLayoutBinding = (BaseToolbarLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.base_toolbar_layout, null, false, obj);
        int i4 = component1 + 41;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return baseToolbarLayoutBinding;
    }

    public static BaseToolbarLayoutBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        BaseToolbarLayoutBinding baseToolbarLayoutBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 3;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return baseToolbarLayoutBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static BaseToolbarLayoutBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        BaseToolbarLayoutBinding baseToolbarLayoutBinding = (BaseToolbarLayoutBinding) bind(obj, view, R.layout.base_toolbar_layout);
        int i4 = component1 + 59;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return baseToolbarLayoutBinding;
    }
}
