package com.huawei.digitalpayment.consumer.base.database.repository.mtandao;

import com.huawei.digitalpayment.consumer.base.database.daos.mtandao.UserDataDAO;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class UserDataRepository_Factory implements Factory<UserDataRepository> {
    private static int component1 = 1;
    private static int copydefault;
    private final Provider<UserDataDAO> component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 29;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public UserDataRepository_Factory(Provider<UserDataDAO> provider) {
        this.component2 = provider;
    }

    @Override
    public UserDataRepository get() {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        UserDataRepository userDataRepositoryNewInstance = newInstance(this.component2.get());
        int i4 = copydefault + 39;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return userDataRepositoryNewInstance;
        }
        throw null;
    }

    public static UserDataRepository_Factory create(javax.inject.Provider<UserDataDAO> provider) {
        int i = 2 % 2;
        UserDataRepository_Factory userDataRepository_Factory = new UserDataRepository_Factory(Providers.asDaggerProvider(provider));
        int i2 = component1 + 45;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return userDataRepository_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static UserDataRepository_Factory create(Provider<UserDataDAO> provider) {
        int i = 2 % 2;
        UserDataRepository_Factory userDataRepository_Factory = new UserDataRepository_Factory(provider);
        int i2 = copydefault + 59;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return userDataRepository_Factory;
    }

    public static UserDataRepository newInstance(UserDataDAO userDataDAO) {
        int i = 2 % 2;
        UserDataRepository userDataRepository = new UserDataRepository(userDataDAO);
        int i2 = copydefault + 105;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return userDataRepository;
    }
}
