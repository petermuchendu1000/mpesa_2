package com.huawei.digitalpayment.consumer.baseui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.base.ui.widget.PinPadView;
import com.huawei.digitalpayment.consumer.base.ui.widget.SafeInputKeyboard;
import com.huawei.digitalpayment.consumer.baseui.R;

public abstract class FragmentBasePinBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component2 = 1;
    public final CardView cardAbbr;
    public final RoundImageView ivAvatar;
    public final RoundImageView ivBack;
    public final LinearLayout llContainer;
    public final LinearLayout llUserInfo;
    public final PinPadView pinPadView;
    public final TextView tvAbbr;
    public final TextView tvAmountDisplay;
    public final TextView tvName;
    public final TextView tvPhoneNumber;
    public final TextView tvPinError;
    public final TextView tvTitle;
    public final SafeInputKeyboard virtualKeyboardView;

    protected FragmentBasePinBinding(Object obj, View view, int i, CardView cardView, RoundImageView roundImageView, RoundImageView roundImageView2, LinearLayout linearLayout, LinearLayout linearLayout2, PinPadView pinPadView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, SafeInputKeyboard safeInputKeyboard) {
        super(obj, view, i);
        this.cardAbbr = cardView;
        this.ivAvatar = roundImageView;
        this.ivBack = roundImageView2;
        this.llContainer = linearLayout;
        this.llUserInfo = linearLayout2;
        this.pinPadView = pinPadView;
        this.tvAbbr = textView;
        this.tvAmountDisplay = textView2;
        this.tvName = textView3;
        this.tvPhoneNumber = textView4;
        this.tvPinError = textView5;
        this.tvTitle = textView6;
        this.virtualKeyboardView = safeInputKeyboard;
    }

    public static FragmentBasePinBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 39;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        FragmentBasePinBinding fragmentBasePinBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 49;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            return fragmentBasePinBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static FragmentBasePinBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 95;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentBasePinBinding fragmentBasePinBinding = (FragmentBasePinBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_base_pin, viewGroup, z, obj);
        int i4 = component2 + 3;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
        return fragmentBasePinBinding;
    }

    public static FragmentBasePinBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 77;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        FragmentBasePinBinding fragmentBasePinBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 93;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            return fragmentBasePinBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static FragmentBasePinBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component2 + 111;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.fragment_base_pin;
            z = true;
        } else {
            i = R.layout.fragment_base_pin;
            z = false;
        }
        return (FragmentBasePinBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
    }

    public static FragmentBasePinBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 107;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        FragmentBasePinBinding fragmentBasePinBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 73;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return fragmentBasePinBindingBind;
    }

    @Deprecated
    public static FragmentBasePinBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 105;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.fragment_base_pin);
        if (i3 == 0) {
            return (FragmentBasePinBinding) viewDataBindingBind;
        }
        throw null;
    }
}
