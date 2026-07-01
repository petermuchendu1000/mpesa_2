package com.huawei.payment.lib.image.crop.model;

import android.graphics.RectF;

public class ImageState {
    private final float ShareDataUIState;
    private final float component1;
    private final RectF component2;
    private final RectF component3;

    public ImageState(RectF rectF, RectF rectF2, float f, float f2) {
        this.component3 = rectF;
        this.component2 = rectF2;
        this.component1 = f;
        this.ShareDataUIState = f2;
    }

    public RectF getCropRect() {
        return this.component3;
    }

    public RectF getCurrentImageRect() {
        return this.component2;
    }

    public float getCurrentScale() {
        return this.component1;
    }

    public float getCurrentAngle() {
        return this.ShareDataUIState;
    }
}
