package com.huawei.digitalpayment.pwa.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.digitalpayment.checkout.constants.TradeTypeEnum;
import com.huawei.digitalpayment.checkout.viewmodel.CheckoutViewModel;
import com.safaricom.mpesa.lifestyle.R;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Map;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.getSmallIconId;
import kotlin.io.encoding.Base64;
import org.bouncycastle.crypto.signers.PSSSigner;

public class H5PayActivity extends Hilt_H5PayActivity {
    private static int ShareDataUIState;
    private static int component1;
    private static int component2;
    private static int component3;
    private static int component4;
    private static byte[] copydefault;
    private static short[] equals;
    private static long getAsAtTimestamp;
    private static char getRequestBeneficiariesState;
    private static int hashCode;
    Map<String, Object> params;
    String urlString;
    private static final byte[] $$l = {68, -127, 122, -15};
    private static final int $$o = 246;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$s = {59, -24, -77, -23, 9, -5, 0, -4, -4, -12, 6, 3, -70, 9, -5, 0, -4, -4, -12, 6, 3, PSSSigner.TRAILER_IMPLICIT, 9, -5, -66, TarHeader.LF_FIFO, 5, -3, -11, 2, -10, -58, TarHeader.LF_NORMAL, 10, -13, Ascii.VT, -6, -9, -8, -57, TarHeader.LF_FIFO, 3, 3, -72, TarHeader.LF_SYMLINK, 9, -5, -3, -1, -4, -67, 56, 2, 3, -18, 10, -7, -16, 8, -65, 73, -3, -18, Ascii.DC2, -10, Ascii.SO, -16, -36, Ascii.SUB, Ascii.DLE, -22, -15, -15, 7, Ascii.RS, -22, Ascii.DLE, -18};
    private static final int $$t = 23;
    private static final byte[] $$d = {TarHeader.LF_BLK, -107, 59, -11, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 198;
    private static int toString = 0;
    private static int copy = 0;
    private static int getSponsorBeneficiariesState = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(short r6, int r7, int r8) {
        /*
            int r8 = r8 + 65
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r6 = r6 * 3
            int r6 = 1 - r6
            byte[] r0 = com.huawei.digitalpayment.pwa.ui.activity.H5PayActivity.$$l
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r7]
        L26:
            int r8 = r8 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.ui.activity.H5PayActivity.$$r(short, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.pwa.ui.activity.H5PayActivity.$$d
            int r7 = r7 + 4
            int r8 = 100 - r8
            int r6 = r6 * 2
            int r6 = 103 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r6
            r6 = r7
            r4 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r0[r8]
        L25:
            int r8 = r8 + 1
            int r6 = r6 + r3
            int r6 = r6 + (-8)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.ui.activity.H5PayActivity.i(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void k(int r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 2
            int r0 = r6 + 10
            int r7 = r7 * 16
            int r7 = 99 - r7
            byte[] r1 = com.huawei.digitalpayment.pwa.ui.activity.H5PayActivity.$$s
            int r5 = 63 - r5
            byte[] r0 = new byte[r0]
            int r6 = r6 + 9
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r7
            r3 = r2
            r7 = r6
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L25:
            r4 = r1[r5]
            int r3 = r3 + 1
        L29:
            int r5 = r5 + 1
            int r7 = r7 + r4
            int r7 = r7 + 3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.ui.activity.H5PayActivity.k(int, int, short, java.lang.Object[]):void");
    }

    private static void h(char c2, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
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
            int i3 = $11 + 35;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getTrimmedLength("") + 4037, Color.argb(0, 0, 0, 0) + 31, (char) (Color.alpha(0) + 19181), 1912513118, false, $$r(b2, b3, (byte) (b3 | 34)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7566, Drawable.resolveOpacity(0, 0) + 11, (char) Color.red(0), 2006389106, false, "e", new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.rgb(0, 0, 0) + 16779675, TextUtils.getOffsetBefore("", 0) + 28, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 931716605, false, $$r(b4, b5, (byte) (b5 | 33)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 7566, TextUtils.getOffsetBefore("", 0) + 11, (char) Color.green(0), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (getAsAtTimestamp ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component4) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) getRequestBeneficiariesState) ^ (-3780477796495014671L)))));
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
        int i5 = $11 + 101;
        $10 = i5 % 128;
        if (i5 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i6 = 46 / 0;
            objArr[0] = str;
        }
    }

    private static void j(int i, boolean z, int i2, char[] cArr, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i) {
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i3 + iTrustedWebActivityServiceStub.component3);
            int i5 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(component1)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3784 - (ViewConfiguration.getTouchSlop() >> 8), 38 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (26859 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 2015799920, false, $$r(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7406 - ((Process.getThreadPriority(0) + 20) >> 6), 15 - MotionEvent.axisFromString(""), (char) Color.argb(0, 0, 0, 0), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            int i6 = $10 + 3;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            iTrustedWebActivityServiceStub.component1 = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i - iTrustedWebActivityServiceStub.component1);
        }
        if (z) {
            char[] cArr4 = new char[i];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            int i8 = $11 + 113;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i) {
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.argb(0, 0, 0, 0) + 7406, KeyEvent.normalizeMetaState(0) + 16, (char) TextUtils.indexOf("", ""), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i10 = $10 + 93;
        $11 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str;
    }

    private static void g(int i, byte b2, int i2, short s, int i3, Object[] objArr) throws Throwable {
        long j;
        boolean z;
        int i4 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(ShareDataUIState)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(999 - ((Process.getThreadPriority(0) + 20) >> 6), 31 - ExpandableListView.getPackedPositionGroup(0L), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 61684), 1874745193, false, $$r(b3, b4, (byte) (b4 | TarHeader.LF_NORMAL)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            if (i5 == 0) {
                j = 7083766810336261929L;
            } else {
                byte[] bArr = copydefault;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i6 = $10 + 55;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 3 / 5;
                    }
                    for (int i8 = 0; i8 < length; i8++) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault2 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0, 0) + 2985, 48 - Color.green(0), (char) (54462 - (ViewConfiguration.getTouchSlop() >> 8)), -1178636483, false, $$r(b5, b6, (byte) (b6 | TarHeader.LF_CHR)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i9 = $10 + 23;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    byte[] bArr3 = copydefault;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(component2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((-16776217) - Color.rgb(0, 0, 0), 31 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (ExpandableListView.getPackedPositionGroup(0L) + 61685), 1874745193, false, $$r(b7, b8, (byte) (b8 | TarHeader.LF_NORMAL)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L)));
                    j = 7083766810336261929L;
                } else {
                    j = 7083766810336261929L;
                    iIntValue = (short) (((short) (((long) equals[i + ((int) (((long) component2) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L)));
                }
            }
            if (iIntValue > 0) {
                getsmalliconid.copydefault = ((i + iIntValue) - 2) + ((int) (((long) component2) ^ j)) + i5;
                Object[] objArr5 = {getsmalliconid, Integer.valueOf(i2), Integer.valueOf(component3), sb};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault4 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = b9;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1697 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 36, (char) Color.green(0), -1454191902, false, $$r(b9, b10, (byte) (b10 | 47)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = copydefault;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i11 = 0; i11 < length2; i11++) {
                        int i12 = $10 + 87;
                        $11 = i12 % 128;
                        int i13 = i12 % 2;
                        bArr5[i11] = (byte) (((long) bArr4[i11]) ^ 7083766810336261929L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i14 = $10 + 79;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    z = true;
                } else {
                    z = false;
                }
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    int i16 = $11 + 13;
                    $10 = i16 % 128;
                    int i17 = i16 % 2;
                    if (!(!z)) {
                        byte[] bArr6 = copydefault;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        short[] sArr = equals;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                        int i18 = $10 + 5;
                        $11 = i18 % 128;
                        int i19 = i18 % 2;
                    }
                    sb.append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    getsmalliconid.component2++;
                    int i20 = $10 + 85;
                    $11 = i20 % 128;
                    int i21 = i20 % 2;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0309  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 4840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.ui.activity.H5PayActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public void onErrorCode(BaseException baseException) {
        int i = 2 % 2;
        int i2 = copy + 27;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        super.onErrorCode(baseException);
        finish();
        int i4 = copy + 17;
        getSponsorBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
    }

    protected void initData() {
        int i = 2 % 2;
        try {
            this.params = (Map) getIntent().getSerializableExtra("params");
            this.urlString = getIntent().getStringExtra(RouteUtils.SCHEME_EXECUTE_KEY);
            if (!(!TextUtils.isEmpty(r1))) {
                int i2 = getSponsorBeneficiariesState + 35;
                copy = i2 % 128;
                int i3 = i2 % 2;
                finish();
                return;
            }
            parseUri(this.urlString);
            int i4 = getSponsorBeneficiariesState + 85;
            copy = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        } catch (Exception unused) {
            finish();
        }
    }

    private void parseUri(String str) {
        Uri uri;
        int i = 2 % 2;
        try {
            uri = Uri.parse(str);
            int i2 = getSponsorBeneficiariesState + 35;
            copy = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception unused) {
            uri = null;
        }
        if (uri == null) {
            return;
        }
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme)) {
            return;
        }
        redirect(scheme.toLowerCase(Locale.ENGLISH));
        int i4 = copy + 71;
        getSponsorBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private void redirect(String str) {
        int i = 2 % 2;
        int i2 = copy + 45;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        str.hashCode();
        if (str.equals(RouteUtils.SCHEME_NATIVE)) {
            preOrder();
            return;
        }
        finish();
        int i4 = getSponsorBeneficiariesState + 99;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    private void preOrder() {
        int i = 2 % 2;
        int i2 = copy + 121;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            ((CheckoutViewModel) this.viewModel).prePayOrder(TradeTypeEnum.H5_CHECKOUT, this.params);
            throw null;
        }
        ((CheckoutViewModel) this.viewModel).prePayOrder(TradeTypeEnum.H5_CHECKOUT, this.params);
        int i3 = getSponsorBeneficiariesState + 123;
        copy = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01b4  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.ui.activity.H5PayActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 49;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i4 = copy + 115;
            getSponsorBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952719_res_0x7f13044f).substring(6, 7).codePointAt(0) - 1721769932, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952792_res_0x7f130498).substring(2, 3).codePointAt(0) - 32), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131954659_res_0x7f130be3).substring(6, 9).codePointAt(0) + 1094760063, (short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952754_res_0x7f130472).substring(2, 3).codePointAt(0) - 32), (-97) - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(TextUtils.getOffsetAfter("", 0) - 1721769875, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952303_res_0x7f1302af).substring(0, 2).codePointAt(0) - 49), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(15) + 1094760063, (short) TextUtils.getCapsMode("", 0, 0), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 134, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i6 = copy + 101;
                getSponsorBeneficiariesState = i6 % 128;
                int i7 = i6 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6666 - AndroidCharacter.getMirror('0'), TextUtils.indexOf("", "", 0, 0) + 42, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - Color.argb(0, 0, 0, 0), 56 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), -960739708, false, "component3", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onPause();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0cbe A[Catch: all -> 0x07b1, TryCatch #6 {all -> 0x07b1, blocks: (B:143:0x0cb8, B:145:0x0cbe, B:146:0x0ce7, B:670:0x320d, B:672:0x3213, B:673:0x3240, B:704:0x354d, B:706:0x3553, B:707:0x357e, B:741:0x38a4, B:743:0x38aa, B:744:0x38d8, B:721:0x36d0, B:723:0x36f3, B:724:0x374c, B:556:0x2aaf, B:558:0x2ab5, B:559:0x2ade, B:561:0x2b18, B:562:0x2b5f, B:530:0x2804, B:532:0x2819, B:533:0x2848, B:766:0x39ad, B:768:0x39b3, B:769:0x39d5, B:771:0x3a0f, B:772:0x3a53, B:499:0x23c6, B:501:0x23db, B:502:0x2409, B:504:0x243d, B:505:0x24b5, B:479:0x2160, B:481:0x2166, B:482:0x2190, B:343:0x196f, B:345:0x1975, B:346:0x19a5, B:298:0x172e, B:300:0x1734, B:301:0x1762, B:230:0x1289, B:232:0x128f, B:233:0x12be, B:19:0x03c1, B:21:0x03c7, B:22:0x03f2, B:24:0x071e, B:26:0x0750, B:27:0x07ab, B:150:0x0d67, B:152:0x0d6d, B:153:0x0dae, B:155:0x0dbb, B:157:0x0dc4, B:158:0x0e09, B:181:0x1035, B:182:0x1039, B:185:0x1043, B:188:0x105a, B:191:0x1067, B:193:0x106a, B:205:0x1142, B:207:0x1148, B:208:0x1149, B:210:0x114b, B:212:0x1152, B:213:0x1153, B:159:0x0e14, B:171:0x0f1c, B:173:0x0f22, B:174:0x0f64, B:176:0x0f8e, B:177:0x0fd8, B:179:0x0fee, B:180:0x102f, B:215:0x1155, B:217:0x115c, B:218:0x115d, B:220:0x115f, B:222:0x1166, B:223:0x1167, B:306:0x17e7, B:308:0x17eb, B:329:0x18d0, B:331:0x18d6, B:332:0x18d7, B:334:0x18d9, B:336:0x18e0, B:337:0x18e1, B:312:0x17f7, B:237:0x133e, B:239:0x1344, B:240:0x1387, B:242:0x1394, B:244:0x139d, B:245:0x13d7, B:264:0x1583, B:272:0x15f2, B:278:0x1675, B:280:0x167b, B:281:0x167c, B:283:0x167e, B:285:0x1685, B:286:0x1686, B:247:0x13e3, B:254:0x146a, B:256:0x1470, B:257:0x14b0, B:259:0x14da, B:260:0x1525, B:262:0x153b, B:263:0x157b, B:288:0x1688, B:290:0x168f, B:291:0x1690), top: B:797:0x03c1, inners: #29, #40, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0d6d A[Catch: all -> 0x1168, TryCatch #29 {all -> 0x1168, blocks: (B:150:0x0d67, B:152:0x0d6d, B:153:0x0dae, B:155:0x0dbb, B:157:0x0dc4, B:158:0x0e09, B:181:0x1035, B:182:0x1039, B:185:0x1043, B:188:0x105a, B:191:0x1067, B:193:0x106a, B:205:0x1142, B:207:0x1148, B:208:0x1149, B:210:0x114b, B:212:0x1152, B:213:0x1153, B:159:0x0e14, B:171:0x0f1c, B:173:0x0f22, B:174:0x0f64, B:176:0x0f8e, B:177:0x0fd8, B:179:0x0fee, B:180:0x102f, B:215:0x1155, B:217:0x115c, B:218:0x115d, B:220:0x115f, B:222:0x1166, B:223:0x1167, B:201:0x10cb, B:196:0x1096, B:198:0x109c, B:199:0x10c3, B:166:0x0e81, B:168:0x0e9d, B:169:0x0f10, B:161:0x0e34, B:163:0x0e49, B:164:0x0e7a), top: B:841:0x0d67, outer: #6, inners: #12, #15, #20, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0dbb A[Catch: all -> 0x1168, TryCatch #29 {all -> 0x1168, blocks: (B:150:0x0d67, B:152:0x0d6d, B:153:0x0dae, B:155:0x0dbb, B:157:0x0dc4, B:158:0x0e09, B:181:0x1035, B:182:0x1039, B:185:0x1043, B:188:0x105a, B:191:0x1067, B:193:0x106a, B:205:0x1142, B:207:0x1148, B:208:0x1149, B:210:0x114b, B:212:0x1152, B:213:0x1153, B:159:0x0e14, B:171:0x0f1c, B:173:0x0f22, B:174:0x0f64, B:176:0x0f8e, B:177:0x0fd8, B:179:0x0fee, B:180:0x102f, B:215:0x1155, B:217:0x115c, B:218:0x115d, B:220:0x115f, B:222:0x1166, B:223:0x1167, B:201:0x10cb, B:196:0x1096, B:198:0x109c, B:199:0x10c3, B:166:0x0e81, B:168:0x0e9d, B:169:0x0f10, B:161:0x0e34, B:163:0x0e49, B:164:0x0e7a), top: B:841:0x0d67, outer: #6, inners: #12, #15, #20, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0e14 A[Catch: all -> 0x1168, TRY_LEAVE, TryCatch #29 {all -> 0x1168, blocks: (B:150:0x0d67, B:152:0x0d6d, B:153:0x0dae, B:155:0x0dbb, B:157:0x0dc4, B:158:0x0e09, B:181:0x1035, B:182:0x1039, B:185:0x1043, B:188:0x105a, B:191:0x1067, B:193:0x106a, B:205:0x1142, B:207:0x1148, B:208:0x1149, B:210:0x114b, B:212:0x1152, B:213:0x1153, B:159:0x0e14, B:171:0x0f1c, B:173:0x0f22, B:174:0x0f64, B:176:0x0f8e, B:177:0x0fd8, B:179:0x0fee, B:180:0x102f, B:215:0x1155, B:217:0x115c, B:218:0x115d, B:220:0x115f, B:222:0x1166, B:223:0x1167, B:201:0x10cb, B:196:0x1096, B:198:0x109c, B:199:0x10c3, B:166:0x0e81, B:168:0x0e9d, B:169:0x0f10, B:161:0x0e34, B:163:0x0e49, B:164:0x0e7a), top: B:841:0x0d67, outer: #6, inners: #12, #15, #20, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x1043 A[Catch: all -> 0x1168, TryCatch #29 {all -> 0x1168, blocks: (B:150:0x0d67, B:152:0x0d6d, B:153:0x0dae, B:155:0x0dbb, B:157:0x0dc4, B:158:0x0e09, B:181:0x1035, B:182:0x1039, B:185:0x1043, B:188:0x105a, B:191:0x1067, B:193:0x106a, B:205:0x1142, B:207:0x1148, B:208:0x1149, B:210:0x114b, B:212:0x1152, B:213:0x1153, B:159:0x0e14, B:171:0x0f1c, B:173:0x0f22, B:174:0x0f64, B:176:0x0f8e, B:177:0x0fd8, B:179:0x0fee, B:180:0x102f, B:215:0x1155, B:217:0x115c, B:218:0x115d, B:220:0x115f, B:222:0x1166, B:223:0x1167, B:201:0x10cb, B:196:0x1096, B:198:0x109c, B:199:0x10c3, B:166:0x0e81, B:168:0x0e9d, B:169:0x0f10, B:161:0x0e34, B:163:0x0e49, B:164:0x0e7a), top: B:841:0x0d67, outer: #6, inners: #12, #15, #20, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x1344 A[Catch: all -> 0x1691, TryCatch #52 {all -> 0x1691, blocks: (B:237:0x133e, B:239:0x1344, B:240:0x1387, B:242:0x1394, B:244:0x139d, B:245:0x13d7, B:264:0x1583, B:272:0x15f2, B:278:0x1675, B:280:0x167b, B:281:0x167c, B:283:0x167e, B:285:0x1685, B:286:0x1686, B:247:0x13e3, B:254:0x146a, B:256:0x1470, B:257:0x14b0, B:259:0x14da, B:260:0x1525, B:262:0x153b, B:263:0x157b, B:288:0x1688, B:290:0x168f, B:291:0x1690, B:274:0x15f8, B:268:0x15b7, B:270:0x15bd, B:271:0x15eb, B:249:0x1403, B:251:0x1415, B:252:0x145e), top: B:883:0x133e, outer: #6, inners: #35, #41, #47 }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x1394 A[Catch: all -> 0x1691, TryCatch #52 {all -> 0x1691, blocks: (B:237:0x133e, B:239:0x1344, B:240:0x1387, B:242:0x1394, B:244:0x139d, B:245:0x13d7, B:264:0x1583, B:272:0x15f2, B:278:0x1675, B:280:0x167b, B:281:0x167c, B:283:0x167e, B:285:0x1685, B:286:0x1686, B:247:0x13e3, B:254:0x146a, B:256:0x1470, B:257:0x14b0, B:259:0x14da, B:260:0x1525, B:262:0x153b, B:263:0x157b, B:288:0x1688, B:290:0x168f, B:291:0x1690, B:274:0x15f8, B:268:0x15b7, B:270:0x15bd, B:271:0x15eb, B:249:0x1403, B:251:0x1415, B:252:0x145e), top: B:883:0x133e, outer: #6, inners: #35, #41, #47 }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x13e3 A[Catch: all -> 0x1691, TRY_LEAVE, TryCatch #52 {all -> 0x1691, blocks: (B:237:0x133e, B:239:0x1344, B:240:0x1387, B:242:0x1394, B:244:0x139d, B:245:0x13d7, B:264:0x1583, B:272:0x15f2, B:278:0x1675, B:280:0x167b, B:281:0x167c, B:283:0x167e, B:285:0x1685, B:286:0x1686, B:247:0x13e3, B:254:0x146a, B:256:0x1470, B:257:0x14b0, B:259:0x14da, B:260:0x1525, B:262:0x153b, B:263:0x157b, B:288:0x1688, B:290:0x168f, B:291:0x1690, B:274:0x15f8, B:268:0x15b7, B:270:0x15bd, B:271:0x15eb, B:249:0x1403, B:251:0x1415, B:252:0x145e), top: B:883:0x133e, outer: #6, inners: #35, #41, #47 }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x1595  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x1800  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x1817 A[Catch: all -> 0x18d8, TryCatch #23 {all -> 0x18d8, blocks: (B:318:0x1802, B:320:0x1817, B:321:0x1847), top: B:829:0x1802, outer: #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x185a A[Catch: all -> 0x18ce, TryCatch #17 {all -> 0x18ce, blocks: (B:322:0x184d, B:324:0x185a, B:325:0x18c6), top: B:817:0x184d, outer: #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x1a90 A[Catch: all -> 0x2071, PHI: r2
  0x1a90: PHI (r2v517 java.lang.Object) = (r2v512 java.lang.Object), (r2v516 java.lang.Object) binds: [B:351:0x1a3b, B:352:0x1a3d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #34 {all -> 0x2071, blocks: (B:350:0x1a37, B:356:0x1a90), top: B:849:0x1a37 }] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x1b09  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x1b21  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x1b7e  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x1f0f A[Catch: all -> 0x204e, TryCatch #16 {all -> 0x204e, blocks: (B:418:0x1f05, B:419:0x1f09, B:421:0x1f0f, B:424:0x1f29, B:427:0x1f35, B:431:0x1f44, B:432:0x1f4c, B:444:0x203c, B:446:0x2042, B:447:0x2043, B:449:0x2045, B:451:0x204c, B:452:0x204d, B:410:0x1e30, B:412:0x1e4d, B:414:0x1e9b, B:416:0x1eb2, B:417:0x1efd, B:457:0x2054, B:459:0x205a, B:460:0x205b, B:463:0x2060, B:465:0x2066, B:466:0x2067, B:440:0x1fbd, B:435:0x1f7a, B:437:0x1f80, B:438:0x1fab), top: B:816:0x1b1f, inners: #9, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:481:0x2166 A[Catch: all -> 0x07b1, TryCatch #6 {all -> 0x07b1, blocks: (B:143:0x0cb8, B:145:0x0cbe, B:146:0x0ce7, B:670:0x320d, B:672:0x3213, B:673:0x3240, B:704:0x354d, B:706:0x3553, B:707:0x357e, B:741:0x38a4, B:743:0x38aa, B:744:0x38d8, B:721:0x36d0, B:723:0x36f3, B:724:0x374c, B:556:0x2aaf, B:558:0x2ab5, B:559:0x2ade, B:561:0x2b18, B:562:0x2b5f, B:530:0x2804, B:532:0x2819, B:533:0x2848, B:766:0x39ad, B:768:0x39b3, B:769:0x39d5, B:771:0x3a0f, B:772:0x3a53, B:499:0x23c6, B:501:0x23db, B:502:0x2409, B:504:0x243d, B:505:0x24b5, B:479:0x2160, B:481:0x2166, B:482:0x2190, B:343:0x196f, B:345:0x1975, B:346:0x19a5, B:298:0x172e, B:300:0x1734, B:301:0x1762, B:230:0x1289, B:232:0x128f, B:233:0x12be, B:19:0x03c1, B:21:0x03c7, B:22:0x03f2, B:24:0x071e, B:26:0x0750, B:27:0x07ab, B:150:0x0d67, B:152:0x0d6d, B:153:0x0dae, B:155:0x0dbb, B:157:0x0dc4, B:158:0x0e09, B:181:0x1035, B:182:0x1039, B:185:0x1043, B:188:0x105a, B:191:0x1067, B:193:0x106a, B:205:0x1142, B:207:0x1148, B:208:0x1149, B:210:0x114b, B:212:0x1152, B:213:0x1153, B:159:0x0e14, B:171:0x0f1c, B:173:0x0f22, B:174:0x0f64, B:176:0x0f8e, B:177:0x0fd8, B:179:0x0fee, B:180:0x102f, B:215:0x1155, B:217:0x115c, B:218:0x115d, B:220:0x115f, B:222:0x1166, B:223:0x1167, B:306:0x17e7, B:308:0x17eb, B:329:0x18d0, B:331:0x18d6, B:332:0x18d7, B:334:0x18d9, B:336:0x18e0, B:337:0x18e1, B:312:0x17f7, B:237:0x133e, B:239:0x1344, B:240:0x1387, B:242:0x1394, B:244:0x139d, B:245:0x13d7, B:264:0x1583, B:272:0x15f2, B:278:0x1675, B:280:0x167b, B:281:0x167c, B:283:0x167e, B:285:0x1685, B:286:0x1686, B:247:0x13e3, B:254:0x146a, B:256:0x1470, B:257:0x14b0, B:259:0x14da, B:260:0x1525, B:262:0x153b, B:263:0x157b, B:288:0x1688, B:290:0x168f, B:291:0x1690), top: B:797:0x03c1, inners: #29, #40, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:487:0x221c  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x2285  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x22df  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x23a8  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x25f6  */
    /* JADX WARN: Removed duplicated region for block: B:672:0x3213 A[Catch: all -> 0x07b1, TryCatch #6 {all -> 0x07b1, blocks: (B:143:0x0cb8, B:145:0x0cbe, B:146:0x0ce7, B:670:0x320d, B:672:0x3213, B:673:0x3240, B:704:0x354d, B:706:0x3553, B:707:0x357e, B:741:0x38a4, B:743:0x38aa, B:744:0x38d8, B:721:0x36d0, B:723:0x36f3, B:724:0x374c, B:556:0x2aaf, B:558:0x2ab5, B:559:0x2ade, B:561:0x2b18, B:562:0x2b5f, B:530:0x2804, B:532:0x2819, B:533:0x2848, B:766:0x39ad, B:768:0x39b3, B:769:0x39d5, B:771:0x3a0f, B:772:0x3a53, B:499:0x23c6, B:501:0x23db, B:502:0x2409, B:504:0x243d, B:505:0x24b5, B:479:0x2160, B:481:0x2166, B:482:0x2190, B:343:0x196f, B:345:0x1975, B:346:0x19a5, B:298:0x172e, B:300:0x1734, B:301:0x1762, B:230:0x1289, B:232:0x128f, B:233:0x12be, B:19:0x03c1, B:21:0x03c7, B:22:0x03f2, B:24:0x071e, B:26:0x0750, B:27:0x07ab, B:150:0x0d67, B:152:0x0d6d, B:153:0x0dae, B:155:0x0dbb, B:157:0x0dc4, B:158:0x0e09, B:181:0x1035, B:182:0x1039, B:185:0x1043, B:188:0x105a, B:191:0x1067, B:193:0x106a, B:205:0x1142, B:207:0x1148, B:208:0x1149, B:210:0x114b, B:212:0x1152, B:213:0x1153, B:159:0x0e14, B:171:0x0f1c, B:173:0x0f22, B:174:0x0f64, B:176:0x0f8e, B:177:0x0fd8, B:179:0x0fee, B:180:0x102f, B:215:0x1155, B:217:0x115c, B:218:0x115d, B:220:0x115f, B:222:0x1166, B:223:0x1167, B:306:0x17e7, B:308:0x17eb, B:329:0x18d0, B:331:0x18d6, B:332:0x18d7, B:334:0x18d9, B:336:0x18e0, B:337:0x18e1, B:312:0x17f7, B:237:0x133e, B:239:0x1344, B:240:0x1387, B:242:0x1394, B:244:0x139d, B:245:0x13d7, B:264:0x1583, B:272:0x15f2, B:278:0x1675, B:280:0x167b, B:281:0x167c, B:283:0x167e, B:285:0x1685, B:286:0x1686, B:247:0x13e3, B:254:0x146a, B:256:0x1470, B:257:0x14b0, B:259:0x14da, B:260:0x1525, B:262:0x153b, B:263:0x157b, B:288:0x1688, B:290:0x168f, B:291:0x1690), top: B:797:0x03c1, inners: #29, #40, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:678:0x32c9  */
    /* JADX WARN: Removed duplicated region for block: B:681:0x331c  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x3373  */
    /* JADX WARN: Removed duplicated region for block: B:703:0x352e  */
    /* JADX WARN: Removed duplicated region for block: B:712:0x360c  */
    /* JADX WARN: Removed duplicated region for block: B:715:0x3660  */
    /* JADX WARN: Removed duplicated region for block: B:720:0x36b2  */
    /* JADX WARN: Removed duplicated region for block: B:740:0x3886  */
    /* JADX WARN: Removed duplicated region for block: B:759:0x3975  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:860:0x17e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:865:0x1ab7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:877:0x1a3d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:921:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v110 */
    /* JADX WARN: Type inference failed for: r13v111 */
    /* JADX WARN: Type inference failed for: r13v112 */
    /* JADX WARN: Type inference failed for: r13v113 */
    /* JADX WARN: Type inference failed for: r13v125 */
    /* JADX WARN: Type inference failed for: r13v129 */
    /* JADX WARN: Type inference failed for: r13v130 */
    /* JADX WARN: Type inference failed for: r13v132 */
    /* JADX WARN: Type inference failed for: r13v134 */
    /* JADX WARN: Type inference failed for: r13v135 */
    /* JADX WARN: Type inference failed for: r13v136 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r37v12 */
    /* JADX WARN: Type inference failed for: r37v13 */
    /* JADX WARN: Type inference failed for: r37v14 */
    /* JADX WARN: Type inference failed for: r37v2 */
    /* JADX WARN: Type inference failed for: r37v3 */
    /* JADX WARN: Type inference failed for: r37v4 */
    /* JADX WARN: Type inference failed for: r37v5 */
    /* JADX WARN: Type inference failed for: r37v6 */
    /* JADX WARN: Type inference failed for: r37v7 */
    /* JADX WARN: Type inference failed for: r37v8 */
    /* JADX WARN: Type inference failed for: r7v194 */
    /* JADX WARN: Type inference failed for: r7v200 */
    /* JADX WARN: Type inference failed for: r7v204 */
    /* JADX WARN: Type inference failed for: r7v205 */
    /* JADX WARN: Type inference failed for: r7v206 */
    /* JADX WARN: Type inference failed for: r7v207 */
    /* JADX WARN: Type inference failed for: r7v230 */
    /* JADX WARN: Type inference failed for: r7v232 */
    /* JADX WARN: Type inference failed for: r7v240 */
    /* JADX WARN: Type inference failed for: r7v242 */
    /* JADX WARN: Type inference failed for: r7v243, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v249 */
    /* JADX WARN: Type inference failed for: r7v250 */
    /* JADX WARN: Type inference failed for: r7v251 */
    /* JADX WARN: Type inference failed for: r7v371 */
    /* JADX WARN: Type inference failed for: r7v372 */
    /* JADX WARN: Type inference failed for: r7v373 */
    /* JADX WARN: Type inference failed for: r7v374 */
    /* JADX WARN: Type inference failed for: r7v375 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r7v60, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v130 */
    /* JADX WARN: Type inference failed for: r8v131 */
    /* JADX WARN: Type inference failed for: r8v132, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v149 */
    /* JADX WARN: Type inference failed for: r8v150, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v151 */
    /* JADX WARN: Type inference failed for: r8v272 */
    /* JADX WARN: Type inference failed for: r9v100 */
    /* JADX WARN: Type inference failed for: r9v101 */
    /* JADX WARN: Type inference failed for: r9v102 */
    /* JADX WARN: Type inference failed for: r9v103 */
    /* JADX WARN: Type inference failed for: r9v104 */
    /* JADX WARN: Type inference failed for: r9v105 */
    /* JADX WARN: Type inference failed for: r9v106 */
    /* JADX WARN: Type inference failed for: r9v63 */
    /* JADX WARN: Type inference failed for: r9v64 */
    /* JADX WARN: Type inference failed for: r9v65 */
    /* JADX WARN: Type inference failed for: r9v66 */
    /* JADX WARN: Type inference failed for: r9v67, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v87 */
    /* JADX WARN: Type inference failed for: r9v88 */
    /* JADX WARN: Type inference failed for: r9v89 */
    /* JADX WARN: Type inference failed for: r9v91 */
    /* JADX WARN: Type inference failed for: r9v92 */
    /* JADX WARN: Type inference failed for: r9v96 */
    /* JADX WARN: Type inference failed for: r9v99 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 15338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.ui.activity.H5PayActivity.attachBaseContext(android.content.Context):void");
    }

    @Override
    public void initToolbar(String str) {
        int i = 2 % 2;
        int i2 = copy + 75;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 63 / 0;
        }
    }

    @Override
    public boolean isTransparentView() {
        int i = 2 % 2;
        int i2 = copy + 111;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 53;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override
    public boolean needFinishIfErrorCode() {
        int i = 2 % 2;
        int i2 = copy + 15;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 59;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
        return true;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = copy + 107;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = copy + 73;
        getSponsorBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        hashCode = 1;
        ShareDataUIState();
        component1 = -890926378;
        int i = toString + 79;
        hashCode = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void ShareDataUIState() {
        component2 = -1754568472;
        ShareDataUIState = -238323886;
        component3 = 1333018205;
        copydefault = new byte[]{41, 39, 43, -35, -44, Ascii.VT, Ascii.VT, -110, 45, 104, -29, -46, -45, -44, 39, -33, 36, -46, Base64.padSymbol, -11, 37, 42, -43, -38, 35, Base64.padSymbol, -14, 44, 34, -38, 36, -36, 56, Ascii.VT, 58, -105, 41, 38, Ascii.SUB, -29, -46, -45, -44, 39, -33, 36, -42, 47, -36, 58, -41, -45, -44, -43, 41, 6, -28, 47, 32, -38, 41, -44, 59, 7, -44, 42, -42, 44, -43, -41, -4, -41, 3, 46, 40, 40, -26, -43, -42, 41, 44, -42, 7, -25, 7, 45, -26, 6, 42, -5, 5, 41, 45, -26, 5, -8, Ascii.ESC, -45, 41, 42, -6, Ascii.SUB, -30, 43, 5, 40, -7, Ascii.FS, -47, -15, 42, -44, 47, -46, -42, 47, -44, -41, -5, 7, 40, -4, 40, 6, -25, Ascii.SUB, -43, 41, -26, Ascii.FS, -47, 40, -4, 41, Ascii.ESC, -28, -42, 42, -42, 2, 33, -25, 5, -41, 43, 42, -26, 40, 2, 44, 42, -29, Ascii.US, -25, 3, 33, -44, -7, 41, 4, -44, 44, 42, -30, Ascii.GS, -26, 41, 6, 45, -42, -41, -26, Ascii.ESC, 7, 40, -41, 45, -45, -6, 45, -42, Ascii.ESC, 41, -42, -47, -1, 5, 47, -25, Ascii.CAN, -48, 32, -48, -41, 42, -42, -5, 4, -3, Ascii.SUB, 40, -28, 4, 47, -29, Ascii.SUB, 41, -26, Ascii.CAN, -44, -5, Ascii.EM, -41, -41, 40, 44, -44, 41, -5, -41, 42, 4, 44, -48, -8, 42, 41, 4, 40, 42, -43, 44, -28, 5, -5, Ascii.US, -48, 42, -6, 2, -44, 44, -43, -6, Ascii.CAN, -26, 6, 32, -30, Ascii.ESC, -43, -6, Ascii.GS, -34, 40, 41, 40, 46, -44, -47, 33, 41, 42, -34, -3, 6, -42, -41, -4, Ascii.EM, -28, 40, -36, 5, -14, -36, 59, TarHeader.LF_NORMAL, -26, 44, 34, -36, 47, 32, 40, -46, 33, -35, 42, 0, -1, 33, -40, 40, -45, Ascii.SI, Ascii.FF, -110, 45, 104, -29, -46, -45, -44, 39, -33, 36, -47, 45, -36, 33, 34, -43, 58, -57, -42, -37, 42, 38, -36, 46, -48, 45, 40, 40, -45, 41, 40, 42, -44, 43, -43, -41, 40, 45, -42, 45, -45, 44, -48, 41, Ascii.ESC, 40, -48, -41, -4, 40, 3, -4, -42, Ascii.ESC, -8, -43, 4, -6, Ascii.ESC, -6, Ascii.EM, -25, -44, Ascii.FS, -41, -25, 4, 42, -42, -41, 45, -46, -4, 2, 46, -27, Ascii.SUB, -8, -41, 4, 40, 45, -41, -7, 40, 43, 2, -7, Ascii.CAN, -42, -5, Ascii.SUB, -41, -41, -6, -44, Ascii.CAN, -8, 5, -1, -42, -42, Ascii.SUB, -27, 2, -6, -5, 43, 5, 40, 42, -27, 41, Ascii.FS, -25, 43, 3, -42, -6, 45, 3, -3, 6, -42, 40, 41, -25, Ascii.FS, -41, 42, -47, 45, -44, -41, 40, 44, -45, 46, 41, -28, Ascii.GS, 40, -25, Ascii.CAN, -47, -15, 4, 45, -45, 40, -44, 44, -41, -8, 41, -42, 6, -42, -42, 46, -25, -41, 6, -4, 7, -5, -43, 7, -41, 43, 42, -46, 44, -43, -41, 45, 43, -42, 40, -44, 46, -46, 40, -44, 44, -46, 46, -41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41};
        getAsAtTimestamp = -135124286173374031L;
        component4 = 1386857713;
        getRequestBeneficiariesState = (char) 50417;
    }
}
