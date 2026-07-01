package com.huawei.digitalpayment.consumer.home.ui.viewmodel;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancel;

public final class BalancesViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    static BalancesViewModel ShareDataUIState;
    private static int component1;
    private static char[] component2;
    private static boolean component3;
    private static int copy;
    private static boolean copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {111, -53, -88, 102};
    private static final int $$b = 64;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getRequestBeneficiariesState = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, byte r8) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.home.ui.viewmodel.BalancesViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r8 = r8 * 5
            int r8 = 73 - r8
            int r7 = r7 * 3
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2d
        L17:
            r3 = r2
        L18:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2d:
            int r6 = r6 + 1
            int r4 = -r4
            int r8 = r8 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.viewmodel.BalancesViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(int, byte, byte):java.lang.String");
    }

    private static void a(int i, int[] iArr, byte[] bArr, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = component2;
        int i3 = 0;
        if (cArr2 != null) {
            int i4 = $11 + 57;
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
                        byte b2 = (byte) i3;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((Process.myTid() >> 22) + 3760, (-16777192) - Color.rgb(i3, i3, i3), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), -1670574543, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
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
        try {
            Object[] objArr3 = {Integer.valueOf(component1)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
            char c2 = '0';
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7139, TextUtils.lastIndexOf("", '0') + 14, (char) View.resolveSize(0, 0), 1487437377, false, "C", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
            int i7 = 689978476;
            if (component3) {
                cancelVar.component1 = bArr.length;
                char[] cArr4 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    int i8 = $11 + 91;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                    Object[] objArr4 = {cancelVar, cancelVar};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i7);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSizeAndState(0, 0, 0) + 2748, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 19, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 7644), -327556343, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                    i7 = 689978476;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!copydefault) {
                cancelVar.component1 = iArr.length;
                char[] cArr5 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    int i10 = $10 + 33;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr5[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    cancelVar.component3++;
                    int i12 = $11 + 95;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            cancelVar.component1 = cArr.length;
            char[] cArr6 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr5 = {cancelVar, cancelVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2748 - TextUtils.getTrimmedLength(""), 18 - TextUtils.lastIndexOf("", c2), (char) (7644 - ExpandableListView.getPackedPositionGroup(0L)), -327556343, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                c2 = '0';
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static {
        copy = 1;
        copydefault();
        Object[] objArr = new Object[1];
        a(127 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), null, new byte[]{-114, -119, -117, -126, -105, -120, -119, -118, -106, -110, -119, -127, -111, -121, -114, -121, -107, -124, -114, -119, -117, -126, -125, -120, -119, -118, -108, -124, -118, -122, -124, -119, -125, -126, -123, -124, -109, -119, -125, -122, -110, -111, -126, -127, -124, -115, -111, -119, -125, -112, -121, -113, -114, -121, -115, -118, -116, -118, -117, -124, -118, -119, -120, -121, -122, -123, -124, -125, -126, -127}, null, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = getRequestBeneficiariesState + 45;
        copy = i % 128;
        int i2 = i % 2;
    }

    static void copydefault() {
        component2 = new char[]{30229, 30217, 30223, 30414, 30224, 30215, 30235, 30209, 30231, 30227, 30228, 30225, 30212, 30220, 30216, 30211, 30222, 30213, 30218, 30214, 30266, 30246, 30255};
        component1 = 321287928;
        copydefault = true;
        component3 = true;
    }
}
