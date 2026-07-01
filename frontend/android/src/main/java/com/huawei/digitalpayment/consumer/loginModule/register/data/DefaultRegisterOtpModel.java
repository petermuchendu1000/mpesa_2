package com.huawei.digitalpayment.consumer.loginModule.register.data;

import android.os.Build;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.service.IPushService;
import com.huawei.digitalpayment.consumer.loginModule.register.model.OtpRegisterResp;
import com.huawei.digitalpayment.consumer.loginModule.register.repository.RegisterSmsCodeVerifyRepository;
import com.huawei.digitalpayment.consumer.loginModule.register.repository.SendRegisterSmsRepository;
import com.huawei.digitalpayment.consumer.loginModule.register.request.OtpRegisterParams;
import com.huawei.digitalpayment.consumer.loginModule.register.request.ProcessVerifyRequest;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.BaseResp;
import javax.inject.Inject;

public class DefaultRegisterOtpModel implements RegisterOtpModel {
    private static int component3 = 1;
    private static int copydefault;

    @Inject
    public DefaultRegisterOtpModel() {
    }

    @Override
    public void sendRegisterSms(BaseRequestParams baseRequestParams, ApiCallback<BaseResp> apiCallback) {
        int i = 2 % 2;
        sendRequest(new SendRegisterSmsRepository(baseRequestParams), apiCallback);
        int i2 = component3 + 21;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void registerSmsCodeVerify(BaseRequestParams baseRequestParams, ApiCallback<BaseResp> apiCallback) {
        int i = 2 % 2;
        sendRequest(new RegisterSmsCodeVerifyRepository(baseRequestParams), apiCallback);
        int i2 = copydefault + 75;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 99 / 0;
        }
    }

    @Override
    public void registerSmsCodeVerify2(OtpRegisterParams otpRegisterParams, ApiCallback<OtpRegisterResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<OtpRegisterResp> paymentRequest = new PaymentRequest<OtpRegisterResp>(this) {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault;
                int i4 = i3 + 27;
                component2 = i4 % 128;
                Object obj = null;
                if (i4 % 2 != 0) {
                    throw null;
                }
                int i5 = i3 + 117;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    return "registerSmsCodeVerify";
                }
                obj.hashCode();
                throw null;
            }
        };
        paymentRequest.addParams("initiatorMsisdn", SPUtils.getInstance().getString("recent_login_phone_number"));
        paymentRequest.addParams(otpRegisterParams);
        paymentRequest.sendRequest(apiCallback);
        int i2 = copydefault + 63;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void processVerify(ProcessVerifyRequest processVerifyRequest, ApiCallback<OtpRegisterResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<OtpRegisterResp> paymentRequest = new PaymentRequest<OtpRegisterResp>(this) {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component3;
                int i4 = i3 + 47;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 92 / 0;
                }
                int i6 = i3 + 51;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 == 0) {
                    return "processVerify";
                }
                throw null;
            }
        };
        paymentRequest.addParams("initiatorMsisdn", SPUtils.getInstance().getString("recent_login_phone_number"));
        paymentRequest.addParams("osVersion", Build.VERSION.RELEASE);
        paymentRequest.addParams("deviceType", Build.MODEL);
        paymentRequest.addParams("tcVersion", SPUtils.getInstance().getString(SPConstant.TERMS_VERSION));
        paymentRequest.addParams("deviceToken", ((IPushService) RouteUtils.getService(IPushService.class)).getFirebaseToken());
        paymentRequest.addParams(processVerifyRequest);
        paymentRequest.sendRequest(apiCallback);
        int i2 = copydefault + 53;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }
}
