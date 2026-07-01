package com.huawei.digitalpayment.customer.dynamics.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.input.IconImageView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.text.FixEditText;
import com.huawei.digitalpayment.customer.dynamics.R;

public abstract class DynamicsPhoneInputEditTextBinding extends ViewDataBinding {
    private static int component3 = 1;
    private static int copydefault;
    public final RoundConstraintLayout clInput;
    public final IconImageView endIconView;
    public final TextView endUnitView;
    public final TextView errorView;
    public final FixEditText inputView;
    public final IconImageView startIconView;
    public final TextView startUnitView;
    public final TextView titleView;

    protected DynamicsPhoneInputEditTextBinding(Object obj, View view, int i, RoundConstraintLayout roundConstraintLayout, IconImageView iconImageView, TextView textView, TextView textView2, FixEditText fixEditText, IconImageView iconImageView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.clInput = roundConstraintLayout;
        this.endIconView = iconImageView;
        this.endUnitView = textView;
        this.errorView = textView2;
        this.inputView = fixEditText;
        this.startIconView = iconImageView2;
        this.startUnitView = textView3;
        this.titleView = textView4;
    }

    public static DynamicsPhoneInputEditTextBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DynamicsPhoneInputEditTextBinding dynamicsPhoneInputEditTextBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 107;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
        return dynamicsPhoneInputEditTextBindingInflate;
    }

    @Deprecated
    public static DynamicsPhoneInputEditTextBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 121;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        DynamicsPhoneInputEditTextBinding dynamicsPhoneInputEditTextBinding = (DynamicsPhoneInputEditTextBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dynamics_phone_input_edit_text, viewGroup, z, obj);
        int i3 = copydefault + 55;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 6 / 0;
        }
        return dynamicsPhoneInputEditTextBinding;
    }

    public static DynamicsPhoneInputEditTextBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 53;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DynamicsPhoneInputEditTextBinding dynamicsPhoneInputEditTextBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 123;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return dynamicsPhoneInputEditTextBindingInflate;
    }

    @Deprecated
    public static DynamicsPhoneInputEditTextBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        component3 = i2 % 128;
        DynamicsPhoneInputEditTextBinding dynamicsPhoneInputEditTextBinding = (DynamicsPhoneInputEditTextBinding) ViewDataBinding.inflateInternal(layoutInflater, i2 % 2 == 0 ? R.layout.dynamics_phone_input_edit_text : R.layout.dynamics_phone_input_edit_text, null, false, obj);
        int i3 = component3 + 7;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return dynamicsPhoneInputEditTextBinding;
    }

    public static DynamicsPhoneInputEditTextBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        DynamicsPhoneInputEditTextBinding dynamicsPhoneInputEditTextBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component3 + 59;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return dynamicsPhoneInputEditTextBindingBind;
    }

    @Deprecated
    public static DynamicsPhoneInputEditTextBinding bind(View view, Object obj) {
        DynamicsPhoneInputEditTextBinding dynamicsPhoneInputEditTextBinding;
        int i = 2 % 2;
        int i2 = component3 + 75;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            dynamicsPhoneInputEditTextBinding = (DynamicsPhoneInputEditTextBinding) bind(obj, view, R.layout.dynamics_phone_input_edit_text);
            int i3 = 94 / 0;
        } else {
            dynamicsPhoneInputEditTextBinding = (DynamicsPhoneInputEditTextBinding) bind(obj, view, R.layout.dynamics_phone_input_edit_text);
        }
        int i4 = copydefault + 33;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
        return dynamicsPhoneInputEditTextBinding;
    }
}
