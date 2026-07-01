package com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.di;

import com.huawei.digitalpayment.consumer.base.database.daos.FrequentsDao;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentsLocalDatasource;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class FrequentsDataModule_ProvidesFrequentsLocalDatasourceFactory implements Factory<FrequentsLocalDatasource> {
    private static int component3 = 1;
    private static int copydefault;
    private final Provider<FrequentsDao> component1;

    @Override
    public Object get() {
        FrequentsLocalDatasource frequentsLocalDatasource;
        int i = 2 % 2;
        int i2 = copydefault + 117;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            frequentsLocalDatasource = get();
            int i3 = 8 / 0;
        } else {
            frequentsLocalDatasource = get();
        }
        int i4 = component3 + 77;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
        return frequentsLocalDatasource;
    }

    public FrequentsDataModule_ProvidesFrequentsLocalDatasourceFactory(Provider<FrequentsDao> provider) {
        this.component1 = provider;
    }

    @Override
    public FrequentsLocalDatasource get() {
        FrequentsLocalDatasource frequentsLocalDatasourceProvidesFrequentsLocalDatasource;
        int i = 2 % 2;
        int i2 = copydefault + 85;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            frequentsLocalDatasourceProvidesFrequentsLocalDatasource = providesFrequentsLocalDatasource(this.component1.get());
            int i3 = 10 / 0;
        } else {
            frequentsLocalDatasourceProvidesFrequentsLocalDatasource = providesFrequentsLocalDatasource(this.component1.get());
        }
        int i4 = copydefault + 67;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return frequentsLocalDatasourceProvidesFrequentsLocalDatasource;
    }

    public static FrequentsDataModule_ProvidesFrequentsLocalDatasourceFactory create(javax.inject.Provider<FrequentsDao> provider) {
        int i = 2 % 2;
        FrequentsDataModule_ProvidesFrequentsLocalDatasourceFactory frequentsDataModule_ProvidesFrequentsLocalDatasourceFactory = new FrequentsDataModule_ProvidesFrequentsLocalDatasourceFactory(Providers.asDaggerProvider(provider));
        int i2 = component3 + 55;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return frequentsDataModule_ProvidesFrequentsLocalDatasourceFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FrequentsDataModule_ProvidesFrequentsLocalDatasourceFactory create(Provider<FrequentsDao> provider) {
        int i = 2 % 2;
        FrequentsDataModule_ProvidesFrequentsLocalDatasourceFactory frequentsDataModule_ProvidesFrequentsLocalDatasourceFactory = new FrequentsDataModule_ProvidesFrequentsLocalDatasourceFactory(provider);
        int i2 = component3 + 27;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return frequentsDataModule_ProvidesFrequentsLocalDatasourceFactory;
    }

    public static FrequentsLocalDatasource providesFrequentsLocalDatasource(FrequentsDao frequentsDao) {
        FrequentsLocalDatasource frequentsLocalDatasource;
        int i = 2 % 2;
        int i2 = component3 + 55;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            frequentsLocalDatasource = (FrequentsLocalDatasource) Preconditions.checkNotNullFromProvides(FrequentsDataModule.INSTANCE.providesFrequentsLocalDatasource(frequentsDao));
            int i3 = 9 / 0;
        } else {
            frequentsLocalDatasource = (FrequentsLocalDatasource) Preconditions.checkNotNullFromProvides(FrequentsDataModule.INSTANCE.providesFrequentsLocalDatasource(frequentsDao));
        }
        int i4 = component3 + 79;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return frequentsLocalDatasource;
    }
}
