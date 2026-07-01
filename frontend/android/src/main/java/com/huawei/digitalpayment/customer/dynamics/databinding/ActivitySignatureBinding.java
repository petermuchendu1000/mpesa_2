package com.huawei.digitalpayment.customer.dynamics.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.customer.dynamics.R;
import com.huawei.digitalpayment.customer.dynamics.widget.signature.SignatureView;

public abstract class ActivitySignatureBinding extends ViewDataBinding {
    private static int component2 = 0;
    private static int copydefault = 1;
    public final LoadingButton btnConfirm;
    public final LoadingButton btnRewrite;
    public final ConstraintLayout root;
    public final SignatureView signature;
    public final RoundTextView tvToast;

    protected ActivitySignatureBinding(Object obj, View view, int i, LoadingButton loadingButton, LoadingButton loadingButton2, ConstraintLayout constraintLayout, SignatureView signatureView, RoundTextView roundTextView) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.btnRewrite = loadingButton2;
        this.root = constraintLayout;
        this.signature = signatureView;
        this.tvToast = roundTextView;
    }

    public static ActivitySignatureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySignatureBinding activitySignatureBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 41;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return activitySignatureBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivitySignatureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySignatureBinding activitySignatureBinding = (ActivitySignatureBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_signature, viewGroup, z, obj);
        int i4 = copydefault + 107;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activitySignatureBinding;
    }

    public static ActivitySignatureBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 63;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySignatureBinding activitySignatureBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
        return activitySignatureBindingInflate;
    }

    @Deprecated
    public static ActivitySignatureBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        ActivitySignatureBinding activitySignatureBinding = (ActivitySignatureBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_signature, null, false, obj);
        int i4 = component2 + 7;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return activitySignatureBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ActivitySignatureBinding bind(View view) {
        ActivitySignatureBinding activitySignatureBindingBind;
        int i = 2 % 2;
        int i2 = component2 + 29;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            activitySignatureBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
            int i3 = 86 / 0;
        } else {
            activitySignatureBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        }
        int i4 = copydefault + 13;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activitySignatureBindingBind;
    }

    @Deprecated
    public static ActivitySignatureBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        component2 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        ActivitySignatureBinding activitySignatureBinding = (ActivitySignatureBinding) bind(obj, view, R.layout.activity_signature);
        int i3 = copydefault + 125;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return activitySignatureBinding;
        }
        throw null;
    }
}
