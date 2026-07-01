package com.huawei.digitalpayment.consumer.baseui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.baseui.R;

public abstract class DialogSfcCommonBottomBinding extends ViewDataBinding {
    private static int component3 = 1;
    private static int copydefault;
    public final ConstraintLayout bottomSheetHeader;
    public final ImageView ivBack;
    public final ImageView ivTopBg;
    public final TextView tvLeftButton;
    public final RoundTextView tvRightButton;
    public final TextView tvTipsContent;
    public final TextView tvTitle;

    protected DialogSfcCommonBottomBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, RoundTextView roundTextView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.bottomSheetHeader = constraintLayout;
        this.ivBack = imageView;
        this.ivTopBg = imageView2;
        this.tvLeftButton = textView;
        this.tvRightButton = roundTextView;
        this.tvTipsContent = textView2;
        this.tvTitle = textView3;
    }

    public static DialogSfcCommonBottomBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 31;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DialogSfcCommonBottomBinding dialogSfcCommonBottomBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 41;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return dialogSfcCommonBottomBindingInflate;
    }

    @Deprecated
    public static DialogSfcCommonBottomBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 45;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_sfc_common_bottom, viewGroup, z, obj);
        if (i3 == 0) {
            return (DialogSfcCommonBottomBinding) viewDataBindingInflateInternal;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static DialogSfcCommonBottomBinding inflate(LayoutInflater layoutInflater) {
        DialogSfcCommonBottomBinding dialogSfcCommonBottomBindingInflate;
        int i = 2 % 2;
        int i2 = copydefault + 87;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            dialogSfcCommonBottomBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            int i3 = 21 / 0;
        } else {
            dialogSfcCommonBottomBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        }
        int i4 = copydefault + 29;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
        return dialogSfcCommonBottomBindingInflate;
    }

    @Deprecated
    public static DialogSfcCommonBottomBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DialogSfcCommonBottomBinding dialogSfcCommonBottomBinding = (DialogSfcCommonBottomBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_sfc_common_bottom, null, false, obj);
        int i4 = component3 + 37;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
        return dialogSfcCommonBottomBinding;
    }

    public static DialogSfcCommonBottomBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 73;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DialogSfcCommonBottomBinding dialogSfcCommonBottomBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 109;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return dialogSfcCommonBottomBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static DialogSfcCommonBottomBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 19;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DialogSfcCommonBottomBinding dialogSfcCommonBottomBinding = (DialogSfcCommonBottomBinding) bind(obj, view, R.layout.dialog_sfc_common_bottom);
        if (i3 != 0) {
            return dialogSfcCommonBottomBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
