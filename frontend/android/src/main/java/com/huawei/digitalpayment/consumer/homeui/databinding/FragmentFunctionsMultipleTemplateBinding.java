package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class FragmentFunctionsMultipleTemplateBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component2;
    public final RoundImageView background;
    public final Barrier barrier;
    public final ImageView ivIcon;
    public final RecyclerView recyclerView;
    public final RoundConstraintLayout root;
    public final TextView tvTitle;

    protected FragmentFunctionsMultipleTemplateBinding(Object obj, View view, int i, RoundImageView roundImageView, Barrier barrier, ImageView imageView, RecyclerView recyclerView, RoundConstraintLayout roundConstraintLayout, TextView textView) {
        super(obj, view, i);
        this.background = roundImageView;
        this.barrier = barrier;
        this.ivIcon = imageView;
        this.recyclerView = recyclerView;
        this.root = roundConstraintLayout;
        this.tvTitle = textView;
    }

    public static FragmentFunctionsMultipleTemplateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentFunctionsMultipleTemplateBinding fragmentFunctionsMultipleTemplateBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        return fragmentFunctionsMultipleTemplateBindingInflate;
    }

    @Deprecated
    public static FragmentFunctionsMultipleTemplateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_functions_multiple_template, viewGroup, z, obj);
        if (i3 == 0) {
            return (FragmentFunctionsMultipleTemplateBinding) viewDataBindingInflateInternal;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static FragmentFunctionsMultipleTemplateBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentFunctionsMultipleTemplateBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 105;
        ShareDataUIState = i2 % 128;
        FragmentFunctionsMultipleTemplateBinding fragmentFunctionsMultipleTemplateBinding = (FragmentFunctionsMultipleTemplateBinding) ViewDataBinding.inflateInternal(layoutInflater, i2 % 2 == 0 ? R.layout.fragment_functions_multiple_template : R.layout.fragment_functions_multiple_template, null, false, obj);
        int i3 = ShareDataUIState + 1;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return fragmentFunctionsMultipleTemplateBinding;
        }
        throw null;
    }

    public static FragmentFunctionsMultipleTemplateBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentFunctionsMultipleTemplateBinding fragmentFunctionsMultipleTemplateBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 93;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return fragmentFunctionsMultipleTemplateBindingBind;
    }

    @Deprecated
    public static FragmentFunctionsMultipleTemplateBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        FragmentFunctionsMultipleTemplateBinding fragmentFunctionsMultipleTemplateBinding = (FragmentFunctionsMultipleTemplateBinding) bind(obj, view, R.layout.fragment_functions_multiple_template);
        int i3 = ShareDataUIState + 67;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return fragmentFunctionsMultipleTemplateBinding;
    }
}
