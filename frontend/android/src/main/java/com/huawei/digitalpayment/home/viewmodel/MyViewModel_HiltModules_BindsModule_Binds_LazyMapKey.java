package com.huawei.digitalpayment.home.viewmodel;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class MyViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    static MyViewModel ShareDataUIState;
    private static char component1;
    private static int component2;
    private static int component3;
    private static long copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {89, 120, -98, -110};
    private static final int $$b = 137;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getAsAtTimestamp = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, byte r7, byte r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.home.viewmodel.MyViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r8 = r8 * 4
            int r8 = 4 - r8
            int r6 = r6 * 4
            int r1 = 1 - r6
            int r7 = 99 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.home.viewmodel.MyViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(byte, byte, byte):java.lang.String");
    }

    private static void a(char[] cArr, char[] cArr2, char c2, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        int i5 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        int i6 = $11 + 13;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (iNotificationSideChannel.copydefault < length3) {
            int i8 = $10 + 107;
            $11 = i8 % 128;
            int i9 = i8 % i3;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int iBlue = 4037 - Color.blue(i5);
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, i5) + 31;
                    char cIndexOf = (char) (19180 - TextUtils.indexOf((CharSequence) "", '0'));
                    byte b2 = (byte) i5;
                    byte b3 = b2;
                    String str$$c = $$c(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i5] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iBlue, iMakeMeasureSpec, cIndexOf, 1912513118, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 7567;
                    int packedPositionChild = 10 - ExpandableListView.getPackedPositionChild(0L);
                    char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i5] = Object.class;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(scrollBarSize, packedPositionChild, cIndexOf2, 2006389106, false, "e", clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                int i10 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i10);
                objArr4[i5] = iNotificationSideChannel;
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) i5;
                    byte b5 = (byte) (b4 + 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2459 - View.MeasureSpec.getMode(i5), 28 - View.combineMeasuredStates(i5, i5), (char) KeyEvent.keyCodeFromString(""), 931716605, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    i2 = 2;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7567 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 12, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (copydefault ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component2) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component1) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                i3 = i2;
                i5 = 0;
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
        component3 = 0;
        component3();
        Object[] objArr = new Object[1];
        a(new char[]{54402, 44308, 45308, 11102, 2521, 37449, 24626, 13594, 45920, 60655, 16467, 5630, 31243, 32571, 59864, 23402, 50171, 10809, 54584, 14894, 24417, 296, 12995, 48877, 39241, 28693, 59785, 50588, 31729, 37680, 13163, 55092, 52152, 42886, 40825, 29432, 13736, 35340, 10607, 22082, 23304, 53117, 15715, 64312, 40536, 59529, 60922, 21668, 44438, 23641, 1030, 49559}, new char[]{32557, 33085, 7064, 63500}, (char) (3099 - KeyEvent.keyCodeFromString("")), (-1) - MotionEvent.axisFromString(""), new char[]{21258, 43203, 52978, 32486}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = getAsAtTimestamp + 121;
        component3 = i % 128;
        int i2 = i % 2;
    }

    static void component3() {
        copydefault = -5372858625437296645L;
        component2 = 1386857713;
        component1 = (char) 50417;
    }
}
