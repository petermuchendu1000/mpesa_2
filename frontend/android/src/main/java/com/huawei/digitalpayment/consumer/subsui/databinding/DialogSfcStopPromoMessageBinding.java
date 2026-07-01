package com.huawei.digitalpayment.consumer.subsui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.subsui.R;

public abstract class DialogSfcStopPromoMessageBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    public final LoadingButton btnConfirm;
    public final CardView cardDialogMessage;
    public final CommonInputView etInput;
    public final RoundImageView ivBack;
    public final ConstraintLayout llButtons;
    public final ConstraintLayout llContent;
    public final TextView tvTopTitle;

    protected DialogSfcStopPromoMessageBinding(Object obj, View view, int i, LoadingButton loadingButton, CardView cardView, CommonInputView commonInputView, RoundImageView roundImageView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.cardDialogMessage = cardView;
        this.etInput = commonInputView;
        this.ivBack = roundImageView;
        this.llButtons = constraintLayout;
        this.llContent = constraintLayout2;
        this.tvTopTitle = textView;
    }

    public static DialogSfcStopPromoMessageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 93;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DialogSfcStopPromoMessageBinding dialogSfcStopPromoMessageBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 39;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return dialogSfcStopPromoMessageBindingInflate;
    }

    @Deprecated
    public static DialogSfcStopPromoMessageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 65;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DialogSfcStopPromoMessageBinding dialogSfcStopPromoMessageBinding = (DialogSfcStopPromoMessageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_sfc_stop_promo_message, viewGroup, z, obj);
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        return dialogSfcStopPromoMessageBinding;
    }

    public static DialogSfcStopPromoMessageBinding inflate(LayoutInflater layoutInflater) {
        DialogSfcStopPromoMessageBinding dialogSfcStopPromoMessageBindingInflate;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            dialogSfcStopPromoMessageBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            int i3 = 91 / 0;
        } else {
            dialogSfcStopPromoMessageBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        }
        int i4 = ShareDataUIState + 63;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return dialogSfcStopPromoMessageBindingInflate;
    }

    @Deprecated
    public static DialogSfcStopPromoMessageBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 7;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DialogSfcStopPromoMessageBinding dialogSfcStopPromoMessageBinding = (DialogSfcStopPromoMessageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_sfc_stop_promo_message, null, false, obj);
        int i4 = component3 + 33;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return dialogSfcStopPromoMessageBinding;
    }

    public static DialogSfcStopPromoMessageBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DialogSfcStopPromoMessageBinding dialogSfcStopPromoMessageBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 25;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return dialogSfcStopPromoMessageBindingBind;
    }

    @Deprecated
    public static DialogSfcStopPromoMessageBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 9;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DialogSfcStopPromoMessageBinding dialogSfcStopPromoMessageBinding = (DialogSfcStopPromoMessageBinding) bind(obj, view, R.layout.dialog_sfc_stop_promo_message);
        int i4 = ShareDataUIState + 91;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return dialogSfcStopPromoMessageBinding;
    }
}
