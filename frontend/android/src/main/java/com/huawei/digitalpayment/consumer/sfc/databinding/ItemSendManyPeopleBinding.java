package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ItemSendManyPeopleBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component3 = 1;
    public final CardView cardAbbr;
    public final RoundImageView ivAvatar;
    public final ImageView ivRemove;
    public final TextView tvAbbr;
    public final TextView tvName;

    protected ItemSendManyPeopleBinding(Object obj, View view, int i, CardView cardView, RoundImageView roundImageView, ImageView imageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.cardAbbr = cardView;
        this.ivAvatar = roundImageView;
        this.ivRemove = imageView;
        this.tvAbbr = textView;
        this.tvName = textView2;
    }

    public static ItemSendManyPeopleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 59;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemSendManyPeopleBinding itemSendManyPeopleBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 85 / 0;
        }
        return itemSendManyPeopleBindingInflate;
    }

    @Deprecated
    public static ItemSendManyPeopleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 3;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        ItemSendManyPeopleBinding itemSendManyPeopleBinding = (ItemSendManyPeopleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_send_many_people, viewGroup, z, obj);
        int i3 = component1 + 91;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return itemSendManyPeopleBinding;
    }

    public static ItemSendManyPeopleBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 67;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemSendManyPeopleBinding itemSendManyPeopleBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 29;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
        return itemSendManyPeopleBindingInflate;
    }

    @Deprecated
    public static ItemSendManyPeopleBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 109;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        ItemSendManyPeopleBinding itemSendManyPeopleBinding = (ItemSendManyPeopleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_send_many_people, null, false, obj);
        int i4 = component3 + 119;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return itemSendManyPeopleBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ItemSendManyPeopleBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 55;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemSendManyPeopleBinding itemSendManyPeopleBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 42 / 0;
        }
        return itemSendManyPeopleBindingBind;
    }

    @Deprecated
    public static ItemSendManyPeopleBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 19;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ItemSendManyPeopleBinding itemSendManyPeopleBinding = (ItemSendManyPeopleBinding) bind(obj, view, R.layout.item_send_many_people);
        int i3 = component3 + 3;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return itemSendManyPeopleBinding;
    }
}
