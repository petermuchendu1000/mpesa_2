package com.huawei.digitalpayment.mobileapp.report;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;

public final class BuildConfig {
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String LIBRARY_PACKAGE_NAME;
    private static int component1;
    private static char[] component3;
    private static final byte[] $$a = {1, -128, 109, -128};
    private static final int $$b = 196;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, int r6, int r7) {
        /*
            int r5 = 115 - r5
            byte[] r0 = com.huawei.digitalpayment.mobileapp.report.BuildConfig.$$a
            int r7 = r7 * 4
            int r1 = 1 - r7
            int r6 = r6 * 2
            int r6 = 4 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            r4 = r0[r6]
            int r3 = r3 + 1
        L26:
            int r6 = r6 + 1
            int r5 = r5 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.mobileapp.report.BuildConfig.$$c(byte, int, int):java.lang.String");
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = component3;
        Object obj = null;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 15;
                $10 = i9 % 128;
                if (i9 % i2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(657 - (ViewConfiguration.getScrollBarSize() >> 8), 14 - KeyEvent.normalizeMetaState(0), (char) (65117 - ImageFormat.getBitsPerPixel(0)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objCopydefault).invoke(obj, objArr2)).charValue();
                        i8 %= 1;
                        i2 = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr[i8])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                        if (objCopydefault2 == null) {
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(657 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 14 - Gravity.getAbsoluteGravity(0, 0), (char) (65118 - View.resolveSize(0, 0)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                        i8++;
                        i2 = 2;
                        obj = null;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            int i10 = $11 + 73;
            $10 = i10 % 128;
            int i11 = 2;
            int i12 = i10 % 2;
            char[] cArr4 = new char[i5];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            int i13 = $10 + 43;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                int i15 = $10 + 85;
                $11 = i15 % 128;
                if (i15 % i11 != 0 ? bArr[iTrustedWebActivityService_Parcel.copydefault] != 1 : bArr[iTrustedWebActivityService_Parcel.copydefault] != 1) {
                    int i16 = iTrustedWebActivityService_Parcel.copydefault;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                        if (objCopydefault3 == null) {
                            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3580;
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29;
                            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                            byte b2 = (byte) ($$a[0] - 1);
                            byte b3 = b2;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(maximumDrawingCacheSize, iIndexOf, cResolveSizeAndState, 1180380354, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i16] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } else {
                    int i17 = iTrustedWebActivityService_Parcel.copydefault;
                    try {
                        Object[] objArr5 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                        if (objCopydefault4 == null) {
                            byte b4 = (byte) 5;
                            byte b5 = (byte) (b4 - 5);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionGroup(0L) + 4502, 37 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 27896), -1464227204, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i17] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                    } catch (Throwable th4) {
                        Throwable cause4 = th4.getCause();
                        if (cause4 == null) {
                            throw th4;
                        }
                        throw cause4;
                    }
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr6 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault5 == null) {
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 1859;
                    int mode = 34 - View.MeasureSpec.getMode(0);
                    char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                    byte b6 = $$a[0];
                    byte b7 = (byte) (b6 - 1);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(pressedStateDuration, mode, jumpTapTimeout, 80302927, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
                i11 = 2;
            }
            int i18 = $10 + 59;
            $11 = i18 % 128;
            int i19 = i18 % 2;
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i20 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i20, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i20);
        }
        if (z) {
            char[] cArr6 = new char[i5];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                int i21 = $11 + 53;
                $10 = i21 % 128;
                if (i21 % 2 != 0) {
                    cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[i5 >> iTrustedWebActivityService_Parcel.copydefault];
                    i = iTrustedWebActivityService_Parcel.copydefault;
                } else {
                    cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i5 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                    i = iTrustedWebActivityService_Parcel.copydefault + 1;
                }
                iTrustedWebActivityService_Parcel.copydefault = i;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                int i22 = $11 + 41;
                $10 = i22 % 128;
                int i23 = i22 % 2;
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static {
        component1 = 1;
        component2();
        Object[] objArr = new Object[1];
        a(new int[]{0, 42, 126, 0}, false, new byte[]{1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0}, objArr);
        LIBRARY_PACKAGE_NAME = ((String) objArr[0]).intern();
        int i = component2 + 19;
        component1 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component2() {
        component3 = new char[]{33455, 33336, 33331, 33300, 33302, 33331, 33334, 33333, 33331, 33338, 33302, 33304, 33339, 33337, 33337, 33331, 33335, 33339, 33331, 33337, 33332, 33326, 33336, 33336, 33328, 33296, 33300, 33331, 33337, 33340, 33335, 33337, 33342, 33337, 33329, 33298, 33297, 33334, 33335, 33330, 33329, 33326};
    }
}
