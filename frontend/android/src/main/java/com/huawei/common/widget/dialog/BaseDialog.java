package com.huawei.common.widget.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ExpandableListView;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.FragmentManager;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.common.R;
import com.huawei.common.config.DialogConfig;
import com.huawei.common.util.L;
import com.huawei.common.util.MaskBlurUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;

public abstract class BaseDialog extends AppCompatDialogFragment {
    private boolean ShareDataUIState = true;
    public boolean isShowing;
    private static final byte[] $$l = {5, SignedBytes.MAX_POWER_OF_TWO, 127, 81};
    private static final int $$m = 27;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {4, -66, -36, 8, -9, 5, 66, -54, -5, 3, Ascii.VT, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -50, -9, 5, 3, 1, 4, 67, -56, -2, -3, Ascii.DC2, -10, 7, Ascii.DLE, -8, 65, -73, 3, Ascii.DC2, -18, 10, -14, Ascii.DLE, 36, -26, -16, Ascii.SYN, Ascii.SI, Ascii.SI, -7, -30, Ascii.SYN, -16, Ascii.DC2, -9, 5, 0, 4, 4, Ascii.FF, -6, -3, 68};
    private static final int $$k = 17;
    private static final byte[] $$d = {79, 9, 94, -7, Ascii.SUB, Ascii.SI, Ascii.ETB, Ascii.SUB, Ascii.FF, 17, 13, 13, 5, Ascii.ETB, 20, -50, Ascii.FF, Ascii.GS, -20, 33, Ascii.SUB, Ascii.DC2, -2, Ascii.FS, Ascii.SI, -36, TarHeader.LF_LINK, Ascii.ETB, 5, Ascii.SI, 17, 8, 20, 6, Ascii.US, 5, 10, Ascii.FS, -18, 47, -5, 33, -1};
    private static final int $$e = 230;
    private static int copy = 0;
    private static int getRequestBeneficiariesState = 1;
    private static char component1 = 29182;
    private static char component3 = 65486;
    private static char component2 = 64285;
    private static char copydefault = 15267;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$n(short r5, int r6, byte r7) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 111
            int r7 = r7 * 2
            int r0 = r7 + 1
            int r5 = r5 + 4
            byte[] r1 = com.huawei.common.widget.dialog.BaseDialog.$$l
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r6
            r6 = r7
            r3 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L21:
            int r5 = r5 + 1
            r4 = r1[r5]
            int r3 = r3 + 1
        L27:
            int r6 = r6 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.widget.dialog.BaseDialog.$$n(short, int, byte):java.lang.String");
    }

    private static void e(byte b2, int i, byte b3, Object[] objArr) {
        int i2 = (b3 * 3) + 4;
        int i3 = i * 6;
        byte[] bArr = $$d;
        int i4 = 103 - (b2 * 4);
        byte[] bArr2 = new byte[28 - i3];
        int i5 = 27 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2++;
            i4 = (i5 + i2) - 14;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b4 = bArr[i2];
                i2++;
                i4 = (i4 + b4) - 14;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(int r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.huawei.common.widget.dialog.BaseDialog.$$j
            int r9 = r9 * 16
            int r9 = r9 + 83
            int r7 = r7 * 2
            int r7 = r7 + 10
            int r8 = 59 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2c
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L2c:
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + 3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.widget.dialog.BaseDialog.g(int, byte, int, java.lang.Object[]):void");
    }

    protected abstract int getLayoutId();

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i4 = $10 + 27;
            $11 = i4 % 128;
            int i5 = 58224;
            if (i4 % i2 == 0) {
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3];
            } else {
                cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            }
            int i6 = 0;
            while (i6 < 16) {
                int i7 = $11 + 31;
                $10 = i7 % 128;
                int i8 = i7 % i2;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                int i9 = (c3 + i5) ^ ((c3 << 4) + ((char) (((long) component2) ^ 4374495167426960553L)));
                int i10 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(copydefault);
                    objArr2[i2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) (-1);
                        byte b3 = (byte) (b2 + 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetAfter("", 0) + 844, 32 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (23251 - KeyEvent.getDeadChar(0, 0)), 592652048, false, $$n(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) component1) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component3)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getWindowTouchSlop() >> 8) + 844, 32 - KeyEvent.normalizeMetaState(0), (char) (MotionEvent.axisFromString("") + 23252), 592652048, false, $$n(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    i2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[iNotificationSideChannelDefault.component3] = cArr3[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr3[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(466 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 48 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) View.resolveSizeAndState(0, 0, 0), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            i2 = 2;
        }
        String str = new String(cArr2, 0, i);
        int i11 = $11 + 61;
        $10 = i11 % 128;
        int i12 = i11 % 2;
        objArr[0] = str;
    }

    @Override
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
        if (objCopydefault == null) {
            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 2405;
            int iArgb = 26 - Color.argb(0, 0, 0, 0);
            char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
            byte b2 = (byte) (-$$d[42]);
            byte b3 = (byte) (b2 + 3);
            Object[] objArr2 = new Object[1];
            e(b2, b3, (byte) (b3 - 4), objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(offsetAfter, iArgb, doubleTapTimeout, -2047739879, false, (String) objArr2[0], null);
        }
        if (((Field) objCopydefault).getLong(null) != -1) {
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault2 == null) {
                int iLastIndexOf = 2404 - TextUtils.lastIndexOf("", '0', 0, 0);
                int pressedStateDuration = 26 - (ViewConfiguration.getPressedStateDuration() >> 16);
                char cAlpha = (char) Color.alpha(0);
                byte b4 = $$d[42];
                byte b5 = (byte) (-b4);
                Object[] objArr3 = new Object[1];
                e(b5, (byte) (b5 + 2), (byte) (-b4), objArr3);
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf, pressedStateDuration, cAlpha, 24929979, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault2).get(null);
        } else {
            Object[] objArr4 = new Object[1];
            f(15 - TextUtils.indexOf((CharSequence) "", '0', 0), new char[]{57302, 25187, 11525, 55453, 23984, 59877, 28456, 21935, 27623, 62137, 62802, 28333, 15141, 23763, 29181, 10339}, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            f(16 - (Process.myPid() >> 22), new char[]{40762, 16959, 21628, 48933, 63706, 5749, 39332, 62756, 2708, 49959, 7177, 45947, 19847, 12333, 47810, 59343}, objArr5);
            int iIntValue = ((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue();
            int i2 = getRequestBeneficiariesState + 31;
            copy = i2 % 128;
            int i3 = i2 % 2;
            try {
                Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -717958680};
                Object[] objArr7 = new Object[1];
                g(r3[39], (byte) (-$$j[33]), r3[30], objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                g(r3[9], r3[53], r3[62], objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault3 == null) {
                    int mirror = 2453 - AndroidCharacter.getMirror('0');
                    int i4 = 26 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                    byte b6 = $$d[42];
                    byte b7 = (byte) (-b6);
                    Object[] objArr9 = new Object[1];
                    e(b7, (byte) (b7 + 2), (byte) (-b6), objArr9);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(mirror, i4, threadPriority, 24929979, false, (String) objArr9[0], null);
                }
                ((Field) objCopydefault3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    f((Process.myTid() >> 22) + 22, new char[]{28456, 21935, 53576, 5461, 40391, 5235, 35207, 29663, 14588, 54215, 16176, 9491, 12543, 31930, 64100, 63976, 10643, 57344, 55535, 26314, 52642, 3556}, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    f(View.getDefaultSize(0, 0) + 15, new char[]{30947, 9522, 44463, 24085, 14912, 39510, 3646, 32590, 18354, 31100, 45092, 65124, 34085, 64415, 65460, 39096}, objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault4 == null) {
                        int keyRepeatDelay = 2405 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int mirror2 = AndroidCharacter.getMirror('0') - 22;
                        char c2 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        byte b8 = (byte) ($$d[42] + 1);
                        byte b9 = b8;
                        Object[] objArr12 = new Object[1];
                        e(b8, b9, (byte) (b9 + 4), objArr12);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatDelay, mirror2, c2, -1843538389, false, (String) objArr12[0], null);
                    }
                    ((Field) objCopydefault4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault5 == null) {
                        int modifierMetaStateMask = 2404 - ((byte) KeyEvent.getModifierMetaStateMask());
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 27;
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        byte b10 = (byte) (-$$d[42]);
                        byte b11 = (byte) (b10 + 3);
                        Object[] objArr13 = new Object[1];
                        e(b10, b11, (byte) (b11 - 4), objArr13);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(modifierMetaStateMask, bitsPerPixel, packedPositionType, -2047739879, false, (String) objArr13[0], null);
                    }
                    ((Field) objCopydefault5).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i5 = ((int[]) objArr[0])[0];
        int i6 = ((int[]) objArr[2])[0];
        if (i6 != i5) {
            long j = -1;
            long j2 = ((long) (i5 ^ i6)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            try {
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault6 == null) {
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getTapTimeout() >> 16), 16777258 + Color.rgb(0, 0, 0), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault6).invoke(null, null);
                try {
                    Object[] objArr14 = {-1514392016, Long.valueOf(j4), new ArrayList(), null, true};
                    Class cls4 = (Class) ITrustedWebActivityCallbackDefault.copydefault(6562 - TextUtils.getCapsMode("", 0, 0), AndroidCharacter.getMirror('0') + '\b', (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1));
                    byte b12 = $$j[62];
                    Object[] objArr15 = new Object[1];
                    g(b12, b12, r3[30], objArr15);
                    cls4.getMethod((String) objArr15[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke, objArr14);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(bundle);
        setStyle(1, R.style.DialogStyle);
        setRetainInstance(true);
        int i7 = copy + 81;
        getRequestBeneficiariesState = i7 % 128;
        int i8 = i7 % 2;
    }

    public void setBackgroundBlur(boolean z) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 39;
        copy = i2 % 128;
        int i3 = i2 % 2;
        this.ShareDataUIState = z;
        if (i3 != 0) {
            int i4 = 13 / 0;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null) {
            return;
        }
        Window window = dialog.getWindow();
        if (window != null) {
            onStart(window, dialog);
            if (this.ShareDataUIState) {
                int i2 = getRequestBeneficiariesState + 61;
                copy = i2 % 128;
                int i3 = i2 % 2;
                MaskBlurUtils.addMask(getContext());
                return;
            }
            return;
        }
        int i4 = copy + 57;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected void onStart(Window window, Dialog dialog) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 5;
        copy = i2 % 128;
        int i3 = i2 % 2;
        window.setDimAmount(getDimAmount());
        window.setLayout(-2, -2);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        window.setGravity(17);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        int i4 = getRequestBeneficiariesState + 87;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    protected float getDimAmount() {
        int i = 2 % 2;
        int i2 = copy + 37;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        float f = DialogConfig.dialogDimAmount;
        if (i3 != 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        int i2 = copy + 87;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        if (getLayoutId() == 0) {
            throw new NullPointerException("please set legitimate Id");
        }
        View viewInflate = getLayoutInflater(layoutInflater).inflate(getLayoutId(), viewGroup, false);
        int i4 = copy + 57;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return viewInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public LayoutInflater getLayoutInflater(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copy + 31;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        if (getActivity() == null) {
            return layoutInflater;
        }
        int i4 = getRequestBeneficiariesState + 61;
        copy = i4 % 128;
        int i5 = i4 % 2;
        LayoutInflater layoutInflater2 = getActivity().getLayoutInflater();
        int i6 = copy + 29;
        getRequestBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
        return layoutInflater2;
    }

    protected int getWidth(Window window) {
        int i = 2 % 2;
        Display defaultDisplay = window.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i2 = point.x;
        int i3 = getRequestBeneficiariesState + 81;
        copy = i3 % 128;
        int i4 = i3 % 2;
        return i2;
    }

    @Override
    public void show(FragmentManager fragmentManager, String str) {
        int i = 2 % 2;
        try {
            if (!this.isShowing) {
                int i2 = copy + 39;
                getRequestBeneficiariesState = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 24 / 0;
                    if (isAdded()) {
                        return;
                    }
                } else if (isAdded()) {
                    return;
                }
                super.show(fragmentManager, str);
                this.isShowing = true;
                int i4 = getRequestBeneficiariesState + 73;
                copy = i4 % 128;
                int i5 = i4 % 2;
            }
        } catch (Exception e) {
            L.e("BaseDialog", "show: " + e.getMessage());
        }
    }

    @Override
    public void onStop() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 9;
        copy = i2 % 128;
        int i3 = i2 % 2;
        super.onStop();
        if (this.ShareDataUIState) {
            int i4 = getRequestBeneficiariesState + 87;
            copy = i4 % 128;
            int i5 = i4 % 2;
            MaskBlurUtils.removeMask(getContext());
        }
    }

    @Override
    public void dismiss() {
        int i = 2 % 2;
        int i2 = copy + 55;
        getRequestBeneficiariesState = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                super.dismissAllowingStateLoss();
            } else {
                super.dismissAllowingStateLoss();
            }
            this.isShowing = false;
        } catch (Exception e) {
            L.e(e.getMessage());
        }
        int i3 = copy + 79;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override
    public void onCancel(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 3;
        copy = i2 % 128;
        int i3 = i2 % 2;
        super.onCancel(dialogInterface);
        this.isShowing = false;
    }
}
