package com.huawei.digitalpayment.consumer.profile.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.profile.model.IPhotoProfileModel;
import com.huawei.digitalpayment.consumer.profile.model.local.LocalCustomer;
import com.huawei.digitalpayment.consumer.profile.model.request.UploadAvatarParams;
import com.huawei.payment.mvvm.Resource;

public class BasePhotoProfileViewModel<Model extends IPhotoProfileModel> extends ViewModel {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final MutableLiveData<Resource<String>> ShareDataUIState = new MutableLiveData<>();
    private final MutableLiveData<Resource<LocalCustomer>> component1 = new MutableLiveData<>();
    protected final Model model;

    public LiveData<Resource<String>> getUploadAvatar() {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<String>> mutableLiveData = this.ShareDataUIState;
        int i5 = i3 + 15;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public LiveData<Resource<LocalCustomer>> getUploadAvatar2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 13;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<LocalCustomer>> mutableLiveData = this.component1;
        int i5 = i2 + 27;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public BasePhotoProfileViewModel(Model model) {
        this.model = model;
    }

    @Deprecated
    public void uploadAvatar(String str) {
        int i = 2 % 2;
        this.ShareDataUIState.setValue(Resource.loading(null));
        this.model.uploadAvatar(new UploadAvatarParams(str), new ApiCallback<LocalCustomer>() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public void onSuccess(LocalCustomer localCustomer) {
                int i2 = 2 % 2;
                int i3 = component3 + 103;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                ShareDataUIState(localCustomer);
                if (i4 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = ShareDataUIState + 15;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 43 / 0;
                }
            }

            public void ShareDataUIState(LocalCustomer localCustomer) {
                int i2 = 2 % 2;
                int i3 = component3 + 59;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                BasePhotoProfileViewModel.ShareDataUIState(BasePhotoProfileViewModel.this).setValue(Resource.success(localCustomer.getAvatar()));
                int i5 = ShareDataUIState + 119;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 65;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                BasePhotoProfileViewModel.ShareDataUIState(BasePhotoProfileViewModel.this).setValue(Resource.error(baseException, null));
                int i5 = ShareDataUIState + 97;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i2 = component2 + 97;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    public void uploadAvatar(UploadAvatarParams uploadAvatarParams) {
        int i = 2 % 2;
        this.component1.setValue(Resource.loading(null));
        this.model.uploadAvatar(uploadAvatarParams, new ApiCallback<LocalCustomer>() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(LocalCustomer localCustomer) {
                int i2 = 2 % 2;
                int i3 = component3 + 73;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                component2(localCustomer);
                int i5 = component2 + 49;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            public void component2(LocalCustomer localCustomer) {
                int i2 = 2 % 2;
                int i3 = component3 + 45;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                MutableLiveData mutableLiveDataComponent1 = BasePhotoProfileViewModel.component1(BasePhotoProfileViewModel.this);
                if (i4 == 0) {
                    mutableLiveDataComponent1.setValue(Resource.success(localCustomer));
                    return;
                }
                mutableLiveDataComponent1.setValue(Resource.success(localCustomer));
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component3 + 109;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                BasePhotoProfileViewModel.component1(BasePhotoProfileViewModel.this).setValue(Resource.error(baseException, null));
                int i5 = component2 + 115;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = copydefault + 55;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static MutableLiveData ShareDataUIState(BasePhotoProfileViewModel basePhotoProfileViewModel) {
        int i = 2 % 2;
        int i2 = component2 + 13;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<String>> mutableLiveData = basePhotoProfileViewModel.ShareDataUIState;
        if (i3 != 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static MutableLiveData component1(BasePhotoProfileViewModel basePhotoProfileViewModel) {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<LocalCustomer>> mutableLiveData = basePhotoProfileViewModel.component1;
        if (i3 != 0) {
            int i4 = 64 / 0;
        }
        return mutableLiveData;
    }
}
