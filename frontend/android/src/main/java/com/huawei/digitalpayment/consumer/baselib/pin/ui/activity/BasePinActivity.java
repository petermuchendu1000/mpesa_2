package com.huawei.digitalpayment.consumer.baselib.pin.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.biometric.constants.BiometricConstants;
import com.huawei.biometric.service.IBiometricService;
import com.huawei.biometric.util.BiometricHelper2;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.baselib.PaymentBaseActivity;
import com.huawei.digitalpayment.consumer.baselib.R;
import com.huawei.digitalpayment.consumer.baselib.pin.model.PinType;
import com.huawei.digitalpayment.consumer.baselib.util.PayPriorityUtils;
import com.huawei.digitalpayment.consumer.baselib.widget.code.CodeEditText;
import com.huawei.digitalpayment.consumer.baselib.widget.code.SafeInputKeyboard;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getActiveNotifications;
import kotlin.getSmallIconId;
import kotlin.io.encoding.Base64;

public abstract class BasePinActivity<Binding extends ViewDataBinding, VM extends ViewModel> extends PaymentBaseActivity<Binding, VM> {
    private static int ArtificialStackFrames;
    private static byte[] ShareDataUIState;
    private static int component1;
    private static int component2;
    private static short[] component3;
    private static int[] component4;
    private static int copydefault;
    private static char equals;
    private static int getAsAtTimestamp;
    private static long getRequestBeneficiariesState;
    private LoadingButton btnContinue;
    private CodeEditText etCode;
    private boolean isCreated = false;
    private boolean isSupportBiometric;
    private SafeInputKeyboard pinInputKeyboard;
    private TextView tvDescription;
    private TextView tvError;
    private TextView tvForgot;
    private TextView tvTitle;
    private static final byte[] $$D = {126, 1, Ascii.SUB, -71};
    private static final int $$E = 255;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$B = {108, -1, -36, 99, -11, -12, 1, -4, -12, -17, 67, -60, -19, -10, -4, -13, -6, 4, -12, 2, -21, 62, -61, -8, -4, -26, 7, TarHeader.LF_SYMLINK, -66, -12, -13, 8, -20, -3, 6, -18, TarHeader.LF_CONTIG, -29, -40, -4, -26, 7, Ascii.GS, -51, -10, -4, -13, -6, 4, -12, 2, Ascii.NAK, -44, 1, -16, Ascii.US, -43, -10, -3, 65, -54, -28, 0, -24, 6, Ascii.SUB, -36, -26, Ascii.FF, 5, 5, -17, -40, Ascii.FF, -26, 8, -19, -5, -10, -6, -6, 2, -16, -13, 59, -19, -5, -10, -6, -6, 2, -16, -13, 58, -19, -8, -16, Ascii.SO, -8, -8, -2, -27, 2, -15};
    private static final int $$C = 129;
    private static final byte[] $$j = {2, 77, TarHeader.LF_CONTIG, -86, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -12, Ascii.FF, -19, -15, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 57, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$k = 82;
    private static int toString = 0;
    private static int copy = 0;
    private static int getSponsorBeneficiariesState = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$F(byte r6, byte r7, int r8) {
        /*
            int r6 = r6 * 2
            int r6 = 1 - r6
            int r8 = r8 * 4
            int r8 = 4 - r8
            int r7 = r7 + 98
            byte[] r0 = com.huawei.digitalpayment.consumer.baselib.pin.ui.activity.BasePinActivity.$$D
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r7 = -r7
            int r3 = r3 + 1
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.pin.ui.activity.BasePinActivity.$$F(byte, byte, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void q(byte r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r0 = r7 + 4
            byte[] r1 = com.huawei.digitalpayment.consumer.baselib.pin.ui.activity.BasePinActivity.$$j
            int r6 = r6 + 4
            int r5 = r5 * 2
            int r5 = 103 - r5
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L24:
            int r6 = r6 + 1
            r3 = r1[r6]
        L28:
            int r3 = -r3
            int r5 = r5 + r3
            int r5 = r5 + (-8)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.pin.ui.activity.BasePinActivity.q(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void r(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 9
            int r6 = 94 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.baselib.pin.ui.activity.BasePinActivity.$$B
            int r1 = 73 - r7
            int r8 = r8 * 8
            int r8 = 107 - r8
            byte[] r1 = new byte[r1]
            int r7 = 72 - r7
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-7)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.pin.ui.activity.BasePinActivity.r(short, byte, short, java.lang.Object[]):void");
    }

    protected abstract PinType getPinType();

    protected abstract void onConfirmClick(String str);

    private static void k(char c2, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
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
            int i4 = $11 + 117;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int iRed = 4037 - Color.red(0);
                    int i6 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31;
                    char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 19181);
                    byte b2 = $$D[1];
                    byte b3 = (byte) (b2 - 1);
                    byte b4 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iRed, i6, packedPositionType, 1912513118, false, $$F(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7567, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 2006389106, false, "e", new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                        if (objCopydefault3 == null) {
                            byte b5 = (byte) ($$D[1] - 1);
                            byte b6 = b5;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2459 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 28 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 931716605, false, $$F(b5, b6, b6), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                            if (objCopydefault4 == null) {
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 7567, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 12, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = iNotificationSideChannel.component3;
                            cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (getRequestBeneficiariesState ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) getAsAtTimestamp) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) equals) ^ (-3780477796495014671L)))));
                            iNotificationSideChannel.copydefault++;
                            int i7 = $10 + 13;
                            $11 = i7 % 128;
                            int i8 = i7 % 2;
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
        objArr[0] = new String(cArr6);
    }

    private static void p(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = component4;
        int i3 = 684241640;
        long j = 0;
        int i4 = 0;
        int i5 = 1;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = $10 + 101;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i3);
                    if (objCopydefault == null) {
                        int i9 = 4390 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1));
                        int iMakeMeasureSpec = 37 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                        byte b2 = $$D[1];
                        byte b3 = (byte) (b2 - 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i9, iMakeMeasureSpec, offsetAfter, -309236339, false, $$F(b3, (byte) (b3 | 8), (byte) (b2 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i8++;
                    i3 = 684241640;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i10 = $11 + 119;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = component4;
        int i12 = 16;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i13 = 0;
            while (i13 < length3) {
                int i14 = $11 + 49;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                try {
                    Object[] objArr3 = new Object[i5];
                    objArr3[i4] = Integer.valueOf(iArr5[i13]);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault2 == null) {
                        int scrollDefaultDelay = 4391 - (ViewConfiguration.getScrollDefaultDelay() >> i12);
                        int packedPositionType = 37 - ExpandableListView.getPackedPositionType(0L);
                        char c2 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        byte b4 = $$D[i5];
                        byte b5 = (byte) (b4 - 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(scrollDefaultDelay, packedPositionType, c2, -309236339, false, $$F(b5, (byte) (b5 | 8), (byte) (b4 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i13] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    i13++;
                    i12 = 16;
                    i4 = 0;
                    i5 = 1;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr5 = iArr6;
        }
        int i16 = i4;
        System.arraycopy(iArr5, i16, iArr4, i16, length2);
        getactivenotifications.component1 = i16;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[i16] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr4);
            int i17 = 0;
            for (int i18 = 16; i17 < i18; i18 = 16) {
                getactivenotifications.ShareDataUIState ^= iArr4[i17];
                Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault3 == null) {
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 2968;
                    int threadPriority = 16 - ((Process.getThreadPriority(0) + 20) >> 6);
                    char threadPriority2 = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 49871);
                    byte b6 = $$D[1];
                    byte b7 = (byte) (b6 - 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iNormalizeMetaState, threadPriority, threadPriority2, 462826032, false, $$F(b7, (byte) (b7 | 6), (byte) (b6 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i17++;
            }
            int i19 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i19;
            getactivenotifications.component2 ^= iArr4[16];
            getactivenotifications.ShareDataUIState ^= iArr4[17];
            int i20 = getactivenotifications.ShareDataUIState;
            int i21 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr4);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr5 = {getactivenotifications, getactivenotifications};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault4 == null) {
                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 2944;
                int iRed = 24 - Color.red(0);
                char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 27637);
                byte b8 = $$D[1];
                byte b9 = (byte) (b8 - 1);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(scrollBarSize, iRed, windowTouchSlop, -1616366948, false, $$F(b9, (byte) (b9 | 9), (byte) (b8 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
            i16 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void s(short s, int i, byte b2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        int i5;
        boolean z;
        int i6;
        int i7 = 2;
        int i8 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(component2)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                int modifierMetaStateMask = 998 - ((byte) KeyEvent.getModifierMetaStateMask());
                int offsetAfter = 31 - TextUtils.getOffsetAfter("", 0);
                char c2 = (char) (61686 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                byte b3 = $$D[1];
                byte b4 = (byte) (b3 - 1);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(modifierMetaStateMask, offsetAfter, c2, 1874745193, false, $$F(b4, (byte) (b4 | Ascii.SI), (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i9 = $10;
                int i10 = i9 + 93;
                $11 = i10 % 128;
                i4 = i10 % 2 == 0 ? 0 : 1;
                int i11 = i9 + 97;
                $11 = i11 % 128;
                int i12 = i11 % 2;
            } else {
                i4 = 0;
            }
            if (i4 == 0) {
                j = 7083766810336261929L;
            } else {
                byte[] bArr = ShareDataUIState;
                if (bArr != null) {
                    int i13 = $11 + 11;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i15 = 0;
                    while (i15 < length) {
                        int i16 = $10 + 23;
                        $11 = i16 % 128;
                        if (i16 % i7 == 0) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr[i15])};
                                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                                if (objCopydefault2 == null) {
                                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 2984;
                                    int threadPriority = 48 - ((Process.getThreadPriority(0) + 20) >> 6);
                                    char scrollBarFadeDuration = (char) (54462 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                    byte b5 = $$D[1];
                                    byte b6 = (byte) (b5 - 1);
                                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iResolveSizeAndState, threadPriority, scrollBarFadeDuration, -1178636483, false, $$F(b6, (byte) (b6 | Ascii.DC2), (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                                }
                                bArr2[i15] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                                i15 <<= 1;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i15])};
                            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault3 == null) {
                                int mirror = 3032 - AndroidCharacter.getMirror('0');
                                int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 48;
                                char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 54462);
                                byte b7 = $$D[1];
                                byte b8 = (byte) (b7 - 1);
                                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(mirror, iResolveSizeAndState2, keyRepeatDelay, -1178636483, false, $$F(b8, (byte) (b8 | Ascii.DC2), (byte) (b7 - 1)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i15] = ((Byte) ((Method) objCopydefault3).invoke(null, objArr4)).byteValue();
                            i15++;
                        }
                        i7 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = ShareDataUIState;
                    Object[] objArr5 = {Integer.valueOf(i2), Integer.valueOf(component1)};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault4 == null) {
                        int iRed = Color.red(0) + 999;
                        int deadChar = KeyEvent.getDeadChar(0, 0) + 31;
                        char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 61685);
                        byte b9 = $$D[1];
                        byte b10 = (byte) (b9 - 1);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iRed, deadChar, windowTouchSlop, 1874745193, false, $$F(b10, (byte) (b10 | Ascii.SI), (byte) (b9 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) component2) ^ 7083766810336261929L)));
                    j = 7083766810336261929L;
                } else {
                    j = 7083766810336261929L;
                    iIntValue = (short) (((short) (((long) component3[i2 + ((int) (((long) component1) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) component2) ^ 7083766810336261929L)));
                }
            }
            if (iIntValue > 0) {
                getsmalliconid.copydefault = ((i2 + iIntValue) - 2) + ((int) (((long) component1) ^ j)) + i4;
                Object[] objArr6 = {getsmalliconid, Integer.valueOf(i), Integer.valueOf(copydefault), sb};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault5 == null) {
                    int i17 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1697;
                    int mirror2 = 'U' - AndroidCharacter.getMirror('0');
                    char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                    byte b11 = $$D[1];
                    byte b12 = (byte) (b11 - 1);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i17, mirror2, packedPositionGroup, -1454191902, false, $$F(b12, (byte) (b12 | Ascii.SO), (byte) (b11 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault5).invoke(null, objArr6)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = ShareDataUIState;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i18 = 0; i18 < length2; i18++) {
                        int i19 = $11 + 49;
                        $10 = i19 % 128;
                        int i20 = i19 % 2;
                        bArr5[i18] = (byte) (((long) bArr4[i18]) ^ 7083766810336261929L);
                    }
                    int i21 = $10 + 19;
                    $11 = i21 % 128;
                    i5 = 2;
                    int i22 = i21 % 2;
                    bArr4 = bArr5;
                } else {
                    i5 = 2;
                }
                if (bArr4 != null) {
                    int i23 = $10 + 47;
                    $11 = i23 % 128;
                    int i24 = i23 % i5;
                    z = true;
                } else {
                    z = false;
                }
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    if (z) {
                        int i25 = $11 + 15;
                        $10 = i25 % 128;
                        if (i25 % 2 != 0) {
                            byte[] bArr6 = ShareDataUIState;
                            getsmalliconid.copydefault = getsmalliconid.copydefault % 0;
                            i6 = getsmalliconid.component3 / (((byte) (((byte) (((long) bArr6[r8]) | 7083766810336261929L)) * s)) ^ b2);
                        } else {
                            byte[] bArr7 = ShareDataUIState;
                            getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                            i6 = getsmalliconid.component3 + (((byte) (((byte) (((long) bArr7[r8]) ^ 7083766810336261929L)) + s)) ^ b2);
                        }
                        getsmalliconid.component1 = (char) i6;
                    } else {
                        short[] sArr = component3;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                    }
                    sb.append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    getsmalliconid.component2++;
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x018a  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r37) {
        /*
            Method dump skipped, instruction units count: 2646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.pin.ui.activity.BasePinActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void initEvents() {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            com.huawei.common.widget.LoadingButton r1 = r3.btnContinue
            com.huawei.digitalpayment.consumer.baselib.pin.ui.activity.BasePinActivity$1 r2 = new com.huawei.digitalpayment.consumer.baselib.pin.ui.activity.BasePinActivity$1
            r2.<init>()
            r1.setOnClickListener(r2)
            android.widget.TextView r1 = r3.tvForgot
            com.huawei.digitalpayment.consumer.baselib.pin.ui.activity.BasePinActivity$3 r2 = new com.huawei.digitalpayment.consumer.baselib.pin.ui.activity.BasePinActivity$3
            r2.<init>()
            r1.setOnClickListener(r2)
            com.huawei.digitalpayment.consumer.baselib.widget.code.SafeInputKeyboard r1 = r3.pinInputKeyboard
            com.huawei.digitalpayment.consumer.baselib.pin.ui.activity.BasePinActivity$2 r2 = new com.huawei.digitalpayment.consumer.baselib.pin.ui.activity.BasePinActivity$2
            r2.<init>()
            r1.setOnInputListener(r2)
            com.huawei.digitalpayment.consumer.baselib.widget.code.CodeEditText r1 = r3.etCode
            com.huawei.digitalpayment.consumer.baselib.pin.ui.activity.BasePinActivity$4 r2 = new com.huawei.digitalpayment.consumer.baselib.pin.ui.activity.BasePinActivity$4
            r2.<init>()
            r1.addTextChangedListener(r2)
            boolean r1 = r3.showBiometric()
            if (r1 != 0) goto L46
            int r1 = com.huawei.digitalpayment.consumer.baselib.pin.ui.activity.BasePinActivity.getSponsorBeneficiariesState
            int r1 = r1 + 19
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.pin.ui.activity.BasePinActivity.copy = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L41
            boolean r1 = r3.isSupportBiometric
            if (r1 == 0) goto L4b
            goto L46
        L41:
            r0 = 0
            r0.hashCode()
            throw r0
        L46:
            com.huawei.digitalpayment.consumer.baselib.widget.code.SafeInputKeyboard r1 = r3.pinInputKeyboard
            r1.showBiometric()
        L4b:
            int r1 = com.huawei.digitalpayment.consumer.baselib.pin.ui.activity.BasePinActivity.copy
            int r1 = r1 + 63
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.pin.ui.activity.BasePinActivity.getSponsorBeneficiariesState = r2
            int r1 = r1 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.pin.ui.activity.BasePinActivity.initEvents():void");
    }

    private void initViews() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 125;
        copy = i2 % 128;
        int i3 = i2 % 2;
        this.tvTitle = (TextView) findViewById(R.id.tvTitle);
        this.tvDescription = (TextView) findViewById(R.id.tvDescription);
        this.btnContinue = (LoadingButton) findViewById(R.id.btnContinue);
        this.tvForgot = (TextView) findViewById(R.id.tvForgot);
        this.pinInputKeyboard = (SafeInputKeyboard) findViewById(R.id.pin_input_keyboard);
        this.etCode = (CodeEditText) findViewById(R.id.etCode);
        this.tvError = (TextView) findViewById(R.id.tvError);
        this.tvTitle.setText(getPinType().getTitle());
        this.tvDescription.setText(getPinType().getDescription());
        this.btnContinue.setText(getPinType().getButtonText());
        this.tvForgot.setText(getPinType().getButtonForgotPIN());
        if (!TextUtils.isEmpty(getPinType().getButtonForgotPIN())) {
            this.tvForgot.setVisibility(0);
            return;
        }
        this.tvForgot.setVisibility(8);
        int i4 = getSponsorBeneficiariesState + 63;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 67;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            super.onStart();
            this.etCode.setText("");
            int i3 = copy + 71;
            getSponsorBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super.onStart();
        this.etCode.setText("");
        throw null;
    }

    @Override
    public void onResume() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = copy + 13;
            getSponsorBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            p((KeyEvent.getMaxKeyCode() >> 16) + 26, new int[]{433982401, -645640498, 740248560, -383812119, 2145610644, -834679379, -896359521, 370179255, -1934957645, -367434246, 113536293, 940083651, 140740428, 1156994863}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            p(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952810_res_0x7f1304aa).substring(9, 10).codePointAt(0) - 14, new int[]{-323892816, 1744744548, 2005605079, 783358908, 290486030, 1988337784, 1689908511, -715482048, -623769024, 42920410}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = getSponsorBeneficiariesState + 69;
            copy = i4 % 128;
            int i5 = i4 % 2;
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i6 = copy + 57;
                getSponsorBeneficiariesState = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        if (baseContext != null) {
            int i8 = getSponsorBeneficiariesState + 95;
            copy = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getPressedStateDuration() >> 16), ExpandableListView.getPackedPositionChild(0L) + 43, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 6562, Color.blue(0) + 56, (char) TextUtils.indexOf("", "", 0), -699576857, false, "component2", new Class[]{Context.class});
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
        if (showBiometric() || this.isSupportBiometric) {
            ((IBiometricService) RouteUtils.getService(IBiometricService.class)).checkBiometricChange(this, new ApiCallback<Boolean>() {
                private static int ShareDataUIState = 1;
                private static int component3;

                @Override
                public void onSuccess(Boolean bool) {
                    int i10 = 2 % 2;
                    int i11 = component3 + 73;
                    ShareDataUIState = i11 % 128;
                    int i12 = i11 % 2;
                    component2(bool);
                    int i13 = component3 + 59;
                    ShareDataUIState = i13 % 128;
                    int i14 = i13 % 2;
                }

                public void component2(Boolean bool) {
                    int i10 = 2 % 2;
                    int i11 = component3 + 87;
                    ShareDataUIState = i11 % 128;
                    int i12 = i11 % 2;
                    if (bool.booleanValue()) {
                        int i13 = component3 + 35;
                        ShareDataUIState = i13 % 128;
                        if (i13 % 2 != 0) {
                            BasePinActivity.m10237$$Nest$fgetpinInputKeyboard(BasePinActivity.this).showBiometric();
                            return;
                        } else {
                            BasePinActivity.m10237$$Nest$fgetpinInputKeyboard(BasePinActivity.this).showBiometric();
                            throw null;
                        }
                    }
                    if (BasePinActivity.m10235$$Nest$fgetisCreated(BasePinActivity.this)) {
                        int i14 = ShareDataUIState + 19;
                        component3 = i14 % 128;
                        if (i14 % 2 != 0) {
                            throw null;
                        }
                        return;
                    }
                    BasePinActivity.m10239$$Nest$fputisCreated(BasePinActivity.this, true);
                    if (!BasePinActivity.this.showBiometric()) {
                        int i15 = component3 + 109;
                        ShareDataUIState = i15 % 128;
                        if (i15 % 2 == 0) {
                            BasePinActivity.m10236$$Nest$fgetisSupportBiometric(BasePinActivity.this);
                            throw null;
                        }
                        if (!BasePinActivity.m10236$$Nest$fgetisSupportBiometric(BasePinActivity.this)) {
                            return;
                        }
                    }
                    BasePinActivity.m10240$$Nest$mshowPriority(BasePinActivity.this);
                }
            });
        }
    }

    private void showPriority() {
        int i = 2 % 2;
        for (String str : PayPriorityUtils.getPayPriorityList()) {
            int i2 = copy + 73;
            getSponsorBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            if (str.equals("0") && BiometricHelper2.getInstance().isOpenFaceIdPay()) {
                this.pinInputKeyboard.showBiometric(true);
                return;
            }
            if (str.equals("1") && BiometricHelper2.getInstance().isOpenFingerprintPay()) {
                this.pinInputKeyboard.showBiometric(false);
                return;
            }
            if (str.equals("2")) {
                return;
            }
            if (str.equals("4")) {
                int i4 = getSponsorBeneficiariesState + 81;
                copy = i4 % 128;
                int i5 = i4 % 2;
                showLastPay();
                int i6 = getSponsorBeneficiariesState + 121;
                copy = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
        }
    }

    private void showLastPay() {
        int i = 2 % 2;
        int i2 = SPUtils.getInstance("sp_name_checkout").getInt("key_current_pay_way" + getExtraKey(), 0);
        if (i2 == 1 && BiometricHelper2.getInstance().isOpenFaceIdPay()) {
            int i3 = copy + 39;
            getSponsorBeneficiariesState = i3 % 128;
            if (i3 % 2 == 0) {
                this.pinInputKeyboard.showBiometric(false);
            } else {
                this.pinInputKeyboard.showBiometric(true);
            }
        }
        if (i2 == 2 && BiometricHelper2.getInstance().isOpenFingerprintPay()) {
            this.pinInputKeyboard.showBiometric(false);
        }
        int i4 = getSponsorBeneficiariesState + 17;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static String getExtraKey() {
        int i = 2 % 2;
        String str = "_" + SPUtils.getInstance().getString(BiometricConstants.CURRENT_ACCOUNT);
        int i2 = copy + 101;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 8 / 0;
        }
        return str;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = copy + 79;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_base_pin;
        if (i3 == 0) {
            int i5 = 35 / 0;
        }
        return i4;
    }

    @Override
    public boolean isShouldHideKeyboard(MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 89;
        copy = i2 % 128;
        int i3 = i2 % 2;
        boolean zPositionInView = positionInView(this.etCode, motionEvent);
        return i3 != 0 ? zPositionInView : !zPositionInView;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.pin.ui.activity.BasePinActivity.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(39:976|92|93|970|94|(0)(0)|(9:968|102|103|960|(0)(0)|150|(1:151)|1021|188)|224|980|225|(0)|231|232|965|(0)(0)|278|(1:279)|1030|312|346|1011|347|(0)|354|355|(0)(0)|363|384|(0)|428|999|429|(0)(0)|568|(0)|571|(0)(0)|595|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x10e0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1009:0x16c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:1044:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x07ba A[Catch: all -> 0x0b62, TRY_ENTER, TRY_LEAVE, TryCatch #47 {all -> 0x0b62, blocks: (B:102:0x0750, B:111:0x07ba), top: B:968:0x0750 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x09f1  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0bd1 A[Catch: all -> 0x04ab, TryCatch #4 {all -> 0x04ab, blocks: (B:218:0x0bcb, B:220:0x0bd1, B:221:0x0c02, B:339:0x1178, B:341:0x117e, B:343:0x11ae, B:422:0x160f, B:424:0x1615, B:425:0x1647, B:562:0x1d10, B:564:0x1d16, B:565:0x1d40, B:797:0x32e5, B:799:0x32eb, B:800:0x3316, B:834:0x3628, B:836:0x362e, B:837:0x364e, B:814:0x3462, B:816:0x3485, B:817:0x34dc, B:763:0x2d81, B:765:0x2d87, B:766:0x2dad, B:642:0x265d, B:644:0x2663, B:645:0x2693, B:647:0x26cd, B:648:0x271a, B:612:0x2305, B:614:0x231a, B:615:0x234c, B:617:0x2380, B:618:0x23fa, B:859:0x3729, B:861:0x372f, B:862:0x3758, B:864:0x3792, B:865:0x37d7, B:578:0x1ef9, B:580:0x1f0e, B:581:0x1f3e, B:87:0x064e, B:89:0x0654, B:90:0x067d, B:23:0x0290, B:25:0x0296, B:26:0x02c4, B:28:0x0418, B:30:0x044a, B:31:0x04a5), top: B:887:0x0290 }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0ce4  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0d48 A[Catch: all -> 0x10e9, TRY_ENTER, TRY_LEAVE, TryCatch #53 {all -> 0x10e9, blocks: (B:225:0x0c84, B:231:0x0cd7, B:240:0x0d48), top: B:980:0x0c84 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0f87 A[Catch: all -> 0x10bd, TryCatch #15 {all -> 0x10bd, blocks: (B:278:0x0f7d, B:279:0x0f81, B:281:0x0f87, B:284:0x0fa3, B:269:0x0eb7, B:274:0x0f1d, B:277:0x0f75), top: B:908:0x0eb7 }] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x117e A[Catch: all -> 0x04ab, TryCatch #4 {all -> 0x04ab, blocks: (B:218:0x0bcb, B:220:0x0bd1, B:221:0x0c02, B:339:0x1178, B:341:0x117e, B:343:0x11ae, B:422:0x160f, B:424:0x1615, B:425:0x1647, B:562:0x1d10, B:564:0x1d16, B:565:0x1d40, B:797:0x32e5, B:799:0x32eb, B:800:0x3316, B:834:0x3628, B:836:0x362e, B:837:0x364e, B:814:0x3462, B:816:0x3485, B:817:0x34dc, B:763:0x2d81, B:765:0x2d87, B:766:0x2dad, B:642:0x265d, B:644:0x2663, B:645:0x2693, B:647:0x26cd, B:648:0x271a, B:612:0x2305, B:614:0x231a, B:615:0x234c, B:617:0x2380, B:618:0x23fa, B:859:0x3729, B:861:0x372f, B:862:0x3758, B:864:0x3792, B:865:0x37d7, B:578:0x1ef9, B:580:0x1f0e, B:581:0x1f3e, B:87:0x064e, B:89:0x0654, B:90:0x067d, B:23:0x0290, B:25:0x0296, B:26:0x02c4, B:28:0x0418, B:30:0x044a, B:31:0x04a5), top: B:887:0x0290 }] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x11ad  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x1231  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x1286  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x12e5 A[Catch: all -> 0x1590, TRY_ENTER, TRY_LEAVE, TryCatch #70 {all -> 0x1590, blocks: (B:347:0x122b, B:354:0x1279, B:364:0x12e5), top: B:1011:0x122b }] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x1497  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x1615 A[Catch: all -> 0x04ab, TryCatch #4 {all -> 0x04ab, blocks: (B:218:0x0bcb, B:220:0x0bd1, B:221:0x0c02, B:339:0x1178, B:341:0x117e, B:343:0x11ae, B:422:0x160f, B:424:0x1615, B:425:0x1647, B:562:0x1d10, B:564:0x1d16, B:565:0x1d40, B:797:0x32e5, B:799:0x32eb, B:800:0x3316, B:834:0x3628, B:836:0x362e, B:837:0x364e, B:814:0x3462, B:816:0x3485, B:817:0x34dc, B:763:0x2d81, B:765:0x2d87, B:766:0x2dad, B:642:0x265d, B:644:0x2663, B:645:0x2693, B:647:0x26cd, B:648:0x271a, B:612:0x2305, B:614:0x231a, B:615:0x234c, B:617:0x2380, B:618:0x23fa, B:859:0x3729, B:861:0x372f, B:862:0x3758, B:864:0x3792, B:865:0x37d7, B:578:0x1ef9, B:580:0x1f0e, B:581:0x1f3e, B:87:0x064e, B:89:0x0654, B:90:0x067d, B:23:0x0290, B:25:0x0296, B:26:0x02c4, B:28:0x0418, B:30:0x044a, B:31:0x04a5), top: B:887:0x0290 }] */
    /* JADX WARN: Removed duplicated region for block: B:435:0x1718 A[Catch: all -> 0x1c83, PHI: r1 r33
  0x1718: PHI (r1v471 java.lang.Object) = (r1v465 java.lang.Object), (r1v470 java.lang.Object) binds: [B:430:0x16c7, B:431:0x16c9] A[DONT_GENERATE, DONT_INLINE]
  0x1718: PHI (r33v65 ??) = (r33v167 ??), (r33v168 ??) binds: [B:430:0x16c7, B:431:0x16c9] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #63 {all -> 0x1c83, blocks: (B:429:0x16c3, B:435:0x1718), top: B:999:0x16c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x173f  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x1795  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x17ab  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x1807  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x1b25 A[Catch: all -> 0x1c52, TryCatch #33 {all -> 0x1c52, blocks: (B:500:0x1b1b, B:501:0x1b1f, B:503:0x1b25, B:506:0x1b42, B:490:0x1a52, B:496:0x1ab6, B:499:0x1b13), top: B:942:0x1a52 }] */
    /* JADX WARN: Removed duplicated region for block: B:564:0x1d16 A[Catch: all -> 0x04ab, TryCatch #4 {all -> 0x04ab, blocks: (B:218:0x0bcb, B:220:0x0bd1, B:221:0x0c02, B:339:0x1178, B:341:0x117e, B:343:0x11ae, B:422:0x160f, B:424:0x1615, B:425:0x1647, B:562:0x1d10, B:564:0x1d16, B:565:0x1d40, B:797:0x32e5, B:799:0x32eb, B:800:0x3316, B:834:0x3628, B:836:0x362e, B:837:0x364e, B:814:0x3462, B:816:0x3485, B:817:0x34dc, B:763:0x2d81, B:765:0x2d87, B:766:0x2dad, B:642:0x265d, B:644:0x2663, B:645:0x2693, B:647:0x26cd, B:648:0x271a, B:612:0x2305, B:614:0x231a, B:615:0x234c, B:617:0x2380, B:618:0x23fa, B:859:0x3729, B:861:0x372f, B:862:0x3758, B:864:0x3792, B:865:0x37d7, B:578:0x1ef9, B:580:0x1f0e, B:581:0x1f3e, B:87:0x064e, B:89:0x0654, B:90:0x067d, B:23:0x0290, B:25:0x0296, B:26:0x02c4, B:28:0x0418, B:30:0x044a, B:31:0x04a5), top: B:887:0x0290 }] */
    /* JADX WARN: Removed duplicated region for block: B:570:0x1dc0  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x1e0c  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x1ed7  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x2080  */
    /* JADX WARN: Removed duplicated region for block: B:765:0x2d87 A[Catch: all -> 0x04ab, TryCatch #4 {all -> 0x04ab, blocks: (B:218:0x0bcb, B:220:0x0bd1, B:221:0x0c02, B:339:0x1178, B:341:0x117e, B:343:0x11ae, B:422:0x160f, B:424:0x1615, B:425:0x1647, B:562:0x1d10, B:564:0x1d16, B:565:0x1d40, B:797:0x32e5, B:799:0x32eb, B:800:0x3316, B:834:0x3628, B:836:0x362e, B:837:0x364e, B:814:0x3462, B:816:0x3485, B:817:0x34dc, B:763:0x2d81, B:765:0x2d87, B:766:0x2dad, B:642:0x265d, B:644:0x2663, B:645:0x2693, B:647:0x26cd, B:648:0x271a, B:612:0x2305, B:614:0x231a, B:615:0x234c, B:617:0x2380, B:618:0x23fa, B:859:0x3729, B:861:0x372f, B:862:0x3758, B:864:0x3792, B:865:0x37d7, B:578:0x1ef9, B:580:0x1f0e, B:581:0x1f3e, B:87:0x064e, B:89:0x0654, B:90:0x067d, B:23:0x0290, B:25:0x0296, B:26:0x02c4, B:28:0x0418, B:30:0x044a, B:31:0x04a5), top: B:887:0x0290 }] */
    /* JADX WARN: Removed duplicated region for block: B:771:0x2e3e  */
    /* JADX WARN: Removed duplicated region for block: B:774:0x2e93  */
    /* JADX WARN: Removed duplicated region for block: B:779:0x2ef3  */
    /* JADX WARN: Removed duplicated region for block: B:796:0x32c6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:805:0x339d  */
    /* JADX WARN: Removed duplicated region for block: B:808:0x33f1  */
    /* JADX WARN: Removed duplicated region for block: B:813:0x3444  */
    /* JADX WARN: Removed duplicated region for block: B:833:0x360a  */
    /* JADX WARN: Removed duplicated region for block: B:852:0x36ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0654 A[Catch: all -> 0x04ab, TryCatch #4 {all -> 0x04ab, blocks: (B:218:0x0bcb, B:220:0x0bd1, B:221:0x0c02, B:339:0x1178, B:341:0x117e, B:343:0x11ae, B:422:0x160f, B:424:0x1615, B:425:0x1647, B:562:0x1d10, B:564:0x1d16, B:565:0x1d40, B:797:0x32e5, B:799:0x32eb, B:800:0x3316, B:834:0x3628, B:836:0x362e, B:837:0x364e, B:814:0x3462, B:816:0x3485, B:817:0x34dc, B:763:0x2d81, B:765:0x2d87, B:766:0x2dad, B:642:0x265d, B:644:0x2663, B:645:0x2693, B:647:0x26cd, B:648:0x271a, B:612:0x2305, B:614:0x231a, B:615:0x234c, B:617:0x2380, B:618:0x23fa, B:859:0x3729, B:861:0x372f, B:862:0x3758, B:864:0x3792, B:865:0x37d7, B:578:0x1ef9, B:580:0x1f0e, B:581:0x1f3e, B:87:0x064e, B:89:0x0654, B:90:0x067d, B:23:0x0290, B:25:0x0296, B:26:0x02c4, B:28:0x0418, B:30:0x044a, B:31:0x04a5), top: B:887:0x0290 }] */
    /* JADX WARN: Removed duplicated region for block: B:933:0x0c8a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0703  */
    /* JADX WARN: Type inference failed for: r10v101 */
    /* JADX WARN: Type inference failed for: r10v105 */
    /* JADX WARN: Type inference failed for: r10v111 */
    /* JADX WARN: Type inference failed for: r10v113 */
    /* JADX WARN: Type inference failed for: r10v114, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v118 */
    /* JADX WARN: Type inference failed for: r10v119 */
    /* JADX WARN: Type inference failed for: r10v120 */
    /* JADX WARN: Type inference failed for: r10v121 */
    /* JADX WARN: Type inference failed for: r10v123 */
    /* JADX WARN: Type inference failed for: r10v264 */
    /* JADX WARN: Type inference failed for: r10v265 */
    /* JADX WARN: Type inference failed for: r10v266 */
    /* JADX WARN: Type inference failed for: r10v267 */
    /* JADX WARN: Type inference failed for: r10v268 */
    /* JADX WARN: Type inference failed for: r10v269 */
    /* JADX WARN: Type inference failed for: r10v270 */
    /* JADX WARN: Type inference failed for: r10v62 */
    /* JADX WARN: Type inference failed for: r10v63 */
    /* JADX WARN: Type inference failed for: r10v64, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v80 */
    /* JADX WARN: Type inference failed for: r10v81 */
    /* JADX WARN: Type inference failed for: r10v87 */
    /* JADX WARN: Type inference failed for: r10v88, types: [long] */
    /* JADX WARN: Type inference failed for: r10v89 */
    /* JADX WARN: Type inference failed for: r10v90 */
    /* JADX WARN: Type inference failed for: r12v109 */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r15v104 */
    /* JADX WARN: Type inference failed for: r15v106 */
    /* JADX WARN: Type inference failed for: r15v107 */
    /* JADX WARN: Type inference failed for: r15v108 */
    /* JADX WARN: Type inference failed for: r15v109 */
    /* JADX WARN: Type inference failed for: r15v110 */
    /* JADX WARN: Type inference failed for: r15v111 */
    /* JADX WARN: Type inference failed for: r15v112 */
    /* JADX WARN: Type inference failed for: r15v117 */
    /* JADX WARN: Type inference failed for: r15v118 */
    /* JADX WARN: Type inference failed for: r15v119 */
    /* JADX WARN: Type inference failed for: r15v120 */
    /* JADX WARN: Type inference failed for: r15v121 */
    /* JADX WARN: Type inference failed for: r15v122 */
    /* JADX WARN: Type inference failed for: r15v123 */
    /* JADX WARN: Type inference failed for: r15v124 */
    /* JADX WARN: Type inference failed for: r15v125 */
    /* JADX WARN: Type inference failed for: r15v126 */
    /* JADX WARN: Type inference failed for: r15v127 */
    /* JADX WARN: Type inference failed for: r15v128 */
    /* JADX WARN: Type inference failed for: r15v129 */
    /* JADX WARN: Type inference failed for: r15v130 */
    /* JADX WARN: Type inference failed for: r15v131 */
    /* JADX WARN: Type inference failed for: r15v132 */
    /* JADX WARN: Type inference failed for: r15v133 */
    /* JADX WARN: Type inference failed for: r15v134 */
    /* JADX WARN: Type inference failed for: r15v135 */
    /* JADX WARN: Type inference failed for: r15v136 */
    /* JADX WARN: Type inference failed for: r15v137 */
    /* JADX WARN: Type inference failed for: r15v138 */
    /* JADX WARN: Type inference failed for: r15v139 */
    /* JADX WARN: Type inference failed for: r15v140 */
    /* JADX WARN: Type inference failed for: r15v141 */
    /* JADX WARN: Type inference failed for: r15v142 */
    /* JADX WARN: Type inference failed for: r15v143 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v37, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r15v45, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v49 */
    /* JADX WARN: Type inference failed for: r15v50 */
    /* JADX WARN: Type inference failed for: r15v58 */
    /* JADX WARN: Type inference failed for: r15v59 */
    /* JADX WARN: Type inference failed for: r15v60 */
    /* JADX WARN: Type inference failed for: r15v61 */
    /* JADX WARN: Type inference failed for: r15v62 */
    /* JADX WARN: Type inference failed for: r15v63 */
    /* JADX WARN: Type inference failed for: r15v64 */
    /* JADX WARN: Type inference failed for: r15v66 */
    /* JADX WARN: Type inference failed for: r15v67 */
    /* JADX WARN: Type inference failed for: r15v68 */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r15v71 */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v73 */
    /* JADX WARN: Type inference failed for: r15v74 */
    /* JADX WARN: Type inference failed for: r15v75 */
    /* JADX WARN: Type inference failed for: r15v76 */
    /* JADX WARN: Type inference failed for: r15v77 */
    /* JADX WARN: Type inference failed for: r15v78 */
    /* JADX WARN: Type inference failed for: r15v79 */
    /* JADX WARN: Type inference failed for: r15v80 */
    /* JADX WARN: Type inference failed for: r15v82 */
    /* JADX WARN: Type inference failed for: r15v83 */
    /* JADX WARN: Type inference failed for: r15v84 */
    /* JADX WARN: Type inference failed for: r15v85 */
    /* JADX WARN: Type inference failed for: r15v86 */
    /* JADX WARN: Type inference failed for: r15v87 */
    /* JADX WARN: Type inference failed for: r15v88 */
    /* JADX WARN: Type inference failed for: r15v89 */
    /* JADX WARN: Type inference failed for: r15v90 */
    /* JADX WARN: Type inference failed for: r15v91 */
    /* JADX WARN: Type inference failed for: r15v92 */
    /* JADX WARN: Type inference failed for: r15v93 */
    /* JADX WARN: Type inference failed for: r15v94 */
    /* JADX WARN: Type inference failed for: r15v95 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v485 */
    /* JADX WARN: Type inference failed for: r2v486 */
    /* JADX WARN: Type inference failed for: r2v487 */
    /* JADX WARN: Type inference failed for: r2v502 */
    /* JADX WARN: Type inference failed for: r2v503 */
    /* JADX WARN: Type inference failed for: r2v507, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v508 */
    /* JADX WARN: Type inference failed for: r2v509 */
    /* JADX WARN: Type inference failed for: r2v511 */
    /* JADX WARN: Type inference failed for: r2v516 */
    /* JADX WARN: Type inference failed for: r2v690, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v707 */
    /* JADX WARN: Type inference failed for: r2v708 */
    /* JADX WARN: Type inference failed for: r2v709 */
    /* JADX WARN: Type inference failed for: r2v710 */
    /* JADX WARN: Type inference failed for: r2v711 */
    /* JADX WARN: Type inference failed for: r2v712 */
    /* JADX WARN: Type inference failed for: r33v10 */
    /* JADX WARN: Type inference failed for: r33v100 */
    /* JADX WARN: Type inference failed for: r33v101 */
    /* JADX WARN: Type inference failed for: r33v106 */
    /* JADX WARN: Type inference failed for: r33v11 */
    /* JADX WARN: Type inference failed for: r33v113 */
    /* JADX WARN: Type inference failed for: r33v114 */
    /* JADX WARN: Type inference failed for: r33v115 */
    /* JADX WARN: Type inference failed for: r33v116 */
    /* JADX WARN: Type inference failed for: r33v12 */
    /* JADX WARN: Type inference failed for: r33v120 */
    /* JADX WARN: Type inference failed for: r33v124 */
    /* JADX WARN: Type inference failed for: r33v125 */
    /* JADX WARN: Type inference failed for: r33v126 */
    /* JADX WARN: Type inference failed for: r33v129 */
    /* JADX WARN: Type inference failed for: r33v13 */
    /* JADX WARN: Type inference failed for: r33v130 */
    /* JADX WARN: Type inference failed for: r33v131 */
    /* JADX WARN: Type inference failed for: r33v136 */
    /* JADX WARN: Type inference failed for: r33v137 */
    /* JADX WARN: Type inference failed for: r33v14 */
    /* JADX WARN: Type inference failed for: r33v140 */
    /* JADX WARN: Type inference failed for: r33v141 */
    /* JADX WARN: Type inference failed for: r33v145, types: [long] */
    /* JADX WARN: Type inference failed for: r33v146 */
    /* JADX WARN: Type inference failed for: r33v15 */
    /* JADX WARN: Type inference failed for: r33v152 */
    /* JADX WARN: Type inference failed for: r33v153 */
    /* JADX WARN: Type inference failed for: r33v154 */
    /* JADX WARN: Type inference failed for: r33v155 */
    /* JADX WARN: Type inference failed for: r33v156 */
    /* JADX WARN: Type inference failed for: r33v157 */
    /* JADX WARN: Type inference failed for: r33v158 */
    /* JADX WARN: Type inference failed for: r33v159 */
    /* JADX WARN: Type inference failed for: r33v160 */
    /* JADX WARN: Type inference failed for: r33v161 */
    /* JADX WARN: Type inference failed for: r33v164 */
    /* JADX WARN: Type inference failed for: r33v165 */
    /* JADX WARN: Type inference failed for: r33v166 */
    /* JADX WARN: Type inference failed for: r33v167 */
    /* JADX WARN: Type inference failed for: r33v168 */
    /* JADX WARN: Type inference failed for: r33v169 */
    /* JADX WARN: Type inference failed for: r33v170 */
    /* JADX WARN: Type inference failed for: r33v171 */
    /* JADX WARN: Type inference failed for: r33v172 */
    /* JADX WARN: Type inference failed for: r33v173 */
    /* JADX WARN: Type inference failed for: r33v174 */
    /* JADX WARN: Type inference failed for: r33v175 */
    /* JADX WARN: Type inference failed for: r33v176 */
    /* JADX WARN: Type inference failed for: r33v179 */
    /* JADX WARN: Type inference failed for: r33v180 */
    /* JADX WARN: Type inference failed for: r33v181 */
    /* JADX WARN: Type inference failed for: r33v182 */
    /* JADX WARN: Type inference failed for: r33v183 */
    /* JADX WARN: Type inference failed for: r33v184 */
    /* JADX WARN: Type inference failed for: r33v185 */
    /* JADX WARN: Type inference failed for: r33v186 */
    /* JADX WARN: Type inference failed for: r33v187 */
    /* JADX WARN: Type inference failed for: r33v188 */
    /* JADX WARN: Type inference failed for: r33v189 */
    /* JADX WARN: Type inference failed for: r33v190 */
    /* JADX WARN: Type inference failed for: r33v27 */
    /* JADX WARN: Type inference failed for: r33v28 */
    /* JADX WARN: Type inference failed for: r33v29 */
    /* JADX WARN: Type inference failed for: r33v30 */
    /* JADX WARN: Type inference failed for: r33v31 */
    /* JADX WARN: Type inference failed for: r33v40 */
    /* JADX WARN: Type inference failed for: r33v50 */
    /* JADX WARN: Type inference failed for: r33v51 */
    /* JADX WARN: Type inference failed for: r33v52 */
    /* JADX WARN: Type inference failed for: r33v55 */
    /* JADX WARN: Type inference failed for: r33v56 */
    /* JADX WARN: Type inference failed for: r33v57 */
    /* JADX WARN: Type inference failed for: r33v58 */
    /* JADX WARN: Type inference failed for: r33v62 */
    /* JADX WARN: Type inference failed for: r33v63 */
    /* JADX WARN: Type inference failed for: r33v65 */
    /* JADX WARN: Type inference failed for: r33v66 */
    /* JADX WARN: Type inference failed for: r33v67 */
    /* JADX WARN: Type inference failed for: r33v68 */
    /* JADX WARN: Type inference failed for: r33v69 */
    /* JADX WARN: Type inference failed for: r33v7 */
    /* JADX WARN: Type inference failed for: r33v72 */
    /* JADX WARN: Type inference failed for: r33v73 */
    /* JADX WARN: Type inference failed for: r33v75 */
    /* JADX WARN: Type inference failed for: r33v76 */
    /* JADX WARN: Type inference failed for: r33v8 */
    /* JADX WARN: Type inference failed for: r33v81 */
    /* JADX WARN: Type inference failed for: r33v82 */
    /* JADX WARN: Type inference failed for: r33v83 */
    /* JADX WARN: Type inference failed for: r33v86 */
    /* JADX WARN: Type inference failed for: r33v87 */
    /* JADX WARN: Type inference failed for: r33v88 */
    /* JADX WARN: Type inference failed for: r33v9 */
    /* JADX WARN: Type inference failed for: r33v90 */
    /* JADX WARN: Type inference failed for: r33v98 */
    /* JADX WARN: Type inference failed for: r33v99 */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v198, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v199 */
    /* JADX WARN: Type inference failed for: r3v200 */
    /* JADX WARN: Type inference failed for: r3v201 */
    /* JADX WARN: Type inference failed for: r3v202 */
    /* JADX WARN: Type inference failed for: r3v215 */
    /* JADX WARN: Type inference failed for: r3v216 */
    /* JADX WARN: Type inference failed for: r3v232 */
    /* JADX WARN: Type inference failed for: r3v479, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v480 */
    /* JADX WARN: Type inference failed for: r3v481 */
    /* JADX WARN: Type inference failed for: r3v482 */
    /* JADX WARN: Type inference failed for: r3v483 */
    /* JADX WARN: Type inference failed for: r3v496 */
    /* JADX WARN: Type inference failed for: r3v500 */
    /* JADX WARN: Type inference failed for: r3v506 */
    /* JADX WARN: Type inference failed for: r3v507 */
    /* JADX WARN: Type inference failed for: r3v508 */
    /* JADX WARN: Type inference failed for: r3v509 */
    /* JADX WARN: Type inference failed for: r3v510 */
    /* JADX WARN: Type inference failed for: r40v23 */
    /* JADX WARN: Type inference failed for: r40v24 */
    /* JADX WARN: Type inference failed for: r40v29 */
    /* JADX WARN: Type inference failed for: r40v30 */
    /* JADX WARN: Type inference failed for: r40v31 */
    /* JADX WARN: Type inference failed for: r40v53 */
    /* JADX WARN: Type inference failed for: r40v54 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v252 */
    /* JADX WARN: Type inference failed for: r4v253 */
    /* JADX WARN: Type inference failed for: r4v254 */
    /* JADX WARN: Type inference failed for: r4v269 */
    /* JADX WARN: Type inference failed for: r4v270 */
    /* JADX WARN: Type inference failed for: r5v138 */
    /* JADX WARN: Type inference failed for: r5v510 */
    /* JADX WARN: Type inference failed for: r5v88, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v89, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v29, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v462 */
    /* JADX WARN: Type inference failed for: r6v463 */
    /* JADX WARN: Type inference failed for: r6v464 */
    /* JADX WARN: Type inference failed for: r6v483 */
    /* JADX WARN: Type inference failed for: r6v511 */
    /* JADX WARN: Type inference failed for: r6v512 */
    /* JADX WARN: Type inference failed for: r6v513 */
    /* JADX WARN: Type inference failed for: r7v107 */
    /* JADX WARN: Type inference failed for: r7v108 */
    /* JADX WARN: Type inference failed for: r7v211 */
    /* JADX WARN: Type inference failed for: r7v212 */
    /* JADX WARN: Type inference failed for: r7v213 */
    /* JADX WARN: Type inference failed for: r7v214 */
    /* JADX WARN: Type inference failed for: r7v63, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v79 */
    /* JADX WARN: Type inference failed for: r7v80, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v81, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v86, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v87 */
    /* JADX WARN: Type inference failed for: r7v88 */
    /* JADX WARN: Type inference failed for: r7v89 */
    /* JADX WARN: Type inference failed for: r7v90 */
    /* JADX WARN: Type inference failed for: r7v91 */
    /* JADX WARN: Type inference failed for: r8v592 */
    /* JADX WARN: Type inference failed for: r9v282 */
    /* JADX WARN: Type inference failed for: r9v284 */
    /* JADX WARN: Type inference failed for: r9v285 */
    /* JADX WARN: Type inference failed for: r9v286 */
    /* JADX WARN: Type inference failed for: r9v287 */
    /* JADX WARN: Type inference failed for: r9v295 */
    /* JADX WARN: Type inference failed for: r9v299, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v303 */
    /* JADX WARN: Type inference failed for: r9v304 */
    /* JADX WARN: Type inference failed for: r9v305 */
    /* JADX WARN: Type inference failed for: r9v306 */
    /* JADX WARN: Type inference failed for: r9v320 */
    /* JADX WARN: Type inference failed for: r9v326 */
    /* JADX WARN: Type inference failed for: r9v327 */
    /* JADX WARN: Type inference failed for: r9v329, types: [int[]] */
    /* JADX WARN: Type inference failed for: r9v337, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r9v345 */
    /* JADX WARN: Type inference failed for: r9v363 */
    /* JADX WARN: Type inference failed for: r9v364 */
    /* JADX WARN: Type inference failed for: r9v365 */
    /* JADX WARN: Type inference failed for: r9v366 */
    /* JADX WARN: Type inference failed for: r9v367 */
    /* JADX WARN: Type inference failed for: r9v368 */
    /* JADX WARN: Type inference failed for: r9v369 */
    /* JADX WARN: Type inference failed for: r9v370 */
    /* JADX WARN: Type inference failed for: r9v371 */
    /* JADX WARN: Type inference failed for: r9v372 */
    /* JADX WARN: Type inference failed for: r9v373 */
    /* JADX WARN: Type inference failed for: r9v374 */
    /* JADX WARN: Type inference failed for: r9v375 */
    /* JADX WARN: Type inference failed for: r9v376 */
    /* JADX WARN: Type inference failed for: r9v377 */
    /* JADX WARN: Type inference failed for: r9v71 */
    /* JADX WARN: Type inference failed for: r9v72 */
    /* JADX WARN: Type inference failed for: r9v73 */
    /* JADX WARN: Type inference failed for: r9v74, types: [java.lang.String] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r44) {
        /*
            Method dump skipped, instruction units count: 15462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.pin.ui.activity.BasePinActivity.attachBaseContext(android.content.Context):void");
    }

    static CodeEditText m10234$$Nest$fgetetCode(BasePinActivity basePinActivity) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 1;
        copy = i3 % 128;
        int i4 = i3 % 2;
        CodeEditText codeEditText = basePinActivity.etCode;
        int i5 = i2 + 39;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
        return codeEditText;
    }

    static boolean m10235$$Nest$fgetisCreated(BasePinActivity basePinActivity) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 99;
        copy = i3 % 128;
        int i4 = i3 % 2;
        boolean z = basePinActivity.isCreated;
        int i5 = i2 + 77;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    static boolean m10236$$Nest$fgetisSupportBiometric(BasePinActivity basePinActivity) {
        int i = 2 % 2;
        int i2 = copy + 35;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        boolean z = basePinActivity.isSupportBiometric;
        if (i3 == 0) {
            int i4 = 71 / 0;
        }
        return z;
    }

    static SafeInputKeyboard m10237$$Nest$fgetpinInputKeyboard(BasePinActivity basePinActivity) {
        int i = 2 % 2;
        int i2 = copy + 97;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        SafeInputKeyboard safeInputKeyboard = basePinActivity.pinInputKeyboard;
        if (i3 != 0) {
            return safeInputKeyboard;
        }
        throw null;
    }

    static TextView m10238$$Nest$fgettvError(BasePinActivity basePinActivity) {
        int i = 2 % 2;
        int i2 = copy + 63;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        TextView textView = basePinActivity.tvError;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 31;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 60 / 0;
        }
        return textView;
    }

    static void m10239$$Nest$fputisCreated(BasePinActivity basePinActivity, boolean z) {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 77;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        basePinActivity.isCreated = z;
        int i5 = i2 + 71;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 58 / 0;
        }
    }

    static void m10240$$Nest$mshowPriority(BasePinActivity basePinActivity) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 45;
        copy = i2 % 128;
        int i3 = i2 % 2;
        basePinActivity.showPriority();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = copy + 119;
        getSponsorBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    protected void onForgetClick() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 7;
        copy = i2 % 128;
        int i3 = i2 % 2;
    }

    protected boolean showBiometric() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 47;
        copy = i3 % 128;
        boolean z = i3 % 2 != 0;
        int i4 = i2 + 83;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        ArtificialStackFrames = 1;
        ShareDataUIState();
        component1 = -121579979;
        component2 = -238323916;
        copydefault = -125303193;
        ShareDataUIState = new byte[]{57, Base64.padSymbol, -18, -41, 42, -47, -42, 37, -41, -40, 44, 43, 33, -38, 109, -107, 36, -47, -47, 43, 44, -42, 37, Ascii.FS, -109, 47, 32, -47, -35, TarHeader.LF_LINK, -40, 45, 34, -60, 34, 43, -41, 44, Ascii.US, -20, 45, -57, 63, -59, 36, 19, -24, -41, 37, 41};
        int i = toString + 45;
        ArtificialStackFrames = i % 128;
        int i2 = i % 2;
    }

    static void ShareDataUIState() {
        getRequestBeneficiariesState = -1109406451624865335L;
        getAsAtTimestamp = 1386857713;
        equals = (char) 50417;
        component4 = new int[]{1734225134, -1247069309, -284836538, 2126888888, -227291665, -231311843, 90126016, 1977059007, -1696243997, 598697233, -1947467607, -214915116, 1336975367, -1838468271, 2064832747, -528166500, 138198310, -147436455};
    }
}
