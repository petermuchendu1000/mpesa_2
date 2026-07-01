package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class BannerViewLayoutCenterBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component1;
    public final ConstraintLayout constraintLayout;
    public final LinearLayout cycleIndicator;
    public final ViewPager cycleViewPager;

    protected BannerViewLayoutCenterBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, LinearLayout linearLayout, ViewPager viewPager) {
        super(obj, view, i);
        this.constraintLayout = constraintLayout;
        this.cycleIndicator = linearLayout;
        this.cycleViewPager = viewPager;
    }

    public static BannerViewLayoutCenterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 89;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        BannerViewLayoutCenterBinding bannerViewLayoutCenterBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 125;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return bannerViewLayoutCenterBindingInflate;
    }

    @Deprecated
    public static BannerViewLayoutCenterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 1;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        BannerViewLayoutCenterBinding bannerViewLayoutCenterBinding = (BannerViewLayoutCenterBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.banner_view_layout_center, viewGroup, z, obj);
        int i4 = ShareDataUIState + 97;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return bannerViewLayoutCenterBinding;
    }

    public static BannerViewLayoutCenterBinding inflate(LayoutInflater layoutInflater) {
        BannerViewLayoutCenterBinding bannerViewLayoutCenterBindingInflate;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            bannerViewLayoutCenterBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            int i3 = 90 / 0;
        } else {
            bannerViewLayoutCenterBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component1 + 5;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
        return bannerViewLayoutCenterBindingInflate;
    }

    @Deprecated
    public static BannerViewLayoutCenterBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        BannerViewLayoutCenterBinding bannerViewLayoutCenterBinding = (BannerViewLayoutCenterBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.banner_view_layout_center, null, false, obj);
        int i4 = ShareDataUIState + 125;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return bannerViewLayoutCenterBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static BannerViewLayoutCenterBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 119;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        BannerViewLayoutCenterBinding bannerViewLayoutCenterBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
        return bannerViewLayoutCenterBindingBind;
    }

    @Deprecated
    public static BannerViewLayoutCenterBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        BannerViewLayoutCenterBinding bannerViewLayoutCenterBinding = (BannerViewLayoutCenterBinding) bind(obj, view, R.layout.banner_view_layout_center);
        int i4 = ShareDataUIState + 73;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return bannerViewLayoutCenterBinding;
    }
}
