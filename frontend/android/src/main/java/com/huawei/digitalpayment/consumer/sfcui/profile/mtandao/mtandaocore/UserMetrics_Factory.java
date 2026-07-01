package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore;

import com.huawei.digitalpayment.consumer.base.database.repository.mtandao.UserDataRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class UserMetrics_Factory implements Factory<UserMetrics> {
    private static int component1 = 0;
    private static int component2 = 1;
    private final Provider<UserDataRepository> component3;

    @Override
    public Object get() {
        UserMetrics userMetrics;
        int i = 2 % 2;
        int i2 = component2 + 3;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            userMetrics = get();
            int i3 = 73 / 0;
        } else {
            userMetrics = get();
        }
        int i4 = component1 + 71;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
        return userMetrics;
    }

    public UserMetrics_Factory(Provider<UserDataRepository> provider) {
        this.component3 = provider;
    }

    @Override
    public UserMetrics get() {
        int i = 2 % 2;
        int i2 = component2 + 67;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            newInstance(this.component3.get());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        UserMetrics userMetricsNewInstance = newInstance(this.component3.get());
        int i3 = component2 + 69;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return userMetricsNewInstance;
    }

    public static UserMetrics_Factory create(javax.inject.Provider<UserDataRepository> provider) {
        int i = 2 % 2;
        UserMetrics_Factory userMetrics_Factory = new UserMetrics_Factory(Providers.asDaggerProvider(provider));
        int i2 = component1 + 9;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return userMetrics_Factory;
    }

    public static UserMetrics_Factory create(Provider<UserDataRepository> provider) {
        int i = 2 % 2;
        UserMetrics_Factory userMetrics_Factory = new UserMetrics_Factory(provider);
        int i2 = component2 + 119;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 41 / 0;
        }
        return userMetrics_Factory;
    }

    public static UserMetrics newInstance(UserDataRepository userDataRepository) {
        int i = 2 % 2;
        UserMetrics userMetrics = new UserMetrics(userDataRepository);
        int i2 = component2 + 107;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 31 / 0;
        }
        return userMetrics;
    }
}
