package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.base.ui.widget.SfcManyAmountInputView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ItemSendManyPeopleAmountBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    public final CardView cardAbbr;
    public final SfcManyAmountInputView inputAmount;
    public final RoundImageView ivAvatar;
    public final TextView name;
    public final TextView phone;
    public final TextView tvAbbr;

    protected ItemSendManyPeopleAmountBinding(Object obj, View view, int i, CardView cardView, SfcManyAmountInputView sfcManyAmountInputView, RoundImageView roundImageView, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.cardAbbr = cardView;
        this.inputAmount = sfcManyAmountInputView;
        this.ivAvatar = roundImageView;
        this.name = textView;
        this.phone = textView2;
        this.tvAbbr = textView3;
    }

    public static ItemSendManyPeopleAmountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemSendManyPeopleAmountBinding itemSendManyPeopleAmountBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 43;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return itemSendManyPeopleAmountBindingInflate;
    }

    @Deprecated
    public static ItemSendManyPeopleAmountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemSendManyPeopleAmountBinding itemSendManyPeopleAmountBinding = (ItemSendManyPeopleAmountBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_send_many_people_amount, viewGroup, z, obj);
        if (i3 != 0) {
            int i4 = 40 / 0;
        }
        return itemSendManyPeopleAmountBinding;
    }

    public static ItemSendManyPeopleAmountBinding inflate(LayoutInflater layoutInflater) {
        ItemSendManyPeopleAmountBinding itemSendManyPeopleAmountBindingInflate;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            itemSendManyPeopleAmountBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            int i3 = 10 / 0;
        } else {
            itemSendManyPeopleAmountBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        }
        int i4 = ShareDataUIState + 45;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return itemSendManyPeopleAmountBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ItemSendManyPeopleAmountBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = copydefault + 77;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.item_send_many_people_amount;
            z = true;
        } else {
            i = R.layout.item_send_many_people_amount;
            z = false;
        }
        ItemSendManyPeopleAmountBinding itemSendManyPeopleAmountBinding = (ItemSendManyPeopleAmountBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = ShareDataUIState + 35;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return itemSendManyPeopleAmountBinding;
    }

    public static ItemSendManyPeopleAmountBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemSendManyPeopleAmountBinding itemSendManyPeopleAmountBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 123;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return itemSendManyPeopleAmountBindingBind;
    }

    @Deprecated
    public static ItemSendManyPeopleAmountBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 87;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.item_send_many_people_amount);
        if (i3 != 0) {
            return (ItemSendManyPeopleAmountBinding) viewDataBindingBind;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
