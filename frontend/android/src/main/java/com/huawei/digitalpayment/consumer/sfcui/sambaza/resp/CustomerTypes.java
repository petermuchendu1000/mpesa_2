package com.huawei.digitalpayment.consumer.sfcui.sambaza.resp;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/resp/CustomerTypes;", "", "<init>", "()V", "POSTPAY", "", "PREPAY", "HYBRID", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CustomerTypes {
    public static final int $stable = 0;
    public static final String HYBRID = "Hybrid";
    public static final CustomerTypes INSTANCE = new CustomerTypes();
    public static final String POSTPAY = "Postpaid";
    public static final String PREPAY = "Prepaid";
    private static int ShareDataUIState = 1;
    private static int component1;

    private CustomerTypes() {
    }

    static {
        int i = component1 + 23;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
