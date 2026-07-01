package com.huawei.digitalpayment.consumer.sfcqrcode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfcqrcode.R;

public abstract class LayoutSfcDownloadNewQrCodeBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int component3;
    public final RoundImageView ivHead;
    public final RoundImageView ivQr;

    protected LayoutSfcDownloadNewQrCodeBinding(Object obj, View view, int i, RoundImageView roundImageView, RoundImageView roundImageView2) {
        super(obj, view, i);
        this.ivHead = roundImageView;
        this.ivQr = roundImageView2;
    }

    public static LayoutSfcDownloadNewQrCodeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 95;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        LayoutSfcDownloadNewQrCodeBinding layoutSfcDownloadNewQrCodeBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 71;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return layoutSfcDownloadNewQrCodeBindingInflate;
    }

    @Deprecated
    public static LayoutSfcDownloadNewQrCodeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 85;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        LayoutSfcDownloadNewQrCodeBinding layoutSfcDownloadNewQrCodeBinding = (LayoutSfcDownloadNewQrCodeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_sfc_download_new_qr_code, viewGroup, z, obj);
        int i4 = component2 + 49;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return layoutSfcDownloadNewQrCodeBinding;
    }

    public static LayoutSfcDownloadNewQrCodeBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 75;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        LayoutSfcDownloadNewQrCodeBinding layoutSfcDownloadNewQrCodeBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 111;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
        return layoutSfcDownloadNewQrCodeBindingInflate;
    }

    @Deprecated
    public static LayoutSfcDownloadNewQrCodeBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 67;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        LayoutSfcDownloadNewQrCodeBinding layoutSfcDownloadNewQrCodeBinding = (LayoutSfcDownloadNewQrCodeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_sfc_download_new_qr_code, null, false, obj);
        int i4 = component2 + 27;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return layoutSfcDownloadNewQrCodeBinding;
        }
        throw null;
    }

    public static LayoutSfcDownloadNewQrCodeBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 67;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        throw null;
    }

    @Deprecated
    public static LayoutSfcDownloadNewQrCodeBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 51;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        LayoutSfcDownloadNewQrCodeBinding layoutSfcDownloadNewQrCodeBinding = (LayoutSfcDownloadNewQrCodeBinding) bind(obj, view, R.layout.layout_sfc_download_new_qr_code);
        int i4 = component2 + 95;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
        return layoutSfcDownloadNewQrCodeBinding;
    }
}
