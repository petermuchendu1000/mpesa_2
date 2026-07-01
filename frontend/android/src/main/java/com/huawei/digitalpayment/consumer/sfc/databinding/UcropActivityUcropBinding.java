package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.payment.lib.image.crop.view.CropView;

public final class UcropActivityUcropBinding implements ViewBinding {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    public final LinearLayout controlsWrapper;
    private final RelativeLayout copydefault;
    public final ImageView imageViewLogo;
    public final RoundImageView ivBack;
    public final ImageButton stateAspectRatio;
    public final RelativeLayout toolbar;
    public final TextView tvEndButton;
    public final TextView tvTitle;
    public final CropView ucrop;
    public final FrameLayout ucropFrame;
    public final RelativeLayout ucropPhotobox;
    public final ImageButton wrapperResetRotate;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return getRoot();
        }
        getRoot();
        throw null;
    }

    private UcropActivityUcropBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, ImageView imageView, RoundImageView roundImageView, ImageButton imageButton, RelativeLayout relativeLayout2, TextView textView, TextView textView2, CropView cropView, FrameLayout frameLayout, RelativeLayout relativeLayout3, ImageButton imageButton2) {
        this.copydefault = relativeLayout;
        this.controlsWrapper = linearLayout;
        this.imageViewLogo = imageView;
        this.ivBack = roundImageView;
        this.stateAspectRatio = imageButton;
        this.toolbar = relativeLayout2;
        this.tvEndButton = textView;
        this.tvTitle = textView2;
        this.ucrop = cropView;
        this.ucropFrame = frameLayout;
        this.ucropPhotobox = relativeLayout3;
        this.wrapperResetRotate = imageButton2;
    }

    @Override
    public RelativeLayout getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static UcropActivityUcropBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        component3 = i2 % 128;
        return inflate(layoutInflater, null, i2 % 2 == 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r3
  0x0021: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001f, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.UcropActivityUcropBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.UcropActivityUcropBinding.ShareDataUIState
            int r1 = r1 + 63
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.UcropActivityUcropBinding.component3 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.ucrop_activity_ucrop
            r2 = 1
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2d
            goto L21
        L18:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.ucrop_activity_ucrop
            r2 = 0
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2d
        L21:
            int r5 = com.huawei.digitalpayment.consumer.sfc.databinding.UcropActivityUcropBinding.component3
            int r5 = r5 + 57
            int r1 = r5 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.UcropActivityUcropBinding.ShareDataUIState = r1
            int r5 = r5 % r0
            r4.addView(r3)
        L2d:
            com.huawei.digitalpayment.consumer.sfc.databinding.UcropActivityUcropBinding r3 = bind(r3)
            int r4 = com.huawei.digitalpayment.consumer.sfc.databinding.UcropActivityUcropBinding.component3
            int r4 = r4 + 121
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.UcropActivityUcropBinding.ShareDataUIState = r5
            int r4 = r4 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.UcropActivityUcropBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfc.databinding.UcropActivityUcropBinding");
    }

    public static UcropActivityUcropBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.controls_wrapper;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i2);
        if (linearLayout != null) {
            int i3 = ShareDataUIState + 65;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            i2 = R.id.image_view_logo;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i2);
            if (imageView != null) {
                i2 = R.id.ivBack;
                RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(view, i2);
                if (roundImageView != null) {
                    i2 = R.id.state_aspect_ratio;
                    ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i2);
                    if (imageButton != null) {
                        i2 = R.id.toolbar;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i2);
                        if (relativeLayout != null) {
                            i2 = R.id.tvEndButton;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
                            if (textView != null) {
                                int i5 = component3 + 53;
                                ShareDataUIState = i5 % 128;
                                int i6 = i5 % 2;
                                i2 = R.id.tvTitle;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i2);
                                if (textView2 != null) {
                                    int i7 = component3 + 119;
                                    ShareDataUIState = i7 % 128;
                                    int i8 = i7 % 2;
                                    i2 = R.id.ucrop;
                                    CropView cropView = (CropView) ViewBindings.findChildViewById(view, i2);
                                    if (cropView != null) {
                                        int i9 = ShareDataUIState + 85;
                                        component3 = i9 % 128;
                                        if (i9 % 2 == 0) {
                                            throw null;
                                        }
                                        i2 = R.id.ucrop_frame;
                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i2);
                                        if (frameLayout != null) {
                                            RelativeLayout relativeLayout2 = (RelativeLayout) view;
                                            i2 = R.id.wrapper_reset_rotate;
                                            ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(view, i2);
                                            if (imageButton2 != null) {
                                                UcropActivityUcropBinding ucropActivityUcropBinding = new UcropActivityUcropBinding(relativeLayout2, linearLayout, imageView, roundImageView, imageButton, relativeLayout, textView, textView2, cropView, frameLayout, relativeLayout2, imageButton2);
                                                int i10 = ShareDataUIState + 77;
                                                component3 = i10 % 128;
                                                if (i10 % 2 != 0) {
                                                    return ucropActivityUcropBinding;
                                                }
                                                throw null;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
