package com.huawei.digitalpayment.consumer.baseui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.input.IconImageView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.text.FixEditText;
import com.huawei.digitalpayment.consumer.baseui.R;

public abstract class PhoneInputEditTextBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    public final RoundConstraintLayout clInput;
    public final IconImageView endIconView;
    public final TextView endUnitView;
    public final TextView errorView;
    public final FixEditText inputView;
    public final IconImageView startIconView;
    public final TextView startUnitView;
    public final TextView titleView;

    protected PhoneInputEditTextBinding(Object obj, View view, int i, RoundConstraintLayout roundConstraintLayout, IconImageView iconImageView, TextView textView, TextView textView2, FixEditText fixEditText, IconImageView iconImageView2, TextView textView3, TextView textView4) {
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

    public static PhoneInputEditTextBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        PhoneInputEditTextBinding phoneInputEditTextBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 33;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            return phoneInputEditTextBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static PhoneInputEditTextBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        PhoneInputEditTextBinding phoneInputEditTextBinding = (PhoneInputEditTextBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.phone_input_edit_text, viewGroup, z, obj);
        int i3 = ShareDataUIState + 83;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return phoneInputEditTextBinding;
    }

    public static PhoneInputEditTextBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        PhoneInputEditTextBinding phoneInputEditTextBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = ShareDataUIState + 91;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return phoneInputEditTextBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static PhoneInputEditTextBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 99;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        PhoneInputEditTextBinding phoneInputEditTextBinding = (PhoneInputEditTextBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.phone_input_edit_text, null, false, obj);
        int i4 = component1 + 19;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
        return phoneInputEditTextBinding;
    }

    public static PhoneInputEditTextBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        PhoneInputEditTextBinding phoneInputEditTextBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 11;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return phoneInputEditTextBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static PhoneInputEditTextBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        PhoneInputEditTextBinding phoneInputEditTextBinding = (PhoneInputEditTextBinding) bind(obj, view, R.layout.phone_input_edit_text);
        int i3 = ShareDataUIState + 61;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return phoneInputEditTextBinding;
        }
        throw null;
    }
}
