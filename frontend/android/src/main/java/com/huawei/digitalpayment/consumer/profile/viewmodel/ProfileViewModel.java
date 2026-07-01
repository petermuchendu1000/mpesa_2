package com.huawei.digitalpayment.consumer.profile.viewmodel;

import com.huawei.digitalpayment.consumer.profile.model.IProfileModel;
import javax.inject.Inject;

public class ProfileViewModel extends BaseProfileViewModel<IProfileModel> {
    @Inject
    public ProfileViewModel(IProfileModel iProfileModel) {
        super(iProfileModel);
    }
}
