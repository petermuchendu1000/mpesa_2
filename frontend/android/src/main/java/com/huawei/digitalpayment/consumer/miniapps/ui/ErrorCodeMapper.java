package com.huawei.digitalpayment.consumer.miniapps.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/miniapps/ui/ErrorCodeMapper;", "", "<init>", "()V", "mapMiniAppErrorCode", "", "errorCode", "ConsumerSfcAliPayMiniApps_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ErrorCodeMapper {
    public static final int $stable = 0;
    public static final ErrorCodeMapper INSTANCE = new ErrorCodeMapper();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    private ErrorCodeMapper() {
    }

    public final String mapMiniAppErrorCode(String errorCode) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(errorCode, "");
        if (Intrinsics.areEqual(errorCode, MiniAppError.ERROR_1001.getType().getFirst())) {
            int i2 = component3 + 117;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return MiniAppError.ERROR_1001.getType().getSecond();
        }
        if (Intrinsics.areEqual(errorCode, MiniAppError.ERROR_1002.getType().getFirst())) {
            int i4 = component3 + 113;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return MiniAppError.ERROR_1002.getType().getSecond();
            }
            MiniAppError.ERROR_1002.getType().getSecond();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (Intrinsics.areEqual(errorCode, MiniAppError.ERROR_10001.getType().getFirst())) {
            return MiniAppError.ERROR_10001.getType().getSecond();
        }
        if (!Intrinsics.areEqual(errorCode, MiniAppError.ERROR_10002.getType().getFirst()) && !Intrinsics.areEqual(errorCode, MiniAppError.ERROR_10003.getType().getFirst()) && !Intrinsics.areEqual(errorCode, MiniAppError.ERROR_10009.getType().getFirst())) {
            int i5 = copydefault + 15;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            if (!Intrinsics.areEqual(errorCode, MiniAppError.ERROR_10010.getType().getFirst()) && !Intrinsics.areEqual(errorCode, MiniAppError.ERROR_10030.getType().getFirst())) {
                return MiniAppError.ERROR_10040.getType().getSecond();
            }
        }
        String second = MiniAppError.ERROR_10002.getType().getSecond();
        int i7 = copydefault + 77;
        component3 = i7 % 128;
        int i8 = i7 % 2;
        return second;
    }

    static {
        int i = ShareDataUIState + 55;
        component1 = i % 128;
        int i2 = i % 2;
    }
}
