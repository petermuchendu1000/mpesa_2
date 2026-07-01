package com.huawei.payment.lib.image.crop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.payment.lib.image.R;
import com.huawei.payment.lib.image.crop.callback.CropBoundsChangeListener;
import com.huawei.payment.lib.image.crop.callback.OverlayViewChangeListener;
import java.util.Objects;

public class CropView extends FrameLayout {
    private GestureCropImageView gestureCropImageView;
    private final OverlayView overlayView;

    @Override
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public CropView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CropView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.ucrop_view, (ViewGroup) this, true);
        this.gestureCropImageView = (GestureCropImageView) findViewById(R.id.image_view_crop);
        OverlayView overlayView = (OverlayView) findViewById(R.id.view_overlay);
        this.overlayView = overlayView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ucrop_UCropView);
        overlayView.processStyledAttributes(typedArrayObtainStyledAttributes);
        this.gestureCropImageView.processStyledAttributes(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        setListenersToViews();
    }

    private void setListenersToViews() {
        GestureCropImageView gestureCropImageView = this.gestureCropImageView;
        final OverlayView overlayView = this.overlayView;
        Objects.requireNonNull(overlayView);
        gestureCropImageView.setCropBoundsChangeListener(new CropBoundsChangeListener() {
            @Override
            public final void onCropAspectRatioChanged(float f) {
                overlayView.setTargetAspectRatio(f);
            }
        });
        this.overlayView.setOverlayViewChangeListener(new OverlayViewChangeListener() {
            @Override
            public final void onCropRect(RectF rectF) {
                this.f$0.lambda$setListenersToViews$0(rectF);
            }
        });
    }

    public void lambda$setListenersToViews$0(RectF rectF) {
        this.gestureCropImageView.setCropRect(rectF);
    }

    public void resetCropImageView() {
        removeView(this.gestureCropImageView);
        this.gestureCropImageView = new GestureCropImageView(getContext());
        setListenersToViews();
        this.gestureCropImageView.setCropRect(getOverlayView().getCropViewRect());
        addView(this.gestureCropImageView, 0);
    }

    public GestureCropImageView getCropImageView() {
        return this.gestureCropImageView;
    }

    public OverlayView getOverlayView() {
        return this.overlayView;
    }
}
