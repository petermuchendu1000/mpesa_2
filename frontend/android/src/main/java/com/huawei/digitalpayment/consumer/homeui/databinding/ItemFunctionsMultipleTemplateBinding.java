package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class ItemFunctionsMultipleTemplateBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component2;
    public final RoundImageView background;
    public final RoundImageView ivIcon;
    public final RoundConstraintLayout root;
    public final TextView tvTitle;

    protected ItemFunctionsMultipleTemplateBinding(Object obj, View view, int i, RoundImageView roundImageView, RoundImageView roundImageView2, RoundConstraintLayout roundConstraintLayout, TextView textView) {
        super(obj, view, i);
        this.background = roundImageView;
        this.ivIcon = roundImageView2;
        this.root = roundConstraintLayout;
        this.tvTitle = textView;
    }

    public static ItemFunctionsMultipleTemplateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        ItemFunctionsMultipleTemplateBinding itemFunctionsMultipleTemplateBindingInflate;
        int i = 2 % 2;
        int i2 = component2 + 41;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            itemFunctionsMultipleTemplateBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            int i3 = 14 / 0;
        } else {
            itemFunctionsMultipleTemplateBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component1 + 5;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return itemFunctionsMultipleTemplateBindingInflate;
    }

    @Deprecated
    public static ItemFunctionsMultipleTemplateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        ItemFunctionsMultipleTemplateBinding itemFunctionsMultipleTemplateBinding;
        int i = 2 % 2;
        int i2 = component2 + 97;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            itemFunctionsMultipleTemplateBinding = (ItemFunctionsMultipleTemplateBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_functions_multiple_template, viewGroup, z, obj);
            int i3 = 26 / 0;
        } else {
            itemFunctionsMultipleTemplateBinding = (ItemFunctionsMultipleTemplateBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_functions_multiple_template, viewGroup, z, obj);
        }
        int i4 = component2 + 63;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return itemFunctionsMultipleTemplateBinding;
    }

    public static ItemFunctionsMultipleTemplateBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 91;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ItemFunctionsMultipleTemplateBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 61;
        component2 = i2 % 128;
        ItemFunctionsMultipleTemplateBinding itemFunctionsMultipleTemplateBinding = (ItemFunctionsMultipleTemplateBinding) (i2 % 2 != 0 ? ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_functions_multiple_template, null, true, obj) : ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_functions_multiple_template, null, false, obj));
        int i3 = component1 + 41;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 43 / 0;
        }
        return itemFunctionsMultipleTemplateBinding;
    }

    public static ItemFunctionsMultipleTemplateBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 93;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemFunctionsMultipleTemplateBinding itemFunctionsMultipleTemplateBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 125;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return itemFunctionsMultipleTemplateBindingBind;
    }

    @Deprecated
    public static ItemFunctionsMultipleTemplateBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 47;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.item_functions_multiple_template);
        if (i3 == 0) {
            return (ItemFunctionsMultipleTemplateBinding) viewDataBindingBind;
        }
        throw null;
    }
}
