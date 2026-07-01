package com.huawei.digitalpayment.consumer.base.database.repository.mtandao;

import com.huawei.digitalpayment.consumer.base.database.daos.mtandao.PhoneDataDAO;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class PhoneDataRepository_Factory implements Factory<PhoneDataRepository> {
    private static int component1 = 1;
    private static int component3;
    private final Provider<PhoneDataDAO> copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 7;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            get();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        PhoneDataRepository phoneDataRepository = get();
        int i3 = component1 + 65;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return phoneDataRepository;
    }

    public PhoneDataRepository_Factory(Provider<PhoneDataDAO> provider) {
        this.copydefault = provider;
    }

    @Override
    public PhoneDataRepository get() {
        int i = 2 % 2;
        int i2 = component3 + 95;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        PhoneDataRepository phoneDataRepositoryNewInstance = newInstance(this.copydefault.get());
        int i4 = component3 + 121;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return phoneDataRepositoryNewInstance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static PhoneDataRepository_Factory create(javax.inject.Provider<PhoneDataDAO> provider) {
        int i = 2 % 2;
        PhoneDataRepository_Factory phoneDataRepository_Factory = new PhoneDataRepository_Factory(Providers.asDaggerProvider(provider));
        int i2 = component1 + 99;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return phoneDataRepository_Factory;
        }
        throw null;
    }

    public static PhoneDataRepository_Factory create(Provider<PhoneDataDAO> provider) {
        int i = 2 % 2;
        PhoneDataRepository_Factory phoneDataRepository_Factory = new PhoneDataRepository_Factory(provider);
        int i2 = component3 + 51;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return phoneDataRepository_Factory;
    }

    public static PhoneDataRepository newInstance(PhoneDataDAO phoneDataDAO) {
        int i = 2 % 2;
        PhoneDataRepository phoneDataRepository = new PhoneDataRepository(phoneDataDAO);
        int i2 = component1 + 29;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return phoneDataRepository;
    }
}
