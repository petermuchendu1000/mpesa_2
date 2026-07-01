package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class ActivityHomeBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int component3;
    public final LinearLayout llNavigation;
    public final ImageView llNavigationBg;
    public final CardView llNavigationParent;
    public final ViewPager2 viewPager2;

    protected ActivityHomeBinding(Object obj, View view, int i, LinearLayout linearLayout, ImageView imageView, CardView cardView, ViewPager2 viewPager2) {
        super(obj, view, i);
        this.llNavigation = linearLayout;
        this.llNavigationBg = imageView;
        this.llNavigationParent = cardView;
        this.viewPager2 = viewPager2;
    }

    public static ActivityHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 13;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityHomeBinding activityHomeBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 105;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
        return activityHomeBindingInflate;
    }

    @Deprecated
    public static ActivityHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 99;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityHomeBinding activityHomeBinding = (ActivityHomeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_home, viewGroup, z, obj);
        int i4 = component3 + 43;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return activityHomeBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ActivityHomeBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 41;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityHomeBinding activityHomeBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 107;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activityHomeBindingInflate;
    }

    @Deprecated
    public static ActivityHomeBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 17;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityHomeBinding activityHomeBinding = (ActivityHomeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_home, null, false, obj);
        int i4 = component2 + 99;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return activityHomeBinding;
    }

    public static ActivityHomeBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 123;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityHomeBinding activityHomeBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 27;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activityHomeBindingBind;
    }

    @Deprecated
    public static ActivityHomeBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 47;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ActivityHomeBinding activityHomeBinding = (ActivityHomeBinding) bind(obj, view, R.layout.activity_home);
        int i3 = component3 + 23;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return activityHomeBinding;
    }
}
