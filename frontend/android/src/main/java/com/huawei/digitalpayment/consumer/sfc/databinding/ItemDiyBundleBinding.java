package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ItemDiyBundleBinding extends ViewDataBinding {
    private static int component3 = 1;
    private static int copydefault;
    public final CardView cvRoot;
    public final ImageView ivBundle;
    public final LinearLayout llContainer;
    public final TextView tvBundleAmount;
    public final TextView tvBundleTitle;
    public final RoundTextView tvBuy;

    protected ItemDiyBundleBinding(Object obj, View view, int i, CardView cardView, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2, RoundTextView roundTextView) {
        super(obj, view, i);
        this.cvRoot = cardView;
        this.ivBundle = imageView;
        this.llContainer = linearLayout;
        this.tvBundleAmount = textView;
        this.tvBundleTitle = textView2;
        this.tvBuy = roundTextView;
    }

    public static ItemDiyBundleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 19;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemDiyBundleBinding itemDiyBundleBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 37;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return itemDiyBundleBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ItemDiyBundleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 13;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ItemDiyBundleBinding itemDiyBundleBinding = (ItemDiyBundleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_diy_bundle, viewGroup, z, obj);
        int i3 = component3 + 47;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            return itemDiyBundleBinding;
        }
        throw null;
    }

    public static ItemDiyBundleBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 59;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemDiyBundleBinding itemDiyBundleBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 39;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return itemDiyBundleBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ItemDiyBundleBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemDiyBundleBinding itemDiyBundleBinding = (ItemDiyBundleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_diy_bundle, null, false, obj);
        int i4 = copydefault + 35;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemDiyBundleBinding;
    }

    public static ItemDiyBundleBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 91;
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
    public static ItemDiyBundleBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 61;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.item_diy_bundle);
        if (i3 != 0) {
            return (ItemDiyBundleBinding) viewDataBindingBind;
        }
        int i4 = 61 / 0;
        return (ItemDiyBundleBinding) viewDataBindingBind;
    }
}
