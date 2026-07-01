package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.huawei.digitalpayment.consumer.base.database.entities.mtandao.SpeedTestsHistoryData;
import com.huawei.digitalpayment.consumer.base.database.repository.mtandao.SpeedTestsHistoryDataRepository;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/viewmodels/SpeedTestHistoryViewModel;", "Landroidx/lifecycle/ViewModel;", "speedTestsHistoryDataRepository", "Lcom/huawei/digitalpayment/consumer/base/database/repository/mtandao/SpeedTestsHistoryDataRepository;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/database/repository/mtandao/SpeedTestsHistoryDataRepository;)V", "getAllSpeedTestsData", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huawei/digitalpayment/consumer/base/database/entities/mtandao/SpeedTestsHistoryData;", "getGetAllSpeedTestsData", "()Lkotlinx/coroutines/flow/Flow;", "deleteAllSpeedTestsHistoryData", "Lkotlinx/coroutines/Job;", "insertSpeedTestsHistoryData", "speedTestsHistoryData", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SpeedTestHistoryViewModel extends ViewModel {
    public static final int $stable = 8;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 75 % 128;
    private static int getRequestBeneficiariesState = 1;
    private final Flow<List<SpeedTestsHistoryData>> ShareDataUIState;
    private final SpeedTestsHistoryDataRepository component1;

    public static final SpeedTestsHistoryDataRepository access$getSpeedTestsHistoryDataRepository$p(SpeedTestHistoryViewModel speedTestHistoryViewModel) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 103;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        SpeedTestsHistoryDataRepository speedTestsHistoryDataRepository = speedTestHistoryViewModel.component1;
        if (i4 != 0) {
            int i5 = 75 / 0;
        }
        int i6 = i3 + 119;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 != 0) {
            return speedTestsHistoryDataRepository;
        }
        throw null;
    }

    @Inject
    public SpeedTestHistoryViewModel(SpeedTestsHistoryDataRepository speedTestsHistoryDataRepository) {
        Intrinsics.checkNotNullParameter(speedTestsHistoryDataRepository, "");
        this.component1 = speedTestsHistoryDataRepository;
        this.ShareDataUIState = FlowKt.flowOn(speedTestsHistoryDataRepository.allSpeedTestdata(), Dispatchers.getIO());
    }

    public final Flow<List<SpeedTestsHistoryData>> getGetAllSpeedTestsData() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 75;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        Flow<List<SpeedTestsHistoryData>> flow = this.ShareDataUIState;
        int i5 = i2 + 41;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return flow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Job deleteAllSpeedTestsHistoryData() {
        int i = 2 % 2;
        Job jobShareDataUIState = onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new component1(null), 2, null);
        int i2 = getRequestBeneficiariesState + 57;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return jobShareDataUIState;
        }
        throw null;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestHistoryViewModel$deleteAllSpeedTestsHistoryData$1", f = "SpeedTestHistoryViewModel.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    static final class component1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 1;
        private static int component2;
        int ShareDataUIState;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 23;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.ShareDataUIState;
            if (i4 != 0) {
                int i5 = component2 + 39;
                component1 = i5 % 128;
                if (i5 % 2 != 0 ? i4 != 1 : i4 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.ShareDataUIState = 1;
                if (SpeedTestHistoryViewModel.access$getSpeedTestsHistoryDataRepository$p(SpeedTestHistoryViewModel.this).delete(this) == coroutine_suspended) {
                    int i6 = component2 + 79;
                    component1 = i6 % 128;
                    if (i6 % 2 != 0) {
                        return coroutine_suspended;
                    }
                    throw null;
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
            component1 component1Var = SpeedTestHistoryViewModel.this.new component1(continuation);
            int i2 = component1 + 91;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return component1Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 37;
            component2 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                ShareDataUIState(coroutineScope2, continuation2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objShareDataUIState = ShareDataUIState(coroutineScope2, continuation2);
            int i3 = component2 + 115;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return objShareDataUIState;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 17;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 21 / 0;
            }
            int i5 = component2 + 83;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }
    }

    public final Job insertSpeedTestsHistoryData(SpeedTestsHistoryData speedTestsHistoryData) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(speedTestsHistoryData, "");
        Job jobShareDataUIState = onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new ShareDataUIState(speedTestsHistoryData, null), 2, null);
        int i2 = component3 + 21;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return jobShareDataUIState;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestHistoryViewModel$insertSpeedTestsHistoryData$1", f = "SpeedTestHistoryViewModel.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    static final class ShareDataUIState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 1;
        private static int component3;
        final SpeedTestsHistoryData component2;
        int copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.copydefault;
            if (i2 != 0) {
                int i3 = component1;
                int i4 = i3 + 81;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i3 + 1;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.copydefault = 1;
                if (SpeedTestHistoryViewModel.access$getSpeedTestsHistoryDataRepository$p(SpeedTestHistoryViewModel.this).insert(this.component2, this) == coroutine_suspended) {
                    int i8 = component1 + 81;
                    component3 = i8 % 128;
                    if (i8 % 2 == 0) {
                        return coroutine_suspended;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ShareDataUIState(SpeedTestsHistoryData speedTestsHistoryData, Continuation<? super ShareDataUIState> continuation) {
            super(2, continuation);
            this.component2 = speedTestsHistoryData;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            ShareDataUIState shareDataUIState = SpeedTestHistoryViewModel.this.new ShareDataUIState(this.component2, continuation);
            int i2 = component1 + 73;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return shareDataUIState;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 43;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent3 = component3(coroutineScope, continuation);
            int i4 = component3 + 1;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return objComponent3;
            }
            throw null;
        }

        public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 103;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((ShareDataUIState) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 54 / 0;
            }
            return objInvokeSuspend;
        }
    }

    static {
        if (75 % 2 == 0) {
            throw null;
        }
    }
}
