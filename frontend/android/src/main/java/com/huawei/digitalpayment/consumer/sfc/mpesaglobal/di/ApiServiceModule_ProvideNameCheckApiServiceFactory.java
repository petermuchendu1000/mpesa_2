package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.di;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.NameCheckApiService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ApiServiceModule_ProvideNameCheckApiServiceFactory implements Factory<NameCheckApiService> {
    private static int component3 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 61;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        NameCheckApiService nameCheckApiService = get();
        int i4 = component3 + 97;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return nameCheckApiService;
        }
        throw null;
    }

    @Override
    public NameCheckApiService get() {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        NameCheckApiService nameCheckApiServiceProvideNameCheckApiService = provideNameCheckApiService();
        int i4 = copydefault + 17;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return nameCheckApiServiceProvideNameCheckApiService;
    }

    public static ApiServiceModule_ProvideNameCheckApiServiceFactory create() {
        int i = 2 % 2;
        int i2 = copydefault + 33;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ApiServiceModule_ProvideNameCheckApiServiceFactory apiServiceModule_ProvideNameCheckApiServiceFactory = ShareDataUIState.component3;
        int i4 = copydefault + 65;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return apiServiceModule_ProvideNameCheckApiServiceFactory;
    }

    public static NameCheckApiService provideNameCheckApiService() {
        int i = 2 % 2;
        int i2 = component3 + 109;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        NameCheckApiService nameCheckApiService = (NameCheckApiService) Preconditions.checkNotNullFromProvides(ApiServiceModule.INSTANCE.provideNameCheckApiService());
        int i4 = copydefault + 83;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return nameCheckApiService;
    }

    static final class ShareDataUIState {
        private static int ShareDataUIState = 1;
        private static int component2;
        static final ApiServiceModule_ProvideNameCheckApiServiceFactory component3 = new ApiServiceModule_ProvideNameCheckApiServiceFactory();

        private ShareDataUIState() {
        }

        static {
            int i = component2 + 85;
            ShareDataUIState = i % 128;
            if (i % 2 == 0) {
                int i2 = 12 / 0;
            }
        }
    }
}
