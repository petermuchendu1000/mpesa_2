package com.huawei.digitalpayment.consumer.manageandviewdata.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.manageandviewdata.R;

public abstract class LayoutSpinnerItemBinding extends ViewDataBinding {
    private static int component2 = 0;
    private static int copydefault = 1;
    public final ConstraintLayout csSpinner;
    public final ImageView ivUnitsDropdown;
    public final Spinner spnDropDown;
    public final TextView tvSelectedValue;

    protected LayoutSpinnerItemBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, ImageView imageView, Spinner spinner, TextView textView) {
        super(obj, view, i);
        this.csSpinner = constraintLayout;
        this.ivUnitsDropdown = imageView;
        this.spnDropDown = spinner;
        this.tvSelectedValue = textView;
    }

    public static LayoutSpinnerItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        LayoutSpinnerItemBinding layoutSpinnerItemBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 41;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            return layoutSpinnerItemBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static LayoutSpinnerItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 113;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        LayoutSpinnerItemBinding layoutSpinnerItemBinding = (LayoutSpinnerItemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_spinner_item, viewGroup, z, obj);
        int i4 = component2 + 55;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return layoutSpinnerItemBinding;
    }

    public static LayoutSpinnerItemBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 3;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        LayoutSpinnerItemBinding layoutSpinnerItemBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 111;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return layoutSpinnerItemBindingInflate;
    }

    @Deprecated
    public static LayoutSpinnerItemBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = copydefault + 9;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.layout_spinner_item;
            z = true;
        } else {
            i = R.layout.layout_spinner_item;
            z = false;
        }
        LayoutSpinnerItemBinding layoutSpinnerItemBinding = (LayoutSpinnerItemBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = copydefault + 37;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return layoutSpinnerItemBinding;
        }
        throw null;
    }

    public static LayoutSpinnerItemBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 81;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        LayoutSpinnerItemBinding layoutSpinnerItemBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 39;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return layoutSpinnerItemBindingBind;
    }

    @Deprecated
    public static LayoutSpinnerItemBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        LayoutSpinnerItemBinding layoutSpinnerItemBinding = (LayoutSpinnerItemBinding) bind(obj, view, R.layout.layout_spinner_item);
        int i4 = copydefault + 25;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return layoutSpinnerItemBinding;
    }
}
