package com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.profileinstaller.ProfileVerifier;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDashboardEvent;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDashboardFragment;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.Beneficiary;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectUIState;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.ui.FamilyConnectPurchasedBundleScreenKt;
import com.huawei.digitalpayment.consumer.sfcui.sendmany.ui.activity.SendToManyActivity$$ExternalSyntheticLambda4;
import com.safaricom.designsystem.components.scaffold.ScreenScaffoldContainerKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectDashboardFragment;", "Lcom/safaricom/sharedui/compose/fragment/SfcComposeFragment;", "<init>", "()V", "familyConnectViewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectViewModel;", "getFamilyConnectViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectViewModel;", "familyConnectViewModel$delegate", "Lkotlin/Lazy;", "handleBackAction", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showBundleList", "ConsumerSfcUI_release", "dashboardState", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectDashboardUiState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class FamilyConnectDashboardFragment extends Hilt_FamilyConnectDashboardFragment {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1 % 128;
    private final Lazy component1;

    public static final FamilyConnectViewModel access$getFamilyConnectViewModel(FamilyConnectDashboardFragment familyConnectDashboardFragment) {
        int i = 2 % 2;
        int i2 = component3 + 61;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FamilyConnectViewModel familyConnectViewModelCopydefault = familyConnectDashboardFragment.copydefault();
        int i4 = component3 + 109;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return familyConnectViewModelCopydefault;
    }

    public static final void access$showBundleList(FamilyConnectDashboardFragment familyConnectDashboardFragment) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        familyConnectDashboardFragment.ShareDataUIState();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = component3 + 119;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public FamilyConnectDashboardFragment() {
        final FamilyConnectDashboardFragment familyConnectDashboardFragment = this;
        final Function0 function0 = null;
        this.component1 = FragmentViewModelLazyKt.createViewModelLazy(familyConnectDashboardFragment, Reflection.getOrCreateKotlinClass(FamilyConnectViewModel.class), new Function0<ViewModelStore>() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 27;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    invoke();
                    throw null;
                }
                ViewModelStore viewModelStoreInvoke = invoke();
                int i3 = copydefault + 109;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                return viewModelStoreInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 47;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = familyConnectDashboardFragment.requireActivity().getViewModelStore();
                int i4 = component1 + 47;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    return viewModelStore;
                }
                throw null;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 73;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = copydefault + 93;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    return creationExtrasInvoke;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r2
  0x001b: PHI (r2v3 kotlin.jvm.functions.Function0) = (r2v2 kotlin.jvm.functions.Function0), (r2v7 kotlin.jvm.functions.Function0) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
            @Override
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final androidx.lifecycle.viewmodel.CreationExtras invoke() {
                /*
                    r4 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDashboardFragment$special$$inlined$activityViewModels$default$2.copydefault
                    int r2 = r1 + 35
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDashboardFragment$special$$inlined$activityViewModels$default$2.component1 = r3
                    int r2 = r2 % r0
                    if (r2 != 0) goto L17
                    kotlin.jvm.functions.Function0 r2 = r1
                    r3 = 53
                    int r3 = r3 / 0
                    if (r2 == 0) goto L2a
                    goto L1b
                L17:
                    kotlin.jvm.functions.Function0 r2 = r1
                    if (r2 == 0) goto L2a
                L1b:
                    int r1 = r1 + 71
                    int r3 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDashboardFragment$special$$inlined$activityViewModels$default$2.component1 = r3
                    int r1 = r1 % r0
                    java.lang.Object r1 = r2.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r1 = (androidx.lifecycle.viewmodel.CreationExtras) r1
                    if (r1 != 0) goto L34
                L2a:
                    androidx.fragment.app.Fragment r1 = r2
                    androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
                    androidx.lifecycle.viewmodel.CreationExtras r1 = r1.getDefaultViewModelCreationExtras()
                L34:
                    int r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDashboardFragment$special$$inlined$activityViewModels$default$2.copydefault
                    int r2 = r2 + 85
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDashboardFragment$special$$inlined$activityViewModels$default$2.component1 = r3
                    int r2 = r2 % r0
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDashboardFragment$special$$inlined$activityViewModels$default$2.invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component2 + 63;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    return invoke();
                }
                invoke();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component2 + 67;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory defaultViewModelProviderFactory = familyConnectDashboardFragment.requireActivity().getDefaultViewModelProviderFactory();
                int i4 = component2 + 33;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 78 / 0;
                }
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        });
    }

    private final FamilyConnectViewModel copydefault() {
        int i = 2 % 2;
        int i2 = component3 + 37;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FamilyConnectViewModel familyConnectViewModel = (FamilyConnectViewModel) this.component1.getValue();
        if (i3 != 0) {
            return familyConnectViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void handleBackAction() {
        int i = 2 % 2;
        int i2 = component3 + 43;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        copydefault().previousScreen();
        int i4 = ShareDataUIState + 87;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Function2<Composer, Integer, Unit> {
        private static int component2 = 0;
        private static int copydefault = 1;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
            private static int ShareDataUIState = 1;
            private static int component1;
            final FamilyConnectDashboardFragment copydefault;

            public static Object copydefault(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
                int i7 = ~i3;
                int i8 = ~i6;
                int i9 = ~(i7 | i8);
                int i10 = ~i5;
                int i11 = i9 | (~(i10 | i6));
                int i12 = (~(i6 | i7)) | (~(i8 | i10));
                int i13 = ~(i3 | i5);
                int i14 = i12 | i13;
                int i15 = i13 | i11;
                int i16 = i3 + i5 + i2 + ((-1585779005) * i) + (640148872 * i4);
                int i17 = i16 * i16;
                int i18 = (i3 * 308833806) + 153878528 + (308833806 * i5) + ((-448846874) * i11) + ((-224423437) * i14) + (224423437 * i15) + (84410368 * i2) + (1159200768 * i) + ((-734003200) * i4) + (2089549824 * i17);
                int i19 = (i3 * (-1291220770)) + 263398195 + (i5 * (-1291220770)) + (i11 * (-1802)) + (i14 * (-901)) + (i15 * TypedValues.Custom.TYPE_FLOAT) + (i2 * (-1291221671)) + (i * (-1079815989)) + (i4 * 669414472) + (i17 * 145489920);
                if (i18 + (i19 * i19 * (-1699479552)) == 1) {
                    return component2(objArr);
                }
                State state = (State) objArr[0];
                int i20 = 2 % 2;
                int i21 = component1 + 117;
                ShareDataUIState = i21 % 128;
                int i22 = i21 % 2;
                FamilyConnectDashboardUiState familyConnectDashboardUiState = (FamilyConnectDashboardUiState) state.getValue();
                int i23 = component1 + 51;
                ShareDataUIState = i23 % 128;
                int i24 = i23 % 2;
                return familyConnectDashboardUiState;
            }

            private static Object component2(Object[] objArr) {
                State state = (State) objArr[0];
                int i = 2 % 2;
                int i2 = component1 + 21;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                int iComponent2 = SendToManyActivity$$ExternalSyntheticLambda4.component2();
                int iComponent22 = SendToManyActivity$$ExternalSyntheticLambda4.component2();
                FamilyConnectDashboardUiState familyConnectDashboardUiState = (FamilyConnectDashboardUiState) copydefault(SendToManyActivity$$ExternalSyntheticLambda4.component2(), iComponent22, 854322759, SendToManyActivity$$ExternalSyntheticLambda4.component2(), new Object[]{state}, -854322759, iComponent2);
                int i4 = ShareDataUIState + 67;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return familyConnectDashboardUiState;
                }
                throw null;
            }

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = component1 + 7;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                component2(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                if (i3 == 0) {
                    throw null;
                }
                int i4 = ShareDataUIState + 119;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDashboardFragment$onViewCreated$1$1$1", f = "FamilyConnectDashboardFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                private static int ShareDataUIState = 0;
                private static int getAsAtTimestamp = 1;
                final FamilyConnectDashboardFragment component1;
                final Context component2;
                final State<FamilyConnectDashboardUiState> component3;
                int copydefault;

                @Override
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = getAsAtTimestamp + 47;
                    ShareDataUIState = i2 % 128;
                    Object obj2 = null;
                    if (i2 % 2 != 0) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        obj2.hashCode();
                        throw null;
                    }
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.copydefault != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = ShareDataUIState + 69;
                    getAsAtTimestamp = i3 % 128;
                    int i4 = i3 % 2;
                    ResultKt.throwOnFailure(obj);
                    if (i4 == 0) {
                        Object[] objArr = {this.component3};
                        int iComponent2 = SendToManyActivity$$ExternalSyntheticLambda4.component2();
                        ((FamilyConnectDashboardUiState) AnonymousClass1.copydefault(SendToManyActivity$$ExternalSyntheticLambda4.component2(), SendToManyActivity$$ExternalSyntheticLambda4.component2(), -1663209550, SendToManyActivity$$ExternalSyntheticLambda4.component2(), objArr, 1663209551, iComponent2)).getErrorMessage();
                        throw null;
                    }
                    Object[] objArr2 = {this.component3};
                    int iComponent22 = SendToManyActivity$$ExternalSyntheticLambda4.component2();
                    String errorMessage = ((FamilyConnectDashboardUiState) AnonymousClass1.copydefault(SendToManyActivity$$ExternalSyntheticLambda4.component2(), SendToManyActivity$$ExternalSyntheticLambda4.component2(), -1663209550, SendToManyActivity$$ExternalSyntheticLambda4.component2(), objArr2, 1663209551, iComponent22)).getErrorMessage();
                    if (errorMessage != null) {
                        Context context = this.component2;
                        FamilyConnectDashboardFragment familyConnectDashboardFragment = this.component1;
                        Toast.makeText(context, errorMessage, 0).show();
                        FamilyConnectDashboardFragment.access$getFamilyConnectViewModel(familyConnectDashboardFragment).onDashboardEvent(FamilyConnectDashboardEvent.ClearError.INSTANCE);
                    }
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(State<FamilyConnectDashboardUiState> state, Context context, FamilyConnectDashboardFragment familyConnectDashboardFragment, Continuation<? super AnonymousClass5> continuation) {
                    super(2, continuation);
                    this.component3 = state;
                    this.component2 = context;
                    this.component1 = familyConnectDashboardFragment;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.component3, this.component2, this.component1, continuation);
                    int i2 = getAsAtTimestamp + 83;
                    ShareDataUIState = i2 % 128;
                    if (i2 % 2 == 0) {
                        return anonymousClass5;
                    }
                    throw null;
                }

                @Override
                public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = getAsAtTimestamp + 89;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    Object objCopydefault = copydefault(coroutineScope, continuation);
                    int i4 = ShareDataUIState + 85;
                    getAsAtTimestamp = i4 % 128;
                    int i5 = i4 % 2;
                    return objCopydefault;
                }

                public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = getAsAtTimestamp + 35;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    int i4 = ShareDataUIState + 33;
                    getAsAtTimestamp = i4 % 128;
                    int i5 = i4 % 2;
                    return objInvokeSuspend;
                }
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass2 extends FunctionReferenceImpl implements Function0<Unit> {
                private static int ShareDataUIState = 0;
                private static int copydefault = 1;

                public final void copydefault() {
                    int i = 2 % 2;
                    int i2 = copydefault + 53;
                    ShareDataUIState = i2 % 128;
                    if (i2 % 2 != 0) {
                        ((FamilyConnectDashboardFragment) this.receiver).handleBackAction();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    ((FamilyConnectDashboardFragment) this.receiver).handleBackAction();
                    int i3 = ShareDataUIState + 81;
                    copydefault = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 41 / 0;
                    }
                }

                @Override
                public Unit invoke() {
                    int i = 2 % 2;
                    int i2 = copydefault + 103;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    copydefault();
                    Unit unit = Unit.INSTANCE;
                    int i4 = copydefault + 81;
                    ShareDataUIState = i4 % 128;
                    if (i4 % 2 == 0) {
                        return unit;
                    }
                    throw null;
                }

                AnonymousClass2(Object obj) {
                    super(0, obj, FamilyConnectDashboardFragment.class, "handleBackAction", "handleBackAction()V", 0);
                }
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass4 extends FunctionReferenceImpl implements Function0<Unit> {
                private static int component2 = 0;
                private static int component3 = 1;

                public final void ShareDataUIState() {
                    int i = 2 % 2;
                    int i2 = component3 + 99;
                    component2 = i2 % 128;
                    if (i2 % 2 != 0) {
                        ((FamilyConnectDashboardFragment) this.receiver).handleBackAction();
                        throw null;
                    }
                    ((FamilyConnectDashboardFragment) this.receiver).handleBackAction();
                    int i3 = component3 + 109;
                    component2 = i3 % 128;
                    int i4 = i3 % 2;
                }

                @Override
                public Unit invoke() {
                    int i = 2 % 2;
                    int i2 = component2 + 25;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    ShareDataUIState();
                    Unit unit = Unit.INSTANCE;
                    if (i3 == 0) {
                        int i4 = 55 / 0;
                    }
                    return unit;
                }

                AnonymousClass4(Object obj) {
                    super(0, obj, FamilyConnectDashboardFragment.class, "handleBackAction", "handleBackAction()V", 0);
                }
            }

            private static final Unit component3(FamilyConnectDashboardFragment familyConnectDashboardFragment) {
                Unit unit;
                int i = 2 % 2;
                int i2 = ShareDataUIState + 95;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(familyConnectDashboardFragment, "");
                    FamilyConnectDashboardFragment.access$getFamilyConnectViewModel(familyConnectDashboardFragment).showAddBeneficiaryScreen();
                    unit = Unit.INSTANCE;
                    int i3 = 24 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(familyConnectDashboardFragment, "");
                    FamilyConnectDashboardFragment.access$getFamilyConnectViewModel(familyConnectDashboardFragment).showAddBeneficiaryScreen();
                    unit = Unit.INSTANCE;
                }
                int i4 = component1 + 77;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                throw null;
            }

            private static final Unit component2(FamilyConnectDashboardFragment familyConnectDashboardFragment) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 89;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(familyConnectDashboardFragment, "");
                FamilyConnectDashboardFragment.access$showBundleList(familyConnectDashboardFragment);
                Unit unit = Unit.INSTANCE;
                int i4 = component1 + 43;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                throw null;
            }

            private static final Unit copydefault(FamilyConnectDashboardFragment familyConnectDashboardFragment, Beneficiary beneficiary) {
                int i = 2 % 2;
                int i2 = component1 + 85;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(familyConnectDashboardFragment, "");
                    Intrinsics.checkNotNullParameter(beneficiary, "");
                    FamilyConnectDashboardFragment.access$getFamilyConnectViewModel(familyConnectDashboardFragment).showDeleteBeneficiary(beneficiary);
                    return Unit.INSTANCE;
                }
                Intrinsics.checkNotNullParameter(familyConnectDashboardFragment, "");
                Intrinsics.checkNotNullParameter(beneficiary, "");
                FamilyConnectDashboardFragment.access$getFamilyConnectViewModel(familyConnectDashboardFragment).showDeleteBeneficiary(beneficiary);
                Unit unit = Unit.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final Unit component2(FamilyConnectDashboardFragment familyConnectDashboardFragment, Beneficiary beneficiary) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 63;
                component1 = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(familyConnectDashboardFragment, "");
                    Intrinsics.checkNotNullParameter(beneficiary, "");
                    FamilyConnectDashboardFragment.access$getFamilyConnectViewModel(familyConnectDashboardFragment).showUpdateBeneficiary(beneficiary);
                    return Unit.INSTANCE;
                }
                Intrinsics.checkNotNullParameter(familyConnectDashboardFragment, "");
                Intrinsics.checkNotNullParameter(beneficiary, "");
                FamilyConnectDashboardFragment.access$getFamilyConnectViewModel(familyConnectDashboardFragment).showUpdateBeneficiary(beneficiary);
                Unit unit = Unit.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final void component2(Composer composer, int i) {
                int i2 = 2 % 2;
                int i3 = component1 + 109;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0 ? (i & 11) == 2 : (i & 20) == 3) {
                    if (composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                }
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object objConsume = composer.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(composer);
                Context context = (Context) objConsume;
                State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(FamilyConnectDashboardFragment.access$getFamilyConnectViewModel(this.copydefault).getDashboardUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7);
                int iComponent2 = SendToManyActivity$$ExternalSyntheticLambda4.component2();
                int iComponent22 = SendToManyActivity$$ExternalSyntheticLambda4.component2();
                EffectsKt.LaunchedEffect(((FamilyConnectDashboardUiState) copydefault(SendToManyActivity$$ExternalSyntheticLambda4.component2(), iComponent22, 854322759, SendToManyActivity$$ExternalSyntheticLambda4.component2(), new Object[]{stateCollectAsStateWithLifecycle}, -854322759, iComponent2)).getErrorMessage(), new AnonymousClass5(stateCollectAsStateWithLifecycle, context, this.copydefault, null), composer, 64);
                int iComponent23 = SendToManyActivity$$ExternalSyntheticLambda4.component2();
                int iComponent24 = SendToManyActivity$$ExternalSyntheticLambda4.component2();
                if (((FamilyConnectDashboardUiState) copydefault(SendToManyActivity$$ExternalSyntheticLambda4.component2(), iComponent24, 854322759, SendToManyActivity$$ExternalSyntheticLambda4.component2(), new Object[]{stateCollectAsStateWithLifecycle}, -854322759, iComponent23)).isLoading()) {
                    composer.startReplaceGroup(-16571611);
                    ScreenScaffoldContainerKt.m12664ScreenScaffoldContainerwnmIMI4(StringResources_androidKt.stringResource(R.string.gsm_family_connect_title, composer, 0), new AnonymousClass2(this.copydefault), null, 0L, 0L, 0L, null, null, null, null, null, null, null, null, false, ComposableSingletons$FamilyConnectDashboardFragmentKt.INSTANCE.m11287getLambda1$ConsumerSfcUI_release(), composer, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 32764);
                    composer.endReplaceGroup();
                    int i4 = component1 + 19;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                    return;
                }
                int iComponent25 = SendToManyActivity$$ExternalSyntheticLambda4.component2();
                int iComponent26 = SendToManyActivity$$ExternalSyntheticLambda4.component2();
                if (((FamilyConnectDashboardUiState) copydefault(SendToManyActivity$$ExternalSyntheticLambda4.component2(), iComponent26, 854322759, SendToManyActivity$$ExternalSyntheticLambda4.component2(), new Object[]{stateCollectAsStateWithLifecycle}, -854322759, iComponent25)).getUiState() == null) {
                    composer.startReplaceGroup(-15197567);
                    composer.endReplaceGroup();
                    return;
                }
                composer.startReplaceGroup(-16121646);
                Modifier.Companion companion = Modifier.INSTANCE;
                int iComponent27 = SendToManyActivity$$ExternalSyntheticLambda4.component2();
                int iComponent28 = SendToManyActivity$$ExternalSyntheticLambda4.component2();
                FamilyConnectUIState uiState = ((FamilyConnectDashboardUiState) copydefault(SendToManyActivity$$ExternalSyntheticLambda4.component2(), iComponent28, 854322759, SendToManyActivity$$ExternalSyntheticLambda4.component2(), new Object[]{stateCollectAsStateWithLifecycle}, -854322759, iComponent27)).getUiState();
                final FamilyConnectDashboardFragment familyConnectDashboardFragment = this.copydefault;
                Function0 function0 = new Function0() {
                    private static int component1 = 1;
                    private static int copydefault;

                    @Override
                    public final Object invoke() {
                        int i6 = 2 % 2;
                        int i7 = component1 + 91;
                        copydefault = i7 % 128;
                        int i8 = i7 % 2;
                        Unit unitCopydefault = FamilyConnectDashboardFragment.component2.AnonymousClass1.copydefault(familyConnectDashboardFragment);
                        int i9 = component1 + 51;
                        copydefault = i9 % 128;
                        int i10 = i9 % 2;
                        return unitCopydefault;
                    }
                };
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.copydefault);
                final FamilyConnectDashboardFragment familyConnectDashboardFragment2 = this.copydefault;
                Function0 function02 = new Function0() {
                    private static int component3 = 0;
                    private static int copydefault = 1;

                    @Override
                    public final Object invoke() {
                        int i6 = 2 % 2;
                        int i7 = component3 + 95;
                        copydefault = i7 % 128;
                        int i8 = i7 % 2;
                        Unit unitShareDataUIState = FamilyConnectDashboardFragment.component2.AnonymousClass1.ShareDataUIState(familyConnectDashboardFragment2);
                        int i9 = component3 + 37;
                        copydefault = i9 % 128;
                        if (i9 % 2 != 0) {
                            return unitShareDataUIState;
                        }
                        throw null;
                    }
                };
                final FamilyConnectDashboardFragment familyConnectDashboardFragment3 = this.copydefault;
                Function1 function1 = new Function1() {
                    private static int component3 = 1;
                    private static int copydefault;

                    @Override
                    public final Object invoke(Object obj) {
                        int i6 = 2 % 2;
                        int i7 = copydefault + 91;
                        component3 = i7 % 128;
                        Object obj2 = null;
                        if (i7 % 2 == 0) {
                            FamilyConnectDashboardFragment.component2.AnonymousClass1.ShareDataUIState(familyConnectDashboardFragment3, (Beneficiary) obj);
                            throw null;
                        }
                        Unit unitShareDataUIState = FamilyConnectDashboardFragment.component2.AnonymousClass1.ShareDataUIState(familyConnectDashboardFragment3, (Beneficiary) obj);
                        int i8 = component3 + 53;
                        copydefault = i8 % 128;
                        if (i8 % 2 == 0) {
                            return unitShareDataUIState;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                };
                final FamilyConnectDashboardFragment familyConnectDashboardFragment4 = this.copydefault;
                FamilyConnectPurchasedBundleScreenKt.FamilyConnectPurchasedBundleScreen(companion, uiState, function0, anonymousClass4, function02, function1, new Function1() {
                    private static int component1 = 0;
                    private static int component3 = 1;

                    @Override
                    public final Object invoke(Object obj) {
                        Unit unitComponent3;
                        int i6 = 2 % 2;
                        int i7 = component1 + 87;
                        component3 = i7 % 128;
                        if (i7 % 2 == 0) {
                            unitComponent3 = FamilyConnectDashboardFragment.component2.AnonymousClass1.component3(familyConnectDashboardFragment4, (Beneficiary) obj);
                            int i8 = 54 / 0;
                        } else {
                            unitComponent3 = FamilyConnectDashboardFragment.component2.AnonymousClass1.component3(familyConnectDashboardFragment4, (Beneficiary) obj);
                        }
                        int i9 = component1 + 25;
                        component3 = i9 % 128;
                        int i10 = i9 % 2;
                        return unitComponent3;
                    }
                }, composer, 70);
                composer.endReplaceGroup();
            }

            public static Unit ShareDataUIState(FamilyConnectDashboardFragment familyConnectDashboardFragment, Beneficiary beneficiary) {
                int i = 2 % 2;
                int i2 = component1 + 75;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Unit unitCopydefault = copydefault(familyConnectDashboardFragment, beneficiary);
                int i4 = component1 + 3;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitCopydefault;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static Unit component3(FamilyConnectDashboardFragment familyConnectDashboardFragment, Beneficiary beneficiary) {
                int i = 2 % 2;
                int i2 = component1 + 67;
                ShareDataUIState = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    component2(familyConnectDashboardFragment, beneficiary);
                    obj.hashCode();
                    throw null;
                }
                Unit unitComponent2 = component2(familyConnectDashboardFragment, beneficiary);
                int i3 = component1 + 19;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    return unitComponent2;
                }
                throw null;
            }

            public static Unit copydefault(FamilyConnectDashboardFragment familyConnectDashboardFragment) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 11;
                component1 = i2 % 128;
                if (i2 % 2 == 0) {
                    return component3(familyConnectDashboardFragment);
                }
                component3(familyConnectDashboardFragment);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static Unit ShareDataUIState(FamilyConnectDashboardFragment familyConnectDashboardFragment) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 37;
                component1 = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    component2(familyConnectDashboardFragment);
                    obj.hashCode();
                    throw null;
                }
                Unit unitComponent2 = component2(familyConnectDashboardFragment);
                int i3 = ShareDataUIState + 57;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    return unitComponent2;
                }
                obj.hashCode();
                throw null;
            }

            AnonymousClass1(FamilyConnectDashboardFragment familyConnectDashboardFragment) {
                this.copydefault = familyConnectDashboardFragment;
            }

            public static final FamilyConnectDashboardUiState ShareDataUIState(State state) {
                int iComponent2 = SendToManyActivity$$ExternalSyntheticLambda4.component2();
                int iComponent22 = SendToManyActivity$$ExternalSyntheticLambda4.component2();
                return (FamilyConnectDashboardUiState) copydefault(SendToManyActivity$$ExternalSyntheticLambda4.component2(), iComponent22, -1663209550, SendToManyActivity$$ExternalSyntheticLambda4.component2(), new Object[]{state}, 1663209551, iComponent2);
            }

            private static final FamilyConnectDashboardUiState component3(State<FamilyConnectDashboardUiState> state) {
                int iComponent2 = SendToManyActivity$$ExternalSyntheticLambda4.component2();
                int iComponent22 = SendToManyActivity$$ExternalSyntheticLambda4.component2();
                return (FamilyConnectDashboardUiState) copydefault(SendToManyActivity$$ExternalSyntheticLambda4.component2(), iComponent22, 854322759, SendToManyActivity$$ExternalSyntheticLambda4.component2(), new Object[]{state}, -854322759, iComponent2);
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component2 + 35;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            copydefault(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = component2 + 83;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 14 / 0;
            }
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void copydefault(androidx.compose.runtime.Composer r12, int r13) {
            /*
                r11 = this;
                r0 = 2
                int r1 = r0 % r0
                r13 = r13 & 11
                if (r13 != r0) goto L2b
                int r13 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDashboardFragment.component2.copydefault
                int r13 = r13 + 93
                int r1 = r13 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDashboardFragment.component2.component2 = r1
                int r13 = r13 % r0
                if (r13 != 0) goto L26
                boolean r13 = r12.getSkipping()
                if (r13 != 0) goto L19
                goto L2b
            L19:
                r12.skipToGroupEnd()
                int r12 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDashboardFragment.component2.component2
                int r12 = r12 + 51
                int r13 = r12 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDashboardFragment.component2.copydefault = r13
                int r12 = r12 % r0
                goto L4d
            L26:
                r12.getSkipping()
                r12 = 0
                throw r12
            L2b:
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDashboardFragment$component2$1 r13 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDashboardFragment$component2$1
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDashboardFragment r7 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDashboardFragment.this
                r13.<init>(r7)
                r7 = 54
                r8 = -1421262341(0xffffffffab4941fb, float:-7.150111E-13)
                r9 = 1
                androidx.compose.runtime.internal.ComposableLambda r13 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(r8, r9, r13, r12, r7)
                r7 = r13
                kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
                r9 = 1572864(0x180000, float:2.204052E-39)
                r10 = 63
                r8 = r12
                com.safaricom.designsystem.theme.OneAppThemeKt.OneAppTheme(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            L4d:
                int r12 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDashboardFragment.component2.copydefault
                int r12 = r12 + 19
                int r13 = r12 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDashboardFragment.component2.component2 = r13
                int r12 = r12 % r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDashboardFragment.component2.copydefault(androidx.compose.runtime.Composer, int):void");
        }

        component2() {
        }
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        getBinding().getRoot().setContent(ComposableLambdaKt.composableLambdaInstance(1639049880, true, new component2()));
        copydefault().loadDashboard();
        int i2 = ShareDataUIState + 69;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private final void ShareDataUIState() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 7;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        copydefault().showBundleList();
        int i4 = ShareDataUIState + 69;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        int i = 1 % 2;
    }
}
