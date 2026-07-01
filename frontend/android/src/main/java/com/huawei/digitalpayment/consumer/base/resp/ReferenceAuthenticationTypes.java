package com.huawei.digitalpayment.consumer.base.resp;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/ReferenceAuthenticationTypes;", "", "<init>", "()V", "PIN", "", "BIOMETRICS", "STK_PUSH", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReferenceAuthenticationTypes {
    public static final String BIOMETRICS = "Biometrics";
    public static final ReferenceAuthenticationTypes INSTANCE = new ReferenceAuthenticationTypes();
    public static final String PIN = "PIN";
    public static final String STK_PUSH = "STK Push";
    private static int component1 = 1;
    private static int copydefault;

    private ReferenceAuthenticationTypes() {
    }

    static {
        int i = copydefault + 65;
        component1 = i % 128;
        int i2 = i % 2;
    }
}
