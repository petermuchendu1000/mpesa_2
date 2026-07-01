package com.huawei.digitalpayment.consumer.sfcui.buybundles.repository;

import com.huawei.digitalpayment.consumer.sfcui.api.EasyTalkService;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class EasyTalkRepositoryImpl_Factory implements Factory<EasyTalkRepositoryImpl> {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final Provider<EasyTalkService> component1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        EasyTalkRepositoryImpl easyTalkRepositoryImpl = get();
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        return easyTalkRepositoryImpl;
    }

    public EasyTalkRepositoryImpl_Factory(Provider<EasyTalkService> provider) {
        this.component1 = provider;
    }

    @Override
    public EasyTalkRepositoryImpl get() {
        int i = 2 % 2;
        int i2 = copydefault + 87;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        EasyTalkRepositoryImpl easyTalkRepositoryImplNewInstance = newInstance(this.component1.get());
        int i4 = copydefault + 3;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return easyTalkRepositoryImplNewInstance;
    }

    public static EasyTalkRepositoryImpl_Factory create(javax.inject.Provider<EasyTalkService> provider) {
        int i = 2 % 2;
        EasyTalkRepositoryImpl_Factory easyTalkRepositoryImpl_Factory = new EasyTalkRepositoryImpl_Factory(Providers.asDaggerProvider(provider));
        int i2 = component2 + 53;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return easyTalkRepositoryImpl_Factory;
        }
        throw null;
    }

    public static EasyTalkRepositoryImpl_Factory create(Provider<EasyTalkService> provider) {
        int i = 2 % 2;
        EasyTalkRepositoryImpl_Factory easyTalkRepositoryImpl_Factory = new EasyTalkRepositoryImpl_Factory(provider);
        int i2 = component2 + 23;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return easyTalkRepositoryImpl_Factory;
        }
        throw null;
    }

    public static EasyTalkRepositoryImpl newInstance(EasyTalkService easyTalkService) {
        int i = 2 % 2;
        EasyTalkRepositoryImpl easyTalkRepositoryImpl = new EasyTalkRepositoryImpl(easyTalkService);
        int i2 = component2 + 3;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return easyTalkRepositoryImpl;
        }
        throw null;
    }
}
