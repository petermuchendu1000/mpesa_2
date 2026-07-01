package com.huawei.digitalpayment.consumer.sfcui.reportfraud;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/TicketStatus;", "", "<init>", "()V", "INITIATED", "", "UNDER_INVESTIGATION", "CLOSED", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TicketStatus {
    public static final int $stable = 0;
    public static final String CLOSED = "Closed";
    public static final String INITIATED = "Initiated";
    public static final TicketStatus INSTANCE = new TicketStatus();
    private static int ShareDataUIState = 1;
    public static final String UNDER_INVESTIGATION = "Under Investigation";
    private static int component2;

    private TicketStatus() {
    }

    static {
        int i = ShareDataUIState + 67;
        component2 = i % 128;
        int i2 = i % 2;
    }
}
