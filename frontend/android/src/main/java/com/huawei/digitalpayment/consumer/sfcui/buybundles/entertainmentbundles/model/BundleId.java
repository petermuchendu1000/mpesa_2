package com.huawei.digitalpayment.consumer.sfcui.buybundles.entertainmentbundles.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/entertainmentbundles/model/BundleId;", "", "<init>", "(Ljava/lang/String;I)V", "Spotify", "Angaza", "Youtube", "Tiktok", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BundleId {
    private static final EnumEntries $ENTRIES;
    private static final BundleId[] $VALUES;
    private static int ShareDataUIState = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;
    public static final BundleId Spotify = new BundleId("Spotify", 0);
    public static final BundleId Angaza = new BundleId("Angaza", 1);
    public static final BundleId Youtube = new BundleId("Youtube", 2);
    public static final BundleId Tiktok = new BundleId("Tiktok", 3);

    private BundleId(String str, int i) {
    }

    static {
        BundleId[] bundleIdArr$values = $values();
        $VALUES = bundleIdArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(bundleIdArr$values);
        int i = copydefault + 35;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static BundleId valueOf(String str) {
        int i = 2 % 2;
        int i2 = component2 + 19;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        BundleId bundleId = (BundleId) Enum.valueOf(BundleId.class, str);
        int i4 = component3 + 27;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 66 / 0;
        }
        return bundleId;
    }

    public static BundleId[] values() {
        int i = 2 % 2;
        int i2 = component2 + 123;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        BundleId[] bundleIdArr = (BundleId[]) $VALUES.clone();
        int i4 = component3 + 83;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return bundleIdArr;
    }

    private static final BundleId[] $values() {
        int i = 2 % 2;
        int i2 = component2 + 33;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return new BundleId[]{Spotify, Angaza, Youtube, Tiktok};
        }
        BundleId bundleId = Spotify;
        BundleId bundleId2 = Angaza;
        BundleId bundleId3 = Youtube;
        BundleId bundleId4 = Tiktok;
        BundleId[] bundleIdArr = new BundleId[4];
        bundleIdArr[0] = bundleId;
        bundleIdArr[1] = bundleId2;
        bundleIdArr[4] = bundleId3;
        bundleIdArr[2] = bundleId4;
        return bundleIdArr;
    }

    public static EnumEntries<BundleId> getEntries() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 5;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        EnumEntries<BundleId> enumEntries = $ENTRIES;
        int i4 = i2 + 75;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }
}
