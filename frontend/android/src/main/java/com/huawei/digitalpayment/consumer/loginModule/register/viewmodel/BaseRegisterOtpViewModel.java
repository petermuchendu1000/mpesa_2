package com.huawei.digitalpayment.consumer.loginModule.register.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseViewModel;
import com.huawei.digitalpayment.consumer.loginModule.register.data.RegisterOtpModel;
import com.huawei.digitalpayment.consumer.loginModule.register.model.OtpRegisterResp;
import com.huawei.digitalpayment.consumer.loginModule.register.request.OtpRegisterParams;
import com.huawei.digitalpayment.consumer.loginModule.register.request.ProcessVerifyRequest;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;

public class BaseRegisterOtpViewModel<Model extends RegisterOtpModel> extends BaseViewModel<Model> {
    private static int component3 = 0;
    private static int getRequestBeneficiariesState = 1;
    private final MutableLiveData<Resource<OtpRegisterResp>> ShareDataUIState;
    private final MutableLiveData<Resource<OtpRegisterResp>> component1;
    private final MutableLiveData<Resource<BaseResp>> component2;
    private final MutableLiveData<Resource<BaseResp>> copydefault;

    public BaseRegisterOtpViewModel(Model model) {
        super(model);
        this.copydefault = new MutableLiveData<>();
        this.component1 = new MutableLiveData<>();
        this.ShareDataUIState = new MutableLiveData<>();
        this.component2 = new MutableLiveData<>();
    }

    public LiveData<Resource<BaseResp>> getData() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 11;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = this.copydefault;
        int i5 = i3 + 75;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public MutableLiveData<Resource<OtpRegisterResp>> getRegisterLiveData() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 89;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        MutableLiveData<Resource<OtpRegisterResp>> mutableLiveData = this.component1;
        int i4 = i2 + 89;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return mutableLiveData;
        }
        obj.hashCode();
        throw null;
    }

    public MutableLiveData<Resource<OtpRegisterResp>> getProcessVerifyData() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 11;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MutableLiveData<Resource<OtpRegisterResp>> mutableLiveData = this.ShareDataUIState;
        int i4 = i3 + 95;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return mutableLiveData;
    }

    public LiveData<Resource<BaseResp>> getSmsData() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 115;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = this.component2;
        int i5 = i3 + 45;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    @Deprecated
    public void registerSmsCodeVerify(String str) {
        int i = 2 % 2;
        registerSmsCodeVerify2(new OtpRegisterParams(str));
        int i2 = component3 + 63;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    @Deprecated
    public void registerSmsCodeVerify(OtpRegisterParams otpRegisterParams) {
        int i = 2 % 2;
        this.copydefault.setValue(Resource.loading(null));
        ((RegisterOtpModel) this.model).registerSmsCodeVerify(otpRegisterParams, new ApiCallback<BaseResp>() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component3 + 45;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                copydefault(baseResp);
                if (i4 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void copydefault(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component1 + 91;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
                    BaseRegisterOtpViewModel.component3(BaseRegisterOtpViewModel.this).setValue(Resource.success(baseResp));
                    throw null;
                }
                BaseRegisterOtpViewModel.component3(BaseRegisterOtpViewModel.this).setValue(Resource.success(baseResp));
                int i4 = component1 + 65;
                component3 = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component3 + 13;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Object obj = null;
                BaseRegisterOtpViewModel.component3(BaseRegisterOtpViewModel.this).setValue(Resource.error(baseException, null));
                int i5 = component1 + 49;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        int i2 = component3 + 57;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    public void registerSmsCodeVerify2(OtpRegisterParams otpRegisterParams) {
        int i = 2 % 2;
        getRegisterLiveData().setValue(Resource.loading(null));
        ((RegisterOtpModel) this.model).registerSmsCodeVerify2(otpRegisterParams, new ApiCallback<OtpRegisterResp>() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(OtpRegisterResp otpRegisterResp) {
                int i2 = 2 % 2;
                int i3 = copydefault + 71;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                ShareDataUIState(otpRegisterResp);
                if (i4 != 0) {
                    int i5 = 4 / 0;
                }
            }

            public void ShareDataUIState(OtpRegisterResp otpRegisterResp) {
                int i2 = 2 % 2;
                int i3 = copydefault + 19;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    BaseRegisterOtpViewModel.this.getRegisterLiveData().setValue(Resource.success(otpRegisterResp));
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                BaseRegisterOtpViewModel.this.getRegisterLiveData().setValue(Resource.success(otpRegisterResp));
                int i4 = copydefault + 65;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 85 / 0;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component2 + 53;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                BaseRegisterOtpViewModel.this.getRegisterLiveData().setValue(Resource.error(baseException, null));
                int i5 = copydefault + 111;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = getRequestBeneficiariesState + 71;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    public void processVerify(ProcessVerifyRequest processVerifyRequest) {
        int i = 2 % 2;
        getProcessVerifyData().setValue(Resource.loading(null));
        ((RegisterOtpModel) this.model).processVerify(processVerifyRequest, new ApiCallback<OtpRegisterResp>() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(OtpRegisterResp otpRegisterResp) {
                int i2 = 2 % 2;
                int i3 = component3 + 103;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                ShareDataUIState(otpRegisterResp);
                if (i4 != 0) {
                    throw null;
                }
                int i5 = component3 + 55;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }

            public void ShareDataUIState(OtpRegisterResp otpRegisterResp) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 23;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                BaseRegisterOtpViewModel.this.getProcessVerifyData().setValue(Resource.success(otpRegisterResp));
                int i5 = ShareDataUIState + 117;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 41;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                BaseRegisterOtpViewModel.this.getProcessVerifyData().setValue(Resource.error(baseException, null));
                int i5 = component3 + 81;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = getRequestBeneficiariesState + 13;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Deprecated
    public void sendRegisterSms() {
        int i = 2 % 2;
        sendRegisterSms(new BaseRequestParams());
        int i2 = getRequestBeneficiariesState + 101;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    public void sendRegisterSms(BaseRequestParams baseRequestParams) {
        int i = 2 % 2;
        this.component2.setValue(Resource.loading(null));
        ((RegisterOtpModel) this.model).sendRegisterSms(baseRequestParams, new ApiCallback<BaseResp>() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component3 + 15;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                copydefault(baseResp);
                if (i4 == 0) {
                    int i5 = 75 / 0;
                }
            }

            public void copydefault(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component3 + 87;
                copydefault = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    BaseRegisterOtpViewModel.copydefault(BaseRegisterOtpViewModel.this).setValue(Resource.success(baseResp));
                    obj.hashCode();
                    throw null;
                }
                BaseRegisterOtpViewModel.copydefault(BaseRegisterOtpViewModel.this).setValue(Resource.success(baseResp));
                int i4 = component3 + 51;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component3 + 1;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    BaseRegisterOtpViewModel.copydefault(BaseRegisterOtpViewModel.this).setValue(Resource.error(baseException, null));
                    throw null;
                }
                BaseRegisterOtpViewModel.copydefault(BaseRegisterOtpViewModel.this).setValue(Resource.error(baseException, null));
                int i4 = component3 + 115;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i2 = component3 + 27;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 4 / 0;
        }
    }

    static MutableLiveData component3(BaseRegisterOtpViewModel baseRegisterOtpViewModel) {
        int i = 2 % 2;
        int i2 = component3 + 77;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = baseRegisterOtpViewModel.copydefault;
        int i5 = i3 + 83;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    static MutableLiveData copydefault(BaseRegisterOtpViewModel baseRegisterOtpViewModel) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 101;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = baseRegisterOtpViewModel.component2;
        int i5 = i2 + 31;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }
}
