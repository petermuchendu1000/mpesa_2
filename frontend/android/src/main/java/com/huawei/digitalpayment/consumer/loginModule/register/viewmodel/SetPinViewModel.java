package com.huawei.digitalpayment.consumer.loginModule.register.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.register.data.SetPinModel;
import javax.inject.Inject;

public class SetPinViewModel extends BaseSetPinViewModel<SetPinModel> {
    @Inject
    public SetPinViewModel(SetPinModel setPinModel) {
        super(setPinModel);
    }
}
