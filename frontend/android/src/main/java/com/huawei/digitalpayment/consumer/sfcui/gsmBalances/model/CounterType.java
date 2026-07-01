package com.huawei.digitalpayment.consumer.sfcui.gsmBalances.model;

import com.blankj.utilcode.constant.PermissionConstants;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b \b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/CounterType;", "", "<init>", "(Ljava/lang/String;I)V", "UNDEFINED", "INTERNET", "VOICE", "VOICE_NORMAL", "AIRTIME", "AIRTIME_NORMAL", PermissionConstants.SMS, "SMS_NORMAL", "OUTSTANDING", "CURRENT_BILL", "A_CREDIT_LIMIT", "DATA_NORMAL", "B_BONGA", "ROAMING_DATA", "B_CALLING_AIRTIME", "CALLS_AND_SMS", "TUNUKIWA_DATA", "TUNUKIWA_VOICE", "TUNUKIWA_SMS", "TUNUKIWA_DAILY_MINUTES", "TUNUKIWA_AIRTIME", "TUNUKIWA_HOURLY_VOICE", "TUNUKIWA_DAILY_VOICE", "TUNUKIWA_HOURLY_MINUTES", "TUNUKIWA_DATA_DAILY", "TUNUKIWA_DATA_HOURLY", "TUNUKIWA_SMS_HOURLY", "TUNUKIWA_SMS_DAILY", "TUNUKIWA_TALKTIME", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CounterType {
    private static final EnumEntries $ENTRIES;
    private static final CounterType[] $VALUES;
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;
    public static final CounterType UNDEFINED = new CounterType("UNDEFINED", 0);

    @SerializedName("internet")
    public static final CounterType INTERNET = new CounterType("INTERNET", 1);

    @SerializedName("voice")
    public static final CounterType VOICE = new CounterType("VOICE", 2);

    @SerializedName("Voice_normal")
    public static final CounterType VOICE_NORMAL = new CounterType("VOICE_NORMAL", 3);

    @SerializedName("airtime")
    public static final CounterType AIRTIME = new CounterType("AIRTIME", 4);

    @SerializedName("Airtime_Normal")
    public static final CounterType AIRTIME_NORMAL = new CounterType("AIRTIME_NORMAL", 5);

    @SerializedName(Keys.BUNDLE_TYPE_SMS)
    public static final CounterType SMS = new CounterType(PermissionConstants.SMS, 6);

    @SerializedName("SMS_normal")
    public static final CounterType SMS_NORMAL = new CounterType("SMS_NORMAL", 7);

    @SerializedName("outstanding")
    public static final CounterType OUTSTANDING = new CounterType("OUTSTANDING", 8);

    @SerializedName("currentBill")
    public static final CounterType CURRENT_BILL = new CounterType("CURRENT_BILL", 9);

    @SerializedName("A_Credit_Limit")
    public static final CounterType A_CREDIT_LIMIT = new CounterType("A_CREDIT_LIMIT", 10);

    @SerializedName("Data_Normal")
    public static final CounterType DATA_NORMAL = new CounterType("DATA_NORMAL", 11);

    @SerializedName("B_Bonga")
    public static final CounterType B_BONGA = new CounterType("B_BONGA", 12);

    @SerializedName("Roaming Data")
    public static final CounterType ROAMING_DATA = new CounterType("ROAMING_DATA", 13);

    @SerializedName("B_Calling_Airtime")
    public static final CounterType B_CALLING_AIRTIME = new CounterType("B_CALLING_AIRTIME", 14);

    @SerializedName("B_Calling_Airtime")
    public static final CounterType CALLS_AND_SMS = new CounterType("CALLS_AND_SMS", 15);

    @SerializedName("tunukiwa_data")
    public static final CounterType TUNUKIWA_DATA = new CounterType("TUNUKIWA_DATA", 16);

    @SerializedName("tunukiwa_voice")
    public static final CounterType TUNUKIWA_VOICE = new CounterType("TUNUKIWA_VOICE", 17);

    @SerializedName("tunukiwa_sms")
    public static final CounterType TUNUKIWA_SMS = new CounterType("TUNUKIWA_SMS", 18);

    @SerializedName("Tunukiwa_daily_minutes")
    public static final CounterType TUNUKIWA_DAILY_MINUTES = new CounterType("TUNUKIWA_DAILY_MINUTES", 19);

    @SerializedName("tunukiwa_airtime")
    public static final CounterType TUNUKIWA_AIRTIME = new CounterType("TUNUKIWA_AIRTIME", 20);

    @SerializedName("Tunukiwa_hourly_talktime")
    public static final CounterType TUNUKIWA_HOURLY_VOICE = new CounterType("TUNUKIWA_HOURLY_VOICE", 21);

    @SerializedName("Tunukiwa_daily_talktime")
    public static final CounterType TUNUKIWA_DAILY_VOICE = new CounterType("TUNUKIWA_DAILY_VOICE", 22);

    @SerializedName("Tunukiwa_hourly_minutes")
    public static final CounterType TUNUKIWA_HOURLY_MINUTES = new CounterType("TUNUKIWA_HOURLY_MINUTES", 23);

    @SerializedName("Tunukiwa_data_daily")
    public static final CounterType TUNUKIWA_DATA_DAILY = new CounterType("TUNUKIWA_DATA_DAILY", 24);

    @SerializedName("Tunukiwa_data_hourly")
    public static final CounterType TUNUKIWA_DATA_HOURLY = new CounterType("TUNUKIWA_DATA_HOURLY", 25);

    @SerializedName("Tunukiwa_sms_hourly")
    public static final CounterType TUNUKIWA_SMS_HOURLY = new CounterType("TUNUKIWA_SMS_HOURLY", 26);

    @SerializedName("Tunukiwa_sms_daily")
    public static final CounterType TUNUKIWA_SMS_DAILY = new CounterType("TUNUKIWA_SMS_DAILY", 27);

    @SerializedName("tunukiwa_talktime")
    public static final CounterType TUNUKIWA_TALKTIME = new CounterType("TUNUKIWA_TALKTIME", 28);

    private CounterType(String str, int i) {
    }

    static {
        CounterType[] counterTypeArr$values = $values();
        $VALUES = counterTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(counterTypeArr$values);
        int i = component3 + 9;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static CounterType valueOf(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 51;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        CounterType counterType = (CounterType) Enum.valueOf(CounterType.class, str);
        int i4 = component2 + 5;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return counterType;
    }

    public static CounterType[] values() {
        CounterType[] counterTypeArr;
        int i = 2 % 2;
        int i2 = copydefault + 13;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            counterTypeArr = (CounterType[]) $VALUES.clone();
            int i3 = 81 / 0;
        } else {
            counterTypeArr = (CounterType[]) $VALUES.clone();
        }
        int i4 = copydefault + 27;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
        return counterTypeArr;
    }

    private static final CounterType[] $values() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 51;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        CounterType[] counterTypeArr = {UNDEFINED, INTERNET, VOICE, VOICE_NORMAL, AIRTIME, AIRTIME_NORMAL, SMS, SMS_NORMAL, OUTSTANDING, CURRENT_BILL, A_CREDIT_LIMIT, DATA_NORMAL, B_BONGA, ROAMING_DATA, B_CALLING_AIRTIME, CALLS_AND_SMS, TUNUKIWA_DATA, TUNUKIWA_VOICE, TUNUKIWA_SMS, TUNUKIWA_DAILY_MINUTES, TUNUKIWA_AIRTIME, TUNUKIWA_HOURLY_VOICE, TUNUKIWA_DAILY_VOICE, TUNUKIWA_HOURLY_MINUTES, TUNUKIWA_DATA_DAILY, TUNUKIWA_DATA_HOURLY, TUNUKIWA_SMS_HOURLY, TUNUKIWA_SMS_DAILY, TUNUKIWA_TALKTIME};
        int i5 = i2 + 63;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return counterTypeArr;
    }

    public static EnumEntries<CounterType> getEntries() {
        int i = 2 % 2;
        int i2 = component2 + 85;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        EnumEntries<CounterType> enumEntries = $ENTRIES;
        int i5 = i3 + 17;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        throw null;
    }
}
