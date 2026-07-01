package com.safaricom.consumer.commons.resource;

import com.safaricom.consumer.commons.resource.ErrorType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"isNetworkConnectionErrorOrTimeOut", "", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "ConsumerSfcCommons_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ErrorTypeKt {
    public static final boolean isNetworkConnectionErrorOrTimeOut(ErrorType errorType) {
        Intrinsics.checkNotNullParameter(errorType, "");
        return (errorType instanceof ErrorType.Network.NoConnection) || ((errorType instanceof ErrorType.Network.Generic) && ((ErrorType.Network.Generic) errorType).getTimeOutReached());
    }
}
