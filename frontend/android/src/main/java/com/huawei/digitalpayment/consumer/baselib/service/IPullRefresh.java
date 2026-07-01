package com.huawei.digitalpayment.consumer.baselib.service;

import com.alibaba.ariver.tracedebug.core.TraceDebugManager;
import com.huawei.common.listener.ApiCallback;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/service/IPullRefresh;", "", TraceDebugManager.IdeCommand.REFRESH, "", "callback", "Lcom/huawei/common/listener/ApiCallback;", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IPullRefresh {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        private static int ShareDataUIState = 1;
        private static int component1;

        public static boolean refresh(IPullRefresh iPullRefresh, ApiCallback<Boolean> apiCallback) {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 113;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 11;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                return false;
            }
            throw null;
        }
    }

    boolean refresh(ApiCallback<Boolean> callback);
}
