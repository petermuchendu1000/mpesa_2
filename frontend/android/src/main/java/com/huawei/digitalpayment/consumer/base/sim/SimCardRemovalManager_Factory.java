package com.huawei.digitalpayment.consumer.base.sim;

import com.huawei.digitalpayment.consumer.base.repository.SimCardRemovalRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class SimCardRemovalManager_Factory implements Factory<SimCardRemovalManager> {
    private static int component1 = 0;
    private static int copydefault = 1;
    private final Provider<SimCardRemovalRepository> ShareDataUIState;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        SimCardRemovalManager simCardRemovalManager = get();
        int i4 = copydefault + 125;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return simCardRemovalManager;
        }
        throw null;
    }

    public SimCardRemovalManager_Factory(Provider<SimCardRemovalRepository> provider) {
        this.ShareDataUIState = provider;
    }

    @Override
    public SimCardRemovalManager get() {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            newInstance(this.ShareDataUIState.get());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SimCardRemovalManager simCardRemovalManagerNewInstance = newInstance(this.ShareDataUIState.get());
        int i3 = component1 + 47;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return simCardRemovalManagerNewInstance;
    }

    public static SimCardRemovalManager_Factory create(javax.inject.Provider<SimCardRemovalRepository> provider) {
        int i = 2 % 2;
        SimCardRemovalManager_Factory simCardRemovalManager_Factory = new SimCardRemovalManager_Factory(Providers.asDaggerProvider(provider));
        int i2 = component1 + 125;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return simCardRemovalManager_Factory;
    }

    public static SimCardRemovalManager_Factory create(Provider<SimCardRemovalRepository> provider) {
        int i = 2 % 2;
        SimCardRemovalManager_Factory simCardRemovalManager_Factory = new SimCardRemovalManager_Factory(provider);
        int i2 = copydefault + 77;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return simCardRemovalManager_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static SimCardRemovalManager newInstance(SimCardRemovalRepository simCardRemovalRepository) {
        int i = 2 % 2;
        SimCardRemovalManager simCardRemovalManager = new SimCardRemovalManager(simCardRemovalRepository);
        int i2 = component1 + 109;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return simCardRemovalManager;
    }
}
