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
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.subsui.R;

public abstract class ItemPromoMessagesBinding extends ViewDataBinding {
    private static int component2 = 0;
    private static int copydefault = 1;
    public final CardView cvRoot;
    public final ImageView ivBundle;
    public final LinearLayout llContainer;
    public final RoundTextView tvBuy;
    public final TextView tvTitle;

    protected ItemPromoMessagesBinding(Object obj, View view, int i, CardView cardView, ImageView imageView, LinearLayout linearLayout, RoundTextView roundTextView, TextView textView) {
        super(obj, view, i);
        this.cvRoot = cardView;
        this.ivBundle = imageView;
        this.llContainer = linearLayout;
        this.tvBuy = roundTextView;
        this.tvTitle = textView;
    }

    public static ItemPromoMessagesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 47;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemPromoMessagesBinding itemPromoMessagesBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 85;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return itemPromoMessagesBindingInflate;
    }

    @Deprecated
    public static ItemPromoMessagesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        component2 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        ItemPromoMessagesBinding itemPromoMessagesBinding = (ItemPromoMessagesBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_promo_messages, viewGroup, z, obj);
        int i3 = copydefault + 61;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return itemPromoMessagesBinding;
        }
        throw null;
    }

    public static ItemPromoMessagesBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ItemPromoMessagesBinding itemPromoMessagesBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = copydefault + 89;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return itemPromoMessagesBindingInflate;
    }

    @Deprecated
    public static ItemPromoMessagesBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemPromoMessagesBinding itemPromoMessagesBinding = (ItemPromoMessagesBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_promo_messages, null, false, obj);
        int i4 = copydefault + 49;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
        return itemPromoMessagesBinding;
    }

    public static ItemPromoMessagesBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemPromoMessagesBinding itemPromoMessagesBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 101;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return itemPromoMessagesBindingBind;
    }

    @Deprecated
    public static ItemPromoMessagesBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 121;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemPromoMessagesBinding itemPromoMessagesBinding = (ItemPromoMessagesBinding) bind(obj, view, R.layout.item_promo_messages);
        if (i3 != 0) {
            return itemPromoMessagesBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
