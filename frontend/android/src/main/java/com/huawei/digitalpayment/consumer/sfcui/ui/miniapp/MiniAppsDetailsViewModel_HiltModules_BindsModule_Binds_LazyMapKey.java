package com.huawei.digitalpayment.consumer.sfcui.ui.miniapp;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancel;

public final class MiniAppsDetailsViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    static MiniAppsDetailsViewModel ShareDataUIState;
    private static char[] component1;
    private static boolean component2;
    private static int component3;
    private static boolean copydefault;
    private static int getRequestBeneficiariesState;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {102, Ascii.FF, 98, 84};
    private static final int $$b = 105;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getAsAtTimestamp = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, short r7, byte r8) {
        /*
            int r8 = r8 * 5
            int r8 = 73 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.MiniAppsDetailsViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r6 = r6 * 2
            int r6 = r6 + 4
            int r7 = r7 * 4
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r6]
            r5 = r3
            r3 = r8
            r8 = r5
        L29:
            int r8 = -r8
            int r8 = r8 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.MiniAppsDetailsViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(int, short, byte):java.lang.String");
    }

    private static void a(int i, int[] iArr, byte[] bArr, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = component1;
        int i4 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $10 + 43;
                $11 = i6 % 128;
                int i7 = i6 % i2;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i4] = Integer.valueOf(cArr2[i5]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i4;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.green(i4) + 3760, (-16777192) - Color.rgb(i4, i4, i4), (char) Color.alpha(i4), -1670574543, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i5++;
                    int i8 = $11 + 69;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
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
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(component3)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Process.getGidForName("") + 7141, 13 - KeyEvent.keyCodeFromString(""), (char) Color.green(0), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i10 = 689978476;
        char c2 = '0';
        if (copydefault) {
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
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2749, TextUtils.lastIndexOf("", '0', 0, 0) + 20, (char) (Drawable.resolveOpacity(0, 0) + 7644), -327556343, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!component2) {
            cancelVar.component1 = iArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            int i11 = $10 + 23;
            $11 = i11 % 128;
            int i12 = 2;
            int i13 = i11 % 2;
            while (cancelVar.component3 < cancelVar.component1) {
                int i14 = $10 + 1;
                $11 = i14 % 128;
                int i15 = i14 % i12;
                cArr5[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                cancelVar.component3++;
                i12 = 2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        cancelVar.component1 = cArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        cancelVar.component3 = 0;
        while (cancelVar.component3 < cancelVar.component1) {
            int i16 = $11 + 117;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
            Object[] objArr5 = {cancelVar, cancelVar};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i10);
            if (objCopydefault4 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(AndroidCharacter.getMirror(c2) + 2700, 20 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (7644 - ((Process.getThreadPriority(0) + 20) >> 6)), -327556343, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
            i10 = 689978476;
            c2 = '0';
        }
        objArr[0] = new String(cArr6);
    }

    static {
        getRequestBeneficiariesState = 0;
        component3();
        Object[] objArr = new Object[1];
        a(127 - ExpandableListView.getPackedPositionType(0L), null, new byte[]{-114, -119, -117, -126, -107, -120, -119, -118, -104, -110, -114, -118, -121, -115, -119, -105, -110, -113, -113, -106, -118, -111, -118, -107, -124, -113, -113, -121, -118, -111, -118, -125, -124, -118, -122, -124, -118, -122, -127, -108, -110, -124, -109, -119, -125, -122, -110, -111, -126, -127, -124, -115, -111, -119, -125, -112, -121, -113, -114, -121, -115, -118, -116, -118, -117, -124, -118, -119, -120, -121, -122, -123, -124, -125, -126, -127}, null, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = getAsAtTimestamp + 107;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void component3() {
        component1 = new char[]{30685, 30673, 30679, 30614, 30680, 30671, 30691, 30665, 30687, 30683, 30684, 30681, 30668, 30676, 30672, 30667, 30678, 30669, 30674, 30686, 30711, 30595, 30716, 30702};
        component3 = 321287744;
        component2 = true;
        copydefault = true;
    }
}
