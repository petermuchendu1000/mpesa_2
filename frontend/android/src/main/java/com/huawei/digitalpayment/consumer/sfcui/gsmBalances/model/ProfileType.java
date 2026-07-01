package com.huawei.digitalpayment.consumer.sfcui.gsmBalances.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/ProfileType;", "", "<init>", "(Ljava/lang/String;I)V", "UNDEFINED", "CONSUMER", "ENTERPRISE", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProfileType {
    private static final EnumEntries $ENTRIES;
    private static final ProfileType[] $VALUES;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    public static final ProfileType UNDEFINED = new ProfileType("UNDEFINED", 0);

    @SerializedName("CONSUMER")
    public static final ProfileType CONSUMER = new ProfileType("CONSUMER", 1);

    @SerializedName("ENTERPRISE")
    public static final ProfileType ENTERPRISE = new ProfileType("ENTERPRISE", 2);

    private ProfileType(String str, int i) {
    }

    static {
        ProfileType[] profileTypeArr$values = $values();
        $VALUES = profileTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(profileTypeArr$values);
        int i = component1 + 15;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public static ProfileType valueOf(String str) {
        int i = 2 % 2;
        int i2 = component3 + 43;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return (ProfileType) Enum.valueOf(ProfileType.class, str);
        }
        int i3 = 81 / 0;
        return (ProfileType) Enum.valueOf(ProfileType.class, str);
    }

    public static ProfileType[] values() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ProfileType[] profileTypeArr = (ProfileType[]) $VALUES.clone();
        int i4 = component3 + 65;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return profileTypeArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final ProfileType[] $values() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 71;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        ProfileType[] profileTypeArr = {UNDEFINED, CONSUMER, ENTERPRISE};
        int i5 = i2 + 35;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return profileTypeArr;
        }
        throw null;
    }

    public static EnumEntries<ProfileType> getEntries() {
        EnumEntries<ProfileType> enumEntries;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            enumEntries = $ENTRIES;
            int i4 = 90 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i3 + 111;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }
}
