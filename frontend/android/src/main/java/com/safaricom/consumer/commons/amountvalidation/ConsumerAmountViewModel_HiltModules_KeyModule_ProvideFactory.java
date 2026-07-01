package com.safaricom.consumer.commons.amountvalidation;

import com.safaricom.consumer.commons.amountvalidation.ConsumerAmountViewModel_HiltModules;
import dagger.internal.Factory;

public final class ConsumerAmountViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static ConsumerAmountViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return component1.component1;
    }

    public static boolean provide() {
        return ConsumerAmountViewModel_HiltModules.KeyModule.provide();
    }

    static final class component1 {
        static final ConsumerAmountViewModel_HiltModules_KeyModule_ProvideFactory component1 = new ConsumerAmountViewModel_HiltModules_KeyModule_ProvideFactory();

        private component1() {
        }
    }
}
