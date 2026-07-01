package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.di;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.DefaultTransactionConfig;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashoutAmountInputDataProvider;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashoutFeeCalculator;
import com.safaricom.android.design.templates.amountinput.provider.AmountInputDataProvider;
import com.safaricom.android.design.templates.amountinput.provider.FeeCalculator;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/di/ConfigModule;", "", "<init>", "()V", "provideDefaultTransactionConfig", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/DefaultTransactionConfig;", "provideAmountInputDataProvider", "Lcom/safaricom/android/design/templates/amountinput/provider/AmountInputDataProvider;", "provideFeeCalculator", "Lcom/safaricom/android/design/templates/amountinput/provider/FeeCalculator;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Module
public final class ConfigModule {
    public static final int $stable = 0;
    public static final ConfigModule INSTANCE = new ConfigModule();
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    private ConfigModule() {
    }

    @Provides
    @Singleton
    public final DefaultTransactionConfig provideDefaultTransactionConfig() {
        int i = 2 % 2;
        DefaultTransactionConfig defaultTransactionConfig = new DefaultTransactionConfig();
        int i2 = component3 + 85;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return defaultTransactionConfig;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Provides
    @Singleton
    public final AmountInputDataProvider provideAmountInputDataProvider() {
        int i = 2 % 2;
        RoamingCashoutAmountInputDataProvider roamingCashoutAmountInputDataProvider = new RoamingCashoutAmountInputDataProvider();
        int i2 = component1 + 29;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return roamingCashoutAmountInputDataProvider;
    }

    @Provides
    @Singleton
    public final FeeCalculator provideFeeCalculator() {
        int i = 2 % 2;
        RoamingCashoutFeeCalculator roamingCashoutFeeCalculator = new RoamingCashoutFeeCalculator();
        int i2 = component3 + 107;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return roamingCashoutFeeCalculator;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = copydefault + 113;
        component2 = i % 128;
        int i2 = i % 2;
    }
}
