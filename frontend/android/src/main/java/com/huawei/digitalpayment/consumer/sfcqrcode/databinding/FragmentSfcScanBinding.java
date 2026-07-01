package com.huawei.digitalpayment.consumer.sfcqrcode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.sfcqrcode.R;

public abstract class FragmentSfcScanBinding extends ViewDataBinding {
    private static int component2 = 0;
    private static int copydefault = 1;
    public final ConstraintLayout contentLayout;
    public final ImageView ivFlashlight;
    public final ImageView ivGallery;
    public final ImageView ivScanLine;

    protected FragmentSfcScanBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3) {
        super(obj, view, i);
        this.contentLayout = constraintLayout;
        this.ivFlashlight = imageView;
        this.ivGallery = imageView2;
        this.ivScanLine = imageView3;
    }

    public static FragmentSfcScanBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcScanBinding fragmentSfcScanBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 33;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return fragmentSfcScanBindingInflate;
    }

    @Deprecated
    public static FragmentSfcScanBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 109;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcScanBinding fragmentSfcScanBinding = (FragmentSfcScanBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_sfc_scan, viewGroup, z, obj);
        int i4 = copydefault + 39;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentSfcScanBinding;
        }
        throw null;
    }

    public static FragmentSfcScanBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcScanBinding fragmentSfcScanBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 7 / 0;
        }
        return fragmentSfcScanBindingInflate;
    }

    @Deprecated
    public static FragmentSfcScanBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 85;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcScanBinding fragmentSfcScanBinding = (FragmentSfcScanBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_sfc_scan, null, false, obj);
        int i4 = component2 + 75;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return fragmentSfcScanBinding;
    }

    public static FragmentSfcScanBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 105;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        FragmentSfcScanBinding fragmentSfcScanBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 119;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return fragmentSfcScanBindingBind;
    }

    @Deprecated
    public static FragmentSfcScanBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 77;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcScanBinding fragmentSfcScanBinding = (FragmentSfcScanBinding) bind(obj, view, R.layout.fragment_sfc_scan);
        int i4 = copydefault + 95;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentSfcScanBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
