package com.huawei.digitalpayment.consumer.sfcqrcode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.sfcqrcode.R;
import com.huawei.digitalpayment.consumer.sfcqrcode.widget.AutoFitSurfaceView;

public final class FragmentSfcReceiptsBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component1;
    public final ImageView captureButton;
    private final FrameLayout component3;
    public final ImageView ivFlashlight;
    public final ImageView ivGallery;
    public final View overlay;
    public final PreviewDisplayViewBinding previewDisplayContainer;
    public final TextView tvTakePhoto;
    public final AutoFitSurfaceView viewFinder;

    @Override
    public View getRoot() {
        FrameLayout root;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            root = getRoot();
            int i3 = 11 / 0;
        } else {
            root = getRoot();
        }
        int i4 = component1 + 17;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return root;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private FragmentSfcReceiptsBinding(FrameLayout frameLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, View view, PreviewDisplayViewBinding previewDisplayViewBinding, TextView textView, AutoFitSurfaceView autoFitSurfaceView) {
        this.component3 = frameLayout;
        this.captureButton = imageView;
        this.ivFlashlight = imageView2;
        this.ivGallery = imageView3;
        this.overlay = view;
        this.previewDisplayContainer = previewDisplayViewBinding;
        this.tvTakePhoto = textView;
        this.viewFinder = autoFitSurfaceView;
    }

    @Override
    public FrameLayout getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 101;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        FrameLayout frameLayout = this.component3;
        int i4 = i3 + 99;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return frameLayout;
    }

    public static FragmentSfcReceiptsBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 7;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcReceiptsBinding fragmentSfcReceiptsBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component1 + 1;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentSfcReceiptsBindingInflate;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r3
  0x0021: PHI (r3v4 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfcqrcode.databinding.FragmentSfcReceiptsBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcqrcode.databinding.FragmentSfcReceiptsBinding.ShareDataUIState
            int r1 = r1 + 83
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcqrcode.databinding.FragmentSfcReceiptsBinding.component1 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L19
            int r1 = com.huawei.digitalpayment.consumer.sfcqrcode.R.layout.fragment_sfc_receipts
            android.view.View r3 = r3.inflate(r1, r4, r2)
            r1 = 1
            if (r5 == r1) goto L21
            goto L24
        L19:
            int r1 = com.huawei.digitalpayment.consumer.sfcqrcode.R.layout.fragment_sfc_receipts
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L24
        L21:
            r4.addView(r3)
        L24:
            com.huawei.digitalpayment.consumer.sfcqrcode.databinding.FragmentSfcReceiptsBinding r3 = bind(r3)
            int r4 = com.huawei.digitalpayment.consumer.sfcqrcode.databinding.FragmentSfcReceiptsBinding.component1
            int r4 = r4 + 81
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfcqrcode.databinding.FragmentSfcReceiptsBinding.ShareDataUIState = r5
            int r4 = r4 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcqrcode.databinding.FragmentSfcReceiptsBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfcqrcode.databinding.FragmentSfcReceiptsBinding");
    }

    public static FragmentSfcReceiptsBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 7;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = R.id.capture_button;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i3);
        if (imageView != null) {
            i3 = R.id.iv_flashlight;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i3);
            if (imageView2 != null) {
                i3 = R.id.iv_gallery;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i3);
                if (imageView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i3 = R.id.overlay))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i3 = R.id.preview_display_container))) != null) {
                    int i4 = ShareDataUIState + 117;
                    component1 = i4 % 128;
                    int i5 = i4 % 2;
                    PreviewDisplayViewBinding previewDisplayViewBindingBind = PreviewDisplayViewBinding.bind(viewFindChildViewById2);
                    i3 = R.id.tv_take_photo;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i3);
                    if (textView != null) {
                        int i6 = component1 + 13;
                        ShareDataUIState = i6 % 128;
                        if (i6 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        i3 = R.id.view_finder;
                        AutoFitSurfaceView autoFitSurfaceView = (AutoFitSurfaceView) ViewBindings.findChildViewById(view, i3);
                        if (autoFitSurfaceView != null) {
                            return new FragmentSfcReceiptsBinding((FrameLayout) view, imageView, imageView2, imageView3, viewFindChildViewById, previewDisplayViewBindingBind, textView, autoFitSurfaceView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
    }
}
