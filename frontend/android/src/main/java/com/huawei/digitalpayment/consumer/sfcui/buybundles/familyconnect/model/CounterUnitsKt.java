package com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001d\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"counterUnitsMap", "", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/CounterUnits;", "getCounterUnitsMap", "()Ljava/util/Map;", "ConsumerSfcUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CounterUnitsKt {
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3;
    private static final Map<String, CounterUnits> copydefault;

    static {
        EnumEntries<CounterUnits> entries = CounterUnits.getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entries, 10)), 16));
        Iterator<CounterUnits> it = entries.iterator();
        int i = 2 % 2;
        while (it.hasNext()) {
            int i2 = component2 + 11;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                CounterUnits next = it.next();
                linkedHashMap.put(next.name(), next);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            CounterUnits next2 = it.next();
            linkedHashMap.put(next2.name(), next2);
        }
        copydefault = linkedHashMap;
        int i3 = component2 + 17;
        component1 = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final Map<String, CounterUnits> getCounterUnitsMap() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 33;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Map<String, CounterUnits> map = copydefault;
        int i5 = i2 + 111;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        throw null;
    }
}
