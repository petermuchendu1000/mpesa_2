package com.huawei.digitalpayment.consumer.base.resp;

import com.blankj.utilcode.constant.PermissionConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/BalanceType;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "AIRTIME", "DATA", PermissionConstants.SMS, "BONGA", "CREDIT_LIMIT", "POSTPAID", "VOICE", "CALLS_AND_SMS", "FLEX_BUNDLES", "TUNUKIWA_DATA", "TUNUKIWA_AIRTIME", "TUNUKIWA_VOICE", "TUNUKIWA_HOURLY_VOICE", "TUNUKIWA_DAILY_VOICE", "TUNUKIWA_HOURLY_MINUTES", "TUNUKIWA_DAILY_MINUTES", "TUNUKIWA_DATA_DAILY", "TUNUKIWA_DATA_HOURLY", "TUNUKIWA_SMS_HOURLY", "TUNUKIWA_SMS_DAILY", "TUNUKIWA_SMS", "TUNUKIWA_TALKTIME", "ROAMING_DATA", "CORPORATE_VOICE", "UNLIMITED_OFFER", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BalanceType {
    private static final EnumEntries $ENTRIES;
    private static final BalanceType[] $VALUES;
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;
    private final String type;
    public static final BalanceType AIRTIME = new BalanceType("AIRTIME", 0, "Airtime_Normal");
    public static final BalanceType DATA = new BalanceType("DATA", 1, "Data_Normal");
    public static final BalanceType SMS = new BalanceType(PermissionConstants.SMS, 2, "SMS_normal");
    public static final BalanceType BONGA = new BalanceType("BONGA", 3, "B_Bonga");
    public static final BalanceType CREDIT_LIMIT = new BalanceType("CREDIT_LIMIT", 4, "A_Credit_Limit");
    public static final BalanceType POSTPAID = new BalanceType("POSTPAID", 5, "A_Postpaid");
    public static final BalanceType VOICE = new BalanceType("VOICE", 6, "Voice_normal");
    public static final BalanceType CALLS_AND_SMS = new BalanceType("CALLS_AND_SMS", 7, "B_Calling_Airtime");
    public static final BalanceType FLEX_BUNDLES = new BalanceType("FLEX_BUNDLES", 8, "B_Normal_Flex");
    public static final BalanceType TUNUKIWA_DATA = new BalanceType("TUNUKIWA_DATA", 9, "tunukiwa_data");
    public static final BalanceType TUNUKIWA_AIRTIME = new BalanceType("TUNUKIWA_AIRTIME", 10, "tunukiwa_airtime");
    public static final BalanceType TUNUKIWA_VOICE = new BalanceType("TUNUKIWA_VOICE", 11, "tunukiwa_voice");
    public static final BalanceType TUNUKIWA_HOURLY_VOICE = new BalanceType("TUNUKIWA_HOURLY_VOICE", 12, "Tunukiwa_hourly_talktime");
    public static final BalanceType TUNUKIWA_DAILY_VOICE = new BalanceType("TUNUKIWA_DAILY_VOICE", 13, "Tunukiwa_daily_talktime");
    public static final BalanceType TUNUKIWA_HOURLY_MINUTES = new BalanceType("TUNUKIWA_HOURLY_MINUTES", 14, "Tunukiwa_hourly_minutes");
    public static final BalanceType TUNUKIWA_DAILY_MINUTES = new BalanceType("TUNUKIWA_DAILY_MINUTES", 15, "Tunukiwa_daily_minutes");
    public static final BalanceType TUNUKIWA_DATA_DAILY = new BalanceType("TUNUKIWA_DATA_DAILY", 16, "Tunukiwa_data_daily");
    public static final BalanceType TUNUKIWA_DATA_HOURLY = new BalanceType("TUNUKIWA_DATA_HOURLY", 17, "Tunukiwa_data_hourly");
    public static final BalanceType TUNUKIWA_SMS_HOURLY = new BalanceType("TUNUKIWA_SMS_HOURLY", 18, "Tunukiwa_sms_hourly");
    public static final BalanceType TUNUKIWA_SMS_DAILY = new BalanceType("TUNUKIWA_SMS_DAILY", 19, "Tunukiwa_sms_daily");
    public static final BalanceType TUNUKIWA_SMS = new BalanceType("TUNUKIWA_SMS", 20, "tunukiwa_sms");
    public static final BalanceType TUNUKIWA_TALKTIME = new BalanceType("TUNUKIWA_TALKTIME", 21, "tunukiwa_talktime");
    public static final BalanceType ROAMING_DATA = new BalanceType("ROAMING_DATA", 22, "Roaming Data");
    public static final BalanceType CORPORATE_VOICE = new BalanceType("CORPORATE_VOICE", 23, "Voice_normal");
    public static final BalanceType UNLIMITED_OFFER = new BalanceType("UNLIMITED_OFFER", 24, "Unlimited");

    private BalanceType(String str, int i, String str2) {
        this.type = str2;
    }

    public final String getType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.type;
        int i5 = i3 + 75;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        BalanceType[] balanceTypeArr$values = $values();
        $VALUES = balanceTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(balanceTypeArr$values);
        int i = component3 + 49;
        component2 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static BalanceType valueOf(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 25;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return (BalanceType) Enum.valueOf(BalanceType.class, str);
        }
        int i3 = 21 / 0;
        return (BalanceType) Enum.valueOf(BalanceType.class, str);
    }

    public static BalanceType[] values() {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        BalanceType[] balanceTypeArr = (BalanceType[]) $VALUES.clone();
        int i3 = ShareDataUIState + 29;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 55 / 0;
        }
        return balanceTypeArr;
    }

    private static final BalanceType[] $values() {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        BalanceType[] balanceTypeArr = {AIRTIME, DATA, SMS, BONGA, CREDIT_LIMIT, POSTPAID, VOICE, CALLS_AND_SMS, FLEX_BUNDLES, TUNUKIWA_DATA, TUNUKIWA_AIRTIME, TUNUKIWA_VOICE, TUNUKIWA_HOURLY_VOICE, TUNUKIWA_DAILY_VOICE, TUNUKIWA_HOURLY_MINUTES, TUNUKIWA_DAILY_MINUTES, TUNUKIWA_DATA_DAILY, TUNUKIWA_DATA_HOURLY, TUNUKIWA_SMS_HOURLY, TUNUKIWA_SMS_DAILY, TUNUKIWA_SMS, TUNUKIWA_TALKTIME, ROAMING_DATA, CORPORATE_VOICE, UNLIMITED_OFFER};
        int i5 = i3 + 5;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return balanceTypeArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<BalanceType> getEntries() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 53;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        EnumEntries<BalanceType> enumEntries = $ENTRIES;
        int i4 = i2 + 101;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }
}
