package com.huawei.digitalpayment.consumer.loginModule.init;

import android.content.Context;
import androidx.startup.Initializer;
import com.huawei.common.module.UserLifecycleManager;
import com.huawei.common.util.L;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.router.RouterRedirectManager;
import java.util.Collections;
import java.util.List;

public class LoginModuleInitializer implements Initializer<String> {
    private static int component2 = 1;
    private static int component3 = 0;
    private static final String copydefault = "LoginModuleInitializer";

    @Override
    public String create(Context context) {
        int i = 2 % 2;
        int i2 = component3 + 21;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String strCreate = create(context);
        int i4 = component2 + 123;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
        return strCreate;
    }

    @Override
    public String create(Context context) {
        int i = 2 % 2;
        L.d(copydefault, "create: ");
        UserLifecycleManager.get().addUserLifecycleListener(new LoginUserLifecycle());
        RouterRedirectManager.addRedirectPath(RoutePathConstants.SMS_LOGIN, RoutePathConstants.OTP_LOGIN);
        RouterRedirectManager.addRedirectPath(RoutePathConstants.PIN_EXPIRE_START, RoutePathConstants.FORGET_PIN_START);
        RouterRedirectManager.addRedirectPath(RoutePathConstants.SELF_NEW_REGISTER, RoutePathConstants.SELF_REGISTER);
        RouterRedirectManager.addRedirectPath(RoutePathConstants.SELF_ASYNC_REGISTER, RoutePathConstants.SELF_REGISTER);
        RouterRedirectManager.addRedirectPath(RoutePathConstants.SELF_NEW_ASYNC_REGISTER, RoutePathConstants.SELF_REGISTER);
        RouterRedirectManager.addRedirectPath(RoutePathConstants.SELF_REGISTER_APPROVED, RoutePathConstants.SIMPLE_RESULT);
        RouterRedirectManager.addRedirectPath(RoutePathConstants.REGISTER_VERIFY_SUCCESS, "/loginModule/registerInfoInput");
        RouterRedirectManager.addRedirectPath(RoutePathConstants.REGISTER_VERIFY_ASYNC_SUCCESS, "/loginModule/registerInfoInput");
        RouterRedirectManager.addRedirectPath(RoutePathConstants.ACTIVE_NEW_CONSUMER, RoutePathConstants.ACTIVE_CONSUMER);
        RouterRedirectManager.addRedirectPath(RoutePathConstants.NEW_MAIN, RoutePathConstants.MAIN);
        RouterRedirectManager.addRedirectPath(RoutePathConstants.NEW_IDENTIFY_VERIFY, RoutePathConstants.NEW_DEVICE);
        int i2 = component3 + 73;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return "";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public List<Class<? extends Initializer<?>>> dependencies() {
        List<Class<? extends Initializer<?>>> listEmptyList;
        int i = 2 % 2;
        int i2 = component2 + 45;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            listEmptyList = Collections.emptyList();
            int i3 = 21 / 0;
        } else {
            listEmptyList = Collections.emptyList();
        }
        int i4 = component2 + 43;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return listEmptyList;
    }
}
