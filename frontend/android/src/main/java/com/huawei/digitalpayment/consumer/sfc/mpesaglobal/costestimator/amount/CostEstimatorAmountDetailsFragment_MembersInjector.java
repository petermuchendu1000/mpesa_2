package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.amount;

import com.safaricom.consumer.commons.configuration.ConfigurationRepository;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class CostEstimatorAmountDetailsFragment_MembersInjector implements MembersInjector<CostEstimatorAmountDetailsFragment> {
    private static int ShareDataUIState = 1;
    private static int component3;
    private final Provider<ConfigurationRepository> copydefault;

    @Override
    public void injectMembers(CostEstimatorAmountDetailsFragment costEstimatorAmountDetailsFragment) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        injectMembers2(costEstimatorAmountDetailsFragment);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = ShareDataUIState + 43;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public CostEstimatorAmountDetailsFragment_MembersInjector(Provider<ConfigurationRepository> provider) {
        this.copydefault = provider;
    }

    public static MembersInjector<CostEstimatorAmountDetailsFragment> create(Provider<ConfigurationRepository> provider) {
        int i = 2 % 2;
        CostEstimatorAmountDetailsFragment_MembersInjector costEstimatorAmountDetailsFragment_MembersInjector = new CostEstimatorAmountDetailsFragment_MembersInjector(provider);
        int i2 = ShareDataUIState + 27;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return costEstimatorAmountDetailsFragment_MembersInjector;
    }

    public static MembersInjector<CostEstimatorAmountDetailsFragment> create(javax.inject.Provider<ConfigurationRepository> provider) {
        int i = 2 % 2;
        CostEstimatorAmountDetailsFragment_MembersInjector costEstimatorAmountDetailsFragment_MembersInjector = new CostEstimatorAmountDetailsFragment_MembersInjector(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 119;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return costEstimatorAmountDetailsFragment_MembersInjector;
    }

    public void injectMembers2(CostEstimatorAmountDetailsFragment costEstimatorAmountDetailsFragment) {
        int i = 2 % 2;
        int i2 = component3 + 11;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        injectConfigurations(costEstimatorAmountDetailsFragment, this.copydefault.get());
        int i4 = ShareDataUIState + 109;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void injectConfigurations(CostEstimatorAmountDetailsFragment costEstimatorAmountDetailsFragment, ConfigurationRepository configurationRepository) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        costEstimatorAmountDetailsFragment.configurations = configurationRepository;
        int i4 = ShareDataUIState + 109;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
