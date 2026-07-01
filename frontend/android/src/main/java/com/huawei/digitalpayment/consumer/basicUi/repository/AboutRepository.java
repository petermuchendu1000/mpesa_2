package com.huawei.digitalpayment.consumer.basicUi.repository;

import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.util.update.UpdateBean;

public class AboutRepository extends PaymentRequest<UpdateBean> {
    private static int component2 = 1;
    private static int component3;

    public AboutRepository() {
        addParams("initiatorMsisdn", SPUtils.getInstance().getString("recent_login_phone_number"));
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 67;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 1;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return "versionVerify";
    }
}
