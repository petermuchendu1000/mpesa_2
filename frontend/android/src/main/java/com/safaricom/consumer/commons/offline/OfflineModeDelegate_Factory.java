package com.safaricom.consumer.commons.offline;

import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class OfflineModeDelegate_Factory implements Factory<OfflineModeDelegate> {
    private final Provider<OfflineModeRepository> component1;

    public OfflineModeDelegate_Factory(Provider<OfflineModeRepository> provider) {
        this.component1 = provider;
    }

    @Override
    public OfflineModeDelegate get() {
        return newInstance(this.component1.get());
    }

    public static OfflineModeDelegate_Factory create(javax.inject.Provider<OfflineModeRepository> provider) {
        return new OfflineModeDelegate_Factory(Providers.asDaggerProvider(provider));
    }

    public static OfflineModeDelegate_Factory create(Provider<OfflineModeRepository> provider) {
        return new OfflineModeDelegate_Factory(provider);
    }

    public static OfflineModeDelegate newInstance(OfflineModeRepository offlineModeRepository) {
        return new OfflineModeDelegate(offlineModeRepository);
    }
}
