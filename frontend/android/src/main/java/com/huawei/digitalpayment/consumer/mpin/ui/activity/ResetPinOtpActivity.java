package com.huawei.digitalpayment.consumer.mpin.ui.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.Observer;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.blankj.utilcode.util.CollectionUtils;
import com.blankj.utilcode.util.KeyboardUtils;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.databinding.ActivityAbstractOtpBinding;
import com.huawei.digitalpayment.consumer.baselib.http.HttpStatus;
import com.huawei.digitalpayment.consumer.baselib.init.TokenHelper;
import com.huawei.digitalpayment.consumer.baselib.otp.model.OtpType;
import com.huawei.digitalpayment.consumer.baselib.util.DialogUtils;
import com.huawei.digitalpayment.consumer.baselib.util.DialogUtils$$ExternalSyntheticLambda1;
import com.huawei.digitalpayment.consumer.constants.Keys;
import com.huawei.digitalpayment.consumer.login.R;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyForgotPinSmsResp;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType;
import com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ResetPinOtpViewModel;
import com.huawei.digitalpayment.consumer.risk.bean.ProcessVerifyParams;
import com.huawei.digitalpayment.consumer.risk.constant.RiskConstant;
import com.huawei.digitalpayment.consumer.service.IRiskService;
import com.huawei.http.BaseRequestParams;
import com.huawei.payment.mvvm.Resource;
import com.huawei.payment.mvvm.Utils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.notify;

public class ResetPinOtpActivity extends Hilt_ResetPinOtpActivity<ActivityAbstractOtpBinding, ResetPinOtpViewModel> {
    private static final byte[] $$D = {62, TarHeader.LF_FIFO, 60, 44};
    private static final int $$E = 116;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$B = {4, -80, 45, 109, -12, 2, 63, -57, -8, 0, 8, -5, 7, TarHeader.LF_CONTIG, -56, -3, -9, 13, 3, 1, -18, Ascii.SO, TarHeader.LF_CONTIG, -69, Ascii.SO, -14, 0, 10, -6, 1, -5, 69, -54, 3, -6, 0, 2, -13, 68, -59, -5, -6, Ascii.SI, -13, 4, 13, -11, 62, -34, -34, 13, 2, -12, 1, 10, -5, -11, Ascii.VT, -6, 1, -5, -21, 7, -17, 13, 33, -29, -19, 19, Ascii.FF, Ascii.FF, -10, -33, 19, -19, Ascii.SI, -12, 2, -3, 1, 1, 9, -9, -6, 65, -12, 2, 63, -51, -11, 3, 7, 1, -1, 1, TarHeader.LF_CHR, -51, -17, 9, -13, 17, -13, 68, -51, -15, 0, 66, -19, -47, 0, 34, -33, Ascii.VT, -1, 65, -14, Ascii.SO, -13};
    private static final int $$C = 203;
    private static final byte[] $$j = {Ascii.VT, -55, -20, -91, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -12, Ascii.FF, -19, -15, -20, -6, -11, -7, -7, 1, -17, -14, 58, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$k = 195;
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private static long component3 = 8640741430178004650L;
    private static int component2 = -890926543;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$F(short r5, short r6, int r7) {
        /*
            int r5 = r5 * 3
            int r5 = 4 - r5
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinOtpActivity.$$D
            int r6 = r6 + 65
            int r7 = r7 * 2
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r6
            r6 = r7
            r3 = r2
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L21:
            r4 = r0[r5]
            int r3 = r3 + 1
        L25:
            int r6 = r6 + r4
            int r5 = r5 + 1
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinOtpActivity.$$F(short, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void p(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r6 = 103 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinOtpActivity.$$j
            int r7 = r7 + 4
            int r1 = r8 + 4
            byte[] r1 = new byte[r1]
            int r8 = r8 + 3
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2b:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-8)
            int r7 = r3 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinOtpActivity.p(int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void q(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 16
            int r8 = 99 - r8
            int r7 = r7 * 6
            int r0 = 58 - r7
            int r6 = r6 * 3
            int r6 = 84 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinOtpActivity.$$B
            byte[] r0 = new byte[r0]
            int r7 = 57 - r7
            r2 = 0
            if (r1 != 0) goto L19
            r8 = r6
            r3 = r7
            r4 = r2
            goto L31
        L19:
            r3 = r2
        L1a:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2b:
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L31:
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinOtpActivity.q(byte, int, short, java.lang.Object[]):void");
    }

    private static void j(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = $10 + 43;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = notifyVar.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTouchSlop() >> 8) + 3266, TextUtils.getOffsetBefore("", 0) + 33, (char) (60268 - (ViewConfiguration.getFadingEdgeLength() >> 16)), -834797019, false, $$F(b2, (byte) (b2 | 37), b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (component3 ^ 5431355972723572778L);
                Object[] objArr3 = {notifyVar, notifyVar};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault2 == null) {
                    byte b3 = (byte) 0;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 686, 35 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 60372), -1969106284, false, $$F(b3, (byte) (b3 | 40), b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i6 = $11 + 77;
                $10 = i6 % 128;
                int i7 = i6 % 2;
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
                byte b4 = (byte) 0;
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 687, View.MeasureSpec.getMode(0) + 34, (char) (60373 - View.resolveSize(0, 0)), -1969106284, false, $$F(b4, (byte) (b4 | 40), b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    private static void k(int i, char[] cArr, int i2, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i3];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i3) {
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i2 + iTrustedWebActivityServiceStub.component3);
            int i5 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(component2)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getEdgeSlop() >> 16) + 3784, AndroidCharacter.getMirror('0') - '\n', (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 26860), 2015799920, false, $$F(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7406 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.getCapsMode("", 0, 0) + 16, (char) Color.blue(0), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault2).invoke(null, objArr3);
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
        }
        if (i > 0) {
            int i6 = $11 + 125;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            iTrustedWebActivityServiceStub.component1 = i;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i3 - iTrustedWebActivityServiceStub.component1);
        }
        if (z) {
            int i8 = $10 + 29;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i3];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i3) {
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i3 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                try {
                    Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionGroup(0L) + 7406, ExpandableListView.getPackedPositionType(0L) + 16, (char) ExpandableListView.getPackedPositionGroup(0L), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                    int i10 = $11 + 117;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00a2  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2981
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinOtpActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public void onConfirmClick(String str) {
        int i = 2 % 2;
        KeyboardUtils.hideSoftInput(this);
        ProcessVerifyParams processVerifyParams = new ProcessVerifyParams(RiskConstant.LOGIN_TYPE_NO_LOGIN_RESET_PIN, str, RiskConstant.OTP_TYPE_FORGET_PIN, SPUtils.getInstance().getString("recent_login_phone_number"));
        Bundle bundle = new Bundle();
        bundle.putSerializable(KeysConstants.KEY_RISK_PARAMS, processVerifyParams);
        ((IRiskService) RouteUtils.getService(IRiskService.class)).startProcess(bundle);
        int i2 = ShareDataUIState + 7;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void getSmsCode() {
        int i = 2 % 2;
        ((ResetPinOtpViewModel) this.viewModel).sendResetSms(new BaseRequestParams());
        int i2 = copydefault + 75;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 41 / 0;
        }
    }

    private void lambda$addObserver$0(Resource resource) {
        int i = 2 % 2;
        Utils.showOrHideLoading(this, resource);
        if (resource.error()) {
            ((ActivityAbstractOtpBinding) this.binding).etCode.showError(resource.getMessage());
            ((ActivityAbstractOtpBinding) this.binding).etCode.clear();
            if ("timeout".equals(resource.getException().getResponseCode())) {
                DialogUtils.showConnectTimeOutDialog(this, new DialogUtils$$ExternalSyntheticLambda1());
            }
            if (HttpStatus.OTP_VERIFY_LIMIT.equals(resource.getException().getResponseCode())) {
                DialogUtils.showTimesLimitDialog(this, new DialogUtils$$ExternalSyntheticLambda1());
                return;
            }
            return;
        }
        if (resource.success()) {
            TokenHelper.INSTANCE.setTempToken(((VerifyForgotPinSmsResp) resource.getData()).getToken());
            Bundle bundle = new Bundle();
            List<VerifyType> verifyTypes = ((VerifyForgotPinSmsResp) resource.getData()).getVerifyTypes();
            if (CollectionUtils.isNotEmpty(verifyTypes)) {
                bundle.putParcelableArrayList(Keys.VERIFY_LIST, new ArrayList<>(verifyTypes));
            }
            RouteUtils.routeWithExecute(RoutePathConstants.RESET_PIN_WARRING, bundle);
            finish();
            int i2 = copydefault + 13;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 / 4;
            }
        }
        int i4 = copydefault + 29;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    private void addObserver() {
        int i = 2 % 2;
        ((ResetPinOtpViewModel) this.viewModel).getData().observe(this, new Observer() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 83;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                ResetPinOtpActivity.$r8$lambda$GmJV8946JVwsuH2JLiUj5gkMbDs(this.f$0, (Resource) obj);
                if (i4 != 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        ((ResetPinOtpViewModel) this.viewModel).getSmsData().observe(this, new Observer() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 15;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                ResetPinOtpActivity.$r8$lambda$JGm1oPbfDSauxLF37aIMX85MJs0(this.f$0, (Resource) obj);
                int i5 = ShareDataUIState + 97;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = ShareDataUIState + 7;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void lambda$addObserver$1(Resource resource) {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            Utils.showOrHideLoading(this, resource);
            Utils.toastError(resource);
            if (resource.success()) {
                startTimer();
                int i3 = ShareDataUIState + 57;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            return;
        }
        Utils.showOrHideLoading(this, resource);
        Utils.toastError(resource);
        resource.success();
        throw null;
    }

    @Override
    public OtpType mo10749getOtpType() {
        int i = 2 % 2;
        OtpType otpType = new OtpType(getString(R.string.pinmanage_reset_pin_otp_title1), getString(R.string.pinmanage_reset_pin_otp_tips1), getString(R.string.pinmanage_reset_pin_otp_tips2), getString(R.string.pinmanage_reset_pin_otp_button1), getString(R.string.pinmanage_reset_pin_otp_button2));
        int i2 = copydefault + 85;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return otpType;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c7  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinOtpActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinOtpActivity.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(67:889|49|(1:51)|52|53|76|(3:961|77|(10:954|79|83|84|951|(3:86|(4:88|89|(1:91)|92)(3:93|(1:95)|96)|97)(25:98|99|952|100|101|941|102|(2:883|104)|108|109|929|110|(2:917|112)|116|117|118|(2:874|120)|124|125|927|126|(2:923|128)(1:130)|131|(2:133|134)|135)|136|(4:139|(2:141|975)(11:142|(3:144|(3:147|148|145)|976)|151|907|152|(4:154|155|901|156)(1:157)|158|159|885|160|974)|161|137)|973|176)(8:83|84|951|(0)(0)|136|(1:137)|973|176))|209|(2:931|210)|(13:969|212|216|(5:966|218|219|965|220)(1:225)|921|226|227|867|(4:229|230|(1:232)|233)(12:(2:237|(1:243)(1:242))(1:245)|(21:247|891|248|(2:957|250)|254|255|876|256|(2:861|258)|262|263|264|(2:266|267)|268|269|870|270|(3:272|863|273)(1:275)|276|(2:278|279)|280)(1:333)|338|339|893|340|343|344|(1:346)|347|348|349)|281|(5:284|285|(2:287|979)(11:288|(3:290|(3:293|294|291)|980)|297|859|298|(1:300)|301|302|855|303|978)|304|282)|977|318)(11:216|(0)(0)|921|226|227|867|(0)(0)|281|(1:282)|977|318)|350|(9:968|351|(1:353)|354|(3:356|(1:358)|359)(22:360|361|959|362|363|949|364|(2:903|366)|370|371|934|372|(3:374|943|375)|379|380|381|(3:383|905|384)|388|(1:390)|391|(2:393|394)|395)|396|(5:399|400|(2:402|983)(11:403|(5:405|(1:407)(1:408)|985|(3:411|412|409)|984)|413|919|414|(1:416)|417|418|911|419|982)|420|397)|981|432)|460|936|461|(2:868|463)|467|468|(5:470|471|(1:473)|474|475)(17:477|478|933|479|480|925|481|(1:483)|484|485|486|(1:488)|489|(1:491)|492|(1:494)|495)|476|496|(9:499|915|500|(1:502)|503|504|505|897|506)|507|540|(1:542)|543|(3:545|(1:547)|548)(14:550|551|(1:553)|554|555|(1:557)|558|945|559|560|(1:562)|563|(1:565)|566)|549|567|(1:569)(9:570|(3:572|(2:575|573)|999)|576|577|(1:579)|580|(1:582)|583|584)|585|(1:587)|588|(1:590)|591|(3:593|(1:595)|596)(16:598|599|(1:601)|602|(1:604)|605|606|(1:608)|609|938|610|611|(1:613)|614|(1:616)|617)|597|618|(1:620)(9:621|(3:623|(2:626|624)|998)|627|628|(1:630)|631|(1:633)|634|635)|636|881|637|(3:639|850|640)|644|645|878|646|(1:648)|649|(3:651|(1:653)|654)(17:656|(17:658|659|(2:661|(2:663|(2:665|669)(1:666))(2:667|668))(1:669)|756|(1:758)|759|(3:761|(1:763)|764)(13:766|963|767|768|(1:770)|771|879|772|773|(1:775)|776|(1:778)|779)|765|780|(6:783|784|(1:786)|787|788|789)|790|(1:792)|793|(3:795|(1:797)|798)(14:800|801|(1:803)|804|805|(1:807)|808|887|809|810|(1:812)|813|(1:815)|816)|799|817|(1:1000)(7:820|821|(1:823)|824|825|826|827))|(19:671|672|865|673|(1:675)|676|677|857|678|(1:680)|681|682|683|(1:685)|686|(1:688)|689|(1:691)|692)|756|(0)|759|(0)(0)|765|780|(0)|790|(0)|793|(0)(0)|799|817|(0)(0))|693|(4:696|(3:991|698|(3:989|700|996)(12:988|704|(3:706|(3:709|710|707)|997)|711|853|712|(1:714)|715|716|971|717|995))(3:987|701|(3:990|703|994)(12:992|704|(0)|711|853|712|(0)|715|716|971|717|995))|993|694)|986|756|(0)|759|(0)(0)|765|780|(0)|790|(0)|793|(0)(0)|799|817|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(80:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|899|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|852|(3:940|33|(1:39)(1:38))(1:43)|44|909|45|(1:47)|48|889|49|(1:51)|52|53|76|(3:961|77|(10:954|79|83|84|951|(3:86|(4:88|89|(1:91)|92)(3:93|(1:95)|96)|97)(25:98|99|952|100|101|941|102|(2:883|104)|108|109|929|110|(2:917|112)|116|117|118|(2:874|120)|124|125|927|126|(2:923|128)(1:130)|131|(2:133|134)|135)|136|(4:139|(2:141|975)(11:142|(3:144|(3:147|148|145)|976)|151|907|152|(4:154|155|901|156)(1:157)|158|159|885|160|974)|161|137)|973|176)(8:83|84|951|(0)(0)|136|(1:137)|973|176))|209|931|210|(13:969|212|216|(5:966|218|219|965|220)(1:225)|921|226|227|867|(4:229|230|(1:232)|233)(12:(2:237|(1:243)(1:242))(1:245)|(21:247|891|248|(2:957|250)|254|255|876|256|(2:861|258)|262|263|264|(2:266|267)|268|269|870|270|(3:272|863|273)(1:275)|276|(2:278|279)|280)(1:333)|338|339|893|340|343|344|(1:346)|347|348|349)|281|(5:284|285|(2:287|979)(11:288|(3:290|(3:293|294|291)|980)|297|859|298|(1:300)|301|302|855|303|978)|304|282)|977|318)(11:216|(0)(0)|921|226|227|867|(0)(0)|281|(1:282)|977|318)|350|(9:968|351|(1:353)|354|(3:356|(1:358)|359)(22:360|361|959|362|363|949|364|(2:903|366)|370|371|934|372|(3:374|943|375)|379|380|381|(3:383|905|384)|388|(1:390)|391|(2:393|394)|395)|396|(5:399|400|(2:402|983)(11:403|(5:405|(1:407)(1:408)|985|(3:411|412|409)|984)|413|919|414|(1:416)|417|418|911|419|982)|420|397)|981|432)|460|936|461|(2:868|463)|467|468|(5:470|471|(1:473)|474|475)(17:477|478|933|479|480|925|481|(1:483)|484|485|486|(1:488)|489|(1:491)|492|(1:494)|495)|476|496|(9:499|915|500|(1:502)|503|504|505|897|506)|507|540|(1:542)|543|(3:545|(1:547)|548)(14:550|551|(1:553)|554|555|(1:557)|558|945|559|560|(1:562)|563|(1:565)|566)|549|567|(1:569)(9:570|(3:572|(2:575|573)|999)|576|577|(1:579)|580|(1:582)|583|584)|585|(1:587)|588|(1:590)|591|(3:593|(1:595)|596)(16:598|599|(1:601)|602|(1:604)|605|606|(1:608)|609|938|610|611|(1:613)|614|(1:616)|617)|597|618|(1:620)(9:621|(3:623|(2:626|624)|998)|627|628|(1:630)|631|(1:633)|634|635)|636|881|637|(3:639|850|640)|644|645|878|646|(1:648)|649|(3:651|(1:653)|654)(17:656|(17:658|659|(2:661|(2:663|(2:665|669)(1:666))(2:667|668))(1:669)|756|(1:758)|759|(3:761|(1:763)|764)(13:766|963|767|768|(1:770)|771|879|772|773|(1:775)|776|(1:778)|779)|765|780|(6:783|784|(1:786)|787|788|789)|790|(1:792)|793|(3:795|(1:797)|798)(14:800|801|(1:803)|804|805|(1:807)|808|887|809|810|(1:812)|813|(1:815)|816)|799|817|(1:1000)(7:820|821|(1:823)|824|825|826|827))|(19:671|672|865|673|(1:675)|676|677|857|678|(1:680)|681|682|683|(1:685)|686|(1:688)|689|(1:691)|692)|756|(0)|759|(0)(0)|765|780|(0)|790|(0)|793|(0)(0)|799|817|(0)(0))|693|(4:696|(3:991|698|(3:989|700|996)(12:988|704|(3:706|(3:709|710|707)|997)|711|853|712|(1:714)|715|716|971|717|995))(3:987|701|(3:990|703|994)(12:992|704|(0)|711|853|712|(0)|715|716|971|717|995))|993|694)|986|756|(0)|759|(0)(0)|765|780|(0)|790|(0)|793|(0)(0)|799|817|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x1ef6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x1ef7, code lost:
    
        r2 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:740:0x31c6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:742:0x31c8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:743:0x31c9, code lost:
    
        r8 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:744:0x31cb, code lost:
    
        r1 = r0;
        r8 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1000:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0bb7 A[Catch: all -> 0x0cea, TryCatch #40 {all -> 0x0cea, blocks: (B:136:0x0bad, B:137:0x0bb1, B:139:0x0bb7, B:142:0x0bd1, B:126:0x0adc, B:131:0x0b44, B:135:0x0ba5), top: B:927:0x0adc }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0d98 A[Catch: all -> 0x05d7, TryCatch #26 {all -> 0x05d7, blocks: (B:203:0x0d92, B:205:0x0d98, B:206:0x0dc4, B:344:0x1507, B:346:0x150d, B:347:0x153a, B:750:0x3231, B:752:0x3237, B:753:0x3261, B:784:0x357e, B:786:0x3584, B:787:0x35ac, B:821:0x38d0, B:823:0x38d6, B:824:0x38fa, B:801:0x3703, B:803:0x3726, B:804:0x377a, B:628:0x2b11, B:630:0x2b17, B:631:0x2b44, B:633:0x2b7e, B:634:0x2bc4, B:599:0x27af, B:601:0x27c4, B:602:0x27f3, B:604:0x2827, B:605:0x28a1, B:577:0x2420, B:579:0x2426, B:580:0x2453, B:582:0x248d, B:583:0x24d8, B:551:0x218b, B:553:0x21a0, B:554:0x21ce, B:534:0x1f7b, B:536:0x1f81, B:537:0x1fab, B:454:0x1abd, B:456:0x1ac3, B:457:0x1aea, B:70:0x0786, B:72:0x078c, B:73:0x07b3, B:19:0x0274, B:21:0x027a, B:22:0x02a0, B:24:0x0543, B:26:0x0575, B:27:0x05d1), top: B:899:0x0274 }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0ea0 A[Catch: all -> 0x146e, PHI: r2
  0x0ea0: PHI (r2v193 java.lang.Object) = (r2v189 java.lang.Object), (r2v192 java.lang.Object) binds: [B:211:0x0e4b, B:212:0x0e4d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #42 {all -> 0x146e, blocks: (B:210:0x0e47, B:216:0x0ea0), top: B:931:0x0e47 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0f1b  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0f30  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0f91  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x12fe  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x150d A[Catch: all -> 0x05d7, TryCatch #26 {all -> 0x05d7, blocks: (B:203:0x0d92, B:205:0x0d98, B:206:0x0dc4, B:344:0x1507, B:346:0x150d, B:347:0x153a, B:750:0x3231, B:752:0x3237, B:753:0x3261, B:784:0x357e, B:786:0x3584, B:787:0x35ac, B:821:0x38d0, B:823:0x38d6, B:824:0x38fa, B:801:0x3703, B:803:0x3726, B:804:0x377a, B:628:0x2b11, B:630:0x2b17, B:631:0x2b44, B:633:0x2b7e, B:634:0x2bc4, B:599:0x27af, B:601:0x27c4, B:602:0x27f3, B:604:0x2827, B:605:0x28a1, B:577:0x2420, B:579:0x2426, B:580:0x2453, B:582:0x248d, B:583:0x24d8, B:551:0x218b, B:553:0x21a0, B:554:0x21ce, B:534:0x1f7b, B:536:0x1f81, B:537:0x1fab, B:454:0x1abd, B:456:0x1ac3, B:457:0x1aea, B:70:0x0786, B:72:0x078c, B:73:0x07b3, B:19:0x0274, B:21:0x027a, B:22:0x02a0, B:24:0x0543, B:26:0x0575, B:27:0x05d1), top: B:899:0x0274 }] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x15c3 A[Catch: all -> 0x1a12, TryCatch #63 {all -> 0x1a12, blocks: (B:351:0x15bd, B:353:0x15c3, B:354:0x1606, B:356:0x1613, B:358:0x161c, B:359:0x165e, B:423:0x19e0, B:425:0x19e6, B:426:0x19e7, B:428:0x19e9, B:430:0x19f0, B:431:0x19f1, B:360:0x166b, B:435:0x19fa, B:437:0x1a00, B:438:0x1a01, B:441:0x1a06, B:443:0x1a0c, B:444:0x1a0d, B:419:0x195f, B:414:0x1928, B:416:0x192e, B:417:0x1957), top: B:968:0x15bd, inners: #32, #36 }] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x1613 A[Catch: all -> 0x1a12, TryCatch #63 {all -> 0x1a12, blocks: (B:351:0x15bd, B:353:0x15c3, B:354:0x1606, B:356:0x1613, B:358:0x161c, B:359:0x165e, B:423:0x19e0, B:425:0x19e6, B:426:0x19e7, B:428:0x19e9, B:430:0x19f0, B:431:0x19f1, B:360:0x166b, B:435:0x19fa, B:437:0x1a00, B:438:0x1a01, B:441:0x1a06, B:443:0x1a0c, B:444:0x1a0d, B:419:0x195f, B:414:0x1928, B:416:0x192e, B:417:0x1957), top: B:968:0x15bd, inners: #32, #36 }] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x166b A[Catch: all -> 0x1a12, TRY_LEAVE, TryCatch #63 {all -> 0x1a12, blocks: (B:351:0x15bd, B:353:0x15c3, B:354:0x1606, B:356:0x1613, B:358:0x161c, B:359:0x165e, B:423:0x19e0, B:425:0x19e6, B:426:0x19e7, B:428:0x19e9, B:430:0x19f0, B:431:0x19f1, B:360:0x166b, B:435:0x19fa, B:437:0x1a00, B:438:0x1a01, B:441:0x1a06, B:443:0x1a0c, B:444:0x1a0d, B:419:0x195f, B:414:0x1928, B:416:0x192e, B:417:0x1957), top: B:968:0x15bd, inners: #32, #36 }] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x18b4  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x1ac3 A[Catch: all -> 0x05d7, TryCatch #26 {all -> 0x05d7, blocks: (B:203:0x0d92, B:205:0x0d98, B:206:0x0dc4, B:344:0x1507, B:346:0x150d, B:347:0x153a, B:750:0x3231, B:752:0x3237, B:753:0x3261, B:784:0x357e, B:786:0x3584, B:787:0x35ac, B:821:0x38d0, B:823:0x38d6, B:824:0x38fa, B:801:0x3703, B:803:0x3726, B:804:0x377a, B:628:0x2b11, B:630:0x2b17, B:631:0x2b44, B:633:0x2b7e, B:634:0x2bc4, B:599:0x27af, B:601:0x27c4, B:602:0x27f3, B:604:0x2827, B:605:0x28a1, B:577:0x2420, B:579:0x2426, B:580:0x2453, B:582:0x248d, B:583:0x24d8, B:551:0x218b, B:553:0x21a0, B:554:0x21ce, B:534:0x1f7b, B:536:0x1f81, B:537:0x1fab, B:454:0x1abd, B:456:0x1ac3, B:457:0x1aea, B:70:0x0786, B:72:0x078c, B:73:0x07b3, B:19:0x0274, B:21:0x027a, B:22:0x02a0, B:24:0x0543, B:26:0x0575, B:27:0x05d1), top: B:899:0x0274 }] */
    /* JADX WARN: Removed duplicated region for block: B:470:0x1bd0  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x1c2c A[Catch: all -> 0x1ef6, TRY_ENTER, TRY_LEAVE, TryCatch #45 {all -> 0x1ef6, blocks: (B:461:0x1b75, B:467:0x1bc3, B:477:0x1c2c), top: B:936:0x1b75 }] */
    /* JADX WARN: Removed duplicated region for block: B:499:0x1df0  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x1f81 A[Catch: all -> 0x05d7, TryCatch #26 {all -> 0x05d7, blocks: (B:203:0x0d92, B:205:0x0d98, B:206:0x0dc4, B:344:0x1507, B:346:0x150d, B:347:0x153a, B:750:0x3231, B:752:0x3237, B:753:0x3261, B:784:0x357e, B:786:0x3584, B:787:0x35ac, B:821:0x38d0, B:823:0x38d6, B:824:0x38fa, B:801:0x3703, B:803:0x3726, B:804:0x377a, B:628:0x2b11, B:630:0x2b17, B:631:0x2b44, B:633:0x2b7e, B:634:0x2bc4, B:599:0x27af, B:601:0x27c4, B:602:0x27f3, B:604:0x2827, B:605:0x28a1, B:577:0x2420, B:579:0x2426, B:580:0x2453, B:582:0x248d, B:583:0x24d8, B:551:0x218b, B:553:0x21a0, B:554:0x21ce, B:534:0x1f7b, B:536:0x1f81, B:537:0x1fab, B:454:0x1abd, B:456:0x1ac3, B:457:0x1aea, B:70:0x0786, B:72:0x078c, B:73:0x07b3, B:19:0x0274, B:21:0x027a, B:22:0x02a0, B:24:0x0543, B:26:0x0575, B:27:0x05d1), top: B:899:0x0274 }] */
    /* JADX WARN: Removed duplicated region for block: B:542:0x203f  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x2093  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x216b  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x2306  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x23e1  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x25ff  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x266c  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x26c4  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x2791  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x29e3  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x2ace  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x2cdf  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x2d4f A[Catch: all -> 0x31c6, TryCatch #15 {all -> 0x31c6, blocks: (B:646:0x2d36, B:648:0x2d4f, B:649:0x2d9a, B:651:0x2dae, B:653:0x2db7, B:654:0x2df9, B:693:0x306d, B:694:0x3071, B:698:0x3083, B:704:0x30b3, B:707:0x30c0, B:709:0x30c3, B:721:0x31a0, B:723:0x31a6, B:724:0x31a7, B:726:0x31a9, B:728:0x31b0, B:729:0x31b1, B:701:0x309b, B:659:0x2e12, B:663:0x2e1f, B:667:0x2e2b, B:668:0x2e34, B:669:0x2e35, B:671:0x2e3b, B:683:0x2f4f, B:685:0x2f55, B:686:0x2f9e, B:688:0x2fc8, B:689:0x300f, B:691:0x3025, B:692:0x3067, B:731:0x31b3, B:733:0x31ba, B:734:0x31bb, B:736:0x31bd, B:738:0x31c4, B:739:0x31c5, B:712:0x30ef, B:714:0x30f5, B:715:0x3119, B:678:0x2eac, B:680:0x2ecb, B:681:0x2f43, B:673:0x2e5b, B:675:0x2e70, B:676:0x2ea5, B:717:0x3121), top: B:878:0x2d36, inners: #2, #4, #8, #65 }] */
    /* JADX WARN: Removed duplicated region for block: B:651:0x2dae A[Catch: all -> 0x31c6, TryCatch #15 {all -> 0x31c6, blocks: (B:646:0x2d36, B:648:0x2d4f, B:649:0x2d9a, B:651:0x2dae, B:653:0x2db7, B:654:0x2df9, B:693:0x306d, B:694:0x3071, B:698:0x3083, B:704:0x30b3, B:707:0x30c0, B:709:0x30c3, B:721:0x31a0, B:723:0x31a6, B:724:0x31a7, B:726:0x31a9, B:728:0x31b0, B:729:0x31b1, B:701:0x309b, B:659:0x2e12, B:663:0x2e1f, B:667:0x2e2b, B:668:0x2e34, B:669:0x2e35, B:671:0x2e3b, B:683:0x2f4f, B:685:0x2f55, B:686:0x2f9e, B:688:0x2fc8, B:689:0x300f, B:691:0x3025, B:692:0x3067, B:731:0x31b3, B:733:0x31ba, B:734:0x31bb, B:736:0x31bd, B:738:0x31c4, B:739:0x31c5, B:712:0x30ef, B:714:0x30f5, B:715:0x3119, B:678:0x2eac, B:680:0x2ecb, B:681:0x2f43, B:673:0x2e5b, B:675:0x2e70, B:676:0x2ea5, B:717:0x3121), top: B:878:0x2d36, inners: #2, #4, #8, #65 }] */
    /* JADX WARN: Removed duplicated region for block: B:656:0x2e04  */
    /* JADX WARN: Removed duplicated region for block: B:696:0x3077  */
    /* JADX WARN: Removed duplicated region for block: B:706:0x30bf  */
    /* JADX WARN: Removed duplicated region for block: B:714:0x30f5 A[Catch: all -> 0x31a8, TryCatch #2 {all -> 0x31a8, blocks: (B:712:0x30ef, B:714:0x30f5, B:715:0x3119), top: B:853:0x30ef, outer: #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:752:0x3237 A[Catch: all -> 0x05d7, TryCatch #26 {all -> 0x05d7, blocks: (B:203:0x0d92, B:205:0x0d98, B:206:0x0dc4, B:344:0x1507, B:346:0x150d, B:347:0x153a, B:750:0x3231, B:752:0x3237, B:753:0x3261, B:784:0x357e, B:786:0x3584, B:787:0x35ac, B:821:0x38d0, B:823:0x38d6, B:824:0x38fa, B:801:0x3703, B:803:0x3726, B:804:0x377a, B:628:0x2b11, B:630:0x2b17, B:631:0x2b44, B:633:0x2b7e, B:634:0x2bc4, B:599:0x27af, B:601:0x27c4, B:602:0x27f3, B:604:0x2827, B:605:0x28a1, B:577:0x2420, B:579:0x2426, B:580:0x2453, B:582:0x248d, B:583:0x24d8, B:551:0x218b, B:553:0x21a0, B:554:0x21ce, B:534:0x1f7b, B:536:0x1f81, B:537:0x1fab, B:454:0x1abd, B:456:0x1ac3, B:457:0x1aea, B:70:0x0786, B:72:0x078c, B:73:0x07b3, B:19:0x0274, B:21:0x027a, B:22:0x02a0, B:24:0x0543, B:26:0x0575, B:27:0x05d1), top: B:899:0x0274 }] */
    /* JADX WARN: Removed duplicated region for block: B:758:0x32f3  */
    /* JADX WARN: Removed duplicated region for block: B:761:0x3342  */
    /* JADX WARN: Removed duplicated region for block: B:766:0x33a6  */
    /* JADX WARN: Removed duplicated region for block: B:783:0x355c  */
    /* JADX WARN: Removed duplicated region for block: B:792:0x363d  */
    /* JADX WARN: Removed duplicated region for block: B:795:0x368f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:800:0x36e5  */
    /* JADX WARN: Removed duplicated region for block: B:820:0x38b2  */
    /* JADX WARN: Removed duplicated region for block: B:868:0x1b7b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:966:0x0ec7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:969:0x0e4d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x096c A[Catch: all -> 0x0d0e, TRY_ENTER, TRY_LEAVE, TryCatch #59 {all -> 0x0d0e, blocks: (B:77:0x0839, B:83:0x0892, B:98:0x096c), top: B:961:0x0839 }] */
    /* JADX WARN: Type inference failed for: r10v193 */
    /* JADX WARN: Type inference failed for: r10v194 */
    /* JADX WARN: Type inference failed for: r10v202 */
    /* JADX WARN: Type inference failed for: r10v207 */
    /* JADX WARN: Type inference failed for: r10v211, types: [long] */
    /* JADX WARN: Type inference failed for: r10v212 */
    /* JADX WARN: Type inference failed for: r10v213 */
    /* JADX WARN: Type inference failed for: r10v237 */
    /* JADX WARN: Type inference failed for: r10v242 */
    /* JADX WARN: Type inference failed for: r10v249 */
    /* JADX WARN: Type inference failed for: r10v251 */
    /* JADX WARN: Type inference failed for: r10v252, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v258 */
    /* JADX WARN: Type inference failed for: r10v259 */
    /* JADX WARN: Type inference failed for: r10v260 */
    /* JADX WARN: Type inference failed for: r10v261 */
    /* JADX WARN: Type inference failed for: r10v337 */
    /* JADX WARN: Type inference failed for: r10v338 */
    /* JADX WARN: Type inference failed for: r10v339 */
    /* JADX WARN: Type inference failed for: r10v340 */
    /* JADX WARN: Type inference failed for: r10v341 */
    /* JADX WARN: Type inference failed for: r10v342 */
    /* JADX WARN: Type inference failed for: r10v343 */
    /* JADX WARN: Type inference failed for: r10v63 */
    /* JADX WARN: Type inference failed for: r10v64 */
    /* JADX WARN: Type inference failed for: r10v65, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v288 */
    /* JADX WARN: Type inference failed for: r11v289 */
    /* JADX WARN: Type inference failed for: r11v292 */
    /* JADX WARN: Type inference failed for: r11v293 */
    /* JADX WARN: Type inference failed for: r11v294 */
    /* JADX WARN: Type inference failed for: r11v295 */
    /* JADX WARN: Type inference failed for: r11v307 */
    /* JADX WARN: Type inference failed for: r11v311, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v312 */
    /* JADX WARN: Type inference failed for: r11v313 */
    /* JADX WARN: Type inference failed for: r11v314 */
    /* JADX WARN: Type inference failed for: r11v317 */
    /* JADX WARN: Type inference failed for: r11v320 */
    /* JADX WARN: Type inference failed for: r11v321 */
    /* JADX WARN: Type inference failed for: r11v326 */
    /* JADX WARN: Type inference failed for: r11v327 */
    /* JADX WARN: Type inference failed for: r11v328 */
    /* JADX WARN: Type inference failed for: r11v329 */
    /* JADX WARN: Type inference failed for: r11v330 */
    /* JADX WARN: Type inference failed for: r11v331 */
    /* JADX WARN: Type inference failed for: r11v332 */
    /* JADX WARN: Type inference failed for: r11v333 */
    /* JADX WARN: Type inference failed for: r11v334 */
    /* JADX WARN: Type inference failed for: r11v335 */
    /* JADX WARN: Type inference failed for: r11v336 */
    /* JADX WARN: Type inference failed for: r11v337 */
    /* JADX WARN: Type inference failed for: r11v338 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r11v45, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v221 */
    /* JADX WARN: Type inference failed for: r13v222 */
    /* JADX WARN: Type inference failed for: r13v223 */
    /* JADX WARN: Type inference failed for: r13v226 */
    /* JADX WARN: Type inference failed for: r13v227 */
    /* JADX WARN: Type inference failed for: r27v18 */
    /* JADX WARN: Type inference failed for: r31v13 */
    /* JADX WARN: Type inference failed for: r31v14 */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r31v3 */
    /* JADX WARN: Type inference failed for: r31v4 */
    /* JADX WARN: Type inference failed for: r31v5 */
    /* JADX WARN: Type inference failed for: r31v6 */
    /* JADX WARN: Type inference failed for: r31v7 */
    /* JADX WARN: Type inference failed for: r31v8 */
    /* JADX WARN: Type inference failed for: r31v9 */
    /* JADX WARN: Type inference failed for: r8v122 */
    /* JADX WARN: Type inference failed for: r8v123 */
    /* JADX WARN: Type inference failed for: r8v124, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v139 */
    /* JADX WARN: Type inference failed for: r8v140, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v141 */
    /* JADX WARN: Type inference failed for: r8v198 */
    /* JADX WARN: Type inference failed for: r9v100, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v102, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v106 */
    /* JADX WARN: Type inference failed for: r9v107 */
    /* JADX WARN: Type inference failed for: r9v135 */
    /* JADX WARN: Type inference failed for: r9v136 */
    /* JADX WARN: Type inference failed for: r9v137 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v47, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v48 */
    /* JADX WARN: Type inference failed for: r9v53, types: [long] */
    /* JADX WARN: Type inference failed for: r9v54 */
    /* JADX WARN: Type inference failed for: r9v56 */
    /* JADX WARN: Type inference failed for: r9v73 */
    /* JADX WARN: Type inference failed for: r9v85 */
    /* JADX WARN: Type inference failed for: r9v86 */
    /* JADX WARN: Type inference failed for: r9v87 */
    /* JADX WARN: Type inference failed for: r9v99 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 15436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinOtpActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$GmJV8946JVwsuH2JLiUj5gkMbDs(ResetPinOtpActivity resetPinOtpActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        resetPinOtpActivity.lambda$addObserver$0(resource);
        int i4 = copydefault + 115;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void $r8$lambda$JGm1oPbfDSauxLF37aIMX85MJs0(ResetPinOtpActivity resetPinOtpActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        resetPinOtpActivity.lambda$addObserver$1(resource);
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            throw null;
        }
    }
}
