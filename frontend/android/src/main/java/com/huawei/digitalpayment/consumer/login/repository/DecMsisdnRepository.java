package com.huawei.digitalpayment.consumer.login.repository;

import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.bean.DesMsisdnResp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/login/repository/DecMsisdnRepository;", "Lcom/huawei/digitalpayment/consumer/baselib/http/PaymentRequest;", "Lcom/huawei/digitalpayment/consumer/bean/DesMsisdnResp;", "<init>", "()V", "getApiPath", "", "ConsumerLoginUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DecMsisdnRepository extends PaymentRequest<DesMsisdnResp> {
    public static final int $stable = 0;
    private static int component1 = 0;
    private static int component2 = 43 % 128;
    private static int component3 = 0;
    private static int copydefault = 1;

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 77;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 49;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return "decMsisdn";
        }
        throw null;
    }

    static {
        int i = 43 % 2;
    }
}
