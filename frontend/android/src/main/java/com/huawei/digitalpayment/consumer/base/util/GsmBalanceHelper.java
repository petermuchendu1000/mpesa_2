package com.huawei.digitalpayment.consumer.base.util;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.SPUtils;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.consumer.base.resp.LocalGsmBalances;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/util/GsmBalanceHelper;", "", "<init>", "()V", "GSM_BALANCE_KEY", "", "balance", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/consumer/base/resp/LocalGsmBalances;", "getBalance", "Lkotlinx/coroutines/flow/StateFlow;", "getBalanceMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "saveBalance", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GsmBalanceHelper {
    public static final String GSM_BALANCE_KEY = "gsm_balance";
    public static final GsmBalanceHelper INSTANCE = new GsmBalanceHelper();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static MutableStateFlow<LocalGsmBalances> copydefault;

    private GsmBalanceHelper() {
    }

    static {
        LocalGsmBalances localGsmBalances = (LocalGsmBalances) SecureGsonUtils.fromJson(SPUtils.getInstance("homeModuleNoCache").getString(GSM_BALANCE_KEY), LocalGsmBalances.class);
        if (localGsmBalances == null) {
            localGsmBalances = new LocalGsmBalances(null, null, null, 7, null);
            int i = component3 + 89;
            component1 = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        }
        copydefault = StateFlowKt.MutableStateFlow(localGsmBalances);
        int i3 = component3 + 97;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final StateFlow<LocalGsmBalances> getBalance() {
        int i = 2 % 2;
        int i2 = component2 + 95;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            MutableStateFlow<LocalGsmBalances> mutableStateFlow = copydefault;
            Intrinsics.checkNotNull(mutableStateFlow, "");
            return mutableStateFlow;
        }
        MutableStateFlow<LocalGsmBalances> mutableStateFlow2 = copydefault;
        Intrinsics.checkNotNull(mutableStateFlow2, "");
        int i3 = 64 / 0;
        return mutableStateFlow2;
    }

    public final MutableLiveData<LocalGsmBalances> getBalanceMutableLiveData() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        LiveData liveDataAsLiveData$default = FlowLiveDataConversions.asLiveData$default(copydefault, (CoroutineContext) null, 0L, 3, (Object) null);
        Intrinsics.checkNotNull(liveDataAsLiveData$default, "");
        MutableLiveData<LocalGsmBalances> mutableLiveData = (MutableLiveData) liveDataAsLiveData$default;
        int i4 = ShareDataUIState + 91;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return mutableLiveData;
    }

    public final void saveBalance(LocalGsmBalances balance) {
        int i = 2 % 2;
        int i2 = component2 + 75;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(balance, "");
        copydefault.setValue(balance);
        getBalanceMutableLiveData().setValue(balance);
        SPUtils.getInstance("homeModuleNoCache").put(GSM_BALANCE_KEY, GsonUtils.toJson(balance));
        int i4 = ShareDataUIState + 119;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
    }
}
