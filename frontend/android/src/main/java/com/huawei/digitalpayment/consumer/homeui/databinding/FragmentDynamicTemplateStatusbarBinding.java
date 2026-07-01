package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class FragmentDynamicTemplateStatusbarBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component2;
    public final View root;

    protected FragmentDynamicTemplateStatusbarBinding(Object obj, View view, int i, View view2) {
        super(obj, view, i);
        this.root = view2;
    }

    public static FragmentDynamicTemplateStatusbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 51;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentDynamicTemplateStatusbarBinding fragmentDynamicTemplateStatusbarBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
        return fragmentDynamicTemplateStatusbarBindingInflate;
    }

    @Deprecated
    public static FragmentDynamicTemplateStatusbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 9;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        FragmentDynamicTemplateStatusbarBinding fragmentDynamicTemplateStatusbarBinding = (FragmentDynamicTemplateStatusbarBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_dynamic_template_statusbar, viewGroup, z, obj);
        int i3 = component1 + 5;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 59 / 0;
        }
        return fragmentDynamicTemplateStatusbarBinding;
    }

    public static FragmentDynamicTemplateStatusbarBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 83;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        FragmentDynamicTemplateStatusbarBinding fragmentDynamicTemplateStatusbarBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 7;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return fragmentDynamicTemplateStatusbarBindingInflate;
    }

    @Deprecated
    public static FragmentDynamicTemplateStatusbarBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 13;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentDynamicTemplateStatusbarBinding fragmentDynamicTemplateStatusbarBinding = (FragmentDynamicTemplateStatusbarBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_dynamic_template_statusbar, null, false, obj);
        int i4 = component1 + 47;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentDynamicTemplateStatusbarBinding;
    }

    public static FragmentDynamicTemplateStatusbarBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 79;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentDynamicTemplateStatusbarBinding fragmentDynamicTemplateStatusbarBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 123;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
        return fragmentDynamicTemplateStatusbarBindingBind;
    }

    @Deprecated
    public static FragmentDynamicTemplateStatusbarBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 59;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        FragmentDynamicTemplateStatusbarBinding fragmentDynamicTemplateStatusbarBinding = (FragmentDynamicTemplateStatusbarBinding) bind(obj, view, R.layout.fragment_dynamic_template_statusbar);
        int i3 = component1 + 95;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return fragmentDynamicTemplateStatusbarBinding;
    }
}
