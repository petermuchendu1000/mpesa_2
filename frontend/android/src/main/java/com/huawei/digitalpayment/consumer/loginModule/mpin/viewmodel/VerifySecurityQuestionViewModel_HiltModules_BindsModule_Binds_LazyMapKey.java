package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import org.apache.commons.lang3.CharUtils;

public final class VerifySecurityQuestionViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    static VerifySecurityQuestionViewModel ShareDataUIState;
    private static int component1;
    private static int component3;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {101, 74, 115, 66};
    private static final int $$b = 234;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, short r8) {
        /*
            int r8 = r8 * 2
            int r8 = 65 - r8
            int r6 = r6 * 2
            int r6 = 3 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.VerifySecurityQuestionViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r7 = r7 * 4
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2f
        L19:
            r3 = r2
        L1a:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L29:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.VerifySecurityQuestionViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(int, byte, short):java.lang.String");
    }

    private static void a(char[] cArr, int i, int i2, int i3, boolean z, Object[] objArr) throws Throwable {
        long j;
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i2];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        int i5 = $11 + 75;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (true) {
            j = 0;
            if (iTrustedWebActivityServiceStub.ShareDataUIState >= i2) {
                break;
            }
            int i7 = $11 + 7;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i + iTrustedWebActivityServiceStub.component3);
            int i9 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i9]), Integer.valueOf(component1)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3783, 38 - Color.blue(0), (char) (26859 - TextUtils.indexOf((CharSequence) "", '0', 0)), 2015799920, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i9] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.normalizeMetaState(0) + 7406, 15 - TextUtils.indexOf((CharSequence) "", '0'), (char) (ViewConfiguration.getTouchSlop() >> 8), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        if (i3 > 0) {
            int i10 = $11 + 67;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            iTrustedWebActivityServiceStub.component1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i2 - iTrustedWebActivityServiceStub.component1);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i2 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                try {
                    Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 7406, (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 15, (char) TextUtils.getTrimmedLength(""), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                    j = 0;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static {
        component3 = 0;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a(new char[]{'\b', 11, 4, '\t', 65481, 17, 4, 0, 18, '\b', '\n', 65535, 0, 7, 65481, 65521, 0, CharUtils.CR, 4, 1, 20, 65518, 0, 65534, 16, CharUtils.CR, 4, 15, 20, 65516, 16, 0, 14, 15, 4, '\n', '\t', 65521, 4, 0, 18, 65512, '\n', 65535, 0, 7, 65534, '\n', '\b', 65481, 3, 16, 65532, 18, 0, 4, 65481, 65535, 4, 2, 4, 15, 65532, 7, 11, 65532, 20, '\b', 0, '\t', 15, 65481, 65534, '\n', '\t', 14, 16, '\b', 0, CharUtils.CR, 65481, 7, '\n', 2, 4, '\t', 65512, '\n', 65535, 16, 7, 0, 65481}, 104 - View.resolveSize(0, 0), 93 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 47 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), false, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component2 + 21;
        component3 = i % 128;
        int i2 = i % 2;
    }

    static void ShareDataUIState() {
        component1 = -890926438;
    }
}
