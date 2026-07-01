package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.digitalpayment.consumer.base.ui.widget.SfcAmountInputView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class FragmentWithdrawAgentBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    public final LoadingButton btnConfirm;
    public final CommonInputView inputAgentNumber;
    public final SfcAmountInputView inputAmount;
    public final CommonInputView inputStoreNumber;
    public final ConstraintLayout rvAmountTips;
    public final TextView tvAmountMinTips;
    public final TextView tvAmountTips;
    public final TextView tvUserName;

    protected FragmentWithdrawAgentBinding(Object obj, View view, int i, LoadingButton loadingButton, CommonInputView commonInputView, SfcAmountInputView sfcAmountInputView, CommonInputView commonInputView2, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.inputAgentNumber = commonInputView;
        this.inputAmount = sfcAmountInputView;
        this.inputStoreNumber = commonInputView2;
        this.rvAmountTips = constraintLayout;
        this.tvAmountMinTips = textView;
        this.tvAmountTips = textView2;
        this.tvUserName = textView3;
    }

    public static FragmentWithdrawAgentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 91;
        ShareDataUIState = i2 % 128;
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
    public static FragmentWithdrawAgentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentWithdrawAgentBinding fragmentWithdrawAgentBinding = (FragmentWithdrawAgentBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_withdraw_agent, viewGroup, z, obj);
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
        return fragmentWithdrawAgentBinding;
    }

    public static FragmentWithdrawAgentBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 29;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentWithdrawAgentBinding fragmentWithdrawAgentBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 21;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return fragmentWithdrawAgentBindingInflate;
    }

    @Deprecated
    public static FragmentWithdrawAgentBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentWithdrawAgentBinding fragmentWithdrawAgentBinding = (FragmentWithdrawAgentBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_withdraw_agent, null, false, obj);
        int i4 = ShareDataUIState + 55;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
        return fragmentWithdrawAgentBinding;
    }

    public static FragmentWithdrawAgentBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        FragmentWithdrawAgentBinding fragmentWithdrawAgentBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = ShareDataUIState + 89;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 9 / 0;
        }
        return fragmentWithdrawAgentBindingBind;
    }

    @Deprecated
    public static FragmentWithdrawAgentBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 107;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentWithdrawAgentBinding fragmentWithdrawAgentBinding = (FragmentWithdrawAgentBinding) bind(obj, view, R.layout.fragment_withdraw_agent);
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
        return fragmentWithdrawAgentBinding;
    }
}
