package com.huawei.digitalpayment.consumer.loginModule.register.repository;

import android.os.Build;
import com.blankj.utilcode.util.GsonUtils;
import com.google.gson.JsonObject;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.L;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.config.IAppConfig;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.service.IPushService;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.login.model.LoginInfoRemote;
import com.huawei.digitalpayment.consumer.loginModule.util.ModelMappingUtils;
import org.json.JSONObject;

public class AutoLoginRepository extends PaymentRequest<LocalLoginInfo> {
    private static int component3 = 0;
    private static int copydefault = 1;

    @Override
    public Object convert(JsonObject jsonObject) {
        int i = 2 % 2;
        int i2 = copydefault + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        LocalLoginInfo localLoginInfoConvert = convert(jsonObject);
        int i4 = copydefault + 123;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return localLoginInfoConvert;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public AutoLoginRepository() {
        addParams("osVersion", Build.VERSION.RELEASE);
        addParams("deviceType", Build.BRAND);
        addParams("deviceToken", ((IPushService) RouteUtils.getService(IPushService.class)).getFirebaseToken());
        addParams("tcVersion", SPUtils.getInstance().getString(SPConstant.TERMS_VERSION));
        addParams("isReturnTheme", Boolean.valueOf(((IAppConfig) RouteUtils.getService(IAppConfig.class)).useTheme()));
    }

    @Override
    public LocalLoginInfo convert(JsonObject jsonObject) {
        int i = 2 % 2;
        try {
            AppConfigManager.INSTANCE.setLanguage(new JSONObject(jsonObject.toString()));
            int i2 = component3 + 85;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception unused) {
            L.e(this.TAG, "convert: ");
        }
        return ModelMappingUtils.toLocalLoginInfo((LoginInfoRemote) GsonUtils.fromJson(jsonObject.toString(), LoginInfoRemote.class), jsonObject.toString());
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 91;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 72 / 0;
        }
        int i5 = i2 + 15;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return "autoLogin";
    }
}
