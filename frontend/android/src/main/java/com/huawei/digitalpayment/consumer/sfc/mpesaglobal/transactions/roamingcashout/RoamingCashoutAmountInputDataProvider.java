package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout;

import com.huawei.digitalpayment.home.util.BalanceHelper;
import com.safaricom.android.design.templates.amountinput.model.OverdraftInfo;
import com.safaricom.android.design.templates.amountinput.model.Wallet;
import com.safaricom.android.design.templates.amountinput.provider.AmountInputDataProvider;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Singleton
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/RoamingCashoutAmountInputDataProvider;", "Lcom/safaricom/android/design/templates/amountinput/provider/AmountInputDataProvider;", "<init>", "()V", "balance", "Lkotlinx/coroutines/flow/Flow;", "", "getBalance", "()Lkotlinx/coroutines/flow/Flow;", "isBalanceOutdated", "", "overdraftInfo", "Lcom/safaricom/android/design/templates/amountinput/model/OverdraftInfo;", "getOverdraftInfo", "accountWallets", "", "Lcom/safaricom/android/design/templates/amountinput/model/Wallet;", "getAccountWallets", "showMultipleWalletTooltip", "getShowMultipleWalletTooltip", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoamingCashoutAmountInputDataProvider implements AmountInputDataProvider {
    public static final int $stable = 8;
    private static int component4 = 0;
    private static int copy = 1;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private final Flow<Boolean> ShareDataUIState;
    private final Flow<List<Wallet>> component1;
    private final Flow<Boolean> component2;
    private final Flow<Double> component3;
    private final Flow<OverdraftInfo> copydefault;

    @Inject
    public RoamingCashoutAmountInputDataProvider() {
        Double dValueOf;
        String balance = BalanceHelper.INSTANCE.getBalance2().getValue().getBalance();
        if (balance != null) {
            dValueOf = Double.valueOf(Double.parseDouble(balance));
            int i = getAsAtTimestamp + 65;
            component4 = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } else {
            int i4 = getAsAtTimestamp + 27;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            dValueOf = null;
        }
        this.component3 = FlowKt.flowOf(dValueOf);
        this.component2 = FlowKt.combine(FlowKt.flow(new component1(null)), FlowKt.flow(new component3(null)), new copydefault(null));
        this.copydefault = FlowKt.flow(new component2(null));
        this.component1 = FlowKt.flow(new ShareDataUIState(null));
        this.ShareDataUIState = FlowKt.flow(new getRequestBeneficiariesState(null));
    }

    @Override
    public Flow<Double> getBalance() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 91;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        Flow<Double> flow = this.component3;
        int i5 = i2 + 27;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return flow;
        }
        throw null;
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashoutAmountInputDataProvider$isBalanceOutdated$1", f = "RoamingCashoutAmountInputDataProvider.kt", i = {}, l = {20}, m = "invokeSuspend", n = {}, s = {})
    static final class component1 extends SuspendLambda implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int component2 = 1;
        private Object ShareDataUIState;
        int copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 39;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.copydefault;
            if (i4 != 0) {
                int i5 = component1 + 117;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i7 = component2 + 1;
                component1 = i7 % 128;
                int i8 = i7 % 2;
            } else {
                ResultKt.throwOnFailure(obj);
                this.copydefault = 1;
                if (((FlowCollector) this.ShareDataUIState).emit(Boxing.boxBoolean(BalanceHelper.INSTANCE.getNeedRefresh()), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        component1(Continuation<? super component1> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component1 component1Var = new component1(continuation);
            component1Var.ShareDataUIState = obj;
            component1 component1Var2 = component1Var;
            int i2 = component1 + 83;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return component1Var2;
        }

        @Override
        public Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 43;
            component2 = i2 % 128;
            FlowCollector<? super Boolean> flowCollector2 = flowCollector;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                component1(flowCollector2, continuation2);
                throw null;
            }
            Object objComponent1 = component1(flowCollector2, continuation2);
            int i3 = component1 + 105;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            return objComponent1;
        }

        public final Object component1(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 47;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            component1 component1Var = (component1) create(flowCollector, continuation);
            if (i3 != 0) {
                component1Var.invokeSuspend(Unit.INSTANCE);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = component1Var.invokeSuspend(Unit.INSTANCE);
            int i4 = component1 + 91;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashoutAmountInputDataProvider$isBalanceOutdated$2", f = "RoamingCashoutAmountInputDataProvider.kt", i = {}, l = {20}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
        private static int component2 = 1;
        private static int component3;
        private Object component1;
        int copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 103;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.copydefault;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                this.copydefault = 1;
                if (((FlowCollector) this.component1).emit(Boxing.boxBoolean(false), this) == coroutine_suspended) {
                    int i5 = component3 + 15;
                    component2 = i5 % 128;
                    if (i5 % 2 != 0) {
                        return coroutine_suspended;
                    }
                    throw null;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
            component3 component3Var = new component3(continuation);
            component3Var.component1 = obj;
            component3 component3Var2 = component3Var;
            int i2 = component3 + 119;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return component3Var2;
        }

        @Override
        public Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
            Object objShareDataUIState;
            int i = 2 % 2;
            int i2 = component2 + 117;
            component3 = i2 % 128;
            FlowCollector<? super Boolean> flowCollector2 = flowCollector;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                objShareDataUIState = ShareDataUIState(flowCollector2, continuation2);
                int i3 = 56 / 0;
            } else {
                objShareDataUIState = ShareDataUIState(flowCollector2, continuation2);
            }
            int i4 = component3 + 25;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return objShareDataUIState;
        }

        public final Object ShareDataUIState(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 89;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component3) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 54 / 0;
            }
            int i5 = component3 + 107;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }
    }

    @Override
    public Flow<Boolean> isBalanceOutdated() {
        int i = 2 % 2;
        int i2 = component4 + 17;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        Flow<Boolean> flow = this.component2;
        int i5 = i3 + 65;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return flow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u00052\u0015\u0010\u0006\u001a\u00110\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007H\n"}, d2 = {"<anonymous>", "", "balanceUpdated", "Lkotlin/ParameterName;", "name", "a", "overdrawUpdated", "b"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashoutAmountInputDataProvider$isBalanceOutdated$3", f = "RoamingCashoutAmountInputDataProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object> {
        private static int component3 = 1;
        private static int copydefault;
        int ShareDataUIState;
        boolean component1;
        boolean component2;

        /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[PHI: r1
  0x0030: PHI (r1v9 boolean) = (r1v8 boolean), (r1v11 boolean) binds: [B:10:0x002e, B:7:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashoutAmountInputDataProvider.copydefault.copydefault
                int r1 = r1 + 107
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashoutAmountInputDataProvider.copydefault.component3 = r2
                int r1 = r1 % r0
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.ShareDataUIState
                if (r1 != 0) goto L4a
                int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashoutAmountInputDataProvider.copydefault.component3
                int r1 = r1 + 11
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashoutAmountInputDataProvider.copydefault.copydefault = r2
                int r1 = r1 % r0
                r2 = 0
                kotlin.ResultKt.throwOnFailure(r5)
                boolean r5 = r4.component2
                if (r1 == 0) goto L2c
                boolean r1 = r4.component1
                r3 = 63
                int r3 = r3 / r2
                if (r5 == 0) goto L3b
                goto L30
            L2c:
                boolean r1 = r4.component1
                if (r5 == 0) goto L3b
            L30:
                int r5 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashoutAmountInputDataProvider.copydefault.component3
                int r5 = r5 + 39
                int r3 = r5 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashoutAmountInputDataProvider.copydefault.copydefault = r3
                int r5 = r5 % r0
                if (r1 != 0) goto L45
            L3b:
                int r5 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashoutAmountInputDataProvider.copydefault.component3
                int r5 = r5 + 83
                int r1 = r5 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashoutAmountInputDataProvider.copydefault.copydefault = r1
                int r5 = r5 % r0
                r2 = 1
            L45:
                java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
                return r5
            L4a:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashoutAmountInputDataProvider.copydefault.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        copydefault(Continuation<? super copydefault> continuation) {
            super(3, continuation);
        }

        @Override
        public Object invoke(Boolean bool, Boolean bool2, Continuation<? super Boolean> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 25;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent3 = component3(bool.booleanValue(), bool2.booleanValue(), continuation);
            int i4 = component3 + 111;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return objComponent3;
            }
            throw null;
        }

        public final Object component3(boolean z, boolean z2, Continuation<? super Boolean> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = new copydefault(continuation);
            copydefaultVar.component2 = z;
            copydefaultVar.component1 = z2;
            Object objInvokeSuspend = copydefaultVar.invokeSuspend(Unit.INSTANCE);
            int i2 = copydefault + 35;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/safaricom/android/design/templates/amountinput/model/OverdraftInfo;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashoutAmountInputDataProvider$overdraftInfo$1", f = "RoamingCashoutAmountInputDataProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class component2 extends SuspendLambda implements Function2<FlowCollector<? super OverdraftInfo>, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int component2;
        int component1;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 103;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component1 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = ShareDataUIState + 43;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            ResultKt.throwOnFailure(obj);
            Unit unit = Unit.INSTANCE;
            int i6 = ShareDataUIState + 125;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        component2(Continuation<? super component2> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component2 component2Var = new component2(continuation);
            int i2 = component2 + 83;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return component2Var;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override
        public Object invoke(FlowCollector<? super OverdraftInfo> flowCollector, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 107;
            component2 = i2 % 128;
            FlowCollector<? super OverdraftInfo> flowCollector2 = flowCollector;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                return component1(flowCollector2, continuation2);
            }
            Object objComponent1 = component1(flowCollector2, continuation2);
            int i3 = 81 / 0;
            return objComponent1;
        }

        public final Object component1(FlowCollector<? super OverdraftInfo> flowCollector, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 17;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            component2 component2Var = (component2) create(flowCollector, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                component2Var.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = component2Var.invokeSuspend(unit);
            int i4 = ShareDataUIState + 7;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    @Override
    public Flow<OverdraftInfo> getOverdraftInfo() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 91;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Flow<OverdraftInfo> flow = this.copydefault;
        int i4 = i3 + 45;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return flow;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/safaricom/android/design/templates/amountinput/model/Wallet;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashoutAmountInputDataProvider$accountWallets$1", f = "RoamingCashoutAmountInputDataProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class ShareDataUIState extends SuspendLambda implements Function2<FlowCollector<? super List<? extends Wallet>>, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int copydefault = 1;
        int component2;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 9;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                throw null;
            }
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component2 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Unit unit = Unit.INSTANCE;
            int i3 = component1 + 69;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }

        ShareDataUIState(Continuation<? super ShareDataUIState> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            ShareDataUIState shareDataUIState = new ShareDataUIState(continuation);
            int i2 = component1 + 125;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return shareDataUIState;
        }

        @Override
        public Object invoke(FlowCollector<? super List<? extends Wallet>> flowCollector, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 93;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent2 = component2(flowCollector, continuation);
            if (i3 == 0) {
                int i4 = 30 / 0;
            }
            int i5 = copydefault + 97;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 25 / 0;
            }
            return objComponent2;
        }

        public final Object component2(FlowCollector<? super List<Wallet>> flowCollector, Continuation<? super Unit> continuation) {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = copydefault + 115;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            ShareDataUIState shareDataUIState = (ShareDataUIState) create(flowCollector, continuation);
            if (i3 != 0) {
                objInvokeSuspend = shareDataUIState.invokeSuspend(Unit.INSTANCE);
                int i4 = 36 / 0;
            } else {
                objInvokeSuspend = shareDataUIState.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = copydefault + 15;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }
    }

    @Override
    public Flow<List<Wallet>> getAccountWallets() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 77;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        Flow<List<Wallet>> flow = this.component1;
        int i5 = i3 + 93;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 2 / 0;
        }
        return flow;
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashoutAmountInputDataProvider$showMultipleWalletTooltip$1", f = "RoamingCashoutAmountInputDataProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class getRequestBeneficiariesState extends SuspendLambda implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int copydefault = 1;
        int ShareDataUIState;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 9;
            copydefault = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                throw null;
            }
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.ShareDataUIState != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Unit unit = Unit.INSTANCE;
            int i3 = copydefault + 47;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }

        getRequestBeneficiariesState(Continuation<? super getRequestBeneficiariesState> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            getRequestBeneficiariesState getrequestbeneficiariesstate = new getRequestBeneficiariesState(continuation);
            int i2 = copydefault + 3;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return getrequestbeneficiariesstate;
        }

        @Override
        public Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 117;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent2 = component2(flowCollector, continuation);
            int i4 = component1 + 63;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 48 / 0;
            }
            return objComponent2;
        }

        public final Object component2(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 9;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((getRequestBeneficiariesState) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = copydefault + 109;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }
    }

    @Override
    public Flow<Boolean> getShowMultipleWalletTooltip() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 13;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    static {
        int i = 1 + 49;
        getRequestBeneficiariesState = i % 128;
        int i2 = i % 2;
    }
}
