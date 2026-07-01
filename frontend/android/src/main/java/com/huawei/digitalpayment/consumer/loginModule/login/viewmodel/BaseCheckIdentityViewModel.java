package com.huawei.digitalpayment.consumer.loginModule.login.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.loginModule.login.data.NewDeviceModel;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.IdentityVerifyParams;
import com.huawei.digitalpayment.consumer.loginModule.register.model.LocalIdType;
import com.huawei.payment.mvvm.Resource;
import java.util.List;

public class BaseCheckIdentityViewModel<Model extends NewDeviceModel> extends ViewModel {
    private static int component2 = 0;
    private static int component3 = 1;
    private final MutableLiveData<Resource<LocalLoginInfo>> ShareDataUIState = new MutableLiveData<>();
    private final MutableLiveData<Resource<List<LocalIdType>>> copydefault = new MutableLiveData<>();
    protected final Model model;

    public BaseCheckIdentityViewModel(Model model) {
        this.model = model;
    }

    public LiveData<Resource<List<LocalIdType>>> getDataDict() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 87;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<List<LocalIdType>>> mutableLiveData = this.copydefault;
        int i5 = i2 + 105;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public LiveData<Resource<LocalLoginInfo>> getData() {
        int i = 2 % 2;
        int i2 = component2 + 115;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public void checkIdentity(IdentityVerifyParams identityVerifyParams) {
        int i = 2 % 2;
        this.ShareDataUIState.setValue(Resource.loading(null));
        this.model.identityVerify(identityVerifyParams, new ApiCallback<LocalLoginInfo>() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public void onSuccess(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 105;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                copydefault(localLoginInfo);
                int i5 = ShareDataUIState + 45;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void copydefault(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 113;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    BaseCheckIdentityViewModel.component1(BaseCheckIdentityViewModel.this).setValue(Resource.success(localLoginInfo));
                    int i4 = 18 / 0;
                } else {
                    BaseCheckIdentityViewModel.component1(BaseCheckIdentityViewModel.this).setValue(Resource.success(localLoginInfo));
                }
                int i5 = component2 + 37;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 81;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    BaseCheckIdentityViewModel.component1(BaseCheckIdentityViewModel.this).setValue(Resource.error(baseException, null));
                } else {
                    BaseCheckIdentityViewModel.component1(BaseCheckIdentityViewModel.this).setValue(Resource.error(baseException, null));
                    throw null;
                }
            }
        });
        int i2 = component3 + 85;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    public void identityVerifyAndLogin(IdentityVerifyParams identityVerifyParams) {
        int i = 2 % 2;
        this.ShareDataUIState.setValue(Resource.loading(null));
        this.model.identityVerifyAndLogin(identityVerifyParams, new ApiCallback<LocalLoginInfo>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = component1 + 85;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                component2(localLoginInfo);
                int i5 = component3 + 105;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 47 / 0;
                }
            }

            public void component2(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = component1 + 11;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                BaseCheckIdentityViewModel.component1(BaseCheckIdentityViewModel.this).setValue(Resource.success(localLoginInfo));
                if (i4 == 0) {
                    int i5 = 21 / 0;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component1 + 99;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                BaseCheckIdentityViewModel.component1(BaseCheckIdentityViewModel.this).setValue(Resource.error(baseException, null));
                int i5 = component3 + 93;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 52 / 0;
                }
            }
        });
        int i2 = component2 + 23;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    public void queryDataDict() {
        int i = 2 % 2;
        this.copydefault.setValue(Resource.loading(null));
        this.model.queryIdTypes(new ApiCallback<List<LocalIdType>>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(List<LocalIdType> list) {
                int i2 = 2 % 2;
                int i3 = component3 + 97;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                component1(list);
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void component1(List<LocalIdType> list) {
                int i2 = 2 % 2;
                int i3 = component1 + 5;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                BaseCheckIdentityViewModel.copydefault(BaseCheckIdentityViewModel.this).setValue(Resource.success(list));
                int i5 = component3 + 65;
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
                component3 = i3 % 128;
                int i4 = i3 % 2;
                BaseCheckIdentityViewModel.copydefault(BaseCheckIdentityViewModel.this).setValue(Resource.error(baseException, null));
                int i5 = component1 + 77;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = component2 + 51;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 96 / 0;
        }
    }

    @Deprecated
    public void checkIdentity(String str, String str2) {
        int i = 2 % 2;
        checkIdentity(new IdentityVerifyParams(str, str2));
        int i2 = component3 + 103;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static MutableLiveData component1(BaseCheckIdentityViewModel baseCheckIdentityViewModel) {
        int i = 2 % 2;
        int i2 = component2 + 69;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<LocalLoginInfo>> mutableLiveData = baseCheckIdentityViewModel.ShareDataUIState;
        if (i3 == 0) {
            int i4 = 77 / 0;
        }
        return mutableLiveData;
    }

    static MutableLiveData copydefault(BaseCheckIdentityViewModel baseCheckIdentityViewModel) {
        int i = 2 % 2;
        int i2 = component3 + 75;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<List<LocalIdType>>> mutableLiveData = baseCheckIdentityViewModel.copydefault;
        if (i3 != 0) {
            int i4 = 61 / 0;
        }
        return mutableLiveData;
    }
}
