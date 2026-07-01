package com.huawei.digitalpayment.home.theme.viewmodel;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancel;

public final class HomeThemeViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static boolean ShareDataUIState;
    private static char[] component1;
    private static int component2;
    private static boolean component3;
    private static int copy;
    static HomeThemeViewModel copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {1, -9, -86, 35};
    private static final int $$b = 255;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component4 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, int r7, short r8) {
        /*
            int r7 = r7 + 4
            int r6 = r6 * 2
            int r6 = r6 + 1
            byte[] r0 = com.huawei.digitalpayment.home.theme.viewmodel.HomeThemeViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r8 = r8 * 5
            int r8 = r8 + 68
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r5 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            int r7 = r7 + 1
            r3 = r0[r7]
        L26:
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.home.theme.viewmodel.HomeThemeViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(byte, int, short):java.lang.String");
    }

    private static void a(int i, int[] iArr, byte[] bArr, char[] cArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr3 = component1;
        float f = 0.0f;
        int i3 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr3[i4]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        int iIndexOf = TextUtils.indexOf("", "") + 3760;
                        int offsetAfter = TextUtils.getOffsetAfter("", i3) + 24;
                        char c2 = (char) (1 - (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)));
                        byte b2 = $$a[i3];
                        byte b3 = (byte) (b2 - 1);
                        byte b4 = (byte) (-b2);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, offsetAfter, c2, -1670574543, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr4[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i4++;
                    int i5 = $10 + 73;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
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
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(component2)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7140 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 13 - KeyEvent.keyCodeFromString(""), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i7 = 689978476;
        if (ShareDataUIState) {
            cancelVar.component1 = bArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                int i8 = $10 + 7;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    cArr5[cancelVar.component3] = (char) (cArr3[bArr[cancelVar.component1 >> cancelVar.component3] << i] >> iIntValue);
                    Object[] objArr4 = {cancelVar, cancelVar};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i7);
                    if (objCopydefault3 == null) {
                        int iMyTid = (Process.myTid() >> 22) + 2748;
                        int i9 = 20 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 7644);
                        byte b5 = $$a[0];
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iMyTid, i9, offsetBefore, -327556343, false, $$c((byte) (b5 - 1), (byte) (-b5), b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                } else {
                    cArr5[cancelVar.component3] = (char) (cArr3[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                    Object[] objArr5 = {cancelVar, cancelVar};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault4 == null) {
                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2749;
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 19;
                        char c3 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7644);
                        byte b6 = $$a[0];
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf2, scrollBarSize, c3, -327556343, false, $$c((byte) (b6 - 1), (byte) (-b6), b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                }
                i7 = 689978476;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (component3) {
            int i10 = $11 + 93;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                cancelVar.component1 = cArr.length;
                cArr2 = new char[cancelVar.component1];
                cancelVar.component3 = 1;
            } else {
                cancelVar.component1 = cArr.length;
                cArr2 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
            }
            while (cancelVar.component3 < cancelVar.component1) {
                cArr2[cancelVar.component3] = (char) (cArr3[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr6 = {cancelVar, cancelVar};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault5 == null) {
                    int iLastIndexOf = 2747 - TextUtils.lastIndexOf("", '0');
                    int i11 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 18;
                    char gidForName = (char) (Process.getGidForName("") + 7645);
                    byte b7 = $$a[0];
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf, i11, gidForName, -327556343, false, $$c((byte) (b7 - 1), (byte) (-b7), b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr2);
            return;
        }
        int i12 = 0;
        cancelVar.component1 = iArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        while (true) {
            cancelVar.component3 = i12;
            if (cancelVar.component3 >= cancelVar.component1) {
                objArr[0] = new String(cArr6);
                return;
            } else {
                cArr6[cancelVar.component3] = (char) (cArr3[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                i12 = cancelVar.component3 + 1;
            }
        }
    }

    static {
        copy = 0;
        component1();
        Object[] objArr = new Object[1];
        a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 126, null, new byte[]{-114, -119, -117, -126, -106, -120, -119, -118, -107, -119, -125, -119, -123, -108, -119, -125, -126, -109, -124, -114, -119, -117, -126, -125, -120, -119, -118, -110, -124, -119, -125, -119, -123, -115, -124, -119, -125, -126, -123, -124, -115, -111, -119, -125, -112, -121, -113, -114, -121, -115, -118, -116, -118, -117, -124, -118, -119, -120, -121, -122, -123, -124, -125, -126, -127}, null, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component4 + 17;
        copy = i % 128;
        int i2 = i % 2;
    }

    static void component1() {
        component1 = new char[]{30265, 30253, 30259, 30450, 30260, 30251, 30271, 30245, 30267, 30263, 30264, 30261, 30248, 30256, 30252, 30247, 30258, 30250, 30420, 30408, 30410, 30419};
        component2 = 321287836;
        component3 = true;
        ShareDataUIState = true;
    }
}
