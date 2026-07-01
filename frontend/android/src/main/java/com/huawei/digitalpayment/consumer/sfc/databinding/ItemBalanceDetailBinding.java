package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.base.resp.BalanceDetails;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ItemBalanceDetailBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    public final ConstraintLayout csAmountLabel;
    public final ConstraintLayout csExpiryLabel;

    @Bindable
    protected BalanceDetails mBalanceDetails;
    public final TextView tvAmountLabel;
    public final TextView tvAmountValue;
    public final TextView tvExpiryLabel;
    public final TextView tvExpiryValue;
    public final View vLine1;

    public abstract void setBalanceDetails(BalanceDetails balanceDetails);

    protected ItemBalanceDetailBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view2) {
        super(obj, view, i);
        this.csAmountLabel = constraintLayout;
        this.csExpiryLabel = constraintLayout2;
        this.tvAmountLabel = textView;
        this.tvAmountValue = textView2;
        this.tvExpiryLabel = textView3;
        this.tvExpiryValue = textView4;
        this.vLine1 = view2;
    }

    public BalanceDetails getBalanceDetails() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.mBalanceDetails;
        }
        throw null;
    }

    public static ItemBalanceDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 75;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        ItemBalanceDetailBinding itemBalanceDetailBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = ShareDataUIState + 55;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            return itemBalanceDetailBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ItemBalanceDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemBalanceDetailBinding itemBalanceDetailBinding = (ItemBalanceDetailBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_balance_detail, viewGroup, z, obj);
        int i4 = component3 + 33;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return itemBalanceDetailBinding;
    }

    public static ItemBalanceDetailBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 69;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ItemBalanceDetailBinding itemBalanceDetailBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = ShareDataUIState + 3;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return itemBalanceDetailBindingInflate;
    }

    @Deprecated
    public static ItemBalanceDetailBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 3;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.item_balance_detail;
            z = true;
        } else {
            i = R.layout.item_balance_detail;
            z = false;
        }
        ItemBalanceDetailBinding itemBalanceDetailBinding = (ItemBalanceDetailBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = ShareDataUIState + 45;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemBalanceDetailBinding;
    }

    public static ItemBalanceDetailBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 117;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ItemBalanceDetailBinding itemBalanceDetailBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component3 + 71;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            return itemBalanceDetailBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static ItemBalanceDetailBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 77;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemBalanceDetailBinding itemBalanceDetailBinding = (ItemBalanceDetailBinding) bind(obj, view, R.layout.item_balance_detail);
        int i4 = ShareDataUIState + 29;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemBalanceDetailBinding;
    }
}
