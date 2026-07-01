package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorType;", "", "<init>", "()V", "Network", "Validation", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorType$Network;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorType$Validation;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ErrorType {
    public static final int $stable = 0;
    private static int component2 = 0;
    private static int copydefault = 13 % 128;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorType$Network;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorType;", "<init>", "()V", "Generic", "NoConnection", "Timeout", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorType$Network$Generic;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorType$Network$NoConnection;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorType$Network$Timeout;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Network extends ErrorType {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorType$Network$Generic;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorType$Network;", "message", "", "errorCode", "metadata", "", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getMessage", "()Ljava/lang/String;", "getErrorCode", "getMetadata", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Generic extends Network {
            public static final int $stable = 8;
            private static int ShareDataUIState = 15 % 128;
            private static int component3 = 0;
            private static int copy = 1;
            private static int getRequestBeneficiariesState;
            private final String component1;
            private final String component2;
            private final Map<String, Object> copydefault;

            /* JADX WARN: Illegal instructions before constructor call */
            public Generic(String str, String str2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    int i2 = copy + 61;
                    getRequestBeneficiariesState = i2 % 128;
                    int i3 = i2 % 2;
                    int i4 = 2 % 2;
                    str = null;
                }
                if ((i & 2) != 0) {
                    int i5 = 2 % 2;
                    str2 = null;
                }
                if ((i & 4) != 0) {
                    int i6 = copy + 87;
                    getRequestBeneficiariesState = i6 % 128;
                    int i7 = i6 % 2;
                    map = MapsKt.emptyMap();
                    int i8 = getRequestBeneficiariesState + 77;
                    copy = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 2 % 2;
                    }
                }
                this(str, str2, map);
            }

            public final String getMessage() {
                int i = 2 % 2;
                int i2 = copy + 115;
                int i3 = i2 % 128;
                getRequestBeneficiariesState = i3;
                int i4 = i2 % 2;
                String str = this.component2;
                int i5 = i3 + 101;
                copy = i5 % 128;
                if (i5 % 2 != 0) {
                    return str;
                }
                throw null;
            }

            public final String getErrorCode() {
                String str;
                int i = 2 % 2;
                int i2 = getRequestBeneficiariesState + 11;
                int i3 = i2 % 128;
                copy = i3;
                if (i2 % 2 == 0) {
                    str = this.component1;
                    int i4 = 38 / 0;
                } else {
                    str = this.component1;
                }
                int i5 = i3 + 115;
                getRequestBeneficiariesState = i5 % 128;
                if (i5 % 2 == 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Map<String, Object> getMetadata() {
                int i = 2 % 2;
                int i2 = copy + 89;
                int i3 = i2 % 128;
                getRequestBeneficiariesState = i3;
                int i4 = i2 % 2;
                Map<String, Object> map = this.copydefault;
                int i5 = i3 + 103;
                copy = i5 % 128;
                if (i5 % 2 != 0) {
                    return map;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Generic(String str, String str2, Map<String, ? extends Object> map) {
                super(null);
                Intrinsics.checkNotNullParameter(map, "");
                this.component2 = str;
                this.component1 = str2;
                this.copydefault = map;
            }

            static {
                int i = 15 % 2;
            }

            public Generic() {
                this(null, null, null, 7, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static Generic copy$default(Generic generic, String str, String str2, Map map, int i, Object obj) {
                int i2 = 2 % 2;
                int i3 = copy;
                int i4 = i3 + 27;
                getRequestBeneficiariesState = i4 % 128;
                int i5 = i4 % 2;
                if ((i & 1) != 0) {
                    str = generic.component2;
                }
                if ((i & 2) != 0) {
                    int i6 = i3 + 35;
                    getRequestBeneficiariesState = i6 % 128;
                    int i7 = i6 % 2;
                    str2 = generic.component1;
                }
                if ((i & 4) != 0) {
                    map = generic.copydefault;
                    int i8 = getRequestBeneficiariesState + 95;
                    copy = i8 % 128;
                    int i9 = i8 % 2;
                }
                return generic.copy(str, str2, map);
            }

            public final String component1() {
                int i = 2 % 2;
                int i2 = getRequestBeneficiariesState;
                int i3 = i2 + 63;
                copy = i3 % 128;
                int i4 = i3 % 2;
                String str = this.component2;
                int i5 = i2 + 85;
                copy = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final String component2() {
                int i = 2 % 2;
                int i2 = copy;
                int i3 = i2 + 73;
                getRequestBeneficiariesState = i3 % 128;
                if (i3 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                String str = this.component1;
                int i4 = i2 + 79;
                getRequestBeneficiariesState = i4 % 128;
                int i5 = i4 % 2;
                return str;
            }

            public final Map<String, Object> component3() {
                int i = 2 % 2;
                int i2 = getRequestBeneficiariesState;
                int i3 = i2 + 67;
                copy = i3 % 128;
                int i4 = i3 % 2;
                Map<String, Object> map = this.copydefault;
                int i5 = i2 + 57;
                copy = i5 % 128;
                int i6 = i5 % 2;
                return map;
            }

            public final Generic copy(String message, String errorCode, Map<String, ? extends Object> metadata) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(metadata, "");
                Generic generic = new Generic(message, errorCode, metadata);
                int i2 = getRequestBeneficiariesState + 55;
                copy = i2 % 128;
                int i3 = i2 % 2;
                return generic;
            }

            public boolean equals(Object other) {
                int i = 2 % 2;
                if (this == other) {
                    int i2 = copy + 93;
                    getRequestBeneficiariesState = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (!(other instanceof Generic)) {
                    int i4 = copy + 3;
                    getRequestBeneficiariesState = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                Generic generic = (Generic) other;
                if (!Intrinsics.areEqual(this.component2, generic.component2) || !Intrinsics.areEqual(this.component1, generic.component1)) {
                    return false;
                }
                if (Intrinsics.areEqual(this.copydefault, generic.copydefault)) {
                    return true;
                }
                int i6 = copy + 17;
                getRequestBeneficiariesState = i6 % 128;
                return i6 % 2 != 0;
            }

            public int hashCode() {
                String str;
                int iHashCode;
                int i = 2 % 2;
                int i2 = getRequestBeneficiariesState + 31;
                int i3 = i2 % 128;
                copy = i3;
                if (i2 % 2 != 0 ? (str = this.component2) != null : (str = this.component2) != null) {
                    iHashCode = str.hashCode();
                } else {
                    int i4 = i3 + 69;
                    getRequestBeneficiariesState = i4 % 128;
                    int i5 = i4 % 2;
                    iHashCode = 0;
                }
                String str2 = this.component1;
                return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.copydefault.hashCode();
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Generic(message=" + this.component2 + ", errorCode=" + this.component1 + ", metadata=" + this.copydefault + ')';
                int i2 = copy + 33;
                getRequestBeneficiariesState = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }
        }

        private Network() {
            super(null);
        }

        static {
            int i = 1 + 87;
            component1 = i % 128;
            int i2 = i % 2;
        }

        public Network(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorType$Network$NoConnection;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorType$Network;", "<init>", "()V", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class NoConnection extends Network {
            public static final int $stable = 0;
            public static final NoConnection INSTANCE = new NoConnection();
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            private NoConnection() {
                super(null);
            }

            static {
                int i = ShareDataUIState + 51;
                component3 = i % 128;
                int i2 = i % 2;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorType$Network$Timeout;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorType$Network;", "<init>", "()V", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Timeout extends Network {
            public static final int $stable = 0;
            public static final Timeout INSTANCE = new Timeout();
            private static int ShareDataUIState = 1;
            private static int component3;

            private Timeout() {
                super(null);
            }

            static {
                int i = ShareDataUIState + 113;
                component3 = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }
        }
    }

    private ErrorType() {
    }

    static {
        if (13 % 2 == 0) {
            int i = 76 / 0;
        }
    }

    public ErrorType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorType$Validation;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorType;", "<init>", "()V", "InvalidInput", "InvalidFormat", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorType$Validation$InvalidFormat;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorType$Validation$InvalidInput;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Validation extends ErrorType {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int copydefault = 123 % 128;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorType$Validation$InvalidInput;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorType$Validation;", "<init>", "()V", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class InvalidInput extends Validation {
            public static final int $stable = 0;
            public static final InvalidInput INSTANCE = new InvalidInput();
            private static int component1 = 0;
            private static int component3 = 1;

            private InvalidInput() {
                super(null);
            }

            static {
                int i = component1 + 35;
                component3 = i % 128;
                int i2 = i % 2;
            }
        }

        private Validation() {
            super(null);
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorType$Validation$InvalidFormat;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorType$Validation;", "<init>", "()V", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class InvalidFormat extends Validation {
            public static final int $stable = 0;
            public static final InvalidFormat INSTANCE = new InvalidFormat();
            private static int component2 = 0;
            private static int component3 = 1;

            private InvalidFormat() {
                super(null);
            }

            static {
                int i = component3 + 11;
                component2 = i % 128;
                int i2 = i % 2;
            }
        }

        static {
            if (123 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public Validation(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
