package com.huawei.digitalpayment.consumer.loginModule.register.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseViewModel;
import com.huawei.digitalpayment.consumer.baselib.util.encrypt.EncryptUtils;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.register.data.ActiveConsumerModel;
import com.huawei.digitalpayment.consumer.loginModule.register.request.ActiveConsumerParams;
import com.huawei.payment.mvvm.Resource;

public class BaseActiveConsumerViewModel<Model extends ActiveConsumerModel> extends BaseViewModel<Model> {
    private static int component1 = 0;
    private static int component3 = 1;
    private final MutableLiveData<Resource<LocalLoginInfo>> ShareDataUIState;

    public BaseActiveConsumerViewModel(Model model) {
        super(model);
        this.ShareDataUIState = new MutableLiveData<>();
    }

    public LiveData<Resource<LocalLoginInfo>> getData() {
        MutableLiveData<Resource<LocalLoginInfo>> mutableLiveData;
        int i = 2 % 2;
        int i2 = component1 + 109;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            mutableLiveData = this.ShareDataUIState;
            int i4 = 37 / 0;
        } else {
            mutableLiveData = this.ShareDataUIState;
        }
        int i5 = i3 + 83;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableLiveData;
        }
        throw null;
    }

    @Deprecated
    public void activeConsumer(String str, String str2) {
        int i = 2 % 2;
        activeConsumer(new ActiveConsumerParams(EncryptUtils.encryptWithPinKey(str), EncryptUtils.encryptWithPinKey(str2), null));
        int i2 = component1 + 15;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 83 / 0;
        }
    }

    public void activeConsumer(ActiveConsumerParams activeConsumerParams) {
        int i = 2 % 2;
        this.ShareDataUIState.setValue(Resource.loading(null));
        ((ActiveConsumerModel) this.model).activeConsumer(activeConsumerParams, new ApiCallback<LocalLoginInfo>() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public void onSuccess(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = component1 + 99;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                component3(localLoginInfo);
                if (i4 == 0) {
                    throw null;
                }
                int i5 = component1 + 19;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            public void component3(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = component2 + 25;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                BaseActiveConsumerViewModel.component2(BaseActiveConsumerViewModel.this).setValue(Resource.success(localLoginInfo));
                int i5 = component1 + 59;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component2 + 81;
                component1 = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    BaseActiveConsumerViewModel.component2(BaseActiveConsumerViewModel.this).setValue(Resource.error(baseException, null));
                    obj.hashCode();
                    throw null;
                }
                BaseActiveConsumerViewModel.component2(BaseActiveConsumerViewModel.this).setValue(Resource.error(baseException, null));
                int i4 = component1 + 89;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 83 / 0;
                }
            }
        });
        int i2 = component3 + 3;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 82 / 0;
        }
    }

    static MutableLiveData component2(BaseActiveConsumerViewModel baseActiveConsumerViewModel) {
        int i = 2 % 2;
        int i2 = component1 + 105;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<LocalLoginInfo>> mutableLiveData = baseActiveConsumerViewModel.ShareDataUIState;
        if (i4 == 0) {
            int i5 = 51 / 0;
        }
        int i6 = i3 + 15;
        component1 = i6 % 128;
        if (i6 % 2 == 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
