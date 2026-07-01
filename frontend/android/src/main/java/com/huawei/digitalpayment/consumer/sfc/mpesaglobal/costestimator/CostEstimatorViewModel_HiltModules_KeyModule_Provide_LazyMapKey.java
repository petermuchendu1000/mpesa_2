package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getSmallIconId;

public final class CostEstimatorViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static int ShareDataUIState;
    private static int component1;
    private static byte[] component2;
    static CostEstimatorViewModel component3;
    private static int component4;
    private static int copydefault;
    private static short[] equals;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {2, 105, -126, -86};
    private static final int $$b = 95;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getAsAtTimestamp = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, int r8) {
        /*
            int r8 = r8 * 3
            int r8 = 4 - r8
            int r6 = 116 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r7 = r7 * 3
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r6 = r6 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(int, int, int):java.lang.String");
    }

    private static void a(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(copydefault)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                int iRgb = Color.rgb(0, 0, 0) + 16778215;
                int size = View.MeasureSpec.getSize(0) + 31;
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 61686);
                byte b3 = (byte) ($$b & 3);
                byte b4 = (byte) (b3 - 3);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iRgb, size, cLastIndexOf, 1874745193, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            long j = 0;
            if (i5 != 0) {
                int i6 = $11 + 27;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
                byte[] bArr = component2;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i7 = 0;
                    while (i7 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                        if (objCopydefault2 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((KeyEvent.getMaxKeyCode() >> 16) + 2984, ExpandableListView.getPackedPositionChild(j) + 49, (char) (KeyEvent.getDeadChar(0, 0) + 54462), -1178636483, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
                        }
                        bArr2[i7] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                        i7++;
                        j = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = component2;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(ShareDataUIState)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault3 == null) {
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 999;
                        int iResolveOpacity = 31 - Drawable.resolveOpacity(0, 0);
                        char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 61685);
                        byte b7 = (byte) ($$b & 3);
                        byte b8 = (byte) (b7 - 3);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(pressedStateDuration, iResolveOpacity, cKeyCodeFromString, 1874745193, false, $$c(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) copydefault) ^ 7083766810336261929L)));
                } else {
                    iIntValue = (short) (((short) (((long) equals[i + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) copydefault) ^ 7083766810336261929L)));
                }
            }
            if (iIntValue > 0) {
                int i8 = $11 + 59;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                getsmalliconid.copydefault = ((i + iIntValue) - 2) + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L)) + i5;
                Object[] objArr5 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(component1), sb};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault4 == null) {
                    int i10 = 1696 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int iMyTid = 37 - (Process.myTid() >> 22);
                    char c2 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    byte length2 = (byte) $$a.length;
                    byte b9 = (byte) (length2 - 4);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i10, iMyTid, c2, -1454191902, false, $$c(length2, b9, b9), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = component2;
                if (bArr4 != null) {
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    for (int i11 = 0; i11 < length3; i11++) {
                        bArr5[i11] = (byte) (((long) bArr4[i11]) ^ 7083766810336261929L);
                    }
                    int i12 = $11 + 21;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    if (z) {
                        int i14 = $11 + 73;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                        byte[] bArr6 = component2;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        short[] sArr = equals;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                    }
                    sb.append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    getsmalliconid.component2++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static {
        component4 = 0;
        copydefault();
        Object[] objArr = new Object[1];
        a((-210575810) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (-106) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (short) (ViewConfiguration.getScrollBarSize() >> 8), (byte) TextUtils.getTrimmedLength(""), TextUtils.getCapsMode("", 0, 0) - 929939053, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = getAsAtTimestamp + 111;
        component4 = i % 128;
        int i2 = i % 2;
    }

    static void copydefault() {
        ShareDataUIState = -45721878;
        copydefault = -238323901;
        component1 = -962147847;
        component2 = new byte[]{-60, 46, 40, -36, Ascii.VT, -1, 59, -43, 58, -51, 42, -46, 58, -35, 45, -36, 40, 7, -8, 40, 45, 5, 60, -107, 42, -46, 58, -35, 45, -36, 40, 39, -40, 40, 45, 37, Ascii.FS, -21, 34, -42, -38, 42, 44, 47, -57, 39, -36, 42, Ascii.SYN, -30, -44, -38, 108, -107, 36, -47, -47, 43, 44, -42, 37, Ascii.FS, -109, 47, 32, -47, -35, TarHeader.LF_LINK, -40, 45, 34, -60, 34, 43, -41, 44, Ascii.US, -20, 45, -57, 63, -59, 36, 19, -24, -41, 37};
    }
}
