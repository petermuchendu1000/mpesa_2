package com.huawei.digitalpayment.customer.dynamics.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.digitalpayment.customer.dynamics.R;

public abstract class DefaultDynamicsElementLayoutBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    public final CommonInputView commonInputView;

    protected DefaultDynamicsElementLayoutBinding(Object obj, View view, int i, CommonInputView commonInputView) {
        super(obj, view, i);
        this.commonInputView = commonInputView;
    }

    public static DefaultDynamicsElementLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static DefaultDynamicsElementLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 111;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DefaultDynamicsElementLayoutBinding defaultDynamicsElementLayoutBinding = (DefaultDynamicsElementLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.default_dynamics_element_layout, viewGroup, z, obj);
        int i4 = ShareDataUIState + 95;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return defaultDynamicsElementLayoutBinding;
    }

    public static DefaultDynamicsElementLayoutBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 49;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        throw null;
    }

    @Deprecated
    public static DefaultDynamicsElementLayoutBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component1 + 55;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.default_dynamics_element_layout;
            z = true;
        } else {
            i = R.layout.default_dynamics_element_layout;
            z = false;
        }
        return (DefaultDynamicsElementLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
    }

    public static DefaultDynamicsElementLayoutBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        DefaultDynamicsElementLayoutBinding defaultDynamicsElementLayoutBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = ShareDataUIState + 67;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return defaultDynamicsElementLayoutBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static DefaultDynamicsElementLayoutBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 115;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DefaultDynamicsElementLayoutBinding defaultDynamicsElementLayoutBinding = (DefaultDynamicsElementLayoutBinding) bind(obj, view, R.layout.default_dynamics_element_layout);
        int i4 = ShareDataUIState + 63;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
        return defaultDynamicsElementLayoutBinding;
    }
}
