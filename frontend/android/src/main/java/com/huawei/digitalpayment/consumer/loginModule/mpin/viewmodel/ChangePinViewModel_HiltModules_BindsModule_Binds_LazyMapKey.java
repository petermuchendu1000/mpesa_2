package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancel;

public final class ChangePinViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static boolean ShareDataUIState;
    private static int component1;
    static ChangePinViewModel component2;
    private static boolean component3;
    private static char[] copydefault;
    private static int getRequestBeneficiariesState;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {TarHeader.LF_NORMAL, -22, 122, 126};
    private static final int $$b = 138;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int equals = 1;

    private static String $$c(byte b2, short s, byte b3) {
        int i = 73 - (b2 * 5);
        int i2 = 4 - (b3 * 4);
        int i3 = s * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i3];
        int i4 = 0 - i3;
        int i5 = -1;
        if (bArr == null) {
            i = i4 + i;
            i2++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i += bArr[i2];
            i2++;
        }
    }

    private static void a(int i, int[] iArr, byte[] bArr, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = copydefault;
        int i3 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i4]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (b2 - 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetBefore("", i3) + 3760, 24 - TextUtils.getTrimmedLength(""), (char) Color.alpha(i3), -1670574543, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i4++;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(component1)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        char c2 = '0';
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7139 - ImageFormat.getBitsPerPixel(0), 12 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) View.MeasureSpec.getSize(0), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i5 = 689978476;
        if (ShareDataUIState) {
            int i6 = $11 + 3;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                int i8 = $11 + 103;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    cArr4[cancelVar.component3] = (char) (cArr2[bArr[cancelVar.component1 << cancelVar.component3] >>> i] << iIntValue);
                    Object[] objArr4 = {cancelVar, cancelVar};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i5);
                    if (objCopydefault3 == null) {
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 2748;
                        int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 19;
                        char cIndexOf = (char) (7643 - TextUtils.indexOf("", c2, 0, 0));
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(scrollBarSize, scrollBarSize2, cIndexOf, -327556343, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                } else {
                    cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                    Object[] objArr5 = {cancelVar, cancelVar};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault4 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getLongPressTimeout() >> 16) + 2748, 19 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (TextUtils.indexOf("", "", 0) + 7644), -327556343, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                }
                i5 = 689978476;
                c2 = '0';
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (component3) {
            cancelVar.component1 = cArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr5[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr6 = {cancelVar, cancelVar};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault5 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2748 - (ViewConfiguration.getPressedStateDuration() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 18, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 7644), -327556343, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
            String str = new String(cArr5);
            int i9 = $10 + 5;
            $11 = i9 % 128;
            if (i9 % 2 != 0) {
                objArr[0] = str;
                return;
            } else {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i10 = 0;
        cancelVar.component1 = iArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        while (true) {
            cancelVar.component3 = i10;
            if (cancelVar.component3 >= cancelVar.component1) {
                objArr[0] = new String(cArr6);
                return;
            }
            int i11 = $11 + 69;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                cArr6[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 % 1) << cancelVar.component3] << i] / iIntValue);
                i10 = cancelVar.component3;
            } else {
                cArr6[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                i10 = cancelVar.component3 + 1;
            }
        }
    }

    static {
        getRequestBeneficiariesState = 0;
        component2();
        Object[] objArr = new Object[1];
        Object obj = null;
        a(127 - (ViewConfiguration.getTouchSlop() >> 8), null, new byte[]{-114, -119, -117, -126, -108, -120, -119, -118, -104, -111, -118, -105, -119, -116, -111, -121, -123, -106, -124, -114, -119, -117, -126, -125, -120, -119, -118, -107, -124, -111, -118, -113, -125, -124, -119, -114, -122, -117, -126, -108, -111, -118, -116, -126, -114, -124, -109, -119, -125, -122, -110, -111, -126, -127, -124, -115, -111, -119, -125, -112, -121, -113, -114, -121, -115, -118, -116, -118, -117, -124, -118, -119, -120, -121, -122, -123, -124, -125, -126, -127}, null, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = equals + 33;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static void component2() {
        copydefault = new char[]{30262, 30250, 30248, 30443, 30253, 30240, 30260, 30242, 30256, 30252, 30257, 30258, 30241, 30249, 30245, 30236, 30251, 30246, 30247, 30408, 30243, 30422, 30405, 30403};
        component1 = 321287829;
        component3 = true;
        ShareDataUIState = true;
    }
}
