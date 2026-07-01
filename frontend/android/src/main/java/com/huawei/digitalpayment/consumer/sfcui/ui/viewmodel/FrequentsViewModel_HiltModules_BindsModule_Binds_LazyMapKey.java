package com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class FrequentsViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static char ShareDataUIState;
    static FrequentsViewModel component1;
    private static long component2;
    private static int component3;
    private static int copy;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {Ascii.SI, -112, -70, -94};
    private static final int $$b = 126;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copydefault = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, byte r7, short r8) {
        /*
            int r8 = r8 * 2
            int r8 = 3 - r8
            int r7 = r7 + 98
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FrequentsViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r6 = r6 * 3
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L17
            r4 = r6
            r7 = r8
            r3 = r2
            goto L2c
        L17:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1b:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L28:
            int r3 = r3 + 1
            r4 = r0[r7]
        L2c:
            int r8 = r8 + r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FrequentsViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(byte, byte, short):java.lang.String");
    }

    private static void a(char[] cArr, char[] cArr2, char c2, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        int i3 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        int i4 = $10 + 55;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (iNotificationSideChannel.copydefault < length3) {
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int i6 = (ExpandableListView.getPackedPositionForChild(i3, i3) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i3, i3) == 0L ? 0 : -1)) + 4038;
                    int iIndexOf = TextUtils.indexOf("", "") + 31;
                    char size = (char) (19181 - View.MeasureSpec.getSize(i3));
                    byte b2 = (byte) i3;
                    byte b3 = (byte) (b2 + 1);
                    String str$$c = $$c(b2, b3, (byte) (b3 - 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i3] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i6, iIndexOf, size, 1912513118, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    int offsetBefore = 7567 - TextUtils.getOffsetBefore("", i3);
                    int deadChar = KeyEvent.getDeadChar(i3, i3) + 11;
                    char cResolveOpacity = (char) Drawable.resolveOpacity(i3, i3);
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i3] = Object.class;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(offsetBefore, deadChar, cResolveOpacity, 2006389106, false, "e", clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                int i7 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i7);
                objArr4[i3] = iNotificationSideChannel;
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) i3;
                    byte b5 = b4;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2458, TextUtils.indexOf("", "", i3, i3) + 28, (char) ('0' - AndroidCharacter.getMirror('0')), 931716605, false, $$c(b4, b5, b5), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7567 - TextUtils.getOffsetAfter("", 0), View.MeasureSpec.getMode(0) + 11, (char) KeyEvent.normalizeMetaState(0), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component2 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component3) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) ShareDataUIState) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                int i8 = $10 + 83;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                i3 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static {
        copy = 1;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a(new char[]{38184, 59711, 26015, 31368, 8490, 28734, 36968, 44607, 38567, 14041, 18556, 3413, 1660, 16763, 15005, 2832, 15935, 38872, 41861, 3558, 29367, 50709, 16651, 51359, 17394, 14939, 18830, 54561, 23541, 345, 15873, 56129, 65001, 22865, 18842, 59071, 19523, 53554, 58143, 35796, 5922, 208, 34768, 3217, 10262, 38797, 9403, 8292, 3713, 6882, 10509, 9809, 56289, 47146, 63622, 14113, 4279, 3066, 34627, 37809, 51419, 15428, 23391, 23853, 49914, 38300, 35469, 23966, 1595, 52798, 11858, 59159}, new char[]{40210, 55193, 41032, 6789}, (char) TextUtils.getOffsetBefore("", 0), TextUtils.lastIndexOf("", '0') + 1, new char[]{0, 0, 0, 0}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = copydefault + 67;
        copy = i % 128;
        if (i % 2 == 0) {
            int i2 = 6 / 0;
        }
    }

    static void ShareDataUIState() {
        component2 = -3780477796495014671L;
        component3 = 1386857713;
        ShareDataUIState = (char) 61788;
    }
}
