package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ItemWithExpiryBundleBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int copydefault = 1;
    public final CardView cvRoot;
    public final ImageView ivBundle;
    public final LinearLayout llContainer;
    public final TextView tvBundleAmount;
    public final TextView tvBundleTitle;
    public final RoundTextView tvBuy;

    protected ItemWithExpiryBundleBinding(Object obj, View view, int i, CardView cardView, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2, RoundTextView roundTextView) {
        super(obj, view, i);
        this.cvRoot = cardView;
        this.ivBundle = imageView;
        this.llContainer = linearLayout;
        this.tvBundleAmount = textView;
        this.tvBundleTitle = textView2;
        this.tvBuy = roundTextView;
    }

    public static ItemWithExpiryBundleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 65;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemWithExpiryBundleBinding itemWithExpiryBundleBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 87;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return itemWithExpiryBundleBindingInflate;
    }

    @Deprecated
    public static ItemWithExpiryBundleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 73;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemWithExpiryBundleBinding itemWithExpiryBundleBinding = (ItemWithExpiryBundleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_with_expiry_bundle, viewGroup, z, obj);
        int i4 = copydefault + 7;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return itemWithExpiryBundleBinding;
    }

    public static ItemWithExpiryBundleBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemWithExpiryBundleBinding itemWithExpiryBundleBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 101;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return itemWithExpiryBundleBindingInflate;
    }

    @Deprecated
    public static ItemWithExpiryBundleBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 65;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemWithExpiryBundleBinding itemWithExpiryBundleBinding = (ItemWithExpiryBundleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_with_expiry_bundle, null, false, obj);
        int i4 = component1 + 45;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return itemWithExpiryBundleBinding;
    }

    public static ItemWithExpiryBundleBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 113;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemWithExpiryBundleBinding itemWithExpiryBundleBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 11;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
        return itemWithExpiryBundleBindingBind;
    }

    @Deprecated
    public static ItemWithExpiryBundleBinding bind(View view, Object obj) {
        ItemWithExpiryBundleBinding itemWithExpiryBundleBinding;
        int i = 2 % 2;
        int i2 = component1 + 35;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            itemWithExpiryBundleBinding = (ItemWithExpiryBundleBinding) bind(obj, view, R.layout.item_with_expiry_bundle);
            int i3 = 23 / 0;
        } else {
            itemWithExpiryBundleBinding = (ItemWithExpiryBundleBinding) bind(obj, view, R.layout.item_with_expiry_bundle);
        }
        int i4 = component1 + 111;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return itemWithExpiryBundleBinding;
    }
}
