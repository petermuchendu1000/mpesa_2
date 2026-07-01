package com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles;

import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DIYBundle;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.cancelAll;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"withIcon", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DIYBundle;", "iconRes", "", "ConsumerSfcUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EasyTalkBundlesUiStateKt {
    private static final byte[] $$c = {4, 8, -22, -73};
    private static final int $$d = 244;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {99, TarHeader.LF_DIR, 44, 107, -12, -1, -9, -12, -1, -9, Ascii.NAK, -1, -1, 5, -20, 9, -8};
    private static final int $$b = 104;
    private static int component2 = 0;
    private static int copydefault = 1;
    private static char[] ShareDataUIState = {1966, 2023, 2004, 1987, 2040, 2026, 1952, 2017, 2038, 2037, 2025, 1990, 1964, 1955, 2020, 2041, 2039, 1985, 2032, 2003, 2030, 1967, 2021, 1965, 2034, 2028, 2018, 2031, 1958, 2036, 2024, 1959, 2019, 1954, 1953, 2027};
    private static char component3 = 12828;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(short r5, int r6, short r7) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.EasyTalkBundlesUiStateKt.$$c
            int r7 = r7 * 3
            int r7 = 4 - r7
            int r5 = r5 * 3
            int r1 = r5 + 1
            int r6 = r6 * 3
            int r6 = 119 - r6
            byte[] r1 = new byte[r1]
            r2 = -1
            if (r0 != 0) goto L16
            r3 = r2
            r2 = r7
            goto L2d
        L16:
            r4 = r7
            r7 = r6
            r6 = r4
        L19:
            int r2 = r2 + 1
            byte r3 = (byte) r7
            r1[r2] = r3
            if (r2 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            return r5
        L27:
            r3 = r0[r6]
            r4 = r2
            r2 = r6
            r6 = r3
            r3 = r4
        L2d:
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r2 + 1
            r2 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.EasyTalkBundlesUiStateKt.$$e(short, int, short):java.lang.String");
    }

    private static void b(byte b2, byte b3, short s, Object[] objArr) {
        int i = 99 - (b3 * 2);
        int i2 = 6 - (b2 * 3);
        int i3 = s * 7;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[11 - i3];
        int i4 = 10 - i3;
        int i5 = -1;
        if (bArr == null) {
            i = i2 + (-i);
            i2 = i2;
        }
        while (true) {
            int i6 = i2 + 1;
            i5++;
            bArr2[i5] = (byte) i;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i += -bArr[i6];
                i2 = i6;
            }
        }
    }

    public static final DIYBundle withIcon(DIYBundle dIYBundle, int i) {
        List list;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i2;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        Integer numValueOf;
        int i3;
        int i4 = 2 % 2;
        int i5 = copydefault + 51;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(dIYBundle, "");
            list = null;
            z = true;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            i2 = 1;
            str6 = null;
            str7 = null;
            str8 = null;
            str9 = null;
            str10 = null;
            str11 = null;
            numValueOf = Integer.valueOf(i);
            i3 = 8870;
        } else {
            Intrinsics.checkNotNullParameter(dIYBundle, "");
            list = null;
            z = false;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            i2 = 0;
            str6 = null;
            str7 = null;
            str8 = null;
            str9 = null;
            str10 = null;
            str11 = null;
            numValueOf = Integer.valueOf(i);
            i3 = 16383;
        }
        DIYBundle dIYBundleCopy$default = DIYBundle.copy$default(dIYBundle, list, z, str, str2, str3, str4, str5, i2, str6, str7, str8, str9, str10, str11, numValueOf, i3, null);
        int i6 = component2 + 31;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            return dIYBundleCopy$default;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(byte b2, char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = ShareDataUIState;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7422 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 15, (char) (64291 - View.getDefaultSize(0, 0)), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(component3)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        char c2 = '0';
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7422 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 15 - TextUtils.getOffsetAfter("", 0), (char) (64290 - TextUtils.lastIndexOf("", '0', 0)), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i5 = $11 + 125;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                i2 = i + 30;
                cArr4[i2] = (char) (cArr[i2] / b2);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            cancelall.component2 = 0;
            while (cancelall.component2 < i2) {
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    int i6 = $11 + 85;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((Process.myPid() >> 22) + 7117, 15 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (TextUtils.indexOf("", c2, 0, 0) + 44464), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                        Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2943 - TextUtils.lastIndexOf("", '0', 0, 0), 24 - TextUtils.indexOf("", "", 0, 0), (char) (27637 - Gravity.getAbsoluteGravity(0, 0)), 794909189, false, $$e(b3, b4, b4), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                        int i8 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr2[i8];
                    } else {
                        obj = null;
                        if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i9 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i10 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[i9];
                            cArr4[cancelall.component2 + 1] = cArr2[i10];
                        } else {
                            int i11 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i12 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr2[i11];
                            cArr4[cancelall.component2 + 1] = cArr2[i12];
                        }
                    }
                }
                cancelall.component2 += 2;
                obj2 = obj;
                c2 = '0';
            }
        }
        int i13 = $11 + 113;
        $10 = i13 % 128;
        int i14 = i13 % 2;
        for (int i15 = 0; i15 < i; i15++) {
            int i16 = $10 + 1;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            cArr4[i15] = (char) (cArr4[i15] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(Unknown Source)
        	at java.base/java.util.TreeMap.lastKey(Unknown Source)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] component3(java.lang.Class r34, int r35, int r36, int r37) {
        /*
            Method dump skipped, instruction units count: 3160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.EasyTalkBundlesUiStateKt.component3(java.lang.Class, int, int, int):java.lang.Object[]");
    }
}
