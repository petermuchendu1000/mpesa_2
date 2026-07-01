package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.basicUi.model.ChangeLanguageModel;
import com.huawei.digitalpayment.consumer.basicUi.request.ChangeLangRequest;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;

public class BaseChangeLanguageViewModel<Model extends ChangeLanguageModel> extends ViewModel {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private final MutableLiveData<Resource<BaseResp>> component1 = new MutableLiveData<>();
    protected final Model model;

    public BaseChangeLanguageViewModel(Model model) {
        this.model = model;
    }

    public LiveData<Resource<BaseResp>> getData() {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = this.component1;
        int i5 = i3 + 79;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public void changeLanguageWithoutAutoLogin(ChangeLangRequest changeLangRequest) {
        int i = 2 % 2;
        this.model.changeLanguageWithoutAutoLogin(changeLangRequest, new ApiCallback<BaseResp>() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component3 + 81;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                component2(baseResp);
                int i5 = component3 + 119;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component1 + 95;
                component3 = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    BaseChangeLanguageViewModel.copydefault(BaseChangeLanguageViewModel.this).setValue(Resource.error(baseException, null));
                } else {
                    BaseChangeLanguageViewModel.copydefault(BaseChangeLanguageViewModel.this).setValue(Resource.error(baseException, null));
                    obj.hashCode();
                    throw null;
                }
            }

            public void component2(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component1 + 111;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
                    BaseChangeLanguageViewModel.copydefault(BaseChangeLanguageViewModel.this).setValue(Resource.success(baseResp));
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                BaseChangeLanguageViewModel.copydefault(BaseChangeLanguageViewModel.this).setValue(Resource.success(baseResp));
                int i4 = component3 + 61;
                component1 = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i2 = copydefault + 75;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    public void changeLanguage(ChangeLangRequest changeLangRequest) {
        int i = 2 % 2;
        this.model.changeLanguage(changeLangRequest, new ApiCallback<BaseResp>() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 87;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                component1(baseResp);
                int i5 = component2 + 97;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            public void component1(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 123;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    BaseChangeLanguageViewModel.copydefault(BaseChangeLanguageViewModel.this).setValue(Resource.success(baseResp));
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                BaseChangeLanguageViewModel.copydefault(BaseChangeLanguageViewModel.this).setValue(Resource.success(baseResp));
                int i4 = component1 + 89;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 48 / 0;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component1 + 35;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                BaseChangeLanguageViewModel.copydefault(BaseChangeLanguageViewModel.this).setValue(Resource.error(baseException, null));
                int i5 = component2 + 103;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 26 / 0;
                }
            }
        });
        int i2 = copydefault + 9;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 64 / 0;
        }
    }

    public void changeLanguage(String str) {
        int i = 2 % 2;
        changeLanguage(new ChangeLangRequest(str, SPUtils.getInstance().getString("recent_login_phone_number")));
        int i2 = ShareDataUIState + 33;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    static MutableLiveData copydefault(BaseChangeLanguageViewModel baseChangeLanguageViewModel) {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = baseChangeLanguageViewModel.component1;
        int i5 = i3 + 49;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }
}
