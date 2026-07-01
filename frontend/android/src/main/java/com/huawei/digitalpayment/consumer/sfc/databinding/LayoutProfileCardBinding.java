package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.card.MaterialCardView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class LayoutProfileCardBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component2;
    public final CardView cardAbbr;
    public final MaterialCardView cardAccountInfo;
    public final CardView cardEditProfilePic;
    public final ConstraintLayout consNamesEmail;
    public final ConstraintLayout consPhone;
    public final ConstraintLayout consStatus;
    public final ConstraintLayout consTariff;
    public final ConstraintLayout csDetails;
    public final ConstraintLayout csProfPic;
    public final RoundImageView imgProfPic;
    public final RoundImageView ivTurnBottom;
    public final TextView tvAbbr;
    public final TextView txEmail;
    public final TextView txLabelPhoneNo;
    public final TextView txLabelStatus;
    public final TextView txLabelTariff;
    public final TextView txNames;
    public final TextView txPhoneNo;
    public final TextView txStatus;
    public final TextView txTariff;

    protected LayoutProfileCardBinding(Object obj, View view, int i, CardView cardView, MaterialCardView materialCardView, CardView cardView2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, ConstraintLayout constraintLayout5, ConstraintLayout constraintLayout6, RoundImageView roundImageView, RoundImageView roundImageView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        super(obj, view, i);
        this.cardAbbr = cardView;
        this.cardAccountInfo = materialCardView;
        this.cardEditProfilePic = cardView2;
        this.consNamesEmail = constraintLayout;
        this.consPhone = constraintLayout2;
        this.consStatus = constraintLayout3;
        this.consTariff = constraintLayout4;
        this.csDetails = constraintLayout5;
        this.csProfPic = constraintLayout6;
        this.imgProfPic = roundImageView;
        this.ivTurnBottom = roundImageView2;
        this.tvAbbr = textView;
        this.txEmail = textView2;
        this.txLabelPhoneNo = textView3;
        this.txLabelStatus = textView4;
        this.txLabelTariff = textView5;
        this.txNames = textView6;
        this.txPhoneNo = textView7;
        this.txStatus = textView8;
        this.txTariff = textView9;
    }

    public static LayoutProfileCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 37;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        LayoutProfileCardBinding layoutProfileCardBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 69;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return layoutProfileCardBindingInflate;
    }

    @Deprecated
    public static LayoutProfileCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 87;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        LayoutProfileCardBinding layoutProfileCardBinding = (LayoutProfileCardBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_profile_card, viewGroup, z, obj);
        int i4 = component1 + 69;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return layoutProfileCardBinding;
        }
        throw null;
    }

    public static LayoutProfileCardBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 85;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        LayoutProfileCardBinding layoutProfileCardBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 83;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
        return layoutProfileCardBindingInflate;
    }

    @Deprecated
    public static LayoutProfileCardBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component1 + 19;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.layout_profile_card;
            z = true;
        } else {
            i = R.layout.layout_profile_card;
            z = false;
        }
        return (LayoutProfileCardBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
    }

    public static LayoutProfileCardBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 69;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        LayoutProfileCardBinding layoutProfileCardBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 69;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return layoutProfileCardBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static LayoutProfileCardBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 67;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        LayoutProfileCardBinding layoutProfileCardBinding = (LayoutProfileCardBinding) bind(obj, view, R.layout.layout_profile_card);
        int i4 = component1 + 21;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return layoutProfileCardBinding;
    }
}
