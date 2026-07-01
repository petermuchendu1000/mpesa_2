package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.util.encrypt.EncryptUtils;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.IGetTokenModel;
import com.huawei.digitalpayment.consumer.loginModule.mpin.request.GetPinTokenParams;
import com.huawei.payment.mvvm.Resource;

public class BaseGetPinTokenViewModel<Model extends IGetTokenModel> extends ViewModel {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private final MutableLiveData<Resource<String>> component1 = new MutableLiveData<>();
    protected final Model model;

    public LiveData<Resource<String>> getData() {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<String>> mutableLiveData = this.component1;
        if (i3 == 0) {
            int i4 = 19 / 0;
        }
        return mutableLiveData;
    }

    public BaseGetPinTokenViewModel(Model model) {
        this.model = model;
    }

    @Deprecated
    public void authSensitiveOperation(String str) {
        int i = 2 % 2;
        authSensitiveOperation(new GetPinTokenParams(EncryptUtils.encryptWithPinKey(str)));
        int i2 = copydefault + 3;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    public void authSensitiveOperation(GetPinTokenParams getPinTokenParams) {
        int i = 2 % 2;
        this.component1.setValue(Resource.loading(null));
        this.model.getPinToken(getPinTokenParams, new ApiCallback<String>() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public void onSuccess(String str) {
                int i2 = 2 % 2;
                int i3 = component2 + 125;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                copydefault(str);
                if (i4 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void copydefault(String str) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 93;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    super.onSuccess(str);
                    BaseGetPinTokenViewModel.copydefault(BaseGetPinTokenViewModel.this).setValue(Resource.success(str));
                    int i4 = ShareDataUIState + 5;
                    component2 = i4 % 128;
                    int i5 = i4 % 2;
                    return;
                }
                super.onSuccess(str);
                BaseGetPinTokenViewModel.copydefault(BaseGetPinTokenViewModel.this).setValue(Resource.success(str));
                throw null;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 123;
                component2 = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    super.onError(baseException);
                    BaseGetPinTokenViewModel.copydefault(BaseGetPinTokenViewModel.this).setValue(Resource.error(baseException, null));
                    int i4 = ShareDataUIState + 65;
                    component2 = i4 % 128;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
                super.onError(baseException);
                BaseGetPinTokenViewModel.copydefault(BaseGetPinTokenViewModel.this).setValue(Resource.error(baseException, null));
                obj.hashCode();
                throw null;
            }
        });
        int i2 = ShareDataUIState + 45;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 84 / 0;
        }
    }

    static MutableLiveData copydefault(BaseGetPinTokenViewModel baseGetPinTokenViewModel) {
        int i = 2 % 2;
        int i2 = copydefault + 27;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<String>> mutableLiveData = baseGetPinTokenViewModel.component1;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 23;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }
}
