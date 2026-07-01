package com.huawei.digitalpayment.consumer.baselib.service;

import com.huawei.digitalpayment.consumer.baselib.R;

public class DefaultIHistoryMipmapServiceServiceIml implements IHistoryMipmapService {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;

    @Override
    public int getMipmapIcon(String str, int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 19;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = R.mipmap.base_icon_merchant;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = R.mipmap.base_icon_merchant;
        int i6 = ShareDataUIState + 37;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }
}
