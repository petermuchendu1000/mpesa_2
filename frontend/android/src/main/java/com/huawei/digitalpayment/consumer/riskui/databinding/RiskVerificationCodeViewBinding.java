package com.huawei.digitalpayment.consumer.riskui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.riskui.R;

public abstract class RiskVerificationCodeViewBinding extends ViewDataBinding {
    private static int component2 = 0;
    private static int component3 = 1;
    public final LoadingButton btnSend;
    public final RelativeLayout rlInput;
    public final TextView tvHint;
    public final EditText tvInput;
    public final TextView tvLabel;

    protected RiskVerificationCodeViewBinding(Object obj, View view, int i, LoadingButton loadingButton, RelativeLayout relativeLayout, TextView textView, EditText editText, TextView textView2) {
        super(obj, view, i);
        this.btnSend = loadingButton;
        this.rlInput = relativeLayout;
        this.tvHint = textView;
        this.tvInput = editText;
        this.tvLabel = textView2;
    }

    public static RiskVerificationCodeViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 113;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        RiskVerificationCodeViewBinding riskVerificationCodeViewBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 39;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return riskVerificationCodeViewBindingInflate;
    }

    @Deprecated
    public static RiskVerificationCodeViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 11;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        RiskVerificationCodeViewBinding riskVerificationCodeViewBinding = (RiskVerificationCodeViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.risk_verification_code_view, viewGroup, z, obj);
        int i4 = component3 + 71;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
        return riskVerificationCodeViewBinding;
    }

    public static RiskVerificationCodeViewBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 49;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        RiskVerificationCodeViewBinding riskVerificationCodeViewBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 45;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
        return riskVerificationCodeViewBindingInflate;
    }

    @Deprecated
    public static RiskVerificationCodeViewBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component2 + 81;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.risk_verification_code_view;
            z = true;
        } else {
            i = R.layout.risk_verification_code_view;
            z = false;
        }
        return (RiskVerificationCodeViewBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
    }

    public static RiskVerificationCodeViewBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 11;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        RiskVerificationCodeViewBinding riskVerificationCodeViewBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 21;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return riskVerificationCodeViewBindingBind;
    }

    @Deprecated
    public static RiskVerificationCodeViewBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 69;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        RiskVerificationCodeViewBinding riskVerificationCodeViewBinding = (RiskVerificationCodeViewBinding) bind(obj, view, R.layout.risk_verification_code_view);
        int i4 = component3 + 97;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return riskVerificationCodeViewBinding;
    }
}
