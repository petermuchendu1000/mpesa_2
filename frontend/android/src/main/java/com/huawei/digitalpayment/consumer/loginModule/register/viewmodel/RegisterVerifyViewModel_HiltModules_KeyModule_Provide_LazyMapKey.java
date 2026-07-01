package com.huawei.digitalpayment.consumer.loginModule.register.viewmodel;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getActiveNotifications;

public final class RegisterVerifyViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static final byte[] $$a = {5, -4, -80, 1};
    private static final int $$b = 219;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ShareDataUIState = 0;
    private static int[] component1;
    static RegisterVerifyViewModel component2;
    private static int copydefault;
    public static String lazyClassKeyName;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, short r7, short r8) {
        /*
            int r8 = 107 - r8
            int r6 = r6 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.RegisterVerifyViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r7 = r7 * 2
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r6
            r4 = r7
            r3 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L28:
            int r4 = -r4
            int r6 = r6 + r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.RegisterVerifyViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(short, short, short):java.lang.String");
    }

    private static void a(int i, int[] iArr, Object[] objArr) throws Throwable {
        int[] iArr2;
        int i2 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = component1;
        int i3 = 684241640;
        char c2 = 3;
        int i4 = 1;
        int i5 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i5] = Integer.valueOf(iArr3[i6]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i3);
                    if (objCopydefault == null) {
                        int offsetBefore = TextUtils.getOffsetBefore("", i5) + 4391;
                        int trimmedLength = 37 - TextUtils.getTrimmedLength("");
                        char cIndexOf = (char) TextUtils.indexOf("", "", i5);
                        byte b2 = $$a[c2];
                        byte b3 = (byte) (-b2);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(offsetBefore, trimmedLength, cIndexOf, -309236339, false, $$c(b3, (byte) (b3 + 1), b2), new Class[]{Integer.TYPE});
                    }
                    iArr4[i6] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i6++;
                    i3 = 684241640;
                    c2 = 3;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = component1;
        long j = 0;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i7 = 0;
            while (i7 < length3) {
                Object[] objArr3 = new Object[i4];
                objArr3[0] = Integer.valueOf(iArr6[i7]);
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault2 == null) {
                    byte b4 = $$a[3];
                    byte b5 = (byte) (-b4);
                    iArr2 = iArr6;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4391 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 38 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), -309236339, false, $$c(b5, (byte) (b5 + 1), b4), new Class[]{Integer.TYPE});
                } else {
                    iArr2 = iArr6;
                }
                iArr7[i7] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                i7++;
                iArr6 = iArr2;
                j = 0;
                i4 = 1;
            }
            iArr6 = iArr7;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
        getactivenotifications.component1 = 0;
        while (getactivenotifications.component1 < iArr.length) {
            int i8 = $10 + 39;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr[0] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr5);
            int i10 = 0;
            while (i10 < 16) {
                int i11 = $11 + 53;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    getactivenotifications.ShareDataUIState ^= iArr5[i10];
                    Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                    if (objCopydefault3 == null) {
                        int iIndexOf = 2968 - TextUtils.indexOf("", "", 0, 0);
                        int pressedStateDuration = 16 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        char packedPositionGroup = (char) (49871 - ExpandableListView.getPackedPositionGroup(0L));
                        byte b6 = (byte) (-$$a[3]);
                        byte b7 = (byte) (b6 + 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, pressedStateDuration, packedPositionGroup, 462826032, false, $$c(b6, b7, (byte) (b7 + 3)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                    getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                    getactivenotifications.component2 = iIntValue;
                    i10 += 44;
                } else {
                    getactivenotifications.ShareDataUIState ^= iArr5[i10];
                    Object[] objArr5 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                    if (objCopydefault4 == null) {
                        int trimmedLength2 = TextUtils.getTrimmedLength("") + 2968;
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 16;
                        char size = (char) (View.MeasureSpec.getSize(0) + 49871);
                        byte b8 = (byte) (-$$a[3]);
                        byte b9 = (byte) (b8 + 1);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(trimmedLength2, iCombineMeasuredStates, size, 462826032, false, $$c(b8, b9, (byte) (b9 + 3)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                    getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                    getactivenotifications.component2 = iIntValue2;
                    i10++;
                }
            }
            int i12 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i12;
            getactivenotifications.component2 ^= iArr5[16];
            getactivenotifications.ShareDataUIState ^= iArr5[17];
            int i13 = getactivenotifications.ShareDataUIState;
            int i14 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr5);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr6 = {getactivenotifications, getactivenotifications};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault5 == null) {
                int modifierMetaStateMask = 2943 - ((byte) KeyEvent.getModifierMetaStateMask());
                int iRgb = Color.rgb(0, 0, 0) + 16777240;
                char cIndexOf2 = (char) (27636 - TextUtils.indexOf((CharSequence) "", '0', 0));
                byte b10 = (byte) (-$$a[3]);
                byte b11 = (byte) (b10 + 1);
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(modifierMetaStateMask, iRgb, cIndexOf2, -1616366948, false, $$c(b10, b11, b11), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        copydefault = 1;
        component3();
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf("", "", 0, 0) + 89, new int[]{-1034901475, 812170738, 264409240, -1371178086, 617791084, 1607823880, -628082514, 1659172766, -951198739, -810176410, 1530528454, -333480616, 1163497209, 1757494916, 1907813622, 205556057, 551957291, 1800118508, 1407314441, -1329816042, 1170507086, -1456952909, 1886166816, 945376856, 380729319, -1056976319, -1396784397, 1925019855, 1984659483, 952914393, -1018415858, -1711478151, -146761130, 2084013478, 1362628454, 1836753988, 1409471363, 2104164260, -1945965644, 7692347, 683097200, 40982155, 450255791, -756650404, -968693243, -1904344508}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = ShareDataUIState + 45;
        copydefault = i % 128;
        if (i % 2 == 0) {
            int i2 = 23 / 0;
        }
    }

    static void component3() {
        component1 = new int[]{965510071, -1724261066, 880363170, 1968741383, 1549795486, 180815203, -923055618, -1349073745, -1841072567, -554702363, -1682724603, 1040237812, 316873270, 2042873052, -1229682714, 468292202, -664104505, 815825198};
    }
}
