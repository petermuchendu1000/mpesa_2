package com.huawei.digitalpayment.consumer.loginModule.mpin;

import com.huawei.digitalpayment.consumer.loginModule.register.data.LocalQuestionItem;
import java.util.List;

public class ModifySecurityInfo {
    private static int ShareDataUIState = 1;
    private static int component3;
    private List<LocalQuestionItem> component1;
    private LocalQuestionItem copydefault;

    public LocalQuestionItem getDefaultChooseInfo() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        LocalQuestionItem localQuestionItem = this.copydefault;
        int i5 = i3 + 55;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return localQuestionItem;
    }

    public void setDefaultChooseInfo(LocalQuestionItem localQuestionItem) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 103;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.copydefault = localQuestionItem;
        if (i4 != 0) {
            int i5 = 20 / 0;
        }
        int i6 = i2 + 119;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public List<LocalQuestionItem> getData() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 113;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        List<LocalQuestionItem> list = this.component1;
        int i5 = i2 + 87;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setData(List<LocalQuestionItem> list) {
        int i = 2 % 2;
        int i2 = component3 + 21;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.component1 = list;
        if (i4 == 0) {
            int i5 = 11 / 0;
        }
        int i6 = i3 + 123;
        component3 = i6 % 128;
        int i7 = i6 % 2;
    }
}
