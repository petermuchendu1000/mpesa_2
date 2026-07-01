package com.huawei.digitalpayment.consumer.remoteconfig.service;

import com.huawei.digitalpayment.consumer.remoteconfig.RemoteConfig;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class FirebaseNotificationService_MembersInjector implements MembersInjector<FirebaseNotificationService> {
    private static int component1 = 0;
    private static int component3 = 1;
    private final Provider<RemoteConfig> component2;

    @Override
    public void injectMembers(FirebaseNotificationService firebaseNotificationService) {
        int i = 2 % 2;
        int i2 = component3 + 107;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        injectMembers2(firebaseNotificationService);
        if (i3 != 0) {
            throw null;
        }
    }

    public FirebaseNotificationService_MembersInjector(Provider<RemoteConfig> provider) {
        this.component2 = provider;
    }

    public static MembersInjector<FirebaseNotificationService> create(Provider<RemoteConfig> provider) {
        int i = 2 % 2;
        FirebaseNotificationService_MembersInjector firebaseNotificationService_MembersInjector = new FirebaseNotificationService_MembersInjector(provider);
        int i2 = component1 + 49;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return firebaseNotificationService_MembersInjector;
    }

    public static MembersInjector<FirebaseNotificationService> create(javax.inject.Provider<RemoteConfig> provider) {
        int i = 2 % 2;
        FirebaseNotificationService_MembersInjector firebaseNotificationService_MembersInjector = new FirebaseNotificationService_MembersInjector(Providers.asDaggerProvider(provider));
        int i2 = component3 + 71;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return firebaseNotificationService_MembersInjector;
    }

    public void injectMembers2(FirebaseNotificationService firebaseNotificationService) {
        int i = 2 % 2;
        int i2 = component3 + 91;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        injectRemoteConfig(firebaseNotificationService, this.component2.get());
        int i4 = component3 + 11;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
    }

    public static void injectRemoteConfig(FirebaseNotificationService firebaseNotificationService, RemoteConfig remoteConfig) {
        int i = 2 % 2;
        int i2 = component3 + 79;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        firebaseNotificationService.remoteConfig = remoteConfig;
        int i4 = component1 + 59;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }
}
