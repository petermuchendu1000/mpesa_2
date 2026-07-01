package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.R;
import com.huawei.common.widget.input.IconImageView;

public abstract class CommonLoadingButtonBinding extends ViewDataBinding {
    public final TextView buttonTextView;
    public final IconImageView endButtonIconView;
    public final ImageView loadingIcon;
    public final IconImageView startButtonIconView;

    protected CommonLoadingButtonBinding(Object obj, View view, int i, TextView textView, IconImageView iconImageView, ImageView imageView, IconImageView iconImageView2) {
        super(obj, view, i);
        this.buttonTextView = textView;
        this.endButtonIconView = iconImageView;
        this.loadingIcon = imageView;
        this.startButtonIconView = iconImageView2;
    }

    public static CommonLoadingButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CommonLoadingButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (CommonLoadingButtonBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.common_loading_button, viewGroup, z, obj);
    }

    public static CommonLoadingButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CommonLoadingButtonBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (CommonLoadingButtonBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.common_loading_button, null, false, obj);
    }

    public static CommonLoadingButtonBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CommonLoadingButtonBinding bind(View view, Object obj) {
        return (CommonLoadingButtonBinding) bind(obj, view, R.layout.common_loading_button);
    }
}
