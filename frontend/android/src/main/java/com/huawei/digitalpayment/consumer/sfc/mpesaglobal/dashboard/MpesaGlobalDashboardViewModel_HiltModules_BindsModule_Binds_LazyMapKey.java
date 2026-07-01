package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import org.apache.commons.lang3.CharUtils;

public final class MpesaGlobalDashboardViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static int ShareDataUIState;
    private static int component3;
    static MpesaGlobalDashboardViewModel copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {77, -67, -125, 9};
    private static final int $$b = 102;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, byte r8) {
        /*
            int r7 = r7 + 4
            int r6 = r6 * 3
            int r6 = 65 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard.MpesaGlobalDashboardViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r8 = r8 * 4
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L30
        L16:
            r3 = r2
        L17:
            r5 = r7
            r7 = r6
            r6 = r5
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard.MpesaGlobalDashboardViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(int, byte, byte):java.lang.String");
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
                    byte b3 = (byte) (b2 - 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3784 - (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0) + 39, (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26860), 2015799920, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.getDefaultSize(0, 0) + 7406, 15 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
            int i6 = $11 + 29;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            iTrustedWebActivityServiceStub.component1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i2 - iTrustedWebActivityServiceStub.component1);
        }
        if (z) {
            int i8 = $10 + 115;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i2];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i2 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 7406, TextUtils.getCapsMode("", 0, 0) + 16, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static {
        component3 = 1;
        component2();
        Object[] objArr = new Object[1];
        a(new char[]{'\f', 65535, 5, 16, 65534, 1, 65483, '\t', 65534, 65535, '\f', '\t', 4, 65534, 16, 2, CharUtils.CR, '\n', 65483, 0, 3, 16, 65483, 15, 2, '\n', 18, 16, 11, '\f', 0, 65483, 17, 11, 2, '\n', 22, 65534, CharUtils.CR, '\t', 65534, 17, 6, 4, 6, 1, 65483, 6, 2, 20, 65534, 18, 5, 65483, '\n', '\f', 0, '\t', 2, 1, '\f', 65514, 20, 2, 6, 65523, 1, 15, 65534, '\f', 65535, 5, 16, 65534, 65505, '\t', 65534, 65535, '\f', '\t', 65508, 65534, 16, 2, CharUtils.CR, 65514, 65483, 1, 15, 65534}, TextUtils.indexOf((CharSequence) "", '0') + 264, 90 + Color.blue(0), 57 - TextUtils.indexOf("", ""), true, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component2 + 5;
        component3 = i % 128;
        int i2 = i % 2;
    }

    static void component2() {
        ShareDataUIState = -890926531;
    }
}
