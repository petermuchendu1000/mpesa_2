package com.huawei.digitalpayment.consumer.login.init;

import android.content.Context;
import androidx.startup.Initializer;
import com.huawei.common.module.UserLifecycleManager;
import com.safaricom.mpesa.logging.L;
import java.util.Collections;
import java.util.List;

public class LoginModuleUiInitializer implements Initializer<String> {
    private static final String component1 = "LoginModuleUiInitializer";
    private static int component2 = 0;
    private static int copydefault = 1;

    @Override
    public String create(Context context) {
        int i = 2 % 2;
        int i2 = component2 + 5;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String strCreate = create(context);
        int i4 = copydefault + 37;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return strCreate;
    }

    @Override
    public String create(Context context) {
        int i = 2 % 2;
        L.INSTANCE.d(component1, "create: ", new Object[0]);
        UserLifecycleManager.get().addUserLifecycleListener(new LoginModuleUiLifecycle());
        int i2 = copydefault + 97;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return "";
    }

    @Override
    public List<Class<? extends Initializer<?>>> dependencies() {
        int i = 2 % 2;
        int i2 = copydefault + 9;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return Collections.emptyList();
        }
        Collections.emptyList();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
