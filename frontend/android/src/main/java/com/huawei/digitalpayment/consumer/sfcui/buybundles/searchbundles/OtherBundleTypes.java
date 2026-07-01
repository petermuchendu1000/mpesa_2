package com.huawei.digitalpayment.consumer.sfcui.buybundles.searchbundles;

import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/OtherBundleTypes;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "DAILY_BUNDLES", "SEVEN_DAY_BUNDLES", "ALL_IN_ONE_BUNDLES", "THIRTY_DAY_BUNDLES", "ANGAZA_BUNDLES", "DATA_SAVE_BUNDLE", "DAILY_SMS", "WEEKLY_SMS", "MONTHLY_SMS", "VIDEO_BUNDLES", "LITE_HEAVY_ROAMING_BUNDLES", "VODAFONE_VODACOM_ROAMING_BUNDLES", "EASY_TALK_BUNDLES", "DATA_PLUS_BUNDLES", "INTERNATIONAL_BUNDLES", "TIKTOK_BUNDLES", "SHOOK_DAILY_BUNDLES", "SHOOK_WEEKLY_BUNDLES", "SHOOK_MONTHLY_BUNDLES", "FAMILY_CONNECT", "SHINE_KENYA", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OtherBundleTypes {
    private static final EnumEntries $ENTRIES;
    private static final OtherBundleTypes[] $VALUES;
    private static int ShareDataUIState = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;
    private final String type;
    public static final OtherBundleTypes DAILY_BUNDLES = new OtherBundleTypes("DAILY_BUNDLES", 0, "Daily Bundles");
    public static final OtherBundleTypes SEVEN_DAY_BUNDLES = new OtherBundleTypes("SEVEN_DAY_BUNDLES", 1, "7 Days Bundles");
    public static final OtherBundleTypes ALL_IN_ONE_BUNDLES = new OtherBundleTypes("ALL_IN_ONE_BUNDLES", 2, "All in One Monthly Bundle");
    public static final OtherBundleTypes THIRTY_DAY_BUNDLES = new OtherBundleTypes("THIRTY_DAY_BUNDLES", 3, "30s Day Bundles");
    public static final OtherBundleTypes ANGAZA_BUNDLES = new OtherBundleTypes("ANGAZA_BUNDLES", 4, "Angaza Bundles");
    public static final OtherBundleTypes DATA_SAVE_BUNDLE = new OtherBundleTypes("DATA_SAVE_BUNDLE", 5, "Data Save");
    public static final OtherBundleTypes DAILY_SMS = new OtherBundleTypes("DAILY_SMS", 6, Keys.WITH_EXPIRY_CATEGORY_DAILY);
    public static final OtherBundleTypes WEEKLY_SMS = new OtherBundleTypes("WEEKLY_SMS", 7, "7 Days");
    public static final OtherBundleTypes MONTHLY_SMS = new OtherBundleTypes("MONTHLY_SMS", 8, "30 Days");
    public static final OtherBundleTypes VIDEO_BUNDLES = new OtherBundleTypes("VIDEO_BUNDLES", 9, "Video Bundles");
    public static final OtherBundleTypes LITE_HEAVY_ROAMING_BUNDLES = new OtherBundleTypes("LITE_HEAVY_ROAMING_BUNDLES", 10, "Roaming Bundles");
    public static final OtherBundleTypes VODAFONE_VODACOM_ROAMING_BUNDLES = new OtherBundleTypes("VODAFONE_VODACOM_ROAMING_BUNDLES", 11, "Vodafone/Vodacom Roaming Bundles");
    public static final OtherBundleTypes EASY_TALK_BUNDLES = new OtherBundleTypes("EASY_TALK_BUNDLES", 12, "Easy-Talk Monthly Bundles");
    public static final OtherBundleTypes DATA_PLUS_BUNDLES = new OtherBundleTypes("DATA_PLUS_BUNDLES", 13, "Giga Bundles");
    public static final OtherBundleTypes INTERNATIONAL_BUNDLES = new OtherBundleTypes("INTERNATIONAL_BUNDLES", 14, "International Bundles");
    public static final OtherBundleTypes TIKTOK_BUNDLES = new OtherBundleTypes("TIKTOK_BUNDLES", 15, "Tiktok Bundles");
    public static final OtherBundleTypes SHOOK_DAILY_BUNDLES = new OtherBundleTypes("SHOOK_DAILY_BUNDLES", 16, "SHook Daily Bundles");
    public static final OtherBundleTypes SHOOK_WEEKLY_BUNDLES = new OtherBundleTypes("SHOOK_WEEKLY_BUNDLES", 17, "SHook Weekly Bundles");
    public static final OtherBundleTypes SHOOK_MONTHLY_BUNDLES = new OtherBundleTypes("SHOOK_MONTHLY_BUNDLES", 18, "SHook Monthly Bundles");
    public static final OtherBundleTypes FAMILY_CONNECT = new OtherBundleTypes("FAMILY_CONNECT", 19, "Family Connect Bundles");
    public static final OtherBundleTypes SHINE_KENYA = new OtherBundleTypes("SHINE_KENYA", 20, "Shine Kenya");

    private OtherBundleTypes(String str, int i, String str2) {
        this.type = str2;
    }

    public final String getType() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 69;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.type;
            int i4 = 76 / 0;
        } else {
            str = this.type;
        }
        int i5 = i2 + 115;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        OtherBundleTypes[] otherBundleTypesArr$values = $values();
        $VALUES = otherBundleTypesArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(otherBundleTypesArr$values);
        int i = ShareDataUIState + 115;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public static OtherBundleTypes valueOf(String str) {
        int i = 2 % 2;
        int i2 = component2 + 69;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return (OtherBundleTypes) Enum.valueOf(OtherBundleTypes.class, str);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static OtherBundleTypes[] values() {
        int i = 2 % 2;
        int i2 = component2 + 97;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        OtherBundleTypes[] otherBundleTypesArr = (OtherBundleTypes[]) $VALUES.clone();
        int i4 = component2 + 77;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return otherBundleTypesArr;
    }

    private static final OtherBundleTypes[] $values() {
        int i = 2 % 2;
        int i2 = component2 + 5;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        OtherBundleTypes[] otherBundleTypesArr = {DAILY_BUNDLES, SEVEN_DAY_BUNDLES, ALL_IN_ONE_BUNDLES, THIRTY_DAY_BUNDLES, ANGAZA_BUNDLES, DATA_SAVE_BUNDLE, DAILY_SMS, WEEKLY_SMS, MONTHLY_SMS, VIDEO_BUNDLES, LITE_HEAVY_ROAMING_BUNDLES, VODAFONE_VODACOM_ROAMING_BUNDLES, EASY_TALK_BUNDLES, DATA_PLUS_BUNDLES, INTERNATIONAL_BUNDLES, TIKTOK_BUNDLES, SHOOK_DAILY_BUNDLES, SHOOK_WEEKLY_BUNDLES, SHOOK_MONTHLY_BUNDLES, FAMILY_CONNECT, SHINE_KENYA};
        int i5 = i3 + 9;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return otherBundleTypesArr;
    }

    public static EnumEntries<OtherBundleTypes> getEntries() {
        int i = 2 % 2;
        int i2 = component3 + 61;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        EnumEntries<OtherBundleTypes> enumEntries = $ENTRIES;
        int i5 = i3 + 75;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }
}
