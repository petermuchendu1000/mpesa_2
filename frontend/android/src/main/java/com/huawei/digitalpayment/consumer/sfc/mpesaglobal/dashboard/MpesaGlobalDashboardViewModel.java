package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard.model.MpesaGlobalDashboardItem;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard.model.MpesaGlobalDashboardItemType;
import com.iap.ac.android.acs.operation.log.LogConstants;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.getOnBackInvokedDispatcher;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0016J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\rH\u0002J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0016H\u0002J\u0006\u0010\"\u001a\u00020\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000bR\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/dashboard/MpesaGlobalDashboardViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/dashboard/MpesaGlobalDashboardRepository;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/dashboard/MpesaGlobalDashboardRepository;)V", "_isGridView", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isGridView", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "_openMiniApp", "", "openMiniApp", "getOpenMiniApp", "_launchIntent", "", "launchIntent", "getLaunchIntent", "globalDashboardItems", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/dashboard/model/MpesaGlobalDashboardItem;", "getGlobalDashboardItems", "()Lkotlinx/collections/immutable/ImmutableList;", "globalDashboardItems$delegate", "Lkotlin/Lazy;", "onViewModeChanged", "", "handleItemClick", LogConstants.Mpm.Interceptor.ACTION, "onMiniAppClicked", "miniAppId", "onTransactionClicked", "clearLaunchIntent", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MpesaGlobalDashboardViewModel extends ViewModel {
    public static final int $stable = 8;
    private static int ArtificialStackFrames = 117 % 128;
    private static int copy = 0;
    private static int equals = 1;
    private static int hashCode;
    private final MutableStateFlow<Boolean> ShareDataUIState;
    private final MutableStateFlow<Integer> component1;
    private final MutableStateFlow<String> component2;
    private final Lazy component3;
    private final StateFlow<String> component4;
    private final StateFlow<Boolean> copydefault;
    private final StateFlow<Integer> getAsAtTimestamp;
    private final MpesaGlobalDashboardRepository getRequestBeneficiariesState;

    public static final MpesaGlobalDashboardRepository access$getRepository$p(MpesaGlobalDashboardViewModel mpesaGlobalDashboardViewModel) {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 85;
        copy = i3 % 128;
        int i4 = i3 % 2;
        MpesaGlobalDashboardRepository mpesaGlobalDashboardRepository = mpesaGlobalDashboardViewModel.getRequestBeneficiariesState;
        int i5 = i2 + 63;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            return mpesaGlobalDashboardRepository;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final MutableStateFlow access$get_isGridView$p(MpesaGlobalDashboardViewModel mpesaGlobalDashboardViewModel) {
        int i = 2 % 2;
        int i2 = equals + 57;
        copy = i2 % 128;
        int i3 = i2 % 2;
        MutableStateFlow<Boolean> mutableStateFlow = mpesaGlobalDashboardViewModel.ShareDataUIState;
        if (i3 == 0) {
            return mutableStateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Inject
    public MpesaGlobalDashboardViewModel(MpesaGlobalDashboardRepository mpesaGlobalDashboardRepository) {
        Intrinsics.checkNotNullParameter(mpesaGlobalDashboardRepository, "");
        this.getRequestBeneficiariesState = mpesaGlobalDashboardRepository;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(false);
        this.ShareDataUIState = MutableStateFlow;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<String> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.component2 = MutableStateFlow2;
        this.component4 = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Integer> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.component1 = MutableStateFlow3;
        this.getAsAtTimestamp = FlowKt.asStateFlow(MutableStateFlow3);
        this.component3 = LazyKt.lazy(new Function0() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = component1 + 27;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ImmutableList immutableList$r8$lambda$SwFbXUujAVdh6wA7JfGhgdbrXIU = MpesaGlobalDashboardViewModel.$r8$lambda$SwFbXUujAVdh6wA7JfGhgdbrXIU(this.f$0);
                int i4 = component1 + 71;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return immutableList$r8$lambda$SwFbXUujAVdh6wA7JfGhgdbrXIU;
            }
        });
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass5(null), 3, null);
    }

    public final StateFlow<Boolean> isGridView() {
        int i = 2 % 2;
        int i2 = equals + 115;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        StateFlow<Boolean> stateFlow = this.copydefault;
        int i5 = i3 + 73;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public final StateFlow<String> getOpenMiniApp() {
        int i = 2 % 2;
        int i2 = equals + 105;
        int i3 = i2 % 128;
        copy = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        StateFlow<String> stateFlow = this.component4;
        int i4 = i3 + 33;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return stateFlow;
        }
        obj.hashCode();
        throw null;
    }

    public final StateFlow<Integer> getLaunchIntent() {
        int i = 2 % 2;
        int i2 = equals + 105;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        StateFlow<Integer> stateFlow = this.getAsAtTimestamp;
        int i5 = i3 + 71;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return stateFlow;
        }
        throw null;
    }

    public final ImmutableList<MpesaGlobalDashboardItem> getGlobalDashboardItems() {
        int i = 2 % 2;
        int i2 = equals + 85;
        copy = i2 % 128;
        int i3 = i2 % 2;
        ImmutableList<MpesaGlobalDashboardItem> immutableList = (ImmutableList) this.component3.getValue();
        int i4 = equals + 85;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return immutableList;
    }

    private static final ImmutableList component2(MpesaGlobalDashboardViewModel mpesaGlobalDashboardViewModel) {
        int i = 2 % 2;
        int i2 = copy + 71;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(mpesaGlobalDashboardViewModel, "");
            mpesaGlobalDashboardViewModel.getRequestBeneficiariesState.getInternationalTransactionActions();
            throw null;
        }
        Intrinsics.checkNotNullParameter(mpesaGlobalDashboardViewModel, "");
        ImmutableList<MpesaGlobalDashboardItem> internationalTransactionActions = mpesaGlobalDashboardViewModel.getRequestBeneficiariesState.getInternationalTransactionActions();
        int i3 = equals + 31;
        copy = i3 % 128;
        int i4 = i3 % 2;
        return internationalTransactionActions;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard.MpesaGlobalDashboardViewModel$1", f = "MpesaGlobalDashboardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 1;
        private static int component2;
        int ShareDataUIState;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.ShareDataUIState != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = component2 + 17;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.throwOnFailure(obj);
            MpesaGlobalDashboardViewModel.access$get_isGridView$p(MpesaGlobalDashboardViewModel.this).setValue(MpesaGlobalDashboardViewModel.access$getRepository$p(MpesaGlobalDashboardViewModel.this).isGridViewMode().getValue());
            Unit unit = Unit.INSTANCE;
            int i4 = component1 + 61;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            AnonymousClass5 anonymousClass5 = MpesaGlobalDashboardViewModel.this.new AnonymousClass5(continuation);
            int i2 = component2 + 87;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return anonymousClass5;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 61;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objShareDataUIState = ShareDataUIState(coroutineScope, continuation);
            int i4 = component2 + 25;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return objShareDataUIState;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 3;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component2 + 73;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public static void component1() {
            getOnBackInvokedDispatcher.copydefault[0] = Class.forName("kotlin.time.InstantKt$$ExternalSyntheticLambda2").getDeclaredField("copydefault");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard.MpesaGlobalDashboardViewModel$onViewModeChanged$1", f = "MpesaGlobalDashboardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 1;
        private static int component3;
        final boolean ShareDataUIState;
        int copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.copydefault != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = component3 + 99;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            ResultKt.throwOnFailure(obj);
            if (i3 == 0) {
                MpesaGlobalDashboardViewModel.access$getRepository$p(MpesaGlobalDashboardViewModel.this).setGridViewMode(this.ShareDataUIState);
                MpesaGlobalDashboardViewModel.access$get_isGridView$p(MpesaGlobalDashboardViewModel.this).setValue(Boxing.boxBoolean(this.ShareDataUIState));
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            MpesaGlobalDashboardViewModel.access$getRepository$p(MpesaGlobalDashboardViewModel.this).setGridViewMode(this.ShareDataUIState);
            MpesaGlobalDashboardViewModel.access$get_isGridView$p(MpesaGlobalDashboardViewModel.this).setValue(Boxing.boxBoolean(this.ShareDataUIState));
            Unit unit2 = Unit.INSTANCE;
            int i4 = component1 + 1;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return unit2;
            }
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        copydefault(boolean z, Continuation<? super copydefault> continuation) {
            super(2, continuation);
            this.ShareDataUIState = z;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = MpesaGlobalDashboardViewModel.this.new copydefault(this.ShareDataUIState, continuation);
            int i2 = component1 + 89;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return copydefaultVar;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 115;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objShareDataUIState = ShareDataUIState(coroutineScope, continuation);
            if (i3 != 0) {
                int i4 = 18 / 0;
            }
            return objShareDataUIState;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 31;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((copydefault) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 84 / 0;
            }
            return objInvokeSuspend;
        }
    }

    public final void onViewModeChanged(boolean isGridView) {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new copydefault(isGridView, null), 3, null);
        int i2 = copy + 51;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void handleItemClick(MpesaGlobalDashboardItem action) {
        int i = 2 % 2;
        int i2 = equals + 63;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(action, "");
        MpesaGlobalDashboardItemType itemType = action.getItemType();
        if (!(itemType instanceof MpesaGlobalDashboardItemType.MiniApp)) {
            ShareDataUIState(action);
            return;
        }
        int i4 = equals + 85;
        copy = i4 % 128;
        int i5 = i4 % 2;
        component2(((MpesaGlobalDashboardItemType.MiniApp) itemType).getMiniAppId());
    }

    private final void component2(String str) {
        int i = 2 % 2;
        int i2 = copy + 113;
        equals = i2 % 128;
        int i3 = i2 % 2;
        this.component2.setValue(str);
        int i4 = copy + 91;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void ShareDataUIState(MpesaGlobalDashboardItem mpesaGlobalDashboardItem) {
        int i = 2 % 2;
        int i2 = copy + 117;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            this.component1.setValue(Integer.valueOf(mpesaGlobalDashboardItem.getId()));
            int i3 = 47 / 0;
        } else {
            this.component1.setValue(Integer.valueOf(mpesaGlobalDashboardItem.getId()));
        }
        int i4 = copy + 67;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
    }

    public final void clearLaunchIntent() {
        int i = 2 % 2;
        int i2 = copy + 113;
        equals = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.component1.setValue(null);
        } else {
            this.component1.setValue(null);
            obj.hashCode();
            throw null;
        }
    }

    public static ImmutableList $r8$lambda$SwFbXUujAVdh6wA7JfGhgdbrXIU(MpesaGlobalDashboardViewModel mpesaGlobalDashboardViewModel) {
        int i = 2 % 2;
        int i2 = copy + 91;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            component2(mpesaGlobalDashboardViewModel);
            throw null;
        }
        ImmutableList immutableListComponent2 = component2(mpesaGlobalDashboardViewModel);
        int i3 = copy + 125;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            return immutableListComponent2;
        }
        throw null;
    }

    static {
        int i = 117 % 2;
    }
}
