package com.huawei.digitalpayment.consumer.sfcui.constants;

import com.huawei.hms.mlsdk.common.internal.client.event.MonitorResult;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/constants/ResponseCodes;", "", "<init>", "()V", MonitorResult.SUCCESS, "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ResponseCodes {
    public static final int $stable = 0;
    public static final ResponseCodes INSTANCE = new ResponseCodes();
    public static final int SUCCESS = 200;
    private static int ShareDataUIState = 1;
    private static int component3;

    private ResponseCodes() {
    }

    static {
        int i = component3 + 11;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }
}
