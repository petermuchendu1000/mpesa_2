package com.huawei.digitalpayment.consumer.mpin.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.constant.CacheConstants;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.databinding.ActivityAbstractOtpBinding;
import com.huawei.digitalpayment.consumer.baselib.dialog.CommonDialog;
import com.huawei.digitalpayment.consumer.baselib.http.HttpStatus;
import com.huawei.digitalpayment.consumer.baselib.init.TokenHelper;
import com.huawei.digitalpayment.consumer.baselib.otp.model.OtpType;
import com.huawei.digitalpayment.consumer.baselib.util.DialogUtils;
import com.huawei.digitalpayment.consumer.constants.Keys;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyChangePinSmsResp;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType;
import com.huawei.digitalpayment.consumer.loginModule.mpin.request.SendOtpParams;
import com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ChangePinOtpUiState;
import com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ChangePinOtpViewModel;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;
import com.huawei.payment.mvvm.Utils;
import com.safaricom.mpesa.lifestyle.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.cancelNotification;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\u0018\u0010\u0017\u001a\u00020\u00132\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019H\u0002J\u0012\u0010\u001b\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\u001d\u001a\u00020\u0013H\u0014J\b\u0010\u0010\u001a\u00020\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u0013H\u0016R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\tR\u001b\u0010\u000f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0010\u0010\t¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/mpin/ui/activity/ChangePinOtpActivity;", "Lcom/huawei/digitalpayment/consumer/baselib/otp/ui/activity/BaseOtpActivity;", "Lcom/huawei/digitalpayment/consumer/baselib/databinding/ActivityAbstractOtpBinding;", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/viewmodel/ChangePinOtpViewModel;", "<init>", "()V", "newToken", "", "getNewToken", "()Ljava/lang/String;", "newToken$delegate", "Lkotlin/Lazy;", KeysConstants.KEY_LOGIN_TYPE, "getLoginType", "loginType$delegate", KeysConstants.KEY_OTP_TYPE, "getOtpType", "otpType$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "observeData", "onVerifySmsChanged", "resource", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/VerifyChangePinSmsResp;", "onConfirmClick", "initiatorCode", "getSmsCode", "Lcom/huawei/digitalpayment/consumer/baselib/otp/model/OtpType;", "onBackPressed", "ConsumerLoginUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class ChangePinOtpActivity extends Hilt_ChangePinOtpActivity<ActivityAbstractOtpBinding, ChangePinOtpViewModel> {
    public static final int $stable = 8;
    private static int ShareDataUIState;
    private static char[] component1;
    private static char[] component2;
    private static long component3;
    private static int component4;
    private static long copydefault;
    private static char getRequestBeneficiariesState;
    private static final byte[] $$l = {TarHeader.LF_BLK, -58, -85, 74};
    private static final int $$o = 218;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$s = {Ascii.EM, 43, 92, -56, -23, -12, -20, 10, -12, -12, -6, -31, -2, -19, -23, -9, -14, -10, -10, -2, -20, -17, TarHeader.LF_FIFO, -23, -9, TarHeader.LF_BLK, PSSSigner.TRAILER_IMPLICIT, -19, -11, -3, -16, -4, 44, -62, -24, -1, -25, -8, -5, -6, 43, -74, 1, -30, 4, -24, -2, -3, -22, TarHeader.LF_CHR, -70, -16, -17, 4, -24, -7, 2, -22, TarHeader.LF_CHR, -45, -28, -28, 4, -13, -18, 0, -12, -21, -4, 7, -40, 4, -28, -12, 3, 17, -48, -17, 40, -60, -11, 6, -35, 74, -24, -23, -9, -14, -10, -10, -2, -20, -17, 56};
    private static final int $$t = 193;
    private static final byte[] $$d = {57, 126, 65, 8, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -12, Ascii.FF, -19, -15, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 67;
    private static int equals = 1;
    private static int copy = 0;
    private static int getAsAtTimestamp = 1;

    private final Lazy newToken = LazyKt.lazy(new Function0() {
        private static int component3 = 0;
        private static int copydefault = 1;

        @Override
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = component3 + 47;
            copydefault = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                ChangePinOtpActivity.$r8$lambda$zA90EcX8h9IWUgmArAIGm8i3H9I(this.f$0);
                obj.hashCode();
                throw null;
            }
            String str$r8$lambda$zA90EcX8h9IWUgmArAIGm8i3H9I = ChangePinOtpActivity.$r8$lambda$zA90EcX8h9IWUgmArAIGm8i3H9I(this.f$0);
            int i3 = copydefault + 27;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                return str$r8$lambda$zA90EcX8h9IWUgmArAIGm8i3H9I;
            }
            throw null;
        }
    });

    private final Lazy loginType = LazyKt.lazy(new Function0() {
        private static int component3 = 0;
        private static int copydefault = 1;

        @Override
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = copydefault + 33;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            String str$r8$lambda$yhb97MhvohmR0mLwAf7MwCOC3K4 = ChangePinOtpActivity.$r8$lambda$yhb97MhvohmR0mLwAf7MwCOC3K4(this.f$0);
            int i4 = component3 + 55;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return str$r8$lambda$yhb97MhvohmR0mLwAf7MwCOC3K4;
        }
    });

    private final Lazy otpType = LazyKt.lazy(new Function0() {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;

        @Override
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 85;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                ChangePinOtpActivity.$r8$lambda$K2Xw1fwABzmXD41Ug2sHIwYmris(this.f$0);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str$r8$lambda$K2Xw1fwABzmXD41Ug2sHIwYmris = ChangePinOtpActivity.$r8$lambda$K2Xw1fwABzmXD41Ug2sHIwYmris(this.f$0);
            int i3 = ShareDataUIState + 19;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 65 / 0;
            }
            return str$r8$lambda$K2Xw1fwABzmXD41Ug2sHIwYmris;
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(byte r5, int r6, int r7) {
        /*
            int r6 = 122 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity.$$l
            int r5 = r5 * 4
            int r1 = r5 + 1
            int r7 = r7 * 3
            int r7 = 3 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r5) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L20:
            int r3 = r3 + 1
            int r7 = r7 + 1
            r4 = r0[r7]
        L26:
            int r6 = r6 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity.$$r(byte, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity.$$d
            int r1 = 28 - r7
            int r6 = r6 * 2
            int r6 = 103 - r6
            byte[] r1 = new byte[r1]
            int r7 = 27 - r7
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2d
        L14:
            r3 = r2
        L15:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r8 + (-8)
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity.h(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(byte r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 2
            int r7 = 99 - r7
            int r8 = r8 + 10
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity.$$s
            int r9 = 84 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r5 = r2
            r9 = r8
            goto L2b
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r9 = r9 + r7
            int r7 = r9 + (-11)
            r9 = r3
            r3 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity.j(byte, int, byte, java.lang.Object[]):void");
    }

    public static final ViewModel access$getViewModel$p(ChangePinOtpActivity changePinOtpActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 117;
        copy = i2 % 128;
        int i3 = i2 % 2;
        VM vm = changePinOtpActivity.viewModel;
        if (i3 == 0) {
            return vm;
        }
        throw null;
    }

    public static final void access$onVerifySmsChanged(ChangePinOtpActivity changePinOtpActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = copy + 111;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        changePinOtpActivity.onVerifySmsChanged(resource);
        if (i3 == 0) {
            throw null;
        }
    }

    public static final void access$startTimer(ChangePinOtpActivity changePinOtpActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 113;
        copy = i2 % 128;
        int i3 = i2 % 2;
        changePinOtpActivity.startTimer();
        int i4 = getAsAtTimestamp + 53;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
    }

    private final String getNewToken() {
        int i = 2 % 2;
        int i2 = copy + 121;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = (String) this.newToken.getValue();
        int i3 = copy + 11;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static final String newToken_delegate$lambda$0(ChangePinOtpActivity changePinOtpActivity) {
        int i = 2 % 2;
        int i2 = copy + 97;
        getAsAtTimestamp = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(changePinOtpActivity, "");
            changePinOtpActivity.getIntent();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(changePinOtpActivity, "");
        Intent intent = changePinOtpActivity.getIntent();
        if (intent != null) {
            return intent.getStringExtra("token");
        }
        int i3 = copy + 25;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    private final String getLoginType() {
        String str;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 55;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            str = (String) this.loginType.getValue();
            int i3 = 1 / 0;
        } else {
            str = (String) this.loginType.getValue();
        }
        int i4 = copy + 27;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static final String loginType_delegate$lambda$1(ChangePinOtpActivity changePinOtpActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 87;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(changePinOtpActivity, "");
            changePinOtpActivity.getIntent();
            throw null;
        }
        Intrinsics.checkNotNullParameter(changePinOtpActivity, "");
        Intent intent = changePinOtpActivity.getIntent();
        if (intent == null) {
            return "";
        }
        int i3 = copy + 47;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        String stringExtra = intent.getStringExtra(KeysConstants.KEY_LOGIN_TYPE);
        if (i4 == 0) {
            int i5 = 8 / 0;
            if (stringExtra == null) {
                return "";
            }
        } else if (stringExtra == null) {
            return "";
        }
        return stringExtra;
    }

    private final String getOtpType() {
        int i = 2 % 2;
        int i2 = copy + 101;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.otpType.getValue();
        int i4 = getAsAtTimestamp + 19;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.String otpType_delegate$lambda$2(com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity r3) {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            android.content.Intent r3 = r3.getIntent()
            if (r3 == 0) goto L27
            int r1 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity.getAsAtTimestamp
            int r1 = r1 + 121
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity.copy = r2
            int r1 = r1 % r0
            java.lang.String r2 = "otpType"
            java.lang.String r3 = r3.getStringExtra(r2)
            if (r1 == 0) goto L25
            r1 = 6
            int r1 = r1 / 0
            if (r3 != 0) goto L29
            goto L27
        L25:
            if (r3 != 0) goto L29
        L27:
            java.lang.String r3 = "ChangePin"
        L29:
            int r1 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity.copy
            int r1 = r1 + 3
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity.getAsAtTimestamp = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L35
            return r3
        L35:
            r3 = 0
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity.otpType_delegate$lambda$2(com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity):java.lang.String");
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity$observeData$1", f = "ChangePinOtpActivity.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
    static final class component1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;
        int copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.copydefault;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<ChangePinOtpUiState> stateFlowUiState = ((ChangePinOtpViewModel) ChangePinOtpActivity.access$getViewModel$p(ChangePinOtpActivity.this)).uiState();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Resource<BaseResp>>() {
                    private static int ShareDataUIState = 1;
                    private static int component1;

                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        private static int ShareDataUIState = 0;
                        private static int component2 = 1;
                        final FlowCollector component3;

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity$observeData$1$invokeSuspend$$inlined$map$1$2", f = "ChangePinOtpActivity.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            private static int ShareDataUIState = 0;
                            private static int component1 = 1;
                            Object L$0;
                            int label;
                            Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override
                            public final Object invokeSuspend(Object obj) {
                                int i = 2 % 2;
                                int i2 = ShareDataUIState + 41;
                                component1 = i2 % 128;
                                int i3 = i2 % 2;
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                Object objEmit = AnonymousClass2.this.emit(null, this);
                                int i4 = ShareDataUIState + 95;
                                component1 = i4 % 128;
                                if (i4 % 2 == 0) {
                                    int i5 = 5 / 0;
                                }
                                return objEmit;
                            }
                        }

                        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
                        @Override
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                            /*
                                r5 = this;
                                r0 = 2
                                int r1 = r0 % r0
                                boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r1 == 0) goto L28
                                r1 = r7
                                com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity$observeData$1$invokeSuspend$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                                int r2 = r1.label
                                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                                r2 = r2 & r3
                                if (r2 == 0) goto L28
                                int r7 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState
                                int r7 = r7 + 27
                                int r2 = r7 % 128
                                com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2 = r2
                                int r7 = r7 % r0
                                if (r7 != 0) goto L22
                                int r7 = r1.label
                                int r7 = r7 << r3
                                r1.label = r7
                                goto L2d
                            L22:
                                int r7 = r1.label
                                int r7 = r7 + r3
                                r1.label = r7
                                goto L2d
                            L28:
                                com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity$observeData$1$invokeSuspend$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity$observeData$1$invokeSuspend$$inlined$map$1$2$1
                                r1.<init>(r7)
                            L2d:
                                java.lang.Object r7 = r1.result
                                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r3 = r1.label
                                r4 = 1
                                if (r3 == 0) goto L69
                                int r6 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState
                                int r1 = r6 + 79
                                int r2 = r1 % 128
                                com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2 = r2
                                int r1 = r1 % r0
                                if (r3 != r4) goto L61
                                int r6 = r6 + 31
                                int r1 = r6 % 128
                                com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2 = r1
                                int r6 = r6 % r0
                                if (r6 == 0) goto L59
                                kotlin.ResultKt.throwOnFailure(r7)
                                int r6 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2
                                int r6 = r6 + 7
                                int r7 = r6 % 128
                                com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState = r7
                                int r6 = r6 % r0
                                goto L80
                            L59:
                                kotlin.ResultKt.throwOnFailure(r7)
                                r6 = 0
                                r6.hashCode()
                                throw r6
                            L61:
                                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                r6.<init>(r7)
                                throw r6
                            L69:
                                kotlin.ResultKt.throwOnFailure(r7)
                                kotlinx.coroutines.flow.FlowCollector r7 = r5.component3
                                r0 = r1
                                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                                com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ChangePinOtpUiState r6 = (com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ChangePinOtpUiState) r6
                                com.huawei.payment.mvvm.Resource r6 = r6.getSendSms()
                                r1.label = r4
                                java.lang.Object r6 = r7.emit(r6, r1)
                                if (r6 != r2) goto L80
                                return r2
                            L80:
                                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                return r6
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.component3 = flowCollector;
                        }
                    }

                    @Override
                    public Object collect(FlowCollector<? super Resource<BaseResp>> flowCollector, Continuation continuation) {
                        int i3 = 2 % 2;
                        Object objCollect = stateFlowUiState.collect(new AnonymousClass2(flowCollector), continuation);
                        if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            int i4 = component1 + 121;
                            ShareDataUIState = i4 % 128;
                            if (i4 % 2 == 0) {
                                int i5 = 49 / 0;
                            }
                            return objCollect;
                        }
                        Unit unit = Unit.INSTANCE;
                        int i6 = component1 + 115;
                        ShareDataUIState = i6 % 128;
                        int i7 = i6 % 2;
                        return unit;
                    }
                });
                final ChangePinOtpActivity changePinOtpActivity = ChangePinOtpActivity.this;
                this.copydefault = 1;
                if (flowDistinctUntilChanged.collect(new FlowCollector() {
                    private static int component1 = 0;
                    private static int component3 = 1;

                    @Override
                    public Object emit(Object obj2, Continuation continuation) {
                        int i3 = 2 % 2;
                        int i4 = component3 + 15;
                        component1 = i4 % 128;
                        int i5 = i4 % 2;
                        Object objShareDataUIState = ShareDataUIState((Resource) obj2, continuation);
                        int i6 = component1 + 95;
                        component3 = i6 % 128;
                        if (i6 % 2 != 0) {
                            return objShareDataUIState;
                        }
                        throw null;
                    }

                    public final Object ShareDataUIState(Resource<BaseResp> resource, Continuation<? super Unit> continuation) {
                        int i3 = 2 % 2;
                        int i4 = component1 + 41;
                        component3 = i4 % 128;
                        int i5 = i4 % 2;
                        Utils.showOrHideLoading(changePinOtpActivity, resource);
                        Utils.toastError(resource);
                        if (resource.success()) {
                            int i6 = component1 + 1;
                            component3 = i6 % 128;
                            if (i6 % 2 != 0) {
                                ChangePinOtpActivity.access$startTimer(changePinOtpActivity);
                            } else {
                                ChangePinOtpActivity.access$startTimer(changePinOtpActivity);
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    int i3 = ShareDataUIState + 11;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = ShareDataUIState + 91;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.throwOnFailure(obj);
                int i7 = ShareDataUIState + 75;
                component3 = i7 % 128;
                int i8 = i7 % 2;
            }
            Unit unit = Unit.INSTANCE;
            int i9 = ShareDataUIState + 79;
            component3 = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 32 / 0;
            }
            return unit;
        }

        component1(Continuation<? super component1> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component1 component1Var = ChangePinOtpActivity.this.new component1(continuation);
            int i2 = ShareDataUIState + 37;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return component1Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 59;
            component3 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                return component2(coroutineScope2, continuation2);
            }
            component2(coroutineScope2, continuation2);
            throw null;
        }

        public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 49;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component3 + 91;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity$observeData$2", f = "ChangePinOtpActivity.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 1;
        private static int component3;
        int component2;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 27;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.component2;
            Object obj2 = null;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<ChangePinOtpUiState> stateFlowUiState = ((ChangePinOtpViewModel) ChangePinOtpActivity.access$getViewModel$p(ChangePinOtpActivity.this)).uiState();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Resource<VerifyChangePinSmsResp>>() {
                    private static int ShareDataUIState = 1;
                    private static int component3;

                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        private static int ShareDataUIState = 0;
                        private static int component3 = 1;
                        final FlowCollector copydefault;

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity$observeData$2$invokeSuspend$$inlined$map$1$2", f = "ChangePinOtpActivity.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            private static int component1 = 1;
                            private static int component3;
                            Object L$0;
                            int label;
                            Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override
                            public final Object invokeSuspend(Object obj) {
                                int i = 2 % 2;
                                int i2 = component1 + 33;
                                component3 = i2 % 128;
                                int i3 = i2 % 2;
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                AnonymousClass1 anonymousClass1 = this;
                                if (i3 == 0) {
                                    return anonymousClass2.emit(null, anonymousClass1);
                                }
                                anonymousClass2.emit(null, anonymousClass1);
                                throw null;
                            }
                        }

                        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
                        @Override
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                            /*
                                r5 = this;
                                r0 = 2
                                int r1 = r0 % r0
                                boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity$observeData$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r1 == 0) goto L20
                                r1 = r7
                                com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity$observeData$2$invokeSuspend$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity$observeData$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                                int r2 = r1.label
                                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                                r2 = r2 & r3
                                if (r2 == 0) goto L20
                                int r7 = r1.label
                                int r7 = r7 + r3
                                r1.label = r7
                                int r7 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity$observeData$2$invokeSuspend$$inlined$map$1.AnonymousClass2.component3
                                int r7 = r7 + 125
                            L1a:
                                int r2 = r7 % 128
                                com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity$observeData$2$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState = r2
                                int r7 = r7 % r0
                                goto L2a
                            L20:
                                com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity$observeData$2$invokeSuspend$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity$observeData$2$invokeSuspend$$inlined$map$1$2$1
                                r1.<init>(r7)
                                int r7 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity$observeData$2$invokeSuspend$$inlined$map$1.AnonymousClass2.component3
                                int r7 = r7 + 111
                                goto L1a
                            L2a:
                                java.lang.Object r7 = r1.result
                                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r3 = r1.label
                                r4 = 1
                                if (r3 == 0) goto L4c
                                if (r3 != r4) goto L44
                                int r6 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity$observeData$2$invokeSuspend$$inlined$map$1.AnonymousClass2.component3
                                int r6 = r6 + 53
                                int r1 = r6 % 128
                                com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity$observeData$2$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState = r1
                                int r6 = r6 % r0
                                kotlin.ResultKt.throwOnFailure(r7)
                                goto L63
                            L44:
                                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                r6.<init>(r7)
                                throw r6
                            L4c:
                                kotlin.ResultKt.throwOnFailure(r7)
                                kotlinx.coroutines.flow.FlowCollector r7 = r5.copydefault
                                r0 = r1
                                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                                com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ChangePinOtpUiState r6 = (com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ChangePinOtpUiState) r6
                                com.huawei.payment.mvvm.Resource r6 = r6.getVerifySms()
                                r1.label = r4
                                java.lang.Object r6 = r7.emit(r6, r1)
                                if (r6 != r2) goto L63
                                return r2
                            L63:
                                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                return r6
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity$observeData$2$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.copydefault = flowCollector;
                        }
                    }

                    @Override
                    public Object collect(FlowCollector<? super Resource<VerifyChangePinSmsResp>> flowCollector, Continuation continuation) {
                        int i5 = 2 % 2;
                        Object objCollect = stateFlowUiState.collect(new AnonymousClass2(flowCollector), continuation);
                        if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            int i6 = ShareDataUIState + 59;
                            component3 = i6 % 128;
                            if (i6 % 2 != 0) {
                                int i7 = 45 / 0;
                            }
                            return objCollect;
                        }
                        Unit unit = Unit.INSTANCE;
                        int i8 = component3 + 29;
                        ShareDataUIState = i8 % 128;
                        int i9 = i8 % 2;
                        return unit;
                    }
                });
                final ChangePinOtpActivity changePinOtpActivity = ChangePinOtpActivity.this;
                this.component2 = 1;
                if (flowDistinctUntilChanged.collect(new FlowCollector() {
                    private static int component2 = 0;
                    private static int copydefault = 1;

                    @Override
                    public Object emit(Object obj3, Continuation continuation) {
                        int i5 = 2 % 2;
                        int i6 = component2 + 61;
                        copydefault = i6 % 128;
                        int i7 = i6 % 2;
                        Object objComponent2 = component2((Resource) obj3, continuation);
                        int i8 = component2 + 89;
                        copydefault = i8 % 128;
                        if (i8 % 2 != 0) {
                            return objComponent2;
                        }
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }

                    public final Object component2(Resource<VerifyChangePinSmsResp> resource, Continuation<? super Unit> continuation) {
                        int i5 = 2 % 2;
                        int i6 = component2 + 1;
                        copydefault = i6 % 128;
                        if (i6 % 2 != 0) {
                            ChangePinOtpActivity.access$onVerifySmsChanged(changePinOtpActivity, resource);
                            return Unit.INSTANCE;
                        }
                        ChangePinOtpActivity.access$onVerifySmsChanged(changePinOtpActivity, resource);
                        Unit unit = Unit.INSTANCE;
                        throw null;
                    }
                }, this) == coroutine_suspended) {
                    int i5 = component1 + 59;
                    component3 = i5 % 128;
                    if (i5 % 2 == 0) {
                        return coroutine_suspended;
                    }
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = component3 + 95;
                component1 = i6 % 128;
                if (i6 % 2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    throw null;
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        component3(Continuation<? super component3> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component3 component3Var = ChangePinOtpActivity.this.new component3(continuation);
            int i2 = component1 + 71;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return component3Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 51;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent3 = component3(coroutineScope, continuation);
            int i4 = component1 + 1;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return objComponent3;
        }

        public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 27;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component3 + 11;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }
    }

    private static void f(char c2, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i4 = $11 + 43;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = cancelnotification.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(component2[i >> i5])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1758 - View.resolveSize(0, 0), 33 - TextUtils.lastIndexOf("", '0'), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 1159210934, false, $$r(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(component3), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 5);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3609 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29, (char) (7171 - Drawable.resolveOpacity(0, 0)), 1951385784, false, $$r(b4, b5, (byte) (b5 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {cancelnotification, cancelnotification};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4013 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), Process.getGidForName("") + 25, (char) (27761 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), -1529629956, false, $$r(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = cancelnotification.copydefault;
                Object[] objArr5 = {Integer.valueOf(component2[i + i6])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 + 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1758 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 34, (char) View.resolveSize(0, 0), 1159210934, false, $$r(b8, b9, (byte) (b9 - 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objCopydefault4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(component3), Integer.valueOf(c2)};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault5 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = (byte) (b10 + 5);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(3608 - Drawable.resolveOpacity(0, 0), 28 - MotionEvent.axisFromString(""), (char) (7171 - (KeyEvent.getMaxKeyCode() >> 16)), 1951385784, false, $$r(b10, b11, (byte) (b11 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objCopydefault5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {cancelnotification, cancelnotification};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault6 == null) {
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarSize() >> 8) + 4013, Gravity.getAbsoluteGravity(0, 0) + 24, (char) (TextUtils.lastIndexOf("", '0') + 27762), -1529629956, false, $$r(b12, b13, b13), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault6).invoke(null, objArr7);
            }
            int i7 = $11 + 49;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 3 % 5;
            }
        }
        char[] cArr = new char[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr8 = {cancelnotification, cancelnotification};
            Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault7 == null) {
                byte b14 = (byte) 0;
                byte b15 = b14;
                objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(4012 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 24 - View.MeasureSpec.getMode(0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27760), -1529629956, false, $$r(b14, b15, b15), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault7).invoke(null, objArr8);
            int i9 = $10 + 109;
            $11 = i9 % 128;
            int i10 = i9 % 2;
        }
        objArr[0] = new String(cArr);
    }

    private static void g(char[] cArr, int i, char[] cArr2, char c2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        int i5 = $11 + 1;
        $10 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 5 % 2;
        }
        while (iNotificationSideChannel.copydefault < length3) {
            int i7 = $11 + 109;
            $10 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4037 - (ViewConfiguration.getJumpTapTimeout() >> 16), 31 - TextUtils.indexOf("", "", 0), (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19181), 1912513118, false, $$r(b2, (byte) (b2 | Ascii.ETB), b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7567 - TextUtils.getCapsMode("", 0, 0), (Process.myPid() >> 22) + 11, (char) Color.argb(0, 0, 0, 0), 2006389106, false, "e", new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                int i9 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i3] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i9);
                objArr4[0] = iNotificationSideChannel;
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b3 = (byte) 0;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((Process.myPid() >> 22) + 2459, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28, (char) View.MeasureSpec.makeMeasureSpec(0, 0), 931716605, false, $$r(b3, (byte) (b3 | Ascii.CAN), b3), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    i2 = 2;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7567 - (ViewConfiguration.getFadingEdgeLength() >> 16), 11 - ExpandableListView.getPackedPositionType(0L), (char) (ViewConfiguration.getEdgeSlop() >> 16), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[iNotificationSideChannel.copydefault])) ^ (copydefault ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) ShareDataUIState) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) getRequestBeneficiariesState) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                i3 = i2;
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

    private static void i(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = component1;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 33;
                $11 = i8 % 128;
                int i9 = i8 % i;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(658 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 14 - View.combineMeasuredStates(0, 0), (char) (View.resolveSize(0, 0) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i7++;
                    i = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            int i10 = $10 + 95;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i12 = $11 + 37;
                $10 = i12 % 128;
                if (i12 % 2 == 0 ? bArr[iTrustedWebActivityService_Parcel.copydefault] != 1 : bArr[iTrustedWebActivityService_Parcel.copydefault] != 0) {
                    int i13 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr3 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((KeyEvent.getMaxKeyCode() >> 16) + 3580, (Process.myTid() >> 22) + 28, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 1180380354, false, $$r(b2, (byte) (b2 | 7), b2), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                } else {
                    int i14 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault3 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4502, AndroidCharacter.getMirror('0') - '\f', (char) (View.MeasureSpec.getSize(0) + 27897), -1464227204, false, $$r(b3, (byte) (b3 | Ascii.FF), b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b4 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(Color.argb(0, 0, 0, 0) + 1859, Color.blue(0) + 34, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 80302927, false, $$r(b4, (byte) (b4 | 8), b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
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
                int i16 = $11 + 27;
                $10 = i16 % 128;
                int i17 = i16 % 2;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            int i18 = $11 + 11;
            $10 = i18 % 128;
            if (i18 % 2 != 0) {
                int i19 = 4 % 5;
            }
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        f((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(19) - 46), ViewConfiguration.getKeyRepeatTimeout() >> 16, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952716_res_0x7f13044c).substring(6, 7).length() + 17, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        g(new char[]{48725, 37140, 57135, 13898, 6167}, (-725665768) - KeyEvent.getDeadChar(0, 0), new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 29535), new char[]{6170, 48952, 31956, 44147}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i2 = copy + 81;
                getAsAtTimestamp = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr4 = new Object[1];
                g(new char[]{11666, 19932, 39591, 26110, 61901, 56912, 26143, 20447, 52681, 49023, 43953, 35296, 18773, 28845, 51783, 19945, 18262, 36637, 17875, 57762, 44684, 42334, 56000, 56009, 6530, 32522}, TextUtils.getCapsMode("", 0, 0), new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 55540), new char[]{42453, 61972, 4505, 40665}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                f((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 21087), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(21) - 87, 18 - Color.alpha(0), objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                if (!(!(baseContext instanceof ContextWrapper)) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                    baseContext = null;
                } else {
                    baseContext = baseContext.getApplicationContext();
                    int i4 = copy + 111;
                    getAsAtTimestamp = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
            if (baseContext != null) {
                int i6 = copy + 63;
                getAsAtTimestamp = i6 % 128;
                int i7 = i6 % 2;
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - View.resolveSizeAndState(0, 0, 0), 42 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    f((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952792_res_0x7f130498).substring(2, 3).length() + 35, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 57, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    f((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131953368_res_0x7f1306d8).substring(0, 6).codePointAt(3) - 104), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952720_res_0x7f130450).substring(6, 7).codePointAt(0) + 52, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 35, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    f((char) (33732 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 119, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 35, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    g(new char[]{4553, 63781, 32274, 61079, 42500, 31093, 7277, 49798, 21265, 25659, 12245, 65444, 58510, 56245, 56020, 14802, 39938, 21339, 38157, 29026, 32824, 45273, 6185, 55865, 57590, 7732, 59097, 25226, 53547, 62620, 23705, 19112, 866, 45884, 47962, 2413, 35915, 42536, 31605, 45917, 49745, 3780, 57453, 982, 12491, 60370, 12605, 55269, 13196, 28406, 19592, 5770, 15957, 50512, 42370, 53415, 30079, 5462, 40159, 48681, 61183, 27113, 50997, 34357, 9201, 14340, 58072, 47950, 53683, 7302, 20241, 27427}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29, new char[]{0, 0, 0, 0}, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{54466, 31431, 12860, 58564}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    g(new char[]{7774, 24657, 60923, 11649, 63865, 58118}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29, new char[]{0, 0, 0, 0}, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 29576), new char[]{57907, 37818, 34632, 31859}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    f((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952303_res_0x7f1302af).substring(0, 2).codePointAt(1) + 21361), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(26) + 91, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 66, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetAfter("", 0) + 6562, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 56, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr12);
                    int i8 = getAsAtTimestamp + 99;
                    copy = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 2 % 5;
                    }
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
            int i10 = 2405 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 26;
            char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
            Object[] objArr13 = new Object[1];
            h((byte) (-$$d[31]), r6[38], r6[86], objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i10, iResolveSizeAndState, scrollDefaultDelay, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault4 == null) {
                byte[] bArr = $$d;
                byte b2 = bArr[31];
                Object[] objArr14 = new Object[1];
                h((byte) (-b2), (byte) (-bArr[95]), (byte) (-b2), objArr14);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2405 - (ViewConfiguration.getEdgeSlop() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 24929979, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            g(new char[]{41640, 23212, 7784, 23184, 45642, 61609, 21955, 29615, 14496, 448, 6700, 44944, 10978, 33272, 8204, 57427}, ViewConfiguration.getScrollDefaultDelay() >> 16, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952832_res_0x7f1304c0).substring(0, 1).length() + 59003), new char[]{7510, 11732, 31989, 59366}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            g(new char[]{30126, 61624, 30421, 37286, 35436, 60180, 33988, 47140, 62695, 13318, 7251, 16529, 46577, 18370, 31560, 58846}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(11) + 5065), new char[]{31286, 62873, 14541, 29972}, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, -804447091};
                Object[] objArr18 = new Object[1];
                i(new int[]{0, 50, 132, 0}, false, new byte[]{1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0}, objArr18);
                Class<?> cls4 = Class.forName(((String) objArr18[0]).intern());
                byte[] bArr2 = $$s;
                byte b3 = bArr2[65];
                byte b4 = bArr2[42];
                Object[] objArr19 = new Object[1];
                j(b3, b4, (byte) (b4 | 80), objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    int trimmedLength = 2405 - TextUtils.getTrimmedLength("");
                    int gidForName = 25 - Process.getGidForName("");
                    char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                    byte[] bArr3 = $$d;
                    byte b5 = bArr3[31];
                    Object[] objArr20 = new Object[1];
                    h((byte) (-b5), (byte) (-bArr3[95]), (byte) (-b5), objArr20);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(trimmedLength, gidForName, cIndexOf, 24929979, false, (String) objArr20[0], null);
                }
                ((Field) objCopydefault5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    g(new char[]{47736, 40617, 64130, 2452, 2364, 22766, 61968, 23531, 13882, 54324, 29441, 15130, 8178, 55362, 6907, 57644, 2154, 62350, 10549, 26899, 16523, 26126}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131953368_res_0x7f1306d8).substring(0, 6).length() - 6), new char[]{17253, 59538, 46889, 38773}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    g(new char[]{6488, 52554, 50823, 45046, 50120, 34889, 15230, 4038, 25404, 33926, 16796, 63636, 29428, 35113, 11489}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1173270824, new char[]{0, 0, 0, 0}, (char) (7534 - View.combineMeasuredStates(0, 0)), new char[]{62965, 4430, 28346, 45853}, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault6 == null) {
                        int iIndexOf = 2404 - TextUtils.indexOf((CharSequence) "", '0');
                        int i11 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 25;
                        char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                        byte b6 = $$d[33];
                        Object[] objArr23 = new Object[1];
                        h(b6, b6, r6[40], objArr23);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, i11, offsetBefore, -1843538389, false, (String) objArr23[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault7 == null) {
                        int iResolveSize = 2405 - View.resolveSize(0, 0);
                        int threadPriority = 26 - ((Process.getThreadPriority(0) + 20) >> 6);
                        char cMyPid = (char) (Process.myPid() >> 22);
                        Object[] objArr24 = new Object[1];
                        h((byte) (-$$d[31]), r2[38], r2[86], objArr24);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(iResolveSize, threadPriority, cMyPid, -2047739879, false, (String) objArr24[0], null);
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
        int i12 = ((int[]) objArr[0])[0];
        int i13 = ((int[]) objArr[2])[0];
        if (i13 != i12) {
            long j = -1;
            long j2 = ((long) (i13 ^ i12)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(Process.getGidForName("") + 6619, 42 - View.getDefaultSize(0, 0), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault8).invoke(null, null);
            try {
                Object[] objArr25 = {-255647524, Long.valueOf(j4), new ArrayList(), null, true};
                Class cls6 = (Class) ITrustedWebActivityCallbackDefault.copydefault(Color.blue(0) + 6562, KeyEvent.normalizeMetaState(0) + 56, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                byte b7 = $$s[65];
                byte b8 = b7;
                Object[] objArr26 = new Object[1];
                j(b7, b8, (byte) (b8 | 71), objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(savedInstanceState);
        observeData();
    }

    private final void observeData() {
        int i = 2 % 2;
        ChangePinOtpActivity changePinOtpActivity = this;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(changePinOtpActivity), null, null, new component1(null), 3, null);
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(changePinOtpActivity), null, null, new component3(null), 3, null);
        int i2 = getAsAtTimestamp + 55;
        copy = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void onVerifySmsChanged$lambda$3(CommonDialog commonDialog) {
        int i = 2 % 2;
        int i2 = copy + 71;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(commonDialog, "");
        commonDialog.dismiss();
        int i4 = copy + 93;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onVerifySmsChanged$lambda$4(CommonDialog commonDialog) {
        int i = 2 % 2;
        int i2 = copy + 17;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(commonDialog, "");
            commonDialog.dismiss();
        } else {
            Intrinsics.checkNotNullParameter(commonDialog, "");
            commonDialog.dismiss();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final void onVerifySmsChanged(Resource<VerifyChangePinSmsResp> resource) {
        List<VerifyType> verifyTypes;
        int i = 2 % 2;
        int i2 = copy + 65;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        ChangePinOtpActivity changePinOtpActivity = this;
        Utils.showOrHideLoading(changePinOtpActivity, resource);
        if (resource.error()) {
            ((ActivityAbstractOtpBinding) this.binding).etCode.showError(resource.getMessage());
            ((ActivityAbstractOtpBinding) this.binding).etCode.clear();
            if (Intrinsics.areEqual("timeout", resource.getException().getResponseCode())) {
                DialogUtils.showConnectTimeOutDialog(changePinOtpActivity, new CommonDialog.OnClickListener() {
                    private static int component2 = 0;
                    private static int component3 = 1;

                    @Override
                    public final void onClick(CommonDialog commonDialog) {
                        int i4 = 2 % 2;
                        int i5 = component3 + 57;
                        component2 = i5 % 128;
                        int i6 = i5 % 2;
                        ChangePinOtpActivity.$r8$lambda$moVGpxfYKkpjBvoktRS_gK3gDFs(commonDialog);
                        int i7 = component3 + 5;
                        component2 = i7 % 128;
                        if (i7 % 2 != 0) {
                            throw null;
                        }
                    }
                });
            }
            if (Intrinsics.areEqual(HttpStatus.OTP_VERIFY_LIMIT, resource.getException().getResponseCode())) {
                DialogUtils.showTimesLimitDialog(changePinOtpActivity, new CommonDialog.OnClickListener() {
                    private static int component1 = 1;
                    private static int component3;

                    @Override
                    public final void onClick(CommonDialog commonDialog) {
                        int i4 = 2 % 2;
                        int i5 = component1 + 107;
                        component3 = i5 % 128;
                        int i6 = i5 % 2;
                        ChangePinOtpActivity.$r8$lambda$g3ODcc16nbpWcM5cWUib1XaOqn0(commonDialog);
                        if (i6 != 0) {
                            int i7 = 72 / 0;
                        }
                    }
                });
                return;
            }
            return;
        }
        if (resource.success()) {
            VerifyChangePinSmsResp data = resource.getData();
            Intrinsics.checkNotNull(data);
            TokenHelper.INSTANCE.setTempToken(data.getToken());
            VerifyChangePinSmsResp data2 = resource.getData();
            if (data2 != null) {
                int i4 = getAsAtTimestamp + 17;
                copy = i4 % 128;
                int i5 = i4 % 2;
                verifyTypes = data2.getVerifyTypes();
            } else {
                verifyTypes = null;
            }
            List<VerifyType> list = verifyTypes;
            if (list != null && !list.isEmpty()) {
                Intent intent = new Intent(this, (Class<?>) ChangePinSelectionActivity.class);
                intent.putParcelableArrayListExtra(Keys.VERIFY_LIST, new ArrayList<>(list));
                intent.putExtra(KeysConstants.KEY_SUPPORT_FORGET_PIN, true);
                startActivity(intent);
            } else {
                RouteUtils.routeWithExecute(RoutePathConstants.CHANGE_PIN, BundleKt.bundleOf(TuplesKt.to(KeysConstants.KEY_SUPPORT_FORGET_PIN, true), TuplesKt.to(Keys.VERIFY_OLD_PIN, false)));
            }
            finish();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002f  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onConfirmClick(java.lang.String r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = 2
            int r2 = r1 % r1
            int r2 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity.getAsAtTimestamp
            int r2 = r2 + 25
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity.copy = r3
            int r2 = r2 % r1
            r2 = r0
            android.app.Activity r2 = (android.app.Activity) r2
            com.blankj.utilcode.util.KeyboardUtils.hideSoftInput(r2)
            java.lang.String r2 = r18.getNewToken()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.String r3 = "recent_login_phone_number"
            java.lang.String r4 = ""
            if (r2 == 0) goto L2f
            int r5 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity.getAsAtTimestamp
            int r5 = r5 + 61
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity.copy = r6
            int r5 = r5 % r1
            int r1 = r2.length()
            if (r1 != 0) goto L3b
        L2f:
            java.lang.String r1 = r18.getLoginType()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L81
        L3b:
            java.lang.Class<com.huawei.digitalpayment.consumer.service.IRiskService> r1 = com.huawei.digitalpayment.consumer.service.IRiskService.class
            java.lang.Object r1 = com.huawei.arouter.RouteUtils.getService(r1)
            com.huawei.digitalpayment.consumer.service.IRiskService r1 = (com.huawei.digitalpayment.consumer.service.IRiskService) r1
            r2 = 1
            kotlin.Pair[] r2 = new kotlin.Pair[r2]
            java.lang.String r6 = r18.getLoginType()
            java.lang.String r8 = r18.getOtpType()
            com.huawei.common.util.SPUtils r5 = com.huawei.common.util.SPUtils.getInstance()
            java.lang.String r13 = r5.getString(r3)
            java.lang.String r3 = r18.getNewToken()
            if (r3 != 0) goto L5e
            r15 = r4
            goto L5f
        L5e:
            r15 = r3
        L5f:
            com.huawei.digitalpayment.consumer.risk.bean.ProcessVerifyParams r3 = new com.huawei.digitalpayment.consumer.risk.bean.ProcessVerifyParams
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 376(0x178, float:5.27E-43)
            r17 = 0
            r5 = r3
            r7 = r19
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r4 = "riskParams"
            kotlin.Pair r3 = kotlin.TuplesKt.to(r4, r3)
            r4 = 0
            r2[r4] = r3
            android.os.Bundle r2 = androidx.core.os.BundleKt.bundleOf(r2)
            r1.startProcess(r2)
            return
        L81:
            VM extends androidx.lifecycle.ViewModel r1 = r0.viewModel
            com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ChangePinOtpViewModel r1 = (com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ChangePinOtpViewModel) r1
            if (r19 != 0) goto L89
            r2 = r4
            goto L8b
        L89:
            r2 = r19
        L8b:
            java.lang.String r5 = r18.getOtpType()
            com.huawei.common.util.SPUtils r6 = com.huawei.common.util.SPUtils.getInstance()
            java.lang.String r3 = r6.getString(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            com.huawei.digitalpayment.consumer.loginModule.mpin.request.VerifyChangePinSmsParams r4 = new com.huawei.digitalpayment.consumer.loginModule.mpin.request.VerifyChangePinSmsParams
            r4.<init>(r2, r5, r3)
            r1.verifySms(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity.onConfirmClick(java.lang.String):void");
    }

    @Override
    public void getSmsCode() {
        int i = 2 % 2;
        ChangePinOtpViewModel changePinOtpViewModel = (ChangePinOtpViewModel) this.viewModel;
        String otpType = getOtpType();
        String string = SPUtils.getInstance().getString("recent_login_phone_number");
        Intrinsics.checkNotNullExpressionValue(string, "");
        changePinOtpViewModel.sendSms(new SendOtpParams(otpType, string));
        int i2 = getAsAtTimestamp + 111;
        copy = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public OtpType mo10749getOtpType() {
        int i = 2 % 2;
        OtpType otpType = new OtpType(getString(com.huawei.digitalpayment.consumer.login.R.string.pinmanage_change_pin_otp_title1), getString(com.huawei.digitalpayment.consumer.login.R.string.pinmanage_change_pin_otp_tips1), getString(com.huawei.digitalpayment.consumer.login.R.string.pinmanage_change_pin_otp_tips2), getString(com.huawei.digitalpayment.consumer.login.R.string.pinmanage_change_pin_otp_button1), getString(com.huawei.digitalpayment.consumer.login.R.string.pinmanage_change_pin_otp_button2));
        int i2 = getAsAtTimestamp + 117;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return otpType;
    }

    @Override
    public void onBackPressed() {
        int i = 2 % 2;
        Bundle bundle = new Bundle(1);
        bundle.putBoolean(KeysConstants.IS_CHECKED_SERVICE, true);
        String stringExtra = getIntent().getStringExtra(KeysConstants.KEY_EXECUTE);
        if (true ^ TextUtils.isEmpty(stringExtra)) {
            int i2 = copy + 31;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            RouteUtils.routeWithExecute(stringExtra, bundle);
        }
        super.onBackPressed();
        int i4 = copy + 109;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d5  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x011b  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(42:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|923|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|(3:932|32|(11:34|878|35|39|40|904|(2:42|(5:44|45|(1:47)|48|49)(4:50|(1:52)|53|54))(24:55|56|930|57|58|918|59|(2:928|61)|65|66|905|67|(2:934|69)|73|74|75|(2:898|77)|81|82|83|(1:85)|86|(1:88)|89)|90|(4:93|(3:977|95|980)(12:976|96|(3:98|(3:101|102|99)|981)|103|890|104|(1:106)|107|108|879|109|979)|978|91)|975|122)(8:39|40|904|(0)(0)|90|(1:91)|975|122))|153|849|154|(1:156)|157|(3:159|(1:161)|162)(14:164|165|843|166|(1:168)|169|170|171|(1:173)|174|(1:176)(1:177)|178|(1:180)|181)|163|182|(9:185|951|186|(1:188)|189|190|191|941|192)|222|(11:910|223|(3:225|876|226)|230|231|909|(4:233|234|(1:236)|237)(19:239|240|896|241|(2:956|243)|247|248|884|249|(2:856|251)|255|256|257|(1:259)|260|(2:262|263)(1:265)|266|(1:268)|269)|270|(4:273|(2:275|(2:280|973)(11:281|(3:283|(3:286|287|284)|974)|288|864|289|(1:291)|292|293|852|294|972))(2:278|(0)(0))|295|271)|971|307)|308|(17:883|339|340|(3:342|343|(2:345|347)(1:346))(1:347)|384|888|385|(18:387|943|388|393|394|874|395|(5:939|397|398|938|399)(1:404)|872|405|406|955|(4:408|409|(1:411)|412)(12:(2:416|(1:422)(1:421))(1:424)|(24:426|427|866|428|854|429|(2:907|431)|435|436|847|437|(2:947|439)|443|444|445|(2:916|447)|451|452|845|453|(2:840|455)(1:457)|458|(1:460)|461)(2:516|517)|526|527|860|528|531|532|(1:534)(1:535)|536|537|538)|462|(4:465|(2:467|969)(11:468|(3:470|(4:473|474|475|471)|970)|478|945|479|(1:481)|482|483|936|484|968)|485|463)|967|499|517)(15:393|394|874|395|(0)(0)|872|405|406|955|(0)(0)|462|(1:463)|967|499|517)|539|(1:541)|542|(1:544)(1:545)|546|(3:548|(1:550)|551)(16:553|554|(1:556)|557|(1:559)|560|561|(1:563)|564|926|565|566|(1:568)(1:569)|570|(1:572)|573)|552|574|(6:576|(1:578)|579|(3:581|(1:583)|584)(14:585|586|(1:588)|589|590|(1:592)|593|881|594|595|(1:597)(1:598)|599|(1:601)|602)|603|(25:605|924|606|(2:949|608)|612|(4:614|615|922|616)(1:617)|618|(3:620|(1:622)|623)(17:624|(2:626|(1:632)(1:631))|(19:634|635|912|636|(1:638)|639|640|902|641|(1:643)|644|645|646|(1:648)|649|(1:651)|652|(1:654)|655)|714|(1:716)|717|(3:719|(1:721)|722)(13:724|914|725|726|(1:728)|729|858|730|731|(1:733)|734|(1:736)|737)|723|738|(6:741|742|(1:744)|745|746|747)|748|(1:750)|751|(3:753|(1:755)|756)(14:758|759|(1:761)|762|763|(1:765)|766|870|767|768|(1:770)|771|(1:773)|774)|757|775|(1:982)(7:778|779|(1:781)|782|783|784|785))|656|(4:659|(3:960|661|963)(12:959|662|(3:664|(3:667|668|665)|964)|669|894|670|(1:672)|673|674|886|675|962)|961|657)|958|714|(0)|717|(0)(0)|723|738|(0)|748|(0)|751|(0)(0)|757|775|(0)(0))(10:795|(3:797|(2:800|798)|965)|801|802|(1:804)|805|(1:807)|808|809|810))(10:813|(3:815|(2:818|816)|966)|819|820|(1:822)|823|(1:825)|826|827|828))(1:351)|352|862|353|(1:355)|356|850|357|(1:359)|360|361|384|888|385|(0)(0)|539|(0)|542|(0)(0)|546|(0)(0)|552|574|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x1ecf, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x1ed0, code lost:
    
        r40 = r15;
        r9 = r32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0b19 A[Catch: all -> 0x05f6, TryCatch #45 {all -> 0x05f6, blocks: (B:147:0x0b13, B:149:0x0b19, B:150:0x0b46, B:331:0x1571, B:333:0x1577, B:334:0x15a5, B:532:0x1f6b, B:534:0x1f71, B:536:0x1f9d, B:742:0x3171, B:744:0x3177, B:745:0x31a0, B:779:0x34b0, B:781:0x34b6, B:782:0x34dc, B:759:0x32f0, B:761:0x3313, B:762:0x3363, B:708:0x2e22, B:710:0x2e28, B:711:0x2e5a, B:802:0x35b2, B:804:0x35b8, B:805:0x35e5, B:807:0x361f, B:808:0x366a, B:586:0x265c, B:588:0x2671, B:589:0x26a0, B:820:0x374e, B:822:0x3754, B:823:0x377c, B:825:0x37b6, B:826:0x3800, B:554:0x21df, B:556:0x21f4, B:557:0x2222, B:559:0x2256, B:560:0x22d0, B:378:0x180f, B:380:0x1815, B:381:0x1846, B:216:0x0fce, B:218:0x0fd4, B:219:0x0ffc, B:19:0x02b6, B:21:0x02bc, B:22:0x02e5, B:24:0x0568, B:26:0x059a, B:27:0x05f0), top: B:923:0x02b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0bcd A[Catch: all -> 0x0f2c, TryCatch #5 {all -> 0x0f2c, blocks: (B:154:0x0bc7, B:156:0x0bcd, B:157:0x0c0f, B:159:0x0c1c, B:161:0x0c25, B:162:0x0c6c, B:182:0x0e23, B:190:0x0e90, B:196:0x0f10, B:198:0x0f16, B:199:0x0f17, B:201:0x0f19, B:203:0x0f20, B:204:0x0f21, B:164:0x0c78, B:171:0x0cfc, B:173:0x0d02, B:174:0x0d45, B:176:0x0d6f, B:178:0x0db9, B:180:0x0dd0, B:181:0x0e19, B:206:0x0f23, B:208:0x0f2a, B:209:0x0f2b, B:166:0x0c98, B:168:0x0caa, B:169:0x0cf0, B:192:0x0e96, B:186:0x0e57, B:188:0x0e5d, B:189:0x0e89), top: B:849:0x0bc7, outer: #1, inners: #2, #55, #60 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0c1c A[Catch: all -> 0x0f2c, TryCatch #5 {all -> 0x0f2c, blocks: (B:154:0x0bc7, B:156:0x0bcd, B:157:0x0c0f, B:159:0x0c1c, B:161:0x0c25, B:162:0x0c6c, B:182:0x0e23, B:190:0x0e90, B:196:0x0f10, B:198:0x0f16, B:199:0x0f17, B:201:0x0f19, B:203:0x0f20, B:204:0x0f21, B:164:0x0c78, B:171:0x0cfc, B:173:0x0d02, B:174:0x0d45, B:176:0x0d6f, B:178:0x0db9, B:180:0x0dd0, B:181:0x0e19, B:206:0x0f23, B:208:0x0f2a, B:209:0x0f2b, B:166:0x0c98, B:168:0x0caa, B:169:0x0cf0, B:192:0x0e96, B:186:0x0e57, B:188:0x0e5d, B:189:0x0e89), top: B:849:0x0bc7, outer: #1, inners: #2, #55, #60 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0c78 A[Catch: all -> 0x0f2c, TRY_LEAVE, TryCatch #5 {all -> 0x0f2c, blocks: (B:154:0x0bc7, B:156:0x0bcd, B:157:0x0c0f, B:159:0x0c1c, B:161:0x0c25, B:162:0x0c6c, B:182:0x0e23, B:190:0x0e90, B:196:0x0f10, B:198:0x0f16, B:199:0x0f17, B:201:0x0f19, B:203:0x0f20, B:204:0x0f21, B:164:0x0c78, B:171:0x0cfc, B:173:0x0d02, B:174:0x0d45, B:176:0x0d6f, B:178:0x0db9, B:180:0x0dd0, B:181:0x0e19, B:206:0x0f23, B:208:0x0f2a, B:209:0x0f2b, B:166:0x0c98, B:168:0x0caa, B:169:0x0cf0, B:192:0x0e96, B:186:0x0e57, B:188:0x0e5d, B:189:0x0e89), top: B:849:0x0bc7, outer: #1, inners: #2, #55, #60 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0e35  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x1083  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x10dc  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x1134 A[Catch: all -> 0x14e9, TRY_ENTER, TRY_LEAVE, TryCatch #38 {all -> 0x14e9, blocks: (B:223:0x107d, B:230:0x10cf, B:270:0x136d, B:271:0x1371, B:281:0x13b5, B:278:0x139a, B:239:0x1134, B:257:0x1248, B:260:0x1295, B:266:0x130b, B:269:0x1365), top: B:910:0x107d }] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x1377  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x13b0  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x13b5 A[Catch: all -> 0x14e9, PHI: r2 r5 r8
  0x13b5: PHI (r2v601 java.lang.Object[]) = (r2v600 java.lang.Object[]), (r2v622 java.lang.Object[]) binds: [B:279:0x13ae, B:276:0x1397] A[DONT_GENERATE, DONT_INLINE]
  0x13b5: PHI (r5v507 int) = (r5v506 int), (r5v519 int) binds: [B:279:0x13ae, B:276:0x1397] A[DONT_GENERATE, DONT_INLINE]
  0x13b5: PHI (r8v234 int) = (r8v233 int), (r8v258 int) binds: [B:279:0x13ae, B:276:0x1397] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #38 {all -> 0x14e9, blocks: (B:223:0x107d, B:230:0x10cf, B:270:0x136d, B:271:0x1371, B:281:0x13b5, B:278:0x139a, B:239:0x1134, B:257:0x1248, B:260:0x1295, B:266:0x130b, B:269:0x1365), top: B:910:0x107d }] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x1577 A[Catch: all -> 0x05f6, TryCatch #45 {all -> 0x05f6, blocks: (B:147:0x0b13, B:149:0x0b19, B:150:0x0b46, B:331:0x1571, B:333:0x1577, B:334:0x15a5, B:532:0x1f6b, B:534:0x1f71, B:536:0x1f9d, B:742:0x3171, B:744:0x3177, B:745:0x31a0, B:779:0x34b0, B:781:0x34b6, B:782:0x34dc, B:759:0x32f0, B:761:0x3313, B:762:0x3363, B:708:0x2e22, B:710:0x2e28, B:711:0x2e5a, B:802:0x35b2, B:804:0x35b8, B:805:0x35e5, B:807:0x361f, B:808:0x366a, B:586:0x265c, B:588:0x2671, B:589:0x26a0, B:820:0x374e, B:822:0x3754, B:823:0x377c, B:825:0x37b6, B:826:0x3800, B:554:0x21df, B:556:0x21f4, B:557:0x2222, B:559:0x2256, B:560:0x22d0, B:378:0x180f, B:380:0x1815, B:381:0x1846, B:216:0x0fce, B:218:0x0fd4, B:219:0x0ffc, B:19:0x02b6, B:21:0x02bc, B:22:0x02e5, B:24:0x0568, B:26:0x059a, B:27:0x05f0), top: B:923:0x02b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x1650  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x1667 A[Catch: all -> 0x1738, TryCatch #12 {all -> 0x1738, blocks: (B:353:0x1652, B:355:0x1667, B:356:0x1698), top: B:862:0x1652, outer: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x16ab A[Catch: all -> 0x172e, TryCatch #6 {all -> 0x172e, blocks: (B:357:0x169e, B:359:0x16ab, B:360:0x1725), top: B:850:0x169e, outer: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x18c9  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x1918 A[Catch: all -> 0x1ecf, PHI: r2
  0x1918: PHI (r2v456 java.lang.Object) = (r2v455 java.lang.Object), (r2v530 java.lang.Object) binds: [B:386:0x18c7, B:388:0x18cc] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #26 {all -> 0x1ecf, blocks: (B:385:0x18c3, B:393:0x1918), top: B:888:0x18c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x1996  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x19ac  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x1a0f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x1d58 A[Catch: all -> 0x1ea2, TryCatch #3 {all -> 0x1ea2, blocks: (B:462:0x1d4e, B:463:0x1d52, B:465:0x1d58, B:468:0x1d74, B:453:0x1c80, B:458:0x1cea, B:461:0x1d46), top: B:845:0x1c80 }] */
    /* JADX WARN: Removed duplicated region for block: B:534:0x1f71 A[Catch: all -> 0x05f6, TryCatch #45 {all -> 0x05f6, blocks: (B:147:0x0b13, B:149:0x0b19, B:150:0x0b46, B:331:0x1571, B:333:0x1577, B:334:0x15a5, B:532:0x1f6b, B:534:0x1f71, B:536:0x1f9d, B:742:0x3171, B:744:0x3177, B:745:0x31a0, B:779:0x34b0, B:781:0x34b6, B:782:0x34dc, B:759:0x32f0, B:761:0x3313, B:762:0x3363, B:708:0x2e22, B:710:0x2e28, B:711:0x2e5a, B:802:0x35b2, B:804:0x35b8, B:805:0x35e5, B:807:0x361f, B:808:0x366a, B:586:0x265c, B:588:0x2671, B:589:0x26a0, B:820:0x374e, B:822:0x3754, B:823:0x377c, B:825:0x37b6, B:826:0x3800, B:554:0x21df, B:556:0x21f4, B:557:0x2222, B:559:0x2256, B:560:0x22d0, B:378:0x180f, B:380:0x1815, B:381:0x1846, B:216:0x0fce, B:218:0x0fd4, B:219:0x0ffc, B:19:0x02b6, B:21:0x02bc, B:22:0x02e5, B:24:0x0568, B:26:0x059a, B:27:0x05f0), top: B:923:0x02b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:535:0x1f9c  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x2025  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x2093  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x20dd  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x20f5  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x21c1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0715 A[Catch: all -> 0x0a80, TRY_ENTER, TRY_LEAVE, TryCatch #50 {all -> 0x0a80, blocks: (B:32:0x0602, B:39:0x0651, B:55:0x0715), top: B:932:0x0602 }] */
    /* JADX WARN: Removed duplicated region for block: B:576:0x2411  */
    /* JADX WARN: Removed duplicated region for block: B:710:0x2e28 A[Catch: all -> 0x05f6, TryCatch #45 {all -> 0x05f6, blocks: (B:147:0x0b13, B:149:0x0b19, B:150:0x0b46, B:331:0x1571, B:333:0x1577, B:334:0x15a5, B:532:0x1f6b, B:534:0x1f71, B:536:0x1f9d, B:742:0x3171, B:744:0x3177, B:745:0x31a0, B:779:0x34b0, B:781:0x34b6, B:782:0x34dc, B:759:0x32f0, B:761:0x3313, B:762:0x3363, B:708:0x2e22, B:710:0x2e28, B:711:0x2e5a, B:802:0x35b2, B:804:0x35b8, B:805:0x35e5, B:807:0x361f, B:808:0x366a, B:586:0x265c, B:588:0x2671, B:589:0x26a0, B:820:0x374e, B:822:0x3754, B:823:0x377c, B:825:0x37b6, B:826:0x3800, B:554:0x21df, B:556:0x21f4, B:557:0x2222, B:559:0x2256, B:560:0x22d0, B:378:0x180f, B:380:0x1815, B:381:0x1846, B:216:0x0fce, B:218:0x0fd4, B:219:0x0ffc, B:19:0x02b6, B:21:0x02bc, B:22:0x02e5, B:24:0x0568, B:26:0x059a, B:27:0x05f0), top: B:923:0x02b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:716:0x2eed  */
    /* JADX WARN: Removed duplicated region for block: B:719:0x2f41  */
    /* JADX WARN: Removed duplicated region for block: B:724:0x2f99  */
    /* JADX WARN: Removed duplicated region for block: B:741:0x3152  */
    /* JADX WARN: Removed duplicated region for block: B:750:0x3229  */
    /* JADX WARN: Removed duplicated region for block: B:753:0x3279  */
    /* JADX WARN: Removed duplicated region for block: B:758:0x32d2  */
    /* JADX WARN: Removed duplicated region for block: B:778:0x3490  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0283 A[PHI: r13
  0x0283: PHI (r13v232 ??) = (r13v2 ??), (r13v1 ??) binds: [B:17:0x02b1, B:5:0x0280] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:813:0x3711  */
    /* JADX WARN: Removed duplicated region for block: B:883:0x162b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:939:0x1940 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0942 A[Catch: all -> 0x0a62, TryCatch #34 {all -> 0x0a62, blocks: (B:90:0x0938, B:91:0x093c, B:93:0x0942, B:96:0x095a, B:99:0x0967, B:101:0x096a, B:113:0x0a4c, B:115:0x0a52, B:116:0x0a53, B:118:0x0a55, B:120:0x0a5c, B:121:0x0a5d, B:83:0x0874, B:85:0x0891, B:86:0x08d4, B:88:0x08eb, B:89:0x0932, B:127:0x0a68, B:129:0x0a6e, B:130:0x0a6f, B:133:0x0a74, B:135:0x0a7a, B:136:0x0a7b, B:109:0x09cf, B:104:0x0996, B:106:0x099c, B:107:0x09c7), top: B:904:0x065c, inners: #21, #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:982:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v68 */
    /* JADX WARN: Type inference failed for: r13v1, types: [char[]] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v207 */
    /* JADX WARN: Type inference failed for: r13v208 */
    /* JADX WARN: Type inference failed for: r13v209 */
    /* JADX WARN: Type inference failed for: r13v210 */
    /* JADX WARN: Type inference failed for: r13v211 */
    /* JADX WARN: Type inference failed for: r13v212 */
    /* JADX WARN: Type inference failed for: r13v213 */
    /* JADX WARN: Type inference failed for: r13v223 */
    /* JADX WARN: Type inference failed for: r13v226 */
    /* JADX WARN: Type inference failed for: r13v227 */
    /* JADX WARN: Type inference failed for: r13v230 */
    /* JADX WARN: Type inference failed for: r13v232 */
    /* JADX WARN: Type inference failed for: r13v233 */
    /* JADX WARN: Type inference failed for: r13v234 */
    /* JADX WARN: Type inference failed for: r13v235 */
    /* JADX WARN: Type inference failed for: r13v236 */
    /* JADX WARN: Type inference failed for: r13v237 */
    /* JADX WARN: Type inference failed for: r13v238 */
    /* JADX WARN: Type inference failed for: r13v239 */
    /* JADX WARN: Type inference failed for: r13v240 */
    /* JADX WARN: Type inference failed for: r13v241 */
    /* JADX WARN: Type inference failed for: r13v242 */
    /* JADX WARN: Type inference failed for: r13v243 */
    /* JADX WARN: Type inference failed for: r13v61 */
    /* JADX WARN: Type inference failed for: r13v67 */
    /* JADX WARN: Type inference failed for: r13v68 */
    /* JADX WARN: Type inference failed for: r13v69 */
    /* JADX WARN: Type inference failed for: r13v70 */
    /* JADX WARN: Type inference failed for: r13v71, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v72 */
    /* JADX WARN: Type inference failed for: r15v100 */
    /* JADX WARN: Type inference failed for: r15v103 */
    /* JADX WARN: Type inference failed for: r15v104 */
    /* JADX WARN: Type inference failed for: r15v105, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r15v106 */
    /* JADX WARN: Type inference failed for: r15v107 */
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
    /* JADX WARN: Type inference failed for: r15v144 */
    /* JADX WARN: Type inference failed for: r15v145 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v38 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v41 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v58 */
    /* JADX WARN: Type inference failed for: r15v60 */
    /* JADX WARN: Type inference failed for: r15v61 */
    /* JADX WARN: Type inference failed for: r15v63 */
    /* JADX WARN: Type inference failed for: r15v64 */
    /* JADX WARN: Type inference failed for: r15v73 */
    /* JADX WARN: Type inference failed for: r15v74 */
    /* JADX WARN: Type inference failed for: r15v75 */
    /* JADX WARN: Type inference failed for: r15v76 */
    /* JADX WARN: Type inference failed for: r15v77 */
    /* JADX WARN: Type inference failed for: r15v78 */
    /* JADX WARN: Type inference failed for: r15v79 */
    /* JADX WARN: Type inference failed for: r15v80 */
    /* JADX WARN: Type inference failed for: r15v81 */
    /* JADX WARN: Type inference failed for: r15v82 */
    /* JADX WARN: Type inference failed for: r15v83 */
    /* JADX WARN: Type inference failed for: r15v84 */
    /* JADX WARN: Type inference failed for: r15v85 */
    /* JADX WARN: Type inference failed for: r15v86 */
    /* JADX WARN: Type inference failed for: r15v90 */
    /* JADX WARN: Type inference failed for: r15v91 */
    /* JADX WARN: Type inference failed for: r15v92 */
    /* JADX WARN: Type inference failed for: r15v93 */
    /* JADX WARN: Type inference failed for: r15v94 */
    /* JADX WARN: Type inference failed for: r15v95 */
    /* JADX WARN: Type inference failed for: r15v96 */
    /* JADX WARN: Type inference failed for: r15v97 */
    /* JADX WARN: Type inference failed for: r15v98 */
    /* JADX WARN: Type inference failed for: r15v99 */
    /* JADX WARN: Type inference failed for: r32v10 */
    /* JADX WARN: Type inference failed for: r32v11 */
    /* JADX WARN: Type inference failed for: r32v110 */
    /* JADX WARN: Type inference failed for: r32v111 */
    /* JADX WARN: Type inference failed for: r32v112 */
    /* JADX WARN: Type inference failed for: r32v113 */
    /* JADX WARN: Type inference failed for: r32v114 */
    /* JADX WARN: Type inference failed for: r32v115 */
    /* JADX WARN: Type inference failed for: r32v116 */
    /* JADX WARN: Type inference failed for: r32v117 */
    /* JADX WARN: Type inference failed for: r32v12 */
    /* JADX WARN: Type inference failed for: r32v120 */
    /* JADX WARN: Type inference failed for: r32v121 */
    /* JADX WARN: Type inference failed for: r32v122 */
    /* JADX WARN: Type inference failed for: r32v123 */
    /* JADX WARN: Type inference failed for: r32v124 */
    /* JADX WARN: Type inference failed for: r32v125 */
    /* JADX WARN: Type inference failed for: r32v126 */
    /* JADX WARN: Type inference failed for: r32v127 */
    /* JADX WARN: Type inference failed for: r32v128 */
    /* JADX WARN: Type inference failed for: r32v129 */
    /* JADX WARN: Type inference failed for: r32v13 */
    /* JADX WARN: Type inference failed for: r32v130 */
    /* JADX WARN: Type inference failed for: r32v131 */
    /* JADX WARN: Type inference failed for: r32v132 */
    /* JADX WARN: Type inference failed for: r32v133 */
    /* JADX WARN: Type inference failed for: r32v134 */
    /* JADX WARN: Type inference failed for: r32v135 */
    /* JADX WARN: Type inference failed for: r32v14 */
    /* JADX WARN: Type inference failed for: r32v15 */
    /* JADX WARN: Type inference failed for: r32v5 */
    /* JADX WARN: Type inference failed for: r32v62 */
    /* JADX WARN: Type inference failed for: r32v63 */
    /* JADX WARN: Type inference failed for: r32v64 */
    /* JADX WARN: Type inference failed for: r32v65 */
    /* JADX WARN: Type inference failed for: r32v66 */
    /* JADX WARN: Type inference failed for: r32v68 */
    /* JADX WARN: Type inference failed for: r32v69 */
    /* JADX WARN: Type inference failed for: r32v74 */
    /* JADX WARN: Type inference failed for: r32v75 */
    /* JADX WARN: Type inference failed for: r32v76 */
    /* JADX WARN: Type inference failed for: r32v77 */
    /* JADX WARN: Type inference failed for: r32v79 */
    /* JADX WARN: Type inference failed for: r32v81 */
    /* JADX WARN: Type inference failed for: r32v82 */
    /* JADX WARN: Type inference failed for: r32v83 */
    /* JADX WARN: Type inference failed for: r32v84 */
    /* JADX WARN: Type inference failed for: r32v85 */
    /* JADX WARN: Type inference failed for: r32v90 */
    /* JADX WARN: Type inference failed for: r32v94 */
    /* JADX WARN: Type inference failed for: r39v10 */
    /* JADX WARN: Type inference failed for: r39v11 */
    /* JADX WARN: Type inference failed for: r39v12 */
    /* JADX WARN: Type inference failed for: r39v13 */
    /* JADX WARN: Type inference failed for: r39v14 */
    /* JADX WARN: Type inference failed for: r39v15 */
    /* JADX WARN: Type inference failed for: r39v2 */
    /* JADX WARN: Type inference failed for: r39v3 */
    /* JADX WARN: Type inference failed for: r39v32 */
    /* JADX WARN: Type inference failed for: r39v33 */
    /* JADX WARN: Type inference failed for: r39v7 */
    /* JADX WARN: Type inference failed for: r39v8 */
    /* JADX WARN: Type inference failed for: r39v9 */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v533 */
    /* JADX WARN: Type inference failed for: r3v534 */
    /* JADX WARN: Type inference failed for: r3v547 */
    /* JADX WARN: Type inference failed for: r3v562 */
    /* JADX WARN: Type inference failed for: r3v575 */
    /* JADX WARN: Type inference failed for: r3v576 */
    /* JADX WARN: Type inference failed for: r40v0 */
    /* JADX WARN: Type inference failed for: r40v1 */
    /* JADX WARN: Type inference failed for: r40v10 */
    /* JADX WARN: Type inference failed for: r40v11 */
    /* JADX WARN: Type inference failed for: r40v12 */
    /* JADX WARN: Type inference failed for: r40v13 */
    /* JADX WARN: Type inference failed for: r40v14 */
    /* JADX WARN: Type inference failed for: r40v15 */
    /* JADX WARN: Type inference failed for: r40v16 */
    /* JADX WARN: Type inference failed for: r40v17 */
    /* JADX WARN: Type inference failed for: r40v18 */
    /* JADX WARN: Type inference failed for: r40v19 */
    /* JADX WARN: Type inference failed for: r40v2 */
    /* JADX WARN: Type inference failed for: r40v20 */
    /* JADX WARN: Type inference failed for: r40v21 */
    /* JADX WARN: Type inference failed for: r40v22 */
    /* JADX WARN: Type inference failed for: r40v23 */
    /* JADX WARN: Type inference failed for: r40v24 */
    /* JADX WARN: Type inference failed for: r40v25 */
    /* JADX WARN: Type inference failed for: r40v26 */
    /* JADX WARN: Type inference failed for: r40v27 */
    /* JADX WARN: Type inference failed for: r40v28 */
    /* JADX WARN: Type inference failed for: r40v29 */
    /* JADX WARN: Type inference failed for: r40v3 */
    /* JADX WARN: Type inference failed for: r40v30 */
    /* JADX WARN: Type inference failed for: r40v31 */
    /* JADX WARN: Type inference failed for: r40v32 */
    /* JADX WARN: Type inference failed for: r40v33 */
    /* JADX WARN: Type inference failed for: r40v34 */
    /* JADX WARN: Type inference failed for: r40v35 */
    /* JADX WARN: Type inference failed for: r40v36 */
    /* JADX WARN: Type inference failed for: r40v37 */
    /* JADX WARN: Type inference failed for: r40v38 */
    /* JADX WARN: Type inference failed for: r40v8 */
    /* JADX WARN: Type inference failed for: r40v9 */
    /* JADX WARN: Type inference failed for: r5v44, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v96, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v45, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v64 */
    /* JADX WARN: Type inference failed for: r7v65 */
    /* JADX WARN: Type inference failed for: r7v66 */
    /* JADX WARN: Type inference failed for: r7v67 */
    /* JADX WARN: Type inference failed for: r8v153, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v154 */
    /* JADX WARN: Type inference failed for: r8v155 */
    /* JADX WARN: Type inference failed for: r8v156 */
    /* JADX WARN: Type inference failed for: r8v157 */
    /* JADX WARN: Type inference failed for: r8v160 */
    /* JADX WARN: Type inference failed for: r8v161 */
    /* JADX WARN: Type inference failed for: r8v425 */
    /* JADX WARN: Type inference failed for: r8v426 */
    /* JADX WARN: Type inference failed for: r8v70, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v107 */
    /* JADX WARN: Type inference failed for: r9v108 */
    /* JADX WARN: Type inference failed for: r9v109 */
    /* JADX WARN: Type inference failed for: r9v110 */
    /* JADX WARN: Type inference failed for: r9v128, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v166, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v256, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v257, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v258 */
    /* JADX WARN: Type inference failed for: r9v259 */
    /* JADX WARN: Type inference failed for: r9v262 */
    /* JADX WARN: Type inference failed for: r9v263 */
    /* JADX WARN: Type inference failed for: r9v264 */
    /* JADX WARN: Type inference failed for: r9v266, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v267 */
    /* JADX WARN: Type inference failed for: r9v268 */
    /* JADX WARN: Type inference failed for: r9v269 */
    /* JADX WARN: Type inference failed for: r9v270 */
    /* JADX WARN: Type inference failed for: r9v271 */
    /* JADX WARN: Type inference failed for: r9v273 */
    /* JADX WARN: Type inference failed for: r9v274 */
    /* JADX WARN: Type inference failed for: r9v415 */
    /* JADX WARN: Type inference failed for: r9v416 */
    /* JADX WARN: Type inference failed for: r9v417 */
    /* JADX WARN: Type inference failed for: r9v418 */
    /* JADX WARN: Type inference failed for: r9v419 */
    /* JADX WARN: Type inference failed for: r9v420 */
    /* JADX WARN: Type inference failed for: r9v421 */
    /* JADX WARN: Type inference failed for: r9v422 */
    /* JADX WARN: Type inference failed for: r9v423 */
    /* JADX WARN: Type inference failed for: r9v424 */
    /* JADX WARN: Type inference failed for: r9v425 */
    /* JADX WARN: Type inference failed for: r9v426 */
    /* JADX WARN: Type inference failed for: r9v427 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinOtpActivity.attachBaseContext(android.content.Context):void");
    }

    public static String $r8$lambda$K2Xw1fwABzmXD41Ug2sHIwYmris(ChangePinOtpActivity changePinOtpActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 23;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String strOtpType_delegate$lambda$2 = otpType_delegate$lambda$2(changePinOtpActivity);
        int i4 = copy + 57;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return strOtpType_delegate$lambda$2;
    }

    public static void $r8$lambda$g3ODcc16nbpWcM5cWUib1XaOqn0(CommonDialog commonDialog) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 101;
        copy = i2 % 128;
        int i3 = i2 % 2;
        onVerifySmsChanged$lambda$4(commonDialog);
        if (i3 != 0) {
            throw null;
        }
        int i4 = getAsAtTimestamp + 43;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void $r8$lambda$moVGpxfYKkpjBvoktRS_gK3gDFs(CommonDialog commonDialog) {
        int i = 2 % 2;
        int i2 = copy + 15;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        onVerifySmsChanged$lambda$3(commonDialog);
        if (i3 == 0) {
            throw null;
        }
        int i4 = copy + 45;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
    }

    public static String $r8$lambda$yhb97MhvohmR0mLwAf7MwCOC3K4(ChangePinOtpActivity changePinOtpActivity) {
        int i = 2 % 2;
        int i2 = copy + 67;
        getAsAtTimestamp = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            loginType_delegate$lambda$1(changePinOtpActivity);
            throw null;
        }
        String strLoginType_delegate$lambda$1 = loginType_delegate$lambda$1(changePinOtpActivity);
        int i3 = getAsAtTimestamp + 31;
        copy = i3 % 128;
        if (i3 % 2 == 0) {
            return strLoginType_delegate$lambda$1;
        }
        obj.hashCode();
        throw null;
    }

    public static String $r8$lambda$zA90EcX8h9IWUgmArAIGm8i3H9I(ChangePinOtpActivity changePinOtpActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 31;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String strNewToken_delegate$lambda$0 = newToken_delegate$lambda$0(changePinOtpActivity);
        int i4 = copy + 57;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return strNewToken_delegate$lambda$0;
    }

    static {
        component4 = 0;
        ShareDataUIState();
        component1();
        int i = equals + 75;
        component4 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 89;
        copy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = getAsAtTimestamp + 89;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 23 / 0;
        }
    }

    static void component1() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 3;
        copy = i3 % 128;
        int i4 = i3 % 2;
        component1 = new char[]{33452, 33330, 33325, 33294, 33296, 33325, 33328, 33327, 33325, 33332, 33296, 33298, 33333, 33331, 33331, 33325, 33329, 33333, 33325, 33331, 33326, 33320, 33330, 33330, 33322, 33290, 33299, 33330, 33325, 33323, 33319, 33322, 33330, 33328, 33291, 33291, 33328, 33330, 33325, 33322, 33327, 33335, 33330, 33325, 33329, 33332, 33331, 33297, 33379, 33297};
        int i5 = i2 + 39;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 22 / 0;
        }
    }

    static void ShareDataUIState() {
        component2 = new char[]{3095, 57582, 54782, 51942, 49089, 44241, 33238, 30434, 27561, 22691, 19908, 8884, 6028, 1127, 63841, 61049, 50021, 45139, 24169, 45705, 34708, 39066, 60855, 65194, 54202, 9457, 14794, 2780, 8186, 28913, 17889, 22037, 43786, 48137, 37125, 57906, 3095, 57529, 54699, 51954, 49048, 44175, 33233, 30377, 27638, 22707, 19932, 8925, 6087, 1083, 63847, 60970, 50036, 45073, 42255, 39425, 36655, 31851, 20836, 17929, 15186, 10312, 7404, 61872, 59132, 56265, 51396, 48602, 37587, 34721, 29930, 27109, 24284, 13249, 8337, 5485, 2608, 65316, 60442, 49425, 46602, 43903, 39030, 36158, 3140, 57572, 54697, 51877, 49054, 44172, 33233, 30383, 27636, 22710, 19931, 8912, 6087, 1086, 63841, 61055, 49957, 45072, 42242, 39510, 36734, 31806, 20834, 18015, 15198, 10259, 7406, 61879, 59048, 56208, 51348, 48606, 37510, 34808, 29881, 27062, 24203, 13212, 8387, 5487, 2661, 65320, 60435, 49429, 46680, 43901, 39031, 36205, 25138, 22354, 17435, 14614, 11705, 672, 63476, 58516, 55696, 52867, 41971, 37116, 34285, 31441, 28628, 23749, 36738, 25378, 22118, 18740, 15451, 12106, 580, 62781, 59444, 56183, 52813, 41286, 37901, 34812, 31475, 28090, 16567, 13191, 9931, 6597, 3256, 65451, 53934, 50590, 47254, 43984, 40824, 29299, 25918, 22623, 19285, 15902, 4418, 1074, 63357, 59936, 56603, 45144, 41742, 38573, 35317, 31970, 28631, 17111, 13770, 10421, 7092, 3835, 57763, 54419, 51165, 47753, 44667, 33132, 29798, 26378, 23043, 19729, 8246, 4914, 1580, 63768, 60435, 57179, 24461, 45870, 34404, 39229, 60421, 65300, 53839, 9573, 14452, 2943, 7749, 28995, 17489, 22458, 43689, 48566, 37052, 58249, 63112, 51658, 56549, 12279, 687, 5598, 26831, 31626, 20257, 41598, 46393, 34819, 39684, 60949, 49480, 54379, 10098, 14971, 6025, 64377, 52840, 53611, 42076, 46917, 39502, 27957, 28724, 17197, 22033, 13934, 55966, 61314, 61578, 34238, 38569, 48045, 19676, 20958, 25281, 30711, 3151, 57527, 54783, 51957, 49053, 44249, 33156, 30377, 27557, 22753, 19922, 8915, 6088, 1133, 63846, 61048, 49955, 45075, 42242, 39425, 36728, 31848, 20838, 17933, 15199, 10305, 7400, 61876, 59055, 56269, 51344, 48526, 37519, 34803, 29922, 27117, 24281, 13260, 8394, 5436, 2613, 65313, 60492, 49424, 46602, 43901, 39030, 36159, 25185, 22273, 17439, 14668, 11705, 761, 63473, 58525, 55744, 52950, 41976, 37105, 34280, 31370, 28550, 23754, 17506, 43155, 40334, 33414, 63408, 58536, 51622, 16083, 9170, 4289, 1525};
        component3 = -4323994134881574784L;
        copydefault = -3780477796495014671L;
        ShareDataUIState = 1386857713;
        getRequestBeneficiariesState = (char) 2307;
    }
}
