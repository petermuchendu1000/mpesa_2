package com.huawei.payment.lib.image.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.payment.lib.image.R;
import com.huawei.payment.lib.image.crop.view.CropView;

public final class UcropFragmentUcropBinding implements ViewBinding {
    private final RelativeLayout component3;
    public final FrameLayout controlsWrapper;
    public final ImageView imageViewLogo;
    public final Toolbar toolbar;
    public final CropView ucrop;
    public final FrameLayout ucropFrame;
    public final RelativeLayout ucropPhotobox;

    private UcropFragmentUcropBinding(RelativeLayout relativeLayout, FrameLayout frameLayout, ImageView imageView, Toolbar toolbar, CropView cropView, FrameLayout frameLayout2, RelativeLayout relativeLayout2) {
        this.component3 = relativeLayout;
        this.controlsWrapper = frameLayout;
        this.imageViewLogo = imageView;
        this.toolbar = toolbar;
        this.ucrop = cropView;
        this.ucropFrame = frameLayout2;
        this.ucropPhotobox = relativeLayout2;
    }

    @Override
    public RelativeLayout getRoot() {
        return this.component3;
    }

    public static UcropFragmentUcropBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static UcropFragmentUcropBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.ucrop_fragment_ucrop, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static UcropFragmentUcropBinding bind(View view) {
        int i = R.id.controls_wrapper;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.image_view_logo;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.toolbar;
                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, i);
                if (toolbar != null) {
                    i = R.id.ucrop;
                    CropView cropView = (CropView) ViewBindings.findChildViewById(view, i);
                    if (cropView != null) {
                        i = R.id.ucrop_frame;
                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout2 != null) {
                            RelativeLayout relativeLayout = (RelativeLayout) view;
                            return new UcropFragmentUcropBinding(relativeLayout, frameLayout, imageView, toolbar, cropView, frameLayout2, relativeLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
