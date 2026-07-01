package com.huawei.common.widget.blur;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.huawei.common.util.L;

public class BlurView extends View {
    private static int RENDERING_COUNT = 0;
    private static final String TAG = "BlurView";
    private final AndroidBlur androidBlur;
    private Bitmap bitmapToBlur;
    private float blurRadius;
    private Bitmap blurredBitmap;
    private Canvas blurringCanvas;
    private View contentView;
    private boolean differentRoot;
    private boolean dirty;
    private boolean isRendering;
    private int overlayColor;
    private final Paint paint;
    private final ViewTreeObserver.OnPreDrawListener preDrawListener;
    private final Rect rectDst;
    private final Rect rectSrc;

    public BlurView(Context context) {
        super(context);
        this.overlayColor = 0;
        this.blurRadius = 18.0f;
        this.rectSrc = new Rect();
        this.rectDst = new Rect();
        this.preDrawListener = new ViewTreeObserver.OnPreDrawListener() {
            @Override
            public boolean onPreDraw() {
                int[] iArr = new int[2];
                Bitmap bitmap = BlurView.this.blurredBitmap;
                View view = BlurView.this.contentView;
                if (view != null && BlurView.this.isShown() && BlurView.this.prepare()) {
                    boolean z = BlurView.this.blurredBitmap != bitmap;
                    view.getLocationOnScreen(iArr);
                    int i = -iArr[0];
                    int i2 = -iArr[1];
                    BlurView.this.getLocationOnScreen(iArr);
                    int i3 = iArr[0];
                    int i4 = iArr[1];
                    BlurView.this.bitmapToBlur.eraseColor(BlurView.this.overlayColor & 16777215);
                    int iSave = BlurView.this.blurringCanvas.save();
                    BlurView.this.isRendering = true;
                    BlurView.RENDERING_COUNT++;
                    try {
                        try {
                            BlurView.this.blurringCanvas.scale((BlurView.this.bitmapToBlur.getWidth() * 1.0f) / BlurView.this.getWidth(), (BlurView.this.bitmapToBlur.getHeight() * 1.0f) / BlurView.this.getHeight());
                            BlurView.this.blurringCanvas.translate(-(i + i3), -(i2 + i4));
                            if (view.getBackground() != null) {
                                view.getBackground().draw(BlurView.this.blurringCanvas);
                            }
                            view.draw(BlurView.this.blurringCanvas);
                        } catch (RuntimeException e) {
                            L.e(e.getMessage());
                        }
                        BlurView.this.isRendering = false;
                        BlurView.RENDERING_COUNT--;
                        BlurView.this.blurringCanvas.restoreToCount(iSave);
                        BlurView blurView = BlurView.this;
                        blurView.blur(blurView.bitmapToBlur, BlurView.this.blurredBitmap);
                        if (z || BlurView.this.differentRoot) {
                            BlurView.this.invalidate();
                        }
                    } catch (Throwable th) {
                        BlurView.this.isRendering = false;
                        BlurView.RENDERING_COUNT--;
                        BlurView.this.blurringCanvas.restoreToCount(iSave);
                        throw th;
                    }
                }
                return true;
            }
        };
        this.androidBlur = new AndroidBlur();
        this.paint = new Paint();
    }

    public void setBlurRadius(float f) {
        if (this.blurRadius != f) {
            this.blurRadius = f;
            this.dirty = true;
            invalidate();
        }
    }

    public void setOverlayColor(int i) {
        if (this.overlayColor != i) {
            this.overlayColor = i;
            invalidate();
        }
    }

    private void releaseBitmap() {
        Bitmap bitmap = this.bitmapToBlur;
        if (bitmap != null) {
            bitmap.recycle();
            this.bitmapToBlur = null;
        }
        Bitmap bitmap2 = this.blurredBitmap;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.blurredBitmap = null;
        }
    }

    protected void release() {
        releaseBitmap();
        this.androidBlur.release();
    }

    protected boolean prepare() {
        Bitmap bitmap;
        float f = this.blurRadius;
        if (f == 0.0f) {
            return false;
        }
        if (f > 25.0f) {
            f = 25.0f;
        }
        int width = getWidth();
        int height = getHeight();
        boolean z = this.dirty;
        if (this.blurringCanvas == null || (bitmap = this.blurredBitmap) == null || bitmap.getWidth() != width || this.blurredBitmap.getHeight() != height) {
            releaseBitmap();
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.bitmapToBlur = bitmapCreateBitmap;
                if (bitmapCreateBitmap == null) {
                    return false;
                }
                this.blurringCanvas = new Canvas(this.bitmapToBlur);
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.blurredBitmap = bitmapCreateBitmap2;
                if (bitmapCreateBitmap2 == null) {
                    return false;
                }
            } catch (OutOfMemoryError e) {
                L.d(TAG, "prepare: " + e.getMessage());
            } finally {
                release();
            }
        } else if (!z) {
            return true;
        }
        if (!this.androidBlur.prepare(getContext(), this.bitmapToBlur, f)) {
            return false;
        }
        this.dirty = false;
        return true;
    }

    protected void blur(Bitmap bitmap, Bitmap bitmap2) {
        this.androidBlur.blur(bitmap, bitmap2);
    }

    protected View getActivityContextView() {
        Context context = getContext();
        for (int i = 0; i < 4 && context != null && !(context instanceof Activity) && (context instanceof ContextWrapper); i++) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof Activity) {
            return ((Activity) context).findViewById(R.id.content);
        }
        return null;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        View activityContextView = getActivityContextView();
        this.contentView = activityContextView;
        if (activityContextView != null) {
            activityContextView.getViewTreeObserver().addOnPreDrawListener(this.preDrawListener);
            boolean z = this.contentView.getRootView() != getRootView();
            this.differentRoot = z;
            if (z) {
                this.contentView.postInvalidate();
                return;
            }
            return;
        }
        this.differentRoot = false;
    }

    @Override
    protected void onDetachedFromWindow() {
        View view = this.contentView;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.preDrawListener);
        }
        release();
        super.onDetachedFromWindow();
    }

    @Override
    public void draw(Canvas canvas) {
        if (this.isRendering) {
            throw new IllegalStateException("stop");
        }
        if (RENDERING_COUNT > 0) {
            L.i("do nothing");
        } else {
            super.draw(canvas);
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawBlurredBitmap(canvas, this.blurredBitmap, this.overlayColor);
    }

    protected void drawBlurredBitmap(Canvas canvas, Bitmap bitmap, int i) {
        if (bitmap != null) {
            this.rectSrc.right = bitmap.getWidth();
            this.rectSrc.bottom = bitmap.getHeight();
            this.rectDst.right = getWidth();
            this.rectDst.bottom = getHeight();
            canvas.drawBitmap(bitmap, this.rectSrc, this.rectDst, (Paint) null);
        }
        this.paint.setColor(i);
        canvas.drawRect(this.rectDst, this.paint);
    }
}
