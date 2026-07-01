package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class FragmentFaqsBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component3 = 1;
    public final Guideline guideTop;
    public final RoundImageView ivBack;
    public final RecyclerView rvFAQs;
    public final TextView tvTopTitle;

    protected FragmentFaqsBinding(Object obj, View view, int i, Guideline guideline, RoundImageView roundImageView, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i);
        this.guideTop = guideline;
        this.ivBack = roundImageView;
        this.rvFAQs = recyclerView;
        this.tvTopTitle = textView;
    }

    public static FragmentFaqsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 119;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentFaqsBinding fragmentFaqsBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 23;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        return fragmentFaqsBindingInflate;
    }

    @Deprecated
    public static FragmentFaqsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 79;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentFaqsBinding fragmentFaqsBinding = (FragmentFaqsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_faqs, viewGroup, z, obj);
        if (i3 == 0) {
            return fragmentFaqsBinding;
        }
        throw null;
    }

    public static FragmentFaqsBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 21;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        throw null;
    }

    @Deprecated
    public static FragmentFaqsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 117;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return (FragmentFaqsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_faqs, null, false, obj);
    }

    public static FragmentFaqsBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 109;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        FragmentFaqsBinding fragmentFaqsBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component3 + 93;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            return fragmentFaqsBindingBind;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentFaqsBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 21;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentFaqsBinding fragmentFaqsBinding = (FragmentFaqsBinding) bind(obj, view, R.layout.fragment_faqs);
        int i4 = component3 + 71;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentFaqsBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
