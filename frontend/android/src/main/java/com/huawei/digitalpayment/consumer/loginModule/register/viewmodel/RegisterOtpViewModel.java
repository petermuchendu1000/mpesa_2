package com.huawei.digitalpayment.consumer.loginModule.register.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.register.data.RegisterOtpModel;
import javax.inject.Inject;

public class RegisterOtpViewModel extends BaseRegisterOtpViewModel<RegisterOtpModel> {
    @Inject
    public RegisterOtpViewModel(RegisterOtpModel registerOtpModel) {
        super(registerOtpModel);
    }
}
