package com.huawei.digitalpayment.consumer.baselib.service;

import androidx.lifecycle.LiveData;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/service/IBalanceService;", "", "getBalance", "Landroidx/lifecycle/LiveData;", "", "reFreshBalance", "", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IBalanceService {
    LiveData<String> getBalance();

    void reFreshBalance();
}
