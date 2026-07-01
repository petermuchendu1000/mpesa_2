package com.huawei.common.widget.date;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Scroller;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.common.util.L;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.io.encoding.Base64;

public class WheelPicker extends View implements IWheelPicker, Runnable {
    public static final int ALIGN_CENTER = 0;
    public static final int ALIGN_LEFT = 1;
    public static final int ALIGN_RIGHT = 2;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SCROLLING = 2;
    private final Camera camera;
    private int currentItemPosition;
    private int curtainColor;
    private List data;
    private int downPointY;
    private int drawnCenterX;
    private int drawnCenterY;
    private int drawnItemCount;
    private String fontPath;
    private int halfDrawnItemCount;
    private int halfItemHeight;
    private int halfWheelHeight;
    private final Handler handler;
    private boolean hasAtmospheric;
    private int indicatColor;
    private int indicatorSize;
    private boolean isClick;
    private boolean isCurtain;
    private boolean isCurved;
    private boolean isCyclic;
    private boolean isForceFinishScroll;
    private boolean isIndicator;
    private boolean isSameWidth;
    private boolean isTouchTriggered;
    private int itemAlign;
    private int itemHeight;
    private int itemSpace;
    private int itemTextColor;
    private int itemTextSize;
    private int lastPointY;
    private final Matrix matrixDepth;
    private final Matrix matrixRotate;
    private int maxFlingY;
    private String maxWidthText;
    private int maximumVelocity;
    private int minFlingY;
    private int minimumVelocity;
    private OnItemSelectedListener onItemSelectedListener;
    private OnWheelChangeListener onWheelChangeListener;
    private final Paint paint;
    private final Rect rectCurrentItem;
    private final Rect rectDrawn;
    private final Rect rectIndicatorFoot;
    private final Rect rectIndicatorHead;
    private int scrollOffsetY;
    private final Scroller scroller;
    private int selectedItemPosition;
    private int selectedItemTextColor;
    private Typeface selectedTypeface;
    private int textMaxHeight;
    private int textMaxWidth;
    private int textMaxWidthPosition;
    private int touchSlop;
    private Typeface typeface;
    private VelocityTracker velocityTracker;
    private int visibleItemCount;
    private int wheelCenterX;
    private int wheelCenterY;
    private static final byte[] $$c = {126, 1, Ascii.SUB, -71};
    private static final int $$f = 254;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {4, -66, -36, 8, Ascii.ETB, 9, -52, 69, Ascii.CAN, -9, 33, -7, Ascii.SI, -48, 65, Ascii.DLE, 9, 13, Ascii.SYN, -8, Ascii.SYN, Ascii.SI, -4, 35, -1, 3, 20, 17, -59, SignedBytes.MAX_POWER_OF_TWO, Ascii.ETB, 10, Ascii.DLE, 13, 3, 3, Ascii.CAN, -57, 63, 10, Ascii.GS, -3, -44, SignedBytes.MAX_POWER_OF_TWO, Ascii.GS, -8, Ascii.SO, -44, Ascii.US, 42, Ascii.GS, -3, -23, Base64.padSymbol, -8, Ascii.SO, -8, Ascii.RS, Ascii.ETB, Ascii.SI, -5, Ascii.EM, Ascii.FF, -69, Ascii.ESC, Ascii.ETB, 9, Ascii.SO, 10, 10, 2, 20, 17, -54};
    private static final int $$e = 69;
    private static final byte[] $$a = {98, -3, -80, -4, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_LINK, -38, -10, -34, -4, Ascii.DLE, -46, -36, 2, -5, -5, -27, -50, 2, -36, -2, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_SYMLINK};
    private static final int $$b = 30;
    private static int copydefault = 0;
    private static int getRequestBeneficiariesState = 1;
    private static char component3 = 32279;
    private static char ShareDataUIState = 6068;
    private static char component2 = 47801;
    private static char component1 = 23049;

    public interface OnItemSelectedListener {
        void onItemSelected(WheelPicker wheelPicker, Object obj, int i);
    }

    public interface OnWheelChangeListener {
        void onWheelScrollStateChanged(int i);

        void onWheelScrolled(int i);

        void onWheelSelected(int i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(byte r7, byte r8, short r9) {
        /*
            int r9 = r9 * 4
            int r9 = r9 + 1
            int r7 = r7 * 3
            int r7 = 111 - r7
            byte[] r0 = com.huawei.common.widget.date.WheelPicker.$$c
            int r8 = r8 * 4
            int r8 = 4 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r7 = r9
            r4 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2a:
            int r8 = -r8
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.widget.date.WheelPicker.$$g(byte, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 6
            int r0 = 16 - r6
            int r8 = r8 + 4
            byte[] r1 = com.huawei.common.widget.date.WheelPicker.$$a
            int r7 = r7 * 16
            int r7 = 99 - r7
            byte[] r0 = new byte[r0]
            int r6 = 15 - r6
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L30
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r8 = r8 + 1
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L30:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-17)
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.widget.date.WheelPicker.a(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 99
            byte[] r0 = com.huawei.common.widget.date.WheelPicker.$$d
            int r8 = r8 * 61
            int r8 = 65 - r8
            int r6 = r6 * 52
            int r6 = r6 + 10
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r8]
        L28:
            int r8 = r8 + 1
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.widget.date.WheelPicker.c(int, int, short, java.lang.Object[]):void");
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i5 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i6 = $10 + 53;
            $11 = i6 % 128;
            int i7 = i6 % i3;
            cArr3[i5] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i8 = $11 + 79;
            $10 = i8 % 128;
            int i9 = i8 % i3;
            int i10 = 58224;
            int i11 = i5;
            while (i11 < 16) {
                int i12 = $11 + 107;
                $10 = i12 % 128;
                int i13 = i12 % i3;
                char c2 = cArr3[1];
                char c3 = cArr3[i5];
                int i14 = (c3 + i10) ^ ((c3 << 4) + ((char) (((long) component2) ^ 4374495167426960553L)));
                int i15 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(component1);
                    objArr2[i3] = Integer.valueOf(i15);
                    objArr2[1] = Integer.valueOf(i14);
                    objArr2[i5] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int iMakeMeasureSpec = 844 - View.MeasureSpec.makeMeasureSpec(i5, i5);
                        int offsetBefore = TextUtils.getOffsetBefore("", i5) + 32;
                        char cKeyCodeFromString = (char) (23251 - KeyEvent.keyCodeFromString(""));
                        byte b2 = (byte) ($$c[1] - 1);
                        byte b3 = b2;
                        String str$$g = $$g(b2, b3, b3);
                        Class[] clsArr = new Class[4];
                        clsArr[i5] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iMakeMeasureSpec, offsetBefore, cKeyCodeFromString, 592652048, false, str$$g, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i10) ^ ((cCharValue << 4) + ((char) (((long) component3) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(ShareDataUIState)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        int offsetAfter = 844 - TextUtils.getOffsetAfter("", 0);
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 32;
                        char c4 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 23250);
                        byte b4 = (byte) ($$c[1] - 1);
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(offsetAfter, packedPositionGroup, c4, 592652048, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i10 -= 40503;
                    i11++;
                    cArr3 = cArr4;
                    i3 = 2;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[iNotificationSideChannelDefault.component3] = cArr5[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr5[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                i2 = 2;
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getMode(0) + 465, View.resolveSizeAndState(0, 0, 0) + 49, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            } else {
                i2 = 2;
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            i3 = i2;
            cArr3 = cArr5;
            i5 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public WheelPicker(Context context) {
        this(context, null);
    }

    public WheelPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.handler = new Handler();
        initAttr(context, attributeSet);
        updateVisibleItemCount();
        Paint paint = new Paint(69);
        this.paint = paint;
        paint.setTextSize(this.itemTextSize);
        if (this.fontPath != null) {
            setTypeface(Typeface.createFromAsset(context.getAssets(), this.fontPath));
            int i = copydefault + 31;
            getRequestBeneficiariesState = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        }
        updateItemTextAlign();
        computeTextSize();
        this.scroller = new Scroller(getContext());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.minimumVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.maximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.touchSlop = viewConfiguration.getScaledTouchSlop();
        this.rectIndicatorFoot = new Rect();
        this.rectIndicatorHead = new Rect();
        this.rectDrawn = new Rect();
        this.rectCurrentItem = new Rect();
        this.matrixDepth = new Matrix();
        this.matrixRotate = new Matrix();
        this.camera = new Camera();
        int i3 = copydefault + 95;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0034 A[PHI: r3 r7
  0x0034: PHI (r3v1 android.content.res.Resources) = (r3v0 android.content.res.Resources), (r3v10 android.content.res.Resources) binds: [B:8:0x0032, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0034: PHI (r7v2 android.content.res.TypedArray) = (r7v1 android.content.res.TypedArray), (r7v4 android.content.res.TypedArray) binds: [B:8:0x0032, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void initAttr(android.content.Context r6, android.util.AttributeSet r7) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.widget.date.WheelPicker.initAttr(android.content.Context, android.util.AttributeSet):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
  0x001b: PHI (r1v5 int) = (r1v4 int), (r1v11 int) binds: [B:8:0x0019, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void updateVisibleItemCount() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.common.widget.date.WheelPicker.getRequestBeneficiariesState
            int r1 = r1 + 103
            int r2 = r1 % 128
            com.huawei.common.widget.date.WheelPicker.copydefault = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L15
            int r1 = r4.visibleItemCount
            int r3 = r1 >> 2
            if (r3 != 0) goto L26
            goto L1b
        L15:
            int r1 = r4.visibleItemCount
            int r3 = r1 % 2
            if (r3 != 0) goto L26
        L1b:
            int r1 = r1 + 1
            r4.visibleItemCount = r1
            int r2 = r2 + 93
            int r1 = r2 % 128
            com.huawei.common.widget.date.WheelPicker.getRequestBeneficiariesState = r1
            int r2 = r2 % r0
        L26:
            int r1 = r4.visibleItemCount
            int r1 = r1 + r0
            r4.drawnItemCount = r1
            int r1 = r1 / r0
            r4.halfDrawnItemCount = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.widget.date.WheelPicker.updateVisibleItemCount():void");
    }

    private void computeTextSize() {
        int i;
        int i2 = 2 % 2;
        this.textMaxHeight = 0;
        this.textMaxWidth = 0;
        if (!this.isSameWidth) {
            if (isPosInRang(this.textMaxWidthPosition)) {
                this.textMaxWidth = (int) this.paint.measureText(String.valueOf(this.data.get(this.textMaxWidthPosition)));
            } else if (TextUtils.isEmpty(this.maxWidthText)) {
                Iterator it = this.data.iterator();
                int i3 = getRequestBeneficiariesState + 47;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 2 % 3;
                }
                while (!(!it.hasNext())) {
                    this.textMaxWidth = Math.max(this.textMaxWidth, (int) this.paint.measureText(String.valueOf(it.next())));
                }
            } else {
                this.textMaxWidth = (int) this.paint.measureText(this.maxWidthText);
                i = getRequestBeneficiariesState + 51;
            }
            Paint.FontMetrics fontMetrics = this.paint.getFontMetrics();
            this.textMaxHeight = (int) (fontMetrics.bottom - fontMetrics.top);
        }
        this.textMaxWidth = (int) this.paint.measureText(String.valueOf(this.data.get(0)));
        i = getRequestBeneficiariesState + 15;
        copydefault = i % 128;
        int i5 = i % 2;
        Paint.FontMetrics fontMetrics2 = this.paint.getFontMetrics();
        this.textMaxHeight = (int) (fontMetrics2.bottom - fontMetrics2.top);
    }

    private void updateItemTextAlign() {
        int i;
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 125;
        int i4 = i3 % 128;
        copydefault = i4;
        if (i3 % 2 == 0 ? (i = this.itemAlign) == 1 : (i = this.itemAlign) == 1) {
            this.paint.setTextAlign(Paint.Align.LEFT);
            return;
        }
        if (i == 2) {
            int i5 = i4 + 121;
            getRequestBeneficiariesState = i5 % 128;
            if (i5 % 2 != 0) {
                this.paint.setTextAlign(Paint.Align.RIGHT);
                return;
            }
            this.paint.setTextAlign(Paint.Align.RIGHT);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.paint.setTextAlign(Paint.Align.CENTER);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = getRequestBeneficiariesState + 51;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        int iMeasureSize = measureSize(View.MeasureSpec.getMode(i), View.MeasureSpec.getSize(i), this.textMaxWidth + getPaddingLeft() + getPaddingRight());
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i6 = this.textMaxHeight;
        int i7 = this.visibleItemCount;
        int i8 = (i6 * i7) + (this.itemSpace * (i7 - 1));
        if (this.isCurved) {
            int i9 = copydefault + 49;
            getRequestBeneficiariesState = i9 % 128;
            int i10 = i9 % 2;
            i8 = (int) (((double) (i8 * 2)) / 3.141592653589793d);
        }
        setMeasuredDimension(iMeasureSize, measureSize(mode, size, i8 + getPaddingTop() + getPaddingBottom()));
        int i11 = getRequestBeneficiariesState + 1;
        copydefault = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private int measureSize(int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = getRequestBeneficiariesState + 105;
        int i6 = i5 % 128;
        copydefault = i6;
        int i7 = i5 % 2;
        if (i == 1073741824) {
            return i2;
        }
        if (i != Integer.MIN_VALUE) {
            return i3;
        }
        int i8 = i6 + 25;
        getRequestBeneficiariesState = i8 % 128;
        if (i8 % 2 != 0) {
            return Math.min(i3, i2);
        }
        Math.min(i3, i2);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x024c  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onSizeChanged(int r34, int r35, int r36, int r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2126
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.widget.date.WheelPicker.onSizeChanged(int, int, int, int):void");
    }

    private void computeDrawnCenter() {
        int i;
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 115;
        copydefault = i3 % 128;
        if (i3 % 2 == 0 ? (i = this.itemAlign) == 1 : (i = this.itemAlign) == 0) {
            this.drawnCenterX = this.rectDrawn.left;
        } else if (i == 2) {
            this.drawnCenterX = this.rectDrawn.right;
            int i4 = getRequestBeneficiariesState + 19;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        } else {
            this.drawnCenterX = this.wheelCenterX;
        }
        this.drawnCenterY = (int) (this.wheelCenterY - ((this.paint.ascent() + this.paint.descent()) / 2.0f));
    }

    private void computeFlingLimitY() {
        int size;
        int i = 2 % 2;
        int i2 = this.selectedItemPosition;
        int i3 = this.itemHeight;
        int i4 = i2 * i3;
        if (!this.isCyclic) {
            size = ((-i3) * (this.data.size() - 1)) + i4;
        } else {
            int i5 = getRequestBeneficiariesState + 113;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            size = Integer.MIN_VALUE;
        }
        this.minFlingY = size;
        if (this.isCyclic) {
            i4 = Integer.MAX_VALUE;
        }
        this.maxFlingY = i4;
        int i6 = copydefault + 97;
        getRequestBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
    }

    private void computeIndicatorRect() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 89;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (this.isIndicator) {
            int i4 = this.indicatorSize / 2;
            int i5 = this.wheelCenterY;
            int i6 = this.halfItemHeight;
            int i7 = i5 + i6;
            int i8 = i5 - i6;
            this.rectIndicatorHead.set(this.rectDrawn.left, i7 - i4, this.rectDrawn.right, i7 + i4);
            this.rectIndicatorFoot.set(this.rectDrawn.left, i8 - i4, this.rectDrawn.right, i8 + i4);
            int i9 = getRequestBeneficiariesState + 69;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    private void computeCurrentItemRect() {
        int i = 2 % 2;
        if (!this.isCurtain) {
            int i2 = copydefault;
            int i3 = i2 + 57;
            getRequestBeneficiariesState = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this.selectedItemTextColor == -1) {
                int i4 = i2 + 119;
                getRequestBeneficiariesState = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                return;
            }
        }
        this.rectCurrentItem.set(this.rectDrawn.left, this.wheelCenterY - this.halfItemHeight, this.rectDrawn.right, this.wheelCenterY + this.halfItemHeight);
    }

    @Override
    protected void onDraw(Canvas canvas) throws Throwable {
        int i;
        int i2;
        int i3 = 2 % 2;
        OnWheelChangeListener onWheelChangeListener = this.onWheelChangeListener;
        if (onWheelChangeListener != null) {
            onWheelChangeListener.onWheelScrolled(this.scrollOffsetY);
        }
        if (this.data.size() == 0 || (i = this.itemHeight) == 0) {
            return;
        }
        int i4 = (-this.scrollOffsetY) / i;
        int i5 = this.halfDrawnItemCount;
        int i6 = i4 - i5;
        int i7 = this.selectedItemPosition + i6;
        int i8 = -i5;
        while (i7 < this.selectedItemPosition + i6 + this.drawnItemCount) {
            int i9 = copydefault + 57;
            getRequestBeneficiariesState = i9 % 128;
            int i10 = i9 % 2;
            String dataByPosition = getDataByPosition(i7);
            this.paint.setColor(this.itemTextColor);
            this.paint.setTypeface(this.typeface);
            this.paint.setStyle(Paint.Style.FILL);
            int i11 = this.drawnCenterY;
            int i12 = this.itemHeight;
            int i13 = i11 + (i8 * i12) + (this.scrollOffsetY % i12);
            int distanceToCenter = getDistanceToCenter(i13);
            if (this.hasAtmospheric && (i2 = this.drawnCenterY) != 0) {
                int iAbs = (int) ((((i2 - Math.abs(i2 - i13)) * 1.0f) / this.drawnCenterY) * 255.0f);
                if (iAbs < 0) {
                    iAbs = 0;
                }
                this.paint.setAlpha(iAbs);
            }
            if (this.isCurved) {
                i13 = this.drawnCenterY - distanceToCenter;
            }
            drawText(canvas, dataByPosition, i13);
            i7++;
            i8++;
            int i14 = copydefault + 115;
            getRequestBeneficiariesState = i14 % 128;
            int i15 = i14 % 2;
        }
        drawCurtain(canvas);
        drawIndicator(canvas);
    }

    private int getDistanceToCenter(int i) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 95;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int iComputeSpace = 0;
        if (this.isCurved) {
            int i5 = this.drawnCenterY;
            float fAbs = (((i5 - Math.abs(i5 - i)) - this.rectDrawn.top) * 1.0f) / (this.drawnCenterY - this.rectDrawn.top);
            int i6 = this.drawnCenterY;
            float f = (-(1.0f - fAbs)) * 90.0f * (i > i6 ? 1 : i < i6 ? -1 : 0);
            if (f < -90.0f) {
                int i7 = getRequestBeneficiariesState + 101;
                int i8 = i7 % 128;
                copydefault = i8;
                if (i7 % 2 != 0) {
                    int i9 = 90 / 0;
                }
                int i10 = i8 + 95;
                getRequestBeneficiariesState = i10 % 128;
                int i11 = i10 % 2;
                f = -90.0f;
            }
            float f2 = f <= 90.0f ? f : 90.0f;
            iComputeSpace = computeSpace((int) f2);
            int i12 = this.wheelCenterX;
            int i13 = this.itemAlign;
            if (i13 == 1) {
                i12 = this.rectDrawn.left;
            } else if (i13 == 2) {
                i12 = this.rectDrawn.right;
            }
            int i14 = this.wheelCenterY - iComputeSpace;
            this.camera.save();
            this.camera.rotateX(f2);
            this.camera.getMatrix(this.matrixRotate);
            this.camera.restore();
            float f3 = -i12;
            float f4 = -i14;
            this.matrixRotate.preTranslate(f3, f4);
            float f5 = i12;
            float f6 = i14;
            this.matrixRotate.postTranslate(f5, f6);
            this.camera.save();
            this.camera.translate(0.0f, 0.0f, computeDepth(r8));
            this.camera.getMatrix(this.matrixDepth);
            this.camera.restore();
            this.matrixDepth.preTranslate(f3, f4);
            this.matrixDepth.postTranslate(f5, f6);
            this.matrixRotate.postConcat(this.matrixDepth);
        }
        return iComputeSpace;
    }

    private void drawText(Canvas canvas, String str, int i) throws Throwable {
        int i2;
        long j;
        int i3;
        int i4;
        long j2;
        int i5 = 2 % 2;
        int i6 = getRequestBeneficiariesState + 109;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
            if (objCopydefault == null) {
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(67 - View.getDefaultSize(0, 0), 34 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 19695), 518907119, false, "component3", null);
            }
            int i7 = ((Field) objCopydefault).getInt(null);
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0') + 38, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 55511118, false, "component2", null);
            }
            i4 = ((Field) objCopydefault2).getInt(null);
            long j3 = i4;
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(38 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 30, (char) (Process.myPid() >> 22), 58536393, false, "component3", null);
            }
            i3 = ((Field) objCopydefault3).getInt(null);
            long j4 = 765;
            long j5 = -1;
            long j6 = j5 ^ 3385519386780289722L;
            long j7 = j5 ^ (-2592815933136085298L);
            long j8 = j6 | j7;
            long j9 = i;
            long j10 = j9 ^ j5;
            j = (((long) (-1529)) * 3385519386780289722L) + (((long) (-764)) * (-2592815933136085298L)) + ((((j8 | j10) ^ j5) | (((j6 | (-2592815933136085298L)) | j9) ^ j5) | (((j7 | 3385519386780289722L) | j9) ^ j5)) * j4) + (((long) 1530) * ((j8 ^ j5) | ((j6 | j10) ^ j5))) + (j4 * ((j5 ^ ((j7 | j10) | 3385519386780289722L)) | ((j6 | j9) ^ j5)));
            i2 = i7;
            j2 = j3;
        } else {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
            if (objCopydefault4 == null) {
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(67 - TextUtils.getOffsetBefore("", 0), 33 - Color.red(0), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 19695), 518907119, false, "component3", null);
            }
            int i8 = ((Field) objCopydefault4).getInt(null);
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
            if (objCopydefault5 == null) {
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0, 0) + 37, 30 - ExpandableListView.getPackedPositionGroup(0L), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 55511118, false, "component2", null);
            }
            int i9 = ((Field) objCopydefault5).getInt(null);
            long j11 = i9;
            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
            if (objCopydefault6 == null) {
                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatDelay() >> 16) + 37, 29 - MotionEvent.axisFromString(""), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 58536393, false, "component3", null);
            }
            int i10 = ((Field) objCopydefault6).getInt(null);
            i2 = i8;
            long j12 = -1;
            long j13 = j12 ^ 833245796896798831L;
            long j14 = j12 ^ (-40542343252594407L);
            long j15 = i;
            long j16 = 490;
            j = (((long) 491) * 833245796896798831L) + (((long) (-489)) * (-40542343252594407L)) + (((long) (-490)) * (j13 | j14 | (j15 ^ j12))) + ((((j14 | 833245796896798831L) ^ j12) | (j12 ^ (j14 | j15))) * j16) + (j16 * j13);
            i3 = i10;
            i4 = i9;
            j2 = j11;
        }
        int i11 = 0;
        while (true) {
            for (int i12 = 0; i12 != 8; i12++) {
                int i13 = getRequestBeneficiariesState + 65;
                copydefault = i13 % 128;
                int i14 = i13 % 2;
                i3 = (((((int) (j2 >> i12)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
            }
            if (i11 != 0) {
                break;
            }
            i11++;
            j2 = j;
        }
        if (i3 != i2) {
            Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
            if (objCopydefault7 == null) {
                objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0) + 68, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 33, (char) (19696 - View.MeasureSpec.getMode(0)), 1457147715, false, "copydefault", null);
            }
            Object obj = ((Field) objCopydefault7).get(null);
            long j17 = -1;
            long j18 = 0;
            long j19 = (((long) (i4 ^ i2)) & ((((long) 0) << 32) | (j17 - ((j17 >> 63) << 32)))) | (((long) 1) << 32) | (j18 - ((j18 >> 63) << 32));
            try {
                Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault8 == null) {
                    objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getSize(0) + 6618, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 42, (char) TextUtils.getCapsMode("", 0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault8).invoke(null, null);
                Object[] objArr = {-1087185222, Long.valueOf(j19), obj, null, false, false};
                Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault9 == null) {
                    objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.getDeadChar(0, 0) + 6562, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 56, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault9).invoke(objInvoke, objArr);
                throw new RuntimeException(String.valueOf(i4));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (this.selectedItemTextColor != -1) {
            L.d("draw", "drawText start ");
            canvas.save();
            if (this.isCurved) {
                canvas.concat(this.matrixRotate);
            }
            canvas.clipRect(this.rectCurrentItem, Region.Op.DIFFERENCE);
            float f = i;
            canvas.drawText(str, this.drawnCenterX, f, this.paint);
            canvas.restore();
            this.paint.setColor(this.selectedItemTextColor);
            this.paint.setTypeface(this.selectedTypeface);
            canvas.save();
            if (this.isCurved) {
                int i15 = copydefault + 101;
                getRequestBeneficiariesState = i15 % 128;
                if (i15 % 2 == 0) {
                    canvas.concat(this.matrixRotate);
                    int i16 = 95 / 0;
                } else {
                    canvas.concat(this.matrixRotate);
                }
            }
            canvas.clipRect(this.rectCurrentItem);
            canvas.drawText(str, this.drawnCenterX, f, this.paint);
            canvas.restore();
            L.d("draw", "drawText finish ");
            return;
        }
        L.d("draw", "drawText start ");
        canvas.save();
        canvas.clipRect(this.rectDrawn);
        if (this.isCurved) {
            canvas.concat(this.matrixRotate);
        }
        canvas.drawText(str, this.drawnCenterX, i, this.paint);
        canvas.restore();
        L.d("draw", "drawText finish ");
    }

    private String getDataByPosition(int i) {
        int i2 = 2 % 2;
        if (!this.isCyclic) {
            if (!isPosInRang(i)) {
                return "";
            }
            int i3 = copydefault + 29;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            return String.valueOf(this.data.get(i));
        }
        int i5 = getRequestBeneficiariesState + 37;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        int size = i % this.data.size();
        if (size < 0) {
            size += this.data.size();
        }
        String strValueOf = String.valueOf(this.data.get(size));
        int i7 = copydefault + 11;
        getRequestBeneficiariesState = i7 % 128;
        int i8 = i7 % 2;
        return strValueOf;
    }

    private void drawCurtain(Canvas canvas) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 19;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 7 / 0;
            if (!this.isCurtain) {
                return;
            }
        } else if (!this.isCurtain) {
            return;
        }
        int i5 = i2 + 1;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            this.paint.setColor(this.curtainColor);
            this.paint.setTypeface(this.typeface);
            this.paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(this.rectCurrentItem, this.paint);
            return;
        }
        this.paint.setColor(this.curtainColor);
        this.paint.setTypeface(this.typeface);
        this.paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(this.rectCurrentItem, this.paint);
        int i6 = 52 / 0;
    }

    private void drawIndicator(Canvas canvas) {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.isIndicator) {
            this.paint.setColor(this.indicatColor);
            this.paint.setTypeface(this.typeface);
            this.paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(this.rectIndicatorHead, this.paint);
            canvas.drawRect(this.rectIndicatorFoot, this.paint);
        }
        int i3 = copydefault + 79;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean isPosInRang(int r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            if (r4 < 0) goto L21
            int r1 = com.huawei.common.widget.date.WheelPicker.getRequestBeneficiariesState
            int r1 = r1 + 43
            int r2 = r1 % 128
            com.huawei.common.widget.date.WheelPicker.copydefault = r2
            int r1 = r1 % r0
            java.util.List r1 = r3.data
            int r1 = r1.size()
            if (r4 >= r1) goto L21
            int r4 = com.huawei.common.widget.date.WheelPicker.copydefault
            int r4 = r4 + 101
            int r1 = r4 % 128
            com.huawei.common.widget.date.WheelPicker.getRequestBeneficiariesState = r1
            int r4 = r4 % r0
            r4 = 1
            goto L22
        L21:
            r4 = 0
        L22:
            int r1 = com.huawei.common.widget.date.WheelPicker.getRequestBeneficiariesState
            int r1 = r1 + 93
            int r2 = r1 % 128
            com.huawei.common.widget.date.WheelPicker.copydefault = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L2e
            return r4
        L2e:
            r4 = 0
            r4.hashCode()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.widget.date.WheelPicker.isPosInRang(int):boolean");
    }

    private int computeSpace(int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 115;
        getRequestBeneficiariesState = i3 % 128;
        return (int) ((i3 % 2 == 0 ? Math.sin(Math.toRadians(i)) : Math.sin(Math.toRadians(i))) * ((double) this.halfWheelHeight));
    }

    private int computeDepth(int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 101;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.halfWheelHeight;
        return (int) (i4 == 0 ? ((double) i5) % (Math.cos(Math.toRadians(i)) * ((double) this.halfWheelHeight)) : ((double) i5) - (Math.cos(Math.toRadians(i)) * ((double) this.halfWheelHeight)));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 5;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int action = motionEvent.getAction();
            if (action == 0) {
                dealDown(motionEvent);
            } else if (action == 1) {
                dealUp(motionEvent);
            } else if (action != 2) {
                int i3 = copydefault + 1;
                int i4 = i3 % 128;
                getRequestBeneficiariesState = i4;
                int i5 = i3 % 2;
                if (action != 3) {
                    int i6 = i4 + 47;
                    copydefault = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 5 / 2;
                    }
                } else {
                    dealCancel();
                }
            } else {
                dealMove(motionEvent);
            }
            return true;
        }
        motionEvent.getAction();
        throw null;
    }

    private void dealCancel() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 65;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getParent();
            obj.hashCode();
            throw null;
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            int i3 = getRequestBeneficiariesState + 21;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            velocityTracker.recycle();
            this.velocityTracker = null;
            int i5 = getRequestBeneficiariesState + 65;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private void dealUp(MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        if (getParent() != null) {
            int i4 = getRequestBeneficiariesState + 51;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        if (!this.isClick || this.isForceFinishScroll) {
            this.velocityTracker.addMovement(motionEvent);
            this.velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
            this.isForceFinishScroll = false;
            int yVelocity = (int) this.velocityTracker.getYVelocity();
            if (this.itemHeight == 0) {
                return;
            }
            if (Math.abs(yVelocity) > this.minimumVelocity) {
                this.scroller.fling(0, this.scrollOffsetY, 0, yVelocity, 0, 0, this.minFlingY, this.maxFlingY);
                Scroller scroller = this.scroller;
                scroller.setFinalY(scroller.getFinalY() + computeDistanceToEndPoint(this.scroller.getFinalY() % this.itemHeight));
            } else {
                Scroller scroller2 = this.scroller;
                int i6 = this.scrollOffsetY;
                scroller2.startScroll(0, i6, 0, computeDistanceToEndPoint(i6 % this.itemHeight));
            }
            if (!this.isCyclic) {
                int i7 = getRequestBeneficiariesState + 125;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
                int finalY = this.scroller.getFinalY();
                int i9 = this.maxFlingY;
                if (finalY > i9) {
                    this.scroller.setFinalY(i9);
                } else {
                    int finalY2 = this.scroller.getFinalY();
                    int i10 = this.minFlingY;
                    if (finalY2 < i10) {
                        this.scroller.setFinalY(i10);
                    }
                }
            }
            this.handler.post(this);
            VelocityTracker velocityTracker = this.velocityTracker;
            if (velocityTracker != null) {
                int i11 = getRequestBeneficiariesState + 69;
                copydefault = i11 % 128;
                int i12 = i11 % 2;
                velocityTracker.recycle();
                this.velocityTracker = null;
            }
        }
    }

    private void dealMove(MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = copydefault + 33;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        if (Math.abs(this.downPointY - motionEvent.getY()) < this.touchSlop) {
            this.isClick = true;
            int i4 = copydefault + 77;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 64 / 0;
                return;
            }
            return;
        }
        this.isClick = false;
        this.velocityTracker.addMovement(motionEvent);
        OnWheelChangeListener onWheelChangeListener = this.onWheelChangeListener;
        if (onWheelChangeListener != null) {
            onWheelChangeListener.onWheelScrollStateChanged(1);
        }
        float y = motionEvent.getY() - this.lastPointY;
        if (Math.abs(y) < 1.0f) {
            int i6 = getRequestBeneficiariesState + 115;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
        } else {
            this.scrollOffsetY = (int) (this.scrollOffsetY + y);
            this.lastPointY = (int) motionEvent.getY();
            invalidate();
        }
    }

    private void dealDown(MotionEvent motionEvent) {
        int i = 2 % 2;
        this.isTouchTriggered = true;
        if (getParent() != null) {
            int i2 = getRequestBeneficiariesState + 113;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (!this.scroller.isFinished()) {
            int i4 = copydefault + 105;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 == 0) {
                this.isForceFinishScroll = false;
            } else {
                this.isForceFinishScroll = true;
            }
            this.scroller.abortAnimation();
        }
        int y = (int) motionEvent.getY();
        this.lastPointY = y;
        this.downPointY = y;
    }

    private int computeDistanceToEndPoint(int i) {
        int i2;
        int i3 = 2 % 2;
        Object obj = null;
        if (Math.abs(i) > this.halfItemHeight) {
            if (this.scrollOffsetY < 0) {
                int i4 = copydefault + 87;
                getRequestBeneficiariesState = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                i2 = -this.itemHeight;
            } else {
                i2 = this.itemHeight;
            }
            return i2 - i;
        }
        int i5 = -i;
        int i6 = getRequestBeneficiariesState + 99;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        obj.hashCode();
        throw null;
    }

    @Override
    public void run() {
        int i = 2 % 2;
        List list = this.data;
        if (list != null) {
            int i2 = copydefault + 65;
            getRequestBeneficiariesState = i2 % 128;
            if (i2 % 2 == 0) {
                list.size();
                throw null;
            }
            if (list.size() == 0) {
                return;
            }
            if (this.scroller.isFinished() && !this.isForceFinishScroll) {
                int i3 = getRequestBeneficiariesState + 11;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                int i4 = this.itemHeight;
                if (i4 == 0) {
                    return;
                }
                int size = (((-this.scrollOffsetY) / i4) + this.selectedItemPosition) % this.data.size();
                if (size < 0) {
                    size += this.data.size();
                }
                this.currentItemPosition = size;
                OnItemSelectedListener onItemSelectedListener = this.onItemSelectedListener;
                if (onItemSelectedListener != null && this.isTouchTriggered) {
                    onItemSelectedListener.onItemSelected(this, this.data.get(size), size);
                    int i5 = copydefault + 47;
                    getRequestBeneficiariesState = i5 % 128;
                    int i6 = i5 % 2;
                }
                OnWheelChangeListener onWheelChangeListener = this.onWheelChangeListener;
                if (onWheelChangeListener != null) {
                    int i7 = copydefault + 107;
                    int i8 = i7 % 128;
                    getRequestBeneficiariesState = i8;
                    int i9 = i7 % 2;
                    if (this.isTouchTriggered) {
                        int i10 = i8 + 11;
                        copydefault = i10 % 128;
                        int i11 = i10 % 2;
                        onWheelChangeListener.onWheelSelected(size);
                        this.onWheelChangeListener.onWheelScrollStateChanged(0);
                    }
                }
            }
            if (this.scroller.computeScrollOffset()) {
                OnWheelChangeListener onWheelChangeListener2 = this.onWheelChangeListener;
                if (onWheelChangeListener2 != null) {
                    onWheelChangeListener2.onWheelScrollStateChanged(2);
                    int i12 = getRequestBeneficiariesState + 53;
                    copydefault = i12 % 128;
                    int i13 = i12 % 2;
                }
                this.scrollOffsetY = this.scroller.getCurrY();
                postInvalidate();
                this.handler.postDelayed(this, 16L);
            }
        }
    }

    @Override
    public int getItemVisibleCount() {
        int i = 2 % 2;
        int i2 = copydefault + 3;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        int i5 = this.visibleItemCount;
        int i6 = i3 + 85;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    @Override
    public void setItemVisibleCount(int i) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 83;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.visibleItemCount = i;
        updateVisibleItemCount();
        requestLayout();
        int i5 = getRequestBeneficiariesState + 81;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public boolean isCycle() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 5;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isCyclic;
        int i5 = i2 + 67;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    @Override
    public void setCycle(boolean z) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 3;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            this.isCyclic = z;
            computeFlingLimitY();
            invalidate();
            int i3 = copydefault + 69;
            getRequestBeneficiariesState = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 18 / 0;
                return;
            }
            return;
        }
        this.isCyclic = z;
        computeFlingLimitY();
        invalidate();
        throw null;
    }

    @Override
    public void setOnItemSelectedListener(OnItemSelectedListener onItemSelectedListener) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 111;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        this.onItemSelectedListener = onItemSelectedListener;
        int i5 = i2 + 117;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public int getItemSelectedPosition() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 13;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.selectedItemPosition;
        int i6 = i2 + 29;
        getRequestBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override
    public void setItemSelectedPosition(int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 33;
        getRequestBeneficiariesState = i3 % 128;
        setSelectedItemPosition(i, i3 % 2 != 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r5 == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        r5 = com.huawei.common.widget.date.WheelPicker.getRequestBeneficiariesState + 115;
        com.huawei.common.widget.date.WheelPicker.copydefault = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (r4.isCyclic == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (java.lang.Math.abs(r5) <= (r6 / 2)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (r5 <= 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        r6 = -r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        r5 = r5 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        r6 = r4.scroller;
        r6.startScroll(0, r6.getCurrY(), 0, (-r5) * r4.itemHeight);
        r4.handler.post(r4);
        r5 = com.huawei.common.widget.date.WheelPicker.copydefault + 67;
        com.huawei.common.widget.date.WheelPicker.getRequestBeneficiariesState = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        if (r5 == 0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSelectedItemPosition(int r5, boolean r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.common.widget.date.WheelPicker.copydefault
            int r2 = r1 + 121
            int r3 = r2 % 128
            com.huawei.common.widget.date.WheelPicker.getRequestBeneficiariesState = r3
            int r2 = r2 % r0
            r2 = 0
            r4.isTouchTriggered = r2
            if (r6 == 0) goto L7c
            int r1 = r1 + 19
            int r6 = r1 % 128
            com.huawei.common.widget.date.WheelPicker.getRequestBeneficiariesState = r6
            int r1 = r1 % r0
            android.widget.Scroller r6 = r4.scroller
            boolean r6 = r6.isFinished()
            if (r6 == 0) goto L7c
            int r6 = com.huawei.common.widget.date.WheelPicker.copydefault
            int r6 = r6 + 63
            int r1 = r6 % 128
            com.huawei.common.widget.date.WheelPicker.getRequestBeneficiariesState = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L39
            java.util.List r6 = r4.getData()
            int r6 = r6.size()
            int r1 = r4.currentItemPosition
            int r5 = r5 >> r1
            if (r5 != 0) goto L50
            goto L46
        L39:
            java.util.List r6 = r4.getData()
            int r6 = r6.size()
            int r1 = r4.currentItemPosition
            int r5 = r5 - r1
            if (r5 != 0) goto L50
        L46:
            int r5 = com.huawei.common.widget.date.WheelPicker.getRequestBeneficiariesState
            int r5 = r5 + 115
            int r6 = r5 % 128
            com.huawei.common.widget.date.WheelPicker.copydefault = r6
            int r5 = r5 % r0
            return
        L50:
            boolean r1 = r4.isCyclic
            if (r1 == 0) goto L60
            int r1 = java.lang.Math.abs(r5)
            int r3 = r6 / 2
            if (r1 <= r3) goto L60
            if (r5 <= 0) goto L5f
            int r6 = -r6
        L5f:
            int r5 = r5 + r6
        L60:
            android.widget.Scroller r6 = r4.scroller
            int r1 = r6.getCurrY()
            int r5 = -r5
            int r3 = r4.itemHeight
            int r5 = r5 * r3
            r6.startScroll(r2, r1, r2, r5)
            android.os.Handler r5 = r4.handler
            r5.post(r4)
            int r5 = com.huawei.common.widget.date.WheelPicker.copydefault
            int r5 = r5 + 67
            int r6 = r5 % 128
            com.huawei.common.widget.date.WheelPicker.getRequestBeneficiariesState = r6
            int r5 = r5 % r0
            goto Lb1
        L7c:
            android.widget.Scroller r6 = r4.scroller
            boolean r6 = r6.isFinished()
            if (r6 != 0) goto L92
            int r6 = com.huawei.common.widget.date.WheelPicker.getRequestBeneficiariesState
            int r6 = r6 + 95
            int r1 = r6 % 128
            com.huawei.common.widget.date.WheelPicker.copydefault = r1
            int r6 = r6 % r0
            android.widget.Scroller r6 = r4.scroller
            r6.abortAnimation()
        L92:
            java.util.List r6 = r4.data
            int r6 = r6.size()
            int r6 = r6 + (-1)
            int r5 = java.lang.Math.min(r5, r6)
            int r5 = java.lang.Math.max(r5, r2)
            r4.scrollOffsetY = r2
            r4.currentItemPosition = r5
            r4.selectedItemPosition = r5
            r4.computeFlingLimitY()
            r4.requestLayout()
            r4.invalidate()
        Lb1:
            int r5 = com.huawei.common.widget.date.WheelPicker.getRequestBeneficiariesState
            int r5 = r5 + 47
            int r6 = r5 % 128
            com.huawei.common.widget.date.WheelPicker.copydefault = r6
            int r5 = r5 % r0
            if (r5 != 0) goto Lbd
            return
        Lbd:
            r5 = 0
            r5.hashCode()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.widget.date.WheelPicker.setSelectedItemPosition(int, boolean):void");
    }

    @Override
    public int getItemCurrentPosition() {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.currentItemPosition;
        }
        throw null;
    }

    @Override
    public List getData() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 3;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        List list = this.data;
        int i4 = i2 + 95;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setData(java.util.List r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.common.widget.date.WheelPicker.getRequestBeneficiariesState
            int r1 = r1 + 17
            int r2 = r1 % 128
            com.huawei.common.widget.date.WheelPicker.copydefault = r2
            int r1 = r1 % r0
            r3.data = r4
            int r1 = r3.selectedItemPosition
            int r2 = r4.size()
            int r2 = r2 + (-1)
            if (r1 > r2) goto L47
            int r1 = com.huawei.common.widget.date.WheelPicker.getRequestBeneficiariesState
            int r1 = r1 + 29
            int r2 = r1 % 128
            com.huawei.common.widget.date.WheelPicker.copydefault = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L2e
            int r1 = r3.currentItemPosition
            int r2 = r4.size()
            int r2 = r2 % 1
            if (r1 <= r2) goto L39
            goto L47
        L2e:
            int r1 = r3.currentItemPosition
            int r2 = r4.size()
            int r2 = r2 + (-1)
            if (r1 <= r2) goto L39
            goto L47
        L39:
            int r4 = r3.currentItemPosition
            r3.selectedItemPosition = r4
            int r4 = com.huawei.common.widget.date.WheelPicker.copydefault
            int r4 = r4 + 121
            int r1 = r4 % 128
            com.huawei.common.widget.date.WheelPicker.getRequestBeneficiariesState = r1
            int r4 = r4 % r0
            goto L51
        L47:
            int r4 = r4.size()
            int r4 = r4 + (-1)
            r3.currentItemPosition = r4
            r3.selectedItemPosition = r4
        L51:
            r4 = 0
            r3.scrollOffsetY = r4
            r3.computeTextSize()
            r3.computeFlingLimitY()
            r3.requestLayout()
            r3.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.widget.date.WheelPicker.setData(java.util.List):void");
    }

    @Override
    public void setSameWidth(boolean z) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 65;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            this.isSameWidth = z;
            computeTextSize();
            requestLayout();
            invalidate();
            int i3 = 67 / 0;
            return;
        }
        this.isSameWidth = z;
        computeTextSize();
        requestLayout();
        invalidate();
    }

    @Override
    public boolean isSameWidth() {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.isSameWidth;
        }
        throw null;
    }

    @Override
    public void setOnWheelChangeListener(OnWheelChangeListener onWheelChangeListener) {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        this.onWheelChangeListener = onWheelChangeListener;
        int i5 = i3 + 13;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override
    public String getMaximumWidthText() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 77;
        getRequestBeneficiariesState = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.maxWidthText;
        int i4 = i2 + 47;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public void setMaximumWidthText(String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 25;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.maxWidthText = str;
        computeTextSize();
        requestLayout();
        invalidate();
        int i4 = copydefault + 45;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public int getMaximumWidthTextPosition() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 83;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = this.textMaxWidthPosition;
        int i6 = i3 + 33;
        getRequestBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override
    public void setMaximumWidthTextPosition(int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 31;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            this.textMaxWidthPosition = i;
            computeTextSize();
            requestLayout();
            invalidate();
            int i4 = copydefault + 27;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.textMaxWidthPosition = i;
        computeTextSize();
        requestLayout();
        invalidate();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public int getSelectedItemTextColor() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 111;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = this.selectedItemTextColor;
        int i6 = i3 + 23;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void setSelectedItemTextColor(int i) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 59;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.selectedItemTextColor = i;
        computeCurrentItemRect();
        invalidate();
        int i5 = copydefault + 81;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public int getItemTextColor() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 121;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.itemTextColor;
        int i5 = i2 + 39;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override
    public void setItemTextColor(int i) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 83;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            this.itemTextColor = i;
            invalidate();
        } else {
            this.itemTextColor = i;
            invalidate();
            throw null;
        }
    }

    @Override
    public int getItemTextSize() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 115;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.itemTextSize;
        int i6 = i2 + 23;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 49 / 0;
        }
        return i5;
    }

    @Override
    public void setItemTextSize(int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 111;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 == 0) {
            this.itemTextSize = i;
            this.paint.setTextSize(i);
            computeTextSize();
            requestLayout();
            invalidate();
            int i4 = 10 / 0;
            return;
        }
        this.itemTextSize = i;
        this.paint.setTextSize(i);
        computeTextSize();
        requestLayout();
        invalidate();
    }

    @Override
    public int getItemSpace() {
        int i = 2 % 2;
        int i2 = copydefault + 107;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.itemSpace;
        }
        throw null;
    }

    @Override
    public void setItemSpace(int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 121;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            this.itemSpace = i;
            requestLayout();
            invalidate();
            int i4 = getRequestBeneficiariesState + 11;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.itemSpace = i;
        requestLayout();
        invalidate();
        throw null;
    }

    @Override
    public void setIndicator(boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        this.isIndicator = z;
        computeIndicatorRect();
        invalidate();
        int i4 = copydefault + 83;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
    }

    @Override
    public boolean isIndicator() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 13;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.isIndicator;
        int i4 = i2 + 63;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return z;
    }

    @Override
    public int getIndicatorSize() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 117;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.indicatorSize;
        int i5 = i2 + 43;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 36 / 0;
        }
        return i4;
    }

    @Override
    public void setIndicatorSize(int i) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 77;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            this.indicatorSize = i;
            computeIndicatorRect();
            invalidate();
            int i4 = copydefault + 5;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 84 / 0;
                return;
            }
            return;
        }
        this.indicatorSize = i;
        computeIndicatorRect();
        invalidate();
        throw null;
    }

    @Override
    public int getIndicatColor() {
        int i = 2 % 2;
        int i2 = copydefault + 123;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        int i5 = this.indicatColor;
        int i6 = i3 + 103;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override
    public void setIndicColor(int i) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 47;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            this.indicatColor = i;
            invalidate();
            int i4 = 0 / 0;
        } else {
            this.indicatColor = i;
            invalidate();
        }
        int i5 = getRequestBeneficiariesState + 19;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public void setCurtain(boolean z) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 21;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.isCurtain = z;
        computeCurrentItemRect();
        invalidate();
        int i4 = copydefault + 71;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
    }

    @Override
    public boolean hasCurtain() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 13;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isCurtain;
        int i5 = i2 + 5;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    @Override
    public void setCurtainColor(int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 121;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            this.curtainColor = i;
            invalidate();
        } else {
            this.curtainColor = i;
            invalidate();
            throw null;
        }
    }

    @Override
    public int getCurtainColor() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 89;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = this.curtainColor;
        int i6 = i3 + 23;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public boolean hasAtmospheric() {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.hasAtmospheric;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void setAtmospheric(boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        this.hasAtmospheric = z;
        invalidate();
        int i4 = copydefault + 71;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void setCurved(boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        getRequestBeneficiariesState = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.isCurved = z;
            requestLayout();
            invalidate();
            int i3 = copydefault + 103;
            getRequestBeneficiariesState = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.isCurved = z;
        requestLayout();
        invalidate();
        obj.hashCode();
        throw null;
    }

    @Override
    public boolean isCurved() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 125;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.isCurved;
        int i4 = i3 + 63;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
        return z;
    }

    @Override
    public int getItemAlign() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 1;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = this.itemAlign;
        int i5 = i3 + 19;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override
    public void setItemAlign(int i) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 117;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            this.itemAlign = i;
            updateItemTextAlign();
            computeDrawnCenter();
            invalidate();
            int i4 = copydefault + 37;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 14 / 0;
                return;
            }
            return;
        }
        this.itemAlign = i;
        updateItemTextAlign();
        computeDrawnCenter();
        invalidate();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public Typeface getTypeface() {
        int i = 2 % 2;
        Paint paint = this.paint;
        Object obj = null;
        if (paint == null) {
            return null;
        }
        int i2 = getRequestBeneficiariesState + 57;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            paint.getTypeface();
            obj.hashCode();
            throw null;
        }
        Typeface typeface = paint.getTypeface();
        int i3 = getRequestBeneficiariesState + 19;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return typeface;
    }

    @Override
    public final void setTypeface(Typeface typeface) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 41;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.typeface = typeface;
        Paint paint = this.paint;
        if (paint != null) {
            int i5 = i3 + 85;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            paint.setTypeface(typeface);
        }
        computeTextSize();
        requestLayout();
        invalidate();
    }

    public Typeface getSelectedTypeface() {
        Typeface typeface;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 47;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 == 0) {
            typeface = this.selectedTypeface;
            int i4 = 36 / 0;
        } else {
            typeface = this.selectedTypeface;
        }
        int i5 = i2 + 49;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return typeface;
    }

    public void setSelectedTypeface(Typeface typeface) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 67;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        this.selectedTypeface = typeface;
        int i5 = i2 + 85;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
    }
}
