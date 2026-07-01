package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.strategies;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorContext;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorState;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/strategies/CostEstimationErrorStrategy;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/strategies/ErrorProcessingStrategy;", "<init>", "()V", "processError", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState;", "errorType", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorType;", "context", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorContext;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CostEstimationErrorStrategy implements ErrorProcessingStrategy {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int copydefault = 1;

    @Override
    public ErrorState processError(ErrorType errorType, ErrorContext context) {
        ErrorState.ErrorData.InScreenInfo.NoConnection noConnection;
        int i = 2 % 2;
        int i2 = component2 + 41;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(errorType, "");
            Intrinsics.checkNotNullParameter(context, "");
            boolean z = errorType instanceof ErrorType.Network.NoConnection;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(errorType, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (errorType instanceof ErrorType.Network.NoConnection) {
            noConnection = new ErrorState.ErrorData.InScreenInfo.NoConnection("Unable to estimate costs");
            int i3 = copydefault + 21;
            component2 = i3 % 128;
            int i4 = i3 % 2;
        } else {
            noConnection = null;
        }
        int i5 = copydefault + 61;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return noConnection;
        }
        throw null;
    }

    static {
        int i = 1 + 89;
        component1 = i % 128;
        int i2 = i % 2;
    }
}
