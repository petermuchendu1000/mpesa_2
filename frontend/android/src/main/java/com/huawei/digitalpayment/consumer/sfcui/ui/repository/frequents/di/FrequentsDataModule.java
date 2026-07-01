package com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.di;

import com.huawei.digitalpayment.consumer.base.database.daos.FrequentsDao;
import com.huawei.digitalpayment.consumer.base.database.daos.HomeSettingsDao;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentsLocalDatasource;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.homesettings.HomeSettingsLocalDataSource;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/di/FrequentsDataModule;", "", "<init>", "()V", "providesFrequentsLocalDatasource", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/FrequentsLocalDatasource;", "frequentsDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/FrequentsDao;", "providesHomeSettingsLocalDataSource", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/homesettings/HomeSettingsLocalDataSource;", "homeSettingsDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/HomeSettingsDao;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Module
public final class FrequentsDataModule {
    public static final int $stable = 0;
    public static final FrequentsDataModule INSTANCE = new FrequentsDataModule();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 1;
    private static int copydefault;

    private FrequentsDataModule() {
    }

    @Provides
    @Singleton
    public final FrequentsLocalDatasource providesFrequentsLocalDatasource(FrequentsDao frequentsDao) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(frequentsDao, "");
        FrequentsLocalDatasource frequentsLocalDatasource = new FrequentsLocalDatasource(frequentsDao);
        int i2 = ShareDataUIState + 71;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return frequentsLocalDatasource;
        }
        throw null;
    }

    @Provides
    @Singleton
    public final HomeSettingsLocalDataSource providesHomeSettingsLocalDataSource(HomeSettingsDao homeSettingsDao) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(homeSettingsDao, "");
        HomeSettingsLocalDataSource homeSettingsLocalDataSource = new HomeSettingsLocalDataSource(homeSettingsDao);
        int i2 = component1 + 7;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return homeSettingsLocalDataSource;
    }

    static {
        int i = component3 + 67;
        copydefault = i % 128;
        int i2 = i % 2;
    }
}
