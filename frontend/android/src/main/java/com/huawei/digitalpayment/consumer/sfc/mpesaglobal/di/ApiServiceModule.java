package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.di;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.NameCheckApiService;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.ValidationApiService;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/di/ApiServiceModule;", "", "<init>", "()V", "provideNameCheckApiService", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/NameCheckApiService;", "provideValidationApiService", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/ValidationApiService;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Module
public final class ApiServiceModule {
    public static final int $stable = 0;
    public static final ApiServiceModule INSTANCE = new ApiServiceModule();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    private ApiServiceModule() {
    }

    @Provides
    @Singleton
    public final NameCheckApiService provideNameCheckApiService() {
        int i = 2 % 2;
        NameCheckApiService nameCheckApiService = new NameCheckApiService();
        int i2 = copydefault + 77;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return nameCheckApiService;
    }

    @Provides
    @Singleton
    public final ValidationApiService provideValidationApiService() {
        int i = 2 % 2;
        ValidationApiService validationApiService = new ValidationApiService();
        int i2 = copydefault + 11;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return validationApiService;
    }

    static {
        int i = ShareDataUIState + 27;
        component3 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
