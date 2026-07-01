package com.huawei.digitalpayment.consumer.baselib;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.cancel;
import kotlin.io.encoding.Base64;

public class PaymentTranslucentActivity<VM extends ViewModel> extends PaymentBaseActivity<ViewDataBinding, VM> {
    private static int ArtificialStackFrames;
    private static char ShareDataUIState;
    private static char component1;
    private static char component2;
    private static char component3;
    private static char[] component4;
    private static int copy;
    private static char[] copydefault;
    private static boolean equals;
    private static boolean getRequestBeneficiariesState;
    private static final byte[] $$D = {7, 75, -84, -52};
    private static final int $$G = 167;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$B = {Ascii.SI, -12, 105, 108, -15, -1, -6, -2, -2, 6, -12, -9, 63, -15, -1, -6, -2, -2, 6, -12, -9, 62, -15, -1, 60, -72, Ascii.SI, -8, 2, -20, 6, 3, -15, -1, 60, -72, 8, 4, -20, 10, -2, -20, 9, 56, -56, -15, -1, -6, -2, -7, Ascii.VT, TarHeader.LF_BLK, -56, -15, -2, 5, -6, -12, 2, 9, -22, 8, -9, -2, Base64.padSymbol, -24, -47, -2, 5, -6, -12, 2, 33, -40, 5, -12, 35, -46, Ascii.FF, -11, 70, -32, -37, -20, 8, -9, -2, 40, -40, -4, -10, 73, -34, -50, 10, 1, -22, 2, -6, -24, 4, -20, 10, Ascii.RS, -32, -22, Ascii.DLE, 9, 9, -13, -36, Ascii.DLE, -22, Ascii.FF};
    private static final int $$C = 34;
    private static final byte[] $$j = {93, TarHeader.LF_LINK, 76, -114, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$k = 188;
    private static int getSponsorBeneficiariesState = 1;
    private static int getAsAtTimestamp = 0;
    private static int getShareableDataState = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$J(int r6, short r7, byte r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.baselib.PaymentTranslucentActivity.$$D
            int r6 = r6 * 3
            int r1 = 1 - r6
            int r8 = r8 + 68
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L20:
            int r7 = r7 + 1
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.PaymentTranslucentActivity.$$J(int, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void r(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.baselib.PaymentTranslucentActivity.$$j
            int r8 = r8 * 2
            int r8 = 103 - r8
            int r1 = r7 + 4
            byte[] r1 = new byte[r1]
            int r7 = r7 + 3
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r3 = r3 + r6
            int r6 = r3 + (-8)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.PaymentTranslucentActivity.r(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void t(int r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 16
            int r9 = r9 + 83
            int r7 = 99 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.baselib.PaymentTranslucentActivity.$$B
            int r8 = r8 * 2
            int r8 = 78 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r5 = r2
            r9 = r7
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2a:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-3)
            int r9 = r9 + 1
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.PaymentTranslucentActivity.t(int, byte, int, java.lang.Object[]):void");
    }

    private static void s(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i5 = $11 + 29;
            $10 = i5 % 128;
            int i6 = 58224;
            char c2 = 1;
            if (i5 % 2 != 0) {
                cArr3[i4] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
                i2 = i4;
            }
            while (i2 < 16) {
                int i7 = $10 + 75;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c3 = cArr3[c2];
                char c4 = cArr3[i4];
                char[] cArr4 = cArr3;
                int i9 = (c4 + i6) ^ ((c4 << 4) + ((char) (((long) component2) ^ 4374495167426960553L)));
                int i10 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(ShareDataUIState);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[c2] = Integer.valueOf(i9);
                    objArr2[0] = Integer.valueOf(c3);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int i11 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 844;
                        int minimumFlingVelocity = 32 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 23252);
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        String str$$J = $$J(b2, b3, (byte) (b3 & 43));
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c2] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i11, minimumFlingVelocity, bitsPerPixel, 592652048, false, str$$J, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr4[c2] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) component1) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component3)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatDelay() >> 16) + 844, 32 - View.MeasureSpec.getMode(0), (char) (23251 - (ViewConfiguration.getTouchSlop() >> 8)), 592652048, false, $$J(b4, b5, (byte) (b5 & 43)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i2++;
                    cArr3 = cArr4;
                    i4 = 0;
                    c2 = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[iNotificationSideChannelDefault.component3] = cArr5[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr5[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(465 - ((Process.getThreadPriority(0) + 20) >> 6), 49 - TextUtils.indexOf("", ""), (char) Gravity.getAbsoluteGravity(0, 0), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void p(int i, char[] cArr, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr3 = copydefault;
        char c2 = '0';
        int i4 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $10 + 121;
                $11 = i6 % 128;
                int i7 = i6 % i2;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i4] = Integer.valueOf(cArr3[i5]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i4;
                        byte b3 = (byte) (b2 - 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSizeAndState(i4, i4, i4) + 3760, TextUtils.indexOf("", c2) + 25, (char) Color.blue(i4), -1670574543, false, $$J(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr4[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i5++;
                    i2 = 2;
                    c2 = '0';
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(copy)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Color.green(0) + 7140, View.getDefaultSize(0, 0) + 13, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i8 = 689978476;
        long j = 0;
        if (equals) {
            cancelVar.component1 = bArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr5[cancelVar.component3] = (char) (cArr3[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr4 = {cancelVar, cancelVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2748 - View.resolveSize(0, 0), 19 - ExpandableListView.getPackedPositionGroup(j), (char) (7644 - (ViewConfiguration.getEdgeSlop() >> 16)), -327556343, false, $$J(b4, b5, (byte) (b5 & 5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                j = 0;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (getRequestBeneficiariesState) {
            int i9 = $10 + 109;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cancelVar.component1 = cArr.length;
                cArr2 = new char[cancelVar.component1];
                cancelVar.component3 = 1;
            } else {
                cancelVar.component1 = cArr.length;
                cArr2 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
            }
            while (cancelVar.component3 < cancelVar.component1) {
                int i10 = $11 + 93;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                cArr2[cancelVar.component3] = (char) (cArr3[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr5 = {cancelVar, cancelVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i8);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2747 - TextUtils.lastIndexOf("", '0', 0, 0), 19 - ExpandableListView.getPackedPositionGroup(0L), (char) (7645 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), -327556343, false, $$J(b6, b7, (byte) (b7 & 5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                i8 = 689978476;
            }
            objArr[0] = new String(cArr2);
            return;
        }
        int i12 = 0;
        cancelVar.component1 = iArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        while (true) {
            cancelVar.component3 = i12;
            if (cancelVar.component3 >= cancelVar.component1) {
                objArr[0] = new String(cArr6);
                return;
            }
            int i13 = $11 + 103;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                cArr6[cancelVar.component3] = (char) (cArr3[iArr[cancelVar.component1 * cancelVar.component3] >>> i] * iIntValue);
                int i14 = cancelVar.component3;
                i12 = 0;
            } else {
                cArr6[cancelVar.component3] = (char) (cArr3[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                i12 = cancelVar.component3 + 1;
            }
        }
    }

    private static void q(byte[] bArr, boolean z, int[] iArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = component4;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 113;
                $10 = i8 % 128;
                if (i8 % i != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(657 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), 14 - Drawable.resolveOpacity(0, 0), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        i7 %= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr[i7])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                        if (objCopydefault2 == null) {
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(705 - AndroidCharacter.getMirror('0'), View.MeasureSpec.getMode(0) + 14, (char) (65118 - Color.red(0)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                        i7++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i = 2;
                j = 0;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            int i9 = $11 + 105;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i11 = $11 + 81;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i13 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4503 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 35 - ExpandableListView.getPackedPositionChild(0L), (char) (27897 - ExpandableListView.getPackedPositionType(0L)), -1464227204, false, $$J(b2, b3, (byte) (b3 & 42)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                } else {
                    int i14 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr5 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(View.combineMeasuredStates(0, 0) + 3580, View.combineMeasuredStates(0, 0) + 28, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 1180380354, false, $$J(b4, b5, (byte) (b5 & 47)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr6 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1859 - (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.lastIndexOf("", '0', 0, 0) + 35, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 80302927, false, $$J(b6, b7, (byte) (b7 & 46)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i15 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i15, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i15);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i4 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            int i16 = $11 + 69;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i18 = $10 + 89;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] * iArr[2]);
                } else {
                    cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                }
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fa  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2024
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.PaymentTranslucentActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public void finish() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 23;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        super.finish();
        overridePendingTransition(0, 0);
        int i4 = getShareableDataState + 11;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    protected void initViewModel(int i) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 95;
        getShareableDataState = i3 % 128;
        super.initViewModel(i3 % 2 == 0 ? 1 : 0);
        int i4 = getShareableDataState + 47;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = getShareableDataState + 81;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            q(new byte[]{0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0}, false, new int[]{0, 26, 0, 1}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            p(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952805_res_0x7f1304a5).substring(19, 20).codePointAt(0) + 12, null, new byte[]{-126, -123, -122, -112, -127, -118, -122, -109, -110, -110, -111, -112, -126, -117, -124, -124, -113, -118}, null, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i4 = getShareableDataState + 59;
                getAsAtTimestamp = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getScrollBarSize() >> 8), 41 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (Color.rgb(0, 0, 0) + 16777216), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.makeMeasureSpec(0, 0) + 6562, ExpandableListView.getPackedPositionGroup(0L) + 56, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), -699576857, false, "component2", new Class[]{Context.class});
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
        super.onResume();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009e  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.PaymentTranslucentActivity.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(50:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|826|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|808|32|(2:866|34)|38|39|789|(5:41|42|(1:44)|45|46)(16:48|49|792|50|(2:849|52)|56|57|58|(1:60)|61|62|63|(1:65)|66|(1:68)|69)|47|70|(9:73|774|74|(1:76)|77|78|79|860|80)|115|(8:859|116|(1:118)|119|(3:121|(1:123)|124)(19:125|126|855|127|(1:129)|130|131|853|132|(1:134)|135|136|137|(1:139)|140|(1:142)|143|(1:145)|146)|147|(4:150|(3:874|152|877)(12:873|153|(3:155|(3:158|159|156)|878)|160|845|161|(1:163)|164|165|841|166|876)|875|148)|872)|179|(3:829|204|(1:210)(1:209))(1:214)|215|796|216|(1:218)|219|779|220|(1:222)|223|247|835|248|(13:250|787|251|255|(5:776|257|258|869|259)(1:264)|833|265|266|810|(4:268|269|(1:271)|272)(12:(2:276|(1:282)(1:281))(1:284)|(20:286|822|287|(2:802|289)|293|294|811|295|(3:297|837|298)|302|303|304|(2:306|307)|308|309|310|(1:312)(1:313)|314|(1:316)|317)(1:364)|369|370|790|371|374|375|(1:377)|378|379|380)|318|(4:321|(2:323|894)(11:324|(3:326|(3:329|330|327)|895)|331|798|332|(1:334)|335|336|781|337|893)|338|319)|892)(10:255|(0)(0)|833|265|266|810|(0)(0)|318|(1:319)|892)|381|816|382|(2:839|384)|388|389|815|(4:391|392|(1:394)|395)(19:397|398|800|399|(2:804|401)|405|406|783|407|(2:818|409)|413|414|415|(1:417)|418|(1:420)|421|(1:423)|424)|425|(4:428|(2:430|881)(11:431|(3:433|(3:436|437|434)|882)|438|864|439|(1:441)|442|443|857|444|880)|445|426)|879|457|486|(1:488)|489|(3:491|(1:493)|494)(14:495|496|(1:498)|499|500|(1:502)|503|851|504|505|(1:507)|508|(1:510)|511)|512|(9:514|(1:516)|517|(1:519)|520|(3:522|(1:524)|525)(16:527|528|(1:530)|531|(1:533)|534|535|(1:537)|538|847|539|540|(1:542)|543|(1:545)|546)|526|547|(24:549|832|550|(1:552)|553|(1:555)|556|(3:558|(1:560)|561)(16:562|(15:564|(3:566|567|(2:569|571)(1:570))(1:571)|649|(1:651)|652|(3:654|(1:656)|657)(13:659|870|660|661|(1:663)|664|824|665|666|(1:668)|669|(1:671)|672)|658|673|(6:676|677|(1:679)|680|681|682)|683|(1:685)|686|(3:688|(1:690)|691)(14:692|693|(1:695)|696|697|(1:699)|700|830|701|702|(1:704)|705|(1:707)|708)|709|(1:896)(7:712|713|(1:715)|716|717|718|719))|(19:573|574|820|575|(1:577)|578|579|813|580|(1:582)|583|584|585|(1:587)|588|(1:590)|591|(1:593)|594)|649|(0)|652|(0)(0)|658|673|(0)|683|(0)|686|(0)(0)|709|(0)(0))|595|(4:598|(3:885|600|888)(12:884|601|(3:603|(3:606|607|604)|889)|608|806|609|(1:611)|612|613|785|614|887)|886|596)|883|649|(0)|652|(0)(0)|658|673|(0)|683|(0)|686|(0)(0)|709|(0)(0))(10:729|(3:731|(2:734|732)|890)|735|736|(1:738)|739|(1:741)|742|743|744))(10:747|(3:749|(2:752|750)|891)|753|754|(1:756)|757|(1:759)|760|761|762)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x14db, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x14dc, code lost:
    
        r7 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x1a3c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x1a3e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x1a3f, code lost:
    
        r11 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x1a40, code lost:
    
        r1 = r0;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x1ad6, code lost:
    
        r4 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6619 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)), 42 - android.graphics.Color.green(0), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x074f A[Catch: all -> 0x0349, TryCatch #28 {all -> 0x0349, blocks: (B:375:0x155f, B:377:0x1565, B:378:0x1590, B:480:0x1ad0, B:482:0x1ad6, B:483:0x1b03, B:677:0x2c97, B:679:0x2c9d, B:680:0x2cc7, B:713:0x2fdf, B:715:0x2fe5, B:716:0x300e, B:693:0x2e12, B:695:0x2e35, B:696:0x2e8d, B:643:0x295f, B:645:0x2965, B:646:0x298d, B:736:0x30f2, B:738:0x30f8, B:739:0x3122, B:741:0x315c, B:742:0x31a4, B:528:0x210b, B:530:0x2120, B:531:0x214d, B:533:0x2181, B:534:0x21fb, B:754:0x3262, B:756:0x3268, B:757:0x3294, B:759:0x32ce, B:760:0x3315, B:496:0x1cdd, B:498:0x1cf2, B:499:0x1d24, B:241:0x0ea0, B:243:0x0ea6, B:244:0x0ed7, B:196:0x0c7f, B:198:0x0c85, B:199:0x0cb1, B:109:0x0749, B:111:0x074f, B:112:0x077e, B:19:0x0156, B:21:0x015c, B:22:0x0184, B:24:0x02bd, B:26:0x02ef, B:27:0x0343), top: B:826:0x0156 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0d4f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0d66 A[Catch: all -> 0x0e2e, TryCatch #12 {all -> 0x0e2e, blocks: (B:216:0x0d51, B:218:0x0d66, B:219:0x0d98), top: B:796:0x0d51, outer: #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0dab A[Catch: all -> 0x0e24, TryCatch #3 {all -> 0x0e24, blocks: (B:220:0x0d9e, B:222:0x0dab, B:223:0x0e1c), top: B:779:0x0d9e, outer: #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0f61  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0fae A[Catch: all -> 0x14db, PHI: r2
  0x0fae: PHI (r2v554 java.lang.Object) = (r2v553 java.lang.Object), (r2v618 java.lang.Object) binds: [B:249:0x0f5f, B:251:0x0f62] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #34 {all -> 0x14db, blocks: (B:248:0x0f5b, B:255:0x0fae), top: B:835:0x0f5b }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x102a  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x1042  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x109e  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x139c A[Catch: all -> 0x14b9, TryCatch #19 {all -> 0x14b9, blocks: (B:318:0x1392, B:319:0x1396, B:321:0x139c, B:324:0x13b6, B:327:0x13c2, B:329:0x13c5, B:341:0x14a7, B:343:0x14ad, B:344:0x14ae, B:346:0x14b0, B:348:0x14b7, B:349:0x14b8, B:354:0x14bf, B:356:0x14c5, B:357:0x14c6, B:310:0x12ca, B:312:0x12e7, B:314:0x132d, B:316:0x1344, B:317:0x138a, B:360:0x14cb, B:362:0x14d1, B:363:0x14d2, B:337:0x142b, B:332:0x13f3, B:334:0x13f9, B:335:0x1423), top: B:810:0x1040, inners: #4, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x1565 A[Catch: all -> 0x0349, TryCatch #28 {all -> 0x0349, blocks: (B:375:0x155f, B:377:0x1565, B:378:0x1590, B:480:0x1ad0, B:482:0x1ad6, B:483:0x1b03, B:677:0x2c97, B:679:0x2c9d, B:680:0x2cc7, B:713:0x2fdf, B:715:0x2fe5, B:716:0x300e, B:693:0x2e12, B:695:0x2e35, B:696:0x2e8d, B:643:0x295f, B:645:0x2965, B:646:0x298d, B:736:0x30f2, B:738:0x30f8, B:739:0x3122, B:741:0x315c, B:742:0x31a4, B:528:0x210b, B:530:0x2120, B:531:0x214d, B:533:0x2181, B:534:0x21fb, B:754:0x3262, B:756:0x3268, B:757:0x3294, B:759:0x32ce, B:760:0x3315, B:496:0x1cdd, B:498:0x1cf2, B:499:0x1d24, B:241:0x0ea0, B:243:0x0ea6, B:244:0x0ed7, B:196:0x0c7f, B:198:0x0c85, B:199:0x0cb1, B:109:0x0749, B:111:0x074f, B:112:0x077e, B:19:0x0156, B:21:0x015c, B:22:0x0184, B:24:0x02bd, B:26:0x02ef, B:27:0x0343), top: B:826:0x0156 }] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x1674  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x16d3 A[Catch: all -> 0x1a3e, TRY_ENTER, TRY_LEAVE, TryCatch #23 {all -> 0x1a3e, blocks: (B:382:0x1614, B:388:0x1667, B:425:0x18f5, B:426:0x18f9, B:428:0x18ff, B:431:0x1919, B:397:0x16d3, B:415:0x17d5, B:418:0x1823, B:421:0x1892, B:424:0x18ef), top: B:816:0x1614 }] */
    /* JADX WARN: Removed duplicated region for block: B:428:0x18ff A[Catch: all -> 0x1a3e, TryCatch #23 {all -> 0x1a3e, blocks: (B:382:0x1614, B:388:0x1667, B:425:0x18f5, B:426:0x18f9, B:428:0x18ff, B:431:0x1919, B:397:0x16d3, B:415:0x17d5, B:418:0x1823, B:421:0x1892, B:424:0x18ef), top: B:816:0x1614 }] */
    /* JADX WARN: Removed duplicated region for block: B:482:0x1ad6 A[Catch: all -> 0x0349, TryCatch #28 {all -> 0x0349, blocks: (B:375:0x155f, B:377:0x1565, B:378:0x1590, B:480:0x1ad0, B:482:0x1ad6, B:483:0x1b03, B:677:0x2c97, B:679:0x2c9d, B:680:0x2cc7, B:713:0x2fdf, B:715:0x2fe5, B:716:0x300e, B:693:0x2e12, B:695:0x2e35, B:696:0x2e8d, B:643:0x295f, B:645:0x2965, B:646:0x298d, B:736:0x30f2, B:738:0x30f8, B:739:0x3122, B:741:0x315c, B:742:0x31a4, B:528:0x210b, B:530:0x2120, B:531:0x214d, B:533:0x2181, B:534:0x21fb, B:754:0x3262, B:756:0x3268, B:757:0x3294, B:759:0x32ce, B:760:0x3315, B:496:0x1cdd, B:498:0x1cf2, B:499:0x1d24, B:241:0x0ea0, B:243:0x0ea6, B:244:0x0ed7, B:196:0x0c7f, B:198:0x0c85, B:199:0x0cb1, B:109:0x0749, B:111:0x074f, B:112:0x077e, B:19:0x0156, B:21:0x015c, B:22:0x0184, B:24:0x02bd, B:26:0x02ef, B:27:0x0343), top: B:826:0x0156 }] */
    /* JADX WARN: Removed duplicated region for block: B:488:0x1b8b  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x1bd9  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x1cbe  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x1e55  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x2a15  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x2a5a  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x2ab5  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x2c77  */
    /* JADX WARN: Removed duplicated region for block: B:685:0x2d56  */
    /* JADX WARN: Removed duplicated region for block: B:688:0x2d9f  */
    /* JADX WARN: Removed duplicated region for block: B:692:0x2df4  */
    /* JADX WARN: Removed duplicated region for block: B:712:0x2fc1  */
    /* JADX WARN: Removed duplicated region for block: B:747:0x3220  */
    /* JADX WARN: Removed duplicated region for block: B:776:0x0fd5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:829:0x0d36 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:839:0x161a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:896:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v101 */
    /* JADX WARN: Type inference failed for: r11v102 */
    /* JADX WARN: Type inference failed for: r11v103 */
    /* JADX WARN: Type inference failed for: r11v111 */
    /* JADX WARN: Type inference failed for: r11v112 */
    /* JADX WARN: Type inference failed for: r11v114 */
    /* JADX WARN: Type inference failed for: r11v115 */
    /* JADX WARN: Type inference failed for: r11v116 */
    /* JADX WARN: Type inference failed for: r11v117 */
    /* JADX WARN: Type inference failed for: r11v118 */
    /* JADX WARN: Type inference failed for: r11v119 */
    /* JADX WARN: Type inference failed for: r11v120 */
    /* JADX WARN: Type inference failed for: r11v121 */
    /* JADX WARN: Type inference failed for: r11v122 */
    /* JADX WARN: Type inference failed for: r11v123 */
    /* JADX WARN: Type inference failed for: r11v124 */
    /* JADX WARN: Type inference failed for: r11v125 */
    /* JADX WARN: Type inference failed for: r11v126 */
    /* JADX WARN: Type inference failed for: r11v128 */
    /* JADX WARN: Type inference failed for: r11v129 */
    /* JADX WARN: Type inference failed for: r11v130 */
    /* JADX WARN: Type inference failed for: r11v131 */
    /* JADX WARN: Type inference failed for: r11v132 */
    /* JADX WARN: Type inference failed for: r11v133 */
    /* JADX WARN: Type inference failed for: r11v134 */
    /* JADX WARN: Type inference failed for: r11v135 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v46 */
    /* JADX WARN: Type inference failed for: r11v47 */
    /* JADX WARN: Type inference failed for: r11v48 */
    /* JADX WARN: Type inference failed for: r11v49 */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r11v61 */
    /* JADX WARN: Type inference failed for: r11v62 */
    /* JADX WARN: Type inference failed for: r11v63 */
    /* JADX WARN: Type inference failed for: r11v64 */
    /* JADX WARN: Type inference failed for: r11v67, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v70 */
    /* JADX WARN: Type inference failed for: r11v74 */
    /* JADX WARN: Type inference failed for: r11v75 */
    /* JADX WARN: Type inference failed for: r11v76 */
    /* JADX WARN: Type inference failed for: r11v77 */
    /* JADX WARN: Type inference failed for: r11v80 */
    /* JADX WARN: Type inference failed for: r11v85 */
    /* JADX WARN: Type inference failed for: r11v90 */
    /* JADX WARN: Type inference failed for: r11v91 */
    /* JADX WARN: Type inference failed for: r11v95, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v98 */
    /* JADX WARN: Type inference failed for: r11v99 */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r34v1 */
    /* JADX WARN: Type inference failed for: r34v2 */
    /* JADX WARN: Type inference failed for: r34v3 */
    /* JADX WARN: Type inference failed for: r34v7 */
    /* JADX WARN: Type inference failed for: r34v8 */
    /* JADX WARN: Type inference failed for: r34v9 */
    /* JADX WARN: Type inference failed for: r4v430 */
    /* JADX WARN: Type inference failed for: r4v500 */
    /* JADX WARN: Type inference failed for: r7v252 */
    /* JADX WARN: Type inference failed for: r7v253 */
    /* JADX WARN: Type inference failed for: r7v266 */
    /* JADX WARN: Type inference failed for: r7v267 */
    /* JADX WARN: Type inference failed for: r7v270 */
    /* JADX WARN: Type inference failed for: r7v277 */
    /* JADX WARN: Type inference failed for: r7v278 */
    /* JADX WARN: Type inference failed for: r7v279 */
    /* JADX WARN: Type inference failed for: r7v280 */
    /* JADX WARN: Type inference failed for: r7v292 */
    /* JADX WARN: Type inference failed for: r7v297 */
    /* JADX WARN: Type inference failed for: r7v303 */
    /* JADX WARN: Type inference failed for: r7v305, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v308 */
    /* JADX WARN: Type inference failed for: r7v309 */
    /* JADX WARN: Type inference failed for: r7v310 */
    /* JADX WARN: Type inference failed for: r7v314 */
    /* JADX WARN: Type inference failed for: r7v386 */
    /* JADX WARN: Type inference failed for: r7v387 */
    /* JADX WARN: Type inference failed for: r7v388 */
    /* JADX WARN: Type inference failed for: r7v389 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v49 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 13611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.PaymentTranslucentActivity.attachBaseContext(android.content.Context):void");
    }

    @Override
    protected int getLayoutId() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 21;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 31;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override
    public void setBackgroundDrawable() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 99;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 75;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
    }

    static {
        ArtificialStackFrames = 0;
        copydefault();
        component1 = (char) 36076;
        component3 = (char) 28543;
        component2 = (char) 46762;
        ShareDataUIState = (char) 6595;
        int i = getSponsorBeneficiariesState + 83;
        ArtificialStackFrames = i % 128;
        if (i % 2 != 0) {
            int i2 = 26 / 0;
        }
    }

    static void copydefault() {
        copydefault = new char[]{30309, 30296, 30310, 30292, 30299, 30301, 30232, 30295, 30330, 30311, 30305, 30297, 30285, 30321, 30289, 30294, 30213, 30298, 30302, 30221, 30229, 30304, 30224, 30227, 30234, 30231, 30308, 30225, 30230, 30226, 30228, 30306, 30220, 30235, 30307, 30293, 30288, 30300, 30327, 30215, 30303};
        copy = 321287882;
        getRequestBeneficiariesState = true;
        equals = true;
        component4 = new char[]{33517, 33469, 33464, 33462, 33460, 33455, 33459, 33465, 33430, 33432, 33463, 33455, 33424, 33512, 33421, 33460, 33457, 33456, 33456, 33457, 33449, 33465, 33409, 33458, 33460, 33468, 33510, 33414, 33412, 33408, 33409, 33413, 33436, 33435, 33436, 33434, 33411, 33452, 33451, 33409, 33436, 33437, 33412, 33452, 33451, 33411, 33434, 33436, 33435, 33432, 33432, 33434, 33411, 33410, 33435, 33412, 33412, 33436, 33411, 33412, 33436, 33411, 33414, 33439, 33413, 33409, 33409, 33409, 33433, 33432, 33431, 33436, 33435, 33434, 33413, 33413, 33435, 33410, 33409, 33434, 33439, 33439, 33414, 33454, 33452, 33409, 33434, 33435, 33434, 33435, 33468, 33393, 33393, 33391, 33351, 33351, 33350, 33394, 33395, 33352, 33354, 33395, 33395, 33396, 33394, 33352, 33354, 33395, 33393, 33356, 33359, 33357, 33353, 33353, 33359, 33357, 33353, 33352, 33352, 33356, 33398, 33395, 33355, 33396, 33398, 33356, 33463, 33298, 33300, 33295, 33287, 33290, 33290, 33282, 33304, 33380, 33294, 33291, 33379, 33311, 33295, 33300, 33510, 33454, 33463, 33465, 33463, 33466, 33462, 33460, 33457, 33455, 33465, 33468, 33412, 33412, 33467, 33462, 33289, 33287, 33290, 33291, 33288, 33285, 33286, 33288, 33288, 33464, 33298, 33297, 33294, 33294, 33296, 33298, 33299, 33298, 33298, 33297};
    }
}
