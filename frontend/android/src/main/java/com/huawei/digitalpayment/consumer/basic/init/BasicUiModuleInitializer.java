package com.huawei.digitalpayment.consumer.basic.init;

import android.content.Context;
import androidx.startup.Initializer;
import com.alibaba.ariver.engine.common.track.watchdog.ARiverTrackWatchDogEventConstant;
import com.huawei.biometric.util.BiometricHelper2;
import com.huawei.common.module.UserLifecycleManager;
import com.huawei.digitalpayment.consumer.basic.ui.service.PaymentBiometricIml;
import com.safaricom.mpesa.logging.L;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001c\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00010\n0\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basic/init/BasicUiModuleInitializer;", "Landroidx/startup/Initializer;", "", "<init>", "()V", ARiverTrackWatchDogEventConstant.FLAG_START_UP_CREATE, "context", "Landroid/content/Context;", "dependencies", "", "Ljava/lang/Class;", "ConsumerBasicUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BasicUiModuleInitializer implements Initializer<String> {
    public static final int $stable = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;

    @Override
    public String create(Context context) {
        int i = 2 % 2;
        int i2 = component1 + 5;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String strCreate = create(context);
        int i4 = component1 + 59;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
        return strCreate;
    }

    @Override
    public String create(Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        L.INSTANCE.d("BasicUiModuleInitializer", "BasicUiModuleInitializer init", new Object[0]);
        BiometricHelper2.getInstance().setBiometricInterface(new PaymentBiometricIml());
        UserLifecycleManager.get().addUserLifecycleListener(new BasicUiLifecycle());
        int i2 = component1 + 17;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return "";
    }

    @Override
    public List<Class<? extends Initializer<?>>> dependencies() {
        int i = 2 % 2;
        int i2 = component3 + 125;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        List<Class<? extends Initializer<?>>> listEmptyList = CollectionsKt.emptyList();
        int i4 = component1 + 45;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return listEmptyList;
    }

    static {
        int i = 1 + 83;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
