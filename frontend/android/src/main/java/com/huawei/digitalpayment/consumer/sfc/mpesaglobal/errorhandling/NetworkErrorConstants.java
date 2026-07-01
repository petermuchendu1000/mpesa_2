package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/NetworkErrorConstants;", "", "<init>", "()V", "INVALID_TILL_NUMBER", "", "INVALID_PHONE_NUMBER", "MAX_AMOUNT_REACHED", "MIN_AMOUNT_REACHED", NetworkErrorConstants.WRONG_PIN, "DAILY_LIMIT_EXCEEDED", NetworkErrorConstants.INSUFFICIENT_FUNDS, NetworkErrorConstants.VALIDATION_EXPIRED, "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NetworkErrorConstants {
    public static final int $stable = 0;
    public static final String DAILY_LIMIT_EXCEEDED = "DAILY_LIMIT";
    public static final NetworkErrorConstants INSTANCE = new NetworkErrorConstants();
    public static final String INSUFFICIENT_FUNDS = "INSUFFICIENT_FUNDS";
    public static final String INVALID_PHONE_NUMBER = "INVALID_PHONE";
    public static final String INVALID_TILL_NUMBER = "INVALID_TILL";
    public static final String MAX_AMOUNT_REACHED = "MAX_AMOUNT";
    public static final String MIN_AMOUNT_REACHED = "MIN_AMOUNT";
    public static final String VALIDATION_EXPIRED = "VALIDATION_EXPIRED";
    public static final String WRONG_PIN = "WRONG_PIN";
    private static int component1 = 0;
    private static int component3 = 1;

    private NetworkErrorConstants() {
    }

    static {
        int i = component1 + 29;
        component3 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
