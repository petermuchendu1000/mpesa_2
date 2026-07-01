package com.huawei.digitalpayment.consumer.remoteconfig.di;

import com.huawei.digitalpayment.consumer.remoteconfig.service.FirebaseNotificationService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ServiceModule_ProvideFirebaseNotificationServiceFactory implements Factory<FirebaseNotificationService> {
    private static int ShareDataUIState = 1;
    private static int component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 45;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FirebaseNotificationService firebaseNotificationService = get();
        int i4 = ShareDataUIState + 85;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return firebaseNotificationService;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public FirebaseNotificationService get() {
        int i = 2 % 2;
        int i2 = component2 + 51;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FirebaseNotificationService firebaseNotificationServiceProvideFirebaseNotificationService = provideFirebaseNotificationService();
        int i4 = ShareDataUIState + 25;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 23 / 0;
        }
        return firebaseNotificationServiceProvideFirebaseNotificationService;
    }

    public static ServiceModule_ProvideFirebaseNotificationServiceFactory create() {
        int i = 2 % 2;
        int i2 = component2 + 73;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ServiceModule_ProvideFirebaseNotificationServiceFactory serviceModule_ProvideFirebaseNotificationServiceFactory = copydefault.component1;
        int i4 = component2 + 15;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return serviceModule_ProvideFirebaseNotificationServiceFactory;
        }
        throw null;
    }

    public static FirebaseNotificationService provideFirebaseNotificationService() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FirebaseNotificationService firebaseNotificationService = (FirebaseNotificationService) Preconditions.checkNotNullFromProvides(ServiceModule.INSTANCE.provideFirebaseNotificationService());
        if (i3 == 0) {
            return firebaseNotificationService;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class copydefault {
        private static int ShareDataUIState = 1;
        static final ServiceModule_ProvideFirebaseNotificationServiceFactory component1 = new ServiceModule_ProvideFirebaseNotificationServiceFactory();
        private static int copydefault;

        private copydefault() {
        }

        static {
            int i = copydefault + 123;
            ShareDataUIState = i % 128;
            if (i % 2 == 0) {
                int i2 = 77 / 0;
            }
        }
    }
}
