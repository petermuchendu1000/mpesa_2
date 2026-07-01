package com.huawei.common.init;

import android.content.Context;
import androidx.startup.Initializer;
import com.huawei.common.util.L;
import com.huawei.common.util.LogFileUtils;
import java.util.Collections;
import java.util.List;

public class BaseInitializer implements Initializer<String> {
    private static final String component3 = "BaseInitializer";

    @Override
    public String create(Context context) {
        LogFileUtils.init(context);
        L.d(component3, "create: ");
        return "";
    }

    @Override
    public List<Class<? extends Initializer<?>>> dependencies() {
        return Collections.emptyList();
    }
}
