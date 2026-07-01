package com.huawei.digitalpayment.consumer.base.http;

import com.huawei.digitalpayment.consumer.base.networkcheck.NetworkCheckManager;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class NetworkCheckInterceptor_MembersInjector implements MembersInjector<NetworkCheckInterceptor> {
    private static int component1 = 1;
    private static int component2;
    private final Provider<NetworkCheckManager> component3;

    @Override
    public void injectMembers(NetworkCheckInterceptor networkCheckInterceptor) {
        int i = 2 % 2;
        int i2 = component1 + 103;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        injectMembers2(networkCheckInterceptor);
        int i4 = component2 + 119;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public NetworkCheckInterceptor_MembersInjector(Provider<NetworkCheckManager> provider) {
        this.component3 = provider;
    }

    public static MembersInjector<NetworkCheckInterceptor> create(Provider<NetworkCheckManager> provider) {
        int i = 2 % 2;
        NetworkCheckInterceptor_MembersInjector networkCheckInterceptor_MembersInjector = new NetworkCheckInterceptor_MembersInjector(provider);
        int i2 = component1 + 81;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return networkCheckInterceptor_MembersInjector;
        }
        throw null;
    }

    public static MembersInjector<NetworkCheckInterceptor> create(javax.inject.Provider<NetworkCheckManager> provider) {
        int i = 2 % 2;
        NetworkCheckInterceptor_MembersInjector networkCheckInterceptor_MembersInjector = new NetworkCheckInterceptor_MembersInjector(Providers.asDaggerProvider(provider));
        int i2 = component2 + 33;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 12 / 0;
        }
        return networkCheckInterceptor_MembersInjector;
    }

    public void injectMembers2(NetworkCheckInterceptor networkCheckInterceptor) {
        int i = 2 % 2;
        int i2 = component2 + 41;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        injectNetworkCheckManager(networkCheckInterceptor, this.component3.get());
        int i4 = component2 + 15;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static void injectNetworkCheckManager(NetworkCheckInterceptor networkCheckInterceptor, NetworkCheckManager networkCheckManager) {
        int i = 2 % 2;
        int i2 = component2 + 11;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        networkCheckInterceptor.networkCheckManager = networkCheckManager;
        if (i3 == 0) {
            int i4 = 27 / 0;
        }
    }
}
