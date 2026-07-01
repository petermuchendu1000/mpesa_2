package com.huawei.digitalpayment.consumer.basic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.basic.R;
import pl.droidsonroids.gif.GifImageView;

public abstract class BasicActivitySplashBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component2 = 1;
    public final AppCompatTextView btnSkip;
    public final GifImageView ivLogo;
    public final ImageView ivSplash;
    public final ConstraintLayout splashRl;

    protected BasicActivitySplashBinding(Object obj, View view, int i, AppCompatTextView appCompatTextView, GifImageView gifImageView, ImageView imageView, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.btnSkip = appCompatTextView;
        this.ivLogo = gifImageView;
        this.ivSplash = imageView;
        this.splashRl = constraintLayout;
    }

    public static BasicActivitySplashBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 9;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static BasicActivitySplashBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 9;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        BasicActivitySplashBinding basicActivitySplashBinding = (BasicActivitySplashBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.basic_activity_splash, viewGroup, z, obj);
        int i4 = component2 + 71;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return basicActivitySplashBinding;
        }
        throw null;
    }

    public static BasicActivitySplashBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 63;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        BasicActivitySplashBinding basicActivitySplashBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 125;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return basicActivitySplashBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static BasicActivitySplashBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 125;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        BasicActivitySplashBinding basicActivitySplashBinding = (BasicActivitySplashBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.basic_activity_splash, null, false, obj);
        int i4 = component1 + 5;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return basicActivitySplashBinding;
        }
        throw null;
    }

    public static BasicActivitySplashBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 93;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        BasicActivitySplashBinding basicActivitySplashBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 25;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return basicActivitySplashBindingBind;
    }

    @Deprecated
    public static BasicActivitySplashBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 93;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        BasicActivitySplashBinding basicActivitySplashBinding = (BasicActivitySplashBinding) bind(obj, view, R.layout.basic_activity_splash);
        if (i3 != 0) {
            return basicActivitySplashBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
