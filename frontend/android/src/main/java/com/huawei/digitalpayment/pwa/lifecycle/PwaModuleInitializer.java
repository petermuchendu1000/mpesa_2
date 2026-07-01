package com.huawei.digitalpayment.pwa.lifecycle;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.startup.Initializer;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.Utils;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.baselib.init.DefaultActivityLifecycleCallbacks;
import com.huawei.digitalpayment.pwa.business.BusinessManager;
import com.huawei.digitalpayment.pwa.cache.IntentManager;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PwaModuleInitializer implements Initializer<String> {
    private static int component1 = 1;
    private static int component3;

    @Override
    public String create(Context context) {
        int i = 2 % 2;
        int i2 = component3 + 81;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String strCreate = create(context);
        int i4 = component3 + 125;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return strCreate;
    }

    @Override
    public String create(Context context) {
        int i = 2 % 2;
        Utils.getApp().registerActivityLifecycleCallbacks(new DefaultActivityLifecycleCallbacks() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public void onActivityStarted(Activity activity) {
                int i2 = 2 % 2;
                int i3 = component1 + 11;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                if (!(!TextUtils.equals(RouteUtils.getActivityName(activity), "main"))) {
                    int i5 = component3 + 43;
                    component1 = i5 % 128;
                    int i6 = i5 % 2;
                    PwaModuleInitializer.component1(PwaModuleInitializer.this);
                }
                int i7 = component3 + 95;
                component1 = i7 % 128;
                if (i7 % 2 == 0) {
                    throw null;
                }
            }

            @Override
            public void onActivityCreated(Activity activity, Bundle bundle) {
                int i2 = 2 % 2;
                int i3 = component1 + 33;
                component3 = i3 % 128;
                int i4 = i3 % 2;
            }

            @Override
            public void onActivityDestroyed(Activity activity) {
                int i2 = 2 % 2;
                int i3 = component3 + 69;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 80 / 0;
                }
            }

            @Override
            public void onActivityPaused(Activity activity) {
                int i2 = 2 % 2;
                int i3 = component1 + 69;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onActivityResumed(Activity activity) {
                int i2 = 2 % 2;
                int i3 = component3 + 103;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 94 / 0;
                }
            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                int i2 = 2 % 2;
                int i3 = component3 + 53;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
            }

            @Override
            public void onActivityStopped(Activity activity) {
                int i2 = 2 % 2;
                int i3 = component1 + 49;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i2 = component3 + 109;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return "";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void component2() {
        int i = 2 % 2;
        int i2 = component3 + 23;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            IntentManager.get().getCacheIntent();
            throw null;
        }
        Map<String, Intent> cacheIntent = IntentManager.get().getCacheIntent();
        if (cacheIntent == null) {
            return;
        }
        copydefault(cacheIntent);
        int i3 = component1 + 65;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override
    public List<Class<? extends Initializer<?>>> dependencies() {
        int i = 2 % 2;
        int i2 = component3 + 89;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        List<Class<? extends Initializer<?>>> listEmptyList = Collections.emptyList();
        int i4 = component1 + 67;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return listEmptyList;
    }

    static void component1(Uri uri) {
        int i = 2 % 2;
        int i2 = component3 + 107;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        BusinessManager.get().parseUri(uri);
        int i4 = component1 + 103;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
    }

    private void copydefault(Map<String, Intent> map) {
        final Uri data;
        int i = 2 % 2;
        int i2 = component1 + 115;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Iterator<String> it = map.keySet().iterator();
        while (!(!it.hasNext())) {
            int i4 = component3 + 107;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            String next = it.next();
            Intent intent = map.get(next);
            if (intent != null && (data = intent.getData()) != null) {
                ThreadUtils.runOnUiThreadDelayed(new Runnable() {
                    private static int component2 = 1;
                    private static int component3;

                    @Override
                    public final void run() {
                        int i6 = 2 % 2;
                        int i7 = component2 + 91;
                        component3 = i7 % 128;
                        int i8 = i7 % 2;
                        PwaModuleInitializer.component1(data);
                        int i9 = component2 + 21;
                        component3 = i9 % 128;
                        int i10 = i9 % 2;
                    }
                }, 500L);
                map.remove(next);
                return;
            }
        }
    }

    static void component1(PwaModuleInitializer pwaModuleInitializer) {
        int i = 2 % 2;
        int i2 = component3 + 85;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        pwaModuleInitializer.component2();
        int i4 = component1 + 111;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
