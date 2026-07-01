package com.huawei.digitalpayment.consumer.sfcui.sendmany.data;

import com.huawei.digitalpayment.checkout.resp.TransactionPeopleBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sendmany/data/SelectPeopleBean;", "Ljava/io/Serializable;", "list", "", "Lcom/huawei/digitalpayment/checkout/resp/TransactionPeopleBean;", "<init>", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "setList", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SelectPeopleBean implements Serializable {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault = 65 % 128;
    private List<TransactionPeopleBean> list;

    public SelectPeopleBean(List<TransactionPeopleBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.list = list;
    }

    public SelectPeopleBean(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            list = new ArrayList();
            int i2 = component3 + 109;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this(list);
    }

    public final List<TransactionPeopleBean> getList() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 91;
        component1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        List<TransactionPeopleBean> list = this.list;
        int i4 = i2 + 53;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final void setList(List<TransactionPeopleBean> list) {
        int i = 2 % 2;
        int i2 = component3 + 7;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(list, "");
            this.list = list;
            int i3 = 78 / 0;
        } else {
            Intrinsics.checkNotNullParameter(list, "");
            this.list = list;
        }
        int i4 = component1 + 121;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        if (65 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelectPeopleBean() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SelectPeopleBean copy$default(SelectPeopleBean selectPeopleBean, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 121;
        int i4 = i3 % 128;
        component3 = i4;
        int i5 = i & 1;
        if (i3 % 2 != 0 ? i5 != 0 : i5 != 0) {
            list = selectPeopleBean.list;
            int i6 = i4 + 49;
            component1 = i6 % 128;
            int i7 = i6 % 2;
        }
        return selectPeopleBean.copy(list);
    }

    public final List<TransactionPeopleBean> component1() {
        List<TransactionPeopleBean> list;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 101;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            list = this.list;
            int i4 = 66 / 0;
        } else {
            list = this.list;
        }
        int i5 = i2 + 83;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final SelectPeopleBean copy(List<TransactionPeopleBean> list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        SelectPeopleBean selectPeopleBean = new SelectPeopleBean(list);
        int i2 = component1 + 103;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return selectPeopleBean;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 117;
            component3 = i2 % 128;
            return !(i2 % 2 == 0);
        }
        if (!(other instanceof SelectPeopleBean)) {
            return false;
        }
        if (Intrinsics.areEqual(this.list, ((SelectPeopleBean) other).list)) {
            return true;
        }
        int i3 = component3 + 47;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 69;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.list.hashCode();
        int i4 = component1 + 119;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SelectPeopleBean(list=" + this.list + ")";
        int i2 = component3 + 59;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
