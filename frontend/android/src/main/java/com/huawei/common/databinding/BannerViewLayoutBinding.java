package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.huawei.common.R;

public abstract class BannerViewLayoutBinding extends ViewDataBinding {
    public final ConstraintLayout constraintLayout;
    public final LinearLayout cycleIndicator;
    public final ViewPager cycleViewPager;

    protected BannerViewLayoutBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, LinearLayout linearLayout, ViewPager viewPager) {
        super(obj, view, i);
        this.constraintLayout = constraintLayout;
        this.cycleIndicator = linearLayout;
        this.cycleViewPager = viewPager;
    }

    public static BannerViewLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BannerViewLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (BannerViewLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.banner_view_layout, viewGroup, z, obj);
    }

    public static BannerViewLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BannerViewLayoutBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (BannerViewLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.banner_view_layout, null, false, obj);
    }

    public static BannerViewLayoutBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BannerViewLayoutBinding bind(View view, Object obj) {
        return (BannerViewLayoutBinding) bind(obj, view, R.layout.banner_view_layout);
    }
}
