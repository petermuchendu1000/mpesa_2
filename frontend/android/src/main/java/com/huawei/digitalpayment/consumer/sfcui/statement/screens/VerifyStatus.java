package com.huawei.digitalpayment.consumer.sfcui.statement.screens;

import com.huawei.hms.mlsdk.common.internal.client.event.MonitorResult;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/statement/screens/VerifyStatus;", "", "<init>", "(Ljava/lang/String;I)V", MonitorResult.SUCCESS, "FAILURE", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VerifyStatus {
    private static final EnumEntries $ENTRIES;
    private static final VerifyStatus[] $VALUES;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;
    public static final VerifyStatus SUCCESS = new VerifyStatus(MonitorResult.SUCCESS, 0);
    public static final VerifyStatus FAILURE = new VerifyStatus("FAILURE", 1);

    static {
        VerifyStatus[] verifyStatusArr$values = $values();
        $VALUES = verifyStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(verifyStatusArr$values);
        int i = copydefault + 87;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    private VerifyStatus(String str, int i) {
    }

    public static VerifyStatus valueOf(String str) {
        int i = 2 % 2;
        int i2 = component3 + 89;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        VerifyStatus verifyStatus = (VerifyStatus) Enum.valueOf(VerifyStatus.class, str);
        int i3 = component3 + 43;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            return verifyStatus;
        }
        obj.hashCode();
        throw null;
    }

    public static VerifyStatus[] values() {
        int i = 2 % 2;
        int i2 = component1 + 13;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        VerifyStatus[] verifyStatusArr = (VerifyStatus[]) $VALUES.clone();
        int i4 = component3 + 45;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return verifyStatusArr;
        }
        throw null;
    }

    private static final VerifyStatus[] $values() {
        VerifyStatus[] verifyStatusArr;
        int i = 2 % 2;
        int i2 = component1 + 45;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            VerifyStatus verifyStatus = SUCCESS;
            VerifyStatus verifyStatus2 = FAILURE;
            verifyStatusArr = new VerifyStatus[3];
            verifyStatusArr[0] = verifyStatus;
            verifyStatusArr[0] = verifyStatus2;
        } else {
            verifyStatusArr = new VerifyStatus[]{SUCCESS, FAILURE};
        }
        int i4 = i3 + 11;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return verifyStatusArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<VerifyStatus> getEntries() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 71;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<VerifyStatus> enumEntries = $ENTRIES;
        int i5 = i2 + 101;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }
}
