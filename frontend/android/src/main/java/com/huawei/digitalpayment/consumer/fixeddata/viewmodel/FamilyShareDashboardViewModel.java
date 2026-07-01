package com.huawei.digitalpayment.consumer.fixeddata.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.huawei.common.exception.BaseException;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.base.resp.BalancesResponse;
import com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.familyshare.FamilyShareAddPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.familyshare.FamilyShareAddResource;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.familyshare.FamilyShareBeneficiaryListResponse;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.familyshare.FamilyShareDeletePayload;
import com.huawei.digitalpayment.consumer.fixeddata.domain.repository.FixedDataRepository;
import com.huawei.digitalpayment.consumer.fixeddata.presentation.FixedDataNavKeys;
import com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareEvent;
import com.huawei.payment.mvvm.Resource;
import com.huawei.payment.mvvm.Status;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0018\u001a\u00020\u0019J\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J0\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u0015J\u000e\u0010&\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FamilyShareDashboardViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/repository/FixedDataRepository;", "<init>", "(Lcom/huawei/digitalpayment/consumer/fixeddata/domain/repository/FixedDataRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FamilyShareDashboardUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_events", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FamilyShareEvent;", "events", "Lkotlinx/coroutines/flow/SharedFlow;", "getEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "msisdn", "", "getMsisdn", "()Ljava/lang/String;", "fetchBeneficiaries", "", "parseBalances", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FamilyShareResourceItem;", "balancesResponse", "Lcom/huawei/digitalpayment/consumer/base/resp/BalancesResponse;", "addBeneficiary", "beneficiaryMsisdn", "dataLimit", "minsLimit", "isUnlimited", "", "unlimitedOption", "deleteBeneficiary", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FamilyShareDashboardViewModel extends ViewModel {
    public static final int $stable = 8;
    private static int component4 = 0;
    private static int copy = 1;
    private static int equals = 1;
    private static int getRequestBeneficiariesState;
    private final String ShareDataUIState;
    private final FixedDataRepository component1;
    private final SharedFlow<FamilyShareEvent> component2;
    private final MutableSharedFlow<FamilyShareEvent> component3;
    private final MutableStateFlow<FamilyShareDashboardUiState> copydefault;
    private final StateFlow<FamilyShareDashboardUiState> getAsAtTimestamp;

    public static final FixedDataRepository access$getRepository$p(FamilyShareDashboardViewModel familyShareDashboardViewModel) {
        int i = 2 % 2;
        int i2 = copy + 45;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        FixedDataRepository fixedDataRepository = familyShareDashboardViewModel.component1;
        if (i3 == 0) {
            return fixedDataRepository;
        }
        throw null;
    }

    public static final MutableSharedFlow access$get_events$p(FamilyShareDashboardViewModel familyShareDashboardViewModel) {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 65;
        copy = i3 % 128;
        int i4 = i3 % 2;
        MutableSharedFlow<FamilyShareEvent> mutableSharedFlow = familyShareDashboardViewModel.component3;
        int i5 = i2 + 53;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return mutableSharedFlow;
    }

    public static final MutableStateFlow access$get_uiState$p(FamilyShareDashboardViewModel familyShareDashboardViewModel) {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 19;
        copy = i3 % 128;
        int i4 = i3 % 2;
        MutableStateFlow<FamilyShareDashboardUiState> mutableStateFlow = familyShareDashboardViewModel.copydefault;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 15;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return mutableStateFlow;
    }

    public static final List access$parseBalances(FamilyShareDashboardViewModel familyShareDashboardViewModel, BalancesResponse balancesResponse) {
        int i = 2 % 2;
        int i2 = component4 + 23;
        copy = i2 % 128;
        int i3 = i2 % 2;
        List<FamilyShareResourceItem> listComponent3 = familyShareDashboardViewModel.component3(balancesResponse);
        int i4 = component4 + 99;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return listComponent3;
        }
        throw null;
    }

    @Inject
    public FamilyShareDashboardViewModel(FixedDataRepository fixedDataRepository) {
        String str = "";
        Intrinsics.checkNotNullParameter(fixedDataRepository, "");
        this.component1 = fixedDataRepository;
        MutableStateFlow<FamilyShareDashboardUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(new FamilyShareDashboardUiState(false, null, null, null, 15, null));
        this.copydefault = MutableStateFlow;
        this.getAsAtTimestamp = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<FamilyShareEvent> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.component3 = mutableSharedFlowMutableSharedFlow$default;
        this.component2 = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        String string = SPUtils.getInstance().getString("recent_login_phone_number");
        if (string == null) {
            int i = component4 + 27;
            copy = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } else {
            str = string;
        }
        this.ShareDataUIState = str;
        int i3 = component4 + 123;
        copy = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 50 / 0;
        }
    }

    public final StateFlow<FamilyShareDashboardUiState> getUiState() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 71;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        StateFlow<FamilyShareDashboardUiState> stateFlow = this.getAsAtTimestamp;
        int i5 = i2 + 37;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 0 / 0;
        }
        return stateFlow;
    }

    public final SharedFlow<FamilyShareEvent> getEvents() {
        int i = 2 % 2;
        int i2 = component4 + 101;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        SharedFlow<FamilyShareEvent> sharedFlow = this.component2;
        int i5 = i3 + 23;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return sharedFlow;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component4 + 107;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 115;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void fetchBeneficiaries() {
        int i = 2 % 2;
        Object obj = null;
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new copydefault(null), 3, null);
        int i2 = copy + 73;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel$fetchBeneficiaries$1", f = "FamilyShareDashboardViewModel.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int component1;
        int component2;

        @Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012!\u0010\u0002\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b2!\u0010\t\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000bH\n"}, d2 = {"<anonymous>", "Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FamilyShareDashboardUiState;", "beneficiariesRes", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/familyshare/FamilyShareBeneficiaryListResponse;", "Lkotlin/ParameterName;", "name", "a", "balancesRes", "Lcom/huawei/digitalpayment/consumer/base/resp/BalancesResponse;", "b"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel$fetchBeneficiaries$1$1", f = "FamilyShareDashboardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function3<Resource<HaProxyResponse<FamilyShareBeneficiaryListResponse>>, Resource<HaProxyResponse<BalancesResponse>>, Continuation<? super FamilyShareDashboardUiState>, Object> {
            private static int copy = 1;
            private static int copydefault;
            Object ShareDataUIState;
            final FamilyShareDashboardViewModel component1;
            int component2;
            Object component3;

            /* JADX WARN: Removed duplicated region for block: B:119:0x01e1  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0047 A[PHI: r1 r4
  0x0047: PHI (r1v7 com.huawei.payment.mvvm.Resource) = 
  (r1v6 com.huawei.payment.mvvm.Resource)
  (r1v13 com.huawei.payment.mvvm.Resource)
  (r1v15 com.huawei.payment.mvvm.Resource)
 binds: [B:17:0x0046, B:14:0x0041, B:9:0x002c] A[DONT_GENERATE, DONT_INLINE]
  0x0047: PHI (r4v3 boolean) = (r4v1 boolean), (r4v5 boolean), (r4v7 boolean) binds: [B:17:0x0046, B:14:0x0041, B:9:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0079 A[PHI: r3
  0x0079: PHI (r3v43 java.lang.String) = (r3v14 java.lang.String), (r3v22 java.lang.String), (r3v33 java.lang.String), (r3v48 java.lang.String) binds: [B:85:0x014c, B:66:0x010a, B:57:0x00e7, B:24:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00a4 A[PHI: r6
  0x00a4: PHI (r6v12 com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse) = 
  (r6v11 com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse)
  (r6v17 com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse)
 binds: [B:37:0x00a2, B:34:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00d2  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x00ef  */
            /* JADX WARN: Removed duplicated region for block: B:86:0x014e  */
            @Override
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    Method dump skipped, instruction units count: 517
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel.copydefault.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(FamilyShareDashboardViewModel familyShareDashboardViewModel, Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
                this.component1 = familyShareDashboardViewModel;
            }

            public final Object copydefault(Resource<HaProxyResponse<FamilyShareBeneficiaryListResponse>> resource, Resource<HaProxyResponse<BalancesResponse>> resource2, Continuation<? super FamilyShareDashboardUiState> continuation) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.component1, continuation);
                anonymousClass1.component3 = resource;
                anonymousClass1.ShareDataUIState = resource2;
                Object objInvokeSuspend = anonymousClass1.invokeSuspend(Unit.INSTANCE);
                int i2 = copydefault + 117;
                copy = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 92 / 0;
                }
                return objInvokeSuspend;
            }

            @Override
            public Object invoke(Resource<HaProxyResponse<FamilyShareBeneficiaryListResponse>> resource, Resource<HaProxyResponse<BalancesResponse>> resource2, Continuation<? super FamilyShareDashboardUiState> continuation) {
                int i = 2 % 2;
                int i2 = copy + 1;
                copydefault = i2 % 128;
                Resource<HaProxyResponse<FamilyShareBeneficiaryListResponse>> resource3 = resource;
                Resource<HaProxyResponse<BalancesResponse>> resource4 = resource2;
                if (i2 % 2 == 0) {
                    return copydefault(resource3, resource4, continuation);
                }
                copydefault(resource3, resource4, continuation);
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[PHI: r1
  0x0032: PHI (r1v5 java.lang.Object) = (r1v4 java.lang.Object), (r1v6 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r3
  0x0024: PHI (r3v1 int) = (r3v0 int), (r3v9 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel.copydefault.ShareDataUIState
                int r1 = r1 + 11
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel.copydefault.component1 = r2
                int r1 = r1 % r0
                r2 = 1
                if (r1 == 0) goto L1c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r7.component2
                r4 = 38
                int r4 = r4 / 0
                if (r3 == 0) goto L32
                goto L24
            L1c:
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r7.component2
                if (r3 == 0) goto L32
            L24:
                if (r3 != r2) goto L2a
                kotlin.ResultKt.throwOnFailure(r8)
                goto L81
            L2a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L32:
                kotlin.ResultKt.throwOnFailure(r8)
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel r8 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel.this
                com.huawei.digitalpayment.consumer.fixeddata.domain.repository.FixedDataRepository r8 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel.access$getRepository$p(r8)
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel r3 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel.this
                java.lang.String r3 = r3.getMsisdn()
                kotlinx.coroutines.flow.Flow r8 = r8.getFamilyShareBeneficiaries(r3)
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel r3 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel.this
                com.huawei.digitalpayment.consumer.fixeddata.domain.repository.FixedDataRepository r3 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel.access$getRepository$p(r3)
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel r4 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel.this
                java.lang.String r4 = r4.getMsisdn()
                kotlinx.coroutines.flow.Flow r3 = r3.getFamilyShareBalances(r4)
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel$copydefault$1 r4 = new com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel$copydefault$1
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel r5 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel.this
                r6 = 0
                r4.<init>(r5, r6)
                kotlin.jvm.functions.Function3 r4 = (kotlin.jvm.functions.Function3) r4
                kotlinx.coroutines.flow.Flow r8 = kotlinx.coroutines.flow.FlowKt.combine(r8, r3, r4)
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel$copydefault$2 r3 = new com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel$copydefault$2
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel r4 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel.this
                r3.<init>()
                kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
                r4 = r7
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r7.component2 = r2
                java.lang.Object r8 = r8.collect(r3, r4)
                if (r8 != r1) goto L81
                int r8 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel.copydefault.ShareDataUIState
                int r8 = r8 + 45
                int r2 = r8 % 128
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel.copydefault.component1 = r2
                int r8 = r8 % r0
                return r1
            L81:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel.copydefault.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        copydefault(Continuation<? super copydefault> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = FamilyShareDashboardViewModel.this.new copydefault(continuation);
            int i2 = ShareDataUIState + 51;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 69 / 0;
            }
            return copydefaultVar;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 47;
            ShareDataUIState = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                return component2(coroutineScope2, continuation2);
            }
            component2(coroutineScope2, continuation2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 105;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            copydefault copydefaultVar = (copydefault) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return copydefaultVar.invokeSuspend(unit);
            }
            copydefaultVar.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareResourceItem> component3(com.huawei.digitalpayment.consumer.base.resp.BalancesResponse r8) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel.component3(com.huawei.digitalpayment.consumer.base.resp.BalancesResponse):java.util.List");
    }

    public static void addBeneficiary$default(FamilyShareDashboardViewModel familyShareDashboardViewModel, String str, String str2, String str3, boolean z, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 16) != 0) {
            int i3 = copy + 65;
            int i4 = i3 % 128;
            component4 = i4;
            if (i3 % 2 != 0) {
                int i5 = 95 / 0;
            }
            int i6 = i4 + 125;
            copy = i6 % 128;
            int i7 = i6 % 2;
            str4 = "";
        }
        familyShareDashboardViewModel.addBeneficiary(str, str2, str3, z, str4);
        int i8 = copy + 89;
        component4 = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 66 / 0;
        }
    }

    public final void addBeneficiary(String beneficiaryMsisdn, String dataLimit, String minsLimit, boolean isUnlimited, String unlimitedOption) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(beneficiaryMsisdn, "");
        Intrinsics.checkNotNullParameter(dataLimit, "");
        Intrinsics.checkNotNullParameter(minsLimit, "");
        Intrinsics.checkNotNullParameter(unlimitedOption, "");
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new component1(isUnlimited, unlimitedOption, dataLimit, minsLimit, beneficiaryMsisdn, null), 3, null);
        int i2 = copy + 21;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel$addBeneficiary$1", f = "FamilyShareDashboardViewModel.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, s = {})
    static final class component1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int getAsAtTimestamp = 1;
        private static int getRequestBeneficiariesState;
        final String ShareDataUIState;
        final String component1;
        final String component2;
        final boolean component3;
        final String copydefault;
        int equals;

        @Override
        public final Object invokeSuspend(Object obj) {
            Object value;
            boolean zAdd;
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 91;
            getRequestBeneficiariesState = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                obj2.hashCode();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.equals;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow mutableStateFlowAccess$get_uiState$p = FamilyShareDashboardViewModel.access$get_uiState$p(FamilyShareDashboardViewModel.this);
                do {
                    value = mutableStateFlowAccess$get_uiState$p.getValue();
                } while (!mutableStateFlowAccess$get_uiState$p.compareAndSet(value, FamilyShareDashboardUiState.copy$default((FamilyShareDashboardUiState) value, true, null, null, null, 14, null)));
                ArrayList arrayList = new ArrayList();
                if (this.component3) {
                    String str = this.copydefault;
                    if (Intrinsics.areEqual(str, FixedDataNavKeys.UNLIMITED_DATA_ONLY)) {
                        zAdd = arrayList.add(new FamilyShareAddResource("DATA", "UNLIMITED", null, null));
                        int i4 = getAsAtTimestamp + 31;
                        getRequestBeneficiariesState = i4 % 128;
                        int i5 = i4 % 2;
                    } else if (Intrinsics.areEqual(str, FixedDataNavKeys.UNLIMITED_MINS_ONLY)) {
                        zAdd = arrayList.add(new FamilyShareAddResource("VOICE", "UNLIMITED", null, null));
                    } else {
                        arrayList.add(new FamilyShareAddResource("DATA", "UNLIMITED", null, null));
                        zAdd = arrayList.add(new FamilyShareAddResource("VOICE", "UNLIMITED", null, null));
                    }
                    Boxing.boxBoolean(zAdd);
                } else {
                    if (!StringsKt.isBlank(this.component1)) {
                        arrayList.add(new FamilyShareAddResource("DATA", "CAPPED", StringsKt.toIntOrNull(this.component1), null, 8, null));
                    }
                    if (!StringsKt.isBlank(this.component2)) {
                        arrayList.add(new FamilyShareAddResource("VOICE", "CAPPED", null, StringsKt.toIntOrNull(this.component2), 4, null));
                    }
                }
                Flow<Resource<HaProxyResponse<Object>>> flowAddFamilyShareBeneficiary = FamilyShareDashboardViewModel.access$getRepository$p(FamilyShareDashboardViewModel.this).addFamilyShareBeneficiary(new FamilyShareAddPayload(FamilyShareDashboardViewModel.this.getMsisdn(), this.ShareDataUIState, arrayList));
                final FamilyShareDashboardViewModel familyShareDashboardViewModel = FamilyShareDashboardViewModel.this;
                this.equals = 1;
                if (flowAddFamilyShareBeneficiary.collect(new FlowCollector() {
                    private static int ShareDataUIState = 0;
                    private static int component1 = 1;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    public final class WhenMappings {
                        public static final int[] $EnumSwitchMapping$0;
                        private static int component2 = 1;
                        private static int copydefault;

                        static {
                            int[] iArr = new int[Status.values().length];
                            try {
                                iArr[Status.SUCCESS.ordinal()] = 1;
                                int i = component2 + 51;
                                copydefault = i % 128;
                                int i2 = i % 2;
                                int i3 = 2 % 2;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[Status.ERROR.ordinal()] = 2;
                                int i4 = copydefault + 119;
                                component2 = i4 % 128;
                                if (i4 % 2 != 0) {
                                    int i5 = 2 % 2;
                                }
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[Status.LOADING.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override
                    public Object emit(Object obj3, Continuation continuation) {
                        int i6 = 2 % 2;
                        int i7 = component1 + 93;
                        ShareDataUIState = i7 % 128;
                        int i8 = i7 % 2;
                        Object objComponent1 = component1((Resource) obj3, continuation);
                        int i9 = ShareDataUIState + 3;
                        component1 = i9 % 128;
                        if (i9 % 2 != 0) {
                            return objComponent1;
                        }
                        throw null;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final Object component1(Resource<HaProxyResponse<Object>> resource, Continuation<? super Unit> continuation) {
                        int i6;
                        Object value2;
                        HaProxyResponse.Header header;
                        HaProxyResponse.Header header2;
                        Object value3;
                        Object value4;
                        int i7 = 2 % 2;
                        Status status = resource.getStatus();
                        if (status == null) {
                            int i8 = component1 + 69;
                            ShareDataUIState = i8 % 128;
                            int i9 = i8 % 2;
                            i6 = -1;
                        } else {
                            i6 = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
                        }
                        if (i6 != 1) {
                            if (i6 != 2) {
                                if (i6 == 3) {
                                    MutableStateFlow mutableStateFlowAccess$get_uiState$p2 = FamilyShareDashboardViewModel.access$get_uiState$p(familyShareDashboardViewModel);
                                    do {
                                        value4 = mutableStateFlowAccess$get_uiState$p2.getValue();
                                    } while (!mutableStateFlowAccess$get_uiState$p2.compareAndSet(value4, FamilyShareDashboardUiState.copy$default((FamilyShareDashboardUiState) value4, true, null, null, null, 14, null)));
                                }
                                return Unit.INSTANCE;
                            }
                            MutableStateFlow mutableStateFlowAccess$get_uiState$p3 = FamilyShareDashboardViewModel.access$get_uiState$p(familyShareDashboardViewModel);
                            do {
                                value3 = mutableStateFlowAccess$get_uiState$p3.getValue();
                            } while (!mutableStateFlowAccess$get_uiState$p3.compareAndSet(value3, FamilyShareDashboardUiState.copy$default((FamilyShareDashboardUiState) value3, false, null, null, null, 14, null)));
                            int i10 = ShareDataUIState + 101;
                            component1 = i10 % 128;
                            int i11 = i10 % 2;
                            MutableSharedFlow mutableSharedFlowAccess$get_events$p = FamilyShareDashboardViewModel.access$get_events$p(familyShareDashboardViewModel);
                            BaseException exception = resource.getException();
                            message = exception != null ? exception.getMessage() : null;
                            Object objEmit = mutableSharedFlowAccess$get_events$p.emit(new FamilyShareEvent.AddError(message != null ? message : ""), continuation);
                            return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
                        }
                        MutableStateFlow mutableStateFlowAccess$get_uiState$p4 = FamilyShareDashboardViewModel.access$get_uiState$p(familyShareDashboardViewModel);
                        do {
                            value2 = mutableStateFlowAccess$get_uiState$p4.getValue();
                        } while (!mutableStateFlowAccess$get_uiState$p4.compareAndSet(value2, FamilyShareDashboardUiState.copy$default((FamilyShareDashboardUiState) value2, false, null, null, null, 14, null)));
                        HaProxyResponse<Object> data = resource.getData();
                        Integer responseCode = (data == null || (header2 = data.getHeader()) == null) ? null : header2.getResponseCode();
                        HaProxyResponse<Object> data2 = resource.getData();
                        String customerMessage = (data2 == null || (header = data2.getHeader()) == null) ? null : header.getCustomerMessage();
                        if (responseCode != null && responseCode.intValue() == 200) {
                            Object objEmit2 = FamilyShareDashboardViewModel.access$get_events$p(familyShareDashboardViewModel).emit(new FamilyShareEvent.AddSuccess(customerMessage != null ? customerMessage : ""), continuation);
                            if (objEmit2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                return Unit.INSTANCE;
                            }
                            int i12 = component1 + 119;
                            ShareDataUIState = i12 % 128;
                            if (i12 % 2 == 0) {
                                return objEmit2;
                            }
                            throw null;
                        }
                        Object objEmit3 = FamilyShareDashboardViewModel.access$get_events$p(familyShareDashboardViewModel).emit(new FamilyShareEvent.AddError(customerMessage != null ? customerMessage : ""), continuation);
                        if (objEmit3 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            return Unit.INSTANCE;
                        }
                        int i13 = component1 + 1;
                        ShareDataUIState = i13 % 128;
                        if (i13 % 2 == 0) {
                            return objEmit3;
                        }
                        message.hashCode();
                        throw null;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i6 = getRequestBeneficiariesState + 95;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component1(boolean z, String str, String str2, String str3, String str4, Continuation<? super component1> continuation) {
            super(2, continuation);
            this.component3 = z;
            this.copydefault = str;
            this.component1 = str2;
            this.component2 = str3;
            this.ShareDataUIState = str4;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component1 component1Var = FamilyShareDashboardViewModel.this.new component1(this.component3, this.copydefault, this.component1, this.component2, this.ShareDataUIState, continuation);
            int i2 = getAsAtTimestamp + 59;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            return component1Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 99;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            Object objCopydefault = copydefault(coroutineScope, continuation);
            if (i3 != 0) {
                int i4 = 66 / 0;
            }
            int i5 = getRequestBeneficiariesState + 75;
            getAsAtTimestamp = i5 % 128;
            if (i5 % 2 != 0) {
                return objCopydefault;
            }
            throw null;
        }

        public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 41;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = getRequestBeneficiariesState + 5;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void deleteBeneficiary(String beneficiaryMsisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(beneficiaryMsisdn, "");
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new component2(beneficiaryMsisdn, null), 3, null);
        int i2 = copy + 33;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 58 / 0;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel$deleteBeneficiary$1", f = "FamilyShareDashboardViewModel.kt", i = {}, l = {WSContextConstant.HANDSHAKE_RECEIVE_SIZE}, m = "invokeSuspend", n = {}, s = {})
    static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component2 = 0;
        private static int component3 = 1;
        int ShareDataUIState;
        final String component1;

        @Override
        public final Object invokeSuspend(Object obj) {
            Object value;
            int i = 2 % 2;
            int i2 = component3 + 69;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.ShareDataUIState;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow mutableStateFlowAccess$get_uiState$p = FamilyShareDashboardViewModel.access$get_uiState$p(FamilyShareDashboardViewModel.this);
                int i4 = component3 + 13;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                do {
                    value = mutableStateFlowAccess$get_uiState$p.getValue();
                } while (!mutableStateFlowAccess$get_uiState$p.compareAndSet(value, FamilyShareDashboardUiState.copy$default((FamilyShareDashboardUiState) value, true, null, null, null, 14, null)));
                Flow<Resource<HaProxyResponse<Object>>> flowDeleteFamilyShareBeneficiary = FamilyShareDashboardViewModel.access$getRepository$p(FamilyShareDashboardViewModel.this).deleteFamilyShareBeneficiary(new FamilyShareDeletePayload(FamilyShareDashboardViewModel.this.getMsisdn(), this.component1));
                final FamilyShareDashboardViewModel familyShareDashboardViewModel = FamilyShareDashboardViewModel.this;
                this.ShareDataUIState = 1;
                if (flowDeleteFamilyShareBeneficiary.collect(new FlowCollector() {
                    private static int component2 = 1;
                    private static int component3;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    public final class WhenMappings {
                        public static final int[] $EnumSwitchMapping$0;
                        private static int component1 = 1;
                        private static int component3;

                        static {
                            int[] iArr = new int[Status.values().length];
                            try {
                                iArr[Status.SUCCESS.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[Status.ERROR.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[Status.LOADING.ordinal()] = 3;
                                int i = component3 + 125;
                                component1 = i % 128;
                                if (i % 2 != 0) {
                                    int i2 = 2 % 2;
                                }
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                            int i3 = component1 + 25;
                            component3 = i3 % 128;
                            int i4 = i3 % 2;
                        }
                    }

                    @Override
                    public Object emit(Object obj2, Continuation continuation) {
                        int i6 = 2 % 2;
                        int i7 = component3 + 59;
                        component2 = i7 % 128;
                        Object obj3 = null;
                        Resource<HaProxyResponse<Object>> resource = (Resource) obj2;
                        if (i7 % 2 == 0) {
                            component3(resource, continuation);
                            obj3.hashCode();
                            throw null;
                        }
                        Object objComponent3 = component3(resource, continuation);
                        int i8 = component3 + 3;
                        component2 = i8 % 128;
                        if (i8 % 2 != 0) {
                            return objComponent3;
                        }
                        obj3.hashCode();
                        throw null;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final Object component3(Resource<HaProxyResponse<Object>> resource, Continuation<? super Unit> continuation) {
                        String str;
                        Object value2;
                        HaProxyResponse.Header header;
                        HaProxyResponse.Header header2;
                        Object value3;
                        Object value4;
                        int i6 = 2 % 2;
                        int i7 = component3 + 117;
                        component2 = i7 % 128;
                        if (i7 % 2 == 0) {
                            resource.getStatus();
                            customerMessage.hashCode();
                            throw null;
                        }
                        Status status = resource.getStatus();
                        int i8 = status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
                        str = "";
                        if (i8 != 1) {
                            if (i8 == 2) {
                                MutableStateFlow mutableStateFlowAccess$get_uiState$p2 = FamilyShareDashboardViewModel.access$get_uiState$p(familyShareDashboardViewModel);
                                do {
                                    value3 = mutableStateFlowAccess$get_uiState$p2.getValue();
                                } while (!mutableStateFlowAccess$get_uiState$p2.compareAndSet(value3, FamilyShareDashboardUiState.copy$default((FamilyShareDashboardUiState) value3, false, null, null, null, 14, null)));
                                MutableSharedFlow mutableSharedFlowAccess$get_events$p = FamilyShareDashboardViewModel.access$get_events$p(familyShareDashboardViewModel);
                                BaseException exception = resource.getException();
                                customerMessage = exception != null ? exception.getMessage() : null;
                                Object objEmit = mutableSharedFlowAccess$get_events$p.emit(new FamilyShareEvent.DeleteError(customerMessage != null ? customerMessage : ""), continuation);
                                return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
                            }
                            int i9 = component3 + 79;
                            component2 = i9 % 128;
                            if (i9 % 2 != 0 ? i8 == 3 : i8 == 2) {
                                MutableStateFlow mutableStateFlowAccess$get_uiState$p3 = FamilyShareDashboardViewModel.access$get_uiState$p(familyShareDashboardViewModel);
                                do {
                                    value4 = mutableStateFlowAccess$get_uiState$p3.getValue();
                                } while (!mutableStateFlowAccess$get_uiState$p3.compareAndSet(value4, FamilyShareDashboardUiState.copy$default((FamilyShareDashboardUiState) value4, true, null, null, null, 14, null)));
                            }
                            return Unit.INSTANCE;
                        }
                        MutableStateFlow mutableStateFlowAccess$get_uiState$p4 = FamilyShareDashboardViewModel.access$get_uiState$p(familyShareDashboardViewModel);
                        do {
                            value2 = mutableStateFlowAccess$get_uiState$p4.getValue();
                        } while (!mutableStateFlowAccess$get_uiState$p4.compareAndSet(value2, FamilyShareDashboardUiState.copy$default((FamilyShareDashboardUiState) value2, false, null, null, null, 14, null)));
                        HaProxyResponse<Object> data = resource.getData();
                        Integer responseCode = (data == null || (header2 = data.getHeader()) == null) ? null : header2.getResponseCode();
                        HaProxyResponse<Object> data2 = resource.getData();
                        if (data2 != null && (header = data2.getHeader()) != null) {
                            int i10 = component2 + 121;
                            component3 = i10 % 128;
                            int i11 = i10 % 2;
                            customerMessage = header.getCustomerMessage();
                        }
                        if (responseCode != null && responseCode.intValue() == 200) {
                            Object objEmit2 = FamilyShareDashboardViewModel.access$get_events$p(familyShareDashboardViewModel).emit(new FamilyShareEvent.DeleteSuccess(customerMessage != null ? customerMessage : ""), continuation);
                            return objEmit2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit2 : Unit.INSTANCE;
                        }
                        MutableSharedFlow mutableSharedFlowAccess$get_events$p2 = FamilyShareDashboardViewModel.access$get_events$p(familyShareDashboardViewModel);
                        if (customerMessage != null) {
                            int i12 = component2 + 75;
                            component3 = i12 % 128;
                            int i13 = i12 % 2;
                            str = customerMessage;
                        }
                        Object objEmit3 = mutableSharedFlowAccess$get_events$p2.emit(new FamilyShareEvent.DeleteError(str), continuation);
                        if (objEmit3 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            return objEmit3;
                        }
                        Unit unit = Unit.INSTANCE;
                        int i14 = component3 + 23;
                        component2 = i14 % 128;
                        int i15 = i14 % 2;
                        return unit;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component2(String str, Continuation<? super component2> continuation) {
            super(2, continuation);
            this.component1 = str;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component2 component2Var = FamilyShareDashboardViewModel.this.new component2(this.component1, continuation);
            int i2 = component2 + 121;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return component2Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 47;
            component3 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                component1(coroutineScope2, continuation2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objComponent1 = component1(coroutineScope2, continuation2);
            int i3 = component3 + 99;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            return objComponent1;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 3;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            component2 component2Var = (component2) create(coroutineScope, continuation);
            if (i3 != 0) {
                component2Var.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = component2Var.invokeSuspend(Unit.INSTANCE);
            int i4 = component3 + 113;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    static {
        int i = 1 + 67;
        getRequestBeneficiariesState = i % 128;
        int i2 = i % 2;
    }
}
