package com.huawei.digitalpayment.consumer.profile.viewmodel;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;

public final class ChangeMsisdnViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static final byte[] $$a = {125, 44, 8, -98};
    private static final int $$b = 206;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component1 = 0;
    private static int component2;
    private static int component3;
    static ChangeMsisdnViewModel copydefault;
    public static String lazyClassKeyName;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r7, byte r8, byte r9) {
        /*
            int r7 = r7 * 4
            int r7 = 3 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.profile.viewmodel.ChangeMsisdnViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r8 = r8 * 2
            int r8 = r8 + 1
            int r9 = r9 * 2
            int r9 = 65 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r9 = r7
            r3 = r8
            r5 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r9
            int r7 = r7 + 1
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L27:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profile.viewmodel.ChangeMsisdnViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(int, byte, byte):java.lang.String");
    }

    private static void a(char[] cArr, int i, int i2, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i2];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i + iTrustedWebActivityServiceStub.component3);
            int i5 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(component3)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3784 - Color.red(0), 38 - TextUtils.getOffsetAfter("", 0), (char) (Color.alpha(0) + 26860), 2015799920, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7406 - KeyEvent.normalizeMetaState(0), TextUtils.lastIndexOf("", '0', 0, 0) + 17, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
        if (i3 > 0) {
            iTrustedWebActivityServiceStub.component1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i2 - iTrustedWebActivityServiceStub.component1);
            int i6 = $11 + 5;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        }
        if (z) {
            char[] cArr4 = new char[i2];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i2 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7406 - KeyEvent.keyCodeFromString(""), 16 - KeyEvent.keyCodeFromString(""), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                int i8 = $11 + 97;
                $10 = i8 % 128;
                int i9 = i8 % 2;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static {
        component2 = 1;
        component3();
        Object[] objArr = new Object[1];
        a(new char[]{11, 14, '\f', 65482, 14, 1, '\t', 17, 15, '\n', 11, 65535, 65482, 16, '\n', 1, '\t', 21, 65533, '\f', '\b', 65533, 16, 5, 3, 5, 0, 65482, 5, 1, 19, 65533, 17, 4, 65482, '\t', 11, 65535, '\b', 1, 0, 11, 65513, 19, 1, 5, 65522, '\n', 0, 15, 5, 15, 65513, 1, 3, '\n', 65533, 4, 65503, 65482, '\b', 1, 0, 11, '\t', 19, 1, 5, 18, 65482, 1, '\b', 5, 2}, (KeyEvent.getMaxKeyCode() >> 16) + 252, Color.alpha(0) + 74, TextUtils.lastIndexOf("", '0', 0) + 39, true, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component1 + 105;
        component2 = i % 128;
        int i2 = i % 2;
    }

    static void component3() {
        component3 = -890926591;
    }
}
