package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.di;

import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/di/DispatcherModule;", "", "<init>", "()V", "provideIoDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "provideMainDispatcher", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Module
public final class DispatcherModule {
    public static final int $stable = 0;
    public static final DispatcherModule INSTANCE = new DispatcherModule();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;

    private DispatcherModule() {
    }

    @Provides
    public final CoroutineDispatcher provideIoDispatcher() {
        int i = 2 % 2;
        int i2 = component1 + 93;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        CoroutineDispatcher io2 = Dispatchers.getIO();
        int i4 = component1 + 81;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return io2;
    }

    @Provides
    public final CoroutineDispatcher provideMainDispatcher() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            Dispatchers.getMain();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MainCoroutineDispatcher main = Dispatchers.getMain();
        int i3 = component1 + 73;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 48 / 0;
        }
        return main;
    }

    static {
        int i = component3 + 19;
        component2 = i % 128;
        int i2 = i % 2;
    }
}
