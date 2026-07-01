package com.huawei.digitalpayment.consumer.risk.vm;

import com.huawei.digitalpayment.consumer.risk.model.DefaultRiskModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class RiskViewModel_Factory implements Factory<RiskViewModel> {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private final Provider<DefaultRiskModel> component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 105;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        RiskViewModel riskViewModel = get();
        int i4 = component3 + 7;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return riskViewModel;
    }

    public RiskViewModel_Factory(Provider<DefaultRiskModel> provider) {
        this.component2 = provider;
    }

    @Override
    public RiskViewModel get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        RiskViewModel riskViewModelNewInstance = newInstance(this.component2.get());
        int i4 = ShareDataUIState + 111;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
        return riskViewModelNewInstance;
    }

    public static RiskViewModel_Factory create(javax.inject.Provider<DefaultRiskModel> provider) {
        int i = 2 % 2;
        RiskViewModel_Factory riskViewModel_Factory = new RiskViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 39;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return riskViewModel_Factory;
    }

    public static RiskViewModel_Factory create(Provider<DefaultRiskModel> provider) {
        int i = 2 % 2;
        RiskViewModel_Factory riskViewModel_Factory = new RiskViewModel_Factory(provider);
        int i2 = component3 + 97;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return riskViewModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static RiskViewModel newInstance(DefaultRiskModel defaultRiskModel) {
        int i = 2 % 2;
        RiskViewModel riskViewModel = new RiskViewModel(defaultRiskModel);
        int i2 = ShareDataUIState + 45;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return riskViewModel;
        }
        throw null;
    }
}
