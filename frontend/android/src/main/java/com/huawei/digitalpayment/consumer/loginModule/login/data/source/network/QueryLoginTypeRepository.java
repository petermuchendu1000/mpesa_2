package com.huawei.digitalpayment.consumer.loginModule.login.data.source.network;

import android.os.Build;
import com.blankj.utilcode.util.GsonUtils;
import com.google.gson.JsonObject;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.service.IPushService;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model.LocalQueryLoginType;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.QueryLoginTypeParams;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.network.model.NetworkQueryLoginType;
import com.huawei.digitalpayment.consumer.loginModule.util.ModelMappingUtils;

public class QueryLoginTypeRepository extends PaymentRequest<LocalQueryLoginType> {
    private static int component1 = 1;
    private static int component3;

    @Override
    public Object convert(JsonObject jsonObject) {
        int i = 2 % 2;
        int i2 = component3 + 103;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return convert(jsonObject);
        }
        convert(jsonObject);
        throw null;
    }

    public QueryLoginTypeRepository(QueryLoginTypeParams queryLoginTypeParams) {
        addParams(queryLoginTypeParams);
        addParams("osVersion", Build.VERSION.RELEASE);
        addParams("deviceType", Build.MODEL);
        addParams("deviceToken", ((IPushService) RouteUtils.getService(IPushService.class)).getFirebaseToken());
    }

    @Override
    public LocalQueryLoginType convert(JsonObject jsonObject) {
        int i = 2 % 2;
        int i2 = component1 + 77;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        LocalQueryLoginType localQueryLoginType = ModelMappingUtils.toLocalQueryLoginType((NetworkQueryLoginType) GsonUtils.fromJson(jsonObject.toString(), NetworkQueryLoginType.class));
        int i4 = component1 + 117;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return localQueryLoginType;
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component3 + 1;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return "queryLoginType";
        }
        throw null;
    }
}
