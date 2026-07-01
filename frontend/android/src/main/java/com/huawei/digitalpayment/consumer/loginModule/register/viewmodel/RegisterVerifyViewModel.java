package com.huawei.digitalpayment.consumer.loginModule.register.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.register.data.RegisterKycModel;
import javax.inject.Inject;

public class RegisterVerifyViewModel extends BaseRegisterVerifyViewModel<RegisterKycModel> {
    @Inject
    public RegisterVerifyViewModel(RegisterKycModel registerKycModel) {
        super(registerKycModel);
    }
}
