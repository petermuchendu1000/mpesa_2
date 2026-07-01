package com.huawei.digitalpayment.consumer.loginModule.login.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.util.encrypt.EncryptUtils;
import com.huawei.digitalpayment.consumer.loginModule.login.data.OtpLoginModel;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.OtpLoginParams;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.PinLoginParams;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;

public class BaseOtpLoginViewModel<Model extends OtpLoginModel> extends ViewModel {
    private static int component1 = 1;
    private static int copydefault;
    private final MutableLiveData<Resource<LocalLoginInfo>> ShareDataUIState = new MutableLiveData<>();
    private final MutableLiveData<Resource<BaseResp>> component2 = new MutableLiveData<>();
    protected final Model model;

    public BaseOtpLoginViewModel(Model model) {
        this.model = model;
    }

    public LiveData<Resource<LocalLoginInfo>> getData() {
        int i = 2 % 2;
        int i2 = component1 + 69;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<LocalLoginInfo>> mutableLiveData = this.ShareDataUIState;
        int i5 = i3 + 25;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public LiveData<Resource<BaseResp>> getSmsData() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 69;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = this.component2;
        int i5 = i2 + 71;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    @Deprecated
    public void otpLogin(String str) {
        int i = 2 % 2;
        otpLogin(new OtpLoginParams(str));
        int i2 = component1 + 65;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    public void otpLogin(OtpLoginParams otpLoginParams) {
        int i = 2 % 2;
        this.ShareDataUIState.setValue(Resource.loading(null));
        this.model.otpLogin(otpLoginParams, new ApiCallback<LocalLoginInfo>() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = component1 + 121;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                component1(localLoginInfo);
                if (i4 == 0) {
                    int i5 = 97 / 0;
                }
                int i6 = component1 + 59;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
            }

            public void component1(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = component1 + 43;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                BaseOtpLoginViewModel.component2(BaseOtpLoginViewModel.this).setValue(Resource.success(localLoginInfo));
                int i5 = copydefault + 13;
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
                int i3 = copydefault + 57;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    BaseOtpLoginViewModel.component2(BaseOtpLoginViewModel.this).setValue(Resource.error(baseException, null));
                } else {
                    BaseOtpLoginViewModel.component2(BaseOtpLoginViewModel.this).setValue(Resource.error(baseException, null));
                    throw null;
                }
            }
        });
        int i2 = component1 + 111;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    @Deprecated
    public void pinLogin(String str) {
        int i = 2 % 2;
        pinLogin(new PinLoginParams(EncryptUtils.encryptWithPinKey(str)));
        int i2 = copydefault + 43;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    public void pinLogin(PinLoginParams pinLoginParams) {
        int i = 2 % 2;
        this.ShareDataUIState.setValue(Resource.loading(null));
        this.model.pinLogin(pinLoginParams, new ApiCallback<LocalLoginInfo>() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = copydefault + 59;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                ShareDataUIState(localLoginInfo);
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void ShareDataUIState(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = copydefault + 59;
                component2 = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    BaseOtpLoginViewModel.component2(BaseOtpLoginViewModel.this).setValue(Resource.success(localLoginInfo));
                    obj.hashCode();
                    throw null;
                }
                BaseOtpLoginViewModel.component2(BaseOtpLoginViewModel.this).setValue(Resource.success(localLoginInfo));
                int i4 = component2 + 53;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = copydefault + 109;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                BaseOtpLoginViewModel.component2(BaseOtpLoginViewModel.this).setValue(Resource.error(baseException, null));
                int i5 = component2 + 41;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = copydefault + 35;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Deprecated
    public void sendLoginSms() {
        int i = 2 % 2;
        sendLoginSms(new BaseRequestParams());
        int i2 = copydefault + 11;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    public void sendLoginSms(BaseRequestParams baseRequestParams) {
        int i = 2 % 2;
        this.component2.setValue(Resource.loading(null));
        this.model.sendLoginSms(baseRequestParams, new ApiCallback<BaseResp>() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component3 + 111;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                ShareDataUIState(baseResp);
                int i5 = component2 + 45;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            public void ShareDataUIState(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 123;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                MutableLiveData mutableLiveDataComponent1 = BaseOtpLoginViewModel.component1(BaseOtpLoginViewModel.this);
                if (i4 != 0) {
                    mutableLiveDataComponent1.setValue(Resource.success(baseResp));
                } else {
                    mutableLiveDataComponent1.setValue(Resource.success(baseResp));
                    int i5 = 23 / 0;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component2 + 43;
                component3 = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    BaseOtpLoginViewModel.component1(BaseOtpLoginViewModel.this).setValue(Resource.error(baseException, null));
                } else {
                    BaseOtpLoginViewModel.component1(BaseOtpLoginViewModel.this).setValue(Resource.error(baseException, null));
                    obj.hashCode();
                    throw null;
                }
            }
        });
        int i2 = copydefault + 39;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    public void cancel() {
        int i = 2 % 2;
        int i2 = component1 + 79;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.model.cancel();
        if (i3 != 0) {
            throw null;
        }
    }

    static MutableLiveData component2(BaseOtpLoginViewModel baseOtpLoginViewModel) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 77;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<LocalLoginInfo>> mutableLiveData = baseOtpLoginViewModel.ShareDataUIState;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 89;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    static MutableLiveData component1(BaseOtpLoginViewModel baseOtpLoginViewModel) {
        int i = 2 % 2;
        int i2 = component1 + 117;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = baseOtpLoginViewModel.component2;
        if (i4 != 0) {
            int i5 = 69 / 0;
        }
        int i6 = i3 + 105;
        component1 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 53 / 0;
        }
        return mutableLiveData;
    }
}
