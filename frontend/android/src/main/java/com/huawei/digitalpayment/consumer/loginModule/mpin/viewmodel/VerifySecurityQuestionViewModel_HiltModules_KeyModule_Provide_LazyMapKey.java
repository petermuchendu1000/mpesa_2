package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancel;

public final class VerifySecurityQuestionViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static boolean ShareDataUIState;
    private static int component1;
    private static boolean component2;
    static VerifySecurityQuestionViewModel component3;
    private static char[] copydefault;
    private static int getAsAtTimestamp;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {105, -91, -115, Ascii.US};
    private static final int $$b = 131;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int equals = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r7, short r8, byte r9) {
        /*
            int r7 = r7 * 5
            int r7 = r7 + 68
            int r8 = r8 * 3
            int r8 = r8 + 1
            byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.VerifySecurityQuestionViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r9 = r9 * 2
            int r9 = r9 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r9
            r4 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            r3 = r0[r9]
            r6 = r3
            r3 = r7
            r7 = r6
        L29:
            int r9 = r9 + 1
            int r7 = r7 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.VerifySecurityQuestionViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(short, short, byte):java.lang.String");
    }

    private static void a(int i, int[] iArr, byte[] bArr, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = copydefault;
        float f = 0.0f;
        int i3 = 0;
        if (cArr2 != null) {
            int i4 = $10 + 75;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i6]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i3;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3759 - TextUtils.lastIndexOf("", '0', i3, i3), 25 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)), (char) ExpandableListView.getPackedPositionType(0L), -1670574543, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i6++;
                    f = 0.0f;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(component1)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTouchSlop() >> 8) + 7140, 13 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1487437377, false, "C", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
            int i7 = 689978476;
            if (ShareDataUIState) {
                cancelVar.component1 = bArr.length;
                char[] cArr4 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                    Object[] objArr4 = {cancelVar, cancelVar};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i7);
                    if (objCopydefault3 == null) {
                        int gidForName = 2747 - Process.getGidForName("");
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 19;
                        char cRed = (char) (Color.red(0) + 7644);
                        byte b4 = (byte) ($$b & 5);
                        byte b5 = (byte) (b4 - 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(gidForName, iResolveOpacity, cRed, -327556343, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                    i7 = 689978476;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (component2) {
                int i8 = $10 + 19;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                cancelVar.component1 = cArr.length;
                char[] cArr5 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                int i10 = $10 + 107;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 3 % 2;
                }
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr5[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    try {
                        Object[] objArr5 = {cancelVar, cancelVar};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                        if (objCopydefault4 == null) {
                            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 2748;
                            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 19;
                            char doubleTapTimeout = (char) (7644 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                            byte b6 = (byte) ($$b & 5);
                            byte b7 = (byte) (b6 - 1);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(scrollBarSize, windowTouchSlop, doubleTapTimeout, -327556343, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault4).invoke(null, objArr5);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                String str = new String(cArr5);
                int i12 = $11 + 43;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    throw null;
                }
                objArr[0] = str;
                return;
            }
            int i13 = 0;
            cancelVar.component1 = iArr.length;
            char[] cArr6 = new char[cancelVar.component1];
            while (true) {
                cancelVar.component3 = i13;
                if (cancelVar.component3 >= cancelVar.component1) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    i13 = cancelVar.component3 + 1;
                }
            }
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    static {
        getAsAtTimestamp = 1;
        component2();
        Object[] objArr = new Object[1];
        Object obj = null;
        a(127 - View.resolveSizeAndState(0, 0, 0), null, new byte[]{-114, -119, -117, -126, -108, -120, -119, -118, -106, -111, -126, -118, -115, -110, -119, -122, -103, -112, -115, -118, -109, -122, -127, -119, -104, -112, -105, -118, -109, -119, -106, -124, -114, -119, -117, -126, -125, -120, -119, -118, -107, -124, -111, -118, -113, -125, -124, -119, -114, -122, -117, -126, -108, -111, -118, -116, -126, -114, -124, -109, -119, -125, -122, -110, -111, -126, -127, -124, -115, -111, -119, -125, -112, -121, -113, -114, -121, -115, -118, -116, -118, -117, -124, -118, -119, -120, -121, -122, -123, -124, -125, -126, -127}, null, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = equals + 119;
        getAsAtTimestamp = i % 128;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static void component2() {
        copydefault = new char[]{30294, 30282, 30280, 30219, 30285, 30272, 30292, 30274, 30288, 30284, 30289, 30290, 30273, 30281, 30277, 30652, 30283, 30278, 30279, 30312, 30275, 30307, 30291, 30310, 30308};
        component1 = 321287733;
        component2 = true;
        ShareDataUIState = true;
    }
}
