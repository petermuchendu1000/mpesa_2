package com.huawei.digitalpayment.consumer.sfcqrcode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.sfcqrcode.R;

public abstract class FragmentSfcMyQrBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component3;
    public final Barrier barrierAvatar;
    public final LoadingButton btnConfirm;
    public final CardView cardAbbr;
    public final ConstraintLayout clChangeAmount;
    public final ConstraintLayout clQrContainer;
    public final ConstraintLayout contentLayout;
    public final RoundImageView ivAvatar;
    public final Guideline ivChangeGuide;
    public final ImageView ivDownload;
    public final ImageView ivGuide;
    public final RoundImageView ivQr;
    public final RoundImageView ivQrCenter;
    public final RoundImageView ivQrContainer;
    public final QrSetAmountBinding setAmountContainer;
    public final TextView tvAbbr;
    public final RoundTextView tvAmount;
    public final RoundTextView tvChangeAmount;
    public final TextView tvName;
    public final RoundTextView tvRemove;
    public final TextView tvTips;

    protected FragmentSfcMyQrBinding(Object obj, View view, int i, Barrier barrier, LoadingButton loadingButton, CardView cardView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, RoundImageView roundImageView, Guideline guideline, ImageView imageView, ImageView imageView2, RoundImageView roundImageView2, RoundImageView roundImageView3, RoundImageView roundImageView4, QrSetAmountBinding qrSetAmountBinding, TextView textView, RoundTextView roundTextView, RoundTextView roundTextView2, TextView textView2, RoundTextView roundTextView3, TextView textView3) {
        super(obj, view, i);
        this.barrierAvatar = barrier;
        this.btnConfirm = loadingButton;
        this.cardAbbr = cardView;
        this.clChangeAmount = constraintLayout;
        this.clQrContainer = constraintLayout2;
        this.contentLayout = constraintLayout3;
        this.ivAvatar = roundImageView;
        this.ivChangeGuide = guideline;
        this.ivDownload = imageView;
        this.ivGuide = imageView2;
        this.ivQr = roundImageView2;
        this.ivQrCenter = roundImageView3;
        this.ivQrContainer = roundImageView4;
        this.setAmountContainer = qrSetAmountBinding;
        this.tvAbbr = textView;
        this.tvAmount = roundTextView;
        this.tvChangeAmount = roundTextView2;
        this.tvName = textView2;
        this.tvRemove = roundTextView3;
        this.tvTips = textView3;
    }

    public static FragmentSfcMyQrBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 85;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        throw null;
    }

    @Deprecated
    public static FragmentSfcMyQrBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 99;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcMyQrBinding fragmentSfcMyQrBinding = (FragmentSfcMyQrBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_sfc_my_qr, viewGroup, z, obj);
        int i4 = ShareDataUIState + 123;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentSfcMyQrBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static FragmentSfcMyQrBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentSfcMyQrBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component3 + 89;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.fragment_sfc_my_qr;
            z = true;
        } else {
            i = R.layout.fragment_sfc_my_qr;
            z = false;
        }
        return (FragmentSfcMyQrBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
    }

    public static FragmentSfcMyQrBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 65;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcMyQrBinding fragmentSfcMyQrBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 83;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
        return fragmentSfcMyQrBindingBind;
    }

    @Deprecated
    public static FragmentSfcMyQrBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        FragmentSfcMyQrBinding fragmentSfcMyQrBinding = (FragmentSfcMyQrBinding) bind(obj, view, R.layout.fragment_sfc_my_qr);
        int i3 = component3 + 25;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return fragmentSfcMyQrBinding;
    }
}
