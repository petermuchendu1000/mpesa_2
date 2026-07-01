package com.huawei.digitalpayment.consumer.sfcui.sharedata.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/DataSharingTypes;", "", "<init>", "()V", "WITH_EXPIRY", "", "NO_EXPIRY", "POST_PAY", "PRODUCT_EMERALD_POSTPAY", "PRODUCT_POSTPAY_EMERALD", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataSharingTypes {
    public static final int $stable = 0;
    public static final DataSharingTypes INSTANCE = new DataSharingTypes();
    public static final String NO_EXPIRY = "NonExpiryBundles";
    public static final String POST_PAY = "PostPayBundles";
    public static final String PRODUCT_EMERALD_POSTPAY = "emeraldpostpay";
    public static final String PRODUCT_POSTPAY_EMERALD = "postpayemerald";
    public static final String WITH_EXPIRY = "ExpiryBundles";
    private static int component2 = 1;
    private static int copydefault;

    private DataSharingTypes() {
    }

    static {
        int i = copydefault + 15;
        component2 = i % 128;
        int i2 = i % 2;
    }
}
