package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.base.ui.widget.SafeInputKeyboard;
import com.huawei.digitalpayment.consumer.baselib.widget.code.CodeEditText;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class FragmentEsimOtpValidationBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    public final LoadingButton btnConfirm;
    public final CodeEditText etCode;
    public final RoundImageView ivBack;
    public final ImageView ivMessage;
    public final ProgressBar loadingView;
    public final ConstraintLayout rlTipsContainer;
    public final TextView tvCountDown;
    public final TextView tvError;
    public final TextView tvNotReceiveCodeTips;
    public final TextView tvResend;
    public final TextView tvTips;
    public final SafeInputKeyboard virtualKeyboardView;

    protected FragmentEsimOtpValidationBinding(Object obj, View view, int i, LoadingButton loadingButton, CodeEditText codeEditText, RoundImageView roundImageView, ImageView imageView, ProgressBar progressBar, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, SafeInputKeyboard safeInputKeyboard) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.etCode = codeEditText;
        this.ivBack = roundImageView;
        this.ivMessage = imageView;
        this.loadingView = progressBar;
        this.rlTipsContainer = constraintLayout;
        this.tvCountDown = textView;
        this.tvError = textView2;
        this.tvNotReceiveCodeTips = textView3;
        this.tvResend = textView4;
        this.tvTips = textView5;
        this.virtualKeyboardView = safeInputKeyboard;
    }

    public static FragmentEsimOtpValidationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 51;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentEsimOtpValidationBinding fragmentEsimOtpValidationBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 21;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return fragmentEsimOtpValidationBindingInflate;
    }

    @Deprecated
    public static FragmentEsimOtpValidationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 123;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentEsimOtpValidationBinding fragmentEsimOtpValidationBinding = (FragmentEsimOtpValidationBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_esim_otp_validation, viewGroup, z, obj);
        int i4 = component2 + 79;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentEsimOtpValidationBinding;
        }
        throw null;
    }

    public static FragmentEsimOtpValidationBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        FragmentEsimOtpValidationBinding fragmentEsimOtpValidationBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 15;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            return fragmentEsimOtpValidationBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static FragmentEsimOtpValidationBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        FragmentEsimOtpValidationBinding fragmentEsimOtpValidationBinding = (FragmentEsimOtpValidationBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_esim_otp_validation, null, false, obj);
        int i4 = component2 + 119;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentEsimOtpValidationBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static FragmentEsimOtpValidationBinding bind(View view) {
        FragmentEsimOtpValidationBinding fragmentEsimOtpValidationBindingBind;
        int i = 2 % 2;
        int i2 = component2 + 83;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            fragmentEsimOtpValidationBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
            int i3 = 15 / 0;
        } else {
            fragmentEsimOtpValidationBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component2 + 79;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentEsimOtpValidationBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentEsimOtpValidationBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 111;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentEsimOtpValidationBinding fragmentEsimOtpValidationBinding = (FragmentEsimOtpValidationBinding) bind(obj, view, R.layout.fragment_esim_otp_validation);
        int i4 = component2 + 103;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return fragmentEsimOtpValidationBinding;
    }
}
