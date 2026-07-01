package com.huawei.common.provider;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.content.FileProvider;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getActiveNotifications;
import kotlin.notify;

public class CommonFileProvider extends FileProvider {
    private static int ShareDataUIState;
    private static char component1;
    private static int[] component2;
    private static long component3;
    private static int copy;
    private static long copydefault;
    private static final byte[] $$c = {79, 7, -80, -125};
    private static final int $$f = 134;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {Ascii.VT, -55, -20, -91, -19, -5, -10, -6, -6, 2, -16, -13, 60, -11, -12, 1, -4, -12, -17, 67, -60, -19, -4, -7, 0, -5, -24, 4, -13, -6, -12, 62, -66, -11, -7, -15, -6, Ascii.FF, -8, -17, 0, TarHeader.LF_NORMAL, -66, -11, -10, -3, 0, -15, 1, -16, -13, Ascii.FF, -26, 4, -13, -6, -12, 62, -66, -11, -7, -15, -6, Ascii.FF, -8, -17, 0, Ascii.DC2, -36, -17, -8, 63, -40, -26, -15, -2, -5, -24, Ascii.ESC, -26, -8, -19, -5, -10, -6, -6, 2, -16, -13, 58};
    private static final int $$e = 41;
    private static final byte[] $$a = {106, -23, Ascii.FF, -128, -29, -18, -26, 4, -18, -18, -12, -37, -8, -25, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_LINK, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_SYMLINK, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_NORMAL, -38, -10, -34, -4, Ascii.DLE, -46, -36, 2, -5, -5, -27, -50, 2, -36, -2};
    private static final int $$b = 26;
    private static int equals = 0;
    private static int component4 = 0;
    private static int getRequestBeneficiariesState = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(short r6, byte r7, int r8) {
        /*
            int r7 = r7 * 2
            int r7 = 1 - r7
            byte[] r0 = com.huawei.common.provider.CommonFileProvider.$$c
            int r6 = r6 + 4
            int r8 = r8 + 98
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r6
            r4 = r7
            r3 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
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
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.provider.CommonFileProvider.$$g(short, byte, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(short r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 16
            int r7 = 99 - r7
            int r0 = r6 + 10
            int r5 = r5 + 4
            byte[] r1 = com.huawei.common.provider.CommonFileProvider.$$a
            byte[] r0 = new byte[r0]
            int r6 = r6 + 9
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r1[r5]
        L26:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-17)
            int r5 = r5 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.provider.CommonFileProvider.c(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = 80 - r6
            byte[] r0 = com.huawei.common.provider.CommonFileProvider.$$d
            int r7 = r7 * 8
            int r7 = 107 - r7
            int r8 = r8 * 59
            int r8 = r8 + 10
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            int r6 = r6 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r6]
        L28:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-7)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.provider.CommonFileProvider.e(byte, int, byte, java.lang.Object[]):void");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = notifyVar.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault == null) {
                    byte b2 = (byte) (-1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3267 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), View.MeasureSpec.getSize(0) + 33, (char) (60267 - ImageFormat.getBitsPerPixel(0)), -834797019, false, $$g(b2, (byte) (b2 + 1), (byte) $$c.length), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (copydefault ^ 5431355972723572778L);
                Object[] objArr3 = {notifyVar, notifyVar};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault2 == null) {
                    byte b3 = (byte) (-1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSizeAndState(0, 0, 0) + 687, Gravity.getAbsoluteGravity(0, 0) + 34, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 60373), -1969106284, false, $$g(b3, (byte) (b3 + 1), $$c[1]), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i4 = $10 + 99;
                $11 = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr4 = {notifyVar, notifyVar};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault3 == null) {
                byte b4 = (byte) (-1);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(687 - TextUtils.getOffsetAfter("", 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 34, (char) (60373 - TextUtils.indexOf("", "")), -1969106284, false, $$g(b4, (byte) (b4 + 1), $$c[1]), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
        }
        String str = new String(cArr2);
        int i6 = $10 + 17;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i7 = 68 / 0;
            objArr[0] = str;
        }
    }

    private static void d(char[] cArr, char[] cArr2, char c2, int i, char[] cArr3, Object[] objArr) throws Throwable {
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
        while (iNotificationSideChannel.copydefault < length3) {
            int i3 = $10 + 113;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4037 - (ViewConfiguration.getEdgeSlop() >> 16), 31 - Color.blue(0), (char) (19181 - (ViewConfiguration.getPressedStateDuration() >> 16)), 1912513118, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7567 - ((Process.getThreadPriority(0) + 20) >> 6), 10 - TextUtils.lastIndexOf("", '0', 0), (char) (ViewConfiguration.getScrollBarSize() >> 8), 2006389106, false, "e", new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2459 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 28 - TextUtils.getOffsetAfter("", 0), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 931716605, false, $$g(b4, b5, b5), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7566, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 10, (char) ((Process.getThreadPriority(0) + 20) >> 6), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component3 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) ShareDataUIState) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component1) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i5 = $10 + 99;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        objArr[0] = str;
    }

    private static void b(int i, int[] iArr, Object[] objArr) throws Throwable {
        String str;
        String str2 = "";
        int i2 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = component2;
        int i3 = 684241640;
        int i4 = -1;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i6] = Integer.valueOf(iArr2[i7]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i3);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i4;
                        byte b3 = (byte) (b2 + 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4391, 37 - (ExpandableListView.getPackedPositionForGroup(i6) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i6) == 0L ? 0 : -1)), (char) Color.alpha(i6), -309236339, false, $$g(b2, b3, (byte) (b3 | 8)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i7++;
                    i3 = 684241640;
                    i4 = -1;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i8 = $10 + 75;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = component2;
        float f = 0.0f;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                int i11 = $11 + 49;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    Object[] objArr3 = new Object[i5];
                    objArr3[0] = Integer.valueOf(iArr5[i10]);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        str = str2;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)) + 4391, 36 - TextUtils.indexOf((CharSequence) str2, '0'), (char) TextUtils.getOffsetAfter(str2, 0), -309236339, false, $$g(b4, b5, (byte) (b5 | 8)), new Class[]{Integer.TYPE});
                    } else {
                        str = str2;
                    }
                    iArr6[i10] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    i10 = 0;
                } else {
                    str = str2;
                    try {
                        Object[] objArr4 = {Integer.valueOf(iArr5[i10])};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                        if (objCopydefault3 == null) {
                            byte b6 = (byte) (-1);
                            byte b7 = (byte) (b6 + 1);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getWindowTouchSlop() >> 8) + 4391, KeyEvent.normalizeMetaState(0) + 37, (char) (ViewConfiguration.getTapTimeout() >> 16), -309236339, false, $$g(b6, b7, (byte) (b7 | 8)), new Class[]{Integer.TYPE});
                        }
                        iArr6[i10] = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                        i10++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                str2 = str;
                f = 0.0f;
                i5 = 1;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        getactivenotifications.component1 = 0;
        while (getactivenotifications.component1 < iArr.length) {
            int i12 = $11 + 9;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr[0] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr4);
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                getactivenotifications.ShareDataUIState ^= iArr4[i14];
                Object[] objArr5 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) (-1);
                    byte b9 = (byte) (b8 + 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2969 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 16, (char) (View.MeasureSpec.getSize(0) + 49871), 462826032, false, $$g(b8, b9, (byte) (b9 | 6)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i14++;
            }
            int i16 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i16;
            getactivenotifications.component2 ^= iArr4[16];
            getactivenotifications.ShareDataUIState ^= iArr4[17];
            int i17 = getactivenotifications.ShareDataUIState;
            int i18 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr4);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr6 = {getactivenotifications, getactivenotifications};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault5 == null) {
                byte b10 = (byte) (-1);
                byte b11 = (byte) (b10 + 1);
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2944 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24, (char) (View.resolveSizeAndState(0, 0, 0) + 27637), -1616366948, false, $$g(b10, b11, (byte) (b11 | 9)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0105  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onCreate() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 7748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.provider.CommonFileProvider.onCreate():boolean");
    }

    static {
        copy = 1;
        ShareDataUIState();
        component3 = -3780477796495014671L;
        ShareDataUIState = -615062896;
        component1 = (char) 50417;
        int i = equals + 53;
        copy = i % 128;
        int i2 = i % 2;
    }

    static void ShareDataUIState() {
        copydefault = 193906802690950037L;
        component2 = new int[]{-1470705092, -603748985, 1736100419, -1038598345, 499593588, -743160283, -19138376, 1851993669, 647768185, 1859862101, -1080453248, -389534731, 368631517, 1897924876, -699344887, -697437254, -1367310170, 907354286};
    }
}
