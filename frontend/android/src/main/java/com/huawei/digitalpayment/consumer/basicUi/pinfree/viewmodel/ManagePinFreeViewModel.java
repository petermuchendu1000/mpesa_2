package com.huawei.digitalpayment.consumer.basicUi.pinfree.viewmodel;

import com.huawei.digitalpayment.consumer.basicUi.pinfree.model.ManagePinFreeModel;
import javax.inject.Inject;

public class ManagePinFreeViewModel extends BaseManagePinFreeViewModel<ManagePinFreeModel> {
    @Inject
    public ManagePinFreeViewModel(ManagePinFreeModel managePinFreeModel) {
        super(managePinFreeModel);
    }
}
