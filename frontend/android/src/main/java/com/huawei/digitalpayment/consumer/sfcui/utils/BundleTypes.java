package com.huawei.digitalpayment.consumer.sfcui.utils;

import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/utils/BundleTypes;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "DAILY_BUNDLES", "SEVEN_DAY_BUNDLES", "ALL_IN_ONE_BUNDLES", "THIRTY_DAY_BUNDLES", "ANGAZA_BUNDLES", "DATA_SAVE_BUNDLE", "DAILY_SMS", "WEEKLY_SMS", "MONTHLY_SMS", "VIDEO_BUNDLES", "LITE_HEAVY_ROAMING_BUNDLES", "VODAFONE_VODACOM_ROAMING_BUNDLES", "EASY_TALK_BUNDLES", "DATA_PLUS_BUNDLES", "INTERNATIONAL_BUNDLES", "TIKTOK_BUNDLES", "SHOOK_DAILY_BUNDLES", "SHOOK_WEEKLY_BUNDLES", "SHOOK_MONTHLY_BUNDLES", "FAMILY_CONNECT", "SHINE_KENYA", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BundleTypes {
    private static final EnumEntries $ENTRIES;
    private static final BundleTypes[] $VALUES;
    private static int ShareDataUIState = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;
    private final String type;
    public static final BundleTypes DAILY_BUNDLES = new BundleTypes("DAILY_BUNDLES", 0, "Daily Bundles");
    public static final BundleTypes SEVEN_DAY_BUNDLES = new BundleTypes("SEVEN_DAY_BUNDLES", 1, "7 Days Bundles");
    public static final BundleTypes ALL_IN_ONE_BUNDLES = new BundleTypes("ALL_IN_ONE_BUNDLES", 2, "All in One Monthly Bundle");
    public static final BundleTypes THIRTY_DAY_BUNDLES = new BundleTypes("THIRTY_DAY_BUNDLES", 3, "30s Day Bundles");
    public static final BundleTypes ANGAZA_BUNDLES = new BundleTypes("ANGAZA_BUNDLES", 4, "Angaza Bundles");
    public static final BundleTypes DATA_SAVE_BUNDLE = new BundleTypes("DATA_SAVE_BUNDLE", 5, "Data Save");
    public static final BundleTypes DAILY_SMS = new BundleTypes("DAILY_SMS", 6, Keys.WITH_EXPIRY_CATEGORY_DAILY);
    public static final BundleTypes WEEKLY_SMS = new BundleTypes("WEEKLY_SMS", 7, "7 Days");
    public static final BundleTypes MONTHLY_SMS = new BundleTypes("MONTHLY_SMS", 8, "30 Days");
    public static final BundleTypes VIDEO_BUNDLES = new BundleTypes("VIDEO_BUNDLES", 9, "Video Bundles");
    public static final BundleTypes LITE_HEAVY_ROAMING_BUNDLES = new BundleTypes("LITE_HEAVY_ROAMING_BUNDLES", 10, "Roaming Bundles");
    public static final BundleTypes VODAFONE_VODACOM_ROAMING_BUNDLES = new BundleTypes("VODAFONE_VODACOM_ROAMING_BUNDLES", 11, "Vodafone/Vodacom Roaming Bundles");
    public static final BundleTypes EASY_TALK_BUNDLES = new BundleTypes("EASY_TALK_BUNDLES", 12, "Easy-Talk Monthly Bundles");
    public static final BundleTypes DATA_PLUS_BUNDLES = new BundleTypes("DATA_PLUS_BUNDLES", 13, "Giga Bundles");
    public static final BundleTypes INTERNATIONAL_BUNDLES = new BundleTypes("INTERNATIONAL_BUNDLES", 14, "International Bundles");
    public static final BundleTypes TIKTOK_BUNDLES = new BundleTypes("TIKTOK_BUNDLES", 15, "Tiktok Bundles");
    public static final BundleTypes SHOOK_DAILY_BUNDLES = new BundleTypes("SHOOK_DAILY_BUNDLES", 16, "SHook Daily Bundles");
    public static final BundleTypes SHOOK_WEEKLY_BUNDLES = new BundleTypes("SHOOK_WEEKLY_BUNDLES", 17, "SHook Weekly Bundles");
    public static final BundleTypes SHOOK_MONTHLY_BUNDLES = new BundleTypes("SHOOK_MONTHLY_BUNDLES", 18, "SHook Monthly Bundles");
    public static final BundleTypes FAMILY_CONNECT = new BundleTypes("FAMILY_CONNECT", 19, "Family Connect Bundles");
    public static final BundleTypes SHINE_KENYA = new BundleTypes("SHINE_KENYA", 20, "Shine Kenya");

    private BundleTypes(String str, int i, String str2) {
        this.type = str2;
    }

    public final String getType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 107;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.type;
        int i5 = i2 + 115;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        BundleTypes[] bundleTypesArr$values = $values();
        $VALUES = bundleTypesArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(bundleTypesArr$values);
        int i = component3 + 99;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static BundleTypes valueOf(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return (BundleTypes) Enum.valueOf(BundleTypes.class, str);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static BundleTypes[] values() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        BundleTypes[] bundleTypesArr = (BundleTypes[]) $VALUES.clone();
        int i4 = copydefault + 73;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return bundleTypesArr;
    }

    private static final BundleTypes[] $values() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 7;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        BundleTypes[] bundleTypesArr = {DAILY_BUNDLES, SEVEN_DAY_BUNDLES, ALL_IN_ONE_BUNDLES, THIRTY_DAY_BUNDLES, ANGAZA_BUNDLES, DATA_SAVE_BUNDLE, DAILY_SMS, WEEKLY_SMS, MONTHLY_SMS, VIDEO_BUNDLES, LITE_HEAVY_ROAMING_BUNDLES, VODAFONE_VODACOM_ROAMING_BUNDLES, EASY_TALK_BUNDLES, DATA_PLUS_BUNDLES, INTERNATIONAL_BUNDLES, TIKTOK_BUNDLES, SHOOK_DAILY_BUNDLES, SHOOK_WEEKLY_BUNDLES, SHOOK_MONTHLY_BUNDLES, FAMILY_CONNECT, SHINE_KENYA};
        int i5 = i2 + 41;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return bundleTypesArr;
    }

    public static EnumEntries<BundleTypes> getEntries() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        EnumEntries<BundleTypes> enumEntries = $ENTRIES;
        int i5 = i3 + 37;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }
}
