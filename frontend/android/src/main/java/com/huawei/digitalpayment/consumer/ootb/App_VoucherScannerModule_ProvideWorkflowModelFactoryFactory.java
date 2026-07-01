package com.huawei.digitalpayment.consumer.ootb;

import androidx.lifecycle.ViewModelProvider;
import com.huawei.digitalpayment.consumer.ootb.App;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class App_VoucherScannerModule_ProvideWorkflowModelFactoryFactory implements Factory<ViewModelProvider.Factory> {
    private static int component2 = 1;
    private static int component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 123;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.Factory factory = get();
        int i4 = component2 + 93;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public ViewModelProvider.Factory get() {
        int i = 2 % 2;
        int i2 = component2 + 93;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.Factory factoryProvideWorkflowModelFactory = provideWorkflowModelFactory();
        int i4 = component2 + 19;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return factoryProvideWorkflowModelFactory;
    }

    public static App_VoucherScannerModule_ProvideWorkflowModelFactoryFactory create() {
        int i = 2 % 2;
        int i2 = component3 + 105;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        App_VoucherScannerModule_ProvideWorkflowModelFactoryFactory app_VoucherScannerModule_ProvideWorkflowModelFactoryFactory = component3.component1;
        int i4 = component3 + 121;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return app_VoucherScannerModule_ProvideWorkflowModelFactoryFactory;
    }

    public static ViewModelProvider.Factory provideWorkflowModelFactory() {
        int i = 2 % 2;
        int i2 = component3 + 45;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.Factory factory = (ViewModelProvider.Factory) Preconditions.checkNotNullFromProvides(App.VoucherScannerModule.provideWorkflowModelFactory());
        if (i3 != 0) {
            return factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class component3 {
        static final App_VoucherScannerModule_ProvideWorkflowModelFactoryFactory component1 = new App_VoucherScannerModule_ProvideWorkflowModelFactoryFactory();
        private static int component2 = 1;
        private static int component3;

        private component3() {
        }

        static {
            int i = component3 + 43;
            component2 = i % 128;
            if (i % 2 == 0) {
                int i2 = 17 / 0;
            }
        }
    }
}
