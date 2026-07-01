package com.huawei.digitalpayment.consumer.sfcui.sharedata.widgets;

import com.alibaba.ariver.kernel.common.service.executor.RVScheduleType;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/widgets/TextViewStyle;", "", "<init>", "(Ljava/lang/String;I)V", "LABEL", RVScheduleType.NORMAL, "MEDIUM", "SEMI_BOLD", "BOLD", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextViewStyle {
    private static final EnumEntries $ENTRIES;
    private static final TextViewStyle[] $VALUES;
    private static int ShareDataUIState = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;
    public static final TextViewStyle LABEL = new TextViewStyle("LABEL", 0);
    public static final TextViewStyle NORMAL = new TextViewStyle(RVScheduleType.NORMAL, 1);
    public static final TextViewStyle MEDIUM = new TextViewStyle("MEDIUM", 2);
    public static final TextViewStyle SEMI_BOLD = new TextViewStyle("SEMI_BOLD", 3);
    public static final TextViewStyle BOLD = new TextViewStyle("BOLD", 4);

    private TextViewStyle(String str, int i) {
    }

    static {
        TextViewStyle[] textViewStyleArr$values = $values();
        $VALUES = textViewStyleArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(textViewStyleArr$values);
        int i = component2 + 7;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static TextViewStyle valueOf(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        TextViewStyle textViewStyle = (TextViewStyle) Enum.valueOf(TextViewStyle.class, str);
        int i4 = ShareDataUIState + 17;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return textViewStyle;
        }
        throw null;
    }

    public static TextViewStyle[] values() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        TextViewStyle[] textViewStyleArr = (TextViewStyle[]) $VALUES.clone();
        int i4 = copydefault + 5;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return textViewStyleArr;
    }

    private static final TextViewStyle[] $values() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        TextViewStyle[] textViewStyleArr = {LABEL, NORMAL, MEDIUM, SEMI_BOLD, BOLD};
        int i5 = i3 + 39;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return textViewStyleArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<TextViewStyle> getEntries() {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
