package com.huawei.digitalpayment.consumer.profile.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.profile.model.IProfileModel;
import com.huawei.digitalpayment.consumer.profile.model.local.LocalCustomer;
import com.huawei.digitalpayment.consumer.profile.model.request.ChangeProfileParams;
import com.huawei.digitalpayment.customer.dynamics.model.DynamicsElement;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;
import java.util.List;
import java.util.Map;

public class BaseProfileViewModel<Model extends IProfileModel> extends ViewModel {
    private static int component2 = 1;
    private static int component3;
    protected final Model model;
    private final MutableLiveData<Resource<BaseResp>> ShareDataUIState = new MutableLiveData<>();
    private final MutableLiveData<Resource<LocalCustomer>> copydefault = new MutableLiveData<>();
    private final MutableLiveData<Resource<String>> component1 = new MutableLiveData<>();

    public LiveData<Resource<BaseResp>> getKycInfoData() {
        int i = 2 % 2;
        int i2 = component3 + 71;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MutableLiveData<Resource<BaseResp>> mutableLiveData = this.ShareDataUIState;
        int i4 = i3 + 49;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return mutableLiveData;
    }

    public LiveData<Resource<LocalCustomer>> getChangeProfile() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 73;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<LocalCustomer>> mutableLiveData = this.copydefault;
        int i5 = i2 + 121;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public LiveData<Resource<String>> getVerifyMsisdn() {
        int i = 2 % 2;
        int i2 = component2 + 7;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MutableLiveData<Resource<String>> mutableLiveData = this.component1;
        int i4 = i3 + 87;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return mutableLiveData;
    }

    public BaseProfileViewModel(Model model) {
        this.model = model;
    }

    public void getKycInfo() {
        int i = 2 % 2;
        this.ShareDataUIState.setValue(Resource.loading(null));
        this.model.getKycInfo(new ApiCallback<Map<String, List<DynamicsElement>>>() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(Map<String, List<DynamicsElement>> map) {
                int i2 = 2 % 2;
                int i3 = component3 + 57;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                component3(map);
                if (i4 != 0) {
                    int i5 = 2 / 0;
                }
            }

            public void component3(Map<String, List<DynamicsElement>> map) {
                int i2 = 2 % 2;
                int i3 = component2 + 113;
                component3 = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    BaseProfileViewModel.copydefault(BaseProfileViewModel.this).setValue(Resource.success(null));
                } else {
                    BaseProfileViewModel.copydefault(BaseProfileViewModel.this).setValue(Resource.success(null));
                    obj.hashCode();
                    throw null;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component3 + 11;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                Object obj = null;
                BaseProfileViewModel.copydefault(BaseProfileViewModel.this).setValue(Resource.error(baseException, null));
                int i5 = component2 + 93;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        int i2 = component3 + 87;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Deprecated
    public void changeProfile(String str) {
        int i = 2 % 2;
        changeProfile(new ChangeProfileParams(str));
        int i2 = component3 + 47;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    public void changeProfile(ChangeProfileParams changeProfileParams) {
        int i = 2 % 2;
        this.copydefault.setValue(Resource.loading(null));
        this.model.changeProfile(changeProfileParams, new ApiCallback<LocalCustomer>() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(LocalCustomer localCustomer) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 77;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                component3(localCustomer);
                int i5 = copydefault + 5;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 97 / 0;
                }
            }

            public void component3(LocalCustomer localCustomer) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 65;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                BaseProfileViewModel.component2(BaseProfileViewModel.this).setValue(Resource.success(localCustomer));
                int i5 = copydefault + 25;
                ShareDataUIState = i5 % 128;
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
                int i3 = copydefault + 93;
                ShareDataUIState = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    BaseProfileViewModel.component2(BaseProfileViewModel.this).setValue(Resource.error(baseException, null));
                } else {
                    BaseProfileViewModel.component2(BaseProfileViewModel.this).setValue(Resource.error(baseException, null));
                    obj.hashCode();
                    throw null;
                }
            }
        });
        int i2 = component2 + 67;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 60 / 0;
        }
    }

    public void verifyMsisdn(String str) {
        int i = 2 % 2;
        this.component1.setValue(Resource.loading(null));
        this.model.verifyMsisdn(str, new ApiCallback<String>() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(String str2) {
                int i2 = 2 % 2;
                int i3 = component3 + 55;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                component3(str2);
                int i5 = component2 + 37;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void component3(String str2) {
                int i2 = 2 % 2;
                int i3 = component2 + 119;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    BaseProfileViewModel.component3(BaseProfileViewModel.this).setValue(Resource.success(str2));
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                BaseProfileViewModel.component3(BaseProfileViewModel.this).setValue(Resource.success(str2));
                int i4 = component2 + 125;
                component3 = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component2 + 87;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
                    BaseProfileViewModel.component3(BaseProfileViewModel.this).setValue(Resource.error(baseException, null));
                } else {
                    BaseProfileViewModel.component3(BaseProfileViewModel.this).setValue(Resource.error(baseException, null));
                    throw null;
                }
            }
        });
        int i2 = component3 + 111;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    static MutableLiveData component2(BaseProfileViewModel baseProfileViewModel) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 95;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<LocalCustomer>> mutableLiveData = baseProfileViewModel.copydefault;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 23;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 50 / 0;
        }
        return mutableLiveData;
    }

    static MutableLiveData copydefault(BaseProfileViewModel baseProfileViewModel) {
        int i = 2 % 2;
        int i2 = component2 + 27;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = baseProfileViewModel.ShareDataUIState;
        int i5 = i3 + 41;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    static MutableLiveData component3(BaseProfileViewModel baseProfileViewModel) {
        int i = 2 % 2;
        int i2 = component3 + 11;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<String>> mutableLiveData = baseProfileViewModel.component1;
        if (i3 != 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
