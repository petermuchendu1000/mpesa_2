package com.huawei.digitalpayment.consumer.baseui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.baseui.R;

public abstract class DialogSfcPinLockedBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component3 = 1;
    public final RoundImageView ivDelete;
    public final ImageView ivPinLocked;
    public final RoundImageView ivTopBg;
    public final RoundTextView tvForgotPin;
    public final RoundTextView tvPositiveButton;
    public final TextView tvTipsContent;
    public final TextView tvTitle;

    protected DialogSfcPinLockedBinding(Object obj, View view, int i, RoundImageView roundImageView, ImageView imageView, RoundImageView roundImageView2, RoundTextView roundTextView, RoundTextView roundTextView2, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.ivDelete = roundImageView;
        this.ivPinLocked = imageView;
        this.ivTopBg = roundImageView2;
        this.tvForgotPin = roundTextView;
        this.tvPositiveButton = roundTextView2;
        this.tvTipsContent = textView;
        this.tvTitle = textView2;
    }

    public static DialogSfcPinLockedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        DialogSfcPinLockedBinding dialogSfcPinLockedBindingInflate;
        int i = 2 % 2;
        int i2 = component1 + 93;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            dialogSfcPinLockedBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            int i3 = 7 / 0;
        } else {
            dialogSfcPinLockedBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component1 + 85;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
        return dialogSfcPinLockedBindingInflate;
    }

    @Deprecated
    public static DialogSfcPinLockedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 47;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DialogSfcPinLockedBinding dialogSfcPinLockedBinding = (DialogSfcPinLockedBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_sfc_pin_locked, viewGroup, z, obj);
        int i4 = component1 + 105;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return dialogSfcPinLockedBinding;
    }

    public static DialogSfcPinLockedBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 47;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DialogSfcPinLockedBinding dialogSfcPinLockedBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 113;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return dialogSfcPinLockedBindingInflate;
    }

    @Deprecated
    public static DialogSfcPinLockedBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 67;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return (DialogSfcPinLockedBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_sfc_pin_locked, null, false, obj);
    }

    public static DialogSfcPinLockedBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 111;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        throw null;
    }

    @Deprecated
    public static DialogSfcPinLockedBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 39;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DialogSfcPinLockedBinding dialogSfcPinLockedBinding = (DialogSfcPinLockedBinding) bind(obj, view, R.layout.dialog_sfc_pin_locked);
        int i4 = component1 + 117;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return dialogSfcPinLockedBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
