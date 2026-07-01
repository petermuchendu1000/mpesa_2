package com.huawei.digitalpayment.consumer.register.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.blankj.utilcode.util.ActivityUtils;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.baselibs2.utils.encrypt.EncryptManager;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.databinding.ActivityBasePinBinding;
import com.huawei.digitalpayment.consumer.baselib.pin.model.PinType;
import com.huawei.digitalpayment.consumer.baselib.pin.ui.activity.BasePinActivity;
import com.huawei.digitalpayment.consumer.baselib.service.ILoginService;
import com.huawei.digitalpayment.consumer.constants.Keys;
import com.huawei.digitalpayment.consumer.login.R;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.getActiveNotifications;

public class RegisterTempPinActivity extends BasePinActivity<ActivityBasePinBinding, ViewModel> {
    private static char ShareDataUIState;
    private static char component1;
    private static char component2;
    private static char component3;
    private static int[] copy;
    private static char[] copydefault;
    private static int getAsAtTimestamp;
    private static final byte[] $$c = {87, -2, Ascii.VT, -41};
    private static final int $$f = 123;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {1, -53, Ascii.US, 101, -39, -25, -30, -26, -26, -18, -36, -33, 40, -39, -25, -30, -26, -26, -18, -36, -33, 38};
    private static final int $$e = 215;
    private static final byte[] $$a = {40, 108, -113, 75, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$b = 110;
    private static int equals = 1;
    private static int getRequestBeneficiariesState = 0;
    private static int component4 = 1;

    private static String $$i(short s, short s2, byte b2) {
        byte[] bArr = $$c;
        int i = 115 - b2;
        int i2 = s2 * 3;
        int i3 = 3 - (s * 4);
        byte[] bArr2 = new byte[i2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i4 = -1;
            i = i3 + i2;
            i3 = i3;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i;
            int i6 = i3 + 1;
            if (i5 == i2) {
                return new String(bArr2, 0);
            }
            i4 = i5;
            i = bArr[i6] + i;
            i3 = i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = 28 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.register.ui.activity.RegisterTempPinActivity.$$a
            int r6 = r6 + 4
            int r8 = r8 * 2
            int r8 = r8 + 83
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r8
            r3 = r2
            r8 = r6
            goto L28
        L13:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r0[r8]
        L28:
            int r6 = r6 + r4
            int r6 = r6 + (-8)
            int r8 = r8 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.RegisterTempPinActivity.d(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void f(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r6 = 10 - r6
            int r8 = r8 * 9
            int r8 = 12 - r8
            int r7 = r7 * 3
            int r7 = 99 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.register.ui.activity.RegisterTempPinActivity.$$d
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r6
            r7 = r8
            r3 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2e:
            int r4 = -r4
            int r8 = r8 + r4
            int r8 = r8 + (-27)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.RegisterTempPinActivity.f(byte, int, int, java.lang.Object[]):void");
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i5 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            cArr3[i5] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i6 = $11 + 65;
            $10 = i6 % 128;
            int i7 = i6 % i3;
            int i8 = 58224;
            int i9 = i5;
            while (i9 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[i5];
                int i10 = (c3 + i8) ^ ((c3 << 4) + ((char) (((long) component1) ^ 4374495167426960553L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(component2);
                    objArr2[i3] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i5] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int offsetAfter = 844 - TextUtils.getOffsetAfter("", i5);
                        int trimmedLength = 32 - TextUtils.getTrimmedLength("");
                        char keyRepeatTimeout = (char) (23251 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        byte b2 = (byte) i5;
                        String str$$i = $$i(b2, b2, (byte) $$c.length);
                        Class[] clsArr = new Class[4];
                        clsArr[i5] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(offsetAfter, trimmedLength, keyRepeatTimeout, 592652048, false, str$$i, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) component3) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(ShareDataUIState)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(844 - Color.green(0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 32, (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 23251), 592652048, false, $$i(b3, b3, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    int i12 = $11 + 121;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    cArr3 = cArr4;
                    i3 = 2;
                    i5 = 0;
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
                i2 = 2;
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getJumpTapTimeout() >> 16) + 465, 50 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) Gravity.getAbsoluteGravity(0, 0), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            } else {
                i2 = 2;
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            i3 = i2;
            cArr3 = cArr5;
            i5 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void c(int i, int[] iArr, Object[] objArr) throws Throwable {
        int[] iArr2;
        int i2 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = copy;
        int i3 = 684241640;
        long j = 0;
        int i4 = 1;
        int i5 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i5] = Integer.valueOf(iArr3[i6]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i3);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i5;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4392 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)), (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 36, (char) TextUtils.getCapsMode("", i5, i5), -309236339, false, $$i(b2, b3, (byte) (b3 | 9)), new Class[]{Integer.TYPE});
                    }
                    iArr4[i6] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i6++;
                    i3 = 684241640;
                    j = 0;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = copy;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i7 = $11 + 5;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            while (i9 < length3) {
                try {
                    Object[] objArr3 = new Object[i4];
                    objArr3[0] = Integer.valueOf(iArr6[i9]);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        iArr2 = iArr6;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "") + 4391, 37 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) TextUtils.getOffsetBefore("", 0), -309236339, false, $$i(b4, b5, (byte) (b5 | 9)), new Class[]{Integer.TYPE});
                    } else {
                        iArr2 = iArr6;
                    }
                    iArr7[i9] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    i9++;
                    iArr6 = iArr2;
                    i4 = 1;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr6 = iArr7;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
        getactivenotifications.component1 = 0;
        while (getactivenotifications.component1 < iArr.length) {
            int i10 = $10 + 79;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr[0] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr5);
            int i12 = 0;
            for (int i13 = 16; i12 < i13; i13 = 16) {
                int i14 = $10 + 61;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    getactivenotifications.ShareDataUIState ^= iArr5[i12];
                    Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) 0;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Gravity.getAbsoluteGravity(0, 0) + 2968, 16 - (Process.myTid() >> 22), (char) (49871 - TextUtils.getOffsetAfter("", 0)), 462826032, false, $$i(b6, b6, $$c[2]), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                    getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                    getactivenotifications.component2 = iIntValue;
                    i12 += 109;
                } else {
                    getactivenotifications.ShareDataUIState ^= iArr5[i12];
                    Object[] objArr5 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                    if (objCopydefault4 == null) {
                        byte b7 = (byte) 0;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2968 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 15, (char) (View.resolveSizeAndState(0, 0, 0) + 49871), 462826032, false, $$i(b7, b7, $$c[2]), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                    getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                    getactivenotifications.component2 = iIntValue2;
                    i12++;
                }
            }
            int i15 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i15;
            getactivenotifications.component2 ^= iArr5[16];
            getactivenotifications.ShareDataUIState ^= iArr5[17];
            int i16 = getactivenotifications.ShareDataUIState;
            int i17 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr5);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr6 = {getactivenotifications, getactivenotifications};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault5 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2944 - ExpandableListView.getPackedPositionType(0L), 25 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (27637 - (ViewConfiguration.getPressedStateDuration() >> 16)), -1616366948, false, $$i(b8, b9, (byte) (b9 | 8)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void e(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2;
        int length;
        char[] cArr;
        int i3;
        int i4 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i5 = iArr[0];
        byte b2 = 1;
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr2 = copydefault;
        if (cArr2 != null) {
            int i9 = $11 + 99;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
                i3 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(658 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 14 - View.MeasureSpec.getSize(0), (char) (65118 - (Process.myPid() >> 22)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr[i3] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i3++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr2, i5, cArr3, 0, i6);
        if (bArr != null) {
            int i10 = $10 + 33;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i6];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i6) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == b2) {
                    int i12 = iTrustedWebActivityService_Parcel.copydefault;
                    char c3 = cArr3[iTrustedWebActivityService_Parcel.copydefault];
                    Object[] objArr3 = new Object[2];
                    objArr3[b2] = Integer.valueOf(c2);
                    objArr3[0] = Integer.valueOf(c3);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault2 == null) {
                        int mode = 4502 - View.MeasureSpec.getMode(0);
                        int iArgb = 36 - Color.argb(0, 0, 0, 0);
                        char c4 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 27897);
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        String str$$i = $$i(b3, b4, (byte) (b4 + 5));
                        Class[] clsArr = new Class[2];
                        clsArr[0] = Integer.TYPE;
                        clsArr[b2] = Integer.TYPE;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(mode, iArgb, c4, -1464227204, false, str$$i, clsArr);
                    }
                    cArr4[i12] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                } else {
                    int i13 = iTrustedWebActivityService_Parcel.copydefault;
                    char c5 = cArr3[iTrustedWebActivityService_Parcel.copydefault];
                    Object[] objArr4 = new Object[2];
                    objArr4[b2] = Integer.valueOf(c2);
                    objArr4[0] = Integer.valueOf(c5);
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault3 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(MotionEvent.axisFromString("") + 3581, 28 - TextUtils.getOffsetBefore("", 0), (char) ((Process.getThreadPriority(0) + 20) >> 6), 1180380354, false, $$i(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1858 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 33 - TextUtils.lastIndexOf("", '0', 0, 0), (char) View.resolveSize(0, 0), 80302927, false, $$i(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                b2 = 1;
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            int i14 = $10 + 49;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                char[] cArr5 = new char[i6];
                System.arraycopy(cArr3, 1, cArr5, 0, i6);
                System.arraycopy(cArr5, 1, cArr3, i6 >> i8, i8);
                System.arraycopy(cArr5, i8, cArr3, 1, i6 + i8);
            } else {
                char[] cArr6 = new char[i6];
                System.arraycopy(cArr3, 0, cArr6, 0, i6);
                int i15 = i6 - i8;
                System.arraycopy(cArr6, 0, cArr3, i15, i8);
                System.arraycopy(cArr6, i8, cArr3, 0, i15);
            }
            int i16 = $11 + 105;
            $10 = i16 % 128;
            int i17 = i16 % 2;
        }
        if (z) {
            char[] cArr7 = new char[i6];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i6) {
                cArr7[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i6 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr3 = cArr7;
        }
        if (i7 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i6) {
                int i18 = $11 + 103;
                $10 = i18 % 128;
                if (i18 % 2 != 0) {
                    cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] * iArr[4]);
                    i2 = iTrustedWebActivityService_Parcel.copydefault;
                    i = 1;
                } else {
                    i = 1;
                    cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                    i2 = iTrustedWebActivityService_Parcel.copydefault;
                }
                iTrustedWebActivityService_Parcel.copydefault = i2 + i;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009a  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.RegisterTempPinActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public void onConfirmClick(String str) {
        int i = 2 % 2;
        Bundle bundle = new Bundle(1);
        bundle.putString(Keys.TEMP_PIN, EncryptManager.INSTANCE.encrypt(str));
        RouteUtils.routeWithExecute(RoutePathConstants.REGISTER_CREATION_PIN, bundle);
        int i2 = getRequestBeneficiariesState + 53;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void onForgetClick() {
        int i = 2 % 2;
        ((ILoginService) RouteUtils.getService(ILoginService.class)).resetPin(new ApiCallback<Boolean>() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public void onSuccess(Boolean bool) {
                int i2 = 2 % 2;
                int i3 = component3 + 107;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                copydefault(bool);
                int i5 = component3 + 117;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void copydefault(Boolean bool) {
                int i2 = 2 % 2;
                int i3 = component2 + 89;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
                    ActivityUtils.finishToActivity((Activity) RegisterTempPinActivity.this, true, true);
                } else {
                    ActivityUtils.finishToActivity((Activity) RegisterTempPinActivity.this, false, true);
                }
            }
        });
        int i2 = getRequestBeneficiariesState + 61;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public PinType getPinType() {
        int i = 2 % 2;
        PinType pinType = new PinType(getString(R.string.onboarding_register_pin_title1), getString(R.string.onboarding_register_pin_title2), getString(R.string.onboarding_pinlogin_button1), getString(R.string.onboarding_register_pin_button1));
        int i2 = component4 + 23;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return pinType;
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 103;
        component4 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr = new Object[1];
                c(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(14) - 83, new int[]{1489044419, 1089670087, 1710874522, 1719290852, -848336688, -750672287, -639861078, 2049922907, -193343431, -1888756546, -809262531, -544551620, -336122370, 819529201}, objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                b((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 17, new char[]{44333, 53842, 51952, 53645, 18125, 'f', 60550, 51808, 30506, 61329, 35074, 10954, 3005, 22076, 19762, 62888, 38301, 54919}, objArr2);
                baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i3 = getRequestBeneficiariesState + 103;
                component4 = i3 % 128;
                if (i3 % 2 == 0) {
                    boolean z = baseContext instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 42 - View.resolveSize(0, 0), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0') + 6563, View.resolveSizeAndState(0, 0, 0) + 56, (char) View.resolveSize(0, 0), -699576857, false, "component2", new Class[]{Context.class});
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
            return;
        }
        getBaseContext();
        obj.hashCode();
        throw null;
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = component4 + 9;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i4 = getRequestBeneficiariesState + 125;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            c(26 - (ViewConfiguration.getTapTimeout() >> 16), new int[]{1489044419, 1089670087, 1710874522, 1719290852, -848336688, -750672287, -639861078, 2049922907, -193343431, -1888756546, -809262531, -544551620, -336122370, 819529201}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 19, new char[]{44333, 53842, 51952, 53645, 18125, 'f', 60550, 51808, 30506, 61329, 35074, 10954, 3005, 22076, 19762, 62888, 38301, 54919}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i6 = component4 + 73;
            getRequestBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
        }
        if (baseContext != null) {
            int i8 = component4 + 45;
            getRequestBeneficiariesState = i8 % 128;
            int i9 = i8 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTouchSlop() >> 8) + 6618, (ViewConfiguration.getPressedStateDuration() >> 16) + 42, (char) ExpandableListView.getPackedPositionType(0L), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getTapTimeout() >> 16), TextUtils.lastIndexOf("", '0') + 57, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), -960739708, false, "component3", new Class[]{Context.class});
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
    /* JADX WARN: Removed duplicated region for block: B:197:0x0a56 A[Catch: all -> 0x0362, TryCatch #31 {all -> 0x0362, blocks: (B:195:0x0a50, B:197:0x0a56, B:198:0x0a82, B:452:0x1708, B:454:0x170e, B:455:0x173a, B:783:0x31e3, B:785:0x31e9, B:786:0x3217, B:820:0x3524, B:822:0x352a, B:823:0x354e, B:800:0x3364, B:802:0x3387, B:803:0x33da, B:749:0x2e9b, B:751:0x2ea1, B:752:0x2ed0, B:634:0x2786, B:636:0x278c, B:637:0x27b5, B:639:0x27ef, B:640:0x2832, B:607:0x24c3, B:609:0x24d8, B:610:0x2505, B:589:0x21c5, B:591:0x21cb, B:592:0x21f8, B:594:0x2232, B:595:0x227f, B:557:0x1e29, B:559:0x1e3e, B:560:0x1e6d, B:562:0x1ea1, B:563:0x1f1e, B:536:0x1bd3, B:538:0x1bd9, B:539:0x1c05, B:282:0x0f8e, B:284:0x0f94, B:285:0x0fc1, B:70:0x04e0, B:72:0x04e6, B:73:0x0511, B:19:0x0173, B:21:0x0179, B:22:0x01a0, B:24:0x02d6, B:26:0x0307, B:27:0x035c, B:202:0x0b02, B:204:0x0b08, B:205:0x0b4e, B:207:0x0b5b, B:209:0x0b64, B:210:0x0ba3, B:233:0x0dc2, B:234:0x0dc6, B:236:0x0dcc, B:239:0x0de4, B:242:0x0df1, B:244:0x0df4, B:256:0x0ed4, B:258:0x0eda, B:259:0x0edb, B:261:0x0edd, B:263:0x0ee4, B:264:0x0ee5, B:211:0x0bae, B:223:0x0ca9, B:225:0x0caf, B:226:0x0cf3, B:228:0x0d1d, B:229:0x0d62, B:231:0x0d78, B:232:0x0dbc, B:267:0x0eeb, B:269:0x0ef2, B:270:0x0ef3, B:272:0x0ef5, B:274:0x0efc, B:275:0x0efd, B:33:0x0370, B:35:0x0374, B:56:0x0455, B:58:0x045b, B:59:0x045c, B:61:0x045e, B:63:0x0465, B:64:0x0466, B:39:0x0380), top: B:909:0x0173, inners: #46, #49 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0b08 A[Catch: all -> 0x0efe, TryCatch #46 {all -> 0x0efe, blocks: (B:202:0x0b02, B:204:0x0b08, B:205:0x0b4e, B:207:0x0b5b, B:209:0x0b64, B:210:0x0ba3, B:233:0x0dc2, B:234:0x0dc6, B:236:0x0dcc, B:239:0x0de4, B:242:0x0df1, B:244:0x0df4, B:256:0x0ed4, B:258:0x0eda, B:259:0x0edb, B:261:0x0edd, B:263:0x0ee4, B:264:0x0ee5, B:211:0x0bae, B:223:0x0ca9, B:225:0x0caf, B:226:0x0cf3, B:228:0x0d1d, B:229:0x0d62, B:231:0x0d78, B:232:0x0dbc, B:267:0x0eeb, B:269:0x0ef2, B:270:0x0ef3, B:272:0x0ef5, B:274:0x0efc, B:275:0x0efd, B:252:0x0e5a, B:247:0x0e23, B:249:0x0e29, B:250:0x0e52, B:218:0x0c1d, B:220:0x0c32, B:221:0x0c9d, B:213:0x0bce, B:215:0x0be3, B:216:0x0c16), top: B:936:0x0b02, outer: #31, inners: #19, #27, #35, #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0b5b A[Catch: all -> 0x0efe, TryCatch #46 {all -> 0x0efe, blocks: (B:202:0x0b02, B:204:0x0b08, B:205:0x0b4e, B:207:0x0b5b, B:209:0x0b64, B:210:0x0ba3, B:233:0x0dc2, B:234:0x0dc6, B:236:0x0dcc, B:239:0x0de4, B:242:0x0df1, B:244:0x0df4, B:256:0x0ed4, B:258:0x0eda, B:259:0x0edb, B:261:0x0edd, B:263:0x0ee4, B:264:0x0ee5, B:211:0x0bae, B:223:0x0ca9, B:225:0x0caf, B:226:0x0cf3, B:228:0x0d1d, B:229:0x0d62, B:231:0x0d78, B:232:0x0dbc, B:267:0x0eeb, B:269:0x0ef2, B:270:0x0ef3, B:272:0x0ef5, B:274:0x0efc, B:275:0x0efd, B:252:0x0e5a, B:247:0x0e23, B:249:0x0e29, B:250:0x0e52, B:218:0x0c1d, B:220:0x0c32, B:221:0x0c9d, B:213:0x0bce, B:215:0x0be3, B:216:0x0c16), top: B:936:0x0b02, outer: #31, inners: #19, #27, #35, #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0bae A[Catch: all -> 0x0efe, TRY_LEAVE, TryCatch #46 {all -> 0x0efe, blocks: (B:202:0x0b02, B:204:0x0b08, B:205:0x0b4e, B:207:0x0b5b, B:209:0x0b64, B:210:0x0ba3, B:233:0x0dc2, B:234:0x0dc6, B:236:0x0dcc, B:239:0x0de4, B:242:0x0df1, B:244:0x0df4, B:256:0x0ed4, B:258:0x0eda, B:259:0x0edb, B:261:0x0edd, B:263:0x0ee4, B:264:0x0ee5, B:211:0x0bae, B:223:0x0ca9, B:225:0x0caf, B:226:0x0cf3, B:228:0x0d1d, B:229:0x0d62, B:231:0x0d78, B:232:0x0dbc, B:267:0x0eeb, B:269:0x0ef2, B:270:0x0ef3, B:272:0x0ef5, B:274:0x0efc, B:275:0x0efd, B:252:0x0e5a, B:247:0x0e23, B:249:0x0e29, B:250:0x0e52, B:218:0x0c1d, B:220:0x0c32, B:221:0x0c9d, B:213:0x0bce, B:215:0x0be3, B:216:0x0c16), top: B:936:0x0b02, outer: #31, inners: #19, #27, #35, #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0dcc A[Catch: all -> 0x0efe, TryCatch #46 {all -> 0x0efe, blocks: (B:202:0x0b02, B:204:0x0b08, B:205:0x0b4e, B:207:0x0b5b, B:209:0x0b64, B:210:0x0ba3, B:233:0x0dc2, B:234:0x0dc6, B:236:0x0dcc, B:239:0x0de4, B:242:0x0df1, B:244:0x0df4, B:256:0x0ed4, B:258:0x0eda, B:259:0x0edb, B:261:0x0edd, B:263:0x0ee4, B:264:0x0ee5, B:211:0x0bae, B:223:0x0ca9, B:225:0x0caf, B:226:0x0cf3, B:228:0x0d1d, B:229:0x0d62, B:231:0x0d78, B:232:0x0dbc, B:267:0x0eeb, B:269:0x0ef2, B:270:0x0ef3, B:272:0x0ef5, B:274:0x0efc, B:275:0x0efd, B:252:0x0e5a, B:247:0x0e23, B:249:0x0e29, B:250:0x0e52, B:218:0x0c1d, B:220:0x0c32, B:221:0x0c9d, B:213:0x0bce, B:215:0x0be3, B:216:0x0c16), top: B:936:0x0b02, outer: #31, inners: #19, #27, #35, #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x1096 A[Catch: all -> 0x169f, PHI: r1 r8
  0x1096: PHI (r1v567 java.lang.Object) = (r1v561 java.lang.Object), (r1v566 java.lang.Object) binds: [B:290:0x1042, B:291:0x1044] A[DONT_GENERATE, DONT_INLINE]
  0x1096: PHI (r8v184 ??) = (r8v344 ??), (r8v345 ??) binds: [B:290:0x1042, B:291:0x1044] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #64 {all -> 0x169f, blocks: (B:289:0x103e, B:295:0x1096), top: B:968:0x103e }] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x10bd  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x110b  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x1121  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x11f0  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x1514  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x156b  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x15a7 A[Catch: all -> 0x1663, TryCatch #32 {all -> 0x1663, blocks: (B:404:0x15a1, B:406:0x15a7, B:407:0x15cf), top: B:910:0x15a1, outer: #37 }] */
    /* JADX WARN: Removed duplicated region for block: B:454:0x170e A[Catch: all -> 0x0362, TryCatch #31 {all -> 0x0362, blocks: (B:195:0x0a50, B:197:0x0a56, B:198:0x0a82, B:452:0x1708, B:454:0x170e, B:455:0x173a, B:783:0x31e3, B:785:0x31e9, B:786:0x3217, B:820:0x3524, B:822:0x352a, B:823:0x354e, B:800:0x3364, B:802:0x3387, B:803:0x33da, B:749:0x2e9b, B:751:0x2ea1, B:752:0x2ed0, B:634:0x2786, B:636:0x278c, B:637:0x27b5, B:639:0x27ef, B:640:0x2832, B:607:0x24c3, B:609:0x24d8, B:610:0x2505, B:589:0x21c5, B:591:0x21cb, B:592:0x21f8, B:594:0x2232, B:595:0x227f, B:557:0x1e29, B:559:0x1e3e, B:560:0x1e6d, B:562:0x1ea1, B:563:0x1f1e, B:536:0x1bd3, B:538:0x1bd9, B:539:0x1c05, B:282:0x0f8e, B:284:0x0f94, B:285:0x0fc1, B:70:0x04e0, B:72:0x04e6, B:73:0x0511, B:19:0x0173, B:21:0x0179, B:22:0x01a0, B:24:0x02d6, B:26:0x0307, B:27:0x035c, B:202:0x0b02, B:204:0x0b08, B:205:0x0b4e, B:207:0x0b5b, B:209:0x0b64, B:210:0x0ba3, B:233:0x0dc2, B:234:0x0dc6, B:236:0x0dcc, B:239:0x0de4, B:242:0x0df1, B:244:0x0df4, B:256:0x0ed4, B:258:0x0eda, B:259:0x0edb, B:261:0x0edd, B:263:0x0ee4, B:264:0x0ee5, B:211:0x0bae, B:223:0x0ca9, B:225:0x0caf, B:226:0x0cf3, B:228:0x0d1d, B:229:0x0d62, B:231:0x0d78, B:232:0x0dbc, B:267:0x0eeb, B:269:0x0ef2, B:270:0x0ef3, B:272:0x0ef5, B:274:0x0efc, B:275:0x0efd, B:33:0x0370, B:35:0x0374, B:56:0x0455, B:58:0x045b, B:59:0x045c, B:61:0x045e, B:63:0x0465, B:64:0x0466, B:39:0x0380), top: B:909:0x0173, inners: #46, #49 }] */
    /* JADX WARN: Removed duplicated region for block: B:468:0x181c  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x187f A[Catch: all -> 0x1b43, TRY_ENTER, TRY_LEAVE, TryCatch #15 {all -> 0x1b43, blocks: (B:459:0x17b9, B:465:0x180f, B:475:0x187f, B:485:0x190b, B:488:0x1956), top: B:878:0x17b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:500:0x1a3d  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x1bd9 A[Catch: all -> 0x0362, TryCatch #31 {all -> 0x0362, blocks: (B:195:0x0a50, B:197:0x0a56, B:198:0x0a82, B:452:0x1708, B:454:0x170e, B:455:0x173a, B:783:0x31e3, B:785:0x31e9, B:786:0x3217, B:820:0x3524, B:822:0x352a, B:823:0x354e, B:800:0x3364, B:802:0x3387, B:803:0x33da, B:749:0x2e9b, B:751:0x2ea1, B:752:0x2ed0, B:634:0x2786, B:636:0x278c, B:637:0x27b5, B:639:0x27ef, B:640:0x2832, B:607:0x24c3, B:609:0x24d8, B:610:0x2505, B:589:0x21c5, B:591:0x21cb, B:592:0x21f8, B:594:0x2232, B:595:0x227f, B:557:0x1e29, B:559:0x1e3e, B:560:0x1e6d, B:562:0x1ea1, B:563:0x1f1e, B:536:0x1bd3, B:538:0x1bd9, B:539:0x1c05, B:282:0x0f8e, B:284:0x0f94, B:285:0x0fc1, B:70:0x04e0, B:72:0x04e6, B:73:0x0511, B:19:0x0173, B:21:0x0179, B:22:0x01a0, B:24:0x02d6, B:26:0x0307, B:27:0x035c, B:202:0x0b02, B:204:0x0b08, B:205:0x0b4e, B:207:0x0b5b, B:209:0x0b64, B:210:0x0ba3, B:233:0x0dc2, B:234:0x0dc6, B:236:0x0dcc, B:239:0x0de4, B:242:0x0df1, B:244:0x0df4, B:256:0x0ed4, B:258:0x0eda, B:259:0x0edb, B:261:0x0edd, B:263:0x0ee4, B:264:0x0ee5, B:211:0x0bae, B:223:0x0ca9, B:225:0x0caf, B:226:0x0cf3, B:228:0x0d1d, B:229:0x0d62, B:231:0x0d78, B:232:0x0dbc, B:267:0x0eeb, B:269:0x0ef2, B:270:0x0ef3, B:272:0x0ef5, B:274:0x0efc, B:275:0x0efd, B:33:0x0370, B:35:0x0374, B:56:0x0455, B:58:0x045b, B:59:0x045c, B:61:0x045e, B:63:0x0465, B:64:0x0466, B:39:0x0380), top: B:909:0x0173, inners: #46, #49 }] */
    /* JADX WARN: Removed duplicated region for block: B:544:0x1c8c  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x1cf5  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x1d3d  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x1d52  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x1e0b  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x205b  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x216d  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x238a  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x23da  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x24a3  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x2648  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x2744  */
    /* JADX WARN: Removed duplicated region for block: B:653:0x29c7 A[Catch: all -> 0x2e09, TRY_LEAVE, TryCatch #53 {all -> 0x2e09, blocks: (B:651:0x29ae, B:653:0x29c7), top: B:947:0x29ae }] */
    /* JADX WARN: Removed duplicated region for block: B:656:0x2a11  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x2a26 A[Catch: all -> 0x2e07, TryCatch #52 {all -> 0x2e07, blocks: (B:655:0x29fa, B:657:0x2a13, B:659:0x2a26, B:661:0x2a2f, B:662:0x2a71, B:695:0x2ccc, B:696:0x2cd0, B:698:0x2cd6, B:701:0x2cf0, B:704:0x2cfd, B:706:0x2d00, B:718:0x2de1, B:720:0x2de7, B:721:0x2de8, B:723:0x2dea, B:725:0x2df1, B:726:0x2df2, B:665:0x2a80, B:667:0x2a84, B:671:0x2a90, B:673:0x2a96, B:685:0x2bae, B:687:0x2bb4, B:688:0x2bf8, B:690:0x2c22, B:691:0x2c69, B:693:0x2c7f, B:694:0x2cc6, B:728:0x2df4, B:730:0x2dfb, B:731:0x2dfc, B:733:0x2dfe, B:735:0x2e05, B:736:0x2e06, B:714:0x2d6a, B:709:0x2d2f, B:711:0x2d35, B:712:0x2d62, B:680:0x2b09, B:682:0x2b28, B:683:0x2ba2, B:675:0x2ab6, B:677:0x2acb, B:678:0x2b02), top: B:946:0x29fa, inners: #30, #34, #40, #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:663:0x2a7c  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x2cd6 A[Catch: all -> 0x2e07, TryCatch #52 {all -> 0x2e07, blocks: (B:655:0x29fa, B:657:0x2a13, B:659:0x2a26, B:661:0x2a2f, B:662:0x2a71, B:695:0x2ccc, B:696:0x2cd0, B:698:0x2cd6, B:701:0x2cf0, B:704:0x2cfd, B:706:0x2d00, B:718:0x2de1, B:720:0x2de7, B:721:0x2de8, B:723:0x2dea, B:725:0x2df1, B:726:0x2df2, B:665:0x2a80, B:667:0x2a84, B:671:0x2a90, B:673:0x2a96, B:685:0x2bae, B:687:0x2bb4, B:688:0x2bf8, B:690:0x2c22, B:691:0x2c69, B:693:0x2c7f, B:694:0x2cc6, B:728:0x2df4, B:730:0x2dfb, B:731:0x2dfc, B:733:0x2dfe, B:735:0x2e05, B:736:0x2e06, B:714:0x2d6a, B:709:0x2d2f, B:711:0x2d35, B:712:0x2d62, B:680:0x2b09, B:682:0x2b28, B:683:0x2ba2, B:675:0x2ab6, B:677:0x2acb, B:678:0x2b02), top: B:946:0x29fa, inners: #30, #34, #40, #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:751:0x2ea1 A[Catch: all -> 0x0362, TryCatch #31 {all -> 0x0362, blocks: (B:195:0x0a50, B:197:0x0a56, B:198:0x0a82, B:452:0x1708, B:454:0x170e, B:455:0x173a, B:783:0x31e3, B:785:0x31e9, B:786:0x3217, B:820:0x3524, B:822:0x352a, B:823:0x354e, B:800:0x3364, B:802:0x3387, B:803:0x33da, B:749:0x2e9b, B:751:0x2ea1, B:752:0x2ed0, B:634:0x2786, B:636:0x278c, B:637:0x27b5, B:639:0x27ef, B:640:0x2832, B:607:0x24c3, B:609:0x24d8, B:610:0x2505, B:589:0x21c5, B:591:0x21cb, B:592:0x21f8, B:594:0x2232, B:595:0x227f, B:557:0x1e29, B:559:0x1e3e, B:560:0x1e6d, B:562:0x1ea1, B:563:0x1f1e, B:536:0x1bd3, B:538:0x1bd9, B:539:0x1c05, B:282:0x0f8e, B:284:0x0f94, B:285:0x0fc1, B:70:0x04e0, B:72:0x04e6, B:73:0x0511, B:19:0x0173, B:21:0x0179, B:22:0x01a0, B:24:0x02d6, B:26:0x0307, B:27:0x035c, B:202:0x0b02, B:204:0x0b08, B:205:0x0b4e, B:207:0x0b5b, B:209:0x0b64, B:210:0x0ba3, B:233:0x0dc2, B:234:0x0dc6, B:236:0x0dcc, B:239:0x0de4, B:242:0x0df1, B:244:0x0df4, B:256:0x0ed4, B:258:0x0eda, B:259:0x0edb, B:261:0x0edd, B:263:0x0ee4, B:264:0x0ee5, B:211:0x0bae, B:223:0x0ca9, B:225:0x0caf, B:226:0x0cf3, B:228:0x0d1d, B:229:0x0d62, B:231:0x0d78, B:232:0x0dbc, B:267:0x0eeb, B:269:0x0ef2, B:270:0x0ef3, B:272:0x0ef5, B:274:0x0efc, B:275:0x0efd, B:33:0x0370, B:35:0x0374, B:56:0x0455, B:58:0x045b, B:59:0x045c, B:61:0x045e, B:63:0x0465, B:64:0x0466, B:39:0x0380), top: B:909:0x0173, inners: #46, #49 }] */
    /* JADX WARN: Removed duplicated region for block: B:757:0x2f5e  */
    /* JADX WARN: Removed duplicated region for block: B:760:0x2faf  */
    /* JADX WARN: Removed duplicated region for block: B:765:0x300b  */
    /* JADX WARN: Removed duplicated region for block: B:782:0x31c3  */
    /* JADX WARN: Removed duplicated region for block: B:791:0x32a9  */
    /* JADX WARN: Removed duplicated region for block: B:794:0x32f8  */
    /* JADX WARN: Removed duplicated region for block: B:799:0x3346  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:819:0x3506  */
    /* JADX WARN: Removed duplicated region for block: B:949:0x17bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:956:0x1044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:960:0x2953 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:999:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v119 */
    /* JADX WARN: Type inference failed for: r10v120 */
    /* JADX WARN: Type inference failed for: r10v121 */
    /* JADX WARN: Type inference failed for: r10v122, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v129 */
    /* JADX WARN: Type inference failed for: r10v131, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v205, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v209 */
    /* JADX WARN: Type inference failed for: r10v210 */
    /* JADX WARN: Type inference failed for: r10v211 */
    /* JADX WARN: Type inference failed for: r10v212 */
    /* JADX WARN: Type inference failed for: r10v218 */
    /* JADX WARN: Type inference failed for: r10v219 */
    /* JADX WARN: Type inference failed for: r10v289 */
    /* JADX WARN: Type inference failed for: r10v290 */
    /* JADX WARN: Type inference failed for: r10v291 */
    /* JADX WARN: Type inference failed for: r12v126 */
    /* JADX WARN: Type inference failed for: r12v127 */
    /* JADX WARN: Type inference failed for: r12v128 */
    /* JADX WARN: Type inference failed for: r12v129 */
    /* JADX WARN: Type inference failed for: r12v140, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v141 */
    /* JADX WARN: Type inference failed for: r12v145 */
    /* JADX WARN: Type inference failed for: r12v146 */
    /* JADX WARN: Type inference failed for: r12v147 */
    /* JADX WARN: Type inference failed for: r12v148 */
    /* JADX WARN: Type inference failed for: r12v150 */
    /* JADX WARN: Type inference failed for: r12v151 */
    /* JADX WARN: Type inference failed for: r12v156 */
    /* JADX WARN: Type inference failed for: r12v162 */
    /* JADX WARN: Type inference failed for: r12v163 */
    /* JADX WARN: Type inference failed for: r12v164 */
    /* JADX WARN: Type inference failed for: r12v165 */
    /* JADX WARN: Type inference failed for: r12v166 */
    /* JADX WARN: Type inference failed for: r12v167 */
    /* JADX WARN: Type inference failed for: r12v168 */
    /* JADX WARN: Type inference failed for: r12v169 */
    /* JADX WARN: Type inference failed for: r12v170 */
    /* JADX WARN: Type inference failed for: r12v171 */
    /* JADX WARN: Type inference failed for: r12v172 */
    /* JADX WARN: Type inference failed for: r12v173 */
    /* JADX WARN: Type inference failed for: r12v174 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v30, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v25 */
    /* JADX WARN: Type inference failed for: r19v26 */
    /* JADX WARN: Type inference failed for: r19v27 */
    /* JADX WARN: Type inference failed for: r19v28 */
    /* JADX WARN: Type inference failed for: r19v29 */
    /* JADX WARN: Type inference failed for: r19v30 */
    /* JADX WARN: Type inference failed for: r19v35 */
    /* JADX WARN: Type inference failed for: r19v36 */
    /* JADX WARN: Type inference failed for: r19v37 */
    /* JADX WARN: Type inference failed for: r19v38 */
    /* JADX WARN: Type inference failed for: r19v39 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v40 */
    /* JADX WARN: Type inference failed for: r19v41 */
    /* JADX WARN: Type inference failed for: r19v42 */
    /* JADX WARN: Type inference failed for: r19v49 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v50 */
    /* JADX WARN: Type inference failed for: r19v51 */
    /* JADX WARN: Type inference failed for: r19v52 */
    /* JADX WARN: Type inference failed for: r19v53 */
    /* JADX WARN: Type inference failed for: r19v54 */
    /* JADX WARN: Type inference failed for: r19v55 */
    /* JADX WARN: Type inference failed for: r19v56 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v13 */
    /* JADX WARN: Type inference failed for: r21v14 */
    /* JADX WARN: Type inference failed for: r21v15 */
    /* JADX WARN: Type inference failed for: r21v16 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r4v73, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v74 */
    /* JADX WARN: Type inference failed for: r4v75 */
    /* JADX WARN: Type inference failed for: r4v76 */
    /* JADX WARN: Type inference failed for: r4v78 */
    /* JADX WARN: Type inference failed for: r4v82 */
    /* JADX WARN: Type inference failed for: r4v83 */
    /* JADX WARN: Type inference failed for: r4v84 */
    /* JADX WARN: Type inference failed for: r4v85 */
    /* JADX WARN: Type inference failed for: r4v86 */
    /* JADX WARN: Type inference failed for: r4v87 */
    /* JADX WARN: Type inference failed for: r4v88 */
    /* JADX WARN: Type inference failed for: r4v89 */
    /* JADX WARN: Type inference failed for: r4v90 */
    /* JADX WARN: Type inference failed for: r4v91 */
    /* JADX WARN: Type inference failed for: r7v549 */
    /* JADX WARN: Type inference failed for: r7v614 */
    /* JADX WARN: Type inference failed for: r8v152 */
    /* JADX WARN: Type inference failed for: r8v159 */
    /* JADX WARN: Type inference failed for: r8v162 */
    /* JADX WARN: Type inference failed for: r8v163 */
    /* JADX WARN: Type inference failed for: r8v164 */
    /* JADX WARN: Type inference failed for: r8v165 */
    /* JADX WARN: Type inference failed for: r8v166 */
    /* JADX WARN: Type inference failed for: r8v170, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v175 */
    /* JADX WARN: Type inference failed for: r8v176 */
    /* JADX WARN: Type inference failed for: r8v184 */
    /* JADX WARN: Type inference failed for: r8v205 */
    /* JADX WARN: Type inference failed for: r8v206 */
    /* JADX WARN: Type inference failed for: r8v224 */
    /* JADX WARN: Type inference failed for: r8v231 */
    /* JADX WARN: Type inference failed for: r8v250 */
    /* JADX WARN: Type inference failed for: r8v251 */
    /* JADX WARN: Type inference failed for: r8v253, types: [int[]] */
    /* JADX WARN: Type inference failed for: r8v254 */
    /* JADX WARN: Type inference failed for: r8v264 */
    /* JADX WARN: Type inference failed for: r8v268 */
    /* JADX WARN: Type inference failed for: r8v269 */
    /* JADX WARN: Type inference failed for: r8v272 */
    /* JADX WARN: Type inference failed for: r8v276 */
    /* JADX WARN: Type inference failed for: r8v294 */
    /* JADX WARN: Type inference failed for: r8v295 */
    /* JADX WARN: Type inference failed for: r8v297, types: [int[]] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v312 */
    /* JADX WARN: Type inference failed for: r8v317 */
    /* JADX WARN: Type inference failed for: r8v318 */
    /* JADX WARN: Type inference failed for: r8v337 */
    /* JADX WARN: Type inference failed for: r8v338 */
    /* JADX WARN: Type inference failed for: r8v339 */
    /* JADX WARN: Type inference failed for: r8v340 */
    /* JADX WARN: Type inference failed for: r8v341 */
    /* JADX WARN: Type inference failed for: r8v342 */
    /* JADX WARN: Type inference failed for: r8v343 */
    /* JADX WARN: Type inference failed for: r8v344 */
    /* JADX WARN: Type inference failed for: r8v345 */
    /* JADX WARN: Type inference failed for: r8v346 */
    /* JADX WARN: Type inference failed for: r8v347 */
    /* JADX WARN: Type inference failed for: r8v348 */
    /* JADX WARN: Type inference failed for: r8v349 */
    /* JADX WARN: Type inference failed for: r8v350 */
    /* JADX WARN: Type inference failed for: r8v351 */
    /* JADX WARN: Type inference failed for: r8v352 */
    /* JADX WARN: Type inference failed for: r8v353 */
    /* JADX WARN: Type inference failed for: r8v354 */
    /* JADX WARN: Type inference failed for: r8v355 */
    /* JADX WARN: Type inference failed for: r8v356 */
    /* JADX WARN: Type inference failed for: r8v357 */
    /* JADX WARN: Type inference failed for: r8v358 */
    /* JADX WARN: Type inference failed for: r8v359 */
    /* JADX WARN: Type inference failed for: r8v360 */
    /* JADX WARN: Type inference failed for: r8v361 */
    /* JADX WARN: Type inference failed for: r8v366 */
    /* JADX WARN: Type inference failed for: r8v367 */
    /* JADX WARN: Type inference failed for: r8v368 */
    /* JADX WARN: Type inference failed for: r8v369 */
    /* JADX WARN: Type inference failed for: r8v370 */
    /* JADX WARN: Type inference failed for: r8v371 */
    /* JADX WARN: Type inference failed for: r8v372 */
    /* JADX WARN: Type inference failed for: r8v373 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r8v45 */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v47, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v56, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v60 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.RegisterTempPinActivity.attachBaseContext(android.content.Context):void");
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = component4 + 107;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = getRequestBeneficiariesState + 45;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        getAsAtTimestamp = 0;
        component2();
        copydefault = new char[]{33456, 33283, 33280, 33280, 33376, 33385, 33390, 33310, 33280, 33341, 33340, 33280, 33339, 33308, 33310, 33339, 33342, 33341, 33339, 33282, 33310, 33376, 33283, 33281, 33281, 33339, 33343, 33283, 33339, 33281, 33340, 33334, 33280, 33280, 33336, 33304, 33377, 33280, 33339, 33340, 33339, 33339, 33307, 33304};
        int i = equals + 33;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    static void component2() {
        component3 = (char) 62847;
        ShareDataUIState = (char) 859;
        component1 = (char) 39091;
        component2 = (char) 39392;
        copy = new int[]{211266277, -925799451, 172478510, 980076159, -1136619349, -1032276735, 484340610, -1442929776, 579541668, 2071738347, -2007288671, -1812891472, -284204708, 1857553240, 281075418, -296346745, -773254968, 418468466};
    }
}
