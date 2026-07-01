package com.huawei.digitalpayment.consumer.notification.ui.iml;

import com.huawei.digitalpayment.consumer.baselib.service.DefaultIHistoryMipmapServiceServiceIml;
import com.huawei.digitalpayment.consumer.notification.ui.enums.TransactionEnum;

public class HistoryMipmapServiceIml extends DefaultIHistoryMipmapServiceServiceIml {
    private static int component1 = 1;
    private static int copydefault;

    @Override
    public int getMipmapIcon(String str, int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 61;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int mipmap = TransactionEnum.getMipmap(str, i);
        int i5 = copydefault + 87;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return mipmap;
    }
}
