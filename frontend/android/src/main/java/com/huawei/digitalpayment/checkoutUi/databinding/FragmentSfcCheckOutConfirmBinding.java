package com.huawei.digitalpayment.checkoutUi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.checkoutUi.R;

public abstract class FragmentSfcCheckOutConfirmBinding extends ViewDataBinding {
    private static int component3 = 0;
    private static int copydefault = 1;
    public final MaterialButton btnConfirm;
    public final CardView cardAbbr;
    public final RoundImageView ivAvatar;
    public final RoundImageView ivBack;
    public final View ivGuideline;
    public final CardView rlContainer;
    public final RecyclerView rvConfirm;
    public final ComposeView scanToPayMessage;
    public final RoundTextView tvAbbr;
    public final TextView tvTitle;
    public final TextView tvTopTitle;
    public final View viewDivider;

    protected FragmentSfcCheckOutConfirmBinding(Object obj, View view, int i, MaterialButton materialButton, CardView cardView, RoundImageView roundImageView, RoundImageView roundImageView2, View view2, CardView cardView2, RecyclerView recyclerView, ComposeView composeView, RoundTextView roundTextView, TextView textView, TextView textView2, View view3) {
        super(obj, view, i);
        this.btnConfirm = materialButton;
        this.cardAbbr = cardView;
        this.ivAvatar = roundImageView;
        this.ivBack = roundImageView2;
        this.ivGuideline = view2;
        this.rlContainer = cardView2;
        this.rvConfirm = recyclerView;
        this.scanToPayMessage = composeView;
        this.tvAbbr = roundTextView;
        this.tvTitle = textView;
        this.tvTopTitle = textView2;
        this.viewDivider = view3;
    }

    public static FragmentSfcCheckOutConfirmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcCheckOutConfirmBinding fragmentSfcCheckOutConfirmBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 53;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return fragmentSfcCheckOutConfirmBindingInflate;
    }

    @Deprecated
    public static FragmentSfcCheckOutConfirmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 49;
        copydefault = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        FragmentSfcCheckOutConfirmBinding fragmentSfcCheckOutConfirmBinding = (FragmentSfcCheckOutConfirmBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_sfc_check_out_confirm, viewGroup, z, obj);
        int i3 = copydefault + 101;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return fragmentSfcCheckOutConfirmBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static FragmentSfcCheckOutConfirmBinding inflate(LayoutInflater layoutInflater) {
        FragmentSfcCheckOutConfirmBinding fragmentSfcCheckOutConfirmBindingInflate;
        int i = 2 % 2;
        int i2 = copydefault + 13;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            fragmentSfcCheckOutConfirmBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            int i3 = 88 / 0;
        } else {
            fragmentSfcCheckOutConfirmBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component3 + 107;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return fragmentSfcCheckOutConfirmBindingInflate;
    }

    @Deprecated
    public static FragmentSfcCheckOutConfirmBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return (FragmentSfcCheckOutConfirmBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_sfc_check_out_confirm, null, false, obj);
    }

    public static FragmentSfcCheckOutConfirmBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 111;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        FragmentSfcCheckOutConfirmBinding fragmentSfcCheckOutConfirmBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component3 + 109;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return fragmentSfcCheckOutConfirmBindingBind;
    }

    @Deprecated
    public static FragmentSfcCheckOutConfirmBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 51;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        FragmentSfcCheckOutConfirmBinding fragmentSfcCheckOutConfirmBinding = (FragmentSfcCheckOutConfirmBinding) bind(obj, view, R.layout.fragment_sfc_check_out_confirm);
        int i3 = component3 + 5;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 2 / 0;
        }
        return fragmentSfcCheckOutConfirmBinding;
    }
}
