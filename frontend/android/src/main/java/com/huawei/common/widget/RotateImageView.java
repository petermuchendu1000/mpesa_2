package com.huawei.common.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.constraintlayout.motion.widget.Key;

public class RotateImageView extends ImageView {
    private static final int ANIMATOR_DURATION = 3000;
    private static final String TAG = "RotateImageView";
    private ObjectAnimator anim;

    public RotateImageView(Context context) {
        super(context);
    }

    public RotateImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RotateImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        startAnim();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        endAnim();
    }

    public void endAnim() {
        ObjectAnimator objectAnimator = this.anim;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            return;
        }
        this.anim.pause();
    }

    public void startAnim() {
        if (this.anim == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, Key.ROTATION, 0.0f, 360.0f);
            this.anim = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(3000L);
            this.anim.setInterpolator(new LinearInterpolator());
            this.anim.setRepeatCount(-1);
            this.anim.setRepeatMode(1);
        }
        this.anim.start();
    }
}
