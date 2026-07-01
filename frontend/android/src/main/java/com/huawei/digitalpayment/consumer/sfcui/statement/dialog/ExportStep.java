package com.huawei.digitalpayment.consumer.sfcui.statement.dialog;

import com.huawei.hms.mlsdk.common.internal.client.event.MonitorResult;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/statement/dialog/ExportStep;", "", "<init>", "(Ljava/lang/String;I)V", "ENTER_EMAIL", "PROCEED", MonitorResult.SUCCESS, "FAILURE", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExportStep {
    private static final EnumEntries $ENTRIES;
    private static final ExportStep[] $VALUES;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    public static final ExportStep ENTER_EMAIL = new ExportStep("ENTER_EMAIL", 0);
    public static final ExportStep PROCEED = new ExportStep("PROCEED", 1);
    public static final ExportStep SUCCESS = new ExportStep(MonitorResult.SUCCESS, 2);
    public static final ExportStep FAILURE = new ExportStep("FAILURE", 3);

    static {
        ExportStep[] exportStepArr$values = $values();
        $VALUES = exportStepArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(exportStepArr$values);
        int i = component1 + 117;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    private ExportStep(String str, int i) {
    }

    public static ExportStep valueOf(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return (ExportStep) Enum.valueOf(ExportStep.class, str);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ExportStep[] values() {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ExportStep[] exportStepArr = (ExportStep[]) $VALUES.clone();
        int i4 = component3 + 51;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return exportStepArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final ExportStep[] $values() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 81;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        ExportStep[] exportStepArr = {ENTER_EMAIL, PROCEED, SUCCESS, FAILURE};
        int i5 = i2 + 49;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return exportStepArr;
        }
        throw null;
    }

    public static EnumEntries<ExportStep> getEntries() {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        EnumEntries<ExportStep> enumEntries = $ENTRIES;
        int i5 = i3 + 85;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }
}
