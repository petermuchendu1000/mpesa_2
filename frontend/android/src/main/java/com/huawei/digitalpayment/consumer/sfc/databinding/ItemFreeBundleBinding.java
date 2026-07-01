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

public abstract class ItemFreeBundleBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    public final CardView cvRoot;
    public final ImageView ivBundle;
    public final LinearLayout llContainer;
    public final TextView tvBundleAmount;
    public final TextView tvBundleTitle;
    public final RoundTextView tvBuy;

    protected ItemFreeBundleBinding(Object obj, View view, int i, CardView cardView, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2, RoundTextView roundTextView) {
        super(obj, view, i);
        this.cvRoot = cardView;
        this.ivBundle = imageView;
        this.llContainer = linearLayout;
        this.tvBundleAmount = textView;
        this.tvBundleTitle = textView2;
        this.tvBuy = roundTextView;
    }

    public static ItemFreeBundleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 27;
        ShareDataUIState = i2 % 128;
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
    public static ItemFreeBundleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemFreeBundleBinding itemFreeBundleBinding = (ItemFreeBundleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_free_bundle, viewGroup, z, obj);
        int i4 = component3 + 51;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return itemFreeBundleBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ItemFreeBundleBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemFreeBundleBinding itemFreeBundleBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 33;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return itemFreeBundleBindingInflate;
    }

    @Deprecated
    public static ItemFreeBundleBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemFreeBundleBinding itemFreeBundleBinding = (ItemFreeBundleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_free_bundle, null, false, obj);
        int i4 = component3 + 97;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return itemFreeBundleBinding;
        }
        throw null;
    }

    public static ItemFreeBundleBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 115;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemFreeBundleBinding itemFreeBundleBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 15;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
        return itemFreeBundleBindingBind;
    }

    @Deprecated
    public static ItemFreeBundleBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        ItemFreeBundleBinding itemFreeBundleBinding = (ItemFreeBundleBinding) bind(obj, view, R.layout.item_free_bundle);
        int i3 = component3 + 105;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return itemFreeBundleBinding;
    }
}
