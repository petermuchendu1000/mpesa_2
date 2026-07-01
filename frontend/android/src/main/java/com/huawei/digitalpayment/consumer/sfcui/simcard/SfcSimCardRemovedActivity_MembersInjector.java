package com.huawei.digitalpayment.consumer.sfcui.simcard;

import com.huawei.digitalpayment.consumer.base.sim.SimCardRemovalManager;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class SfcSimCardRemovedActivity_MembersInjector implements MembersInjector<SfcSimCardRemovedActivity> {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private final Provider<SimCardRemovalManager> component3;

    @Override
    public void injectMembers(SfcSimCardRemovedActivity sfcSimCardRemovedActivity) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        injectMembers2(sfcSimCardRemovedActivity);
        int i4 = copydefault + 103;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    public SfcSimCardRemovedActivity_MembersInjector(Provider<SimCardRemovalManager> provider) {
        this.component3 = provider;
    }

    public static MembersInjector<SfcSimCardRemovedActivity> create(Provider<SimCardRemovalManager> provider) {
        int i = 2 % 2;
        SfcSimCardRemovedActivity_MembersInjector sfcSimCardRemovedActivity_MembersInjector = new SfcSimCardRemovedActivity_MembersInjector(provider);
        int i2 = copydefault + 75;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return sfcSimCardRemovedActivity_MembersInjector;
    }

    public static MembersInjector<SfcSimCardRemovedActivity> create(javax.inject.Provider<SimCardRemovalManager> provider) {
        int i = 2 % 2;
        SfcSimCardRemovedActivity_MembersInjector sfcSimCardRemovedActivity_MembersInjector = new SfcSimCardRemovedActivity_MembersInjector(Providers.asDaggerProvider(provider));
        int i2 = copydefault + 109;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return sfcSimCardRemovedActivity_MembersInjector;
        }
        throw null;
    }

    public void injectMembers2(SfcSimCardRemovedActivity sfcSimCardRemovedActivity) {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        injectSimCardRemovalManager(sfcSimCardRemovedActivity, this.component3.get());
        int i4 = copydefault + 43;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void injectSimCardRemovalManager(SfcSimCardRemovedActivity sfcSimCardRemovedActivity, SimCardRemovalManager simCardRemovalManager) {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        sfcSimCardRemovedActivity.simCardRemovalManager = simCardRemovalManager;
        int i4 = ShareDataUIState + 81;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
