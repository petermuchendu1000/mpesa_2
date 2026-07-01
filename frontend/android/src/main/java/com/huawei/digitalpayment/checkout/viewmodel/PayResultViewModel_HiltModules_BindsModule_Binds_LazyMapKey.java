package com.huawei.digitalpayment.checkout.viewmodel;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;

public final class PayResultViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    static PayResultViewModel ShareDataUIState;
    private static char[] component3;
    private static int copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {Ascii.SI, -112, -70, -94};
    private static final int $$b = 28;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r5, int r6, short r7) {
        /*
            byte[] r0 = com.huawei.digitalpayment.checkout.viewmodel.PayResultViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r5 = r5 * 2
            int r5 = r5 + 1
            int r6 = r6 + 110
            int r7 = r7 * 4
            int r7 = r7 + 4
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            r4 = r0[r7]
        L24:
            int r6 = r6 + r4
            int r7 = r7 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.viewmodel.PayResultViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(short, int, short):java.lang.String");
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        int i = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = component3;
        long j = 0;
        if (cArr2 != null) {
            int i6 = $10 + 73;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0) + 658, 14 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), (char) (TextUtils.getOffsetBefore("", 0) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i8++;
                    j = 0;
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
        char[] cArr4 = new char[i3];
        System.arraycopy(cArr2, i2, cArr4, 0, i3);
        if (bArr != null) {
            char[] cArr5 = new char[i3];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i9 = $10 + 67;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr3 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollDefaultDelay() >> 16) + 4502, 36 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (TextUtils.indexOf("", "", 0, 0) + 27897), -1464227204, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i11] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 5);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3579, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28, (char) View.combineMeasuredStates(0, 0), 1180380354, false, $$c(b4, b5, (byte) (b5 - 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i12] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr5[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1859;
                    int iAlpha = Color.alpha(0) + 34;
                    char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    byte length2 = (byte) $$a.length;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(scrollDefaultDelay, iAlpha, scrollBarFadeDuration, 80302927, false, $$c((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            cArr4 = cArr5;
        }
        if (i5 > 0) {
            char[] cArr6 = new char[i3];
            System.arraycopy(cArr4, 0, cArr6, 0, i3);
            int i13 = i3 - i5;
            System.arraycopy(cArr6, 0, cArr4, i13, i5);
            System.arraycopy(cArr6, i5, cArr4, 0, i13);
        }
        if (z) {
            int i14 = $11 + 75;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                cArr = new char[i3];
                iTrustedWebActivityService_Parcel.copydefault = 1;
            } else {
                cArr = new char[i3];
                iTrustedWebActivityService_Parcel.copydefault = 0;
            }
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                cArr[iTrustedWebActivityService_Parcel.copydefault] = cArr4[(i3 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr4 = cArr;
        }
        if (i4 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                cArr4[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr4[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        String str = new String(cArr4);
        int i15 = $10 + 105;
        $11 = i15 % 128;
        int i16 = i15 % 2;
        objArr[0] = str;
    }

    static {
        copydefault = 1;
        component2();
        Object[] objArr = new Object[1];
        a(new int[]{0, 63, 0, 45}, true, new byte[]{0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component2 + 1;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    static void component2() {
        component3 = new char[]{33480, 33426, 33463, 33467, 33462, 33457, 33453, 33457, 33464, 33456, 33421, 33422, 33451, 33453, 33458, 33464, 33467, 33465, 33466, 33431, 33422, 33454, 33462, 33462, 33452, 33458, 33463, 33457, 33465, 33461, 33457, 33463, 33463, 33465, 33430, 33428, 33464, 33457, 33459, 33460, 33457, 33428, 33426, 33457, 33462, 33464, 33463, 33467, 33462, 33409, 33469, 33457, 33464, 33408, 33466, 33455, 33455, 33451, 33459, 33412, 33466, 33458, 33415};
    }
}
