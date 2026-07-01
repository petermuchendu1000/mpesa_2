package com.huawei.digitalpayment.consumer.push.init;

import android.content.Context;
import androidx.startup.Initializer;
import com.alibaba.ariver.engine.common.track.watchdog.ARiverTrackWatchDogEventConstant;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.Utils;
import com.google.firebase.FirebaseApp;
import com.huawei.common.module.UserLifecycleManager;
import com.huawei.common.util.L;
import com.huawei.digitalpayment.consumer.push.FirebaseInit;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001a\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/push/init/PushModuleInitializer;", "Landroidx/startup/Initializer;", "", "<init>", "()V", ARiverTrackWatchDogEventConstant.FLAG_START_UP_CREATE, "context", "Landroid/content/Context;", "dependencies", "", "Ljava/lang/Class;", "Companion", "CustomerPushModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PushModuleInitializer implements Initializer<String> {

    public static final Companion INSTANCE;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static final String copydefault = "PushModuleInitializer";

    @Override
    public String create(Context context) {
        int i = 2 % 2;
        int i2 = component3 + 53;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return create(context);
        }
        create(context);
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/push/init/PushModuleInitializer$Companion;", "", "<init>", "()V", "TAG", "", "CustomerPushModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override
    public String create(Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        L.d(copydefault, "create: ");
        ThreadUtils.executeByCached(new ThreadUtils.SimpleTask<Void>() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public Object doInBackground() throws Throwable {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 41;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    return doInBackground();
                }
                doInBackground();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onSuccess(Object obj) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 37;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                onSuccess((Void) obj);
                int i5 = ShareDataUIState + 35;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public Void doInBackground() throws Throwable {
                int i2 = 2 % 2;
                UserLifecycleManager.get().addUserLifecycleListener(new PushLifecycle());
                FirebaseApp.initializeApp(Utils.getApp());
                FirebaseInit.getInstance().init();
                int i3 = copydefault + 3;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                return null;
            }

            public void onSuccess(Void result) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 55;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i2 = component3 + 75;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return "";
        }
        throw null;
    }

    @Override
    public List<Class<? extends Initializer<?>>> dependencies() {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int i2 = component1 + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return arrayList;
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        int i = component2 + 37;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }
}
