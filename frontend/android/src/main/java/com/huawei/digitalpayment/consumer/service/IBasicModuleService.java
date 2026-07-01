package com.huawei.digitalpayment.consumer.service;

import com.huawei.common.listener.ApiCallback;
import com.huawei.http.BaseResp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/service/IBasicModuleService;", "", "changeLanguage", "", "callbacks", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/http/BaseResp;", "ServiceModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IBasicModuleService {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        private static int component3 = 0;
        private static int copydefault = 1;

        public static void changeLanguage(IBasicModuleService iBasicModuleService, ApiCallback<BaseResp> apiCallback) {
            int i = 2 % 2;
            int i2 = component3 + 5;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    void changeLanguage(ApiCallback<BaseResp> callbacks);
}
