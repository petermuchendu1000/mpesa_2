package com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancel;

public final class BillManagerViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    static BillManagerViewModel ShareDataUIState;
    private static char[] component1;
    private static int component2;
    private static boolean component3;
    private static int copy;
    private static boolean copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {57, 126, 65, 8};
    private static final int $$b = 139;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int equals = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, int r7, short r8) {
        /*
            int r7 = r7 * 4
            int r0 = 1 - r7
            int r6 = r6 * 5
            int r6 = 73 - r6
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L19
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2c
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L27:
            r3 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2c:
            int r8 = -r8
            int r6 = r6 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(short, int, short):java.lang.String");
    }

    private static void a(int i, int[] iArr, byte[] bArr, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = component1;
        int i3 = 0;
        if (cArr2 != null) {
            int i4 = $11 + 79;
            $10 = i4 % 128;
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
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 3760;
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(i3) + 25;
                        char size = (char) View.MeasureSpec.getSize(i3);
                        byte b2 = (byte) ($$b & 5);
                        byte b3 = (byte) (b2 - 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iKeyCodeFromString, bitsPerPixel, size, -1670574543, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i6++;
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
        Object[] objArr3 = {Integer.valueOf(component2)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        long j = 0;
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getMode(0) + 7140, (ViewConfiguration.getTapTimeout() >> 16) + 13, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i7 = 689978476;
        if (copydefault) {
            int i8 = $10 + 101;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr4 = {cancelVar, cancelVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2747 - ImageFormat.getBitsPerPixel(0), 20 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 7644), -327556343, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                j = 0;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (component3) {
            int i10 = $10 + 121;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cancelVar.component1 = cArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                int i12 = $11 + 69;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    cArr5[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 + 1) % cancelVar.component3] >> i] >>> iIntValue);
                    Object[] objArr5 = {cancelVar, cancelVar};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i7);
                    if (objCopydefault4 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2749 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), Color.green(0) + 19, (char) (Color.argb(0, 0, 0, 0) + 7644), -327556343, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                } else {
                    cArr5[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    Object[] objArr6 = {cancelVar, cancelVar};
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault5 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2748 - Color.alpha(0), 18 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 7644), -327556343, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault5).invoke(null, objArr6);
                }
                i7 = 689978476;
            }
            objArr[0] = new String(cArr5);
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
    }

    static {
        copy = 0;
        component3();
        Object[] objArr = new Object[1];
        a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 127, null, new byte[]{-114, -119, -117, -126, -105, -120, -119, -118, -104, -109, -119, -116, -121, -111, -121, -105, -114, -114, -118, -106, -124, -109, -119, -116, -121, -111, -121, -125, -114, -114, -118, -107, -124, -118, -122, -124, -121, -110, -119, -113, -124, -118, -122, -127, -108, -110, -124, -109, -119, -125, -122, -110, -111, -126, -127, -124, -115, -111, -119, -125, -112, -121, -113, -114, -121, -115, -118, -116, -118, -117, -124, -118, -119, -120, -121, -122, -123, -124, -125, -126, -127}, null, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = equals + 109;
        copy = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void component3() {
        component1 = new char[]{30708, 30696, 30702, 30633, 30707, 30694, 30714, 30688, 30710, 30706, 30711, 30704, 30695, 30703, 30699, 30690, 30697, 30692, 30693, 30705, 30709, 30613, 30606, 30593};
        component2 = 321287771;
        component3 = true;
        copydefault = true;
    }
}
