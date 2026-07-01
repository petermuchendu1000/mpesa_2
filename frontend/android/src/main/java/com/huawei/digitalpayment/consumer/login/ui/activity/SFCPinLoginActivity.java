package com.huawei.digitalpayment.consumer.login.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.alibaba.ariver.engine.common.track.recovery.DeepRecoverARiverProxy;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.fastjson.parser.JSONLexer;
import com.blankj.utilcode.constant.CacheConstants;
import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.Utils;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.biometric.constants.BiometricConstants;
import com.huawei.biometric.service.IBiometricService;
import com.huawei.biometric.util.BiometricHelper2;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.module.UserLifecycleManager;
import com.huawei.common.safe.SafeUri;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.ToastUtils;
import com.huawei.common.widget.toast.CommonToast;
import com.huawei.digitalpayment.consumer.base.sim.SIM_DEFAULTS;
import com.huawei.digitalpayment.consumer.base.sim.SimCardRemovalManager;
import com.huawei.digitalpayment.consumer.base.sim.SimSubscriptionIdChecker;
import com.huawei.digitalpayment.consumer.base.util.GsmHelper;
import com.huawei.digitalpayment.consumer.base.util.PinLockedUtil;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;
import com.huawei.digitalpayment.consumer.baselib.http.HttpStatus;
import com.huawei.digitalpayment.consumer.baselib.util.PhoneUtils;
import com.huawei.digitalpayment.consumer.baseui.databinding.ActivitySfcBasePinBinding;
import com.huawei.digitalpayment.consumer.constants.Keys;
import com.huawei.digitalpayment.consumer.login.ui.dialog.TemporaryDialog;
import com.huawei.digitalpayment.consumer.login.util.LoginUtils;
import com.huawei.digitalpayment.consumer.login.vm.BiometricLoginViewModel;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model.LocalQueryLoginType;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model.SmsCodeType;
import com.huawei.digitalpayment.consumer.loginModule.login.viewmodel.PinLoginViewModel;
import com.huawei.digitalpayment.consumer.risk.bean.ProcessVerifyParams;
import com.huawei.digitalpayment.consumer.service.ILoginModuleService;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.mpesa.lifestyle.R;
import com.safaricom.mpesa.logging.L;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Function;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.cancelAll;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.notify;
import kotlin.text.StringsKt;
import org.apache.commons.lang3.CharUtils;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u001b\u001a\u00020\u001cH\u0014J\u0014\u0010\u001d\u001a\u0004\u0018\u00010\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010\u001f\u001a\u00020\tH\u0014J\b\u0010 \u001a\u00020\tH\u0016J\u001a\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\rH\u0014J\u0012\u0010$\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010\rH\u0014J\u0012\u0010%\u001a\u00020\u001c2\b\u0010&\u001a\u0004\u0018\u00010'H\u0014J\b\u0010(\u001a\u00020\u001cH\u0002J\b\u0010)\u001a\u00020\u001cH\u0002J\u0010\u0010*\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010+\u001a\u00020\u001cH\u0014J\u0010\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\tH\u0002J\b\u0010.\u001a\u00020\u001cH\u0002J\b\u0010/\u001a\u00020\u001cH\u0002J\b\u00100\u001a\u00020\u001cH\u0002J\b\u00101\u001a\u00020\u001cH\u0002J\b\u00102\u001a\u00020\u001cH\u0002J\u0012\u00103\u001a\u00020\u001c2\b\u00104\u001a\u0004\u0018\u00010\rH\u0002J\u0018\u00105\u001a\u00020\u001c2\u000e\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010807H\u0002J\u0018\u00109\u001a\u00020\u001c2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\rH\u0002J\u0012\u0010=\u001a\u00020\u001c2\b\u0010<\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010>\u001a\u00020\u001cH\u0002J\b\u0010?\u001a\u00020\u001cH\u0002J\b\u0010@\u001a\u00020\rH\u0002J\b\u0010A\u001a\u00020\u001cH\u0014J\b\u0010B\u001a\u00020\u001cH\u0017R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006C"}, d2 = {"Lcom/huawei/digitalpayment/consumer/login/ui/activity/SFCPinLoginActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcBasePinActivity;", "Lcom/huawei/digitalpayment/consumer/baseui/databinding/ActivitySfcBasePinBinding;", "Lcom/huawei/digitalpayment/consumer/loginModule/login/viewmodel/PinLoginViewModel;", "<init>", "()V", "biometricLoginViewModel", "Lcom/huawei/digitalpayment/consumer/login/vm/BiometricLoginViewModel;", KeysConstants.KEY_IS_SUPPORT_FINGERPRINT_LOGIN, "", KeysConstants.KEY_IS_SUPPORT_FACE_LOGIN, "isChange", "token", "", "headerUrl", "userName", "queryLoginType", "Lcom/huawei/digitalpayment/consumer/loginModule/login/data/source/local/model/LocalQueryLoginType;", "mLoginType", KeysConstants.KEY_SUPPORT_FORGET_PIN, "OPERATION_FAILED", "simCardRemovalManager", "Lcom/huawei/digitalpayment/consumer/base/sim/SimCardRemovalManager;", "getSimCardRemovalManager", "()Lcom/huawei/digitalpayment/consumer/base/sim/SimCardRemovalManager;", "setSimCardRemovalManager", "(Lcom/huawei/digitalpayment/consumer/base/sim/SimCardRemovalManager;)V", "updateUI", "", "getDisplayName", "name", "showBiometric", "isLogin", "biometricResult", "isFaceLogin", "pin", "onConfirmClick", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "initData", "showTemporaryDialog", "handleQueryLoginType", "onStart", "showLoginPriority", "aBoolean", "showLastLogin", "loginWithFingerprint", "initBiometricViewModel", "loginWithFaceId", "addObserver", "saveLoginType", "biometricType", "onLoginResponse", "resource", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/loginModule/login/data/source/local/LocalLoginInfo;", "doRiskProcess", "params", "Lcom/huawei/digitalpayment/consumer/risk/bean/ProcessVerifyParams;", KeysConstants.KEY_LOGIN_TYPE, "autoLogin", "checkIfSimCardWasRemoved", "logoutAndNavigateToLoginScreen", "getExtraKey", "onResume", "onBackPressed", "ConsumerLoginUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class SFCPinLoginActivity extends Hilt_SFCPinLoginActivity<ActivitySfcBasePinBinding, PinLoginViewModel> {
    public static final int $stable = 8;
    private static char ShareDataUIState;
    private static long component1;
    private static char[] component2;
    private static int component4;
    private static char[] copydefault;
    private BiometricLoginViewModel biometricLoginViewModel;
    private String headerUrl;
    private boolean isChange;
    private String mLoginType;
    private LocalQueryLoginType queryLoginType;

    @Inject
    public SimCardRemovalManager simCardRemovalManager;
    private boolean supportFaceLogin;
    private boolean supportFingerprintLogin;
    private String token;
    private String userName;
    private static final byte[] $$u = {TarHeader.LF_SYMLINK, 44, -54, Ascii.EM};
    private static final int $$x = 71;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$B = {114, 69, -115, -114, 9, -5, -66, TarHeader.LF_FIFO, 5, -3, -11, 2, -10, -58, TarHeader.LF_NORMAL, 10, -13, Ascii.VT, -6, -9, -8, -57, TarHeader.LF_FIFO, 3, 3, -72, TarHeader.LF_SYMLINK, 9, -5, -3, -1, -4, -67, 56, 2, 3, -18, 10, -7, -16, 8, -65, 73, -3, -18, Ascii.DC2, -10, Ascii.SO, -16, -36, Ascii.SUB, Ascii.DLE, -22, -15, -15, 7, Ascii.RS, -22, Ascii.DLE, -18, 9, -5, 0, -4, -4, -12, 6, 3, PSSSigner.TRAILER_IMPLICIT, 9, -2, 6, -24, -2, -2, -8, 17, -12, 5};
    private static final int $$C = 175;
    private static final byte[] $$g = {68, -127, 122, -15, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -12, Ascii.FF, -19, -15, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$h = 110;
    private static int equals = 1;
    private static int component3 = 0;
    private static int getAsAtTimestamp = 1;
    private boolean supportForgetPin = true;
    private final String OPERATION_FAILED = "error.common.verify_process_operation_failed";

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$A(short r6, int r7, int r8) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.$$u
            int r8 = r8 * 2
            int r1 = r8 + 1
            int r6 = r6 + 102
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L20:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L28:
            int r7 = -r7
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.$$A(short, int, int):java.lang.String");
    }

    private static void k(byte b2, int i, byte b3, Object[] objArr) {
        byte[] bArr = $$g;
        int i2 = b3 + 4;
        int i3 = (i * 2) + 83;
        byte[] bArr2 = new byte[28 - b2];
        int i4 = 27 - b2;
        int i5 = -1;
        if (bArr == null) {
            i2++;
            i3 = (i3 + (-i4)) - 8;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2++;
                i3 = (i3 + (-bArr[i2])) - 8;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void n(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = 69 - r8
            int r7 = r7 * 16
            int r7 = 99 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.$$B
            int r9 = 42 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r7 = r9
            r4 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L28:
            int r7 = r7 + r8
            int r8 = r3 + 1
            int r7 = r7 + 3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.n(short, int, short, java.lang.Object[]):void");
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class ShareDataUIState implements Observer, FunctionAdapter {
        private final Function1 component1;
        private static final byte[] $$a = {TarHeader.LF_NORMAL, 86, 58, 71};
        private static final int $$b = 200;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int getAsAtTimestamp = 0;
        private static int component4 = 1;
        private static long copydefault = -2214339100443400109L;
        private static long ShareDataUIState = -3780477796495014671L;
        private static int component2 = 1386857713;
        private static char component3 = 25983;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(short r6, short r7, short r8) {
            /*
                int r8 = r8 * 4
                int r8 = r8 + 1
                byte[] r0 = com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.ShareDataUIState.$$a
                int r6 = r6 + 98
                int r7 = r7 + 4
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L13
                r3 = r7
                r7 = r8
                r4 = r2
                goto L2a
            L13:
                r3 = r2
            L14:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r3 = r3 + 1
                int r7 = r7 + 1
                if (r3 != r8) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L23:
                r4 = r0[r7]
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2a:
                int r6 = -r6
                int r6 = r6 + r7
                r7 = r3
                r3 = r4
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.ShareDataUIState.$$c(short, short, short):java.lang.String");
        }

        private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
            char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(copydefault ^ 6728534956745174161L, cArr, i);
            iTrustedWebActivityServiceDefault.copydefault = 4;
            int i3 = $11 + 93;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
                int i5 = $10 + 123;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
                int i7 = iTrustedWebActivityServiceDefault.copydefault;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(copydefault)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - (Process.myPid() >> 22), ((Process.getThreadPriority(0) + 20) >> 6) + 34, (char) (View.MeasureSpec.getMode(0) + 63440), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrComponent2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) (-1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1390 - TextUtils.getOffsetBefore("", 0), 18 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (51269 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), -1883291598, false, $$c((byte) 5, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
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
            objArr[0] = new String(cArrComponent2, 4, cArrComponent2.length - 4);
        }

        private static void b(char[] cArr, int i, char[] cArr2, char c2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
            int length = cArr.length;
            char[] cArr4 = new char[length];
            int length2 = cArr3.length;
            char[] cArr5 = new char[length2];
            int i5 = 0;
            System.arraycopy(cArr, 0, cArr4, 0, length);
            System.arraycopy(cArr3, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c2);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr2.length;
            char[] cArr6 = new char[length3];
            iNotificationSideChannel.copydefault = 0;
            int i6 = $10 + 107;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            while (iNotificationSideChannel.copydefault < length3) {
                int i8 = $10 + 105;
                $11 = i8 % 128;
                int i9 = i8 % i3;
                try {
                    Object[] objArr2 = {iNotificationSideChannel};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                    if (objCopydefault == null) {
                        int i10 = 4037 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int edgeSlop = 31 - (ViewConfiguration.getEdgeSlop() >> 16);
                        char trimmedLength = (char) (19181 - TextUtils.getTrimmedLength(""));
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (-b2);
                        String str$$c = $$c(b2, b3, (byte) (b3 + 1));
                        Class[] clsArr = new Class[1];
                        clsArr[i5] = Object.class;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i10, edgeSlop, trimmedLength, 1912513118, false, str$$c, clsArr);
                    }
                    int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 7567;
                        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i5) + 11;
                        char c3 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        Class[] clsArr2 = new Class[1];
                        clsArr2[i5] = Object.class;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(edgeSlop2, absoluteGravity, c3, 2006389106, false, "e", clsArr2);
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    int i11 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                    Object[] objArr4 = new Object[3];
                    objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                    objArr4[1] = Integer.valueOf(i11);
                    objArr4[i5] = iNotificationSideChannel;
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) i5;
                        byte b5 = (byte) (b4 - 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0') + 2460, Color.rgb(i5, i5, i5) + 16777244, (char) ((-1) - TextUtils.lastIndexOf("", '0')), 931716605, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                    if (objCopydefault4 == null) {
                        i2 = 2;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7566 - ImageFormat.getBitsPerPixel(0), 11 - TextUtils.getOffsetAfter("", 0), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                    } else {
                        i2 = 2;
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = iNotificationSideChannel.component3;
                    cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr2[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (ShareDataUIState ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component2) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component3) ^ (-3780477796495014671L)))));
                    iNotificationSideChannel.copydefault++;
                    i3 = i2;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr6);
        }

        ShareDataUIState(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.component1 = function1;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = component4 + 1;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            boolean zAreEqual = ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) ? Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate()) : false;
            int i4 = component4 + 21;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            return zAreEqual;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 89;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            Function1 function1 = this.component1;
            if (i3 != 0) {
                return function1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 81;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = component4 + 115;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = component4 + 55;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            this.component1.invoke(obj);
            if (i3 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:176:0x0a9d  */
        /* JADX WARN: Removed duplicated region for block: B:177:0x0ace  */
        /* JADX WARN: Removed duplicated region for block: B:180:0x0b14  */
        /* JADX WARN: Removed duplicated region for block: B:181:0x0b24  */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1, types: [int] */
        /* JADX WARN: Type inference failed for: r5v12 */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v35 */
        /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.CharSequence, java.lang.String] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object[] ShareDataUIState(android.content.Context r36, int r37, int r38) {
            /*
                Method dump skipped, instruction units count: 3941
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.ShareDataUIState.ShareDataUIState(android.content.Context, int, int):java.lang.Object[]");
        }
    }

    public static final void access$autoLogin(SFCPinLoginActivity sFCPinLoginActivity, String str) {
        int i = 2 % 2;
        int i2 = component3 + 109;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        sFCPinLoginActivity.autoLogin(str);
        int i4 = component3 + 65;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void access$doRiskProcess(SFCPinLoginActivity sFCPinLoginActivity, ProcessVerifyParams processVerifyParams, String str) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 43;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        sFCPinLoginActivity.doRiskProcess(processVerifyParams, str);
        if (i3 != 0) {
            throw null;
        }
        int i4 = getAsAtTimestamp + 125;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
    }

    public static final ViewDataBinding access$getBinding$p(SFCPinLoginActivity sFCPinLoginActivity) {
        int i = 2 % 2;
        int i2 = component3 + 11;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = sFCPinLoginActivity.binding;
        if (i3 != 0) {
            return binding;
        }
        throw null;
    }

    public static final BiometricLoginViewModel access$getBiometricLoginViewModel$p(SFCPinLoginActivity sFCPinLoginActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 117;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        BiometricLoginViewModel biometricLoginViewModel = sFCPinLoginActivity.biometricLoginViewModel;
        if (i4 != 0) {
            int i5 = 31 / 0;
        }
        int i6 = i2 + 11;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return biometricLoginViewModel;
    }

    public static final String access$getMLoginType$p(SFCPinLoginActivity sFCPinLoginActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 51;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = sFCPinLoginActivity.mLoginType;
        int i5 = i3 + 11;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final LocalQueryLoginType access$getQueryLoginType$p(SFCPinLoginActivity sFCPinLoginActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 35;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        LocalQueryLoginType localQueryLoginType = sFCPinLoginActivity.queryLoginType;
        int i5 = i3 + 101;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return localQueryLoginType;
        }
        throw null;
    }

    public static final boolean access$getSupportFingerprintLogin$p(SFCPinLoginActivity sFCPinLoginActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 63;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        boolean z = sFCPinLoginActivity.supportFingerprintLogin;
        int i5 = i3 + 67;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public static final String access$getUserName$p(SFCPinLoginActivity sFCPinLoginActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 91;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = sFCPinLoginActivity.userName;
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    public static final void access$initBiometricViewModel(SFCPinLoginActivity sFCPinLoginActivity) {
        int i = 2 % 2;
        int i2 = component3 + 91;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        sFCPinLoginActivity.initBiometricViewModel();
        int i4 = component3 + 95;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void access$onLoginResponse(SFCPinLoginActivity sFCPinLoginActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = component3 + 63;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        sFCPinLoginActivity.onLoginResponse(resource);
        if (i3 == 0) {
            throw null;
        }
        int i4 = getAsAtTimestamp + 103;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void access$saveLoginType(SFCPinLoginActivity sFCPinLoginActivity, String str) {
        int i = 2 % 2;
        int i2 = component3 + 39;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        sFCPinLoginActivity.saveLoginType(str);
        int i4 = getAsAtTimestamp + 39;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void access$setMLoginType$p(SFCPinLoginActivity sFCPinLoginActivity, String str) {
        int i = 2 % 2;
        int i2 = component3 + 113;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        sFCPinLoginActivity.mLoginType = str;
        int i5 = i3 + 11;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$showLoginPriority(SFCPinLoginActivity sFCPinLoginActivity, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 73;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        sFCPinLoginActivity.showLoginPriority(z);
        int i4 = component3 + 71;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void access$simulatePinEntry(SFCPinLoginActivity sFCPinLoginActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 27;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        sFCPinLoginActivity.simulatePinEntry();
        int i4 = component3 + 97;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void B(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = $10 + 45;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = notifyVar.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3265, 33 - TextUtils.getTrimmedLength(""), (char) (View.resolveSize(0, 0) + 60268), -834797019, false, $$A(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() & (component1 / 5431355972723572778L);
                    Object[] objArr3 = {notifyVar, notifyVar};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault2 == null) {
                        int modifierMetaStateMask = 686 - ((byte) KeyEvent.getModifierMetaStateMask());
                        int iBlue = Color.blue(0) + 34;
                        char windowTouchSlop = (char) (60373 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                        byte b4 = (byte) ($$x & 11);
                        byte b5 = (byte) (b4 - 3);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(modifierMetaStateMask, iBlue, windowTouchSlop, -1969106284, false, $$A(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = notifyVar.copydefault;
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(3267 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 33 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (60268 - View.resolveSize(0, 0)), -834797019, false, $$A(b6, b7, b7), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objCopydefault3).invoke(null, objArr4)).longValue() ^ (component1 ^ 5431355972723572778L);
                    Object[] objArr5 = {notifyVar, notifyVar};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault4 == null) {
                        int mode = View.MeasureSpec.getMode(0) + 687;
                        int iMyPid = 34 - (Process.myPid() >> 22);
                        char edgeSlop = (char) (60373 - (ViewConfiguration.getEdgeSlop() >> 16));
                        byte b8 = (byte) ($$x & 11);
                        byte b9 = (byte) (b8 - 3);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(mode, iMyPid, edgeSlop, -1969106284, false, $$A(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        int i6 = $11 + 23;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (notifyVar.copydefault < cArr.length) {
            int i8 = $11 + 19;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr6 = {notifyVar, notifyVar};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault5 == null) {
                int iMakeMeasureSpec = 687 - View.MeasureSpec.makeMeasureSpec(0, 0);
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 34;
                char cLastIndexOf = (char) (60372 - TextUtils.lastIndexOf("", '0'));
                byte b10 = (byte) ($$x & 11);
                byte b11 = (byte) (b10 - 3);
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iMakeMeasureSpec, capsMode, cLastIndexOf, -1969106284, false, $$A(b10, b11, b11), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    public final SimCardRemovalManager getSimCardRemovalManager() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 29;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        SimCardRemovalManager simCardRemovalManager = this.simCardRemovalManager;
        if (simCardRemovalManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 123;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return simCardRemovalManager;
        }
        throw null;
    }

    public final void setSimCardRemovalManager(SimCardRemovalManager simCardRemovalManager) {
        int i = 2 % 2;
        int i2 = component3 + 93;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(simCardRemovalManager, "");
            this.simCardRemovalManager = simCardRemovalManager;
        } else {
            Intrinsics.checkNotNullParameter(simCardRemovalManager, "");
            this.simCardRemovalManager = simCardRemovalManager;
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0113 A[PHI: r1 r2 r3
  0x0113: PHI (r1v38 com.huawei.digitalpayment.consumer.base.util.DefaultAvatarDisplayUtil) = 
  (r1v36 com.huawei.digitalpayment.consumer.base.util.DefaultAvatarDisplayUtil)
  (r1v42 com.huawei.digitalpayment.consumer.base.util.DefaultAvatarDisplayUtil)
 binds: [B:23:0x0110, B:20:0x00f7] A[DONT_GENERATE, DONT_INLINE]
  0x0113: PHI (r2v11 android.widget.TextView) = (r2v9 android.widget.TextView), (r2v14 android.widget.TextView) binds: [B:23:0x0110, B:20:0x00f7] A[DONT_GENERATE, DONT_INLINE]
  0x0113: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v4 java.lang.String) binds: [B:23:0x0110, B:20:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateUI() {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.updateUI():void");
    }

    private final String getDisplayName(String name) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 119;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (name == null) {
            int i4 = i2 + 77;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            throw null;
        }
        List listSplit$default = StringsKt.split$default((CharSequence) name, new String[]{" "}, false, 0, 6, (Object) null);
        return CollectionsKt.first((List<? extends Object>) listSplit$default) + " " + CollectionsKt.last((List<? extends Object>) listSplit$default);
    }

    @Override
    public void biometricResult(boolean isFaceLogin, String pin) {
        int i = 2 % 2;
        L.INSTANCE.d("Time", "开始登录 生物识别 " + System.currentTimeMillis(), new Object[0]);
        if (isFaceLogin) {
            int i2 = component3 + 81;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            loginWithFaceId();
        } else {
            loginWithFingerprint();
            int i4 = getAsAtTimestamp + 45;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = getAsAtTimestamp + 7;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onConfirmClick(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            com.safaricom.mpesa.logging.L r1 = com.safaricom.mpesa.logging.L.INSTANCE
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "开始登录 "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r3 = "Time"
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r1.d(r3, r2, r5)
            com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model.LocalQueryLoginType r1 = r6.queryLoginType
            java.lang.String r2 = ""
            if (r1 == 0) goto L82
            int r3 = com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.component3
            int r3 = r3 + 21
            int r5 = r3 % 128
            com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.getAsAtTimestamp = r5
            int r3 = r3 % r0
            if (r3 != 0) goto L37
            r3 = 71
            int r3 = r3 / r4
            if (r1 == 0) goto L82
            goto L39
        L37:
            if (r1 == 0) goto L82
        L39:
            r3 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.Boolean r1 = r1.getNewProcess()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r1)
            if (r1 == 0) goto L82
            int r1 = com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.component3
            int r1 = r1 + 97
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.getAsAtTimestamp = r3
            int r1 = r1 % r0
            com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model.LocalQueryLoginType r1 = r6.queryLoginType
            if (r1 == 0) goto L5e
            java.lang.String r1 = r1.getLoginType()
            if (r1 != 0) goto L5c
            goto L5e
        L5c:
            r2 = r1
            goto L6b
        L5e:
            int r1 = com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.getAsAtTimestamp
            int r1 = r1 + 125
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.component3 = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L6b
            r0 = 5
            int r0 = r0 % r0
        L6b:
            java.lang.String r7 = com.huawei.digitalpayment.consumer.baselib.util.encrypt.EncryptUtils.encryptWithPinKey(r7)
            com.huawei.digitalpayment.consumer.baselib.config.IAppConfig r0 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.getAppConfig()
            java.lang.String r0 = r0.getPinKeyVersion()
            com.huawei.digitalpayment.consumer.risk.bean.ProcessVerifyParams r1 = new com.huawei.digitalpayment.consumer.risk.bean.ProcessVerifyParams
            r1.<init>(r2, r7, r0)
            java.lang.String r7 = "2"
            r6.doRiskProcess(r1, r7)
            goto L9e
        L82:
            VM extends androidx.lifecycle.ViewModel r1 = r6.viewModel
            com.huawei.digitalpayment.consumer.loginModule.login.viewmodel.PinLoginViewModel r1 = (com.huawei.digitalpayment.consumer.loginModule.login.viewmodel.PinLoginViewModel) r1
            java.lang.String r7 = com.huawei.digitalpayment.consumer.baselib.util.encrypt.EncryptUtils.encryptWithPinKey(r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.PinLoginParams r2 = new com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.PinLoginParams
            r2.<init>(r7)
            r1.pinLogin(r2)
            int r7 = com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.component3
            int r7 = r7 + 125
            int r1 = r7 % 128
            com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.getAsAtTimestamp = r1
            int r7 = r7 % r0
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.onConfirmClick(java.lang.String):void");
    }

    private static void l(int[] iArr, byte[] bArr, boolean z, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = copydefault;
        float f = 0.0f;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 29;
                $10 = i8 % 128;
                if (i8 % i != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(657 - (Process.myPid() >> 22), 14 - (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)), (char) (65117 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 1951305196, false, "l", new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        i7 /= 0;
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
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(657 - View.getDefaultSize(0, 0), 14 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (65119 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 1951305196, false, "l", new Class[]{Integer.TYPE});
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
                f = 0.0f;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i9 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault3 == null) {
                        byte b2 = (byte) 0;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4501 - TextUtils.lastIndexOf("", '0'), KeyEvent.normalizeMetaState(0) + 36, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 27896), -1464227204, false, $$A((byte) 8, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                } else {
                    int i10 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr5 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault4 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(3580 - View.resolveSizeAndState(0, 0, 0), 28 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) Color.green(0), 1180380354, false, $$A((byte) 13, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                    int i11 = $10 + 9;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr6 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault5 == null) {
                    byte b4 = (byte) 0;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(Color.argb(0, 0, 0, 0) + 1859, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 34, (char) View.resolveSize(0, 0), 80302927, false, $$A((byte) 12, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i13 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i13, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i13);
        }
        if (z) {
            int i14 = $10 + 25;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            char[] cArr6 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i16 = $11 + 29;
                $10 = i16 % 128;
                int i17 = i16 % 2;
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i4 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static void m(int i, byte b2, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = component2;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((KeyEvent.getMaxKeyCode() >> 16) + 7422, (ViewConfiguration.getFadingEdgeLength() >> 16) + 15, (char) (TextUtils.lastIndexOf("", '0', 0) + 64292), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(ShareDataUIState)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        long j = 0;
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(((byte) KeyEvent.getModifierMetaStateMask()) + 7423, ImageFormat.getBitsPerPixel(0) + 16, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 64290), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i5 = $10 + 97;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            cancelall.component2 = 0;
            while (cancelall.component2 < i2) {
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    int i7 = $11 + 83;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        cArr4[cancelall.component2] = (char) (cancelall.component1 >> b2);
                        cArr4[cancelall.component2 - 1] = (char) (cancelall.component3 >>> b2);
                    } else {
                        cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                        cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    }
                } else {
                    try {
                        Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                        if (objCopydefault3 == null) {
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 7116, KeyEvent.normalizeMetaState(0) + 14, (char) (Color.argb(0, 0, 0, 0) + 44463), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                            int i8 = $10 + 65;
                            $11 = i8 % 128;
                            int i9 = i8 % 2;
                            Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                            if (objCopydefault4 == null) {
                                byte b3 = (byte) 0;
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetBefore("", 0) + 2944, TextUtils.getCapsMode("", 0, 0) + 24, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 27637), 794909189, false, $$A((byte) ($$x >>> 2), b3, b3), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                            int i10 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[iIntValue];
                            cArr4[cancelall.component2 + 1] = cArr2[i10];
                        } else if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i11 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i12 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[i11];
                            cArr4[cancelall.component2 + 1] = cArr2[i12];
                        } else {
                            int i13 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i14 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr2[i13];
                            cArr4[cancelall.component2 + 1] = cArr2[i14];
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                cancelall.component2 += 2;
                j = 0;
            }
        }
        int i15 = 0;
        while (i15 < i) {
            int i16 = $10 + 33;
            $11 = i16 % 128;
            if (i16 % 2 == 0) {
                cArr4[i15] = (char) (cArr4[i15] ^ 11726);
                i15 += 105;
            } else {
                cArr4[i15] = (char) (cArr4[i15] ^ 13722);
                i15++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = component3 + 87;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[1];
        l(new int[]{22, 18, 126, 0}, new byte[]{1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, true, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        l(new int[]{40, 5, 108, 2}, new byte[]{1, 1, 1, 0, 0}, false, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                l(new int[]{45, 26, 83, 0}, new byte[]{1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, true, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                m(18 - (Process.myPid() >> 22), (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952747_res_0x7f13046b).substring(22, 23).length() + 3), new char[]{'\t', 22, 13804, 13804, JSONLexer.EOI, '\"', 7, CharUtils.CR, 13806, 13806, 21, 15, 6, 16, 3, 7, '\"', '!'}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarSize() >> 8) + 6618, Color.rgb(0, 0, 0) + 16777258, (char) TextUtils.getCapsMode("", 0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    l(new int[]{71, 48, 178, 1}, new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1}, false, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    l(new int[]{119, 64, 0, 0}, new byte[]{0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 1}, false, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    m(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952790_res_0x7f130496).substring(7, 8).codePointAt(0) + 32, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(13) + 60), new char[]{24, '#', 28, 1, 29, 2, 4, 22, 4, 11, 6, '\"', 25, 24, 17, 22, '\"', 16, 13849, 13849, 30, 28, 29, 1, '\"', 5, 1, 23, 1, 22, 18, 31, '#', 11, 11, 28, 28, 2, JSONLexer.EOI, 29, 29, 0, 28, 25, 24, 28, 4, 16, 27, 25, '\t', 28, 27, 24, '#', 29, 16, 24, 28, 31, 11, 5, 22, 16}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    l(new int[]{183, 72, 187, 0}, new byte[]{0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0}, true, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    l(new int[]{255, 6, 0, 5}, new byte[]{0, 0, 1, 1, 1, 0}, true, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    l(new int[]{DeepRecoverARiverProxy.TYPE_ENTITY_ONLINE_PAGE, 36, 0, 6}, new byte[]{1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0}, false, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 56, (char) (ImageFormat.getBitsPerPixel(0) + 1), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            int iAlpha = 2405 - Color.alpha(0);
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 26;
            char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
            byte[] bArr = $$g;
            Object[] objArr13 = new Object[1];
            k(bArr[80], bArr[64], bArr[67], objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iAlpha, keyRepeatTimeout, doubleTapTimeout, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault4 == null) {
                int iIndexOf = 2405 - TextUtils.indexOf("", "");
                int threadPriority = 26 - ((Process.getThreadPriority(0) + 20) >> 6);
                char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                byte[] bArr2 = $$g;
                byte b2 = (byte) (-bArr2[14]);
                byte b3 = bArr2[64];
                Object[] objArr14 = new Object[1];
                k(b2, b3, (byte) (b3 | 37), objArr14);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, threadPriority, c2, 24929979, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            m(17 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (byte) (30 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), new char[]{'\f', CharUtils.CR, 6, 17, 15, 16, 14, 30, 20, '\f', 16, 19, 4, 2, 24, '\n'}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            l(new int[]{297, 16, 0, 10}, new byte[]{0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1}, false, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, -1865995723};
                byte[] bArr3 = $$B;
                byte b4 = bArr3[62];
                Object[] objArr18 = new Object[1];
                n(b4, (byte) (-bArr3[41]), b4, objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                n((byte) (-bArr3[30]), (byte) (-bArr3[72]), bArr3[50], objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    int fadingEdgeLength = 2405 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int i4 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 25;
                    char cResolveSize = (char) View.resolveSize(0, 0);
                    byte[] bArr4 = $$g;
                    byte b5 = (byte) (-bArr4[14]);
                    byte b6 = bArr4[64];
                    Object[] objArr20 = new Object[1];
                    k(b5, b6, (byte) (b6 | 37), objArr20);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(fadingEdgeLength, i4, cResolveSize, 24929979, false, (String) objArr20[0], null);
                }
                ((Field) objCopydefault5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    l(new int[]{0, 22, 175, 0}, new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, false, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    m(View.MeasureSpec.getSize(0) + 15, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952792_res_0x7f130498).substring(2, 3).length() + 47), new char[]{27, 16, 14, 6, 4, 27, 2, 22, 24, 16, CharUtils.CR, 3, '\n', 7, 13871}, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault6 == null) {
                        byte b7 = $$g[75];
                        Object[] objArr23 = new Object[1];
                        k(b7, (byte) (b7 | 10), (byte) 54, objArr23);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault((Process.myTid() >> 22) + 2405, 26 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), -1843538389, false, (String) objArr23[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault7 == null) {
                        int iAlpha2 = Color.alpha(0) + 2405;
                        int i5 = 26 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        byte[] bArr5 = $$g;
                        Object[] objArr24 = new Object[1];
                        k(bArr5[80], bArr5[64], bArr5[67], objArr24);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(iAlpha2, i5, maximumFlingVelocity, -2047739879, false, (String) objArr24[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf2);
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
        int i6 = ((int[]) objArr[0])[0];
        int i7 = ((int[]) objArr[2])[0];
        if (i7 != i6) {
            long j = -1;
            long j2 = ((long) (i7 ^ i6)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.keyCodeFromString("") + 6618, TextUtils.indexOf("", "") + 42, (char) TextUtils.indexOf("", "", 0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault8).invoke(null, null);
            try {
                Object[] objArr25 = {1866909589, Long.valueOf(j4), new ArrayList(), null, true};
                Class cls6 = (Class) ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0') + 6563, (-16777160) - Color.rgb(0, 0, 0), (char) (Process.myPid() >> 22));
                byte[] bArr6 = $$B;
                Object[] objArr26 = new Object[1];
                n(bArr6[62], bArr6[4], (byte) ($$C & 112), objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
                int i8 = component3 + 83;
                getAsAtTimestamp = i8 % 128;
                int i9 = i8 % 2;
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        initData();
        super.onCreate(savedInstanceState);
        if (SPUtils.getInstance().getBoolean(SPConstant.LOGOUT2PIN)) {
            int i10 = component3 + 17;
            getAsAtTimestamp = i10 % 128;
            int i11 = i10 % 2;
            L l = L.INSTANCE;
            String str6 = this.TAG;
            Intrinsics.checkNotNullExpressionValue(str6, "");
            l.d(str6, "onCreate: CLEAN LOGOUT2PIN", new Object[0]);
            SPUtils.getInstance().remove(SPConstant.LOGOUT2PIN);
            ActivityUtils.finishAllActivitiesExceptNewest();
        }
        ((ActivitySfcBasePinBinding) this.binding).tvTitle.setVisibility(0);
        ((ActivitySfcBasePinBinding) this.binding).ivBack.setVisibility(4);
        SPUtils.getInstance().put(SPConstant.KEY_SHOW_AD, true);
        addObserver();
    }

    private final void initData() {
        boolean zAreEqual;
        boolean zAreEqual2;
        int i = 2 % 2;
        try {
            this.queryLoginType = (LocalQueryLoginType) getIntent().getSerializableExtra("queryLoginType");
        } catch (Exception e) {
            String message = e.getMessage();
            if (message != null) {
                L l = L.INSTANCE;
                String str = this.TAG;
                Intrinsics.checkNotNullExpressionValue(str, "");
                l.d(str, message, new Object[0]);
            }
        }
        LocalQueryLoginType localQueryLoginType = this.queryLoginType;
        if (localQueryLoginType != null) {
            if (localQueryLoginType != null) {
                int i2 = component3 + 69;
                getAsAtTimestamp = i2 % 128;
                int i3 = i2 % 2;
                zAreEqual = Intrinsics.areEqual((Object) true, (Object) localQueryLoginType.getSupportFingerprintLogin());
            } else {
                zAreEqual = false;
            }
            this.supportFingerprintLogin = zAreEqual;
            LocalQueryLoginType localQueryLoginType2 = this.queryLoginType;
            this.supportFaceLogin = localQueryLoginType2 != null ? Intrinsics.areEqual((Object) true, (Object) localQueryLoginType2.getSupportFaceLogin()) : false;
            LocalQueryLoginType localQueryLoginType3 = this.queryLoginType;
            if (localQueryLoginType3 != null) {
                int i4 = component3 + 75;
                getAsAtTimestamp = i4 % 128;
                zAreEqual2 = i4 % 2 == 0 ? Intrinsics.areEqual((Object) false, (Object) localQueryLoginType3.getSupportForgetPin()) : Intrinsics.areEqual((Object) true, (Object) localQueryLoginType3.getSupportForgetPin());
            } else {
                zAreEqual2 = false;
            }
            this.supportForgetPin = zAreEqual2;
            LocalQueryLoginType localQueryLoginType4 = this.queryLoginType;
            Map<String, Object> extension = localQueryLoginType4 != null ? localQueryLoginType4.getExtension() : null;
            if (extension != null) {
                this.headerUrl = (String) extension.get(Keys.KEY_HEADER_URL);
                this.userName = (String) extension.get("name");
            }
        } else {
            this.supportFingerprintLogin = getIntent().getBooleanExtra(KeysConstants.KEY_IS_SUPPORT_FINGERPRINT_LOGIN, false);
            this.supportFaceLogin = getIntent().getBooleanExtra(KeysConstants.KEY_IS_SUPPORT_FACE_LOGIN, false);
        }
        this.isChange = getIntent().getBooleanExtra("isChange", false);
        this.token = getIntent().getStringExtra("token");
        if (getIntent().hasExtra(Keys.KEY_HEADER_URL)) {
            int i5 = component3 + 107;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
            this.headerUrl = getIntent().getStringExtra(Keys.KEY_HEADER_URL);
        }
        if (getIntent().hasExtra("name")) {
            this.userName = getIntent().getStringExtra("name");
        }
    }

    private final void showTemporaryDialog() {
        int i = 2 % 2;
        new TemporaryDialog(new Function1() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component2 + 115;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Unit unit$r8$lambda$SWf51ZXBaeKQXalc1AorPLkMoxo = SFCPinLoginActivity.$r8$lambda$SWf51ZXBaeKQXalc1AorPLkMoxo(this.f$0, (LocalQueryLoginType) obj);
                int i5 = component2 + 51;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    return unit$r8$lambda$SWf51ZXBaeKQXalc1AorPLkMoxo;
                }
                throw null;
            }
        }).show(getSupportFragmentManager(), "temporaryDialog");
        int i2 = component3 + 61;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit showTemporaryDialog$lambda$2(SFCPinLoginActivity sFCPinLoginActivity, LocalQueryLoginType localQueryLoginType) {
        Unit unit;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 71;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(sFCPinLoginActivity, "");
            Intrinsics.checkNotNullParameter(localQueryLoginType, "");
            sFCPinLoginActivity.handleQueryLoginType(localQueryLoginType);
            unit = Unit.INSTANCE;
            int i3 = 3 / 0;
        } else {
            Intrinsics.checkNotNullParameter(sFCPinLoginActivity, "");
            Intrinsics.checkNotNullParameter(localQueryLoginType, "");
            sFCPinLoginActivity.handleQueryLoginType(localQueryLoginType);
            unit = Unit.INSTANCE;
        }
        int i4 = getAsAtTimestamp + 117;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void handleQueryLoginType(LocalQueryLoginType queryLoginType) {
        int i = 2 % 2;
        this.queryLoginType = queryLoginType;
        this.supportFingerprintLogin = Intrinsics.areEqual((Object) true, (Object) queryLoginType.getSupportFingerprintLogin());
        this.supportFaceLogin = Intrinsics.areEqual((Object) true, (Object) queryLoginType.getSupportFaceLogin());
        this.supportForgetPin = Intrinsics.areEqual((Object) true, (Object) queryLoginType.getSupportForgetPin());
        Map<String, Object> extension = queryLoginType.getExtension();
        if (extension != null) {
            int i2 = getAsAtTimestamp + 77;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            this.headerUrl = (String) extension.get(Keys.KEY_HEADER_URL);
            this.userName = (String) extension.get("name");
        }
        updateUI();
        int i4 = component3 + 71;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        super.onStart();
        ((IBiometricService) RouteUtils.getService(IBiometricService.class)).checkBiometricChange(this, new ApiCallback<Boolean>() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(Boolean bool) {
                int i2 = 2 % 2;
                int i3 = component3 + 23;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess(bool.booleanValue());
                int i5 = component2 + 7;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 75 / 0;
                }
            }

            public void onSuccess(boolean aBoolean) {
                int i2 = 2 % 2;
                super.onSuccess(Boolean.valueOf(aBoolean));
                SFCPinLoginActivity.access$showLoginPriority(SFCPinLoginActivity.this, aBoolean);
                if (BiometricHelper2.getInstance().isOpenFingerprintLogin()) {
                    int i3 = component2 + 87;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    if (SFCPinLoginActivity.access$getSupportFingerprintLogin$p(SFCPinLoginActivity.this)) {
                        ((ActivitySfcBasePinBinding) SFCPinLoginActivity.access$getBinding$p(SFCPinLoginActivity.this)).virtualKeyboardView.showBiometric();
                    }
                }
                int i5 = component3 + 43;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 45 / 0;
                }
            }
        });
        int i2 = component3 + 89;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void showLoginPriority(boolean r7) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.showLoginPriority(boolean):void");
    }

    private final void showLastLogin() {
        int i = 2 % 2;
        int i2 = component3 + 101;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        String string = SPUtils.getInstance(AppConfigManager.SP_APP).getString(SPConstant.KEY_LAST_LOGIN_TYPE);
        Intrinsics.checkNotNullExpressionValue(string, "");
        if (Intrinsics.areEqual(string, "0")) {
            int i4 = getAsAtTimestamp + 23;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                BiometricHelper2.getInstance().isOpenFaceIdLogin();
                throw null;
            }
            if (BiometricHelper2.getInstance().isOpenFaceIdLogin()) {
                int i5 = getAsAtTimestamp + 13;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                if (this.supportFaceLogin) {
                    loginWithFaceId();
                }
            }
        }
        if (Intrinsics.areEqual(string, "1")) {
            int i7 = getAsAtTimestamp + 25;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            if (BiometricHelper2.getInstance().isOpenFingerprintLogin() && this.supportFingerprintLogin) {
                loginWithFingerprint();
            }
        }
        int i9 = getAsAtTimestamp + 31;
        component3 = i9 % 128;
        int i10 = i9 % 2;
    }

    private final void loginWithFingerprint() {
        int i = 2 % 2;
        BiometricHelper2.getInstance().loginWithFingerprint(new ApiCallback<String>() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(String str) {
                int i2 = 2 % 2;
                int i3 = copydefault + 117;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(str);
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onSuccess2(java.lang.String r5) {
                /*
                    r4 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity r1 = com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.this
                    com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.access$simulatePinEntry(r1)
                    com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity r1 = com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.this
                    com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.access$initBiometricViewModel(r1)
                    com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity r1 = com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.this
                    com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model.LocalQueryLoginType r1 = com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.access$getQueryLoginType$p(r1)
                    if (r1 == 0) goto L76
                    com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity r1 = com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.this
                    com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model.LocalQueryLoginType r1 = com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.access$getQueryLoginType$p(r1)
                    if (r1 == 0) goto L76
                    r2 = 1
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                    java.lang.Boolean r1 = r1.getNewProcess()
                    boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r1)
                    if (r1 == 0) goto L76
                    int r1 = com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.C08461.component3
                    int r1 = r1 + 123
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.C08461.copydefault = r2
                    int r1 = r1 % r0
                    com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity r1 = com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.this
                    com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model.LocalQueryLoginType r1 = com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.access$getQueryLoginType$p(r1)
                    if (r1 == 0) goto L54
                    int r2 = com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.C08461.copydefault
                    int r2 = r2 + 65
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.C08461.component3 = r3
                    int r2 = r2 % r0
                    if (r2 != 0) goto L4f
                    java.lang.String r0 = r1.getLoginType()
                    if (r0 != 0) goto L56
                    goto L54
                L4f:
                    r1.getLoginType()
                    r5 = 0
                    throw r5
                L54:
                    java.lang.String r0 = ""
                L56:
                    com.huawei.digitalpayment.consumer.risk.bean.ProcessVerifyParams r1 = new com.huawei.digitalpayment.consumer.risk.bean.ProcessVerifyParams
                    r1.<init>(r0)
                    java.lang.String r0 = "credential"
                    r1.addParams(r0, r5)
                    java.lang.String r5 = "initiatorMsisdn"
                    java.lang.String r0 = com.huawei.digitalpayment.consumer.baselib.util.PhoneUtils.getRecentLoginPhone()
                    r1.addParams(r5, r0)
                    java.lang.String r5 = "biometricType"
                    java.lang.String r0 = "01"
                    r1.addParams(r5, r0)
                    com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity r5 = com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.this
                    com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.access$doRiskProcess(r5, r1, r0)
                    goto L81
                L76:
                    com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity r0 = com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.this
                    com.huawei.digitalpayment.consumer.login.vm.BiometricLoginViewModel r0 = com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.access$getBiometricLoginViewModel$p(r0)
                    if (r0 == 0) goto L81
                    r0.fingerprintLogin(r5)
                L81:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.C08461.onSuccess2(java.lang.String):void");
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component3 + 73;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                if (e.getCode() == 7) {
                    CommonToast.showText(com.huawei.digitalpayment.consumer.login.R.string.biometric_the_operation_is_too_frequent_please_try_again_later);
                    int i5 = component3 + 75;
                    copydefault = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
        });
        int i2 = getAsAtTimestamp + 57;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private final void initBiometricViewModel() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 23;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.biometricLoginViewModel == null) {
            BiometricLoginViewModel biometricLoginViewModel = (BiometricLoginViewModel) new ViewModelProvider(this).get(BiometricLoginViewModel.class);
            this.biometricLoginViewModel = biometricLoginViewModel;
            if (biometricLoginViewModel != null) {
                int i3 = getAsAtTimestamp + 65;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                LiveData<Resource<LocalLoginInfo>> data = biometricLoginViewModel.getData();
                if (data != null) {
                    data.observe(this, new ShareDataUIState(new Function1() {
                        private static int component3 = 1;
                        private static int copydefault;

                        @Override
                        public final Object invoke(Object obj) {
                            int i5 = 2 % 2;
                            int i6 = component3 + 109;
                            copydefault = i6 % 128;
                            int i7 = i6 % 2;
                            Unit unit$r8$lambda$UqbgvZ4q2saBjUkMzYyg6A_5CUk = SFCPinLoginActivity.$r8$lambda$UqbgvZ4q2saBjUkMzYyg6A_5CUk(this.f$0, (Resource) obj);
                            int i8 = component3 + 49;
                            copydefault = i8 % 128;
                            if (i8 % 2 != 0) {
                                int i9 = 99 / 0;
                            }
                            return unit$r8$lambda$UqbgvZ4q2saBjUkMzYyg6A_5CUk;
                        }
                    }));
                }
            }
        }
        int i5 = component3 + 91;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 42 / 0;
        }
    }

    private static final Unit initBiometricViewModel$lambda$3(SFCPinLoginActivity sFCPinLoginActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = component3 + 113;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(sFCPinLoginActivity, "");
            Intrinsics.checkNotNullParameter(resource, "");
            sFCPinLoginActivity.onLoginResponse(resource);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(sFCPinLoginActivity, "");
        Intrinsics.checkNotNullParameter(resource, "");
        sFCPinLoginActivity.onLoginResponse(resource);
        int i3 = 47 / 0;
        return Unit.INSTANCE;
    }

    private final void loginWithFaceId() {
        int i = 2 % 2;
        BiometricHelper2.getInstance().loginWithFaceId(new ApiCallback<String>() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(String str) {
                int i2 = 2 % 2;
                int i3 = copydefault + 85;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(str);
                if (i4 != 0) {
                    int i5 = 93 / 0;
                }
            }

            public void onSuccess2(String value) {
                LocalQueryLoginType localQueryLoginTypeAccess$getQueryLoginType$p;
                String loginType;
                int i2 = 2 % 2;
                int i3 = component2 + 71;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                SFCPinLoginActivity.access$initBiometricViewModel(SFCPinLoginActivity.this);
                if (SFCPinLoginActivity.access$getQueryLoginType$p(SFCPinLoginActivity.this) != null && (localQueryLoginTypeAccess$getQueryLoginType$p = SFCPinLoginActivity.access$getQueryLoginType$p(SFCPinLoginActivity.this)) != null) {
                    int i5 = copydefault + 97;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                    boolean zAreEqual = Intrinsics.areEqual((Object) true, (Object) localQueryLoginTypeAccess$getQueryLoginType$p.getNewProcess());
                    int i7 = copydefault;
                    int i8 = i7 + 21;
                    component2 = i8 % 128;
                    int i9 = i8 % 2;
                    if (zAreEqual) {
                        int i10 = i7 + 63;
                        component2 = i10 % 128;
                        int i11 = i10 % 2;
                        LocalQueryLoginType localQueryLoginTypeAccess$getQueryLoginType$p2 = SFCPinLoginActivity.access$getQueryLoginType$p(SFCPinLoginActivity.this);
                        if (localQueryLoginTypeAccess$getQueryLoginType$p2 == null || (loginType = localQueryLoginTypeAccess$getQueryLoginType$p2.getLoginType()) == null) {
                            loginType = "";
                        }
                        ProcessVerifyParams processVerifyParams = new ProcessVerifyParams(loginType);
                        processVerifyParams.addParams("initiatorMsisdn", PhoneUtils.getRecentLoginPhone());
                        processVerifyParams.addParams("credential", value);
                        processVerifyParams.addParams("biometricType", "00");
                        SFCPinLoginActivity.access$doRiskProcess(SFCPinLoginActivity.this, processVerifyParams, "00");
                        return;
                    }
                }
                BiometricLoginViewModel biometricLoginViewModelAccess$getBiometricLoginViewModel$p = SFCPinLoginActivity.access$getBiometricLoginViewModel$p(SFCPinLoginActivity.this);
                if (biometricLoginViewModelAccess$getBiometricLoginViewModel$p != null) {
                    biometricLoginViewModelAccess$getBiometricLoginViewModel$p.faceIdLogin(value);
                }
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = copydefault + 63;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                if (e.getCode() == 7) {
                    int i5 = component2 + 75;
                    copydefault = i5 % 128;
                    if (i5 % 2 == 0) {
                        CommonToast.showText(com.huawei.digitalpayment.consumer.login.R.string.biometric_the_operation_is_too_frequent_please_try_again_later);
                        throw null;
                    }
                    CommonToast.showText(com.huawei.digitalpayment.consumer.login.R.string.biometric_the_operation_is_too_frequent_please_try_again_later);
                } else {
                    ToastUtils.showLong(e.getMessage(), new Object[0]);
                }
                int i6 = component2 + 59;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
            }
        });
        int i2 = component3 + 77;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void addObserver() {
        int i = 2 % 2;
        ((PinLoginViewModel) this.viewModel).getData().observe(this, new ShareDataUIState(new Function1() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 27;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Unit unitM10680$r8$lambda$qUzX327tn2OyBVBz4p8ylc8ZU = SFCPinLoginActivity.m10680$r8$lambda$qUzX327tn2OyBVBz4p8ylc8ZU(this.f$0, (Resource) obj);
                int i5 = component3 + 93;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 76 / 0;
                }
                return unitM10680$r8$lambda$qUzX327tn2OyBVBz4p8ylc8ZU;
            }
        }));
        int i2 = component3 + 37;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit addObserver$lambda$4(SFCPinLoginActivity sFCPinLoginActivity, Resource resource) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sFCPinLoginActivity, "");
        if (resource.success()) {
            sFCPinLoginActivity.saveLoginType("2");
            int i2 = component3 + 1;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 / 2;
            }
        }
        Intrinsics.checkNotNull(resource);
        sFCPinLoginActivity.onLoginResponse(resource);
        Unit unit = Unit.INSTANCE;
        int i4 = component3 + 69;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void saveLoginType(String biometricType) {
        int i = 2 % 2;
        if (!Intrinsics.areEqual("00", biometricType)) {
            if (Intrinsics.areEqual("01", biometricType)) {
                int i2 = component3 + 79;
                getAsAtTimestamp = i2 % 128;
                if (i2 % 2 == 0) {
                    SPUtils.getInstance(AppConfigManager.SP_APP).put(SPConstant.KEY_LAST_LOGIN_TYPE, "1");
                    int i3 = 30 / 0;
                    return;
                } else {
                    SPUtils.getInstance(AppConfigManager.SP_APP).put(SPConstant.KEY_LAST_LOGIN_TYPE, "1");
                    return;
                }
            }
            SPUtils.getInstance(AppConfigManager.SP_APP).put(SPConstant.KEY_LAST_LOGIN_TYPE, "2");
            return;
        }
        int i4 = component3 + 93;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            SPUtils.getInstance(AppConfigManager.SP_APP).put(SPConstant.KEY_LAST_LOGIN_TYPE, "0");
            return;
        }
        SPUtils.getInstance(AppConfigManager.SP_APP).put(SPConstant.KEY_LAST_LOGIN_TYPE, "0");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onLoginResponse(Resource<LocalLoginInfo> resource) {
        String execute;
        String execute2;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 31;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        if (resource.error()) {
            int i4 = component3 + 61;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 == 0) {
                String message = resource.getMessage();
                Intrinsics.checkNotNullExpressionValue(message, "");
                showPinError(message);
                TextUtils.equals(this.OPERATION_FAILED, resource.getException().getResponseCode());
                throw null;
            }
            String message2 = resource.getMessage();
            Intrinsics.checkNotNullExpressionValue(message2, "");
            showPinError(message2);
            if (TextUtils.equals(this.OPERATION_FAILED, resource.getException().getResponseCode())) {
                ActivityUtils.finishAllActivitiesExceptNewest();
                RouteUtils.routeWithExecute(this, RoutePathConstants.LOGIN);
                finish();
            }
            if (Intrinsics.areEqual(HttpStatus.CONSUMER_PIN_ERROR_MAXIMUM, resource.getException().getResponseCode())) {
                PinLockedUtil.INSTANCE.showPinLockedDialog(this);
                return;
            }
            return;
        }
        if (resource.success()) {
            ((PinLoginViewModel) this.viewModel).clearState();
            LocalLoginInfo data = resource.getData();
            Boolean bool = (Boolean) (data != null ? data.getExtensionByKey("isFirstLogin") : null);
            SPUtils.getInstance().put("spIsFirstLogin", bool != null ? bool.booleanValue() : false);
            if (TextUtils.isEmpty(data != null ? data.getExecute() : null)) {
                LoginUtils.guideOpenBiometricLogin(getPinValue().toString(), data);
                return;
            }
            if (data != null) {
                int i5 = component3 + 69;
                getAsAtTimestamp = i5 % 128;
                if (i5 % 2 == 0) {
                    execute = data.getExecute();
                    int i6 = 82 / 0;
                } else {
                    execute = data.getExecute();
                }
            } else {
                execute = null;
            }
            Uri uri = SafeUri.parse(execute);
            if (uri == null) {
                return;
            }
            if (TextUtils.equals(uri.getPath(), "/loginModule/otpVerifyNewDevice")) {
                SFCPinLoginActivity sFCPinLoginActivity = this;
                String execute3 = data != null ? data.getExecute() : null;
                RouteUtils.routeWithExecute(sFCPinLoginActivity, execute3 + "?smsCodeType=" + SmsCodeType.NEW_DEVICE_SMS_CODE.getSmsCode());
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putSerializable("queryLoginType", this.queryLoginType);
            SFCPinLoginActivity sFCPinLoginActivity2 = this;
            if (data != null) {
                int i7 = getAsAtTimestamp + 47;
                component3 = i7 % 128;
                int i8 = i7 % 2;
                execute2 = data.getExecute();
            } else {
                execute2 = null;
            }
            RouteUtils.routeWithExecute(sFCPinLoginActivity2, execute2, bundle);
        }
        int i9 = getAsAtTimestamp + 7;
        component3 = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void doRiskProcess(com.huawei.digitalpayment.consumer.risk.bean.ProcessVerifyParams r8, final java.lang.String r9) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = r7.token
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 0
            java.lang.String r4 = ""
            if (r2 != 0) goto L42
            int r2 = com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.getAsAtTimestamp
            int r2 = r2 + 87
            int r5 = r2 % 128
            com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.component3 = r5
            int r2 = r2 % r0
            if (r2 == 0) goto L27
            java.lang.String r2 = r7.token
            r5 = 1
            int r5 = r5 / r3
            if (r2 != 0) goto L2c
            goto L2b
        L27:
            java.lang.String r2 = r7.token
            if (r2 != 0) goto L2c
        L2b:
            r2 = r4
        L2c:
            r8.setToken(r2)
            com.huawei.digitalpayment.consumer.baselib.init.TokenHelper r2 = com.huawei.digitalpayment.consumer.baselib.init.TokenHelper.INSTANCE
            r2.clearToken()
            int r2 = com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.getAsAtTimestamp
            int r2 = r2 + 13
            int r5 = r2 % 128
            com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.component3 = r5
            int r2 = r2 % r0
            if (r2 == 0) goto L42
            r0 = 5
            int r0 = r0 / 4
        L42:
            com.safaricom.mpesa.logging.L r0 = com.safaricom.mpesa.logging.L.INSTANCE
            java.lang.String r2 = r7.TAG
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            java.lang.String r4 = r8.getToken()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "token: "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r0.d(r2, r4, r3)
            java.lang.String r0 = "riskParams"
            java.io.Serializable r8 = (java.io.Serializable) r8
            r1.putSerializable(r0, r8)
            com.huawei.digitalpayment.consumer.login.util.RiskUtil r8 = com.huawei.digitalpayment.consumer.login.util.RiskUtil.INSTANCE
            r0 = r7
            android.app.Activity r0 = (android.app.Activity) r0
            com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity$doRiskProcess$1 r2 = new com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity$doRiskProcess$1
            r2.<init>()
            com.huawei.common.listener.ApiCallback r2 = (com.huawei.common.listener.ApiCallback) r2
            r8.startProcess(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.doRiskProcess(com.huawei.digitalpayment.consumer.risk.bean.ProcessVerifyParams, java.lang.String):void");
    }

    private final void autoLogin(final String loginType) {
        int i = 2 % 2;
        ((ILoginModuleService) RouteUtils.getService(ILoginModuleService.class)).autoLogin(new ApiCallback<BaseResp>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component1 + 9;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(baseResp);
                if (i4 == 0) {
                    throw null;
                }
                int i5 = component3 + 115;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onSuccess2(BaseResp value) {
                int i2 = 2 % 2;
                if (!(value instanceof LocalLoginInfo)) {
                    SFCPinLoginActivity sFCPinLoginActivity = SFCPinLoginActivity.this;
                    Resource resourceError = Resource.error(new BaseException(SFCPinLoginActivity.this.getString(com.huawei.digitalpayment.consumer.login.R.string.login_auto_login_failed)), null);
                    Intrinsics.checkNotNullExpressionValue(resourceError, "");
                    SFCPinLoginActivity.access$onLoginResponse(sFCPinLoginActivity, resourceError);
                    int i3 = component3 + 51;
                    component1 = i3 % 128;
                    int i4 = i3 % 2;
                    return;
                }
                int i5 = component1 + 105;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    SFCPinLoginActivity.access$saveLoginType(SFCPinLoginActivity.this, loginType);
                    SFCPinLoginActivity sFCPinLoginActivity2 = SFCPinLoginActivity.this;
                    Resource resourceSuccess = Resource.success(value);
                    Intrinsics.checkNotNullExpressionValue(resourceSuccess, "");
                    SFCPinLoginActivity.access$onLoginResponse(sFCPinLoginActivity2, resourceSuccess);
                    return;
                }
                SFCPinLoginActivity.access$saveLoginType(SFCPinLoginActivity.this, loginType);
                SFCPinLoginActivity sFCPinLoginActivity3 = SFCPinLoginActivity.this;
                Resource resourceSuccess2 = Resource.success(value);
                Intrinsics.checkNotNullExpressionValue(resourceSuccess2, "");
                SFCPinLoginActivity.access$onLoginResponse(sFCPinLoginActivity3, resourceSuccess2);
                int i6 = 71 / 0;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component1 + 79;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    SFCPinLoginActivity sFCPinLoginActivity = SFCPinLoginActivity.this;
                    Resource resourceError = Resource.error(e, null);
                    Intrinsics.checkNotNullExpressionValue(resourceError, "");
                    SFCPinLoginActivity.access$onLoginResponse(sFCPinLoginActivity, resourceError);
                    return;
                }
                Intrinsics.checkNotNullParameter(e, "");
                SFCPinLoginActivity sFCPinLoginActivity2 = SFCPinLoginActivity.this;
                Resource resourceError2 = Resource.error(e, null);
                Intrinsics.checkNotNullExpressionValue(resourceError2, "");
                SFCPinLoginActivity.access$onLoginResponse(sFCPinLoginActivity2, resourceError2);
                int i4 = 1 / 0;
            }
        });
        int i2 = component3 + 81;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void checkIfSimCardWasRemoved() throws Throwable {
        Object[] objArr;
        int i;
        int i2 = 2 % 2;
        try {
            SimSubscriptionIdChecker simSubscriptionIdChecker = new SimSubscriptionIdChecker(this);
            if (simSubscriptionIdChecker.checkIfUserHasEnabledThisFeature() && simSubscriptionIdChecker.checkIfSavedSimCardWasRemoved()) {
                logoutAndNavigateToLoginScreen();
            }
        } catch (Exception e) {
            String message = e.getMessage();
            if (message != null) {
                L l = L.INSTANCE;
                String str = this.TAG;
                Intrinsics.checkNotNullExpressionValue(str, "");
                l.d(str, message, new Object[0]);
            }
        }
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1526905718);
        if (objCopydefault == null) {
            int scrollBarSize = 999 - (ViewConfiguration.getScrollBarSize() >> 8);
            int i3 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 30;
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 61686);
            byte[] bArr = $$g;
            byte b2 = bArr[87];
            byte b3 = bArr[75];
            Object[] objArr2 = new Object[1];
            k(b2, b3, b3, objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(scrollBarSize, i3, cLastIndexOf, -1638177773, false, (String) objArr2[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr3 = new Object[1];
        l(new int[]{0, 22, 175, 0}, new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, false, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        m(16 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952792_res_0x7f130498).substring(2, 3).codePointAt(0) + 16), new char[]{27, 16, 14, 6, 4, 27, 2, 22, 24, 16, CharUtils.CR, 3, '\n', 7, 13871}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1898903466);
        if (objCopydefault2 == null) {
            int iKeyCodeFromString = 999 - KeyEvent.keyCodeFromString("");
            int defaultSize = View.getDefaultSize(0, 0) + 31;
            char cResolveSize = (char) (View.resolveSize(0, 0) + 61685);
            byte[] bArr2 = $$g;
            Object[] objArr5 = new Object[1];
            k((byte) (-bArr2[14]), bArr2[64], (byte) (-bArr2[3]), objArr5);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iKeyCodeFromString, defaultSize, cResolveSize, 1267259187, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1897979945);
            if (objCopydefault3 == null) {
                int i4 = 999 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int maxKeyCode = 31 - (KeyEvent.getMaxKeyCode() >> 16);
                char maxKeyCode2 = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 61685);
                Object[] objArr6 = new Object[1];
                k((byte) (-$$g[14]), r11[64], r11[80], objArr6);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i4, maxKeyCode, maxKeyCode2, 1267122354, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[1])[0];
            int i7 = Settings.System.getInt(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getContentResolver(), "screen_brightness", -1);
            int i8 = ~i7;
            int i9 = (((2002843428 + (((~((-198942930) | i8)) | (~((-550530465) | i8))) * (-867))) + ((((~((-198942930) | i7)) | 13639808) | (~((-550530465) | i7))) * (-1734))) + (((~(i7 | (-536890657))) | ((~(i8 | (-13639809))) | (~((-185303122) | i7)))) * 867)) - 1895753137;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[3])[0] = i11 ^ (i11 << 5);
            i = 2;
        } else {
            try {
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1123955845);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getDoubleTapTimeout() >> 16) + 2217, 45 - KeyEvent.getDeadChar(0, 0), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), -2019038240, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objCopydefault4).newInstance(null), -1895753137, 1};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-44327625);
                if (objCopydefault5 == null) {
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 1000;
                    int doubleTapTimeout = 31 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    char cLastIndexOf2 = (char) (61684 - TextUtils.lastIndexOf("", '0'));
                    Object[] objArr9 = new Object[1];
                    k((byte) (-$$g[14]), r12[64], (byte) 33, objArr9);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, doubleTapTimeout, cLastIndexOf2, 939672146, false, (String) objArr9[0], new Class[]{(Class) ITrustedWebActivityCallbackDefault.copydefault(1030 - KeyEvent.getDeadChar(0, 0), TextUtils.getOffsetBefore("", 0) + 42, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (Class) ITrustedWebActivityCallbackDefault.copydefault(1072 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 43, (char) (33530 - MotionEvent.axisFromString(""))), Integer.TYPE, Integer.TYPE});
                }
                objArr = (Object[]) ((Method) objCopydefault5).invoke(null, objArr8);
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1897979945);
                if (objCopydefault6 == null) {
                    int offsetBefore = 999 - TextUtils.getOffsetBefore("", 0);
                    int iIndexOf2 = 31 - TextUtils.indexOf("", "");
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 61686);
                    Object[] objArr10 = new Object[1];
                    k((byte) (-$$g[14]), r9[64], r9[80], objArr10);
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(offsetBefore, iIndexOf2, cIndexOf, 1267122354, false, (String) objArr10[0], null);
                }
                ((Field) objCopydefault6).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    l(new int[]{0, 22, 175, 0}, new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, false, objArr11);
                    Class<?> cls2 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    m(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952747_res_0x7f13046b).substring(22, 23).codePointAt(0) - 17, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952721_res_0x7f130451).substring(6, 7).codePointAt(0) + 16), new char[]{27, 16, 14, 6, 4, 27, 2, 22, 24, 16, CharUtils.CR, 3, '\n', 7, 13871}, objArr12);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-1898903466);
                    if (objCopydefault7 == null) {
                        int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0') + 1000;
                        int i12 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 30;
                        char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 61685);
                        byte[] bArr3 = $$g;
                        Object[] objArr13 = new Object[1];
                        k((byte) (-bArr3[14]), bArr3[64], (byte) (-bArr3[3]), objArr13);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf3, i12, threadPriority, 1267259187, false, (String) objArr13[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(1526905718);
                    if (objCopydefault8 == null) {
                        int i13 = 999 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int iIndexOf4 = TextUtils.indexOf("", "", 0) + 31;
                        char modifierMetaStateMask = (char) (61684 - ((byte) KeyEvent.getModifierMetaStateMask()));
                        byte[] bArr4 = $$g;
                        byte b4 = bArr4[87];
                        byte b5 = bArr4[75];
                        Object[] objArr14 = new Object[1];
                        k(b4, b5, b5, objArr14);
                        objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(i13, iIndexOf4, modifierMetaStateMask, -1638177773, false, (String) objArr14[0], null);
                    }
                    ((Field) objCopydefault8).set(null, lValueOf2);
                    int i14 = component3 + 85;
                    getAsAtTimestamp = i14 % 128;
                    i = 2;
                    int i15 = i14 % 2;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i16 = ((int[]) objArr[1])[0];
        int i17 = ((int[]) objArr[i])[0];
        if (i17 == i16) {
            int i18 = getAsAtTimestamp + 3;
            component3 = i18 % 128;
            int i19 = i18 % i;
            Object[] objArr15 = new Object[4];
            objArr15[1] = new int[]{i};
            objArr15[i] = new int[]{i};
            objArr15[3] = new int[1];
            int i20 = ((int[]) objArr[3])[0];
            int i21 = ((int[]) objArr[i])[0];
            int i22 = ((int[]) objArr[1])[0];
            objArr15[0] = new String[0];
            int i23 = ~System.identityHashCode(this);
            int i24 = i20 + 1066190641 + (((~(i23 | 758553108)) | 8913314) * (-160)) + (((~(i23 | 9079714)) | 758553108) * 160);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr15[3])[0] = i26 ^ (i26 << 5);
            Object[] objArr16 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i27 = ((int[]) objArr15[3])[0];
            int i28 = ((int[]) objArr15[2])[0];
            int i29 = ((int[]) objArr15[1])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i30 = i27 + (-48726769) + (((~((~iIdentityHashCode) | (-34719242))) | (~(467664445 | iIdentityHashCode))) * (-302)) + ((~((-34719242) | iIdentityHashCode)) * (-604)) + (((~(iIdentityHashCode | 432945204)) | 151136256) * 302);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr16[3])[0] = i32 ^ (i32 << 5);
            return;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[0];
        if (strArr != null) {
            for (String str2 : strArr) {
                int i33 = getAsAtTimestamp + 27;
                component3 = i33 % 128;
                int i34 = i33 % 2;
                arrayList.add(str2);
            }
        }
        long j2 = -1;
        long j3 = ((long) (i16 ^ i17)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
        long j4 = 0;
        long j5 = j3 | (((long) 11) << 32) | (j4 - ((j4 >> 63) << 32));
        Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
        if (objCopydefault9 == null) {
            objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault((KeyEvent.getMaxKeyCode() >> 16) + 6618, 42 - TextUtils.getTrimmedLength(""), (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 428292935, false, "ShareDataUIState", new Class[0]);
        }
        Object objInvoke = ((Method) objCopydefault9).invoke(null, null);
        Object[] objArr17 = {-1964035567, Long.valueOf(j5), arrayList, null, false, false};
        Object objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
        if (objCopydefault10 == null) {
            objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getEdgeSlop() >> 16) + 6562, View.combineMeasuredStates(0, 0) + 56, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
        }
        ((Method) objCopydefault10).invoke(objInvoke, objArr17);
        Object[] objArr18 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
        int i35 = ((int[]) objArr[3])[0];
        int i36 = ((int[]) objArr[2])[0];
        int i37 = ((int[]) objArr[1])[0];
        int iCodePointAt = ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952812_res_0x7f1304ac).substring(55, 56).codePointAt(0) + 770988718;
        int i38 = (~((-738609449) | iCodePointAt)) | 278792;
        int i39 = i35 + (-1622142079) + (i38 * 992) + ((i38 | (~((~iCodePointAt) | 749194601))) * (-496)) + ((iCodePointAt | 10863945) * 496);
        int i40 = (i39 << 13) ^ i39;
        int i41 = i40 ^ (i40 >>> 17);
        ((int[]) objArr18[3])[0] = i41 ^ (i41 << 5);
        int[] iArr = new int[i17];
        int i42 = i17 - 1;
        iArr[i42] = 1;
        Toast.makeText((Context) null, iArr[((i17 * i42) % 2) - 1], 1).show();
        Object[] objArr19 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
        int i43 = ((int[]) objArr18[3])[0];
        int i44 = ((int[]) objArr18[2])[0];
        int i45 = ((int[]) objArr18[1])[0];
        int mode = ((AudioManager) ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService("audio")).getMode();
        int i46 = i43 + 1491789203 + (((~((~mode) | (-334701339))) | 279978770) * 446) + (((~(mode | (-54722569))) | 134793285) * 446) + 316479836;
        int i47 = (i46 << 13) ^ i46;
        int i48 = i47 ^ (i47 >>> 17);
        ((int[]) objArr19[3])[0] = i48 ^ (i48 << 5);
    }

    private final void logoutAndNavigateToLoginScreen() {
        int i = 2 % 2;
        BiometricHelper2.getInstance().closeFingerprintLogin();
        if (GsmHelper.INSTANCE.isGsmLogin()) {
            int i2 = component3 + 119;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            GsmHelper.INSTANCE.setGsmLogin(false);
        }
        SPUtils.getInstance().put("recent_login_phone_number", "");
        SPUtils.getInstance().put(SIM_DEFAULTS.PREF_SUBSCRIPTION_ID, -1);
        SPUtils.getInstance(BiometricConstants.BIOMETRIC_SP_NAME).put(getExtraKey() + "_showBiometricDialog", false);
        UserLifecycleManager.get().logout(Utils.getApp());
        RouteUtils.routeWithExecute(this, RoutePathConstants.LOGIN, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        ActivityUtils.finishAllActivities();
        int i4 = getAsAtTimestamp + 41;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final String getExtraKey() {
        int i = 2 % 2;
        String str = "_" + SPUtils.getInstance().getString(BiometricConstants.CURRENT_ACCOUNT);
        int i2 = component3 + 69;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = getAsAtTimestamp + 93;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            l(new int[]{45, 26, 83, 0}, new byte[]{1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, true, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            m(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131954659_res_0x7f130be3).substring(6, 9).length() + 15, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 25), new char[]{'\t', 22, 13804, 13804, JSONLexer.EOI, '\"', 7, CharUtils.CR, 13806, 13806, 21, 15, 6, 16, 3, 7, '\"', '!'}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i4 = component3 + 109;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - View.resolveSizeAndState(0, 0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 42, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((Process.myPid() >> 22) + 6562, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 56, (char) Gravity.getAbsoluteGravity(0, 0), -699576857, false, "component2", new Class[]{Context.class});
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
        checkIfSimCardWasRemoved();
        int i6 = component3 + 11;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override
    @Deprecated(message = "Deprecated in Java")
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = component3 + 75;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        finish();
        if (i3 == 0) {
            throw null;
        }
        int i4 = getAsAtTimestamp + 117;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a7  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(57:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|773|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|(3:802|33|(1:39)(1:38))(1:43)|44|776|45|(1:47)|48|767|49|(1:51)|52|76|(10:848|77|(1:79)|80|81|845|82|(1:84)|85|817)|(3:87|(1:89)|90)(2:(2:92|(1:98)(1:97))(1:99)|(21:101|102|821|103|831|104|(1:106)|107|108|823|109|(1:111)|112|113|114|(1:116)|117|(1:119)(1:120)|121|(1:123)|124)(36:172|173|189|800|190|(1:192)|193|(3:195|(1:197)|198)(19:199|200|792|201|(1:203)|204|205|784|206|(1:208)|209|210|211|(1:213)|214|(1:216)(1:217)|218|(1:220)|221)|222|(4:225|(2:227|856)(11:228|(3:230|(3:233|234|231)|857)|235|778|236|(1:238)|239|240|769|241|855)|242|223)|854|279|794|280|(1:282)|283|(3:285|(1:287)|288)(19:289|290|782|291|(1:293)|294|295|774|296|(1:298)|299|300|301|(1:303)|304|(1:306)(1:307)|308|(1:310)|311)|312|(4:315|(13:317|(3:319|322|860)|323|(3:325|(3:328|329|326)|861)|330|765|331|(1:333)|334|335|763|336|859)(2:320|(2:322|860)(11:323|(0)|330|765|331|(0)|334|335|763|336|859))|337|313)|858|374|805|375|(1:377)|378|(3:380|(1:382)|383)(14:385|386|796|387|(1:389)|390|391|392|(1:394)|395|(1:397)(1:398)|399|(1:401)|402)|384|403|(9:406|790|407|(1:409)|410|411|412|780|413)|443|(1:445)|446|(3:448|(1:450)|451)(14:453|454|(1:456)|457|458|(1:460)|461|835|462|463|(1:465)(1:466)|467|(1:469)|470)|452|471|(27:473|(1:475)|476|(1:478)|479|(3:481|(1:483)|484)(16:486|487|(1:489)|490|(1:492)|493|494|(1:496)|497|846|498|499|(1:501)|502|(1:504)|505)|485|506|(1:508)(9:509|(3:511|(2:514|512)|869)|515|516|(1:518)|519|(1:521)|522|523)|524|837|525|(13:827|527|532|533|833|534|(3:536|820|537)|541|542|(5:544|545|(1:547)|548|549)(13:550|(2:552|(2:554|(1:560)(1:559))(2:561|562))|(22:564|565|816|566|567|825|568|(1:570)|571|572|818|573|(1:575)|576|577|578|(1:580)|581|(1:583)|584|(1:586)|587)(1:632)|638|639|788|640|643|644|(1:646)|647|648|649)|588|(4:591|(3:864|593|867)(12:862|594|(3:596|(3:599|600|597)|868)|601|810|602|(1:604)|605|606|803|607|866)|865|589)|863)(11:532|533|833|534|(0)|541|542|(0)(0)|588|(1:589)|863)|650|(1:652)|653|(3:655|(1:657)|658)(13:660|771|661|662|(1:664)|665|814|666|667|(1:669)|670|(1:672)|673)|659|674|(6:677|678|(1:680)|681|682|683)|684|(1:686)|687|(3:689|(1:691)|692)(14:694|695|(1:697)|698|699|(1:701)|702|808|703|704|(1:706)|707|(1:709)|710)|693|711|(1:876)(7:714|715|(1:717)|718|719|720|721))(10:733|(3:735|(4:738|(3:872|740|875)(3:871|741|874)|873|736)|870)|742|743|(1:745)|746|(1:748)|749|750|751)))|125|(4:128|(2:130|852)(11:131|(3:133|(3:136|137|134)|853)|138|812|139|(1:141)|142|143|806|144|851)|145|126)|850|159|173|189|800|190|(0)|193|(0)(0)|222|(1:223)|854|279|794|280|(0)|283|(0)(0)|312|(1:313)|858|374|805|375|(0)|378|(0)(0)|384|403|(0)|443|(0)|446|(0)(0)|452|471|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0fde, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0fdf, code lost:
    
        r14 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x1552, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x1553, code lost:
    
        r14 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x19e2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x19e3, code lost:
    
        r8 = new java.lang.Object[1];
        l(new int[]{345, 11, 0, 2}, new byte[]{0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0}, false, r8);
        r5 = (java.lang.String) r8[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x19ff, code lost:
    
        r6 = new java.io.ByteArrayOutputStream();
        r7 = new java.io.PrintStream(r6);
        r0.printStackTrace(r7);
        r7.close();
        r4 = r6.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x1a16, code lost:
    
        r4 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x1a1a, code lost:
    
        r6 = new java.util.ArrayList(2);
        r6.add(r4);
        r6.add(r5);
        r13 = -1;
        r4 = (((long) 0) << 32) | (r13 - ((r13 >> 63) << 32));
        r13 = 0;
        r4 = (r4 & ((long) 1)) | ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x1a49, code lost:
    
        r7 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x1a4d, code lost:
    
        if (r7 == null) goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x1a4f, code lost:
    
        r7 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(android.view.KeyEvent.keyCodeFromString("") + 6618, 42 - android.text.TextUtils.getCapsMode("", 0, 0), (char) android.view.KeyEvent.getDeadChar(0, 0), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x1a74, code lost:
    
        r7 = ((java.lang.reflect.Method) r7).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x1a7b, code lost:
    
        r8 = com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.component3 + 27;
        com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.getAsAtTimestamp = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x1a86, code lost:
    
        r11 = new java.lang.Object[]{-1238216636, java.lang.Long.valueOf(r4), r6, null, false};
        r4 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(6562 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 56 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
        r5 = com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.$$B;
        r13 = new java.lang.Object[1];
        n(r5[62], r5[4], (byte) (com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.$$C & 112), r13);
        r4.getMethod((java.lang.String) r13[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r7, r11);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0b16 A[Catch: all -> 0x02b9, TryCatch #5 {all -> 0x02b9, blocks: (B:183:0x0b10, B:185:0x0b16, B:186:0x0b44, B:273:0x104c, B:275:0x1052, B:276:0x1081, B:368:0x15bf, B:370:0x15c5, B:371:0x15ed, B:644:0x2afc, B:646:0x2b02, B:647:0x2b2b, B:678:0x2e30, B:680:0x2e36, B:681:0x2e61, B:715:0x317a, B:717:0x3180, B:718:0x31a7, B:695:0x2fb6, B:697:0x2fd9, B:698:0x3035, B:516:0x240e, B:518:0x2414, B:519:0x243d, B:521:0x2477, B:522:0x24c0, B:487:0x207f, B:489:0x2094, B:490:0x20c3, B:492:0x20f7, B:493:0x2172, B:743:0x3292, B:745:0x3298, B:746:0x32bf, B:748:0x32f9, B:749:0x3339, B:454:0x1c42, B:456:0x1c57, B:457:0x1c85, B:437:0x1a49, B:439:0x1a4f, B:440:0x1a74, B:70:0x0447, B:72:0x044d, B:73:0x0473, B:19:0x013f, B:21:0x0145, B:22:0x016d, B:24:0x022c, B:26:0x025d, B:27:0x02b3, B:33:0x02cb, B:35:0x02cf, B:56:0x03b3, B:58:0x03b9, B:59:0x03ba, B:61:0x03bc, B:63:0x03c3, B:64:0x03c4, B:39:0x02db, B:375:0x1672, B:377:0x1678, B:378:0x16ba, B:380:0x16c7, B:382:0x16d0, B:383:0x1719, B:403:0x18d3, B:411:0x193f, B:417:0x19c6, B:419:0x19cc, B:420:0x19cd, B:422:0x19cf, B:424:0x19d6, B:425:0x19d7, B:385:0x1725, B:392:0x17ae, B:394:0x17b4, B:395:0x17fb, B:397:0x1825, B:399:0x186d, B:401:0x1884, B:402:0x18c9, B:427:0x19d9, B:429:0x19e0, B:430:0x19e1), top: B:773:0x013f, inners: #22, #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0bd1 A[Catch: all -> 0x0fde, TryCatch #21 {all -> 0x0fde, blocks: (B:190:0x0bcb, B:192:0x0bd1, B:193:0x0c16, B:195:0x0c23, B:197:0x0c2c, B:198:0x0c6e, B:222:0x0e91, B:223:0x0e95, B:225:0x0e9b, B:228:0x0eb7, B:231:0x0ec4, B:233:0x0ec7, B:199:0x0c79, B:211:0x0d73, B:213:0x0d79, B:214:0x0dbb, B:216:0x0de5, B:218:0x0e2e, B:220:0x0e45, B:221:0x0e89), top: B:800:0x0bcb }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0c23 A[Catch: all -> 0x0fde, TryCatch #21 {all -> 0x0fde, blocks: (B:190:0x0bcb, B:192:0x0bd1, B:193:0x0c16, B:195:0x0c23, B:197:0x0c2c, B:198:0x0c6e, B:222:0x0e91, B:223:0x0e95, B:225:0x0e9b, B:228:0x0eb7, B:231:0x0ec4, B:233:0x0ec7, B:199:0x0c79, B:211:0x0d73, B:213:0x0d79, B:214:0x0dbb, B:216:0x0de5, B:218:0x0e2e, B:220:0x0e45, B:221:0x0e89), top: B:800:0x0bcb }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0c79 A[Catch: all -> 0x0fde, TRY_LEAVE, TryCatch #21 {all -> 0x0fde, blocks: (B:190:0x0bcb, B:192:0x0bd1, B:193:0x0c16, B:195:0x0c23, B:197:0x0c2c, B:198:0x0c6e, B:222:0x0e91, B:223:0x0e95, B:225:0x0e9b, B:228:0x0eb7, B:231:0x0ec4, B:233:0x0ec7, B:199:0x0c79, B:211:0x0d73, B:213:0x0d79, B:214:0x0dbb, B:216:0x0de5, B:218:0x0e2e, B:220:0x0e45, B:221:0x0e89), top: B:800:0x0bcb }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0e9b A[Catch: all -> 0x0fde, TryCatch #21 {all -> 0x0fde, blocks: (B:190:0x0bcb, B:192:0x0bd1, B:193:0x0c16, B:195:0x0c23, B:197:0x0c2c, B:198:0x0c6e, B:222:0x0e91, B:223:0x0e95, B:225:0x0e9b, B:228:0x0eb7, B:231:0x0ec4, B:233:0x0ec7, B:199:0x0c79, B:211:0x0d73, B:213:0x0d79, B:214:0x0dbb, B:216:0x0de5, B:218:0x0e2e, B:220:0x0e45, B:221:0x0e89), top: B:800:0x0bcb }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x110b A[Catch: all -> 0x1552, TryCatch #17 {all -> 0x1552, blocks: (B:280:0x1105, B:282:0x110b, B:283:0x1151, B:285:0x115e, B:287:0x1167, B:288:0x11a9, B:312:0x13db, B:313:0x13df, B:317:0x13f1, B:323:0x1424, B:326:0x1431, B:328:0x1434, B:320:0x1409, B:289:0x11b4, B:301:0x12be, B:303:0x12c4, B:304:0x1306, B:306:0x1330, B:308:0x1375, B:310:0x138c, B:311:0x13d3), top: B:794:0x1105 }] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x115e A[Catch: all -> 0x1552, TryCatch #17 {all -> 0x1552, blocks: (B:280:0x1105, B:282:0x110b, B:283:0x1151, B:285:0x115e, B:287:0x1167, B:288:0x11a9, B:312:0x13db, B:313:0x13df, B:317:0x13f1, B:323:0x1424, B:326:0x1431, B:328:0x1434, B:320:0x1409, B:289:0x11b4, B:301:0x12be, B:303:0x12c4, B:304:0x1306, B:306:0x1330, B:308:0x1375, B:310:0x138c, B:311:0x13d3), top: B:794:0x1105 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x11b4 A[Catch: all -> 0x1552, TRY_LEAVE, TryCatch #17 {all -> 0x1552, blocks: (B:280:0x1105, B:282:0x110b, B:283:0x1151, B:285:0x115e, B:287:0x1167, B:288:0x11a9, B:312:0x13db, B:313:0x13df, B:317:0x13f1, B:323:0x1424, B:326:0x1431, B:328:0x1434, B:320:0x1409, B:289:0x11b4, B:301:0x12be, B:303:0x12c4, B:304:0x1306, B:306:0x1330, B:308:0x1375, B:310:0x138c, B:311:0x13d3), top: B:794:0x1105 }] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x13e5  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x1430  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x1469 A[Catch: all -> 0x1530, TryCatch #1 {all -> 0x1530, blocks: (B:331:0x1463, B:333:0x1469, B:334:0x1492), top: B:765:0x1463, outer: #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x1678 A[Catch: all -> 0x19e2, TryCatch #24 {all -> 0x19e2, blocks: (B:375:0x1672, B:377:0x1678, B:378:0x16ba, B:380:0x16c7, B:382:0x16d0, B:383:0x1719, B:403:0x18d3, B:411:0x193f, B:417:0x19c6, B:419:0x19cc, B:420:0x19cd, B:422:0x19cf, B:424:0x19d6, B:425:0x19d7, B:385:0x1725, B:392:0x17ae, B:394:0x17b4, B:395:0x17fb, B:397:0x1825, B:399:0x186d, B:401:0x1884, B:402:0x18c9, B:427:0x19d9, B:429:0x19e0, B:430:0x19e1, B:413:0x1945, B:407:0x1906, B:409:0x190c, B:410:0x1938, B:387:0x1745, B:389:0x1757, B:390:0x17a2), top: B:805:0x1672, outer: #5, inners: #9, #14, #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x16c7 A[Catch: all -> 0x19e2, TryCatch #24 {all -> 0x19e2, blocks: (B:375:0x1672, B:377:0x1678, B:378:0x16ba, B:380:0x16c7, B:382:0x16d0, B:383:0x1719, B:403:0x18d3, B:411:0x193f, B:417:0x19c6, B:419:0x19cc, B:420:0x19cd, B:422:0x19cf, B:424:0x19d6, B:425:0x19d7, B:385:0x1725, B:392:0x17ae, B:394:0x17b4, B:395:0x17fb, B:397:0x1825, B:399:0x186d, B:401:0x1884, B:402:0x18c9, B:427:0x19d9, B:429:0x19e0, B:430:0x19e1, B:413:0x1945, B:407:0x1906, B:409:0x190c, B:410:0x1938, B:387:0x1745, B:389:0x1757, B:390:0x17a2), top: B:805:0x1672, outer: #5, inners: #9, #14, #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x1725 A[Catch: all -> 0x19e2, TRY_LEAVE, TryCatch #24 {all -> 0x19e2, blocks: (B:375:0x1672, B:377:0x1678, B:378:0x16ba, B:380:0x16c7, B:382:0x16d0, B:383:0x1719, B:403:0x18d3, B:411:0x193f, B:417:0x19c6, B:419:0x19cc, B:420:0x19cd, B:422:0x19cf, B:424:0x19d6, B:425:0x19d7, B:385:0x1725, B:392:0x17ae, B:394:0x17b4, B:395:0x17fb, B:397:0x1825, B:399:0x186d, B:401:0x1884, B:402:0x18c9, B:427:0x19d9, B:429:0x19e0, B:430:0x19e1, B:413:0x1945, B:407:0x1906, B:409:0x190c, B:410:0x1938, B:387:0x1745, B:389:0x1757, B:390:0x17a2), top: B:805:0x1672, outer: #5, inners: #9, #14, #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x18e5  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x1b0c  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x1b59  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x1c22  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x1dc8  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x2633  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x268e  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x26f1  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x294b A[Catch: all -> 0x2a76, TryCatch #30 {all -> 0x2a76, blocks: (B:588:0x2941, B:589:0x2945, B:591:0x294b, B:594:0x2965, B:597:0x297c, B:599:0x297f, B:611:0x2a64, B:613:0x2a6a, B:614:0x2a6b, B:616:0x2a6d, B:618:0x2a74, B:619:0x2a75, B:566:0x272d, B:578:0x282e, B:580:0x2834, B:581:0x2876, B:583:0x28a0, B:584:0x28e2, B:586:0x28f8, B:587:0x293b, B:623:0x2a79, B:625:0x2a80, B:626:0x2a81, B:628:0x2a83, B:630:0x2a8a, B:631:0x2a8b, B:607:0x29e3, B:602:0x29ab, B:604:0x29b1, B:605:0x29db, B:573:0x2790, B:575:0x27af, B:576:0x2822, B:568:0x2741, B:570:0x2756, B:571:0x2789), top: B:816:0x272d, inners: #23, #27, #32, #36 }] */
    /* JADX WARN: Removed duplicated region for block: B:646:0x2b02 A[Catch: all -> 0x02b9, TryCatch #5 {all -> 0x02b9, blocks: (B:183:0x0b10, B:185:0x0b16, B:186:0x0b44, B:273:0x104c, B:275:0x1052, B:276:0x1081, B:368:0x15bf, B:370:0x15c5, B:371:0x15ed, B:644:0x2afc, B:646:0x2b02, B:647:0x2b2b, B:678:0x2e30, B:680:0x2e36, B:681:0x2e61, B:715:0x317a, B:717:0x3180, B:718:0x31a7, B:695:0x2fb6, B:697:0x2fd9, B:698:0x3035, B:516:0x240e, B:518:0x2414, B:519:0x243d, B:521:0x2477, B:522:0x24c0, B:487:0x207f, B:489:0x2094, B:490:0x20c3, B:492:0x20f7, B:493:0x2172, B:743:0x3292, B:745:0x3298, B:746:0x32bf, B:748:0x32f9, B:749:0x3339, B:454:0x1c42, B:456:0x1c57, B:457:0x1c85, B:437:0x1a49, B:439:0x1a4f, B:440:0x1a74, B:70:0x0447, B:72:0x044d, B:73:0x0473, B:19:0x013f, B:21:0x0145, B:22:0x016d, B:24:0x022c, B:26:0x025d, B:27:0x02b3, B:33:0x02cb, B:35:0x02cf, B:56:0x03b3, B:58:0x03b9, B:59:0x03ba, B:61:0x03bc, B:63:0x03c3, B:64:0x03c4, B:39:0x02db, B:375:0x1672, B:377:0x1678, B:378:0x16ba, B:380:0x16c7, B:382:0x16d0, B:383:0x1719, B:403:0x18d3, B:411:0x193f, B:417:0x19c6, B:419:0x19cc, B:420:0x19cd, B:422:0x19cf, B:424:0x19d6, B:425:0x19d7, B:385:0x1725, B:392:0x17ae, B:394:0x17b4, B:395:0x17fb, B:397:0x1825, B:399:0x186d, B:401:0x1884, B:402:0x18c9, B:427:0x19d9, B:429:0x19e0, B:430:0x19e1), top: B:773:0x013f, inners: #22, #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:652:0x2bb9  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x2c0d  */
    /* JADX WARN: Removed duplicated region for block: B:660:0x2c62  */
    /* JADX WARN: Removed duplicated region for block: B:677:0x2e12  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x2ef1  */
    /* JADX WARN: Removed duplicated region for block: B:689:0x2f43  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x2f98  */
    /* JADX WARN: Removed duplicated region for block: B:714:0x315c  */
    /* JADX WARN: Removed duplicated region for block: B:733:0x3247  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:876:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v100 */
    /* JADX WARN: Type inference failed for: r12v101 */
    /* JADX WARN: Type inference failed for: r12v102 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v43, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v51 */
    /* JADX WARN: Type inference failed for: r12v52, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v53 */
    /* JADX WARN: Type inference failed for: r12v54 */
    /* JADX WARN: Type inference failed for: r12v55 */
    /* JADX WARN: Type inference failed for: r12v60 */
    /* JADX WARN: Type inference failed for: r12v61 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r12v64, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r12v68 */
    /* JADX WARN: Type inference failed for: r12v79 */
    /* JADX WARN: Type inference failed for: r12v88 */
    /* JADX WARN: Type inference failed for: r12v89 */
    /* JADX WARN: Type inference failed for: r12v90 */
    /* JADX WARN: Type inference failed for: r12v91 */
    /* JADX WARN: Type inference failed for: r12v92 */
    /* JADX WARN: Type inference failed for: r12v93 */
    /* JADX WARN: Type inference failed for: r12v94 */
    /* JADX WARN: Type inference failed for: r12v95 */
    /* JADX WARN: Type inference failed for: r12v96 */
    /* JADX WARN: Type inference failed for: r12v97 */
    /* JADX WARN: Type inference failed for: r12v98 */
    /* JADX WARN: Type inference failed for: r12v99 */
    /* JADX WARN: Type inference failed for: r14v106 */
    /* JADX WARN: Type inference failed for: r14v108 */
    /* JADX WARN: Type inference failed for: r14v109 */
    /* JADX WARN: Type inference failed for: r14v110 */
    /* JADX WARN: Type inference failed for: r14v111 */
    /* JADX WARN: Type inference failed for: r14v113 */
    /* JADX WARN: Type inference failed for: r14v114 */
    /* JADX WARN: Type inference failed for: r14v134 */
    /* JADX WARN: Type inference failed for: r14v135 */
    /* JADX WARN: Type inference failed for: r14v136 */
    /* JADX WARN: Type inference failed for: r14v137 */
    /* JADX WARN: Type inference failed for: r14v142 */
    /* JADX WARN: Type inference failed for: r14v143 */
    /* JADX WARN: Type inference failed for: r14v144 */
    /* JADX WARN: Type inference failed for: r14v145 */
    /* JADX WARN: Type inference failed for: r14v146 */
    /* JADX WARN: Type inference failed for: r14v147 */
    /* JADX WARN: Type inference failed for: r14v148 */
    /* JADX WARN: Type inference failed for: r14v149 */
    /* JADX WARN: Type inference failed for: r14v150 */
    /* JADX WARN: Type inference failed for: r14v151 */
    /* JADX WARN: Type inference failed for: r14v152 */
    /* JADX WARN: Type inference failed for: r14v153 */
    /* JADX WARN: Type inference failed for: r14v154 */
    /* JADX WARN: Type inference failed for: r14v155 */
    /* JADX WARN: Type inference failed for: r14v156 */
    /* JADX WARN: Type inference failed for: r14v157 */
    /* JADX WARN: Type inference failed for: r14v158 */
    /* JADX WARN: Type inference failed for: r14v159 */
    /* JADX WARN: Type inference failed for: r14v160 */
    /* JADX WARN: Type inference failed for: r14v161 */
    /* JADX WARN: Type inference failed for: r14v162 */
    /* JADX WARN: Type inference failed for: r14v163 */
    /* JADX WARN: Type inference failed for: r14v164 */
    /* JADX WARN: Type inference failed for: r14v165 */
    /* JADX WARN: Type inference failed for: r14v166 */
    /* JADX WARN: Type inference failed for: r14v167 */
    /* JADX WARN: Type inference failed for: r14v168 */
    /* JADX WARN: Type inference failed for: r14v169 */
    /* JADX WARN: Type inference failed for: r14v170 */
    /* JADX WARN: Type inference failed for: r14v171 */
    /* JADX WARN: Type inference failed for: r14v172 */
    /* JADX WARN: Type inference failed for: r14v173 */
    /* JADX WARN: Type inference failed for: r14v174 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v48 */
    /* JADX WARN: Type inference failed for: r14v55 */
    /* JADX WARN: Type inference failed for: r14v64 */
    /* JADX WARN: Type inference failed for: r14v65 */
    /* JADX WARN: Type inference failed for: r14v66 */
    /* JADX WARN: Type inference failed for: r14v71 */
    /* JADX WARN: Type inference failed for: r14v72 */
    /* JADX WARN: Type inference failed for: r14v73 */
    /* JADX WARN: Type inference failed for: r14v74 */
    /* JADX WARN: Type inference failed for: r14v75 */
    /* JADX WARN: Type inference failed for: r14v76 */
    /* JADX WARN: Type inference failed for: r14v77 */
    /* JADX WARN: Type inference failed for: r14v78 */
    /* JADX WARN: Type inference failed for: r14v83 */
    /* JADX WARN: Type inference failed for: r14v84 */
    /* JADX WARN: Type inference failed for: r14v85 */
    /* JADX WARN: Type inference failed for: r14v86 */
    /* JADX WARN: Type inference failed for: r14v87 */
    /* JADX WARN: Type inference failed for: r14v88 */
    /* JADX WARN: Type inference failed for: r14v89 */
    /* JADX WARN: Type inference failed for: r14v90 */
    /* JADX WARN: Type inference failed for: r14v91 */
    /* JADX WARN: Type inference failed for: r14v93, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r14v94 */
    /* JADX WARN: Type inference failed for: r14v95 */
    /* JADX WARN: Type inference failed for: r14v96 */
    /* JADX WARN: Type inference failed for: r14v97 */
    /* JADX WARN: Type inference failed for: r14v98 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v38 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /* JADX WARN: Type inference failed for: r15v45 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v49 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v57 */
    /* JADX WARN: Type inference failed for: r15v67 */
    /* JADX WARN: Type inference failed for: r15v68 */
    /* JADX WARN: Type inference failed for: r15v69 */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r15v71 */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v73 */
    /* JADX WARN: Type inference failed for: r15v74 */
    /* JADX WARN: Type inference failed for: r15v75 */
    /* JADX WARN: Type inference failed for: r15v76 */
    /* JADX WARN: Type inference failed for: r15v77 */
    /* JADX WARN: Type inference failed for: r15v78 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r23v8 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v258 */
    /* JADX WARN: Type inference failed for: r3v262 */
    /* JADX WARN: Type inference failed for: r3v277 */
    /* JADX WARN: Type inference failed for: r3v285 */
    /* JADX WARN: Type inference failed for: r3v289 */
    /* JADX WARN: Type inference failed for: r3v304 */
    /* JADX WARN: Type inference failed for: r3v307 */
    /* JADX WARN: Type inference failed for: r3v308 */
    /* JADX WARN: Type inference failed for: r3v309 */
    /* JADX WARN: Type inference failed for: r3v324 */
    /* JADX WARN: Type inference failed for: r3v325 */
    /* JADX WARN: Type inference failed for: r3v326 */
    /* JADX WARN: Type inference failed for: r3v327 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v527 */
    /* JADX WARN: Type inference failed for: r7v149 */
    /* JADX WARN: Type inference failed for: r7v150 */
    /* JADX WARN: Type inference failed for: r7v151 */
    /* JADX WARN: Type inference failed for: r7v152, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v172 */
    /* JADX WARN: Type inference failed for: r7v173 */
    /* JADX WARN: Type inference failed for: r7v177 */
    /* JADX WARN: Type inference failed for: r7v178, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v465 */
    /* JADX WARN: Type inference failed for: r7v466 */
    /* JADX WARN: Type inference failed for: r7v467 */
    /* JADX WARN: Type inference failed for: r7v468 */
    /* JADX WARN: Type inference failed for: r7v469 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 13824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.login.ui.activity.SFCPinLoginActivity.attachBaseContext(android.content.Context):void");
    }

    public static Unit $r8$lambda$SWf51ZXBaeKQXalc1AorPLkMoxo(SFCPinLoginActivity sFCPinLoginActivity, LocalQueryLoginType localQueryLoginType) {
        int i = 2 % 2;
        int i2 = component3 + 49;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Unit unitShowTemporaryDialog$lambda$2 = showTemporaryDialog$lambda$2(sFCPinLoginActivity, localQueryLoginType);
        int i4 = component3 + 9;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return unitShowTemporaryDialog$lambda$2;
    }

    public static Unit $r8$lambda$UqbgvZ4q2saBjUkMzYyg6A_5CUk(SFCPinLoginActivity sFCPinLoginActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = component3 + 101;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Unit unitInitBiometricViewModel$lambda$3 = initBiometricViewModel$lambda$3(sFCPinLoginActivity, resource);
        int i4 = component3 + 71;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return unitInitBiometricViewModel$lambda$3;
    }

    public static Unit m10680$r8$lambda$qUzX327tn2OyBVBz4p8ylc8ZU(SFCPinLoginActivity sFCPinLoginActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = component3 + 61;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAddObserver$lambda$4 = addObserver$lambda$4(sFCPinLoginActivity, resource);
        int i4 = getAsAtTimestamp + 21;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
        return unitAddObserver$lambda$4;
    }

    static {
        component4 = 0;
        component3();
        copydefault();
        int i = equals + 101;
        component4 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override
    public boolean isLogin() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 113;
        component3 = i3 % 128;
        boolean z = i3 % 2 == 0;
        int i4 = i2 + 7;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    @Override
    public boolean showBiometric() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 85;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 65;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
        return false;
    }

    static void copydefault() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 89;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        component1 = 7774878943396669234L;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 65;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 0 / 0;
        }
    }

    static void component3() {
        copydefault = new char[]{33367, 33737, 33735, 33733, 33728, 33732, 33738, 33319, 33314, 33791, 33312, 33328, 33738, 33786, 33789, 33732, 33735, 33752, 33753, 33731, 33735, 33737, 33447, 33326, 33333, 33341, 33336, 33329, 33280, 33378, 33297, 33328, 33299, 33304, 33339, 33333, 33329, 33334, 33336, 33338, 33461, 33293, 33291, 33280, 33292, 33412, 33386, 33385, 33377, 33311, 33390, 33382, 33302, 33310, 33309, 33309, 33310, 33377, 33402, 33365, 33405, 33308, 33380, 33349, 33347, 33382, 33376, 33308, 33377, 33379, 33381, 33365, 33740, 33312, 33336, 33314, 33759, 33335, 33312, 33737, 33315, 33316, 33313, 33334, 33332, 33335, 33313, 33312, 33313, 33316, 33338, 33336, 33314, 33315, 33337, 33312, 33313, 33335, 33758, 33312, 33314, 33740, 33738, 33735, 33736, 33738, 33317, 33341, 33340, 33336, 33759, 33739, 33314, 33336, 33339, 33339, 33337, 33336, 33336, 33478, 33428, 33428, 33517, 33519, 33517, 33428, 33468, 33429, 33427, 33428, 33517, 33513, 33512, 33427, 33468, 33428, 33518, 33515, 33426, 33430, 33428, 33428, 33518, 33514, 33426, 33468, 33428, 33515, 33512, 33512, 33427, 33430, 33515, 33426, 33469, 33468, 33467, 33429, 33429, 33468, 33426, 33511, 33514, 33428, 33426, 33514, 33516, 33429, 33428, 33430, 33470, 33427, 33512, 33424, 33424, 33512, 33515, 33513, 33511, 33514, 33513, 33512, 33512, 33352, 33777, 33779, 33787, 33783, 33783, 33754, 33332, 33744, 33746, 33747, 33777, 33784, 33790, 33786, 33785, 33752, 33752, 33784, 33788, 33756, 33750, 33782, 33787, 33756, 33755, 33785, 33787, 33785, 33777, 33778, 33785, 33785, 33787, 33785, 33782, 33754, 33747, 33777, 33786, 33730, 33785, 33786, 33729, 33785, 33783, 33782, 33747, 33756, 33730, 33751, 33327, 33329, 33330, 33328, 33329, 33329, 33328, 33751, 33752, 33327, 33325, 33326, 33327, 33330, 33333, 33328, 33742, 33779, 33778, 33776, 33782, 33480, 33518, 33517, 33520, 33516, 33513, 33475, 33512, 33428, 33429, 33514, 33516, 33429, 33429, 33430, 33428, 33514, 33516, 33429, 33427, 33518, 33521, 33519, 33515, 33515, 33521, 33519, 33515, 33514, 33514, 33518, 33432, 33429, 33517, 33430, 33432, 33518, 33426, 33427, 33427, 33425, 33513, 33509, 33449, 33471, 33419, 33461, 33458, 33418, 33414, 33462, 33467, 33464, 33465, 33467, 33462, 33454, 33457, 33446, 33325, 33328, 33327, 33327, 33327, 33324, 33325, 33328, 33329, 33329, 33433, 33365, 33364, 33362, 33366, 33367, 33366, 33364, 33363, 33363, 33362, 33508, 33446, 33444, 33447, 33448, 33445, 33442, 33443, 33445, 33445, 33475, 33513, 33517, 33515, 33515, 33515, 33511, 33511, 33512, 33512, 33514, 33466, 33302, 33300, 33299, 33299, 33298, 33299, 33301, 33300, 33298};
        component2 = new char[]{12824, 2036, 2034, 2035, 2020, 1974, 2029, 1985, 2032, 2025, 2019, 2038, 2017, 2003, 1966, 2028, 1973, 2026, 2023, 1971, 2002, 2037, 2041, 2018, 1975, 1976, 1969, 1977, 2021, 1968, 2022, 12827, 2030, 2031, 1970, 1972};
        ShareDataUIState = (char) 12828;
    }
}
