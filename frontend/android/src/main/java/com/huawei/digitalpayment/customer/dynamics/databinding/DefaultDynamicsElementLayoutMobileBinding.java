package com.huawei.digitalpayment.customer.dynamics.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.baselib.widget.input.MobileInputView;
import com.huawei.digitalpayment.customer.dynamics.R;

public abstract class DefaultDynamicsElementLayoutMobileBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int copydefault;
    public final MobileInputView commonInputView;

    protected DefaultDynamicsElementLayoutMobileBinding(Object obj, View view, int i, MobileInputView mobileInputView) {
        super(obj, view, i);
        this.commonInputView = mobileInputView;
    }

    public static DefaultDynamicsElementLayoutMobileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 45;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        DefaultDynamicsElementLayoutMobileBinding defaultDynamicsElementLayoutMobileBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = copydefault + 49;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            return defaultDynamicsElementLayoutMobileBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static DefaultDynamicsElementLayoutMobileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.default_dynamics_element_layout_mobile, viewGroup, z, obj);
        if (i3 != 0) {
            return (DefaultDynamicsElementLayoutMobileBinding) viewDataBindingInflateInternal;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static DefaultDynamicsElementLayoutMobileBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 11;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DefaultDynamicsElementLayoutMobileBinding defaultDynamicsElementLayoutMobileBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 67;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return defaultDynamicsElementLayoutMobileBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static DefaultDynamicsElementLayoutMobileBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 109;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DefaultDynamicsElementLayoutMobileBinding defaultDynamicsElementLayoutMobileBinding = (DefaultDynamicsElementLayoutMobileBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.default_dynamics_element_layout_mobile, null, false, obj);
        int i4 = copydefault + 107;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return defaultDynamicsElementLayoutMobileBinding;
        }
        throw null;
    }

    public static DefaultDynamicsElementLayoutMobileBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 53;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        DefaultDynamicsElementLayoutMobileBinding defaultDynamicsElementLayoutMobileBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 107;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            return defaultDynamicsElementLayoutMobileBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static DefaultDynamicsElementLayoutMobileBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 95;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        DefaultDynamicsElementLayoutMobileBinding defaultDynamicsElementLayoutMobileBinding = (DefaultDynamicsElementLayoutMobileBinding) bind(obj, view, R.layout.default_dynamics_element_layout_mobile);
        int i3 = copydefault + 117;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return defaultDynamicsElementLayoutMobileBinding;
    }
}
