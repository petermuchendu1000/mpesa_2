package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.consumer.base.ui.widget.PinInputView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class FragmentChangeServicePinBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component1;
    public final LoadingButton btnSetPin;
    public final ConstraintLayout csEasyTalk;
    public final PinInputView inputConfirmNewPin;
    public final CommonInputView inputIdPassport;
    public final PinInputView inputNewPin;
    public final ImageView ivBundle;
    public final RoundConstraintLayout rlBundleContainer;
    public final ConstraintLayout topContainer;
    public final TextView tvBundleDesc;
    public final TextView tvBundleTitle;
    public final TextView tvConfirmNewPinError;
    public final TextView tvIdPassportError;
    public final TextView tvNewPinError;

    protected FragmentChangeServicePinBinding(Object obj, View view, int i, LoadingButton loadingButton, ConstraintLayout constraintLayout, PinInputView pinInputView, CommonInputView commonInputView, PinInputView pinInputView2, ImageView imageView, RoundConstraintLayout roundConstraintLayout, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.btnSetPin = loadingButton;
        this.csEasyTalk = constraintLayout;
        this.inputConfirmNewPin = pinInputView;
        this.inputIdPassport = commonInputView;
        this.inputNewPin = pinInputView2;
        this.ivBundle = imageView;
        this.rlBundleContainer = roundConstraintLayout;
        this.topContainer = constraintLayout2;
        this.tvBundleDesc = textView;
        this.tvBundleTitle = textView2;
        this.tvConfirmNewPinError = textView3;
        this.tvIdPassportError = textView4;
        this.tvNewPinError = textView5;
    }

    public static FragmentChangeServicePinBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 101;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentChangeServicePinBinding fragmentChangeServicePinBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 31;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentChangeServicePinBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static FragmentChangeServicePinBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 89;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentChangeServicePinBinding fragmentChangeServicePinBinding = (FragmentChangeServicePinBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_change_service_pin, viewGroup, z, obj);
        int i4 = component1 + 55;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentChangeServicePinBinding;
        }
        throw null;
    }

    public static FragmentChangeServicePinBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 7;
        ShareDataUIState = i2 % 128;
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
    public static FragmentChangeServicePinBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 13;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        FragmentChangeServicePinBinding fragmentChangeServicePinBinding = (FragmentChangeServicePinBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_change_service_pin, null, false, obj);
        int i4 = component1 + 81;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentChangeServicePinBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static FragmentChangeServicePinBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 11;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentChangeServicePinBinding fragmentChangeServicePinBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 55;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentChangeServicePinBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentChangeServicePinBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 99;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentChangeServicePinBinding fragmentChangeServicePinBinding = (FragmentChangeServicePinBinding) bind(obj, view, R.layout.fragment_change_service_pin);
        int i4 = ShareDataUIState + 61;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentChangeServicePinBinding;
    }
}
