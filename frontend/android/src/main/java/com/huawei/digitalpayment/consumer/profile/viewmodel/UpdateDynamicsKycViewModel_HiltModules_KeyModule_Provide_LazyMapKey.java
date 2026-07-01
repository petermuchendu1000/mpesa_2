package com.huawei.digitalpayment.consumer.profile.viewmodel;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;

public final class UpdateDynamicsKycViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static final byte[] $$a = {57, 126, 65, 8};
    private static final int $$b = 182;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ShareDataUIState = 1;
    private static int component2;
    private static int component3;
    static UpdateDynamicsKycViewModel copydefault;
    public static String lazyClassKeyName;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r7, short r8, short r9) {
        /*
            int r9 = r9 * 2
            int r9 = r9 + 4
            int r8 = r8 * 3
            int r8 = 1 - r8
            int r7 = r7 * 2
            int r7 = r7 + 65
            byte[] r0 = com.huawei.digitalpayment.consumer.profile.viewmodel.UpdateDynamicsKycViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r8
            r3 = r9
            r5 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2a:
            int r7 = r7 + r9
            int r9 = r3 + 1
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profile.viewmodel.UpdateDynamicsKycViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(byte, short, short):java.lang.String");
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
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.getDeadChar(0, 0) + 3784, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 37, (char) (TextUtils.getTrimmedLength("") + 26860), 2015799920, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatDelay() >> 16) + 7406, 15 - MotionEvent.axisFromString(""), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
            iTrustedWebActivityServiceStub.component1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i2 - iTrustedWebActivityServiceStub.component1);
            int i6 = $10 + 5;
            $11 = i6 % 128;
            int i7 = i6 % 2;
        }
        if (z) {
            int i8 = $11 + 123;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i2];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
                int i10 = $11 + 73;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i2 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                try {
                    Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getTrimmedLength("") + 7406, 16 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (ExpandableListView.getPackedPositionChild(0L) + 1), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
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
        component2 = 0;
        component2();
        Object[] objArr = new Object[1];
        a(new char[]{17, 4, 65482, '\t', 11, 65535, '\b', 1, 0, 11, 65513, 19, 1, 5, 65522, 65535, 21, 65511, 15, 65535, 5, '\t', 65533, '\n', 21, 65504, 1, 16, 65533, 0, '\f', 65521, 65482, '\b', 1, 0, 11, '\t', 19, 1, 5, 18, 65482, 1, '\b', 5, 2, 11, 14, '\f', 65482, 14, 1, '\t', 17, 15, '\n', 11, 65535, 65482, 16, '\n', 1, '\t', 21, 65533, '\f', '\b', 65533, 16, 5, 3, 5, 0, 65482, 5, 1, 19, 65533}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 116, (Process.myTid() >> 22) + 79, 6 - (ViewConfiguration.getPressedStateDuration() >> 16), true, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = ShareDataUIState + 65;
        component2 = i % 128;
        int i2 = i % 2;
    }

    static void component2() {
        component3 = -890926455;
    }
}
