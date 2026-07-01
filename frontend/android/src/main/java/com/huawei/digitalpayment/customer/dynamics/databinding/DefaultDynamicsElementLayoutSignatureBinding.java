package com.huawei.digitalpayment.customer.dynamics.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.customer.dynamics.R;

public abstract class DefaultDynamicsElementLayoutSignatureBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    public final CommonInputView commonInputView;
    public final RoundImageView imageView;
    public final ImageView ivCamera;
    public final ImageView ivDelete;
    public final TextView tvTitle;

    protected DefaultDynamicsElementLayoutSignatureBinding(Object obj, View view, int i, CommonInputView commonInputView, RoundImageView roundImageView, ImageView imageView, ImageView imageView2, TextView textView) {
        super(obj, view, i);
        this.commonInputView = commonInputView;
        this.imageView = roundImageView;
        this.ivCamera = imageView;
        this.ivDelete = imageView2;
        this.tvTitle = textView;
    }

    public static DefaultDynamicsElementLayoutSignatureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 87;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DefaultDynamicsElementLayoutSignatureBinding defaultDynamicsElementLayoutSignatureBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 19;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return defaultDynamicsElementLayoutSignatureBindingInflate;
    }

    @Deprecated
    public static DefaultDynamicsElementLayoutSignatureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 91;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.default_dynamics_element_layout_signature, viewGroup, z, obj);
        if (i3 == 0) {
            return (DefaultDynamicsElementLayoutSignatureBinding) viewDataBindingInflateInternal;
        }
        throw null;
    }

    public static DefaultDynamicsElementLayoutSignatureBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 37;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DefaultDynamicsElementLayoutSignatureBinding defaultDynamicsElementLayoutSignatureBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 35;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return defaultDynamicsElementLayoutSignatureBindingInflate;
    }

    @Deprecated
    public static DefaultDynamicsElementLayoutSignatureBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 61;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DefaultDynamicsElementLayoutSignatureBinding defaultDynamicsElementLayoutSignatureBinding = (DefaultDynamicsElementLayoutSignatureBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.default_dynamics_element_layout_signature, null, false, obj);
        int i4 = ShareDataUIState + 73;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return defaultDynamicsElementLayoutSignatureBinding;
    }

    public static DefaultDynamicsElementLayoutSignatureBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 49;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DefaultDynamicsElementLayoutSignatureBinding defaultDynamicsElementLayoutSignatureBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 63;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return defaultDynamicsElementLayoutSignatureBindingBind;
    }

    @Deprecated
    public static DefaultDynamicsElementLayoutSignatureBinding bind(View view, Object obj) {
        DefaultDynamicsElementLayoutSignatureBinding defaultDynamicsElementLayoutSignatureBinding;
        int i = 2 % 2;
        int i2 = component1 + 53;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            defaultDynamicsElementLayoutSignatureBinding = (DefaultDynamicsElementLayoutSignatureBinding) bind(obj, view, R.layout.default_dynamics_element_layout_signature);
            int i3 = 67 / 0;
        } else {
            defaultDynamicsElementLayoutSignatureBinding = (DefaultDynamicsElementLayoutSignatureBinding) bind(obj, view, R.layout.default_dynamics_element_layout_signature);
        }
        int i4 = ShareDataUIState + 3;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return defaultDynamicsElementLayoutSignatureBinding;
    }
}
