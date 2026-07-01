package com.huawei.digitalpayment.consumer.base.util;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.SPUtils;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.home.constants.HomeConstants;
import com.huawei.digitalpayment.home.data.local.LocalBalance;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/util/AirTimeBalanceHelper;", "", "<init>", "()V", "AIRTIME_BANNER_KEY", "", "balance", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/home/data/local/LocalBalance;", "getBalance", "Lkotlinx/coroutines/flow/StateFlow;", "getBalanceMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "saveBalance", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AirTimeBalanceHelper {
    public static final String AIRTIME_BANNER_KEY = "airtime_balance";
    public static final AirTimeBalanceHelper INSTANCE = new AirTimeBalanceHelper();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static MutableStateFlow<LocalBalance> component2 = null;
    private static int component3 = 0;
    private static int copydefault = 1;

    private AirTimeBalanceHelper() {
    }

    static {
        LocalBalance localBalance = (LocalBalance) SecureGsonUtils.fromJson(SPUtils.getInstance("homeModuleNoCache").getString(AIRTIME_BANNER_KEY), LocalBalance.class);
        if (localBalance == null) {
            localBalance = new LocalBalance(null, null, null, null, 15, null);
            int i = copydefault + 121;
            component3 = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        }
        component2 = StateFlowKt.MutableStateFlow(localBalance);
        int i3 = copydefault + 99;
        component3 = i3 % 128;
        int i4 = i3 % 2;
    }

    public final StateFlow<LocalBalance> getBalance() {
        int i = 2 % 2;
        int i2 = component1 + 111;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNull(component2, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MutableStateFlow<LocalBalance> mutableStateFlow = component2;
        Intrinsics.checkNotNull(mutableStateFlow, "");
        MutableStateFlow<LocalBalance> mutableStateFlow2 = mutableStateFlow;
        int i3 = component1 + 81;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return mutableStateFlow2;
    }

    public final MutableLiveData<LocalBalance> getBalanceMutableLiveData() {
        MutableStateFlow<LocalBalance> mutableStateFlow;
        CoroutineContext coroutineContext;
        long j;
        int i;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 79;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            mutableStateFlow = component2;
            coroutineContext = null;
            j = 0;
            i = 5;
        } else {
            mutableStateFlow = component2;
            coroutineContext = null;
            j = 0;
            i = 3;
        }
        LiveData liveDataAsLiveData$default = FlowLiveDataConversions.asLiveData$default(mutableStateFlow, coroutineContext, j, i, (Object) null);
        Intrinsics.checkNotNull(liveDataAsLiveData$default, "");
        MutableLiveData<LocalBalance> mutableLiveData = (MutableLiveData) liveDataAsLiveData$default;
        int i4 = component1 + 37;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return mutableLiveData;
    }

    public final void saveBalance(LocalBalance balance) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(balance, "");
        component2.setValue(balance);
        getBalanceMutableLiveData().setValue(balance);
        SPUtils.getInstance("homeModuleNoCache").put(HomeConstants.BALANCE2, GsonUtils.toJson(balance));
        int i4 = component1 + 1;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }
}
