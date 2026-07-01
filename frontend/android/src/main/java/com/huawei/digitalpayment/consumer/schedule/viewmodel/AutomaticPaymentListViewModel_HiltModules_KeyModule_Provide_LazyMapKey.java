package com.huawei.digitalpayment.consumer.schedule.viewmodel;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;

public final class AutomaticPaymentListViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    static AutomaticPaymentListViewModel ShareDataUIState;
    private static int component2;
    private static char[] component3;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {99, TarHeader.LF_DIR, 44, 107};
    private static final int $$b = 42;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component1 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, byte r7, byte r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.schedule.viewmodel.AutomaticPaymentListViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r8 = 115 - r8
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r6 = r6 * 3
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r6
            r8 = r7
            r3 = r2
            goto L28
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r5
        L28:
            int r7 = r7 + r4
            int r8 = r8 + 1
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.schedule.viewmodel.AutomaticPaymentListViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(short, byte, byte):java.lang.String");
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i2 = iArr[0];
        byte b2 = 1;
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = component3;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(657 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 14 - Color.red(0), (char) (TextUtils.indexOf("", "") + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] != b2) {
                    int i7 = iTrustedWebActivityService_Parcel.copydefault;
                    char c3 = cArr3[iTrustedWebActivityService_Parcel.copydefault];
                    try {
                        Object[] objArr3 = new Object[2];
                        objArr3[b2] = Integer.valueOf(c2);
                        objArr3[0] = Integer.valueOf(c3);
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                        if (objCopydefault2 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3579, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28, (char) (ViewConfiguration.getTouchSlop() >> 8), 1180380354, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i7] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i8 = $11 + 117;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = iTrustedWebActivityService_Parcel.copydefault;
                        char c4 = cArr3[iTrustedWebActivityService_Parcel.copydefault];
                        Object[] objArr4 = new Object[2];
                        objArr4[b2] = Integer.valueOf(c2);
                        objArr4[0] = Integer.valueOf(c4);
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                        if (objCopydefault3 == null) {
                            int trimmedLength = 4502 - TextUtils.getTrimmedLength("");
                            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 36;
                            char c5 = (char) (27897 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            String str$$c = $$c(b5, b6, (byte) (b6 + 5));
                            Class[] clsArr = new Class[2];
                            clsArr[0] = Integer.TYPE;
                            clsArr[b2] = Integer.TYPE;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(trimmedLength, scrollDefaultDelay, c5, -1464227204, false, str$$c, clsArr);
                        }
                        cArr4[i9] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                        throw null;
                    }
                    int i10 = iTrustedWebActivityService_Parcel.copydefault;
                    char c6 = cArr3[iTrustedWebActivityService_Parcel.copydefault];
                    Object[] objArr5 = new Object[2];
                    objArr5[b2] = Integer.valueOf(c2);
                    objArr5[0] = Integer.valueOf(c6);
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault4 == null) {
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 4503;
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 37;
                        char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 27897);
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        String str$$c2 = $$c(b7, b8, (byte) (b8 + 5));
                        Class[] clsArr2 = new Class[2];
                        clsArr2[0] = Integer.TYPE;
                        clsArr2[b2] = Integer.TYPE;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(modifierMetaStateMask, iIndexOf, cResolveSizeAndState, -1464227204, false, str$$c2, clsArr2);
                    }
                    cArr4[i10] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr6 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault5 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = b9;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1859, 33 - ImageFormat.getBitsPerPixel(0), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 80302927, false, $$c(b9, b10, (byte) (b10 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
                b2 = 1;
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i11 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i11, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i11);
        }
        if (z) {
            int i12 = $11 + 57;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr6 = new char[i3];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                int i14 = $10 + 117;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i3 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            int i16 = $11 + 41;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static {
        component2 = 1;
        copydefault();
        Object[] objArr = new Object[1];
        a(new int[]{0, 83, 0, 0}, false, new byte[]{1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 1}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component1 + 93;
        component2 = i % 128;
        if (i % 2 == 0) {
            int i2 = 32 / 0;
        }
    }

    static void copydefault() {
        component3 = new char[]{33518, 33462, 33457, 33426, 33428, 33457, 33460, 33459, 33457, 33464, 33428, 33430, 33465, 33463, 33463, 33457, 33461, 33465, 33457, 33463, 33458, 33452, 33462, 33462, 33454, 33422, 33431, 33462, 33457, 33455, 33451, 33454, 33462, 33460, 33423, 33423, 33460, 33466, 33465, 33467, 33459, 33455, 33463, 33430, 33421, 33456, 33464, 33457, 33453, 33457, 33462, 33467, 33463, 33426, 33512, 33412, 33451, 33454, 33457, 33464, 33461, 33457, 33465, 33414, 33415, 33458, 33452, 33462, 33462, 33454, 33471, 33413, 33457, 33452, 33466, 33408, 33464, 33457, 33469, 33409, 33462, 33467, 33463};
    }
}
