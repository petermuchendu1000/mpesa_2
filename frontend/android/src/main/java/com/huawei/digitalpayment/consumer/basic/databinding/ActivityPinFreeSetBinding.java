package com.huawei.digitalpayment.consumer.basic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.SwitchView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.common.widget.text.AmountInputView;
import com.huawei.digitalpayment.consumer.basic.R;

public abstract class ActivityPinFreeSetBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component3;
    public final SwitchView cbPinFree;
    public final RoundConstraintLayout cvSwitch;
    public final LoadingButton lbConfirm;
    public final AmountInputView llAmount;
    public final RoundTextView textView;
    public final TextView tvFingerprintLogin;
    public final TextView tvHint;

    protected ActivityPinFreeSetBinding(Object obj, View view, int i, SwitchView switchView, RoundConstraintLayout roundConstraintLayout, LoadingButton loadingButton, AmountInputView amountInputView, RoundTextView roundTextView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.cbPinFree = switchView;
        this.cvSwitch = roundConstraintLayout;
        this.lbConfirm = loadingButton;
        this.llAmount = amountInputView;
        this.textView = roundTextView;
        this.tvFingerprintLogin = textView;
        this.tvHint = textView2;
    }

    public static ActivityPinFreeSetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        ActivityPinFreeSetBinding activityPinFreeSetBindingInflate;
        int i = 2 % 2;
        int i2 = component1 + 19;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            activityPinFreeSetBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            int i3 = 16 / 0;
        } else {
            activityPinFreeSetBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component1 + 43;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activityPinFreeSetBindingInflate;
    }

    @Deprecated
    public static ActivityPinFreeSetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 51;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ActivityPinFreeSetBinding activityPinFreeSetBinding = (ActivityPinFreeSetBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_pin_free_set, viewGroup, z, obj);
        int i3 = component1 + 3;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return activityPinFreeSetBinding;
        }
        throw null;
    }

    public static ActivityPinFreeSetBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 89;
        component1 = i2 % 128;
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
    public static ActivityPinFreeSetBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component3 + 45;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.activity_pin_free_set;
            z = true;
        } else {
            i = R.layout.activity_pin_free_set;
            z = false;
        }
        return (ActivityPinFreeSetBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
    }

    public static ActivityPinFreeSetBinding bind(View view) {
        ActivityPinFreeSetBinding activityPinFreeSetBindingBind;
        int i = 2 % 2;
        int i2 = component1 + 71;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            activityPinFreeSetBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
            int i3 = 51 / 0;
        } else {
            activityPinFreeSetBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component3 + 97;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activityPinFreeSetBindingBind;
    }

    @Deprecated
    public static ActivityPinFreeSetBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 33;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityPinFreeSetBinding activityPinFreeSetBinding = (ActivityPinFreeSetBinding) bind(obj, view, R.layout.activity_pin_free_set);
        int i4 = component1 + 13;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
        return activityPinFreeSetBinding;
    }
}
