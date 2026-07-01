package com.huawei.digitalpayment.checkoutUi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.checkoutUi.R;

public abstract class ItemCheckOutSendManyPeopleBinding extends ViewDataBinding {
    private static int component2 = 0;
    private static int component3 = 1;
    public final CardView cardAbbr;
    public final RoundImageView ivAvatar;
    public final TextView tvAbbr;
    public final TextView tvName;

    protected ItemCheckOutSendManyPeopleBinding(Object obj, View view, int i, CardView cardView, RoundImageView roundImageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.cardAbbr = cardView;
        this.ivAvatar = roundImageView;
        this.tvAbbr = textView;
        this.tvName = textView2;
    }

    public static ItemCheckOutSendManyPeopleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 97;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemCheckOutSendManyPeopleBinding itemCheckOutSendManyPeopleBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 87;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemCheckOutSendManyPeopleBindingInflate;
    }

    @Deprecated
    public static ItemCheckOutSendManyPeopleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 21;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemCheckOutSendManyPeopleBinding itemCheckOutSendManyPeopleBinding = (ItemCheckOutSendManyPeopleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_check_out_send_many_people, viewGroup, z, obj);
        int i4 = component3 + 3;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return itemCheckOutSendManyPeopleBinding;
    }

    public static ItemCheckOutSendManyPeopleBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 55;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemCheckOutSendManyPeopleBinding itemCheckOutSendManyPeopleBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 67;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return itemCheckOutSendManyPeopleBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ItemCheckOutSendManyPeopleBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 75;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemCheckOutSendManyPeopleBinding itemCheckOutSendManyPeopleBinding = (ItemCheckOutSendManyPeopleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_check_out_send_many_people, null, false, obj);
        int i4 = component2 + 27;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemCheckOutSendManyPeopleBinding;
    }

    public static ItemCheckOutSendManyPeopleBinding bind(View view) {
        ItemCheckOutSendManyPeopleBinding itemCheckOutSendManyPeopleBindingBind;
        int i = 2 % 2;
        int i2 = component3 + 123;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            itemCheckOutSendManyPeopleBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
            int i3 = 72 / 0;
        } else {
            itemCheckOutSendManyPeopleBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component3 + 99;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return itemCheckOutSendManyPeopleBindingBind;
    }

    @Deprecated
    public static ItemCheckOutSendManyPeopleBinding bind(View view, Object obj) {
        ItemCheckOutSendManyPeopleBinding itemCheckOutSendManyPeopleBinding;
        int i = 2 % 2;
        int i2 = component2 + 35;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            itemCheckOutSendManyPeopleBinding = (ItemCheckOutSendManyPeopleBinding) bind(obj, view, R.layout.item_check_out_send_many_people);
            int i3 = 22 / 0;
        } else {
            itemCheckOutSendManyPeopleBinding = (ItemCheckOutSendManyPeopleBinding) bind(obj, view, R.layout.item_check_out_send_many_people);
        }
        int i4 = component2 + 99;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemCheckOutSendManyPeopleBinding;
    }
}
