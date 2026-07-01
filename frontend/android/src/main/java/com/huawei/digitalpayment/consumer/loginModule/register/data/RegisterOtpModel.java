package com.huawei.digitalpayment.consumer.loginModule.register.data;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.loginModule.register.model.OtpRegisterResp;
import com.huawei.digitalpayment.consumer.loginModule.register.request.OtpRegisterParams;
import com.huawei.digitalpayment.consumer.loginModule.register.request.ProcessVerifyRequest;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.BaseResp;

public interface RegisterOtpModel extends BaseModel {
    void processVerify(ProcessVerifyRequest processVerifyRequest, ApiCallback<OtpRegisterResp> apiCallback);

    void registerSmsCodeVerify(BaseRequestParams baseRequestParams, ApiCallback<BaseResp> apiCallback);

    void registerSmsCodeVerify2(OtpRegisterParams otpRegisterParams, ApiCallback<OtpRegisterResp> apiCallback);

    void sendRegisterSms(BaseRequestParams baseRequestParams, ApiCallback<BaseResp> apiCallback);
}
