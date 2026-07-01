package com.huawei.common.widget.code;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelAll;

public class CodeInputView extends SafeKeyboardEditText {
    private static final long CURSOR_DURATION = 500;
    public static final String EDIT_TEXT_STYLE_ONE_RECTANGLE = "3";
    public static final String EDIT_TEXT_STYLE_RECTANGLE = "1";
    public static final String EDIT_TEXT_STYLE_UNDERLINE = "2";
    private static final DigitsKeyListener KEY_LISTENER;
    private static char[] ShareDataUIState = null;
    private static final String TAG = "BaseCodeInputView";
    private static char component1;
    private static int component2;
    private static long component3;
    private static int copy;
    private static char copydefault;
    private int cursorColor;
    private float cursorWidth;
    private String editTextStyle;
    private String hintText;
    private int hintTextColor;
    private float hintTextSize;
    private boolean isCursorShowing;
    private boolean isItemSquare;
    private Paint mBgPaint;
    private int mCurrentPosition;
    private Paint mCursorPaint;
    private Timer mCursorTimer;
    private TimerTask mCursorTimerTask;
    private int mEmptyBgColor;
    private int mEmptyStrokeColor;
    private int mErrorStrokeColor;
    private int mFocusStrokeColor;
    private float mInputItemHeight;
    private float mInputItemWidth;
    private OnInputFinishListener mOnInputFinishListener;
    private float mRectAngle;
    private final RectF mRectF;
    private float mRectH;
    private float mRectMargin;
    private float mRectW;
    private int mStrokeColor;
    private Paint mStrokePaint;
    private float mStrokeWidth;
    private int maxCount;
    private float pointRadius;
    private float rectPadding;
    private boolean showError;
    private boolean showText;
    private final Rect textRect;
    private static final byte[] $$c = {Ascii.GS, -26, 91, 68};
    private static final int $$f = 154;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {59, -24, -77, -23, -38, -24, -29, -25, -25, -17, -35, -32, 39};
    private static final int $$e = 130;
    private static final byte[] $$a = {1, -128, 109, -128, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -39, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -40, 39, Ascii.US, 7, 38, 34};
    private static final int $$b = 0;
    private static int component4 = 1;
    private static int getAsAtTimestamp = 0;
    private static int equals = 1;

    public interface OnInputFinishListener {
        void isFinish(boolean z);

        default void onTextChange(String str) {
        }

        void onTextFinish(String str);
    }

    private static String $$g(int i, short s, int i2) {
        byte[] bArr = $$c;
        int i3 = s + 98;
        int i4 = 3 - (i * 3);
        int i5 = i2 * 4;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        int i7 = -1;
        if (bArr == null) {
            i3 += i6;
        }
        while (true) {
            i7++;
            i4++;
            bArr2[i7] = (byte) i3;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            i3 += bArr[i4];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 4
            int r7 = 10 - r7
            int r9 = r9 * 9
            int r9 = r9 + 4
            byte[] r0 = com.huawei.common.widget.code.CodeInputView.$$a
            int r8 = r8 * 2
            int r8 = r8 + 99
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r8 = r9
            r4 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            r6 = r9
            r9 = r8
            r8 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L2f:
            int r9 = r9 + 1
            int r8 = r8 + r3
            int r8 = r8 + (-27)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.widget.code.CodeInputView.a(short, byte, byte, java.lang.Object[]):void");
    }

    private static void d(int i, short s, byte b2, Object[] objArr) {
        int i2 = b2 * 2;
        byte[] bArr = $$d;
        int i3 = (i * 4) + 4;
        int i4 = 99 - (s * 4);
        byte[] bArr2 = new byte[10 - i2];
        int i5 = 9 - i2;
        int i6 = -1;
        if (bArr == null) {
            i4 = (i5 + (-i4)) - 26;
            i3++;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i4 = (i4 + (-bArr[i3])) - 26;
            i3++;
            i6 = i7;
        }
    }

    private static void c(char[] cArr, char[] cArr2, char c2, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        int i5 = $10 + 55;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (iNotificationSideChannel.copydefault < length3) {
            int i7 = $10 + 37;
            $11 = i7 % 128;
            int i8 = i7 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int iLastIndexOf = 4036 - TextUtils.lastIndexOf("", '0', i4, i4);
                    int iAlpha = Color.alpha(i4) + 31;
                    char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 19181);
                    byte b2 = (byte) i4;
                    byte b3 = (byte) (b2 + 1);
                    String str$$g = $$g(b2, b3, (byte) (b3 - 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf, iAlpha, cKeyCodeFromString, 1912513118, false, str$$g, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    int keyRepeatTimeout = 7567 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int iGreen = 11 - Color.green(i4);
                    char cIndexOf = (char) TextUtils.indexOf("", "");
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i4] = Object.class;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatTimeout, iGreen, cIndexOf, 2006389106, false, "e", clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                int i9 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i9);
                objArr4[i4] = iNotificationSideChannel;
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) i4;
                    byte b5 = b4;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getEdgeSlop() >> 16) + 2459, 28 - View.resolveSize(i4, i4), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 931716605, false, $$g(b4, b5, b5), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7567 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.indexOf((CharSequence) "", '0') + 12, (char) (TextUtils.lastIndexOf("", '0', 0) + 1), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component3 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component2) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) copydefault) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                i2 = 2;
                i4 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i10 = $11 + 105;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str;
    }

    public CodeInputView(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        this.maxCount = 6;
        this.isCursorShowing = false;
        this.mRectF = new RectF();
        this.textRect = new Rect();
        this.editTextStyle = "1";
        this.isItemSquare = true;
        init(attributeSet);
        initEvent();
    }

    private static void b(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3;
        int i4 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr3 = ShareDataUIState;
        long j = 0;
        Object obj2 = null;
        if (cArr3 != null) {
            int i5 = $11 + 115;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                int i6 = $10 + 69;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7422 - (Process.myTid() >> 22), (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 14, (char) (ExpandableListView.getPackedPositionChild(j) + 64292), 682917265, false, "v", new Class[]{Integer.TYPE});
                        }
                        cArr2[i3] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        i3 >>>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Color.rgb(0, 0, 0) + 16784638, ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.DLE, (char) (64291 - (ViewConfiguration.getLongPressTimeout() >> 16)), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr2[i3] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i3++;
                }
                j = 0;
            }
            cArr3 = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(component1)};
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7421 - ((byte) KeyEvent.getModifierMetaStateMask()), 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (64291 - (ViewConfiguration.getPressedStateDuration() >> 16)), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i7 = $11 + 25;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cancelall.component2 = 1;
            } else {
                cancelall.component2 = 0;
            }
            while (cancelall.component2 < i2) {
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    int i8 = $10 + 119;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    int i10 = $10 + 67;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    obj = obj2;
                } else {
                    Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7118 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 15, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 44464), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue() == cancelall.getAsAtTimestamp) {
                        Object[] objArr6 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault5 == null) {
                            byte b3 = (byte) 0;
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(View.combineMeasuredStates(0, 0) + 2944, ImageFormat.getBitsPerPixel(0) + 25, (char) (27637 - TextUtils.getCapsMode("", 0, 0)), 794909189, false, $$g(b3, (byte) (b3 | Ascii.NAK), b3), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objCopydefault5).invoke(null, objArr6)).intValue();
                        int i12 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr3[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr3[i12];
                    } else {
                        obj = null;
                        if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            int i13 = $10 + 81;
                            $11 = i13 % 128;
                            int i14 = i13 % 2;
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i15 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i16 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr3[i15];
                            cArr4[cancelall.component2 + 1] = cArr3[i16];
                        } else {
                            int i17 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i18 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr3[i17];
                            cArr4[cancelall.component2 + 1] = cArr3[i18];
                            int i19 = $11 + 125;
                            $10 = i19 % 128;
                            int i20 = i19 % 2;
                        }
                    }
                }
                cancelall.component2 += 2;
                obj2 = obj;
            }
        }
        for (int i21 = 0; i21 < i; i21++) {
            int i22 = $11 + 61;
            $10 = i22 % 128;
            int i23 = i22 % 2;
            cArr4[i21] = (char) (cArr4[i21] ^ 13722);
        }
        String str = new String(cArr4);
        int i24 = $10 + 43;
        $11 = i24 % 128;
        int i25 = i24 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0212  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void initEvent() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2091
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.widget.code.CodeInputView.initEvent():void");
    }

    static {
        copy = 0;
        ShareDataUIState();
        component1();
        KEY_LISTENER = new DigitsKeyListener() {
            @Override
            public int getInputType() {
                return 2;
            }
        };
        int i = component4 + 47;
        copy = i % 128;
        int i2 = i % 2;
    }

    private void init(AttributeSet attributeSet) {
        int i = 2 % 2;
        setBackground(null);
        initAttr(attributeSet);
        setCursorVisible(false);
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.maxCount)});
        initCursorTimer();
        initPaint();
        setKeyListener(KEY_LISTENER);
        int i2 = equals + 27;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 80 / 0;
        }
    }

    @Override
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        int i2 = 2 % 2;
        int i3 = equals + 37;
        getAsAtTimestamp = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            ((EditText) view).getText().toString();
            keyEvent.getAction();
            obj.hashCode();
            throw null;
        }
        Editable text = ((EditText) view).getText();
        String string = text.toString();
        if (keyEvent.getAction() != 0 || i != 67) {
            boolean zOnKey = super.onKey(view, i, keyEvent);
            int i4 = equals + 15;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            return zOnKey;
        }
        int i6 = getAsAtTimestamp + 63;
        equals = i6 % 128;
        if (i6 % 2 == 0) {
            TextUtils.isEmpty(string);
            throw null;
        }
        if (TextUtils.isEmpty(string)) {
            return true;
        }
        int length = text.length();
        text.delete(length - 1, length);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void initAttr(android.util.AttributeSet r8) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.widget.code.CodeInputView.initAttr(android.util.AttributeSet):void");
    }

    private void initPaint() {
        int i = 2 % 2;
        Paint paint = new Paint();
        this.mStrokePaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.mStrokePaint.setStrokeWidth(this.mStrokeWidth);
        this.mStrokePaint.setColor(this.mStrokeColor);
        Paint paint2 = new Paint(1);
        this.mBgPaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.mBgPaint.setColor(this.mEmptyBgColor);
        Paint paint3 = new Paint(1);
        this.mCursorPaint = paint3;
        paint3.setStyle(Paint.Style.FILL_AND_STROKE);
        this.mCursorPaint.setStrokeWidth(this.cursorWidth);
        this.mCursorPaint.setColor(this.cursorColor);
        int i2 = getAsAtTimestamp + 29;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    private void initCursorTimer() {
        int i = 2 % 2;
        this.mCursorTimerTask = new TimerTask() {
            @Override
            public void run() {
                CodeInputView.m10045$$Nest$fputisCursorShowing(CodeInputView.this, !CodeInputView.m10043$$Nest$fgetisCursorShowing(r0));
                if (CodeInputView.this.getEditableText().length() == CodeInputView.m10044$$Nest$fgetmaxCount(CodeInputView.this)) {
                    return;
                }
                CodeInputView.this.postInvalidate();
            }
        };
        this.mCursorTimer = new Timer();
        int i2 = getAsAtTimestamp + 77;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onSizeChanged(int r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.common.widget.code.CodeInputView.getAsAtTimestamp
            int r1 = r1 + 61
            int r2 = r1 % 128
            com.huawei.common.widget.code.CodeInputView.equals = r2
            int r1 = r1 % r0
            java.lang.String r2 = "3"
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 != 0) goto L22
            super.onSizeChanged(r5, r6, r7, r8)
            java.lang.String r7 = r4.editTextStyle
            boolean r7 = android.text.TextUtils.equals(r7, r2)
            r8 = 97
            int r8 = r8 / 0
            if (r7 == 0) goto L35
            goto L2d
        L22:
            super.onSizeChanged(r5, r6, r7, r8)
            java.lang.String r7 = r4.editTextStyle
            boolean r7 = android.text.TextUtils.equals(r7, r2)
            if (r7 == 0) goto L35
        L2d:
            float r7 = (float) r5
            float r8 = r4.mStrokeWidth
            float r8 = r8 * r3
            float r7 = r7 - r8
            r4.mRectW = r7
            goto L47
        L35:
            float r7 = (float) r5
            float r8 = r4.mStrokeWidth
            float r1 = r4.mRectMargin
            int r2 = r4.maxCount
            float r8 = r8 * r3
            float r7 = r7 - r8
            int r8 = r2 + (-1)
            float r8 = (float) r8
            float r1 = r1 * r8
            float r7 = r7 - r1
            float r8 = (float) r2
            float r7 = r7 / r8
            r4.mRectW = r7
        L47:
            float r7 = (float) r6
            float r8 = r4.mStrokeWidth
            float r8 = r8 * r3
            float r7 = r7 - r8
            r4.mRectH = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "onSizeChanged w: "
            r7.<init>(r8)
            r7.append(r5)
            java.lang.String r5 = " h: "
            r7.append(r5)
            r7.append(r6)
            java.lang.String r5 = " mRectW: "
            r7.append(r5)
            float r5 = r4.mRectW
            r7.append(r5)
            java.lang.String r5 = " mRectH: "
            r7.append(r5)
            float r5 = r4.mRectH
            r7.append(r5)
            java.lang.String r5 = " style: "
            r7.append(r5)
            java.lang.String r5 = r4.editTextStyle
            r7.append(r5)
            java.lang.String r5 = "BaseCodeInputView"
            java.lang.String r6 = r7.toString()
            com.huawei.common.util.L.d(r5, r6)
            int r5 = com.huawei.common.widget.code.CodeInputView.equals
            int r5 = r5 + 1
            int r6 = r5 % 128
            com.huawei.common.widget.code.CodeInputView.getAsAtTimestamp = r6
            int r5 = r5 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.widget.code.CodeInputView.onSizeChanged(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038 A[PHI: r1 r9
  0x0038: PHI (r1v6 android.view.ViewGroup$MarginLayoutParams) = (r1v5 android.view.ViewGroup$MarginLayoutParams), (r1v10 android.view.ViewGroup$MarginLayoutParams) binds: [B:8:0x0036, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x0038: PHI (r9v2 int) = (r9v1 int), (r9v11 int) binds: [B:8:0x0036, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.widget.code.CodeInputView.onMeasure(int, int):void");
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 103;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            updateCurrentPosition();
            if (TextUtils.isEmpty(this.editTextStyle)) {
                drawBorderAndBg(canvas);
            } else if (TextUtils.equals(this.editTextStyle, "1")) {
                int i3 = equals + 33;
                getAsAtTimestamp = i3 % 128;
                int i4 = i3 % 2;
                drawBorderAndBg(canvas);
            } else if (TextUtils.equals(this.editTextStyle, "3")) {
                drawOneBoxBorderAndBg(canvas);
            } else {
                drawUnderLine(canvas);
            }
            if (!TextUtils.equals(this.editTextStyle, "3")) {
                drawText(canvas);
                drawCursor(canvas);
                return;
            }
            int i5 = equals + 53;
            getAsAtTimestamp = i5 % 128;
            if (i5 % 2 != 0) {
                drawHintText(canvas);
                drawTextOnOneBox(canvas);
                drawCursorOnOneBox(canvas);
                int i6 = 28 / 0;
                return;
            }
            drawHintText(canvas);
            drawTextOnOneBox(canvas);
            drawCursorOnOneBox(canvas);
            return;
        }
        updateCurrentPosition();
        TextUtils.isEmpty(this.editTextStyle);
        throw null;
    }

    private void drawHintText(Canvas canvas) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 89;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            if (TextUtils.isEmpty(getEditableText()) && !TextUtils.isEmpty(this.hintText)) {
                TextPaint paint = getPaint();
                paint.setColor(this.hintTextColor);
                paint.setTextSize(this.hintTextSize);
                String str = this.hintText;
                paint.getTextBounds(str, 0, str.length(), this.textRect);
                float fWidth = getLayoutDirection() == 1 ? (this.mRectW - this.rectPadding) - this.textRect.width() : this.rectPadding;
                Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                canvas.drawText(this.hintText, fWidth, (this.mRectH / 2.0f) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f), paint);
            }
            int i3 = equals + 23;
            getAsAtTimestamp = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 38 / 0;
                return;
            }
            return;
        }
        TextUtils.isEmpty(getEditableText());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void drawUnderLine(Canvas canvas) {
        int i;
        int i2 = 2 % 2;
        int i3 = equals + 17;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        float f = this.mStrokeWidth;
        canvas.translate(f, f);
        this.mStrokePaint.setStrokeWidth(this.mStrokeWidth);
        for (int i5 = 0; i5 < this.maxCount; i5++) {
            int i6 = getAsAtTimestamp + 57;
            equals = i6 % 128;
            int i7 = i6 % 2;
            RectF rectF = this.mRectF;
            float f2 = i5;
            float f3 = this.mRectW;
            float f4 = (this.mRectMargin + f3) * f2;
            rectF.set(f4, 0.0f, f3 + f4, this.mRectH);
            this.mBgPaint.setColor(this.mEmptyBgColor);
            if (this.showError) {
                this.mStrokePaint.setColor(this.mErrorStrokeColor);
            } else {
                Paint paint = this.mStrokePaint;
                if (i5 > getEditableText().length()) {
                    i = this.mEmptyStrokeColor;
                } else {
                    i = this.mStrokeColor;
                    int i8 = getAsAtTimestamp + 63;
                    equals = i8 % 128;
                    int i9 = i8 % 2;
                }
                paint.setColor(i);
            }
            float f5 = this.mRectW;
            float f6 = this.mRectMargin;
            float f7 = this.mRectH;
            float f8 = f2 * (f6 + f5);
            canvas.drawLine(f8, f7, f8 + f5, f7, this.mStrokePaint);
        }
        this.mStrokePaint.setColor(this.mFocusStrokeColor);
        this.mStrokePaint.setStrokeWidth(this.mStrokeWidth);
        RectF rectF2 = this.mRectF;
        float f9 = this.mCurrentPosition;
        float f10 = this.mRectW;
        float f11 = f9 * (this.mRectMargin + f10);
        rectF2.set(f11, 0.0f, f10 + f11, this.mRectH);
        float f12 = this.mCurrentPosition;
        float f13 = this.mRectW;
        float f14 = this.mRectMargin;
        float f15 = this.mRectH;
        float f16 = f12 * (f14 + f13);
        canvas.drawLine(f16, f15, f16 + f13, f15, this.mStrokePaint);
    }

    private void updateCurrentPosition() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 105;
        equals = i2 % 128;
        int i3 = i2 % 2;
        this.mCurrentPosition = Math.max(0, getEditableText().length());
        int i4 = getAsAtTimestamp + 97;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private void drawOneBoxBorderAndBg(Canvas canvas) {
        int i = 2 % 2;
        int i2 = equals + 87;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        float f = this.mStrokeWidth;
        canvas.translate(f, f);
        this.mRectF.set(0.0f, 0.0f, this.mRectW, this.mRectH);
        this.mBgPaint.setColor(this.mEmptyBgColor);
        RectF rectF = this.mRectF;
        float f2 = this.mRectAngle;
        canvas.drawRoundRect(rectF, f2, f2, this.mBgPaint);
        if (this.showError) {
            this.mStrokePaint.setColor(this.mErrorStrokeColor);
            int i4 = equals + 115;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
        } else {
            this.mStrokePaint.setColor(this.mFocusStrokeColor);
        }
        this.mStrokePaint.setStrokeWidth(this.mStrokeWidth);
        RectF rectF2 = this.mRectF;
        float f3 = this.mRectAngle;
        canvas.drawRoundRect(rectF2, f3, f3, this.mStrokePaint);
    }

    private void drawBorderAndBg(Canvas canvas) {
        int i = 2 % 2;
        float f = this.mStrokeWidth;
        canvas.translate(f, f);
        this.mStrokePaint.setStrokeWidth(this.mStrokeWidth);
        int i2 = equals + 35;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < this.maxCount) {
            int i5 = equals + 19;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
            RectF rectF = this.mRectF;
            float f2 = this.mRectW;
            float f3 = (this.mRectMargin + f2) * i4;
            rectF.set(f3, 0.0f, f2 + f3, this.mRectH);
            this.mBgPaint.setColor(this.mEmptyBgColor);
            if (this.showError) {
                this.mStrokePaint.setColor(this.mErrorStrokeColor);
            } else {
                this.mStrokePaint.setColor(i4 > getEditableText().length() ? this.mEmptyStrokeColor : this.mStrokeColor);
            }
            RectF rectF2 = this.mRectF;
            float f4 = this.mRectAngle;
            canvas.drawRoundRect(rectF2, f4, f4, this.mBgPaint);
            RectF rectF3 = this.mRectF;
            float f5 = this.mRectAngle;
            canvas.drawRoundRect(rectF3, f5, f5, this.mStrokePaint);
            i4++;
        }
        if (this.showError) {
            int i7 = getAsAtTimestamp + 97;
            equals = i7 % 128;
            if (i7 % 2 == 0) {
                this.mStrokePaint.setColor(this.mErrorStrokeColor);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.mStrokePaint.setColor(this.mErrorStrokeColor);
        } else {
            this.mStrokePaint.setColor(this.mFocusStrokeColor);
        }
        this.mStrokePaint.setStrokeWidth(this.mStrokeWidth);
        RectF rectF4 = this.mRectF;
        float f6 = this.mCurrentPosition;
        float f7 = this.mRectW;
        float f8 = f6 * (this.mRectMargin + f7);
        rectF4.set(f8, 0.0f, f7 + f8, this.mRectH);
        RectF rectF5 = this.mRectF;
        float f9 = this.mRectAngle;
        canvas.drawRoundRect(rectF5, f9, f9, this.mStrokePaint);
    }

    private void drawTextOnOneBox(Canvas canvas) {
        boolean z;
        int i = 2 % 2;
        boolean zIsTextOverWidth = isTextOverWidth(String.valueOf(getEditableText()));
        if (getLayoutDirection() == 1) {
            int i2 = getAsAtTimestamp + 97;
            equals = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            int i4 = equals + 11;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        if (!(!zIsTextOverWidth) || z) {
            drawTextFromEndToStart(canvas);
            int i6 = equals + 17;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        drawTextFromStartToEnd(canvas);
    }

    private void drawTextFromEndToStart(Canvas canvas) {
        TextPaint paint;
        float f;
        int i;
        float fWidth;
        float f2;
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 121;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            int length = getEditableText().length();
            paint = getPaint();
            paint.setColor(getCurrentTextColor());
            f = this.mRectW / this.rectPadding;
            i = length + 9;
        } else {
            int length2 = getEditableText().length();
            paint = getPaint();
            paint.setColor(getCurrentTextColor());
            f = this.mRectW - this.rectPadding;
            i = length2 - 1;
        }
        int i4 = equals + 41;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        while (i >= 0 && f >= this.rectPadding) {
            String strValueOf = String.valueOf(getEditableText().charAt(i));
            if (!(!this.showText)) {
                int i6 = equals + 69;
                getAsAtTimestamp = i6 % 128;
                int i7 = i6 % 2;
                paint.getTextBounds(strValueOf, 0, 1, this.textRect);
                Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                fWidth = f - this.textRect.width();
                canvas.drawText(strValueOf, fWidth, (this.mRectH / 2.0f) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f), paint);
                f2 = this.mRectMargin;
            } else {
                float f3 = this.pointRadius;
                fWidth = f - f3;
                canvas.drawCircle(fWidth, this.mRectH / 2.0f, f3, paint);
                f2 = f3 + this.mRectMargin;
            }
            f = fWidth - f2;
            i--;
        }
    }

    private void drawTextFromStartToEnd(Canvas canvas) {
        int length;
        TextPaint paint;
        float fWidth;
        float f;
        int i = 2 % 2;
        int i2 = equals + 91;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            length = getEditableText().length();
            paint = getPaint();
            paint.setColor(getCurrentTextColor());
        } else {
            length = getEditableText().length();
            paint = getPaint();
            paint.setColor(getCurrentTextColor());
        }
        float f2 = this.rectPadding;
        int i3 = 0;
        while (i3 < length) {
            String strValueOf = String.valueOf(getEditableText().charAt(i3));
            if (this.showText) {
                paint.getTextBounds(strValueOf, 0, 1, this.textRect);
                Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                canvas.drawText(strValueOf, f2, (this.mRectH / 2.0f) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f), paint);
                fWidth = this.textRect.width();
                f = this.mRectMargin;
            } else {
                fWidth = this.pointRadius;
                f2 += fWidth;
                canvas.drawCircle(f2, this.mRectH / 2.0f, fWidth, paint);
                f = this.mRectMargin;
            }
            f2 += fWidth + f;
            i3++;
            int i4 = equals + 91;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private boolean isTextOverWidth(String str) {
        float f;
        float f2;
        float fWidth;
        float length;
        int i = 2 % 2;
        if (TextUtils.isEmpty(str)) {
            int i2 = equals + 123;
            getAsAtTimestamp = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(!this.showText)) {
            int i3 = getAsAtTimestamp + 95;
            equals = i3 % 128;
            if (i3 % 2 == 0) {
                getPaint().getTextBounds(str, 1, str.length(), this.textRect);
                fWidth = this.textRect.width();
                length = this.mRectMargin % (str.length() / 0);
            } else {
                getPaint().getTextBounds(str, 0, str.length(), this.textRect);
                fWidth = this.textRect.width();
                length = this.mRectMargin * (str.length() - 1);
            }
            f = fWidth + length;
            f2 = this.rectPadding;
        } else {
            float length2 = (this.pointRadius * 2.0f * str.length()) + (this.mRectMargin * (str.length() - 1));
            float f3 = this.rectPadding;
            int i4 = getAsAtTimestamp + 37;
            equals = i4 % 128;
            int i5 = i4 % 2;
            f = length2;
            f2 = f3;
        }
        return f + (f2 * 2.0f) > this.mRectW;
    }

    private void drawText(Canvas canvas) {
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        int length = getEditableText().length();
        TextPaint paint = getPaint();
        paint.setColor(getCurrentTextColor());
        int i4 = 0;
        while (i4 < length) {
            String strValueOf = String.valueOf(getEditableText().charAt(i4));
            if (!this.showText) {
                paint.getTextBounds(strValueOf, 0, 1, this.textRect);
                float f = this.pointRadius;
                float f2 = this.mRectW;
                canvas.drawCircle((f2 / 2.0f) + ((f2 + this.mRectMargin) * i4), this.mRectH / 2.0f, f, paint);
                int i5 = getAsAtTimestamp + 7;
                equals = i5 % 128;
                i = 2;
                int i6 = i5 % 2;
            } else {
                int i7 = equals + 11;
                getAsAtTimestamp = i7 % 128;
                int i8 = i7 % i2;
                paint.getTextBounds(strValueOf, 0, 1, this.textRect);
                float f3 = this.mRectW;
                float f4 = this.mRectMargin;
                float fCenterX = this.textRect.centerX();
                Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                canvas.drawText(strValueOf, ((f3 / 2.0f) + ((f3 + f4) * i4)) - fCenterX, (this.mRectH / 2.0f) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f), paint);
                i = 2;
            }
            i4++;
            i2 = i;
        }
    }

    private void drawCursorOnOneBox(Canvas canvas) {
        int i;
        int i2 = 2 % 2;
        if (hasFocus() && this.isCursorShowing) {
            int i3 = equals + 25;
            int i4 = i3 % 128;
            getAsAtTimestamp = i4;
            if (i3 % 2 != 0) {
                i = this.mCurrentPosition;
                int i5 = 34 / 0;
                if (i >= this.maxCount) {
                    return;
                }
            } else {
                i = this.mCurrentPosition;
                if (i >= this.maxCount) {
                    return;
                }
            }
            float f = this.rectPadding + (this.pointRadius * 2.0f * i);
            if (i > 0) {
                int i6 = i4 + 81;
                equals = i6 % 128;
                int i7 = i6 % 2;
                f += this.mRectMargin * (i - 1);
            }
            boolean zIsTextOverWidth = isTextOverWidth(String.valueOf(getEditableText()));
            boolean z = getLayoutDirection() == 1;
            if (zIsTextOverWidth || z) {
                f = this.mRectW - this.rectPadding;
            }
            float f2 = f;
            float f3 = this.mRectH / 4.0f;
            this.mCursorPaint.setColor(this.cursorColor);
            canvas.drawLine(f2, f3, f2, this.mRectH - f3, this.mCursorPaint);
        }
    }

    private void drawCursor(Canvas canvas) {
        int i;
        int i2 = 2 % 2;
        int i3 = equals + 71;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        if (hasFocus()) {
            int i5 = equals + 79;
            int i6 = i5 % 128;
            getAsAtTimestamp = i6;
            if (i5 % 2 != 0) {
                throw null;
            }
            if (!this.isCursorShowing || (i = this.mCurrentPosition) >= this.maxCount) {
                return;
            }
            int i7 = i6 + 57;
            equals = i7 % 128;
            int i8 = i7 % 2;
            float f = this.mRectW;
            float f2 = (f / 2.0f) + ((f + this.mRectMargin) * i);
            float f3 = this.mRectH / 4.0f;
            this.mCursorPaint.setColor(this.cursorColor);
            canvas.drawLine(f2, f3, f2, this.mRectH - f3, this.mCursorPaint);
        }
    }

    @Override
    protected void onAttachedToWindow() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 67;
        equals = i2 % 128;
        int i3 = i2 % 2;
        super.onAttachedToWindow();
        this.mCursorTimer.scheduleAtFixedRate(this.mCursorTimerTask, 0L, 500L);
        int i4 = getAsAtTimestamp + 61;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        OnInputFinishListener onInputFinishListener;
        int i4 = 2 % 2;
        int i5 = getAsAtTimestamp + 49;
        equals = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            super.onTextChanged(charSequence, i, i2, i3);
            int length = getEditableText().length();
            if (length == this.maxCount) {
                int i6 = getAsAtTimestamp + 3;
                equals = i6 % 128;
                if (i6 % 2 != 0) {
                    OnInputFinishListener onInputFinishListener2 = this.mOnInputFinishListener;
                    if (onInputFinishListener2 != null) {
                        onInputFinishListener2.onTextFinish(getEditableText().toString());
                    }
                } else {
                    obj.hashCode();
                    throw null;
                }
            }
            if (length < this.maxCount && (onInputFinishListener = this.mOnInputFinishListener) != null) {
                int i7 = equals + 125;
                getAsAtTimestamp = i7 % 128;
                onInputFinishListener.isFinish(i7 % 2 != 0);
            }
            OnInputFinishListener onInputFinishListener3 = this.mOnInputFinishListener;
            if (onInputFinishListener3 != null) {
                onInputFinishListener3.onTextChange(getEditableText().toString());
                return;
            }
            return;
        }
        super.onTextChanged(charSequence, i, i2, i3);
        getEditableText().length();
        obj.hashCode();
        throw null;
    }

    public void add(CharSequence charSequence) {
        int i = 2 % 2;
        if (hasFocus()) {
            Editable text = getText();
            text.insert(text.length(), charSequence);
            int i2 = equals + 19;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i3 = equals + 97;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
    }

    public void remove() {
        int i = 2 % 2;
        if (!hasFocus()) {
            int i2 = getAsAtTimestamp + 75;
            equals = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 48 / 0;
                return;
            }
            return;
        }
        Editable text = getText();
        if (text != null) {
            int i4 = equals + 121;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 != 0) {
                text.length();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (text.length() > 0) {
                int i5 = getAsAtTimestamp + 81;
                equals = i5 % 128;
                int i6 = i5 % 2;
                int length = text.length();
                text.delete(i6 == 0 ? length % 1 : length - 1, text.length());
            }
        }
    }

    public void clear() {
        Editable text;
        int i = 2 % 2;
        int i2 = equals + 19;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            text = getText();
            int i3 = 41 / 0;
            if (text == null) {
                return;
            }
        } else {
            text = getText();
            if (text == null) {
                return;
            }
        }
        if (text.length() > 0) {
            text.clear();
            int i4 = getAsAtTimestamp + 15;
            equals = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override
    public void setMaxEms(int i) {
        int i2 = 2 % 2;
        this.maxCount = i;
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.maxCount)});
        super.setMaxEms(i);
        int i3 = getAsAtTimestamp + 15;
        equals = i3 % 128;
        int i4 = i3 % 2;
    }

    public void setEmptyBgColor(int i) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp;
        int i4 = i3 + 89;
        equals = i4 % 128;
        int i5 = i4 % 2;
        this.mEmptyBgColor = i;
        int i6 = i3 + 23;
        equals = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setInputItemWidth(float f) {
        int i = 2 % 2;
        int i2 = equals + 65;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        this.mInputItemWidth = f;
        int i5 = i3 + 75;
        equals = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setRectMargin(float f) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 61;
        equals = i2 % 128;
        int i3 = i2 % 2;
        this.mRectMargin = f;
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
    }

    public void setStrokeColor(int i) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp;
        int i4 = i3 + 51;
        equals = i4 % 128;
        int i5 = i4 % 2;
        this.mStrokeColor = i;
        int i6 = i3 + 33;
        equals = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setEmptyStrokeColor(int i) {
        int i2 = 2 % 2;
        int i3 = equals + 111;
        int i4 = i3 % 128;
        getAsAtTimestamp = i4;
        int i5 = i3 % 2;
        this.mEmptyStrokeColor = i;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 79;
        equals = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setFocusStrokeColor(int i) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 33;
        equals = i3 % 128;
        int i4 = i3 % 2;
        this.mFocusStrokeColor = i;
        if (i4 == 0) {
            int i5 = 66 / 0;
        }
    }

    public void setErrorStrokeColor(int i) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 81;
        equals = i3 % 128;
        int i4 = i3 % 2;
        this.mErrorStrokeColor = i;
        if (i4 == 0) {
            int i5 = 95 / 0;
        }
    }

    public int getErrorStrokeColor() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 107;
        equals = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.mErrorStrokeColor;
        int i6 = i2 + 123;
        equals = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 64 / 0;
        }
        return i5;
    }

    public void setRectAngle(float f) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 21;
        equals = i3 % 128;
        int i4 = i3 % 2;
        this.mRectAngle = f;
        int i5 = i2 + 103;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 81 / 0;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 71;
        equals = i2 % 128;
        int i3 = i2 % 2;
        super.onDetachedFromWindow();
        this.mCursorTimer.cancel();
        this.mCursorTimer = null;
        int i4 = getAsAtTimestamp + 45;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setOnInputFinishListener(OnInputFinishListener onInputFinishListener) {
        int i = 2 % 2;
        int i2 = equals + 99;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        this.mOnInputFinishListener = onInputFinishListener;
        int i5 = i3 + 61;
        equals = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setError(boolean z) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 43;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            this.showError = z;
            postInvalidate();
        } else {
            this.showError = z;
            postInvalidate();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public void setEditTextStyle(String str) {
        int i = 2 % 2;
        this.editTextStyle = str;
        boolean zEquals = TextUtils.equals("3", str);
        this.isItemSquare = !zEquals;
        if (zEquals) {
            int i2 = getAsAtTimestamp;
            int i3 = i2 + 109;
            equals = i3 % 128;
            if (i3 % 2 != 0 ? this.mInputItemHeight <= 0.0f : this.mInputItemHeight <= 0.0f) {
                this.mInputItemHeight = this.mInputItemWidth;
                int i4 = i2 + 109;
                equals = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        postInvalidate();
    }

    public void setRectPadding(float f) {
        int i = 2 % 2;
        int i2 = equals + 35;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        this.rectPadding = f;
        postInvalidate();
        int i4 = equals + 77;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setHintText(String str) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 105;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            this.hintText = str;
            postInvalidate();
            int i3 = equals + 97;
            getAsAtTimestamp = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.hintText = str;
        postInvalidate();
        throw null;
    }

    static boolean m10043$$Nest$fgetisCursorShowing(CodeInputView codeInputView) {
        int i = 2 % 2;
        int i2 = equals + 25;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        boolean z = codeInputView.isCursorShowing;
        int i5 = i3 + 11;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 57 / 0;
        }
        return z;
    }

    static int m10044$$Nest$fgetmaxCount(CodeInputView codeInputView) {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 103;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        int i5 = codeInputView.maxCount;
        if (i4 != 0) {
            throw null;
        }
        int i6 = i2 + 87;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        obj.hashCode();
        throw null;
    }

    static void m10045$$Nest$fputisCursorShowing(CodeInputView codeInputView, boolean z) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 123;
        equals = i3 % 128;
        int i4 = i3 % 2;
        codeInputView.isCursorShowing = z;
        if (i4 == 0) {
            int i5 = 0 / 0;
        }
        int i6 = i2 + 123;
        equals = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = equals + 45;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void setBackgroundResource(int i) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 43;
        equals = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override
    public void showSafeKeyboard() {
        int i = 2 % 2;
        int i2 = equals + 11;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static void component1() {
        int i = 2 % 2;
        int i2 = equals + 113;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        component3 = 2755849596937386941L;
        component2 = 1386857713;
        copydefault = (char) 50417;
        int i5 = i3 + 111;
        equals = i5 % 128;
        int i6 = i5 % 2;
    }

    static void ShareDataUIState() {
        ShareDataUIState = new char[]{2035, 2016, 2034, 2026, 2038, 2027, 2022, 2036, 2002, 1049, 2024, 1050, 2019, 2020, 1992, 2030, 2004, 2031, 2025, 2023, 2037, 2041, 2028, 2018, 2021, 1985, 2029, 2003, 1051, 2039, 2033, 2032, 1048, 1966, 1987, 2017};
        component1 = (char) 12828;
    }
}
