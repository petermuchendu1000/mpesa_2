package com.huawei.digitalpayment.consumer.sfcui.ui.init;

import android.content.Context;
import androidx.startup.Initializer;
import com.huawei.common.module.UserLifecycleManager;
import com.huawei.digitalpayment.consumer.base.cube.utils.CubeUnionFetchHelper;
import com.safaricom.mpesa.logging.L;
import java.util.Collections;
import java.util.List;

public class SfcModuleUiInitializer implements Initializer<String> {
    private static int component1 = 0;
    private static int component2 = 1;
    private static final String component3 = "LoginModuleUiInitializer";

    @Override
    public String create(Context context) {
        int i = 2 % 2;
        int i2 = component2 + 125;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String strCreate = create(context);
        int i4 = component2 + 11;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return strCreate;
    }

    @Override
    public String create(Context context) {
        int i = 2 % 2;
        L.INSTANCE.d(component3, "create: ", new Object[0]);
        UserLifecycleManager.get().addUserLifecycleListener(new SfcModuleUiLifecycle());
        CubeUnionFetchHelper.INSTANCE.initConfig();
        CusotmConfigHelper.INSTANCE.initConfig();
        int i2 = component2 + 73;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 61 / 0;
        }
        return "";
    }

    @Override
    public List<Class<? extends Initializer<?>>> dependencies() {
        int i = 2 % 2;
        int i2 = component1 + 27;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        List<Class<? extends Initializer<?>>> listEmptyList = Collections.emptyList();
        int i4 = component1 + 121;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
        return listEmptyList;
    }
}
