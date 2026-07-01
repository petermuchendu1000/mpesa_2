package com.huawei.digitalpayment.consumer.basic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.basic.R;

public abstract class DialogGuideOpenBiometricBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component2;
    public final LoadingButton btnNegative;
    public final LoadingButton btnPositive;
    public final ImageView ivIcon;
    public final RoundTextView line;
    public final TextView tvDescription;
    public final TextView tvTitle;

    protected DialogGuideOpenBiometricBinding(Object obj, View view, int i, LoadingButton loadingButton, LoadingButton loadingButton2, ImageView imageView, RoundTextView roundTextView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.btnNegative = loadingButton;
        this.btnPositive = loadingButton2;
        this.ivIcon = imageView;
        this.line = roundTextView;
        this.tvDescription = textView;
        this.tvTitle = textView2;
    }

    public static DialogGuideOpenBiometricBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 95;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DialogGuideOpenBiometricBinding dialogGuideOpenBiometricBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 47;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return dialogGuideOpenBiometricBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static DialogGuideOpenBiometricBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DialogGuideOpenBiometricBinding dialogGuideOpenBiometricBinding = (DialogGuideOpenBiometricBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_guide_open_biometric, viewGroup, z, obj);
        int i4 = component2 + 3;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return dialogGuideOpenBiometricBinding;
    }

    public static DialogGuideOpenBiometricBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DialogGuideOpenBiometricBinding dialogGuideOpenBiometricBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 125;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return dialogGuideOpenBiometricBindingInflate;
    }

    @Deprecated
    public static DialogGuideOpenBiometricBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 65;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return (DialogGuideOpenBiometricBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_guide_open_biometric, null, false, obj);
    }

    public static DialogGuideOpenBiometricBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DialogGuideOpenBiometricBinding dialogGuideOpenBiometricBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 123;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return dialogGuideOpenBiometricBindingBind;
    }

    @Deprecated
    public static DialogGuideOpenBiometricBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DialogGuideOpenBiometricBinding dialogGuideOpenBiometricBinding = (DialogGuideOpenBiometricBinding) bind(obj, view, R.layout.dialog_guide_open_biometric);
        int i4 = component2 + 31;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return dialogGuideOpenBiometricBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
