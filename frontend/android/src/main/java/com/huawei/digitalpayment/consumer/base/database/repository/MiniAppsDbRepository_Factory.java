package com.huawei.digitalpayment.consumer.base.database.repository;

import com.huawei.digitalpayment.consumer.base.database.daos.AllowedMiniAppsDao;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class MiniAppsDbRepository_Factory implements Factory<MiniAppsDbRepository> {
    private static int component2 = 1;
    private static int copydefault;
    private final Provider<AllowedMiniAppsDao> ShareDataUIState;

    @Override
    public Object get() {
        MiniAppsDbRepository miniAppsDbRepository;
        int i = 2 % 2;
        int i2 = component2 + 13;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            miniAppsDbRepository = get();
            int i3 = 50 / 0;
        } else {
            miniAppsDbRepository = get();
        }
        int i4 = component2 + 7;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return miniAppsDbRepository;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public MiniAppsDbRepository_Factory(Provider<AllowedMiniAppsDao> provider) {
        this.ShareDataUIState = provider;
    }

    @Override
    public MiniAppsDbRepository get() {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        AllowedMiniAppsDao allowedMiniAppsDao = this.ShareDataUIState.get();
        if (i3 != 0) {
            return newInstance(allowedMiniAppsDao);
        }
        newInstance(allowedMiniAppsDao);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static MiniAppsDbRepository_Factory create(javax.inject.Provider<AllowedMiniAppsDao> provider) {
        int i = 2 % 2;
        MiniAppsDbRepository_Factory miniAppsDbRepository_Factory = new MiniAppsDbRepository_Factory(Providers.asDaggerProvider(provider));
        int i2 = copydefault + 99;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return miniAppsDbRepository_Factory;
        }
        throw null;
    }

    public static MiniAppsDbRepository_Factory create(Provider<AllowedMiniAppsDao> provider) {
        int i = 2 % 2;
        MiniAppsDbRepository_Factory miniAppsDbRepository_Factory = new MiniAppsDbRepository_Factory(provider);
        int i2 = component2 + 77;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 96 / 0;
        }
        return miniAppsDbRepository_Factory;
    }

    public static MiniAppsDbRepository newInstance(AllowedMiniAppsDao allowedMiniAppsDao) {
        int i = 2 % 2;
        MiniAppsDbRepository miniAppsDbRepository = new MiniAppsDbRepository(allowedMiniAppsDao);
        int i2 = copydefault + 43;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return miniAppsDbRepository;
    }
}
