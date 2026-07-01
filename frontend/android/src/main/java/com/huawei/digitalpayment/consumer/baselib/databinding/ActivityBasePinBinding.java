package com.huawei.digitalpayment.consumer.baselib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.baselib.R;
import com.huawei.digitalpayment.consumer.baselib.widget.code.CodeEditText;
import com.huawei.digitalpayment.consumer.baselib.widget.code.SafeInputKeyboard;

public abstract class ActivityBasePinBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    public final LoadingButton btnContinue;
    public final CodeEditText etCode;
    public final SafeInputKeyboard pinInputKeyboard;
    public final TextView tvDescription;
    public final TextView tvError;
    public final TextView tvForgot;
    public final TextView tvTitle;

    protected ActivityBasePinBinding(Object obj, View view, int i, LoadingButton loadingButton, CodeEditText codeEditText, SafeInputKeyboard safeInputKeyboard, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.btnContinue = loadingButton;
        this.etCode = codeEditText;
        this.pinInputKeyboard = safeInputKeyboard;
        this.tvDescription = textView;
        this.tvError = textView2;
        this.tvForgot = textView3;
        this.tvTitle = textView4;
    }

    public static ActivityBasePinBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ActivityBasePinBinding activityBasePinBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 115;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return activityBasePinBindingInflate;
    }

    @Deprecated
    public static ActivityBasePinBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 51;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityBasePinBinding activityBasePinBinding = (ActivityBasePinBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_base_pin, viewGroup, z, obj);
        int i4 = component2 + 53;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return activityBasePinBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ActivityBasePinBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityBasePinBinding activityBasePinBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 43;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activityBasePinBindingInflate;
    }

    @Deprecated
    public static ActivityBasePinBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component2 + 83;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.activity_base_pin;
            z = true;
        } else {
            i = R.layout.activity_base_pin;
            z = false;
        }
        ActivityBasePinBinding activityBasePinBinding = (ActivityBasePinBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = component2 + 9;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return activityBasePinBinding;
        }
        throw null;
    }

    public static ActivityBasePinBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityBasePinBinding activityBasePinBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 37;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
        return activityBasePinBindingBind;
    }

    @Deprecated
    public static ActivityBasePinBinding bind(View view, Object obj) {
        ActivityBasePinBinding activityBasePinBinding;
        int i = 2 % 2;
        int i2 = component2 + 59;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            activityBasePinBinding = (ActivityBasePinBinding) bind(obj, view, R.layout.activity_base_pin);
            int i3 = 16 / 0;
        } else {
            activityBasePinBinding = (ActivityBasePinBinding) bind(obj, view, R.layout.activity_base_pin);
        }
        int i4 = component2 + 117;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
        return activityBasePinBinding;
    }
}
