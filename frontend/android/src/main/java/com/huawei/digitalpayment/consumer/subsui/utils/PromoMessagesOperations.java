package com.huawei.digitalpayment.consumer.subsui.utils;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/subsui/utils/PromoMessagesOperations;", "", "<init>", "()V", "METABLACKLIST_ALL", "", "METABLACKLIST_SINGLE", "METAWHITELIST_SINGLE", "METAWHITELIST_ALL", "ConsumerSfcMySubscriptionsUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PromoMessagesOperations {
    public static final int $stable = 0;
    public static final PromoMessagesOperations INSTANCE = new PromoMessagesOperations();
    public static final String METABLACKLIST_ALL = "Blacklist-All";
    public static final String METABLACKLIST_SINGLE = "BlackList";
    public static final String METAWHITELIST_ALL = "Whitelist-All";
    public static final String METAWHITELIST_SINGLE = "Whitelist";
    private static int component3 = 1;
    private static int copydefault;

    private PromoMessagesOperations() {
    }

    static {
        int i = component3 + 47;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
