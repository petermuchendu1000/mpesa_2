package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class FragmentAboutWebBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component3;
    public final Guideline guideTop;
    public final RoundImageView ivBack;
    public final TextView tvTopTitle;
    public final ViewPager viewPager;

    protected FragmentAboutWebBinding(Object obj, View view, int i, Guideline guideline, RoundImageView roundImageView, TextView textView, ViewPager viewPager) {
        super(obj, view, i);
        this.guideTop = guideline;
        this.ivBack = roundImageView;
        this.tvTopTitle = textView;
        this.viewPager = viewPager;
    }

    public static FragmentAboutWebBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentAboutWebBinding fragmentAboutWebBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 51;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentAboutWebBindingInflate;
    }

    @Deprecated
    public static FragmentAboutWebBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 105;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentAboutWebBinding fragmentAboutWebBinding = (FragmentAboutWebBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_about_web, viewGroup, z, obj);
        if (i3 != 0) {
            return fragmentAboutWebBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static FragmentAboutWebBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 9;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentAboutWebBinding fragmentAboutWebBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        return fragmentAboutWebBindingInflate;
    }

    @Deprecated
    public static FragmentAboutWebBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 67;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentAboutWebBinding fragmentAboutWebBinding = (FragmentAboutWebBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_about_web, null, false, obj);
        int i4 = component1 + 93;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentAboutWebBinding;
    }

    public static FragmentAboutWebBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 59;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        throw null;
    }

    @Deprecated
    public static FragmentAboutWebBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 23;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.fragment_about_web);
        if (i3 == 0) {
            return (FragmentAboutWebBinding) viewDataBindingBind;
        }
        int i4 = 35 / 0;
        return (FragmentAboutWebBinding) viewDataBindingBind;
    }
}
