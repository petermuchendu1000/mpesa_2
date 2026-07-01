package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout;

import com.google.zxing.client.android.Intents;
import com.huawei.digitalpayment.consumer.sfcui.profile.manageline.SimConstants;
import com.huawei.hms.mlsdk.common.internal.client.event.MonitorResult;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionStatus;", "", "<init>", "(Ljava/lang/String;I)V", MonitorResult.SUCCESS, SimConstants.STATUS_PENDING, "FAILED", Intents.Scan.TIMEOUT, "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TransactionStatus {
    private static final EnumEntries $ENTRIES;
    private static final TransactionStatus[] $VALUES;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int copydefault = 1;
    public static final TransactionStatus SUCCESS = new TransactionStatus(MonitorResult.SUCCESS, 0);
    public static final TransactionStatus PENDING = new TransactionStatus(SimConstants.STATUS_PENDING, 1);
    public static final TransactionStatus FAILED = new TransactionStatus("FAILED", 2);
    public static final TransactionStatus TIMEOUT = new TransactionStatus(Intents.Scan.TIMEOUT, 3);

    private TransactionStatus(String str, int i) {
    }

    static {
        TransactionStatus[] transactionStatusArr$values = $values();
        $VALUES = transactionStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(transactionStatusArr$values);
        int i = component1 + 17;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static TransactionStatus valueOf(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TransactionStatus transactionStatus = (TransactionStatus) Enum.valueOf(TransactionStatus.class, str);
        int i3 = copydefault + 91;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return transactionStatus;
    }

    public static TransactionStatus[] values() {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        TransactionStatus[] transactionStatusArr = (TransactionStatus[]) $VALUES.clone();
        int i4 = copydefault + 33;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return transactionStatusArr;
    }

    private static final TransactionStatus[] $values() {
        int i = 2 % 2;
        int i2 = component2 + 99;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        TransactionStatus[] transactionStatusArr = {SUCCESS, PENDING, FAILED, TIMEOUT};
        int i5 = i3 + 27;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return transactionStatusArr;
    }

    public static EnumEntries<TransactionStatus> getEntries() {
        EnumEntries<TransactionStatus> enumEntries;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 57;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            enumEntries = $ENTRIES;
            int i4 = 94 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i2 + 79;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
