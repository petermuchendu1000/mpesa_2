package com.huawei.digitalpayment.consumer.sfcui.buybundles.searchbundles;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SortByPrice;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/ISortFilterType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ASCENDING", "DESCENDING", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SortByPrice implements ISortFilterType {
    private static final EnumEntries $ENTRIES;
    private static final SortByPrice[] $VALUES;
    public static final SortByPrice ASCENDING = new SortByPrice("ASCENDING", 0, "Ascending");
    public static final SortByPrice DESCENDING = new SortByPrice("DESCENDING", 1, "Descending");
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;
    private final String value;

    private SortByPrice(String str, int i, String str2) {
        this.value = str2;
    }

    @Override
    public String getValue() {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 25;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 42 / 0;
        }
        return str;
    }

    static {
        SortByPrice[] sortByPriceArr$values = $values();
        $VALUES = sortByPriceArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(sortByPriceArr$values);
        int i = component2 + 97;
        component3 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static SortByPrice valueOf(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return (SortByPrice) Enum.valueOf(SortByPrice.class, str);
        }
        throw null;
    }

    public static SortByPrice[] values() {
        int i = 2 % 2;
        int i2 = component1 + 23;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        SortByPrice[] sortByPriceArr = (SortByPrice[]) $VALUES.clone();
        int i4 = copydefault + 39;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return sortByPriceArr;
    }

    private static final SortByPrice[] $values() {
        SortByPrice[] sortByPriceArr;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 105;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            sortByPriceArr = new SortByPrice[]{DESCENDING, ASCENDING};
        } else {
            sortByPriceArr = new SortByPrice[]{ASCENDING, DESCENDING};
        }
        int i4 = i2 + 111;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return sortByPriceArr;
    }

    public static EnumEntries<SortByPrice> getEntries() {
        int i = 2 % 2;
        int i2 = component1 + 89;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        throw null;
    }
}
