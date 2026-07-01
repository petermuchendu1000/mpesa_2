package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;

public final class AppShareViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static char[] ShareDataUIState;
    private static int component2;
    static AppShareViewModel component3;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {60, -123, -116, -1};
    private static final int $$b = 235;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component1 = 0;

    private static String $$c(short s, byte b2, int i) {
        int i2 = b2 + 4;
        byte[] bArr = $$a;
        int i3 = 115 - i;
        int i4 = s * 3;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i3 = (-i2) + i3;
            i2 = i2;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            int i7 = i2 + 1;
            i5 = i6;
            i3 = (-bArr[i7]) + i3;
            i2 = i7;
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        int i;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = ShareDataUIState;
        char c2 = '0';
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", c2, 0, 0) + 658, 14 - KeyEvent.normalizeMetaState(0), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i7++;
                    c2 = '0';
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
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            char[] cArr5 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c3 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i8 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr3 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c3)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault2 == null) {
                        int iRgb = Color.rgb(0, 0, 0) + 16781718;
                        int mirror = 'T' - AndroidCharacter.getMirror('0');
                        char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 27897);
                        byte b2 = $$a[3];
                        byte b3 = (byte) (b2 + 1);
                        byte b4 = b2;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iRgb, mirror, maxKeyCode, -1464227204, false, $$c(b3, b4, (byte) (b4 & 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i8] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    int i9 = $11 + 7;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                } else {
                    int i11 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c3)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault3 == null) {
                        int tapTimeout = 3580 - (ViewConfiguration.getTapTimeout() >> 16);
                        int i12 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 28;
                        char c4 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        byte b5 = $$a[3];
                        byte b6 = (byte) (b5 + 1);
                        byte b7 = b5;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(tapTimeout, i12, c4, 1180380354, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i11] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c3 = cArr5[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1859;
                    int iIndexOf = 34 - TextUtils.indexOf("", "");
                    char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                    byte b8 = $$a[3];
                    byte b9 = (byte) (b8 + 1);
                    byte b10 = b8;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionType, iIndexOf, absoluteGravity, 80302927, false, $$c(b9, b10, (byte) (-b10)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            cArr4 = cArr5;
        }
        if (i6 > 0) {
            int i13 = $11 + 85;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr6 = new char[i4];
            System.arraycopy(cArr4, 0, cArr6, 0, i4);
            int i15 = i4 - i6;
            System.arraycopy(cArr6, 0, cArr4, i15, i6);
            System.arraycopy(cArr6, i6, cArr4, 0, i15);
        }
        if (z) {
            int i16 = $11 + 35;
            $10 = i16 % 128;
            if (i16 % 2 != 0) {
                cArr = new char[i4];
                iTrustedWebActivityService_Parcel.copydefault = 1;
            } else {
                cArr = new char[i4];
                iTrustedWebActivityService_Parcel.copydefault = 0;
            }
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i17 = $10 + 23;
                $11 = i17 % 128;
                if (i17 % 2 == 0) {
                    cArr[iTrustedWebActivityService_Parcel.copydefault] = cArr4[(i4 - iTrustedWebActivityService_Parcel.copydefault) >>> 1];
                    i = iTrustedWebActivityService_Parcel.copydefault;
                } else {
                    cArr[iTrustedWebActivityService_Parcel.copydefault] = cArr4[(i4 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                    i = iTrustedWebActivityService_Parcel.copydefault + 1;
                }
                iTrustedWebActivityService_Parcel.copydefault = i;
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr4[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr4[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        String str = new String(cArr4);
        int i18 = $10 + 19;
        $11 = i18 % 128;
        int i19 = i18 % 2;
        objArr[0] = str;
    }

    static {
        component2 = 1;
        component3();
        Object[] objArr = new Object[1];
        a(new int[]{0, 70, 102, 0}, false, new byte[]{1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component1 + 35;
        component2 = i % 128;
        int i2 = i % 2;
    }

    static void component3() {
        ShareDataUIState = new char[]{33467, 33296, 33291, 33388, 33390, 33291, 33294, 33293, 33291, 33298, 33390, 33392, 33299, 33297, 33297, 33291, 33295, 33299, 33291, 33297, 33292, 33286, 33296, 33296, 33288, 33384, 33393, 33296, 33291, 33289, 33285, 33288, 33296, 33294, 33385, 33393, 33304, 33295, 33291, 33299, 33309, 33306, 33390, 33383, 33290, 33298, 33291, 33287, 33291, 33296, 33301, 33297, 33388, 33346, 33377, 33289, 33304, 33308, 33301, 33296, 33294, 33308, 33306, 33298, 33291, 33303, 33307, 33296, 33301, 33297};
    }
}
