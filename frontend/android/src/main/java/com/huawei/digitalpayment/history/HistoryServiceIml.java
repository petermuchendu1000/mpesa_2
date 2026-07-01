package com.huawei.digitalpayment.history;

import androidx.fragment.app.Fragment;
import com.huawei.digitalpayment.consumer.baselib.service.IHistoryService2;
import com.huawei.digitalpayment.history.ui.fragment.HistoryFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/history/HistoryServiceIml;", "Lcom/huawei/digitalpayment/consumer/baselib/service/IHistoryService2;", "<init>", "()V", "getHomeHistoryFragment", "Landroidx/fragment/app/Fragment;", "data", "", "ConsumerHistoryUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HistoryServiceIml implements IHistoryService2 {
    private static int ShareDataUIState = 1;
    private static int component2;

    @Override
    public Fragment getHomeHistoryFragment(String data) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(data, "");
        HistoryFragment historyFragmentNewInstance = HistoryFragment.newInstance(data);
        Intrinsics.checkNotNullExpressionValue(historyFragmentNewInstance, "");
        HistoryFragment historyFragment = historyFragmentNewInstance;
        int i4 = component2 + 25;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return historyFragment;
    }
}
