package com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.di;

import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentMiniAppRepository;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentMiniAppRepositoryImpl;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentTransactionRepository;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentTransactionRepositoryImpl;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentsLocalDatasource;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentsRepository;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentsRepositoryImpl;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.homesettings.HomeSettingsLocalDataSource;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.homesettings.HomeSettingsRepository;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.homesettings.HomeSettingsRepositoryImpl;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/di/FrequentsRepositoryModule;", "", "<init>", "()V", "providesFrequentsRepository", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/FrequentsRepository;", "frequentTransactionRepository", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/FrequentTransactionRepository;", "frequentMiniAppRepository", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/FrequentMiniAppRepository;", "providesFrequentTransactionRepository", "localDatasource", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/FrequentsLocalDatasource;", "providesFrequentMiniAppRepository", "providesHomeSettingsRepository", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/homesettings/HomeSettingsRepository;", "localDataSource", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/homesettings/HomeSettingsLocalDataSource;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Module
public final class FrequentsRepositoryModule {
    public static final int $stable = 0;
    public static final FrequentsRepositoryModule INSTANCE = new FrequentsRepositoryModule();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;

    private FrequentsRepositoryModule() {
    }

    @Provides
    @Singleton
    public final FrequentsRepository providesFrequentsRepository(FrequentTransactionRepository frequentTransactionRepository, FrequentMiniAppRepository frequentMiniAppRepository) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(frequentTransactionRepository, "");
        Intrinsics.checkNotNullParameter(frequentMiniAppRepository, "");
        FrequentsRepositoryImpl frequentsRepositoryImpl = new FrequentsRepositoryImpl(frequentTransactionRepository, frequentMiniAppRepository);
        int i2 = component1 + 9;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return frequentsRepositoryImpl;
        }
        throw null;
    }

    @Provides
    @Singleton
    public final FrequentTransactionRepository providesFrequentTransactionRepository(FrequentsLocalDatasource localDatasource) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(localDatasource, "");
        FrequentTransactionRepositoryImpl frequentTransactionRepositoryImpl = new FrequentTransactionRepositoryImpl(localDatasource);
        int i2 = component1 + 109;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return frequentTransactionRepositoryImpl;
        }
        throw null;
    }

    @Provides
    @Singleton
    public final FrequentMiniAppRepository providesFrequentMiniAppRepository(FrequentsLocalDatasource localDatasource) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(localDatasource, "");
        FrequentMiniAppRepositoryImpl frequentMiniAppRepositoryImpl = new FrequentMiniAppRepositoryImpl(localDatasource);
        int i2 = component1 + 113;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return frequentMiniAppRepositoryImpl;
    }

    @Provides
    @Singleton
    public final HomeSettingsRepository providesHomeSettingsRepository(HomeSettingsLocalDataSource localDataSource) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(localDataSource, "");
        HomeSettingsRepositoryImpl homeSettingsRepositoryImpl = new HomeSettingsRepositoryImpl(localDataSource);
        int i2 = component3 + 97;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return homeSettingsRepositoryImpl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component2 + 113;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }
}
