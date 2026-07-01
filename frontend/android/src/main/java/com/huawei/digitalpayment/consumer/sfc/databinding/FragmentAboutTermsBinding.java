package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.card.MaterialCardView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class FragmentAboutTermsBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component1;
    public final MaterialCardView cdBack;
    public final ImageView ivBack;
    public final FrameLayout rlContainer;
    public final TextView tvTopTitle;

    protected FragmentAboutTermsBinding(Object obj, View view, int i, MaterialCardView materialCardView, ImageView imageView, FrameLayout frameLayout, TextView textView) {
        super(obj, view, i);
        this.cdBack = materialCardView;
        this.ivBack = imageView;
        this.rlContainer = frameLayout;
        this.tvTopTitle = textView;
    }

    public static FragmentAboutTermsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentAboutTermsBinding fragmentAboutTermsBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 83;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentAboutTermsBindingInflate;
    }

    @Deprecated
    public static FragmentAboutTermsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentAboutTermsBinding fragmentAboutTermsBinding = (FragmentAboutTermsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_about_terms, viewGroup, z, obj);
        int i4 = component1 + 23;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return fragmentAboutTermsBinding;
    }

    public static FragmentAboutTermsBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 49;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentAboutTermsBinding fragmentAboutTermsBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 7;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentAboutTermsBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentAboutTermsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 49;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentAboutTermsBinding fragmentAboutTermsBinding = (FragmentAboutTermsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_about_terms, null, false, obj);
        int i4 = ShareDataUIState + 95;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
        return fragmentAboutTermsBinding;
    }

    public static FragmentAboutTermsBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        FragmentAboutTermsBinding fragmentAboutTermsBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 107;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return fragmentAboutTermsBindingBind;
    }

    @Deprecated
    public static FragmentAboutTermsBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentAboutTermsBinding fragmentAboutTermsBinding = (FragmentAboutTermsBinding) bind(obj, view, R.layout.fragment_about_terms);
        int i4 = ShareDataUIState + 39;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentAboutTermsBinding;
    }
}
