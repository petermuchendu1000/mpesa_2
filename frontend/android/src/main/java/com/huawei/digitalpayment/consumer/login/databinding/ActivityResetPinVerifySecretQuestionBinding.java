package com.huawei.digitalpayment.consumer.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.login.R;

public abstract class ActivityResetPinVerifySecretQuestionBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component2;
    public final LoadingButton btnNext;
    public final Group groupCall;
    public final CommonInputView inputAnswer;
    public final CommonInputView inputQuestion;
    public final TextView resetPinVerifyTip;
    public final RoundLinearLayout resetPinVerifyTipParent;
    public final TextView tvCallTitle;
    public final TextView tvForgetAnswer;

    protected ActivityResetPinVerifySecretQuestionBinding(Object obj, View view, int i, LoadingButton loadingButton, Group group, CommonInputView commonInputView, CommonInputView commonInputView2, TextView textView, RoundLinearLayout roundLinearLayout, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.btnNext = loadingButton;
        this.groupCall = group;
        this.inputAnswer = commonInputView;
        this.inputQuestion = commonInputView2;
        this.resetPinVerifyTip = textView;
        this.resetPinVerifyTipParent = roundLinearLayout;
        this.tvCallTitle = textView2;
        this.tvForgetAnswer = textView3;
    }

    public static ActivityResetPinVerifySecretQuestionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 115;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityResetPinVerifySecretQuestionBinding activityResetPinVerifySecretQuestionBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 113;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityResetPinVerifySecretQuestionBindingInflate;
    }

    @Deprecated
    public static ActivityResetPinVerifySecretQuestionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 119;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityResetPinVerifySecretQuestionBinding activityResetPinVerifySecretQuestionBinding = (ActivityResetPinVerifySecretQuestionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_reset_pin_verify_secret_question, viewGroup, z, obj);
        if (i3 == 0) {
            int i4 = 47 / 0;
        }
        return activityResetPinVerifySecretQuestionBinding;
    }

    public static ActivityResetPinVerifySecretQuestionBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 31;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        ActivityResetPinVerifySecretQuestionBinding activityResetPinVerifySecretQuestionBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 69;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            return activityResetPinVerifySecretQuestionBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityResetPinVerifySecretQuestionBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 31;
        ShareDataUIState = i2 % 128;
        ActivityResetPinVerifySecretQuestionBinding activityResetPinVerifySecretQuestionBinding = (ActivityResetPinVerifySecretQuestionBinding) ViewDataBinding.inflateInternal(layoutInflater, i2 % 2 == 0 ? R.layout.activity_reset_pin_verify_secret_question : R.layout.activity_reset_pin_verify_secret_question, null, false, obj);
        int i3 = ShareDataUIState + 41;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return activityResetPinVerifySecretQuestionBinding;
    }

    public static ActivityResetPinVerifySecretQuestionBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 115;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityResetPinVerifySecretQuestionBinding activityResetPinVerifySecretQuestionBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 7;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return activityResetPinVerifySecretQuestionBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static ActivityResetPinVerifySecretQuestionBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ActivityResetPinVerifySecretQuestionBinding activityResetPinVerifySecretQuestionBinding = (ActivityResetPinVerifySecretQuestionBinding) bind(obj, view, R.layout.activity_reset_pin_verify_secret_question);
        int i3 = ShareDataUIState + 7;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return activityResetPinVerifySecretQuestionBinding;
    }
}
