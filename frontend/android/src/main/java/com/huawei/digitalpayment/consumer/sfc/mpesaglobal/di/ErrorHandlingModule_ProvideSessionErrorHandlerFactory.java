package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.di;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.SessionErrorHandler;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ErrorHandlingModule_ProvideSessionErrorHandlerFactory implements Factory<SessionErrorHandler> {
    private static int ShareDataUIState = 1;
    private static int component1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        throw null;
    }

    @Override
    public SessionErrorHandler get() {
        int i = 2 % 2;
        int i2 = component1 + 65;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        SessionErrorHandler sessionErrorHandlerProvideSessionErrorHandler = provideSessionErrorHandler();
        int i4 = component1 + 119;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return sessionErrorHandlerProvideSessionErrorHandler;
    }

    public static ErrorHandlingModule_ProvideSessionErrorHandlerFactory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ErrorHandlingModule_ProvideSessionErrorHandlerFactory errorHandlingModule_ProvideSessionErrorHandlerFactory = component3.component3;
        int i4 = component1 + 103;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
        return errorHandlingModule_ProvideSessionErrorHandlerFactory;
    }

    public static SessionErrorHandler provideSessionErrorHandler() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        SessionErrorHandler sessionErrorHandler = (SessionErrorHandler) Preconditions.checkNotNullFromProvides(ErrorHandlingModule.INSTANCE.provideSessionErrorHandler());
        int i4 = component1 + 3;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return sessionErrorHandler;
    }

    static final class component3 {
        private static int component2 = 1;
        static final ErrorHandlingModule_ProvideSessionErrorHandlerFactory component3 = new ErrorHandlingModule_ProvideSessionErrorHandlerFactory();
        private static int copydefault;

        private component3() {
        }

        static {
            int i = component2 + 63;
            copydefault = i % 128;
            if (i % 2 != 0) {
                int i2 = 19 / 0;
            }
        }
    }
}
