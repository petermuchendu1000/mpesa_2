package com.huawei.digitalpayment.consumer.loginModule.util;

import android.text.TextUtils;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.baselib.init.TokenHelper;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model.LocalQueryLoginType;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.network.model.ExtResponse;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.network.model.NetworkQueryLoginType;
import com.huawei.digitalpayment.consumer.loginModule.login.model.LoginInfoRemote;
import com.huawei.digitalpayment.consumer.service.IHomeModule2Service;

public class ModelMappingUtils {
    private static int component1 = 1;
    private static int component3;

    @Deprecated
    public static LocalLoginInfo toLocalLoginInfo(LoginInfoRemote loginInfoRemote) {
        int i = 2 % 2;
        int i2 = component1 + 89;
        component3 = i2 % 128;
        LocalLoginInfo localLoginInfo = toLocalLoginInfo(loginInfoRemote, null, i2 % 2 != 0);
        int i3 = component3 + 49;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return localLoginInfo;
    }

    public static LocalLoginInfo toLocalLoginInfo(LoginInfoRemote loginInfoRemote, String str) {
        int i = 2 % 2;
        int i2 = component1 + 95;
        component3 = i2 % 128;
        LocalLoginInfo localLoginInfo = toLocalLoginInfo(loginInfoRemote, str, i2 % 2 == 0);
        int i3 = component3 + 85;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return localLoginInfo;
    }

    public static LocalLoginInfo toLocalLoginInfo(LoginInfoRemote loginInfoRemote, String str, boolean z) {
        Object model3Config;
        int i = 2 % 2;
        int i2 = component3 + 73;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        if (loginInfoRemote.getModel3Config() == null) {
            model3Config = loginInfoRemote.getFunctionConfig();
        } else {
            model3Config = loginInfoRemote.getModel3Config();
            int i4 = component3 + 119;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }
        Object obj = model3Config;
        TokenHelper.INSTANCE.saveTokenToSp(loginInfoRemote.getToken());
        if (z) {
            int i6 = component1 + 95;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                component1(loginInfoRemote, str);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            component1(loginInfoRemote, str);
        }
        LocalLoginInfo localLoginInfo = new LocalLoginInfo(loginInfoRemote.getForward(), loginInfoRemote.getToken(), obj, loginInfoRemote.getCustomer(), loginInfoRemote.getMerchantAppIdConfig(), loginInfoRemote.getCustomerProfiles(), loginInfoRemote.getAsyncRegisterDesc());
        localLoginInfo.copyExtension(loginInfoRemote);
        return localLoginInfo;
    }

    private static void component1(LoginInfoRemote loginInfoRemote, String str) {
        int i = 2 % 2;
        int i2 = component1 + 111;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            IHomeModule2Service iHomeModule2Service = (IHomeModule2Service) RouteUtils.getService(IHomeModule2Service.class);
            if (iHomeModule2Service != null && !TextUtils.isEmpty(str) && (!TextUtils.isEmpty(loginInfoRemote.getToken())) && TextUtils.isEmpty(loginInfoRemote.getForward())) {
                int i3 = component3 + 59;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                iHomeModule2Service.refreshTheme(str);
                return;
            }
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static LocalQueryLoginType toLocalQueryLoginType(NetworkQueryLoginType networkQueryLoginType) {
        boolean z;
        int i = 2 % 2;
        if (networkQueryLoginType == null) {
            return new LocalQueryLoginType();
        }
        boolean z2 = false;
        try {
            z = Boolean.parseBoolean(networkQueryLoginType.getSupportPinLogin());
        } catch (Exception unused) {
            z = false;
        }
        LocalQueryLoginType localQueryLoginType = new LocalQueryLoginType();
        localQueryLoginType.setExecute(networkQueryLoginType.getForward());
        localQueryLoginType.setActive(networkQueryLoginType.isActive());
        localQueryLoginType.setAsyncRegisterDesc(networkQueryLoginType.getAsyncRegisterDesc());
        localQueryLoginType.setOneStepRegisterTag(networkQueryLoginType.getOneStepRegisterTag());
        localQueryLoginType.setLoginType(networkQueryLoginType.getLoginType());
        if (!TextUtils.isEmpty(networkQueryLoginType.getForward()) && networkQueryLoginType.getForward().contains("/new/")) {
            z2 = true;
        }
        localQueryLoginType.setNewProcess(Boolean.valueOf(z2));
        localQueryLoginType.setSupportPin(Boolean.valueOf(z));
        localQueryLoginType.setSupportFaceLogin(networkQueryLoginType.getSupportFaceLogin());
        localQueryLoginType.setSupportFingerprintLogin(networkQueryLoginType.getSupportFingerprintLogin());
        ExtResponse extResponse = networkQueryLoginType.getExtResponse();
        if (extResponse != null) {
            int i2 = component1 + 69;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            localQueryLoginType.setSupportPin(Boolean.valueOf(Boolean.parseBoolean(extResponse.getSupportPin())));
            localQueryLoginType.setSupportOtpLogin(Boolean.valueOf(Boolean.parseBoolean(extResponse.getSupportOtp())));
            localQueryLoginType.setSupportFaceLogin(Boolean.valueOf(Boolean.parseBoolean(extResponse.getSupportFace())));
            localQueryLoginType.setSupportFingerprintLogin(Boolean.valueOf(Boolean.parseBoolean(extResponse.getSupportFingerprint())));
            localQueryLoginType.setOtpTpe(extResponse.getOtpType());
            if (!TextUtils.isEmpty(extResponse.getSupportForgetPin())) {
                int i4 = component3 + 33;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                localQueryLoginType.setSupportForgetPin(Boolean.valueOf(Boolean.parseBoolean(extResponse.getSupportForgetPin())));
                int i6 = component3 + 93;
                component1 = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        localQueryLoginType.copyExtension(networkQueryLoginType);
        return localQueryLoginType;
    }
}
