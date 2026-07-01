package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.di;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorMapper;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.SessionErrorHandler;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutErrorHandler;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class ErrorHandlingModule_ProvideRoamingCashOutErrorHandlerFactory implements Factory<RoamingCashOutErrorHandler> {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private final Provider<ErrorMapper> component1;
    private final Provider<SessionErrorHandler> component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        RoamingCashOutErrorHandler roamingCashOutErrorHandler = get();
        int i4 = copydefault + 77;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return roamingCashOutErrorHandler;
        }
        throw null;
    }

    public ErrorHandlingModule_ProvideRoamingCashOutErrorHandlerFactory(Provider<SessionErrorHandler> provider, Provider<ErrorMapper> provider2) {
        this.component2 = provider;
        this.component1 = provider2;
    }

    @Override
    public RoamingCashOutErrorHandler get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            provideRoamingCashOutErrorHandler(this.component2.get(), this.component1.get());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        RoamingCashOutErrorHandler roamingCashOutErrorHandlerProvideRoamingCashOutErrorHandler = provideRoamingCashOutErrorHandler(this.component2.get(), this.component1.get());
        int i3 = ShareDataUIState + 93;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return roamingCashOutErrorHandlerProvideRoamingCashOutErrorHandler;
    }

    public static ErrorHandlingModule_ProvideRoamingCashOutErrorHandlerFactory create(javax.inject.Provider<SessionErrorHandler> provider, javax.inject.Provider<ErrorMapper> provider2) {
        int i = 2 % 2;
        ErrorHandlingModule_ProvideRoamingCashOutErrorHandlerFactory errorHandlingModule_ProvideRoamingCashOutErrorHandlerFactory = new ErrorHandlingModule_ProvideRoamingCashOutErrorHandlerFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
        int i2 = copydefault + 23;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return errorHandlingModule_ProvideRoamingCashOutErrorHandlerFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ErrorHandlingModule_ProvideRoamingCashOutErrorHandlerFactory create(Provider<SessionErrorHandler> provider, Provider<ErrorMapper> provider2) {
        int i = 2 % 2;
        ErrorHandlingModule_ProvideRoamingCashOutErrorHandlerFactory errorHandlingModule_ProvideRoamingCashOutErrorHandlerFactory = new ErrorHandlingModule_ProvideRoamingCashOutErrorHandlerFactory(provider, provider2);
        int i2 = ShareDataUIState + 87;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return errorHandlingModule_ProvideRoamingCashOutErrorHandlerFactory;
        }
        throw null;
    }

    public static RoamingCashOutErrorHandler provideRoamingCashOutErrorHandler(SessionErrorHandler sessionErrorHandler, ErrorMapper errorMapper) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        RoamingCashOutErrorHandler roamingCashOutErrorHandler = (RoamingCashOutErrorHandler) Preconditions.checkNotNullFromProvides(ErrorHandlingModule.INSTANCE.provideRoamingCashOutErrorHandler(sessionErrorHandler, errorMapper));
        int i3 = copydefault + 29;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return roamingCashOutErrorHandler;
    }
}
