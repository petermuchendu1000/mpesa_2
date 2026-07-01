package com.huawei.digitalpayment.consumer.sfcui.ui.miniapp;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/miniapp/ViewType;", "", "<init>", "(Ljava/lang/String;I)V", "List", "Grid", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ViewType {
    private static final EnumEntries $ENTRIES;
    private static final ViewType[] $VALUES;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;
    public static final ViewType List = new ViewType("List", 0);
    public static final ViewType Grid = new ViewType("Grid", 1);

    private ViewType(String str, int i) {
    }

    static {
        ViewType[] viewTypeArr$values = $values();
        $VALUES = viewTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(viewTypeArr$values);
        int i = component2 + 97;
        component1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static ViewType valueOf(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 3;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ViewType viewType = (ViewType) Enum.valueOf(ViewType.class, str);
        int i4 = copydefault + 51;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return viewType;
        }
        throw null;
    }

    public static ViewType[] values() {
        int i = 2 % 2;
        int i2 = component3 + 29;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ViewType[] viewTypeArr = (ViewType[]) $VALUES.clone();
        int i4 = component3 + 111;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return viewTypeArr;
    }

    private static final ViewType[] $values() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 41;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        ViewType[] viewTypeArr = {List, Grid};
        int i5 = i2 + 13;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return viewTypeArr;
        }
        throw null;
    }

    public static EnumEntries<ViewType> getEntries() {
        int i = 2 % 2;
        int i2 = component3 + 5;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        EnumEntries<ViewType> enumEntries = $ENTRIES;
        int i5 = i3 + 83;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 61 / 0;
        }
        return enumEntries;
    }
}
