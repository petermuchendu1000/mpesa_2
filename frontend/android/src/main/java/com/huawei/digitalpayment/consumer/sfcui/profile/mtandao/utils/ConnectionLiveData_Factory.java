package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class ConnectionLiveData_Factory implements Factory<ConnectionLiveData> {
    private static int component2 = 0;
    private static int component3 = 1;
    private final Provider<Context> ShareDataUIState;
    private final Provider<ConnectivityManager> component1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 83;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ConnectionLiveData connectionLiveData = get();
        int i4 = component3 + 67;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
        return connectionLiveData;
    }

    public ConnectionLiveData_Factory(Provider<Context> provider, Provider<ConnectivityManager> provider2) {
        this.ShareDataUIState = provider;
        this.component1 = provider2;
    }

    @Override
    public ConnectionLiveData get() {
        ConnectionLiveData connectionLiveDataNewInstance;
        int i = 2 % 2;
        int i2 = component2 + 121;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            connectionLiveDataNewInstance = newInstance(this.ShareDataUIState.get(), this.component1.get());
            int i3 = 42 / 0;
        } else {
            connectionLiveDataNewInstance = newInstance(this.ShareDataUIState.get(), this.component1.get());
        }
        int i4 = component2 + 101;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return connectionLiveDataNewInstance;
    }

    public static ConnectionLiveData_Factory create(javax.inject.Provider<Context> provider, javax.inject.Provider<ConnectivityManager> provider2) {
        int i = 2 % 2;
        ConnectionLiveData_Factory connectionLiveData_Factory = new ConnectionLiveData_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
        int i2 = component2 + 121;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return connectionLiveData_Factory;
        }
        throw null;
    }

    public static ConnectionLiveData_Factory create(Provider<Context> provider, Provider<ConnectivityManager> provider2) {
        int i = 2 % 2;
        ConnectionLiveData_Factory connectionLiveData_Factory = new ConnectionLiveData_Factory(provider, provider2);
        int i2 = component3 + 9;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return connectionLiveData_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ConnectionLiveData newInstance(Context context, ConnectivityManager connectivityManager) {
        int i = 2 % 2;
        ConnectionLiveData connectionLiveData = new ConnectionLiveData(context, connectivityManager);
        int i2 = component3 + 75;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return connectionLiveData;
        }
        throw null;
    }
}
