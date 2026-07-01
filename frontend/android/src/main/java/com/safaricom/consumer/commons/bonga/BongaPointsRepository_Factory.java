package com.safaricom.consumer.commons.bonga;

import com.safaricom.consumer.commons.api.ConsumerApiLayer;
import com.safaricom.consumer.commons.configuration.ConfigurationRepository;
import com.safaricom.consumer.commons.preference.UserPreferencesRepository;
import com.safaricom.consumer.commons.session.SessionRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class BongaPointsRepository_Factory implements Factory<BongaPointsRepository> {
    private final Provider<UserPreferencesRepository> ShareDataUIState;
    private final Provider<ConfigurationRepository> component2;
    private final Provider<ConsumerApiLayer> component3;
    private final Provider<SessionRepository> copydefault;

    public BongaPointsRepository_Factory(Provider<UserPreferencesRepository> provider, Provider<SessionRepository> provider2, Provider<ConsumerApiLayer> provider3, Provider<ConfigurationRepository> provider4) {
        this.ShareDataUIState = provider;
        this.copydefault = provider2;
        this.component3 = provider3;
        this.component2 = provider4;
    }

    @Override
    public BongaPointsRepository get() {
        return newInstance(this.ShareDataUIState.get(), this.copydefault.get(), this.component3.get(), this.component2.get());
    }

    public static BongaPointsRepository_Factory create(javax.inject.Provider<UserPreferencesRepository> provider, javax.inject.Provider<SessionRepository> provider2, javax.inject.Provider<ConsumerApiLayer> provider3, javax.inject.Provider<ConfigurationRepository> provider4) {
        return new BongaPointsRepository_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4));
    }

    public static BongaPointsRepository_Factory create(Provider<UserPreferencesRepository> provider, Provider<SessionRepository> provider2, Provider<ConsumerApiLayer> provider3, Provider<ConfigurationRepository> provider4) {
        return new BongaPointsRepository_Factory(provider, provider2, provider3, provider4);
    }

    public static BongaPointsRepository newInstance(UserPreferencesRepository userPreferencesRepository, SessionRepository sessionRepository, ConsumerApiLayer consumerApiLayer, ConfigurationRepository configurationRepository) {
        return new BongaPointsRepository(userPreferencesRepository, sessionRepository, consumerApiLayer, configurationRepository);
    }
}
