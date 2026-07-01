package com.huawei.digitalpayment.home.data;

import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.L;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.consumer.baselib.http.BaseResp;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.util.update.UpdateBean;
import com.huawei.digitalpayment.home.constants.HomeConstants;
import com.huawei.digitalpayment.home.data.local.LocalBalance;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import com.huawei.digitalpayment.home.data.source.remote.ChangeSkinResp;
import com.huawei.digitalpayment.home.data.source.remote.QuerySkinResp;
import com.huawei.digitalpayment.home.data.source.remote.RemoteBalance;
import com.huawei.digitalpayment.home.data.source.remote.RemoteBanner;
import com.huawei.digitalpayment.home.data.source.remote.repository.LogoutRepository;
import com.huawei.digitalpayment.home.request.CustomerLocationParams;
import com.huawei.digitalpayment.home.request.HomeThemeDetailParams;
import com.huawei.digitalpayment.home.request.HomeThemeDetailRequest;
import com.huawei.digitalpayment.home.request.QueryBannerParams;
import com.huawei.digitalpayment.home.request.QuerySkinParams;
import com.huawei.digitalpayment.home.theme.HomeThemeManager;
import com.huawei.digitalpayment.home.theme.data.local.LocalHomeThemeData;
import com.huawei.digitalpayment.home.util.ModelMappingUtils;
import com.huawei.http.BaseRequestParams;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.UByte$$ExternalSyntheticBackport0;

public class DefaultHomeModel implements HomeModel {
    private static int ShareDataUIState = 1;
    private static int component3;

    @Inject
    public DefaultHomeModel() {
    }

    @Override
    public void refreshMenu(final ApiCallback<BaseResp> apiCallback) {
        int i = 2 % 2;
        refreshMenu2(new ApiCallback<com.huawei.http.BaseResp>(this) {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(com.huawei.http.BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component1 + 93;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                ShareDataUIState(baseResp);
                int i5 = copydefault + 51;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 23 / 0;
                }
            }

            public void ShareDataUIState(com.huawei.http.BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = copydefault + 1;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    super.onSuccess(baseResp);
                    ApiCallback apiCallback2 = apiCallback;
                    if (apiCallback2 != null) {
                        apiCallback2.onSuccess(BaseResp.getBaseResp(baseResp));
                    }
                    int i4 = component1 + 107;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                    return;
                }
                super.onSuccess(baseResp);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component1 + 13;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    super.onError(baseException);
                    ApiCallback apiCallback2 = apiCallback;
                    if (apiCallback2 != null) {
                        int i4 = component1 + 1;
                        copydefault = i4 % 128;
                        int i5 = i4 % 2;
                        apiCallback2.onError(baseException);
                        int i6 = component1 + 69;
                        copydefault = i6 % 128;
                        int i7 = i6 % 2;
                        return;
                    }
                    return;
                }
                super.onError(baseException);
                throw null;
            }
        });
        int i2 = ShareDataUIState + 19;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 91 / 0;
        }
    }

    @Override
    public void refreshMenu2(ApiCallback<com.huawei.http.BaseResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<com.huawei.http.BaseResp> paymentRequest = new PaymentRequest<com.huawei.http.BaseResp>(this) {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public Object convert(JsonObject jsonObject) {
                int i2 = 2 % 2;
                int i3 = component2 + 41;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    component3(jsonObject);
                    throw null;
                }
                com.huawei.http.BaseResp baseRespComponent3 = component3(jsonObject);
                int i4 = component2 + 83;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return baseRespComponent3;
            }

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component2;
                int i4 = i3 + 73;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 67;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                return "basicConfig";
            }

            protected com.huawei.http.BaseResp component3(JsonObject jsonObject) {
                int i2 = 2 % 2;
                HomeConfigManager.INSTANCE.saveHomeConfig(jsonObject.getAsJsonObject("jsonContent").getAsJsonObject(HomeConstants.HOME_CONFIG).toString());
                com.huawei.http.BaseResp baseResp = new com.huawei.http.BaseResp();
                int i3 = ShareDataUIState + 69;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    return baseResp;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        paymentRequest.addParams("configTypes", UByte$$ExternalSyntheticBackport0.m(new Object[]{HomeConstants.HOME_CONFIG}));
        sendRequest(paymentRequest, apiCallback);
        int i2 = ShareDataUIState + 11;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void refreshBalance(BaseRequestParams baseRequestParams, ApiCallback<LocalBalance> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<LocalBalance> paymentRequest = new PaymentRequest<LocalBalance>(this) {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public Object convert(JsonObject jsonObject) {
                int i2 = 2 % 2;
                int i3 = component1 + 67;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                LocalBalance localBalanceComponent1 = component1(jsonObject);
                int i5 = ShareDataUIState + 5;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return localBalanceComponent1;
            }

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component1 + 117;
                int i4 = i3 % 128;
                ShareDataUIState = i4;
                if (i3 % 2 != 0) {
                    int i5 = 18 / 0;
                }
                int i6 = i4 + 119;
                component1 = i6 % 128;
                if (i6 % 2 != 0) {
                    return "queryBalance";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            protected LocalBalance component1(JsonObject jsonObject) {
                int i2 = 2 % 2;
                int i3 = component1 + 69;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                RemoteBalance remoteBalance = (RemoteBalance) SecureGsonUtils.fromJson(jsonObject.toString(), RemoteBalance.class);
                if (remoteBalance != null) {
                    LocalBalance localBalance = new LocalBalance(remoteBalance.getAmount(), remoteBalance.getUnitType(), remoteBalance.getAmountDisplay(), remoteBalance.getCurrency());
                    localBalance.copyExtension(remoteBalance);
                    return localBalance;
                }
                LocalBalance localBalance2 = new LocalBalance();
                int i4 = ShareDataUIState + 99;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return localBalance2;
            }
        };
        paymentRequest.addParams(baseRequestParams);
        sendRequest(paymentRequest, apiCallback);
        int i2 = component3 + 29;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 46 / 0;
        }
    }

    @Override
    public void refreshBanner(QueryBannerParams queryBannerParams, ApiCallback<List<LocalHomeFunction>> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<List<LocalHomeFunction>> paymentRequest = new PaymentRequest<List<LocalHomeFunction>>(this) {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public Object convert(JsonObject jsonObject) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 21;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    return component3(jsonObject);
                }
                component3(jsonObject);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component3 + 51;
                int i4 = i3 % 128;
                ShareDataUIState = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 1;
                component3 = i6 % 128;
                if (i6 % 2 == 0) {
                    return "queryBanners";
                }
                throw null;
            }

            protected List<LocalHomeFunction> component3(JsonObject jsonObject) {
                int i2 = 2 % 2;
                List arrayList = (List) SecureGsonUtils.fromJson(jsonObject.getAsJsonArray("configs").toString(), new TypeToken<List<RemoteBanner>>(this) {
                }.getType());
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List<LocalHomeFunction> listBannerToLocalFunctions = ModelMappingUtils.bannerToLocalFunctions(arrayList);
                int i3 = component3 + 71;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                return listBannerToLocalFunctions;
            }
        };
        paymentRequest.addParams(queryBannerParams);
        sendRequest(paymentRequest, apiCallback);
        int i2 = ShareDataUIState + 57;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void versionVerify(ApiCallback<UpdateBean> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<UpdateBean> paymentRequest = new PaymentRequest<UpdateBean>(this) {
            private static int component1 = 1;
            private static int component2;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component2 + 67;
                int i4 = i3 % 128;
                component1 = i4;
                if (i3 % 2 == 0) {
                    int i5 = 80 / 0;
                }
                int i6 = i4 + 113;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                return "versionVerify";
            }
        };
        paymentRequest.addParams("initiatorMsisdn", SPUtils.getInstance().getString("recent_login_phone_number"));
        sendRequest(paymentRequest, apiCallback);
        int i2 = component3 + 25;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void logout(BaseRequestParams baseRequestParams, ApiCallback<com.huawei.http.BaseResp> apiCallback) {
        int i = 2 % 2;
        sendRequest(new LogoutRepository(), apiCallback);
        int i2 = ShareDataUIState + 63;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void customerLocation(CustomerLocationParams customerLocationParams, ApiCallback<com.huawei.http.BaseResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<com.huawei.http.BaseResp> paymentRequest = new PaymentRequest<com.huawei.http.BaseResp>(this) {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component1;
                int i4 = i3 + 83;
                copydefault = i4 % 128;
                Object obj = null;
                if (i4 % 2 != 0) {
                    throw null;
                }
                int i5 = i3 + 125;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    return "identityLocation";
                }
                obj.hashCode();
                throw null;
            }
        };
        paymentRequest.addParams(customerLocationParams);
        sendRequest(paymentRequest, apiCallback);
        int i2 = ShareDataUIState + 73;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void userSwitchableList(QuerySkinParams querySkinParams, ApiCallback<QuerySkinResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<QuerySkinResp> paymentRequest = new PaymentRequest<QuerySkinResp>(this) {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault;
                int i4 = i3 + 119;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = i3 + 125;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 21 / 0;
                }
                return "theme/userSwitchablelist";
            }
        };
        paymentRequest.addParams(querySkinParams);
        sendRequest(paymentRequest, apiCallback);
        int i2 = ShareDataUIState + 111;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 75 / 0;
        }
    }

    @Override
    public void switchTheme(final HomeThemeDetailParams homeThemeDetailParams, final ApiCallback<ChangeSkinResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<ChangeSkinResp> paymentRequest = new PaymentRequest<ChangeSkinResp>(this) {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault + 29;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
                    return "theme/switchTheme";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        paymentRequest.addParams("themeId", homeThemeDetailParams.getThemeId());
        paymentRequest.addParams("themeVersion", String.valueOf(homeThemeDetailParams.getThemeVersion()));
        sendRequest(paymentRequest, new ApiCallback<ChangeSkinResp>() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(ChangeSkinResp changeSkinResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 27;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                component3(changeSkinResp);
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void component3(ChangeSkinResp changeSkinResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 5;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                DefaultHomeModel.component3(DefaultHomeModel.this, homeThemeDetailParams, apiCallback, changeSkinResp);
                int i5 = component2 + 41;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component2 + 81;
                int i4 = i3 % 128;
                copydefault = i4;
                int i5 = i3 % 2;
                ApiCallback apiCallback2 = apiCallback;
                if (apiCallback2 != null) {
                    int i6 = i4 + 89;
                    component2 = i6 % 128;
                    int i7 = i6 % 2;
                    apiCallback2.onError(baseException);
                    if (i7 != 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        });
        int i2 = ShareDataUIState + 57;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    private void component1(final HomeThemeDetailParams homeThemeDetailParams, final ApiCallback<ChangeSkinResp> apiCallback, final ChangeSkinResp changeSkinResp) {
        int i = 2 % 2;
        new HomeThemeDetailRequest(homeThemeDetailParams).sendRequest(new ApiCallback<LocalHomeThemeData>(this) {
            private static int component1 = 1;
            private static int component3;

            @Override
            public void onSuccess(LocalHomeThemeData localHomeThemeData) {
                int i2 = 2 % 2;
                int i3 = component1 + 75;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                copydefault(localHomeThemeData);
                if (i4 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = component1 + 9;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void copydefault(LocalHomeThemeData localHomeThemeData) {
                int i2 = 2 % 2;
                L.d("主题包下载成功->" + System.currentTimeMillis());
                HomeThemeManager.INSTANCE.saveThemeInfo(homeThemeDetailParams);
                HomeThemeManager.INSTANCE.updateTheme(localHomeThemeData);
                ApiCallback apiCallback2 = apiCallback;
                if (apiCallback2 != null) {
                    apiCallback2.onSuccess(changeSkinResp);
                    int i3 = component3 + 101;
                    component1 = i3 % 128;
                    int i4 = i3 % 2;
                }
                int i5 = component1 + 115;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                ApiCallback apiCallback2 = apiCallback;
                if (apiCallback2 != null) {
                    int i3 = component3 + 109;
                    component1 = i3 % 128;
                    int i4 = i3 % 2;
                    apiCallback2.onError(baseException);
                    int i5 = component3 + 117;
                    component1 = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
        });
        int i2 = ShareDataUIState + 51;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    static void component3(DefaultHomeModel defaultHomeModel, HomeThemeDetailParams homeThemeDetailParams, ApiCallback apiCallback, ChangeSkinResp changeSkinResp) {
        int i = 2 % 2;
        int i2 = component3 + 21;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        defaultHomeModel.component1(homeThemeDetailParams, apiCallback, changeSkinResp);
        int i4 = ShareDataUIState + 73;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }
}
