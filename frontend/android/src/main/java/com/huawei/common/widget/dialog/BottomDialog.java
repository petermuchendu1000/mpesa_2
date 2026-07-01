package com.huawei.common.widget.dialog;

import android.app.Dialog;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ExpandableListView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.common.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;

public abstract class BottomDialog<Binding extends ViewDataBinding> extends BaseDialog {
    public Binding binding;
    private static final byte[] $$c = {Ascii.ETB, 124, -70, -17};
    private static final int $$f = 199;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {99, TarHeader.LF_DIR, 44, 107, 20, 6, -55, 59, 19, 5, 1, 7, 9, 7, -43, 59, Ascii.EM, -1, Ascii.NAK, -9, Ascii.NAK, -60, 59, Ascii.ETB, 8, -58, Ascii.ESC, TarHeader.LF_CONTIG, 8, -26, 41, -3, 9, -57, Ascii.SYN, -6, Ascii.NAK, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57};
    private static final int $$h = 145;
    private static final byte[] $$a = {81, 99, 107, 124, Ascii.SUB, Ascii.SI, Ascii.ETB, Ascii.SUB, Ascii.FF, 17, 13, 13, 5, Ascii.ETB, 20, -50, Ascii.FF, Ascii.GS, -20, 33, Ascii.SUB, Ascii.DC2, -2, Ascii.FS, Ascii.SI, -36, TarHeader.LF_LINK, Ascii.ETB, 5, Ascii.SI, 17, 8, 20, 6, Ascii.US, 5, 10, Ascii.FS, -18, 47, -5, 33, -1};
    private static final int $$b = 160;
    private static int component2 = 0;
    private static int copydefault = 1;
    private static long component1 = -3780477796495014671L;
    private static int ShareDataUIState = 1386857713;
    private static char component3 = 8109;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(short r6, int r7, short r8) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 1
            byte[] r0 = com.huawei.common.widget.dialog.BottomDialog.$$c
            int r6 = 99 - r6
            int r8 = r8 * 4
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r6 = r7
            r3 = r8
            r5 = r2
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r3 = r0[r8]
        L25:
            int r8 = r8 + 1
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.widget.dialog.BottomDialog.$$i(short, int, short):java.lang.String");
    }

    private static void a(byte b2, byte b3, int i, Object[] objArr) {
        int i2 = 16 - (i * 3);
        int i3 = 103 - (b3 * 4);
        int i4 = b2 * 6;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 4];
        int i5 = i4 + 3;
        int i6 = -1;
        if (bArr == null) {
            i2++;
            i3 = (i3 + i5) - 14;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b4 = bArr[i2];
                i2++;
                i3 = (i3 + b4) - 14;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r8 = r8 + 99
            int r6 = r6 * 24
            int r6 = r6 + 10
            byte[] r0 = com.huawei.common.widget.dialog.BottomDialog.$$g
            int r7 = r7 + 4
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r5 = r2
            r8 = r6
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            int r7 = r7 + 1
            if (r5 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r7]
        L29:
            int r8 = r8 + r3
            int r8 = r8 + (-8)
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.widget.dialog.BottomDialog.c(int, int, int, java.lang.Object[]):void");
    }

    @Override
    protected abstract int getLayoutId();

    private static void b(char c2, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
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
        while (iNotificationSideChannel.copydefault < length3) {
            int i5 = $11 + 93;
            $10 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int iMyTid = 4037 - (Process.myTid() >> 22);
                    int i7 = 32 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    char jumpTapTimeout = (char) (19181 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                    byte b2 = (byte) i4;
                    byte b3 = b2;
                    String str$$i = $$i(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iMyTid, i7, jumpTapTimeout, 1912513118, false, str$$i, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        int i8 = 7568 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int maximumFlingVelocity = 11 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        Class[] clsArr2 = new Class[1];
                        clsArr2[i4] = Object.class;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i8, maximumFlingVelocity, scrollDefaultDelay, 2006389106, false, "e", clsArr2);
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    int i9 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                    try {
                        Object[] objArr4 = new Object[3];
                        objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                        objArr4[1] = Integer.valueOf(i9);
                        objArr4[i4] = iNotificationSideChannel;
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                        if (objCopydefault3 == null) {
                            int iKeyCodeFromString = 2459 - KeyEvent.keyCodeFromString("");
                            int gidForName = Process.getGidForName("") + 29;
                            char gidForName2 = (char) (Process.getGidForName("") + 1);
                            byte b4 = (byte) ($$f & 1);
                            byte b5 = (byte) (b4 - 1);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iKeyCodeFromString, gidForName, gidForName2, 931716605, false, $$i(b4, b5, b5), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                            if (objCopydefault4 == null) {
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7566 - TextUtils.indexOf((CharSequence) "", '0', 0), 10 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (ExpandableListView.getPackedPositionChild(0L) + 1), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = iNotificationSideChannel.component3;
                            cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[iNotificationSideChannel.copydefault])) ^ (component1 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) ShareDataUIState) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component3) ^ (-3780477796495014671L)))));
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
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        String str = new String(cArr6);
        int i10 = $11 + 37;
        $10 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    @Override
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = copydefault + 5;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
        if (objCopydefault == null) {
            int i4 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2405;
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 27;
            char c2 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte b2 = $$a[42];
            byte b3 = (byte) (b2 + 1);
            byte b4 = (byte) (-b2);
            Object[] objArr2 = new Object[1];
            a(b3, b4, (byte) (b4 + 3), objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4, iLastIndexOf, c2, -2047739879, false, (String) objArr2[0], null);
        }
        if (((Field) objCopydefault).getLong(null) != -1) {
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault2 == null) {
                byte b5 = (byte) (-$$a[42]);
                byte b6 = b5;
                Object[] objArr3 = new Object[1];
                a(b5, b6, (byte) (b6 + 2), objArr3);
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2405 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 26, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 24929979, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault2).get(null);
        } else {
            Object[] objArr4 = new Object[1];
            b((char) (41544 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), ViewConfiguration.getTouchSlop() >> 8, new char[]{48603, 22882, 61978, 54522, 46445, 59298, 28453, 37454, 35490, 48961, 13243, 51681, 40943, 62185, 18981, 62001}, new char[]{17992, 60856, 18249, 62370}, new char[]{0, 0, 0, 0}, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 58031), (-1) - TextUtils.lastIndexOf("", '0', 0, 0), new char[]{41224, 5515, 17010, 8278, 15153, 50140, 4098, 44194, 63355, 64550, 46225, 38618, 61683, 41455, 56010, 25255}, new char[]{41449, 15529, 45057, 4834}, new char[]{0, 0, 0, 0}, objArr5);
            try {
                Object[] objArr6 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue()), 0, 917383232};
                byte[] bArr = $$g;
                byte b7 = bArr[10];
                byte b8 = bArr[17];
                Object[] objArr7 = new Object[1];
                c(b7, b8, (byte) (b8 + 1), objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                byte b9 = bArr[10];
                byte b10 = (byte) (b9 - 1);
                Object[] objArr8 = new Object[1];
                c(b10, (byte) (b10 | 32), (byte) (b9 - 1), objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault3 == null) {
                    int defaultSize = 2405 - View.getDefaultSize(0, 0);
                    int iMyPid = 26 - (Process.myPid() >> 22);
                    char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                    byte b11 = (byte) (-$$a[42]);
                    byte b12 = b11;
                    Object[] objArr9 = new Object[1];
                    a(b11, b12, (byte) (b12 + 2), objArr9);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(defaultSize, iMyPid, capsMode, 24929979, false, (String) objArr9[0], null);
                }
                ((Field) objCopydefault3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b((char) View.resolveSize(0, 0), KeyEvent.getMaxKeyCode() >> 16, new char[]{64732, 6576, 52237, 15602, 41781, 52241, 20700, 3367, 8565, 62484, 49798, 14867, 4650, 41839, 19286, 30558, 62682, 43255, 48845, 24346, 14240, 1115}, new char[]{60033, 15332, 10415, 44685}, new char[]{0, 0, 0, 0}, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b((char) (36143 - TextUtils.getOffsetAfter("", 0)), (-1236489029) - (Process.myPid() >> 22), new char[]{31999, 42342, 14931, 28273, 28984, 26600, 30283, 55286, 36036, 36913, 1917, 2099, 22701, 51694, 2220}, new char[]{47944, 19628, 12214, 41869}, new char[]{0, 0, 0, 0}, objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault4 == null) {
                        int i5 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2405;
                        int iIndexOf = TextUtils.indexOf("", "") + 26;
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                        byte b13 = (byte) ($$a[12] - 1);
                        byte b14 = (byte) (b13 - 4);
                        Object[] objArr12 = new Object[1];
                        a(b13, b14, b14, objArr12);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i5, iIndexOf, cIndexOf, -1843538389, false, (String) objArr12[0], null);
                    }
                    ((Field) objCopydefault4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault5 == null) {
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 2405;
                        int fadingEdgeLength = 26 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        char trimmedLength = (char) TextUtils.getTrimmedLength("");
                        byte b15 = $$a[42];
                        byte b16 = (byte) (b15 + 1);
                        byte b17 = (byte) (-b15);
                        Object[] objArr13 = new Object[1];
                        a(b16, b17, (byte) (b17 + 3), objArr13);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(absoluteGravity, fadingEdgeLength, trimmedLength, -2047739879, false, (String) objArr13[0], null);
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
        int i6 = ((int[]) objArr[0])[0];
        int i7 = ((int[]) objArr[2])[0];
        if (i7 != i6) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i7 ^ i6)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault6 == null) {
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(AndroidCharacter.getMirror('0') + 6570, 43 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) TextUtils.getOffsetAfter("", 0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault6).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                int i8 = copydefault + 73;
                component2 = i8 % 128;
                int i9 = i8 % 2;
                try {
                    Object[] objArr14 = {-590992726, Long.valueOf(j3), arrayList, null, true};
                    Class cls4 = (Class) ITrustedWebActivityCallbackDefault.copydefault(6610 - AndroidCharacter.getMirror('0'), View.getDefaultSize(0, 0) + 56, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                    byte b18 = $$g[10];
                    byte b19 = (byte) (b18 - 1);
                    Object[] objArr15 = new Object[1];
                    c(b19, (byte) (b19 | 32), (byte) (b18 - 1), objArr15);
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
        int i10 = component2 + 21;
        copydefault = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        component2 = i2 % 128;
        Binding binding = i2 % 2 != 0 ? (Binding) DataBindingUtil.inflate(getLayoutInflater(layoutInflater), getLayoutId(), viewGroup, false) : (Binding) DataBindingUtil.inflate(getLayoutInflater(layoutInflater), getLayoutId(), viewGroup, false);
        this.binding = binding;
        return binding.getRoot();
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null) {
            return;
        }
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
            window.setGravity(80);
            window.setWindowAnimations(R.style.BottomAnimation);
            window.setBackgroundDrawableResource(android.R.color.transparent);
            dialog.setCancelable(true);
            dialog.setCanceledOnTouchOutside(true);
            int i4 = copydefault + 43;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        int i6 = component2 + 13;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
    }
}
