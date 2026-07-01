package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionConfigRepositoryImpl;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionLimitsRepository;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionFeaturesRepository;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionFeeRepository;", "defaultConfig", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/DefaultTransactionConfig;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/DefaultTransactionConfig;)V", "getMaxAmount", "Ljava/math/BigDecimal;", "transactionType", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionType;", "getMinAmount", "isOverdraftEnabled", "", "supportsOutdatedBalance", "calculateFee", "amount", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TransactionConfigRepositoryImpl implements TransactionLimitsRepository, TransactionFeaturesRepository, TransactionFeeRepository {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int copydefault = 49 % 128;
    private final DefaultTransactionConfig component3;

    public TransactionConfigRepositoryImpl(DefaultTransactionConfig defaultTransactionConfig) {
        Intrinsics.checkNotNullParameter(defaultTransactionConfig, "");
        this.component3 = defaultTransactionConfig;
    }

    @Override
    public BigDecimal getMaxAmount(TransactionType transactionType) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(transactionType, "");
            return this.component3.getMaxAmount(transactionType);
        }
        Intrinsics.checkNotNullParameter(transactionType, "");
        this.component3.getMaxAmount(transactionType);
        throw null;
    }

    @Override
    public BigDecimal getMinAmount(TransactionType transactionType) {
        int i = 2 % 2;
        int i2 = component1 + 91;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(transactionType, "");
            return this.component3.getMinAmount(transactionType);
        }
        Intrinsics.checkNotNullParameter(transactionType, "");
        int i3 = 35 / 0;
        return this.component3.getMinAmount(transactionType);
    }

    @Override
    public boolean isOverdraftEnabled(TransactionType transactionType) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(transactionType, "");
        boolean zIsOverdraftEnabled = this.component3.isOverdraftEnabled(transactionType);
        int i4 = ShareDataUIState + 15;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return zIsOverdraftEnabled;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public boolean supportsOutdatedBalance(TransactionType transactionType) {
        int i = 2 % 2;
        int i2 = component1 + 117;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(transactionType, "");
        boolean zSupportsOutdatedBalance = this.component3.supportsOutdatedBalance(transactionType);
        int i4 = ShareDataUIState + 89;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 83 / 0;
        }
        return zSupportsOutdatedBalance;
    }

    @Override
    public BigDecimal calculateFee(TransactionType transactionType, BigDecimal amount) {
        int i = 2 % 2;
        int i2 = component1 + 91;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(amount, "");
        BigDecimal bigDecimalCalculateFee = this.component3.calculateFee(transactionType, amount);
        int i4 = component1 + 7;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return bigDecimalCalculateFee;
        }
        throw null;
    }

    static {
        if (49 % 2 == 0) {
            throw null;
        }
    }
}
