package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.di;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorMapper;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorMapperImpl;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.SessionErrorHandler;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.SessionErrorHandlerImpl;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutErrorHandler;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\tH\u0007J\b\u0010\u000b\u001a\u00020\u0007H\u0007¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/di/ErrorHandlingModule;", "", "<init>", "()V", "provideRoamingCashOutErrorHandler", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/RoamingCashOutErrorHandler;", "sessionErrorHandler", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/SessionErrorHandler;", "errorMapper", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorMapper;", "provideRoamingCashOutErrorMapper", "provideSessionErrorHandler", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Module
public final class ErrorHandlingModule {
    public static final int $stable = 0;
    public static final ErrorHandlingModule INSTANCE = new ErrorHandlingModule();
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    private ErrorHandlingModule() {
    }

    @Provides
    public final RoamingCashOutErrorHandler provideRoamingCashOutErrorHandler(SessionErrorHandler sessionErrorHandler, ErrorMapper errorMapper) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionErrorHandler, "");
        Intrinsics.checkNotNullParameter(errorMapper, "");
        RoamingCashOutErrorHandler roamingCashOutErrorHandler = new RoamingCashOutErrorHandler(sessionErrorHandler, errorMapper);
        int i2 = ShareDataUIState + 75;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return roamingCashOutErrorHandler;
    }

    @Provides
    @Singleton
    public final ErrorMapper provideRoamingCashOutErrorMapper() {
        int i = 2 % 2;
        ErrorMapperImpl errorMapperImpl = new ErrorMapperImpl();
        int i2 = ShareDataUIState + 5;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return errorMapperImpl;
    }

    @Provides
    @Singleton
    public final SessionErrorHandler provideSessionErrorHandler() {
        int i = 2 % 2;
        SessionErrorHandlerImpl sessionErrorHandlerImpl = new SessionErrorHandlerImpl();
        int i2 = ShareDataUIState + 125;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 43 / 0;
        }
        return sessionErrorHandlerImpl;
    }

    static {
        int i = copydefault + 59;
        component2 = i % 128;
        int i2 = i % 2;
    }
}
