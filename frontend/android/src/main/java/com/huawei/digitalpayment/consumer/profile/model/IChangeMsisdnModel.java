package com.huawei.digitalpayment.consumer.profile.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.profile.model.local.LocalCustomer;
import com.huawei.digitalpayment.consumer.profile.model.request.ChangeMsisdnParams;
import com.huawei.digitalpayment.consumer.profile.model.request.SendChangeMsisdnSmsParams;
import com.huawei.digitalpayment.consumer.profile.model.request.VerifyChangeMsisdnSmsParams;
import com.huawei.http.BaseResp;

public interface IChangeMsisdnModel extends BaseModel {
    void changeMsisdn(ChangeMsisdnParams changeMsisdnParams, ApiCallback<LocalCustomer> apiCallback);

    void identityVerifyAndChangeMsisdn(String str, ApiCallback<LocalCustomer> apiCallback);

    void sendChangeMsisdnSms(SendChangeMsisdnSmsParams sendChangeMsisdnSmsParams, ApiCallback<BaseResp> apiCallback);

    void verifyChangeMsisdnSms(VerifyChangeMsisdnSmsParams verifyChangeMsisdnSmsParams, ApiCallback<BaseResp> apiCallback);
}
