package com.huawei.digitalpayment.consumer.loginModule.mpin.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyChangePinSmsResp;
import com.huawei.digitalpayment.consumer.loginModule.mpin.request.SendOtpParams;
import com.huawei.digitalpayment.consumer.loginModule.mpin.request.VerifyChangePinSmsParams;
import com.huawei.http.BaseResp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u001e\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007H&¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/mpin/model/IChangePinOtpModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "sendSms", "", "params", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/request/SendOtpParams;", "callback", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/http/BaseResp;", "verifySms", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/request/VerifyChangePinSmsParams;", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/VerifyChangePinSmsResp;", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IChangePinOtpModel extends BaseModel {
    void sendSms(SendOtpParams params, ApiCallback<BaseResp> callback);

    void verifySms(VerifyChangePinSmsParams params, ApiCallback<VerifyChangePinSmsResp> callback);
}
