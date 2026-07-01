package com.safaricom.consumer.commons.session;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.ImtConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/safaricom/consumer/commons/session/SessionState;", "", "<init>", "()V", "LoggedIn", "LoggedOut", "FastLoggedIn", "Lcom/safaricom/consumer/commons/session/SessionState$FastLoggedIn;", "Lcom/safaricom/consumer/commons/session/SessionState$LoggedIn;", "Lcom/safaricom/consumer/commons/session/SessionState$LoggedOut;", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SessionState {
    private SessionState() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/safaricom/consumer/commons/session/SessionState$LoggedIn;", "Lcom/safaricom/consumer/commons/session/SessionState;", "<init>", "()V", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LoggedIn extends SessionState {
        public static final LoggedIn INSTANCE = new LoggedIn();

        private LoggedIn() {
            super(null);
        }
    }

    public SessionState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/safaricom/consumer/commons/session/SessionState$LoggedOut;", "Lcom/safaricom/consumer/commons/session/SessionState;", ImtConstants.KEY_REASON, "Lcom/safaricom/consumer/commons/session/LogoutReason;", "doNotRedirect", "", "<init>", "(Lcom/safaricom/consumer/commons/session/LogoutReason;Z)V", "getReason", "()Lcom/safaricom/consumer/commons/session/LogoutReason;", "getDoNotRedirect", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LoggedOut extends SessionState {
        private final LogoutReason ShareDataUIState;
        private final boolean copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoggedOut(LogoutReason logoutReason, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(logoutReason, "");
            this.ShareDataUIState = logoutReason;
            this.copydefault = z;
        }

        public LoggedOut(LogoutReason logoutReason, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(logoutReason, (i & 2) != 0 ? false : z);
        }

        public final boolean getDoNotRedirect() {
            return this.copydefault;
        }

        public final LogoutReason getReason() {
            return this.ShareDataUIState;
        }

        public static LoggedOut copy$default(LoggedOut loggedOut, LogoutReason logoutReason, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                logoutReason = loggedOut.ShareDataUIState;
            }
            if ((i & 2) != 0) {
                z = loggedOut.copydefault;
            }
            return loggedOut.copy(logoutReason, z);
        }

        public final LogoutReason getShareDataUIState() {
            return this.ShareDataUIState;
        }

        public final boolean getCopydefault() {
            return this.copydefault;
        }

        public final LoggedOut copy(LogoutReason reason, boolean doNotRedirect) {
            Intrinsics.checkNotNullParameter(reason, "");
            return new LoggedOut(reason, doNotRedirect);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoggedOut)) {
                return false;
            }
            LoggedOut loggedOut = (LoggedOut) other;
            return this.ShareDataUIState == loggedOut.ShareDataUIState && this.copydefault == loggedOut.copydefault;
        }

        public int hashCode() {
            return (this.ShareDataUIState.hashCode() * 31) + Boolean.hashCode(this.copydefault);
        }

        public String toString() {
            return "LoggedOut(reason=" + this.ShareDataUIState + ", doNotRedirect=" + this.copydefault + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/safaricom/consumer/commons/session/SessionState$FastLoggedIn;", "Lcom/safaricom/consumer/commons/session/SessionState;", "<init>", "()V", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FastLoggedIn extends SessionState {
        public static final FastLoggedIn INSTANCE = new FastLoggedIn();

        private FastLoggedIn() {
            super(null);
        }
    }
}
