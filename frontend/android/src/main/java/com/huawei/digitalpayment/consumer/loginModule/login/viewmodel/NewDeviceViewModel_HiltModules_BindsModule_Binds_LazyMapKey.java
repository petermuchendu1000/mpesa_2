package com.huawei.digitalpayment.consumer.loginModule.login.viewmodel;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancel;

public final class NewDeviceViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static boolean ShareDataUIState;
    private static char[] component1;
    private static int component2;
    private static boolean component3;
    private static int copy;
    static NewDeviceViewModel copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {TarHeader.LF_NORMAL, -22, 122, 126};
    private static final int $$b = 159;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component4 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, byte r6, byte r7) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.login.viewmodel.NewDeviceViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r5 = r5 * 5
            int r5 = r5 + 68
            int r7 = r7 * 4
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L28
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L26:
            r3 = r0[r6]
        L28:
            int r5 = r5 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.login.viewmodel.NewDeviceViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(byte, byte, byte):java.lang.String");
    }

    private static void a(int i, int[] iArr, byte[] bArr, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = component1;
        long j = 0;
        if (cArr2 != null) {
            int i4 = $10 + 71;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 97;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatDelay() >> 16) + 3760, (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 23, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1670574543, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i6++;
                    j = 0;
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
        Object[] objArr3 = {Integer.valueOf(component2)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7139 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 13 - View.combineMeasuredStates(0, 0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i9 = 689978476;
        if (component3) {
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                int i10 = $11 + 77;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr4 = {cancelVar, cancelVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault3 == null) {
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 2749;
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 20;
                    char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 7644);
                    byte b4 = (byte) ($$b & 1);
                    byte b5 = (byte) (b4 - 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionChild, iIndexOf, doubleTapTimeout, -327556343, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!ShareDataUIState) {
            cancelVar.component1 = iArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                int i12 = $11 + 27;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    cArr5[cancelVar.component3] = (char) (cArr2[iArr[cancelVar.component1 / cancelVar.component3] * i] - iIntValue);
                    i2 = cancelVar.component3 >> 1;
                } else {
                    cArr5[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    i2 = cancelVar.component3 + 1;
                }
                cancelVar.component3 = i2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i13 = $11 + 63;
        $10 = i13 % 128;
        int i14 = i13 % 2;
        cancelVar.component1 = cArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        cancelVar.component3 = 0;
        while (cancelVar.component3 < cancelVar.component1) {
            int i15 = $11 + 121;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
            Object[] objArr5 = {cancelVar, cancelVar};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i9);
            if (objCopydefault4 == null) {
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 2748;
                int trimmedLength = 19 - TextUtils.getTrimmedLength("");
                char cIndexOf = (char) (TextUtils.indexOf("", "", 0, 0) + 7644);
                byte b6 = (byte) ($$b & 1);
                byte b7 = (byte) (b6 - 1);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(absoluteGravity, trimmedLength, cIndexOf, -327556343, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
            i9 = 689978476;
        }
        objArr[0] = new String(cArr6);
    }

    static {
        copy = 1;
        component2();
        Object[] objArr = new Object[1];
        a(View.resolveSizeAndState(0, 0, 0) + 127, null, new byte[]{-114, -119, -117, -126, -108, -120, -119, -118, -104, -119, -127, -118, -107, -119, -105, -120, -119, -106, -124, -114, -119, -117, -126, -125, -120, -119, -118, -107, -124, -111, -118, -116, -126, -114, -124, -119, -114, -122, -117, -126, -108, -111, -118, -116, -126, -114, -124, -109, -119, -125, -122, -110, -111, -126, -127, -124, -115, -111, -119, -125, -112, -121, -113, -114, -121, -115, -118, -116, -118, -117, -124, -118, -119, -120, -121, -122, -123, -124, -125, -126, -127}, null, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component4 + 109;
        copy = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static void component2() {
        component1 = new char[]{30265, 30253, 30259, 30450, 30260, 30251, 30271, 30245, 30267, 30263, 30264, 30261, 30248, 30256, 30252, 30247, 30258, 30249, 30254, 30419, 30250, 30418, 30424, 30410};
        component2 = 321287836;
        ShareDataUIState = true;
        component3 = true;
    }
}
