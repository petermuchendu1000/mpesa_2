package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class ItemFunctionsTemplate3Binding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    public final RoundImageView background;
    public final View guideline;
    public final View guideline2;
    public final ImageView ivArrow;
    public final RoundImageView ivIcon;
    public final RoundConstraintLayout root;
    public final TextView tvTitle;
    public final View viewMarginEndBottom;
    public final View viewMarginStartTop;
    public final View viewPaddingEndBottom;
    public final View viewPaddingStartTop;
    public final View viewSpace;

    protected ItemFunctionsTemplate3Binding(Object obj, View view, int i, RoundImageView roundImageView, View view2, View view3, ImageView imageView, RoundImageView roundImageView2, RoundConstraintLayout roundConstraintLayout, TextView textView, View view4, View view5, View view6, View view7, View view8) {
        super(obj, view, i);
        this.background = roundImageView;
        this.guideline = view2;
        this.guideline2 = view3;
        this.ivArrow = imageView;
        this.ivIcon = roundImageView2;
        this.root = roundConstraintLayout;
        this.tvTitle = textView;
        this.viewMarginEndBottom = view4;
        this.viewMarginStartTop = view5;
        this.viewPaddingEndBottom = view6;
        this.viewPaddingStartTop = view7;
        this.viewSpace = view8;
    }

    public static ItemFunctionsTemplate3Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 119;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemFunctionsTemplate3Binding itemFunctionsTemplate3BindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 69;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
        return itemFunctionsTemplate3BindingInflate;
    }

    @Deprecated
    public static ItemFunctionsTemplate3Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 87;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemFunctionsTemplate3Binding itemFunctionsTemplate3Binding = (ItemFunctionsTemplate3Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_functions_template3, viewGroup, z, obj);
        int i4 = ShareDataUIState + 113;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemFunctionsTemplate3Binding;
    }

    public static ItemFunctionsTemplate3Binding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ItemFunctionsTemplate3Binding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemFunctionsTemplate3Binding itemFunctionsTemplate3Binding = (ItemFunctionsTemplate3Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_functions_template3, null, false, obj);
        int i4 = ShareDataUIState + 41;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
        return itemFunctionsTemplate3Binding;
    }

    public static ItemFunctionsTemplate3Binding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 49;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemFunctionsTemplate3Binding itemFunctionsTemplate3BindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 117;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemFunctionsTemplate3BindingBind;
    }

    @Deprecated
    public static ItemFunctionsTemplate3Binding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 115;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemFunctionsTemplate3Binding itemFunctionsTemplate3Binding = (ItemFunctionsTemplate3Binding) bind(obj, view, R.layout.item_functions_template3);
        int i4 = component3 + 29;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return itemFunctionsTemplate3Binding;
    }
}
