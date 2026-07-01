package com.huawei.digitalpayment.consumer.loginModule.login.data;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model.LocalQueryLoginType;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.QueryLoginTypeParams;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.network.QueryLoginTypeRepository;
import javax.inject.Inject;

public class BaseLoginModel implements LoginModel {
    private static int ShareDataUIState = 1;
    private static int component1;

    @Inject
    public BaseLoginModel() {
    }

    @Override
    public void queryLoginType(QueryLoginTypeParams queryLoginTypeParams, ApiCallback<LocalQueryLoginType> apiCallback) {
        int i = 2 % 2;
        sendRequest(new QueryLoginTypeRepository(queryLoginTypeParams), apiCallback);
        int i2 = ShareDataUIState + 97;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }
}
