package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class FragmentGroupTemplateBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int component3;
    public final LinearLayout container;
    public final ImageView ivBackground;
    public final RoundConstraintLayout root;

    protected FragmentGroupTemplateBinding(Object obj, View view, int i, LinearLayout linearLayout, ImageView imageView, RoundConstraintLayout roundConstraintLayout) {
        super(obj, view, i);
        this.container = linearLayout;
        this.ivBackground = imageView;
        this.root = roundConstraintLayout;
    }

    public static FragmentGroupTemplateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 107;
        component2 = i2 % 128;
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
    public static FragmentGroupTemplateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 57;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        FragmentGroupTemplateBinding fragmentGroupTemplateBinding = (FragmentGroupTemplateBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_group_template, viewGroup, z, obj);
        int i3 = component2 + 85;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return fragmentGroupTemplateBinding;
    }

    public static FragmentGroupTemplateBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 25;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentGroupTemplateBinding fragmentGroupTemplateBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 23;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentGroupTemplateBindingInflate;
    }

    @Deprecated
    public static FragmentGroupTemplateBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 23;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentGroupTemplateBinding fragmentGroupTemplateBinding = (FragmentGroupTemplateBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_group_template, null, false, obj);
        int i4 = component2 + 41;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentGroupTemplateBinding;
    }

    public static FragmentGroupTemplateBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 121;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentGroupTemplateBinding fragmentGroupTemplateBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 99;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentGroupTemplateBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentGroupTemplateBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 99;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentGroupTemplateBinding fragmentGroupTemplateBinding = (FragmentGroupTemplateBinding) bind(obj, view, R.layout.fragment_group_template);
        int i4 = component2 + 125;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
        return fragmentGroupTemplateBinding;
    }
}
