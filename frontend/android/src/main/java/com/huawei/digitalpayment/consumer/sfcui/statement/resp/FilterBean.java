package com.huawei.digitalpayment.consumer.sfcui.statement.resp;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÇ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001d\u001a\u00020\u001eH×\u0001J\t\u0010\u001f\u001a\u00020\u0006H×\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/FilterBean;", "", "dateRange", "Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/DateRange;", "transactionTypes", "", "", "statementsFlowType", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/DateRange;Ljava/util/List;Ljava/lang/String;)V", "getDateRange", "()Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/DateRange;", "setDateRange", "(Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/DateRange;)V", "getTransactionTypes", "()Ljava/util/List;", "setTransactionTypes", "(Ljava/util/List;)V", "getStatementsFlowType", "()Ljava/lang/String;", "setStatementsFlowType", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FilterBean {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component3 = 59 % 128;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private List<String> component1;
    private DateRange component2;
    private String copydefault;

    public FilterBean(DateRange dateRange, List<String> list, String str) {
        Intrinsics.checkNotNullParameter(list, "");
        this.component2 = dateRange;
        this.component1 = list;
        this.copydefault = str;
    }

    public final DateRange getDateRange() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 105;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        DateRange dateRange = this.component2;
        int i5 = i3 + 97;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return dateRange;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setDateRange(DateRange dateRange) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 47;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        this.component2 = dateRange;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 99;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FilterBean(DateRange dateRange, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = getAsAtTimestamp + 55;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            dateRange = null;
        }
        if ((i & 2) != 0) {
            int i4 = getRequestBeneficiariesState + 125;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 != 0) {
                list = CollectionsKt.emptyList();
                int i5 = 2 % 2;
            } else {
                CollectionsKt.emptyList();
                throw null;
            }
        }
        if ((i & 4) != 0) {
            int i6 = getAsAtTimestamp + 79;
            getRequestBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            str = null;
        }
        this(dateRange, list, str);
    }

    public final List<String> getTransactionTypes() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 13;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        List<String> list = this.component1;
        int i5 = i3 + 65;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final void setTransactionTypes(List<String> list) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 95;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(list, "");
            this.component1 = list;
        } else {
            Intrinsics.checkNotNullParameter(list, "");
            this.component1 = list;
            int i3 = 22 / 0;
        }
    }

    public final String getStatementsFlowType() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 89;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setStatementsFlowType(String str) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 27;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        this.copydefault = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        if (59 % 2 == 0) {
            throw null;
        }
    }

    public FilterBean() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FilterBean copy$default(FilterBean filterBean, DateRange dateRange, List list, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = getRequestBeneficiariesState + 111;
            getAsAtTimestamp = i3 % 128;
            if (i3 % 2 == 0) {
                DateRange dateRange2 = filterBean.component2;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            dateRange = filterBean.component2;
        }
        if ((i & 2) != 0) {
            list = filterBean.component1;
        }
        if ((i & 4) != 0) {
            str = filterBean.copydefault;
            int i4 = getRequestBeneficiariesState + 27;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
        }
        return filterBean.copy(dateRange, list, str);
    }

    public final DateRange component1() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 1;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        DateRange dateRange = this.component2;
        int i5 = i3 + 79;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return dateRange;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<String> component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 59;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.component1;
        int i5 = i2 + 71;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 63;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.copydefault;
            int i4 = 34 / 0;
        } else {
            str = this.copydefault;
        }
        int i5 = i2 + 103;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final FilterBean copy(DateRange dateRange, List<String> transactionTypes, String statementsFlowType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(transactionTypes, "");
        FilterBean filterBean = new FilterBean(dateRange, transactionTypes, statementsFlowType);
        int i2 = getRequestBeneficiariesState + 37;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return filterBean;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterBean)) {
            return false;
        }
        FilterBean filterBean = (FilterBean) other;
        if (!Intrinsics.areEqual(this.component2, filterBean.component2)) {
            int i2 = getAsAtTimestamp + 47;
            getRequestBeneficiariesState = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.component1, filterBean.component1)) {
            return false;
        }
        if (Intrinsics.areEqual(this.copydefault, filterBean.copydefault)) {
            return true;
        }
        int i3 = getAsAtTimestamp + 29;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        DateRange dateRange;
        int iHashCode;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 51;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 == 0 ? (dateRange = this.component2) != null : (dateRange = this.component2) != null) {
            iHashCode = dateRange.hashCode();
        } else {
            int i4 = i2 + 95;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        }
        int iHashCode2 = this.component1.hashCode();
        String str = this.copydefault;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FilterBean(dateRange=" + this.component2 + ", transactionTypes=" + this.component1 + ", statementsFlowType=" + this.copydefault + ")";
        int i2 = getAsAtTimestamp + 75;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
