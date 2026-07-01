package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlinx.coroutines.CoroutineDispatcher;

public final class DispatcherModule_ProvideMainDispatcherFactory implements Factory<CoroutineDispatcher> {
    private static int component1 = 1;
    private static int copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 93;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        CoroutineDispatcher coroutineDispatcher = get();
        int i4 = component1 + 41;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return coroutineDispatcher;
        }
        throw null;
    }

    @Override
    public CoroutineDispatcher get() {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        CoroutineDispatcher coroutineDispatcherProvideMainDispatcher = provideMainDispatcher();
        int i4 = component1 + 21;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return coroutineDispatcherProvideMainDispatcher;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static DispatcherModule_ProvideMainDispatcherFactory create() {
        int i = 2 % 2;
        int i2 = component1 + 41;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DispatcherModule_ProvideMainDispatcherFactory dispatcherModule_ProvideMainDispatcherFactory = component3.copydefault;
        if (i3 == 0) {
            return dispatcherModule_ProvideMainDispatcherFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static CoroutineDispatcher provideMainDispatcher() {
        int i = 2 % 2;
        int i2 = component1 + 29;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) Preconditions.checkNotNullFromProvides(DispatcherModule.INSTANCE.provideMainDispatcher());
        if (i3 == 0) {
            return coroutineDispatcher;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class component3 {
        private static int component1 = 0;
        private static int component3 = 1;
        static final DispatcherModule_ProvideMainDispatcherFactory copydefault = new DispatcherModule_ProvideMainDispatcherFactory();

        private component3() {
        }

        static {
            int i = component3 + 39;
            component1 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }
}
