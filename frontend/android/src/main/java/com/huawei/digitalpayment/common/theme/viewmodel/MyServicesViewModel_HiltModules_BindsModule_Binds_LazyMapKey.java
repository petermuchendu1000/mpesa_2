package com.huawei.digitalpayment.common.theme.viewmodel;

import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancel;

public final class MyServicesViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static boolean ShareDataUIState;
    private static int component1;
    static MyServicesViewModel component2;
    private static boolean component3;
    private static char[] copydefault;
    private static int equals;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {86, 117, -27, 75};
    private static final int $$b = 61;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component4 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r5, short r6, byte r7) {
        /*
            int r7 = r7 * 5
            int r7 = 73 - r7
            byte[] r0 = com.huawei.digitalpayment.common.theme.viewmodel.MyServicesViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r5 = r5 * 2
            int r1 = 1 - r5
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r5 = 0 - r5
            if (r0 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            int r3 = r3 + 1
            r4 = r0[r6]
        L28:
            int r4 = -r4
            int r7 = r7 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.viewmodel.MyServicesViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(short, short, byte):java.lang.String");
    }

    private static void a(int i, int[] iArr, byte[] bArr, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = copydefault;
        long j = 0;
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
                        byte b2 = (byte) i3;
                        byte b3 = (byte) (b2 - 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((CdmaCellLocation.convertQuartSecToDecDegrees(i3) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i3) == 0.0d ? 0 : -1)) + 3760, ExpandableListView.getPackedPositionChild(j) + 25, (char) View.MeasureSpec.makeMeasureSpec(i3, i3), -1670574543, false, $$c(b2, b3, (byte) (-b3)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i4++;
                    int i5 = $10 + 85;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    j = 0;
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
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7140 - ExpandableListView.getPackedPositionGroup(0L), ImageFormat.getBitsPerPixel(0) + 14, (char) Drawable.resolveOpacity(0, 0), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        if (ShareDataUIState) {
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr4 = {cancelVar, cancelVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2748 - View.combineMeasuredStates(0, 0), 20 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (ExpandableListView.getPackedPositionType(0L) + 7644), -327556343, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (component3) {
            int i7 = $10 + 13;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cancelVar.component1 = cArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                int i9 = $10 + 17;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                cArr5[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr5 = {cancelVar, cancelVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2748 - TextUtils.getTrimmedLength(""), 18 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (7644 - View.combineMeasuredStates(0, 0)), -327556343, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i11 = 0;
        cancelVar.component1 = iArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        while (true) {
            cancelVar.component3 = i11;
            if (cancelVar.component3 >= cancelVar.component1) {
                objArr[0] = new String(cArr6);
                return;
            } else {
                cArr6[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                i11 = cancelVar.component3 + 1;
            }
        }
    }

    static {
        equals = 0;
        component1();
        Object[] objArr = new Object[1];
        a(126 - ExpandableListView.getPackedPositionChild(0L), null, new byte[]{-114, -119, -117, -126, -109, -120, -119, -118, -105, -106, -119, -127, -118, -110, -107, -119, -108, -112, -109, -124, -114, -119, -117, -126, -125, -120, -119, -118, -110, -124, -119, -125, -119, -123, -115, -124, -111, -126, -125, -125, -126, -127, -124, -115, -111, -119, -125, -112, -121, -113, -114, -121, -115, -118, -116, -118, -117, -124, -118, -119, -120, -121, -122, -123, -124, -125, -126, -127}, null, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component4 + 7;
        equals = i % 128;
        if (i % 2 != 0) {
            int i2 = 6 / 0;
        }
    }

    static void component1() {
        copydefault = new char[]{30525, 30513, 30519, 30710, 30520, 30511, 30659, 30505, 30527, 30523, 30524, 30521, 30508, 30516, 30512, 30507, 30518, 30510, 30679, 30669, 30514, 30509, 30670};
        component1 = 321288096;
        component3 = true;
        ShareDataUIState = true;
    }
}
