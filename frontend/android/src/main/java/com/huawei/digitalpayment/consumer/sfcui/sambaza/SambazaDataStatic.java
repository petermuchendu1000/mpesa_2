package com.huawei.digitalpayment.consumer.sfcui.sambaza;

import com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.FetchSambazaAccount;
import com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaTypes;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaDataStatic;", "", "<init>", "()V", "accounts", "", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/resp/FetchSambazaAccount;", "getAccounts", "()Ljava/util/List;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SambazaDataStatic {
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;
    public static final SambazaDataStatic INSTANCE = new SambazaDataStatic();
    private static final List<FetchSambazaAccount> component2 = CollectionsKt.listOf((Object[]) new FetchSambazaAccount[]{new FetchSambazaAccount("Monthly Bundles", "C_4500", 20480, null, 8, null), new FetchSambazaAccount("Postpay data", "C_5710", 20480, null, 8, null), new FetchSambazaAccount("Go monthly postpay", SambazaTypes.GO_MONTHLY_POSTPAY, 20480, null, 8, null), new FetchSambazaAccount("Non-Expiry Bundles", "C_2551", 20480, null, 8, null)});
    public static final int $stable = 8;

    private SambazaDataStatic() {
    }

    public final List<FetchSambazaAccount> getAccounts() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 39;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        List<FetchSambazaAccount> list = component2;
        int i5 = i2 + 91;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static {
        int i = ShareDataUIState + 81;
        copydefault = i % 128;
        int i2 = i % 2;
    }
}
