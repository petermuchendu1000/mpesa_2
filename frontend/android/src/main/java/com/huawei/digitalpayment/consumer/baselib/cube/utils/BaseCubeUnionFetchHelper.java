package com.huawei.digitalpayment.consumer.baselib.cube.utils;

import android.text.TextUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.cube.repository.CubeAuthRepository;
import com.huawei.digitalpayment.consumer.baselib.cube.repository.CubeLogOutRepository;
import com.huawei.digitalpayment.consumer.baselib.cube.repository.H5GetAccessTokenRepository;
import com.huawei.digitalpayment.consumer.baselib.cube.repository.LoginCubeRepository;
import com.huawei.digitalpayment.consumer.baselib.cube.resp.CubeAuthResp;
import com.huawei.digitalpayment.consumer.baselib.cube.resp.CubeBaseResp;
import com.huawei.digitalpayment.consumer.baselib.cube.resp.CubeLoginResult;
import com.huawei.digitalpayment.consumer.baselib.cube.resp.GetH5AccessTokenResp;
import com.huawei.digitalpayment.consumer.baselib.cube.resp.LoginCubeResp;
import com.iap.ac.android.acs.operation.log.LogConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJL\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJD\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ<\u0010\u0014\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000e¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/cube/utils/BaseCubeUnionFetchHelper;", "", "<init>", "()V", "getCubeAuth", "", "baseUrl", "", LogConstants.Oauth.AUTHURL, "loginUrl", "tenantId", "appId", "signKey", "callback", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/digitalpayment/consumer/baselib/cube/resp/LoginCubeResp;", "getAccessTokenAndLogin", "authCode", "loginCube", "accessToken", "sendLogOut", "token", "url", "Lcom/huawei/digitalpayment/consumer/baselib/cube/resp/CubeBaseResp;", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BaseCubeUnionFetchHelper {
    private static int component1 = 1;
    private static int component3;

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
            private static int component4 = 0;
            private static int equals = 1;

            @Override
            public void onSuccess(GetH5AccessTokenResp getH5AccessTokenResp) {
                int i2 = 2 % 2;
                int i3 = component4 + 67;
                equals = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(getH5AccessTokenResp);
                if (i4 == 0) {
                    throw null;
                }
                int i5 = equals + 115;
                component4 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onSuccess2(GetH5AccessTokenResp value) {
                int i2 = 2 % 2;
                int i3 = equals + 31;
                component4 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(value, "");
                super.onSuccess(value);
                String accessToken = value.getAccessToken();
                if (accessToken != null) {
                    BaseCubeUnionFetchHelper.this.getAccessTokenAndLogin(baseUrl, loginUrl, authUrl, accessToken, appId, signKey, tenantId, callback);
                    int i5 = equals + 119;
                    component4 = i5 % 128;
                    int i6 = i5 % 2;
                }
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = equals + 91;
                component4 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                callback.onError(e);
                int i5 = equals + 41;
                component4 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i2 = component1 + 61;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
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
            private static int component4 = 0;
            private static int equals = 1;

            @Override
            public void onSuccess(CubeAuthResp cubeAuthResp) {
                int i2 = 2 % 2;
                int i3 = component4 + 39;
                equals = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(cubeAuthResp);
                if (i4 == 0) {
                    throw null;
                }
                int i5 = equals + 49;
                component4 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onSuccess2(CubeAuthResp value) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(value, "");
                super.onSuccess(value);
                if (Intrinsics.areEqual(value.getResCode(), "0") && value.getResult() != null) {
                    int i3 = equals + 17;
                    component4 = i3 % 128;
                    if (i3 % 2 != 0) {
                        TextUtils.isEmpty(value.getResult().getAccessToken());
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (!TextUtils.isEmpty(value.getResult().getAccessToken())) {
                        int i4 = equals + 117;
                        component4 = i4 % 128;
                        int i5 = i4 % 2;
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
                int i3 = equals + 41;
                component4 = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    callback.onError(e);
                } else {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    callback.onError(e);
                    throw null;
                }
            }
        });
        int i2 = component1 + 105;
        component3 = i2 % 128;
        int i3 = i2 % 2;
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
            private static int component2 = 1;
            private static int component3;

            @Override
            public void onSuccess(LoginCubeResp loginCubeResp) {
                int i2 = 2 % 2;
                int i3 = component3 + 9;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(loginCubeResp);
                if (i4 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onSuccess2(LoginCubeResp value) {
                String status;
                String accessToken2;
                int i2 = 2 % 2;
                super.onSuccess(value);
                String msg = null;
                if (value != null) {
                    int i3 = component3 + 7;
                    component2 = i3 % 128;
                    int i4 = i3 % 2;
                    status = value.getStatus();
                } else {
                    status = null;
                }
                if (Intrinsics.areEqual(status, "1")) {
                    CubeLoginResult result = value.getResult();
                    if (result != null) {
                        int i5 = component3 + 7;
                        component2 = i5 % 128;
                        if (i5 % 2 == 0) {
                            result.getAccessToken();
                            throw null;
                        }
                        accessToken2 = result.getAccessToken();
                    } else {
                        accessToken2 = null;
                    }
                    String str = accessToken2;
                    if (str != null && str.length() != 0) {
                        callback.onSuccess(value);
                        return;
                    }
                }
                ApiCallback<LoginCubeResp> apiCallback = callback;
                if (value != null) {
                    int i6 = component3 + 61;
                    component2 = i6 % 128;
                    int i7 = i6 % 2;
                    msg = value.getMsg();
                }
                apiCallback.onError(new BaseException(msg));
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component2 + 121;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    callback.onError(e);
                    throw null;
                }
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                callback.onError(e);
                int i4 = component2 + 63;
                component3 = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i2 = component3 + 125;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void sendLogOut(String signKey, String token, String baseUrl, String url, ApiCallback<CubeBaseResp> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(signKey, "");
        CubeLogOutRepository cubeLogOutRepository = new CubeLogOutRepository(baseUrl + url);
        cubeLogOutRepository.addHeader("access_token", token);
        cubeLogOutRepository.addHeader("cubeSingKey", signKey);
        cubeLogOutRepository.sendRequest(callback);
        int i2 = component3 + 73;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }
}
