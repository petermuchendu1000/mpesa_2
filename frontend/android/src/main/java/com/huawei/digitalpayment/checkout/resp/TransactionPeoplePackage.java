package com.huawei.digitalpayment.checkout.resp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/checkout/resp/TransactionPeoplePackage;", "Ljava/io/Serializable;", "peoples", "", "Lcom/huawei/digitalpayment/checkout/resp/TransactionPeopleBean;", "<init>", "(Ljava/util/List;)V", "getPeoples", "()Ljava/util/List;", "setPeoples", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerCheckOutUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TransactionPeoplePackage implements Serializable {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component1 = 67 % 128;
    private static int component2;
    private static int component3;
    private List<TransactionPeopleBean> peoples;

    public TransactionPeoplePackage(List<TransactionPeopleBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.peoples = list;
    }

    public TransactionPeoplePackage(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            list = new ArrayList();
            int i2 = ShareDataUIState + 105;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this(list);
    }

    public final List<TransactionPeopleBean> getPeoples() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        List<TransactionPeopleBean> list = this.peoples;
        int i5 = i3 + 121;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final void setPeoples(List<TransactionPeopleBean> list) {
        int i = 2 % 2;
        int i2 = component2 + 71;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        this.peoples = list;
        int i4 = component2 + 13;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        if (67 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransactionPeoplePackage() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static TransactionPeoplePackage copy$default(TransactionPeoplePackage transactionPeoplePackage, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2 + 31;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            list = transactionPeoplePackage.peoples;
        }
        TransactionPeoplePackage transactionPeoplePackageCopy = transactionPeoplePackage.copy(list);
        int i4 = component2 + 105;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return transactionPeoplePackageCopy;
    }

    public final List<TransactionPeopleBean> component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        List<TransactionPeopleBean> list = this.peoples;
        int i5 = i3 + 97;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TransactionPeoplePackage copy(List<TransactionPeopleBean> peoples) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(peoples, "");
        TransactionPeoplePackage transactionPeoplePackage = new TransactionPeoplePackage(peoples);
        int i2 = component2 + 79;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return transactionPeoplePackage;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        if (this != other) {
            return (other instanceof TransactionPeoplePackage) && Intrinsics.areEqual(this.peoples, ((TransactionPeoplePackage) other).peoples);
        }
        int i5 = i3 + 125;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.peoples.hashCode();
        int i4 = component2 + 31;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransactionPeoplePackage(peoples=" + this.peoples + ")";
        int i2 = component2 + 99;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
