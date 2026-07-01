package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class FragmentDeMoreFunctionBinding extends ViewDataBinding {
    private static int component3 = 0;
    private static int copydefault = 1;
    public final LinearLayout llViewall;
    public final RecyclerView recyclerView;
    public final TextView tvTitle;

    protected FragmentDeMoreFunctionBinding(Object obj, View view, int i, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i);
        this.llViewall = linearLayout;
        this.recyclerView = recyclerView;
        this.tvTitle = textView;
    }

    public static FragmentDeMoreFunctionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentDeMoreFunctionBinding fragmentDeMoreFunctionBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 12 / 0;
        }
        return fragmentDeMoreFunctionBindingInflate;
    }

    @Deprecated
    public static FragmentDeMoreFunctionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentDeMoreFunctionBinding fragmentDeMoreFunctionBinding = (FragmentDeMoreFunctionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_de_more_function, viewGroup, z, obj);
        int i4 = copydefault + 7;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentDeMoreFunctionBinding;
        }
        throw null;
    }

    public static FragmentDeMoreFunctionBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentDeMoreFunctionBinding fragmentDeMoreFunctionBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 37;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentDeMoreFunctionBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentDeMoreFunctionBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 15;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return (FragmentDeMoreFunctionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_de_more_function, null, false, obj);
    }

    public static FragmentDeMoreFunctionBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentDeMoreFunctionBinding fragmentDeMoreFunctionBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 69;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentDeMoreFunctionBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentDeMoreFunctionBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 95;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.fragment_de_more_function);
        if (i3 != 0) {
            return (FragmentDeMoreFunctionBinding) viewDataBindingBind;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
