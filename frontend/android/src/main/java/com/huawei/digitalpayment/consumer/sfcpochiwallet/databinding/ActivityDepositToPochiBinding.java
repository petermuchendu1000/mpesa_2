package com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.base.ui.widget.SfcAmountInputView;
import com.huawei.digitalpayment.consumer.sfcpochiwallet.R;

public abstract class ActivityDepositToPochiBinding extends ViewDataBinding {
    private static int component3 = 0;
    private static int copydefault = 1;
    public final LoadingButton btnConfirm;
    public final SfcAmountInputView inputAmount;
    public final ConstraintLayout rvAmout;
    public final TextView tvBalance;

    protected ActivityDepositToPochiBinding(Object obj, View view, int i, LoadingButton loadingButton, SfcAmountInputView sfcAmountInputView, ConstraintLayout constraintLayout, TextView textView) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.inputAmount = sfcAmountInputView;
        this.rvAmout = constraintLayout;
        this.tvBalance = textView;
    }

    public static ActivityDepositToPochiBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 25;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityDepositToPochiBinding activityDepositToPochiBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 27;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityDepositToPochiBindingInflate;
    }

    @Deprecated
    public static ActivityDepositToPochiBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 51;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityDepositToPochiBinding activityDepositToPochiBinding = (ActivityDepositToPochiBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_deposit_to_pochi, viewGroup, z, obj);
        int i4 = component3 + 1;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return activityDepositToPochiBinding;
        }
        throw null;
    }

    public static ActivityDepositToPochiBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 25;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivityDepositToPochiBinding activityDepositToPochiBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = component3 + 29;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            return activityDepositToPochiBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivityDepositToPochiBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 53;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityDepositToPochiBinding activityDepositToPochiBinding = (ActivityDepositToPochiBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_deposit_to_pochi, null, false, obj);
        int i4 = component3 + 7;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityDepositToPochiBinding;
    }

    public static ActivityDepositToPochiBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 3;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityDepositToPochiBinding activityDepositToPochiBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 92 / 0;
        }
        return activityDepositToPochiBindingBind;
    }

    @Deprecated
    public static ActivityDepositToPochiBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.activity_deposit_to_pochi);
        if (i3 == 0) {
            return (ActivityDepositToPochiBinding) viewDataBindingBind;
        }
        int i4 = 20 / 0;
        return (ActivityDepositToPochiBinding) viewDataBindingBind;
    }
}
