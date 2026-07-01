package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ItemFaqsCardBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component3;
    public final ConstraintLayout csTitle;
    public final ImageView ivChevron;
    public final TextView tvDescription;
    public final TextView tvTitle;

    protected ItemFaqsCardBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.csTitle = constraintLayout;
        this.ivChevron = imageView;
        this.tvDescription = textView;
        this.tvTitle = textView2;
    }

    public static ItemFaqsCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 37;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemFaqsCardBinding itemFaqsCardBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 21;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemFaqsCardBindingInflate;
    }

    @Deprecated
    public static ItemFaqsCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 117;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemFaqsCardBinding itemFaqsCardBinding = (ItemFaqsCardBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_faqs_card, viewGroup, z, obj);
        int i4 = component3 + 121;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return itemFaqsCardBinding;
        }
        throw null;
    }

    public static ItemFaqsCardBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 95;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemFaqsCardBinding itemFaqsCardBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 67;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemFaqsCardBindingInflate;
    }

    @Deprecated
    public static ItemFaqsCardBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 125;
        component1 = i2 % 128;
        ItemFaqsCardBinding itemFaqsCardBinding = (ItemFaqsCardBinding) (i2 % 2 == 0 ? ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_faqs_card, null, true, obj) : ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_faqs_card, null, false, obj));
        int i3 = component1 + 89;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 59 / 0;
        }
        return itemFaqsCardBinding;
    }

    public static ItemFaqsCardBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 77;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        ItemFaqsCardBinding itemFaqsCardBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 25;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return itemFaqsCardBindingBind;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ItemFaqsCardBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 13;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemFaqsCardBinding itemFaqsCardBinding = (ItemFaqsCardBinding) bind(obj, view, R.layout.item_faqs_card);
        int i4 = component3 + 93;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return itemFaqsCardBinding;
    }
}
