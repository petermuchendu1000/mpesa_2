package com.huawei.digitalpayment.consumer.fixeddata.domain.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/ButtonStyle;", "", "<init>", "(Ljava/lang/String;I)V", "PRIMARY", "SECONDARY", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ButtonStyle {
    private static final EnumEntries $ENTRIES;
    private static final ButtonStyle[] $VALUES;
    public static final ButtonStyle PRIMARY = new ButtonStyle("PRIMARY", 0);
    public static final ButtonStyle SECONDARY = new ButtonStyle("SECONDARY", 1);
    private static int ShareDataUIState = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    private ButtonStyle(String str, int i) {
    }

    static {
        ButtonStyle[] buttonStyleArr$values = $values();
        $VALUES = buttonStyleArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(buttonStyleArr$values);
        int i = component3 + 115;
        component2 = i % 128;
        if (i % 2 == 0) {
            int i2 = 87 / 0;
        }
    }

    public static ButtonStyle valueOf(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        ButtonStyle buttonStyle = (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
        int i3 = ShareDataUIState + 11;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return buttonStyle;
    }

    public static ButtonStyle[] values() {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return (ButtonStyle[]) $VALUES.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final ButtonStyle[] $values() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 51;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        ButtonStyle[] buttonStyleArr = {PRIMARY, SECONDARY};
        int i5 = i2 + 109;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return buttonStyleArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<ButtonStyle> getEntries() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        EnumEntries<ButtonStyle> enumEntries = $ENTRIES;
        int i5 = i3 + 13;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        throw null;
    }
}
