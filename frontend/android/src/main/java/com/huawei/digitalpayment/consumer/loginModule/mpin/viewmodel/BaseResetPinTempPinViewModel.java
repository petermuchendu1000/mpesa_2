package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseViewModel;
import com.huawei.digitalpayment.consumer.baselib.util.encrypt.EncryptUtils;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.PinLoginParams;
import com.huawei.digitalpayment.consumer.loginModule.register.data.IResetPinModel;
import com.huawei.digitalpayment.consumer.loginModule.register.request.ChangePinParams;
import com.huawei.digitalpayment.consumer.loginModule.register.request.ReSetPinParams;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;

public class BaseResetPinTempPinViewModel<Model extends IResetPinModel> extends BaseViewModel<Model> {
    private static int component2 = 0;
    private static int copy = 1;
    private final MutableLiveData<Resource<BaseResp>> copydefault = new MutableLiveData<>();
    private final MutableLiveData<Resource<LocalLoginInfo>> component1 = new MutableLiveData<>();
    private final MutableLiveData<Resource<BaseResp>> ShareDataUIState = new MutableLiveData<>();
    private final MutableLiveData<Resource<BaseResp>> component3 = new MutableLiveData<>();

    public LiveData<Resource<BaseResp>> getDataAuth() {
        int i = 2 % 2;
        int i2 = copy + 69;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public LiveData<Resource<LocalLoginInfo>> getPinLoginData() {
        int i = 2 % 2;
        int i2 = component2 + 15;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<LocalLoginInfo>> mutableLiveData = this.component1;
        int i5 = i3 + 119;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public LiveData<Resource<BaseResp>> getResetPin() {
        MutableLiveData<Resource<BaseResp>> mutableLiveData;
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 55;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            mutableLiveData = this.component3;
            int i4 = 90 / 0;
        } else {
            mutableLiveData = this.component3;
        }
        int i5 = i2 + 109;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public LiveData<Resource<BaseResp>> getData() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 89;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = this.copydefault;
        int i5 = i2 + 101;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public void pinLogin(PinLoginParams pinLoginParams) {
        int i = 2 % 2;
        this.component1.setValue(Resource.loading(null));
        ((IResetPinModel) this.model).pinLogin(pinLoginParams, new ApiCallback<LocalLoginInfo>() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public void onSuccess(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = component3 + 57;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                component2(localLoginInfo);
                int i5 = ShareDataUIState + 29;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void component2(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = component3 + 67;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    BaseResetPinTempPinViewModel.component2(BaseResetPinTempPinViewModel.this).setValue(Resource.success(localLoginInfo));
                    throw null;
                }
                BaseResetPinTempPinViewModel.component2(BaseResetPinTempPinViewModel.this).setValue(Resource.success(localLoginInfo));
                int i4 = ShareDataUIState + 71;
                component3 = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 47;
                component3 = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    BaseResetPinTempPinViewModel.component2(BaseResetPinTempPinViewModel.this).setValue(Resource.error(baseException, null));
                    throw null;
                }
                BaseResetPinTempPinViewModel.component2(BaseResetPinTempPinViewModel.this).setValue(Resource.error(baseException, null));
                int i4 = ShareDataUIState + 111;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        int i2 = component2 + 23;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public void changePin(ChangePinParams changePinParams) {
        int i = 2 % 2;
        Object obj = null;
        this.copydefault.setValue(Resource.loading(null));
        ((IResetPinModel) this.model).changePin(changePinParams, new ApiCallback<BaseResp>() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 121;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                copydefault(baseResp);
                if (i4 != 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public void copydefault(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 79;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                BaseResetPinTempPinViewModel.component3(BaseResetPinTempPinViewModel.this).setValue(Resource.success(baseResp));
                if (i4 == 0) {
                    int i5 = 37 / 0;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component3 + 13;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    BaseResetPinTempPinViewModel.component3(BaseResetPinTempPinViewModel.this).setValue(Resource.error(baseException, null));
                    int i4 = 57 / 0;
                } else {
                    BaseResetPinTempPinViewModel.component3(BaseResetPinTempPinViewModel.this).setValue(Resource.error(baseException, null));
                }
                int i5 = component3 + 99;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = copy + 109;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void resetPin(ReSetPinParams reSetPinParams) {
        int i = 2 % 2;
        this.component3.setValue(Resource.loading(null));
        ((IResetPinModel) this.model).resetPin(reSetPinParams, new ApiCallback<BaseResp>() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component1 + 37;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                component1(baseResp);
                if (i4 == 0) {
                    throw null;
                }
                int i5 = component1 + 89;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 34 / 0;
                }
            }

            public void component1(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component1 + 67;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    BaseResetPinTempPinViewModel.copydefault(BaseResetPinTempPinViewModel.this).setValue(Resource.success(baseResp));
                    int i4 = 51 / 0;
                } else {
                    BaseResetPinTempPinViewModel.copydefault(BaseResetPinTempPinViewModel.this).setValue(Resource.success(baseResp));
                }
                int i5 = copydefault + 29;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component1 + 13;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                BaseResetPinTempPinViewModel.copydefault(BaseResetPinTempPinViewModel.this).setValue(Resource.error(baseException, null));
                int i5 = copydefault + 85;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = component2 + 59;
        copy = i2 % 128;
        int i3 = i2 % 2;
    }

    public void cancelRequest() {
        int i = 2 % 2;
        int i2 = component2 + 93;
        copy = i2 % 128;
        int i3 = i2 % 2;
        cancel();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public void pinLogin(String str) {
        int i = 2 % 2;
        pinLogin(new PinLoginParams(EncryptUtils.encryptWithPinKey(str)));
        int i2 = component2 + 91;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public void resetPin(String str, String str2) {
        int i = 2 % 2;
        resetPin(new ReSetPinParams(str, str2, null));
        int i2 = copy + 29;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 65 / 0;
        }
    }

    @Deprecated
    public void changePin(String str, String str2) {
        int i = 2 % 2;
        changePin(new ChangePinParams(EncryptUtils.encryptWithPinKey(str), EncryptUtils.encryptWithPinKey(str2), null));
        int i2 = component2 + 53;
        copy = i2 % 128;
        int i3 = i2 % 2;
    }

    static MutableLiveData component3(BaseResetPinTempPinViewModel baseResetPinTempPinViewModel) {
        int i = 2 % 2;
        int i2 = copy + 119;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = baseResetPinTempPinViewModel.copydefault;
        int i5 = i3 + 65;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    static MutableLiveData component2(BaseResetPinTempPinViewModel baseResetPinTempPinViewModel) {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 91;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<LocalLoginInfo>> mutableLiveData = baseResetPinTempPinViewModel.component1;
        int i5 = i2 + 55;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 7 / 0;
        }
        return mutableLiveData;
    }

    static MutableLiveData copydefault(BaseResetPinTempPinViewModel baseResetPinTempPinViewModel) {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 47;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = baseResetPinTempPinViewModel.component3;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 79;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }
}
