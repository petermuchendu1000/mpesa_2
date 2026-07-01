package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.BubblesView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class ItemQuickActionsFuncionBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    public final Guideline guideline;
    public final View guideline2;
    public final RoundImageView ivFunctionIcon;
    public final RoundImageView ivMarker;
    public final ConstraintLayout rlRoot;
    public final TextView tvFunctionName;
    public final BubblesView tvRedDot;

    protected ItemQuickActionsFuncionBinding(Object obj, View view, int i, Guideline guideline, View view2, RoundImageView roundImageView, RoundImageView roundImageView2, ConstraintLayout constraintLayout, TextView textView, BubblesView bubblesView) {
        super(obj, view, i);
        this.guideline = guideline;
        this.guideline2 = view2;
        this.ivFunctionIcon = roundImageView;
        this.ivMarker = roundImageView2;
        this.rlRoot = constraintLayout;
        this.tvFunctionName = textView;
        this.tvRedDot = bubblesView;
    }

    public static ItemQuickActionsFuncionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        ItemQuickActionsFuncionBinding itemQuickActionsFuncionBindingInflate;
        int i = 2 % 2;
        int i2 = copydefault + 55;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            itemQuickActionsFuncionBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            int i3 = 1 / 0;
        } else {
            itemQuickActionsFuncionBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        }
        int i4 = copydefault + 119;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return itemQuickActionsFuncionBindingInflate;
    }

    @Deprecated
    public static ItemQuickActionsFuncionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemQuickActionsFuncionBinding itemQuickActionsFuncionBinding = (ItemQuickActionsFuncionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_quick_actions_funcion, viewGroup, z, obj);
        if (i3 == 0) {
            return itemQuickActionsFuncionBinding;
        }
        throw null;
    }

    public static ItemQuickActionsFuncionBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemQuickActionsFuncionBinding itemQuickActionsFuncionBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 11;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return itemQuickActionsFuncionBindingInflate;
    }

    @Deprecated
    public static ItemQuickActionsFuncionBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        ItemQuickActionsFuncionBinding itemQuickActionsFuncionBinding = (ItemQuickActionsFuncionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_quick_actions_funcion, null, false, obj);
        int i4 = copydefault + 41;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return itemQuickActionsFuncionBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ItemQuickActionsFuncionBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemQuickActionsFuncionBinding itemQuickActionsFuncionBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
        return itemQuickActionsFuncionBindingBind;
    }

    @Deprecated
    public static ItemQuickActionsFuncionBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        ItemQuickActionsFuncionBinding itemQuickActionsFuncionBinding = (ItemQuickActionsFuncionBinding) bind(obj, view, R.layout.item_quick_actions_funcion);
        int i3 = copydefault + 1;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return itemQuickActionsFuncionBinding;
    }
}
