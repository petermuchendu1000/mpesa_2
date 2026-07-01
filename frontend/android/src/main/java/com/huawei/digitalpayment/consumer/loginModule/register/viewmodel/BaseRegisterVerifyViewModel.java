package com.huawei.digitalpayment.consumer.loginModule.register.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.blankj.utilcode.util.GsonUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.consumer.baselib.model.BaseViewModel;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.register.data.RegisterKycModel;
import com.huawei.digitalpayment.consumer.loginModule.register.model.LocalIdType;
import com.huawei.digitalpayment.consumer.loginModule.register.model.dynamics.KycInfoResp;
import com.huawei.digitalpayment.consumer.loginModule.register.request.RegisterKycParams;
import com.huawei.digitalpayment.consumer.loginModule.register.request.RegisterParams;
import com.huawei.digitalpayment.customer.dynamics.model.DynamicsElement;
import com.huawei.payment.mvvm.Resource;
import java.util.HashMap;
import java.util.List;

public class BaseRegisterVerifyViewModel<Model extends RegisterKycModel> extends BaseViewModel<Model> {
    private static int component4 = 0;
    private static int getRequestBeneficiariesState = 1;

    @Deprecated
    private final MutableLiveData<Resource<KycInfoResp>> ShareDataUIState;
    private final MutableLiveData<Resource<com.huawei.digitalpayment.customer.dynamics.resp.KycInfoResp>> component1;
    private final MutableLiveData<Resource<List<DynamicsElement>>> component2;
    private final MutableLiveData<Resource<LocalLoginInfo>> component3;
    private final MutableLiveData<Resource<List<LocalIdType>>> copydefault;

    public BaseRegisterVerifyViewModel(Model model) {
        super(model);
        this.copydefault = new MutableLiveData<>();
        this.component3 = new MutableLiveData<>();
        this.ShareDataUIState = new MutableLiveData<>();
        this.component1 = new MutableLiveData<>();
        this.component2 = new MutableLiveData<>();
    }

    @Deprecated
    public LiveData<Resource<KycInfoResp>> getKycInfoLivedata() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 25;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public LiveData<Resource<com.huawei.digitalpayment.customer.dynamics.resp.KycInfoResp>> getKycInfoLivedata2() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 103;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<com.huawei.digitalpayment.customer.dynamics.resp.KycInfoResp>> mutableLiveData = this.component1;
        int i5 = i2 + 111;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableLiveData;
        }
        throw null;
    }

    public LiveData<Resource<List<DynamicsElement>>> getDynamicKycInfoLivedata() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 21;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<List<DynamicsElement>>> mutableLiveData = this.component2;
        int i5 = i2 + 119;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public LiveData<Resource<LocalLoginInfo>> getData() {
        MutableLiveData<Resource<LocalLoginInfo>> mutableLiveData;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 89;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 != 0) {
            mutableLiveData = this.component3;
            int i4 = 76 / 0;
        } else {
            mutableLiveData = this.component3;
        }
        int i5 = i3 + 63;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableLiveData;
        }
        throw null;
    }

    public LiveData<Resource<List<LocalIdType>>> getQueryDataDict() {
        int i = 2 % 2;
        int i2 = component4 + 17;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<List<LocalIdType>>> mutableLiveData = this.copydefault;
        int i5 = i3 + 107;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    @Deprecated
    public void registerWithKyc(String str, String str2, String str3, HashMap<String, Object> map) {
        int i = 2 % 2;
        registerWithKyc(new RegisterParams(str, str2, str3, map));
        int i2 = component4 + 105;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void registerWithKyc(RegisterParams registerParams) {
        int i = 2 % 2;
        this.component3.setValue(Resource.loading(null));
        ((RegisterKycModel) this.model).registerWithKyc(registerParams, new ApiCallback<LocalLoginInfo>() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = component3 + 85;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                component3(localLoginInfo);
                if (i4 != 0) {
                    int i5 = 51 / 0;
                }
                int i6 = copydefault + 97;
                component3 = i6 % 128;
                int i7 = i6 % 2;
            }

            public void component3(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = component3 + 87;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                BaseRegisterVerifyViewModel.component2(BaseRegisterVerifyViewModel.this).setValue(Resource.success(localLoginInfo));
                int i5 = copydefault + 103;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component3 + 119;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                BaseRegisterVerifyViewModel.component2(BaseRegisterVerifyViewModel.this).setValue(Resource.error(baseException, null));
                int i5 = component3 + 69;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = getRequestBeneficiariesState + 113;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    public void asyncRegisterWithKyc(RegisterParams registerParams) {
        int i = 2 % 2;
        this.component3.setValue(Resource.loading(null));
        ((RegisterKycModel) this.model).asyncRegisterWithKyc(registerParams, new ApiCallback<LocalLoginInfo>() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = component1 + 113;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                component1(localLoginInfo);
                if (i4 == 0) {
                    int i5 = 57 / 0;
                }
                int i6 = component1 + 7;
                copydefault = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 70 / 0;
                }
            }

            public void component1(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = copydefault + 29;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                BaseRegisterVerifyViewModel.component2(BaseRegisterVerifyViewModel.this).setValue(Resource.success(localLoginInfo));
                int i5 = copydefault + 99;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component1 + 3;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                BaseRegisterVerifyViewModel.component2(BaseRegisterVerifyViewModel.this).setValue(Resource.error(baseException, null));
                int i5 = component1 + 97;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = component4 + 107;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    public void queryDataDict() {
        int i = 2 % 2;
        this.copydefault.setValue(Resource.loading(null));
        ((RegisterKycModel) this.model).queryIdTypes(new ApiCallback<List<LocalIdType>>() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public void onSuccess(List<LocalIdType> list) {
                int i2 = 2 % 2;
                int i3 = component2 + 81;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                component1(list);
                if (i4 != 0) {
                    int i5 = 36 / 0;
                }
                int i6 = component2 + 25;
                component3 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 10 / 0;
                }
            }

            public void component1(List<LocalIdType> list) {
                int i2 = 2 % 2;
                int i3 = component3 + 39;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                BaseRegisterVerifyViewModel.component3(BaseRegisterVerifyViewModel.this).setValue(Resource.success(list));
                int i5 = component2 + 113;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component2 + 19;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    BaseRegisterVerifyViewModel.component3(BaseRegisterVerifyViewModel.this).setValue(Resource.error(baseException, null));
                } else {
                    BaseRegisterVerifyViewModel.component3(BaseRegisterVerifyViewModel.this).setValue(Resource.error(baseException, null));
                    throw null;
                }
            }
        });
        int i2 = component4 + 85;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    @Deprecated
    public void getKycInfo() {
        int i = 2 % 2;
        this.ShareDataUIState.setValue(Resource.loading(null));
        this.component1.setValue(Resource.loading(null));
        ((RegisterKycModel) this.model).getRegisterKyc(new ApiCallback<com.huawei.digitalpayment.customer.dynamics.resp.KycInfoResp>() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public void onSuccess(com.huawei.digitalpayment.customer.dynamics.resp.KycInfoResp kycInfoResp) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 39;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                component3(kycInfoResp);
                if (i4 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = ShareDataUIState + 13;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void component3(com.huawei.digitalpayment.customer.dynamics.resp.KycInfoResp kycInfoResp) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 111;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                BaseRegisterVerifyViewModel.component1(BaseRegisterVerifyViewModel.this).setValue(Resource.success((KycInfoResp) SecureGsonUtils.fromJson(GsonUtils.toJson(kycInfoResp), KycInfoResp.class)));
                BaseRegisterVerifyViewModel.ShareDataUIState(BaseRegisterVerifyViewModel.this).setValue(Resource.success(kycInfoResp));
                int i5 = ShareDataUIState + 19;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component2 + 99;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                BaseRegisterVerifyViewModel.component1(BaseRegisterVerifyViewModel.this).setValue(Resource.error(baseException, null));
                BaseRegisterVerifyViewModel.ShareDataUIState(BaseRegisterVerifyViewModel.this).setValue(Resource.error(baseException, null));
                int i5 = component2 + 69;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 51 / 0;
                }
            }
        });
        int i2 = component4 + 43;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    public void getRegisterDynamicKyc(RegisterKycParams registerKycParams) {
        int i = 2 % 2;
        this.component2.setValue(Resource.loading(null));
        ((RegisterKycModel) this.model).getRegisterDynamicKyc(registerKycParams, new ApiCallback<List<DynamicsElement>>() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(List<DynamicsElement> list) {
                int i2 = 2 % 2;
                int i3 = component3 + 15;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                component1(list);
                int i5 = component3 + 55;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void component1(List<DynamicsElement> list) {
                int i2 = 2 % 2;
                int i3 = component3 + 59;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                MutableLiveData mutableLiveDataCopydefault = BaseRegisterVerifyViewModel.copydefault(BaseRegisterVerifyViewModel.this);
                if (i4 == 0) {
                    mutableLiveDataCopydefault.setValue(Resource.success(list));
                } else {
                    mutableLiveDataCopydefault.setValue(Resource.success(list));
                    int i5 = 12 / 0;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component3 + 15;
                copydefault = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    BaseRegisterVerifyViewModel.copydefault(BaseRegisterVerifyViewModel.this).setValue(Resource.error(baseException, null));
                    int i4 = 87 / 0;
                } else {
                    BaseRegisterVerifyViewModel.copydefault(BaseRegisterVerifyViewModel.this).setValue(Resource.error(baseException, null));
                }
                int i5 = copydefault + 3;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        int i2 = component4 + 73;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    static MutableLiveData copydefault(BaseRegisterVerifyViewModel baseRegisterVerifyViewModel) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 85;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<List<DynamicsElement>>> mutableLiveData = baseRegisterVerifyViewModel.component2;
        int i5 = i3 + 123;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    static MutableLiveData component1(BaseRegisterVerifyViewModel baseRegisterVerifyViewModel) {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 57;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<KycInfoResp>> mutableLiveData = baseRegisterVerifyViewModel.ShareDataUIState;
        int i5 = i2 + 43;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableLiveData;
        }
        throw null;
    }

    static MutableLiveData ShareDataUIState(BaseRegisterVerifyViewModel baseRegisterVerifyViewModel) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 93;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<com.huawei.digitalpayment.customer.dynamics.resp.KycInfoResp>> mutableLiveData = baseRegisterVerifyViewModel.component1;
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        return mutableLiveData;
    }

    static MutableLiveData component3(BaseRegisterVerifyViewModel baseRegisterVerifyViewModel) {
        int i = 2 % 2;
        int i2 = component4 + 1;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<List<LocalIdType>>> mutableLiveData = baseRegisterVerifyViewModel.copydefault;
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
        return mutableLiveData;
    }

    static MutableLiveData component2(BaseRegisterVerifyViewModel baseRegisterVerifyViewModel) {
        int i = 2 % 2;
        int i2 = component4 + 75;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<LocalLoginInfo>> mutableLiveData = baseRegisterVerifyViewModel.component3;
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
        return mutableLiveData;
    }
}
