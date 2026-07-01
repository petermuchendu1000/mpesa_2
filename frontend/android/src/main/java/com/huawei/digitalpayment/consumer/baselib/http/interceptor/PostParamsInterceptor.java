package com.huawei.digitalpayment.consumer.baselib.http.interceptor;

import android.text.TextUtils;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.encrypt.EncryptUtils;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.init.TokenHelper;
import com.huawei.digitalpayment.consumer.baselib.service.ILoginService;
import com.huawei.http.appserver.interceptor.AppServerPostParamsInterceptor;

public class PostParamsInterceptor extends AppServerPostParamsInterceptor {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;

    @Override
    public String encryptRandomDynamicIv(String str) {
        int i = 2 % 2;
        int i2 = component1 + 37;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 68 / 0;
            return EncryptUtils.rsaEncrypt(AppConfigManager.getAppConfig().getSignKey(), AppConfigManager.getAppConfig().getSignTransformation(), str);
        }
        return EncryptUtils.rsaEncrypt(AppConfigManager.getAppConfig().getSignKey(), AppConfigManager.getAppConfig().getSignTransformation(), str);
    }

    @Override
    public String getSignKeyVersion() {
        String signKeyVersion;
        int i = 2 % 2;
        int i2 = component1 + 47;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            signKeyVersion = AppConfigManager.getAppConfig().getSignKeyVersion();
            int i3 = 4 / 0;
        } else {
            signKeyVersion = AppConfigManager.getAppConfig().getSignKeyVersion();
        }
        int i4 = component1 + 13;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return signKeyVersion;
    }

    @Override
    public String getToken() {
        int i = 2 % 2;
        String loginToken = TokenHelper.INSTANCE.getLoginToken();
        if (((ILoginService) RouteUtils.getService(ILoginService.class)).isLogin()) {
            int i2 = component1 + 55;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                TextUtils.isEmpty(loginToken);
                throw null;
            }
            if (!TextUtils.isEmpty(loginToken)) {
                int i3 = ShareDataUIState + 69;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    return loginToken;
                }
                throw null;
            }
        }
        String tempToken = TokenHelper.INSTANCE.getTempToken();
        return !TextUtils.isEmpty(tempToken) ? tempToken : loginToken;
    }
}
