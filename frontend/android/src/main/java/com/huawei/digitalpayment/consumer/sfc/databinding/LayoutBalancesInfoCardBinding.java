package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class LayoutBalancesInfoCardBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component1;
    public final CardView cardAbbr;
    public final CardView cardAccountInfo;
    public final ConstraintLayout consPhone;
    public final ConstraintLayout csProfPic;
    public final RoundImageView imgProfPic;
    public final TextView tvAbbr;
    public final TextView txPhoneNo;
    public final TextView txTariffVal;

    protected LayoutBalancesInfoCardBinding(Object obj, View view, int i, CardView cardView, CardView cardView2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RoundImageView roundImageView, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.cardAbbr = cardView;
        this.cardAccountInfo = cardView2;
        this.consPhone = constraintLayout;
        this.csProfPic = constraintLayout2;
        this.imgProfPic = roundImageView;
        this.tvAbbr = textView;
        this.txPhoneNo = textView2;
        this.txTariffVal = textView3;
    }

    public static LayoutBalancesInfoCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        LayoutBalancesInfoCardBinding layoutBalancesInfoCardBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 45;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
        return layoutBalancesInfoCardBindingInflate;
    }

    @Deprecated
    public static LayoutBalancesInfoCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 9;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_balances_info_card, viewGroup, z, obj);
        if (i3 != 0) {
            return (LayoutBalancesInfoCardBinding) viewDataBindingInflateInternal;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static LayoutBalancesInfoCardBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 99;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        LayoutBalancesInfoCardBinding layoutBalancesInfoCardBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 31;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return layoutBalancesInfoCardBindingInflate;
    }

    @Deprecated
    public static LayoutBalancesInfoCardBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 31;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        LayoutBalancesInfoCardBinding layoutBalancesInfoCardBinding = (LayoutBalancesInfoCardBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_balances_info_card, null, false, obj);
        int i4 = component1 + 7;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return layoutBalancesInfoCardBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static LayoutBalancesInfoCardBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 91;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LayoutBalancesInfoCardBinding layoutBalancesInfoCardBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = ShareDataUIState + 79;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return layoutBalancesInfoCardBindingBind;
    }

    @Deprecated
    public static LayoutBalancesInfoCardBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        LayoutBalancesInfoCardBinding layoutBalancesInfoCardBinding = (LayoutBalancesInfoCardBinding) bind(obj, view, R.layout.layout_balances_info_card);
        int i4 = ShareDataUIState + 27;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return layoutBalancesInfoCardBinding;
    }
}
