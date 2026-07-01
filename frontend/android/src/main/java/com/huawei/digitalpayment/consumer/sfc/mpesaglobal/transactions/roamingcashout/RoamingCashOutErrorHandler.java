package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorContext;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorMapper;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorState;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorType;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.SessionErrorHandler;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.TransactionErrorHandler;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.TransactionStage;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.strategies.ConfirmationErrorStrategy;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.strategies.CostEstimationErrorStrategy;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.strategies.ValidationErrorStrategy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0010R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/RoamingCashOutErrorHandler;", "", "sessionErrorHandler", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/SessionErrorHandler;", "errorMapper", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorMapper;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/SessionErrorHandler;Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorMapper;)V", "transactionErrorHandler", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/TransactionErrorHandler;", "errorState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState;", "getErrorState", "()Lkotlinx/coroutines/flow/StateFlow;", "handleValidationError", "", "errorType", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorType;", "transactionAmount", "", "handleConfirmationError", "handleCostEstimationError", "clearError", "markErrorAsHandled", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoamingCashOutErrorHandler {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int copydefault = 0;
    private static int getRequestBeneficiariesState = 1;
    private final TransactionErrorHandler component2;
    private final StateFlow<ErrorState> component3;

    public RoamingCashOutErrorHandler(SessionErrorHandler sessionErrorHandler, ErrorMapper errorMapper) {
        Intrinsics.checkNotNullParameter(sessionErrorHandler, "");
        Intrinsics.checkNotNullParameter(errorMapper, "");
        TransactionErrorHandler transactionErrorHandler = new TransactionErrorHandler(MapsKt.mapOf(TuplesKt.to(TransactionStage.VALIDATION, new ValidationErrorStrategy(errorMapper)), TuplesKt.to(TransactionStage.CONFIRMATION, new ConfirmationErrorStrategy(errorMapper)), TuplesKt.to(TransactionStage.COST_ESTIMATION, new CostEstimationErrorStrategy())), sessionErrorHandler);
        this.component2 = transactionErrorHandler;
        this.component3 = transactionErrorHandler.getErrorState();
    }

    public final StateFlow<ErrorState> getErrorState() {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        StateFlow<ErrorState> stateFlow = this.component3;
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return stateFlow;
    }

    public final void handleValidationError(ErrorType errorType, String transactionAmount) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(errorType, "");
        Intrinsics.checkNotNullParameter(transactionAmount, "");
        this.component2.handleError(errorType, new ErrorContext(com.huawei.customer.digitalpayment.checkout.service.TransactionType.CASH_OUT, transactionAmount, TransactionStage.VALIDATION, null, 8, null));
        int i2 = getRequestBeneficiariesState + 89;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void handleConfirmationError(ErrorType errorType, String transactionAmount) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(errorType, "");
        Intrinsics.checkNotNullParameter(transactionAmount, "");
        this.component2.handleError(errorType, new ErrorContext(com.huawei.customer.digitalpayment.checkout.service.TransactionType.CASH_OUT, transactionAmount, TransactionStage.CONFIRMATION, null, 8, null));
        int i2 = getRequestBeneficiariesState + 87;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void handleCostEstimationError(ErrorType errorType, String transactionAmount) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(errorType, "");
        Intrinsics.checkNotNullParameter(transactionAmount, "");
        this.component2.handleError(errorType, new ErrorContext(com.huawei.customer.digitalpayment.checkout.service.TransactionType.CASH_OUT, transactionAmount, TransactionStage.COST_ESTIMATION, null, 8, null));
        int i2 = copydefault + 39;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final void clearError() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 105;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.component2.clearError();
        int i4 = copydefault + 43;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void markErrorAsHandled() {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        this.component2.markErrorAsHandled();
        int i4 = copydefault + 121;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        int i = 1 + 35;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
