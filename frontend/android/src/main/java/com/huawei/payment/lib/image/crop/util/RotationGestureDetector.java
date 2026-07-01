package com.huawei.payment.lib.image.crop.util;

import android.view.MotionEvent;

public class RotationGestureDetector {
    private static final int copydefault = -1;
    private float ShareDataUIState;
    private boolean component1;
    private float component2;
    private float component3;
    private float component4;
    private float equals;
    private final OnRotationGestureListener getRequestBeneficiariesState;
    private int getAsAtTimestamp = -1;
    private int copy = -1;

    public interface OnRotationGestureListener {
        void onRotation(RotationGestureDetector rotationGestureDetector);
    }

    public static class SimpleOnRotationGestureListener implements OnRotationGestureListener {
        @Override
        public void onRotation(RotationGestureDetector rotationGestureDetector) {
        }
    }

    public RotationGestureDetector(OnRotationGestureListener onRotationGestureListener) {
        this.getRequestBeneficiariesState = onRotationGestureListener;
    }

    public float getAngle() {
        return this.ShareDataUIState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.equals = motionEvent.getX();
            this.component4 = motionEvent.getY();
            this.getAsAtTimestamp = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
            this.ShareDataUIState = 0.0f;
            this.component1 = true;
        } else if (actionMasked == 1) {
            this.getAsAtTimestamp = -1;
        } else if (actionMasked != 2) {
            if (actionMasked == 5) {
                this.component3 = motionEvent.getX();
                this.component2 = motionEvent.getY();
                this.copy = motionEvent.findPointerIndex(motionEvent.getPointerId(motionEvent.getActionIndex()));
                this.ShareDataUIState = 0.0f;
                this.component1 = true;
            } else if (actionMasked == 6) {
                this.copy = -1;
            }
        } else if (this.getAsAtTimestamp != -1 && this.copy != -1 && motionEvent.getPointerCount() > this.copy) {
            float x = motionEvent.getX(this.getAsAtTimestamp);
            float y = motionEvent.getY(this.getAsAtTimestamp);
            float x2 = motionEvent.getX(this.copy);
            float y2 = motionEvent.getY(this.copy);
            if (this.component1) {
                this.ShareDataUIState = 0.0f;
                this.component1 = false;
            } else {
                component2(this.component3, this.component2, this.equals, this.component4, x2, y2, x, y);
            }
            OnRotationGestureListener onRotationGestureListener = this.getRequestBeneficiariesState;
            if (onRotationGestureListener != null) {
                onRotationGestureListener.onRotation(this);
            }
            this.component3 = x2;
            this.component2 = y2;
            this.equals = x;
            this.component4 = y;
        }
        return true;
    }

    private float component2(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return component2((float) Math.toDegrees((float) Math.atan2(f2 - f4, f - f3)), (float) Math.toDegrees((float) Math.atan2(f6 - f8, f5 - f7)));
    }

    private float component2(float f, float f2) {
        float f3 = (f2 % 360.0f) - (f % 360.0f);
        this.ShareDataUIState = f3;
        if (f3 < -180.0f) {
            this.ShareDataUIState = f3 + 360.0f;
        } else if (f3 > 180.0f) {
            this.ShareDataUIState = f3 - 360.0f;
        }
        return this.ShareDataUIState;
    }
}
