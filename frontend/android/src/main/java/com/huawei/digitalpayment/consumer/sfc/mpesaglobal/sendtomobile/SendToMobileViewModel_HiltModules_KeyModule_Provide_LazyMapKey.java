package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class SendToMobileViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static int ShareDataUIState;
    private static char component1;
    private static long component2;
    static SendToMobileViewModel component3;
    private static int copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {101, 74, 115, 66};
    private static final int $$b = 87;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component4 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, byte r6, byte r7) {
        /*
            int r5 = r5 * 4
            int r0 = r5 + 1
            int r6 = r6 + 98
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L20:
            int r3 = r3 + 1
            r4 = r1[r7]
        L24:
            int r6 = r6 + r4
            int r7 = r7 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(byte, byte, byte):java.lang.String");
    }

    private static void a(char[] cArr, char[] cArr2, char c2, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        int i3 = $11 + 29;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (iNotificationSideChannel.copydefault < length3) {
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4037 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.getOffsetAfter("", 0) + 31, (char) (19182 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 1912513118, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getLongPressTimeout() >> 16) + 7567, View.combineMeasuredStates(0, 0) + 11, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 2006389106, false, "e", new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTouchSlop() >> 8) + 2459, Color.blue(0) + 28, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 931716605, false, $$c(b4, b5, b5), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getEdgeSlop() >> 16) + 7567, 11 - Drawable.resolveOpacity(0, 0), (char) ExpandableListView.getPackedPositionGroup(0L), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component2 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) copydefault) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component1) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                int i5 = $11 + 57;
                $10 = i5 % 128;
                int i6 = i5 % 2;
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
        ShareDataUIState = 0;
        component2();
        Object[] objArr = new Object[1];
        a(new char[]{28027, 30563, 9272, 5150, 17595, 42611, 56921, 64117, 63548, 50950, 50612, 8438, 32637, 14824, 13491, 24805, 64140, 16350, 40555, 4801, 32595, 52041, 11146, 3, 39798, 45063, 19655, 10497, 42152, 12673, 42948, 32030, 50163, 38221, 64707, 25240, 53658, 1618, 38433, 51828, 52128, 48638, 53140, 60527, 36079, 62368, 17229, 62099, 62981, 29434, 8959, 35725, 29057, 9888, 15961, 48165, 62719, 39883, 28866, 62910, 3306, 6046, 31991, 38663, 49446, 16062, 23037, 3240, 64092, 40644, 9937, 60830, 44229, 62580, 1459, 14293, 61565, 45045, 9594, 1544, 31136, 56338, 6386, 20188, 62550}, new char[]{47679, 1759, 11625, 13643}, (char) View.combineMeasuredStates(0, 0), 1762058170 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{0, 0, 0, 0}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component4 + 115;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component2() {
        component2 = -3780477796495014671L;
        copydefault = 1386857713;
        component1 = (char) 62849;
    }
}
