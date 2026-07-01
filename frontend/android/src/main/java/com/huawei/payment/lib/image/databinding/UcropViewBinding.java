package com.huawei.payment.lib.image.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.payment.lib.image.R;
import com.huawei.payment.lib.image.crop.view.GestureCropImageView;
import com.huawei.payment.lib.image.crop.view.OverlayView;

public final class UcropViewBinding implements ViewBinding {
    private final View copydefault;
    public final GestureCropImageView imageViewCrop;
    public final OverlayView viewOverlay;

    private UcropViewBinding(View view, GestureCropImageView gestureCropImageView, OverlayView overlayView) {
        this.copydefault = view;
        this.imageViewCrop = gestureCropImageView;
        this.viewOverlay = overlayView;
    }

    @Override
    public View getRoot() {
        return this.copydefault;
    }

    public static UcropViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.ucrop_view, viewGroup);
        return bind(viewGroup);
    }

    public static UcropViewBinding bind(View view) {
        int i = R.id.image_view_crop;
        GestureCropImageView gestureCropImageView = (GestureCropImageView) ViewBindings.findChildViewById(view, i);
        if (gestureCropImageView != null) {
            i = R.id.view_overlay;
            OverlayView overlayView = (OverlayView) ViewBindings.findChildViewById(view, i);
            if (overlayView != null) {
                return new UcropViewBinding(view, gestureCropImageView, overlayView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
