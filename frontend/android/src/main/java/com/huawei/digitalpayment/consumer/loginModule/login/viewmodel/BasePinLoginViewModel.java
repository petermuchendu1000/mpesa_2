package com.huawei.digitalpayment.consumer.loginModule.login.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.util.encrypt.EncryptUtils;
import com.huawei.digitalpayment.consumer.loginModule.login.data.PinLoginModel;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.PinLoginParams;
import com.huawei.payment.mvvm.Resource;

public class BasePinLoginViewModel<Model extends PinLoginModel> extends ViewModel {
    private static int component2 = 1;
    private static int copydefault;
    private final MutableLiveData<Resource<LocalLoginInfo>> ShareDataUIState = new MutableLiveData<>();
    protected final Model model;

    public BasePinLoginViewModel(Model model) {
        this.model = model;
    }

    public LiveData<Resource<LocalLoginInfo>> getData() {
        int i = 2 % 2;
        int i2 = component2 + 95;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MutableLiveData<Resource<LocalLoginInfo>> mutableLiveData = this.ShareDataUIState;
        int i4 = i3 + 77;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
        return mutableLiveData;
    }

    @Deprecated
    public void pinLogin(String str) {
        int i = 2 % 2;
        pinLogin(new PinLoginParams(EncryptUtils.encryptWithPinKey(str)));
        int i2 = component2 + 65;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 18 / 0;
        }
    }

    public void pinLogin(PinLoginParams pinLoginParams) {
        int i = 2 % 2;
        Object obj = null;
        this.ShareDataUIState.setValue(Resource.loading(null));
        this.model.pinLogin(pinLoginParams, new ApiCallback<LocalLoginInfo>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public void onSuccess(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 73;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                copydefault(localLoginInfo);
                int i5 = component1 + 67;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            public void copydefault(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 9;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                BasePinLoginViewModel.component1(BasePinLoginViewModel.this).setValue(Resource.success(localLoginInfo));
                int i5 = ShareDataUIState + 43;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 41;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    BasePinLoginViewModel.component1(BasePinLoginViewModel.this).setValue(Resource.error(baseException, null));
                    throw null;
                }
                BasePinLoginViewModel.component1(BasePinLoginViewModel.this).setValue(Resource.error(baseException, null));
                int i4 = ShareDataUIState + 61;
                component1 = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i2 = component2 + 111;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void cancel() {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.model.cancel();
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
    }

    public void clearState() {
        int i = 2 % 2;
        int i2 = component2 + 111;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.ShareDataUIState.setValue(Resource.none());
        int i4 = copydefault + 45;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static MutableLiveData component1(BasePinLoginViewModel basePinLoginViewModel) {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<LocalLoginInfo>> mutableLiveData = basePinLoginViewModel.ShareDataUIState;
        if (i3 != 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
