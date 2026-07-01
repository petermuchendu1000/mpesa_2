package com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.models;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/models/UsageType;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", GrsBaseInfo.CountryCodeSource.APP, "TETHERING", "REMOVED_APPS", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UsageType {
    private static final EnumEntries $ENTRIES;
    private static final UsageType[] $VALUES;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault;
    private final String type;
    public static final UsageType APP = new UsageType(GrsBaseInfo.CountryCodeSource.APP, 0, "app");
    public static final UsageType TETHERING = new UsageType("TETHERING", 1, "TETHERING");
    public static final UsageType REMOVED_APPS = new UsageType("REMOVED_APPS", 2, "REMOVED_APPS");

    private UsageType(String str, int i, String str2) {
        this.type = str2;
    }

    public final String getType() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 43;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.type;
        int i5 = i2 + 91;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 89 / 0;
        }
        return str;
    }

    static {
        UsageType[] usageTypeArr$values = $values();
        $VALUES = usageTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(usageTypeArr$values);
        int i = ShareDataUIState + 31;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static UsageType valueOf(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 61;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return (UsageType) Enum.valueOf(UsageType.class, str);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static UsageType[] values() {
        int i = 2 % 2;
        int i2 = component3 + 71;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        UsageType[] usageTypeArr = (UsageType[]) $VALUES.clone();
        int i4 = component3 + 119;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
        return usageTypeArr;
    }

    private static final UsageType[] $values() {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        UsageType[] usageTypeArr = {APP, TETHERING, REMOVED_APPS};
        int i5 = i3 + 69;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return usageTypeArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<UsageType> getEntries() {
        int i = 2 % 2;
        int i2 = component3 + 103;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<UsageType> enumEntries = $ENTRIES;
        if (i3 != 0) {
            int i4 = 28 / 0;
        }
        return enumEntries;
    }
}
