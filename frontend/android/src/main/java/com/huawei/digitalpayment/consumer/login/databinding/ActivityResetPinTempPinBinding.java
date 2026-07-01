package com.huawei.digitalpayment.consumer.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.baselib.widget.code.CodeEditText;
import com.huawei.digitalpayment.consumer.baselib.widget.code.SafeInputKeyboard;
import com.huawei.digitalpayment.consumer.login.R;

public abstract class ActivityResetPinTempPinBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component2;
    public final LoadingButton btnContinue;
    public final CodeEditText etCode;
    public final RoundLinearLayout llResetPinTempTip;
    public final SafeInputKeyboard pinInputKeyboard;
    public final TextView resetPinTempTip;
    public final TextView tvDescription;
    public final TextView tvError;
    public final TextView tvForgot;
    public final TextView tvTitle;

    protected ActivityResetPinTempPinBinding(Object obj, View view, int i, LoadingButton loadingButton, CodeEditText codeEditText, RoundLinearLayout roundLinearLayout, SafeInputKeyboard safeInputKeyboard, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.btnContinue = loadingButton;
        this.etCode = codeEditText;
        this.llResetPinTempTip = roundLinearLayout;
        this.pinInputKeyboard = safeInputKeyboard;
        this.resetPinTempTip = textView;
        this.tvDescription = textView2;
        this.tvError = textView3;
        this.tvForgot = textView4;
        this.tvTitle = textView5;
    }

    public static ActivityResetPinTempPinBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityResetPinTempPinBinding activityResetPinTempPinBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 19 / 0;
        }
        return activityResetPinTempPinBindingInflate;
    }

    @Deprecated
    public static ActivityResetPinTempPinBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 33;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        ActivityResetPinTempPinBinding activityResetPinTempPinBinding = (ActivityResetPinTempPinBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_reset_pin_temp_pin, viewGroup, z, obj);
        int i3 = component2 + 81;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 53 / 0;
        }
        return activityResetPinTempPinBinding;
    }

    public static ActivityResetPinTempPinBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 39;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivityResetPinTempPinBinding activityResetPinTempPinBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = ShareDataUIState + 29;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return activityResetPinTempPinBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityResetPinTempPinBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 7;
        ShareDataUIState = i2 % 128;
        return (ActivityResetPinTempPinBinding) ViewDataBinding.inflateInternal(layoutInflater, i2 % 2 == 0 ? R.layout.activity_reset_pin_temp_pin : R.layout.activity_reset_pin_temp_pin, null, false, obj);
    }

    public static ActivityResetPinTempPinBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityResetPinTempPinBinding activityResetPinTempPinBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 107;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
        return activityResetPinTempPinBindingBind;
    }

    @Deprecated
    public static ActivityResetPinTempPinBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 51;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityResetPinTempPinBinding activityResetPinTempPinBinding = (ActivityResetPinTempPinBinding) bind(obj, view, R.layout.activity_reset_pin_temp_pin);
        int i4 = component2 + 61;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityResetPinTempPinBinding;
    }
}
