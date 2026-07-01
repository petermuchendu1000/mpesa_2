package com.huawei.digitalpayment.consumer.base.util;

import androidx.lifecycle.MutableLiveData;
import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.SPUtils;
import com.huawei.biometric.constants.BiometricConstants;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.consumer.base.resp.BalanceItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\nJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\bJ\b\u0010\u0010\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/util/PochiWalletBalanceHelper;", "", "<init>", "()V", "POCHI_WALLET_BALANCE_KEY", "", "balance", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/consumer/base/resp/BalanceItem;", "balanceLiveData", "Landroidx/lifecycle/MutableLiveData;", "getBalance", "Lkotlinx/coroutines/flow/StateFlow;", "getBalanceMutableLiveData", "saveBalance", "", "getExtraKey", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PochiWalletBalanceHelper {
    public static final PochiWalletBalanceHelper INSTANCE;
    public static final String POCHI_WALLET_BALANCE_KEY = "pochi_wallet_balance";
    private static final MutableLiveData<BalanceItem> ShareDataUIState;
    private static int component1 = 1;
    private static MutableStateFlow<BalanceItem> component2 = null;
    private static int component3 = 0;
    private static int copydefault = 0;
    private static int equals = 1;

    private PochiWalletBalanceHelper() {
    }

    static {
        PochiWalletBalanceHelper pochiWalletBalanceHelper = new PochiWalletBalanceHelper();
        INSTANCE = pochiWalletBalanceHelper;
        BalanceItem balanceItem = (BalanceItem) SecureGsonUtils.fromJson(SPUtils.getInstance("homeModuleNoCache").getString(POCHI_WALLET_BALANCE_KEY + pochiWalletBalanceHelper.ShareDataUIState()), BalanceItem.class);
        if (balanceItem == null) {
            balanceItem = new BalanceItem(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
            int i = component3 + 57;
            component1 = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        component2 = StateFlowKt.MutableStateFlow(balanceItem);
        ShareDataUIState = new MutableLiveData<>(component2.getValue());
        int i4 = component1 + 103;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final StateFlow<BalanceItem> getBalance() {
        int i = 2 % 2;
        int i2 = equals + 39;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNull(component2, "");
            throw null;
        }
        MutableStateFlow<BalanceItem> mutableStateFlow = component2;
        Intrinsics.checkNotNull(mutableStateFlow, "");
        return mutableStateFlow;
    }

    public final MutableLiveData<BalanceItem> getBalanceMutableLiveData() {
        int i = 2 % 2;
        int i2 = equals + 3;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        MutableLiveData<BalanceItem> mutableLiveData = ShareDataUIState;
        int i5 = i3 + 55;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 29 / 0;
        }
        return mutableLiveData;
    }

    public final void saveBalance(BalanceItem balance) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(balance, "");
        component2.setValue(balance);
        getBalanceMutableLiveData().setValue(balance);
        SPUtils.getInstance("homeModuleNoCache").put(POCHI_WALLET_BALANCE_KEY + ShareDataUIState(), GsonUtils.toJson(balance));
        int i2 = equals + 83;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private final String ShareDataUIState() {
        int i = 2 % 2;
        String str = "_" + SPUtils.getInstance().getString(BiometricConstants.CURRENT_ACCOUNT);
        int i2 = equals + 123;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
