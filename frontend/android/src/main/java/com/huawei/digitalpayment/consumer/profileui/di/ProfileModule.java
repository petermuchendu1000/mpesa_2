package com.huawei.digitalpayment.consumer.profileui.di;

import com.huawei.digitalpayment.consumer.profile.model.ChangeMsisdnModel;
import com.huawei.digitalpayment.consumer.profile.model.IChangeMsisdnModel;
import com.huawei.digitalpayment.consumer.profile.model.IPhotoProfileModel;
import com.huawei.digitalpayment.consumer.profile.model.IProfileModel;
import com.huawei.digitalpayment.consumer.profile.model.PhotoProfileModel;
import com.huawei.digitalpayment.consumer.profile.model.ProfileModel;
import com.huawei.digitalpayment.consumer.profile.model.UpdateDynamicsKycModel;
import com.huawei.digitalpayment.consumer.profile.model.remote.IUpdateDynamicsKycModel;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class ProfileModule {
    @Binds
    public abstract IChangeMsisdnModel bindChangeMsisdnModel(ChangeMsisdnModel changeMsisdnModel);

    @Binds
    public abstract IPhotoProfileModel bindIPhotoProfileModel(PhotoProfileModel photoProfileModel);

    @Binds
    public abstract IProfileModel bindProfileModel(ProfileModel profileModel);

    @Binds
    public abstract IUpdateDynamicsKycModel bindUpdateDynamicsKycModel(UpdateDynamicsKycModel updateDynamicsKycModel);
}
