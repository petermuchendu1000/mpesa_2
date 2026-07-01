package com.huawei.digitalpayment.consumer.loginModule.login.data.source.network;

import com.google.gson.JsonObject;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.IdentityVerifyParams;
import com.huawei.digitalpayment.consumer.loginModule.login.model.LoginInfoRemote;
import com.huawei.digitalpayment.consumer.loginModule.util.ModelMappingUtils;

public class IdentityVerifyRepository extends PaymentRequest<LocalLoginInfo> {
    private static int component1 = 0;
    private static int component2 = 1;

    @Override
    public Object convert(JsonObject jsonObject) {
        int i = 2 % 2;
        int i2 = component2 + 101;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return convert(jsonObject);
        }
        convert(jsonObject);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public IdentityVerifyRepository(IdentityVerifyParams identityVerifyParams) {
        addParams(identityVerifyParams);
    }

    @Override
    public LocalLoginInfo convert(JsonObject jsonObject) {
        int i = 2 % 2;
        int i2 = component2 + 59;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        LoginInfoRemote loginInfoRemote = (LoginInfoRemote) SecureGsonUtils.fromJson(jsonObject.toString(), LoginInfoRemote.class);
        if (loginInfoRemote == null) {
            loginInfoRemote = new LoginInfoRemote();
        }
        LocalLoginInfo localLoginInfo = ModelMappingUtils.toLocalLoginInfo(loginInfoRemote, jsonObject.toString(), false);
        int i4 = component2 + 71;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return localLoginInfo;
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component2 + 21;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 39;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return "identityVerify";
    }
}
