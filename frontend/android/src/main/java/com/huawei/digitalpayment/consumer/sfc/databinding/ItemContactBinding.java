package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ItemContactBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    public final CardView cardAbbr;
    public final RoundImageView ivAvatar;
    public final TextView tvAbbr;
    public final TextView tvName;

    protected ItemContactBinding(Object obj, View view, int i, CardView cardView, RoundImageView roundImageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.cardAbbr = cardView;
        this.ivAvatar = roundImageView;
        this.tvAbbr = textView;
        this.tvName = textView2;
    }

    public static ItemContactBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemContactBinding itemContactBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
        return itemContactBindingInflate;
    }

    @Deprecated
    public static ItemContactBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemContactBinding itemContactBinding = (ItemContactBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_contact, viewGroup, z, obj);
        int i4 = ShareDataUIState + 123;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return itemContactBinding;
    }

    public static ItemContactBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemContactBinding itemContactBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 115;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return itemContactBindingInflate;
    }

    @Deprecated
    public static ItemContactBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 19;
        ShareDataUIState = i2 % 128;
        return (ItemContactBinding) ViewDataBinding.inflateInternal(layoutInflater, i2 % 2 != 0 ? R.layout.item_contact : R.layout.item_contact, null, false, obj);
    }

    public static ItemContactBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemContactBinding itemContactBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 7 / 0;
        }
        return itemContactBindingBind;
    }

    @Deprecated
    public static ItemContactBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.item_contact);
        if (i3 == 0) {
            return (ItemContactBinding) viewDataBindingBind;
        }
        int i4 = 85 / 0;
        return (ItemContactBinding) viewDataBindingBind;
    }
}
