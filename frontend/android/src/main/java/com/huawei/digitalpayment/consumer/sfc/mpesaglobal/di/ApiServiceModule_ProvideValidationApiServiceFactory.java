package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.di;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.ValidationApiService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ApiServiceModule_ProvideValidationApiServiceFactory implements Factory<ValidationApiService> {
    private static int component1 = 1;
    private static int copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return get();
        }
        get();
        throw null;
    }

    @Override
    public ValidationApiService get() {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return provideValidationApiService();
        }
        provideValidationApiService();
        throw null;
    }

    public static ApiServiceModule_ProvideValidationApiServiceFactory create() {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ApiServiceModule_ProvideValidationApiServiceFactory apiServiceModule_ProvideValidationApiServiceFactory = copydefault.ShareDataUIState;
        int i4 = component1 + 83;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return apiServiceModule_ProvideValidationApiServiceFactory;
        }
        throw null;
    }

    public static ValidationApiService provideValidationApiService() {
        int i = 2 % 2;
        int i2 = component1 + 15;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ValidationApiService validationApiService = (ValidationApiService) Preconditions.checkNotNullFromProvides(ApiServiceModule.INSTANCE.provideValidationApiService());
        int i4 = component1 + 65;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return validationApiService;
    }

    static final class copydefault {
        static final ApiServiceModule_ProvideValidationApiServiceFactory ShareDataUIState = new ApiServiceModule_ProvideValidationApiServiceFactory();
        private static int component2 = 1;
        private static int component3;

        private copydefault() {
        }

        static {
            int i = component2 + 25;
            component3 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }
}
