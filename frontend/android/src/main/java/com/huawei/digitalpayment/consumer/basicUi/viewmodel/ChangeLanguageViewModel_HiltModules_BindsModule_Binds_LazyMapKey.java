package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;

public final class ChangeLanguageViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static int ShareDataUIState;
    static ChangeLanguageViewModel component1;
    private static char[] copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {106, 40, -98, -117};
    private static final int $$b = 213;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component3 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, byte r8) {
        /*
            int r6 = r6 * 3
            int r6 = 3 - r6
            int r7 = r7 + 110
            byte[] r0 = com.huawei.digitalpayment.consumer.basicUi.viewmodel.ChangeLanguageViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r8 = r8 * 4
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            r3 = -1
            if (r0 != 0) goto L17
            r7 = r6
            r4 = r8
            goto L2b
        L17:
            r5 = r7
            r7 = r6
            r6 = r5
        L1a:
            int r3 = r3 + 1
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r1[r3] = r4
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L29:
            r4 = r0[r7]
        L2b:
            int r6 = r6 + r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basicUi.viewmodel.ChangeLanguageViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(int, byte, byte):java.lang.String");
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = copydefault;
        float f = 0.0f;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = $11 + 79;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 109;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.rgb(0, 0, 0) + 16777873, 14 - (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 65117), 1951305196, false, "l", new Class[]{Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        i8++;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i8])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(657 - Color.argb(0, 0, 0, 0), View.MeasureSpec.getMode(0) + 14, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 65119), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i8++;
                    f = 0.0f;
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
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i10 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4502 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 36 - Color.blue(0), (char) (ImageFormat.getBitsPerPixel(0) + 27898), -1464227204, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                } else {
                    int i11 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr5 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 5);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3580, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27, (char) View.resolveSizeAndState(0, 0, 0), 1180380354, false, $$c(b4, b5, (byte) (b5 - 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                try {
                    Object[] objArr6 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                    if (objCopydefault5 == null) {
                        int edgeSlop = 1859 - (ViewConfiguration.getEdgeSlop() >> 16);
                        int keyRepeatDelay = 34 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        byte length2 = (byte) $$a.length;
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(edgeSlop, keyRepeatDelay, doubleTapTimeout, 80302927, false, $$c((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault5).invoke(null, objArr6);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i12 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i12, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i12);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i3 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                int i13 = $10 + 99;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static {
        ShareDataUIState = 0;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a(new int[]{0, 76, 0, 0}, false, new byte[]{1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component3 + 7;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    static void ShareDataUIState() {
        copydefault = new char[]{33518, 33462, 33457, 33426, 33428, 33457, 33460, 33459, 33457, 33464, 33428, 33430, 33465, 33463, 33463, 33457, 33461, 33465, 33457, 33463, 33458, 33452, 33462, 33462, 33454, 33422, 33431, 33462, 33457, 33455, 33451, 33454, 33462, 33460, 33423, 33431, 33470, 33461, 33457, 33465, 33411, 33408, 33428, 33421, 33456, 33464, 33457, 33453, 33457, 33462, 33467, 33463, 33426, 33511, 33418, 33467, 33464, 33461, 33465, 33415, 33417, 33464, 33461, 33457, 33460, 33467, 33465, 33410, 33408, 33464, 33457, 33469, 33409, 33462, 33467, 33463};
    }
}
