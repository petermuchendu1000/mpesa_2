package com.huawei.digitalpayment.consumer.base.util;

import com.huawei.digitalpayment.consumer.base.database.repository.mtandao.ComplaintsDataRepository;
import com.huawei.digitalpayment.consumer.base.database.repository.mtandao.LogsDataRepository;
import com.huawei.digitalpayment.consumer.base.database.repository.mtandao.PhoneDataRepository;
import com.huawei.digitalpayment.consumer.base.database.repository.mtandao.UserDataRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class PhoneDataSender_Factory implements Factory<PhoneDataSender> {
    private static int component1 = 0;
    private static int getRequestBeneficiariesState = 1;
    private final Provider<LogsDataRepository> ShareDataUIState;
    private final Provider<UserDataRepository> component2;
    private final Provider<ComplaintsDataRepository> component3;
    private final Provider<PhoneDataRepository> copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 101;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        PhoneDataSender phoneDataSender = get();
        int i4 = getRequestBeneficiariesState + 1;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return phoneDataSender;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public PhoneDataSender_Factory(Provider<PhoneDataRepository> provider, Provider<UserDataRepository> provider2, Provider<ComplaintsDataRepository> provider3, Provider<LogsDataRepository> provider4) {
        this.copydefault = provider;
        this.component2 = provider2;
        this.component3 = provider3;
        this.ShareDataUIState = provider4;
    }

    @Override
    public PhoneDataSender get() {
        int i = 2 % 2;
        int i2 = component1 + 41;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        PhoneDataSender phoneDataSenderNewInstance = newInstance(this.copydefault.get(), this.component2.get(), this.component3.get(), this.ShareDataUIState.get());
        int i4 = component1 + 69;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
        return phoneDataSenderNewInstance;
    }

    public static PhoneDataSender_Factory create(javax.inject.Provider<PhoneDataRepository> provider, javax.inject.Provider<UserDataRepository> provider2, javax.inject.Provider<ComplaintsDataRepository> provider3, javax.inject.Provider<LogsDataRepository> provider4) {
        int i = 2 % 2;
        PhoneDataSender_Factory phoneDataSender_Factory = new PhoneDataSender_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4));
        int i2 = getRequestBeneficiariesState + 15;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return phoneDataSender_Factory;
    }

    public static PhoneDataSender_Factory create(Provider<PhoneDataRepository> provider, Provider<UserDataRepository> provider2, Provider<ComplaintsDataRepository> provider3, Provider<LogsDataRepository> provider4) {
        int i = 2 % 2;
        PhoneDataSender_Factory phoneDataSender_Factory = new PhoneDataSender_Factory(provider, provider2, provider3, provider4);
        int i2 = getRequestBeneficiariesState + 103;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return phoneDataSender_Factory;
        }
        throw null;
    }

    public static PhoneDataSender newInstance(PhoneDataRepository phoneDataRepository, UserDataRepository userDataRepository, ComplaintsDataRepository complaintsDataRepository, LogsDataRepository logsDataRepository) {
        int i = 2 % 2;
        PhoneDataSender phoneDataSender = new PhoneDataSender(phoneDataRepository, userDataRepository, complaintsDataRepository, logsDataRepository);
        int i2 = getRequestBeneficiariesState + 45;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 21 / 0;
        }
        return phoneDataSender;
    }
}
