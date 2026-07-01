package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.baselib.widget.code.CodeEditText;
import com.huawei.digitalpayment.consumer.baselib.widget.code.SafeInputKeyboard;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivityPinPaymentBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component2;
    public final CodeEditText etCode;
    public final RoundImageView ivAvatar;
    public final TextView tvAmountDisplay;
    public final TextView tvName;
    public final SafeInputKeyboard virtualKeyboardView;

    protected ActivityPinPaymentBinding(Object obj, View view, int i, CodeEditText codeEditText, RoundImageView roundImageView, TextView textView, TextView textView2, SafeInputKeyboard safeInputKeyboard) {
        super(obj, view, i);
        this.etCode = codeEditText;
        this.ivAvatar = roundImageView;
        this.tvAmountDisplay = textView;
        this.tvName = textView2;
        this.virtualKeyboardView = safeInputKeyboard;
    }

    public static ActivityPinPaymentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 41;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivityPinPaymentBinding activityPinPaymentBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 113;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return activityPinPaymentBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivityPinPaymentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 109;
        component1 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        ActivityPinPaymentBinding activityPinPaymentBinding = (ActivityPinPaymentBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_pin_payment, viewGroup, z, obj);
        int i3 = component2 + 29;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return activityPinPaymentBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ActivityPinPaymentBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 31;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityPinPaymentBinding activityPinPaymentBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 91;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return activityPinPaymentBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityPinPaymentBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component1 + 73;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.activity_pin_payment;
            z = true;
        } else {
            i = R.layout.activity_pin_payment;
            z = false;
        }
        return (ActivityPinPaymentBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
    }

    public static ActivityPinPaymentBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 9;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityPinPaymentBinding activityPinPaymentBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 15;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
        return activityPinPaymentBindingBind;
    }

    @Deprecated
    public static ActivityPinPaymentBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 111;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityPinPaymentBinding activityPinPaymentBinding = (ActivityPinPaymentBinding) bind(obj, view, R.layout.activity_pin_payment);
        if (i3 == 0) {
            return activityPinPaymentBinding;
        }
        throw null;
    }
}
