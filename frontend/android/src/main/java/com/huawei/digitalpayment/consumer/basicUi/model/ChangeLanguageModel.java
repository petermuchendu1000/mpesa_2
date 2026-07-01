package com.huawei.digitalpayment.consumer.basicUi.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.basicUi.request.ChangeLangRequest;
import com.huawei.http.BaseResp;

public interface ChangeLanguageModel extends BaseModel {
    void changeLanguage(ChangeLangRequest changeLangRequest, ApiCallback<BaseResp> apiCallback);

    void changeLanguageWithoutAutoLogin(ChangeLangRequest changeLangRequest, ApiCallback<BaseResp> apiCallback);
}
