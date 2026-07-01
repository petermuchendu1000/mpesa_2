package com.huawei.digitalpayment.consumer.profile.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.profile.model.IChangeMsisdnModel;
import com.huawei.digitalpayment.consumer.profile.model.local.LocalCustomer;
import com.huawei.digitalpayment.consumer.profile.model.request.ChangeMsisdnParams;
import com.huawei.digitalpayment.consumer.profile.model.request.SendChangeMsisdnSmsParams;
import com.huawei.digitalpayment.consumer.profile.model.request.VerifyChangeMsisdnSmsParams;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;

public class BaseChangeMsisdnViewModel<Model extends IChangeMsisdnModel> extends ViewModel {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    protected final Model model;
    private final MutableLiveData<Resource<BaseResp>> copydefault = new MutableLiveData<>();
    private final MutableLiveData<Resource<BaseResp>> component1 = new MutableLiveData<>();
    private final MutableLiveData<Resource<LocalCustomer>> component2 = new MutableLiveData<>();

    public LiveData<Resource<BaseResp>> getSmsData() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 21;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = this.copydefault;
        int i5 = i2 + 49;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 84 / 0;
        }
        return mutableLiveData;
    }

    public LiveData<Resource<BaseResp>> getVerifySms() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public LiveData<Resource<LocalCustomer>> getChangeMsisdn() {
        MutableLiveData<Resource<LocalCustomer>> mutableLiveData;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 97;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            mutableLiveData = this.component2;
            int i4 = 33 / 0;
        } else {
            mutableLiveData = this.component2;
        }
        int i5 = i2 + 81;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 97 / 0;
        }
        return mutableLiveData;
    }

    public BaseChangeMsisdnViewModel(Model model) {
        this.model = model;
    }

    @Deprecated
    public void sendChangeMsisdnSms(String str) {
        int i = 2 % 2;
        sendChangeMsisdnSms(new SendChangeMsisdnSmsParams(str));
        int i2 = ShareDataUIState + 81;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    public void sendChangeMsisdnSms(SendChangeMsisdnSmsParams sendChangeMsisdnSmsParams) {
        int i = 2 % 2;
        Object obj = null;
        this.copydefault.setValue(Resource.loading(null));
        this.model.sendChangeMsisdnSms(sendChangeMsisdnSmsParams, new ApiCallback<BaseResp>() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = copydefault + 109;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                component2(baseResp);
                if (i4 != 0) {
                    int i5 = 37 / 0;
                }
                int i6 = copydefault + 3;
                component1 = i6 % 128;
                int i7 = i6 % 2;
            }

            public void component2(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = copydefault + 29;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                BaseChangeMsisdnViewModel.component1(BaseChangeMsisdnViewModel.this).setValue(Resource.success(baseResp));
                int i5 = component1 + 77;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 92 / 0;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = copydefault + 93;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Object obj2 = null;
                BaseChangeMsisdnViewModel.component1(BaseChangeMsisdnViewModel.this).setValue(Resource.error(baseException, null));
                int i5 = component1 + 101;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                obj2.hashCode();
                throw null;
            }
        });
        int i2 = component3 + 65;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public void verifyChangeMsisdnSms(String str, String str2) {
        int i = 2 % 2;
        verifyChangeMsisdnSms(new VerifyChangeMsisdnSmsParams(str, str2));
        int i2 = component3 + 15;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    public void verifyChangeMsisdnSms(VerifyChangeMsisdnSmsParams verifyChangeMsisdnSmsParams) {
        int i = 2 % 2;
        this.component1.setValue(Resource.loading(null));
        this.model.verifyChangeMsisdnSms(verifyChangeMsisdnSmsParams, new ApiCallback<BaseResp>() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 5;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                component1(baseResp);
                int i5 = component2 + 103;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void component1(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 53;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                BaseChangeMsisdnViewModel.ShareDataUIState(BaseChangeMsisdnViewModel.this).setValue(Resource.success(baseResp));
                int i5 = component3 + 65;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component3 + 113;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                BaseChangeMsisdnViewModel.ShareDataUIState(BaseChangeMsisdnViewModel.this).setValue(Resource.error(baseException, null));
                int i5 = component3 + 101;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 96 / 0;
                }
            }
        });
        int i2 = component3 + 115;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Deprecated
    public void identityVerify(String str) {
        int i = 2 % 2;
        changeMsisdn(new ChangeMsisdnParams(SPUtils.getInstance().getString("recent_login_phone_number"), str));
        int i2 = component3 + 91;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 25 / 0;
        }
    }

    public void changeMsisdn(ChangeMsisdnParams changeMsisdnParams) {
        int i = 2 % 2;
        Object obj = null;
        this.component2.setValue(Resource.loading(null));
        this.model.changeMsisdn(changeMsisdnParams, new ApiCallback<LocalCustomer>() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(LocalCustomer localCustomer) {
                int i2 = 2 % 2;
                int i3 = copydefault + 75;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                copydefault(localCustomer);
                if (i4 != 0) {
                    int i5 = 1 / 0;
                }
            }

            public void copydefault(LocalCustomer localCustomer) {
                int i2 = 2 % 2;
                int i3 = copydefault + 43;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                MutableLiveData mutableLiveDataComponent2 = BaseChangeMsisdnViewModel.component2(BaseChangeMsisdnViewModel.this);
                if (i4 == 0) {
                    mutableLiveDataComponent2.setValue(Resource.success(localCustomer));
                } else {
                    mutableLiveDataComponent2.setValue(Resource.success(localCustomer));
                    int i5 = 96 / 0;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component2 + 27;
                copydefault = i3 % 128;
                Object obj2 = null;
                if (i3 % 2 != 0) {
                    BaseChangeMsisdnViewModel.component2(BaseChangeMsisdnViewModel.this).setValue(Resource.error(baseException, null));
                } else {
                    BaseChangeMsisdnViewModel.component2(BaseChangeMsisdnViewModel.this).setValue(Resource.error(baseException, null));
                    obj2.hashCode();
                    throw null;
                }
            }
        });
        int i2 = ShareDataUIState + 3;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static MutableLiveData component2(BaseChangeMsisdnViewModel baseChangeMsisdnViewModel) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 113;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<LocalCustomer>> mutableLiveData = baseChangeMsisdnViewModel.component2;
        int i5 = i2 + 81;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableLiveData;
        }
        throw null;
    }

    static MutableLiveData component1(BaseChangeMsisdnViewModel baseChangeMsisdnViewModel) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = baseChangeMsisdnViewModel.copydefault;
        int i5 = i3 + 13;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    static MutableLiveData ShareDataUIState(BaseChangeMsisdnViewModel baseChangeMsisdnViewModel) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 21;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = baseChangeMsisdnViewModel.component1;
        int i5 = i2 + 75;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }
}
