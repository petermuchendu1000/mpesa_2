package com.huawei.digitalpayment.consumer.qrcode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.qrcode.R;

public abstract class FragmentScanBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    public final ConstraintLayout contentLayout;
    public final ImageView ivFlashlight;
    public final ImageView ivPay;
    public final ImageView ivScanLine;
    public final LinearLayout llAlbum;
    public final LinearLayout llPay;
    public final RoundTextView tipsView;
    public final RoundTextView tvPay;

    protected FragmentScanBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, LinearLayout linearLayout2, RoundTextView roundTextView, RoundTextView roundTextView2) {
        super(obj, view, i);
        this.contentLayout = constraintLayout;
        this.ivFlashlight = imageView;
        this.ivPay = imageView2;
        this.ivScanLine = imageView3;
        this.llAlbum = linearLayout;
        this.llPay = linearLayout2;
        this.tipsView = roundTextView;
        this.tvPay = roundTextView2;
    }

    public static FragmentScanBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentScanBinding fragmentScanBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 79;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return fragmentScanBindingInflate;
    }

    @Deprecated
    public static FragmentScanBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        FragmentScanBinding fragmentScanBinding = (FragmentScanBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_scan, viewGroup, z, obj);
        int i3 = ShareDataUIState + 41;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return fragmentScanBinding;
    }

    public static FragmentScanBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 115;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentScanBinding fragmentScanBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 13;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return fragmentScanBindingInflate;
    }

    @Deprecated
    public static FragmentScanBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 115;
        copydefault = i2 % 128;
        FragmentScanBinding fragmentScanBinding = (FragmentScanBinding) ViewDataBinding.inflateInternal(layoutInflater, i2 % 2 != 0 ? R.layout.fragment_scan : R.layout.fragment_scan, null, false, obj);
        int i3 = copydefault + 99;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return fragmentScanBinding;
    }

    public static FragmentScanBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentScanBinding fragmentScanBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 43;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentScanBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static FragmentScanBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentScanBinding fragmentScanBinding = (FragmentScanBinding) bind(obj, view, R.layout.fragment_scan);
        if (i3 == 0) {
            return fragmentScanBinding;
        }
        throw null;
    }
}
