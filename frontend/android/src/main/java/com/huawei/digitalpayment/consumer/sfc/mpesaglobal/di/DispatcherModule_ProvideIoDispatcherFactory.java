package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlinx.coroutines.CoroutineDispatcher;

public final class DispatcherModule_ProvideIoDispatcherFactory implements Factory<CoroutineDispatcher> {
    private static int component1 = 1;
    private static int component3;

    @Override
    public Object get() {
        CoroutineDispatcher coroutineDispatcher;
        int i = 2 % 2;
        int i2 = component3 + 35;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            coroutineDispatcher = get();
            int i3 = 22 / 0;
        } else {
            coroutineDispatcher = get();
        }
        int i4 = component3 + 83;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return coroutineDispatcher;
    }

    @Override
    public CoroutineDispatcher get() {
        int i = 2 % 2;
        int i2 = component1 + 103;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return provideIoDispatcher();
        }
        provideIoDispatcher();
        throw null;
    }

    public static DispatcherModule_ProvideIoDispatcherFactory create() {
        int i = 2 % 2;
        int i2 = component3 + 21;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DispatcherModule_ProvideIoDispatcherFactory dispatcherModule_ProvideIoDispatcherFactory = component1.copydefault;
        if (i3 != 0) {
            return dispatcherModule_ProvideIoDispatcherFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static CoroutineDispatcher provideIoDispatcher() {
        int i = 2 % 2;
        int i2 = component1 + 73;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) Preconditions.checkNotNullFromProvides(DispatcherModule.INSTANCE.provideIoDispatcher());
        if (i3 == 0) {
            return coroutineDispatcher;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class component1 {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;
        static final DispatcherModule_ProvideIoDispatcherFactory copydefault = new DispatcherModule_ProvideIoDispatcherFactory();

        private component1() {
        }

        static {
            int i = ShareDataUIState + 63;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }
}
