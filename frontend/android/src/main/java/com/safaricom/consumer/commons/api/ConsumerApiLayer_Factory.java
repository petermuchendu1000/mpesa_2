package com.safaricom.consumer.commons.api;

import dagger.internal.Factory;

public final class ConsumerApiLayer_Factory implements Factory<ConsumerApiLayer> {
    @Override
    public ConsumerApiLayer get() {
        return newInstance();
    }

    public static ConsumerApiLayer_Factory create() {
        return component2.component2;
    }

    public static ConsumerApiLayer newInstance() {
        return new ConsumerApiLayer();
    }

    static final class component2 {
        static final ConsumerApiLayer_Factory component2 = new ConsumerApiLayer_Factory();

        private component2() {
        }
    }
}
