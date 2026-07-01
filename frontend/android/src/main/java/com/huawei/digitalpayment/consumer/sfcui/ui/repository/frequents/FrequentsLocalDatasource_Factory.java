package com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents;

import com.huawei.digitalpayment.consumer.base.database.daos.FrequentsDao;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class FrequentsLocalDatasource_Factory implements Factory<FrequentsLocalDatasource> {
    private static int component3 = 1;
    private static int copydefault;
    private final Provider<FrequentsDao> component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 121;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FrequentsLocalDatasource frequentsLocalDatasource = get();
        int i4 = component3 + 69;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return frequentsLocalDatasource;
    }

    public FrequentsLocalDatasource_Factory(Provider<FrequentsDao> provider) {
        this.component2 = provider;
    }

    @Override
    public FrequentsLocalDatasource get() {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FrequentsDao frequentsDao = this.component2.get();
        if (i3 != 0) {
            return newInstance(frequentsDao);
        }
        newInstance(frequentsDao);
        throw null;
    }

    public static FrequentsLocalDatasource_Factory create(javax.inject.Provider<FrequentsDao> provider) {
        int i = 2 % 2;
        FrequentsLocalDatasource_Factory frequentsLocalDatasource_Factory = new FrequentsLocalDatasource_Factory(Providers.asDaggerProvider(provider));
        int i2 = copydefault + 107;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return frequentsLocalDatasource_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FrequentsLocalDatasource_Factory create(Provider<FrequentsDao> provider) {
        int i = 2 % 2;
        FrequentsLocalDatasource_Factory frequentsLocalDatasource_Factory = new FrequentsLocalDatasource_Factory(provider);
        int i2 = component3 + 65;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return frequentsLocalDatasource_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FrequentsLocalDatasource newInstance(FrequentsDao frequentsDao) {
        int i = 2 % 2;
        FrequentsLocalDatasource frequentsLocalDatasource = new FrequentsLocalDatasource(frequentsDao);
        int i2 = copydefault + 55;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return frequentsLocalDatasource;
        }
        throw null;
    }
}
