package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class ItemFunctionsTemplateDefaultBinding extends ViewDataBinding {
    private static int component3 = 1;
    private static int copydefault;
    public final RoundImageView background;
    public final Guideline guideline;
    public final View guideline2;
    public final RoundImageView ivHot;
    public final RoundImageView ivIcon;
    public final RoundConstraintLayout root;
    public final RoundTextView tvHot;
    public final TextView tvTitle;
    public final View viewMarginEndBottom;
    public final View viewMarginStartTop;
    public final View viewPaddingEndBottom;
    public final View viewPaddingStartTop;
    public final View viewSpace;

    protected ItemFunctionsTemplateDefaultBinding(Object obj, View view, int i, RoundImageView roundImageView, Guideline guideline, View view2, RoundImageView roundImageView2, RoundImageView roundImageView3, RoundConstraintLayout roundConstraintLayout, RoundTextView roundTextView, TextView textView, View view3, View view4, View view5, View view6, View view7) {
        super(obj, view, i);
        this.background = roundImageView;
        this.guideline = guideline;
        this.guideline2 = view2;
        this.ivHot = roundImageView2;
        this.ivIcon = roundImageView3;
        this.root = roundConstraintLayout;
        this.tvHot = roundTextView;
        this.tvTitle = textView;
        this.viewMarginEndBottom = view3;
        this.viewMarginStartTop = view4;
        this.viewPaddingEndBottom = view5;
        this.viewPaddingStartTop = view6;
        this.viewSpace = view7;
    }

    public static ItemFunctionsTemplateDefaultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemFunctionsTemplateDefaultBinding itemFunctionsTemplateDefaultBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 81;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemFunctionsTemplateDefaultBindingInflate;
    }

    @Deprecated
    public static ItemFunctionsTemplateDefaultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        ItemFunctionsTemplateDefaultBinding itemFunctionsTemplateDefaultBinding;
        int i = 2 % 2;
        int i2 = copydefault + 63;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            itemFunctionsTemplateDefaultBinding = (ItemFunctionsTemplateDefaultBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_functions_template_default, viewGroup, z, obj);
            int i3 = 85 / 0;
        } else {
            itemFunctionsTemplateDefaultBinding = (ItemFunctionsTemplateDefaultBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_functions_template_default, viewGroup, z, obj);
        }
        int i4 = component3 + 97;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return itemFunctionsTemplateDefaultBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ItemFunctionsTemplateDefaultBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 31;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ItemFunctionsTemplateDefaultBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 43;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return (ItemFunctionsTemplateDefaultBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_functions_template_default, null, false, obj);
    }

    public static ItemFunctionsTemplateDefaultBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ItemFunctionsTemplateDefaultBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 95;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ItemFunctionsTemplateDefaultBinding itemFunctionsTemplateDefaultBinding = (ItemFunctionsTemplateDefaultBinding) bind(obj, view, R.layout.item_functions_template_default);
        int i3 = component3 + 125;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return itemFunctionsTemplateDefaultBinding;
    }
}
