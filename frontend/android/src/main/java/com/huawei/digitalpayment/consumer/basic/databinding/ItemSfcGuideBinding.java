package com.huawei.digitalpayment.consumer.basic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.basic.R;

public abstract class ItemSfcGuideBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component2;
    public final ConstraintLayout clContainer;
    public final ConstraintLayout content;
    public final ImageView ivGuideImage;
    public final ImageView ivTitle;
    public final TextView tvTips;

    protected ItemSfcGuideBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, ImageView imageView2, TextView textView) {
        super(obj, view, i);
        this.clContainer = constraintLayout;
        this.content = constraintLayout2;
        this.ivGuideImage = imageView;
        this.ivTitle = imageView2;
        this.tvTips = textView;
    }

    public static ItemSfcGuideBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ItemSfcGuideBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 105;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_sfc_guide, viewGroup, z, obj);
        if (i3 != 0) {
            return (ItemSfcGuideBinding) viewDataBindingInflateInternal;
        }
        throw null;
    }

    public static ItemSfcGuideBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 101;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ItemSfcGuideBinding itemSfcGuideBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 69;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return itemSfcGuideBindingInflate;
    }

    @Deprecated
    public static ItemSfcGuideBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        ItemSfcGuideBinding itemSfcGuideBinding = (ItemSfcGuideBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_sfc_guide, null, false, obj);
        int i4 = ShareDataUIState + 53;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return itemSfcGuideBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ItemSfcGuideBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 115;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ItemSfcGuideBinding itemSfcGuideBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 109;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 3 / 0;
        }
        return itemSfcGuideBindingBind;
    }

    @Deprecated
    public static ItemSfcGuideBinding bind(View view, Object obj) {
        ItemSfcGuideBinding itemSfcGuideBinding;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            itemSfcGuideBinding = (ItemSfcGuideBinding) bind(obj, view, R.layout.item_sfc_guide);
            int i3 = 94 / 0;
        } else {
            itemSfcGuideBinding = (ItemSfcGuideBinding) bind(obj, view, R.layout.item_sfc_guide);
        }
        int i4 = component2 + 23;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return itemSfcGuideBinding;
    }
}
