package com.huawei.digitalpayment.home.viewmodel;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancel;
import org.bouncycastle.asn1.BERTags;

public final class HomeServiceManagerViewModel2_HiltModules_BindsModule_Binds_LazyMapKey {
    private static char[] ShareDataUIState;
    private static boolean component1;
    static HomeServiceManagerViewModel2 component2;
    private static int component3;
    private static boolean copydefault;
    private static int getRequestBeneficiariesState;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {69, 81, 99, -123};
    private static final int $$b = BERTags.PRIVATE;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getAsAtTimestamp = 1;

    private static String $$c(int i, short s, byte b2) {
        int i2 = b2 + 4;
        byte[] bArr = $$a;
        int i3 = s * 3;
        int i4 = 73 - (i * 5);
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4 = (-i4) + i3;
            i2 = i2;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            int i7 = i2 + 1;
            bArr2[i6] = (byte) i4;
            if (i6 == i3) {
                return new String(bArr2, 0);
            }
            i4 = (-bArr[i7]) + i4;
            i2 = i7;
            i5 = i6;
        }
    }

    private static void a(int i, int[] iArr, byte[] bArr, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        char[] cArr2;
        int i3 = 2;
        int i4 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr3 = ShareDataUIState;
        int i5 = 1;
        int i6 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 95;
                $11 = i8 % 128;
                if (i8 % i3 == 0) {
                    try {
                        Object[] objArr2 = new Object[i5];
                        objArr2[i6] = Integer.valueOf(cArr3[i7]);
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                        if (objCopydefault == null) {
                            int bitsPerPixel = 3759 - ImageFormat.getBitsPerPixel(i6);
                            int i9 = 25 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                            char cAlpha = (char) Color.alpha(i6);
                            byte b2 = (byte) i5;
                            byte b3 = (byte) (b2 - 1);
                            String str$$c = $$c(b2, b3, (byte) (b3 - 1));
                            Class[] clsArr = new Class[i5];
                            clsArr[0] = Integer.TYPE;
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(bitsPerPixel, i9, cAlpha, -1670574543, false, str$$c, clsArr);
                        }
                        cArr4[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        i7 /= 0;
                        i3 = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = new Object[i5];
                    objArr3[0] = Integer.valueOf(cArr3[i7]);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) i5;
                        byte b5 = (byte) (b4 - 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3759 - Process.getGidForName(""), Process.getGidForName("") + 25, (char) (Process.myTid() >> 22), -1670574543, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr4[i7] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i7++;
                    i3 = 2;
                    i5 = 1;
                }
                i6 = 0;
            }
            int i10 = $10 + 53;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr3 = cArr4;
        }
        Object[] objArr4 = {Integer.valueOf(component3)};
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7140 - Color.red(0), 13 - ((Process.getThreadPriority(0) + 20) >> 6), (char) KeyEvent.getDeadChar(0, 0), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
        int i12 = 689978476;
        if (!(!copydefault)) {
            int i13 = $10 + 41;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cancelVar.component1 = bArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                int i15 = $10 + 55;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                cArr5[cancelVar.component3] = (char) (cArr3[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr5 = {cancelVar, cancelVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2748 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 20, (char) (Color.red(0) + 7644), -327556343, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (!component1) {
            cancelVar.component1 = iArr.length;
            char[] cArr6 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr6[cancelVar.component3] = (char) (cArr3[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                cancelVar.component3++;
                int i17 = $11 + 45;
                $10 = i17 % 128;
                int i18 = i17 % 2;
            }
            String str = new String(cArr6);
            int i19 = $11 + 59;
            $10 = i19 % 128;
            if (i19 % 2 == 0) {
                objArr[0] = str;
                return;
            } else {
                int i20 = 97 / 0;
                objArr[0] = str;
                return;
            }
        }
        int i21 = $11 + 109;
        $10 = i21 % 128;
        if (i21 % 2 != 0) {
            cancelVar.component1 = cArr.length;
            cArr2 = new char[cancelVar.component1];
            i2 = 0;
        } else {
            i2 = 0;
            cancelVar.component1 = cArr.length;
            cArr2 = new char[cancelVar.component1];
        }
        cancelVar.component3 = i2;
        while (cancelVar.component3 < cancelVar.component1) {
            cArr2[cancelVar.component3] = (char) (cArr3[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
            Object[] objArr6 = {cancelVar, cancelVar};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i12);
            if (objCopydefault5 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0) + 2749, Drawable.resolveOpacity(0, 0) + 19, (char) (7644 - View.getDefaultSize(0, 0)), -327556343, false, $$c(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
            i12 = 689978476;
        }
        objArr[0] = new String(cArr2);
    }

    static {
        getRequestBeneficiariesState = 0;
        component2();
        Object[] objArr = new Object[1];
        Object obj = null;
        a(127 - View.MeasureSpec.makeMeasureSpec(0, 0), null, new byte[]{-104, -114, -119, -117, -126, -106, -120, -119, -118, -105, -107, -119, -116, -121, -111, -121, -106, -119, -127, -118, -110, -107, -119, -108, -119, -125, -126, -109, -124, -114, -119, -117, -126, -125, -120, -119, -118, -110, -124, -119, -125, -126, -123, -124, -115, -111, -119, -125, -112, -121, -113, -114, -121, -115, -118, -116, -118, -117, -124, -118, -119, -120, -121, -122, -123, -124, -125, -126, -127}, null, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = getAsAtTimestamp + 121;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static void component2() {
        ShareDataUIState = new char[]{30253, 30241, 30247, 30438, 30248, 30239, 30259, 30233, 30255, 30251, 30252, 30249, 30236, 30244, 30240, 30235, 30246, 30238, 30408, 30269, 30242, 30407, 30270, 30434};
        component3 = 321287824;
        component1 = true;
        copydefault = true;
    }
}
