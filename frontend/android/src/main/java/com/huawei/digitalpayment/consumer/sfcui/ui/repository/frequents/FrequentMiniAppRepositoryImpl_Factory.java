package com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents;

import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class FrequentMiniAppRepositoryImpl_Factory implements Factory<FrequentMiniAppRepositoryImpl> {
    private static int component1 = 1;
    private static int copydefault;
    private final Provider<FrequentsLocalDatasource> component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FrequentMiniAppRepositoryImpl frequentMiniAppRepositoryImpl = get();
        int i4 = copydefault + 69;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return frequentMiniAppRepositoryImpl;
        }
        throw null;
    }

    public FrequentMiniAppRepositoryImpl_Factory(Provider<FrequentsLocalDatasource> provider) {
        this.component3 = provider;
    }

    @Override
    public FrequentMiniAppRepositoryImpl get() {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FrequentMiniAppRepositoryImpl frequentMiniAppRepositoryImplNewInstance = newInstance(this.component3.get());
        int i4 = component1 + 65;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return frequentMiniAppRepositoryImplNewInstance;
        }
        throw null;
    }

    public static FrequentMiniAppRepositoryImpl_Factory create(javax.inject.Provider<FrequentsLocalDatasource> provider) {
        int i = 2 % 2;
        FrequentMiniAppRepositoryImpl_Factory frequentMiniAppRepositoryImpl_Factory = new FrequentMiniAppRepositoryImpl_Factory(Providers.asDaggerProvider(provider));
        int i2 = component1 + 5;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return frequentMiniAppRepositoryImpl_Factory;
    }

    public static FrequentMiniAppRepositoryImpl_Factory create(Provider<FrequentsLocalDatasource> provider) {
        int i = 2 % 2;
        FrequentMiniAppRepositoryImpl_Factory frequentMiniAppRepositoryImpl_Factory = new FrequentMiniAppRepositoryImpl_Factory(provider);
        int i2 = component1 + 37;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return frequentMiniAppRepositoryImpl_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FrequentMiniAppRepositoryImpl newInstance(FrequentsLocalDatasource frequentsLocalDatasource) {
        int i = 2 % 2;
        FrequentMiniAppRepositoryImpl frequentMiniAppRepositoryImpl = new FrequentMiniAppRepositoryImpl(frequentsLocalDatasource);
        int i2 = copydefault + 97;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return frequentMiniAppRepositoryImpl;
    }
}
