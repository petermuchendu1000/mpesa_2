package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState;", "", "<init>", "()V", "ErrorHandled", "ErrorData", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorHandled;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ErrorState {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component2;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorHandled;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState;", "<init>", "()V", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ErrorHandled extends ErrorState {
        public static final int $stable = 0;
        public static final ErrorHandled INSTANCE = new ErrorHandled();
        private static int component1 = 1;
        private static int copydefault;

        private ErrorHandled() {
            super(null);
        }

        static {
            int i = copydefault + 79;
            component1 = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private ErrorState() {
    }

    static {
        int i = 1 + 113;
        component2 = i % 128;
        int i2 = i % 2;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState;", "<init>", "()V", "Transaction", "InScreenInfo", "InvalidTillNumber", "InvalidPhoneNumber", "InvalidAmount", "Generic", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$Generic;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$InScreenInfo;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$InvalidAmount;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$InvalidPhoneNumber;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$InvalidTillNumber;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$Transaction;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ErrorData extends ErrorState {
        public static final int $stable = 0;
        private static int component1 = 0;
        private static int copydefault = 1;

        private ErrorData() {
            super(null);
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$Transaction;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData;", "<init>", "()V", "Info", "GlobalTransactions", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$Transaction$GlobalTransactions;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$Transaction$Info;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class Transaction extends ErrorData {
            public static final int $stable = 0;
            private static int ShareDataUIState = 0;
            private static int component3 = 43 % 128;

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$Transaction$Info;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$Transaction;", "error", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorInfo;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorInfo;)V", "getError", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Info extends Transaction {
                public static final int $stable = 0;
                private static int ShareDataUIState = 1;
                private static int component1 = 1;
                private static int component3;
                private static int copydefault;
                private final ErrorInfo component2;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Info(ErrorInfo errorInfo) {
                    super(null);
                    Intrinsics.checkNotNullParameter(errorInfo, "");
                    this.component2 = errorInfo;
                }

                public final ErrorInfo getError() {
                    int i = 2 % 2;
                    int i2 = copydefault;
                    int i3 = i2 + 57;
                    component1 = i3 % 128;
                    Object obj = null;
                    if (i3 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    ErrorInfo errorInfo = this.component2;
                    int i4 = i2 + 49;
                    component1 = i4 % 128;
                    if (i4 % 2 != 0) {
                        return errorInfo;
                    }
                    obj.hashCode();
                    throw null;
                }

                static {
                    int i = 1 + 111;
                    component3 = i % 128;
                    if (i % 2 != 0) {
                        int i2 = 61 / 0;
                    }
                }

                public static Info copy$default(Info info, ErrorInfo errorInfo, int i, Object obj) {
                    int i2 = 2 % 2;
                    int i3 = component1;
                    int i4 = i3 + 31;
                    copydefault = i4 % 128;
                    if (i4 % 2 == 0 && (i & 1) != 0) {
                        errorInfo = info.component2;
                        int i5 = i3 + 99;
                        copydefault = i5 % 128;
                        int i6 = i5 % 2;
                    }
                    return info.copy(errorInfo);
                }

                public final ErrorInfo component1() {
                    int i = 2 % 2;
                    int i2 = component1 + 13;
                    int i3 = i2 % 128;
                    copydefault = i3;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                    ErrorInfo errorInfo = this.component2;
                    int i4 = i3 + 45;
                    component1 = i4 % 128;
                    int i5 = i4 % 2;
                    return errorInfo;
                }

                public final Info copy(ErrorInfo error) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(error, "");
                    Info info = new Info(error);
                    int i2 = copydefault + 63;
                    component1 = i2 % 128;
                    if (i2 % 2 != 0) {
                        return info;
                    }
                    throw null;
                }

                public boolean equals(Object other) {
                    int i = 2 % 2;
                    int i2 = copydefault + 73;
                    int i3 = i2 % 128;
                    component1 = i3;
                    if (i2 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (this == other) {
                        return true;
                    }
                    if (!(!(other instanceof Info))) {
                        if (Intrinsics.areEqual(this.component2, ((Info) other).component2)) {
                            return true;
                        }
                        int i4 = copydefault + 43;
                        component1 = i4 % 128;
                        int i5 = i4 % 2;
                        return false;
                    }
                    int i6 = i3 + 31;
                    copydefault = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = i3 + 53;
                    copydefault = i8 % 128;
                    int i9 = i8 % 2;
                    return false;
                }

                public int hashCode() {
                    int i = 2 % 2;
                    int i2 = component1 + 51;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    int iHashCode = this.component2.hashCode();
                    int i4 = component1 + 41;
                    copydefault = i4 % 128;
                    if (i4 % 2 == 0) {
                        return iHashCode;
                    }
                    throw null;
                }

                public String toString() {
                    int i = 2 % 2;
                    String str = "Info(error=" + this.component2 + ')';
                    int i2 = component1 + 115;
                    copydefault = i2 % 128;
                    if (i2 % 2 == 0) {
                        return str;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            private Transaction() {
                super(null);
            }

            static {
                int i = 43 % 2;
            }

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$Transaction$GlobalTransactions;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$Transaction;", "<init>", "()V", "MaxAmountReached", "MinAmountReached", "DailyLimitReached", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$Transaction$GlobalTransactions$DailyLimitReached;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$Transaction$GlobalTransactions$MaxAmountReached;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$Transaction$GlobalTransactions$MinAmountReached;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static abstract class GlobalTransactions extends Transaction {
                public static final int $stable = 0;
                private static int component2 = 0;
                private static int copydefault = 39 % 128;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$Transaction$GlobalTransactions$MaxAmountReached;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$Transaction$GlobalTransactions;", "<init>", "()V", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class MaxAmountReached extends GlobalTransactions {
                    public static final int $stable = 0;
                    public static final MaxAmountReached INSTANCE = new MaxAmountReached();
                    private static int ShareDataUIState = 0;
                    private static int copydefault = 1;

                    private MaxAmountReached() {
                        super(null);
                    }

                    static {
                        int i = copydefault + 123;
                        ShareDataUIState = i % 128;
                        if (i % 2 == 0) {
                            return;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }

                private GlobalTransactions() {
                    super(null);
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$Transaction$GlobalTransactions$MinAmountReached;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$Transaction$GlobalTransactions;", "<init>", "()V", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class MinAmountReached extends GlobalTransactions {
                    public static final int $stable = 0;
                    public static final MinAmountReached INSTANCE = new MinAmountReached();
                    private static int component1 = 1;
                    private static int component3;

                    private MinAmountReached() {
                        super(null);
                    }

                    static {
                        int i = component3 + 119;
                        component1 = i % 128;
                        int i2 = i % 2;
                    }
                }

                static {
                    int i = 39 % 2;
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$Transaction$GlobalTransactions$DailyLimitReached;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$Transaction$GlobalTransactions;", "<init>", "()V", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class DailyLimitReached extends GlobalTransactions {
                    public static final int $stable = 0;
                    public static final DailyLimitReached INSTANCE = new DailyLimitReached();
                    private static int component2 = 0;
                    private static int copydefault = 1;

                    private DailyLimitReached() {
                        super(null);
                    }

                    static {
                        int i = component2 + 123;
                        copydefault = i % 128;
                        if (i % 2 == 0) {
                            int i2 = 71 / 0;
                        }
                    }
                }

                public GlobalTransactions(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public Transaction(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            int i = 1 + 79;
            component1 = i % 128;
            int i2 = i % 2;
        }

        public ErrorData(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$InScreenInfo;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData;", "<init>", "()V", "WrongPin", "NoConnection", "ValidationExpired", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$InScreenInfo$NoConnection;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$InScreenInfo$ValidationExpired;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$InScreenInfo$WrongPin;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class InScreenInfo extends ErrorData {
            public static final int $stable = 0;
            private static int component1 = 0;
            private static int copydefault = 1 % 128;

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u0003H×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$InScreenInfo$WrongPin;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$InScreenInfo;", "attemptsRemaining", "", "<init>", "(I)V", "getAttemptsRemaining", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class WrongPin extends InScreenInfo {
                public static final int $stable = 0;
                private static int ShareDataUIState = 0;
                private static int component1 = 1;
                private static int component3 = 79 % 128;
                private static int copydefault;
                private final int component2;

                public WrongPin(int i) {
                    super(null);
                    this.component2 = i;
                }

                public final int getAttemptsRemaining() {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState;
                    int i3 = i2 + 113;
                    component1 = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = this.component2;
                    int i6 = i2 + 49;
                    component1 = i6 % 128;
                    if (i6 % 2 != 0) {
                        return i5;
                    }
                    throw null;
                }

                static {
                    int i = 79 % 2;
                }

                public static WrongPin copy$default(WrongPin wrongPin, int i, int i2, Object obj) {
                    int i3 = 2 % 2;
                    int i4 = component1 + 33;
                    int i5 = i4 % 128;
                    ShareDataUIState = i5;
                    int i6 = i4 % 2;
                    if ((i2 & 1) != 0) {
                        int i7 = i5 + 27;
                        component1 = i7 % 128;
                        if (i7 % 2 == 0) {
                            int i8 = wrongPin.component2;
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        i = wrongPin.component2;
                    }
                    return wrongPin.copy(i);
                }

                public final int component1() {
                    int i = 2 % 2;
                    int i2 = component1;
                    int i3 = i2 + 115;
                    ShareDataUIState = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = this.component2;
                    int i6 = i2 + 69;
                    ShareDataUIState = i6 % 128;
                    int i7 = i6 % 2;
                    return i5;
                }

                public final WrongPin copy(int attemptsRemaining) {
                    int i = 2 % 2;
                    WrongPin wrongPin = new WrongPin(attemptsRemaining);
                    int i2 = component1 + 37;
                    ShareDataUIState = i2 % 128;
                    if (i2 % 2 == 0) {
                        return wrongPin;
                    }
                    throw null;
                }

                public boolean equals(Object other) {
                    int i = 2 % 2;
                    if (this == other) {
                        int i2 = component1 + 77;
                        ShareDataUIState = i2 % 128;
                        int i3 = i2 % 2;
                        return true;
                    }
                    if (!(!(other instanceof WrongPin))) {
                        return this.component2 == ((WrongPin) other).component2;
                    }
                    int i4 = component1 + 45;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }

                public int hashCode() {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 45;
                    component1 = i2 % 128;
                    Object obj = null;
                    if (i2 % 2 == 0) {
                        Integer.hashCode(this.component2);
                        obj.hashCode();
                        throw null;
                    }
                    int iHashCode = Integer.hashCode(this.component2);
                    int i3 = component1 + 43;
                    ShareDataUIState = i3 % 128;
                    if (i3 % 2 == 0) {
                        return iHashCode;
                    }
                    obj.hashCode();
                    throw null;
                }

                public String toString() {
                    int i = 2 % 2;
                    String str = "WrongPin(attemptsRemaining=" + this.component2 + ')';
                    int i2 = ShareDataUIState + 109;
                    component1 = i2 % 128;
                    if (i2 % 2 != 0) {
                        return str;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            private InScreenInfo() {
                super(null);
            }

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$InScreenInfo$NoConnection;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$InScreenInfo;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class NoConnection extends InScreenInfo {
                public static final int $stable = 0;
                private static int component1 = 1;
                private static int component2 = 1;
                private static int component3;
                private static int copydefault;
                private final String ShareDataUIState;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public NoConnection(String str) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    this.ShareDataUIState = str;
                }

                public final String getMessage() {
                    int i = 2 % 2;
                    int i2 = component1;
                    int i3 = i2 + 19;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    String str = this.ShareDataUIState;
                    int i5 = i2 + 69;
                    component3 = i5 % 128;
                    int i6 = i5 % 2;
                    return str;
                }

                static {
                    int i = 1 + 79;
                    copydefault = i % 128;
                    int i2 = i % 2;
                }

                public static NoConnection copy$default(NoConnection noConnection, String str, int i, Object obj) {
                    int i2 = 2 % 2;
                    int i3 = component1 + 55;
                    component3 = i3 % 128;
                    if (i3 % 2 == 0 && (i & 1) != 0) {
                        str = noConnection.ShareDataUIState;
                    }
                    NoConnection noConnectionCopy = noConnection.copy(str);
                    int i4 = component1 + 75;
                    component3 = i4 % 128;
                    if (i4 % 2 == 0) {
                        return noConnectionCopy;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }

                public final String component1() {
                    String str;
                    int i = 2 % 2;
                    int i2 = component1 + 109;
                    int i3 = i2 % 128;
                    component3 = i3;
                    if (i2 % 2 != 0) {
                        str = this.ShareDataUIState;
                        int i4 = 5 / 0;
                    } else {
                        str = this.ShareDataUIState;
                    }
                    int i5 = i3 + 99;
                    component1 = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 81 / 0;
                    }
                    return str;
                }

                public final NoConnection copy(String message) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(message, "");
                    NoConnection noConnection = new NoConnection(message);
                    int i2 = component3 + 19;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    return noConnection;
                }

                public boolean equals(Object other) {
                    int i = 2 % 2;
                    if (this == other) {
                        int i2 = component1 + 69;
                        component3 = i2 % 128;
                        return i2 % 2 == 0;
                    }
                    if (!(other instanceof NoConnection)) {
                        return false;
                    }
                    if (Intrinsics.areEqual(this.ShareDataUIState, ((NoConnection) other).ShareDataUIState)) {
                        return true;
                    }
                    int i3 = component3 + 69;
                    component1 = i3 % 128;
                    int i4 = i3 % 2;
                    return false;
                }

                public int hashCode() {
                    int i = 2 % 2;
                    int i2 = component3 + 81;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    int iHashCode = this.ShareDataUIState.hashCode();
                    int i4 = component1 + 81;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                    return iHashCode;
                }

                public String toString() {
                    int i = 2 % 2;
                    String str = "NoConnection(message=" + this.ShareDataUIState + ')';
                    int i2 = component1 + 109;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    return str;
                }
            }

            static {
                int i = 1 % 2;
            }

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$InScreenInfo$ValidationExpired;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$InScreenInfo;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class ValidationExpired extends InScreenInfo {
                public static final int $stable = 0;
                private static int ShareDataUIState = 0;
                private static int component1 = 0;
                private static int component2 = 1;
                private static int component3 = 45 % 128;
                private final String copydefault;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ValidationExpired(String str) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    this.copydefault = str;
                }

                public final String getMessage() {
                    int i = 2 % 2;
                    int i2 = component2 + 29;
                    int i3 = i2 % 128;
                    component1 = i3;
                    int i4 = i2 % 2;
                    String str = this.copydefault;
                    int i5 = i3 + 107;
                    component2 = i5 % 128;
                    if (i5 % 2 != 0) {
                        return str;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                static {
                    if (45 % 2 == 0) {
                        int i = 24 / 0;
                    }
                }

                public static ValidationExpired copy$default(ValidationExpired validationExpired, String str, int i, Object obj) {
                    int i2 = 2 % 2;
                    int i3 = component1 + 35;
                    component2 = i3 % 128;
                    if (i3 % 2 != 0 && (i & 1) != 0) {
                        str = validationExpired.copydefault;
                    }
                    ValidationExpired validationExpiredCopy = validationExpired.copy(str);
                    int i4 = component1 + 125;
                    component2 = i4 % 128;
                    int i5 = i4 % 2;
                    return validationExpiredCopy;
                }

                public final String component1() {
                    int i = 2 % 2;
                    int i2 = component2 + 61;
                    int i3 = i2 % 128;
                    component1 = i3;
                    int i4 = i2 % 2;
                    String str = this.copydefault;
                    int i5 = i3 + 21;
                    component2 = i5 % 128;
                    if (i5 % 2 != 0) {
                        return str;
                    }
                    throw null;
                }

                public final ValidationExpired copy(String message) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(message, "");
                    ValidationExpired validationExpired = new ValidationExpired(message);
                    int i2 = component2 + 55;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    return validationExpired;
                }

                public boolean equals(Object other) {
                    int i = 2 % 2;
                    int i2 = component2;
                    int i3 = i2 + 21;
                    component1 = i3 % 128;
                    int i4 = i3 % 2;
                    if (this == other) {
                        int i5 = i2 + 105;
                        component1 = i5 % 128;
                        int i6 = i5 % 2;
                        return true;
                    }
                    if (!(other instanceof ValidationExpired)) {
                        return false;
                    }
                    if (Intrinsics.areEqual(this.copydefault, ((ValidationExpired) other).copydefault)) {
                        return true;
                    }
                    int i7 = component1 + 37;
                    component2 = i7 % 128;
                    int i8 = i7 % 2;
                    return false;
                }

                public int hashCode() {
                    int i = 2 % 2;
                    int i2 = component1 + 115;
                    component2 = i2 % 128;
                    if (i2 % 2 == 0) {
                        this.copydefault.hashCode();
                        throw null;
                    }
                    int iHashCode = this.copydefault.hashCode();
                    int i3 = component2 + 113;
                    component1 = i3 % 128;
                    int i4 = i3 % 2;
                    return iHashCode;
                }

                public String toString() {
                    int i = 2 % 2;
                    String str = "ValidationExpired(message=" + this.copydefault + ')';
                    int i2 = component2 + 43;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    return str;
                }
            }

            public InScreenInfo(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$InvalidTillNumber;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData;", "<init>", "()V", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class InvalidTillNumber extends ErrorData {
            public static final int $stable = 0;
            public static final InvalidTillNumber INSTANCE = new InvalidTillNumber();
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            private InvalidTillNumber() {
                super(null);
            }

            static {
                int i = component3 + 103;
                ShareDataUIState = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$InvalidPhoneNumber;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData;", "<init>", "()V", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class InvalidPhoneNumber extends ErrorData {
            public static final int $stable = 0;
            public static final InvalidPhoneNumber INSTANCE = new InvalidPhoneNumber();
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            private InvalidPhoneNumber() {
                super(null);
            }

            static {
                int i = component3 + 55;
                ShareDataUIState = i % 128;
                if (i % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$InvalidAmount;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData;", "<init>", "()V", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class InvalidAmount extends ErrorData {
            public static final int $stable = 0;
            public static final InvalidAmount INSTANCE = new InvalidAmount();
            private static int component2 = 1;
            private static int copydefault;

            private InvalidAmount() {
                super(null);
            }

            static {
                int i = component2 + 45;
                copydefault = i % 128;
                int i2 = i % 2;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\t\u0010\u0013\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData$Generic;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState$ErrorData;", "message", "", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getCode", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Generic extends ErrorData {
            public static final int $stable = 0;
            private static int component1 = 0;
            private static int component3 = 0;
            private static int copydefault = 111 % 128;
            private static int getRequestBeneficiariesState = 1;
            private final String ShareDataUIState;
            private final String component2;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Generic(String str, String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.ShareDataUIState = str;
                this.component2 = str2;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public Generic(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 2) != 0) {
                    int i2 = getRequestBeneficiariesState + 107;
                    int i3 = i2 % 128;
                    component3 = i3;
                    int i4 = i2 % 2;
                    int i5 = i3 + 121;
                    getRequestBeneficiariesState = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 2 % 2;
                    }
                    str2 = null;
                }
                this(str, str2);
            }

            public final String getCode() {
                int i = 2 % 2;
                int i2 = component3 + 123;
                getRequestBeneficiariesState = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.component2;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final String getMessage() {
                int i = 2 % 2;
                int i2 = getRequestBeneficiariesState + 15;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.ShareDataUIState;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            static {
                if (111 % 2 == 0) {
                    int i = 54 / 0;
                }
            }

            public static Generic copy$default(Generic generic, String str, String str2, int i, Object obj) {
                int i2 = 2 % 2;
                if ((i & 1) != 0) {
                    int i3 = component3 + 91;
                    getRequestBeneficiariesState = i3 % 128;
                    if (i3 % 2 == 0) {
                        str = generic.ShareDataUIState;
                        int i4 = 27 / 0;
                    } else {
                        str = generic.ShareDataUIState;
                    }
                }
                if ((i & 2) != 0) {
                    int i5 = component3 + 19;
                    getRequestBeneficiariesState = i5 % 128;
                    if (i5 % 2 == 0) {
                        String str3 = generic.component2;
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    str2 = generic.component2;
                }
                return generic.copy(str, str2);
            }

            public final String component1() {
                int i = 2 % 2;
                int i2 = component3;
                int i3 = i2 + 109;
                getRequestBeneficiariesState = i3 % 128;
                int i4 = i3 % 2;
                String str = this.ShareDataUIState;
                int i5 = i2 + 65;
                getRequestBeneficiariesState = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final String component2() {
                int i = 2 % 2;
                int i2 = getRequestBeneficiariesState + 11;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.component2;
                }
                throw null;
            }

            public final Generic copy(String message, String code) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(message, "");
                Generic generic = new Generic(message, code);
                int i2 = getRequestBeneficiariesState + 71;
                component3 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 90 / 0;
                }
                return generic;
            }

            public boolean equals(Object other) {
                int i = 2 % 2;
                int i2 = component3;
                int i3 = i2 + 125;
                getRequestBeneficiariesState = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Generic)) {
                    int i4 = i2 + 3;
                    getRequestBeneficiariesState = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                Generic generic = (Generic) other;
                if (!Intrinsics.areEqual(this.ShareDataUIState, generic.ShareDataUIState)) {
                    int i6 = component3 + 3;
                    getRequestBeneficiariesState = i6 % 128;
                    int i7 = i6 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(this.component2, generic.component2)) {
                    return true;
                }
                int i8 = component3 + 95;
                getRequestBeneficiariesState = i8 % 128;
                if (i8 % 2 != 0) {
                    return false;
                }
                throw null;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = component3 + 7;
                getRequestBeneficiariesState = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = this.ShareDataUIState.hashCode();
                String str = this.component2;
                int iHashCode2 = (iHashCode * 31) + (str == null ? 0 : str.hashCode());
                int i4 = getRequestBeneficiariesState + 101;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 71 / 0;
                }
                return iHashCode2;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Generic(message=" + this.ShareDataUIState + ", code=" + this.component2 + ')';
                int i2 = getRequestBeneficiariesState + 61;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }
        }
    }

    public ErrorState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
