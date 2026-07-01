package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.strategies;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorMapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/strategies/ValidationErrorStrategy;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/strategies/ErrorProcessingStrategy;", "errorMapper", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorMapper;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorMapper;)V", "processError", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState;", "errorType", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorType;", "context", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorContext;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ValidationErrorStrategy implements ErrorProcessingStrategy {
    public static final int $stable = 8;
    private static int ShareDataUIState = 109 % 128;
    private static int component1 = 1;
    private static int component2;
    private static int component3;
    private final ErrorMapper copydefault;

    public ValidationErrorStrategy(ErrorMapper errorMapper) {
        Intrinsics.checkNotNullParameter(errorMapper, "");
        this.copydefault = errorMapper;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorState processError(com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorType r4, com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorContext r5) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.strategies.ValidationErrorStrategy.processError(com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorType, com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorContext):com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorState");
    }

    static {
        if (109 % 2 == 0) {
            int i = 25 / 0;
        }
    }
}
