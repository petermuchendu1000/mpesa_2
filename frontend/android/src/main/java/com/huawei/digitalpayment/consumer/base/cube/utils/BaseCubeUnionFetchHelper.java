package com.huawei.digitalpayment.consumer.base.cube.utils;

import android.text.TextUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.base.cube.repository.CubeAuthRepository;
import com.huawei.digitalpayment.consumer.base.cube.repository.CubeLogOutRepository;
import com.huawei.digitalpayment.consumer.base.cube.repository.H5GetAccessTokenRepository;
import com.huawei.digitalpayment.consumer.base.cube.repository.LoginCubeRepository;
import com.huawei.digitalpayment.consumer.base.cube.resp.CubeAuthResp;
import com.huawei.digitalpayment.consumer.base.cube.resp.CubeBaseResp;
import com.huawei.digitalpayment.consumer.base.cube.resp.CubeLoginResult;
import com.huawei.digitalpayment.consumer.base.cube.resp.GetH5AccessTokenResp;
import com.huawei.digitalpayment.consumer.base.cube.resp.LoginCubeResp;
import com.iap.ac.android.acs.operation.log.LogConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJL\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJD\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ<\u0010\u0014\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000e¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/cube/utils/BaseCubeUnionFetchHelper;", "", "<init>", "()V", "getCubeAuth", "", "baseUrl", "", LogConstants.Oauth.AUTHURL, "loginUrl", "tenantId", "appId", "signKey", "callback", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/digitalpayment/consumer/base/cube/resp/LoginCubeResp;", "getAccessTokenAndLogin", "authCode", "loginCube", "accessToken", "sendLogOut", "token", "url", "Lcom/huawei/digitalpayment/consumer/base/cube/resp/CubeBaseResp;", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BaseCubeUnionFetchHelper {
    private static int component3 = 0;
    private static int copydefault = 1;

    public final void getCubeAuth(final String baseUrl, final String authUrl, final String loginUrl, final String tenantId, final String appId, final String signKey, final ApiCallback<LoginCubeResp> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(baseUrl, "");
        Intrinsics.checkNotNullParameter(authUrl, "");
        Intrinsics.checkNotNullParameter(loginUrl, "");
        Intrinsics.checkNotNullParameter(tenantId, "");
        Intrinsics.checkNotNullParameter(appId, "");
        Intrinsics.checkNotNullParameter(signKey, "");
        Intrinsics.checkNotNullParameter(callback, "");
        H5GetAccessTokenRepository h5GetAccessTokenRepository = new H5GetAccessTokenRepository();
        h5GetAccessTokenRepository.addParams("appId", appId);
        h5GetAccessTokenRepository.sendRequest(new ApiCallback<GetH5AccessTokenResp>() {
            private static int equals = 0;
            private static int getRequestBeneficiariesState = 1;

            @Override
            public void onSuccess(GetH5AccessTokenResp getH5AccessTokenResp) {
                int i2 = 2 % 2;
                int i3 = getRequestBeneficiariesState + 113;
                equals = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(getH5AccessTokenResp);
                int i5 = equals + 99;
                getRequestBeneficiariesState = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 31 / 0;
                }
            }

            public void onSuccess2(GetH5AccessTokenResp value) {
                int i2 = 2 % 2;
                int i3 = equals + 33;
                getRequestBeneficiariesState = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(value, "");
                super.onSuccess(value);
                String accessToken = value.getAccessToken();
                if (accessToken != null) {
                    int i5 = equals + 85;
                    getRequestBeneficiariesState = i5 % 128;
                    int i6 = i5 % 2;
                    BaseCubeUnionFetchHelper.this.getAccessTokenAndLogin(baseUrl, loginUrl, authUrl, accessToken, appId, signKey, tenantId, callback);
                }
                int i7 = getRequestBeneficiariesState + 47;
                equals = i7 % 128;
                int i8 = i7 % 2;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = getRequestBeneficiariesState + 71;
                equals = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                callback.onError(e);
                int i5 = equals + 43;
                getRequestBeneficiariesState = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = copydefault + 15;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 91 / 0;
        }
    }

    public final void getAccessTokenAndLogin(final String baseUrl, final String loginUrl, String authUrl, final String authCode, final String appId, final String signKey, String tenantId, final ApiCallback<LoginCubeResp> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(baseUrl, "");
        Intrinsics.checkNotNullParameter(loginUrl, "");
        Intrinsics.checkNotNullParameter(authUrl, "");
        Intrinsics.checkNotNullParameter(authCode, "");
        Intrinsics.checkNotNullParameter(appId, "");
        Intrinsics.checkNotNullParameter(signKey, "");
        Intrinsics.checkNotNullParameter(tenantId, "");
        Intrinsics.checkNotNullParameter(callback, "");
        CubeAuthRepository cubeAuthRepository = new CubeAuthRepository(baseUrl + authUrl);
        cubeAuthRepository.addHeader("tenant-id", tenantId);
        cubeAuthRepository.addHeader("cubeSingKey", signKey);
        cubeAuthRepository.sendRequest(new ApiCallback<CubeAuthResp>() {
            private static int copy = 1;
            private static int getRequestBeneficiariesState;

            @Override
            public void onSuccess(CubeAuthResp cubeAuthResp) {
                int i2 = 2 % 2;
                int i3 = copy + 1;
                getRequestBeneficiariesState = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(cubeAuthResp);
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onSuccess2(CubeAuthResp value) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(value, "");
                super.onSuccess(value);
                if (Intrinsics.areEqual(value.getResCode(), "0")) {
                    int i3 = copy + 71;
                    getRequestBeneficiariesState = i3 % 128;
                    int i4 = i3 % 2;
                    if (value.getResult() != null && !TextUtils.isEmpty(value.getResult().getAccessToken())) {
                        int i5 = getRequestBeneficiariesState + 43;
                        copy = i5 % 128;
                        int i6 = i5 % 2;
                        BaseCubeUnionFetchHelper baseCubeUnionFetchHelper = BaseCubeUnionFetchHelper.this;
                        String str = baseUrl;
                        String str2 = loginUrl;
                        String accessToken = value.getResult().getAccessToken();
                        Intrinsics.checkNotNullExpressionValue(accessToken, "");
                        baseCubeUnionFetchHelper.loginCube(str, str2, accessToken, authCode, appId, signKey, callback);
                        return;
                    }
                }
                callback.onError(new BaseException(value.getResMsg()));
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = getRequestBeneficiariesState + 55;
                copy = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    callback.onError(e);
                } else {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    callback.onError(e);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        });
        int i2 = component3 + 21;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final void loginCube(String baseUrl, String loginUrl, String accessToken, String authCode, String appId, String signKey, final ApiCallback<LoginCubeResp> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(baseUrl, "");
        Intrinsics.checkNotNullParameter(loginUrl, "");
        Intrinsics.checkNotNullParameter(accessToken, "");
        Intrinsics.checkNotNullParameter(authCode, "");
        Intrinsics.checkNotNullParameter(appId, "");
        Intrinsics.checkNotNullParameter(signKey, "");
        Intrinsics.checkNotNullParameter(callback, "");
        LoginCubeRepository loginCubeRepository = new LoginCubeRepository(baseUrl + loginUrl);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("authCode", authCode);
        loginCubeRepository.addParams((Map<String, Object>) linkedHashMap);
        loginCubeRepository.addHeader("access-token", accessToken);
        loginCubeRepository.addHeader("cubeSingKey", signKey);
        loginCubeRepository.sendRequest(new ApiCallback<LoginCubeResp>() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(LoginCubeResp loginCubeResp) {
                int i2 = 2 % 2;
                int i3 = copydefault + 115;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(loginCubeResp);
                int i5 = copydefault + 59;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onSuccess2(LoginCubeResp value) {
                int i2 = 2 % 2;
                super.onSuccess(value);
                if (Intrinsics.areEqual(value != null ? value.getStatus() : null, "1")) {
                    int i3 = copydefault + 107;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    CubeLoginResult result = value.getResult();
                    String accessToken2 = result != null ? result.getAccessToken() : null;
                    if (accessToken2 != null) {
                        if (accessToken2.length() != 0) {
                            callback.onSuccess(value);
                            return;
                        } else {
                            int i5 = component3 + 37;
                            copydefault = i5 % 128;
                            int i6 = i5 % 2;
                        }
                    }
                }
                callback.onError(new BaseException(value != null ? value.getMsg() : null));
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = copydefault + 81;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    callback.onError(e);
                } else {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    callback.onError(e);
                    int i4 = 32 / 0;
                }
            }
        });
        int i2 = component3 + 23;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void sendLogOut(String signKey, String token, String baseUrl, String url, ApiCallback<CubeBaseResp> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(signKey, "");
        CubeLogOutRepository cubeLogOutRepository = new CubeLogOutRepository(baseUrl + url);
        cubeLogOutRepository.addHeader("access_token", token);
        cubeLogOutRepository.addHeader("cubeSingKey", signKey);
        cubeLogOutRepository.sendRequest(callback);
        int i2 = copydefault + 95;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }
}
