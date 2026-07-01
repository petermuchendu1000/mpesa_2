package com.huawei.digitalpayment.consumer.webview.viewmodel;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;

public final class WebViewViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static final byte[] $$a = {20, 103, 109, TarHeader.LF_BLK};
    private static final int $$b = 196;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ShareDataUIState = 0;
    static WebViewViewModel component1;
    private static long component2;
    private static int component3;
    public static String lazyClassKeyName;

    private static String $$c(byte b2, int i, int i2) {
        int i3 = i2 * 2;
        int i4 = (i * 4) + 103;
        byte[] bArr = $$a;
        int i5 = b2 + 4;
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        int i7 = -1;
        if (bArr == null) {
            i7 = -1;
            i4 = i5 + i4;
            i5 = i5;
        }
        while (true) {
            int i8 = i5 + 1;
            int i9 = i7 + 1;
            bArr2[i9] = (byte) i4;
            if (i9 == i6) {
                return new String(bArr2, 0);
            }
            i7 = i9;
            i4 = bArr[i8] + i4;
            i5 = i8;
        }
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component2 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $10 + 35;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component2)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), MotionEvent.axisFromString("") + 35, (char) (63439 - TextUtils.lastIndexOf("", '0', 0, 0)), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.keyCodeFromString("") + 1390, Drawable.resolveOpacity(0, 0) + 18, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 51268), -1883291598, false, $$c(b2, b3, b3), new Class[]{Object.class, Object.class});
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
        String str = new String(cArrComponent2, 4, cArrComponent2.length - 4);
        int i6 = $11 + 55;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    static {
        component3 = 1;
        copydefault();
        Object[] objArr = new Object[1];
        a(1 - TextUtils.getCapsMode("", 0, 0), new char[]{22068, 36755, 26114, 22103, 5433, 2763, 27649, 39602, 17024, 5621, 31017, 45519, 32745, 8469, 21002, 44032, 26825, 19519, 12137, 56180, 1317, 22360, 15276, 63053, 15873, 25213, 5341, 58022, 11112, 36322, 57847, 6555, 50270, 39131, 64005, 13565, 61617, 41974, 55138, 9163, 60909, 52994, 41054, 24113, 34505, 55851, 48426, 30066, 45865, 58717, 35223, 24653, 44043, 61552, 25305, 40096, 22838, 7079, 32765, 35722, 29290, 9925, 18449, 42723, 28294, 12769, 9525, 56775, 7097, 23819, 15944, 51257, 13508}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = ShareDataUIState + 119;
        component3 = i % 128;
        if (i % 2 == 0) {
            int i2 = 38 / 0;
        }
    }

    static void copydefault() {
        component2 = 5065300515164105126L;
    }
}
