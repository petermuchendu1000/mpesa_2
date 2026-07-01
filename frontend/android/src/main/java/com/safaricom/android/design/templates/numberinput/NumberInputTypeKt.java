package com.safaricom.android.design.templates.numberinput;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001d\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"numberTypesByName", "", "", "Lcom/safaricom/android/design/templates/numberinput/NumberInputType;", "getNumberTypesByName", "()Ljava/util/Map;", "ConsumerSfcNumberInput_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NumberInputTypeKt {
    private static final Map<String, NumberInputType> component1;

    static {
        EnumEntries<NumberInputType> entries = NumberInputType.getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entries, 10)), 16));
        for (NumberInputType numberInputType : entries) {
            linkedHashMap.put(numberInputType.name(), numberInputType);
        }
        component1 = linkedHashMap;
    }

    public static final Map<String, NumberInputType> getNumberTypesByName() {
        return component1;
    }
}
