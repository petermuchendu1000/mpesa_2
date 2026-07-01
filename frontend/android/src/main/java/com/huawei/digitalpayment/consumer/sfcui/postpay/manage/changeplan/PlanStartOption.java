package com.huawei.digitalpayment.consumer.sfcui.postpay.manage.changeplan;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/manage/changeplan/PlanStartOption;", "", "<init>", "(Ljava/lang/String;I)V", "IMMEDIATELY", "NEXT_MONTH", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PlanStartOption {
    private static final EnumEntries $ENTRIES;
    private static final PlanStartOption[] $VALUES;
    public static final PlanStartOption IMMEDIATELY = new PlanStartOption("IMMEDIATELY", 0);
    public static final PlanStartOption NEXT_MONTH = new PlanStartOption("NEXT_MONTH", 1);
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    private PlanStartOption(String str, int i) {
    }

    static {
        PlanStartOption[] planStartOptionArr$values = $values();
        $VALUES = planStartOptionArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(planStartOptionArr$values);
        int i = component2 + 29;
        copydefault = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static PlanStartOption valueOf(String str) {
        int i = 2 % 2;
        int i2 = component3 + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        PlanStartOption planStartOption = (PlanStartOption) Enum.valueOf(PlanStartOption.class, str);
        int i4 = component1 + 121;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return planStartOption;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static PlanStartOption[] values() {
        int i = 2 % 2;
        int i2 = component1 + 51;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        PlanStartOption[] planStartOptionArr = (PlanStartOption[]) $VALUES.clone();
        int i4 = component3 + 93;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return planStartOptionArr;
    }

    private static final PlanStartOption[] $values() {
        int i = 2 % 2;
        int i2 = component1 + 55;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        PlanStartOption planStartOption = IMMEDIATELY;
        if (i3 != 0) {
            return new PlanStartOption[]{planStartOption, NEXT_MONTH};
        }
        PlanStartOption planStartOption2 = NEXT_MONTH;
        PlanStartOption[] planStartOptionArr = new PlanStartOption[4];
        planStartOptionArr[0] = planStartOption;
        planStartOptionArr[0] = planStartOption2;
        return planStartOptionArr;
    }

    public static EnumEntries<PlanStartOption> getEntries() {
        int i = 2 % 2;
        int i2 = component3 + 65;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<PlanStartOption> enumEntries = $ENTRIES;
        if (i3 != 0) {
            int i4 = 26 / 0;
        }
        return enumEntries;
    }
}
