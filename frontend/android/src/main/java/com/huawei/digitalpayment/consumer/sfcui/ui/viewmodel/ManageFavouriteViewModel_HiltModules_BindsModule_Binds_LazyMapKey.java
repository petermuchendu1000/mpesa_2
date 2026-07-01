package com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.google.mlkit.common.MlKitException;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;

public final class ManageFavouriteViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static int ShareDataUIState;
    static ManageFavouriteViewModel component1;
    private static int component3;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {46, -35, 45, 111};
    private static final int $$b = MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, byte r8) {
        /*
            int r7 = r7 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r8 = r8 * 2
            int r8 = 65 - r8
            int r6 = r6 * 2
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(int, byte, byte):java.lang.String");
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
                    byte b3 = (byte) (b2 - 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3783 - ((byte) KeyEvent.getModifierMetaStateMask()), (Process.myPid() >> 22) + 38, (char) (26859 - ExpandableListView.getPackedPositionChild(0L)), 2015799920, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 7405, 16 - Drawable.resolveOpacity(0, 0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault2).invoke(null, objArr3);
                    int i6 = $10 + 75;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
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
            int i8 = $11 + 67;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i2];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i2 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7406 - Color.green(0), TextUtils.indexOf((CharSequence) "", '0', 0) + 17, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static {
        ShareDataUIState = 0;
        component2();
        Object[] objArr = new Object[1];
        a(new char[]{5, 16, 1, 65522, 5, 1, 19, 65513, 11, 0, 1, '\b', 65535, 11, '\t', 65482, 4, 17, 65533, 19, 1, 5, 65482, 0, 5, 3, 5, 16, 65533, '\b', '\f', 65533, 21, '\t', 1, '\n', 16, 65482, 65535, 11, '\n', 15, 17, '\t', 1, 14, 65482, 15, 2, 65535, 17, 5, 65482, 17, 5, 65482, 18, 5, 1, 19, '\t', 11, 0, 1, '\b', 65482, 65513, 65533, '\n', 65533, 3, 1, 65506, 65533, 18, 11, 17, 14}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 135, 78 - (ViewConfiguration.getEdgeSlop() >> 16), 12 - (KeyEvent.getMaxKeyCode() >> 16), false, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component2 + 9;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            int i2 = 58 / 0;
        }
    }

    static void component2() {
        component3 = -890926406;
    }
}
