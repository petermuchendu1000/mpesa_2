package com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.resp;

import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H×\u0003J\t\u0010\u0014\u001a\u00020\u0015H×\u0001J\t\u0010\u0016\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/resp/TransactionEntryGroup;", "Ljava/io/Serializable;", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "", "dataList", "", "Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/resp/TransactionEntryResp;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getCategory", "()Ljava/lang/String;", "getDataList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcPochiWallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TransactionEntryGroup implements Serializable {
    public static final int $stable = 8;
    private static int ShareDataUIState = 75 % 128;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;
    private final String category;
    private final List<TransactionEntryResp> dataList;

    public TransactionEntryGroup(String str, List<TransactionEntryResp> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.category = str;
        this.dataList = list;
    }

    public final String getCategory() {
        int i = 2 % 2;
        int i2 = component2 + 43;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.category;
        int i4 = i3 + 39;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final List<TransactionEntryResp> getDataList() {
        int i = 2 % 2;
        int i2 = component3 + 109;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        List<TransactionEntryResp> list = this.dataList;
        int i5 = i3 + 99;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static {
        int i = 75 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static TransactionEntryGroup copy$default(TransactionEntryGroup transactionEntryGroup, String str, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 89;
        component3 = i4 % 128;
        if (i4 % 2 == 0 && (i & 1) != 0) {
            str = transactionEntryGroup.category;
            int i5 = i3 + 61;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 2;
            }
        }
        if ((i & 2) != 0) {
            list = transactionEntryGroup.dataList;
        }
        TransactionEntryGroup transactionEntryGroupCopy = transactionEntryGroup.copy(str, list);
        int i7 = component2 + 53;
        component3 = i7 % 128;
        if (i7 % 2 == 0) {
            return transactionEntryGroupCopy;
        }
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 125;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.category;
        int i4 = i3 + 119;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final List<TransactionEntryResp> component2() {
        List<TransactionEntryResp> list;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 31;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            list = this.dataList;
            int i4 = 27 / 0;
        } else {
            list = this.dataList;
        }
        int i5 = i2 + 41;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TransactionEntryGroup copy(String category, List<TransactionEntryResp> dataList) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(category, "");
        Intrinsics.checkNotNullParameter(dataList, "");
        TransactionEntryGroup transactionEntryGroup = new TransactionEntryGroup(category, dataList);
        int i2 = component2 + 107;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return transactionEntryGroup;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3 + 59;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 101;
            component3 = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!(other instanceof TransactionEntryGroup)) {
            return false;
        }
        TransactionEntryGroup transactionEntryGroup = (TransactionEntryGroup) other;
        if (!Intrinsics.areEqual(this.category, transactionEntryGroup.category)) {
            int i6 = component3 + 89;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.dataList, transactionEntryGroup.dataList)) {
            return true;
        }
        int i8 = component2 + 9;
        component3 = i8 % 128;
        if (i8 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 41;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.category.hashCode();
        return i3 == 0 ? (iHashCode << 22) % this.dataList.hashCode() : (iHashCode * 31) + this.dataList.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransactionEntryGroup(category=" + this.category + ", dataList=" + this.dataList + ")";
        int i2 = component2 + 79;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
