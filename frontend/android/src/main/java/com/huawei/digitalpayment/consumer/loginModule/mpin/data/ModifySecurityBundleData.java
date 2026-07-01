package com.huawei.digitalpayment.consumer.loginModule.mpin.data;

import com.huawei.digitalpayment.consumer.loginModule.register.data.LocalQuestionItem;
import com.huawei.http.BaseResp;
import java.util.List;

public class ModifySecurityBundleData extends BaseResp {
    private static int component2 = 0;
    private static int copydefault = 1;
    private List<LocalQuestionItem> allItemList;
    private List<LocalQuestionItem> selectItemList;

    public List<LocalQuestionItem> getAllItemList() {
        int i = 2 % 2;
        int i2 = copydefault + 33;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.allItemList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setAllItemList(List<LocalQuestionItem> list) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 5;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.allItemList = list;
        int i5 = i2 + 113;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public List<LocalQuestionItem> getSelectItemList() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 39;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        List<LocalQuestionItem> list = this.selectItemList;
        int i5 = i2 + 33;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setSelectItemList(List<LocalQuestionItem> list) {
        int i = 2 % 2;
        int i2 = component2 + 105;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.selectItemList = list;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 85;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }
}
