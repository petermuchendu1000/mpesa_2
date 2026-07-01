package com.huawei.digitalpayment.consumer.loginModule.login.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.login.data.PinLoginModel;
import javax.inject.Inject;

public class PinLoginViewModel extends BasePinLoginViewModel<PinLoginModel> {
    @Inject
    public PinLoginViewModel(PinLoginModel pinLoginModel) {
        super(pinLoginModel);
    }
}
