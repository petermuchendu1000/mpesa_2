package com.huawei.digitalpayment.consumer.manageandviewdata.di;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.android.qualifiers.ApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/di/ApplicationModule;", "", "<init>", "()V", "providesDataUsageManager", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/di/DataUsageInitializer;", "context", "Landroid/content/Context;", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Module
public final class ApplicationModule {
    public static final int $stable = 0;
    public static final ApplicationModule INSTANCE = new ApplicationModule();
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    private ApplicationModule() {
    }

    @Provides
    public final DataUsageInitializer providesDataUsageManager(@ApplicationContext Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        DataUsageInitializer dataUsageInitializer = new DataUsageInitializer(context);
        int i2 = copydefault + 35;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return dataUsageInitializer;
        }
        throw null;
    }

    static {
        int i = ShareDataUIState + 81;
        component3 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
