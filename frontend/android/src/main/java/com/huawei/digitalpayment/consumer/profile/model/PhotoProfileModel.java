package com.huawei.digitalpayment.consumer.profile.model;

import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.profile.model.local.LocalCustomer;
import com.huawei.digitalpayment.consumer.profile.model.remote.RemoteUploadAvatar;
import com.huawei.digitalpayment.consumer.profile.model.request.UploadAvatarParams;
import javax.inject.Inject;

public class PhotoProfileModel implements IPhotoProfileModel {
    private static int ShareDataUIState = 1;
    private static int copydefault;

    @Inject
    public PhotoProfileModel() {
    }

    @Override
    public void uploadAvatar(UploadAvatarParams uploadAvatarParams, final ApiCallback<LocalCustomer> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<RemoteUploadAvatar> paymentRequest = new PaymentRequest<RemoteUploadAvatar>(this) {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault + 19;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    return "avatar/upload";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        paymentRequest.addParams(uploadAvatarParams);
        sendRequest(paymentRequest, new ApiCallback<RemoteUploadAvatar>(this) {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(RemoteUploadAvatar remoteUploadAvatar) {
                int i2 = 2 % 2;
                int i3 = component3 + 67;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(remoteUploadAvatar);
                if (i4 != 0) {
                    throw null;
                }
            }

            public void onSuccess2(RemoteUploadAvatar remoteUploadAvatar) {
                int i2 = 2 % 2;
                int i3 = component1 + 27;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ApiCallback apiCallback2 = apiCallback;
                if (apiCallback2 != null) {
                    apiCallback2.onSuccess(new LocalCustomer(remoteUploadAvatar.getDocId()));
                }
                int i4 = component3 + 29;
                component1 = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component3 + 95;
                int i4 = i3 % 128;
                component1 = i4;
                if (i3 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ApiCallback apiCallback2 = apiCallback;
                if (apiCallback2 != null) {
                    int i5 = i4 + 99;
                    component3 = i5 % 128;
                    int i6 = i5 % 2;
                    apiCallback2.onError(baseException);
                    int i7 = component1 + 83;
                    component3 = i7 % 128;
                    int i8 = i7 % 2;
                }
                int i9 = component3 + 69;
                component1 = i9 % 128;
                int i10 = i9 % 2;
            }
        });
        int i2 = copydefault + 39;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }
}
