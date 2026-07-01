package com.huawei.digitalpayment.consumer.webviewui;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getActiveNotifications;

public final class BuildConfig {
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String LIBRARY_PACKAGE_NAME;
    private static int[] component3;
    private static int copydefault;
    private static final byte[] $$a = {102, Ascii.FF, 98, 84};
    private static final int $$b = 162;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component1 = 1;

    private static String $$c(short s, short s2, int i) {
        int i2 = i * 2;
        int i3 = 107 - s;
        byte[] bArr = $$a;
        int i4 = (s2 * 4) + 4;
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 += -i4;
            i4++;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i2) {
                return new String(bArr2, 0);
            }
            int i7 = i4;
            i3 += -bArr[i4];
            i4 = i7 + 1;
            i5 = i6;
        }
    }

    private static void a(int i, int[] iArr, Object[] objArr) throws Throwable {
        int[] iArr2;
        int i2 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = component3;
        int i3 = 684241640;
        char c2 = '0';
        float f = 0.0f;
        int i4 = 1;
        char c3 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[c3] = Integer.valueOf(iArr3[i5]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i3);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (b2 - 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4391 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), AndroidCharacter.getMirror(c2) - 11, (char) (MotionEvent.axisFromString("") + 1), -309236339, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr4[i5] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i5++;
                    i3 = 684241640;
                    c2 = '0';
                    f = 0.0f;
                    c3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = component3;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i6 = 0;
            while (i6 < length3) {
                Object[] objArr3 = new Object[i4];
                objArr3[0] = Integer.valueOf(iArr6[i6]);
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) i4;
                    byte b5 = (byte) (b4 - 1);
                    iArr2 = iArr6;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4391 - View.MeasureSpec.makeMeasureSpec(0, 0), 37 - Color.alpha(0), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), -309236339, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                } else {
                    iArr2 = iArr6;
                }
                iArr7[i6] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                i6++;
                iArr6 = iArr2;
                i4 = 1;
            }
            iArr6 = iArr7;
        }
        char c4 = 0;
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
        getactivenotifications.component1 = 0;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[c4] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr5);
            int i7 = 0;
            while (i7 < 16) {
                getactivenotifications.ShareDataUIState ^= iArr5[i7];
                try {
                    Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) 3;
                        byte b7 = (byte) (b6 - 3);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(((Process.getThreadPriority(0) + 20) >> 6) + 2968, 16 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (AndroidCharacter.getMirror('0') + 49823), 462826032, false, $$c(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                    getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                    getactivenotifications.component2 = iIntValue;
                    i7++;
                    int i8 = $10 + 91;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i10 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i10;
            getactivenotifications.component2 ^= iArr5[16];
            getactivenotifications.ShareDataUIState ^= iArr5[17];
            int i11 = getactivenotifications.ShareDataUIState;
            int i12 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr5);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr5 = {getactivenotifications, getactivenotifications};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2944 - (ViewConfiguration.getJumpTapTimeout() >> 16), Gravity.getAbsoluteGravity(0, 0) + 24, (char) (27636 - TextUtils.indexOf((CharSequence) "", '0')), -1616366948, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
            int i13 = $11 + 27;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 5 / 5;
            }
            c4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        copydefault = 0;
        component1();
        Object[] objArr = new Object[1];
        a(44 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), new int[]{-1072737628, 98017977, -1485423380, 1688970933, 307284323, -291110699, -1398306297, -2096286206, -1776977734, -1474864535, -1749544818, 1223177370, 1829962795, 1662300903, -1194793269, 200036492, -1948119418, -319489862, 815562717, -739880602, 1429603463, -474244052}, objArr);
        LIBRARY_PACKAGE_NAME = ((String) objArr[0]).intern();
        int i = component1 + 37;
        copydefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void component1() {
        component3 = new int[]{523154954, 1569834768, 392155237, -356471361, -252858281, -476748361, 973125860, 263008774, 1148032770, 1616373522, 445398245, 563964230, -850168436, 1796159070, -2104319760, -1771409247, 1975063812, 1811669577};
    }
}
