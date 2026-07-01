package com.huawei.digitalpayment.home.util;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.alibaba.griver.api.ui.splash.SplashEntryInfo;
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

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H\u0007J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0013H\u0007J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\n\u001a\u0004\u0018\u00010\fH\u0007J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/home/util/BalanceHelper;", "", "<init>", "()V", SplashEntryInfo.NEED_REFRESH, "", "getNeedRefresh", "()Z", "setNeedRefresh", "(Z)V", "balance", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", HomeConstants.BALANCE2, "Lcom/huawei/digitalpayment/home/data/local/LocalBalance;", "getBalance", "Lkotlinx/coroutines/flow/StateFlow;", "getBalance2", "getBalanceMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "getBalanceMutableLiveData2", "saveBalance", "", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BalanceHelper {
    private static MutableStateFlow<LocalBalance> ShareDataUIState = null;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int equals = 1;
    private static int getAsAtTimestamp;
    public static final BalanceHelper INSTANCE = new BalanceHelper();
    private static boolean copydefault = true;

    @Deprecated
    private static MutableStateFlow<String> component1 = StateFlowKt.MutableStateFlow(SPUtils.getInstance("homeModuleNoCache").getString("balance"));

    private BalanceHelper() {
    }

    static {
        LocalBalance localBalance = (LocalBalance) SecureGsonUtils.fromJson(SPUtils.getInstance("homeModuleNoCache").getString(HomeConstants.BALANCE2), LocalBalance.class);
        if (localBalance == null) {
            localBalance = new LocalBalance(null, null, null, null, 15, null);
            int i = component2 + 9;
            component3 = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        ShareDataUIState = StateFlowKt.MutableStateFlow(localBalance);
        int i4 = component2 + 113;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final boolean getNeedRefresh() {
        int i = 2 % 2;
        int i2 = equals + 81;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        boolean z = copydefault;
        if (i3 != 0) {
            int i4 = 74 / 0;
        }
        return z;
    }

    public final void setNeedRefresh(boolean z) {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 123;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        copydefault = z;
        int i5 = i2 + 105;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
    }

    @Deprecated
    public final StateFlow<String> getBalance() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 3;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            MutableStateFlow<String> mutableStateFlow = component1;
            Intrinsics.checkNotNull(mutableStateFlow, "");
            return mutableStateFlow;
        }
        Intrinsics.checkNotNull(component1, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final StateFlow<LocalBalance> getBalance2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 71;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            MutableStateFlow<LocalBalance> mutableStateFlow = ShareDataUIState;
            Intrinsics.checkNotNull(mutableStateFlow, "");
            return mutableStateFlow;
        }
        Intrinsics.checkNotNull(ShareDataUIState, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public final MutableLiveData<String> getBalanceMutableLiveData() {
        int i = 2 % 2;
        int i2 = equals + 15;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        LiveData liveDataAsLiveData$default = FlowLiveDataConversions.asLiveData$default(component1, (CoroutineContext) null, 0L, 3, (Object) null);
        Intrinsics.checkNotNull(liveDataAsLiveData$default, "");
        MutableLiveData<String> mutableLiveData = (MutableLiveData) liveDataAsLiveData$default;
        int i4 = getAsAtTimestamp + 121;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 7 / 0;
        }
        return mutableLiveData;
    }

    public final MutableLiveData<LocalBalance> getBalanceMutableLiveData2() {
        int i = 2 % 2;
        int i2 = equals + 19;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        LiveData liveDataAsLiveData$default = FlowLiveDataConversions.asLiveData$default(ShareDataUIState, (CoroutineContext) null, 0L, 3, (Object) null);
        Intrinsics.checkNotNull(liveDataAsLiveData$default, "");
        MutableLiveData<LocalBalance> mutableLiveData = (MutableLiveData) liveDataAsLiveData$default;
        int i4 = getAsAtTimestamp + 21;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return mutableLiveData;
    }

    @Deprecated
    public final void saveBalance(String balance) {
        String str;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 67;
        int i4 = i3 % 128;
        equals = i4;
        int i5 = i3 % 2;
        MutableStateFlow<String> mutableStateFlow = component1;
        if (balance == null) {
            int i6 = i2 + 13;
            int i7 = i6 % 128;
            equals = i7;
            if (i6 % 2 == 0) {
                throw null;
            }
            int i8 = i7 + 55;
            getAsAtTimestamp = i8 % 128;
            int i9 = i8 % 2;
            str = "";
        } else {
            int i10 = i4 + 99;
            getAsAtTimestamp = i10 % 128;
            int i11 = i10 % 2;
            str = balance;
        }
        mutableStateFlow.setValue(str);
        getBalanceMutableLiveData().setValue(balance);
        SPUtils.getInstance("homeModuleNoCache").put("balance", balance);
    }

    public final void saveBalance(LocalBalance balance) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 13;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(balance, "");
        saveBalance(balance.getAmountDisplay());
        ShareDataUIState.setValue(balance);
        getBalanceMutableLiveData2().setValue(balance);
        SPUtils.getInstance("homeModuleNoCache").put(HomeConstants.BALANCE2, GsonUtils.toJson(balance));
        int i4 = equals + 1;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
