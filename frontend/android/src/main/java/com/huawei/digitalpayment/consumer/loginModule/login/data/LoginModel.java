package com.huawei.digitalpayment.consumer.loginModule.login.data;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model.LocalQueryLoginType;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.QueryLoginTypeParams;

public interface LoginModel extends BaseModel {
    void queryLoginType(QueryLoginTypeParams queryLoginTypeParams, ApiCallback<LocalQueryLoginType> apiCallback);
}
