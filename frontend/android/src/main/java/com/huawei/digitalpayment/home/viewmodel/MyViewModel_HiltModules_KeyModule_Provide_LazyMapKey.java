package com.huawei.digitalpayment.home.viewmodel;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;

public final class MyViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static final byte[] $$a = {90, 10, -103, 87};
    private static final int $$b = 16;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component1 = 0;
    static MyViewModel component2;
    private static char[] component3;
    private static int copydefault;
    public static String lazyClassKeyName;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r7, int r8, short r9) {
        /*
            int r9 = r9 * 3
            int r9 = r9 + 1
            byte[] r0 = com.huawei.digitalpayment.home.viewmodel.MyViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r8 = r8 * 2
            int r8 = 3 - r8
            int r7 = 115 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r8
            r3 = r9
            r5 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r6
        L2a:
            int r8 = r8 + r3
            r3 = r5
            r6 = r8
            r8 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.home.viewmodel.MyViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(byte, int, short):java.lang.String");
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        char c2;
        int i = 2;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = 3;
        int i7 = iArr[3];
        char[] cArr2 = component3;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + i6;
                $11 = i9 % 128;
                if (i9 % i == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(657 - (ViewConfiguration.getLongPressTimeout() >> 16), View.resolveSize(0, 0) + 14, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
                        }
                        cArr3[i8] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        i8 >>>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i8])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(657 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 14 - TextUtils.getTrimmedLength(""), (char) (View.MeasureSpec.getSize(0) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i8++;
                }
                i = 2;
                i6 = 3;
            }
            int i10 = $11 + 43;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            int i12 = $10 + 37;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                cArr = new char[i4];
                iTrustedWebActivityService_Parcel.copydefault = 1;
                c2 = 1;
            } else {
                cArr = new char[i4];
                iTrustedWebActivityService_Parcel.copydefault = 0;
                c2 = 0;
            }
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i13 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault3 == null) {
                        byte b2 = (byte) 5;
                        byte b3 = (byte) (b2 - 5);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4502, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 35, (char) (27897 - KeyEvent.getDeadChar(0, 0)), -1464227204, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i13] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                } else {
                    int i14 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr5 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3580, KeyEvent.getDeadChar(0, 0) + 28, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 1180380354, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i14] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr6 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault5 == null) {
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (b6 - 1);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1859 - Drawable.resolveOpacity(0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 35, (char) (ViewConfiguration.getLongPressTimeout() >> 16), 80302927, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
            cArr4 = cArr;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr4, 0, cArr5, 0, i4);
            int i15 = i4 - i7;
            System.arraycopy(cArr5, 0, cArr4, i15, i7);
            System.arraycopy(cArr5, i7, cArr4, 0, i15);
        }
        if (z) {
            int i16 = $11 + 103;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            char[] cArr6 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i18 = $11 + 49;
                $10 = i18 % 128;
                int i19 = i18 % 2;
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr4[(i4 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            int i20 = $11 + 45;
            $10 = i20 % 128;
            int i21 = i20 % 2;
            cArr4 = cArr6;
        }
        if (i5 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr4[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr4[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static {
        copydefault = 1;
        component1();
        Object[] objArr = new Object[1];
        a(new int[]{0, 52, 0, 49}, true, new byte[]{1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component1 + 117;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    static void component1() {
        component3 = new char[]{33512, 33409, 33469, 33457, 33464, 33408, 33464, 33468, 33506, 33426, 33463, 33467, 33462, 33457, 33453, 33457, 33464, 33456, 33421, 33430, 33462, 33457, 33460, 33428, 33422, 33454, 33462, 33462, 33452, 33458, 33463, 33457, 33465, 33461, 33457, 33463, 33463, 33465, 33430, 33428, 33464, 33457, 33459, 33460, 33457, 33428, 33426, 33457, 33462, 33464, 33463, 33467};
    }
}
