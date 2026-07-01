package com.huawei.customer.digitalpayment.checkout.service;

import androidx.fragment.app.FragmentActivity;
import com.huawei.common.listener.ApiCallback;
import java.util.Map;

public interface ICheckoutService {
    void startPay(FragmentActivity fragmentActivity, TransactionType transactionType, Map<String, Object> map, ApiCallback<Map<String, Object>> apiCallback);
}
