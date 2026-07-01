package com.huawei.digitalpayment.consumer.basic.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.blankj.utilcode.constant.CacheConstants;
import com.blankj.utilcode.util.ColorUtils;
import com.huawei.arouter.RouteUtils;
import com.huawei.biometric.BiometricUtil;
import com.huawei.biometric.LocalAuthenticationUtils;
import com.huawei.biometric.service.IBiometricService;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.ToastUtils;
import com.huawei.common.widget.SwitchView;
import com.huawei.common.widget.dialog.DialogManager;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.toast.CommonToast;
import com.huawei.digitalpayment.consumer.baselib.util.IdentityPinUtils;
import com.huawei.digitalpayment.consumer.basic.R;
import com.huawei.digitalpayment.consumer.basic.databinding.ActivityLoginSettingBinding;
import com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginOperator;
import com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginSettingUiState;
import com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginSettingViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.cancel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0006\u0010\u000f\u001a\u00020\tJ\u0012\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\tH\u0002J\b\u0010\u0014\u001a\u00020\tH\u0014J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basic/ui/activity/LoginSettingActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcPaymentBaseActivity;", "Lcom/huawei/digitalpayment/consumer/basic/databinding/ActivityLoginSettingBinding;", "Lcom/huawei/digitalpayment/consumer/basicUi/viewmodel/LoginSettingViewModel;", "<init>", "()V", "getLayoutId", "", "initToolbar", "", "title", "", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "identifyPin", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "observe", "onResume", "updateUi", "data", "Lcom/huawei/digitalpayment/consumer/basicUi/viewmodel/LoginSettingUiState;", "ConsumerBasicUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class LoginSettingActivity extends Hilt_LoginSettingActivity<ActivityLoginSettingBinding, LoginSettingViewModel> {
    public static final int $stable = 8;
    private static int ArtificialStackFrames;
    private static char[] ShareDataUIState;
    private static char component1;
    private static char component2;
    private static char component3;
    private static boolean component4;
    private static boolean copy;
    private static char copydefault;
    private static int getRequestBeneficiariesState;
    private ActivityResultLauncher<Intent> launcher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        @Override
        public final void onActivityResult(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 17;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            LoginSettingActivity.m10277$r8$lambda$cNqXPsjWpY073w9hCn3pf0bX3U(this.f$0, (ActivityResult) obj);
            int i4 = ShareDataUIState + 33;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
    });
    private static final byte[] $$d = {65, -53, 110, -39};
    private static final int $$e = 147;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getSponsorBeneficiariesState = 0;
    private static int getAsAtTimestamp = 0;
    private static int equals = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$f(short r7, short r8, byte r9) {
        /*
            int r7 = 111 - r7
            int r8 = r8 * 2
            int r8 = r8 + 1
            int r9 = r9 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity.$$d
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r7 = r9
            r5 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            int r9 = r9 + 1
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r6
        L28:
            int r3 = -r3
            int r9 = r9 + r3
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity.$$f(short, short, byte):java.lang.String");
    }

    public static final ViewModel access$getViewModel$p(LoginSettingActivity loginSettingActivity) {
        int i = 2 % 2;
        int i2 = equals + 31;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        VM vm = loginSettingActivity.viewModel;
        int i4 = equals + 121;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            return vm;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$updateUi(LoginSettingActivity loginSettingActivity, LoginSettingUiState loginSettingUiState) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 123;
        equals = i2 % 128;
        int i3 = i2 % 2;
        loginSettingActivity.updateUi(loginSettingUiState);
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
        int i5 = getAsAtTimestamp + 105;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 48 / 0;
        }
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 65;
        equals = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_login_setting;
        if (i3 != 0) {
            return i4;
        }
        throw null;
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 57;
        equals = i2 % 128;
        int i3 = i2 % 2;
        String string = getString(R.string.biometric_setting_title1);
        if (i3 != 0) {
            super.initToolbar(string);
        } else {
            super.initToolbar(string);
            int i4 = 80 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f A[PHI: r2
  0x003f: PHI (r2v7 android.content.Intent) = (r2v6 android.content.Intent), (r2v17 android.content.Intent) binds: [B:12:0x003d, B:9:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void launcher$lambda$0(com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity r5, androidx.activity.result.ActivityResult r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity.equals
            int r1 = r1 + 105
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity.getAsAtTimestamp = r2
            int r1 = r1 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            int r2 = r6.getResultCode()
            r3 = -1
            if (r2 != r3) goto L74
            android.content.Intent r2 = r6.getData()
            if (r2 == 0) goto L74
            int r2 = com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity.getAsAtTimestamp
            int r2 = r2 + 47
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity.equals = r3
            int r2 = r2 % r0
            java.lang.String r3 = "encryptPin2"
            if (r2 != 0) goto L39
            android.content.Intent r2 = r6.getData()
            r4 = 36
            int r4 = r4 / 0
            if (r2 == 0) goto L44
            goto L3f
        L39:
            android.content.Intent r2 = r6.getData()
            if (r2 == 0) goto L44
        L3f:
            java.lang.String r2 = r2.getStringExtra(r3)
            goto L45
        L44:
            r2 = 0
        L45:
            if (r2 == 0) goto L74
            int r2 = com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity.equals
            int r2 = r2 + 47
            int r4 = r2 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity.getAsAtTimestamp = r4
            int r2 = r2 % r0
            android.content.Intent r6 = r6.getData()
            if (r6 == 0) goto L67
            int r2 = com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity.getAsAtTimestamp
            int r2 = r2 + 5
            int r4 = r2 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity.equals = r4
            int r2 = r2 % r0
            java.lang.String r6 = r6.getStringExtra(r3)
            if (r6 != 0) goto L66
            goto L67
        L66:
            r1 = r6
        L67:
            VM extends androidx.lifecycle.ViewModel r5 = r5.viewModel
            com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginSettingViewModel r5 = (com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginSettingViewModel) r5
            com.huawei.baselibs2.utils.encrypt.EncryptManager r6 = com.huawei.baselibs2.utils.encrypt.EncryptManager.INSTANCE
            java.lang.String r6 = r6.decrypt(r1)
            r5.dispatcherOperator(r6)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity.launcher$lambda$0(com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity, androidx.activity.result.ActivityResult):void");
    }

    public final void identifyPin() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 99;
        equals = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ActivityResultLauncher<Intent> activityResultLauncher = this.launcher;
            Intent identityPinIntent = IdentityPinUtils.getIdentityPinIntent();
            Intrinsics.checkNotNullExpressionValue(identityPinIntent, "");
            activityResultLauncher.launch(identityPinIntent);
            obj.hashCode();
            throw null;
        }
        ActivityResultLauncher<Intent> activityResultLauncher2 = this.launcher;
        Intent identityPinIntent2 = IdentityPinUtils.getIdentityPinIntent();
        Intrinsics.checkNotNullExpressionValue(identityPinIntent2, "");
        activityResultLauncher2.launch(identityPinIntent2);
        int i3 = getAsAtTimestamp + 121;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity$observe$1", f = "LoginSettingActivity.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int copydefault;
        int component1;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity$observe$1$1", f = "LoginSettingActivity.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;
            int component1;
            final LoginSettingActivity component2;

            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "data", "Lcom/huawei/digitalpayment/consumer/basicUi/viewmodel/LoginSettingUiState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity$observe$1$1$1", f = "LoginSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class C02095 extends SuspendLambda implements Function2<LoginSettingUiState, Continuation<? super Unit>, Object> {
                private static int ShareDataUIState = 1;
                private static int component1;
                final LoginSettingActivity component2;
                Object component3;
                int copydefault;

                @Override
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = component1 + 49;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.copydefault != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    LoginSettingActivity.access$updateUi(this.component2, (LoginSettingUiState) this.component3);
                    Unit unit = Unit.INSTANCE;
                    int i4 = ShareDataUIState + 75;
                    component1 = i4 % 128;
                    int i5 = i4 % 2;
                    return unit;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C02095(LoginSettingActivity loginSettingActivity, Continuation<? super C02095> continuation) {
                    super(2, continuation);
                    this.component2 = loginSettingActivity;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    C02095 c02095 = new C02095(this.component2, continuation);
                    c02095.component3 = obj;
                    C02095 c020952 = c02095;
                    int i2 = ShareDataUIState + 43;
                    component1 = i2 % 128;
                    if (i2 % 2 == 0) {
                        return c020952;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }

                public final Object component2(LoginSettingUiState loginSettingUiState, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 119;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = ((C02095) create(loginSettingUiState, continuation)).invokeSuspend(Unit.INSTANCE);
                    int i4 = ShareDataUIState + 63;
                    component1 = i4 % 128;
                    int i5 = i4 % 2;
                    return objInvokeSuspend;
                }

                @Override
                public Object invoke(LoginSettingUiState loginSettingUiState, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component1 + 9;
                    ShareDataUIState = i2 % 128;
                    LoginSettingUiState loginSettingUiState2 = loginSettingUiState;
                    Continuation<? super Unit> continuation2 = continuation;
                    if (i2 % 2 != 0) {
                        return component2(loginSettingUiState2, continuation2);
                    }
                    component2(loginSettingUiState2, continuation2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[PHI: r1
  0x0032: PHI (r1v5 java.lang.Object) = (r1v4 java.lang.Object), (r1v6 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r3
  0x0024: PHI (r3v1 int) = (r3v0 int), (r3v6 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
            @Override
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity.copydefault.AnonymousClass5.component3
                    int r1 = r1 + 89
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity.copydefault.AnonymousClass5.ShareDataUIState = r2
                    int r1 = r1 % r0
                    r2 = 1
                    if (r1 == 0) goto L1c
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r3 = r6.component1
                    r4 = 49
                    int r4 = r4 / 0
                    if (r3 == 0) goto L32
                    goto L24
                L1c:
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r3 = r6.component1
                    if (r3 == 0) goto L32
                L24:
                    if (r3 != r2) goto L2a
                    kotlin.ResultKt.throwOnFailure(r7)
                    goto L69
                L2a:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L32:
                    kotlin.ResultKt.throwOnFailure(r7)
                    com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity r7 = r6.component2
                    androidx.lifecycle.ViewModel r7 = com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity.access$getViewModel$p(r7)
                    com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginSettingViewModel r7 = (com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginSettingViewModel) r7
                    kotlinx.coroutines.flow.StateFlow r7 = r7.uiState()
                    kotlinx.coroutines.flow.Flow r7 = (kotlinx.coroutines.flow.Flow) r7
                    com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity$copydefault$5$5 r3 = new com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity$copydefault$5$5
                    com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity r4 = r6.component2
                    r5 = 0
                    r3.<init>(r4, r5)
                    kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
                    kotlinx.coroutines.flow.Flow r7 = kotlinx.coroutines.flow.FlowKt.onEach(r7, r3)
                    r3 = r6
                    kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                    r6.component1 = r2
                    java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.collect(r7, r3)
                    if (r7 != r1) goto L69
                    int r7 = com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity.copydefault.AnonymousClass5.component3
                    int r7 = r7 + 15
                    int r2 = r7 % 128
                    com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity.copydefault.AnonymousClass5.ShareDataUIState = r2
                    int r7 = r7 % r0
                    if (r7 != 0) goto L68
                    return r1
                L68:
                    throw r5
                L69:
                    kotlin.Unit r7 = kotlin.Unit.INSTANCE
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity.copydefault.AnonymousClass5.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(LoginSettingActivity loginSettingActivity, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.component2 = loginSettingActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.component2, continuation);
                int i2 = component3 + 81;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    return anonymousClass5;
                }
                throw null;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 25;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Object objCopydefault = copydefault(coroutineScope, continuation);
                int i4 = component3 + 45;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return objCopydefault;
            }

            public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 1;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = component3 + 45;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    return objInvokeSuspend;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component1;
            if (i2 != 0) {
                int i3 = copydefault + 19;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.component1 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(LoginSettingActivity.this, Lifecycle.State.STARTED, new AnonymousClass5(LoginSettingActivity.this, null), this) == coroutine_suspended) {
                    int i4 = ShareDataUIState + 1;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        copydefault(Continuation<? super copydefault> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = LoginSettingActivity.this.new copydefault(continuation);
            int i2 = ShareDataUIState + 31;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return copydefaultVar;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 11;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objShareDataUIState = ShareDataUIState(coroutineScope, continuation);
            int i4 = ShareDataUIState + 13;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return objShareDataUIState;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 65;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((copydefault) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 40 / 0;
            }
            int i5 = ShareDataUIState + 71;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 11 / 0;
            }
            return objInvokeSuspend;
        }
    }

    private static void d(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        int i3 = $11 + 1;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i5 = $11 + 49;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i7 = $10 + 95;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 58224;
            for (int i10 = 0; i10 < 16; i10++) {
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i9) ^ ((c3 << 4) + ((char) (((long) component1) ^ 4374495167426960553L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(component2)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(844 - Color.red(0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 32, (char) ((Process.myPid() >> 22) + 23251), 592652048, false, $$f(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (((long) copydefault) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component3)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(844 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 32, (char) (23251 - KeyEvent.getDeadChar(0, 0)), 592652048, false, $$f(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i9 -= 40503;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[iNotificationSideChannelDefault.component3] = cArr3[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr3[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(465 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 49, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void e(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        char[] cArr2;
        int i3 = 2;
        int i4 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr3 = ShareDataUIState;
        int i5 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i6 = $11 + 81;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 79;
                $10 = i9 % 128;
                int i10 = i9 % i3;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i5] = Integer.valueOf(cArr3[i8]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i5;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3760, 24 - Drawable.resolveOpacity(i5, i5), (char) KeyEvent.normalizeMetaState(i5), -1670574543, false, $$f((byte) 43, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr4[i8] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i8++;
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
            cArr3 = cArr4;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(getRequestBeneficiariesState)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 7139, 13 - TextUtils.getOffsetBefore("", 0), (char) KeyEvent.keyCodeFromString(""), 1487437377, false, "C", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
            int i11 = 38;
            long j = 0;
            if (component4) {
                cancelVar.component1 = bArr.length;
                char[] cArr5 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                int i12 = $10 + 115;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr5[cancelVar.component3] = (char) (cArr3[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                    Object[] objArr4 = {cancelVar, cancelVar};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault3 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0) + 2749, 20 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)), (char) (7644 - TextUtils.indexOf("", "")), -327556343, false, $$f((byte) i11, b3, (byte) (b3 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                    i11 = 38;
                    j = 0;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            if (copy) {
                int i14 = $11 + 97;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    cancelVar.component1 = cArr.length;
                    cArr2 = new char[cancelVar.component1];
                    i2 = 0;
                } else {
                    i2 = 0;
                    cancelVar.component1 = cArr.length;
                    cArr2 = new char[cancelVar.component1];
                }
                cancelVar.component3 = i2;
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr2[cancelVar.component3] = (char) (cArr3[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    Object[] objArr5 = {cancelVar, cancelVar};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault4 == null) {
                        byte b4 = (byte) 0;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2748 - View.getDefaultSize(0, 0), 20 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 7643), -327556343, false, $$f((byte) 38, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr2);
                return;
            }
            int i15 = 0;
            cancelVar.component1 = iArr.length;
            char[] cArr6 = new char[cancelVar.component1];
            while (true) {
                cancelVar.component3 = i15;
                if (cancelVar.component3 >= cancelVar.component1) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[cancelVar.component3] = (char) (cArr3[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    i15 = cancelVar.component3 + 1;
                }
            }
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 87;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        d(Process.getGidForName("") + 19, new char[]{12376, 49118, 36380, 60113, 48325, 41435, 27267, 15246, 59527, 13793, 44648, 22748, 46727, 15992, 1994, 58004, 1419, 54544}, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        Object obj = null;
        e((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, new byte[]{-123, -124, -125, -126, -127}, null, null, objArr2);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i4 = getAsAtTimestamp + 117;
                equals = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr3 = new Object[1];
                d(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952715_res_0x7f13044b).substring(6, 7).codePointAt(0) - 6, new char[]{12376, 49118, 36380, 60113, 48325, 41435, 27267, 15246, 38616, 5, 10324, 53604, 1026, 12765, 16418, 6586, 43521, 50372, 7740, 46360, 12295, 52456, 16464, 25395, 64704, 2100}, objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                d(TextUtils.indexOf("", "", 0, 0) + 18, new char[]{41560, 16310, 28266, 57054, 46533, 43467, 61329, 58185, 62364, 8675, 45905, 1856, 34125, 35147, 16418, 6586, 38227, 31020}, objArr4);
                baseContext = (Context) cls2.getMethod((String) objArr4[0], new Class[0]).invoke(null, null);
                int i6 = equals + 89;
                getAsAtTimestamp = i6 % 128;
                int i7 = i6 % 2;
            }
            if (baseContext != null) {
                int i8 = getAsAtTimestamp + 41;
                equals = i8 % 128;
                if (i8 % 2 == 0) {
                    boolean z = baseContext instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
                if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                    baseContext = null;
                } else {
                    baseContext = baseContext.getApplicationContext();
                    int i9 = getAsAtTimestamp + 43;
                    equals = i9 % 128;
                    int i10 = i9 % 2;
                }
            }
            if (baseContext != null) {
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6617, TextUtils.lastIndexOf("", '0', 0, 0) + 43, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr5 = new Object[1];
                    d(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 19, new char[]{46929, 15963, 3256, 12538, 7088, 5926, 1994, 58004, 17363, 30072, 6154, 36611, 9131, 5817, 54338, 22398, 60048, 7678, 35910, 632, 10191, 58889, 36650, 25369, 21298, 6927, 63449, 5574, 27025, 20285, 5853, 20608, 57789, 6566, 11332, 39475, 31041, 13269, 34125, 35147, 36776, 29800, 63877, 39279, 25420, 1879, 2391, 11012}, objArr5);
                    String str = (String) objArr5[0];
                    Object[] objArr6 = new Object[1];
                    e(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 98, new byte[]{-115, -114, -115, -121, -113, -115, -121, -114, -113, -116, -113, -108, -112, -109, -122, -123, -120, -110, -110, -116, -120, -115, -113, -117, -117, -120, -123, -111, -112, -117, -113, -119, -112, -114, -113, -114, -121, -123, -117, -113, -121, -119, -116, -119, -112, -113, -119, -121, -117, -117, -114, -115, -118, -120, -116, -122, -117, -117, -118, -119, -120, -121, -123, -122}, null, null, objArr6);
                    String str2 = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    d(64 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), new char[]{51004, 29133, 11901, 60999, 44554, 362, 62788, 55542, 4542, 1605, 54436, 56189, 55153, 38011, 23017, 19676, 30561, 32889, 35910, 632, 25184, 38848, 23695, 10817, 8759, 7484, 60183, 61327, 47702, 4843, 32285, 6809, 57453, 43942, 5826, 60038, 15677, 14641, 63751, 11843, 29611, 31177, 11584, 20951, 23971, 16757, 39068, 'c', 46573, 45545, 62307, 44337, 20957, 55012, 57283, 1291, 56091, 40772, 5124, 49357, 36776, 29800, 41123, 8328}, objArr7);
                    String str3 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    d(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952781_res_0x7f13048d).substring(14, 15).length() + 71, new char[]{13341, 3455, 61944, 55010, 8719, 58549, 43868, 11282, 30967, 62786, 19881, 29797, 32285, 6809, 12678, 65132, 44554, 362, 37222, 16787, 25420, 1879, 63016, 39084, 53376, 3076, 10960, 51538, 57789, 6566, 45741, 57377, 13110, 52581, 49216, 4703, 19892, 54379, 61131, 31124, 57228, 25096, 3995, 44674, 61131, 31124, 53160, 1313, 21409, 39752, 52614, 27919, 38616, 5, 32079, 6145, 21248, 34147, 13061, 41720, 32916, 1063, 44657, 17633, 18431, 22095, 25124, 56323, 46533, 43467, 16795, 29666}, objArr8);
                    String str4 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    e(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952715_res_0x7f13044b).substring(6, 7).length() + 126, new byte[]{-121, -107, -118, -120, -107, -115}, null, null, objArr9);
                    String str5 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    d(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952792_res_0x7f130498).substring(2, 3).codePointAt(0) + 4, new char[]{42188, 9956, 39002, 12797, 48165, 21427, 992, 65340, 31741, 17357, 17381, 48091, 14397, 45359, 12678, 65132, 23280, 58419, 17151, 40642, 6836, 29320, 38053, 7022, 36650, 25369, 49480, 25958, 6519, 34965, 40820, 1377, 12799, 5478, 55153, 38011}, objArr10);
                    Object[] objArr11 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr10[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getFadingEdgeLength() >> 16) + 6562, 56 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((-16777216) - Color.rgb(0, 0, 0)), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr11);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        super.onCreate(savedInstanceState);
        getWindow().setBackgroundDrawable(new ColorDrawable(ColorUtils.getColor(R.color.colorBackgroundFloating)));
        ((ActivityLoginSettingBinding) this.binding).cbFaceLogin.setOnSwitchesClickListener(new SwitchView.OnSwitchesClickListener() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public void onSwitches(boolean on) {
                int i11 = 2 % 2;
                int i12 = component2 + 23;
                component1 = i12 % 128;
                int i13 = i12 % 2;
                if (LocalAuthenticationUtils.isEnrolled()) {
                    ((LoginSettingViewModel) LoginSettingActivity.access$getViewModel$p(LoginSettingActivity.this)).setOperator(!on ? LoginOperator.CLOSE_FACE_ID_LOGIN : LoginOperator.OPEN_FACE_ID_LOGIN);
                    LoginSettingActivity.this.identifyPin();
                    return;
                }
                int i14 = component1 + 45;
                component2 = i14 % 128;
                if (i14 % 2 == 0) {
                    BiometricUtil.jumpSystemBiometricSetting(true);
                } else {
                    BiometricUtil.jumpSystemBiometricSetting(false);
                }
            }
        });
        ((ActivityLoginSettingBinding) this.binding).cbFingerprintLogin.setOnSwitchesClickListener(new SwitchView.OnSwitchesClickListener() {
            private static int component1 = 0;
            private static int component3 = 1;

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
            
                if (r4 != false) goto L12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
            
                r4 = com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity.AnonymousClass2.component3 + 55;
                com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity.AnonymousClass2.component1 = r4 % 128;
                r4 = r4 % 2;
                r4 = com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginOperator.CLOSE_FINGERPRINT_LOGIN;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
            
                r4 = com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginOperator.OPEN_FINGERPRINT_LOGIN;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
            
                r1.setOperator(r4);
                r3.copydefault.identifyPin();
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
            
                com.huawei.biometric.BiometricUtil.jumpSystemBiometricSetting(true);
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
            
                if (com.huawei.biometric.BiometricUtil.isEnrolledBiometric() == false) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
            
                if (com.huawei.biometric.BiometricUtil.isEnrolledBiometric() != false) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
            
                r1 = (com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginSettingViewModel) com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity.access$getViewModel$p(r3.copydefault);
             */
            @Override
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onSwitches(boolean r4) {
                /*
                    r3 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity.AnonymousClass2.component1
                    int r1 = r1 + 3
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity.AnonymousClass2.component3 = r2
                    int r1 = r1 % r0
                    if (r1 != 0) goto L19
                    boolean r1 = com.huawei.biometric.BiometricUtil.isEnrolledBiometric()
                    r2 = 9
                    int r2 = r2 / 0
                    if (r1 != 0) goto L1f
                    goto L40
                L19:
                    boolean r1 = com.huawei.biometric.BiometricUtil.isEnrolledBiometric()
                    if (r1 == 0) goto L40
                L1f:
                    com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity.this
                    androidx.lifecycle.ViewModel r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity.access$getViewModel$p(r1)
                    com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginSettingViewModel r1 = (com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginSettingViewModel) r1
                    if (r4 != 0) goto L35
                    int r4 = com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity.AnonymousClass2.component3
                    int r4 = r4 + 55
                    int r2 = r4 % 128
                    com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity.AnonymousClass2.component1 = r2
                    int r4 = r4 % r0
                    com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginOperator r4 = com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginOperator.CLOSE_FINGERPRINT_LOGIN
                    goto L37
                L35:
                    com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginOperator r4 = com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginOperator.OPEN_FINGERPRINT_LOGIN
                L37:
                    r1.setOperator(r4)
                    com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity r4 = com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity.this
                    r4.identifyPin()
                    return
                L40:
                    r4 = 1
                    com.huawei.biometric.BiometricUtil.jumpSystemBiometricSetting(r4)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity.AnonymousClass2.onSwitches(boolean):void");
            }
        });
        observe();
    }

    private final void observe() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new copydefault(null), 3, null);
        int i2 = equals + 83;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = equals + 85;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            d(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 3, new char[]{12376, 49118, 36380, 60113, 48325, 41435, 27267, 15246, 38616, 5, 10324, 53604, 1026, 12765, 16418, 6586, 43521, 50372, 7740, 46360, 12295, 52456, 16464, 25395, 64704, 2100}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            d(18 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{41560, 16310, 28266, 57054, 46533, 43467, 61329, 58185, 62364, 8675, 45905, 1856, 34125, 35147, 16418, 6586, 38227, 31020}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i4 = getAsAtTimestamp + 7;
            equals = i4 % 128;
            int i5 = i4 % 2;
        }
        if (baseContext != null) {
            int i6 = getAsAtTimestamp + 69;
            equals = i6 % 128;
            if (i6 % 2 == 0) {
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
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 43, (char) Gravity.getAbsoluteGravity(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(((byte) KeyEvent.getModifierMetaStateMask()) + 6563, 56 - ExpandableListView.getPackedPositionGroup(0L), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), -699576857, false, "component2", new Class[]{Context.class});
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
        ((LoginSettingViewModel) this.viewModel).refresh();
        ((IBiometricService) RouteUtils.getService(IBiometricService.class)).checkBiometricChange(this, new ApiCallback<Boolean>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(Boolean bool) {
                int i7 = 2 % 2;
                int i8 = component1 + 59;
                component3 = i8 % 128;
                int i9 = i8 % 2;
                onSuccess(bool.booleanValue());
                if (i9 == 0) {
                    int i10 = 91 / 0;
                }
            }

            public void onSuccess(boolean changed) {
                int i7 = 2 % 2;
                int i8 = component1 + 15;
                component3 = i8 % 128;
                int i9 = i8 % 2;
                super.onSuccess(Boolean.valueOf(changed));
                if (!changed) {
                    return;
                }
                int i10 = component3 + 47;
                component1 = i10 % 128;
                if (i10 % 2 == 0) {
                    ((LoginSettingViewModel) LoginSettingActivity.access$getViewModel$p(LoginSettingActivity.this)).refresh();
                    return;
                }
                ((LoginSettingViewModel) LoginSettingActivity.access$getViewModel$p(LoginSettingActivity.this)).refresh();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
    }

    private final void updateUi(LoginSettingUiState data) {
        int i;
        int i2;
        int i3 = 2 % 2;
        if (data.getLoading()) {
            DialogManager.showLoading(this);
        } else {
            DialogManager.hideLoading(this);
        }
        int i4 = 0;
        if (data.getException() != null) {
            BaseException exception = data.getException();
            if (exception == null || exception.getCode() != 10) {
                BaseException exception2 = data.getException();
                ToastUtils.showLong(exception2 != null ? exception2.getMessage() : null, new Object[0]);
            }
            ((LoginSettingViewModel) this.viewModel).cleanException();
        }
        if (data.getShowFaceId()) {
            int i5 = getAsAtTimestamp + 69;
            equals = i5 % 128;
            int i6 = i5 % 2;
            ((ActivityLoginSettingBinding) this.binding).tvFingerprintLogin.setText(getString(R.string.biometric_setting_title3));
            int i7 = getAsAtTimestamp + 75;
            equals = i7 % 128;
            int i8 = i7 % 2;
        } else {
            ((ActivityLoginSettingBinding) this.binding).tvFingerprintLogin.setText(getString(R.string.biometric_setting_title13));
        }
        RoundConstraintLayout roundConstraintLayout = ((ActivityLoginSettingBinding) this.binding).clFaceLogin;
        if (data.getShowFaceId()) {
            int i9 = equals + 9;
            getAsAtTimestamp = i9 % 128;
            i = i9 % 2 != 0 ? 1 : 0;
        } else {
            i = 8;
        }
        roundConstraintLayout.setVisibility(i);
        View view = ((ActivityLoginSettingBinding) this.binding).lineFaceLogin;
        if (data.getShowFaceId()) {
            int i10 = getAsAtTimestamp + 33;
            equals = i10 % 128;
            int i11 = i10 % 2;
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
        RoundConstraintLayout roundConstraintLayout2 = ((ActivityLoginSettingBinding) this.binding).clFingerprintLogin;
        if (data.getShowFingerprint()) {
            int i12 = getAsAtTimestamp + 93;
            equals = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        } else {
            i4 = 8;
        }
        roundConstraintLayout2.setVisibility(i4);
        ((ActivityLoginSettingBinding) this.binding).cbFaceLogin.setSwitchesOn(data.isOpenFaceId());
        ((ActivityLoginSettingBinding) this.binding).cbFingerprintLogin.setSwitchesOn(data.isOpenFingerprint());
        if (data.isSuccess()) {
            CommonToast.show(getString(R.string.biometric_setting_tips1), R.mipmap.base_icon_complete);
            ((LoginSettingViewModel) this.viewModel).cleanSuccessState();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c3  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bd  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.LoginSettingActivity.attachBaseContext(android.content.Context):void");
    }

    public static void m10277$r8$lambda$cNqXPsjWpY073w9hCn3pf0bX3U(LoginSettingActivity loginSettingActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = equals + 113;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        launcher$lambda$0(loginSettingActivity, activityResult);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        ArtificialStackFrames = 1;
        component3();
        int i = getSponsorBeneficiariesState + 73;
        ArtificialStackFrames = i % 128;
        int i2 = i % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = equals + 45;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 64 / 0;
        }
        int i5 = getAsAtTimestamp + 53;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static void component3() {
        copydefault = (char) 15897;
        component3 = (char) 2168;
        component1 = (char) 24084;
        component2 = (char) 47162;
        ShareDataUIState = new char[]{30279, 30651, 30303, 30283, 30284, 30210, 30333, 30211, 30208, 30332, 30285, 30286, 30331, 30334, 30328, 30290, 30287, 30335, 30291, 30329, 30214};
        getRequestBeneficiariesState = 321287728;
        copy = true;
        component4 = true;
    }
}
