package com.huawei.digitalpayment.consumer.base.networkcheck;

import com.safaricom.mpesa.logging.L;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Singleton
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/networkcheck/NetworkCheckManager;", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "_networkCheckState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/consumer/base/networkcheck/NetworkCheckState;", "networkCheckState", "Lkotlinx/coroutines/flow/StateFlow;", "getNetworkCheckState", "()Lkotlinx/coroutines/flow/StateFlow;", "updateNetworkCheckState", "", "isEnabled", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NetworkCheckManager {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final MutableStateFlow<NetworkCheckState> ShareDataUIState;
    private final String component1;
    private final StateFlow<NetworkCheckState> component3;

    @Inject
    public NetworkCheckManager() {
        String simpleName = Reflection.getOrCreateKotlinClass(NetworkCheckManager.class).getSimpleName();
        if (simpleName == null) {
            simpleName = "";
            int i = copydefault + 119;
            component2 = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        this.component1 = simpleName;
        MutableStateFlow<NetworkCheckState> MutableStateFlow = StateFlowKt.MutableStateFlow(new NetworkCheckState(false));
        this.ShareDataUIState = MutableStateFlow;
        this.component3 = MutableStateFlow;
        int i4 = copydefault + 87;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTAG() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 5;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 45;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final StateFlow<NetworkCheckState> getNetworkCheckState() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 69;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        StateFlow<NetworkCheckState> stateFlow = this.component3;
        int i5 = i2 + 5;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public final void updateNetworkCheckState(boolean isEnabled) {
        int i = 2 % 2;
        L.INSTANCE.d(this.component1, "Network Check State " + isEnabled, new Object[0]);
        this.ShareDataUIState.setValue(new NetworkCheckState(isEnabled));
        int i2 = copydefault + 73;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
