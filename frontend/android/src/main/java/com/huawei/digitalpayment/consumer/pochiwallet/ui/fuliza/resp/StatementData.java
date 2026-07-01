package com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.resp;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH×\u0003J\t\u0010\u000f\u001a\u00020\u0010H×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/resp/StatementData;", "Ljava/io/Serializable;", "TransactionEntry", "", "Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/resp/TransactionEntryResp;", "<init>", "(Ljava/util/List;)V", "getTransactionEntry", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcPochiWallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StatementData implements Serializable {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("TransactionEntry")
    private final List<TransactionEntryResp> TransactionEntry;

    public StatementData(List<TransactionEntryResp> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.TransactionEntry = list;
    }

    public final List<TransactionEntryResp> getTransactionEntry() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 3;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        List<TransactionEntryResp> list = this.TransactionEntry;
        int i5 = i2 + 23;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static {
        int i = 1 + 45;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static StatementData copy$default(StatementData statementData, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component1 + 59;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                List<TransactionEntryResp> list2 = statementData.TransactionEntry;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            list = statementData.TransactionEntry;
        }
        StatementData statementDataCopy = statementData.copy(list);
        int i4 = component3 + 93;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
        return statementDataCopy;
    }

    public final List<TransactionEntryResp> component1() {
        int i = 2 % 2;
        int i2 = component3 + 71;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        List<TransactionEntryResp> list = this.TransactionEntry;
        int i5 = i3 + 23;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final StatementData copy(List<TransactionEntryResp> TransactionEntry) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(TransactionEntry, "");
        StatementData statementData = new StatementData(TransactionEntry);
        int i2 = component1 + 73;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 14 / 0;
        }
        return statementData;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 39;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (other instanceof StatementData) {
            return Intrinsics.areEqual(this.TransactionEntry, ((StatementData) other).TransactionEntry);
        }
        int i4 = component3 + 51;
        component1 = i4 % 128;
        return i4 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 65;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.TransactionEntry.hashCode();
        int i4 = component1 + 97;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StatementData(TransactionEntry=" + this.TransactionEntry + ")";
        int i2 = component1 + 93;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
