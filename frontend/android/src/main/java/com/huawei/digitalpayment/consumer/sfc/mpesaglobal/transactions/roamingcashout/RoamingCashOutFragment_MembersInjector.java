package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout;

import com.safaricom.android.design.templates.amountinput.provider.AmountInputDataProvider;
import com.safaricom.android.design.templates.amountinput.provider.FeeCalculator;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class RoamingCashOutFragment_MembersInjector implements MembersInjector<RoamingCashOutFragment> {
    private static int component1 = 1;
    private static int component2;
    private final Provider<FeeCalculator> ShareDataUIState;
    private final Provider<AmountInputDataProvider> copydefault;

    @Override
    public void injectMembers(RoamingCashOutFragment roamingCashOutFragment) {
        int i = 2 % 2;
        int i2 = component2 + 107;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        injectMembers2(roamingCashOutFragment);
        int i4 = component1 + 71;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
    }

    public RoamingCashOutFragment_MembersInjector(Provider<AmountInputDataProvider> provider, Provider<FeeCalculator> provider2) {
        this.copydefault = provider;
        this.ShareDataUIState = provider2;
    }

    public static MembersInjector<RoamingCashOutFragment> create(Provider<AmountInputDataProvider> provider, Provider<FeeCalculator> provider2) {
        int i = 2 % 2;
        RoamingCashOutFragment_MembersInjector roamingCashOutFragment_MembersInjector = new RoamingCashOutFragment_MembersInjector(provider, provider2);
        int i2 = component2 + 61;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return roamingCashOutFragment_MembersInjector;
    }

    public static MembersInjector<RoamingCashOutFragment> create(javax.inject.Provider<AmountInputDataProvider> provider, javax.inject.Provider<FeeCalculator> provider2) {
        int i = 2 % 2;
        RoamingCashOutFragment_MembersInjector roamingCashOutFragment_MembersInjector = new RoamingCashOutFragment_MembersInjector(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
        int i2 = component1 + 25;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return roamingCashOutFragment_MembersInjector;
        }
        throw null;
    }

    public void injectMembers2(RoamingCashOutFragment roamingCashOutFragment) {
        int i = 2 % 2;
        int i2 = component2 + 9;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        injectAmountDataProvider(roamingCashOutFragment, this.copydefault.get());
        injectFeeCalculator(roamingCashOutFragment, this.ShareDataUIState.get());
        int i4 = component1 + 93;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void injectAmountDataProvider(RoamingCashOutFragment roamingCashOutFragment, AmountInputDataProvider amountInputDataProvider) {
        int i = 2 % 2;
        int i2 = component2 + 89;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        roamingCashOutFragment.amountDataProvider = amountInputDataProvider;
        if (i3 == 0) {
            throw null;
        }
        int i4 = component2 + 71;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void injectFeeCalculator(RoamingCashOutFragment roamingCashOutFragment, FeeCalculator feeCalculator) {
        int i = 2 % 2;
        int i2 = component2 + 23;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        roamingCashOutFragment.feeCalculator = feeCalculator;
        if (i3 == 0) {
            throw null;
        }
    }
}
