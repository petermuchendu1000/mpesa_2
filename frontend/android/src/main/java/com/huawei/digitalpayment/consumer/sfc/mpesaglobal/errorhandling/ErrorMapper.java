package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorState;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorMapper;", "", "mapToGenericError", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData;", "errorType", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorType;", "mapToInsufficientFundsError", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$Transaction$Info;", "context", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorContext;", "mapToTransactionError", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ErrorMapper {
    ErrorState.ErrorData mapToGenericError(ErrorType errorType);

    ErrorState.ErrorData.Transaction.Info mapToInsufficientFundsError(ErrorType errorType, ErrorContext context);

    ErrorState.ErrorData.Transaction.Info mapToTransactionError(ErrorType errorType, ErrorContext context);
}
