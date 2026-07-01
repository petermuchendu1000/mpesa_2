package com.huawei.digitalpayment.home.viewmodel;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancel;

public final class HomeServiceManagerViewModel2_HiltModules_KeyModule_Provide_LazyMapKey {
    private static boolean ShareDataUIState;
    private static boolean component1;
    private static char[] component2;
    private static int component3;
    private static int component4;
    static HomeServiceManagerViewModel2 copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {109, 5, -57, 108};
    private static final int $$b = 59;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getRequestBeneficiariesState = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, short r7, byte r8) {
        /*
            int r7 = r7 * 4
            int r0 = r7 + 1
            int r8 = r8 * 5
            int r8 = 73 - r8
            byte[] r1 = com.huawei.digitalpayment.home.viewmodel.HomeServiceManagerViewModel2_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L20:
            int r6 = r6 + 1
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.home.viewmodel.HomeServiceManagerViewModel2_HiltModules_KeyModule_Provide_LazyMapKey.$$c(short, short, byte):java.lang.String");
    }

    private static void a(int i, int[] iArr, byte[] bArr, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = component2;
        char c2 = '0';
        int i4 = -1;
        int i5 = 0;
        if (cArr2 != null) {
            int i6 = $11 + 89;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 71;
                $10 = i9 % 128;
                if (i9 % i2 != 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i5] = Integer.valueOf(cArr2[i8]);
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                        if (objCopydefault == null) {
                            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3760;
                            int maximumDrawingCacheSize = 24 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            char cIndexOf = (char) (TextUtils.indexOf("", c2, i5) + 1);
                            byte b2 = (byte) i4;
                            byte b3 = (byte) (b2 + 1);
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(maximumFlingVelocity, maximumDrawingCacheSize, cIndexOf, -1670574543, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i8] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        i8--;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i8])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3760, Color.red(0) + 24, (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), -1670574543, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i8++;
                }
                i2 = 2;
                c2 = '0';
                i4 = -1;
                i5 = 0;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(component3)};
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 7139, TextUtils.lastIndexOf("", '0') + 14, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
        int i10 = 689978476;
        if (component1) {
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr5 = {cancelVar, cancelVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2747, 19 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) ((-16769572) - Color.rgb(0, 0, 0)), -327556343, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!ShareDataUIState) {
            cancelVar.component1 = iArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            int i11 = $10 + 11;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr5[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                cancelVar.component3++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        cancelVar.component1 = cArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        cancelVar.component3 = 0;
        while (cancelVar.component3 < cancelVar.component1) {
            int i13 = $10 + 89;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
            Object[] objArr6 = {cancelVar, cancelVar};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i10);
            if (objCopydefault5 == null) {
                byte b8 = (byte) (-1);
                byte b9 = (byte) (b8 + 1);
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetAfter("", 0) + 2748, 19 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 7644), -327556343, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
            i10 = 689978476;
        }
        objArr[0] = new String(cArr6);
    }

    static {
        component4 = 1;
        component1();
        Object[] objArr = new Object[1];
        a(128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), null, new byte[]{-104, -114, -119, -117, -126, -106, -120, -119, -118, -105, -107, -119, -116, -121, -111, -121, -106, -119, -127, -118, -110, -107, -119, -108, -119, -125, -126, -109, -124, -114, -119, -117, -126, -125, -120, -119, -118, -110, -124, -119, -125, -126, -123, -124, -115, -111, -119, -125, -112, -121, -113, -114, -121, -115, -118, -116, -118, -117, -124, -118, -119, -120, -121, -122, -123, -124, -125, -126, -127}, null, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = getRequestBeneficiariesState + 13;
        component4 = i % 128;
        int i2 = i % 2;
    }

    static void component1() {
        component2 = new char[]{30329, 30317, 30323, 30258, 30324, 30315, 30335, 30309, 30331, 30327, 30328, 30325, 30312, 30320, 30316, 30311, 30322, 30314, 30228, 30217, 30318, 30227, 30218, 30254};
        component3 = 321287900;
        ShareDataUIState = true;
        component1 = true;
    }
}
