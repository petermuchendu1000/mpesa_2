package com.huawei.digitalpayment.consumer.base.repository;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.base.constants.SPConstant;
import com.huawei.digitalpayment.consumer.base.sim.SimCardRemovalState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u0004\u0018\u00010\tH\u0086@¢\u0006\u0002\u0010\u000bJ\u001c\u0010\f\u001a\u00020\u00072\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00070\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/repository/SimCardRemovalRepository;", "", "<init>", "()V", "ioScope", "Lkotlinx/coroutines/CoroutineScope;", "cacheState", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/huawei/digitalpayment/consumer/base/sim/SimCardRemovalState;", "getCachedState", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCachedStateAsync", "callback", "Lkotlin/Function1;", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SimCardRemovalRepository {
    private static int component3 = 1;
    private static int copydefault;
    private final CoroutineScope component2 = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());

    @Inject
    public SimCardRemovalRepository() {
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.base.repository.SimCardRemovalRepository$cacheState$1", f = "SimCardRemovalRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 1;
        private static int copydefault;
        final SimCardRemovalState ShareDataUIState;
        int component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component3 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = copydefault + 43;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.throwOnFailure(obj);
            if (i3 == 0) {
                SPUtils.getInstance().put(SPConstant.SIM_REMOVAL_CACHE_KEY, this.ShareDataUIState.isSimRemoved());
                Unit unit = Unit.INSTANCE;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            SPUtils.getInstance().put(SPConstant.SIM_REMOVAL_CACHE_KEY, this.ShareDataUIState.isSimRemoved());
            Unit unit2 = Unit.INSTANCE;
            int i4 = component1 + 35;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return unit2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component2(SimCardRemovalState simCardRemovalState, Continuation<? super component2> continuation) {
            super(2, continuation);
            this.ShareDataUIState = simCardRemovalState;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component2 component2Var = new component2(this.ShareDataUIState, continuation);
            int i2 = copydefault + 97;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 60 / 0;
            }
            return component2Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 95;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objCopydefault = copydefault(coroutineScope, continuation);
            int i4 = copydefault + 89;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return objCopydefault;
        }

        public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 89;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = copydefault + 89;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 61 / 0;
            }
            return objInvokeSuspend;
        }
    }

    public final void cacheState(SimCardRemovalState state) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(state, "");
        onSubMenuSelected.ShareDataUIState(this.component2, null, null, new component2(state, null), 3, null);
        int i2 = copydefault + 123;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    public final Object getCachedState(Continuation<? super SimCardRemovalState> continuation) {
        int i = 2 % 2;
        Object obj = null;
        if (!SPUtils.getInstance().contains(SPConstant.SIM_REMOVAL_CACHE_KEY)) {
            int i2 = copydefault + 87;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        SimCardRemovalState simCardRemovalState = new SimCardRemovalState(SPUtils.getInstance().getBoolean(SPConstant.SIM_REMOVAL_CACHE_KEY, false));
        int i4 = copydefault + 45;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return simCardRemovalState;
        }
        obj.hashCode();
        throw null;
    }

    public final void getCachedStateAsync(Function1<? super SimCardRemovalState, Unit> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(callback, "");
        onSubMenuSelected.ShareDataUIState(this.component2, null, null, new copydefault(callback, this, null), 3, null);
        int i2 = component3 + 91;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.base.repository.SimCardRemovalRepository$getCachedStateAsync$1", f = "SimCardRemovalRepository.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int getAsAtTimestamp = 1;
        final SimCardRemovalRepository ShareDataUIState;
        final Function1<SimCardRemovalState, Unit> component2;
        Object component3;
        int copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            Function1 function1;
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 35;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.copydefault;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                Function1<SimCardRemovalState, Unit> function12 = this.component2;
                this.component3 = function12;
                this.copydefault = 1;
                Object cachedState = this.ShareDataUIState.getCachedState(this);
                if (cachedState == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function1 = function12;
                obj = cachedState;
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) this.component3;
                ResultKt.throwOnFailure(obj);
            }
            function1.invoke(obj);
            Unit unit = Unit.INSTANCE;
            int i5 = getAsAtTimestamp + 57;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        copydefault(Function1<? super SimCardRemovalState, Unit> function1, SimCardRemovalRepository simCardRemovalRepository, Continuation<? super copydefault> continuation) {
            super(2, continuation);
            this.component2 = function1;
            this.ShareDataUIState = simCardRemovalRepository;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = new copydefault(this.component2, this.ShareDataUIState, continuation);
            int i2 = getAsAtTimestamp + 3;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return copydefaultVar;
            }
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 79;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent3 = component3(coroutineScope, continuation);
            int i4 = component1 + 79;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 != 0) {
                return objComponent3;
            }
            throw null;
        }

        public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 67;
            getAsAtTimestamp = i2 % 128;
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
}
