package com.huawei.digitalpayment.consumer.sfcui.buybundles.searchbundles;

import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/FilterByValidity;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/ISortFilterType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MONTHLY", "WEEKLY", "DAILY", "OTHER", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FilterByValidity implements ISortFilterType {
    private static final EnumEntries $ENTRIES;
    private static final FilterByValidity[] $VALUES;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    private final String value;
    public static final FilterByValidity MONTHLY = new FilterByValidity("MONTHLY", 0, Keys.WITH_EXPIRY_CATEGORY_MONTHLY);
    public static final FilterByValidity WEEKLY = new FilterByValidity("WEEKLY", 1, Keys.WITH_EXPIRY_CATEGORY_WEEKLY);
    public static final FilterByValidity DAILY = new FilterByValidity("DAILY", 2, Keys.WITH_EXPIRY_CATEGORY_DAILY);
    public static final FilterByValidity OTHER = new FilterByValidity("OTHER", 3, "Other");

    private FilterByValidity(String str, int i, String str2) {
        this.value = str2;
    }

    @Override
    public String getValue() {
        int i = 2 % 2;
        int i2 = component3 + 97;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.value;
        if (i3 == 0) {
            int i4 = 68 / 0;
        }
        return str;
    }

    static {
        FilterByValidity[] filterByValidityArr$values = $values();
        $VALUES = filterByValidityArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(filterByValidityArr$values);
        int i = copydefault + 23;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static FilterByValidity valueOf(String str) {
        int i = 2 % 2;
        int i2 = component1 + 5;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FilterByValidity filterByValidity = (FilterByValidity) Enum.valueOf(FilterByValidity.class, str);
        int i4 = component3 + 105;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return filterByValidity;
    }

    public static FilterByValidity[] values() {
        int i = 2 % 2;
        int i2 = component1 + 27;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FilterByValidity[] filterByValidityArr = (FilterByValidity[]) $VALUES.clone();
        int i4 = component3 + 81;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return filterByValidityArr;
    }

    private static final FilterByValidity[] $values() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 27;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        FilterByValidity[] filterByValidityArr = {MONTHLY, WEEKLY, DAILY, OTHER};
        int i5 = i2 + 37;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 8 / 0;
        }
        return filterByValidityArr;
    }

    public static EnumEntries<FilterByValidity> getEntries() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 119;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<FilterByValidity> enumEntries = $ENTRIES;
        int i5 = i2 + 31;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }
}
