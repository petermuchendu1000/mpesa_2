package com.safaricom.consumer.commons.overdraw;

import dagger.internal.Factory;

public final class OverdrawRepository_Factory implements Factory<OverdrawRepository> {
    @Override
    public OverdrawRepository get() {
        return newInstance();
    }

    public static OverdrawRepository_Factory create() {
        return component2.component2;
    }

    public static OverdrawRepository newInstance() {
        return new OverdrawRepository();
    }

    static final class component2 {
        static final OverdrawRepository_Factory component2 = new OverdrawRepository_Factory();

        private component2() {
        }
    }
}
