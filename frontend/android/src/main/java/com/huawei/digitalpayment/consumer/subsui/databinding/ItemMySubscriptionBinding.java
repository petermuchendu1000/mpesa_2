package com.huawei.digitalpayment.consumer.subsui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.subsui.R;

public abstract class ItemMySubscriptionBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    public final CardView cvRoot;
    public final ImageView ivBundle;
    public final LinearLayout llContainer;
    public final ImageView tvBuy;
    public final TextView tvDesc;
    public final TextView tvTitle;

    protected ItemMySubscriptionBinding(Object obj, View view, int i, CardView cardView, ImageView imageView, LinearLayout linearLayout, ImageView imageView2, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.cvRoot = cardView;
        this.ivBundle = imageView;
        this.llContainer = linearLayout;
        this.tvBuy = imageView2;
        this.tvDesc = textView;
        this.tvTitle = textView2;
    }

    public static ItemMySubscriptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 53;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ItemMySubscriptionBinding itemMySubscriptionBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = ShareDataUIState + 57;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return itemMySubscriptionBindingInflate;
    }

    @Deprecated
    public static ItemMySubscriptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 91;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemMySubscriptionBinding itemMySubscriptionBinding = (ItemMySubscriptionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_my_subscription, viewGroup, z, obj);
        int i4 = ShareDataUIState + 103;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return itemMySubscriptionBinding;
        }
        throw null;
    }

    public static ItemMySubscriptionBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 7;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        ItemMySubscriptionBinding itemMySubscriptionBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = ShareDataUIState + 99;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            return itemMySubscriptionBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ItemMySubscriptionBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemMySubscriptionBinding itemMySubscriptionBinding = (ItemMySubscriptionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_my_subscription, null, false, obj);
        int i4 = ShareDataUIState + 75;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return itemMySubscriptionBinding;
    }

    public static ItemMySubscriptionBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemMySubscriptionBinding itemMySubscriptionBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 69;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return itemMySubscriptionBindingBind;
    }

    @Deprecated
    public static ItemMySubscriptionBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 77;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemMySubscriptionBinding itemMySubscriptionBinding = (ItemMySubscriptionBinding) bind(obj, view, R.layout.item_my_subscription);
        int i4 = component2 + 15;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return itemMySubscriptionBinding;
    }
}
