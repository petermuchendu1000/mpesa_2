package com.huawei.digitalpayment.consumer.sfcui.gsmBalances.model;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001d\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"accountStatusesMap", "", "", "Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/AccountStatus;", "getAccountStatusesMap", "()Ljava/util/Map;", "ConsumerSfcUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AccountStatusKt {
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static final Map<String, AccountStatus> component2;
    private static int component3 = 1;
    private static int copydefault = 1;

    static {
        AccountStatus[] accountStatusArrValues = AccountStatus.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(accountStatusArrValues.length), 16));
        int length = accountStatusArrValues.length;
        int i = ShareDataUIState + 117;
        component3 = i % 128;
        int i2 = i % 2;
        int i3 = 2 % 2;
        int i4 = 0;
        while (i4 < length) {
            int i5 = ShareDataUIState + 53;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                AccountStatus accountStatus = accountStatusArrValues[i4];
                linkedHashMap.put(accountStatus.name(), accountStatus);
                i4 += 105;
            } else {
                AccountStatus accountStatus2 = accountStatusArrValues[i4];
                linkedHashMap.put(accountStatus2.name(), accountStatus2);
                i4++;
            }
        }
        component2 = linkedHashMap;
    }

    public static final Map<String, AccountStatus> getAccountStatusesMap() {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return component2;
        }
        throw null;
    }
}
