package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class MtandaoModule_ProvideConnectivityManagerFactory implements Factory<ConnectivityManager> {
    private static int component1 = 1;
    private static int copydefault;
    private final Provider<Context> ShareDataUIState;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 37;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ConnectivityManager connectivityManager = get();
        if (i3 != 0) {
            int i4 = 37 / 0;
        }
        return connectivityManager;
    }

    public MtandaoModule_ProvideConnectivityManagerFactory(Provider<Context> provider) {
        this.ShareDataUIState = provider;
    }

    @Override
    public ConnectivityManager get() {
        int i = 2 % 2;
        int i2 = component1 + 23;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ConnectivityManager connectivityManagerProvideConnectivityManager = provideConnectivityManager(this.ShareDataUIState.get());
        int i4 = copydefault + 63;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
        return connectivityManagerProvideConnectivityManager;
    }

    public static MtandaoModule_ProvideConnectivityManagerFactory create(javax.inject.Provider<Context> provider) {
        int i = 2 % 2;
        MtandaoModule_ProvideConnectivityManagerFactory mtandaoModule_ProvideConnectivityManagerFactory = new MtandaoModule_ProvideConnectivityManagerFactory(Providers.asDaggerProvider(provider));
        int i2 = copydefault + 21;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return mtandaoModule_ProvideConnectivityManagerFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static MtandaoModule_ProvideConnectivityManagerFactory create(Provider<Context> provider) {
        int i = 2 % 2;
        MtandaoModule_ProvideConnectivityManagerFactory mtandaoModule_ProvideConnectivityManagerFactory = new MtandaoModule_ProvideConnectivityManagerFactory(provider);
        int i2 = copydefault + 111;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return mtandaoModule_ProvideConnectivityManagerFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ConnectivityManager provideConnectivityManager(Context context) {
        int i = 2 % 2;
        int i2 = component1 + 65;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ConnectivityManager connectivityManager = (ConnectivityManager) Preconditions.checkNotNullFromProvides(MtandaoModule.INSTANCE.provideConnectivityManager(context));
        if (i3 == 0) {
            return connectivityManager;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
