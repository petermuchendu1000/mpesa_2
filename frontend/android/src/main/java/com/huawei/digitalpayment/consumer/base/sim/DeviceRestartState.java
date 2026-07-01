package com.huawei.digitalpayment.consumer.base.sim;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartState;", "", "<init>", "()V", "Unknown", "NotRestarted", "Loading", "MsisdnMatch", "MsisdnMismatch", "ProceedWithLogin", "NoLastLoginMsisdn", "Error", "Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartState$Error;", "Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartState$Loading;", "Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartState$MsisdnMatch;", "Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartState$MsisdnMismatch;", "Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartState$NoLastLoginMsisdn;", "Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartState$NotRestarted;", "Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartState$ProceedWithLogin;", "Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartState$Unknown;", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class DeviceRestartState {
    private DeviceRestartState() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartState$Unknown;", "Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartState;", "<init>", "()V", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Unknown extends DeviceRestartState {
        public static final Unknown INSTANCE = new Unknown();
        private static int component3 = 0;
        private static int copydefault = 1;

        private Unknown() {
            super(null);
        }

        static {
            int i = component3 + 15;
            copydefault = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public DeviceRestartState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartState$NotRestarted;", "Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartState;", "<init>", "()V", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotRestarted extends DeviceRestartState {
        public static final NotRestarted INSTANCE = new NotRestarted();
        private static int component2 = 0;
        private static int component3 = 1;

        private NotRestarted() {
            super(null);
        }

        static {
            int i = component2 + 27;
            component3 = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartState$Loading;", "Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartState;", "<init>", "()V", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Loading extends DeviceRestartState {
        public static final Loading INSTANCE = new Loading();
        private static int component2 = 1;
        private static int copydefault;

        private Loading() {
            super(null);
        }

        static {
            int i = component2 + 117;
            copydefault = i % 128;
            if (i % 2 != 0) {
                int i2 = 10 / 0;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartState$MsisdnMatch;", "Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartState;", "<init>", "()V", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MsisdnMatch extends DeviceRestartState {
        public static final MsisdnMatch INSTANCE = new MsisdnMatch();
        private static int component1 = 1;
        private static int component3;

        private MsisdnMatch() {
            super(null);
        }

        static {
            int i = component3 + 105;
            component1 = i % 128;
            int i2 = i % 2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartState$MsisdnMismatch;", "Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartState;", "<init>", "()V", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MsisdnMismatch extends DeviceRestartState {
        public static final MsisdnMismatch INSTANCE = new MsisdnMismatch();
        private static int component1 = 0;
        private static int copydefault = 1;

        private MsisdnMismatch() {
            super(null);
        }

        static {
            int i = component1 + 125;
            copydefault = i % 128;
            int i2 = i % 2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartState$ProceedWithLogin;", "Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartState;", "<init>", "()V", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProceedWithLogin extends DeviceRestartState {
        public static final ProceedWithLogin INSTANCE = new ProceedWithLogin();
        private static int ShareDataUIState = 1;
        private static int component3;

        private ProceedWithLogin() {
            super(null);
        }

        static {
            int i = component3 + 101;
            ShareDataUIState = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartState$NoLastLoginMsisdn;", "Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartState;", "<init>", "()V", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoLastLoginMsisdn extends DeviceRestartState {
        public static final NoLastLoginMsisdn INSTANCE = new NoLastLoginMsisdn();
        private static int ShareDataUIState = 1;
        private static int copydefault;

        private NoLastLoginMsisdn() {
            super(null);
        }

        static {
            int i = copydefault + 75;
            ShareDataUIState = i % 128;
            if (i % 2 == 0) {
                int i2 = 84 / 0;
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartState$Error;", "Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartState;", "message", "", "requestId", "isForcedUpdate", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getMessage", "()Ljava/lang/String;", "getRequestId", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error extends DeviceRestartState {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        private final boolean component1;
        private final String component3;
        private final String copydefault;

        /* JADX WARN: Illegal instructions before constructor call */
        public Error(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                int i2 = ShareDataUIState + 37;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
                str2 = "";
            }
            if ((i & 4) != 0) {
                int i4 = component2 + 13;
                ShareDataUIState = i4 % 128;
                z = i4 % 2 != 0;
            }
            this(str, str2, z);
        }

        public final String getMessage() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 113;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.copydefault;
            }
            throw null;
        }

        public final String getRequestId() {
            int i = 2 % 2;
            int i2 = component2 + 55;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            String str = this.component3;
            if (i3 != 0) {
                int i4 = 72 / 0;
            }
            return str;
        }

        public final boolean isForcedUpdate() {
            boolean z;
            int i = 2 % 2;
            int i2 = component2 + 41;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            if (i2 % 2 != 0) {
                z = this.component1;
                int i4 = 88 / 0;
            } else {
                z = this.component1;
            }
            int i5 = i3 + 33;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String str, String str2, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.copydefault = str;
            this.component3 = str2;
            this.component1 = z;
        }

        public static Error copy$default(Error error, String str, String str2, boolean z, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 111;
            int i4 = i3 % 128;
            component2 = i4;
            int i5 = i3 % 2;
            if ((i & 1) != 0) {
                str = error.copydefault;
            }
            if ((i & 2) != 0) {
                int i6 = i4 + 9;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 != 0) {
                    String str3 = error.component3;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                str2 = error.component3;
            }
            if ((i & 4) != 0) {
                int i7 = i4 + 39;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
                z = error.component1;
            }
            return error.copy(str, str2, z);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 1;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            String str = this.copydefault;
            int i5 = i3 + 103;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 121;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.component3;
            int i5 = i2 + 5;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final boolean component3() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 89;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.component1;
            int i5 = i2 + 7;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return z;
            }
            throw null;
        }

        public final Error copy(String message, String requestId, boolean isForcedUpdate) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(message, "");
            Intrinsics.checkNotNullParameter(requestId, "");
            Error error = new Error(message, requestId, isForcedUpdate);
            int i2 = ShareDataUIState + 61;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return error;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 29;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            if (this == other) {
                int i5 = i2 + 11;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            if (!Intrinsics.areEqual(this.copydefault, error.copydefault) || !Intrinsics.areEqual(this.component3, error.component3) || this.component1 != error.component1) {
                return false;
            }
            int i7 = component2 + 37;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 43;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((this.copydefault.hashCode() * 31) + this.component3.hashCode()) * 31) + Boolean.hashCode(this.component1);
            int i4 = ShareDataUIState + 35;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Error(message=" + this.copydefault + ", requestId=" + this.component3 + ", isForcedUpdate=" + this.component1 + ")";
            int i2 = ShareDataUIState + 63;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }
}
