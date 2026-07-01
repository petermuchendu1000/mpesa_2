package com.huawei.digitalpayment.consumer.base.http;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/http/HaProxyConstants;", "", "<init>", "()V", "GENERAL_SUCCESS", "", "VOUCHER_TOP_UP_SUCESS", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HaProxyConstants {
    public static final int GENERAL_SUCCESS = 200;
    public static final HaProxyConstants INSTANCE = new HaProxyConstants();
    public static final int VOUCHER_TOP_UP_SUCESS = 406;
    private static int component1 = 0;
    private static int component3 = 1;

    private HaProxyConstants() {
    }

    static {
        int i = component3 + 73;
        component1 = i % 128;
        int i2 = i % 2;
    }
}
