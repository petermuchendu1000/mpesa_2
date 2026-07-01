package com.huawei.digitalpayment.consumer.basicUi.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.baselib.util.update.UpdateBean;
import com.huawei.digitalpayment.consumer.basicUi.request.VersionVerifyRequest;

public interface AboutModel extends BaseModel {
    void versionVerify(VersionVerifyRequest versionVerifyRequest, ApiCallback<UpdateBean> apiCallback);
}
