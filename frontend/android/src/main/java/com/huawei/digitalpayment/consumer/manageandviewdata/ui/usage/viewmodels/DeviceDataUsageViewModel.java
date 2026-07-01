package com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.viewmodels;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.huawei.digitalpayment.consumer.base.util.ExtensionMethodsKt;
import com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.DataUsageManager;
import com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.models.AppUsage;
import com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.models.NetworkType;
import com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.models.TimeInterval;
import com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.models.Usage;
import com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.utils.ConvertersKt;
import com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.utils.Intervals;
import com.huawei.digitalpayment.consumer.manageandviewdata.di.DataUsageInitializer;
import com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.state.DeviceUsageDataState;
import java.util.Date;
import java.util.List;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aJ\u001a\u0010\u001b\u001a\u00020\u00102\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/ui/usage/viewmodels/DeviceDataUsageViewModel;", "Landroidx/lifecycle/ViewModel;", "dataUsageInitializer", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/di/DataUsageInitializer;", "<init>", "(Lcom/huawei/digitalpayment/consumer/manageandviewdata/di/DataUsageInitializer;)V", "dateFormat", "", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/ui/usage/state/DeviceUsageDataState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "updatePermissionStatus", "", "enabled", "", "updateSelection", "position", "", "getUsage", "interval", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/models/TimeInterval;", "networkType", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/models/NetworkType;", "updateState", "reducer", "Lkotlin/Function1;", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceDataUsageViewModel extends ViewModel {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component4 = 95 % 128;
    private static int equals = 1;
    private static int getAsAtTimestamp;
    private final MutableStateFlow<DeviceUsageDataState> component1;
    private final DataUsageInitializer component2;
    private final StateFlow<DeviceUsageDataState> component3;
    private final String copydefault;

    public static final DataUsageInitializer access$getDataUsageInitializer$p(DeviceDataUsageViewModel deviceDataUsageViewModel) {
        int i = 2 % 2;
        int i2 = equals + 27;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        DataUsageInitializer dataUsageInitializer = deviceDataUsageViewModel.component2;
        if (i3 == 0) {
            return dataUsageInitializer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final String access$getDateFormat$p(DeviceDataUsageViewModel deviceDataUsageViewModel) {
        int i = 2 % 2;
        int i2 = equals + 125;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = deviceDataUsageViewModel.copydefault;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 125;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final MutableStateFlow access$get_uiState$p(DeviceDataUsageViewModel deviceDataUsageViewModel) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 39;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        MutableStateFlow<DeviceUsageDataState> mutableStateFlow = deviceDataUsageViewModel.component1;
        int i5 = i3 + 103;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 20 / 0;
        }
        return mutableStateFlow;
    }

    @Inject
    public DeviceDataUsageViewModel(DataUsageInitializer dataUsageInitializer) {
        Intrinsics.checkNotNullParameter(dataUsageInitializer, "");
        this.component2 = dataUsageInitializer;
        this.copydefault = "dd MMM, yyyy";
        MutableStateFlow<DeviceUsageDataState> MutableStateFlow = StateFlowKt.MutableStateFlow(new DeviceUsageDataState(false, false, null, null, null, null, null, null, false, 511, null));
        this.component1 = MutableStateFlow;
        this.component3 = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final StateFlow<DeviceUsageDataState> getUiState() {
        int i = 2 % 2;
        int i2 = equals + 65;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        StateFlow<DeviceUsageDataState> stateFlow = this.component3;
        int i4 = i3 + 7;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return stateFlow;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.viewmodels.DeviceDataUsageViewModel$getUsage$1", f = "DeviceDataUsageViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int getAsAtTimestamp = 1;
        final NetworkType ShareDataUIState;
        int component3;
        final TimeInterval copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            Object value;
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 11;
            component1 = i2 % 128;
            String date = null;
            if (i2 % 2 != 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                date.hashCode();
                throw null;
            }
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component3 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MutableStateFlow mutableStateFlowAccess$get_uiState$p = DeviceDataUsageViewModel.access$get_uiState$p(DeviceDataUsageViewModel.this);
            do {
                value = mutableStateFlowAccess$get_uiState$p.getValue();
            } while (!mutableStateFlowAccess$get_uiState$p.compareAndSet(value, DeviceUsageDataState.copy$default((DeviceUsageDataState) value, false, true, null, null, null, null, null, null, false, 509, null)));
            Date startDate = this.copydefault.getStartDate();
            String date2 = startDate != null ? ExtensionMethodsKt.formatDate(startDate, DeviceDataUsageViewModel.access$getDateFormat$p(DeviceDataUsageViewModel.this)) : null;
            String str = date2 == null ? "" : date2;
            Date endDate = this.copydefault.getEndDate();
            if (endDate != null) {
                int i3 = getAsAtTimestamp + 21;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    date = ExtensionMethodsKt.formatDate(endDate, DeviceDataUsageViewModel.access$getDateFormat$p(DeviceDataUsageViewModel.this));
                    int i4 = 98 / 0;
                } else {
                    date = ExtensionMethodsKt.formatDate(endDate, DeviceDataUsageViewModel.access$getDateFormat$p(DeviceDataUsageViewModel.this));
                }
            }
            String str2 = date != null ? date : "";
            DataUsageManager dataManagerInstance = DeviceDataUsageViewModel.access$getDataUsageInitializer$p(DeviceDataUsageViewModel.this).getDataManagerInstance();
            Usage usage = dataManagerInstance.getUsage(this.copydefault, this.ShareDataUIState);
            List<AppUsage> usagePerApp = dataManagerInstance.getUsagePerApp(this.copydefault, this.ShareDataUIState, 25);
            List<Usage> multiUsage = dataManagerInstance.getMultiUsage(Intervals.INSTANCE.getListOfIntervals(this.copydefault.getStart(), this.copydefault.getEnd()), this.ShareDataUIState);
            MutableStateFlow mutableStateFlowAccess$get_uiState$p2 = DeviceDataUsageViewModel.access$get_uiState$p(DeviceDataUsageViewModel.this);
            while (true) {
                Object value2 = mutableStateFlowAccess$get_uiState$p2.getValue();
                if (mutableStateFlowAccess$get_uiState$p2.compareAndSet(value2, DeviceUsageDataState.copy$default((DeviceUsageDataState) value2, false, false, multiUsage, usagePerApp, ConvertersKt.byteConversion(usage.getTotalUsage()), str, str2, null, usagePerApp.isEmpty() && usage.getTotalUsage() == 0, 129, null))) {
                    return Unit.INSTANCE;
                }
                int i5 = component1 + 57;
                getAsAtTimestamp = i5 % 128;
                int i6 = i5 % 2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component2(TimeInterval timeInterval, NetworkType networkType, Continuation<? super component2> continuation) {
            super(2, continuation);
            this.copydefault = timeInterval;
            this.ShareDataUIState = networkType;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component2 component2Var = DeviceDataUsageViewModel.this.new component2(this.copydefault, this.ShareDataUIState, continuation);
            int i2 = component1 + 83;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            return component2Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 79;
            getAsAtTimestamp = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                ShareDataUIState(coroutineScope2, continuation2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objShareDataUIState = ShareDataUIState(coroutineScope2, continuation2);
            int i3 = getAsAtTimestamp + 57;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return objShareDataUIState;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 79;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            component2 component2Var = (component2) create(coroutineScope, continuation);
            if (i3 == 0) {
                component2Var.invokeSuspend(Unit.INSTANCE);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = component2Var.invokeSuspend(Unit.INSTANCE);
            int i4 = getAsAtTimestamp + 1;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }
    }

    public static void getUsage$default(DeviceDataUsageViewModel deviceDataUsageViewModel, TimeInterval timeInterval, NetworkType networkType, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals + 37;
        int i4 = i3 % 128;
        getAsAtTimestamp = i4;
        int i5 = i3 % 2;
        if ((i & 2) != 0) {
            int i6 = i4 + 89;
            equals = i6 % 128;
            int i7 = i6 % 2;
            networkType = NetworkType.MOBILE;
            int i8 = equals + 91;
            getAsAtTimestamp = i8 % 128;
            int i9 = i8 % 2;
        }
        deviceDataUsageViewModel.getUsage(timeInterval, networkType);
    }

    public final void getUsage(TimeInterval interval, NetworkType networkType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(interval, "");
        Intrinsics.checkNotNullParameter(networkType, "");
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new component2(interval, networkType, null), 3, null);
        int i2 = equals + 95;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void updatePermissionStatus(boolean enabled) {
        DeviceUsageDataState value;
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 33;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        MutableStateFlow<DeviceUsageDataState> mutableStateFlow = this.component1;
        int i5 = i2 + 67;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, DeviceUsageDataState.copy$default(value, enabled, false, null, null, null, null, null, null, false, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
    }

    public final void updateSelection(int position) {
        DeviceUsageDataState value;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 123;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            MutableStateFlow<DeviceUsageDataState> mutableStateFlow = this.component1;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, DeviceUsageDataState.copy$default(value, false, false, null, null, null, null, null, Integer.valueOf(position), false, 383, null)));
            return;
        }
        throw null;
    }

    public final void updateState(Function1<? super DeviceUsageDataState, DeviceUsageDataState> reducer) {
        DeviceUsageDataState value;
        int i = 2 % 2;
        int i2 = equals + 91;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(reducer, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(reducer, "");
        MutableStateFlow<DeviceUsageDataState> mutableStateFlow = this.component1;
        int i3 = getAsAtTimestamp + 57;
        equals = i3 % 128;
        int i4 = i3 % 2;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, reducer.invoke(value)));
    }

    static {
        int i = 95 % 2;
    }
}
