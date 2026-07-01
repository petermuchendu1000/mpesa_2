package com.huawei.digitalpayment.consumer.qrcode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.common.widget.text.AmountDisplayView;
import com.huawei.digitalpayment.consumer.qrcode.R;

public abstract class LayoutDownloadQrCodeBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    public final AmountDisplayView amountDisplayView;
    public final View emptyView;
    public final ImageView imageView5;
    public final RoundImageView ivHead;
    public final RoundImageView ivQr;
    public final RoundLinearLayout recivelinear;
    public final TextView tvNotes;
    public final TextView tvUseTelebirrScanToPayMe;
    public final TextView tvWill;

    protected LayoutDownloadQrCodeBinding(Object obj, View view, int i, AmountDisplayView amountDisplayView, View view2, ImageView imageView, RoundImageView roundImageView, RoundImageView roundImageView2, RoundLinearLayout roundLinearLayout, TextView textView, TextView textView2, TextView textView3) {
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

    public static LayoutDownloadQrCodeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        LayoutDownloadQrCodeBinding layoutDownloadQrCodeBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 65;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
        return layoutDownloadQrCodeBindingInflate;
    }

    @Deprecated
    public static LayoutDownloadQrCodeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 123;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_download_qr_code, viewGroup, z, obj);
        if (i3 != 0) {
            return (LayoutDownloadQrCodeBinding) viewDataBindingInflateInternal;
        }
        throw null;
    }

    public static LayoutDownloadQrCodeBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 115;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        throw null;
    }

    @Deprecated
    public static LayoutDownloadQrCodeBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 11;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        LayoutDownloadQrCodeBinding layoutDownloadQrCodeBinding = (LayoutDownloadQrCodeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_download_qr_code, null, false, obj);
        int i4 = component2 + 13;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return layoutDownloadQrCodeBinding;
    }

    public static LayoutDownloadQrCodeBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
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
    public static LayoutDownloadQrCodeBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 17;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.layout_download_qr_code);
        if (i3 == 0) {
            return (LayoutDownloadQrCodeBinding) viewDataBindingBind;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
