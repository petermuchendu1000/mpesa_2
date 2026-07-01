package com.huawei.digitalpayment.consumer.base.sim;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.huawei.digitalpayment.consumer.base.repository.SimCardRemovalRepository;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Singleton
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/sim/SimCardRemovalManager;", "", "simCardRemovalRepository", "Lcom/huawei/digitalpayment/consumer/base/repository/SimCardRemovalRepository;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/repository/SimCardRemovalRepository;)V", "_simCardRemovalState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/consumer/base/sim/SimCardRemovalState;", "simCardRemovalState", "Lkotlinx/coroutines/flow/StateFlow;", "getSimCardRemovalState", "()Lkotlinx/coroutines/flow/StateFlow;", "simCardRemovalStateLiveData", "Landroidx/lifecycle/LiveData;", "getSimCardRemovalStateLiveData", "()Landroidx/lifecycle/LiveData;", "updateSimState", "", "isRemoved", "", RemoteConfigConstants.ResponseFieldKey.STATE, "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SimCardRemovalManager {
    private static int copydefault = 0;
    private static int getAsAtTimestamp = 1;
    private final MutableStateFlow<SimCardRemovalState> ShareDataUIState;
    private final LiveData<SimCardRemovalState> component1;
    private final SimCardRemovalRepository component2;
    private final StateFlow<SimCardRemovalState> component3;

    @Inject
    public SimCardRemovalManager(SimCardRemovalRepository simCardRemovalRepository) {
        Intrinsics.checkNotNullParameter(simCardRemovalRepository, "");
        this.component2 = simCardRemovalRepository;
        MutableStateFlow<SimCardRemovalState> MutableStateFlow = StateFlowKt.MutableStateFlow(new SimCardRemovalState(false));
        this.ShareDataUIState = MutableStateFlow;
        this.component3 = MutableStateFlow;
        this.component1 = FlowLiveDataConversions.asLiveData$default(MutableStateFlow, (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public final StateFlow<SimCardRemovalState> getSimCardRemovalState() {
        int i = 2 % 2;
        int i2 = copydefault + 109;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        StateFlow<SimCardRemovalState> stateFlow = this.component3;
        int i5 = i3 + 97;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public final LiveData<SimCardRemovalState> getSimCardRemovalStateLiveData() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 53;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        LiveData<SimCardRemovalState> liveData = this.component1;
        int i4 = i2 + 11;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return liveData;
    }

    public final void updateSimState(boolean isRemoved) {
        int i = 2 % 2;
        SimCardRemovalState simCardRemovalState = new SimCardRemovalState(isRemoved);
        this.ShareDataUIState.setValue(simCardRemovalState);
        this.component2.cacheState(simCardRemovalState);
        int i2 = getAsAtTimestamp + 53;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void updateSimState(SimCardRemovalState state) {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(state, "");
        this.ShareDataUIState.setValue(state);
        int i4 = copydefault + 15;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
