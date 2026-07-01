package com.huawei.digitalpayment.consumer.sfcqrcode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.common.widget.text.AmountDisplayView;
import com.huawei.digitalpayment.consumer.sfcqrcode.R;

public abstract class LayoutSfcDownloadQrCodeBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int copydefault;
    public final AmountDisplayView amountDisplayView;
    public final View emptyView;
    public final ImageView imageView5;
    public final RoundImageView ivHead;
    public final RoundImageView ivQr;
    public final RoundLinearLayout recivelinear;
    public final TextView tvNotes;
    public final TextView tvUseTelebirrScanToPayMe;
    public final TextView tvWill;

    protected LayoutSfcDownloadQrCodeBinding(Object obj, View view, int i, AmountDisplayView amountDisplayView, View view2, ImageView imageView, RoundImageView roundImageView, RoundImageView roundImageView2, RoundLinearLayout roundLinearLayout, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.amountDisplayView = amountDisplayView;
        this.emptyView = view2;
        this.imageView5 = imageView;
        this.ivHead = roundImageView;
        this.ivQr = roundImageView2;
        this.recivelinear = roundLinearLayout;
        this.tvNotes = textView;
        this.tvUseTelebirrScanToPayMe = textView2;
        this.tvWill = textView3;
    }

    public static LayoutSfcDownloadQrCodeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LayoutSfcDownloadQrCodeBinding layoutSfcDownloadQrCodeBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 9;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return layoutSfcDownloadQrCodeBindingInflate;
    }

    @Deprecated
    public static LayoutSfcDownloadQrCodeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 39;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        LayoutSfcDownloadQrCodeBinding layoutSfcDownloadQrCodeBinding = (LayoutSfcDownloadQrCodeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_sfc_download_qr_code, viewGroup, z, obj);
        int i4 = component2 + 51;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return layoutSfcDownloadQrCodeBinding;
        }
        throw null;
    }

    public static LayoutSfcDownloadQrCodeBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        LayoutSfcDownloadQrCodeBinding layoutSfcDownloadQrCodeBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
        return layoutSfcDownloadQrCodeBindingInflate;
    }

    @Deprecated
    public static LayoutSfcDownloadQrCodeBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 5;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        LayoutSfcDownloadQrCodeBinding layoutSfcDownloadQrCodeBinding = (LayoutSfcDownloadQrCodeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_sfc_download_qr_code, null, false, obj);
        int i4 = component2 + 3;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return layoutSfcDownloadQrCodeBinding;
    }

    public static LayoutSfcDownloadQrCodeBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 89;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        LayoutSfcDownloadQrCodeBinding layoutSfcDownloadQrCodeBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 27;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return layoutSfcDownloadQrCodeBindingBind;
    }

    @Deprecated
    public static LayoutSfcDownloadQrCodeBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        LayoutSfcDownloadQrCodeBinding layoutSfcDownloadQrCodeBinding = (LayoutSfcDownloadQrCodeBinding) bind(obj, view, R.layout.layout_sfc_download_qr_code);
        if (i3 == 0) {
            return layoutSfcDownloadQrCodeBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
