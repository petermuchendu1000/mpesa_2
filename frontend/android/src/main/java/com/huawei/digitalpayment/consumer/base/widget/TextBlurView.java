package com.huawei.digitalpayment.consumer.base.widget;

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
import android.widget.TextView;
import com.huawei.common.widget.blur.AndroidBlur;
import com.safaricom.mpesa.logging.L;

public class TextBlurView extends View {
    private static int RENDERING_COUNT = 0;
    private static int ShareDataUIState = 1;
    private static final String TAG = "BlurView";
    private static int copydefault;
    private final AndroidBlur androidBlur;
    private int backColor;
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
    private TextView textView;

    public TextBlurView(Context context, TextView textView, int i) {
        super(context);
        this.overlayColor = 0;
        this.blurRadius = 23.0f;
        this.androidBlur = new AndroidBlur();
        this.paint = new Paint();
        this.rectSrc = new Rect();
        this.rectDst = new Rect();
        this.preDrawListener = new ViewTreeObserver.OnPreDrawListener() {
            private static int component1 = 1;
            private static int component3;

            /* JADX WARN: Removed duplicated region for block: B:28:0x00d9  */
            @Override
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean onPreDraw() {
                /*
                    Method dump skipped, instruction units count: 247
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.widget.TextBlurView.AnonymousClass5.onPreDraw():boolean");
            }
        };
        this.textView = textView;
        this.backColor = i;
    }

    public void setBlurRadius(float f) {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        if (this.blurRadius != f) {
            int i5 = i3 + 25;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            this.blurRadius = f;
            this.dirty = true;
            invalidate();
        }
    }

    public void setOverlayColor(int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 47;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        if (this.overlayColor != i) {
            int i6 = i3 + 119;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            this.overlayColor = i;
            invalidate();
        }
        int i8 = copydefault + 79;
        ShareDataUIState = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void releaseBitmap() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 71;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Bitmap bitmap = this.bitmapToBlur;
        if (bitmap != null) {
            int i5 = i2 + 45;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                bitmap.recycle();
                this.bitmapToBlur = null;
            } else {
                bitmap.recycle();
                this.bitmapToBlur = null;
                throw null;
            }
        }
        Bitmap bitmap2 = this.blurredBitmap;
        if (bitmap2 != null) {
            int i6 = copydefault + 9;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            bitmap2.recycle();
            this.blurredBitmap = null;
        }
        int i8 = ShareDataUIState + 117;
        copydefault = i8 % 128;
        int i9 = i8 % 2;
    }

    protected void release() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            releaseBitmap();
            this.androidBlur.release();
        } else {
            releaseBitmap();
            this.androidBlur.release();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean prepare() {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            float r1 = r9.blurRadius
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Lf
            r9.release()
            return r3
        Lf:
            r2 = 1103626240(0x41c80000, float:25.0)
            int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r4 <= 0) goto L16
            r1 = r2
        L16:
            int r2 = r9.getWidth()
            int r4 = r9.getHeight()
            boolean r5 = r9.dirty
            android.graphics.Canvas r6 = r9.blurringCanvas
            r7 = 1
            if (r6 == 0) goto L44
            android.graphics.Bitmap r6 = r9.blurredBitmap
            if (r6 == 0) goto L44
            int r6 = r6.getWidth()
            if (r6 != r2) goto L44
            int r6 = com.huawei.digitalpayment.consumer.base.widget.TextBlurView.ShareDataUIState
            int r6 = r6 + 47
            int r8 = r6 % 128
            com.huawei.digitalpayment.consumer.base.widget.TextBlurView.copydefault = r8
            int r6 = r6 % r0
            android.graphics.Bitmap r6 = r9.blurredBitmap
            int r6 = r6.getHeight()
            if (r6 == r4) goto L41
            goto L44
        L41:
            if (r5 == 0) goto Lc2
            goto L9c
        L44:
            r9.releaseBitmap()
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L7b java.lang.OutOfMemoryError -> L7d
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r2, r4, r5)     // Catch: java.lang.Throwable -> L7b java.lang.OutOfMemoryError -> L7d
            r9.bitmapToBlur = r5     // Catch: java.lang.Throwable -> L7b java.lang.OutOfMemoryError -> L7d
            if (r5 != 0) goto L64
            int r1 = com.huawei.digitalpayment.consumer.base.widget.TextBlurView.ShareDataUIState
            int r1 = r1 + 97
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.widget.TextBlurView.copydefault = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L60
            r9.release()
            return r3
        L60:
            r9.release()
            return r3
        L64:
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L7b java.lang.OutOfMemoryError -> L7d
            android.graphics.Bitmap r6 = r9.bitmapToBlur     // Catch: java.lang.Throwable -> L7b java.lang.OutOfMemoryError -> L7d
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L7b java.lang.OutOfMemoryError -> L7d
            r9.blurringCanvas = r5     // Catch: java.lang.Throwable -> L7b java.lang.OutOfMemoryError -> L7d
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L7b java.lang.OutOfMemoryError -> L7d
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r4, r5)     // Catch: java.lang.Throwable -> L7b java.lang.OutOfMemoryError -> L7d
            r9.blurredBitmap = r2     // Catch: java.lang.Throwable -> L7b java.lang.OutOfMemoryError -> L7d
            if (r2 != 0) goto L9c
            r9.release()
            return r3
        L7b:
            r0 = move-exception
            goto Lc3
        L7d:
            r2 = move-exception
            com.safaricom.mpesa.logging.L r4 = com.safaricom.mpesa.logging.L.INSTANCE     // Catch: java.lang.Throwable -> L7b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
            java.lang.String r6 = "prepare: "
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L7b
            r5.append(r2)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = "BlurView"
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L7b
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L7b
            r4.d(r2, r5, r6)     // Catch: java.lang.Throwable -> L7b
            r9.release()
        L9c:
            int r2 = com.huawei.digitalpayment.consumer.base.widget.TextBlurView.ShareDataUIState
            int r2 = r2 + 27
            int r4 = r2 % 128
            com.huawei.digitalpayment.consumer.base.widget.TextBlurView.copydefault = r4
            int r2 = r2 % r0
            com.huawei.common.widget.blur.AndroidBlur r2 = r9.androidBlur
            android.content.Context r4 = r9.getContext()
            android.graphics.Bitmap r5 = r9.bitmapToBlur
            boolean r1 = r2.prepare(r4, r5, r1)
            if (r1 != 0) goto Lc0
            int r1 = com.huawei.digitalpayment.consumer.base.widget.TextBlurView.ShareDataUIState
            int r1 = r1 + 11
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.widget.TextBlurView.copydefault = r2
            int r1 = r1 % r0
            if (r1 == 0) goto Lbf
            return r7
        Lbf:
            return r3
        Lc0:
            r9.dirty = r3
        Lc2:
            return r7
        Lc3:
            r9.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.widget.TextBlurView.prepare():boolean");
    }

    protected void blur(Bitmap bitmap, Bitmap bitmap2) {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.androidBlur.blur(bitmap, bitmap2);
        int i4 = ShareDataUIState + 105;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    protected View getActivityContextView() {
        int i = 2 % 2;
        Context context = getContext();
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = copydefault + 67;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (context == null || (context instanceof Activity)) {
                break;
            }
            int i5 = i4 + 125;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                int i6 = 2 / 0;
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (context instanceof Activity) {
            return ((Activity) context).findViewById(R.id.content);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onAttachedToWindow() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            super.onAttachedToWindow()
            android.view.View r1 = r5.getActivityContextView()
            r5.contentView = r1
            r2 = 0
            if (r1 == 0) goto L71
            int r3 = com.huawei.digitalpayment.consumer.base.widget.TextBlurView.ShareDataUIState
            int r3 = r3 + 43
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.base.widget.TextBlurView.copydefault = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L33
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            android.view.ViewTreeObserver$OnPreDrawListener r3 = r5.preDrawListener
            r1.addOnPreDrawListener(r3)
            android.view.View r1 = r5.contentView
            android.view.View r1 = r1.getRootView()
            android.view.View r3 = r5.getRootView()
            r4 = 12
            int r4 = r4 / r2
            if (r1 == r3) goto L55
            goto L48
        L33:
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            android.view.ViewTreeObserver$OnPreDrawListener r3 = r5.preDrawListener
            r1.addOnPreDrawListener(r3)
            android.view.View r1 = r5.contentView
            android.view.View r1 = r1.getRootView()
            android.view.View r3 = r5.getRootView()
            if (r1 == r3) goto L55
        L48:
            int r1 = com.huawei.digitalpayment.consumer.base.widget.TextBlurView.ShareDataUIState
            int r1 = r1 + 125
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.base.widget.TextBlurView.copydefault = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L54
            goto L55
        L54:
            r2 = 1
        L55:
            r5.differentRoot = r2
            if (r2 == 0) goto L7c
            int r1 = com.huawei.digitalpayment.consumer.base.widget.TextBlurView.copydefault
            int r1 = r1 + 31
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.widget.TextBlurView.ShareDataUIState = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L6a
            android.view.View r0 = r5.contentView
            r0.postInvalidate()
            goto L7c
        L6a:
            android.view.View r0 = r5.contentView
            r0.postInvalidate()
            r0 = 0
            throw r0
        L71:
            r5.differentRoot = r2
            int r1 = com.huawei.digitalpayment.consumer.base.widget.TextBlurView.ShareDataUIState
            int r1 = r1 + 51
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.widget.TextBlurView.copydefault = r2
            int r1 = r1 % r0
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.widget.TextBlurView.onAttachedToWindow():void");
    }

    @Override
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 1;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        View view = this.contentView;
        if (view != null) {
            int i5 = i2 + 87;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            view.getViewTreeObserver().removeOnPreDrawListener(this.preDrawListener);
        }
        release();
        super.onDetachedFromWindow();
        int i7 = ShareDataUIState + 81;
        copydefault = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override
    public void draw(Canvas canvas) {
        int i = 2 % 2;
        if (this.isRendering) {
            throw new IllegalStateException("stop");
        }
        int i2 = copydefault + 15;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        if (RENDERING_COUNT > 0) {
            L.INSTANCE.i("do nothing", new Object[0]);
            return;
        }
        super.draw(canvas);
        int i4 = ShareDataUIState + 67;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 5;
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            super.onDraw(canvas);
            drawBlurredBitmap(canvas, this.blurredBitmap, this.overlayColor);
            int i3 = copydefault + 17;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super.onDraw(canvas);
        drawBlurredBitmap(canvas, this.blurredBitmap, this.overlayColor);
        throw null;
    }

    protected void drawBlurredBitmap(Canvas canvas, Bitmap bitmap, int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 111;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        int i5 = i3 % 2;
        if (bitmap != null) {
            int i6 = i4 + 85;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            this.rectSrc.right = bitmap.getWidth();
            this.rectSrc.bottom = bitmap.getHeight();
            this.rectDst.right = getWidth();
            this.rectDst.bottom = getHeight();
            canvas.drawBitmap(bitmap, this.rectSrc, this.rectDst, (Paint) null);
        }
        this.paint.setColor(i);
        canvas.drawRect(this.rectDst, this.paint);
        int i8 = copydefault + 87;
        ShareDataUIState = i8 % 128;
        int i9 = i8 % 2;
    }

    static int m10207$$Nest$fgetbackColor(TextBlurView textBlurView) {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = textBlurView.backColor;
        if (i3 != 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static Bitmap m10208$$Nest$fgetbitmapToBlur(TextBlurView textBlurView) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Bitmap bitmap = textBlurView.bitmapToBlur;
        int i5 = i3 + 35;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return bitmap;
    }

    static Bitmap m10209$$Nest$fgetblurredBitmap(TextBlurView textBlurView) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Bitmap bitmap = textBlurView.blurredBitmap;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 63;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return bitmap;
    }

    static Canvas m10210$$Nest$fgetblurringCanvas(TextBlurView textBlurView) {
        int i = 2 % 2;
        int i2 = copydefault + 109;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Canvas canvas = textBlurView.blurringCanvas;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 105;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return canvas;
    }

    static View m10211$$Nest$fgetcontentView(TextBlurView textBlurView) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 7;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        View view = textBlurView.contentView;
        int i5 = i2 + 101;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }

    static boolean m10212$$Nest$fgetdifferentRoot(TextBlurView textBlurView) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        boolean z = textBlurView.differentRoot;
        if (i4 != 0) {
            int i5 = 62 / 0;
        }
        int i6 = i3 + 21;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static int m10213$$Nest$fgetoverlayColor(TextBlurView textBlurView) {
        int i = 2 % 2;
        int i2 = copydefault + 113;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = textBlurView.overlayColor;
        if (i3 != 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static TextView m10214$$Nest$fgettextView(TextBlurView textBlurView) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 7;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        TextView textView = textBlurView.textView;
        int i5 = i2 + 113;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 80 / 0;
        }
        return textView;
    }

    static void m10215$$Nest$fputisRendering(TextBlurView textBlurView, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        textBlurView.isRendering = z;
        if (i3 != 0) {
            throw null;
        }
    }

    static int m10216$$Nest$sfgetRENDERING_COUNT() {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = RENDERING_COUNT;
        int i6 = i3 + 49;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 17 / 0;
        }
        return i5;
    }

    static void m10217$$Nest$sfputRENDERING_COUNT(int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 89;
        int i4 = i3 % 128;
        copydefault = i4;
        int i5 = i3 % 2;
        RENDERING_COUNT = i;
        int i6 = i4 + 29;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
    }
}
