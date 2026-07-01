package com.huawei.digitalpayment.consumer.sfcui.gsmBalances;

import com.blankj.utilcode.constant.PermissionConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/ItemViewType;", "", "type", "", "<init>", "(Ljava/lang/String;II)V", "getType", "()I", "DEFAULT", "AIRTIME", "DATA", PermissionConstants.SMS, "BONGA", "CREDIT_LIMIT", "POSTPAID", "VOICE", "CALLS_AND_SMS", "FLEX_BUNDLES", "TUNUKIWA_DATA", "TUNUKIWA_AIRTIME", "TUNUKIWA_VOICE", "TUNUKIWA_HOURLY_VOICE", "TUNUKIWA_DAILY_VOICE", "TUNUKIWA_HOURLY_MINUTES", "TUNUKIWA_DAILY_MINUTES", "TUNUKIWA_DATA_DAILY", "TUNUKIWA_DATA_HOURLY", "TUNUKIWA_SMS_HOURLY", "TUNUKIWA_SMS_DAILY", "ROAMING_DATA", "CORPORATE_VOICE", "TUNUKIWA_SMS", "TUNUKIWA_TALKTIME", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ItemViewType {
    private static final EnumEntries $ENTRIES;
    private static final ItemViewType[] $VALUES;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault = 1;
    private final int type;
    public static final ItemViewType DEFAULT = new ItemViewType("DEFAULT", 0, 0);
    public static final ItemViewType AIRTIME = new ItemViewType("AIRTIME", 1, 1);
    public static final ItemViewType DATA = new ItemViewType("DATA", 2, 2);
    public static final ItemViewType SMS = new ItemViewType(PermissionConstants.SMS, 3, 3);
    public static final ItemViewType BONGA = new ItemViewType("BONGA", 4, 4);
    public static final ItemViewType CREDIT_LIMIT = new ItemViewType("CREDIT_LIMIT", 5, 5);
    public static final ItemViewType POSTPAID = new ItemViewType("POSTPAID", 6, 6);
    public static final ItemViewType VOICE = new ItemViewType("VOICE", 7, 7);
    public static final ItemViewType CALLS_AND_SMS = new ItemViewType("CALLS_AND_SMS", 8, 8);
    public static final ItemViewType FLEX_BUNDLES = new ItemViewType("FLEX_BUNDLES", 9, 9);
    public static final ItemViewType TUNUKIWA_DATA = new ItemViewType("TUNUKIWA_DATA", 10, 10);
    public static final ItemViewType TUNUKIWA_AIRTIME = new ItemViewType("TUNUKIWA_AIRTIME", 11, 11);
    public static final ItemViewType TUNUKIWA_VOICE = new ItemViewType("TUNUKIWA_VOICE", 12, 12);
    public static final ItemViewType TUNUKIWA_HOURLY_VOICE = new ItemViewType("TUNUKIWA_HOURLY_VOICE", 13, 13);
    public static final ItemViewType TUNUKIWA_DAILY_VOICE = new ItemViewType("TUNUKIWA_DAILY_VOICE", 14, 14);
    public static final ItemViewType TUNUKIWA_HOURLY_MINUTES = new ItemViewType("TUNUKIWA_HOURLY_MINUTES", 15, 15);
    public static final ItemViewType TUNUKIWA_DAILY_MINUTES = new ItemViewType("TUNUKIWA_DAILY_MINUTES", 16, 16);
    public static final ItemViewType TUNUKIWA_DATA_DAILY = new ItemViewType("TUNUKIWA_DATA_DAILY", 17, 17);
    public static final ItemViewType TUNUKIWA_DATA_HOURLY = new ItemViewType("TUNUKIWA_DATA_HOURLY", 18, 18);
    public static final ItemViewType TUNUKIWA_SMS_HOURLY = new ItemViewType("TUNUKIWA_SMS_HOURLY", 19, 19);
    public static final ItemViewType TUNUKIWA_SMS_DAILY = new ItemViewType("TUNUKIWA_SMS_DAILY", 20, 20);
    public static final ItemViewType ROAMING_DATA = new ItemViewType("ROAMING_DATA", 21, 21);
    public static final ItemViewType CORPORATE_VOICE = new ItemViewType("CORPORATE_VOICE", 22, 22);
    public static final ItemViewType TUNUKIWA_SMS = new ItemViewType("TUNUKIWA_SMS", 23, 23);
    public static final ItemViewType TUNUKIWA_TALKTIME = new ItemViewType("TUNUKIWA_TALKTIME", 24, 23);

    private ItemViewType(String str, int i, int i2) {
        this.type = i2;
    }

    public final int getType() {
        int i = 2 % 2;
        int i2 = component1 + 125;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.type;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        ItemViewType[] itemViewTypeArr$values = $values();
        $VALUES = itemViewTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(itemViewTypeArr$values);
        int i = ShareDataUIState + 99;
        component2 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static ItemViewType valueOf(String str) {
        int i = 2 % 2;
        int i2 = component1 + 89;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return (ItemViewType) Enum.valueOf(ItemViewType.class, str);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ItemViewType[] values() {
        int i = 2 % 2;
        int i2 = component1 + 117;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemViewType[] itemViewTypeArr = (ItemViewType[]) $VALUES.clone();
        int i4 = copydefault + 17;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return itemViewTypeArr;
    }

    private static final ItemViewType[] $values() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 15;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        ItemViewType[] itemViewTypeArr = {DEFAULT, AIRTIME, DATA, SMS, BONGA, CREDIT_LIMIT, POSTPAID, VOICE, CALLS_AND_SMS, FLEX_BUNDLES, TUNUKIWA_DATA, TUNUKIWA_AIRTIME, TUNUKIWA_VOICE, TUNUKIWA_HOURLY_VOICE, TUNUKIWA_DAILY_VOICE, TUNUKIWA_HOURLY_MINUTES, TUNUKIWA_DAILY_MINUTES, TUNUKIWA_DATA_DAILY, TUNUKIWA_DATA_HOURLY, TUNUKIWA_SMS_HOURLY, TUNUKIWA_SMS_DAILY, ROAMING_DATA, CORPORATE_VOICE, TUNUKIWA_SMS, TUNUKIWA_TALKTIME};
        int i5 = i2 + 83;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return itemViewTypeArr;
    }

    public static EnumEntries<ItemViewType> getEntries() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 59;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<ItemViewType> enumEntries = $ENTRIES;
        int i5 = i2 + 93;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        throw null;
    }
}
