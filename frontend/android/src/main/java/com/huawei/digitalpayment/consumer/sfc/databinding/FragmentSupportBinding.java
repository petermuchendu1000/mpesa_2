package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class FragmentSupportBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int component3;
    public final MaterialCardView cvBack;
    public final ImageView ivBack;
    public final RecyclerView rvSupport;
    public final TextView tvTopTitle;

    protected FragmentSupportBinding(Object obj, View view, int i, MaterialCardView materialCardView, ImageView imageView, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i);
        this.cvBack = materialCardView;
        this.ivBack = imageView;
        this.rvSupport = recyclerView;
        this.tvTopTitle = textView;
    }

    public static FragmentSupportBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 95;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        throw null;
    }

    @Deprecated
    public static FragmentSupportBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 39;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSupportBinding fragmentSupportBinding = (FragmentSupportBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_support, viewGroup, z, obj);
        int i4 = component3 + 45;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentSupportBinding;
    }

    public static FragmentSupportBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 119;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentSupportBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component3 + 73;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.fragment_support;
            z = true;
        } else {
            i = R.layout.fragment_support;
            z = false;
        }
        return (FragmentSupportBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
    }

    public static FragmentSupportBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 23;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSupportBinding fragmentSupportBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 99;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentSupportBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static FragmentSupportBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 63;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        FragmentSupportBinding fragmentSupportBinding = (FragmentSupportBinding) bind(obj, view, R.layout.fragment_support);
        int i3 = component2 + 11;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return fragmentSupportBinding;
        }
        throw null;
    }
}
