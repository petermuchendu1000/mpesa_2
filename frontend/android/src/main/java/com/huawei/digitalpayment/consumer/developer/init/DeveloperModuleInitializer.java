package com.huawei.digitalpayment.consumer.developer.init;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.startup.Initializer;
import com.alibaba.ariver.engine.common.track.watchdog.ARiverTrackWatchDogEventConstant;
import com.blankj.utilcode.util.Utils;
import com.huawei.common.util.L;
import com.huawei.digitalpayment.consumer.developer.util.MockUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001c\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00010\n0\tH\u0016¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/developer/init/DeveloperModuleInitializer;", "Landroidx/startup/Initializer;", "", "<init>", "()V", ARiverTrackWatchDogEventConstant.FLAG_START_UP_CREATE, "context", "Landroid/content/Context;", "dependencies", "", "Ljava/lang/Class;", "Companion", "Developer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeveloperModuleInitializer implements Initializer<String> {

    public static final Companion INSTANCE = new Companion(null);
    private static final String ShareDataUIState = "LoginModuleInitializer";
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @Override
    public String create(Context context) {
        int i = 2 % 2;
        int i2 = component1 + 39;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String strCreate = create(context);
        int i4 = copydefault + 91;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return strCreate;
        }
        throw null;
    }

    @Override
    public String create(Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        L.d(ShareDataUIState, "create: ");
        Utils.getApp().registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                int i2 = 2 % 2;
                int i3 = component3 + 3;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(activity, "");
                MockUtils.open(activity.findViewById(R.id.content));
                int i5 = component3 + 109;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onActivityDestroyed(Activity activity) {
                int i2 = 2 % 2;
                int i3 = component3 + 65;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(activity, "");
                if (i4 == 0) {
                    throw null;
                }
                int i5 = ShareDataUIState + 61;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            @Override
            public void onActivityPaused(Activity activity) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 1;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(activity, "");
                if (i4 != 0) {
                    throw null;
                }
                int i5 = ShareDataUIState + 85;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onActivityResumed(Activity activity) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 117;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(activity, "");
                int i5 = component3 + 65;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 87;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(activity, "");
                Intrinsics.checkNotNullParameter(outState, "");
                if (i4 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = ShareDataUIState + 125;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onActivityStarted(Activity activity) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 29;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(activity, "");
                int i5 = ShareDataUIState + 11;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 5 / 0;
                }
            }

            @Override
            public void onActivityStopped(Activity activity) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 5;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(activity, "");
                if (i4 != 0) {
                    throw null;
                }
            }
        });
        int i2 = component1 + 87;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return "";
        }
        throw null;
    }

    @Override
    public List<Class<? extends Initializer<?>>> dependencies() {
        int i = 2 % 2;
        int i2 = component1 + 41;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            CollectionsKt.emptyList();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<Class<? extends Initializer<?>>> listEmptyList = CollectionsKt.emptyList();
        int i3 = copydefault + 85;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return listEmptyList;
    }

    static {
        int i = component2 + 25;
        component3 = i % 128;
        int i2 = i % 2;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/developer/init/DeveloperModuleInitializer$Companion;", "", "<init>", "()V", "TAG", "", "Developer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
