package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.material.card.MaterialCardView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class FragmentSfcTermsViewBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component3;
    public final MaterialCardView cvBack;
    public final ImageView ivBack;
    public final PDFView pdfView;
    public final TextView tvTitle;

    protected FragmentSfcTermsViewBinding(Object obj, View view, int i, MaterialCardView materialCardView, ImageView imageView, PDFView pDFView, TextView textView) {
        super(obj, view, i);
        this.cvBack = materialCardView;
        this.ivBack = imageView;
        this.pdfView = pDFView;
        this.tvTitle = textView;
    }

    public static FragmentSfcTermsViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 95;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcTermsViewBinding fragmentSfcTermsViewBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
        return fragmentSfcTermsViewBindingInflate;
    }

    @Deprecated
    public static FragmentSfcTermsViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        FragmentSfcTermsViewBinding fragmentSfcTermsViewBinding;
        int i = 2 % 2;
        int i2 = component3 + 99;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            fragmentSfcTermsViewBinding = (FragmentSfcTermsViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_sfc_terms_view, viewGroup, z, obj);
            int i3 = 79 / 0;
        } else {
            fragmentSfcTermsViewBinding = (FragmentSfcTermsViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_sfc_terms_view, viewGroup, z, obj);
        }
        int i4 = component1 + 67;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentSfcTermsViewBinding;
        }
        throw null;
    }

    public static FragmentSfcTermsViewBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 31;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcTermsViewBinding fragmentSfcTermsViewBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 27;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentSfcTermsViewBindingInflate;
    }

    @Deprecated
    public static FragmentSfcTermsViewBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 61;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcTermsViewBinding fragmentSfcTermsViewBinding = (FragmentSfcTermsViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_sfc_terms_view, null, false, obj);
        int i4 = component1 + 99;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentSfcTermsViewBinding;
    }

    public static FragmentSfcTermsViewBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 35;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcTermsViewBinding fragmentSfcTermsViewBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 7;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentSfcTermsViewBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static FragmentSfcTermsViewBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 31;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.fragment_sfc_terms_view);
        if (i3 != 0) {
            return (FragmentSfcTermsViewBinding) viewDataBindingBind;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
