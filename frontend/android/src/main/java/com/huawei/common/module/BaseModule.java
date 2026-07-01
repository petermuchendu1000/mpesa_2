package com.huawei.common.module;

import android.app.Application;
import com.huawei.common.module.EventBusHandler;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseModule implements EventbusHandlerBuilder {
    static List<BaseModule> component1 = new ArrayList();

    @Override
    public Object createEventbusHandler() {
        return null;
    }

    public UserLifecycle getUserLifecycle() {
        return null;
    }

    public void onCreate(Application application) {
    }

    public static void init(Application application) {
        application.registerActivityLifecycleCallbacks(new EventBusHandler.EventBusActivityLifecycleCallback());
        for (BaseModule baseModule : component1) {
            baseModule.onCreate(application);
            UserLifecycle userLifecycle = baseModule.getUserLifecycle();
            if (userLifecycle != null) {
                UserLifecycleManager.get().addUserLifecycleListener(userLifecycle);
            }
            EventBusHandler.addEventbusHandlerBuilder(baseModule);
        }
    }

    public static void addBaseModule(BaseModule baseModule) {
        if (component1.contains(baseModule)) {
            return;
        }
        component1.add(baseModule);
    }
}
