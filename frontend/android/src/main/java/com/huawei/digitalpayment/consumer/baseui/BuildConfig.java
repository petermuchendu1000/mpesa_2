package com.huawei.digitalpayment.consumer.baseui;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;

public final class BuildConfig {
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String LIBRARY_PACKAGE_NAME;
    public static final String TOKEN_KEY = "";
    public static final String TOKEN_SECRET = "";
    private static char[] component2;
    private static int component3;
    private static final byte[] $$a = {113, 66, TarHeader.LF_CHR, 67};
    private static final int $$b = 103;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copydefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, byte r7, short r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.baseui.BuildConfig.$$a
            int r6 = r6 + 110
            int r8 = r8 * 4
            int r1 = r8 + 1
            int r7 = r7 * 3
            int r7 = 4 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L20:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L28:
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baseui.BuildConfig.$$c(byte, byte, short):java.lang.String");
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i2 = iArr[0];
        byte b2 = 1;
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = component2;
        long j = 0;
        if (cArr != null) {
            int i6 = $11 + 29;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 93;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTouchSlop() >> 8) + 657, 14 - (ViewConfiguration.getTapTimeout() >> 16), (char) (65119 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1))), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
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
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == b2) {
                    int i11 = iTrustedWebActivityService_Parcel.copydefault;
                    char c3 = cArr3[iTrustedWebActivityService_Parcel.copydefault];
                    Object[] objArr3 = new Object[2];
                    objArr3[b2] = Integer.valueOf(c2);
                    objArr3[0] = Integer.valueOf(c3);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4501 - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.getOffsetBefore("", 0) + 36, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 27898), -1464227204, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault3 == null) {
                        int mirror = AndroidCharacter.getMirror('0') + 3532;
                        int scrollBarSize = 28 - (ViewConfiguration.getScrollBarSize() >> 8);
                        char mode = (char) View.MeasureSpec.getMode(0);
                        byte b5 = (byte) ($$b & 29);
                        byte b6 = (byte) (b5 - 5);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(mirror, scrollBarSize, mode, 1180380354, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    int iIndexOf = 1858 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 35;
                    char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    byte length2 = (byte) $$a.length;
                    byte b7 = (byte) (length2 - 4);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, packedPositionChild, maximumFlingVelocity, 80302927, false, $$c(length2, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                b2 = 1;
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i13 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i13, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i13);
        }
        if (z) {
            int i14 = $10 + 93;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            char[] cArr6 = new char[i3];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i3 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            int i16 = $10 + 89;
            $11 = i16 % 128;
            if (i16 % 2 == 0) {
                iTrustedWebActivityService_Parcel.copydefault = 1;
            } else {
                iTrustedWebActivityService_Parcel.copydefault = 0;
            }
            int i17 = $11 + 21;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static {
        component3 = 0;
        copydefault();
        Object[] objArr = new Object[1];
        a(new int[]{0, 41, 0, 39}, true, new byte[]{1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0}, objArr);
        LIBRARY_PACKAGE_NAME = ((String) objArr[0]).intern();
        int i = copydefault + 99;
        component3 = i % 128;
        int i2 = i % 2;
    }

    static void copydefault() {
        component2 = new char[]{33517, 33459, 33461, 33470, 33431, 33423, 33460, 33462, 33454, 33451, 33455, 33457, 33462, 33431, 33422, 33454, 33462, 33462, 33452, 33458, 33463, 33457, 33465, 33461, 33457, 33463, 33463, 33465, 33430, 33428, 33464, 33457, 33459, 33460, 33457, 33428, 33426, 33457, 33462, 33465, 33456};
    }
}
