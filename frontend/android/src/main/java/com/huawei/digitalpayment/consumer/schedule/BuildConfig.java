package com.huawei.digitalpayment.consumer.schedule;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancel;

public final class BuildConfig {
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String LIBRARY_PACKAGE_NAME;
    private static int ShareDataUIState;
    private static char[] component1;
    private static boolean component2;
    private static int component4;
    private static boolean copydefault;
    private static final byte[] $$a = {89, 120, -98, -110};
    private static final int $$b = 89;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component3 = 0;

    private static String $$c(byte b2, short s, int i) {
        int i2 = i + 4;
        byte[] bArr = $$a;
        int i3 = s * 3;
        int i4 = (b2 * 5) + 68;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i4 = i5 + i4;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i2++;
            i4 += bArr[i2];
        }
    }

    private static void a(int i, int[] iArr, byte[] bArr, char[] cArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr3 = component1;
        char c2 = '0';
        int i3 = 0;
        if (cArr3 != null) {
            int i4 = $10 + 89;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr3[i5]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i3;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3760 - TextUtils.getOffsetAfter("", i3), MotionEvent.axisFromString("") + 25, (char) (TextUtils.indexOf("", c2, i3) + 1), -1670574543, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i5++;
                    c2 = '0';
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i6 = $10 + 1;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(ShareDataUIState)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 7140, View.MeasureSpec.getMode(0) + 13, (char) TextUtils.indexOf("", "", 0, 0), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i8 = 689978476;
        if (component2) {
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            int i9 = $10 + 67;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 4 / 3;
            }
            while (cancelVar.component3 < cancelVar.component1) {
                int i11 = $11 + 85;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = cancelVar.component3;
                    int i13 = cancelVar.component1;
                    cArr4[i12] = (char) (cArr3[bArr[0 - cancelVar.component3] % i] >>> iIntValue);
                    Object[] objArr4 = {cancelVar, cancelVar};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i8);
                    if (objCopydefault3 == null) {
                        int deadChar = 2748 - KeyEvent.getDeadChar(0, 0);
                        int i14 = 20 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 7644);
                        byte b4 = (byte) ($$b & 7);
                        byte b5 = (byte) (b4 - 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(deadChar, i14, scrollBarSize, -327556343, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                } else {
                    cArr4[cancelVar.component3] = (char) (cArr3[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                    Object[] objArr5 = {cancelVar, cancelVar};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault4 == null) {
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 2749;
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 20;
                        char defaultSize = (char) (7644 - View.getDefaultSize(0, 0));
                        byte b6 = (byte) ($$b & 7);
                        byte b7 = (byte) (b6 - 1);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionChild, iIndexOf, defaultSize, -327556343, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                }
                i8 = 689978476;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (copydefault) {
            cancelVar.component1 = cArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr5[cancelVar.component3] = (char) (cArr3[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr6 = {cancelVar, cancelVar};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault5 == null) {
                    int iMyTid = 2748 - (Process.myTid() >> 22);
                    int maxKeyCode = 19 - (KeyEvent.getMaxKeyCode() >> 16);
                    char trimmedLength = (char) (7644 - TextUtils.getTrimmedLength(""));
                    byte b8 = (byte) ($$b & 7);
                    byte b9 = (byte) (b8 - 1);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iMyTid, maxKeyCode, trimmedLength, -327556343, false, $$c(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i15 = 0;
        cancelVar.component1 = iArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        while (true) {
            cancelVar.component3 = i15;
            if (cancelVar.component3 >= cancelVar.component1) {
                objArr[0] = new String(cArr6);
                return;
            }
            int i16 = $10 + 119;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            cArr6[cancelVar.component3] = (char) (cArr3[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
            i15 = cancelVar.component3 + 1;
        }
    }

    static {
        component4 = 1;
        copydefault();
        Object[] objArr = new Object[1];
        a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, null, new byte[]{-119, -114, -122, -117, -119, -123, -127, -110, -124, -109, -119, -125, -122, -110, -111, -126, -127, -124, -115, -111, -119, -125, -112, -121, -113, -114, -121, -115, -118, -116, -118, -117, -124, -118, -119, -120, -121, -122, -123, -124, -125, -126, -127}, null, objArr);
        LIBRARY_PACKAGE_NAME = ((String) objArr[0]).intern();
        int i = component3 + 77;
        component4 = i % 128;
        int i2 = i % 2;
    }

    static void copydefault() {
        component1 = new char[]{30412, 30400, 30406, 30337, 30411, 30270, 30418, 30264, 30414, 30410, 30415, 30408, 30271, 30407, 30403, 30266, 30401, 30268, 30269};
        ShareDataUIState = 321287859;
        copydefault = true;
        component2 = true;
    }
}
