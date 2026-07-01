package com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class FavouriteBundlesViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static char ShareDataUIState;
    private static long component1;
    private static int component2;
    private static int component3;
    static FavouriteBundlesViewModel copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {90, 10, -103, 87};
    private static final int $$b = 201;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getAsAtTimestamp = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, short r7, int r8) {
        /*
            int r8 = r8 * 3
            int r0 = r8 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.FavouriteBundlesViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r6 = 99 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r3 = r3 + 1
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.FavouriteBundlesViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(int, short, int):java.lang.String");
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
        while (iNotificationSideChannel.copydefault < length3) {
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int iNormalizeMetaState = 4037 - KeyEvent.normalizeMetaState(i3);
                    int deadChar = KeyEvent.getDeadChar(i3, i3) + 31;
                    char pressedStateDuration = (char) (19181 - (ViewConfiguration.getPressedStateDuration() >> 16));
                    byte b2 = (byte) i3;
                    byte b3 = b2;
                    String str$$c = $$c(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i3] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iNormalizeMetaState, deadChar, pressedStateDuration, 1912513118, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(i3, i3) + 7567;
                    int size = View.MeasureSpec.getSize(i3) + 11;
                    char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i3] = Object.class;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(absoluteGravity, size, doubleTapTimeout, 2006389106, false, "e", clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                int i4 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i4);
                objArr4[i3] = iNotificationSideChannel;
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    int offsetAfter = 2459 - TextUtils.getOffsetAfter("", i3);
                    int iIndexOf = 28 - TextUtils.indexOf("", "", i3, i3);
                    char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                    byte b4 = (byte) ($$b & 7);
                    byte b5 = (byte) (b4 - 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(offsetAfter, iIndexOf, cKeyCodeFromString, 931716605, false, $$c(b4, b5, b5), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 7567, View.MeasureSpec.makeMeasureSpec(0, 0) + 11, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[iNotificationSideChannel.copydefault])) ^ (component1 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component2) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) ShareDataUIState) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                int i5 = $11 + 85;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                i3 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i7 = $10 + 53;
        $11 = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    static {
        component3 = 0;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a(new char[]{59023, 64283, 21365, 38064, 28212, 63336, 29247, 49792, 22267, 11671, 64472, 11533, 21402, 18499, 15056, 5253, 36795, 32692, 27000, 57417, 58559, 50194, 28865, 17754, 42451, 14334, 46231, 41231, 60167, 26181, 38167, 33323, 56848, 41437, 11858, 22807, 52395, 9480, 22339, 10452, 64764, 15884, 33305, 63495, 53148, 62417, 42120, 16054, 36445, 45062, 58785, 50651, 52928, 27369, 42956, 11695, 30158, 51379, 35521, 49990, 28893, 54836, 5677, 43689, 36222, 52389, 20124, 29345, 26290, 36715, 25956, 62675, 41879, 22623, 44066, 28364, 56331, 53019, 62410, 25255, 43827, 59780, 63972, 36010, 26626, 64877, 26996}, new char[]{44578, 16627, 37592, 54054}, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (-666831954) - TextUtils.getTrimmedLength(""), new char[]{0, 0, 0, 0}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = getAsAtTimestamp + 105;
        component3 = i % 128;
        int i2 = i % 2;
    }

    static void ShareDataUIState() {
        component1 = -3780477796495014671L;
        component2 = -1040423449;
        ShareDataUIState = (char) 50417;
    }
}
