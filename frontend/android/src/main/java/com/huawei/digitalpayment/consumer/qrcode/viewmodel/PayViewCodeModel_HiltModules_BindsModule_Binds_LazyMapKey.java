package com.huawei.digitalpayment.consumer.qrcode.viewmodel;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancel;

public final class PayViewCodeModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static boolean ShareDataUIState;
    private static boolean component1;
    private static int component2;
    static PayViewCodeModel component3;
    private static char[] copydefault;
    private static int equals;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {TarHeader.LF_NORMAL, 86, 58, 71};
    private static final int $$b = 158;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component4 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, byte r8) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r6 = r6 * 5
            int r6 = 73 - r6
            int r8 = r8 * 2
            int r0 = r8 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.qrcode.viewmodel.PayViewCodeModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r3 = r3 + 1
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.viewmodel.PayViewCodeModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(int, int, byte):java.lang.String");
    }

    private static void a(int i, int[] iArr, byte[] bArr, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = copydefault;
        int i3 = 0;
        if (cArr2 != null) {
            int i4 = $10 + 11;
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
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (b2 - 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.getDefaultSize(i3, i3) + 3760, 24 - View.resolveSize(i3, i3), (char) Drawable.resolveOpacity(i3, i3), -1670574543, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
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
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7140 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), View.MeasureSpec.getSize(0) + 13, (char) View.MeasureSpec.getSize(0), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i7 = 689978476;
        if (component1) {
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr4 = {cancelVar, cancelVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i7);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2748, TextUtils.indexOf("", "") + 19, (char) (7644 - (ViewConfiguration.getJumpTapTimeout() >> 16)), -327556343, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                i7 = 689978476;
            }
            String str = new String(cArr4);
            int i8 = $10 + 11;
            $11 = i8 % 128;
            if (i8 % 2 != 0) {
                objArr[0] = str;
                return;
            } else {
                int i9 = 99 / 0;
                objArr[0] = str;
                return;
            }
        }
        if (ShareDataUIState) {
            int i10 = $10 + 109;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cancelVar.component1 = cArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr5[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr5 = {cancelVar, cancelVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2748 - ExpandableListView.getPackedPositionType(0L), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 18, (char) (7644 - (KeyEvent.getMaxKeyCode() >> 16)), -327556343, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr5);
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
                cArr6[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                i12 = cancelVar.component3 + 1;
            }
        }
    }

    static {
        equals = 1;
        component1();
        Object[] objArr = new Object[1];
        a(127 - (ViewConfiguration.getScrollBarSize() >> 8), null, new byte[]{-114, -119, -117, -126, -103, -119, -117, -126, -104, -120, -119, -118, -105, -112, -121, -106, -124, -114, -119, -117, -126, -125, -120, -119, -118, -107, -124, -119, -117, -126, -127, -109, -108, -124, -109, -119, -125, -122, -110, -111, -126, -127, -124, -115, -111, -119, -125, -112, -121, -113, -114, -121, -115, -118, -116, -118, -117, -124, -118, -119, -120, -121, -122, -123, -124, -125, -126, -127}, null, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component4 + 43;
        equals = i % 128;
        int i2 = i % 2;
    }

    static void component1() {
        copydefault = new char[]{30289, 30277, 30283, 30218, 30284, 30275, 30295, 30653, 30291, 30287, 30288, 30285, 30272, 30280, 30276, 30655, 30282, 30273, 30278, 30279, 30274, 30308, 30306, 30321, 30315};
        component2 = 321287732;
        ShareDataUIState = true;
        component1 = true;
    }
}
