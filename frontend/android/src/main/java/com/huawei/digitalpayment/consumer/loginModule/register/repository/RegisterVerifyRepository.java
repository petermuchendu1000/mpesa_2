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

public class RegisterVerifyRepository extends PaymentRequest<LocalLoginInfo> {
    private static int component1 = 0;
    private static int component2 = 1;

    @Override
    public Object convert(JsonObject jsonObject) {
        int i = 2 % 2;
        int i2 = component2 + 65;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            convert(jsonObject);
            throw null;
        }
        LocalLoginInfo localLoginInfoConvert = convert(jsonObject);
        int i3 = component1 + 105;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            return localLoginInfoConvert;
        }
        obj.hashCode();
        throw null;
    }

    public RegisterVerifyRepository(RegisterParams registerParams) {
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
            map.put("idNo", registerParams.getIdNumber());
            int i = 2 % 2;
        }
        addParams("idInfos", map);
        if (extProperties != null && !extProperties.isEmpty()) {
            int i2 = component2 + 79;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            addParams("extProperties", GsonUtils.toJson(extProperties));
            int i4 = 2 % 2;
        }
        BaseRequestParams baseRequestParams = new BaseRequestParams();
        baseRequestParams.setExtension(registerParams.getExtension());
        addParams(baseRequestParams);
        int i5 = component1 + 3;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override
    public LocalLoginInfo convert(JsonObject jsonObject) {
        int i = 2 % 2;
        int i2 = component2 + 75;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        LocalLoginInfo localLoginInfo = ModelMappingUtils.toLocalLoginInfo((LoginInfoRemote) GsonUtils.fromJson(jsonObject.toString(), LoginInfoRemote.class), jsonObject.toString(), false);
        int i4 = component2 + 89;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return localLoginInfo;
        }
        throw null;
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component1 + 113;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return "registerWithKyc";
        }
        throw null;
    }
}
