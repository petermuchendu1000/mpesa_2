package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout;

import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorType;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\t\n\u000bB\t\b\u0005¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/Resource;", "T", "", "<init>", "()V", Keys.KEY_IS_SUCCESS, "", "isError", GriverMonitorConstants.KEY_IS_LOADING, "Success", "Error", "Loading", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/Resource$Error;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/Resource$Loading;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/Resource$Success;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class Resource<T> {
    public static final int $stable = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÇ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/Resource$Success;", "T", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/Resource;", "data", "<init>", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/Resource$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Success<T> extends Resource<T> {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component3 = 0;
        private static int copydefault = 1;
        private final T component2;

        public Success(T t) {
            super(null);
            this.component2 = t;
        }

        public final T getData() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 49;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            T t = this.component2;
            int i5 = i2 + 77;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return t;
        }

        static {
            int i = 1 + 105;
            component3 = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Success copy$default(Success success, Object obj, int i, Object obj2) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 119;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            if ((i & 1) != 0) {
                int i6 = i3 + 113;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                obj = success.component2;
                if (i7 == 0) {
                    int i8 = 58 / 0;
                }
            }
            return success.copy(obj);
        }

        public final T component1() {
            int i = 2 % 2;
            int i2 = copydefault + 15;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            T t = this.component2;
            int i5 = i3 + 119;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return t;
        }

        public final Success<T> copy(T data) {
            int i = 2 % 2;
            Success<T> success = new Success<>(data);
            int i2 = component1 + 7;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return success;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 115;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (other instanceof Success) {
                return Intrinsics.areEqual(this.component2, ((Success) other).component2);
            }
            int i4 = i2 + 77;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            T t = this.component2;
            if (t == null) {
                int i2 = component1 + 11;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return 0;
            }
            int iHashCode = t.hashCode();
            int i4 = component1 + 35;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Success(data=" + this.component2 + ')';
            int i2 = component1 + 39;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private Resource() {
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH×\u0003J\t\u0010\u000f\u001a\u00020\u0010H×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/Resource$Error;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/Resource;", "", "errorType", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorType;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorType;)V", "getErrorType", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error extends Resource {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 1;
        private static int component3;
        private static int copydefault;
        private final ErrorType component2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(ErrorType errorType) {
            super(null);
            Intrinsics.checkNotNullParameter(errorType, "");
            this.component2 = errorType;
        }

        public final ErrorType getErrorType() {
            int i = 2 % 2;
            int i2 = copydefault + 83;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            ErrorType errorType = this.component2;
            int i5 = i3 + 105;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return errorType;
            }
            throw null;
        }

        static {
            int i = 1 + 41;
            component3 = i % 128;
            if (i % 2 != 0) {
                int i2 = 98 / 0;
            }
        }

        public static Error copy$default(Error error, ErrorType errorType, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = ShareDataUIState + 41;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    errorType = error.component2;
                    int i4 = 23 / 0;
                } else {
                    errorType = error.component2;
                }
            }
            Error errorCopy = error.copy(errorType);
            int i5 = ShareDataUIState + 19;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return errorCopy;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final ErrorType component1() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 75;
            int i3 = i2 % 128;
            copydefault = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            ErrorType errorType = this.component2;
            int i4 = i3 + 63;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return errorType;
        }

        public final Error copy(ErrorType errorType) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(errorType, "");
            Error error = new Error(errorType);
            int i2 = ShareDataUIState + 15;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 79 / 0;
            }
            return error;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 119;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                int i5 = i3 + 107;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (!(!Intrinsics.areEqual(this.component2, ((Error) other).component2))) {
                return true;
            }
            int i7 = ShareDataUIState + 37;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 39;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            ErrorType errorType = this.component2;
            if (i3 != 0) {
                return errorType.hashCode();
            }
            errorType.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Error(errorType=" + this.component2 + ')';
            int i2 = ShareDataUIState + 27;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/Resource$Loading;", "T", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/Resource;", "<init>", "()V", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Loading<T> extends Resource<T> {
        public static final int $stable = 0;
        private static int component1 = 0;
        private static int copydefault = 55 % 128;

        public Loading() {
            super(null);
        }

        static {
            int i = 55 % 2;
        }
    }

    public final boolean isSuccess() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 5;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            boolean z = this instanceof Success;
            throw null;
        }
        boolean z2 = this instanceof Success;
        int i4 = i2 + 101;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return z2;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean isError() {
        int i = 2 % 2;
        int i2 = component3 + 43;
        component2 = i2 % 128;
        boolean z = this instanceof Error;
        if (i2 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isLoading() {
        int i = 2 % 2;
        int i2 = component2 + 117;
        component3 = i2 % 128;
        boolean z = this instanceof Loading;
        if (i2 % 2 == 0) {
            return z;
        }
        throw null;
    }

    static {
        int i = 1 + 73;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public Resource(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
