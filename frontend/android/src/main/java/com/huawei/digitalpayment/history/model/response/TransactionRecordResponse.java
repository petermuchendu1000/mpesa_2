package com.huawei.digitalpayment.history.model.response;

import com.huawei.digitalpayment.history.model.entity.TransactionHistoryListBean;
import com.huawei.http.BaseResp;
import java.util.List;

public class TransactionRecordResponse extends BaseResp {
    private static int component3 = 1;
    private static int copydefault;
    private boolean hasFilterOperatorRight;
    private List<TransactionHistoryListBean> transRecords;

    public List<TransactionHistoryListBean> getTransactionHistoryList() {
        int i = 2 % 2;
        int i2 = component3 + 113;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.transRecords;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setTransactionHistoryList(List<TransactionHistoryListBean> list) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 79;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.transRecords = list;
        int i5 = i2 + 53;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public boolean isHasFilterOperatorRight() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 67;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.hasFilterOperatorRight;
        int i5 = i2 + 97;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 70 / 0;
        }
        return z;
    }

    public void setHasFilterOperatorRight(boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.hasFilterOperatorRight = z;
        int i5 = i3 + 43;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }
}
