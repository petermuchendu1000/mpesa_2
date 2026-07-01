package com.huawei.digitalpayment.pwa.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.service.ILoginService;
import com.huawei.digitalpayment.pwa.business.BusinessManager;
import com.huawei.digitalpayment.pwa.cache.IntentManager;
import com.huawei.digitalpayment.pwa.viewmodel.PwaViewModel;
import com.huawei.digitalpayment.pwaui.R;
import com.huawei.digitalpayment.pwaui.databinding.LayoutTransparentBinding;
import com.safaricom.mpesa.logging.L;
import java.lang.reflect.Method;
import java.net.URI;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelAll;
import kotlin.io.encoding.Base64;
import org.bouncycastle.crypto.signers.PSSSigner;

public class PwaDispatcherActivity extends Hilt_PwaDispatcherActivity<LayoutTransparentBinding, PwaViewModel> {
    private static final String SCHEME = "democonsumer";
    private static final String TAG = "PwaDispatcherActivity";
    private static short[] equals;
    private static final byte[] $$l = {SignedBytes.MAX_POWER_OF_TWO, -61, 76, -90};
    private static final int $$o = 45;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {5, SignedBytes.MAX_POWER_OF_TWO, 127, 81, 5, 6, -7, -2, 6, Ascii.VT, -73, TarHeader.LF_FIFO, 13, 4, -2, 7, 0, -10, 6, -8, Ascii.SI, PSSSigner.TRAILER_IMPLICIT, TarHeader.LF_FIFO, 6, -6, Ascii.SO, 1, -8, 8, 8, PSSSigner.TRAILER_IMPLICIT, 35, 35, -2, -10, Ascii.DC2, -17, 3, Ascii.SO, -30, 17, 13, 2, -10, -64, 33, 34, 2, -4, Ascii.NAK, -8, 9, -42, 37, 4, -3, 8, 13, -1, 4, 0, 0, -8, 10, 7, -65, 13, -1, 4, 0, 0, -8, 10, 7, -64, 13, -1, -62, 71, -17, 20, -5, 0, 2, -1, 3, -64, 73, -12, -3, 19, -6, -14, 7, -1, Ascii.SO, -13, Ascii.FF, 6, 0, -9, 6, -9, 6, -5, -1, 20, -4, 4, -67, 37, -45, 73, -10, Ascii.EM, -9, 7, 0, 13, 2, 10, -20, 2, 2, -4, Ascii.NAK, -8, 9};
    private static final int $$k = 162;
    private static final byte[] $$d = {TarHeader.LF_CHR, -113, 92, 4, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -12, Ascii.FF, -19, -15, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 59, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 172;
    private static int getRequestBeneficiariesState = 0;
    private static int copy = 1;
    private static char[] ShareDataUIState = {2029, 2031, 2019, 2022, 2041, 1977, 1052, 1985, 1967, 1972, 1051, 2023, 1969, 1975, 2024, 1055, 2020, 2005, 2038, 2035, 2032, 1978, 1049, 2028, 2036, 2016, 1974, 2018, 1992, 1968, 1054, 1973, 2037, 2000, 1966, 1970, 1976, 1050, 2030, 2034, 2033, 1053, 2017, 1048, 2021, 2025, 1971, 1987, 2004};
    private static char component3 = 12829;
    private static int component1 = -214015554;
    private static int copydefault = -238323889;
    private static int component2 = 1376456027;
    private static byte[] getAsAtTimestamp = {-13, 19, Ascii.GS, 20, Ascii.ESC, Ascii.US, 20, Ascii.GS, Ascii.FS, 32, 76, 17, 37, 17, 79, 44, 67, Ascii.SUB, Ascii.RS, 47, 69, 6, 17, 37, Ascii.RS, SignedBytes.MAX_POWER_OF_TWO, 45, Ascii.US, 19, Ascii.US, 75, Ascii.SYN, 44, 74, Ascii.FS, Ascii.DLE, 19, 47, 17, 75, Ascii.NAK, 19, 40, 68, 44, 72, Ascii.SYN, Ascii.GS, 46, Ascii.RS, 77, Ascii.GS, Ascii.NAK, 19, 43, 66, 47, Ascii.RS, 79, Ascii.DC2, Ascii.US, Ascii.FS, 47, SignedBytes.MAX_POWER_OF_TWO, -105, Ascii.ETB, 97, TarHeader.LF_LINK, 89, 107, 99, 104, TarHeader.LF_LINK, 95, Base64.padSymbol, 93, 103, 57, 94, 104, TarHeader.LF_LINK, 80, Ascii.NAK, 111, 108, 111, 101, 107, 20, 100, 108, 97, Ascii.NAK, TarHeader.LF_NORMAL, 93, 109, 106, TarHeader.LF_CHR, 92, 59, -125, 102, 17, 97, 104, 68, 69, 39, 105, 125, Ascii.NAK, -84, Base64.padSymbol, Ascii.ESC, 117, Ascii.ETB, -103, -21, -121, -108, -54, -71, -21, -126, -110, -99, -55, -10, 92, -105, -46, -83, -100, -99, -98, -31, -103, -18, -128, -4, -56, -5, -52, -63, -16, -39, -30, -11, -26, -55, -59, -5, -51, -13, 111, 81, 110, Ascii.SYN, 109, TarHeader.LF_SYMLINK, 110, 89, TarHeader.LF_SYMLINK, 108, 81, 62, 107, 90, TarHeader.LF_NORMAL, 81, TarHeader.LF_NORMAL, 95, Base64.padSymbol, 106, 82, 109, Base64.padSymbol, 90, 96, 108, 109, 99, 104, TarHeader.LF_SYMLINK, 88, 100, 59, 80, 62, 109, 90, 110, 99, 109, 63, 110, 97, 88, 63, 94, 108, TarHeader.LF_LINK, 80, 109, 109, TarHeader.LF_NORMAL, 106, 94, 62, 91, TarHeader.LF_DIR, 108, 108, 80, 59, 88, TarHeader.LF_NORMAL, -116, 69, 70, 80, 68, 90, 70, 94, 68, 80, 89, -116, 9, 2, TarHeader.LF_DIR, Ascii.SO, Ascii.VT, 10, Ascii.SI, 3, TarHeader.LF_CONTIG, 3, -116, -44, -34, -48, -43, -42, -45, -42, -36, 41, -35};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(byte r6, byte r7, short r8) {
        /*
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r6 = r6 * 4
            int r0 = 1 - r6
            int r8 = r8 + 112
            byte[] r1 = com.huawei.digitalpayment.pwa.ui.activity.PwaDispatcherActivity.$$l
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2a
        L17:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1b:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L26:
            r4 = r1[r8]
            int r3 = r3 + 1
        L2a:
            int r7 = r7 + r4
            int r8 = r8 + 1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.ui.activity.PwaDispatcherActivity.$$r(byte, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.pwa.ui.activity.PwaDispatcherActivity.$$d
            int r7 = r7 * 2
            int r7 = r7 + 83
            int r8 = 100 - r8
            int r6 = r6 + 4
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            r4 = r0[r8]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L28:
            int r7 = -r7
            int r8 = r8 + 1
            int r3 = r3 + r7
            int r7 = r3 + (-8)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.ui.activity.PwaDispatcherActivity.h(int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(short r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.pwa.ui.activity.PwaDispatcherActivity.$$j
            int r7 = r7 * 8
            int r7 = r7 + 99
            int r6 = 118 - r6
            int r1 = 54 - r5
            byte[] r1 = new byte[r1]
            int r5 = 53 - r5
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r5
            r4 = r6
            r3 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
        L27:
            int r6 = r6 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-1)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.ui.activity.PwaDispatcherActivity.i(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01be A[PHI: r0
  0x01be: PHI (r0v9 int) = (r0v8 int), (r0v35 int) binds: [B:43:0x01bc, B:40:0x01aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c0 A[PHI: r0
  0x01c0: PHI (r0v32 int) = (r0v8 int), (r0v35 int) binds: [B:43:0x01bc, B:40:0x01aa] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(int r24, byte r25, int r26, short r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.ui.activity.PwaDispatcherActivity.g(int, byte, int, short, int, java.lang.Object[]):void");
    }

    private static void f(int i, char[] cArr, byte b2, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2;
        int i4 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = ShareDataUIState;
        char c2 = '0';
        int i5 = 64291;
        Object obj2 = null;
        if (cArr2 != null) {
            int i6 = $10 + 19;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", c2, 0, 0) + 7423, 15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + i5), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i8++;
                    int i9 = $10 + 75;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = 2 % 3;
                    }
                    c2 = '0';
                    i5 = 64291;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(component3)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getEdgeSlop() >> 16) + 7422, 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            cancelall.component2 = 0;
            int i11 = $10 + 41;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            while (cancelall.component2 < i2) {
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    int i13 = $10 + 37;
                    $11 = i13 % 128;
                    if (i13 % i3 == 0) {
                        cArr4[cancelall.component2] = (char) (cancelall.component1 * b2);
                        cArr4[cancelall.component2 >> 1] = (char) (cancelall.component3 - b2);
                    } else {
                        cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                        cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    }
                    obj = obj2;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = cancelall;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = cancelall;
                    objArr4[9] = cancelall;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = cancelall;
                    objArr4[6] = cancelall;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = cancelall;
                    objArr4[3] = cancelall;
                    objArr4[i3] = Integer.valueOf(cCharValue);
                    objArr4[1] = cancelall;
                    objArr4[0] = cancelall;
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault3 == null) {
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 7117;
                        int iResolveSize = View.resolveSize(0, 0) + 14;
                        char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 44463);
                        Class[] clsArr = new Class[13];
                        clsArr[0] = Object.class;
                        clsArr[1] = Object.class;
                        clsArr[i3] = Integer.TYPE;
                        clsArr[3] = Object.class;
                        clsArr[4] = Object.class;
                        clsArr[5] = Integer.TYPE;
                        clsArr[6] = Object.class;
                        clsArr[7] = Object.class;
                        clsArr[8] = Integer.TYPE;
                        clsArr[9] = Object.class;
                        clsArr[10] = Object.class;
                        clsArr[11] = Integer.TYPE;
                        clsArr[12] = Object.class;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(edgeSlop, iResolveSize, touchSlop, 1150140696, false, "x", clsArr);
                    }
                    if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                        try {
                            Object[] objArr5 = new Object[11];
                            objArr5[10] = cancelall;
                            objArr5[9] = Integer.valueOf(cCharValue);
                            objArr5[8] = cancelall;
                            objArr5[7] = Integer.valueOf(cCharValue);
                            objArr5[6] = Integer.valueOf(cCharValue);
                            objArr5[5] = cancelall;
                            objArr5[4] = cancelall;
                            objArr5[3] = Integer.valueOf(cCharValue);
                            objArr5[i3] = Integer.valueOf(cCharValue);
                            objArr5[1] = cancelall;
                            objArr5[0] = cancelall;
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                            if (objCopydefault4 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.normalizeMetaState(0) + 2944, 23 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (Color.red(0) + 27637), 794909189, false, $$r(b3, b4, (byte) (b4 | 7)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                            int i14 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[iIntValue];
                            cArr4[cancelall.component2 + 1] = cArr2[i14];
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        obj = null;
                        if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            int i15 = $10 + 19;
                            $11 = i15 % 128;
                            int i16 = i15 % 2;
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i17 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i18 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[i17];
                            cArr4[cancelall.component2 + 1] = cArr2[i18];
                        } else {
                            int i19 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i20 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr2[i19];
                            cArr4[cancelall.component2 + 1] = cArr2[i20];
                        }
                    }
                }
                cancelall.component2 += 2;
                obj2 = obj;
                i3 = 2;
            }
        }
        for (int i21 = 0; i21 < i; i21++) {
            cArr4[i21] = (char) (cArr4[i21] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00ae  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.ui.activity.PwaDispatcherActivity.onCreate(android.os.Bundle):void");
    }

    private void initView() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 121;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            BusinessManager.get().init(this);
            parseUri();
            int i3 = 70 / 0;
        } else {
            BusinessManager.get().init(this);
            parseUri();
        }
        int i4 = getRequestBeneficiariesState + 29;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    private void parseUri() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 45;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        Uri data = intent.getData();
        L.INSTANCE.d(TAG, "parseUri: " + data, new Object[0]);
        if (data != null) {
            int i4 = getRequestBeneficiariesState + 19;
            copy = i4 % 128;
            int i5 = i4 % 2;
            if (SCHEME.equals(data.getScheme())) {
                if (!((ILoginService) RouteUtils.getService(ILoginService.class)).isLogin()) {
                    try {
                        IntentManager.get().saveIntent(new URI(data.toString()).getHost(), getIntent());
                        RouteUtils.routeWithExecute(RoutePathConstants.LOGIN);
                        finish();
                        return;
                    } catch (Exception e) {
                        L.INSTANCE.e(TAG, "parseUri: " + e.getMessage(), new Object[0]);
                        finish();
                        return;
                    }
                }
                BusinessManager.get().parseUri(data);
                finish();
                return;
            }
        }
        finish();
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 117;
        copy = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.layout_transparent;
        if (i3 != 0) {
            return i4;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b9  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.ui.activity.PwaDispatcherActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f2  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.ui.activity.PwaDispatcherActivity.onPause():void");
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r50) {
        /*
            Method dump skipped, instruction units count: 15218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.ui.activity.PwaDispatcherActivity.attachBaseContext(android.content.Context):void");
    }

    @Override
    public void initToolbar(String str) {
        int i = 2 % 2;
        int i2 = copy + 123;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 83;
        copy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = getRequestBeneficiariesState + 111;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }
}
