package com.huawei.digitalpayment.consumer.mpin.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.Editable;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Observer;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.fastjson.parser.JSONLexer;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.baselibs2.utils.encrypt.EncryptManager;
import com.huawei.biometric.util.BiometricHelper2;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.safe.SafeUri;
import com.huawei.common.widget.MPTextWatcher;
import com.huawei.common.widget.toast.CommonToast;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.databinding.ActivityBasePinBinding;
import com.huawei.digitalpayment.consumer.baselib.http.HttpStatus;
import com.huawei.digitalpayment.consumer.baselib.init.TokenHelper;
import com.huawei.digitalpayment.consumer.baselib.pin.model.PinType;
import com.huawei.digitalpayment.consumer.baselib.service.ICommonService;
import com.huawei.digitalpayment.consumer.baselib.service.ILoginService;
import com.huawei.digitalpayment.consumer.baselib.util.encrypt.EncryptUtils;
import com.huawei.digitalpayment.consumer.constants.Keys;
import com.huawei.digitalpayment.consumer.login.R;
import com.huawei.digitalpayment.consumer.login.util.LoginUtils;
import com.huawei.digitalpayment.consumer.login.util.MaximunDialogUtils;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model.SmsCodeType;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType;
import com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ChangePinViewModel;
import com.huawei.digitalpayment.consumer.loginModule.register.request.ChangePinParams;
import com.huawei.digitalpayment.consumer.loginModule.register.request.VerifyConfig;
import com.huawei.digitalpayment.consumer.service.ILoginModuleService;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;
import com.huawei.payment.mvvm.Utils;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.cancelAll;
import kotlin.getActiveNotifications;
import org.bouncycastle.crypto.signers.PSSSigner;

public class ChangePinConfirmPinActivity extends Hilt_ChangePinConfirmPinActivity<ActivityBasePinBinding, ChangePinViewModel> {
    private static int[] ShareDataUIState;
    private static char[] component1;
    private static char component2;
    private static long component3;
    private static int equals;
    private String newToken;
    private boolean supportForgetPin = false;
    private static final byte[] $$c = {118, 33, 67, 92};
    private static final int $$f = 197;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {80, 83, -21, -55, 10, -4, 1, -3, -3, -11, 7, 4, PSSSigner.TRAILER_IMPLICIT, 10, -4, 1, -3, -3, -11, 7, 4, -67, 10, -4, -65, 68, -20, 17, -8, -3, -1, -4, 0, -67, 70, -15, -6, Ascii.DLE, -9, -17, 4, -4, Ascii.VT, -16, 9, 3, -3, -12, 3, -12, 3, -8, -4, 17, -7, 1, -70, 34, -48, 70, -13, Ascii.SYN, -12, 4, -3, 10, -1, 7, -23, -1, -1, -7, Ascii.DC2, -11, 6};
    private static final int $$n = 172;
    private static final byte[] $$a = {84, 79, Ascii.SYN, 41, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -12, Ascii.FF, -19, -15, -20, -6, -11, -7, -7, 1, -17, -14, 59, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$b = 79;
    private static int getAsAtTimestamp = 0;
    private static int copydefault = 0;
    private static int component4 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(short r6, byte r7, short r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinConfirmPinActivity.$$c
            int r7 = 119 - r7
            int r6 = r6 + 4
            int r8 = r8 * 3
            int r8 = 1 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            int r6 = r6 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinConfirmPinActivity.$$i(short, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r7 + 4
            int r6 = 100 - r6
            int r8 = r8 * 2
            int r8 = 103 - r8
            byte[] r1 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinConfirmPinActivity.$$a
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = 0
            if (r1 != 0) goto L15
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2a
        L15:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r1[r8]
        L2a:
            int r3 = -r3
            int r6 = r6 + r3
            int r8 = r8 + 1
            int r6 = r6 + (-8)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinConfirmPinActivity.d(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void f(byte r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinConfirmPinActivity.$$m
            int r7 = 44 - r7
            int r8 = r8 * 3
            int r8 = 99 - r8
            int r9 = 65 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r9
            r4 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L22:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L28:
            int r9 = r9 + r8
            int r8 = r9 + 2
            int r9 = r3 + 1
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinConfirmPinActivity.f(byte, byte, int, java.lang.Object[]):void");
    }

    static ViewDataBinding access$000(ChangePinConfirmPinActivity changePinConfirmPinActivity) {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = changePinConfirmPinActivity.binding;
        if (i3 != 0) {
            return binding;
        }
        throw null;
    }

    private static void e(int i, char[] cArr, Object[] objArr) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component3 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (true) {
            obj = null;
            if (iTrustedWebActivityServiceDefault.copydefault >= cArrComponent2.length) {
                break;
            }
            int i3 = $10 + 93;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component3)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - View.MeasureSpec.getMode(0), 34 - ExpandableListView.getPackedPositionType(0L), (char) (View.getDefaultSize(0, 0) + 63440), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) (-1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1389 - ((byte) KeyEvent.getModifierMetaStateMask()), TextUtils.lastIndexOf("", '0') + 19, (char) (51270 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), -1883291598, false, $$i(b2, (byte) (b2 & Ascii.DLE), (byte) 0), new Class[]{Object.class, Object.class});
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
        String str = new String(cArrComponent2, 4, cArrComponent2.length - 4);
        int i6 = $10 + 19;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    private static void b(int i, int[] iArr, Object[] objArr) throws Throwable {
        int[] iArr2;
        int i2;
        int length;
        int[] iArr3;
        int i3 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = ShareDataUIState;
        int i4 = 684241640;
        int i5 = -1;
        int i6 = 1;
        int i7 = 0;
        if (iArr4 != null) {
            int i8 = $11 + 83;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length = iArr4.length;
                iArr3 = new int[length];
            } else {
                length = iArr4.length;
                iArr3 = new int[length];
            }
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = new Object[i6];
                    objArr2[0] = Integer.valueOf(iArr4[i9]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i5;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4391 - (ViewConfiguration.getLongPressTimeout() >> 16), 37 - TextUtils.getOffsetAfter("", 0), (char) Gravity.getAbsoluteGravity(0, 0), -309236339, false, $$i(b2, (byte) (b2 & 13), (byte) 0), new Class[]{Integer.TYPE});
                    }
                    iArr3[i9] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i9++;
                    i4 = 684241640;
                    i5 = -1;
                    i6 = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr4 = iArr3;
        }
        int length2 = iArr4.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = ShareDataUIState;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                try {
                    Object[] objArr3 = new Object[1];
                    objArr3[i7] = Integer.valueOf(iArr6[i10]);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault2 == null) {
                        int i11 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 4390;
                        int iMyTid = 37 - (Process.myTid() >> 22);
                        char c2 = (char) (ExpandableListView.getPackedPositionForGroup(i7) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i7) == 0L ? 0 : -1));
                        byte b3 = (byte) (-1);
                        iArr2 = iArr6;
                        i2 = length3;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i11, iMyTid, c2, -309236339, false, $$i(b3, (byte) (b3 & 13), (byte) 0), new Class[]{Integer.TYPE});
                    } else {
                        iArr2 = iArr6;
                        i2 = length3;
                    }
                    iArr7[i10] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    i10++;
                    int i12 = $11 + 47;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    iArr6 = iArr2;
                    length3 = i2;
                    i7 = 0;
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
        int i14 = i7;
        System.arraycopy(iArr6, i14, iArr5, i14, length2);
        getactivenotifications.component1 = i14;
        while (getactivenotifications.component1 < iArr.length) {
            int i15 = $10 + 33;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            cArr[0] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr5);
            int i17 = 0;
            for (int i18 = 16; i17 < i18; i18 = 16) {
                getactivenotifications.ShareDataUIState ^= iArr5[i17];
                try {
                    Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) (-1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2967, 17 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (49870 - TextUtils.lastIndexOf("", '0')), 462826032, false, $$i(b4, (byte) (b4 & Ascii.SI), (byte) 0), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                    getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                    getactivenotifications.component2 = iIntValue;
                    i17++;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            int i19 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i19;
            getactivenotifications.component2 ^= iArr5[16];
            getactivenotifications.ShareDataUIState ^= iArr5[17];
            int i20 = getactivenotifications.ShareDataUIState;
            int i21 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr5);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr5 = {getactivenotifications, getactivenotifications};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault4 == null) {
                byte b5 = (byte) (-1);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2944, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 24, (char) (27636 - TextUtils.lastIndexOf("", '0')), -1616366948, false, $$i(b5, (byte) (b5 & Ascii.FF), (byte) 0), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void c(int i, char[] cArr, byte b2, Object[] objArr) throws Throwable {
        int i2;
        char c2;
        Object obj;
        long j;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = component1;
        int i4 = 64291;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7422 - Gravity.getAbsoluteGravity(0, 0), 15 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (i4 - TextUtils.indexOf("", "", 0)), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i5++;
                    int i6 = $11 + 89;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    i4 = 64291;
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
        Object[] objArr3 = {Integer.valueOf(component2)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        long j2 = 0;
        char c3 = '\b';
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 7423, Color.alpha(0) + 15, (char) (64291 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i8 = $10 + 31;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                i2 = i + 49;
                cArr4[i2] = (char) (cArr[i2] >>> b2);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i9 = $11 + 77;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cancelall.component2 = 1;
            } else {
                cancelall.component2 = 0;
            }
            while (cancelall.component2 < i2) {
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    c2 = c3;
                    obj = obj2;
                    j = j2;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = cancelall;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = cancelall;
                    objArr4[9] = cancelall;
                    objArr4[c3] = Integer.valueOf(cCharValue);
                    objArr4[7] = cancelall;
                    objArr4[6] = cancelall;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = cancelall;
                    objArr4[3] = cancelall;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[1] = cancelall;
                    objArr4[0] = cancelall;
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault3 == null) {
                        int iArgb = Color.argb(0, 0, 0, 0) + 7117;
                        int gidForName = 13 - Process.getGidForName("");
                        char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 44463);
                        Class[] clsArr = new Class[13];
                        clsArr[0] = Object.class;
                        clsArr[1] = Object.class;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Object.class;
                        clsArr[4] = Object.class;
                        clsArr[5] = Integer.TYPE;
                        clsArr[6] = Object.class;
                        clsArr[7] = Object.class;
                        clsArr[c3] = Integer.TYPE;
                        clsArr[9] = Object.class;
                        clsArr[10] = Object.class;
                        clsArr[11] = Integer.TYPE;
                        clsArr[12] = Object.class;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iArgb, gidForName, cResolveSizeAndState, 1150140696, false, "x", clsArr);
                    }
                    if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                        Object[] objArr5 = new Object[11];
                        objArr5[10] = cancelall;
                        objArr5[9] = Integer.valueOf(cCharValue);
                        objArr5[c3] = cancelall;
                        objArr5[7] = Integer.valueOf(cCharValue);
                        objArr5[6] = Integer.valueOf(cCharValue);
                        objArr5[5] = cancelall;
                        objArr5[4] = cancelall;
                        objArr5[3] = Integer.valueOf(cCharValue);
                        objArr5[2] = Integer.valueOf(cCharValue);
                        objArr5[1] = cancelall;
                        objArr5[0] = cancelall;
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault4 == null) {
                            j = 0;
                            int i10 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2943;
                            int offsetBefore = 24 - TextUtils.getOffsetBefore("", 0);
                            char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 27638);
                            byte b3 = (byte) (-1);
                            byte b4 = (byte) (b3 + 1);
                            String str$$i = $$i(b3, b4, b4);
                            c2 = '\b';
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i10, offsetBefore, bitsPerPixel, 794909189, false, str$$i, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c2 = c3;
                            j = 0;
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                        int i11 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr2[i11];
                    } else {
                        c2 = c3;
                        obj = null;
                        j = 0;
                        if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i12 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i13 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[i12];
                            cArr4[cancelall.component2 + 1] = cArr2[i13];
                        } else {
                            int i14 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i15 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr2[i14];
                            cArr4[cancelall.component2 + 1] = cArr2[i15];
                        }
                    }
                }
                cancelall.component2 += 2;
                obj2 = obj;
                c3 = c2;
                j2 = j;
            }
        }
        int i16 = 0;
        while (i16 < i) {
            int i17 = $11 + 45;
            $10 = i17 % 128;
            if (i17 % 2 != 0) {
                cArr4[i16] = (char) (cArr4[i16] ^ 6001);
                i16 += 101;
            } else {
                cArr4[i16] = (char) (cArr4[i16] ^ 13722);
                i16++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00c2  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3103
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinConfirmPinActivity.onCreate(android.os.Bundle):void");
    }

    private void lambda$addObserve$0(Resource resource) {
        int i = 2 % 2;
        Utils.showOrHideLoading(this, resource);
        if (resource.error()) {
            if (((ICommonService) RouteUtils.getService(ICommonService.class)).dealError(this, resource.getException())) {
                return;
            }
            ((ActivityBasePinBinding) this.binding).etCode.showError(resource.getMessage());
            ((ActivityBasePinBinding) this.binding).etCode.clear();
            if (HttpStatus.CONSUMER_PIN_ERROR_MAXIMUM.equals(resource.getException().getResponseCode())) {
                MaximunDialogUtils.INSTANCE.showMaximunDialog(this, this.supportForgetPin);
                return;
            }
            return;
        }
        if (!resource.success()) {
            return;
        }
        int i2 = component4 + 5;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (!((ILoginService) RouteUtils.getService(ILoginService.class)).isLogin()) {
            int i4 = component4 + 17;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                autoLogin();
                return;
            } else {
                autoLogin();
                int i5 = 85 / 0;
                return;
            }
        }
        if (!TextUtils.isEmpty(this.newToken)) {
            TokenHelper.INSTANCE.saveTokenToSp(this.newToken);
        }
        BiometricHelper2.getInstance().closeFingerprintPay();
        BiometricHelper2.getInstance().closeFaceIdPay();
        RouteUtils.routeWithExecute(RoutePathConstants.MAIN);
        int i6 = copydefault + 11;
        component4 = i6 % 128;
        int i7 = i6 % 2;
    }

    private void addObserve() {
        int i = 2 % 2;
        ((ActivityBasePinBinding) this.binding).etCode.addTextChangedListener(new MPTextWatcher() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public void afterTextChanged(Editable editable) {
                int i2 = 2 % 2;
                super.afterTextChanged(editable);
                if (!TextUtils.isEmpty(editable)) {
                    ((ActivityBasePinBinding) ChangePinConfirmPinActivity.access$000(ChangePinConfirmPinActivity.this)).etCode.setError(false);
                    int i3 = component3 + 85;
                    copydefault = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 5 % 4;
                    }
                }
                int i5 = component3 + 111;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        ((ChangePinViewModel) this.viewModel).getData().observe(this, new Observer() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 37;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                ChangePinConfirmPinActivity.m10747$r8$lambda$K7tm4CV4iuoRVjJElgpJFvu0tg(this.f$0, (Resource) obj);
                int i5 = component3 + 15;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        observerPinLogin();
        int i2 = component4 + 3;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private void autoLogin() {
        int i = 2 % 2;
        ((ILoginModuleService) RouteUtils.getService(ILoginModuleService.class)).autoLogin(new ApiCallback<BaseResp>() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 33;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                copydefault(baseResp);
                int i5 = component2 + 69;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            public void copydefault(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component1 + 27;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    ChangePinConfirmPinActivity.m10748$$Nest$mloginSuccess(ChangePinConfirmPinActivity.this, (LocalLoginInfo) baseResp);
                } else {
                    ChangePinConfirmPinActivity.m10748$$Nest$mloginSuccess(ChangePinConfirmPinActivity.this, (LocalLoginInfo) baseResp);
                    throw null;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component2 + 119;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Object obj = null;
                CommonToast.showText(baseException.getMessage());
                if (i4 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i5 = component1 + 57;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        int i2 = copydefault + 9;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private void loginSuccess(LocalLoginInfo localLoginInfo) {
        int i = 2 % 2;
        int i2 = component4 + 69;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (!TextUtils.isEmpty(localLoginInfo.getExecute())) {
            Uri uri = SafeUri.parse(localLoginInfo.getExecute());
            if (uri == null) {
                return;
            }
            if (TextUtils.equals(uri.getPath(), "/loginModule/otpVerifyNewDevice")) {
                RouteUtils.routeWithExecute(this, localLoginInfo.getExecute() + "?smsCodeType=" + SmsCodeType.NEW_DEVICE_SMS_CODE.getSmsCode());
                return;
            }
            RouteUtils.routeWithExecute(this, localLoginInfo.getExecute());
            return;
        }
        int i4 = component4 + 115;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            LoginUtils.guideOpenBiometricLogin(((ActivityBasePinBinding) this.binding).etCode.getText().toString(), localLoginInfo);
            return;
        }
        LoginUtils.guideOpenBiometricLogin(((ActivityBasePinBinding) this.binding).etCode.getText().toString(), localLoginInfo);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void observerPinLogin() {
        int i = 2 % 2;
        ((ChangePinViewModel) this.viewModel).getPinLoginData().observe(this, new Observer() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 59;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                ChangePinConfirmPinActivity.$r8$lambda$a1s1ixo0qIAcOwMEuVpe3rsHBdg(this.f$0, (Resource) obj);
                if (i4 != 0) {
                    int i5 = 96 / 0;
                }
            }
        });
        int i2 = copydefault + 17;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    private void lambda$observerPinLogin$1(Resource resource) {
        int i = 2 % 2;
        int i2 = component4 + 89;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Utils.showOrHideLoading(this, resource);
        if (!(!resource.error())) {
            ((ActivityBasePinBinding) this.binding).etCode.showError(resource.getMessage());
            ((ActivityBasePinBinding) this.binding).etCode.clear();
        }
        if (resource.success()) {
            loginSuccess((LocalLoginInfo) resource.getData());
        }
        int i4 = component4 + 9;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void onConfirmClick(String str) {
        String verifyType;
        int i = 2 % 2;
        String strDecrypt = EncryptManager.INSTANCE.decrypt(getIntent().getStringExtra("creationPin"));
        String strDecrypt2 = EncryptManager.INSTANCE.decrypt(getIntent().getStringExtra("oldPin"));
        if (!TextUtils.equals(strDecrypt, str)) {
            ((ActivityBasePinBinding) this.binding).etCode.showError(getString(R.string.pinmanage_changepin_tips5));
            ((ActivityBasePinBinding) this.binding).etCode.clear();
            return;
        }
        if (getIntent().hasExtra(Keys.VERIFY_TYPE)) {
            int i2 = component4 + 7;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            verifyType = ((VerifyType) getIntent().getParcelableExtra(Keys.VERIFY_TYPE)).getVerifyType();
        } else {
            verifyType = null;
        }
        ChangePinParams changePinParams = new ChangePinParams(EncryptUtils.encryptWithPinKey(strDecrypt2), EncryptUtils.encryptWithPinKey(strDecrypt), TextUtils.isEmpty(verifyType) ? null : new VerifyConfig(verifyType));
        if (!TextUtils.isEmpty(this.newToken)) {
            changePinParams.addParams("token", this.newToken);
            int i4 = copydefault + 27;
            component4 = i4 % 128;
            int i5 = i4 % 2;
        }
        ((ChangePinViewModel) this.viewModel).changePin(changePinParams);
    }

    @Override
    public PinType getPinType() {
        int i = 2 % 2;
        PinType pinType = new PinType(getString(R.string.pinmanage_changepin_title3), getString(R.string.pinmanage_changepin_tips3, new Object[]{String.valueOf(AppConfigManager.getAppConfig().getPinLimit())}), "", getString(R.string.pinmanage_changepin_button3));
        int i2 = copydefault + 41;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return pinType;
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = copydefault + 89;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i4 = copydefault + 63;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            b(TextUtils.getOffsetAfter("", 0) + 26, new int[]{-231805971, -1028914333, -1554554130, -1542506671, -1264722532, 708313509, 613011844, -675806237, -2006961470, 284101508, 1234190389, -640626572, -875471198, 170540048}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            c(18 - View.resolveSizeAndState(0, 0, 0), new char[]{27, 0, 13821, 13821, '\"', ')', 17, '*', 13823, 13823, '\n', '$', JSONLexer.EOI, '#', 17, '#', '\"', 28}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952716_res_0x7f13044c).substring(6, 7).length() + 20), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i6 = component4 + 75;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getFadingEdgeLength() >> 16) + 42, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 56, (char) TextUtils.indexOf("", "", 0), -699576857, false, "component2", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c5  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinConfirmPinActivity.onPause():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1098:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0954 A[Catch: all -> 0x0407, TryCatch #71 {all -> 0x0407, blocks: (B:149:0x094e, B:151:0x0954, B:153:0x0983, B:238:0x0e71, B:240:0x0e77, B:241:0x0ea6, B:388:0x1552, B:390:0x1558, B:391:0x157f, B:512:0x1afb, B:514:0x1b01, B:515:0x1b32, B:818:0x30ee, B:820:0x30f4, B:821:0x3123, B:853:0x3435, B:855:0x343b, B:856:0x3469, B:896:0x37ef, B:898:0x37f5, B:899:0x3818, B:876:0x3625, B:878:0x3648, B:879:0x36a3, B:656:0x2930, B:658:0x2936, B:659:0x295a, B:661:0x2994, B:662:0x29df, B:624:0x259f, B:626:0x25b4, B:627:0x25e3, B:629:0x2617, B:630:0x269a, B:601:0x222b, B:603:0x2231, B:604:0x2260, B:606:0x229a, B:607:0x22eb, B:574:0x1f46, B:576:0x1f5b, B:577:0x1f8b, B:558:0x1d2e, B:560:0x1d34, B:561:0x1d5d, B:19:0x01e4, B:21:0x01ea, B:22:0x0213, B:24:0x0378, B:26:0x03aa, B:27:0x0401), top: B:1058:0x01e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0982  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0a0a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0a62  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0b2b A[Catch: all -> 0x0de5, TRY_ENTER, TRY_LEAVE, TryCatch #58 {all -> 0x0de5, blocks: (B:157:0x0a04, B:164:0x0a55, B:180:0x0b2b), top: B:1033:0x0a04 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0cea  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0e77 A[Catch: all -> 0x0407, TryCatch #71 {all -> 0x0407, blocks: (B:149:0x094e, B:151:0x0954, B:153:0x0983, B:238:0x0e71, B:240:0x0e77, B:241:0x0ea6, B:388:0x1552, B:390:0x1558, B:391:0x157f, B:512:0x1afb, B:514:0x1b01, B:515:0x1b32, B:818:0x30ee, B:820:0x30f4, B:821:0x3123, B:853:0x3435, B:855:0x343b, B:856:0x3469, B:896:0x37ef, B:898:0x37f5, B:899:0x3818, B:876:0x3625, B:878:0x3648, B:879:0x36a3, B:656:0x2930, B:658:0x2936, B:659:0x295a, B:661:0x2994, B:662:0x29df, B:624:0x259f, B:626:0x25b4, B:627:0x25e3, B:629:0x2617, B:630:0x269a, B:601:0x222b, B:603:0x2231, B:604:0x2260, B:606:0x229a, B:607:0x22eb, B:574:0x1f46, B:576:0x1f5b, B:577:0x1f8b, B:558:0x1d2e, B:560:0x1d34, B:561:0x1d5d, B:19:0x01e4, B:21:0x01ea, B:22:0x0213, B:24:0x0378, B:26:0x03aa, B:27:0x0401), top: B:1058:0x01e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0f31  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0f84 A[Catch: all -> 0x14ef, PHI: r1 r24
  0x0f84: PHI (r1v476 java.lang.Object) = (r1v475 java.lang.Object), (r1v515 java.lang.Object) binds: [B:246:0x0f2f, B:248:0x0f34] A[DONT_GENERATE, DONT_INLINE]
  0x0f84: PHI (r24v75 ??) = (r24v156 ??), (r24v157 ??) binds: [B:246:0x0f2f, B:248:0x0f34] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #63 {all -> 0x14ef, blocks: (B:245:0x0f2b, B:252:0x0f84), top: B:1042:0x0f2b }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0fab  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0ffe  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x1014  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x1071  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x1399 A[Catch: all -> 0x14cb, TryCatch #33 {all -> 0x14cb, blocks: (B:326:0x138f, B:327:0x1393, B:329:0x1399, B:332:0x13b6, B:317:0x12ba, B:322:0x1326, B:325:0x1387), top: B:989:0x12ba }] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x1558 A[Catch: all -> 0x0407, TryCatch #71 {all -> 0x0407, blocks: (B:149:0x094e, B:151:0x0954, B:153:0x0983, B:238:0x0e71, B:240:0x0e77, B:241:0x0ea6, B:388:0x1552, B:390:0x1558, B:391:0x157f, B:512:0x1afb, B:514:0x1b01, B:515:0x1b32, B:818:0x30ee, B:820:0x30f4, B:821:0x3123, B:853:0x3435, B:855:0x343b, B:856:0x3469, B:896:0x37ef, B:898:0x37f5, B:899:0x3818, B:876:0x3625, B:878:0x3648, B:879:0x36a3, B:656:0x2930, B:658:0x2936, B:659:0x295a, B:661:0x2994, B:662:0x29df, B:624:0x259f, B:626:0x25b4, B:627:0x25e3, B:629:0x2617, B:630:0x269a, B:601:0x222b, B:603:0x2231, B:604:0x2260, B:606:0x229a, B:607:0x22eb, B:574:0x1f46, B:576:0x1f5b, B:577:0x1f8b, B:558:0x1d2e, B:560:0x1d34, B:561:0x1d5d, B:19:0x01e4, B:21:0x01ea, B:22:0x0213, B:24:0x0378, B:26:0x03aa, B:27:0x0401), top: B:1058:0x01e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x165e  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x16b9 A[Catch: all -> 0x1a64, TRY_ENTER, TRY_LEAVE, TryCatch #57 {all -> 0x1a64, blocks: (B:395:0x1603, B:401:0x1651, B:410:0x16b9), top: B:1031:0x1603 }] */
    /* JADX WARN: Removed duplicated region for block: B:453:0x190e A[Catch: all -> 0x1a44, TryCatch #25 {all -> 0x1a44, blocks: (B:450:0x1904, B:451:0x1908, B:453:0x190e, B:456:0x1929, B:440:0x1830, B:446:0x1899, B:449:0x18fc), top: B:974:0x1830 }] */
    /* JADX WARN: Removed duplicated region for block: B:514:0x1b01 A[Catch: all -> 0x0407, TryCatch #71 {all -> 0x0407, blocks: (B:149:0x094e, B:151:0x0954, B:153:0x0983, B:238:0x0e71, B:240:0x0e77, B:241:0x0ea6, B:388:0x1552, B:390:0x1558, B:391:0x157f, B:512:0x1afb, B:514:0x1b01, B:515:0x1b32, B:818:0x30ee, B:820:0x30f4, B:821:0x3123, B:853:0x3435, B:855:0x343b, B:856:0x3469, B:896:0x37ef, B:898:0x37f5, B:899:0x3818, B:876:0x3625, B:878:0x3648, B:879:0x36a3, B:656:0x2930, B:658:0x2936, B:659:0x295a, B:661:0x2994, B:662:0x29df, B:624:0x259f, B:626:0x25b4, B:627:0x25e3, B:629:0x2617, B:630:0x269a, B:601:0x222b, B:603:0x2231, B:604:0x2260, B:606:0x229a, B:607:0x22eb, B:574:0x1f46, B:576:0x1f5b, B:577:0x1f8b, B:558:0x1d2e, B:560:0x1d34, B:561:0x1d5d, B:19:0x01e4, B:21:0x01ea, B:22:0x0213, B:24:0x0378, B:26:0x03aa, B:27:0x0401), top: B:1058:0x01e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:520:0x1bb5  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x1bd8  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x1bef A[Catch: all -> 0x1cb6, TryCatch #12 {all -> 0x1cb6, blocks: (B:533:0x1bda, B:535:0x1bef, B:536:0x1c21), top: B:949:0x1bda, outer: #42 }] */
    /* JADX WARN: Removed duplicated region for block: B:539:0x1c34 A[Catch: all -> 0x1cac, TryCatch #6 {all -> 0x1cac, blocks: (B:537:0x1c27, B:539:0x1c34, B:540:0x1ca2), top: B:937:0x1c27, outer: #42 }] */
    /* JADX WARN: Removed duplicated region for block: B:566:0x1de8  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x1e36  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x1f24  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x20d2  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x21ea  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x23da  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x244e  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x2497  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x24ad  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x2581  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x27d6  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x28d9  */
    /* JADX WARN: Removed duplicated region for block: B:671:0x2b3e A[Catch: all -> 0x3062, PHI: r2
  0x2b3e: PHI (r2v338 java.lang.Object) = (r2v333 java.lang.Object), (r2v337 java.lang.Object) binds: [B:666:0x2aee, B:667:0x2af0] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #54 {all -> 0x3062, blocks: (B:665:0x2aea, B:671:0x2b3e), top: B:1026:0x2aea }] */
    /* JADX WARN: Removed duplicated region for block: B:680:0x2bbb  */
    /* JADX WARN: Removed duplicated region for block: B:684:0x2bd3  */
    /* JADX WARN: Removed duplicated region for block: B:706:0x2c9d  */
    /* JADX WARN: Removed duplicated region for block: B:753:0x2f06 A[Catch: all -> 0x3058, TryCatch #44 {all -> 0x3058, blocks: (B:750:0x2efc, B:751:0x2f00, B:753:0x2f06, B:756:0x2f20, B:719:0x2cbf, B:737:0x2ddf, B:740:0x2e28, B:746:0x2e9b, B:749:0x2ef4), top: B:1007:0x2cbf }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:820:0x30f4 A[Catch: all -> 0x0407, TryCatch #71 {all -> 0x0407, blocks: (B:149:0x094e, B:151:0x0954, B:153:0x0983, B:238:0x0e71, B:240:0x0e77, B:241:0x0ea6, B:388:0x1552, B:390:0x1558, B:391:0x157f, B:512:0x1afb, B:514:0x1b01, B:515:0x1b32, B:818:0x30ee, B:820:0x30f4, B:821:0x3123, B:853:0x3435, B:855:0x343b, B:856:0x3469, B:896:0x37ef, B:898:0x37f5, B:899:0x3818, B:876:0x3625, B:878:0x3648, B:879:0x36a3, B:656:0x2930, B:658:0x2936, B:659:0x295a, B:661:0x2994, B:662:0x29df, B:624:0x259f, B:626:0x25b4, B:627:0x25e3, B:629:0x2617, B:630:0x269a, B:601:0x222b, B:603:0x2231, B:604:0x2260, B:606:0x229a, B:607:0x22eb, B:574:0x1f46, B:576:0x1f5b, B:577:0x1f8b, B:558:0x1d2e, B:560:0x1d34, B:561:0x1d5d, B:19:0x01e4, B:21:0x01ea, B:22:0x0213, B:24:0x0378, B:26:0x03aa, B:27:0x0401), top: B:1058:0x01e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:826:0x31ad  */
    /* JADX WARN: Removed duplicated region for block: B:829:0x31fc  */
    /* JADX WARN: Removed duplicated region for block: B:834:0x3257  */
    /* JADX WARN: Removed duplicated region for block: B:852:0x3412  */
    /* JADX WARN: Removed duplicated region for block: B:861:0x34f7  */
    /* JADX WARN: Removed duplicated region for block: B:864:0x354b  */
    /* JADX WARN: Removed duplicated region for block: B:875:0x3607  */
    /* JADX WARN: Removed duplicated region for block: B:895:0x37d0  */
    /* JADX WARN: Removed duplicated region for block: B:943:0x2b65 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:957:0x2af0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:985:0x1609 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v210, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v214 */
    /* JADX WARN: Type inference failed for: r10v215 */
    /* JADX WARN: Type inference failed for: r10v216 */
    /* JADX WARN: Type inference failed for: r10v217 */
    /* JADX WARN: Type inference failed for: r10v235 */
    /* JADX WARN: Type inference failed for: r10v236 */
    /* JADX WARN: Type inference failed for: r10v274 */
    /* JADX WARN: Type inference failed for: r10v275 */
    /* JADX WARN: Type inference failed for: r10v276 */
    /* JADX WARN: Type inference failed for: r10v283 */
    /* JADX WARN: Type inference failed for: r10v284 */
    /* JADX WARN: Type inference failed for: r10v285 */
    /* JADX WARN: Type inference failed for: r10v286 */
    /* JADX WARN: Type inference failed for: r11v102 */
    /* JADX WARN: Type inference failed for: r11v103 */
    /* JADX WARN: Type inference failed for: r11v104 */
    /* JADX WARN: Type inference failed for: r11v105 */
    /* JADX WARN: Type inference failed for: r11v106 */
    /* JADX WARN: Type inference failed for: r11v107 */
    /* JADX WARN: Type inference failed for: r11v108 */
    /* JADX WARN: Type inference failed for: r11v109 */
    /* JADX WARN: Type inference failed for: r11v110 */
    /* JADX WARN: Type inference failed for: r11v111 */
    /* JADX WARN: Type inference failed for: r11v112 */
    /* JADX WARN: Type inference failed for: r11v113 */
    /* JADX WARN: Type inference failed for: r11v114 */
    /* JADX WARN: Type inference failed for: r11v115 */
    /* JADX WARN: Type inference failed for: r11v116 */
    /* JADX WARN: Type inference failed for: r11v117 */
    /* JADX WARN: Type inference failed for: r11v118 */
    /* JADX WARN: Type inference failed for: r11v119 */
    /* JADX WARN: Type inference failed for: r11v120 */
    /* JADX WARN: Type inference failed for: r11v121 */
    /* JADX WARN: Type inference failed for: r11v122 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v28, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v29, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v46, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v47 */
    /* JADX WARN: Type inference failed for: r11v48 */
    /* JADX WARN: Type inference failed for: r11v49 */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r11v57 */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r11v59 */
    /* JADX WARN: Type inference failed for: r11v60 */
    /* JADX WARN: Type inference failed for: r11v61 */
    /* JADX WARN: Type inference failed for: r11v62 */
    /* JADX WARN: Type inference failed for: r11v68 */
    /* JADX WARN: Type inference failed for: r11v69 */
    /* JADX WARN: Type inference failed for: r11v70, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v71 */
    /* JADX WARN: Type inference failed for: r11v72 */
    /* JADX WARN: Type inference failed for: r11v73 */
    /* JADX WARN: Type inference failed for: r11v74 */
    /* JADX WARN: Type inference failed for: r11v83, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v84 */
    /* JADX WARN: Type inference failed for: r11v85 */
    /* JADX WARN: Type inference failed for: r11v86 */
    /* JADX WARN: Type inference failed for: r11v87 */
    /* JADX WARN: Type inference failed for: r11v89 */
    /* JADX WARN: Type inference failed for: r11v90 */
    /* JADX WARN: Type inference failed for: r13v105 */
    /* JADX WARN: Type inference failed for: r13v110, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v114 */
    /* JADX WARN: Type inference failed for: r13v115 */
    /* JADX WARN: Type inference failed for: r13v116 */
    /* JADX WARN: Type inference failed for: r13v117 */
    /* JADX WARN: Type inference failed for: r13v121 */
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
    /* JADX WARN: Type inference failed for: r13v134 */
    /* JADX WARN: Type inference failed for: r13v135 */
    /* JADX WARN: Type inference failed for: r13v136 */
    /* JADX WARN: Type inference failed for: r13v137 */
    /* JADX WARN: Type inference failed for: r13v138 */
    /* JADX WARN: Type inference failed for: r13v139 */
    /* JADX WARN: Type inference failed for: r13v140 */
    /* JADX WARN: Type inference failed for: r13v141 */
    /* JADX WARN: Type inference failed for: r13v142 */
    /* JADX WARN: Type inference failed for: r13v143 */
    /* JADX WARN: Type inference failed for: r13v144 */
    /* JADX WARN: Type inference failed for: r13v145 */
    /* JADX WARN: Type inference failed for: r13v146 */
    /* JADX WARN: Type inference failed for: r13v147 */
    /* JADX WARN: Type inference failed for: r13v148 */
    /* JADX WARN: Type inference failed for: r13v149 */
    /* JADX WARN: Type inference failed for: r13v150 */
    /* JADX WARN: Type inference failed for: r13v151 */
    /* JADX WARN: Type inference failed for: r13v152 */
    /* JADX WARN: Type inference failed for: r13v153 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r13v50 */
    /* JADX WARN: Type inference failed for: r13v52 */
    /* JADX WARN: Type inference failed for: r13v53 */
    /* JADX WARN: Type inference failed for: r13v54 */
    /* JADX WARN: Type inference failed for: r13v55 */
    /* JADX WARN: Type inference failed for: r13v56 */
    /* JADX WARN: Type inference failed for: r13v57 */
    /* JADX WARN: Type inference failed for: r13v59 */
    /* JADX WARN: Type inference failed for: r13v60 */
    /* JADX WARN: Type inference failed for: r13v61 */
    /* JADX WARN: Type inference failed for: r13v62 */
    /* JADX WARN: Type inference failed for: r13v63 */
    /* JADX WARN: Type inference failed for: r13v64 */
    /* JADX WARN: Type inference failed for: r13v65 */
    /* JADX WARN: Type inference failed for: r13v66 */
    /* JADX WARN: Type inference failed for: r13v67 */
    /* JADX WARN: Type inference failed for: r13v75 */
    /* JADX WARN: Type inference failed for: r13v76 */
    /* JADX WARN: Type inference failed for: r13v77 */
    /* JADX WARN: Type inference failed for: r13v84 */
    /* JADX WARN: Type inference failed for: r13v85 */
    /* JADX WARN: Type inference failed for: r13v88 */
    /* JADX WARN: Type inference failed for: r13v89 */
    /* JADX WARN: Type inference failed for: r13v90 */
    /* JADX WARN: Type inference failed for: r13v91 */
    /* JADX WARN: Type inference failed for: r13v93 */
    /* JADX WARN: Type inference failed for: r13v94 */
    /* JADX WARN: Type inference failed for: r13v95 */
    /* JADX WARN: Type inference failed for: r13v96 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v68 */
    /* JADX WARN: Type inference failed for: r15v69 */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r15v76 */
    /* JADX WARN: Type inference failed for: r15v81 */
    /* JADX WARN: Type inference failed for: r15v82 */
    /* JADX WARN: Type inference failed for: r15v83 */
    /* JADX WARN: Type inference failed for: r15v84 */
    /* JADX WARN: Type inference failed for: r15v85 */
    /* JADX WARN: Type inference failed for: r15v86 */
    /* JADX WARN: Type inference failed for: r15v87 */
    /* JADX WARN: Type inference failed for: r15v88 */
    /* JADX WARN: Type inference failed for: r24v10 */
    /* JADX WARN: Type inference failed for: r24v103 */
    /* JADX WARN: Type inference failed for: r24v104 */
    /* JADX WARN: Type inference failed for: r24v105 */
    /* JADX WARN: Type inference failed for: r24v106 */
    /* JADX WARN: Type inference failed for: r24v11 */
    /* JADX WARN: Type inference failed for: r24v111 */
    /* JADX WARN: Type inference failed for: r24v118 */
    /* JADX WARN: Type inference failed for: r24v119 */
    /* JADX WARN: Type inference failed for: r24v120 */
    /* JADX WARN: Type inference failed for: r24v121 */
    /* JADX WARN: Type inference failed for: r24v126 */
    /* JADX WARN: Type inference failed for: r24v132 */
    /* JADX WARN: Type inference failed for: r24v133 */
    /* JADX WARN: Type inference failed for: r24v134 */
    /* JADX WARN: Type inference failed for: r24v137 */
    /* JADX WARN: Type inference failed for: r24v138 */
    /* JADX WARN: Type inference failed for: r24v139 */
    /* JADX WARN: Type inference failed for: r24v141 */
    /* JADX WARN: Type inference failed for: r24v147 */
    /* JADX WARN: Type inference failed for: r24v148 */
    /* JADX WARN: Type inference failed for: r24v151 */
    /* JADX WARN: Type inference failed for: r24v152 */
    /* JADX WARN: Type inference failed for: r24v153 */
    /* JADX WARN: Type inference failed for: r24v154 */
    /* JADX WARN: Type inference failed for: r24v155 */
    /* JADX WARN: Type inference failed for: r24v156 */
    /* JADX WARN: Type inference failed for: r24v157 */
    /* JADX WARN: Type inference failed for: r24v158 */
    /* JADX WARN: Type inference failed for: r24v159 */
    /* JADX WARN: Type inference failed for: r24v160 */
    /* JADX WARN: Type inference failed for: r24v161 */
    /* JADX WARN: Type inference failed for: r24v162 */
    /* JADX WARN: Type inference failed for: r24v165 */
    /* JADX WARN: Type inference failed for: r24v166 */
    /* JADX WARN: Type inference failed for: r24v167 */
    /* JADX WARN: Type inference failed for: r24v168 */
    /* JADX WARN: Type inference failed for: r24v169 */
    /* JADX WARN: Type inference failed for: r24v170 */
    /* JADX WARN: Type inference failed for: r24v171 */
    /* JADX WARN: Type inference failed for: r24v172 */
    /* JADX WARN: Type inference failed for: r24v173 */
    /* JADX WARN: Type inference failed for: r24v174 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v56 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r24v74 */
    /* JADX WARN: Type inference failed for: r24v75 */
    /* JADX WARN: Type inference failed for: r24v76 */
    /* JADX WARN: Type inference failed for: r24v77 */
    /* JADX WARN: Type inference failed for: r24v78 */
    /* JADX WARN: Type inference failed for: r24v79 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r24v80 */
    /* JADX WARN: Type inference failed for: r24v81 */
    /* JADX WARN: Type inference failed for: r24v83 */
    /* JADX WARN: Type inference failed for: r24v84 */
    /* JADX WARN: Type inference failed for: r24v89 */
    /* JADX WARN: Type inference failed for: r24v9 */
    /* JADX WARN: Type inference failed for: r24v90 */
    /* JADX WARN: Type inference failed for: r24v91 */
    /* JADX WARN: Type inference failed for: r24v92 */
    /* JADX WARN: Type inference failed for: r24v95 */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1 */
    /* JADX WARN: Type inference failed for: r31v14 */
    /* JADX WARN: Type inference failed for: r31v15 */
    /* JADX WARN: Type inference failed for: r31v16 */
    /* JADX WARN: Type inference failed for: r31v17 */
    /* JADX WARN: Type inference failed for: r31v18 */
    /* JADX WARN: Type inference failed for: r31v19 */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r31v20 */
    /* JADX WARN: Type inference failed for: r31v22 */
    /* JADX WARN: Type inference failed for: r31v23 */
    /* JADX WARN: Type inference failed for: r31v24 */
    /* JADX WARN: Type inference failed for: r31v28 */
    /* JADX WARN: Type inference failed for: r31v29 */
    /* JADX WARN: Type inference failed for: r31v3 */
    /* JADX WARN: Type inference failed for: r31v30 */
    /* JADX WARN: Type inference failed for: r31v31 */
    /* JADX WARN: Type inference failed for: r31v32 */
    /* JADX WARN: Type inference failed for: r31v33 */
    /* JADX WARN: Type inference failed for: r31v34 */
    /* JADX WARN: Type inference failed for: r31v35 */
    /* JADX WARN: Type inference failed for: r31v36 */
    /* JADX WARN: Type inference failed for: r31v37 */
    /* JADX WARN: Type inference failed for: r31v38 */
    /* JADX WARN: Type inference failed for: r31v39 */
    /* JADX WARN: Type inference failed for: r31v4 */
    /* JADX WARN: Type inference failed for: r31v40 */
    /* JADX WARN: Type inference failed for: r31v44 */
    /* JADX WARN: Type inference failed for: r31v45 */
    /* JADX WARN: Type inference failed for: r31v46 */
    /* JADX WARN: Type inference failed for: r31v47 */
    /* JADX WARN: Type inference failed for: r31v48 */
    /* JADX WARN: Type inference failed for: r31v49 */
    /* JADX WARN: Type inference failed for: r31v50 */
    /* JADX WARN: Type inference failed for: r31v51 */
    /* JADX WARN: Type inference failed for: r31v52 */
    /* JADX WARN: Type inference failed for: r31v53 */
    /* JADX WARN: Type inference failed for: r31v64 */
    /* JADX WARN: Type inference failed for: r31v65 */
    /* JADX WARN: Type inference failed for: r31v66 */
    /* JADX WARN: Type inference failed for: r31v67 */
    /* JADX WARN: Type inference failed for: r31v68 */
    /* JADX WARN: Type inference failed for: r31v69 */
    /* JADX WARN: Type inference failed for: r31v70 */
    /* JADX WARN: Type inference failed for: r31v71 */
    /* JADX WARN: Type inference failed for: r31v72 */
    /* JADX WARN: Type inference failed for: r31v73 */
    /* JADX WARN: Type inference failed for: r31v74 */
    /* JADX WARN: Type inference failed for: r31v75 */
    /* JADX WARN: Type inference failed for: r31v76 */
    /* JADX WARN: Type inference failed for: r31v8 */
    /* JADX WARN: Type inference failed for: r31v9 */
    /* JADX WARN: Type inference failed for: r4v265, types: [long] */
    /* JADX WARN: Type inference failed for: r4v266 */
    /* JADX WARN: Type inference failed for: r4v267 */
    /* JADX WARN: Type inference failed for: r4v268, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v269 */
    /* JADX WARN: Type inference failed for: r4v270 */
    /* JADX WARN: Type inference failed for: r4v271 */
    /* JADX WARN: Type inference failed for: r4v272 */
    /* JADX WARN: Type inference failed for: r4v285 */
    /* JADX WARN: Type inference failed for: r4v286 */
    /* JADX WARN: Type inference failed for: r4v287 */
    /* JADX WARN: Type inference failed for: r4v288 */
    /* JADX WARN: Type inference failed for: r4v289, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v639 */
    /* JADX WARN: Type inference failed for: r4v640 */
    /* JADX WARN: Type inference failed for: r4v641 */
    /* JADX WARN: Type inference failed for: r4v642 */
    /* JADX WARN: Type inference failed for: r6v170 */
    /* JADX WARN: Type inference failed for: r6v171, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v172, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v206 */
    /* JADX WARN: Type inference failed for: r6v243 */
    /* JADX WARN: Type inference failed for: r6v244 */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v128 */
    /* JADX WARN: Type inference failed for: r8v129 */
    /* JADX WARN: Type inference failed for: r8v130, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v132, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v133 */
    /* JADX WARN: Type inference failed for: r8v142 */
    /* JADX WARN: Type inference failed for: r8v143 */
    /* JADX WARN: Type inference failed for: r8v144 */
    /* JADX WARN: Type inference failed for: r8v145 */
    /* JADX WARN: Type inference failed for: r8v146 */
    /* JADX WARN: Type inference failed for: r8v170 */
    /* JADX WARN: Type inference failed for: r8v171 */
    /* JADX WARN: Type inference failed for: r8v177 */
    /* JADX WARN: Type inference failed for: r8v178, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v179, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v187 */
    /* JADX WARN: Type inference failed for: r8v188 */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v261 */
    /* JADX WARN: Type inference failed for: r8v262 */
    /* JADX WARN: Type inference failed for: r8v263 */
    /* JADX WARN: Type inference failed for: r8v284 */
    /* JADX WARN: Type inference failed for: r8v285 */
    /* JADX WARN: Type inference failed for: r8v286 */
    /* JADX WARN: Type inference failed for: r8v287 */
    /* JADX WARN: Type inference failed for: r8v288 */
    /* JADX WARN: Type inference failed for: r9v102, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v107 */
    /* JADX WARN: Type inference failed for: r9v108 */
    /* JADX WARN: Type inference failed for: r9v109 */
    /* JADX WARN: Type inference failed for: r9v110 */
    /* JADX WARN: Type inference failed for: r9v113 */
    /* JADX WARN: Type inference failed for: r9v114 */
    /* JADX WARN: Type inference failed for: r9v318 */
    /* JADX WARN: Type inference failed for: r9v319 */
    /* JADX WARN: Type inference failed for: r9v320 */
    /* JADX WARN: Type inference failed for: r9v36, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v62, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v79 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 15198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinConfirmPinActivity.attachBaseContext(android.content.Context):void");
    }

    public static void m10747$r8$lambda$K7tm4CV4iuoRVjJElgpJFvu0tg(ChangePinConfirmPinActivity changePinConfirmPinActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = component4 + 55;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        changePinConfirmPinActivity.lambda$addObserve$0(resource);
        if (i3 != 0) {
            throw null;
        }
        int i4 = copydefault + 33;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void $r8$lambda$a1s1ixo0qIAcOwMEuVpe3rsHBdg(ChangePinConfirmPinActivity changePinConfirmPinActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = component4 + 43;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        changePinConfirmPinActivity.lambda$observerPinLogin$1(resource);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = copydefault + 9;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void m10748$$Nest$mloginSuccess(ChangePinConfirmPinActivity changePinConfirmPinActivity, LocalLoginInfo localLoginInfo) {
        int i = 2 % 2;
        int i2 = component4 + 13;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        changePinConfirmPinActivity.loginSuccess(localLoginInfo);
        int i4 = copydefault + 13;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = component4 + 39;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
        int i4 = copydefault + 3;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static {
        equals = 1;
        component3();
        component3 = -6690646898464637086L;
        int i = getAsAtTimestamp + 21;
        equals = i % 128;
        int i2 = i % 2;
    }

    static void component3() {
        ShareDataUIState = new int[]{-466295145, 825385978, -652227132, 514072334, -497690304, -1711532116, -1784646969, 873892072, 1572629974, -305052247, 1024202637, 1046072967, -503733353, 1500487542, -1414295582, -2074256353, -1673456165, 1088696597};
        component1 = new char[]{12830, 1972, 2026, 1966, 2002, 12825, 2037, 12818, 2028, 1969, 2041, 1971, 12824, 2029, 2036, 12828, 1987, 2022, 2027, 1965, 12819, 2019, 12822, 2018, 1973, 12827, 2032, 2021, 1968, 1977, 2035, 2020, 1974, 2031, 2030, 2038, 1975, 2003, 2025, 12829, 2017, 2023, 12816, 12817, 12831, 1985, 1970, 1976, 2034};
        component2 = (char) 12829;
    }
}
