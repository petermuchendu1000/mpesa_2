package com.huawei.digitalpayment.consumer.profile.viewmodel;

import android.graphics.ImageFormat;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class UpdateDynamicsKycViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static long ShareDataUIState;
    private static char component1;
    static UpdateDynamicsKycViewModel component2;
    private static int component3;
    private static int copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {62, TarHeader.LF_FIFO, 60, 44};
    private static final int $$b = 53;
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
    private static java.lang.String $$c(byte r5, short r6, byte r7) {
        /*
            int r6 = r6 + 4
            int r5 = 99 - r5
            int r7 = r7 * 3
            int r7 = 1 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.profile.viewmodel.UpdateDynamicsKycViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r7
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L20:
            int r6 = r6 + 1
            r4 = r0[r6]
        L24:
            int r4 = -r4
            int r5 = r5 + r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profile.viewmodel.UpdateDynamicsKycViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(byte, short, byte):java.lang.String");
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
            int i5 = $11 + 109;
            $10 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4037;
                    int bitsPerPixel = 30 - ImageFormat.getBitsPerPixel(i4);
                    char c3 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 19180);
                    byte b2 = (byte) i4;
                    byte b3 = (byte) (b2 - 1);
                    String str$$c = $$c(b2, b3, (byte) (b3 + 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatTimeout, bitsPerPixel, c3, 1912513118, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        int i7 = 7567 - (ExpandableListView.getPackedPositionForGroup(i4) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i4) == 0L ? 0 : -1));
                        int mirror = AndroidCharacter.getMirror('0') - '%';
                        char deadChar = (char) KeyEvent.getDeadChar(i4, i4);
                        Class[] clsArr2 = new Class[1];
                        clsArr2[i4] = Object.class;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i7, mirror, deadChar, 2006389106, false, "e", clsArr2);
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
                            int scrollBarFadeDuration = 2459 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int size = View.MeasureSpec.getSize(i4) + 28;
                            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', i4, i4) + 1);
                            byte b4 = (byte) ($$b & 3);
                            byte b5 = (byte) (-b4);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(scrollBarFadeDuration, size, cIndexOf, 931716605, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                            if (objCopydefault4 == null) {
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 7567, (ViewConfiguration.getLongPressTimeout() >> 16) + 11, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = iNotificationSideChannel.component3;
                            cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (ShareDataUIState ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) copydefault) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component1) ^ (-3780477796495014671L)))));
                            iNotificationSideChannel.copydefault++;
                            int i9 = $11 + 99;
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
        component3 = 0;
        component2();
        Object[] objArr = new Object[1];
        a(new char[]{32139, 21834, 34500, 37825, 19482, 274, 495, 26057, 35402, 43893, 17480, 26155, 7357, 38245, 38559, 9049, 5914, 41426, 1695, 783, 28484, 16957, 17601, 60764, 2515, 14229, 59941, 48684, 16973, 46494, 46484, 18422, 38702, 3672, 64738, 64920, 17025, 28588, 39574, 45747, 38536, 56851, 43317, 24972, 25890, 9884, 986, 42713, 46671, 30449, 39683, 47803, 39264, 32812, 45804, 26308, 12380, 1887, 18457, 16665, 21673, 24683, 22613, 15363, 44288, 31766, 13027, 39996, 12796, 32337, 333, 56255, 59818, 37900, 40260, 8400, 17963, 12233, 34149}, new char[]{55031, 13209, 22884, 62010}, (char) (14937 - TextUtils.getOffsetAfter("", 0)), 1681103317 - ExpandableListView.getPackedPositionChild(0L), new char[]{0, 0, 0, 0}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component4 + 81;
        component3 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void component2() {
        ShareDataUIState = -3780477796495014671L;
        copydefault = 1386857713;
        component1 = (char) 28442;
    }
}
