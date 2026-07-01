package com.huawei.digitalpayment.consumer.mpin.ui.activity;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.io.encoding.Base64;
import org.bouncycastle.crypto.signers.PSSSigner;

public final class ResetPinVerifySecretQuestionActivity$$ExternalSyntheticLambda3 implements View.OnClickListener {
    public final ResetPinVerifySecretQuestionActivity f$0;
    private static final byte[] $$c = {99, TarHeader.LF_DIR, 44, 107};
    private static final int $$f = 13;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {65, -53, 110, -39, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -39, 39, Ascii.FS, 36};
    private static final int $$e = 100;
    private static final byte[] $$a = {94, -53, Ascii.FS, -60, -15, 8, -16, 1, 4, 3, TarHeader.LF_BLK, -55, -14, -1, -8, 13, -11, -8, 68, PSSSigner.TRAILER_IMPLICIT, 1, Base64.padSymbol, -36, -19, -4, -10, 8, -8, 0, Ascii.SYN, -22, -15, Ascii.VT, -8, 0, -15, 0, -17, 34, -19, -4, -10, 8, -8, 0, Ascii.SUB, -39, 6, -11};
    private static final int $$b = 239;
    private static int copydefault = 0;
    private static int component1 = 1;
    private static long component2 = -2180772724545003774L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(byte r6, int r7, byte r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$$ExternalSyntheticLambda3.$$c
            int r8 = r8 * 2
            int r8 = r8 + 1
            int r6 = r6 * 2
            int r6 = 103 - r6
            int r7 = r7 * 2
            int r7 = 3 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            r3 = r0[r7]
        L28:
            int r6 = r6 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$$ExternalSyntheticLambda3.$$g(byte, int, byte):java.lang.String");
    }

    public ResetPinVerifySecretQuestionActivity$$ExternalSyntheticLambda3(ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity) {
        this.f$0 = resetPinVerifySecretQuestionActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 6
            int r5 = 103 - r5
            int r7 = r7 * 32
            int r7 = 35 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$$ExternalSyntheticLambda3.$$a
            int r6 = r6 * 19
            int r1 = 33 - r6
            byte[] r1 = new byte[r1]
            int r6 = 32 - r6
            r2 = 0
            if (r0 != 0) goto L18
            r4 = r6
            r3 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            int r7 = r7 + 1
            r4 = r0[r7]
            int r3 = r3 + 1
        L2c:
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + (-2)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$$ExternalSyntheticLambda3.a(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(short r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 3
            int r5 = 10 - r5
            int r7 = 100 - r7
            int r6 = r6 * 9
            int r6 = r6 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$$ExternalSyntheticLambda3.$$d
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            r4 = r0[r6]
        L26:
            int r7 = r7 + r4
            int r7 = r7 + (-27)
            int r6 = r6 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$$ExternalSyntheticLambda3.b(short, byte, short, java.lang.Object[]):void");
    }

    @Override
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ResetPinVerifySecretQuestionActivity.$r8$lambda$TAZTEhHZsIaTEJgIhJvLj_sYWzs(this.f$0, view);
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
    }

    private static void c(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component2 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $10 + 9;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component2)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.indexOf("", "", 0) + 34, (char) (63441 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetAfter("", 0) + 1390, 18 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (51270 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), -1883291598, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
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
        String str = new String(cArrComponent2, 4, cArrComponent2.length - 4);
        int i6 = $11 + 97;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0829, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x082a, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x082e, code lost:
    
        if (r1 != null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0830, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0831, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0444, code lost:
    
        r3 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x044b, code lost:
    
        if (r3 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x044d, code lost:
    
        r2 = 1342 - android.view.View.resolveSizeAndState(0, 0, 0);
        r21 = (android.os.Process.myTid() >> 22) + 33;
        r3 = (char) (6425 - (android.view.KeyEvent.getMaxKeyCode() >> 16));
        r5 = (byte) 0;
        r7 = r5;
        r10 = new java.lang.Object[1];
        b(r5, r7, (byte) (r7 + 1), r10);
        r3 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r2, r21, r3, 1443979249, false, (java.lang.String) r10[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0486, code lost:
    
        ((java.lang.reflect.Field) r3).set(null, r12);
        r3 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0493, code lost:
    
        if (r3 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0495, code lost:
    
        r9 = 1342 - android.view.View.MeasureSpec.getSize(0);
        r10 = 33 - android.text.TextUtils.getOffsetBefore("", 0);
        r11 = (char) (6426 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)));
        r3 = (byte) 0;
        r4 = r3;
        r7 = new java.lang.Object[1];
        b(r3, r4, (byte) (r4 + 1), r7);
        r3 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r9, r10, r11, 1443979249, false, (java.lang.String) r7[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x04cc, code lost:
    
        r2 = new java.lang.Object[]{0L, ((java.lang.reflect.Field) r3).get(null)};
        r3 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(812318566);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x04e0, code lost:
    
        if (r3 != null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x04e2, code lost:
    
        r9 = (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)) + 1341;
        r10 = 33 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16);
        r11 = (char) (android.view.KeyEvent.getDeadChar(0, 0) + 6425);
        r4 = (byte) 3;
        r3 = (byte) (r4 - 2);
        r7 = new java.lang.Object[1];
        b(r4, r3, (byte) (r3 - 1), r7);
        r3 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r9, r10, r11, -181198845, false, (java.lang.String) r7[0], new java.lang.Class[]{java.lang.Long.TYPE, java.lang.reflect.Method.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0522, code lost:
    
        ((java.lang.Long) ((java.lang.reflect.Method) r3).invoke(null, r2)).longValue();
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x041d A[PHI: r4
  0x041d: PHI (r4v131 int) = (r4v130 int), (r4v144 int) binds: [B:65:0x041b, B:62:0x040f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int component2(java.util.List r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$$ExternalSyntheticLambda3.component2(java.util.List):int");
    }
}
