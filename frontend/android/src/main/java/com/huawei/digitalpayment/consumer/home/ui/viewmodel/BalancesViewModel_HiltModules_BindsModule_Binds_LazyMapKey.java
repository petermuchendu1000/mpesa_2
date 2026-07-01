package com.huawei.digitalpayment.consumer.home.ui.viewmodel;

import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import org.apache.commons.lang3.CharUtils;

public final class BalancesViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static int ShareDataUIState;
    private static int component3;
    static BalancesViewModel copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {80, 83, -21, -55};
    private static final int $$b = 90;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, int r7, byte r8) {
        /*
            int r6 = r6 * 2
            int r6 = 65 - r6
            int r8 = r8 * 3
            int r0 = r8 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.home.ui.viewmodel.BalancesViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            int r7 = r7 + 1
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r7 = r7 + r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.viewmodel.BalancesViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(byte, int, byte):java.lang.String");
    }

    private static void a(char[] cArr, int i, int i2, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i2];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
            int i5 = $11 + 55;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i + iTrustedWebActivityServiceStub.component3);
            int i7 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(component3)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarSize() >> 8) + 3784, TextUtils.lastIndexOf("", '0', 0, 0) + 39, (char) (26859 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 2015799920, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 7405, 17 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i8 = $11 + 21;
                $10 = i8 % 128;
                int i9 = i8 % 2;
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
        if (z) {
            int i10 = $11 + 37;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i2];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i2 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                try {
                    Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 7406, 15 - TextUtils.indexOf((CharSequence) "", '0'), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static {
        ShareDataUIState = 0;
        component2();
        Object[] objArr = new Object[1];
        a(new char[]{65534, '\t', 65534, 11, 0, 2, 16, 65523, 6, 2, 20, 65514, '\f', 1, 2, '\t', 0, '\f', '\n', 65483, 5, 18, 65534, 20, 2, 6, 65483, 1, 6, 4, 6, 17, 65534, '\t', CharUtils.CR, 65534, 22, '\n', 2, 11, 17, 65483, 0, '\f', 11, 16, 18, '\n', 2, 15, 65483, 5, '\f', '\n', 2, 65483, 18, 6, 65483, 19, 6, 2, 20, '\n', '\f', 1, 2, '\t', 65483, 65503}, ExpandableListView.getPackedPositionType(0L) + 275, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 71, 15 - TextUtils.lastIndexOf("", '0', 0), false, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component2 + 33;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component2() {
        component3 = -890926551;
    }
}
