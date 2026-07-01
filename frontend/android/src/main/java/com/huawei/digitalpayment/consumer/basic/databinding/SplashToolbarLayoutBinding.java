package com.huawei.digitalpayment.consumer.basic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.basic.R;

public abstract class SplashToolbarLayoutBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component1;
    public final ImageView ivBack;
    public final LinearLayout llLanguage;
    public final LinearLayout llSkip;
    public final ConstraintLayout root;
    public final TextView tvLanguage;
    public final TextView tvSkip;
    public final TextView tvTitle;

    protected SplashToolbarLayoutBinding(Object obj, View view, int i, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.ivBack = imageView;
        this.llLanguage = linearLayout;
        this.llSkip = linearLayout2;
        this.root = constraintLayout;
        this.tvLanguage = textView;
        this.tvSkip = textView2;
        this.tvTitle = textView3;
    }

    public static SplashToolbarLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 85;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        throw null;
    }

    @Deprecated
    public static SplashToolbarLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 51;
        ShareDataUIState = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        SplashToolbarLayoutBinding splashToolbarLayoutBinding = (SplashToolbarLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.splash_toolbar_layout, viewGroup, z, obj);
        int i3 = ShareDataUIState + 15;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            return splashToolbarLayoutBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static SplashToolbarLayoutBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        SplashToolbarLayoutBinding splashToolbarLayoutBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 35;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return splashToolbarLayoutBindingInflate;
    }

    @Deprecated
    public static SplashToolbarLayoutBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        SplashToolbarLayoutBinding splashToolbarLayoutBinding = (SplashToolbarLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.splash_toolbar_layout, null, false, obj);
        int i4 = ShareDataUIState + 125;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return splashToolbarLayoutBinding;
    }

    public static SplashToolbarLayoutBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        SplashToolbarLayoutBinding splashToolbarLayoutBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 77;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return splashToolbarLayoutBindingBind;
    }

    @Deprecated
    public static SplashToolbarLayoutBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        SplashToolbarLayoutBinding splashToolbarLayoutBinding = (SplashToolbarLayoutBinding) bind(obj, view, R.layout.splash_toolbar_layout);
        if (i3 == 0) {
            return splashToolbarLayoutBinding;
        }
        throw null;
    }
}
