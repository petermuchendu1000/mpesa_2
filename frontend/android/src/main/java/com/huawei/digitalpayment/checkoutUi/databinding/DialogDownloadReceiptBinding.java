package com.huawei.digitalpayment.checkoutUi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.checkoutUi.R;

public abstract class DialogDownloadReceiptBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int copydefault;
    public final RoundTextView btnCancel;
    public final LoadingButton btnCancelRequest;
    public final LoadingButton btnConfirm;
    public final RoundImageView ivBack;
    public final ImageView ivResult;
    public final RoundImageView ivTopBg;
    public final ConstraintLayout llButtons;
    public final TextView tvStatus;
    public final TextView tvTitle;

    protected DialogDownloadReceiptBinding(Object obj, View view, int i, RoundTextView roundTextView, LoadingButton loadingButton, LoadingButton loadingButton2, RoundImageView roundImageView, ImageView imageView, RoundImageView roundImageView2, ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.btnCancel = roundTextView;
        this.btnCancelRequest = loadingButton;
        this.btnConfirm = loadingButton2;
        this.ivBack = roundImageView;
        this.ivResult = imageView;
        this.ivTopBg = roundImageView2;
        this.llButtons = constraintLayout;
        this.tvStatus = textView;
        this.tvTitle = textView2;
    }

    public static DialogDownloadReceiptBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 27;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static DialogDownloadReceiptBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        DialogDownloadReceiptBinding dialogDownloadReceiptBinding = (DialogDownloadReceiptBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_download_receipt, viewGroup, z, obj);
        int i3 = component1 + 17;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            return dialogDownloadReceiptBinding;
        }
        throw null;
    }

    public static DialogDownloadReceiptBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 57;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        DialogDownloadReceiptBinding dialogDownloadReceiptBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = copydefault + 103;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return dialogDownloadReceiptBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static DialogDownloadReceiptBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component1 + 83;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.dialog_download_receipt;
            z = true;
        } else {
            i = R.layout.dialog_download_receipt;
            z = false;
        }
        DialogDownloadReceiptBinding dialogDownloadReceiptBinding = (DialogDownloadReceiptBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = copydefault + 27;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return dialogDownloadReceiptBinding;
    }

    public static DialogDownloadReceiptBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 107;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        throw null;
    }

    @Deprecated
    public static DialogDownloadReceiptBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        DialogDownloadReceiptBinding dialogDownloadReceiptBinding = (DialogDownloadReceiptBinding) bind(obj, view, R.layout.dialog_download_receipt);
        int i3 = component1 + 15;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return dialogDownloadReceiptBinding;
    }
}
