package com.huawei.digitalpayment.consumer.base.repository;

import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/repository/DecMsisdnRepository;", "Lcom/huawei/digitalpayment/consumer/baselib/http/PaymentRequest;", "Lcom/huawei/digitalpayment/consumer/base/repository/DesMsisdnResp;", "<init>", "()V", "getApiPath", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DecMsisdnRepository extends PaymentRequest<DesMsisdnResp> {
    private static int component1 = 1;
    private static int component3;

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component1 + 123;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            int i4 = 61 / 0;
        }
        int i5 = i3 + 11;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return "decMsisdn";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
