package com.huawei.digitalpayment.consumer.home.init;

import android.content.Context;
import androidx.startup.Initializer;
import com.huawei.common.module.UserLifecycleManager;
import java.util.Collections;
import java.util.List;

public class HomeUiModuleInitializer implements Initializer<String> {
    private static int ShareDataUIState = 1;
    private static int component2;

    @Override
    public String create(Context context) {
        int i = 2 % 2;
        int i2 = component2 + 15;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String strCreate = create(context);
        int i4 = ShareDataUIState + 65;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return strCreate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public String create(Context context) {
        int i = 2 % 2;
        UserLifecycleManager.get().addUserLifecycleListener(new HomeUiUserLifecycle());
        int i2 = component2 + 119;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return "";
    }

    @Override
    public List<Class<? extends Initializer<?>>> dependencies() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        List<Class<? extends Initializer<?>>> listEmptyList = Collections.emptyList();
        int i4 = component2 + 79;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return listEmptyList;
    }
}
