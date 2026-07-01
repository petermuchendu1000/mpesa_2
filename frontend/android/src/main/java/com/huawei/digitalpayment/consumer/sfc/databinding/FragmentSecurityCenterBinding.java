package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class FragmentSecurityCenterBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component2 = 1;
    public final Guideline guideTop;
    public final RoundImageView ivBack;
    public final RoundImageView ivPinLocked;
    public final RecyclerView rvSecurity;
    public final TextView tvPinTitle;
    public final TextView tvTopTitle;

    protected FragmentSecurityCenterBinding(Object obj, View view, int i, Guideline guideline, RoundImageView roundImageView, RoundImageView roundImageView2, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.guideTop = guideline;
        this.ivBack = roundImageView;
        this.ivPinLocked = roundImageView2;
        this.rvSecurity = recyclerView;
        this.tvPinTitle = textView;
        this.tvTopTitle = textView2;
    }

    public static FragmentSecurityCenterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 75;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSecurityCenterBinding fragmentSecurityCenterBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 49;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
        return fragmentSecurityCenterBindingInflate;
    }

    @Deprecated
    public static FragmentSecurityCenterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 11;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSecurityCenterBinding fragmentSecurityCenterBinding = (FragmentSecurityCenterBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_security_center, viewGroup, z, obj);
        int i4 = component1 + 103;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentSecurityCenterBinding;
    }

    public static FragmentSecurityCenterBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 25;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSecurityCenterBinding fragmentSecurityCenterBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 99;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentSecurityCenterBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentSecurityCenterBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component2 + 73;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.fragment_security_center;
            z = true;
        } else {
            i = R.layout.fragment_security_center;
            z = false;
        }
        FragmentSecurityCenterBinding fragmentSecurityCenterBinding = (FragmentSecurityCenterBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = component1 + 37;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentSecurityCenterBinding;
    }

    public static FragmentSecurityCenterBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 63;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSecurityCenterBinding fragmentSecurityCenterBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 109;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentSecurityCenterBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static FragmentSecurityCenterBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 27;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSecurityCenterBinding fragmentSecurityCenterBinding = (FragmentSecurityCenterBinding) bind(obj, view, R.layout.fragment_security_center);
        int i4 = component2 + 57;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return fragmentSecurityCenterBinding;
    }
}
