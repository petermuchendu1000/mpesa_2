package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class DialogDownloadStatementBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int copydefault = 1;
    public final LoadingButton btnConfirm;
    public final RoundImageView ivBack;
    public final ImageView ivResult;
    public final RoundImageView ivTopBg;
    public final RoundTextView tvLeftButton;
    public final RoundTextView tvRightButton;
    public final TextView tvTipsContent;
    public final TextView tvTitle;

    protected DialogDownloadStatementBinding(Object obj, View view, int i, LoadingButton loadingButton, RoundImageView roundImageView, ImageView imageView, RoundImageView roundImageView2, RoundTextView roundTextView, RoundTextView roundTextView2, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.ivBack = roundImageView;
        this.ivResult = imageView;
        this.ivTopBg = roundImageView2;
        this.tvLeftButton = roundTextView;
        this.tvRightButton = roundTextView2;
        this.tvTipsContent = textView;
        this.tvTitle = textView2;
    }

    public static DialogDownloadStatementBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DialogDownloadStatementBinding dialogDownloadStatementBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 67;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
        return dialogDownloadStatementBindingInflate;
    }

    @Deprecated
    public static DialogDownloadStatementBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        DialogDownloadStatementBinding dialogDownloadStatementBinding;
        int i = 2 % 2;
        int i2 = component1 + 21;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            dialogDownloadStatementBinding = (DialogDownloadStatementBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_download_statement, viewGroup, z, obj);
            int i3 = 80 / 0;
        } else {
            dialogDownloadStatementBinding = (DialogDownloadStatementBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_download_statement, viewGroup, z, obj);
        }
        int i4 = copydefault + 25;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return dialogDownloadStatementBinding;
    }

    public static DialogDownloadStatementBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DialogDownloadStatementBinding dialogDownloadStatementBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 47;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return dialogDownloadStatementBindingInflate;
    }

    @Deprecated
    public static DialogDownloadStatementBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 115;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        DialogDownloadStatementBinding dialogDownloadStatementBinding = (DialogDownloadStatementBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_download_statement, null, false, obj);
        int i4 = copydefault + 83;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return dialogDownloadStatementBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static DialogDownloadStatementBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DialogDownloadStatementBinding dialogDownloadStatementBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 49;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return dialogDownloadStatementBindingBind;
    }

    @Deprecated
    public static DialogDownloadStatementBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 15;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DialogDownloadStatementBinding dialogDownloadStatementBinding = (DialogDownloadStatementBinding) bind(obj, view, R.layout.dialog_download_statement);
        if (i3 != 0) {
            return dialogDownloadStatementBinding;
        }
        throw null;
    }
}
