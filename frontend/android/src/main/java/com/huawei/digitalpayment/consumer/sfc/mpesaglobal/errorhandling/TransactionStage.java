package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/TransactionStage;", "", "<init>", "(Ljava/lang/String;I)V", "VALIDATION", "CONFIRMATION", "EXECUTION", "COST_ESTIMATION", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TransactionStage {
    private static final EnumEntries $ENTRIES;
    private static final TransactionStage[] $VALUES;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3;
    public static final TransactionStage VALIDATION = new TransactionStage("VALIDATION", 0);
    public static final TransactionStage CONFIRMATION = new TransactionStage("CONFIRMATION", 1);
    public static final TransactionStage EXECUTION = new TransactionStage("EXECUTION", 2);
    public static final TransactionStage COST_ESTIMATION = new TransactionStage("COST_ESTIMATION", 3);

    private TransactionStage(String str, int i) {
    }

    static {
        TransactionStage[] transactionStageArr$values = $values();
        $VALUES = transactionStageArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(transactionStageArr$values);
        int i = component2 + 97;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static TransactionStage valueOf(String str) {
        int i = 2 % 2;
        int i2 = component1 + 71;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        TransactionStage transactionStage = (TransactionStage) Enum.valueOf(TransactionStage.class, str);
        int i4 = component1 + 103;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return transactionStage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static TransactionStage[] values() {
        int i = 2 % 2;
        int i2 = component1 + 59;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return (TransactionStage[]) $VALUES.clone();
        }
        int i3 = 98 / 0;
        return (TransactionStage[]) $VALUES.clone();
    }

    private static final TransactionStage[] $values() {
        TransactionStage[] transactionStageArr;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            TransactionStage transactionStage = VALIDATION;
            TransactionStage transactionStage2 = CONFIRMATION;
            TransactionStage transactionStage3 = EXECUTION;
            TransactionStage transactionStage4 = COST_ESTIMATION;
            transactionStageArr = new TransactionStage[4];
            transactionStageArr[0] = transactionStage;
            transactionStageArr[1] = transactionStage2;
            transactionStageArr[4] = transactionStage3;
            transactionStageArr[4] = transactionStage4;
        } else {
            transactionStageArr = new TransactionStage[]{VALIDATION, CONFIRMATION, EXECUTION, COST_ESTIMATION};
        }
        int i4 = i3 + 95;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return transactionStageArr;
    }

    public static EnumEntries<TransactionStage> getEntries() {
        int i = 2 % 2;
        int i2 = component1 + 89;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        throw null;
    }
}
