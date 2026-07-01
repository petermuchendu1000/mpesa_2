package com.huawei.digitalpayment.customer.dynamics.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/customer/dynamics/model/ElementMode;", "", "<init>", "(Ljava/lang/String;I)V", "CREATE", "EDIT", "VIEW", "DynamicsView_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ElementMode {
    private static final EnumEntries $ENTRIES;
    private static final ElementMode[] $VALUES;
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;
    public static final ElementMode CREATE = new ElementMode("CREATE", 0);
    public static final ElementMode EDIT = new ElementMode("EDIT", 1);
    public static final ElementMode VIEW = new ElementMode("VIEW", 2);

    private ElementMode(String str, int i) {
    }

    static {
        ElementMode[] elementModeArr$values = $values();
        $VALUES = elementModeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(elementModeArr$values);
        int i = component2 + 99;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public static ElementMode valueOf(String str) {
        int i = 2 % 2;
        int i2 = component3 + 75;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ElementMode elementMode = (ElementMode) Enum.valueOf(ElementMode.class, str);
        int i4 = component3 + 37;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return elementMode;
    }

    public static ElementMode[] values() {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ElementMode[] elementModeArr = (ElementMode[]) $VALUES.clone();
        int i4 = copydefault + 47;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return elementModeArr;
    }

    private static final ElementMode[] $values() {
        ElementMode[] elementModeArr;
        int i = 2 % 2;
        int i2 = component3 + 45;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            ElementMode elementMode = CREATE;
            ElementMode elementMode2 = EDIT;
            ElementMode elementMode3 = VIEW;
            elementModeArr = new ElementMode[4];
            elementModeArr[0] = elementMode;
            elementModeArr[0] = elementMode2;
            elementModeArr[4] = elementMode3;
        } else {
            elementModeArr = new ElementMode[]{CREATE, EDIT, VIEW};
        }
        int i4 = i3 + 35;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return elementModeArr;
    }

    public static EnumEntries<ElementMode> getEntries() {
        int i = 2 % 2;
        int i2 = component3 + 103;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
