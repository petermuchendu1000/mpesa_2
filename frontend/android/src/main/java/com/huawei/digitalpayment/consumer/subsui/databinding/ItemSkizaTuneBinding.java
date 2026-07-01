package com.huawei.digitalpayment.consumer.subsui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.subsui.R;

public abstract class ItemSkizaTuneBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int component3;
    public final CardView cvRoot;
    public final ImageView ivBundle;
    public final LinearLayout llContainer;
    public final CheckBox tvBuy;
    public final TextView tvDesc;
    public final TextView tvTitle;

    protected ItemSkizaTuneBinding(Object obj, View view, int i, CardView cardView, ImageView imageView, LinearLayout linearLayout, CheckBox checkBox, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.cvRoot = cardView;
        this.ivBundle = imageView;
        this.llContainer = linearLayout;
        this.tvBuy = checkBox;
        this.tvDesc = textView;
        this.tvTitle = textView2;
    }

    public static ItemSkizaTuneBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 57;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemSkizaTuneBinding itemSkizaTuneBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
        return itemSkizaTuneBindingInflate;
    }

    @Deprecated
    public static ItemSkizaTuneBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 93;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemSkizaTuneBinding itemSkizaTuneBinding = (ItemSkizaTuneBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_skiza_tune, viewGroup, z, obj);
        int i4 = component2 + 5;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return itemSkizaTuneBinding;
        }
        throw null;
    }

    public static ItemSkizaTuneBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 89;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemSkizaTuneBinding itemSkizaTuneBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 64 / 0;
        }
        return itemSkizaTuneBindingInflate;
    }

    @Deprecated
    public static ItemSkizaTuneBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 19;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemSkizaTuneBinding itemSkizaTuneBinding = (ItemSkizaTuneBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_skiza_tune, null, false, obj);
        int i4 = component3 + 47;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return itemSkizaTuneBinding;
        }
        throw null;
    }

    public static ItemSkizaTuneBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 19;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ItemSkizaTuneBinding itemSkizaTuneBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 25;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return itemSkizaTuneBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static ItemSkizaTuneBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 37;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemSkizaTuneBinding itemSkizaTuneBinding = (ItemSkizaTuneBinding) bind(obj, view, R.layout.item_skiza_tune);
        int i4 = component2 + 9;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemSkizaTuneBinding;
    }
}
