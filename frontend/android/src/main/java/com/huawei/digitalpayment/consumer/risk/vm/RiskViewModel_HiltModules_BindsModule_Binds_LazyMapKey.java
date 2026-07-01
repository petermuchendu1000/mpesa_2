package com.huawei.digitalpayment.consumer.risk.vm;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class RiskViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static int ShareDataUIState;
    private static char component1;
    private static long component2;
    private static int component3;
    static RiskViewModel copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {13, 38, -109, 117};
    private static final int $$b = 197;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component4 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r7, int r8, short r9) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 1
            int r9 = r9 + 98
            int r7 = r7 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.risk.vm.RiskViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r5 = r2
            r9 = r7
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L21
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L21:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L28:
            int r7 = r7 + r3
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.risk.vm.RiskViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(byte, int, short):java.lang.String");
    }

    private static void a(char[] cArr, char[] cArr2, char c2, int i, char[] cArr3, Object[] objArr) throws Throwable {
        char c3 = 2;
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
        int i3 = $10 + 19;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (iNotificationSideChannel.copydefault < length3) {
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4037 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.getDefaultSize(0, 0) + 31, (char) ((-16758035) - Color.rgb(0, 0, 0)), 1912513118, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getDoubleTapTimeout() >> 16) + 7567, 11 - View.resolveSizeAndState(0, 0, 0), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 2006389106, false, "e", new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    int i5 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                    try {
                        Object[] objArr4 = new Object[3];
                        objArr4[c3] = Integer.valueOf(cArr5[iIntValue]);
                        objArr4[1] = Integer.valueOf(i5);
                        objArr4[0] = iNotificationSideChannel;
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) (-1);
                            byte b5 = (byte) (b4 + 1);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getMode(0) + 2459, 28 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) View.MeasureSpec.getMode(0), 931716605, false, $$c(b4, b5, b5), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                            if (objCopydefault4 == null) {
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7568 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 11 - Drawable.resolveOpacity(0, 0), (char) ExpandableListView.getPackedPositionType(0L), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = iNotificationSideChannel.component3;
                            cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component2 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) ShareDataUIState) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component1) ^ (-3780477796495014671L)))));
                            iNotificationSideChannel.copydefault++;
                            int i6 = $11 + 107;
                            $10 = i6 % 128;
                            if (i6 % 2 != 0) {
                                int i7 = 3 / 2;
                            }
                            c3 = 2;
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
        component3 = 0;
        component3();
        Object[] objArr = new Object[1];
        a(new char[]{14150, 7686, 29784, 32220, 11625, 3148, 48234, 55056, 16247, 41935, 14507, 19311, 56916, 1579, 49258, 61485, 37922, 60893, 57694, 8716, 56232, 60055, 63461, 48891, 9086, 21470, 62976, 15907, 50580, 10895, 50408, 61068, 50716, 48493, 37441, 2341, 30406, 50584, 54948, 320, 36196, 29831, 65303, 52178, 26357, 11456, 16491, 48792, 36054, 1537, 25153, 53364, 9832, 52623, 12237, 64877}, new char[]{22512, 58633, 54282, 33387}, (char) (27604 - View.resolveSize(0, 0)), TextUtils.lastIndexOf("", '0', 0) + 1, new char[]{0, 0, 0, 0}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component4 + 33;
        component3 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component3() {
        component2 = -3780477796495014671L;
        ShareDataUIState = 1386857713;
        component1 = (char) 44330;
    }
}
