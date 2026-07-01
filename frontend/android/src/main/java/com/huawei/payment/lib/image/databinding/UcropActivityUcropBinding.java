package com.huawei.payment.lib.image.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.payment.lib.image.R;
import com.huawei.payment.lib.image.crop.view.CropView;

public final class UcropActivityUcropBinding implements ViewBinding {
    private final RelativeLayout component1;
    public final FrameLayout controlsWrapper;
    public final ImageView imageViewLogo;
    public final ImageView ivBack;
    public final ConstraintLayout toolbarRoot;
    public final TextView tvEndButton;
    public final TextView tvTitle;
    public final CropView ucrop;
    public final FrameLayout ucropFrame;
    public final RelativeLayout ucropPhotobox;

    private UcropActivityUcropBinding(RelativeLayout relativeLayout, FrameLayout frameLayout, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, TextView textView, TextView textView2, CropView cropView, FrameLayout frameLayout2, RelativeLayout relativeLayout2) {
        this.component1 = relativeLayout;
        this.controlsWrapper = frameLayout;
        this.imageViewLogo = imageView;
        this.ivBack = imageView2;
        this.toolbarRoot = constraintLayout;
        this.tvEndButton = textView;
        this.tvTitle = textView2;
        this.ucrop = cropView;
        this.ucropFrame = frameLayout2;
        this.ucropPhotobox = relativeLayout2;
    }

    @Override
    public RelativeLayout getRoot() {
        return this.component1;
    }

    public static UcropActivityUcropBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static UcropActivityUcropBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.ucrop_activity_ucrop, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static UcropActivityUcropBinding bind(View view) {
        int i = R.id.controls_wrapper;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.image_view_logo;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.ivBack;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = R.id.toolbarRoot;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = R.id.tvEndButton;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = R.id.tvTitle;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = R.id.ucrop;
                                CropView cropView = (CropView) ViewBindings.findChildViewById(view, i);
                                if (cropView != null) {
                                    i = R.id.ucrop_frame;
                                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                    if (frameLayout2 != null) {
                                        RelativeLayout relativeLayout = (RelativeLayout) view;
                                        return new UcropActivityUcropBinding(relativeLayout, frameLayout, imageView, imageView2, constraintLayout, textView, textView2, cropView, frameLayout2, relativeLayout);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
