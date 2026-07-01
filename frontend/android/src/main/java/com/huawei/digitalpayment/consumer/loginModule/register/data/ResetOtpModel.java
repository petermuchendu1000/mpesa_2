package com.huawei.digitalpayment.consumer.loginModule.register.data;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyForgotPinSmsResp;
import com.huawei.digitalpayment.consumer.loginModule.mpin.request.VerifyOtpParams;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.BaseResp;

public interface ResetOtpModel extends BaseModel {
    void resetSmsCodeVerify(VerifyOtpParams verifyOtpParams, ApiCallback<VerifyForgotPinSmsResp> apiCallback);

    void sendResetSms(BaseRequestParams baseRequestParams, ApiCallback<BaseResp> apiCallback);
}
