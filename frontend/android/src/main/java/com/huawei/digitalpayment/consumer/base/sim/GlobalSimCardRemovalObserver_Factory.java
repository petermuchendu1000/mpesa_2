package com.huawei.digitalpayment.consumer.base.sim;

import android.content.Context;
import com.huawei.digitalpayment.consumer.base.database.AppDatabase;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class GlobalSimCardRemovalObserver_Factory implements Factory<GlobalSimCardRemovalObserver> {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private final Provider<SimCardRemovalManager> component1;
    private final Provider<Context> component3;
    private final Provider<AppDatabase> copydefault;

    @Override
    public Object get() {
        GlobalSimCardRemovalObserver globalSimCardRemovalObserver;
        int i = 2 % 2;
        int i2 = component2 + 19;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            globalSimCardRemovalObserver = get();
            int i3 = 64 / 0;
        } else {
            globalSimCardRemovalObserver = get();
        }
        int i4 = ShareDataUIState + 23;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return globalSimCardRemovalObserver;
    }

    public GlobalSimCardRemovalObserver_Factory(Provider<Context> provider, Provider<AppDatabase> provider2, Provider<SimCardRemovalManager> provider3) {
        this.component3 = provider;
        this.copydefault = provider2;
        this.component1 = provider3;
    }

    @Override
    public GlobalSimCardRemovalObserver get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Context context = this.component3.get();
        if (i3 != 0) {
            return newInstance(context, this.copydefault.get(), this.component1.get());
        }
        newInstance(context, this.copydefault.get(), this.component1.get());
        throw null;
    }

    public static GlobalSimCardRemovalObserver_Factory create(javax.inject.Provider<Context> provider, javax.inject.Provider<AppDatabase> provider2, javax.inject.Provider<SimCardRemovalManager> provider3) {
        int i = 2 % 2;
        GlobalSimCardRemovalObserver_Factory globalSimCardRemovalObserver_Factory = new GlobalSimCardRemovalObserver_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
        int i2 = component2 + 65;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 33 / 0;
        }
        return globalSimCardRemovalObserver_Factory;
    }

    public static GlobalSimCardRemovalObserver_Factory create(Provider<Context> provider, Provider<AppDatabase> provider2, Provider<SimCardRemovalManager> provider3) {
        int i = 2 % 2;
        GlobalSimCardRemovalObserver_Factory globalSimCardRemovalObserver_Factory = new GlobalSimCardRemovalObserver_Factory(provider, provider2, provider3);
        int i2 = component2 + 47;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return globalSimCardRemovalObserver_Factory;
    }

    public static GlobalSimCardRemovalObserver newInstance(Context context, AppDatabase appDatabase, SimCardRemovalManager simCardRemovalManager) {
        int i = 2 % 2;
        GlobalSimCardRemovalObserver globalSimCardRemovalObserver = new GlobalSimCardRemovalObserver(context, appDatabase, simCardRemovalManager);
        int i2 = component2 + 41;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return globalSimCardRemovalObserver;
    }
}
