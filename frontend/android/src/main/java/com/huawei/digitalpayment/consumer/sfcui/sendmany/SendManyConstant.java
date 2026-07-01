package com.huawei.digitalpayment.consumer.sfcui.sendmany;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sendmany/SendManyConstant;", "", "<init>", "()V", "Companion", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SendManyConstant {
    public static final int $stable = 0;

    public static final Companion INSTANCE = new Companion(null);
    public static final String SEND_STATUS_FAILED = "Failed";
    public static final String SEND_STATUS_PROCESSING = "Processing";
    public static final String SEND_STATUS_SUCCESS = "Success";
    private static int ShareDataUIState = 1;
    private static int component3;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sendmany/SendManyConstant$Companion;", "", "<init>", "()V", "SEND_STATUS_SUCCESS", "", "SEND_STATUS_FAILED", "SEND_STATUS_PROCESSING", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i = ShareDataUIState + 15;
        component3 = i % 128;
        if (i % 2 != 0) {
            int i2 = 87 / 0;
        }
    }
}
