package com.huawei.digitalpayment.history.ui.data;

import com.huawei.digitalpayment.history.ui.view.TransactionHistoryView;
import java.util.List;

public class HistoryGroupInfo {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private List<TransactionHistoryView> component1;
    private String component3;

    public String getMouth() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 125;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setMouth(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 57;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.component3 = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 19;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public List<TransactionHistoryView> getDatas() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        List<TransactionHistoryView> list = this.component1;
        int i4 = i3 + 69;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public void setDatas(List<TransactionHistoryView> list) {
        int i = 2 % 2;
        int i2 = copydefault + 25;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.component1 = list;
        int i5 = i3 + 123;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 13 / 0;
        }
    }
}
