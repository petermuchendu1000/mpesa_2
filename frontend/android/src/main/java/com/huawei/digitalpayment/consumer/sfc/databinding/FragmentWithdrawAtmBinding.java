package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class FragmentWithdrawAtmBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    public final LoadingButton btnConfirm;
    public final CommonInputView inputAtmNumber;
    public final TextView tvAtmTips;

    protected FragmentWithdrawAtmBinding(Object obj, View view, int i, LoadingButton loadingButton, CommonInputView commonInputView, TextView textView) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.inputAtmNumber = commonInputView;
        this.tvAtmTips = textView;
    }

    public static FragmentWithdrawAtmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentWithdrawAtmBinding fragmentWithdrawAtmBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 85;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return fragmentWithdrawAtmBindingInflate;
    }

    @Deprecated
    public static FragmentWithdrawAtmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentWithdrawAtmBinding fragmentWithdrawAtmBinding = (FragmentWithdrawAtmBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_withdraw_atm, viewGroup, z, obj);
        int i4 = ShareDataUIState + 1;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentWithdrawAtmBinding;
    }

    public static FragmentWithdrawAtmBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        FragmentWithdrawAtmBinding fragmentWithdrawAtmBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 49;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return fragmentWithdrawAtmBindingInflate;
    }

    @Deprecated
    public static FragmentWithdrawAtmBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentWithdrawAtmBinding fragmentWithdrawAtmBinding = (FragmentWithdrawAtmBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_withdraw_atm, null, false, obj);
        int i4 = component2 + 55;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentWithdrawAtmBinding;
        }
        throw null;
    }

    public static FragmentWithdrawAtmBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 121;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentWithdrawAtmBinding fragmentWithdrawAtmBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 53;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentWithdrawAtmBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static FragmentWithdrawAtmBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        FragmentWithdrawAtmBinding fragmentWithdrawAtmBinding = (FragmentWithdrawAtmBinding) bind(obj, view, R.layout.fragment_withdraw_atm);
        int i3 = ShareDataUIState + 87;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 97 / 0;
        }
        return fragmentWithdrawAtmBinding;
    }
}
