package com.huawei.digitalpayment.consumer.loginModule.login.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.login.data.OtpLoginModel;
import javax.inject.Inject;

public class OtpLoginViewModel extends BaseOtpLoginViewModel<OtpLoginModel> {
    @Inject
    public OtpLoginViewModel(OtpLoginModel otpLoginModel) {
        super(otpLoginModel);
    }
}
