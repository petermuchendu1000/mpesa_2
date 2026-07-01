package com.huawei.digitalpayment.consumer.qrcode.viewmodel;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.primitives.SignedBytes;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import org.apache.commons.io.ByteOrderMark;

public final class PartnerReceiveCodeViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static char ShareDataUIState;
    private static char component1;
    private static char component2;
    private static char component3;
    static PartnerReceiveCodeViewModel copydefault;
    private static int getAsAtTimestamp;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {5, SignedBytes.MAX_POWER_OF_TWO, 127, 81};
    private static final int $$b = 35;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getRequestBeneficiariesState = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, int r7, short r8) {
        /*
            int r8 = r8 * 3
            int r8 = 111 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.qrcode.viewmodel.PartnerReceiveCodeViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r6 = r6 * 4
            int r1 = 1 - r6
            int r7 = r7 * 3
            int r7 = 4 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2c
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2c:
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.viewmodel.PartnerReceiveCodeViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(short, int, short):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        char c2;
        int i2 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            cArr3[i3] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i4 = $10 + 69;
            $11 = i4 % 128;
            char c3 = 3;
            if (i4 % 2 == 0) {
                int i5 = 3 / 3;
            }
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $11 + 91;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c4 = cArr3[1];
                char c5 = cArr3[i3];
                int i10 = (c5 + i6) ^ ((c5 << 4) + ((char) (((long) ShareDataUIState) ^ 4374495167426960553L)));
                int i11 = c5 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[c3] = Integer.valueOf(component3);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c4);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int i12 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 843;
                        int iIndexOf = 31 - TextUtils.indexOf((CharSequence) "", '0', i3, i3);
                        char deadChar = (char) (23251 - KeyEvent.getDeadChar(i3, i3));
                        byte b2 = (byte) i3;
                        byte b3 = b2;
                        String str$$c = $$c(b2, b3, b3);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i12, iIndexOf, deadChar, 592652048, false, str$$c, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) component2) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component1)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        int i13 = 844 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int defaultSize = 32 - View.getDefaultSize(0, 0);
                        char c6 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23251);
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        String str$$c2 = $$c(b4, b5, b5);
                        c2 = 3;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i13, defaultSize, c6, 592652048, false, str$$c2, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    } else {
                        c2 = 3;
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    c3 = c2;
                    cArr3 = cArr4;
                    i3 = 0;
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
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getEdgeSlop() >> 16) + 465, KeyEvent.keyCodeFromString("") + 49, (char) (AndroidCharacter.getMirror('0') - '0'), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        getAsAtTimestamp = 0;
        component2();
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 79, new char[]{45099, 16372, ByteOrderMark.UTF_BOM, 1615, 7273, 1255, 28268, 10429, 62328, 61826, 55283, 51504, 17579, 11097, 59450, 36348, 52831, 30537, 20651, 61483, 3614, 19108, 55356, 11064, 16831, 34108, 45099, 16372, 19928, 64697, 34040, 1070, 15652, 57461, 15317, 8555, 18124, 40756, 37863, 948, 56218, 3529, 40907, 25299, 44006, 16498, 49135, 9678, 57660, 52332, 17221, 56985, 64978, 8848, 21667, 49869, 36524, 21127, 15560, 57762, 55664, 24574, 62328, 61826, 60731, 52518, 19271, 40188, 57660, 52332, 29462, 47103, 44006, 16498, 5090, 47443, 57660, 52332, 3941, 48068}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = getRequestBeneficiariesState + 45;
        getAsAtTimestamp = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component2() {
        component2 = (char) 35903;
        component1 = (char) 28175;
        ShareDataUIState = (char) 17822;
        component3 = (char) 8860;
    }
}
