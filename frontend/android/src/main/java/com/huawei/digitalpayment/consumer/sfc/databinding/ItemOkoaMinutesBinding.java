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

public abstract class ItemOkoaMinutesBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    public final CardView cvRoot;
    public final ImageView ivBundle;
    public final LinearLayout llContainer;
    public final TextView tvBundleAmount;
    public final TextView tvBundleTitle;
    public final RoundTextView tvBuy;

    protected ItemOkoaMinutesBinding(Object obj, View view, int i, CardView cardView, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2, RoundTextView roundTextView) {
        super(obj, view, i);
        this.cvRoot = cardView;
        this.ivBundle = imageView;
        this.llContainer = linearLayout;
        this.tvBundleAmount = textView;
        this.tvBundleTitle = textView2;
        this.tvBuy = roundTextView;
    }

    public static ItemOkoaMinutesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemOkoaMinutesBinding itemOkoaMinutesBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 115;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
        return itemOkoaMinutesBindingInflate;
    }

    @Deprecated
    public static ItemOkoaMinutesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemOkoaMinutesBinding itemOkoaMinutesBinding = (ItemOkoaMinutesBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_okoa_minutes, viewGroup, z, obj);
        if (i3 != 0) {
            return itemOkoaMinutesBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ItemOkoaMinutesBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
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
    public static ItemOkoaMinutesBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 85;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemOkoaMinutesBinding itemOkoaMinutesBinding = (ItemOkoaMinutesBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_okoa_minutes, null, false, obj);
        int i4 = component1 + 5;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
        return itemOkoaMinutesBinding;
    }

    public static ItemOkoaMinutesBinding bind(View view) {
        ItemOkoaMinutesBinding itemOkoaMinutesBindingBind;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            itemOkoaMinutesBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
            int i3 = 37 / 0;
        } else {
            itemOkoaMinutesBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component1 + 51;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return itemOkoaMinutesBindingBind;
    }

    @Deprecated
    public static ItemOkoaMinutesBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemOkoaMinutesBinding itemOkoaMinutesBinding = (ItemOkoaMinutesBinding) bind(obj, view, R.layout.item_okoa_minutes);
        int i4 = ShareDataUIState + 37;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return itemOkoaMinutesBinding;
    }
}
