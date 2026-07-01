package com.huawei.digitalpayment.home.init;

import android.content.Context;
import androidx.startup.Initializer;
import com.huawei.common.module.UserLifecycleManager;
import com.huawei.common.util.L;
import com.huawei.customer.digitalpayment.scan.util.CodeScanProcessUtils;
import com.huawei.digitalpayment.home.data.source.HomeUserLifecycle;
import java.util.Collections;
import java.util.List;

public class HomeModuleInitializer implements Initializer<String> {
    private static int ShareDataUIState = 0;
    private static final String component1 = "HomeModuleInitializer";
    private static int component3 = 1;

    @Override
    public String create(Context context) {
        int i = 2 % 2;
        int i2 = component3 + 35;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String strCreate = create(context);
        int i4 = component3 + 31;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return strCreate;
        }
        throw null;
    }

    @Override
    public String create(Context context) {
        int i = 2 % 2;
        L.d(component1, "create: ");
        UserLifecycleManager.get().addUserLifecycleListener(new HomeUserLifecycle());
        CodeScanProcessUtils.addCodeScanProcessHandler(new HomeScanProcessHandler());
        int i2 = ShareDataUIState + 35;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return "";
    }

    @Override
    public List<Class<? extends Initializer<?>>> dependencies() {
        int i = 2 % 2;
        int i2 = component3 + 1;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        List<Class<? extends Initializer<?>>> listEmptyList = Collections.emptyList();
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
        return listEmptyList;
    }
}
