package com.huawei.digitalpayment.consumer.baselib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.baselib.R;
import com.huawei.digitalpayment.consumer.baselib.widget.code.OtpEditText;

public abstract class ActivityAbstractOtpBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component3;
    public final LoadingButton btnContinue;
    public final TextView btnGetOtp;
    public final OtpEditText etCode;
    public final TextView tvDescription;
    public final TextView tvError;
    public final TextView tvTitle;

    protected ActivityAbstractOtpBinding(Object obj, View view, int i, LoadingButton loadingButton, TextView textView, OtpEditText otpEditText, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.btnContinue = loadingButton;
        this.btnGetOtp = textView;
        this.etCode = otpEditText;
        this.tvDescription = textView2;
        this.tvError = textView3;
        this.tvTitle = textView4;
    }

    public static ActivityAbstractOtpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ActivityAbstractOtpBinding activityAbstractOtpBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = ShareDataUIState + 53;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return activityAbstractOtpBindingInflate;
    }

    @Deprecated
    public static ActivityAbstractOtpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 27;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        ActivityAbstractOtpBinding activityAbstractOtpBinding = (ActivityAbstractOtpBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_abstract_otp, viewGroup, z, obj);
        int i3 = component3 + 109;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return activityAbstractOtpBinding;
    }

    public static ActivityAbstractOtpBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 85;
        ShareDataUIState = i2 % 128;
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
    public static ActivityAbstractOtpBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 37;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.activity_abstract_otp;
            z = true;
        } else {
            i = R.layout.activity_abstract_otp;
            z = false;
        }
        return (ActivityAbstractOtpBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
    }

    public static ActivityAbstractOtpBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 107;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityAbstractOtpBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ActivityAbstractOtpBinding activityAbstractOtpBinding = (ActivityAbstractOtpBinding) bind(obj, view, R.layout.activity_abstract_otp);
        int i3 = component3 + 27;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 41 / 0;
        }
        return activityAbstractOtpBinding;
    }
}
