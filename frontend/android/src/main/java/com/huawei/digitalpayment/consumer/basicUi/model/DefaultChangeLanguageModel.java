package com.huawei.digitalpayment.consumer.basicUi.model;

import com.blankj.utilcode.util.Utils;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.language.LanguageUtils;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.basicUi.request.ChangeLangRequest;
import com.huawei.digitalpayment.consumer.service.ILoginModuleService;
import com.huawei.http.BaseResp;
import javax.inject.Inject;

public class DefaultChangeLanguageModel implements ChangeLanguageModel {
    private static int component2 = 0;
    private static int component3 = 1;

    @Inject
    public DefaultChangeLanguageModel() {
    }

    @Override
    public void changeLanguageWithoutAutoLogin(final ChangeLangRequest changeLangRequest, final ApiCallback<BaseResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<BaseResp> paymentRequest = new PaymentRequest<BaseResp>(this) {
            private static int component1 = 1;
            private static int component2;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component1 + 73;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    return "changeLanguage";
                }
                throw null;
            }
        };
        paymentRequest.addParams(changeLangRequest);
        sendRequest(paymentRequest, new ApiCallback<BaseResp>(this) {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 11;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                component2(baseResp);
                if (i4 == 0) {
                    int i5 = 7 / 0;
                }
                int i6 = component3 + 107;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
            }

            public void component2(BaseResp baseResp) {
                int i2 = 2 % 2;
                LanguageUtils.getInstance().setLanguage(Utils.getApp(), changeLangRequest.getNewLanguage());
                ApiCallback apiCallback2 = apiCallback;
                if (apiCallback2 != null) {
                    apiCallback2.onSuccess(baseResp);
                    int i3 = component3 + 123;
                    ShareDataUIState = i3 % 128;
                    int i4 = i3 % 2;
                }
                int i5 = ShareDataUIState + 103;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState;
                int i4 = i3 + 85;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                ApiCallback apiCallback2 = apiCallback;
                if (apiCallback2 != null) {
                    int i6 = i3 + 101;
                    component3 = i6 % 128;
                    int i7 = i6 % 2;
                    apiCallback2.onError(baseException);
                }
            }
        });
        int i2 = component3 + 55;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void changeLanguage(final ChangeLangRequest changeLangRequest, final ApiCallback<BaseResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<BaseResp> paymentRequest = new PaymentRequest<BaseResp>(this) {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component3;
                int i4 = i3 + 17;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 57;
                component2 = i6 % 128;
                if (i6 % 2 == 0) {
                    return "changeLanguage";
                }
                throw null;
            }
        };
        paymentRequest.addParams(changeLangRequest);
        sendRequest(paymentRequest, new ApiCallback<BaseResp>() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component1 + 55;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                component2(baseResp);
                int i5 = component2 + 75;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void component2(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component1 + 63;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    LanguageUtils.getInstance().setLanguage(Utils.getApp(), changeLangRequest.getNewLanguage());
                    DefaultChangeLanguageModel.copydefault(DefaultChangeLanguageModel.this, apiCallback);
                    int i4 = 39 / 0;
                } else {
                    LanguageUtils.getInstance().setLanguage(Utils.getApp(), changeLangRequest.getNewLanguage());
                    DefaultChangeLanguageModel.copydefault(DefaultChangeLanguageModel.this, apiCallback);
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component2 + 67;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                ApiCallback apiCallback2 = apiCallback;
                if (apiCallback2 != null) {
                    apiCallback2.onError(baseException);
                    int i5 = component1 + 83;
                    component2 = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 5 % 3;
                    }
                }
            }
        });
        int i2 = component2 + 91;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    private void ShareDataUIState(final ApiCallback<BaseResp> apiCallback) {
        int i = 2 % 2;
        ((ILoginModuleService) RouteUtils.getService(ILoginModuleService.class)).autoLogin(new ApiCallback<BaseResp>(this) {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component3 + 41;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                component1(baseResp);
                if (i4 != 0) {
                    throw null;
                }
            }

            public void component1(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component3 + 59;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                super.onSuccess(baseResp);
                ApiCallback apiCallback2 = apiCallback;
                if (apiCallback2 != null) {
                    apiCallback2.onSuccess(new BaseResp());
                }
                int i5 = component2 + 33;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 16 / 0;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                super.onError(baseException);
                ApiCallback apiCallback2 = apiCallback;
                if (apiCallback2 != null) {
                    int i3 = component3 + 95;
                    component2 = i3 % 128;
                    int i4 = i3 % 2;
                    apiCallback2.onError(baseException);
                    if (i4 != 0) {
                        int i5 = 75 / 0;
                    }
                }
                int i6 = component3 + 85;
                component2 = i6 % 128;
                int i7 = i6 % 2;
            }
        });
        int i2 = component2 + 101;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    static void copydefault(DefaultChangeLanguageModel defaultChangeLanguageModel, ApiCallback apiCallback) {
        int i = 2 % 2;
        int i2 = component3 + 69;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        defaultChangeLanguageModel.ShareDataUIState(apiCallback);
        int i4 = component3 + 103;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }
}
