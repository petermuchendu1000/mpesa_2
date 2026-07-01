package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.di;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorMapper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ErrorHandlingModule_ProvideRoamingCashOutErrorMapperFactory implements Factory<ErrorMapper> {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public ErrorMapper get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return provideRoamingCashOutErrorMapper();
        }
        provideRoamingCashOutErrorMapper();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ErrorHandlingModule_ProvideRoamingCashOutErrorMapperFactory create() {
        ErrorHandlingModule_ProvideRoamingCashOutErrorMapperFactory errorHandlingModule_ProvideRoamingCashOutErrorMapperFactory;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            errorHandlingModule_ProvideRoamingCashOutErrorMapperFactory = copydefault.component2;
            int i3 = 9 / 0;
        } else {
            errorHandlingModule_ProvideRoamingCashOutErrorMapperFactory = copydefault.component2;
        }
        int i4 = component1 + 89;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return errorHandlingModule_ProvideRoamingCashOutErrorMapperFactory;
    }

    public static ErrorMapper provideRoamingCashOutErrorMapper() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ErrorMapper errorMapper = (ErrorMapper) Preconditions.checkNotNullFromProvides(ErrorHandlingModule.INSTANCE.provideRoamingCashOutErrorMapper());
        int i4 = component1 + 1;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return errorMapper;
        }
        throw null;
    }

    static final class copydefault {
        static final ErrorHandlingModule_ProvideRoamingCashOutErrorMapperFactory component2 = new ErrorHandlingModule_ProvideRoamingCashOutErrorMapperFactory();
        private static int component3 = 0;
        private static int copydefault = 1;

        private copydefault() {
        }

        static {
            int i = component3 + 59;
            copydefault = i % 128;
            int i2 = i % 2;
        }
    }
}
