package com.safaricom.consumer.commons.configuration;

import com.safaricom.consumer.commons.amountvalidation.AmountLimits;
import com.safaricom.consumer.commons.balances.AmountBalancesOrientation;
import com.safaricom.consumer.commons.transaction.ITransactionType;
import com.safaricom.consumer.commons.util.CurrencyLabelPosition;
import javax.inject.Inject;
import kotlin.EdgeToEdgeApi29;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u000bJ\u001c\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\tJ\u001c\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t¨\u0006\u0014"}, d2 = {"Lcom/safaricom/consumer/commons/configuration/ConfigurationRepository;", "", "<init>", "()V", "getBalanceLabelsOrientation", "Lcom/safaricom/consumer/commons/balances/AmountBalancesOrientation;", "getCurrencyLabelPosition", "Lcom/safaricom/consumer/commons/util/CurrencyLabelPosition;", "getCountryCode", "", "isFastLoginFeatureEnabled", "", "getDisplayCurrency", "showOverdraw", "getMinAmountForTransaction", "", "transactionType", "Lcom/safaricom/consumer/commons/transaction/ITransactionType;", "currency", "getMaxAmountForTransaction", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConfigurationRepository {
    public final boolean isFastLoginFeatureEnabled() {
        return false;
    }

    public final boolean showOverdraw() {
        return false;
    }

    @Inject
    public ConfigurationRepository() {
    }

    public final AmountBalancesOrientation getBalanceLabelsOrientation() {
        return AmountBalancesOrientation.HORIZONTAL;
    }

    public final CurrencyLabelPosition getCurrencyLabelPosition() {
        return CurrencyLabelPosition.START;
    }

    public final String getCountryCode() {
        return "";
    }

    public final String getDisplayCurrency() {
        return "Ksh";
    }

    public static double getMinAmountForTransaction$default(ConfigurationRepository configurationRepository, ITransactionType iTransactionType, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return configurationRepository.getMinAmountForTransaction(iTransactionType, str);
    }

    public final double getMinAmountForTransaction(ITransactionType transactionType, String currency) {
        return AmountLimits.INSTANCE.getForTransactionType(transactionType).getMin();
    }

    public static double getMaxAmountForTransaction$default(ConfigurationRepository configurationRepository, ITransactionType iTransactionType, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return configurationRepository.getMaxAmountForTransaction(iTransactionType, str);
    }

    public final double getMaxAmountForTransaction(ITransactionType transactionType, String currency) {
        return AmountLimits.INSTANCE.getForTransactionType(transactionType).getMax();
    }

    public static void component2() {
        EdgeToEdgeApi29.copydefault[0] = Class.forName("com.huawei.hms.scankit.p.v2$d").getDeclaredField("component1");
    }
}
