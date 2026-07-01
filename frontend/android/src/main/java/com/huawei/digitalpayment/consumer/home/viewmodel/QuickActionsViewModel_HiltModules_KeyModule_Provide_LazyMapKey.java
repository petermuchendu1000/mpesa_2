package com.huawei.digitalpayment.consumer.home.viewmodel;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.notify;

public final class QuickActionsViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static long component1;
    static QuickActionsViewModel component2;
    private static int copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {Ascii.EM, 43, 92, -56};
    private static final int $$b = 35;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component3 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, short r7, byte r8) {
        /*
            int r8 = r8 + 4
            int r6 = r6 * 3
            int r6 = 105 - r6
            int r7 = r7 * 2
            int r0 = r7 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.home.viewmodel.QuickActionsViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            r3 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2a:
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.viewmodel.QuickActionsViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(short, short, byte):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = $11 + 37;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = notifyVar.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault == null) {
                        int i5 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3265;
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 33;
                        char pressedStateDuration = (char) (60268 - (ViewConfiguration.getPressedStateDuration() >> 16));
                        byte b2 = (byte) ($$b & 5);
                        byte b3 = (byte) (b2 - 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i5, offsetBefore, pressedStateDuration, -834797019, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() * (component1 % 5431355972723572778L);
                    Object[] objArr3 = {notifyVar, notifyVar};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 687, AndroidCharacter.getMirror('0') - 14, (char) (View.combineMeasuredStates(0, 0) + 60373), -1969106284, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = notifyVar.copydefault;
                Object[] objArr4 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault3 == null) {
                    int i7 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 3265;
                    int iRed = Color.red(0) + 33;
                    char cIndexOf = (char) (TextUtils.indexOf("", "") + 60268);
                    byte b6 = (byte) ($$b & 5);
                    byte b7 = (byte) (b6 - 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i7, iRed, cIndexOf, -834797019, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i6] = ((Long) ((Method) objCopydefault3).invoke(null, objArr4)).longValue() ^ (component1 ^ 5431355972723572778L);
                Object[] objArr5 = {notifyVar, notifyVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(Color.green(0) + 687, ((Process.getThreadPriority(0) + 20) >> 6) + 34, (char) (60373 - Color.blue(0)), -1969106284, false, $$c(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            try {
                Object[] objArr6 = {notifyVar, notifyVar};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault5 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getPressedStateDuration() >> 16) + 687, ((Process.getThreadPriority(0) + 20) >> 6) + 34, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 60373), -1969106284, false, $$c(b10, b11, (byte) (b11 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        String str = new String(cArr2);
        int i8 = $11 + 87;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    static {
        copydefault = 0;
        component3();
        Object[] objArr = new Object[1];
        a(38542 - Process.getGidForName(""), new char[]{27174, 64677, 18230, 43462, 12305, 39675, 60798, 30683, 56920, 8491, 35837, 4612, 25752, 53089, 20990, 47184, 724, 38230, 64571, 18105, 43280, 13203, 39530, 60658, 30553, 55708, 8352, 35647, 7567, 25605, 52978, 20857, 48064, 600, 38037, 65440, 17974, 43139, 13082, 34210, 60523, 30411, 55638, 8247, 35516, 7433, 26515, 52833, 20729, 47924, 3578, 37965, 65312, 16829, 43012, 12989, 34158, 61414, 30282, 55519, 9135, 35365, 7345, 26397, 51680, 20605, 47830, 3399, 38877, 65195, 16691}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component3 + 21;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component3() {
        component1 = 2279413430212749935L;
    }
}
