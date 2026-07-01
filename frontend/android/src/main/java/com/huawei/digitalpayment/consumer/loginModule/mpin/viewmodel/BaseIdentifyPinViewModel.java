package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.gson.JsonObject;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseViewModel;
import com.huawei.digitalpayment.consumer.baselib.util.encrypt.EncryptUtils;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.ChangePinModel;
import com.huawei.digitalpayment.consumer.loginModule.register.request.AuthSensitiveOperationParams;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;

public class BaseIdentifyPinViewModel<Model extends ChangePinModel> extends BaseViewModel<Model> {
    private static int component1 = 1;
    private static int component2;
    private final MutableLiveData<Resource<JsonObject>> component3;

    public BaseIdentifyPinViewModel(Model model) {
        super(model);
        this.component3 = new MutableLiveData<>();
    }

    public LiveData<Resource<JsonObject>> getData() {
        int i = 2 % 2;
        int i2 = component1 + 51;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<JsonObject>> mutableLiveData = this.component3;
        int i5 = i3 + 107;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 61 / 0;
        }
        return mutableLiveData;
    }

    @Deprecated
    public void authSensitiveOperation(String str) {
        int i = 2 % 2;
        authSensitiveOperation(new AuthSensitiveOperationParams(EncryptUtils.encryptWithPinKey(str)));
        int i2 = component1 + 91;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    public void authSensitiveOperation(AuthSensitiveOperationParams authSensitiveOperationParams) {
        int i = 2 % 2;
        this.component3.setValue(Resource.loading(null));
        ((ChangePinModel) this.model).authSensitiveOperation(authSensitiveOperationParams, new ApiCallback<BaseResp>() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 61;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                component1(baseResp);
                if (i4 == 0) {
                    int i5 = 83 / 0;
                }
                int i6 = copydefault + 79;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
            }

            public void component1(BaseResp baseResp) {
                int i2 = 2 % 2;
                BaseIdentifyPinViewModel.component3(BaseIdentifyPinViewModel.this).setValue(Resource.success(new JsonObject()));
                int i3 = copydefault + 39;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = copydefault + 123;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                BaseIdentifyPinViewModel.component3(BaseIdentifyPinViewModel.this).setValue(Resource.error(baseException, null));
                int i5 = ShareDataUIState + 43;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i2 = component2 + 39;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    static MutableLiveData component3(BaseIdentifyPinViewModel baseIdentifyPinViewModel) {
        int i = 2 % 2;
        int i2 = component1 + 75;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<JsonObject>> mutableLiveData = baseIdentifyPinViewModel.component3;
        int i5 = i3 + 45;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
