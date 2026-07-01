package com.huawei.digitalpayment.home.viewmodel;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.notify;

public final class BannerViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static int component1;
    private static long component2;
    static BannerViewModel copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {102, -86, -98, TarHeader.LF_DIR};
    private static final int $$b = 83;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component3 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r5, short r6, byte r7) {
        /*
            int r7 = r7 * 3
            int r7 = 4 - r7
            int r5 = r5 * 4
            int r0 = 1 - r5
            int r6 = r6 * 3
            int r6 = r6 + 102
            byte[] r1 = com.huawei.digitalpayment.home.viewmodel.BannerViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L18
            r4 = r5
            r3 = r2
            goto L28
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            int r3 = r3 + 1
            r4 = r1[r7]
        L28:
            int r4 = -r4
            int r6 = r6 + r4
            int r7 = r7 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.home.viewmodel.BannerViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(int, short, byte):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = notifyVar.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3266 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 33 - Color.blue(0), (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 60268), -834797019, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (component2 ^ 5431355972723572778L);
                Object[] objArr3 = {notifyVar, notifyVar};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(687 - TextUtils.getOffsetAfter("", 0), ImageFormat.getBitsPerPixel(0) + 35, (char) (60373 - TextUtils.getCapsMode("", 0, 0)), -1969106284, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i4 = $10 + 97;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
                Object[] objArr4 = {notifyVar, notifyVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(687 - Drawable.resolveOpacity(0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 35, (char) (60373 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), -1969106284, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                int i5 = 47 / 0;
            } else {
                cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
                Object[] objArr5 = {notifyVar, notifyVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 + 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0, 0) + 687, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 33, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 60373), -1969106284, false, $$c(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            int i6 = $11 + 67;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 3 % 2;
            }
        }
        String str = new String(cArr2);
        int i8 = $11 + 79;
        $10 = i8 % 128;
        if (i8 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i9 = 17 / 0;
            objArr[0] = str;
        }
    }

    static {
        component1 = 1;
        component3();
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getWindowTouchSlop() >> 8) + 3461, new char[]{36845, 33380, 38121, 42799, 47602, 52322, 57073, 53594, 58307, 63050, 2194, 7005, 11739, 8232, 12961, 17713, 22463, 27191, 31908, 36656, 33171, 37898, 42629, 47379, 52098, 56925, 53348, 58086, 62831, 2042, 6710, 11491, 16199, 12750, 17491, 22220, 26965, 31699, 36437, 32929, 37736, 42369, 47165, 51895, 56636, 61322, 57882, 62643, 1815, 6558, 11267, 16060, 12517, 17251, 21989, 26737}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component3 + 5;
        component1 = i % 128;
        int i2 = i % 2;
    }

    static void component3() {
        component2 = 8450419043159838628L;
    }
}
