package com.huawei.digitalpayment.consumer.base.repository;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/repository/ConfigurationRepository;", "", "<init>", "()V", "getMobileCountryCode", "", "getMobileNetworkCode", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConfigurationRepository {
    private static int component1 = 0;
    private static int component2 = 1;

    public final int getMobileCountryCode() {
        int i = 2 % 2;
        int i2 = component2 + 1;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 89;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return 639;
    }

    public final int getMobileNetworkCode() {
        int i = 2 % 2;
        int i2 = component2 + 91;
        component1 = i2 % 128;
        return i2 % 2 != 0 ? 5 : 2;
    }
}
