package com.huawei.digitalpayment.consumer.login.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/login/viewmodel/QueryPhoneState;", "", "<init>", "()V", "Idle", "Loading", "Success", "Error", "Lcom/huawei/digitalpayment/consumer/login/viewmodel/QueryPhoneState$Error;", "Lcom/huawei/digitalpayment/consumer/login/viewmodel/QueryPhoneState$Idle;", "Lcom/huawei/digitalpayment/consumer/login/viewmodel/QueryPhoneState$Loading;", "Lcom/huawei/digitalpayment/consumer/login/viewmodel/QueryPhoneState$Success;", "ConsumerLoginUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class QueryPhoneState {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component3 = 53 % 128;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/login/viewmodel/QueryPhoneState$Idle;", "Lcom/huawei/digitalpayment/consumer/login/viewmodel/QueryPhoneState;", "<init>", "()V", "ConsumerLoginUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Idle extends QueryPhoneState {
        public static final int $stable = 0;
        public static final Idle INSTANCE = new Idle();
        private static int ShareDataUIState = 0;
        private static int component1 = 1;

        private Idle() {
            super(null);
        }

        static {
            int i = ShareDataUIState + 69;
            component1 = i % 128;
            int i2 = i % 2;
        }
    }

    private QueryPhoneState() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/login/viewmodel/QueryPhoneState$Loading;", "Lcom/huawei/digitalpayment/consumer/login/viewmodel/QueryPhoneState;", "<init>", "()V", "ConsumerLoginUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Loading extends QueryPhoneState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();
        private static int component2 = 0;
        private static int component3 = 1;

        private Loading() {
            super(null);
        }

        static {
            int i = component2 + 123;
            component3 = i % 128;
            if (i % 2 == 0) {
                int i2 = 12 / 0;
            }
        }
    }

    static {
        if (53 % 2 == 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/login/viewmodel/QueryPhoneState$Success;", "Lcom/huawei/digitalpayment/consumer/login/viewmodel/QueryPhoneState;", "msisdn", "", "<init>", "(Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerLoginUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Success extends QueryPhoneState {
        public static final int $stable = 0;
        private static int component1 = 55 % 128;
        private static int component2 = 0;
        private static int component3 = 0;
        private static int copydefault = 1;
        private final String ShareDataUIState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.ShareDataUIState = str;
        }

        public final String getMsisdn() {
            int i = 2 % 2;
            int i2 = copydefault + 89;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            String str = this.ShareDataUIState;
            int i5 = i3 + 37;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 / 0;
            }
            return str;
        }

        static {
            if (55 % 2 == 0) {
                throw null;
            }
        }

        public static Success copy$default(Success success, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component2 + 15;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            if ((i & 1) != 0) {
                str = success.ShareDataUIState;
            }
            Success successCopy = success.copy(str);
            int i5 = component2 + 59;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return successCopy;
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 45;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            String str = this.ShareDataUIState;
            int i5 = i2 + 27;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final Success copy(String msisdn) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(msisdn, "");
            Success success = new Success(msisdn);
            int i2 = copydefault + 87;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return success;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component2 + 33;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            if (Intrinsics.areEqual(this.ShareDataUIState, ((Success) other).ShareDataUIState)) {
                return true;
            }
            int i4 = copydefault + 61;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 93;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                this.ShareDataUIState.hashCode();
                throw null;
            }
            int iHashCode = this.ShareDataUIState.hashCode();
            int i3 = copydefault + 83;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Success(msisdn=" + this.ShareDataUIState + ")";
            int i2 = component2 + 117;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    public QueryPhoneState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H×\u0003J\t\u0010\u0014\u001a\u00020\u0015H×\u0001J\t\u0010\u0016\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/login/viewmodel/QueryPhoneState$Error;", "Lcom/huawei/digitalpayment/consumer/login/viewmodel/QueryPhoneState;", "message", "", "requestId", "isForcedUpdate", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getMessage", "()Ljava/lang/String;", "getRequestId", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "ConsumerLoginUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error extends QueryPhoneState {
        public static final int $stable = 0;
        private static int component1 = 0;
        private static int component3 = 1;
        private static int getAsAtTimestamp = 1;
        private static int getRequestBeneficiariesState;
        private final String ShareDataUIState;
        private final boolean component2;
        private final String copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String str, String str2, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.ShareDataUIState = str;
            this.copydefault = str2;
            this.component2 = z;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Error(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                int i2 = getAsAtTimestamp + 125;
                int i3 = i2 % 128;
                getRequestBeneficiariesState = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 111;
                getAsAtTimestamp = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                str2 = "";
            }
            if ((i & 4) != 0) {
                int i8 = getRequestBeneficiariesState + 119;
                int i9 = i8 % 128;
                getAsAtTimestamp = i9;
                int i10 = i8 % 2;
                int i11 = i9 + 93;
                getRequestBeneficiariesState = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 2 % 2;
                }
                z = false;
            }
            this(str, str2, z);
        }

        public final String getMessage() {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 77;
            int i3 = i2 % 128;
            getAsAtTimestamp = i3;
            int i4 = i2 % 2;
            String str = this.ShareDataUIState;
            int i5 = i3 + 95;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String getRequestId() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 95;
            getRequestBeneficiariesState = i2 % 128;
            if (i2 % 2 == 0) {
                return this.copydefault;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean isForcedUpdate() {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 11;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            boolean z = this.component2;
            if (i3 == 0) {
                int i4 = 95 / 0;
            }
            return z;
        }

        static {
            int i = 1 + 79;
            component1 = i % 128;
            int i2 = i % 2;
        }

        public static Error copy$default(Error error, String str, String str2, boolean z, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = getAsAtTimestamp;
                int i4 = i3 + 39;
                getRequestBeneficiariesState = i4 % 128;
                int i5 = i4 % 2;
                String str3 = error.ShareDataUIState;
                int i6 = i3 + 115;
                getRequestBeneficiariesState = i6 % 128;
                int i7 = i6 % 2;
                str = str3;
            }
            if ((i & 2) != 0) {
                int i8 = getAsAtTimestamp + 39;
                getRequestBeneficiariesState = i8 % 128;
                if (i8 % 2 != 0) {
                    String str4 = error.copydefault;
                    throw null;
                }
                str2 = error.copydefault;
            }
            if ((i & 4) != 0) {
                z = error.component2;
            }
            Error errorCopy = error.copy(str, str2, z);
            int i9 = getAsAtTimestamp + 19;
            getRequestBeneficiariesState = i9 % 128;
            int i10 = i9 % 2;
            return errorCopy;
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 45;
            int i3 = i2 % 128;
            getRequestBeneficiariesState = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            String str = this.ShareDataUIState;
            int i4 = i3 + 49;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 55 / 0;
            }
            return str;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 97;
            getRequestBeneficiariesState = i2 % 128;
            if (i2 % 2 == 0) {
                return this.copydefault;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean component3() {
            boolean z;
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 79;
            int i3 = i2 % 128;
            getAsAtTimestamp = i3;
            if (i2 % 2 == 0) {
                z = this.component2;
                int i4 = 92 / 0;
            } else {
                z = this.component2;
            }
            int i5 = i3 + 107;
            getRequestBeneficiariesState = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 59 / 0;
            }
            return z;
        }

        public final Error copy(String message, String requestId, boolean isForcedUpdate) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(message, "");
            Intrinsics.checkNotNullParameter(requestId, "");
            Error error = new Error(message, requestId, isForcedUpdate);
            int i2 = getRequestBeneficiariesState + 53;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 != 0) {
                return error;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = getRequestBeneficiariesState + 119;
                getAsAtTimestamp = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(other instanceof Error)) {
                int i4 = getRequestBeneficiariesState + 113;
                getAsAtTimestamp = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            Error error = (Error) other;
            if (!Intrinsics.areEqual(this.ShareDataUIState, error.ShareDataUIState) || !Intrinsics.areEqual(this.copydefault, error.copydefault)) {
                return false;
            }
            if (this.component2 == error.component2) {
                return true;
            }
            int i6 = getRequestBeneficiariesState + 27;
            getAsAtTimestamp = i6 % 128;
            return i6 % 2 == 0;
        }

        public int hashCode() {
            int iHashCode;
            boolean z;
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 3;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = this.ShareDataUIState.hashCode();
            if (i3 != 0) {
                iHashCode = ((iHashCode2 << 23) << this.copydefault.hashCode()) % 43;
                z = this.component2;
            } else {
                iHashCode = ((iHashCode2 * 31) + this.copydefault.hashCode()) * 31;
                z = this.component2;
            }
            return iHashCode + Boolean.hashCode(z);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Error(message=" + this.ShareDataUIState + ", requestId=" + this.copydefault + ", isForcedUpdate=" + this.component2 + ")";
            int i2 = getAsAtTimestamp + 123;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }
}
