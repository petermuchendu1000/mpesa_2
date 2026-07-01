package com.huawei.digitalpayment.consumer.sfcui.statement.resp;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/TransactionsPdf;", "", "customerName", "", "filter", "Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/FilterBean;", "<init>", "(Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/FilterBean;)V", "getCustomerName", "()Ljava/lang/String;", "setCustomerName", "(Ljava/lang/String;)V", "getFilter", "()Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/FilterBean;", "setFilter", "(Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/FilterBean;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TransactionsPdf {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 99 % 128;
    private static int getRequestBeneficiariesState = 1;
    private String ShareDataUIState;
    private FilterBean copydefault;

    public TransactionsPdf(String str, FilterBean filterBean) {
        this.ShareDataUIState = str;
        this.copydefault = filterBean;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TransactionsPdf(String str, FilterBean filterBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = getRequestBeneficiariesState;
            int i3 = i2 + 11;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 49;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 % 5;
            } else {
                int i7 = 2 % 2;
            }
            str = null;
        }
        if ((i & 2) != 0) {
            int i8 = getRequestBeneficiariesState + 69;
            component2 = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
            int i9 = 2 % 2;
            filterBean = null;
        }
        this(str, filterBean);
    }

    public final String getCustomerName() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 21;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 13;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setCustomerName(String str) {
        int i = 2 % 2;
        int i2 = component2 + 33;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        this.ShareDataUIState = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 59;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final FilterBean getFilter() {
        FilterBean filterBean;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 119;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            filterBean = this.copydefault;
            int i4 = 10 / 0;
        } else {
            filterBean = this.copydefault;
        }
        int i5 = i3 + 25;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return filterBean;
    }

    public final void setFilter(FilterBean filterBean) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 125;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.copydefault = filterBean;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 17;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static {
        if (99 % 2 == 0) {
            int i = 3 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransactionsPdf() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static TransactionsPdf copy$default(TransactionsPdf transactionsPdf, String str, FilterBean filterBean, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState;
        int i4 = i3 + 43;
        component2 = i4 % 128;
        if (i4 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = transactionsPdf.ShareDataUIState;
            int i5 = i3 + 81;
            component2 = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 2) != 0) {
            filterBean = transactionsPdf.copydefault;
        }
        return transactionsPdf.copy(str, filterBean);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 55;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i2 + 17;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final FilterBean component2() {
        int i = 2 % 2;
        int i2 = component2 + 75;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        FilterBean filterBean = this.copydefault;
        int i5 = i3 + 111;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return filterBean;
    }

    public final TransactionsPdf copy(String customerName, FilterBean filter) {
        int i = 2 % 2;
        TransactionsPdf transactionsPdf = new TransactionsPdf(customerName, filter);
        int i2 = component2 + 33;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return transactionsPdf;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 17;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == other) {
            int i4 = i3 + 39;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 68 / 0;
            }
            return true;
        }
        if (!(other instanceof TransactionsPdf)) {
            return false;
        }
        TransactionsPdf transactionsPdf = (TransactionsPdf) other;
        if (!Intrinsics.areEqual(this.ShareDataUIState, transactionsPdf.ShareDataUIState)) {
            return false;
        }
        if (Intrinsics.areEqual(this.copydefault, transactionsPdf.copydefault)) {
            return true;
        }
        int i6 = getRequestBeneficiariesState + 37;
        component2 = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 99;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0 ? (str = this.ShareDataUIState) != null : (str = this.ShareDataUIState) != null) {
            iHashCode = str.hashCode();
        } else {
            int i4 = i2 + 119;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i2 + 43;
            getRequestBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            iHashCode = 0;
        }
        FilterBean filterBean = this.copydefault;
        return (iHashCode * 31) + (filterBean != null ? filterBean.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransactionsPdf(customerName=" + this.ShareDataUIState + ", filter=" + this.copydefault + ")";
        int i2 = getRequestBeneficiariesState + 29;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
