package com.huawei.digitalpayment.consumer.loginModule.register.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.register.data.ActiveConsumerModel;
import javax.inject.Inject;

public class ActiveConsumerViewModel extends BaseActiveConsumerViewModel<ActiveConsumerModel> {
    @Inject
    public ActiveConsumerViewModel(ActiveConsumerModel activeConsumerModel) {
        super(activeConsumerModel);
    }
}
