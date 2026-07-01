package com.huawei.digitalpayment.common.theme.viewmodel;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class ThemePreviewViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static final byte[] $$a = {57, Ascii.SYN, -21, -92};
    private static final int $$b = 175;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ShareDataUIState = 0;
    private static long component1;
    private static int component2;
    static ThemePreviewViewModel component3;
    private static char copydefault;
    private static int getRequestBeneficiariesState;
    public static String lazyClassKeyName;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, int r7, short r8) {
        /*
            int r8 = r8 + 98
            int r7 = r7 * 3
            int r0 = 1 - r7
            byte[] r1 = com.huawei.digitalpayment.common.theme.viewmodel.ThemePreviewViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r6 = r6 * 3
            int r6 = 4 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r6 = r6 + 1
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.viewmodel.ThemePreviewViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(byte, int, short):java.lang.String");
    }

    private static void a(char[] cArr, char[] cArr2, char c2, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
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
        while (iNotificationSideChannel.copydefault < length3) {
            int i4 = $11 + 81;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getPressedStateDuration() >> 16) + 4037, (ViewConfiguration.getEdgeSlop() >> 16) + 31, (char) (ImageFormat.getBitsPerPixel(0) + 19182), 1912513118, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7567 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 11 - View.combineMeasuredStates(0, 0), (char) Drawable.resolveOpacity(0, 0), 2006389106, false, "e", new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.green(0) + 2459, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 28, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 931716605, false, $$c(b4, b5, b5), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                            if (objCopydefault4 == null) {
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7567 - Drawable.resolveOpacity(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 11, (char) (TextUtils.lastIndexOf("", '0') + 1), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = iNotificationSideChannel.component3;
                            cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component1 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component2) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) copydefault) ^ (-3780477796495014671L)))));
                            iNotificationSideChannel.copydefault++;
                            i2 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        String str = new String(cArr6);
        int i6 = $11 + 119;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    static {
        getRequestBeneficiariesState = 1;
        component3();
        Object[] objArr = new Object[1];
        a(new char[]{51352, 25299, 14283, 36525, 55593, 58939, 50937, 49465, 25636, 41333, 15060, 9254, 18794, 54037, 4298, 38506, 39764, 19471, 12032, 49195, 42584, 11245, 48578, 10553, 8189, 28099, 42824, 60866, 26945, 16736, 63446, 13163, 27165, 14021, 6865, 14457, 64907, 37108, 3949, 11193, 37462, 866, 18534, 10530, 2505, 38371, 35859, 32025, 57953, 45698, 49860, 43867, 38113, 40656, 18906, 40755, 3077, 2230, 10935, 37339, 21295, 27067, 9072, 21675, 29532, 64530, 42283, 36523, 43969, 23657}, new char[]{64497, 31488, 16072, 30831}, (char) (28478 - ExpandableListView.getPackedPositionType(0L)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, new char[]{4404, 26519, 8179, 48088}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = ShareDataUIState + 95;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static void component3() {
        component1 = 8093272589192844741L;
        component2 = 1386857713;
        copydefault = (char) 50417;
    }
}
