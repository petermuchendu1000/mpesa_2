package com.huawei.digitalpayment.consumer.riskui.databinding;

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
import com.huawei.digitalpayment.consumer.riskui.R;

public abstract class ActivityVerifyPinBinding extends ViewDataBinding {
    private static int component3 = 0;
    private static int copydefault = 1;
    public final LoadingButton btnContinue;
    public final CodeEditText etCode;
    public final RoundLinearLayout llTips;
    public final SafeInputKeyboard pinInputKeyboard;
    public final TextView tvDescription;
    public final TextView tvError;
    public final TextView tvForgot;
    public final TextView tvTitle;

    protected ActivityVerifyPinBinding(Object obj, View view, int i, LoadingButton loadingButton, CodeEditText codeEditText, RoundLinearLayout roundLinearLayout, SafeInputKeyboard safeInputKeyboard, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.btnContinue = loadingButton;
        this.etCode = codeEditText;
        this.llTips = roundLinearLayout;
        this.pinInputKeyboard = safeInputKeyboard;
        this.tvDescription = textView;
        this.tvError = textView2;
        this.tvForgot = textView3;
        this.tvTitle = textView4;
    }

    public static ActivityVerifyPinBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 9;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityVerifyPinBinding activityVerifyPinBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 99;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return activityVerifyPinBindingInflate;
    }

    @Deprecated
    public static ActivityVerifyPinBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 21;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityVerifyPinBinding activityVerifyPinBinding = (ActivityVerifyPinBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_verify_pin, viewGroup, z, obj);
        int i4 = copydefault + 95;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activityVerifyPinBinding;
    }

    public static ActivityVerifyPinBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivityVerifyPinBinding activityVerifyPinBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = copydefault + 89;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 37 / 0;
        }
        return activityVerifyPinBindingInflate;
    }

    @Deprecated
    public static ActivityVerifyPinBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = copydefault + 39;
        component3 = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            i = R.layout.activity_verify_pin;
            z = true;
        } else {
            i = R.layout.activity_verify_pin;
            z = false;
        }
        ActivityVerifyPinBinding activityVerifyPinBinding = (ActivityVerifyPinBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = copydefault + 3;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return activityVerifyPinBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ActivityVerifyPinBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 47;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ActivityVerifyPinBinding activityVerifyPinBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = copydefault + 91;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return activityVerifyPinBindingBind;
    }

    @Deprecated
    public static ActivityVerifyPinBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityVerifyPinBinding activityVerifyPinBinding = (ActivityVerifyPinBinding) bind(obj, view, R.layout.activity_verify_pin);
        int i4 = component3 + 115;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return activityVerifyPinBinding;
        }
        throw null;
    }
}
