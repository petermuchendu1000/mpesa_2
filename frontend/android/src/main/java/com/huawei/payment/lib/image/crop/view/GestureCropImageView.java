package com.huawei.payment.lib.image.crop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.huawei.payment.lib.image.crop.util.RotationGestureDetector;

public class GestureCropImageView extends CropImageView {
    private static final int DOUBLE_TAP_ZOOM_DURATION = 200;
    private int doubleTapScaleSteps;
    private GestureDetector gestureDetector;
    private boolean isGestureEnabled;
    private boolean isRotateEnabled;
    private boolean isScaleEnabled;
    private float midPntX;
    private float midPntY;
    private RotationGestureDetector rotateDetector;
    private ScaleGestureDetector scaleDetector;

    public GestureCropImageView(Context context) {
        this(context, null);
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isRotateEnabled = true;
        this.isScaleEnabled = true;
        this.isGestureEnabled = true;
        this.doubleTapScaleSteps = 5;
        setupGestureListener();
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean isScaleEnabled() {
        return this.isScaleEnabled;
    }

    public void setScaleEnabled(boolean z) {
        this.isScaleEnabled = z;
    }

    public boolean isRotateEnabled() {
        return this.isRotateEnabled;
    }

    public void setRotateEnabled(boolean z) {
        this.isRotateEnabled = z;
    }

    public boolean isGestureEnabled() {
        return this.isGestureEnabled;
    }

    public void setGestureEnabled(boolean z) {
        this.isGestureEnabled = z;
    }

    public int getDoubleTapScaleSteps() {
        return this.doubleTapScaleSteps;
    }

    public void setDoubleTapScaleSteps(int i) {
        this.doubleTapScaleSteps = i;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getAction() & 255) == 0) {
            cancelAllAnimations();
        }
        if (motionEvent.getPointerCount() > 1) {
            this.midPntX = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
            this.midPntY = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
        }
        if (this.isGestureEnabled) {
            this.gestureDetector.onTouchEvent(motionEvent);
        }
        if (this.isScaleEnabled) {
            this.scaleDetector.onTouchEvent(motionEvent);
        }
        if (this.isRotateEnabled) {
            this.rotateDetector.onTouchEvent(motionEvent);
        }
        if ((motionEvent.getAction() & 255) == 1) {
            setImageToWrapCropBound();
        }
        return true;
    }

    protected float getDoubleTapTargetScale() {
        return getCurrentScale() * ((float) Math.pow(getMaxScale() / getMinScale(), 1.0f / this.doubleTapScaleSteps));
    }

    private void setupGestureListener() {
        this.gestureDetector = new GestureDetector(getContext(), new component2(), null, true);
        this.scaleDetector = new ScaleGestureDetector(getContext(), new component3());
        this.rotateDetector = new RotationGestureDetector(new component1());
    }

    class component3 extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private component3() {
        }

        @Override
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            GestureCropImageView.this.postScale(scaleGestureDetector.getScaleFactor(), GestureCropImageView.this.midPntX, GestureCropImageView.this.midPntY);
            return true;
        }
    }

    class component1 extends RotationGestureDetector.SimpleOnRotationGestureListener {
        private component1() {
        }

        @Override
        public void onRotation(RotationGestureDetector rotationGestureDetector) {
            GestureCropImageView.this.postRotate(rotationGestureDetector.getAngle(), GestureCropImageView.this.midPntX, GestureCropImageView.this.midPntY);
        }
    }

    class component2 extends GestureDetector.SimpleOnGestureListener {
        private component2() {
        }

        @Override
        public boolean onDoubleTap(MotionEvent motionEvent) {
            GestureCropImageView gestureCropImageView = GestureCropImageView.this;
            gestureCropImageView.zoomImageToPosition(gestureCropImageView.getDoubleTapTargetScale(), motionEvent.getX(), motionEvent.getY(), 200L);
            return super.onDoubleTap(motionEvent);
        }

        @Override
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            GestureCropImageView.this.postTranslate(-f, -f2);
            return true;
        }
    }
}
