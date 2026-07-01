package com.huawei.digitalpayment.consumer.zuriui;

import android.graphics.Color;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import org.apache.commons.lang3.CharUtils;

public final class ZuriChatViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static int ShareDataUIState;
    private static int component1;
    static ZuriChatViewModel component3;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {1, -128, 109, -128};
    private static final int $$b = 95;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copydefault = 1;

    private static String $$c(int i, short s, byte b2) {
        int i2 = s * 3;
        byte[] bArr = $$a;
        int i3 = (b2 * 4) + 4;
        int i4 = 65 - (i * 4);
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i4 = (-i4) + i5;
            i3++;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            i4 = (-bArr[i3]) + i4;
            i3++;
            i6 = i7;
        }
    }

    private static void a(char[] cArr, int i, int i2, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i2];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
            int i5 = $10 + 29;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i + iTrustedWebActivityServiceStub.component3);
            int i7 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(ShareDataUIState)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    int iIndexOf = 3784 - TextUtils.indexOf("", "");
                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 38;
                    char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 26860);
                    byte b2 = (byte) ($$a[0] - 1);
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, touchSlop, cResolveSizeAndState, 2015799920, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0) + 7407, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 16, (char) ((-1) - MotionEvent.axisFromString("")), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
        }
        if (z) {
            int i8 = $11 + 105;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i2];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i2 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7406 - Gravity.getAbsoluteGravity(0, 0), 16 - Color.green(0), (char) KeyEvent.normalizeMetaState(0), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static {
        component1 = 0;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a(new char[]{65532, 7, 11, 65532, 20, '\b', 0, '\t', 15, 65481, 65534, '\n', '\t', 14, 16, '\b', 0, CharUtils.CR, 65481, 21, 16, CharUtils.CR, 4, 16, 4, 65481, 65525, 16, CharUtils.CR, 4, 65502, 3, 65532, 15, 65521, 4, 0, 18, 65512, '\n', 65535, 0, 7, 65534, '\n', '\b', 65481, 3, 16, 65532, 18, 0, 4, 65481, 65535, 4, 2, 4, 15}, 150 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 59 - Color.argb(0, 0, 0, 0), 43 - View.combineMeasuredStates(0, 0), false, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = copydefault + 39;
        component1 = i % 128;
        int i2 = i % 2;
    }

    static void ShareDataUIState() {
        ShareDataUIState = -890926424;
    }
}
