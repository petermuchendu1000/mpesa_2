package com.safaricom.consumer.commons.balances;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/safaricom/consumer/commons/balances/BalanceRepository;", "", "<init>", "()V", "_isBalanceUpdated", "Landroidx/lifecycle/MutableLiveData;", "", "isBalanceUpdated", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BalanceRepository {
    private MutableLiveData<Boolean> ShareDataUIState;
    private final LiveData<Boolean> component1;

    @Inject
    public BalanceRepository() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.ShareDataUIState = mutableLiveData;
        this.component1 = mutableLiveData;
    }

    public final LiveData<Boolean> isBalanceUpdated() {
        return this.component1;
    }
}
