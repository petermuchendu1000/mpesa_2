package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseViewModel;
import com.huawei.digitalpayment.consumer.baselib.util.encrypt.EncryptUtils;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.PinLoginParams;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.ChangePinModel;
import com.huawei.digitalpayment.consumer.loginModule.register.request.AuthSensitiveOperationParams;
import com.huawei.digitalpayment.consumer.loginModule.register.request.ChangePinParams;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;

public class BaseChangePinViewModel<Model extends ChangePinModel> extends BaseViewModel<Model> {
    private static int ShareDataUIState = 1;
    private static int component2;
    private final MutableLiveData<Resource<BaseResp>> component1;
    private final MutableLiveData<Resource<LocalLoginInfo>> component3;

    public BaseChangePinViewModel(Model model) {
        super(model);
        this.component1 = new MutableLiveData<>();
        this.component3 = new MutableLiveData<>();
    }

    public LiveData<Resource<BaseResp>> getData() {
        MutableLiveData<Resource<BaseResp>> mutableLiveData;
        int i = 2 % 2;
        int i2 = component2 + 33;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            mutableLiveData = this.component1;
            int i4 = 58 / 0;
        } else {
            mutableLiveData = this.component1;
        }
        int i5 = i3 + 89;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public LiveData<Resource<LocalLoginInfo>> getPinLoginData() {
        int i = 2 % 2;
        int i2 = component2 + 101;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<LocalLoginInfo>> mutableLiveData = this.component3;
        int i5 = i3 + 51;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableLiveData;
        }
        throw null;
    }

    public void authSensitiveOperation(AuthSensitiveOperationParams authSensitiveOperationParams) {
        int i = 2 % 2;
        this.component1.setValue(Resource.loading(null));
        ((ChangePinModel) this.model).authSensitiveOperation(authSensitiveOperationParams, new ApiCallback<BaseResp>() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = copydefault + 39;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                component1(baseResp);
                int i5 = copydefault + 35;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 83 / 0;
                }
            }

            public void component1(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = copydefault + 59;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                BaseChangePinViewModel.component1(BaseChangePinViewModel.this).setValue(Resource.success(baseResp));
                if (i4 == 0) {
                    int i5 = 54 / 0;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = copydefault + 17;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                BaseChangePinViewModel.component1(BaseChangePinViewModel.this).setValue(Resource.error(baseException, null));
                int i5 = component2 + 19;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i2 = ShareDataUIState + 81;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 48 / 0;
        }
    }

    public void pinLogin(PinLoginParams pinLoginParams) {
        int i = 2 % 2;
        this.component3.setValue(Resource.loading(null));
        ((ChangePinModel) this.model).pinLogin(pinLoginParams, new ApiCallback<LocalLoginInfo>() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public void onSuccess(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 51;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                ShareDataUIState(localLoginInfo);
                if (i4 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = ShareDataUIState + 125;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void ShareDataUIState(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = component2 + 59;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    BaseChangePinViewModel.ShareDataUIState(BaseChangePinViewModel.this).setValue(Resource.success(localLoginInfo));
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                BaseChangePinViewModel.ShareDataUIState(BaseChangePinViewModel.this).setValue(Resource.success(localLoginInfo));
                int i4 = component2 + 93;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component2 + 41;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    BaseChangePinViewModel.ShareDataUIState(BaseChangePinViewModel.this).setValue(Resource.error(baseException, null));
                    int i4 = 18 / 0;
                } else {
                    BaseChangePinViewModel.ShareDataUIState(BaseChangePinViewModel.this).setValue(Resource.error(baseException, null));
                }
                int i5 = ShareDataUIState + 65;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i2 = component2 + 29;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    public void changePin(ChangePinParams changePinParams) {
        int i = 2 % 2;
        this.component1.setValue(Resource.loading(null));
        ((ChangePinModel) this.model).changePin(changePinParams, new ApiCallback<BaseResp>() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = copydefault + 71;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                ShareDataUIState(baseResp);
                int i5 = component3 + 39;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }

            public void ShareDataUIState(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component3 + 47;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                BaseChangePinViewModel.component1(BaseChangePinViewModel.this).setValue(Resource.success(baseResp));
                int i5 = component3 + 17;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = copydefault + 69;
                component3 = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    BaseChangePinViewModel.component1(BaseChangePinViewModel.this).setValue(Resource.error(baseException, null));
                    obj.hashCode();
                    throw null;
                }
                BaseChangePinViewModel.component1(BaseChangePinViewModel.this).setValue(Resource.error(baseException, null));
                int i4 = copydefault + 55;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        int i2 = component2 + 1;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    @Deprecated
    public void changePin(String str, String str2) {
        int i = 2 % 2;
        changePin(new ChangePinParams(EncryptUtils.encryptWithPinKey(str), EncryptUtils.encryptWithPinKey(str2), null));
        int i2 = ShareDataUIState + 43;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Deprecated
    public void authSensitiveOperation(String str) {
        int i = 2 % 2;
        authSensitiveOperation(new AuthSensitiveOperationParams(EncryptUtils.encryptWithPinKey(str)));
        int i2 = ShareDataUIState + 27;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    static MutableLiveData component1(BaseChangePinViewModel baseChangePinViewModel) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = baseChangePinViewModel.component1;
        int i5 = i3 + 27;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    static MutableLiveData ShareDataUIState(BaseChangePinViewModel baseChangePinViewModel) {
        int i = 2 % 2;
        int i2 = component2 + 89;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<LocalLoginInfo>> mutableLiveData = baseChangePinViewModel.component3;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 5;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 18 / 0;
        }
        return mutableLiveData;
    }
}
