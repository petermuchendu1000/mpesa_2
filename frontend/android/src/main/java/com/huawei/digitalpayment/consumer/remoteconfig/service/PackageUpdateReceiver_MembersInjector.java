package com.huawei.digitalpayment.consumer.remoteconfig.service;

import com.huawei.digitalpayment.consumer.remoteconfig.RemoteConfig;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class PackageUpdateReceiver_MembersInjector implements MembersInjector<PackageUpdateReceiver> {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private final Provider<RemoteConfig> component1;

    @Override
    public void injectMembers(PackageUpdateReceiver packageUpdateReceiver) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        injectMembers2(packageUpdateReceiver);
        int i4 = copydefault + 121;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
    }

    public PackageUpdateReceiver_MembersInjector(Provider<RemoteConfig> provider) {
        this.component1 = provider;
    }

    public static MembersInjector<PackageUpdateReceiver> create(Provider<RemoteConfig> provider) {
        int i = 2 % 2;
        PackageUpdateReceiver_MembersInjector packageUpdateReceiver_MembersInjector = new PackageUpdateReceiver_MembersInjector(provider);
        int i2 = ShareDataUIState + 93;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 62 / 0;
        }
        return packageUpdateReceiver_MembersInjector;
    }

    public static MembersInjector<PackageUpdateReceiver> create(javax.inject.Provider<RemoteConfig> provider) {
        int i = 2 % 2;
        PackageUpdateReceiver_MembersInjector packageUpdateReceiver_MembersInjector = new PackageUpdateReceiver_MembersInjector(Providers.asDaggerProvider(provider));
        int i2 = copydefault + 113;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return packageUpdateReceiver_MembersInjector;
        }
        throw null;
    }

    public void injectMembers2(PackageUpdateReceiver packageUpdateReceiver) {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        injectRemoteConfig(packageUpdateReceiver, this.component1.get());
        int i4 = ShareDataUIState + 97;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
    }

    public static void injectRemoteConfig(PackageUpdateReceiver packageUpdateReceiver, RemoteConfig remoteConfig) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        packageUpdateReceiver.remoteConfig = remoteConfig;
        int i4 = ShareDataUIState + 37;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
    }
}
