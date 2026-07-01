package com.huawei.digitalpayment.home.viewmodel;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import org.apache.commons.lang3.CharUtils;

public final class HomeViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static int ShareDataUIState;
    private static int component1;
    static HomeViewModel component2;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {Ascii.SI, 58, -59};
    private static final int $$b = 109;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copydefault = 0;

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
            int r8 = 2 - r8
            byte[] r0 = com.huawei.digitalpayment.home.viewmodel.HomeViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r7 = r7 * 4
            int r1 = 1 - r7
            int r6 = r6 * 2
            int r6 = 65 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2f
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            int r8 = r8 + 1
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L29:
            r3 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.home.viewmodel.HomeViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(int, byte, short):java.lang.String");
    }

    private static void a(char[] cArr, int i, int i2, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i2];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
            int i5 = $10 + 31;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i + iTrustedWebActivityServiceStub.component3);
            int i7 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(component1)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Gravity.getAbsoluteGravity(0, 0) + 3784, 37 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 26860), 2015799920, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatDelay() >> 16) + 7406, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 16, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
        }
        if (z) {
            char[] cArr4 = new char[i2];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i2 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getSize(0) + 7406, 16 - View.resolveSize(0, 0), (char) (ViewConfiguration.getTouchSlop() >> 8), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                int i8 = $10 + 33;
                $11 = i8 % 128;
                int i9 = i8 % 2;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static {
        ShareDataUIState = 1;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a(new char[]{6, 17, 65534, '\t', CharUtils.CR, 65534, 22, '\n', 2, 11, 17, 65483, 5, '\f', '\n', 2, 65483, 19, 6, 2, 20, '\n', '\f', 1, 2, '\t', 65483, 65509, '\f', '\n', 2, 65523, 6, 2, 20, 65514, '\f', 1, 2, '\t', 0, '\f', '\n', 65483, 5, 18, 65534, 20, 2, 6, 65483, 1, 6, 4}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 263, (ViewConfiguration.getScrollBarSize() >> 8) + 54, 40 - (ViewConfiguration.getJumpTapTimeout() >> 16), false, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = copydefault + 31;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    static void ShareDataUIState() {
        component1 = -890926531;
    }
}
