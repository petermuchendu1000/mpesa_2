package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class ItemDoMoreCardBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component2 = 1;
    public final CardView cardDoMore;
    public final ConstraintLayout csDoMore;
    public final ImageView imgIcon;
    public final TextView tvTitle;

    protected ItemDoMoreCardBinding(Object obj, View view, int i, CardView cardView, ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        super(obj, view, i);
        this.cardDoMore = cardView;
        this.csDoMore = constraintLayout;
        this.imgIcon = imageView;
        this.tvTitle = textView;
    }

    public static ItemDoMoreCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 59;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemDoMoreCardBinding itemDoMoreCardBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 63;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return itemDoMoreCardBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ItemDoMoreCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 79;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        ItemDoMoreCardBinding itemDoMoreCardBinding = (ItemDoMoreCardBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_do_more_card, viewGroup, z, obj);
        int i3 = component2 + 41;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return itemDoMoreCardBinding;
    }

    public static ItemDoMoreCardBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 3;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ItemDoMoreCardBinding itemDoMoreCardBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 13;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return itemDoMoreCardBindingInflate;
    }

    @Deprecated
    public static ItemDoMoreCardBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 35;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemDoMoreCardBinding itemDoMoreCardBinding = (ItemDoMoreCardBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_do_more_card, null, false, obj);
        int i4 = component2 + 75;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return itemDoMoreCardBinding;
    }

    public static ItemDoMoreCardBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 73;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemDoMoreCardBinding itemDoMoreCardBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 11;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
        return itemDoMoreCardBindingBind;
    }

    @Deprecated
    public static ItemDoMoreCardBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 71;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemDoMoreCardBinding itemDoMoreCardBinding = (ItemDoMoreCardBinding) bind(obj, view, R.layout.item_do_more_card);
        int i4 = component1 + 33;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return itemDoMoreCardBinding;
    }
}
