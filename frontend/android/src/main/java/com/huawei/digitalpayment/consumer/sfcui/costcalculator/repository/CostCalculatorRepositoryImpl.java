package com.huawei.digitalpayment.consumer.sfcui.costcalculator.repository;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.sfcui.api.CostCalculatorService;
import com.huawei.digitalpayment.consumer.sfcui.api.model.CostCalculatorChargeBand;
import com.huawei.digitalpayment.consumer.sfcui.local.CostCalculatorLocalDataSource;
import com.safaricom.consumer.commons.resource.Resource;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\t2\u0006\u0010\r\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u000fJ$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/repository/CostCalculatorRepositoryImpl;", "Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/repository/CostCalculatorRepository;", "service", "Lcom/huawei/digitalpayment/consumer/sfcui/api/CostCalculatorService;", "localDataSource", "Lcom/huawei/digitalpayment/consumer/sfcui/local/CostCalculatorLocalDataSource;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/api/CostCalculatorService;Lcom/huawei/digitalpayment/consumer/sfcui/local/CostCalculatorLocalDataSource;)V", "getAllCharges", "Lkotlinx/coroutines/flow/Flow;", "Lcom/safaricom/consumer/commons/resource/Resource;", "", "Lcom/huawei/digitalpayment/consumer/sfcui/api/model/CostCalculatorChargeBand;", "forceRefresh", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkLipaTransactionCost", "Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/repository/LipaTransactionCost;", KeysConstants.SHORT_CODE, "", "amount", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CostCalculatorRepositoryImpl implements CostCalculatorRepository {
    public static final int $stable = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copy = 1;
    private static int copydefault;
    private final CostCalculatorService ShareDataUIState;
    private final CostCalculatorLocalDataSource component2;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.costcalculator.repository.CostCalculatorRepositoryImpl", f = "CostCalculatorRepository.kt", i = {0}, l = {65}, m = "checkLipaTransactionCost", n = {KeysConstants.SHORT_CODE}, s = {"L$0"})
    static final class copydefault extends ContinuationImpl {
        private static int copydefault = 0;
        private static int equals = 1;
        Object ShareDataUIState;
        int component2;
        Object component3;

        copydefault(Continuation<? super copydefault> continuation) {
            super(continuation);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = copydefault + 123;
            equals = i2 % 128;
            int i3 = i2 % 2;
            this.component3 = obj;
            this.component2 |= Integer.MIN_VALUE;
            Object objCheckLipaTransactionCost = CostCalculatorRepositoryImpl.this.checkLipaTransactionCost(null, 0, this);
            int i4 = equals + 3;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return objCheckLipaTransactionCost;
            }
            throw null;
        }
    }

    @Inject
    public CostCalculatorRepositoryImpl(CostCalculatorService costCalculatorService, CostCalculatorLocalDataSource costCalculatorLocalDataSource) {
        Intrinsics.checkNotNullParameter(costCalculatorService, "");
        Intrinsics.checkNotNullParameter(costCalculatorLocalDataSource, "");
        this.ShareDataUIState = costCalculatorService;
        this.component2 = costCalculatorLocalDataSource;
    }

    public static final CostCalculatorLocalDataSource access$getLocalDataSource$p(CostCalculatorRepositoryImpl costCalculatorRepositoryImpl) {
        int i = 2 % 2;
        int i2 = component1 + 11;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        Object obj = null;
        CostCalculatorLocalDataSource costCalculatorLocalDataSource = costCalculatorRepositoryImpl.component2;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 23;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return costCalculatorLocalDataSource;
        }
        obj.hashCode();
        throw null;
    }

    public static final CostCalculatorService access$getService$p(CostCalculatorRepositoryImpl costCalculatorRepositoryImpl) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 59;
        copy = i3 % 128;
        int i4 = i3 % 2;
        CostCalculatorService costCalculatorService = costCalculatorRepositoryImpl.ShareDataUIState;
        int i5 = i2 + 87;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return costCalculatorService;
    }

    @Override
    public Object getAllCharges(boolean z, Continuation<? super Flow<? extends Resource<? extends List<CostCalculatorChargeBand>>>> continuation) {
        int i = 2 % 2;
        Flow flow = FlowKt.flow(new ShareDataUIState(z, null));
        int i2 = component1 + 121;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return flow;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/safaricom/consumer/commons/resource/Resource;", "", "Lcom/huawei/digitalpayment/consumer/sfcui/api/model/CostCalculatorChargeBand;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.costcalculator.repository.CostCalculatorRepositoryImpl$getAllCharges$2", f = "CostCalculatorRepository.kt", i = {0, 0, 1, 1, 2, 2}, l = {34, 36, 39, 45, 47, 53, 55}, m = "invokeSuspend", n = {"$this$flow", "cached", "$this$flow", "cached", "$this$flow", "cached"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    static final class ShareDataUIState extends SuspendLambda implements Function2<FlowCollector<? super Resource<? extends List<? extends CostCalculatorChargeBand>>>, Continuation<? super Unit>, Object> {
        private static int getAsAtTimestamp = 1;
        private static int getRequestBeneficiariesState;
        Object ShareDataUIState;
        int component1;
        final boolean component2;
        private Object copydefault;

        /* JADX WARN: Removed duplicated region for block: B:23:0x00a6 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0128  */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instruction units count: 414
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.costcalculator.repository.CostCalculatorRepositoryImpl.ShareDataUIState.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ShareDataUIState(boolean z, Continuation<? super ShareDataUIState> continuation) {
            super(2, continuation);
            this.component2 = z;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            ShareDataUIState shareDataUIState = CostCalculatorRepositoryImpl.this.new ShareDataUIState(this.component2, continuation);
            shareDataUIState.copydefault = obj;
            ShareDataUIState shareDataUIState2 = shareDataUIState;
            int i2 = getRequestBeneficiariesState + 9;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 28 / 0;
            }
            return shareDataUIState2;
        }

        @Override
        public Object invoke(FlowCollector<? super Resource<? extends List<? extends CostCalculatorChargeBand>>> flowCollector, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 5;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            Object objShareDataUIState = ShareDataUIState(flowCollector, continuation);
            int i4 = getRequestBeneficiariesState + 19;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 != 0) {
                return objShareDataUIState;
            }
            throw null;
        }

        public final Object ShareDataUIState(FlowCollector<? super Resource<? extends List<CostCalculatorChargeBand>>> flowCollector, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 75;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((ShareDataUIState) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = getAsAtTimestamp + 71;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object checkLipaTransactionCost(java.lang.String r6, int r7, kotlin.coroutines.Continuation<? super com.safaricom.consumer.commons.resource.Resource<com.huawei.digitalpayment.consumer.sfcui.costcalculator.repository.LipaTransactionCost>> r8) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.repository.CostCalculatorRepositoryImpl.copy
            int r1 = r1 + 45
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.costcalculator.repository.CostCalculatorRepositoryImpl.component1 = r2
            int r1 = r1 % r0
            r3 = 0
            if (r1 != 0) goto L7c
            boolean r1 = r8 instanceof com.huawei.digitalpayment.consumer.sfcui.costcalculator.repository.CostCalculatorRepositoryImpl.copydefault
            if (r1 == 0) goto L31
            int r2 = r2 + 115
            int r1 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.costcalculator.repository.CostCalculatorRepositoryImpl.copy = r1
            int r2 = r2 % r0
            if (r2 == 0) goto L2c
            r1 = r8
            com.huawei.digitalpayment.consumer.sfcui.costcalculator.repository.CostCalculatorRepositoryImpl$copydefault r1 = (com.huawei.digitalpayment.consumer.sfcui.costcalculator.repository.CostCalculatorRepositoryImpl.copydefault) r1
            int r2 = r1.component2
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L31
            int r8 = r1.component2
            int r8 = r8 + r3
            r1.component2 = r8
            goto L3f
        L2c:
            com.huawei.digitalpayment.consumer.sfcui.costcalculator.repository.CostCalculatorRepositoryImpl$copydefault r8 = (com.huawei.digitalpayment.consumer.sfcui.costcalculator.repository.CostCalculatorRepositoryImpl.copydefault) r8
            int r6 = r8.component2
            throw r3
        L31:
            com.huawei.digitalpayment.consumer.sfcui.costcalculator.repository.CostCalculatorRepositoryImpl$copydefault r1 = new com.huawei.digitalpayment.consumer.sfcui.costcalculator.repository.CostCalculatorRepositoryImpl$copydefault
            r1.<init>(r8)
            int r8 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.repository.CostCalculatorRepositoryImpl.component1
            int r8 = r8 + 71
            int r2 = r8 % 128
            com.huawei.digitalpayment.consumer.sfcui.costcalculator.repository.CostCalculatorRepositoryImpl.copy = r2
            int r8 = r8 % r0
        L3f:
            java.lang.Object r8 = r1.component3
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.component2
            r4 = 1
            if (r3 == 0) goto L5c
            if (r3 != r4) goto L54
            java.lang.Object r6 = r1.ShareDataUIState
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r8)
            goto L75
        L54:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L5c:
            kotlin.ResultKt.throwOnFailure(r8)
            com.huawei.digitalpayment.consumer.sfcui.api.CostCalculatorService r8 = r5.ShareDataUIState
            r1.ShareDataUIState = r6
            r1.component2 = r4
            java.lang.Object r8 = r8.getLipaTransactionCost(r6, r7, r1)
            if (r8 != r2) goto L75
            int r6 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.repository.CostCalculatorRepositoryImpl.copy
            int r6 = r6 + 87
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.costcalculator.repository.CostCalculatorRepositoryImpl.component1 = r7
            int r6 = r6 % r0
            return r2
        L75:
            com.safaricom.consumer.commons.resource.Resource r8 = (com.safaricom.consumer.commons.resource.Resource) r8
            com.safaricom.consumer.commons.resource.Resource r6 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.repository.CostCalculatorRepositoryKt.access$toLipaTransactionCost(r8, r6)
            return r6
        L7c:
            boolean r6 = r8 instanceof com.huawei.digitalpayment.consumer.sfcui.costcalculator.repository.CostCalculatorRepositoryImpl.copydefault
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.costcalculator.repository.CostCalculatorRepositoryImpl.checkLipaTransactionCost(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static {
        int i = 1 + 29;
        copydefault = i % 128;
        int i2 = i % 2;
    }
}
