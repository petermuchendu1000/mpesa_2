package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorInfo;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorState;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorType;
import com.mpesa.qrcode.constants.ErrorStore;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorMapperImpl;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorMapper;", "<init>", "()V", "mapToGenericError", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData;", "errorType", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorType;", "mapToInsufficientFundsError", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$Transaction$Info;", "context", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorContext;", "mapToTransactionError", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ErrorMapperImpl implements ErrorMapper {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault;

    @Override
    public ErrorState.ErrorData mapToGenericError(ErrorType errorType) {
        String message;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(errorType, "");
        boolean z = errorType instanceof ErrorType.Network.Generic;
        String errorCode = null;
        if (z) {
            int i2 = copydefault + 93;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            message = ((ErrorType.Network.Generic) errorType).getMessage();
            if (message == null) {
                message = "An error occurred";
            }
        } else if (errorType instanceof ErrorType.Network.NoConnection) {
            int i4 = copydefault + 75;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                errorCode.hashCode();
                throw null;
            }
            message = ErrorStore.NO_INTERNET;
        } else if (errorType instanceof ErrorType.Network.Timeout) {
            int i5 = copydefault + 37;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 97 / 0;
            }
            message = "Request timed out";
        } else {
            message = "An unexpected error occurred";
        }
        ErrorType.Network.Generic generic = z ? (ErrorType.Network.Generic) errorType : null;
        if (generic != null) {
            errorCode = generic.getErrorCode();
            int i7 = copydefault + 65;
            component2 = i7 % 128;
            int i8 = i7 % 2;
        }
        return new ErrorState.ErrorData.Generic(message, errorCode);
    }

    @Override
    public ErrorState.ErrorData.Transaction.Info mapToInsufficientFundsError(ErrorType errorType, ErrorContext context) {
        ErrorType.Network.Generic generic;
        Map<String, Object> mapEmptyMap;
        int i = 2 % 2;
        int i2 = component2 + 33;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(errorType, "");
        Intrinsics.checkNotNullParameter(context, "");
        Object obj = null;
        if (!(errorType instanceof ErrorType.Network.Generic)) {
            generic = null;
        } else {
            int i4 = copydefault + 85;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            generic = (ErrorType.Network.Generic) errorType;
        }
        if (generic == null || (mapEmptyMap = generic.getMetadata()) == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        Object obj2 = mapEmptyMap.get("availableBalance");
        BigDecimal bigDecimal = obj2 instanceof BigDecimal ? (BigDecimal) obj2 : null;
        if (bigDecimal == null) {
            int i5 = component2 + 67;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                BigDecimal bigDecimal2 = BigDecimal.ZERO;
                throw null;
            }
            bigDecimal = BigDecimal.ZERO;
        }
        String str = "Available balance: " + bigDecimal;
        Intrinsics.checkNotNull(bigDecimal);
        return new ErrorState.ErrorData.Transaction.Info(new ErrorInfo.InsufficientFunds("Insufficient funds for this transaction", str, bigDecimal));
    }

    @Override
    public ErrorState.ErrorData.Transaction.Info mapToTransactionError(ErrorType errorType, ErrorContext context) {
        ErrorType.Network.Generic generic;
        int i = 2 % 2;
        int i2 = copydefault + 23;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(errorType, "");
        Intrinsics.checkNotNullParameter(context, "");
        String message = null;
        if (errorType instanceof ErrorType.Network.Generic) {
            int i4 = component2 + 49;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            generic = (ErrorType.Network.Generic) errorType;
        } else {
            int i6 = copydefault + 39;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 4 / 3;
            }
            generic = null;
        }
        if (generic != null) {
            int i8 = copydefault + 105;
            component2 = i8 % 128;
            if (i8 % 2 == 0) {
                message = generic.getMessage();
                int i9 = 86 / 0;
            } else {
                message = generic.getMessage();
            }
        }
        return new ErrorState.ErrorData.Transaction.Info(new ErrorInfo.Generic("Transaction failed", message));
    }

    static {
        int i = 1 + 89;
        component1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
