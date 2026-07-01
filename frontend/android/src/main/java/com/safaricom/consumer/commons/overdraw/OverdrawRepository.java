package com.safaricom.consumer.commons.overdraw;

import com.safaricom.consumer.commons.resource.Resource;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000f\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\tR\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/safaricom/consumer/commons/overdraw/OverdrawRepository;", "", "<init>", "()V", "_isOverdrawUpdated", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "isOverdrawUpdated", "Lkotlinx/coroutines/flow/SharedFlow;", "()Lkotlinx/coroutines/flow/SharedFlow;", "_overdrawData", "Lcom/safaricom/consumer/commons/resource/Resource;", "Lcom/safaricom/consumer/commons/overdraw/OverdrawInformation;", "overdrawData", "getOverdrawData", "isOverdrawEnabled", "hasUserOptedIn", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OverdrawRepository {
    private final MutableSharedFlow<Resource<OverdrawInformation>> ShareDataUIState;
    private final SharedFlow<Boolean> component1;
    private final SharedFlow<Resource<OverdrawInformation>> component3;
    private final MutableSharedFlow<Boolean> copydefault;

    public final boolean hasUserOptedIn() {
        return false;
    }

    public final boolean isOverdrawEnabled() {
        return false;
    }

    @Inject
    public OverdrawRepository() {
        MutableSharedFlow<Boolean> MutableSharedFlow = SharedFlowKt.MutableSharedFlow(1, 1, BufferOverflow.DROP_OLDEST);
        this.copydefault = MutableSharedFlow;
        this.component1 = FlowKt.asSharedFlow(MutableSharedFlow);
        MutableSharedFlow<Resource<OverdrawInformation>> MutableSharedFlow2 = SharedFlowKt.MutableSharedFlow(1, 1, BufferOverflow.DROP_OLDEST);
        this.ShareDataUIState = MutableSharedFlow2;
        this.component3 = FlowKt.asSharedFlow(MutableSharedFlow2);
    }

    public final SharedFlow<Boolean> isOverdrawUpdated() {
        return this.component1;
    }

    public final SharedFlow<Resource<OverdrawInformation>> getOverdrawData() {
        return this.component3;
    }
}
