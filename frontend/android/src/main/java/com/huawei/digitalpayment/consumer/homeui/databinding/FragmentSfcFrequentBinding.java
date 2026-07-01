package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class FragmentSfcFrequentBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component2;
    public final ImageView ivDown;
    public final RoundLinearLayout llTab;
    public final LinearLayout llViewall;
    public final RecyclerView recyclerView;
    public final TextView tvTitle;

    protected FragmentSfcFrequentBinding(Object obj, View view, int i, ImageView imageView, RoundLinearLayout roundLinearLayout, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i);
        this.ivDown = imageView;
        this.llTab = roundLinearLayout;
        this.llViewall = linearLayout;
        this.recyclerView = recyclerView;
        this.tvTitle = textView;
    }

    public static FragmentSfcFrequentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 125;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        FragmentSfcFrequentBinding fragmentSfcFrequentBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 29;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return fragmentSfcFrequentBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static FragmentSfcFrequentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 105;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_sfc_frequent, viewGroup, z, obj);
        if (i3 == 0) {
            return (FragmentSfcFrequentBinding) viewDataBindingInflateInternal;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static FragmentSfcFrequentBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 79;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcFrequentBinding fragmentSfcFrequentBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 27;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentSfcFrequentBindingInflate;
    }

    @Deprecated
    public static FragmentSfcFrequentBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component1 + 79;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.fragment_sfc_frequent;
            z = true;
        } else {
            i = R.layout.fragment_sfc_frequent;
            z = false;
        }
        FragmentSfcFrequentBinding fragmentSfcFrequentBinding = (FragmentSfcFrequentBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = component1 + 31;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentSfcFrequentBinding;
        }
        throw null;
    }

    public static FragmentSfcFrequentBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 109;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcFrequentBinding fragmentSfcFrequentBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 33;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 53 / 0;
        }
        return fragmentSfcFrequentBindingBind;
    }

    @Deprecated
    public static FragmentSfcFrequentBinding bind(View view, Object obj) {
        FragmentSfcFrequentBinding fragmentSfcFrequentBinding;
        int i = 2 % 2;
        int i2 = component1 + 113;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            fragmentSfcFrequentBinding = (FragmentSfcFrequentBinding) bind(obj, view, R.layout.fragment_sfc_frequent);
            int i3 = 47 / 0;
        } else {
            fragmentSfcFrequentBinding = (FragmentSfcFrequentBinding) bind(obj, view, R.layout.fragment_sfc_frequent);
        }
        int i4 = component1 + 109;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentSfcFrequentBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
