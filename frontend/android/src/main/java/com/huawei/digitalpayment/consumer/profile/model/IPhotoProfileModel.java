package com.huawei.digitalpayment.consumer.profile.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.profile.model.local.LocalCustomer;
import com.huawei.digitalpayment.consumer.profile.model.request.UploadAvatarParams;

public interface IPhotoProfileModel extends BaseModel {
    void uploadAvatar(UploadAvatarParams uploadAvatarParams, ApiCallback<LocalCustomer> apiCallback);
}
