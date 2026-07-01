package com.huawei.digitalpayment.consumer.profile.viewmodel;

import com.huawei.digitalpayment.consumer.profile.model.remote.IUpdateDynamicsKycModel;
import javax.inject.Inject;

public class UpdateDynamicsKycViewModel extends BaseUpdateDynamicsKycViewModel<IUpdateDynamicsKycModel> {
    @Inject
    public UpdateDynamicsKycViewModel(IUpdateDynamicsKycModel iUpdateDynamicsKycModel) {
        super(iUpdateDynamicsKycModel);
    }
}
