package com.huawei.digitalpayment.consumer.base.database.repository.mtandao;

import com.huawei.digitalpayment.consumer.base.database.daos.mtandao.ComplaintsDataDAO;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class ComplaintsDataRepository_Factory implements Factory<ComplaintsDataRepository> {
    private static int component1 = 0;
    private static int component3 = 1;
    private final Provider<ComplaintsDataDAO> ShareDataUIState;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 107;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ComplaintsDataRepository complaintsDataRepository = get();
        int i4 = component1 + 119;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 66 / 0;
        }
        return complaintsDataRepository;
    }

    public ComplaintsDataRepository_Factory(Provider<ComplaintsDataDAO> provider) {
        this.ShareDataUIState = provider;
    }

    @Override
    public ComplaintsDataRepository get() {
        int i = 2 % 2;
        int i2 = component1 + 57;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            newInstance(this.ShareDataUIState.get());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ComplaintsDataRepository complaintsDataRepositoryNewInstance = newInstance(this.ShareDataUIState.get());
        int i3 = component3 + 31;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return complaintsDataRepositoryNewInstance;
    }

    public static ComplaintsDataRepository_Factory create(javax.inject.Provider<ComplaintsDataDAO> provider) {
        int i = 2 % 2;
        ComplaintsDataRepository_Factory complaintsDataRepository_Factory = new ComplaintsDataRepository_Factory(Providers.asDaggerProvider(provider));
        int i2 = component3 + 61;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return complaintsDataRepository_Factory;
    }

    public static ComplaintsDataRepository_Factory create(Provider<ComplaintsDataDAO> provider) {
        int i = 2 % 2;
        ComplaintsDataRepository_Factory complaintsDataRepository_Factory = new ComplaintsDataRepository_Factory(provider);
        int i2 = component1 + 43;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return complaintsDataRepository_Factory;
    }

    public static ComplaintsDataRepository newInstance(ComplaintsDataDAO complaintsDataDAO) {
        int i = 2 % 2;
        ComplaintsDataRepository complaintsDataRepository = new ComplaintsDataRepository(complaintsDataDAO);
        int i2 = component1 + 91;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return complaintsDataRepository;
    }
}
