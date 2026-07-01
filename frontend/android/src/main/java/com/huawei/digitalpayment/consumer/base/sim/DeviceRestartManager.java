package com.huawei.digitalpayment.consumer.base.sim;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import com.huawei.digitalpayment.consumer.base.repository.DeviceRestartRepository;
import com.huawei.digitalpayment.consumer.base.sim.DeviceRestartState;
import com.huawei.payment.mvvm.Resource;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Singleton
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\bJ\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u000eJ\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u000eJ\u0006\u0010\u001c\u001a\u00020\u0017J\u0006\u0010\u001d\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartManager;", "", "deviceRestartRepository", "Lcom/huawei/digitalpayment/consumer/base/repository/DeviceRestartRepository;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/repository/DeviceRestartRepository;)V", "_restartState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartState;", "restartState", "Lkotlinx/coroutines/flow/StateFlow;", "getRestartState", "()Lkotlinx/coroutines/flow/StateFlow;", "_isDeviceRestartScreenVisible", "", "isDeviceRestartScreenVisible", "_isSplashScreenVisible", "isSplashScreenVisible", "restartStateLiveData", "Landroidx/lifecycle/LiveData;", "getRestartStateLiveData", "()Landroidx/lifecycle/LiveData;", "updateRestartState", "", "newState", "setDeviceRestartScreenVisible", "isVisible", "setSplashScreenVisible", "markNotRestarted", "verifyRestartPhoneNumber", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceRestartManager {
    private static int component4 = 0;
    private static int copy = 1;
    private final StateFlow<Boolean> ShareDataUIState;
    private final DeviceRestartRepository component1;
    private final MutableStateFlow<DeviceRestartState> component2;
    private final MutableStateFlow<Boolean> component3;
    private final MutableStateFlow<Boolean> copydefault;
    private final LiveData<DeviceRestartState> equals;
    private final StateFlow<DeviceRestartState> getAsAtTimestamp;
    private final StateFlow<Boolean> getRequestBeneficiariesState;

    @Inject
    public DeviceRestartManager(DeviceRestartRepository deviceRestartRepository) {
        Intrinsics.checkNotNullParameter(deviceRestartRepository, "");
        this.component1 = deviceRestartRepository;
        MutableStateFlow<DeviceRestartState> MutableStateFlow = StateFlowKt.MutableStateFlow(DeviceRestartState.Unknown.INSTANCE);
        this.component2 = MutableStateFlow;
        this.getAsAtTimestamp = MutableStateFlow;
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(false);
        this.component3 = MutableStateFlow2;
        this.ShareDataUIState = MutableStateFlow2;
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(false);
        this.copydefault = MutableStateFlow3;
        this.getRequestBeneficiariesState = MutableStateFlow3;
        this.equals = FlowLiveDataConversions.asLiveData$default(MutableStateFlow, (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public final StateFlow<DeviceRestartState> getRestartState() {
        StateFlow<DeviceRestartState> stateFlow;
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 7;
        copy = i3 % 128;
        if (i3 % 2 == 0) {
            stateFlow = this.getAsAtTimestamp;
            int i4 = 23 / 0;
        } else {
            stateFlow = this.getAsAtTimestamp;
        }
        int i5 = i2 + 85;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public final StateFlow<Boolean> isDeviceRestartScreenVisible() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 35;
        copy = i3 % 128;
        int i4 = i3 % 2;
        StateFlow<Boolean> stateFlow = this.ShareDataUIState;
        int i5 = i2 + 83;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public final StateFlow<Boolean> isSplashScreenVisible() {
        int i = 2 % 2;
        int i2 = component4 + 31;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        StateFlow<Boolean> stateFlow = this.getRequestBeneficiariesState;
        int i5 = i3 + 51;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public final LiveData<DeviceRestartState> getRestartStateLiveData() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 111;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        LiveData<DeviceRestartState> liveData = this.equals;
        int i5 = i2 + 117;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return liveData;
    }

    public final void updateRestartState(DeviceRestartState newState) {
        int i = 2 % 2;
        int i2 = copy + 9;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(newState, "");
            this.component2.setValue(newState);
        } else {
            Intrinsics.checkNotNullParameter(newState, "");
            this.component2.setValue(newState);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void setDeviceRestartScreenVisible(boolean isVisible) {
        int i = 2 % 2;
        int i2 = copy + 107;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        this.component3.setValue(Boolean.valueOf(isVisible));
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setSplashScreenVisible(boolean isVisible) {
        int i = 2 % 2;
        int i2 = component4 + 39;
        copy = i2 % 128;
        int i3 = i2 % 2;
        this.copydefault.setValue(Boolean.valueOf(isVisible));
        int i4 = component4 + 37;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void markNotRestarted() {
        int i = 2 % 2;
        int i2 = copy + 75;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        if (!(this.component2.getValue() instanceof DeviceRestartState.Unknown)) {
            return;
        }
        this.component2.setValue(DeviceRestartState.NotRestarted.INSTANCE);
        int i4 = copy + 59;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void verifyRestartPhoneNumber() {
        int i = 2 % 2;
        final String lastLoginMsidn = this.component1.getLastLoginMsidn();
        String str = lastLoginMsidn;
        if (str != null) {
            int i2 = copy + 67;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            if (str.length() != 0) {
                this.component1.queryPhoneNumber(new Function1() {
                    private static int component2 = 1;
                    private static int copydefault;

                    @Override
                    public final Object invoke(Object obj) {
                        int i4 = 2 % 2;
                        int i5 = copydefault + 47;
                        component2 = i5 % 128;
                        int i6 = i5 % 2;
                        Unit unit$r8$lambda$QJLgV1eoqjJHXkjdgTSjmbyouGM = DeviceRestartManager.$r8$lambda$QJLgV1eoqjJHXkjdgTSjmbyouGM(this.f$0, lastLoginMsidn, (Resource) obj);
                        int i7 = copydefault + 1;
                        component2 = i7 % 128;
                        if (i7 % 2 != 0) {
                            return unit$r8$lambda$QJLgV1eoqjJHXkjdgTSjmbyouGM;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                });
                return;
            }
        }
        DeviceRestartState.NoLastLoginMsisdn noLastLoginMsisdn = DeviceRestartState.NoLastLoginMsisdn.INSTANCE;
        updateRestartState(noLastLoginMsisdn);
        this.component1.cacheState(noLastLoginMsisdn);
        int i4 = component4 + 59;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit ShareDataUIState(com.huawei.digitalpayment.consumer.base.sim.DeviceRestartManager r6, java.lang.String r7, com.huawei.payment.mvvm.Resource r8) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.sim.DeviceRestartManager.ShareDataUIState(com.huawei.digitalpayment.consumer.base.sim.DeviceRestartManager, java.lang.String, com.huawei.payment.mvvm.Resource):kotlin.Unit");
    }

    public static Unit $r8$lambda$QJLgV1eoqjJHXkjdgTSjmbyouGM(DeviceRestartManager deviceRestartManager, String str, Resource resource) {
        int i = 2 % 2;
        int i2 = component4 + 125;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitShareDataUIState = ShareDataUIState(deviceRestartManager, str, resource);
        int i4 = component4 + 71;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return unitShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
