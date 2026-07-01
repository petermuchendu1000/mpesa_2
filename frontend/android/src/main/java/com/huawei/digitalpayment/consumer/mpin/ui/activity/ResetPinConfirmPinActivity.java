package com.huawei.digitalpayment.consumer.mpin.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Observer;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.constant.CacheConstants;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.huawei.baselibs2.utils.encrypt.EncryptManager;
import com.huawei.biometric.util.BiometricHelper2;
import com.huawei.common.safe.SafeUri;
import com.huawei.common.widget.MPTextWatcher;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.databinding.ActivityBasePinBinding;
import com.huawei.digitalpayment.consumer.baselib.init.TokenHelper;
import com.huawei.digitalpayment.consumer.baselib.pin.model.PinType;
import com.huawei.digitalpayment.consumer.baselib.service.ICommonService;
import com.huawei.digitalpayment.consumer.baselib.service.ILoginService;
import com.huawei.digitalpayment.consumer.baselib.util.encrypt.EncryptUtils;
import com.huawei.digitalpayment.consumer.constants.Keys;
import com.huawei.digitalpayment.consumer.login.util.LoginUtils;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model.SmsCodeType;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.PinLoginParams;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType;
import com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ResetPinTempPinViewModel;
import com.huawei.digitalpayment.consumer.loginModule.register.request.ChangePinParams;
import com.huawei.digitalpayment.consumer.loginModule.register.request.VerifyConfig;
import com.huawei.payment.mvvm.Resource;
import com.huawei.payment.mvvm.Utils;
import com.safaricom.mpesa.lifestyle.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getActiveNotifications;

public class ResetPinConfirmPinActivity extends Hilt_ResetPinConfirmPinActivity<ActivityBasePinBinding, ResetPinTempPinViewModel> {
    private String newToken;
    private static final byte[] $$l = {79, 9, 94, -7};
    private static final int $$o = 6;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$s = {2, 77, TarHeader.LF_CONTIG, -86, -12, 2, 63, -69, Ascii.DC2, -5, 5, -17, 9, 6, -12, 2, 63, -69, Ascii.VT, 7, -17, 13, 1, -17, Ascii.FF, 59, -53, -12, 2, -3, 1, -4, Ascii.SO, TarHeader.LF_CONTIG, -53, -12, 1, 8, -3, -9, 5, Ascii.FF, -19, Ascii.VT, -6, 1, SignedBytes.MAX_POWER_OF_TWO, -21, -44, 1, 8, -3, -9, 5, 36, -37, 8, -9, 38, -43, Ascii.SI, -8, 73, -29, -34, -17, Ascii.VT, -6, 1, 43, -37, -1, -7, 76, -31, -47, 13, 4, -19, 5, -3, -21, 7, -17, 13, 33, -29, -19, 19, Ascii.FF, Ascii.FF, -10, -33, 19, -19, Ascii.SI, -12, 2, -3, 1, 1, 9, -9, -6, 65, -12, 2, 63, -57, -8, 0, 8, -5, 7, TarHeader.LF_CONTIG, -51, -13, 10, -14, 3, 6, 5, TarHeader.LF_FIFO, -57, -6, -6, 69, -53, -12, 2, 0, -2, 1, SignedBytes.MAX_POWER_OF_TWO, -59, -5, -6, Ascii.SI, -13, 4, 13, -11, 62, -76, 0, Ascii.SI};
    private static final int $$t = 33;
    private static final byte[] $$d = {13, 38, -109, 117, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -12, Ascii.FF, -19, -15, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 19;
    private static int equals = 0;
    private static int getRequestBeneficiariesState = 1;
    private static char component1 = 59995;
    private static char ShareDataUIState = 21865;
    private static char copydefault = 35180;
    private static char component2 = 28739;
    private static int[] component3 = {1404022744, -547839443, 1522448721, 1119552422, -95369491, 971393715, -1231319305, 974354278, 169295082, -1947798935, -1711780971, 338853672, -1448983689, 846866832, 1380285334, 2019087793, 599439841, -1454791614};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(int r6, short r7, byte r8) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinConfirmPinActivity.$$l
            int r6 = 111 - r6
            int r7 = r7 * 2
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r6 = r6 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinConfirmPinActivity.$$r(int, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(int r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinConfirmPinActivity.$$d
            int r7 = r7 * 2
            int r7 = 103 - r7
            int r1 = 28 - r5
            byte[] r1 = new byte[r1]
            int r5 = 27 - r5
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r6]
        L26:
            int r4 = -r4
            int r6 = r6 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-8)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinConfirmPinActivity.h(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = 105 - r6
            int r8 = r8 * 16
            int r8 = 99 - r8
            int r7 = r7 * 2
            int r0 = 78 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinConfirmPinActivity.$$s
            byte[] r0 = new byte[r0]
            int r7 = 77 - r7
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2c
        L17:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1b:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            r4 = r1[r8]
            int r3 = r3 + 1
        L2c:
            int r4 = -r4
            int r6 = r6 + r4
            int r8 = r8 + 1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinConfirmPinActivity.i(int, byte, short, java.lang.Object[]):void");
    }

    static ViewDataBinding access$000(ResetPinConfirmPinActivity resetPinConfirmPinActivity) {
        int i = 2 % 2;
        int i2 = equals + 57;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = resetPinConfirmPinActivity.binding;
        int i4 = equals + 1;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return binding;
        }
        throw null;
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i5 = $11 + 71;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                cArr3[i4] = cArr[iNotificationSideChannelDefault.component3];
                int i6 = iNotificationSideChannelDefault.component3;
                cArr3[1] = cArr[i4];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
                i2 = i4;
            }
            int i7 = 58224;
            while (i2 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[i4];
                char[] cArr4 = cArr3;
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i7) ^ ((c3 << 4) + ((char) (((long) copydefault) ^ 4374495167426960553L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(component2)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(844 - ((Process.getThreadPriority(0) + 20) >> 6), 32 - (Process.myTid() >> 22), (char) (View.MeasureSpec.getMode(0) + 23251), 592652048, false, $$r(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr4[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) component1) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(ShareDataUIState)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(843 - TextUtils.indexOf((CharSequence) "", '0'), 33 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (23252 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 592652048, false, $$r(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i2++;
                    int i8 = $11 + 17;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    cArr3 = cArr4;
                    i4 = 0;
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
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 465, 50 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((-16777216) - Color.rgb(0, 0, 0)), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void g(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int length;
        int[] iArr2;
        int i3 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = component3;
        float f = 0.0f;
        int i4 = 684241640;
        int i5 = 1;
        int i6 = 0;
        if (iArr3 != null) {
            int i7 = $11 + 89;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i6] = Integer.valueOf(iArr3[i8]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4);
                    if (objCopydefault == null) {
                        byte b2 = (byte) ($$o - 1);
                        byte b3 = (byte) (b2 - 5);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.normalizeMetaState(i6) + 4391, 37 - View.resolveSize(i6, i6), (char) (1 - (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1))), -309236339, false, $$r(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr2[i8] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i8++;
                    f = 0.0f;
                    i4 = 684241640;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = component3;
        int i9 = 16;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                int i11 = $11 + 125;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    Object[] objArr3 = new Object[i5];
                    objArr3[0] = Integer.valueOf(iArr5[i10]);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) ($$o - 1);
                        byte b5 = (byte) (b4 - 5);
                        i2 = length3;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4391 - (ViewConfiguration.getFadingEdgeLength() >> i9), Color.rgb(0, 0, 0) + 16777253, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), -309236339, false, $$r(b4, b5, b5), new Class[]{Integer.TYPE});
                    } else {
                        i2 = length3;
                    }
                    iArr6[i10] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                } else {
                    i2 = length3;
                    Object[] objArr4 = {Integer.valueOf(iArr5[i10])};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault3 == null) {
                        int iArgb = Color.argb(0, 0, 0, 0) + 4391;
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 37;
                        char gidForName = (char) ((-1) - Process.getGidForName(""));
                        byte b6 = (byte) ($$o - 1);
                        byte b7 = (byte) (b6 - 5);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iArgb, offsetBefore, gidForName, -309236339, false, $$r(b6, b7, b7), new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                    i10++;
                }
                length3 = i2;
                i9 = 16;
                i5 = 1;
            }
            int i12 = $10 + 95;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            iArr5 = iArr6;
        }
        char c2 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        getactivenotifications.component1 = 0;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[c2] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr4);
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                int i16 = $10 + 13;
                $11 = i16 % 128;
                if (i16 % 2 == 0) {
                    getactivenotifications.ShareDataUIState ^= iArr4[i14];
                    Object[] objArr5 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                    if (objCopydefault4 == null) {
                        byte b8 = (byte) 0;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(Color.rgb(0, 0, 0) + 16780184, (ViewConfiguration.getFadingEdgeLength() >> 16) + 16, (char) (View.MeasureSpec.getMode(0) + 49871), 462826032, false, $$r((byte) (-$$l[3]), b8, b8), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                    getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                    getactivenotifications.component2 = iIntValue;
                    i14 += 62;
                } else {
                    getactivenotifications.ShareDataUIState ^= iArr4[i14];
                    try {
                        Object[] objArr6 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                        if (objCopydefault5 == null) {
                            byte b9 = (byte) 0;
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2968 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getLongPressTimeout() >> 16) + 16, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 49871), 462826032, false, $$r((byte) (-$$l[3]), b9, b9), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objCopydefault5).invoke(null, objArr6)).intValue();
                        getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                        getactivenotifications.component2 = iIntValue2;
                        i14++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            int i17 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i17;
            getactivenotifications.component2 ^= iArr4[16];
            getactivenotifications.ShareDataUIState ^= iArr4[17];
            int i18 = getactivenotifications.ShareDataUIState;
            int i19 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr4);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr7 = {getactivenotifications, getactivenotifications};
            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault6 == null) {
                int packedPositionGroup = 2944 - ExpandableListView.getPackedPositionGroup(0L);
                int i20 = 25 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                char deadChar = (char) (27637 - KeyEvent.getDeadChar(0, 0));
                byte length4 = (byte) $$l.length;
                byte b10 = (byte) (length4 - 4);
                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionGroup, i20, deadChar, -1616366948, false, $$r(length4, b10, b10), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault6).invoke(null, objArr7);
            c2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 111;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[1];
        f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952715_res_0x7f13044b).substring(6, 7).codePointAt(0) - 14, new char[]{25234, 2240, 42584, 31207, 17236, 60528, 28998, 17050, 51371, 50715, 1728, 54590, 49363, 58013, 30969, 32284, 57795, 31693}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        g((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 5, new int[]{946220394, 1403012556, -427393615, -1267667050}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 20, new int[]{2108257068, -566873396, -320633978, 554959676, -780437872, 889573890, 332796370, -300976171, -786264931, 1950441990, -777425030, 1320032263, 1889731990, 1429595555}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                f((ViewConfiguration.getFadingEdgeLength() >> 16) + 18, new char[]{4561, 38638, 39947, 56956, 48699, 35269, 5942, 6579, 14905, 42789, 63006, 56936, 51780, 15907, 46704, 54754, 14078, 55779}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = (!((baseContext instanceof ContextWrapper) ^ true) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                int i4 = getRequestBeneficiariesState + 47;
                equals = i4 % 128;
                int i5 = i4 % 2;
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((Process.myPid() >> 22) + 6618, (KeyEvent.getMaxKeyCode() >> 16) + 42, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952790_res_0x7f130496).substring(7, 8).length() + 47, new char[]{43699, 60296, 48750, 42895, 10496, 14031, 30969, 32284, 64076, 30306, 38534, 6650, 18704, 26735, 33183, 54932, 30268, 57331, 49607, 25248, 19785, 15194, 6729, 16203, 8382, 39363, 59549, 47210, 5623, 30236, 60973, 46659, 15869, 61669, 54840, 1399, 32483, 56105, 51780, 15907, 28288, 18052, 32493, 50197, 8689, 51503, 48361, 21935}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    g((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 64, new int[]{1891882203, -1616608811, 651067474, 1082368665, -1613535887, 326935688, -469140891, 959036289, 2008729525, -1129534452, 2105679538, 957443099, 1442643288, 1860162155, 837713423, -1808942881, -1042136727, -1463299285, -819653713, 334550525, 2022793894, -620432952, -1207004269, -1951215571, -579373906, -1138876906, 1993824975, -1110814735, 381795554, -1131966123, -1458759119, 734259043}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    g(KeyEvent.getDeadChar(0, 0) + 64, new int[]{684587563, 1046517850, 306571616, 645170021, 2102082171, -120331561, 949122695, -1184744241, 327399322, 519477626, -242029411, -2054547869, -132438750, 1887848490, 104082267, -775258194, 373826553, 307162901, -518572851, 1229129144, -2056402426, 1532815041, -360584484, -1570090984, 502953434, 1162187606, -2070781544, 872145096, -982971185, -1014834495, -1318248032, 603085279}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    f((Process.myTid() >> 22) + 72, new char[]{54991, 61303, 54872, 25464, 48737, 16347, 13590, 41197, 35009, 62419, 22599, 61263, 30935, 55825, 14287, 58093, 61827, 11190, 49730, 30644, 8689, 51503, 48610, 62712, 32870, 47713, 16723, 41000, 15869, 61669, 29667, 38217, 27114, 32231, 3547, 39693, 1086, 18705, 25850, 2723, 5328, 24060, 22864, 22637, 25850, 2723, 38025, 58842, 2324, 61467, 2757, 2154, 15566, 11163, 61419, 54263, 48025, 44724, 18361, 19370, 25551, 38482, 32145, 34169, 4728, 1849, 52924, 9274, 48699, 35269, 14472, 43206}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 96, new int[]{1651614843, 2121257897, 729256873, 968492141}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    g(36 - (ViewConfiguration.getKeyRepeatDelay() >> 16), new int[]{216547841, -1975725672, 1802096855, 1186936369, -643878077, 203194766, -2121628520, 1776246430, 1908631303, 1322153348, -743391309, 719902581, 212156302, -1024993514, 351901548, 643814829, -1724439983, -1579716443}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6561, TextUtils.indexOf("", "", 0, 0) + 56, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr12);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
        if (objCopydefault3 == null) {
            Object[] objArr13 = new Object[1];
            h(r8[38], r8[33], (byte) (-$$d[31]), objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2405 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 26, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            int i6 = getRequestBeneficiariesState + 71;
            equals = i6 % 128;
            if (i6 % 2 != 0) {
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault4 == null) {
                    int iResolveSize = View.resolveSize(0, 0) + 2405;
                    int deadChar = 26 - KeyEvent.getDeadChar(0, 0);
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                    byte[] bArr = $$d;
                    Object[] objArr14 = new Object[1];
                    h((byte) (-bArr[95]), (byte) (-bArr[67]), (byte) (-bArr[31]), objArr14);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iResolveSize, deadChar, cIndexOf, 24929979, false, (String) objArr14[0], null);
                }
                throw null;
            }
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault5 == null) {
                int windowTouchSlop = 2405 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                int iIndexOf = TextUtils.indexOf("", "", 0) + 26;
                char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                byte[] bArr2 = $$d;
                byte b2 = (byte) (-bArr2[95]);
                byte b3 = (byte) (-bArr2[67]);
                byte b4 = (byte) (-bArr2[31]);
                Object[] objArr15 = new Object[1];
                h(b2, b3, b4, objArr15);
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(windowTouchSlop, iIndexOf, c2, 24929979, false, (String) objArr15[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault5).get(null);
        } else {
            Object[] objArr16 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 81, new int[]{472064263, -1935157446, -1788626862, -1494698984, 1853489647, 972042765, 1563714325, -1778606250}, objArr16);
            Class<?> cls3 = Class.forName((String) objArr16[0]);
            Object[] objArr17 = new Object[1];
            f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 13, new char[]{57187, 2157, 48699, 35269, 46704, 54754, 47395, 33484, 36680, 6230, 63024, 64598, 50432, 59850, 10659, 26574}, objArr17);
            try {
                Object[] objArr18 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr17[0], Object.class).invoke(null, this)).intValue()), 0, 22397158};
                byte b5 = (byte) ($$t | 68);
                byte[] bArr3 = $$s;
                byte b6 = bArr3[110];
                Object[] objArr19 = new Object[1];
                i(b5, b6, b6, objArr19);
                Class<?> cls4 = Class.forName((String) objArr19[0]);
                Object[] objArr20 = new Object[1];
                i((byte) 24, (byte) (-bArr3[74]), bArr3[22], objArr20);
                objArr = (Object[]) cls4.getMethod((String) objArr20[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr18);
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault6 == null) {
                    int iIndexOf2 = 2405 - TextUtils.indexOf("", "");
                    int i7 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 25;
                    char windowTouchSlop2 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                    byte[] bArr4 = $$d;
                    Object[] objArr21 = new Object[1];
                    h((byte) (-bArr4[95]), (byte) (-bArr4[67]), (byte) (-bArr4[31]), objArr21);
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf2, i7, windowTouchSlop2, 24929979, false, (String) objArr21[0], null);
                }
                ((Field) objCopydefault6).set(null, objArr);
                try {
                    Object[] objArr22 = new Object[1];
                    f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(27) - 86, new char[]{25234, 2240, 42584, 31207, 17236, 60528, 28998, 17050, 51371, 50715, 26264, 47726, 23481, 26184, 34362, 25122, 27174, 13186, 5497, 61659, 37661, 62030}, objArr22);
                    Class<?> cls5 = Class.forName((String) objArr22[0]);
                    Object[] objArr23 = new Object[1];
                    g((ViewConfiguration.getEdgeSlop() >> 16) + 15, new int[]{-856483747, 1653085161, 2071294111, 1722332410, -585574366, 1831353611, 147444967, -1232704372}, objArr23);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr23[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault7 == null) {
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 2405;
                        int i8 = 27 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte b7 = $$d[33];
                        Object[] objArr24 = new Object[1];
                        h(b7, r11[82], b7, objArr24);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(jumpTapTimeout, i8, longPressTimeout, -1843538389, false, (String) objArr24[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault8 == null) {
                        int i9 = 2406 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int iGreen = 26 - Color.green(0);
                        char c3 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        byte[] bArr5 = $$d;
                        byte b8 = bArr5[38];
                        byte b9 = bArr5[33];
                        byte b10 = (byte) (-bArr5[31]);
                        Object[] objArr25 = new Object[1];
                        h(b8, b9, b10, objArr25);
                        objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(i9, iGreen, c3, -2047739879, false, (String) objArr25[0], null);
                    }
                    ((Field) objCopydefault8).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i10 = ((int[]) objArr[0])[0];
        int i11 = ((int[]) objArr[2])[0];
        if (i11 == i10) {
            int i12 = equals + 105;
            getRequestBeneficiariesState = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 5 % 3;
            }
        } else {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i11 ^ i10)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault9 == null) {
                objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 6618, 42 - View.MeasureSpec.getSize(0), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault9).invoke(null, null);
            try {
                Object[] objArr26 = {1472038709, Long.valueOf(j3), new ArrayList(), null, true};
                Class cls6 = (Class) ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6562, 55 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1));
                Object[] objArr27 = new Object[1];
                i(r1[12], (byte) (-$$s[64]), r1[110], objArr27);
                cls6.getMethod((String) objArr27[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr26);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(bundle);
        this.newToken = getIntent().getStringExtra("token");
        initView();
        addObserve();
        int i14 = getRequestBeneficiariesState + 69;
        equals = i14 % 128;
        int i15 = i14 % 2;
    }

    private void initView() {
        int i = 2 % 2;
        ((ActivityBasePinBinding) this.binding).etCode.addTextChangedListener(new MPTextWatcher() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public void afterTextChanged(Editable editable) {
                int i2 = 2 % 2;
                int i3 = component1 + 7;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    super.afterTextChanged(editable);
                    int i4 = 91 / 0;
                    if (TextUtils.isEmpty(editable)) {
                        return;
                    }
                } else {
                    super.afterTextChanged(editable);
                    if (TextUtils.isEmpty(editable)) {
                        return;
                    }
                }
                int i5 = component1 + 93;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                ((ActivityBasePinBinding) ResetPinConfirmPinActivity.access$000(ResetPinConfirmPinActivity.this)).etCode.setError(false);
            }
        });
        int i2 = equals + 15;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    private void lambda$addObserve$0(Resource resource) {
        int i = 2 % 2;
        int i2 = equals + 21;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Utils.showOrHideLoading(this, resource);
        if (!(!resource.error())) {
            int i4 = equals + 47;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            if (((ICommonService) RouteUtils.getService(ICommonService.class)).dealError(this, resource.getException())) {
                return;
            }
            ((ActivityBasePinBinding) this.binding).etCode.showError(resource.getMessage());
            ((ActivityBasePinBinding) this.binding).etCode.clear();
        }
        if (resource.success()) {
            ((ActivityBasePinBinding) this.binding).etCode.setError(false);
            if (!((ILoginService) RouteUtils.getService(ILoginService.class)).isLogin()) {
                ((ResetPinTempPinViewModel) this.viewModel).pinLogin(new PinLoginParams(EncryptUtils.encryptWithPinKey(((ActivityBasePinBinding) this.binding).etCode.getText().toString())));
                return;
            }
            if (!TextUtils.isEmpty(this.newToken)) {
                TokenHelper.INSTANCE.saveTokenToSp(this.newToken);
            }
            BiometricHelper2.getInstance().closeFingerprintPay();
            BiometricHelper2.getInstance().closeFaceIdPay();
            if (((ILoginService) RouteUtils.getService(ILoginService.class)).dealResetPinSuccessResult()) {
                return;
            }
            int i6 = getRequestBeneficiariesState + 19;
            equals = i6 % 128;
            int i7 = i6 % 2;
            RouteUtils.routeWithExecute(RoutePathConstants.MAIN);
        }
    }

    private void addObserve() {
        int i = 2 % 2;
        ((ResetPinTempPinViewModel) this.viewModel).getData().observe(this, new Observer() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 57;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                ResetPinConfirmPinActivity.$r8$lambda$6zF49JKoD67SGc78P6FvIe8A_cA(this.f$0, (Resource) obj);
                if (i4 != 0) {
                    throw null;
                }
            }
        });
        observerPinLogin();
        int i2 = equals + 107;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void observerPinLogin() {
        int i = 2 % 2;
        ((ResetPinTempPinViewModel) this.viewModel).getPinLoginData().observe(this, new Observer() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            public static void component1() {
            }

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 33;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                ResetPinConfirmPinActivity.$r8$lambda$XbC7dLUSxL0oWa8Xr0jbrtcBBDw(this.f$0, (Resource) obj);
                int i5 = copydefault + 61;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 8 / 0;
                }
            }
        });
        int i2 = getRequestBeneficiariesState + 33;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private void lambda$observerPinLogin$1(Resource resource) {
        int i = 2 % 2;
        Utils.showOrHideLoading(this, resource);
        if (!(!resource.error())) {
            int i2 = equals + 35;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            ((ActivityBasePinBinding) this.binding).tvError.setText(resource.getMessage());
            ((ActivityBasePinBinding) this.binding).tvError.setVisibility(0);
            ((ActivityBasePinBinding) this.binding).etCode.setError(true);
            ((ActivityBasePinBinding) this.binding).etCode.clear();
            ((ActivityBasePinBinding) this.binding).etCode.setError(true);
        }
        if (resource.success()) {
            LocalLoginInfo localLoginInfo = (LocalLoginInfo) resource.getData();
            if (TextUtils.isEmpty(localLoginInfo.getExecute())) {
                int i4 = getRequestBeneficiariesState + 101;
                equals = i4 % 128;
                int i5 = i4 % 2;
                LoginUtils.guideOpenBiometricLogin(((ActivityBasePinBinding) this.binding).etCode.getText().toString(), localLoginInfo);
                int i6 = equals + 97;
                getRequestBeneficiariesState = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
            Uri uri = SafeUri.parse(localLoginInfo.getExecute());
            if (uri == null) {
                return;
            }
            if (!TextUtils.equals(uri.getPath(), "/loginModule/otpVerifyNewDevice")) {
                RouteUtils.routeWithExecute(this, localLoginInfo.getExecute());
                return;
            }
            RouteUtils.routeWithExecute(this, localLoginInfo.getExecute() + "?smsCodeType=" + SmsCodeType.NEW_DEVICE_SMS_CODE.getSmsCode());
            int i8 = getRequestBeneficiariesState + 31;
            equals = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
        }
    }

    @Override
    public void onConfirmClick(String str) {
        String verifyType;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 59;
        equals = i2 % 128;
        int i3 = i2 % 2;
        String strDecrypt = EncryptManager.INSTANCE.decrypt(getIntent().getStringExtra("creationPin"));
        String strDecrypt2 = EncryptManager.INSTANCE.decrypt(getIntent().getStringExtra("oldPin"));
        if (!TextUtils.equals(strDecrypt, str)) {
            ((ActivityBasePinBinding) this.binding).tvError.setText(getString(com.huawei.digitalpayment.consumer.login.R.string.pinmanage_confirmnewpin_tips5));
            ((ActivityBasePinBinding) this.binding).tvError.setVisibility(0);
            ((ActivityBasePinBinding) this.binding).etCode.setError(true);
            ((ActivityBasePinBinding) this.binding).etCode.clear();
            ((ActivityBasePinBinding) this.binding).etCode.setError(true);
            return;
        }
        if (getIntent().hasExtra(Keys.VERIFY_TYPE)) {
            int i4 = equals + 95;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 == 0) {
                ((VerifyType) getIntent().getParcelableExtra(Keys.VERIFY_TYPE)).getVerifyType();
                verifyConfig.hashCode();
                throw null;
            }
            verifyType = ((VerifyType) getIntent().getParcelableExtra(Keys.VERIFY_TYPE)).getVerifyType();
        } else {
            verifyType = null;
        }
        ChangePinParams changePinParams = new ChangePinParams(EncryptUtils.encryptWithPinKey(strDecrypt2), EncryptUtils.encryptWithPinKey(strDecrypt), TextUtils.isEmpty(verifyType) ? null : new VerifyConfig(verifyType));
        if (!TextUtils.isEmpty(this.newToken)) {
            int i5 = getRequestBeneficiariesState + 37;
            equals = i5 % 128;
            int i6 = i5 % 2;
            changePinParams.addParams("token", this.newToken);
        }
        ((ResetPinTempPinViewModel) this.viewModel).changePin(changePinParams);
    }

    @Override
    public PinType getPinType() {
        int i = 2 % 2;
        PinType pinType = new PinType(getString(com.huawei.digitalpayment.consumer.login.R.string.pinmanage_confirmnewpin_title), getString(com.huawei.digitalpayment.consumer.login.R.string.pinmanage_confirmnewpin_tips), "", getString(com.huawei.digitalpayment.consumer.login.R.string.pinmanage_confirmnewpin_button));
        int i2 = equals + 45;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return pinType;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a1  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinConfirmPinActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = equals + 25;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952718_res_0x7f13044e).substring(6, 7).codePointAt(0) - 6, new int[]{2108257068, -566873396, -320633978, 554959676, -780437872, 889573890, 332796370, -300976171, -786264931, 1950441990, -777425030, 1320032263, 1889731990, 1429595555}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(18 - (ViewConfiguration.getScrollBarSize() >> 8), new char[]{4561, 38638, 39947, 56956, 48699, 35269, 5942, 6579, 14905, 42789, 63006, 56936, 51780, 15907, 46704, 54754, 14078, 55779}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = getRequestBeneficiariesState + 29;
            equals = i4 % 128;
            if (i4 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                obj.hashCode();
                throw null;
            }
            baseContext = (!((baseContext instanceof ContextWrapper) ^ true) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.normalizeMetaState(0) + 6618, Drawable.resolveOpacity(0, 0) + 42, (char) View.resolveSize(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6561 - TextUtils.indexOf((CharSequence) "", '0'), TextUtils.indexOf("", "", 0) + 56, (char) KeyEvent.getDeadChar(0, 0), -960739708, false, "component3", new Class[]{Context.class});
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
        int i5 = equals + 53;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:0|2|(2:4|(2:6|(2:(2:11|(1:17)(1:16))(1:18)|(9:20|786|21|(1:23)|24|25|26|(1:28)|29)(1:33))(0))(1:(0)(0)))(0)|34|(10:838|35|(2:844|37)|41|42|827|(2:44|(5:46|47|(1:49)|50|51)(4:52|(1:54)|55|56))(16:58|59|829|60|(2:792|62)|66|67|68|(1:70)|71|72|73|(1:75)|76|(1:78)|79)|57|80|(9:83|819|84|(1:86)|87|88|89|811|90))|125|(8:787|126|(1:128)|129|(3:131|(1:133)|134)(19:135|136|779|137|(1:139)|140|141|774|142|(1:144)|145|146|147|(1:149)|150|(1:152)|153|(1:155)|156)|157|(4:160|(3:857|162|860)(12:855|163|(3:165|(3:168|169|166)|861)|170|766|171|(1:173)|174|175|847|176|859)|858|158)|856)|211|(16:(8:833|212|(1:214)|215|(3:217|(1:219)|220)(19:221|222|825|223|(1:225)|226|227|815|228|(1:230)|231|232|233|(1:235)|236|(1:238)|239|(1:241)|242)|243|(4:246|(3:864|248|867)(12:863|249|(3:251|(3:254|255|252)|868)|256|805|257|(1:259)|260|261|796|262|866)|865|244)|862)|(5:312|313|(1:315)|316|317)(20:318|(3:851|320|(1:326)(1:325))(1:330)|(19:768|332|845|333|(2:784|335)|339|340|831|341|(2:807|343)|347|348|349|(1:351)|352|(1:354)(1:356)|357|(1:359)|360)|415|(3:800|432|(1:438)(1:437))(1:442)|443|788|444|(1:446)|447|781|448|(1:450)|451|475|(1:477)|478|(3:480|(1:482)|483)(14:484|485|(1:487)|488|489|(1:491)|492|801|493|494|(1:496)(1:497)|498|(1:500)|501)|502|(9:504|(1:506)|507|(1:509)|510|(3:512|(1:514)|515)(16:517|518|(1:520)|521|(1:523)|524|525|(1:527)|528|790|529|530|(1:532)|533|(1:535)|536)|516|537|(25:539|778|540|(1:542)|543|(1:545)|546|(3:548|(1:550)|551)(17:553|(3:555|556|(1:562)(1:561))|(19:564|565|770|566|(1:568)|569|570|853|571|(1:573)|574|575|576|(1:578)|579|(1:581)|582|(1:584)|585)|640|(1:642)|643|(3:645|(1:647)|648)(13:650|776|651|652|(1:654)|655|817|656|657|(1:659)|660|(1:662)|663)|649|664|(6:667|668|(1:670)|671|672|673)|674|(1:676)|677|(3:679|(1:681)|682)(14:684|685|(1:687)|688|689|(1:691)|692|809|693|694|(1:696)|697|(1:699)|700)|683|701|(1:882)(7:704|705|(1:707)|708|709|710|711))|586|(4:589|(3:875|591|878)(12:874|592|(3:594|(3:597|598|595)|879)|599|840|600|(1:602)|603|604|834|605|877)|876|587)|873|640|(0)|643|(0)(0)|649|664|(0)|674|(0)|677|(0)(0)|683|701|(0)(0))(10:721|(3:723|(2:726|724)|880)|727|728|(1:730)|731|(1:733)|734|735|736))(10:739|(3:741|(2:744|742)|881)|745|746|(1:748)|749|(1:751)|752|753|754))|788|444|(0)|447|781|448|(0)|451|475|(0)|478|(0)(0)|502|(0)(0))|297|772|298|(2:842|300)|305|(2:307|308)|309|310|828|361|(4:364|(3:366|367|(2:372|871)(11:373|(3:375|(3:378|379|376)|872)|380|823|381|(1:383)|384|385|813|386|870))(2:370|(0)(0))|387|362)|869|415|(0)(0)|443|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(47:0|2|(2:4|(2:6|(2:(2:11|(1:17)(1:16))(1:18)|(9:20|786|21|(1:23)|24|25|26|(1:28)|29)(1:33))(0))(1:(0)(0)))(0)|34|(10:838|35|(2:844|37)|41|42|827|(2:44|(5:46|47|(1:49)|50|51)(4:52|(1:54)|55|56))(16:58|59|829|60|(2:792|62)|66|67|68|(1:70)|71|72|73|(1:75)|76|(1:78)|79)|57|80|(9:83|819|84|(1:86)|87|88|89|811|90))|125|787|126|(1:128)|129|(3:131|(1:133)|134)(19:135|136|779|137|(1:139)|140|141|774|142|(1:144)|145|146|147|(1:149)|150|(1:152)|153|(1:155)|156)|157|(4:160|(3:857|162|860)(12:855|163|(3:165|(3:168|169|166)|861)|170|766|171|(1:173)|174|175|847|176|859)|858|158)|856|211|(8:833|212|(1:214)|215|(3:217|(1:219)|220)(19:221|222|825|223|(1:225)|226|227|815|228|(1:230)|231|232|233|(1:235)|236|(1:238)|239|(1:241)|242)|243|(4:246|(3:864|248|867)(12:863|249|(3:251|(3:254|255|252)|868)|256|805|257|(1:259)|260|261|796|262|866)|865|244)|862)|297|772|298|(2:842|300)|305|(2:307|308)|309|310|828|(5:312|313|(1:315)|316|317)(20:318|(3:851|320|(1:326)(1:325))(1:330)|(19:768|332|845|333|(2:784|335)|339|340|831|341|(2:807|343)|347|348|349|(1:351)|352|(1:354)(1:356)|357|(1:359)|360)|415|(3:800|432|(1:438)(1:437))(1:442)|443|788|444|(1:446)|447|781|448|(1:450)|451|475|(1:477)|478|(3:480|(1:482)|483)(14:484|485|(1:487)|488|489|(1:491)|492|801|493|494|(1:496)(1:497)|498|(1:500)|501)|502|(9:504|(1:506)|507|(1:509)|510|(3:512|(1:514)|515)(16:517|518|(1:520)|521|(1:523)|524|525|(1:527)|528|790|529|530|(1:532)|533|(1:535)|536)|516|537|(25:539|778|540|(1:542)|543|(1:545)|546|(3:548|(1:550)|551)(17:553|(3:555|556|(1:562)(1:561))|(19:564|565|770|566|(1:568)|569|570|853|571|(1:573)|574|575|576|(1:578)|579|(1:581)|582|(1:584)|585)|640|(1:642)|643|(3:645|(1:647)|648)(13:650|776|651|652|(1:654)|655|817|656|657|(1:659)|660|(1:662)|663)|649|664|(6:667|668|(1:670)|671|672|673)|674|(1:676)|677|(3:679|(1:681)|682)(14:684|685|(1:687)|688|689|(1:691)|692|809|693|694|(1:696)|697|(1:699)|700)|683|701|(1:882)(7:704|705|(1:707)|708|709|710|711))|586|(4:589|(3:875|591|878)(12:874|592|(3:594|(3:597|598|595)|879)|599|840|600|(1:602)|603|604|834|605|877)|876|587)|873|640|(0)|643|(0)(0)|649|664|(0)|674|(0)|677|(0)(0)|683|701|(0)(0))(10:721|(3:723|(2:726|724)|880)|727|728|(1:730)|731|(1:733)|734|735|736))(10:739|(3:741|(2:744|742)|881)|745|746|(1:748)|749|(1:751)|752|753|754))|361|(4:364|(3:366|367|(2:372|871)(11:373|(3:375|(3:378|379|376)|872)|380|823|381|(1:383)|384|385|813|386|870))(2:370|(0)(0))|387|362)|869|415|(0)(0)|443|788|444|(0)|447|781|448|(0)|451|475|(0)|478|(0)(0)|502|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x1807, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x1808, code lost:
    
        r1 = r1;
        r15 = r15;
        r26 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x182a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x182b, code lost:
    
        r1 = r41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0150 A[PHI: r15
  0x0150: PHI (r15v5 byte) = (r15v4 byte), (r15v95 byte), (r15v92 byte) binds: [B:3:0x0138, B:9:0x014e, B:7:0x014b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x079e A[Catch: all -> 0x033e, TryCatch #11 {all -> 0x033e, blocks: (B:425:0x1892, B:427:0x1898, B:428:0x18c7, B:668:0x2cfc, B:670:0x2d02, B:671:0x2d2d, B:705:0x3062, B:707:0x3068, B:708:0x308d, B:685:0x2e8b, B:687:0x2eae, B:688:0x2f07, B:634:0x29c0, B:636:0x29c6, B:637:0x29eb, B:728:0x316d, B:730:0x3173, B:731:0x319d, B:733:0x31d7, B:734:0x321a, B:518:0x2132, B:520:0x2147, B:521:0x2179, B:523:0x21ad, B:524:0x2227, B:746:0x32df, B:748:0x32e5, B:749:0x3308, B:751:0x3342, B:752:0x3381, B:485:0x1cba, B:487:0x1ccf, B:488:0x1d05, B:469:0x1ab0, B:471:0x1ab6, B:472:0x1ae0, B:291:0x1215, B:293:0x121b, B:294:0x1247, B:205:0x0ccc, B:207:0x0cd2, B:208:0x0d02, B:119:0x0798, B:121:0x079e, B:122:0x07cd, B:21:0x016d, B:23:0x0173, B:24:0x019a, B:26:0x02a9, B:28:0x02db, B:29:0x0338), top: B:786:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0d94 A[Catch: all -> 0x1189, TryCatch #37 {all -> 0x1189, blocks: (B:212:0x0d8e, B:214:0x0d94, B:215:0x0dd2, B:217:0x0ddf, B:219:0x0de8, B:220:0x0e23, B:243:0x104a, B:244:0x104e, B:246:0x1054, B:249:0x106b, B:252:0x1078, B:254:0x107b, B:266:0x1163, B:268:0x1169, B:269:0x116a, B:271:0x116c, B:273:0x1173, B:274:0x1174, B:221:0x0e2e, B:233:0x0f32, B:235:0x0f38, B:236:0x0f7d, B:238:0x0fa7, B:239:0x0fea, B:241:0x1000, B:242:0x1044, B:276:0x1176, B:278:0x117d, B:279:0x117e, B:281:0x1180, B:283:0x1187, B:284:0x1188, B:262:0x10e0, B:257:0x10a7, B:259:0x10ad, B:260:0x10d8, B:228:0x0e9b, B:230:0x0eb7, B:231:0x0f26, B:223:0x0e4e, B:225:0x0e63, B:226:0x0e94), top: B:833:0x0d8e, outer: #9, inners: #17, #22, #27, #32 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0ddf A[Catch: all -> 0x1189, TryCatch #37 {all -> 0x1189, blocks: (B:212:0x0d8e, B:214:0x0d94, B:215:0x0dd2, B:217:0x0ddf, B:219:0x0de8, B:220:0x0e23, B:243:0x104a, B:244:0x104e, B:246:0x1054, B:249:0x106b, B:252:0x1078, B:254:0x107b, B:266:0x1163, B:268:0x1169, B:269:0x116a, B:271:0x116c, B:273:0x1173, B:274:0x1174, B:221:0x0e2e, B:233:0x0f32, B:235:0x0f38, B:236:0x0f7d, B:238:0x0fa7, B:239:0x0fea, B:241:0x1000, B:242:0x1044, B:276:0x1176, B:278:0x117d, B:279:0x117e, B:281:0x1180, B:283:0x1187, B:284:0x1188, B:262:0x10e0, B:257:0x10a7, B:259:0x10ad, B:260:0x10d8, B:228:0x0e9b, B:230:0x0eb7, B:231:0x0f26, B:223:0x0e4e, B:225:0x0e63, B:226:0x0e94), top: B:833:0x0d8e, outer: #9, inners: #17, #22, #27, #32 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0e2e A[Catch: all -> 0x1189, TRY_LEAVE, TryCatch #37 {all -> 0x1189, blocks: (B:212:0x0d8e, B:214:0x0d94, B:215:0x0dd2, B:217:0x0ddf, B:219:0x0de8, B:220:0x0e23, B:243:0x104a, B:244:0x104e, B:246:0x1054, B:249:0x106b, B:252:0x1078, B:254:0x107b, B:266:0x1163, B:268:0x1169, B:269:0x116a, B:271:0x116c, B:273:0x1173, B:274:0x1174, B:221:0x0e2e, B:233:0x0f32, B:235:0x0f38, B:236:0x0f7d, B:238:0x0fa7, B:239:0x0fea, B:241:0x1000, B:242:0x1044, B:276:0x1176, B:278:0x117d, B:279:0x117e, B:281:0x1180, B:283:0x1187, B:284:0x1188, B:262:0x10e0, B:257:0x10a7, B:259:0x10ad, B:260:0x10d8, B:228:0x0e9b, B:230:0x0eb7, B:231:0x0f26, B:223:0x0e4e, B:225:0x0e63, B:226:0x0e94), top: B:833:0x0d8e, outer: #9, inners: #17, #22, #27, #32 }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x1054 A[Catch: all -> 0x1189, TryCatch #37 {all -> 0x1189, blocks: (B:212:0x0d8e, B:214:0x0d94, B:215:0x0dd2, B:217:0x0ddf, B:219:0x0de8, B:220:0x0e23, B:243:0x104a, B:244:0x104e, B:246:0x1054, B:249:0x106b, B:252:0x1078, B:254:0x107b, B:266:0x1163, B:268:0x1169, B:269:0x116a, B:271:0x116c, B:273:0x1173, B:274:0x1174, B:221:0x0e2e, B:233:0x0f32, B:235:0x0f38, B:236:0x0f7d, B:238:0x0fa7, B:239:0x0fea, B:241:0x1000, B:242:0x1044, B:276:0x1176, B:278:0x117d, B:279:0x117e, B:281:0x1180, B:283:0x1187, B:284:0x1188, B:262:0x10e0, B:257:0x10a7, B:259:0x10ad, B:260:0x10d8, B:228:0x0e9b, B:230:0x0eb7, B:231:0x0f26, B:223:0x0e4e, B:225:0x0e63, B:226:0x0e94), top: B:833:0x0d8e, outer: #9, inners: #17, #22, #27, #32 }] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x1345  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x13a6  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x1400  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0342 A[PHI: r15
  0x0342: PHI (r15v90 byte) = (r15v5 byte), (r15v93 byte), (r15v94 byte) binds: [B:19:0x0168, B:9:0x014e, B:7:0x014b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x16be  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x16fb  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x1700 A[Catch: all -> 0x1823, PHI: r3 r4 r5 r6
  0x1700: PHI (r3v531 java.lang.Object[]) = (r3v530 java.lang.Object[]), (r3v548 java.lang.Object[]) binds: [B:371:0x16f9, B:368:0x16e1] A[DONT_GENERATE, DONT_INLINE]
  0x1700: PHI (r4v434 char) = (r4v433 char), (r4v454 char) binds: [B:371:0x16f9, B:368:0x16e1] A[DONT_GENERATE, DONT_INLINE]
  0x1700: PHI (r5v504 int) = (r5v503 int), (r5v518 int) binds: [B:371:0x16f9, B:368:0x16e1] A[DONT_GENERATE, DONT_INLINE]
  0x1700: PHI (r6v460 int) = (r6v459 int), (r6v475 int) binds: [B:371:0x16f9, B:368:0x16e1] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x1823, blocks: (B:361:0x16b4, B:362:0x16b8, B:373:0x1700, B:370:0x16e4, B:332:0x141f, B:349:0x1582, B:352:0x15d5, B:357:0x1650, B:360:0x16ae), top: B:768:0x141f }] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x1898 A[Catch: all -> 0x033e, TryCatch #11 {all -> 0x033e, blocks: (B:425:0x1892, B:427:0x1898, B:428:0x18c7, B:668:0x2cfc, B:670:0x2d02, B:671:0x2d2d, B:705:0x3062, B:707:0x3068, B:708:0x308d, B:685:0x2e8b, B:687:0x2eae, B:688:0x2f07, B:634:0x29c0, B:636:0x29c6, B:637:0x29eb, B:728:0x316d, B:730:0x3173, B:731:0x319d, B:733:0x31d7, B:734:0x321a, B:518:0x2132, B:520:0x2147, B:521:0x2179, B:523:0x21ad, B:524:0x2227, B:746:0x32df, B:748:0x32e5, B:749:0x3308, B:751:0x3342, B:752:0x3381, B:485:0x1cba, B:487:0x1ccf, B:488:0x1d05, B:469:0x1ab0, B:471:0x1ab6, B:472:0x1ae0, B:291:0x1215, B:293:0x121b, B:294:0x1247, B:205:0x0ccc, B:207:0x0cd2, B:208:0x0d02, B:119:0x0798, B:121:0x079e, B:122:0x07cd, B:21:0x016d, B:23:0x0173, B:24:0x019a, B:26:0x02a9, B:28:0x02db, B:29:0x0338), top: B:786:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:442:0x1967  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x197e A[Catch: all -> 0x1a44, TryCatch #13 {all -> 0x1a44, blocks: (B:444:0x1969, B:446:0x197e, B:447:0x19ad), top: B:788:0x1969, outer: #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:450:0x19c0 A[Catch: all -> 0x1a3a, TryCatch #8 {all -> 0x1a3a, blocks: (B:448:0x19b3, B:450:0x19c0, B:451:0x1a32), top: B:781:0x19b3, outer: #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:477:0x1b78  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x1bcc  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x1c9a  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x1e4c  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x2a75  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x2ac8  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x2b21  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x2cdb  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x2dc1  */
    /* JADX WARN: Removed duplicated region for block: B:679:0x2e16  */
    /* JADX WARN: Removed duplicated region for block: B:684:0x2e6d  */
    /* JADX WARN: Removed duplicated region for block: B:704:0x3042  */
    /* JADX WARN: Removed duplicated region for block: B:739:0x329c  */
    /* JADX WARN: Removed duplicated region for block: B:800:0x194e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:842:0x12d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:882:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r13v103 */
    /* JADX WARN: Type inference failed for: r13v104 */
    /* JADX WARN: Type inference failed for: r13v116 */
    /* JADX WARN: Type inference failed for: r13v117 */
    /* JADX WARN: Type inference failed for: r13v124 */
    /* JADX WARN: Type inference failed for: r13v125 */
    /* JADX WARN: Type inference failed for: r13v126 */
    /* JADX WARN: Type inference failed for: r13v127 */
    /* JADX WARN: Type inference failed for: r13v128 */
    /* JADX WARN: Type inference failed for: r13v129 */
    /* JADX WARN: Type inference failed for: r13v130 */
    /* JADX WARN: Type inference failed for: r13v131 */
    /* JADX WARN: Type inference failed for: r13v132 */
    /* JADX WARN: Type inference failed for: r13v133 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v93 */
    /* JADX WARN: Type inference failed for: r13v94 */
    /* JADX WARN: Type inference failed for: r13v95 */
    /* JADX WARN: Type inference failed for: r13v96 */
    /* JADX WARN: Type inference failed for: r13v97 */
    /* JADX WARN: Type inference failed for: r13v98 */
    /* JADX WARN: Type inference failed for: r13v99 */
    /* JADX WARN: Type inference failed for: r15v100 */
    /* JADX WARN: Type inference failed for: r15v101 */
    /* JADX WARN: Type inference failed for: r15v102 */
    /* JADX WARN: Type inference failed for: r15v103 */
    /* JADX WARN: Type inference failed for: r15v104 */
    /* JADX WARN: Type inference failed for: r15v105 */
    /* JADX WARN: Type inference failed for: r15v106 */
    /* JADX WARN: Type inference failed for: r15v107 */
    /* JADX WARN: Type inference failed for: r15v108 */
    /* JADX WARN: Type inference failed for: r15v109 */
    /* JADX WARN: Type inference failed for: r15v110 */
    /* JADX WARN: Type inference failed for: r15v111 */
    /* JADX WARN: Type inference failed for: r15v112 */
    /* JADX WARN: Type inference failed for: r15v113 */
    /* JADX WARN: Type inference failed for: r15v114 */
    /* JADX WARN: Type inference failed for: r15v115 */
    /* JADX WARN: Type inference failed for: r15v116 */
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
    /* JADX WARN: Type inference failed for: r15v24 */
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
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v49 */
    /* JADX WARN: Type inference failed for: r15v57 */
    /* JADX WARN: Type inference failed for: r15v58 */
    /* JADX WARN: Type inference failed for: r15v59 */
    /* JADX WARN: Type inference failed for: r15v60 */
    /* JADX WARN: Type inference failed for: r15v62 */
    /* JADX WARN: Type inference failed for: r15v65 */
    /* JADX WARN: Type inference failed for: r15v66 */
    /* JADX WARN: Type inference failed for: r15v68 */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v73 */
    /* JADX WARN: Type inference failed for: r15v77 */
    /* JADX WARN: Type inference failed for: r15v78 */
    /* JADX WARN: Type inference failed for: r15v79 */
    /* JADX WARN: Type inference failed for: r15v84 */
    /* JADX WARN: Type inference failed for: r15v86 */
    /* JADX WARN: Type inference failed for: r15v87 */
    /* JADX WARN: Type inference failed for: r15v96 */
    /* JADX WARN: Type inference failed for: r15v97 */
    /* JADX WARN: Type inference failed for: r15v98 */
    /* JADX WARN: Type inference failed for: r15v99 */
    /* JADX WARN: Type inference failed for: r1v387 */
    /* JADX WARN: Type inference failed for: r1v401 */
    /* JADX WARN: Type inference failed for: r1v402 */
    /* JADX WARN: Type inference failed for: r1v412, types: [int] */
    /* JADX WARN: Type inference failed for: r1v413 */
    /* JADX WARN: Type inference failed for: r1v414 */
    /* JADX WARN: Type inference failed for: r1v415 */
    /* JADX WARN: Type inference failed for: r1v416 */
    /* JADX WARN: Type inference failed for: r1v417 */
    /* JADX WARN: Type inference failed for: r1v418 */
    /* JADX WARN: Type inference failed for: r1v425 */
    /* JADX WARN: Type inference failed for: r1v609 */
    /* JADX WARN: Type inference failed for: r1v610 */
    /* JADX WARN: Type inference failed for: r1v611 */
    /* JADX WARN: Type inference failed for: r1v612 */
    /* JADX WARN: Type inference failed for: r1v613 */
    /* JADX WARN: Type inference failed for: r1v614 */
    /* JADX WARN: Type inference failed for: r1v615 */
    /* JADX WARN: Type inference failed for: r1v74 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v77 */
    /* JADX WARN: Type inference failed for: r26v176 */
    /* JADX WARN: Type inference failed for: r26v177 */
    /* JADX WARN: Type inference failed for: r26v178 */
    /* JADX WARN: Type inference failed for: r26v179 */
    /* JADX WARN: Type inference failed for: r26v180 */
    /* JADX WARN: Type inference failed for: r26v21 */
    /* JADX WARN: Type inference failed for: r26v22 */
    /* JADX WARN: Type inference failed for: r26v23 */
    /* JADX WARN: Type inference failed for: r26v68 */
    /* JADX WARN: Type inference failed for: r26v69 */
    /* JADX WARN: Type inference failed for: r26v70 */
    /* JADX WARN: Type inference failed for: r26v71 */
    /* JADX WARN: Type inference failed for: r26v72 */
    /* JADX WARN: Type inference failed for: r26v73 */
    /* JADX WARN: Type inference failed for: r26v75 */
    /* JADX WARN: Type inference failed for: r26v76 */
    /* JADX WARN: Type inference failed for: r26v81 */
    /* JADX WARN: Type inference failed for: r26v82 */
    /* JADX WARN: Type inference failed for: r26v83 */
    /* JADX WARN: Type inference failed for: r26v84 */
    /* JADX WARN: Type inference failed for: r2v533, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v537 */
    /* JADX WARN: Type inference failed for: r2v566 */
    /* JADX WARN: Type inference failed for: r2v567 */
    /* JADX WARN: Type inference failed for: r2v581, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v589 */
    /* JADX WARN: Type inference failed for: r2v782 */
    /* JADX WARN: Type inference failed for: r2v783 */
    /* JADX WARN: Type inference failed for: r2v80 */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r7v113 */
    /* JADX WARN: Type inference failed for: r7v143, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v269 */
    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v58, types: [java.lang.String] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinConfirmPinActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$6zF49JKoD67SGc78P6FvIe8A_cA(ResetPinConfirmPinActivity resetPinConfirmPinActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 47;
        equals = i2 % 128;
        int i3 = i2 % 2;
        resetPinConfirmPinActivity.lambda$addObserve$0(resource);
        int i4 = getRequestBeneficiariesState + 39;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
    }

    public static void $r8$lambda$XbC7dLUSxL0oWa8Xr0jbrtcBBDw(ResetPinConfirmPinActivity resetPinConfirmPinActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = equals + 49;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        resetPinConfirmPinActivity.lambda$observerPinLogin$1(resource);
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 67;
        equals = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = getRequestBeneficiariesState + 41;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
    }
}
