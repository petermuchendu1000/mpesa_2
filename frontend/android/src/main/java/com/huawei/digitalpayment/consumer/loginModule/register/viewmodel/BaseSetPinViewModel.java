package com.huawei.digitalpayment.consumer.loginModule.register.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseViewModel;
import com.huawei.digitalpayment.consumer.baselib.util.encrypt.EncryptUtils;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.register.data.SetPinModel;
import com.huawei.digitalpayment.consumer.loginModule.register.request.SetPinParams;
import com.huawei.payment.mvvm.Resource;

public class BaseSetPinViewModel<Model extends SetPinModel> extends BaseViewModel<Model> {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final MutableLiveData<Resource<LocalLoginInfo>> component1;

    public BaseSetPinViewModel(Model model) {
        super(model);
        this.component1 = new MutableLiveData<>();
    }

    public LiveData<Resource<LocalLoginInfo>> getData() {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public void setPin(String str) {
        int i = 2 % 2;
        setPin(new SetPinParams(EncryptUtils.encryptWithPinKey(str)));
        int i2 = copydefault + 69;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public void setPin(SetPinParams setPinParams) {
        int i = 2 % 2;
        this.component1.setValue(Resource.loading(null));
        ((SetPinModel) this.model).setPin(setPinParams, new ApiCallback<LocalLoginInfo>() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = component3 + 69;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                component3(localLoginInfo);
                if (i4 != 0) {
                    int i5 = 0 / 0;
                }
                int i6 = component2 + 95;
                component3 = i6 % 128;
                int i7 = i6 % 2;
            }

            public void component3(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = component3 + 99;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                BaseSetPinViewModel.ShareDataUIState(BaseSetPinViewModel.this).setValue(Resource.success(localLoginInfo));
                int i5 = component3 + 119;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component2 + 27;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                BaseSetPinViewModel.ShareDataUIState(BaseSetPinViewModel.this).setValue(Resource.error(baseException, null));
                int i5 = component3 + 35;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i2 = copydefault + 123;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static MutableLiveData ShareDataUIState(BaseSetPinViewModel baseSetPinViewModel) {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<LocalLoginInfo>> mutableLiveData = baseSetPinViewModel.component1;
        if (i4 != 0) {
            int i5 = 79 / 0;
        }
        int i6 = i3 + 19;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return mutableLiveData;
    }
}
