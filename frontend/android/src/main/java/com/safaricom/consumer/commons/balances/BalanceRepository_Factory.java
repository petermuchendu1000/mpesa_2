package com.safaricom.consumer.commons.balances;

import dagger.internal.Factory;

public final class BalanceRepository_Factory implements Factory<BalanceRepository> {
    @Override
    public BalanceRepository get() {
        return newInstance();
    }

    public static BalanceRepository_Factory create() {
        return component3.ShareDataUIState;
    }

    public static BalanceRepository newInstance() {
        return new BalanceRepository();
    }

    static final class component3 {
        static final BalanceRepository_Factory ShareDataUIState = new BalanceRepository_Factory();

        private component3() {
        }
    }
}
