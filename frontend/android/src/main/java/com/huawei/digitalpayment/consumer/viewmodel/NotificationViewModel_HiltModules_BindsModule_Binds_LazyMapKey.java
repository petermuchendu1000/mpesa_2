package com.huawei.digitalpayment.consumer.viewmodel;

import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;

public final class NotificationViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static int ShareDataUIState;
    private static char[] component2;
    static NotificationViewModel copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {TarHeader.LF_CHR, -113, 92, 4};
    private static final int $$b = 71;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component1 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r5, byte r6, byte r7) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.viewmodel.NotificationViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r5 = r5 * 3
            int r5 = 4 - r5
            int r7 = r7 + 110
            int r6 = r6 * 4
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L17
            r4 = r7
            r3 = r2
            r7 = r6
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r0[r5]
        L27:
            int r7 = r7 + r4
            int r5 = r5 + 1
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.viewmodel.NotificationViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(short, byte, byte):java.lang.String");
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2;
        char[] cArr;
        char c2;
        int i3 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = component2;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(657 - (Process.myPid() >> 22), (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 13, (char) (Drawable.resolveOpacity(0, 0) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
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
        char[] cArr4 = new char[i5];
        System.arraycopy(cArr2, i4, cArr4, 0, i5);
        if (bArr != null) {
            int i9 = $11 + 103;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr = new char[i5];
                iTrustedWebActivityService_Parcel.copydefault = 0;
                c2 = 1;
            } else {
                cArr = new char[i5];
                iTrustedWebActivityService_Parcel.copydefault = 0;
                c2 = 0;
            }
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i10 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr3 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getMode(0) + 4502, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 35, (char) (27896 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), -1464227204, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i10] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(3580 - TextUtils.indexOf("", ""), 28 - (ViewConfiguration.getTapTimeout() >> 16), (char) ((-1) - TextUtils.lastIndexOf("", '0')), 1180380354, false, $$c(b4, b5, (byte) (b5 + 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i11] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0) + 1860, (KeyEvent.getMaxKeyCode() >> 16) + 34, (char) ((-1) - ImageFormat.getBitsPerPixel(0)), 80302927, false, $$c(b6, b6, (byte) $$a.length), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            cArr4 = cArr;
        }
        if (i7 > 0) {
            int i12 = $10 + 17;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr4, 0, cArr5, 0, i5);
            int i14 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr4, i14, i7);
            System.arraycopy(cArr5, i7, cArr4, 0, i14);
        }
        if (z) {
            char[] cArr6 = new char[i5];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                int i15 = $10 + 87;
                $11 = i15 % 128;
                if (i15 % 2 == 0) {
                    cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr4[(iTrustedWebActivityService_Parcel.copydefault + i5) % 1];
                    i2 = iTrustedWebActivityService_Parcel.copydefault % 1;
                } else {
                    cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr4[(i5 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                    i2 = iTrustedWebActivityService_Parcel.copydefault + 1;
                }
                iTrustedWebActivityService_Parcel.copydefault = i2;
            }
            cArr4 = cArr6;
        }
        if (i6 > 0) {
            int i16 = $10 + 27;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                int i18 = $10 + 63;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    cArr4[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr4[iTrustedWebActivityService_Parcel.copydefault] >> iArr[4]);
                    i = iTrustedWebActivityService_Parcel.copydefault;
                } else {
                    cArr4[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr4[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                    i = iTrustedWebActivityService_Parcel.copydefault + 1;
                }
                iTrustedWebActivityService_Parcel.copydefault = i;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static {
        ShareDataUIState = 1;
        copydefault();
        Object[] objArr = new Object[1];
        a(new int[]{0, 66, 0, 0}, false, new byte[]{1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 1}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component1 + 97;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void copydefault() {
        component2 = new char[]{33518, 33462, 33457, 33426, 33428, 33457, 33460, 33459, 33457, 33464, 33428, 33430, 33465, 33463, 33463, 33457, 33461, 33465, 33457, 33463, 33458, 33452, 33462, 33462, 33454, 33422, 33431, 33462, 33457, 33455, 33451, 33454, 33462, 33460, 33423, 33421, 33456, 33464, 33457, 33453, 33457, 33462, 33467, 33463, 33426, 33505, 33409, 33454, 33457, 33464, 33464, 33465, 33469, 33461, 33457, 33459, 33457, 33469, 33408, 33464, 33457, 33469, 33409, 33462, 33467, 33463};
    }
}
