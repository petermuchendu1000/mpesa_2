package com.huawei.digitalpayment.consumer.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.login.R;

public abstract class DialogTemporaryBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    public final LoadingButton btnConfirm;
    public final ImageView ivIcon;
    public final TextView tvTips;
    public final TextView tvTitle;

    protected DialogTemporaryBinding(Object obj, View view, int i, LoadingButton loadingButton, ImageView imageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.ivIcon = imageView;
        this.tvTips = textView;
        this.tvTitle = textView2;
    }

    public static DialogTemporaryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        throw null;
    }

    @Deprecated
    public static DialogTemporaryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_temporary, viewGroup, z, obj);
        if (i3 != 0) {
            return (DialogTemporaryBinding) viewDataBindingInflateInternal;
        }
        throw null;
    }

    public static DialogTemporaryBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DialogTemporaryBinding dialogTemporaryBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 115;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return dialogTemporaryBindingInflate;
    }

    @Deprecated
    public static DialogTemporaryBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DialogTemporaryBinding dialogTemporaryBinding = (DialogTemporaryBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_temporary, null, false, obj);
        int i4 = ShareDataUIState + 31;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return dialogTemporaryBinding;
    }

    public static DialogTemporaryBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DialogTemporaryBinding dialogTemporaryBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 61;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return dialogTemporaryBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static DialogTemporaryBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DialogTemporaryBinding dialogTemporaryBinding = (DialogTemporaryBinding) bind(obj, view, R.layout.dialog_temporary);
        int i4 = copydefault + 43;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return dialogTemporaryBinding;
    }
}
