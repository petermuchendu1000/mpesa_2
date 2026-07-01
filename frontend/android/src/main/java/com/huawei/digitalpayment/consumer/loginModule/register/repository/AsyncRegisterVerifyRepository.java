package com.huawei.digitalpayment.consumer.loginModule.register.repository;

import android.text.TextUtils;
import com.blankj.utilcode.util.GsonUtils;
import com.google.gson.JsonObject;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.identity.ui.activity.CheckIdentityActivity;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.login.model.LoginInfoRemote;
import com.huawei.digitalpayment.consumer.loginModule.register.request.RegisterParams;
import com.huawei.digitalpayment.consumer.loginModule.util.ModelMappingUtils;
import com.huawei.http.BaseRequestParams;
import java.util.HashMap;
import java.util.Map;

public class AsyncRegisterVerifyRepository extends PaymentRequest<LocalLoginInfo> {
    private static int component1 = 1;
    private static int component2;

    @Override
    public Object convert(JsonObject jsonObject) {
        int i = 2 % 2;
        int i2 = component1 + 109;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        LocalLoginInfo localLoginInfoConvert = convert(jsonObject);
        int i4 = component1 + 33;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return localLoginInfoConvert;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public AsyncRegisterVerifyRepository(RegisterParams registerParams) {
        addParams("firstName", registerParams.getName());
        addParams("lastName", registerParams.getName());
        addParams("initiatorMsisdn", SPUtils.getInstance().getString("recent_login_phone_number"));
        addParams("tcVersion", SPUtils.getInstance().getString(SPConstant.TERMS_VERSION));
        Map<String, Object> extProperties = registerParams.getExtProperties();
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(registerParams.getIdType())) {
            map.put(CheckIdentityActivity.ID_TYPE, registerParams.getIdType());
        }
        if (!TextUtils.isEmpty(registerParams.getIdNumber())) {
            int i = component2 + 3;
            component1 = i % 128;
            int i2 = i % 2;
            map.put("idNo", registerParams.getIdNumber());
        }
        addParams("idInfos", map);
        if (extProperties != null && (!extProperties.isEmpty())) {
            addParams("extProperties", GsonUtils.toJson(extProperties));
            int i3 = component2 + 69;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
        }
        BaseRequestParams baseRequestParams = new BaseRequestParams();
        baseRequestParams.setExtension(registerParams.getExtension());
        addParams(baseRequestParams);
        int i5 = component2 + 1;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override
    public LocalLoginInfo convert(JsonObject jsonObject) {
        LocalLoginInfo localLoginInfo;
        int i = 2 % 2;
        int i2 = component2 + 95;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String string = jsonObject.toString();
        if (i3 == 0) {
            localLoginInfo = ModelMappingUtils.toLocalLoginInfo((LoginInfoRemote) GsonUtils.fromJson(string, LoginInfoRemote.class));
            int i4 = 85 / 0;
        } else {
            localLoginInfo = ModelMappingUtils.toLocalLoginInfo((LoginInfoRemote) GsonUtils.fromJson(string, LoginInfoRemote.class));
        }
        int i5 = component2 + 37;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return localLoginInfo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 113;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 22 / 0;
        }
        int i5 = i2 + 63;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return "asyncRegisterWithKyc";
    }
}
