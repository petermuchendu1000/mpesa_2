package com.huawei.digitalpayment.consumer.sfcui.sendmany.data;

import com.huawei.digitalpayment.checkout.resp.TransactionPeopleBean;
import com.huawei.digitalpayment.consumer.base.ui.widget.SfcManyAmountInputView;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H×\u0003J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\t\u0010\u0019\u001a\u00020\u001aH×\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sendmany/data/SelectPeopleInfo;", "Ljava/io/Serializable;", "people", "Lcom/huawei/digitalpayment/checkout/resp/TransactionPeopleBean;", "amount", "Lcom/huawei/digitalpayment/consumer/base/ui/widget/SfcManyAmountInputView;", "<init>", "(Lcom/huawei/digitalpayment/checkout/resp/TransactionPeopleBean;Lcom/huawei/digitalpayment/consumer/base/ui/widget/SfcManyAmountInputView;)V", "getPeople", "()Lcom/huawei/digitalpayment/checkout/resp/TransactionPeopleBean;", "setPeople", "(Lcom/huawei/digitalpayment/checkout/resp/TransactionPeopleBean;)V", "getAmount", "()Lcom/huawei/digitalpayment/consumer/base/ui/widget/SfcManyAmountInputView;", "setAmount", "(Lcom/huawei/digitalpayment/consumer/base/ui/widget/SfcManyAmountInputView;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SelectPeopleInfo implements Serializable {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int copydefault = 1;
    private SfcManyAmountInputView amount;
    private TransactionPeopleBean people;

    public SelectPeopleInfo(TransactionPeopleBean transactionPeopleBean, SfcManyAmountInputView sfcManyAmountInputView) {
        this.people = transactionPeopleBean;
        this.amount = sfcManyAmountInputView;
    }

    public final TransactionPeopleBean getPeople() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 121;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        TransactionPeopleBean transactionPeopleBean = this.people;
        int i5 = i2 + 75;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return transactionPeopleBean;
    }

    public final void setPeople(TransactionPeopleBean transactionPeopleBean) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 93;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.people = transactionPeopleBean;
        if (i4 != 0) {
            int i5 = 2 / 0;
        }
        int i6 = i2 + 39;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public final SfcManyAmountInputView getAmount() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 121;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        SfcManyAmountInputView sfcManyAmountInputView = this.amount;
        int i5 = i2 + 77;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return sfcManyAmountInputView;
    }

    public final void setAmount(SfcManyAmountInputView sfcManyAmountInputView) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 75;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.amount = sfcManyAmountInputView;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 61;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        int i = 1 + 89;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static SelectPeopleInfo copy$default(SelectPeopleInfo selectPeopleInfo, TransactionPeopleBean transactionPeopleBean, SfcManyAmountInputView sfcManyAmountInputView, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            transactionPeopleBean = selectPeopleInfo.people;
        }
        if ((i & 2) != 0) {
            int i3 = ShareDataUIState + 69;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                SfcManyAmountInputView sfcManyAmountInputView2 = selectPeopleInfo.amount;
                throw null;
            }
            sfcManyAmountInputView = selectPeopleInfo.amount;
        }
        SelectPeopleInfo selectPeopleInfoCopy = selectPeopleInfo.copy(transactionPeopleBean, sfcManyAmountInputView);
        int i4 = ShareDataUIState + 69;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return selectPeopleInfoCopy;
        }
        throw null;
    }

    public final TransactionPeopleBean component1() {
        int i = 2 % 2;
        int i2 = component2 + 75;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.people;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SfcManyAmountInputView component2() {
        SfcManyAmountInputView sfcManyAmountInputView;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 99;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            sfcManyAmountInputView = this.amount;
            int i4 = 55 / 0;
        } else {
            sfcManyAmountInputView = this.amount;
        }
        int i5 = i2 + 75;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return sfcManyAmountInputView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SelectPeopleInfo copy(TransactionPeopleBean people, SfcManyAmountInputView amount) {
        int i = 2 % 2;
        SelectPeopleInfo selectPeopleInfo = new SelectPeopleInfo(people, amount);
        int i2 = component2 + 95;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return selectPeopleInfo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2 + 125;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectPeopleInfo)) {
            return false;
        }
        SelectPeopleInfo selectPeopleInfo = (SelectPeopleInfo) other;
        if (Intrinsics.areEqual(this.people, selectPeopleInfo.people)) {
            return Intrinsics.areEqual(this.amount, selectPeopleInfo.amount);
        }
        int i4 = ShareDataUIState + 15;
        int i5 = i4 % 128;
        component2 = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 15;
        ShareDataUIState = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        TransactionPeopleBean transactionPeopleBean;
        int iHashCode;
        int i = 2 % 2;
        int i2 = component2 + 73;
        ShareDataUIState = i2 % 128;
        int iHashCode2 = 0;
        if (i2 % 2 == 0) {
            transactionPeopleBean = this.people;
            iHashCode = 1;
            if (transactionPeopleBean != null) {
                iHashCode2 = 1;
                iHashCode = iHashCode2;
                iHashCode2 = transactionPeopleBean.hashCode();
            }
        } else {
            transactionPeopleBean = this.people;
            if (transactionPeopleBean == null) {
                iHashCode = 0;
            } else {
                iHashCode = iHashCode2;
                iHashCode2 = transactionPeopleBean.hashCode();
            }
        }
        SfcManyAmountInputView sfcManyAmountInputView = this.amount;
        if (sfcManyAmountInputView != null) {
            iHashCode = sfcManyAmountInputView.hashCode();
        }
        int i3 = (iHashCode2 * 31) + iHashCode;
        int i4 = component2 + 69;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SelectPeopleInfo(people=" + this.people + ", amount=" + this.amount + ")";
        int i2 = component2 + 27;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
