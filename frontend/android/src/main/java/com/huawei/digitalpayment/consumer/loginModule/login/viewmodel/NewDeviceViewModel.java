package com.huawei.digitalpayment.consumer.loginModule.login.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.login.data.NewDeviceModel;
import javax.inject.Inject;

public class NewDeviceViewModel extends BaseNewDeviceViewModel<NewDeviceModel> {
    @Inject
    public NewDeviceViewModel(NewDeviceModel newDeviceModel) {
        super(newDeviceModel);
    }
}
