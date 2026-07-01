package com.huawei.digitalpayment.consumer.remoteconfig.di;

import com.huawei.digitalpayment.consumer.remoteconfig.service.PackageUpdateReceiver;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ServiceModule_ProvideUpdateReceiverFactory implements Factory<PackageUpdateReceiver> {
    private static int component1 = 1;
    private static int component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 73;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            get();
            throw null;
        }
        PackageUpdateReceiver packageUpdateReceiver = get();
        int i3 = component1 + 103;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return packageUpdateReceiver;
        }
        throw null;
    }

    @Override
    public PackageUpdateReceiver get() {
        int i = 2 % 2;
        int i2 = component3 + 29;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            provideUpdateReceiver();
            obj.hashCode();
            throw null;
        }
        PackageUpdateReceiver packageUpdateReceiverProvideUpdateReceiver = provideUpdateReceiver();
        int i3 = component3 + 67;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return packageUpdateReceiverProvideUpdateReceiver;
        }
        throw null;
    }

    public static ServiceModule_ProvideUpdateReceiverFactory create() {
        int i = 2 % 2;
        int i2 = component1 + 47;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ServiceModule_ProvideUpdateReceiverFactory serviceModule_ProvideUpdateReceiverFactory = copydefault.copydefault;
        int i4 = component3 + 71;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return serviceModule_ProvideUpdateReceiverFactory;
    }

    public static PackageUpdateReceiver provideUpdateReceiver() {
        int i = 2 % 2;
        int i2 = component3 + 85;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        PackageUpdateReceiver packageUpdateReceiver = (PackageUpdateReceiver) Preconditions.checkNotNullFromProvides(ServiceModule.INSTANCE.provideUpdateReceiver());
        int i4 = component1 + 103;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return packageUpdateReceiver;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class copydefault {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;
        static final ServiceModule_ProvideUpdateReceiverFactory copydefault = new ServiceModule_ProvideUpdateReceiverFactory();

        private copydefault() {
        }

        static {
            int i = ShareDataUIState + 79;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }
}
