package com.safaricom.consumer.commons.amountvalidation;

import com.safaricom.consumer.commons.amountvalidation.AmountViewModel;
import com.safaricom.consumer.commons.transaction.ITransactionType;
import com.safaricom.consumer.commons.util.TextResource;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH&J\u001a\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H&J4\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\rH&J\u001e\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\r2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH&J&\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\rH&J\b\u0010 \u001a\u00020!H&J\u0010\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020!H&J\u0010\u0010$\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010%\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006&"}, d2 = {"Lcom/safaricom/consumer/commons/amountvalidation/AmountHandlerDelegate;", "", "amountDetailsState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/safaricom/consumer/commons/amountvalidation/AmountDetailsState;", "getAmountDetailsState", "()Lkotlinx/coroutines/flow/StateFlow;", "updateAmount", "", "value", "", "updateAmountValidityStatus", "valid", "", "handleAmountError", "amountError", "Lcom/safaricom/consumer/commons/amountvalidation/AmountViewModel$AmountError;", "transactionType", "Lcom/safaricom/consumer/commons/transaction/ITransactionType;", "setFormattedAmountError", "stringResId", "", "currency", "Lcom/safaricom/consumer/commons/util/TextResource;", "amount", "errorType", "Lcom/safaricom/consumer/commons/amountvalidation/AmountViewModel$AmountErrorType;", "isWarning", "clearAmountError", "useOverdraft", "setAmountError", "error", "calculateAmount", "", "updateMpesaBalance", "balance", "updateCurrency", "updateExchangeCurrency", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AmountHandlerDelegate {
    double calculateAmount();

    void clearAmountError(boolean useOverdraft, AmountViewModel.AmountErrorType errorType);

    StateFlow<AmountDetailsState> getAmountDetailsState();

    void handleAmountError(AmountViewModel.AmountError amountError, ITransactionType transactionType);

    void setAmountError(TextResource error, AmountViewModel.AmountErrorType errorType, boolean isWarning);

    void setFormattedAmountError(int stringResId, TextResource currency, String amount, AmountViewModel.AmountErrorType errorType, boolean isWarning);

    void updateAmount(String value);

    void updateAmountValidityStatus(boolean valid);

    void updateCurrency(String value);

    void updateExchangeCurrency(String value);

    void updateMpesaBalance(double balance);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void setFormattedAmountError$default(AmountHandlerDelegate amountHandlerDelegate, int i, TextResource textResource, String str, AmountViewModel.AmountErrorType amountErrorType, boolean z, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFormattedAmountError");
            }
            if ((i2 & 16) != 0) {
                z = false;
            }
            amountHandlerDelegate.setFormattedAmountError(i, textResource, str, amountErrorType, z);
        }

        public static void clearAmountError$default(AmountHandlerDelegate amountHandlerDelegate, boolean z, AmountViewModel.AmountErrorType amountErrorType, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearAmountError");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                amountErrorType = null;
            }
            amountHandlerDelegate.clearAmountError(z, amountErrorType);
        }

        public static void setAmountError$default(AmountHandlerDelegate amountHandlerDelegate, TextResource textResource, AmountViewModel.AmountErrorType amountErrorType, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAmountError");
            }
            if ((i & 4) != 0) {
                z = false;
            }
            amountHandlerDelegate.setAmountError(textResource, amountErrorType, z);
        }
    }
}
