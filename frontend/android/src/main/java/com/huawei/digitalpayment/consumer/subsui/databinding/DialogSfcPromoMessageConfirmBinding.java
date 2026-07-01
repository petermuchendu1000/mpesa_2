package com.huawei.digitalpayment.consumer.subsui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.subsui.R;

public abstract class DialogSfcPromoMessageConfirmBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component2 = 1;
    public final RoundTextView btnCancel;
    public final RoundTextView btnConfirm;
    public final CardView cardDialogMessage;
    public final RoundImageView ivBack;
    public final ConstraintLayout llButtons;
    public final ConstraintLayout llContent;
    public final TextView tvDialogMessage;
    public final TextView tvTopTitle;

    protected DialogSfcPromoMessageConfirmBinding(Object obj, View view, int i, RoundTextView roundTextView, RoundTextView roundTextView2, CardView cardView, RoundImageView roundImageView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.btnCancel = roundTextView;
        this.btnConfirm = roundTextView2;
        this.cardDialogMessage = cardView;
        this.ivBack = roundImageView;
        this.llButtons = constraintLayout;
        this.llContent = constraintLayout2;
        this.tvDialogMessage = textView;
        this.tvTopTitle = textView2;
    }

    public static DialogSfcPromoMessageConfirmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 97;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DialogSfcPromoMessageConfirmBinding dialogSfcPromoMessageConfirmBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 23;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return dialogSfcPromoMessageConfirmBindingInflate;
    }

    @Deprecated
    public static DialogSfcPromoMessageConfirmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 15;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        DialogSfcPromoMessageConfirmBinding dialogSfcPromoMessageConfirmBinding = (DialogSfcPromoMessageConfirmBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_sfc_promo_message_confirm, viewGroup, z, obj);
        int i3 = component2 + 55;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return dialogSfcPromoMessageConfirmBinding;
    }

    public static DialogSfcPromoMessageConfirmBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 67;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DialogSfcPromoMessageConfirmBinding dialogSfcPromoMessageConfirmBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 81;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
        return dialogSfcPromoMessageConfirmBindingInflate;
    }

    @Deprecated
    public static DialogSfcPromoMessageConfirmBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 121;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        DialogSfcPromoMessageConfirmBinding dialogSfcPromoMessageConfirmBinding = (DialogSfcPromoMessageConfirmBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_sfc_promo_message_confirm, null, false, obj);
        int i4 = component2 + 125;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return dialogSfcPromoMessageConfirmBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static DialogSfcPromoMessageConfirmBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 107;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DialogSfcPromoMessageConfirmBinding dialogSfcPromoMessageConfirmBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 23;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return dialogSfcPromoMessageConfirmBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static DialogSfcPromoMessageConfirmBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 99;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DialogSfcPromoMessageConfirmBinding dialogSfcPromoMessageConfirmBinding = (DialogSfcPromoMessageConfirmBinding) bind(obj, view, R.layout.dialog_sfc_promo_message_confirm);
        int i4 = component2 + 63;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return dialogSfcPromoMessageConfirmBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
