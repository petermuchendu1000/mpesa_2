package com.huawei.digitalpayment.consumer.manageandviewdata.di;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class ApplicationModule_ProvidesDataUsageManagerFactory implements Factory<DataUsageInitializer> {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private final Provider<Context> copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DataUsageInitializer dataUsageInitializer = get();
        int i4 = ShareDataUIState + 65;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return dataUsageInitializer;
    }

    public ApplicationModule_ProvidesDataUsageManagerFactory(Provider<Context> provider) {
        this.copydefault = provider;
    }

    @Override
    public DataUsageInitializer get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Context context = this.copydefault.get();
        if (i3 != 0) {
            return providesDataUsageManager(context);
        }
        providesDataUsageManager(context);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ApplicationModule_ProvidesDataUsageManagerFactory create(javax.inject.Provider<Context> provider) {
        int i = 2 % 2;
        ApplicationModule_ProvidesDataUsageManagerFactory applicationModule_ProvidesDataUsageManagerFactory = new ApplicationModule_ProvidesDataUsageManagerFactory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 115;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return applicationModule_ProvidesDataUsageManagerFactory;
    }

    public static ApplicationModule_ProvidesDataUsageManagerFactory create(Provider<Context> provider) {
        int i = 2 % 2;
        ApplicationModule_ProvidesDataUsageManagerFactory applicationModule_ProvidesDataUsageManagerFactory = new ApplicationModule_ProvidesDataUsageManagerFactory(provider);
        int i2 = ShareDataUIState + 89;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return applicationModule_ProvidesDataUsageManagerFactory;
    }

    public static DataUsageInitializer providesDataUsageManager(Context context) {
        int i = 2 % 2;
        int i2 = component1 + 21;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DataUsageInitializer dataUsageInitializer = (DataUsageInitializer) Preconditions.checkNotNullFromProvides(ApplicationModule.INSTANCE.providesDataUsageManager(context));
        int i4 = component1 + 63;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return dataUsageInitializer;
        }
        throw null;
    }
}
