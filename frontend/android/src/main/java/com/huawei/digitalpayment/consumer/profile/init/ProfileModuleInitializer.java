package com.huawei.digitalpayment.consumer.profile.init;

import android.content.Context;
import androidx.startup.Initializer;
import com.huawei.common.module.UserLifecycleManager;
import com.huawei.common.util.L;
import java.util.Collections;
import java.util.List;

public class ProfileModuleInitializer implements Initializer<String> {
    private static int ShareDataUIState = 1;
    private static final String component1 = "ProfileModuleInitializer";
    private static int copydefault;

    @Override
    public String create(Context context) {
        int i = 2 % 2;
        int i2 = copydefault + 3;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String strCreate = create(context);
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
        return strCreate;
    }

    @Override
    public String create(Context context) {
        int i = 2 % 2;
        L.d(component1, "create: ");
        UserLifecycleManager.get().addUserLifecycleListener(new ProfileLifecycle());
        int i2 = ShareDataUIState + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return "";
    }

    @Override
    public List<Class<? extends Initializer<?>>> dependencies() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        List<Class<? extends Initializer<?>>> listEmptyList = Collections.emptyList();
        int i4 = ShareDataUIState + 97;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
        return listEmptyList;
    }
}
