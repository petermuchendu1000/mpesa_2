package com.safaricom.designsystem.components.datepicker;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/safaricom/designsystem/components/datepicker/DatePickerFormat;", "", "<init>", "(Ljava/lang/String;I)V", "DAY_MONTH_YEAR", "MONTH_DAY_YEAR", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DatePickerFormat {
    private static final EnumEntries $ENTRIES;
    private static final DatePickerFormat[] $VALUES;
    public static final DatePickerFormat DAY_MONTH_YEAR = new DatePickerFormat("DAY_MONTH_YEAR", 0);
    public static final DatePickerFormat MONTH_DAY_YEAR = new DatePickerFormat("MONTH_DAY_YEAR", 1);

    private DatePickerFormat(String str, int i) {
    }

    static {
        DatePickerFormat[] datePickerFormatArr$values = $values();
        $VALUES = datePickerFormatArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(datePickerFormatArr$values);
    }

    public static DatePickerFormat valueOf(String str) {
        return (DatePickerFormat) Enum.valueOf(DatePickerFormat.class, str);
    }

    public static DatePickerFormat[] values() {
        return (DatePickerFormat[]) $VALUES.clone();
    }

    private static final DatePickerFormat[] $values() {
        return new DatePickerFormat[]{DAY_MONTH_YEAR, MONTH_DAY_YEAR};
    }

    public static EnumEntries<DatePickerFormat> getEntries() {
        return $ENTRIES;
    }
}
