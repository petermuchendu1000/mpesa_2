package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class DialogNoSecurityBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int copydefault = 1;
    public final RoundImageView ivDelete;
    public final ImageView ivPinLocked;
    public final RoundImageView ivTopBg;
    public final RoundTextView tvPositiveButton;
    public final TextView tvTipsContent;
    public final TextView tvTitle;

    protected DialogNoSecurityBinding(Object obj, View view, int i, RoundImageView roundImageView, ImageView imageView, RoundImageView roundImageView2, RoundTextView roundTextView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.ivDelete = roundImageView;
        this.ivPinLocked = imageView;
        this.ivTopBg = roundImageView2;
        this.tvPositiveButton = roundTextView;
        this.tvTipsContent = textView;
        this.tvTitle = textView2;
    }

    public static DialogNoSecurityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DialogNoSecurityBinding dialogNoSecurityBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 63;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return dialogNoSecurityBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static DialogNoSecurityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 31;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DialogNoSecurityBinding dialogNoSecurityBinding = (DialogNoSecurityBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_no_security, viewGroup, z, obj);
        if (i3 == 0) {
            int i4 = 73 / 0;
        }
        return dialogNoSecurityBinding;
    }

    public static DialogNoSecurityBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DialogNoSecurityBinding dialogNoSecurityBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 39;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return dialogNoSecurityBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static DialogNoSecurityBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 49;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DialogNoSecurityBinding dialogNoSecurityBinding = (DialogNoSecurityBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_no_security, null, false, obj);
        int i4 = copydefault + 67;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return dialogNoSecurityBinding;
    }

    public static DialogNoSecurityBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 13;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        DialogNoSecurityBinding dialogNoSecurityBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 107;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 14 / 0;
        }
        return dialogNoSecurityBindingBind;
    }

    @Deprecated
    public static DialogNoSecurityBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DialogNoSecurityBinding dialogNoSecurityBinding = (DialogNoSecurityBinding) bind(obj, view, R.layout.dialog_no_security);
        int i4 = component1 + 79;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return dialogNoSecurityBinding;
    }
}
