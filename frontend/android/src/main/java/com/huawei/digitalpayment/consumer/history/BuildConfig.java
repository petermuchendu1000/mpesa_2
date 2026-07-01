package com.huawei.digitalpayment.consumer.history;

import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class BuildConfig {
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String LIBRARY_PACKAGE_NAME;
    private static char component1;
    private static char component2;
    private static char component3;
    private static char copydefault;
    private static int getAsAtTimestamp;
    private static final byte[] $$a = {126, 1, Ascii.SUB, -71};
    private static final int $$b = 82;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ShareDataUIState = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r7, short r8, short r9) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.history.BuildConfig.$$a
            int r9 = r9 * 2
            int r9 = 111 - r9
            int r8 = r8 * 3
            int r8 = 1 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2b
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r9 = r9 + 1
            int r7 = r7 + r3
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.history.BuildConfig.$$c(int, short, short):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i5 = $10 + 57;
            $11 = i5 % 128;
            int i6 = 58224;
            if (i5 % 2 == 0) {
                cArr3[i4] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[i4] = cArr[iNotificationSideChannelDefault.component3 / i4];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
                i2 = i4;
            }
            while (i2 < 16) {
                int i7 = $10 + 27;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[i4];
                char[] cArr4 = cArr3;
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i6) ^ ((c3 << 4) + ((char) (((long) component1) ^ 4374495167426960553L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(component3)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int gidForName = 843 - Process.getGidForName("");
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 32;
                        char trimmedLength = (char) (23251 - TextUtils.getTrimmedLength(""));
                        byte b2 = (byte) ($$a[1] - 1);
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(gidForName, scrollBarFadeDuration, trimmedLength, 592652048, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr4[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) copydefault) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        int iBlue = Color.blue(0) + 844;
                        int packedPositionType = 32 - ExpandableListView.getPackedPositionType(0L);
                        char cArgb = (char) (23251 - Color.argb(0, 0, 0, 0));
                        byte b4 = (byte) ($$a[1] - 1);
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iBlue, packedPositionType, cArgb, 592652048, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i2++;
                    cArr3 = cArr4;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[iNotificationSideChannelDefault.component3] = cArr5[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr5[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(465 - (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.lastIndexOf("", '0', 0) + 50, (char) KeyEvent.normalizeMetaState(0), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            int i9 = $11 + 123;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 4 / 4;
            }
            cArr3 = cArr5;
            i4 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i11 = $10 + 33;
        $11 = i11 % 128;
        if (i11 % 2 != 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        getAsAtTimestamp = 1;
        copydefault();
        Object[] objArr = new Object[1];
        a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 42, new char[]{55524, 59933, 58277, 56029, 19674, 16847, 31372, 43798, 9699, 33222, 7864, 53095, 56144, 21957, 64612, 9773, 7967, 30212, 17286, 61888, 47305, 59640, 21040, 63184, 49557, 61550, 55524, 59933, 496, 47979, 39129, 4117, 40055, 52200, 12611, 62982, 13873, 6376, 56418, 38238, 52655, 64754}, objArr);
        LIBRARY_PACKAGE_NAME = ((String) objArr[0]).intern();
        int i = ShareDataUIState + 33;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    static void copydefault() {
        copydefault = (char) 3368;
        component2 = (char) 24666;
        component1 = (char) 60272;
        component3 = (char) 26926;
    }
}
