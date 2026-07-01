package com.huawei.digitalpayment.consumer.risk.vm;

import android.graphics.Color;
import android.media.AudioTrack;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancel;

public final class RiskViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    static RiskViewModel ShareDataUIState;
    private static int component1;
    private static char[] component2;
    private static boolean component3;
    private static int component4;
    private static boolean copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {20, 103, 109, TarHeader.LF_BLK};
    private static final int $$b = 184;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int equals = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, int r7, byte r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.risk.vm.RiskViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r6 = r6 * 3
            int r6 = r6 + 1
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r8 = r8 * 5
            int r8 = r8 + 68
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            r3 = r0[r7]
        L28:
            int r8 = r8 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.risk.vm.RiskViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(byte, int, byte):java.lang.String");
    }

    private static void a(int i, int[] iArr, byte[] bArr, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = component2;
        int i3 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $10 + 111;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i4]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i3;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3760, 24 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), -1670574543, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i4++;
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
        Object[] objArr3 = {Integer.valueOf(component1)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        long j = 0;
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7140 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 13, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i7 = 689978476;
        if (component3) {
            int i8 = $10 + 5;
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
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2748 - Gravity.getAbsoluteGravity(0, 0), ExpandableListView.getPackedPositionChild(j) + 20, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 7644), -327556343, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                int i10 = $10 + 117;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                j = 0;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (copydefault) {
            int i12 = $10 + 41;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            cancelVar.component1 = cArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr5[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr5 = {cancelVar, cancelVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i7);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2748 - (ViewConfiguration.getJumpTapTimeout() >> 16), 19 - Color.green(0), (char) (7644 - KeyEvent.normalizeMetaState(0)), -327556343, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                i7 = 689978476;
            }
            String str = new String(cArr5);
            int i14 = $11 + 55;
            $10 = i14 % 128;
            if (i14 % 2 == 0) {
                objArr[0] = str;
                return;
            } else {
                int i15 = 36 / 0;
                objArr[0] = str;
                return;
            }
        }
        int i16 = 0;
        cancelVar.component1 = iArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        while (true) {
            cancelVar.component3 = i16;
            if (cancelVar.component3 >= cancelVar.component1) {
                objArr[0] = new String(cArr6);
                return;
            } else {
                cArr6[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                i16 = cancelVar.component3 + 1;
            }
        }
    }

    static {
        component4 = 0;
        component1();
        Object[] objArr = new Object[1];
        a(KeyEvent.keyCodeFromString("") + 127, null, new byte[]{-114, -119, -117, -126, -104, -120, -119, -118, -105, -108, -110, -118, -106, -124, -125, -107, -124, -108, -110, -118, -109, -124, -109, -119, -125, -122, -110, -111, -126, -127, -124, -115, -111, -119, -125, -112, -121, -113, -114, -121, -115, -118, -116, -118, -117, -124, -118, -119, -120, -121, -122, -123, -124, -125, -126, -127}, null, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = equals + 95;
        component4 = i % 128;
        if (i % 2 != 0) {
            int i2 = 41 / 0;
        }
    }

    static void component1() {
        component2 = new char[]{30407, 30267, 30265, 30456, 30402, 30257, 30405, 30259, 30401, 30269, 30406, 30403, 30262, 30270, 30266, 30253, 30264, 30263, 30260, 30271, 30256, 30420, 30416, 30425};
        component1 = 321287850;
        copydefault = true;
        component3 = true;
    }
}
