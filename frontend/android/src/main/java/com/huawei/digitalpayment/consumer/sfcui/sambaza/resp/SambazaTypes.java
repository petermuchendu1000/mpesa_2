package com.huawei.digitalpayment.consumer.sfcui.sambaza.resp;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/resp/SambazaTypes;", "", "<init>", "()V", "AIRTIME", "", "DATA", "DATA_EXPIRY_TYPE", "DATA_NO_EXPIRY_TYPE", "GO_MONTHLY_POSTPAY", "POSTPAY_DATA", "NYAKUA_DATA", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SambazaTypes {
    public static final int $stable = 0;
    public static final String AIRTIME = "airtime";
    public static final String DATA = "data";
    public static final String DATA_EXPIRY_TYPE = "C_4500";
    public static final String DATA_NO_EXPIRY_TYPE = "C_2551";
    public static final String GO_MONTHLY_POSTPAY = "C_1073";
    public static final SambazaTypes INSTANCE = new SambazaTypes();
    public static final String NYAKUA_DATA = "NyakuaBonus";
    public static final String POSTPAY_DATA = "C_5710";
    private static int component1 = 1;
    private static int copydefault;

    private SambazaTypes() {
    }

    static {
        int i = copydefault + 31;
        component1 = i % 128;
        int i2 = i % 2;
    }
}
