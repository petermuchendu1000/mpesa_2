package com.huawei.digitalpayment.consumer.homeModule;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.notify;

public final class BuildConfig {
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String LIBRARY_PACKAGE_NAME;
    private static long component1;
    private static int copydefault;
    private static final byte[] $$a = {9, 8, 112, 107};
    private static final int $$b = 181;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component3 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, byte r7, short r8) {
        /*
            int r6 = r6 * 2
            int r6 = 3 - r6
            int r7 = r7 * 4
            int r0 = r7 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.homeModule.BuildConfig.$$a
            int r8 = r8 * 3
            int r8 = 105 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            int r6 = r6 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.homeModule.BuildConfig.$$c(byte, byte, short):java.lang.String");
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
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3267 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 33 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 60269), -834797019, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (component1 ^ 5431355972723572778L);
                Object[] objArr3 = {notifyVar, notifyVar};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(687 - TextUtils.getCapsMode("", 0, 0), 34 - Gravity.getAbsoluteGravity(0, 0), (char) (60372 - Process.getGidForName("")), -1969106284, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
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
            int i4 = $11 + 97;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr4 = {notifyVar, notifyVar};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault3 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0, 0) + 688, 34 - (Process.myPid() >> 22), (char) (Color.argb(0, 0, 0, 0) + 60373), -1969106284, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            int i6 = $10 + 53;
            $11 = i6 % 128;
            int i7 = i6 % 2;
        }
        String str = new String(cArr2);
        int i8 = $11 + 87;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    static {
        copydefault = 0;
        copydefault();
        Object[] objArr = new Object[1];
        a(1201 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{51909, 52856, 50089, 50331, 55306, 56742, 55009, 59910, 61259, 57590, 58466, 63833, 62083, 63036, 35681, 35981, 33239, 34059, 40612, 37860, 38667, 43086, 44533, 41263, 47690, 49089, 45887, 46178, 18836, 17112, 18029, 23460, 23779, 20485, 21770, 28413, 25133, 26462, 30853, 31772, 29025, 2715, 4057, 881, 1199}, objArr);
        LIBRARY_PACKAGE_NAME = ((String) objArr[0]).intern();
        int i = component3 + 49;
        copydefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 75 / 0;
        }
    }

    static void copydefault() {
        component1 = 8321685952792906380L;
    }
}
