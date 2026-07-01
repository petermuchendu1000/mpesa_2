package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import android.graphics.Color;
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
import kotlin.text.Typography;

public final class PaySettingViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static long ShareDataUIState;
    static PaySettingViewModel component1;
    private static char component2;
    private static int component3;
    private static int component4;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {34, -66, 77, Ascii.DC2};
    private static final int $$b = 227;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copydefault = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, int r6, short r7) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.basicUi.viewmodel.PaySettingViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r5 = 99 - r5
            int r7 = r7 * 2
            int r1 = r7 + 1
            int r6 = r6 * 4
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            r3 = r0[r6]
        L24:
            int r6 = r6 + 1
            int r5 = r5 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basicUi.viewmodel.PaySettingViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(byte, int, short):java.lang.String");
    }

    private static void a(char[] cArr, char[] cArr2, char c2, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        while (iNotificationSideChannel.copydefault < length3) {
            int i5 = $10 + 25;
            $11 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int iArgb = Color.argb(i4, i4, i4, i4) + 4037;
                    int threadPriority = ((Process.getThreadPriority(i4) + 20) >> 6) + 31;
                    char pressedStateDuration = (char) (19181 - (ViewConfiguration.getPressedStateDuration() >> 16));
                    byte b2 = (byte) i4;
                    byte b3 = b2;
                    String str$$c = $$c(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iArgb, threadPriority, pressedStateDuration, 1912513118, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        int i7 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 7567;
                        int offsetBefore = 11 - TextUtils.getOffsetBefore("", i4);
                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(i4, i4);
                        Class[] clsArr2 = new Class[1];
                        clsArr2[i4] = Object.class;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i7, offsetBefore, cCombineMeasuredStates, 2006389106, false, "e", clsArr2);
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    int i8 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                    try {
                        Object[] objArr4 = new Object[3];
                        objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                        objArr4[1] = Integer.valueOf(i8);
                        objArr4[i4] = iNotificationSideChannel;
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                        if (objCopydefault3 == null) {
                            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 2459;
                            int iGreen = Color.green(i4) + 28;
                            char pressedStateDuration2 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                            byte b4 = (byte) ($$b & 5);
                            byte b5 = (byte) (b4 - 1);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(tapTimeout, iGreen, pressedStateDuration2, 931716605, false, $$c(b4, b5, b5), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                            if (objCopydefault4 == null) {
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionChild(0L) + 7568, 11 - TextUtils.getTrimmedLength(""), (char) Color.argb(0, 0, 0, 0), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = iNotificationSideChannel.component3;
                            cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (ShareDataUIState ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component3) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component2) ^ (-3780477796495014671L)))));
                            iNotificationSideChannel.copydefault++;
                            int i9 = $11 + 121;
                            $10 = i9 % 128;
                            int i10 = i9 % 2;
                            i2 = 2;
                            i4 = 0;
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
        objArr[0] = new String(cArr6);
    }

    static {
        component4 = 1;
        component3();
        Object[] objArr = new Object[1];
        a(new char[]{Typography.ellipsis, 33558, 45665, 40113, 7301, 62741, 57784, 11989, 2241, 6664, 9065, 6831, 21976, 10736, 11259, 37207, 15293, 29304, 55443, 26192, 29118, 1023, 7762, 24035, 12199, 12386, 61992, 36925, 38574, 60424, 18678, 43190, 12548, 64048, 6333, 52053, 47298, 41384, 11905, 22208, 20186, 1643, 284, 47783, 4567, 27514, 55331, 39874, 12694, 19221, 819, 48028, 11159, 64504, 23727, 52980, 46532, 35707, 23999, 25172, 8122, 35641, 28741, 63655, 57267, '4', 34878, 53076, 64704, 1177, 6923, 26089}, new char[]{38006, 63493, 47583, 47861}, (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), new char[]{0, 0, 0, 0}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = copydefault + 67;
        component4 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static void component3() {
        ShareDataUIState = -3780477796495014671L;
        component3 = 1386857713;
        component2 = (char) 44966;
    }
}
