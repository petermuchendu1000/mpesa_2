package com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model;

import com.blankj.utilcode.constant.PermissionConstants;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/CounterUnits;", "", "<init>", "(Ljava/lang/String;I)V", "UNDEFINED", "BYTE", "SECOND", "CENTS", "UNIT", "KES", "MBs", "POINTS", "MINUTES", PermissionConstants.SMS, "SECONDS", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CounterUnits {
    private static final EnumEntries $ENTRIES;
    private static final CounterUnits[] $VALUES;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int copydefault = 1;
    public static final CounterUnits UNDEFINED = new CounterUnits("UNDEFINED", 0);

    @SerializedName("byte")
    public static final CounterUnits BYTE = new CounterUnits("BYTE", 1);

    @SerializedName("second")
    public static final CounterUnits SECOND = new CounterUnits("SECOND", 2);

    @SerializedName("cents")
    public static final CounterUnits CENTS = new CounterUnits("CENTS", 3);

    @SerializedName("unit")
    public static final CounterUnits UNIT = new CounterUnits("UNIT", 4);

    @SerializedName("KES")
    public static final CounterUnits KES = new CounterUnits("KES", 5);

    @SerializedName("MBs")
    public static final CounterUnits MBs = new CounterUnits("MBs", 6);

    @SerializedName("Points")
    public static final CounterUnits POINTS = new CounterUnits("POINTS", 7);

    @SerializedName(Keys.TUNUKIWA_CATEGORY_MINUTES)
    public static final CounterUnits MINUTES = new CounterUnits("MINUTES", 8);

    @SerializedName("Items")
    public static final CounterUnits SMS = new CounterUnits(PermissionConstants.SMS, 9);

    @SerializedName("Seconds")
    public static final CounterUnits SECONDS = new CounterUnits("SECONDS", 10);

    private CounterUnits(String str, int i) {
    }

    static {
        CounterUnits[] counterUnitsArr$values = $values();
        $VALUES = counterUnitsArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(counterUnitsArr$values);
        int i = copydefault + 35;
        component1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static CounterUnits valueOf(String str) {
        CounterUnits counterUnits;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            counterUnits = (CounterUnits) Enum.valueOf(CounterUnits.class, str);
            int i3 = 40 / 0;
        } else {
            counterUnits = (CounterUnits) Enum.valueOf(CounterUnits.class, str);
        }
        int i4 = component2 + 29;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return counterUnits;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static CounterUnits[] values() {
        int i = 2 % 2;
        int i2 = component2 + 21;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        CounterUnits[] counterUnitsArr = (CounterUnits[]) $VALUES.clone();
        int i3 = component2 + 51;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            return counterUnitsArr;
        }
        throw null;
    }

    private static final CounterUnits[] $values() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 123;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        CounterUnits[] counterUnitsArr = {UNDEFINED, BYTE, SECOND, CENTS, UNIT, KES, MBs, POINTS, MINUTES, SMS, SECONDS};
        int i5 = i2 + 75;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return counterUnitsArr;
    }

    public static EnumEntries<CounterUnits> getEntries() {
        int i = 2 % 2;
        int i2 = component2 + 9;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
