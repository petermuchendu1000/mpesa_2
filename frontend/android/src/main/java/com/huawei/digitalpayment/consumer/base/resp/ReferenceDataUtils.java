package com.huawei.digitalpayment.consumer.base.resp;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.base.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.base.resp.ReferenceInitiationType;
import com.iap.ac.android.rpc.constant.BodyFields;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.Metadata;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005JB\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/ReferenceDataUtils;", "", "<init>", "()V", "EventNameParam", "", "NameResolutionParam", "AuthentiationTypeParam", "InitiationTypeParam", "setInitiationType", KeysConstants.KEY_IS_FROM_NFC, "", "isFromQR", "explicit", "setData", "Lcom/huawei/digitalpayment/consumer/base/resp/ReferenceData;", "authenticationType", "requestId", "eventName", ReferenceDataUtils.NameResolutionParam, BodyFields.OPERATION_TYPE, "initiationType", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReferenceDataUtils {
    public static final String AuthentiationTypeParam = "authType";
    public static final String EventNameParam = "eventName";
    public static final ReferenceDataUtils INSTANCE;
    public static final String InitiationTypeParam = "initiatorType";
    public static final String NameResolutionParam = "nameResolution";
    private static long component1;
    private static int copydefault;
    private static final byte[] $$c = {Ascii.SI, -112, -70, -94};
    private static final int $$f = 88;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {70, -47, -65, TarHeader.LF_BLK, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -39, 39, Ascii.FS, 36};
    private static final int $$e = 248;
    private static final byte[] $$a = {112, 44, -46, -27, -2, Ascii.SI, -36, 17, 2, 8, -10, 6, -2, -28, 37, -8, 9};
    private static final int $$b = 112;
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(byte r6, byte r7, byte r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.base.resp.ReferenceDataUtils.$$c
            int r8 = r8 * 3
            int r8 = 3 - r8
            int r7 = r7 * 4
            int r1 = 1 - r7
            int r6 = r6 * 3
            int r6 = 103 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L19
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2e
        L19:
            r3 = r2
        L1a:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2e:
            int r4 = -r4
            int r8 = r8 + r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.resp.ReferenceDataUtils.$$g(byte, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 4
            int r0 = r5 + 14
            byte[] r1 = com.huawei.digitalpayment.consumer.base.resp.ReferenceDataUtils.$$a
            int r6 = r6 * 3
            int r6 = r6 + 103
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            int r5 = r5 + 13
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r5
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            int r7 = r7 + 1
            r3 = r1[r7]
        L2a:
            int r6 = r6 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.resp.ReferenceDataUtils.a(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = 100 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.base.resp.ReferenceDataUtils.$$d
            int r6 = r6 * 3
            int r1 = r6 + 1
            int r8 = r8 * 9
            int r8 = 13 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r6
            r7 = r8
            r3 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r8 = r8 + r4
            int r8 = r8 + (-27)
            int r7 = r7 + 1
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.resp.ReferenceDataUtils.b(byte, byte, short, java.lang.Object[]):void");
    }

    private static void c(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component1 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        int i3 = $11 + 15;
        $10 = i3 % 128;
        while (true) {
            int i4 = i3 % 2;
            if (iTrustedWebActivityServiceDefault.copydefault >= cArrComponent2.length) {
                objArr[0] = new String(cArrComponent2, 4, cArrComponent2.length - 4);
                return;
            }
            int i5 = $10 + 103;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i7 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component1)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - Color.blue(0), 34 - TextUtils.getCapsMode("", 0, 0), (char) (View.MeasureSpec.getMode(0) + 63440), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getEdgeSlop() >> 16) + 1390, 18 - (KeyEvent.getMaxKeyCode() >> 16), (char) (51269 - KeyEvent.normalizeMetaState(0)), -1883291598, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                i3 = $10 + 59;
                $11 = i3 % 128;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    private ReferenceDataUtils() {
    }

    public static String setInitiationType$default(ReferenceDataUtils referenceDataUtils, boolean z, boolean z2, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 4) != 0) {
            int i3 = ShareDataUIState + 77;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            str = null;
        }
        String initiationType = referenceDataUtils.setInitiationType(z, z2, str);
        int i5 = component2 + 105;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 41 / 0;
        }
        return initiationType;
    }

    public final String setInitiationType(boolean isFromNfc, boolean isFromQR, String explicit) {
        String str;
        int i = 2 % 2;
        ReferenceInitiationType.Companion companion = ReferenceInitiationType.INSTANCE;
        if (explicit == null) {
            int i2 = component2 + 89;
            ShareDataUIState = i2 % 128;
            str = "";
            if (i2 % 2 != 0) {
                int i3 = 79 / 0;
            }
        } else {
            str = explicit;
        }
        ReferenceInitiationType referenceInitiationTypeFrom = companion.from(str);
        if (referenceInitiationTypeFrom != null) {
            return referenceInitiationTypeFrom.getValue();
        }
        if (!(!StringsKt.equals(explicit, "isFromAiPay", true))) {
            return ReferenceInitiationType.AI_PAY.getValue();
        }
        if (isFromNfc) {
            int i4 = component2 + 37;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 38 / 0;
            }
            return ReferenceInitiationTypes.nfc;
        }
        if (!isFromQR) {
            return ReferenceInitiationTypes.manual;
        }
        int i6 = ShareDataUIState + 51;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            return ReferenceInitiationTypes.qrCode;
        }
        throw null;
    }

    public static ReferenceData setData$default(ReferenceDataUtils referenceDataUtils, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        String str7;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 45;
        component2 = i3 % 128;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = ReferenceAuthenticationType.PIN.getValue();
        }
        String str8 = str;
        String str9 = (i & 2) != 0 ? "" : str2;
        if ((i & 4) != 0) {
            int i4 = ShareDataUIState + 27;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            str7 = "";
        } else {
            str7 = str3;
        }
        return referenceDataUtils.setData(str8, str9, str7, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0708, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0709, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x070d, code lost:
    
        if (r1 != null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x070f, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0710, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x02ab, code lost:
    
        r4 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x02b2, code lost:
    
        if (r4 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x02b4, code lost:
    
        r0 = (android.view.ViewConfiguration.getTouchSlop() >> 8) + 1342;
        r27 = 33 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
        r4 = (char) (6424 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0));
        r7 = (byte) 3;
        r5 = (byte) (r7 - 2);
        r15 = new java.lang.Object[1];
        b(r7, r5, r5, r15);
        r4 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r0, r27, r4, 1443979249, false, (java.lang.String) r15[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x02f1, code lost:
    
        ((java.lang.reflect.Field) r4).set(null, r6);
        r4 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x02fe, code lost:
    
        if (r4 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0300, code lost:
    
        r0 = 1342 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
        r27 = android.text.TextUtils.indexOf("", "", 0) + 33;
        r4 = (char) (6425 - android.graphics.Color.green(0));
        r6 = (byte) 3;
        r5 = (byte) (r6 - 2);
        r14 = new java.lang.Object[1];
        b(r6, r5, r5, r14);
        r4 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r0, r27, r4, 1443979249, false, (java.lang.String) r14[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0340, code lost:
    
        r5 = new java.lang.Object[]{0L, ((java.lang.reflect.Field) r4).get(null)};
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(812318566);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0355, code lost:
    
        if (r0 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0357, code lost:
    
        r0 = 1341 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0);
        r27 = android.text.TextUtils.indexOf("", "", 0, 0) + 33;
        r6 = (char) (6425 - android.view.View.resolveSize(0, 0));
        r14 = new java.lang.Object[1];
        b(r12, r13, r13, r14);
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r0, r27, r6, -181198845, false, (java.lang.String) r14[0], new java.lang.Class[]{java.lang.Long.TYPE, java.lang.reflect.Method.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0394, code lost:
    
        ((java.lang.Long) ((java.lang.reflect.Method) r0).invoke(null, r5)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x03a0, code lost:
    
        r0 = com.huawei.digitalpayment.consumer.base.resp.ReferenceDataUtils.ShareDataUIState + 105;
        com.huawei.digitalpayment.consumer.base.resp.ReferenceDataUtils.component2 = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x05b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.huawei.digitalpayment.consumer.base.resp.ReferenceData setData(java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39) {
        /*
            Method dump skipped, instruction units count: 2056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.resp.ReferenceDataUtils.setData(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):com.huawei.digitalpayment.consumer.base.resp.ReferenceData");
    }

    static {
        copydefault = 1;
        component2();
        INSTANCE = new ReferenceDataUtils();
        int i = component3 + 83;
        copydefault = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component2() {
        component1 = 1234853242293139330L;
    }
}
