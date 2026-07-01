package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.BubblesView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class ItemTopFunctionBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    public final Guideline guideline;
    public final View guideline2;
    public final RoundImageView ivFunctionIcon;
    public final RoundImageView ivMarker;
    public final ConstraintLayout rlRoot;
    public final TextView tvFunctionName;
    public final BubblesView tvRedDot;

    protected ItemTopFunctionBinding(Object obj, View view, int i, Guideline guideline, View view2, RoundImageView roundImageView, RoundImageView roundImageView2, ConstraintLayout constraintLayout, TextView textView, BubblesView bubblesView) {
        super(obj, view, i);
        this.guideline = guideline;
        this.guideline2 = view2;
        this.ivFunctionIcon = roundImageView;
        this.ivMarker = roundImageView2;
        this.rlRoot = constraintLayout;
        this.tvFunctionName = textView;
        this.tvRedDot = bubblesView;
    }

    public static ItemTopFunctionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 5;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ItemTopFunctionBinding itemTopFunctionBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = ShareDataUIState + 103;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return itemTopFunctionBindingInflate;
    }

    @Deprecated
    public static ItemTopFunctionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 41;
        ShareDataUIState = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        ItemTopFunctionBinding itemTopFunctionBinding = (ItemTopFunctionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_top_function, viewGroup, z, obj);
        int i3 = ShareDataUIState + 59;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return itemTopFunctionBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ItemTopFunctionBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ItemTopFunctionBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 9;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemTopFunctionBinding itemTopFunctionBinding = (ItemTopFunctionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_top_function, null, false, obj);
        int i4 = component1 + 67;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
        return itemTopFunctionBinding;
    }

    public static ItemTopFunctionBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 33;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemTopFunctionBinding itemTopFunctionBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 1;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return itemTopFunctionBindingBind;
    }

    @Deprecated
    public static ItemTopFunctionBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemTopFunctionBinding itemTopFunctionBinding = (ItemTopFunctionBinding) bind(obj, view, R.layout.item_top_function);
        int i4 = component1 + 1;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return itemTopFunctionBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
