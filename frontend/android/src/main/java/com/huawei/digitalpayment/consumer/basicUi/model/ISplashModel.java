package com.huawei.digitalpayment.consumer.basicUi.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.basicUi.response.LocalQueryLoginType;

public interface ISplashModel extends BaseModel {
    void queryLoginType(String str, ApiCallback<LocalQueryLoginType> apiCallback);
}
