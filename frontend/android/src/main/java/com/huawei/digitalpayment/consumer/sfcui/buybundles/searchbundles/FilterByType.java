package com.huawei.digitalpayment.consumer.sfcui.buybundles.searchbundles;

import com.blankj.utilcode.constant.PermissionConstants;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.ImtConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/FilterByType;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/ISortFilterType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DATA", PermissionConstants.SMS, "VOICE", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FilterByType implements ISortFilterType {
    private static final EnumEntries $ENTRIES;
    private static final FilterByType[] $VALUES;
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    private final String value;
    public static final FilterByType DATA = new FilterByType("DATA", 0, ImtConstants.KEY_DATA);
    public static final FilterByType SMS = new FilterByType(PermissionConstants.SMS, 1, PermissionConstants.SMS);
    public static final FilterByType VOICE = new FilterByType("VOICE", 2, "Voice");

    private FilterByType(String str, int i, String str2) {
        this.value = str2;
    }

    @Override
    public String getValue() {
        int i = 2 % 2;
        int i2 = component2 + 59;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        FilterByType[] filterByTypeArr$values = $values();
        $VALUES = filterByTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(filterByTypeArr$values);
        int i = component3 + 27;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public static FilterByType valueOf(String str) {
        FilterByType filterByType;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            filterByType = (FilterByType) Enum.valueOf(FilterByType.class, str);
            int i3 = 83 / 0;
        } else {
            filterByType = (FilterByType) Enum.valueOf(FilterByType.class, str);
        }
        int i4 = component2 + 117;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return filterByType;
    }

    public static FilterByType[] values() {
        int i = 2 % 2;
        int i2 = component2 + 91;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FilterByType[] filterByTypeArr = (FilterByType[]) $VALUES.clone();
        int i4 = component2 + 99;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return filterByTypeArr;
    }

    private static final FilterByType[] $values() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 35;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        FilterByType[] filterByTypeArr = {DATA, SMS, VOICE};
        int i5 = i2 + 81;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return filterByTypeArr;
    }

    public static EnumEntries<FilterByType> getEntries() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
