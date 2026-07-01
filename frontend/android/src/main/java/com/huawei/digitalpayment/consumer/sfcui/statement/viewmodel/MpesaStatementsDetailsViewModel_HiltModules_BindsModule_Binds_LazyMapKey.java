package com.huawei.digitalpayment.consumer.sfcui.statement.viewmodel;

import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelNotification;

public final class MpesaStatementsDetailsViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    static MpesaStatementsDetailsViewModel ShareDataUIState;
    private static int component1;
    private static char[] component2;
    private static long component3;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {79, Ascii.ETB, 89, Ascii.VT};
    private static final int $$b = 237;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copydefault = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, int r6, int r7) {
        /*
            int r6 = r6 * 2
            int r0 = 1 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.statement.viewmodel.MpesaStatementsDetailsViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r5 = 122 - r5
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L17
            r4 = r6
            r5 = r7
            r3 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            r4 = r1[r7]
            int r3 = r3 + 1
        L27:
            int r7 = r7 + 1
            int r5 = r5 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.statement.viewmodel.MpesaStatementsDetailsViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(byte, int, int):java.lang.String");
    }

    private static void a(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i4 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(component2[i + i4])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    int i5 = 1759 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    int iResolveSize = 34 - View.resolveSize(0, 0);
                    char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                    byte b2 = (byte) ($$b & 3);
                    byte b3 = (byte) (b2 - 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i5, iResolveSize, cCombineMeasuredStates, 1159210934, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(component3), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    int i6 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3607;
                    int iIndexOf = 28 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    char cResolveSize = (char) (View.resolveSize(0, 0) + 7171);
                    byte b4 = (byte) ($$b & 23);
                    byte b5 = (byte) (b4 - 5);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i6, iIndexOf, cResolveSize, 1951385784, false, $$c(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4013 - KeyEvent.keyCodeFromString(""), AndroidCharacter.getMirror('0') - 24, (char) (View.MeasureSpec.getMode(0) + 27761), -1529629956, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        cancelnotification.copydefault = 0;
        int i7 = $10 + 83;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        while (cancelnotification.copydefault < i2) {
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr5 = {cancelnotification, cancelnotification};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getDoubleTapTimeout() >> 16) + 4013, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 27761), -1529629956, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
            int i9 = $11 + 121;
            $10 = i9 % 128;
            int i10 = i9 % 2;
        }
        objArr[0] = new String(cArr);
    }

    static {
        component1 = 1;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a(TextUtils.getCapsMode("", 0, 0), View.combineMeasuredStates(0, 0) + 92, (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = copydefault + 65;
        component1 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void ShareDataUIState() {
        component2 = new char[]{3093, 42389, 24323, 61692, 43566, 17343, 62815, 44757, 16499, 63987, 37664, 17686, 65167, 36877, 18871, 58166, 38103, 20054, 59358, 39283, 13055, 58471, 40475, 14220, 59682, 33524, 13357, 60893, 34632, 14553, 53867, 35823, 15763, 55048, 35008, 8737, 56224, 36137, 9931, 55371, 29112, 11113, 56570, 30355, 10258, 49551, 31539, 11431, 50776, 32718, 4352, 51940, 31855, 5615, 53129, 24847, 6841, 52286, 26027, 8030, 45192, 27239, 1006, 46439, 28421, 155, 47677, 21414, 1319, 48830, 20571, 2511, 41843, 21748, 3706, 40961, 22946, 62223, 42154, 24099, 63455, 43350, 17117, 62532, 44527, 18287, 63753, 37551, 17465, 64958, 38699, 18654};
        component3 = 4132884719679088122L;
    }
}
