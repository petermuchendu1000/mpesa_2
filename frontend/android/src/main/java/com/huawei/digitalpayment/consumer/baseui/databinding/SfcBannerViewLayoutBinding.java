package com.huawei.digitalpayment.consumer.baseui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.huawei.digitalpayment.consumer.base.ui.widget.ViewPagerContainer;
import com.huawei.digitalpayment.consumer.baseui.R;

public final class SfcBannerViewLayoutBinding implements ViewBinding {
    private static int component1 = 0;
    private static int component2 = 1;
    private final ConstraintLayout ShareDataUIState;
    public final LinearLayout cycleIndicator;
    public final ViewPager cycleViewPager;
    public final ViewPagerContainer viewpagerContainer;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 31;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = component2 + 113;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return root;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private SfcBannerViewLayoutBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, ViewPager viewPager, ViewPagerContainer viewPagerContainer) {
        this.ShareDataUIState = constraintLayout;
        this.cycleIndicator = linearLayout;
        this.cycleViewPager = viewPager;
        this.viewpagerContainer = viewPagerContainer;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 53;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        ConstraintLayout constraintLayout = this.ShareDataUIState;
        int i5 = i3 + 99;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static SfcBannerViewLayoutBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 83;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        SfcBannerViewLayoutBinding sfcBannerViewLayoutBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component2 + 121;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return sfcBannerViewLayoutBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    public static SfcBannerViewLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 59;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.sfc_banner_view_layout, viewGroup, false);
        if (z) {
            int i4 = component2 + 49;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static SfcBannerViewLayoutBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 103;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.cycleIndicator;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i4);
        if (linearLayout != null) {
            int i5 = component2 + 35;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            i4 = R.id.cycleViewPager;
            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, i4);
            if (viewPager != null) {
                int i7 = component1 + 75;
                component2 = i7 % 128;
                int i8 = i7 % 2;
                i4 = R.id.viewpager_container;
                ViewPagerContainer viewPagerContainer = (ViewPagerContainer) ViewBindings.findChildViewById(view, i4);
                if (viewPagerContainer != null) {
                    return new SfcBannerViewLayoutBinding((ConstraintLayout) view, linearLayout, viewPager, viewPagerContainer);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
