package com.huawei.digitalpayment.consumer.sfcui.buybundles.caching;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/caching/BundleCacheType;", "", "<init>", "(Ljava/lang/String;I)V", "WITH_EXPIRY", "NO_EXPIRY", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BundleCacheType {
    private static final EnumEntries $ENTRIES;
    private static final BundleCacheType[] $VALUES;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;
    public static final BundleCacheType WITH_EXPIRY = new BundleCacheType("WITH_EXPIRY", 0);
    public static final BundleCacheType NO_EXPIRY = new BundleCacheType("NO_EXPIRY", 1);

    private BundleCacheType(String str, int i) {
    }

    static {
        BundleCacheType[] bundleCacheTypeArr$values = $values();
        $VALUES = bundleCacheTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(bundleCacheTypeArr$values);
        int i = component1 + 115;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static BundleCacheType valueOf(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return (BundleCacheType) Enum.valueOf(BundleCacheType.class, str);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static BundleCacheType[] values() {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return (BundleCacheType[]) $VALUES.clone();
        }
        int i3 = 21 / 0;
        return (BundleCacheType[]) $VALUES.clone();
    }

    private static final BundleCacheType[] $values() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 77;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        BundleCacheType[] bundleCacheTypeArr = {WITH_EXPIRY, NO_EXPIRY};
        int i5 = i2 + 107;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return bundleCacheTypeArr;
    }

    public static EnumEntries<BundleCacheType> getEntries() {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
