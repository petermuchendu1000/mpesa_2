package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/SessionErrorHandlerImpl;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/SessionErrorHandler;", "<init>", "()V", "isSessionError", "", "errorType", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorType;", "handleSessionError", "", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SessionErrorHandlerImpl implements SessionErrorHandler {
    public static final int $stable = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;

    static {
        int i = 1 + 5;
        copydefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 69 / 0;
        }
    }

    @Override
    public void handleSessionError(ErrorType errorType) {
        int i = 2 % 2;
        int i2 = component3 + 71;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(errorType, "");
        if (i3 != 0) {
            throw null;
        }
    }

    @Override
    public boolean isSessionError(ErrorType errorType) {
        int i = 2 % 2;
        int i2 = component3 + 103;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(errorType, "");
        int i4 = component3 + 71;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }
}
