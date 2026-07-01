package com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel;

import android.os.Process;
import android.util.TypedValue;
import android.view.ViewConfiguration;

public final class FrequentsViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static final byte[] $$a = {125, 44, 8, -98};
    private static final int $$b = 162;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ShareDataUIState = 1;
    private static char[] component1;
    private static long component2;
    private static int component3;
    static FrequentsViewModel copydefault;
    public static String lazyClassKeyName;

    private static String $$c(short s, short s2, byte b2) {
        byte[] bArr = $$a;
        int i = b2 * 2;
        int i2 = 3 - (s2 * 2);
        int i3 = 122 - s;
        byte[] bArr2 = new byte[i + 1];
        int i4 = -1;
        if (bArr == null) {
            i3 = (-i3) + i2;
            i4 = -1;
        }
        while (true) {
            int i5 = i2;
            int i6 = i3;
            int i7 = i4 + 1;
            int i8 = i5 + 1;
            bArr2[i7] = (byte) i6;
            if (i7 == i) {
                return new String(bArr2, 0);
            }
            i2 = i8;
            i3 = (-bArr[i8]) + i6;
            i4 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r25, int r26, char r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FrequentsViewModel_HiltModules_KeyModule_Provide_LazyMapKey.a(int, int, char, java.lang.Object[]):void");
    }

    static {
        component3 = 0;
        component3();
        Object[] objArr = new Object[1];
        a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 72, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = ShareDataUIState + 73;
        component3 = i % 128;
        if (i % 2 != 0) {
            int i2 = 18 / 0;
        }
    }

    static void component3() {
        component1 = new char[]{3093, 24446, 43733, 63085, 16770, 44288, 63613, 19408, 38699, 57984, 20062, 39295, 58571, 12330, 33725, 61195, 14951, 34253, 53560, 15538, 34819, 56168, 9929, 29273, 56746, 10583, 29795, 51140, 4956, 32430, 51729, 5474, 24819, 52291, 8182, 27408, 46700, 502, 27977, 47278, 1088, 22396, 41721, 3605, 22964, 42244, 61585, 17384, 44875, 64174, 17932, 37270, 64758, 18443, 39818, 59173, 12955, 40424, 59733, 13486, 32828, 54153, 16119, 35449, 54751, 8500, 35983, 57294, 11077, 30417, 49721, 11659};
        component2 = 3383208065062231825L;
    }
}
