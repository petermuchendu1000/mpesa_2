package com.huawei.digitalpayment.consumer.baselib.service;

import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u001e\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H&J\b\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/service/IPushService;", "", "getFirebaseToken", "", "onMessageReceived", "", "data", "", "unsubscribeToTopic", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IPushService {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        private static int component1 = 1;
        private static int component3;

        public static void unsubscribeToTopic(IPushService iPushService) {
            int i = 2 % 2;
            int i2 = component3 + 115;
            component1 = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    String getFirebaseToken();

    void onMessageReceived(Map<String, String> data);

    void unsubscribeToTopic();
}
