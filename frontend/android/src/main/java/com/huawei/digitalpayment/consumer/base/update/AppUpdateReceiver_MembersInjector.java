package com.huawei.digitalpayment.consumer.base.update;

import com.huawei.digitalpayment.consumer.base.database.AppDatabase;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class AppUpdateReceiver_MembersInjector implements MembersInjector<AppUpdateReceiver> {
    private static int component3 = 1;
    private static int copydefault;
    private final Provider<AppDatabase> component2;

    @Override
    public void injectMembers(AppUpdateReceiver appUpdateReceiver) {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        injectMembers2(appUpdateReceiver);
        int i4 = component3 + 35;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public AppUpdateReceiver_MembersInjector(Provider<AppDatabase> provider) {
        this.component2 = provider;
    }

    public static MembersInjector<AppUpdateReceiver> create(Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppUpdateReceiver_MembersInjector appUpdateReceiver_MembersInjector = new AppUpdateReceiver_MembersInjector(provider);
        int i2 = copydefault + 1;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 68 / 0;
        }
        return appUpdateReceiver_MembersInjector;
    }

    public static MembersInjector<AppUpdateReceiver> create(javax.inject.Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppUpdateReceiver_MembersInjector appUpdateReceiver_MembersInjector = new AppUpdateReceiver_MembersInjector(Providers.asDaggerProvider(provider));
        int i2 = component3 + 5;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return appUpdateReceiver_MembersInjector;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void injectMembers2(AppUpdateReceiver appUpdateReceiver) {
        int i = 2 % 2;
        int i2 = component3 + 25;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            injectAppDatabase(appUpdateReceiver, this.component2.get());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        injectAppDatabase(appUpdateReceiver, this.component2.get());
        int i3 = copydefault + 57;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 0 / 0;
        }
    }

    public static void injectAppDatabase(AppUpdateReceiver appUpdateReceiver, AppDatabase appDatabase) {
        int i = 2 % 2;
        int i2 = component3 + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        appUpdateReceiver.appDatabase = appDatabase;
        if (i3 != 0) {
            throw null;
        }
    }
}
