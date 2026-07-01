package com.huawei.digitalpayment.consumer.loginModule.login.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.login.data.LoginModel;
import javax.inject.Inject;

public class LoginViewModel extends BaseLoginViewModel<LoginModel> {
    @Inject
    public LoginViewModel(LoginModel loginModel) {
        super(loginModel);
    }
}
