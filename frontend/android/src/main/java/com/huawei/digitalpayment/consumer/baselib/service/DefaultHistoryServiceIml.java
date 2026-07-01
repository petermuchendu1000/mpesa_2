package com.huawei.digitalpayment.consumer.baselib.service;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/service/DefaultHistoryServiceIml;", "Lcom/huawei/digitalpayment/consumer/baselib/service/IHistoryService;", "<init>", "()V", "getHomeHistoryFragment", "Landroidx/fragment/app/Fragment;", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultHistoryServiceIml implements IHistoryService {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;

    @Override
    public Fragment getHomeHistoryFragment() {
        int i = 2 % 2;
        Fragment fragment = new Fragment();
        int i2 = ShareDataUIState + 39;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 78 / 0;
        }
        return fragment;
    }
}
