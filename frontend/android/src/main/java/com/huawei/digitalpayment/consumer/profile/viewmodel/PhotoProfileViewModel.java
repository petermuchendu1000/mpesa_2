package com.huawei.digitalpayment.consumer.profile.viewmodel;

import com.huawei.digitalpayment.consumer.profile.model.IPhotoProfileModel;
import javax.inject.Inject;

public class PhotoProfileViewModel extends BasePhotoProfileViewModel<IPhotoProfileModel> {
    @Inject
    public PhotoProfileViewModel(IPhotoProfileModel iPhotoProfileModel) {
        super(iPhotoProfileModel);
    }
}
