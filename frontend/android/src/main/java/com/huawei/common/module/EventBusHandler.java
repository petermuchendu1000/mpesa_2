package com.huawei.common.module;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;

public class EventBusHandler {
    static List<EventbusHandlerBuilder> component1 = new ArrayList();
    List<Object> component3 = new ArrayList();

    EventBusHandler(Activity activity) {
        Iterator<EventbusHandlerBuilder> it = component1.iterator();
        while (it.hasNext()) {
            Object objCreateEventbusHandler = it.next().createEventbusHandler();
            if (objCreateEventbusHandler != null) {
                this.component3.add(objCreateEventbusHandler);
            }
        }
    }

    public static void addEventbusHandlerBuilder(EventbusHandlerBuilder eventbusHandlerBuilder) {
        if (component1.contains(eventbusHandlerBuilder)) {
            return;
        }
        component1.add(eventbusHandlerBuilder);
    }

    public void copydefault() {
        Iterator<Object> it = this.component3.iterator();
        while (it.hasNext()) {
            EventBus.getDefault().register(it.next());
        }
    }

    public void component3() {
        Iterator<Object> it = this.component3.iterator();
        while (it.hasNext()) {
            EventBus.getDefault().unregister(it.next());
        }
    }

    public static class EventBusActivityLifecycleCallback implements Application.ActivityLifecycleCallbacks {
        Map<Activity, EventBusHandler> copydefault = new HashMap();

        @Override
        public void onActivityPaused(Activity activity) {
        }

        @Override
        public void onActivityResumed(Activity activity) {
        }

        @Override
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override
        public void onActivityCreated(Activity activity, Bundle bundle) {
            this.copydefault.put(activity, new EventBusHandler(activity));
        }

        @Override
        public void onActivityStarted(Activity activity) {
            EventBusHandler eventBusHandler = this.copydefault.get(activity);
            if (eventBusHandler != null) {
                eventBusHandler.copydefault();
            }
        }

        @Override
        public void onActivityStopped(Activity activity) {
            EventBusHandler eventBusHandler = this.copydefault.get(activity);
            if (eventBusHandler != null) {
                eventBusHandler.component3();
            }
        }

        @Override
        public void onActivityDestroyed(Activity activity) {
            this.copydefault.remove(activity);
        }
    }
}
