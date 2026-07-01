package com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancel;

public final class DiyBundlesViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static int ShareDataUIState;
    private static char[] component1;
    static DiyBundlesViewModel component2;
    private static boolean component3;
    private static boolean copydefault;
    private static int equals;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {46, -95, Ascii.VT, -87};
    private static final int $$b = 22;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getAsAtTimestamp = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r7, int r8, int r9) {
        /*
            int r8 = r8 * 4
            int r8 = 1 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles.DiyBundlesViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r9 = r9 * 5
            int r9 = 73 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2b
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = r7 + r3
            int r9 = r9 + 1
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles.DiyBundlesViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(short, int, int):java.lang.String");
    }

    private static void a(int i, int[] iArr, byte[] bArr, char[] cArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr3 = component1;
        float f = 0.0f;
        int i4 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 75;
                $10 = i6 % 128;
                if (i6 % i2 != 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i4] = Integer.valueOf(cArr3[i5]);
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                        if (objCopydefault == null) {
                            byte b2 = (byte) i4;
                            byte b3 = b2;
                            String str$$c = $$c(b2, b3, (byte) (b3 + 1));
                            Class[] clsArr = new Class[1];
                            clsArr[i4] = Integer.TYPE;
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.argb(i4, i4, i4, i4) + 3760, (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)) + 24, (char) (AndroidCharacter.getMirror('0') - '0'), -1670574543, false, str$$c, clsArr);
                        }
                        cArr4[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        i5 = i4;
                        i2 = 2;
                        f = 0.0f;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = new Object[1];
                        objArr3[i4] = Integer.valueOf(cArr3[i5]);
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                        if (objCopydefault2 == null) {
                            byte b4 = (byte) i4;
                            byte b5 = b4;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3760 - TextUtils.getOffsetBefore("", i4), ImageFormat.getBitsPerPixel(i4) + 25, (char) (Color.rgb(i4, i4, i4) + 16777216), -1670574543, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                        }
                        cArr4[i5] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                        i5++;
                        i2 = 2;
                        f = 0.0f;
                        i4 = 0;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr4 = {Integer.valueOf(ShareDataUIState)};
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        long j = 0;
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollDefaultDelay() >> 16) + 7140, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 13, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
        int i7 = 689978476;
        if (component3) {
            int i8 = $10 + 31;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cancelVar.component1 = bArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr5[cancelVar.component3] = (char) (cArr3[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr5 = {cancelVar, cancelVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i7);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2748 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 19 - Color.blue(0), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 7644), -327556343, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                i7 = 689978476;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (copydefault) {
            int i10 = $10 + 37;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                cancelVar.component1 = cArr.length;
                cArr2 = new char[cancelVar.component1];
                cancelVar.component3 = 1;
            } else {
                cancelVar.component1 = cArr.length;
                cArr2 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
            }
            while (cancelVar.component3 < cancelVar.component1) {
                cArr2[cancelVar.component3] = (char) (cArr3[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr6 = {cancelVar, cancelVar};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault5 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionGroup(j) + 2748, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 19, (char) (View.getDefaultSize(0, 0) + 7644), -327556343, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
                j = 0;
            }
            objArr[0] = new String(cArr2);
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
                cArr6[cancelVar.component3] = (char) (cArr3[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                i11 = cancelVar.component3 + 1;
            }
        }
    }

    static {
        equals = 1;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a(127 - KeyEvent.normalizeMetaState(0), null, new byte[]{-114, -119, -117, -126, -102, -120, -119, -118, -103, -110, -119, -114, -117, -111, -122, -104, -112, -118, -105, -124, -110, -119, -114, -117, -111, -122, -107, -112, -118, -117, -124, -114, -119, -117, -126, -125, -120, -119, -118, -106, -124, -110, -119, -114, -117, -111, -122, -107, -112, -122, -107, -124, -118, -122, -127, -108, -110, -124, -109, -119, -125, -122, -110, -111, -126, -127, -124, -115, -111, -119, -125, -112, -121, -113, -114, -121, -115, -118, -116, -118, -117, -124, -118, -119, -120, -121, -122, -123, -124, -125, -126, -127}, null, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = getAsAtTimestamp + 75;
        equals = i % 128;
        int i2 = i % 2;
    }

    static void ShareDataUIState() {
        component1 = new char[]{30412, 30400, 30406, 30337, 30411, 30270, 30418, 30264, 30414, 30410, 30415, 30408, 30271, 30407, 30403, 30266, 30401, 30268, 30269, 30409, 30413, 30265, 30447, 30445, 30425, 30438};
        ShareDataUIState = 321287859;
        copydefault = true;
        component3 = true;
    }
}
