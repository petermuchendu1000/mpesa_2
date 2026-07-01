package com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.base.ui.widget.SfcAmountInputView;
import com.huawei.digitalpayment.consumer.sfcpochiwallet.R;

public abstract class ActivityWithdrawFromPochiBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    public final LoadingButton btnConfirm;
    public final SfcAmountInputView inputAmount;
    public final ConstraintLayout rvAmout;
    public final TextView tvBalance;

    protected ActivityWithdrawFromPochiBinding(Object obj, View view, int i, LoadingButton loadingButton, SfcAmountInputView sfcAmountInputView, ConstraintLayout constraintLayout, TextView textView) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.inputAmount = sfcAmountInputView;
        this.rvAmout = constraintLayout;
        this.tvBalance = textView;
    }

    public static ActivityWithdrawFromPochiBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityWithdrawFromPochiBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityWithdrawFromPochiBinding activityWithdrawFromPochiBinding = (ActivityWithdrawFromPochiBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_withdraw_from_pochi, viewGroup, z, obj);
        int i4 = copydefault + 5;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return activityWithdrawFromPochiBinding;
        }
        throw null;
    }

    public static ActivityWithdrawFromPochiBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityWithdrawFromPochiBinding activityWithdrawFromPochiBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 7;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityWithdrawFromPochiBindingInflate;
    }

    @Deprecated
    public static ActivityWithdrawFromPochiBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityWithdrawFromPochiBinding activityWithdrawFromPochiBinding = (ActivityWithdrawFromPochiBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_withdraw_from_pochi, null, false, obj);
        int i4 = ShareDataUIState + 9;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return activityWithdrawFromPochiBinding;
        }
        throw null;
    }

    public static ActivityWithdrawFromPochiBinding bind(View view) {
        ActivityWithdrawFromPochiBinding activityWithdrawFromPochiBindingBind;
        int i = 2 % 2;
        int i2 = copydefault + 59;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            activityWithdrawFromPochiBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
            int i3 = 80 / 0;
        } else {
            activityWithdrawFromPochiBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        }
        int i4 = ShareDataUIState + 49;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityWithdrawFromPochiBindingBind;
    }

    @Deprecated
    public static ActivityWithdrawFromPochiBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityWithdrawFromPochiBinding activityWithdrawFromPochiBinding = (ActivityWithdrawFromPochiBinding) bind(obj, view, R.layout.activity_withdraw_from_pochi);
        int i4 = ShareDataUIState + 125;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 57 / 0;
        }
        return activityWithdrawFromPochiBinding;
    }
}
