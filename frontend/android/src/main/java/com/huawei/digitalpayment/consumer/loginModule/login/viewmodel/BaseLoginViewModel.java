package com.huawei.digitalpayment.consumer.loginModule.login.viewmodel;

import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;
import com.huawei.digitalpayment.consumer.loginModule.login.data.LoginModel;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model.LocalQueryLoginType;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.QueryLoginTypeParams;
import com.huawei.payment.mvvm.Resource;
import org.json.JSONObject;

public class BaseLoginViewModel<Model extends LoginModel> extends ViewModel {
    private static int component1 = 1;
    private static int component3;
    private final MutableLiveData<Resource<LocalQueryLoginType>> ShareDataUIState = new MutableLiveData<>();
    protected final Model loginModel;

    public BaseLoginViewModel(Model model) {
        this.loginModel = model;
    }

    public LiveData<Resource<LocalQueryLoginType>> getData() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 71;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<LocalQueryLoginType>> mutableLiveData = this.ShareDataUIState;
        int i5 = i2 + 117;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableLiveData;
        }
        throw null;
    }

    @Deprecated
    public void queryLoginType(String str) {
        int i = 2 % 2;
        queryLoginType(new QueryLoginTypeParams(str));
        int i2 = component3 + 115;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public void queryLoginType(QueryLoginTypeParams queryLoginTypeParams) {
        int i = 2 % 2;
        this.ShareDataUIState.setValue(Resource.loading(null));
        if (!SPUtils.getInstance().getBoolean(SPConstant.KEY_BASIC_CONFIG_SUCCESS)) {
            ShareDataUIState(queryLoginTypeParams);
            int i2 = component1 + 113;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 36 / 0;
                return;
            }
            return;
        }
        if (!TextUtils.isEmpty(SPUtils.getInstance().getString(SPConstant.TERMS_VERSION))) {
            this.loginModel.queryLoginType(queryLoginTypeParams, new ApiCallback<LocalQueryLoginType>() {
                private static int component2 = 1;
                private static int copydefault;

                @Override
                public void onSuccess(LocalQueryLoginType localQueryLoginType) {
                    int i4 = 2 % 2;
                    int i5 = copydefault + 13;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                    copydefault(localQueryLoginType);
                    if (i6 == 0) {
                        throw null;
                    }
                    int i7 = copydefault + 99;
                    component2 = i7 % 128;
                    int i8 = i7 % 2;
                }

                public void copydefault(LocalQueryLoginType localQueryLoginType) {
                    int i4 = 2 % 2;
                    int i5 = copydefault + 39;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                    BaseLoginViewModel.copydefault(BaseLoginViewModel.this).setValue(Resource.success(localQueryLoginType));
                    int i7 = component2 + 41;
                    copydefault = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 6 / 0;
                    }
                }

                @Override
                public void onError(BaseException baseException) {
                    int i4 = 2 % 2;
                    int i5 = copydefault + 3;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                    BaseLoginViewModel.copydefault(BaseLoginViewModel.this).setValue(Resource.error(baseException, null));
                    int i7 = component2 + 113;
                    copydefault = i7 % 128;
                    int i8 = i7 % 2;
                }
            });
            return;
        }
        int i4 = component3 + 9;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        component2(queryLoginTypeParams);
        int i6 = component3 + 117;
        component1 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    private void ShareDataUIState(final QueryLoginTypeParams queryLoginTypeParams) {
        int i = 2 % 2;
        AppConfigManager.INSTANCE.getBasicConfig(new ApiCallback<Object>() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(Object obj) {
                int i2 = 2 % 2;
                int i3 = component2 + 109;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                BaseLoginViewModel.this.queryLoginType(queryLoginTypeParams);
                int i5 = copydefault + 45;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = copydefault + 123;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                BaseLoginViewModel.copydefault(BaseLoginViewModel.this).setValue(Resource.error(baseException, null));
                int i5 = component2 + 91;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = component1 + 9;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private void component2(final QueryLoginTypeParams queryLoginTypeParams) {
        int i = 2 % 2;
        AppConfigManager.INSTANCE.getConfigVerify(new ApiCallback<JSONObject>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(JSONObject jSONObject) {
                int i2 = 2 % 2;
                int i3 = component1 + 71;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                component1(jSONObject);
                if (i4 == 0) {
                    throw null;
                }
            }

            public void component1(JSONObject jSONObject) {
                int i2 = 2 % 2;
                int i3 = component3 + 35;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                BaseLoginViewModel.this.queryLoginType(queryLoginTypeParams);
                int i5 = component3 + 63;
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
                int i3 = component1 + 57;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                BaseLoginViewModel.copydefault(BaseLoginViewModel.this).setValue(Resource.error(baseException, null));
                int i5 = component1 + 77;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i2 = component1 + 121;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public void cancelRequest() {
        int i = 2 % 2;
        int i2 = component1 + 29;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.loginModel.cancel();
        int i4 = component1 + 49;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
    }

    public void clearState() {
        int i = 2 % 2;
        int i2 = component3 + 77;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.ShareDataUIState.setValue(Resource.none());
        int i4 = component3 + 109;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    static MutableLiveData copydefault(BaseLoginViewModel baseLoginViewModel) {
        int i = 2 % 2;
        int i2 = component1 + 79;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<LocalQueryLoginType>> mutableLiveData = baseLoginViewModel.ShareDataUIState;
        int i5 = i3 + 31;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
