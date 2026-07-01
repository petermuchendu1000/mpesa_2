package com.huawei.digitalpayment.consumer.base.database.di;

import android.content.Context;
import com.huawei.digitalpayment.consumer.base.database.AppDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class AppDatabaseModule_ProvideAppDatabaseFactory implements Factory<AppDatabase> {
    private static int ShareDataUIState = 1;
    private static int component2;
    private final Provider<Context> copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 7;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        AppDatabase appDatabase = get();
        int i4 = component2 + 3;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return appDatabase;
    }

    public AppDatabaseModule_ProvideAppDatabaseFactory(Provider<Context> provider) {
        this.copydefault = provider;
    }

    @Override
    public AppDatabase get() {
        AppDatabase appDatabaseProvideAppDatabase;
        int i = 2 % 2;
        int i2 = component2 + 103;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            appDatabaseProvideAppDatabase = provideAppDatabase(this.copydefault.get());
            int i3 = 0 / 0;
        } else {
            appDatabaseProvideAppDatabase = provideAppDatabase(this.copydefault.get());
        }
        int i4 = component2 + 23;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return appDatabaseProvideAppDatabase;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static AppDatabaseModule_ProvideAppDatabaseFactory create(javax.inject.Provider<Context> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideAppDatabaseFactory appDatabaseModule_ProvideAppDatabaseFactory = new AppDatabaseModule_ProvideAppDatabaseFactory(Providers.asDaggerProvider(provider));
        int i2 = component2 + 89;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return appDatabaseModule_ProvideAppDatabaseFactory;
    }

    public static AppDatabaseModule_ProvideAppDatabaseFactory create(Provider<Context> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideAppDatabaseFactory appDatabaseModule_ProvideAppDatabaseFactory = new AppDatabaseModule_ProvideAppDatabaseFactory(provider);
        int i2 = component2 + 11;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return appDatabaseModule_ProvideAppDatabaseFactory;
    }

    public static AppDatabase provideAppDatabase(Context context) {
        int i = 2 % 2;
        int i2 = component2 + 25;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        AppDatabase appDatabase = (AppDatabase) Preconditions.checkNotNullFromProvides(AppDatabaseModule.INSTANCE.provideAppDatabase(context));
        int i4 = ShareDataUIState + 29;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return appDatabase;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
