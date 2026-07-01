package com.huawei.payment.lib.image.crop.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class FastBitmapDrawable extends Drawable {
    private Bitmap component1;
    private int component2;
    private int component3;
    private final Paint copydefault = new Paint(2);
    private int ShareDataUIState = 255;

    @Override
    public int getOpacity() {
        return -3;
    }

    public FastBitmapDrawable(Bitmap bitmap) {
        copydefault(bitmap);
    }

    @Override
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.component1;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.component1, (Rect) null, getBounds(), this.copydefault);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.copydefault.setColorFilter(colorFilter);
    }

    @Override
    public void setFilterBitmap(boolean z) {
        this.copydefault.setFilterBitmap(z);
    }

    @Override
    public int getAlpha() {
        return this.ShareDataUIState;
    }

    @Override
    public void setAlpha(int i) {
        this.ShareDataUIState = i;
        this.copydefault.setAlpha(i);
    }

    @Override
    public int getIntrinsicHeight() {
        return this.component2;
    }

    @Override
    public int getIntrinsicWidth() {
        return this.component3;
    }

    @Override
    public int getMinimumHeight() {
        return this.component2;
    }

    @Override
    public int getMinimumWidth() {
        return this.component3;
    }

    public Bitmap getBitmap() {
        return this.component1;
    }

    private void copydefault(Bitmap bitmap) {
        this.component1 = bitmap;
        if (bitmap != null) {
            this.component3 = bitmap.getWidth();
            this.component2 = this.component1.getHeight();
        } else {
            this.component2 = 0;
            this.component3 = 0;
        }
    }
}
