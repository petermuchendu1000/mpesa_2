package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DIYProductCatalogTypes;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "EASY_TALK_BUNDLES", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DIYProductCatalogTypes {
    private static final EnumEntries $ENTRIES;
    private static final DIYProductCatalogTypes[] $VALUES;
    public static final DIYProductCatalogTypes EASY_TALK_BUNDLES = new DIYProductCatalogTypes("EASY_TALK_BUNDLES", 0, "Easy-Talk Bundles");
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3;
    private final String type;

    private DIYProductCatalogTypes(String str, int i, String str2) {
        this.type = str2;
    }

    public final String getType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.type;
        int i5 = i3 + 23;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        DIYProductCatalogTypes[] dIYProductCatalogTypesArr$values = $values();
        $VALUES = dIYProductCatalogTypesArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(dIYProductCatalogTypesArr$values);
        int i = component2 + 51;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static DIYProductCatalogTypes valueOf(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return (DIYProductCatalogTypes) Enum.valueOf(DIYProductCatalogTypes.class, str);
        }
        throw null;
    }

    public static DIYProductCatalogTypes[] values() {
        int i = 2 % 2;
        int i2 = component3 + 77;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DIYProductCatalogTypes[] dIYProductCatalogTypesArr = (DIYProductCatalogTypes[]) $VALUES.clone();
        int i4 = component3 + 1;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return dIYProductCatalogTypesArr;
        }
        throw null;
    }

    private static final DIYProductCatalogTypes[] $values() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 67;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        DIYProductCatalogTypes[] dIYProductCatalogTypesArr = {EASY_TALK_BUNDLES};
        int i5 = i2 + 101;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return dIYProductCatalogTypesArr;
    }

    public static EnumEntries<DIYProductCatalogTypes> getEntries() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        EnumEntries<DIYProductCatalogTypes> enumEntries = $ENTRIES;
        int i5 = i3 + 25;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }
}
