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

public abstract class ItemFunctionsTemplate2Binding extends ViewDataBinding {
    private static int component2 = 1;
    private static int component3;
    public final RoundImageView background;
    public final View guideline;
    public final View guideline2;
    public final RoundImageView ivIcon;
    public final RoundConstraintLayout root;
    public final TextView tvTitle;
    public final View viewMarginEndBottom;
    public final View viewMarginStartTop;
    public final View viewPaddingEndBottom;
    public final View viewPaddingStartTop;
    public final View viewSpace;

    protected ItemFunctionsTemplate2Binding(Object obj, View view, int i, RoundImageView roundImageView, View view2, View view3, RoundImageView roundImageView2, RoundConstraintLayout roundConstraintLayout, TextView textView, View view4, View view5, View view6, View view7, View view8) {
        super(obj, view, i);
        this.background = roundImageView;
        this.guideline = view2;
        this.guideline2 = view3;
        this.ivIcon = roundImageView2;
        this.root = roundConstraintLayout;
        this.tvTitle = textView;
        this.viewMarginEndBottom = view4;
        this.viewMarginStartTop = view5;
        this.viewPaddingEndBottom = view6;
        this.viewPaddingStartTop = view7;
        this.viewSpace = view8;
    }

    public static ItemFunctionsTemplate2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 39;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemFunctionsTemplate2Binding itemFunctionsTemplate2BindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 73;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemFunctionsTemplate2BindingInflate;
    }

    @Deprecated
    public static ItemFunctionsTemplate2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 49;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemFunctionsTemplate2Binding itemFunctionsTemplate2Binding = (ItemFunctionsTemplate2Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_functions_template2, viewGroup, z, obj);
        int i4 = component3 + 73;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return itemFunctionsTemplate2Binding;
    }

    public static ItemFunctionsTemplate2Binding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 121;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemFunctionsTemplate2Binding itemFunctionsTemplate2BindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 21;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return itemFunctionsTemplate2BindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ItemFunctionsTemplate2Binding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 9;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        ItemFunctionsTemplate2Binding itemFunctionsTemplate2Binding = (ItemFunctionsTemplate2Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_functions_template2, null, false, obj);
        int i4 = component2 + 125;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return itemFunctionsTemplate2Binding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ItemFunctionsTemplate2Binding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 117;
        component2 = i2 % 128;
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
    public static ItemFunctionsTemplate2Binding bind(View view, Object obj) {
        ItemFunctionsTemplate2Binding itemFunctionsTemplate2Binding;
        int i = 2 % 2;
        int i2 = component2 + 119;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            itemFunctionsTemplate2Binding = (ItemFunctionsTemplate2Binding) bind(obj, view, R.layout.item_functions_template2);
            int i3 = 81 / 0;
        } else {
            itemFunctionsTemplate2Binding = (ItemFunctionsTemplate2Binding) bind(obj, view, R.layout.item_functions_template2);
        }
        int i4 = component2 + 69;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemFunctionsTemplate2Binding;
    }
}
