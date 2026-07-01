package com.huawei.digitalpayment.consumer.base.networkcheck;

import android.content.Context;
import android.net.ConnectivityManager;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class GlobalNetworkMonitorObserver_Factory implements Factory<GlobalNetworkMonitorObserver> {
    private static int component1 = 0;
    private static int copydefault = 1;
    private final Provider<ConnectivityManager> ShareDataUIState;
    private final Provider<NetworkCheckManager> component2;
    private final Provider<Context> component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            get();
            throw null;
        }
        GlobalNetworkMonitorObserver globalNetworkMonitorObserver = get();
        int i3 = component1 + 11;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 22 / 0;
        }
        return globalNetworkMonitorObserver;
    }

    public GlobalNetworkMonitorObserver_Factory(Provider<Context> provider, Provider<ConnectivityManager> provider2, Provider<NetworkCheckManager> provider3) {
        this.component3 = provider;
        this.ShareDataUIState = provider2;
        this.component2 = provider3;
    }

    @Override
    public GlobalNetworkMonitorObserver get() {
        int i = 2 % 2;
        int i2 = copydefault + 3;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        GlobalNetworkMonitorObserver globalNetworkMonitorObserverNewInstance = newInstance(this.component3.get(), this.ShareDataUIState.get(), this.component2.get());
        int i4 = component1 + 33;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return globalNetworkMonitorObserverNewInstance;
        }
        throw null;
    }

    public static GlobalNetworkMonitorObserver_Factory create(javax.inject.Provider<Context> provider, javax.inject.Provider<ConnectivityManager> provider2, javax.inject.Provider<NetworkCheckManager> provider3) {
        int i = 2 % 2;
        GlobalNetworkMonitorObserver_Factory globalNetworkMonitorObserver_Factory = new GlobalNetworkMonitorObserver_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
        int i2 = copydefault + 11;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return globalNetworkMonitorObserver_Factory;
    }

    public static GlobalNetworkMonitorObserver_Factory create(Provider<Context> provider, Provider<ConnectivityManager> provider2, Provider<NetworkCheckManager> provider3) {
        int i = 2 % 2;
        GlobalNetworkMonitorObserver_Factory globalNetworkMonitorObserver_Factory = new GlobalNetworkMonitorObserver_Factory(provider, provider2, provider3);
        int i2 = component1 + 75;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return globalNetworkMonitorObserver_Factory;
    }

    public static GlobalNetworkMonitorObserver newInstance(Context context, ConnectivityManager connectivityManager, NetworkCheckManager networkCheckManager) {
        int i = 2 % 2;
        GlobalNetworkMonitorObserver globalNetworkMonitorObserver = new GlobalNetworkMonitorObserver(context, connectivityManager, networkCheckManager);
        int i2 = copydefault + 83;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return globalNetworkMonitorObserver;
    }
}
