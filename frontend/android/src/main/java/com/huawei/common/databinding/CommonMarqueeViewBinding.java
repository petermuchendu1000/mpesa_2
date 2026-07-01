package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.R;

public abstract class CommonMarqueeViewBinding extends ViewDataBinding {
    public final ImageView ivIcon;
    public final TextView tvContent;
    public final TextView tvTime;

    protected CommonMarqueeViewBinding(Object obj, View view, int i, ImageView imageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.ivIcon = imageView;
        this.tvContent = textView;
        this.tvTime = textView2;
    }

    public static CommonMarqueeViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CommonMarqueeViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (CommonMarqueeViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.common_marquee_view, viewGroup, z, obj);
    }

    public static CommonMarqueeViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CommonMarqueeViewBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (CommonMarqueeViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.common_marquee_view, null, false, obj);
    }

    public static CommonMarqueeViewBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CommonMarqueeViewBinding bind(View view, Object obj) {
        return (CommonMarqueeViewBinding) bind(obj, view, R.layout.common_marquee_view);
    }
}
