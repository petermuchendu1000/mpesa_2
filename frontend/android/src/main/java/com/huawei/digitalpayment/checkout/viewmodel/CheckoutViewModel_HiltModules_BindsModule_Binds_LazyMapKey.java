package com.huawei.digitalpayment.checkout.viewmodel;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;

public final class CheckoutViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static int ShareDataUIState;
    static CheckoutViewModel component2;
    private static int copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {79, -25, -14, 102};
    private static final int $$b = 188;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component3 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r7, byte r8, byte r9) {
        /*
            int r9 = r9 * 2
            int r9 = 65 - r9
            int r8 = r8 * 2
            int r8 = r8 + 4
            int r7 = r7 * 2
            int r7 = r7 + 1
            byte[] r0 = com.huawei.digitalpayment.checkout.viewmodel.CheckoutViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r9 = r8
            r4 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L2a:
            int r8 = r8 + r3
            int r9 = r9 + 1
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.viewmodel.CheckoutViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(byte, byte, byte):java.lang.String");
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
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(ShareDataUIState)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSize(0, 0) + 3784, 38 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (26860 - TextUtils.getOffsetAfter("", 0)), 2015799920, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7406 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 16 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i6 = $10 + 119;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 5 / 5;
                }
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
        }
        if (!(!z)) {
            int i8 = $10 + 53;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i2];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i2 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(((byte) KeyEvent.getModifierMetaStateMask()) + 7407, View.combineMeasuredStates(0, 0) + 16, (char) TextUtils.indexOf("", "", 0, 0), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i10 = $11 + 117;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str;
    }

    static {
        copydefault = 0;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a(new char[]{18, 5, 1, 19, '\t', 11, 0, 1, '\b', 65482, 65503, 4, 1, 65535, 7, 11, 17, 16, 65522, 5, 1, 19, 65513, 11, 0, 1, '\b', 65535, 11, '\t', 65482, 4, 17, 65533, 19, 1, 5, 65482, 0, 5, 3, 5, 16, 65533, '\b', '\f', 65533, 21, '\t', 1, '\n', 16, 65482, 65535, 4, 1, 65535, 7, 11, 17, 16, 65482}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 122, 62 - TextUtils.getOffsetBefore("", 0), 27 - (Process.myTid() >> 22), false, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component3 + 67;
        copydefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void ShareDataUIState() {
        ShareDataUIState = -890926449;
    }
}
