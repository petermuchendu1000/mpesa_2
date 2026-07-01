package com.huawei.digitalpayment.customer.dynamics.widget.signature;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.ColorUtils;
import com.huawei.digitalpayment.customer.dynamics.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;

public class SignatureView extends View {
    private static final boolean DEFAULT_ATTR_CLEAR_ON_DOUBLE_CLICK = false;
    private static final int DEFAULT_ATTR_PEN_COLOR = -16777216;
    private static final int DEFAULT_ATTR_PEN_MAX_WIDTH_PX = 7;
    private static final int DEFAULT_ATTR_PEN_MIN_WIDTH_PX = 3;
    private static final float DEFAULT_ATTR_VELOCITY_FILTER_WEIGHT = 0.9f;
    private static final int MULTI_TOUCH_POINT_COUNT = 3;
    private static final String TAG;
    private static long component2;
    private static int copydefault;
    private final Bezier bezierCached;
    private final boolean clearOnDoubleClick;
    private final ControlTimedPoints controlTimedPointsCached;
    private final RectF dirtyRect;
    private final GestureDetector gestureDetector;
    private boolean isEmpty;
    private float lastTouchX;
    private float lastTouchY;
    private float lastVelocity;
    private float lastWidth;
    private final int maxWidth;
    private final int minWidth;
    private OnSignedListener onSignedListener;
    private final Paint paint;
    private int paintPointSize;
    private List<TimedPoint> points;
    private final List<TimedPoint> pointsCache;
    private Bitmap signatureBitmap;
    private Canvas signatureBitmapCanvas;
    private final SvgBuilder svgBuilder;
    private final float velocityFilterWeight;
    private static final byte[] $$a = {TarHeader.LF_NORMAL, 86, 58, 71};
    private static final int $$b = 241;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ShareDataUIState = 1;
    private static int component3 = 0;
    private static int component1 = 1;

    public interface OnSignedListener {
        void onClear();

        void onSigned();

        void onStartSigning();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r7, int r8, int r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.customer.dynamics.widget.signature.SignatureView.$$a
            int r9 = r9 * 4
            int r9 = r9 + 4
            int r8 = r8 * 3
            int r8 = r8 + 1
            int r7 = r7 * 4
            int r7 = r7 + 103
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r7 = r9
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            r6 = r9
            r9 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L28:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2d:
            int r9 = r9 + 1
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.customer.dynamics.widget.signature.SignatureView.$$c(byte, int, int):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component2 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $11 + 19;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component2)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 7032, Color.rgb(0, 0, 0) + 16777250, (char) (63440 - (ViewConfiguration.getPressedStateDuration() >> 16)), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1390 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 17 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (Drawable.resolveOpacity(0, 0) + 51269), -1883291598, false, $$c(b2, b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i6 = $10 + 19;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrComponent2, 4, cArrComponent2.length - 4);
    }

    public SignatureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.svgBuilder = new SvgBuilder();
        this.pointsCache = new ArrayList();
        this.controlTimedPointsCached = new ControlTimedPoints();
        this.bezierCached = new Bezier();
        Paint paint = new Paint();
        this.paint = paint;
        this.signatureBitmap = null;
        this.signatureBitmapCanvas = null;
        this.paintPointSize = 0;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.SignaturePad, 0, 0);
        try {
            this.maxWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.SignaturePad_penMaxWidth, dpToPx(7.0f));
            this.minWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.SignaturePad_penMinWidth, dpToPx(3.0f));
            this.velocityFilterWeight = typedArrayObtainStyledAttributes.getFloat(R.styleable.SignaturePad_velocityFilterWeight, 0.9f);
            this.clearOnDoubleClick = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SignaturePad_clearOnDoubleClick, false);
            paint.setColor(typedArrayObtainStyledAttributes.getColor(R.styleable.SignaturePad_penColor, -16777216));
            typedArrayObtainStyledAttributes.recycle();
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            this.dirtyRect = new RectF();
            viewClear();
            this.gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
                private static int component1 = 1;
                private static int copydefault;

                @Override
                public boolean onDoubleTap(MotionEvent motionEvent) {
                    int i = 2 % 2;
                    int i2 = component1 + 37;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    SignatureView signatureView = SignatureView.this;
                    if (i3 == 0) {
                        return SignatureView.m12217$$Nest$monDoubleClick(signatureView);
                    }
                    SignatureView.m12217$$Nest$monDoubleClick(signatureView);
                    throw null;
                }
            });
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void setPenColor(int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 99;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.paint.setColor(i);
        if (i4 != 0) {
            int i5 = 63 / 0;
        }
    }

    private void viewClearUnsetSize() {
        int i = 2 % 2;
        this.svgBuilder.clear();
        this.points = new ArrayList();
        this.lastVelocity = 0.0f;
        this.lastWidth = (this.minWidth + this.maxWidth) / 2.0f;
        Bitmap bitmap = this.signatureBitmap;
        Object obj = null;
        if (bitmap != null) {
            int i2 = component1 + 93;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            bitmap.recycle();
            this.signatureBitmap = null;
            ensureSignatureBitmap();
        }
        setEmpty(true);
        invalidate();
        int i4 = component3 + 69;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private void viewClear() {
        int i = 2 % 2;
        int i2 = component3 + 15;
        component1 = i2 % 128;
        this.paintPointSize = i2 % 2 == 0 ? 1 : 0;
        viewClearUnsetSize();
        int i3 = component1 + 101;
        component3 = i3 % 128;
        int i4 = i3 % 2;
    }

    public void clear() {
        int i = 2 % 2;
        int i2 = component3 + 123;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        viewClear();
        int i4 = component1 + 31;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
    }

    public int getPaintPointSize() {
        int i = 2 % 2;
        int i2 = component1 + 5;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.paintPointSize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setPaintPointSize(int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 19;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.paintPointSize = i;
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.customer.dynamics.widget.signature.SignatureView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint;
        float f;
        int i = 2 % 2;
        Bitmap bitmap = this.signatureBitmap;
        if (bitmap != null) {
            int i2 = component3 + 21;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                paint = this.paint;
                f = 2.0f;
            } else {
                paint = this.paint;
                f = 0.0f;
            }
            canvas.drawBitmap(bitmap, f, f, paint);
            int i3 = component1 + 93;
            component3 = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public void setOnSignedListener(OnSignedListener onSignedListener) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 125;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.onSignedListener = onSignedListener;
        int i5 = i2 + 43;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public boolean isEmpty() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 121;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isEmpty;
        int i5 = i2 + 53;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 64 / 0;
        }
        return z;
    }

    public String getSignatureSvg() {
        int i = 2 % 2;
        int i2 = component3 + 91;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String strBuild = this.svgBuilder.build(getTransparentSignatureBitmap().getWidth(), getTransparentSignatureBitmap().getHeight());
        int i4 = component3 + 115;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
        return strBuild;
    }

    public Bitmap getSignatureBitmap() {
        int i = 2 % 2;
        Bitmap transparentSignatureBitmap = getTransparentSignatureBitmap();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(transparentSignatureBitmap.getWidth(), transparentSignatureBitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(ColorUtils.getColor(R.color.colorBackgroundFloating));
        Object obj = null;
        canvas.drawBitmap(transparentSignatureBitmap, 0.0f, 0.0f, (Paint) null);
        int i2 = component3 + 7;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return bitmapCreateBitmap;
        }
        obj.hashCode();
        throw null;
    }

    public void setSignatureBitmap(final Bitmap bitmap) {
        int i = 2 % 2;
        if (ViewCompat.isLaidOut(this)) {
            viewClearUnsetSize();
            ensureSignatureBitmap();
            RectF rectF = new RectF();
            RectF rectF2 = new RectF();
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int width2 = getWidth();
            int height2 = getHeight();
            rectF.set(0.0f, 0.0f, width, height);
            rectF2.set(0.0f, 0.0f, width2, height2);
            Matrix matrix = new Matrix();
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            new Canvas(this.signatureBitmap).drawBitmap(bitmap, matrix, null);
            setEmpty(false);
            invalidate();
        } else {
            getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                private static int component3 = 1;
                private static int copydefault;

                @Override
                public void onGlobalLayout() {
                    int i2 = 2 % 2;
                    int i3 = copydefault + 31;
                    component3 = i3 % 128;
                    if (i3 % 2 == 0) {
                        ViewTreeObserverCompat.removeOnGlobalLayoutListener(SignatureView.this.getViewTreeObserver(), this);
                        SignatureView.this.setSignatureBitmap(bitmap);
                        int i4 = 61 / 0;
                    } else {
                        ViewTreeObserverCompat.removeOnGlobalLayoutListener(SignatureView.this.getViewTreeObserver(), this);
                        SignatureView.this.setSignatureBitmap(bitmap);
                    }
                    int i5 = copydefault + 115;
                    component3 = i5 % 128;
                    if (i5 % 2 == 0) {
                        throw null;
                    }
                }
            });
            int i2 = component3 + 105;
            component1 = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = component3 + 51;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public Bitmap getTransparentSignatureBitmap() {
        int i = 2 % 2;
        int i2 = component3 + 39;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ensureSignatureBitmap();
        Bitmap bitmap = this.signatureBitmap;
        int i4 = component1 + 11;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return bitmap;
        }
        throw null;
    }

    private boolean onDoubleClick() {
        int i = 2 % 2;
        if (!this.clearOnDoubleClick) {
            int i2 = component1 + 45;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = component1 + 3;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        viewClear();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029 A[PHI: r1
  0x0029: PHI (r1v6 int) = (r1v5 int), (r1v11 int) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.huawei.digitalpayment.customer.dynamics.widget.signature.TimedPoint getNewPoint(float r5, float r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.customer.dynamics.widget.signature.SignatureView.component3
            int r1 = r1 + 107
            int r2 = r1 % 128
            com.huawei.digitalpayment.customer.dynamics.widget.signature.SignatureView.component1 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1b
            java.util.List<com.huawei.digitalpayment.customer.dynamics.widget.signature.TimedPoint> r1 = r4.pointsCache
            int r1 = r1.size()
            r2 = 76
            int r2 = r2 / 0
            if (r1 != 0) goto L29
            goto L23
        L1b:
            java.util.List<com.huawei.digitalpayment.customer.dynamics.widget.signature.TimedPoint> r1 = r4.pointsCache
            int r1 = r1.size()
            if (r1 != 0) goto L29
        L23:
            com.huawei.digitalpayment.customer.dynamics.widget.signature.TimedPoint r0 = new com.huawei.digitalpayment.customer.dynamics.widget.signature.TimedPoint
            r0.<init>()
            goto L3d
        L29:
            java.util.List<com.huawei.digitalpayment.customer.dynamics.widget.signature.TimedPoint> r2 = r4.pointsCache
            int r1 = r1 + (-1)
            java.lang.Object r1 = r2.remove(r1)
            com.huawei.digitalpayment.customer.dynamics.widget.signature.TimedPoint r1 = (com.huawei.digitalpayment.customer.dynamics.widget.signature.TimedPoint) r1
            int r2 = com.huawei.digitalpayment.customer.dynamics.widget.signature.SignatureView.component3
            int r2 = r2 + 103
            int r3 = r2 % 128
            com.huawei.digitalpayment.customer.dynamics.widget.signature.SignatureView.component1 = r3
            int r2 = r2 % r0
            r0 = r1
        L3d:
            com.huawei.digitalpayment.customer.dynamics.widget.signature.TimedPoint r5 = r0.set(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.customer.dynamics.widget.signature.SignatureView.getNewPoint(float, float):com.huawei.digitalpayment.customer.dynamics.widget.signature.TimedPoint");
    }

    private void recyclePoint(TimedPoint timedPoint) {
        int i = 2 % 2;
        int i2 = component1 + 89;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.pointsCache.add(timedPoint);
        int i4 = component3 + 63;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private void addPoint(TimedPoint timedPoint) {
        int i = 2 % 2;
        this.paintPointSize++;
        this.points.add(timedPoint);
        int size = this.points.size();
        if (size <= 3) {
            if (size == 1) {
                int i2 = component3 + 1;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                TimedPoint timedPoint2 = this.points.get(0);
                this.points.add(getNewPoint(timedPoint2.pointX, timedPoint2.pointY));
                return;
            }
            return;
        }
        ControlTimedPoints controlTimedPointsCalculateCurveControlPoints = calculateCurveControlPoints(this.points.get(0), this.points.get(1), this.points.get(2));
        TimedPoint timedPoint3 = controlTimedPointsCalculateCurveControlPoints.c2;
        recyclePoint(controlTimedPointsCalculateCurveControlPoints.c1);
        ControlTimedPoints controlTimedPointsCalculateCurveControlPoints2 = calculateCurveControlPoints(this.points.get(1), this.points.get(2), this.points.get(3));
        TimedPoint timedPoint4 = controlTimedPointsCalculateCurveControlPoints2.c1;
        recyclePoint(controlTimedPointsCalculateCurveControlPoints2.c2);
        Bezier bezier = this.bezierCached.set(this.points.get(1), timedPoint3, timedPoint4, this.points.get(2));
        float fVelocityFrom = bezier.endPoint.velocityFrom(bezier.startPoint);
        if (Float.isNaN(fVelocityFrom)) {
            int i4 = component1 + 89;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            fVelocityFrom = 0.0f;
        }
        float f = this.velocityFilterWeight;
        float f2 = (fVelocityFrom * f) + ((1.0f - f) * this.lastVelocity);
        float fStrokeWidth = strokeWidth(f2);
        addBezier(bezier, this.lastWidth, fStrokeWidth);
        this.lastVelocity = f2;
        this.lastWidth = fStrokeWidth;
        recyclePoint(this.points.remove(0));
        recyclePoint(timedPoint3);
        recyclePoint(timedPoint4);
    }

    private void addBezier(Bezier bezier, float f, float f2) {
        int i = 2 % 2;
        int i2 = component1 + 69;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.svgBuilder.append(bezier, (f + f2) / 2.0f);
        ensureSignatureBitmap();
        float strokeWidth = this.paint.getStrokeWidth();
        float fCeil = (float) Math.ceil(bezier.length());
        int i4 = 0;
        while (true) {
            float f3 = i4;
            if (f3 >= fCeil) {
                break;
            }
            float f4 = f3 / fCeil;
            float f5 = f4 * f4;
            float f6 = f5 * f4;
            float f7 = 1.0f - f4;
            float f8 = f7 * f7;
            float f9 = f8 * f7;
            float f10 = f8 * 3.0f * f4;
            float f11 = f7 * 3.0f * f5;
            float f12 = (bezier.startPoint.pointX * f9) + (bezier.control1.pointX * f10) + (bezier.control2.pointX * f11) + (bezier.endPoint.pointX * f6);
            float f13 = (f9 * bezier.startPoint.pointY) + (f10 * bezier.control1.pointY) + (f11 * bezier.control2.pointY) + (bezier.endPoint.pointY * f6);
            this.paint.setStrokeWidth((f6 * (f2 - f)) + f);
            this.signatureBitmapCanvas.drawPoint(f12, f13, this.paint);
            expandDirtyRect(f12, f13);
            i4++;
        }
        this.paint.setStrokeWidth(strokeWidth);
        int i5 = component3 + 93;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ControlTimedPoints calculateCurveControlPoints(TimedPoint timedPoint, TimedPoint timedPoint2, TimedPoint timedPoint3) {
        int i = 2 % 2;
        float f = timedPoint.pointX - timedPoint2.pointX;
        float f2 = timedPoint.pointY - timedPoint2.pointY;
        float f3 = timedPoint2.pointX - timedPoint3.pointX;
        float f4 = timedPoint2.pointY - timedPoint3.pointY;
        float f5 = (timedPoint.pointX + timedPoint2.pointX) / 2.0f;
        float f6 = (timedPoint.pointY + timedPoint2.pointY) / 2.0f;
        float f7 = (timedPoint2.pointX + timedPoint3.pointX) / 2.0f;
        float f8 = (timedPoint2.pointY + timedPoint3.pointY) / 2.0f;
        float fSqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        float fSqrt2 = (float) Math.sqrt((f3 * f3) + (f4 * f4));
        float f9 = fSqrt2 / (fSqrt + fSqrt2);
        if (Float.isNaN(f9)) {
            int i2 = component3 + 41;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 15;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            f9 = 0.0f;
        }
        float f10 = timedPoint2.pointX - (((f5 - f7) * f9) + f7);
        float f11 = timedPoint2.pointY - (((f6 - f8) * f9) + f8);
        return this.controlTimedPointsCached.set(getNewPoint(f5 + f10, f6 + f11), getNewPoint(f7 + f10, f8 + f11));
    }

    private float strokeWidth(float f) {
        int i = 2 % 2;
        int i2 = component1 + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        float fMax = Math.max(this.maxWidth / (f + 1.0f), this.minWidth);
        int i4 = component3 + 117;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return fMax;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void expandDirtyRect(float f, float f2) {
        int i = 2 % 2;
        if (f < this.dirtyRect.left) {
            this.dirtyRect.left = f;
        } else if (f > this.dirtyRect.right) {
            int i2 = component3 + 59;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            this.dirtyRect.right = f;
        }
        if (f2 >= this.dirtyRect.top) {
            if (f2 > this.dirtyRect.bottom) {
                this.dirtyRect.bottom = f2;
            }
        } else {
            int i4 = component1 + 69;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            this.dirtyRect.top = f2;
        }
    }

    private void resetDirtyRect(float f, float f2) {
        int i = 2 % 2;
        int i2 = component3 + 93;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.dirtyRect.left = Math.min(this.lastTouchX, f);
        this.dirtyRect.right = Math.max(this.lastTouchX, f);
        this.dirtyRect.top = Math.min(this.lastTouchY, f2);
        this.dirtyRect.bottom = Math.max(this.lastTouchY, f2);
        int i4 = component3 + 51;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private void setEmpty(boolean z) {
        int i = 2 % 2;
        this.isEmpty = z;
        OnSignedListener onSignedListener = this.onSignedListener;
        if (onSignedListener != null) {
            int i2 = component1 + 71;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (z) {
                onSignedListener.onClear();
            } else {
                onSignedListener.onSigned();
            }
        }
        int i3 = component1 + 103;
        component3 = i3 % 128;
        int i4 = i3 % 2;
    }

    private void ensureSignatureBitmap() {
        int i = 2 % 2;
        int i2 = component1 + 69;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        if (this.signatureBitmap == null) {
            this.signatureBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            this.signatureBitmapCanvas = new Canvas(this.signatureBitmap);
        }
        int i4 = component3 + 117;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private int dpToPx(float f) {
        int i = 2 % 2;
        int i2 = component3 + 31;
        component1 = i2 % 128;
        int iRound = Math.round(i2 % 2 == 0 ? getContext().getResources().getDisplayMetrics().density / f : getContext().getResources().getDisplayMetrics().density * f);
        int i3 = component1 + 41;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return iRound;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public List<TimedPoint> getPoints() {
        int i = 2 % 2;
        int i2 = component3 + 59;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.points;
        }
        throw null;
    }

    static boolean m12217$$Nest$monDoubleClick(SignatureView signatureView) {
        int i = 2 % 2;
        int i2 = component1 + 83;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnDoubleClick = signatureView.onDoubleClick();
        if (i3 != 0) {
            int i4 = 30 / 0;
        }
        int i5 = component3 + 103;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return zOnDoubleClick;
        }
        throw null;
    }

    static {
        copydefault = 0;
        component3();
        Object[] objArr = new Object[1];
        a(TextUtils.lastIndexOf("", '0') + 1, new char[]{16797, 16894, 27809, 56258, 41212, 17355, 17753, 8673, 28989, 36910, 4751, 53360, 8296, 16650, 8728, 33563, 54188, 12876, 61719, 46019, 33500, 58271, 32822, 25230, 45580, 44246, 22507, 7497, 25945, 40045, 26293, 52330, 5270, 19839, 13937, 65338, 51128, 16033, 50504, 45035, 63212, 61429, 38095, 24234, 42532, 55488, 23429, 2321, 22898, 34818, 27482, 14352, 2200, 31047, 14888, 59612, 15324, 10908, 51488, 39814, 60185, 7158, 39140, 19130, 39435, 51992, 44983, 1392, 19827, 46194, 32594, 13370, 31911, 26046, 3640, 58606, 12264, 22164}, objArr);
        TAG = ((String) objArr[0]).intern();
        int i = ShareDataUIState + 29;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    static void component3() {
        component2 = 5830742571078901923L;
    }
}
