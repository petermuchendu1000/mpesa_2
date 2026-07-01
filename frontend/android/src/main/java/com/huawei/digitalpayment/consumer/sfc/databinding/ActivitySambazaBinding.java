package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivitySambazaBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int copydefault = 1;
    public final ImageView backButton;
    public final RoundLinearLayout tabContainer;
    public final TabLayout tabLayout;
    public final ConstraintLayout topContainer;
    public final TextView tvTitle;
    public final ViewPager2 viewPager;

    protected ActivitySambazaBinding(Object obj, View view, int i, ImageView imageView, RoundLinearLayout roundLinearLayout, TabLayout tabLayout, ConstraintLayout constraintLayout, TextView textView, ViewPager2 viewPager2) {
        super(obj, view, i);
        this.backButton = imageView;
        this.tabContainer = roundLinearLayout;
        this.tabLayout = tabLayout;
        this.topContainer = constraintLayout;
        this.tvTitle = textView;
        this.viewPager = viewPager2;
    }

    public static ActivitySambazaBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 41;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivitySambazaBinding activitySambazaBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 5;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            return activitySambazaBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivitySambazaBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        ActivitySambazaBinding activitySambazaBinding;
        int i = 2 % 2;
        int i2 = component1 + 91;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            activitySambazaBinding = (ActivitySambazaBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sambaza, viewGroup, z, obj);
            int i3 = 83 / 0;
        } else {
            activitySambazaBinding = (ActivitySambazaBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sambaza, viewGroup, z, obj);
        }
        int i4 = component1 + 69;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
        return activitySambazaBinding;
    }

    public static ActivitySambazaBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 13;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ActivitySambazaBinding activitySambazaBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = copydefault + 33;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return activitySambazaBindingInflate;
    }

    @Deprecated
    public static ActivitySambazaBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 51;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySambazaBinding activitySambazaBinding = (ActivitySambazaBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sambaza, null, false, obj);
        int i4 = component1 + 43;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activitySambazaBinding;
    }

    public static ActivitySambazaBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 113;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ActivitySambazaBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 125;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySambazaBinding activitySambazaBinding = (ActivitySambazaBinding) bind(obj, view, R.layout.activity_sambaza);
        if (i3 != 0) {
            return activitySambazaBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
