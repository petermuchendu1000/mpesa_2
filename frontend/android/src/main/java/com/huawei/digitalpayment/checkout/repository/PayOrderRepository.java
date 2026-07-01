package com.huawei.digitalpayment.checkout.repository;

import com.huawei.digitalpayment.checkout.constants.TradeTypeEnum;
import com.huawei.digitalpayment.checkout.model.request.PayRequest;
import com.huawei.digitalpayment.checkout.model.response.TransferResp;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;

public class PayOrderRepository extends PaymentRequest<TransferResp> {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private final TradeTypeEnum copydefault;

    public PayOrderRepository(TradeTypeEnum tradeTypeEnum, PayRequest payRequest) {
        this.copydefault = tradeTypeEnum;
        addParams(payRequest);
    }

    @Override
    public String getApiPath() {
        String transferParam;
        int i = 2 % 2;
        int i2 = component3 + 85;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            transferParam = this.copydefault.getTransferParam();
            int i3 = 51 / 0;
        } else {
            transferParam = this.copydefault.getTransferParam();
        }
        int i4 = component3 + 79;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return transferParam;
    }
}
