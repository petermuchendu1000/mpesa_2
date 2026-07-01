package com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class OfferBundleViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static char ShareDataUIState;
    private static char component1;
    private static char component2;
    private static char component3;
    static OfferBundleViewModel copydefault;
    private static int getAsAtTimestamp;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {79, Ascii.ETB, 89, Ascii.VT};
    private static final int $$b = 112;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copy = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, int r7, short r8) {
        /*
            int r8 = r8 * 3
            int r8 = 111 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r6 = r6 + 4
            int r7 = r7 * 4
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(byte, int, short):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i3 = 58224;
            int i4 = 0;
            while (i4 < 16) {
                int i5 = $11 + 1;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                int i7 = i4;
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i3) ^ ((c3 << 4) + ((char) (((long) component1) ^ 4374495167426960553L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(component3)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) (-1);
                        byte b3 = (byte) (b2 + 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(844 - TextUtils.getTrimmedLength(""), 32 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (23250 - TextUtils.indexOf((CharSequence) "", '0', 0)), 592652048, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i3) ^ ((cCharValue << 4) + ((char) (((long) ShareDataUIState) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(844 - TextUtils.getOffsetBefore("", 0), View.resolveSizeAndState(0, 0, 0) + 32, (char) (23251 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 592652048, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i3 -= 40503;
                    i4 = i7 + 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[iNotificationSideChannelDefault.component3] = cArr3[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr3[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(465 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 49, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
        }
        String str = new String(cArr2, 0, i);
        int i8 = $11 + 23;
        $10 = i8 % 128;
        if (i8 % 2 == 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        getAsAtTimestamp = 1;
        component3();
        Object[] objArr = new Object[1];
        a(81 - ImageFormat.getBitsPerPixel(0), new char[]{61937, 14799, 50956, 27719, 59328, 44871, 6661, 40142, 21674, 59625, 17750, 29479, 12095, 36016, 48715, 40647, 60376, 26183, 25007, 61338, 30502, 32758, 56979, 60986, 59001, 26243, 61937, 14799, 28110, 37981, 12567, 3559, 9870, 34706, 38220, 40509, 13635, 55003, 22937, 54968, 2523, 8517, 56242, 17347, 32816, 12972, 3237, 55160, 11554, 17813, 33532, 1010, 1699, 44574, 42638, 56644, 16693, 42001, 3326, 22368, 31835, 56856, 2177, 40474, 7599, 5845, 30163, 52335, 30366, 19889, 19794, 63640, 26738, 14797, 25789, 44842, 42302, 13196, 32278, 26384, 22508, 6233}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = copy + 111;
        getAsAtTimestamp = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static void component3() {
        ShareDataUIState = (char) 43114;
        component2 = (char) 27122;
        component1 = (char) 38355;
        component3 = (char) 59586;
    }
}
