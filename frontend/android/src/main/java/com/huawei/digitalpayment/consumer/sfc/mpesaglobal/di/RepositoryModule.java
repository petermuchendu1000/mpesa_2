package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.di;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.NameCheckApiService;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.ValidationApiService;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.BalanceRepository;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.BalanceRepositoryImpl;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.CurrencyRepository;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.CurrencyRepositoryImpl;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.DefaultTransactionConfig;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionConfigRepositoryImpl;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionExecutionRepository;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionExecutionRepositoryImpl;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionFeaturesRepository;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionFeeRepository;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionLimitsRepository;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionNameCheckRepository;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionNameCheckRepositoryImpl;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionValidationRepository;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionValidationRepositoryImpl;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0012\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010H\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0010H\u0007J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0010H\u0007J\u0012\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\b\u0010\u001c\u001a\u00020\u001dH\u0007¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/di/RepositoryModule;", "", "<init>", "()V", "provideNameCheckRepository", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionNameCheckRepository;", "apiService", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/NameCheckApiService;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "provideTransactionValidationRepository", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionValidationRepository;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/ValidationApiService;", "provideTransactionExecutionRepository", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionExecutionRepository;", "provideTransactionConfigRepository", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionConfigRepositoryImpl;", "defaultConfig", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/DefaultTransactionConfig;", "provideTransactionLimitsRepository", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionLimitsRepository;", "configRepository", "provideTransactionFeaturesRepository", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionFeaturesRepository;", "provideTransactionFeeRepository", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionFeeRepository;", "provideBalanceRepository", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/BalanceRepository;", "provideCurrencyRepository", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/CurrencyRepository;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Module
public final class RepositoryModule {
    public static final int $stable = 0;
    public static final RepositoryModule INSTANCE = new RepositoryModule();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault;

    private RepositoryModule() {
    }

    @Provides
    @Singleton
    public final TransactionNameCheckRepository provideNameCheckRepository(NameCheckApiService apiService, CoroutineDispatcher dispatcher) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(apiService, "");
        Intrinsics.checkNotNullParameter(dispatcher, "");
        TransactionNameCheckRepositoryImpl transactionNameCheckRepositoryImpl = new TransactionNameCheckRepositoryImpl(apiService, dispatcher);
        int i2 = component1 + 73;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return transactionNameCheckRepositoryImpl;
        }
        throw null;
    }

    @Provides
    @Singleton
    public final TransactionValidationRepository provideTransactionValidationRepository(ValidationApiService apiService, CoroutineDispatcher dispatcher) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(apiService, "");
        Intrinsics.checkNotNullParameter(dispatcher, "");
        TransactionValidationRepositoryImpl transactionValidationRepositoryImpl = new TransactionValidationRepositoryImpl(apiService, dispatcher);
        int i2 = ShareDataUIState + 7;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return transactionValidationRepositoryImpl;
    }

    @Provides
    @Singleton
    public final TransactionExecutionRepository provideTransactionExecutionRepository(CoroutineDispatcher dispatcher) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dispatcher, "");
        TransactionExecutionRepositoryImpl transactionExecutionRepositoryImpl = new TransactionExecutionRepositoryImpl(dispatcher);
        int i2 = ShareDataUIState + 25;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return transactionExecutionRepositoryImpl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Provides
    @Singleton
    public final TransactionConfigRepositoryImpl provideTransactionConfigRepository(DefaultTransactionConfig defaultConfig) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(defaultConfig, "");
        TransactionConfigRepositoryImpl transactionConfigRepositoryImpl = new TransactionConfigRepositoryImpl(defaultConfig);
        int i2 = component1 + 109;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return transactionConfigRepositoryImpl;
    }

    @Provides
    @Singleton
    public final TransactionLimitsRepository provideTransactionLimitsRepository(TransactionConfigRepositoryImpl configRepository) {
        int i = 2 % 2;
        int i2 = component1 + 39;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(configRepository, "");
        TransactionConfigRepositoryImpl transactionConfigRepositoryImpl = configRepository;
        int i4 = ShareDataUIState + 1;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return transactionConfigRepositoryImpl;
        }
        throw null;
    }

    @Provides
    @Singleton
    public final TransactionFeaturesRepository provideTransactionFeaturesRepository(TransactionConfigRepositoryImpl configRepository) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(configRepository, "");
        TransactionConfigRepositoryImpl transactionConfigRepositoryImpl = configRepository;
        int i4 = ShareDataUIState + 15;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return transactionConfigRepositoryImpl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Provides
    @Singleton
    public final TransactionFeeRepository provideTransactionFeeRepository(TransactionConfigRepositoryImpl configRepository) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(configRepository, "");
        TransactionConfigRepositoryImpl transactionConfigRepositoryImpl = configRepository;
        int i4 = component1 + 47;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
        return transactionConfigRepositoryImpl;
    }

    @Provides
    @Singleton
    public final BalanceRepository provideBalanceRepository(CoroutineDispatcher dispatcher) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dispatcher, "");
        BalanceRepositoryImpl balanceRepositoryImpl = new BalanceRepositoryImpl(dispatcher);
        int i2 = component1 + 35;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return balanceRepositoryImpl;
    }

    @Provides
    @Singleton
    public final CurrencyRepository provideCurrencyRepository() {
        int i = 2 % 2;
        CurrencyRepositoryImpl currencyRepositoryImpl = new CurrencyRepositoryImpl();
        int i2 = component1 + 95;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 46 / 0;
        }
        return currencyRepositoryImpl;
    }

    static {
        int i = copydefault + 13;
        component2 = i % 128;
        int i2 = i % 2;
    }
}
