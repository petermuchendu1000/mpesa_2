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

public abstract class ItemNoExpiryBundleBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    public final CardView cvRoot;
    public final ImageView ivBundle;
    public final LinearLayout llContainer;
    public final TextView tvBundleAmount;
    public final TextView tvBundleTitle;
    public final RoundTextView tvBuy;

    protected ItemNoExpiryBundleBinding(Object obj, View view, int i, CardView cardView, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2, RoundTextView roundTextView) {
        super(obj, view, i);
        this.cvRoot = cardView;
        this.ivBundle = imageView;
        this.llContainer = linearLayout;
        this.tvBundleAmount = textView;
        this.tvBundleTitle = textView2;
        this.tvBuy = roundTextView;
    }

    public static ItemNoExpiryBundleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        ItemNoExpiryBundleBinding itemNoExpiryBundleBindingInflate;
        int i = 2 % 2;
        int i2 = copydefault + 13;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            itemNoExpiryBundleBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            int i3 = 95 / 0;
        } else {
            itemNoExpiryBundleBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        }
        int i4 = ShareDataUIState + 115;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return itemNoExpiryBundleBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ItemNoExpiryBundleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        ItemNoExpiryBundleBinding itemNoExpiryBundleBinding;
        int i = 2 % 2;
        int i2 = copydefault + 105;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            itemNoExpiryBundleBinding = (ItemNoExpiryBundleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_no_expiry_bundle, viewGroup, z, obj);
            int i3 = 16 / 0;
        } else {
            itemNoExpiryBundleBinding = (ItemNoExpiryBundleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_no_expiry_bundle, viewGroup, z, obj);
        }
        int i4 = copydefault + 121;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return itemNoExpiryBundleBinding;
        }
        throw null;
    }

    public static ItemNoExpiryBundleBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemNoExpiryBundleBinding itemNoExpiryBundleBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 23;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return itemNoExpiryBundleBindingInflate;
    }

    @Deprecated
    public static ItemNoExpiryBundleBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemNoExpiryBundleBinding itemNoExpiryBundleBinding = (ItemNoExpiryBundleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_no_expiry_bundle, null, false, obj);
        int i4 = ShareDataUIState + 101;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return itemNoExpiryBundleBinding;
        }
        throw null;
    }

    public static ItemNoExpiryBundleBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        ItemNoExpiryBundleBinding itemNoExpiryBundleBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = copydefault + 113;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            return itemNoExpiryBundleBindingBind;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ItemNoExpiryBundleBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 51;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        ItemNoExpiryBundleBinding itemNoExpiryBundleBinding = (ItemNoExpiryBundleBinding) bind(obj, view, R.layout.item_no_expiry_bundle);
        int i3 = copydefault + 79;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 39 / 0;
        }
        return itemNoExpiryBundleBinding;
    }
}
