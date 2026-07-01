package com.huawei.digitalpayment.consumer.sfcqrcode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.huawei.common.widget.round.RoundTextView;

public final class ImagePreviewContainerBinding implements ViewBinding {
    private static int component1 = 1;
    private static int copydefault;
    private final ConstraintLayout ShareDataUIState;
    public final ImageView ivPreview;
    public final RoundTextView tvRetakePhoto;
    public final RoundTextView tvScan;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 19;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = copydefault + 25;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return root;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ImagePreviewContainerBinding(ConstraintLayout constraintLayout, ImageView imageView, RoundTextView roundTextView, RoundTextView roundTextView2) {
        this.ShareDataUIState = constraintLayout;
        this.ivPreview = imageView;
        this.tvRetakePhoto = roundTextView;
        this.tvScan = roundTextView2;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 65;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        ConstraintLayout constraintLayout = this.ShareDataUIState;
        int i4 = i2 + 87;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return constraintLayout;
        }
        throw null;
    }

    public static ImagePreviewContainerBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 113;
        component1 = i2 % 128;
        ImagePreviewContainerBinding imagePreviewContainerBindingInflate = inflate(layoutInflater, null, i2 % 2 == 0);
        int i3 = copydefault + 111;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return imagePreviewContainerBindingInflate;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022 A[PHI: r3
  0x0022: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v6 android.view.View) binds: [B:8:0x001f, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ImagePreviewContainerBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ImagePreviewContainerBinding.component1
            int r1 = r1 + 57
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ImagePreviewContainerBinding.copydefault = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.sfcqrcode.R.layout.image_preview_container
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L25
            goto L22
        L18:
            int r1 = com.huawei.digitalpayment.consumer.sfcqrcode.R.layout.image_preview_container
            android.view.View r3 = r3.inflate(r1, r4, r2)
            r1 = 1
            if (r5 == r1) goto L22
            goto L25
        L22:
            r4.addView(r3)
        L25:
            com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ImagePreviewContainerBinding r3 = bind(r3)
            int r4 = com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ImagePreviewContainerBinding.component1
            int r4 = r4 + 17
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ImagePreviewContainerBinding.copydefault = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L35
            return r3
        L35:
            r3 = 0
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ImagePreviewContainerBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ImagePreviewContainerBinding");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r2
  0x0027: PHI (r2v3 android.widget.ImageView) = (r2v2 android.widget.ImageView), (r2v6 android.widget.ImageView) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ImagePreviewContainerBinding bind(android.view.View r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ImagePreviewContainerBinding.component1
            int r1 = r1 + 13
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ImagePreviewContainerBinding.copydefault = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1d
            int r1 = com.huawei.digitalpayment.consumer.sfcqrcode.R.id.iv_preview
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r1)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r3 = 23
            int r3 = r3 / 0
            if (r2 == 0) goto L62
            goto L27
        L1d:
            int r1 = com.huawei.digitalpayment.consumer.sfcqrcode.R.id.iv_preview
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r1)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            if (r2 == 0) goto L62
        L27:
            int r1 = com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ImagePreviewContainerBinding.component1
            int r1 = r1 + 97
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ImagePreviewContainerBinding.copydefault = r3
            int r1 = r1 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcqrcode.R.id.tv_retake_photo
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r1)
            com.huawei.common.widget.round.RoundTextView r3 = (com.huawei.common.widget.round.RoundTextView) r3
            if (r3 == 0) goto L62
            int r1 = com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ImagePreviewContainerBinding.copydefault
            int r1 = r1 + 71
            int r4 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ImagePreviewContainerBinding.component1 = r4
            int r1 = r1 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcqrcode.R.id.tv_scan
            android.view.View r4 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r1)
            com.huawei.common.widget.round.RoundTextView r4 = (com.huawei.common.widget.round.RoundTextView) r4
            if (r4 == 0) goto L62
            com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ImagePreviewContainerBinding r1 = new com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ImagePreviewContainerBinding
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r1.<init>(r5, r2, r3, r4)
            int r5 = com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ImagePreviewContainerBinding.component1
            int r5 = r5 + 61
            int r2 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ImagePreviewContainerBinding.copydefault = r2
            int r5 = r5 % r0
            if (r5 != 0) goto L60
            return r1
        L60:
            r5 = 0
            throw r5
        L62:
            android.content.res.Resources r5 = r5.getResources()
            java.lang.String r5 = r5.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ImagePreviewContainerBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ImagePreviewContainerBinding");
    }
}
