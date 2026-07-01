package com.huawei.digitalpayment.consumer.sfcqrcode.ui.fragment.scanToPay;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelProvider;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.checkout.constants.PayTradeTypeEnum;
import com.huawei.digitalpayment.consumer.base.resp.DecodeQrCodeResp;
import com.huawei.digitalpayment.consumer.base.util.ContextExtensions;
import com.huawei.digitalpayment.consumer.sfcqrcode.R;
import com.huawei.digitalpayment.consumer.sfcqrcode.ui.fragment.scanToPay.SfcScanToPayFragment;
import com.huawei.digitalpayment.consumer.sfcqrcode.ui.viewmodel.QrCodeViewModel;
import com.huawei.digitalpayment.consumer.sfcqrcode.ui.viewmodel.ScanQrCodeViewModel;
import com.huawei.digitalpayment.consumer.sfcqrcode.ui.viewmodel.ScanToPayEffect;
import com.safaricom.aipay.scantopay.sdk.core.data.QrCodeResult;
import com.safaricom.aipay.scantopay.sdk.core.data.ScanResult;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import com.safaricom.sharedui.compose.activity.TransactionErrorActivity;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0002J\u0012\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcqrcode/ui/fragment/scanToPay/SfcScanToPayFragment;", "Lcom/safaricom/sharedui/compose/fragment/SfcComposeFragment;", "<init>", "()V", "scanQrCodeViewModel", "Lcom/huawei/digitalpayment/consumer/sfcqrcode/ui/viewmodel/ScanQrCodeViewModel;", "qrCodeViewModel", "Lcom/huawei/digitalpayment/consumer/sfcqrcode/ui/viewmodel/QrCodeViewModel;", "sharedImageUri", "Landroid/net/Uri;", "errorResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "processScanError", "processQrCodeResult", "qrCodeString", "", "handleBackAction", "Companion", "ConsumerSfcQrCodeUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class SfcScanToPayFragment extends Hilt_SfcScanToPayFragment {
    private static int copy = 1;
    private static int copydefault = 0;
    private static int equals = 0;
    private static int getAsAtTimestamp = 1;
    private final ActivityResultLauncher<Intent> ShareDataUIState;
    private Uri component1;
    private QrCodeViewModel component2;
    private ScanQrCodeViewModel component3;

    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static final ScanQrCodeViewModel access$getScanQrCodeViewModel$p(SfcScanToPayFragment sfcScanToPayFragment) {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        ScanQrCodeViewModel scanQrCodeViewModel = sfcScanToPayFragment.component3;
        if (i3 != 0) {
            return scanQrCodeViewModel;
        }
        throw null;
    }

    public static final Uri access$getSharedImageUri$p(SfcScanToPayFragment sfcScanToPayFragment) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 19;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Uri uri = sfcScanToPayFragment.component1;
        if (i4 != 0) {
            int i5 = 72 / 0;
        }
        int i6 = i3 + 103;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return uri;
    }

    public static final void access$processQrCodeResult(SfcScanToPayFragment sfcScanToPayFragment, String str) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 117;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        sfcScanToPayFragment.component2(str);
        int i4 = getAsAtTimestamp + 75;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void access$processScanError(SfcScanToPayFragment sfcScanToPayFragment) {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        sfcScanToPayFragment.component2();
        int i4 = getAsAtTimestamp + 101;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public SfcScanToPayFragment() {
        Uri uri;
        Bundle arguments = getArguments();
        if (arguments != null) {
            uri = (Uri) arguments.getParcelable("sharedImageUri");
        } else {
            int i = copydefault + 93;
            getAsAtTimestamp = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
            uri = null;
        }
        this.component1 = uri;
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public final void onActivityResult(Object obj) {
                int i4 = 2 % 2;
                int i5 = component3 + 37;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                SfcScanToPayFragment.$r8$lambda$P4HLP7t9kAOJGNZPUoExhlV2xH4(this.f$0, (ActivityResult) obj);
                int i7 = component2 + 33;
                component3 = i7 % 128;
                int i8 = i7 % 2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.ShareDataUIState = activityResultLauncherRegisterForActivityResult;
        int i4 = copydefault + 33;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void component3(SfcScanToPayFragment sfcScanToPayFragment, ActivityResult activityResult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sfcScanToPayFragment, "");
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (activityResult.getResultCode() == 0) {
            sfcScanToPayFragment.requireActivity().finish();
        }
        Object obj = null;
        if (activityResult.getResultCode() == -1) {
            sfcScanToPayFragment.component1 = null;
            int i2 = copydefault + 33;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = copydefault + 5;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcqrcode.ui.fragment.scanToPay.SfcScanToPayFragment$onViewCreated$1", f = "SfcScanToPayFragment.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int component3 = 1;
        int component2;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcqrcode.ui.fragment.scanToPay.SfcScanToPayFragment$onViewCreated$1$1", f = "SfcScanToPayFragment.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component2 = 0;
            private static int component3 = 1;
            int component1;
            final SfcScanToPayFragment copydefault;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = component3 + 19;
                component2 = i2 % 128;
                ScanQrCodeViewModel scanQrCodeViewModel = null;
                if (i2 % 2 != 0) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    scanQrCodeViewModel.hashCode();
                    throw null;
                }
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.component1;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ScanQrCodeViewModel scanQrCodeViewModelAccess$getScanQrCodeViewModel$p = SfcScanToPayFragment.access$getScanQrCodeViewModel$p(this.copydefault);
                    if (scanQrCodeViewModelAccess$getScanQrCodeViewModel$p == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        scanQrCodeViewModel = scanQrCodeViewModelAccess$getScanQrCodeViewModel$p;
                    }
                    SharedFlow<ScanToPayEffect> effect = scanQrCodeViewModel.getEffect();
                    final SfcScanToPayFragment sfcScanToPayFragment = this.copydefault;
                    this.component1 = 1;
                    if (effect.collect(new FlowCollector() {
                        private static int component2 = 1;
                        private static int component3;

                        @Override
                        public Object emit(Object obj2, Continuation continuation) {
                            int i4 = 2 % 2;
                            int i5 = component3 + 5;
                            component2 = i5 % 128;
                            int i6 = i5 % 2;
                            Object objCopydefault = copydefault((ScanToPayEffect) obj2, continuation);
                            if (i6 == 0) {
                                int i7 = 90 / 0;
                            }
                            return objCopydefault;
                        }

                        public final Object copydefault(ScanToPayEffect scanToPayEffect, Continuation<? super Unit> continuation) {
                            int i4 = 2 % 2;
                            if (!(!(scanToPayEffect instanceof ScanToPayEffect.NavigateToRoute))) {
                                int i5 = component3 + 111;
                                component2 = i5 % 128;
                                int i6 = i5 % 2;
                                ScanToPayEffect.NavigateToRoute navigateToRoute = (ScanToPayEffect.NavigateToRoute) scanToPayEffect;
                                RouteUtils.routeWithExecute(sfcScanToPayFragment.getActivity(), navigateToRoute.getRoute(), navigateToRoute.getParams());
                            } else if (!(!(scanToPayEffect instanceof ScanToPayEffect.ShowError))) {
                                int i7 = component3 + 81;
                                component2 = i7 % 128;
                                if (i7 % 2 != 0) {
                                    SfcScanToPayFragment.access$processScanError(sfcScanToPayFragment);
                                } else {
                                    SfcScanToPayFragment.access$processScanError(sfcScanToPayFragment);
                                    throw null;
                                }
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.INSTANCE;
                        }
                    }, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int i4 = component3 + 53;
                    component2 = i4 % 128;
                    int i5 = i4 % 2;
                }
                throw new KotlinNothingValueException();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(SfcScanToPayFragment sfcScanToPayFragment, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.copydefault = sfcScanToPayFragment;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.copydefault, continuation);
                int i2 = component3 + 15;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass5;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component3 + 51;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Object objComponent3 = component3(coroutineScope, continuation);
                int i4 = component3 + 69;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return objComponent3;
            }

            public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component3 + 113;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = component3 + 51;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component2;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                LifecycleOwner viewLifecycleOwner = SfcScanToPayFragment.this.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                this.component2 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, Lifecycle.State.STARTED, new AnonymousClass5(SfcScanToPayFragment.this, null), this) == coroutine_suspended) {
                    int i3 = component1 + 79;
                    component3 = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 49 / 0;
                    }
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = component3 + 63;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    int i6 = 10 / 0;
                } else {
                    ResultKt.throwOnFailure(obj);
                }
            }
            return Unit.INSTANCE;
        }

        component3(Continuation<? super component3> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component3 component3Var = SfcScanToPayFragment.this.new component3(continuation);
            int i2 = component3 + 79;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return component3Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 57;
            component1 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                return ShareDataUIState(coroutineScope2, continuation2);
            }
            ShareDataUIState(coroutineScope2, continuation2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 3;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component1 + 13;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component1 implements Function2<Composer, Integer, Unit> {
        private static int component2 = 1;
        private static int copydefault;

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component2 + 123;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            ShareDataUIState(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void ShareDataUIState(Composer composer, int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 27;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            if ((i & 11) != 2 || !composer.getSkipping()) {
                final SfcScanToPayFragment sfcScanToPayFragment = SfcScanToPayFragment.this;
                OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-213298102, true, new Function2<Composer, Integer, Unit>() {
                    private static int component3 = 0;
                    private static int copydefault = 1;

                    @Override
                    public Unit invoke(Composer composer2, Integer num) {
                        int i5 = 2 % 2;
                        int i6 = component3 + 9;
                        copydefault = i6 % 128;
                        int i7 = i6 % 2;
                        component1(composer2, num.intValue());
                        Unit unit = Unit.INSTANCE;
                        int i8 = component3 + 25;
                        copydefault = i8 % 128;
                        if (i8 % 2 != 0) {
                            return unit;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void component1(androidx.compose.runtime.Composer r18, int r19) {
                        /*
                            r17 = this;
                            r10 = r18
                            r13 = 2
                            int r0 = r13 % r13
                            r0 = r19 & 11
                            r14 = 0
                            r15 = 1
                            if (r0 != r13) goto L1f
                            int r0 = com.huawei.digitalpayment.consumer.sfcqrcode.ui.fragment.scanToPay.SfcScanToPayFragment.component1.AnonymousClass1.copydefault
                            int r0 = r0 + 7
                            int r1 = r0 % 128
                            com.huawei.digitalpayment.consumer.sfcqrcode.ui.fragment.scanToPay.SfcScanToPayFragment.component1.AnonymousClass1.component3 = r1
                            int r0 = r0 % r13
                            boolean r0 = r18.getSkipping()
                            if (r0 != 0) goto L1b
                            goto L1f
                        L1b:
                            r18.skipToGroupEnd()
                            goto L5b
                        L1f:
                            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.INSTANCE
                            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
                            r1 = 0
                            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(r0, r1, r15, r14)
                            androidx.compose.material3.MaterialTheme r1 = androidx.compose.material3.MaterialTheme.INSTANCE
                            int r2 = androidx.compose.material3.MaterialTheme.$stable
                            androidx.compose.material3.ColorScheme r1 = r1.getColorScheme(r10, r2)
                            long r2 = r1.getBackground()
                            com.huawei.digitalpayment.consumer.sfcqrcode.ui.fragment.scanToPay.SfcScanToPayFragment$component1$1$3 r1 = new com.huawei.digitalpayment.consumer.sfcqrcode.ui.fragment.scanToPay.SfcScanToPayFragment$component1$1$3
                            r12 = r17
                            com.huawei.digitalpayment.consumer.sfcqrcode.ui.fragment.scanToPay.SfcScanToPayFragment r4 = r1
                            r1.<init>(r4)
                            r4 = 54
                            r5 = -2038494577(0xffffffff867f0a8f, float:-4.7967927E-35)
                            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(r5, r15, r1, r10, r4)
                            r9 = r1
                            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
                            r1 = 0
                            r4 = 0
                            r6 = 0
                            r7 = 0
                            r8 = 0
                            r11 = 12582918(0xc00006, float:1.7632424E-38)
                            r16 = 122(0x7a, float:1.71E-43)
                            r10 = r18
                            r12 = r16
                            androidx.compose.material3.SurfaceKt.m3742SurfaceT9BRK9s(r0, r1, r2, r4, r6, r7, r8, r9, r10, r11, r12)
                        L5b:
                            int r0 = com.huawei.digitalpayment.consumer.sfcqrcode.ui.fragment.scanToPay.SfcScanToPayFragment.component1.AnonymousClass1.copydefault
                            int r0 = r0 + r15
                            int r1 = r0 % 128
                            com.huawei.digitalpayment.consumer.sfcqrcode.ui.fragment.scanToPay.SfcScanToPayFragment.component1.AnonymousClass1.component3 = r1
                            int r0 = r0 % r13
                            if (r0 != 0) goto L66
                            return
                        L66:
                            throw r14
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcqrcode.ui.fragment.scanToPay.SfcScanToPayFragment.component1.AnonymousClass1.component1(androidx.compose.runtime.Composer, int):void");
                    }

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    static final class AnonymousClass3 implements Function2<Composer, Integer, Unit> {
                        private static int ShareDataUIState = 0;
                        private static int component3 = 1;
                        final SfcScanToPayFragment component2;

                        @Override
                        public Unit invoke(Composer composer, Integer num) {
                            int i = 2 % 2;
                            int i2 = component3 + 77;
                            ShareDataUIState = i2 % 128;
                            Composer composer2 = composer;
                            Integer num2 = num;
                            if (i2 % 2 == 0) {
                                ShareDataUIState(composer2, num2.intValue());
                                return Unit.INSTANCE;
                            }
                            ShareDataUIState(composer2, num2.intValue());
                            Unit unit = Unit.INSTANCE;
                            throw null;
                        }

                        public final void ShareDataUIState(Composer composer, int i) {
                            int i2 = 2 % 2;
                            int i3 = component3 + 105;
                            ShareDataUIState = i3 % 128;
                            if (i3 % 2 == 0 ? (i & 11) == 2 : (i & 107) == 4) {
                                if (composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    int i4 = component3 + 19;
                                    ShareDataUIState = i4 % 128;
                                    if (i4 % 2 != 0) {
                                        int i5 = 3 % 4;
                                        return;
                                    }
                                    return;
                                }
                            }
                            Uri uriAccess$getSharedImageUri$p = SfcScanToPayFragment.access$getSharedImageUri$p(this.component2);
                            final SfcScanToPayFragment sfcScanToPayFragment = this.component2;
                            Function0 function0 = new Function0() {
                                private static int component2 = 1;
                                private static int component3;

                                @Override
                                public final Object invoke() {
                                    int i6 = 2 % 2;
                                    int i7 = component2 + 107;
                                    component3 = i7 % 128;
                                    int i8 = i7 % 2;
                                    Unit unitComponent1 = SfcScanToPayFragment.component1.AnonymousClass1.AnonymousClass3.component1(sfcScanToPayFragment);
                                    int i9 = component2 + 97;
                                    component3 = i9 % 128;
                                    int i10 = i9 % 2;
                                    return unitComponent1;
                                }
                            };
                            final SfcScanToPayFragment sfcScanToPayFragment2 = this.component2;
                            Function0 function02 = new Function0() {
                                private static int component1 = 1;
                                private static int component2;

                                @Override
                                public final Object invoke() {
                                    int i6 = 2 % 2;
                                    int i7 = component1 + 61;
                                    component2 = i7 % 128;
                                    if (i7 % 2 != 0) {
                                        SfcScanToPayFragment.component1.AnonymousClass1.AnonymousClass3.component2(sfcScanToPayFragment2);
                                        throw null;
                                    }
                                    Unit unitComponent2 = SfcScanToPayFragment.component1.AnonymousClass1.AnonymousClass3.component2(sfcScanToPayFragment2);
                                    int i8 = component1 + 13;
                                    component2 = i8 % 128;
                                    int i9 = i8 % 2;
                                    return unitComponent2;
                                }
                            };
                            final SfcScanToPayFragment sfcScanToPayFragment3 = this.component2;
                            Function1 function1 = new Function1() {
                                private static int ShareDataUIState = 1;
                                private static int copydefault;

                                @Override
                                public final Object invoke(Object obj) {
                                    int i6 = 2 % 2;
                                    int i7 = copydefault + 59;
                                    ShareDataUIState = i7 % 128;
                                    int i8 = i7 % 2;
                                    SfcScanToPayFragment sfcScanToPayFragment4 = sfcScanToPayFragment3;
                                    ScanResult scanResult = (ScanResult) obj;
                                    if (i8 != 0) {
                                        return SfcScanToPayFragment.component1.AnonymousClass1.AnonymousClass3.component1(sfcScanToPayFragment4, scanResult);
                                    }
                                    SfcScanToPayFragment.component1.AnonymousClass1.AnonymousClass3.component1(sfcScanToPayFragment4, scanResult);
                                    Object obj2 = null;
                                    obj2.hashCode();
                                    throw null;
                                }
                            };
                            final SfcScanToPayFragment sfcScanToPayFragment4 = this.component2;
                            ScanToPayNavHostKt.ScanToPayNavHost(uriAccess$getSharedImageUri$p, function0, function02, function1, new Function1() {
                                private static int component2 = 1;
                                private static int component3;

                                @Override
                                public final Object invoke(Object obj) {
                                    int i6 = 2 % 2;
                                    int i7 = component3 + 9;
                                    component2 = i7 % 128;
                                    int i8 = i7 % 2;
                                    Unit unitComponent3 = SfcScanToPayFragment.component1.AnonymousClass1.AnonymousClass3.component3(sfcScanToPayFragment4, (QrCodeResult) obj);
                                    int i9 = component2 + 125;
                                    component3 = i9 % 128;
                                    int i10 = i9 % 2;
                                    return unitComponent3;
                                }
                            }, composer, 8);
                        }

                        private static final Unit copydefault(SfcScanToPayFragment sfcScanToPayFragment) {
                            int i = 2 % 2;
                            int i2 = component3 + 69;
                            ShareDataUIState = i2 % 128;
                            if (i2 % 2 == 0) {
                                Intrinsics.checkNotNullParameter(sfcScanToPayFragment, "");
                                sfcScanToPayFragment.handleBackAction();
                                return Unit.INSTANCE;
                            }
                            Intrinsics.checkNotNullParameter(sfcScanToPayFragment, "");
                            sfcScanToPayFragment.handleBackAction();
                            Unit unit = Unit.INSTANCE;
                            throw null;
                        }

                        private static final Unit ShareDataUIState(SfcScanToPayFragment sfcScanToPayFragment) {
                            int i = 2 % 2;
                            int i2 = ShareDataUIState + 55;
                            component3 = i2 % 128;
                            if (i2 % 2 == 0) {
                                Intrinsics.checkNotNullParameter(sfcScanToPayFragment, "");
                            } else {
                                Intrinsics.checkNotNullParameter(sfcScanToPayFragment, "");
                            }
                            ContextExtensions contextExtensions = ContextExtensions.INSTANCE;
                            Context contextRequireContext = sfcScanToPayFragment.requireContext();
                            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                            ContextExtensions.startPermissionSettingsScreen$default(contextExtensions, contextRequireContext, null, 1, null);
                            return Unit.INSTANCE;
                        }

                        private static final Unit component3(SfcScanToPayFragment sfcScanToPayFragment, ScanResult scanResult) {
                            int i = 2 % 2;
                            int i2 = ShareDataUIState + 7;
                            component3 = i2 % 128;
                            int i3 = i2 % 2;
                            Intrinsics.checkNotNullParameter(sfcScanToPayFragment, "");
                            Intrinsics.checkNotNullParameter(scanResult, "");
                            ScanQrCodeViewModel scanQrCodeViewModel = null;
                            if (scanResult instanceof ScanResult.Success) {
                                ScanResult.Success success = (ScanResult.Success) scanResult;
                                Log.d("SfcScanToPayFragment", "Received scan result: " + success.getPaymentDetails());
                                ScanQrCodeViewModel scanQrCodeViewModelAccess$getScanQrCodeViewModel$p = SfcScanToPayFragment.access$getScanQrCodeViewModel$p(sfcScanToPayFragment);
                                if (scanQrCodeViewModelAccess$getScanQrCodeViewModel$p == null) {
                                    int i4 = ShareDataUIState + 15;
                                    component3 = i4 % 128;
                                    if (i4 % 2 == 0) {
                                        Intrinsics.throwUninitializedPropertyAccessException("");
                                        scanQrCodeViewModel.hashCode();
                                        throw null;
                                    }
                                    Intrinsics.throwUninitializedPropertyAccessException("");
                                } else {
                                    scanQrCodeViewModel = scanQrCodeViewModelAccess$getScanQrCodeViewModel$p;
                                }
                                scanQrCodeViewModel.onScanResultReceived(success.getPaymentDetails());
                                int i5 = ShareDataUIState + 121;
                                component3 = i5 % 128;
                                int i6 = i5 % 2;
                            } else {
                                if (!(scanResult instanceof ScanResult.Error)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Log.d("SfcScanToPayFragment", "Received scan error: " + ((ScanResult.Error) scanResult).getMessage());
                                ScanQrCodeViewModel scanQrCodeViewModelAccess$getScanQrCodeViewModel$p2 = SfcScanToPayFragment.access$getScanQrCodeViewModel$p(sfcScanToPayFragment);
                                if (scanQrCodeViewModelAccess$getScanQrCodeViewModel$p2 == null) {
                                    int i7 = ShareDataUIState + 73;
                                    component3 = i7 % 128;
                                    if (i7 % 2 == 0) {
                                        Intrinsics.throwUninitializedPropertyAccessException("");
                                        throw null;
                                    }
                                    Intrinsics.throwUninitializedPropertyAccessException("");
                                } else {
                                    scanQrCodeViewModel = scanQrCodeViewModelAccess$getScanQrCodeViewModel$p2;
                                }
                                scanQrCodeViewModel.onScanError();
                            }
                            return Unit.INSTANCE;
                        }

                        private static final Unit ShareDataUIState(SfcScanToPayFragment sfcScanToPayFragment, QrCodeResult qrCodeResult) {
                            int i = 2 % 2;
                            Intrinsics.checkNotNullParameter(sfcScanToPayFragment, "");
                            Intrinsics.checkNotNullParameter(qrCodeResult, "");
                            Log.d("SfcScanToPayFragment", "Received QR code result: " + qrCodeResult);
                            SfcScanToPayFragment.access$processQrCodeResult(sfcScanToPayFragment, qrCodeResult.getValue());
                            Unit unit = Unit.INSTANCE;
                            int i2 = component3 + 63;
                            ShareDataUIState = i2 % 128;
                            int i3 = i2 % 2;
                            return unit;
                        }

                        public static Unit component3(SfcScanToPayFragment sfcScanToPayFragment, QrCodeResult qrCodeResult) {
                            int i = 2 % 2;
                            int i2 = component3 + 125;
                            ShareDataUIState = i2 % 128;
                            int i3 = i2 % 2;
                            Unit unitShareDataUIState = ShareDataUIState(sfcScanToPayFragment, qrCodeResult);
                            int i4 = ShareDataUIState + 91;
                            component3 = i4 % 128;
                            if (i4 % 2 == 0) {
                                int i5 = 56 / 0;
                            }
                            return unitShareDataUIState;
                        }

                        public static Unit component1(SfcScanToPayFragment sfcScanToPayFragment) {
                            int i = 2 % 2;
                            int i2 = ShareDataUIState + 95;
                            component3 = i2 % 128;
                            int i3 = i2 % 2;
                            Unit unitCopydefault = copydefault(sfcScanToPayFragment);
                            int i4 = component3 + 29;
                            ShareDataUIState = i4 % 128;
                            if (i4 % 2 == 0) {
                                return unitCopydefault;
                            }
                            throw null;
                        }

                        public static Unit component1(SfcScanToPayFragment sfcScanToPayFragment, ScanResult scanResult) {
                            int i = 2 % 2;
                            int i2 = ShareDataUIState + 21;
                            component3 = i2 % 128;
                            if (i2 % 2 != 0) {
                                return component3(sfcScanToPayFragment, scanResult);
                            }
                            component3(sfcScanToPayFragment, scanResult);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }

                        public static Unit component2(SfcScanToPayFragment sfcScanToPayFragment) {
                            int i = 2 % 2;
                            int i2 = component3 + 55;
                            ShareDataUIState = i2 % 128;
                            int i3 = i2 % 2;
                            Unit unitShareDataUIState = ShareDataUIState(sfcScanToPayFragment);
                            int i4 = component3 + 125;
                            ShareDataUIState = i4 % 128;
                            if (i4 % 2 != 0) {
                                int i5 = 4 / 0;
                            }
                            return unitShareDataUIState;
                        }

                        AnonymousClass3(SfcScanToPayFragment sfcScanToPayFragment) {
                            this.component2 = sfcScanToPayFragment;
                        }
                    }
                }, composer, 54), composer, 1572864, 63);
            } else {
                composer.skipToGroupEnd();
            }
            int i5 = copydefault + 123;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        component1() {
        }
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        this.component3 = (ScanQrCodeViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(ScanQrCodeViewModel.class);
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
        this.component2 = (QrCodeViewModel) new ViewModelProvider(fragmentActivityRequireActivity2).get(QrCodeViewModel.class);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new component3(null), 3, null);
        getBinding().getRoot().setContent(ComposableLambdaKt.composableLambdaInstance(-747036979, true, new component1()));
        int i2 = copydefault + 5;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void onResume() {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        ScanQrCodeViewModel scanQrCodeViewModel = this.component3;
        if (scanQrCodeViewModel == null) {
            int i4 = copydefault + 21;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i5 == 0) {
                throw null;
            }
            scanQrCodeViewModel = null;
        }
        scanQrCodeViewModel.resetProcessing();
    }

    private final void component2() {
        int i = 2 % 2;
        int i2 = copydefault + 27;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        TransactionErrorActivity.Companion companion = TransactionErrorActivity.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        this.ShareDataUIState.launch(companion.createIntent(contextRequireContext, getString(R.string.scan_receipt_failed), getString(R.string.scan_receipt_failed_tips), true, Integer.valueOf(R.drawable.ic_one_app_warning)));
        int i4 = copydefault + 1;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void component2(String str) {
        int i = 2 % 2;
        ScanQrCodeViewModel scanQrCodeViewModel = this.component3;
        ScanQrCodeViewModel scanQrCodeViewModel2 = null;
        if (scanQrCodeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            scanQrCodeViewModel = null;
        }
        if (scanQrCodeViewModel.isProcessing()) {
            return;
        }
        QrCodeViewModel qrCodeViewModel = this.component2;
        if (qrCodeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            qrCodeViewModel = null;
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        if (qrCodeViewModel.decodeMiniAppQR(fragmentActivityRequireActivity, str)) {
            int i2 = getAsAtTimestamp + 117;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            ScanQrCodeViewModel scanQrCodeViewModel3 = this.component3;
            if (scanQrCodeViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = getAsAtTimestamp + 59;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                scanQrCodeViewModel3 = null;
            }
            scanQrCodeViewModel3.markAsProcessing();
            int i6 = getAsAtTimestamp + 125;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            return;
        }
        QrCodeViewModel qrCodeViewModel2 = this.component2;
        if (qrCodeViewModel2 == null) {
            int i7 = copydefault + 97;
            getAsAtTimestamp = i7 % 128;
            int i8 = i7 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            qrCodeViewModel2 = null;
        }
        DecodeQrCodeResp decodeQrCodeRespDecodeQRFromScanner = qrCodeViewModel2.decodeQRFromScanner(str);
        if (TextUtils.isEmpty(decodeQrCodeRespDecodeQRFromScanner.getErrMsg())) {
            QrCodeViewModel qrCodeViewModel3 = this.component2;
            if (qrCodeViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                qrCodeViewModel3 = null;
            }
            Map<String, String> mapBuildRouteParams = qrCodeViewModel3.buildRouteParams(decodeQrCodeRespDecodeQRFromScanner);
            mapBuildRouteParams.put("tradeType", PayTradeTypeEnum.QR_CODE.getTradeType());
            ScanQrCodeViewModel scanQrCodeViewModel4 = this.component3;
            if (scanQrCodeViewModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                scanQrCodeViewModel2 = scanQrCodeViewModel4;
            }
            scanQrCodeViewModel2.onQrCodeResultProcessed(decodeQrCodeRespDecodeQRFromScanner.getExecute(), mapBuildRouteParams);
        }
    }

    @Override
    public void handleBackAction() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 3;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        requireActivity().finish();
        int i4 = getAsAtTimestamp + 9;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void $r8$lambda$P4HLP7t9kAOJGNZPUoExhlV2xH4(SfcScanToPayFragment sfcScanToPayFragment, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 109;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        component3(sfcScanToPayFragment, activityResult);
        int i4 = getAsAtTimestamp + 83;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcqrcode/ui/fragment/scanToPay/SfcScanToPayFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/huawei/digitalpayment/consumer/sfcqrcode/ui/fragment/scanToPay/SfcScanToPayFragment;", "sharedImageUri", "Landroid/net/Uri;", "ConsumerSfcQrCodeUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int component1 = 1;
        private static int component2;

        private Companion() {
        }

        public static SfcScanToPayFragment newInstance$default(Companion companion, Uri uri, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component1 + 29;
            int i4 = i3 % 128;
            component2 = i4;
            int i5 = i3 % 2;
            if ((i & 1) != 0) {
                int i6 = i4 + 119;
                component1 = i6 % 128;
                int i7 = i6 % 2;
                uri = null;
            }
            return companion.newInstance(uri);
        }

        public final SfcScanToPayFragment newInstance(Uri sharedImageUri) {
            int i = 2 % 2;
            SfcScanToPayFragment sfcScanToPayFragment = new SfcScanToPayFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("sharedImageUri", sharedImageUri);
            sfcScanToPayFragment.setArguments(bundle);
            int i2 = component1 + 45;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return sfcScanToPayFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i = equals + 5;
        copy = i % 128;
        if (i % 2 == 0) {
            int i2 = 37 / 0;
        }
    }
}
