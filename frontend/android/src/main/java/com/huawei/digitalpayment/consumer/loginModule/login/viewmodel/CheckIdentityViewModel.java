package com.huawei.digitalpayment.consumer.loginModule.login.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.login.data.NewDeviceModel;
import javax.inject.Inject;

public class CheckIdentityViewModel extends BaseCheckIdentityViewModel<NewDeviceModel> {
    @Inject
    public CheckIdentityViewModel(NewDeviceModel newDeviceModel) {
        super(newDeviceModel);
    }
}
