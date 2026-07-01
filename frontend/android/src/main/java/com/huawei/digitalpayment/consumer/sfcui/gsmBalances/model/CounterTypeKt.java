package com.huawei.digitalpayment.consumer.sfcui.gsmBalances.model;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001d\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"balanceTypesMap", "", "", "Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/CounterType;", "getBalanceTypesMap", "()Ljava/util/Map;", "ConsumerSfcUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CounterTypeKt {
    private static final Map<String, CounterType> ShareDataUIState;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;

    static {
        EnumEntries<CounterType> entries = CounterType.getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entries, 10)), 16));
        int i = copydefault + 23;
        component3 = i % 128;
        int i2 = i % 2;
        int i3 = 2 % 2;
        for (CounterType counterType : entries) {
            linkedHashMap.put(counterType.name(), counterType);
        }
        ShareDataUIState = linkedHashMap;
        int i4 = component3 + 75;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final Map<String, CounterType> getBalanceTypesMap() {
        int i = 2 % 2;
        int i2 = component2 + 93;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Map<String, CounterType> map = ShareDataUIState;
        int i5 = i3 + 117;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 21 / 0;
        }
        return map;
    }
}
