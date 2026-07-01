package com.huawei.digitalpayment.consumer.base.resp;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/ReferenceDataOperationTypes;", "", "<init>", "()V", "PRE_VALIDATION", "", "CONFIRMATION", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReferenceDataOperationTypes {
    public static final String CONFIRMATION = "Confirmation";
    public static final ReferenceDataOperationTypes INSTANCE = new ReferenceDataOperationTypes();
    public static final String PRE_VALIDATION = "Prevalidation";
    private static int component1 = 0;
    private static int component2 = 1;

    private ReferenceDataOperationTypes() {
    }

    static {
        int i = component2 + 113;
        component1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
