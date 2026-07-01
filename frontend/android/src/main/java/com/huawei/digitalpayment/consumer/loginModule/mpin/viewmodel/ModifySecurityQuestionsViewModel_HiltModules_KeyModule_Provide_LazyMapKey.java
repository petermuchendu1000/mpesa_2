package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import org.apache.commons.lang3.CharUtils;

public final class ModifySecurityQuestionsViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static int ShareDataUIState;
    private static int component1;
    static ModifySecurityQuestionsViewModel copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {35, -27, -128, TarHeader.LF_SYMLINK};
    private static final int $$b = 153;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, int r7, short r8) {
        /*
            int r8 = r8 * 3
            int r8 = 65 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ModifySecurityQuestionsViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r6 = r6 * 2
            int r6 = r6 + 1
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r7]
        L26:
            int r3 = -r3
            int r8 = r8 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ModifySecurityQuestionsViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(short, int, short):java.lang.String");
    }

    private static void a(char[] cArr, int i, int i2, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i2];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
            int i5 = $11 + 117;
            $10 = i5 % 128;
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
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Drawable.resolveOpacity(0, 0) + 3784, 39 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (26860 - Color.alpha(0)), 2015799920, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarSize() >> 8) + 7406, 16 - Color.red(0), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
            int i8 = $10 + 99;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            iTrustedWebActivityServiceStub.component1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i2 - iTrustedWebActivityServiceStub.component1);
        }
        if (!(!z)) {
            char[] cArr4 = new char[i2];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
                int i10 = $10 + 71;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[iTrustedWebActivityServiceStub.ShareDataUIState + i2];
                    try {
                        Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                        if (objCopydefault3 == null) {
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7407 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 16 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i2 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                    Object[] objArr5 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7407 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (-16777200) - Color.rgb(0, 0, 0), (char) ((-1) - Process.getGidForName("")), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                }
                int i11 = $10 + 99;
                $11 = i11 % 128;
                int i12 = i11 % 2;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static {
        ShareDataUIState = 1;
        component3();
        Object[] objArr = new Object[1];
        a(new char[]{'\n', 65534, 7, 0, 65535, '\n', 65512, 18, 0, 4, 65521, 14, '\t', '\n', 4, 15, 14, 0, 16, 65516, 20, 15, 4, CharUtils.CR, 16, 65534, 0, 65518, 20, 1, 4, 65535, '\n', 65512, 65481, 7, 0, 65535, '\n', '\b', 18, 0, 4, 17, 65481, '\t', 4, 11, '\b', 65481, 0, 7, 16, 65535, '\n', 65512, '\t', 4, 2, '\n', 7, 65481, CharUtils.CR, 0, '\b', 16, 14, '\t', '\n', 65534, 65481, 15, '\t', 0, '\b', 20, 65532, 11, 7, 65532, 15, 4, 2, 4, 65535, 65481, 4, 0, 18, 65532, 16, 3, 65481, '\b'}, ((byte) KeyEvent.getModifierMetaStateMask()) + 128, (ViewConfiguration.getTapTimeout() >> 16) + 94, 2 - Color.alpha(0), true, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component2 + 19;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    static void component3() {
        component1 = -890926461;
    }
}
