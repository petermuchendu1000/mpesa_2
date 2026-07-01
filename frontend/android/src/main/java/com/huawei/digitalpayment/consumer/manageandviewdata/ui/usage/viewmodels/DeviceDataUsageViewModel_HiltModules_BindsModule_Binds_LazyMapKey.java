package com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.viewmodels;

import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getActiveNotifications;

public final class DeviceDataUsageViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    static DeviceDataUsageViewModel component1;
    private static int[] component2;
    private static int copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {Ascii.ETB, -38, -83, 70};
    private static final int $$b = 97;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component3 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, byte r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.viewmodels.DeviceDataUsageViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r8 = r8 * 4
            int r1 = r8 + 1
            int r7 = r7 + 104
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L1f
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L1f:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.viewmodels.DeviceDataUsageViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(int, int, byte):java.lang.String");
    }

    private static void a(int i, int[] iArr, Object[] objArr) throws Throwable {
        int[] iArr2;
        int i2 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = component2;
        int i3 = 684241640;
        int i4 = -1;
        int i5 = 1;
        int i6 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i6] = Integer.valueOf(iArr3[i7]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i3);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i4;
                        byte b3 = (byte) (b2 + 3);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4391 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.getOffsetAfter("", i6) + 37, (char) TextUtils.indexOf("", "", i6, i6), -309236339, false, $$c(b2, b3, (byte) (b3 - 2)), new Class[]{Integer.TYPE});
                    }
                    iArr4[i7] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i7++;
                    i3 = 684241640;
                    i4 = -1;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = component2;
        long j = 0;
        if (iArr6 != null) {
            int i8 = $11 + 99;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                try {
                    Object[] objArr3 = new Object[i5];
                    objArr3[0] = Integer.valueOf(iArr6[i10]);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 3);
                        iArr2 = iArr6;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarSize() >> 8) + 4391, 36 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), -309236339, false, $$c(b4, b5, (byte) (b5 - 2)), new Class[]{Integer.TYPE});
                    } else {
                        iArr2 = iArr6;
                    }
                    iArr7[i10] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    i10++;
                    iArr6 = iArr2;
                    j = 0;
                    i5 = 1;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr6 = iArr7;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
        getactivenotifications.component1 = 0;
        int i11 = $10 + 13;
        $11 = i11 % 128;
        int i12 = i11 % 2;
        while (getactivenotifications.component1 < iArr.length) {
            int i13 = $10 + 125;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr[0] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr5);
            int i15 = 0;
            for (int i16 = 16; i15 < i16; i16 = 16) {
                getactivenotifications.ShareDataUIState ^= iArr5[i15];
                Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarSize() >> 8) + 2968, 16 - (ViewConfiguration.getTouchSlop() >> 8), (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 49871), 462826032, false, $$c(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i15++;
                int i17 = $11 + 91;
                $10 = i17 % 128;
                int i18 = i17 % 2;
            }
            int i19 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i19;
            getactivenotifications.component2 ^= iArr5[16];
            getactivenotifications.ShareDataUIState ^= iArr5[17];
            int i20 = getactivenotifications.ShareDataUIState;
            int i21 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr5);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr5 = {getactivenotifications, getactivenotifications};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault4 == null) {
                byte b8 = (byte) (-1);
                byte b9 = (byte) (b8 + 4);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2943 - ExpandableListView.getPackedPositionChild(0L), TextUtils.lastIndexOf("", '0') + 25, (char) (ExpandableListView.getPackedPositionChild(0L) + 27638), -1616366948, false, $$c(b8, b9, (byte) (b9 - 3)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        copydefault = 0;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a(97 - (Process.myTid() >> 22), new int[]{-1839917068, 251486167, -497985095, 1771507300, -1665918153, -148207050, -1584291330, 1797687502, 38193759, -618245627, 1938326395, 499913404, 812030497, 1479609060, 1649377100, -2099116358, -1386835385, -52523836, -1483063907, 981461810, 1095038622, -40514569, -203093439, 191385518, 97136673, -2027416904, -413022350, -659644591, 778779407, -1128628704, -1693719135, 265255133, -2110536084, -1821061692, -342287069, -362037943, 680983391, 475009544, 429331035, -1286944903, -1887084940, 1321750055, 1543326309, -289895424, -1580647420, 1301191751, 1447990360, 497252928, 295555836, 1366219917}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component3 + 67;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void ShareDataUIState() {
        component2 = new int[]{-1613971435, -1235328640, 1128241256, -488023298, -296946548, -379550380, 109482031, 300865927, 276077126, 1878463384, -7681625, -1372276042, 813688509, -1435346868, -256460503, 1653352724, -727554575, 1469397401};
    }
}
