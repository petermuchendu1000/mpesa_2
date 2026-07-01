package com.huawei.digitalpayment.consumer.sfcui.constants;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/constants/FamilyConnectOperationTypes;", "", "<init>", "()V", "ADD", "", "REMOVE", "CHANGE_LIMIT", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FamilyConnectOperationTypes {
    public static final int $stable = 0;
    public static final String ADD = "1";
    public static final String CHANGE_LIMIT = "3";
    public static final FamilyConnectOperationTypes INSTANCE = new FamilyConnectOperationTypes();
    public static final String REMOVE = "2";
    private static int component1 = 0;
    private static int component3 = 1;

    private FamilyConnectOperationTypes() {
    }

    static {
        int i = component3 + 87;
        component1 = i % 128;
        if (i % 2 != 0) {
            int i2 = 45 / 0;
        }
    }
}
