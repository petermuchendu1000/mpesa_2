package com.huawei.payment.mvvm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.payment.mvvm.R;

public abstract class CommonToolbarBinding extends ViewDataBinding {
    public final ImageView ivBack;
    public final ConstraintLayout root;
    public final TextView tvTitle;

    protected CommonToolbarBinding(Object obj, View view, int i, ImageView imageView, ConstraintLayout constraintLayout, TextView textView) {
        super(obj, view, i);
        this.ivBack = imageView;
        this.root = constraintLayout;
        this.tvTitle = textView;
    }

    public static CommonToolbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CommonToolbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (CommonToolbarBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.common_toolbar, viewGroup, z, obj);
    }

    public static CommonToolbarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CommonToolbarBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (CommonToolbarBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.common_toolbar, null, false, obj);
    }

    public static CommonToolbarBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CommonToolbarBinding bind(View view, Object obj) {
        return (CommonToolbarBinding) bind(obj, view, R.layout.common_toolbar);
    }
}
