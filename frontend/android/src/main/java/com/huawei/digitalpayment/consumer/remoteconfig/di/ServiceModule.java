package com.huawei.digitalpayment.consumer.remoteconfig.di;

import com.huawei.digitalpayment.consumer.remoteconfig.service.FirebaseNotificationService;
import com.huawei.digitalpayment.consumer.remoteconfig.service.PackageUpdateReceiver;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/remoteconfig/di/ServiceModule;", "", "<init>", "()V", "provideFirebaseNotificationService", "Lcom/huawei/digitalpayment/consumer/remoteconfig/service/FirebaseNotificationService;", "provideUpdateReceiver", "Lcom/huawei/digitalpayment/consumer/remoteconfig/service/PackageUpdateReceiver;", "ConsumerSfcRemoteConfig_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Module
public final class ServiceModule {
    public static final ServiceModule INSTANCE = new ServiceModule();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault;

    private ServiceModule() {
    }

    @Provides
    @Singleton
    public final FirebaseNotificationService provideFirebaseNotificationService() {
        int i = 2 % 2;
        FirebaseNotificationService firebaseNotificationService = new FirebaseNotificationService();
        int i2 = copydefault + 77;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return firebaseNotificationService;
    }

    @Provides
    @Singleton
    public final PackageUpdateReceiver provideUpdateReceiver() {
        int i = 2 % 2;
        PackageUpdateReceiver packageUpdateReceiver = new PackageUpdateReceiver();
        int i2 = ShareDataUIState + 125;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return packageUpdateReceiver;
        }
        throw null;
    }

    static {
        int i = component2 + 101;
        component1 = i % 128;
        int i2 = i % 2;
    }
}
