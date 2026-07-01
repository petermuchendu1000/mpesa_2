package com.huawei.digitalpayment.consumer.qrcode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.qrcode.R;

public final class LayoutQrCodeBigBinding implements ViewBinding {
    private static int component1 = 0;
    private static int copydefault = 1;
    private final LinearLayout ShareDataUIState;
    public final ImageView ivQrCodeBig;
    public final LinearLayout llContent;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 103;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout root = getRoot();
        int i4 = component1 + 39;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private LayoutQrCodeBigBinding(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2) {
        this.ShareDataUIState = linearLayout;
        this.ivQrCodeBig = imageView;
        this.llContent = linearLayout2;
    }

    @Override
    public LinearLayout getRoot() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 109;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        LinearLayout linearLayout = this.ShareDataUIState;
        int i5 = i2 + 69;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return linearLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static LayoutQrCodeBigBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        LayoutQrCodeBigBinding layoutQrCodeBigBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component1 + 71;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return layoutQrCodeBigBindingInflate;
    }

    public static LayoutQrCodeBigBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.layout_qr_code_big, viewGroup, false);
        if (z) {
            int i2 = copydefault + 37;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                viewGroup.addView(viewInflate);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            viewGroup.addView(viewInflate);
            int i3 = copydefault + 117;
            component1 = i3 % 128;
            int i4 = i3 % 2;
        }
        return bind(viewInflate);
    }

    public static LayoutQrCodeBigBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 65;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.iv_qr_code_big;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i4);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            LayoutQrCodeBigBinding layoutQrCodeBigBinding = new LayoutQrCodeBigBinding(linearLayout, imageView, linearLayout);
            int i5 = component1 + 11;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return layoutQrCodeBigBinding;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
