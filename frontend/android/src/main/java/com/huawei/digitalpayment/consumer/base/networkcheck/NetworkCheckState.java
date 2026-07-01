package com.huawei.digitalpayment.consumer.base.networkcheck;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/networkcheck/NetworkCheckState;", "", "isEnabled", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NetworkCheckState {
    private static int component1 = 0;
    private static int copydefault = 1;
    private final boolean ShareDataUIState;

    public NetworkCheckState(boolean z) {
        this.ShareDataUIState = z;
    }

    public final boolean isEnabled() {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.ShareDataUIState;
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        return z;
    }

    public static NetworkCheckState copy$default(NetworkCheckState networkCheckState, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 45;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 123;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                boolean z2 = networkCheckState.ShareDataUIState;
                throw null;
            }
            z = networkCheckState.ShareDataUIState;
        }
        NetworkCheckState networkCheckStateCopy = networkCheckState.copy(z);
        int i7 = component1 + 95;
        copydefault = i7 % 128;
        int i8 = i7 % 2;
        return networkCheckStateCopy;
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i3 + 77;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final NetworkCheckState copy(boolean isEnabled) {
        int i = 2 % 2;
        NetworkCheckState networkCheckState = new NetworkCheckState(isEnabled);
        int i2 = component1 + 89;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return networkCheckState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 59;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (other instanceof NetworkCheckState) {
            return this.ShareDataUIState == ((NetworkCheckState) other).ShareDataUIState;
        }
        int i4 = copydefault + 29;
        component1 = i4 % 128;
        return i4 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 19;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.ShareDataUIState);
        int i4 = copydefault + 69;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "NetworkCheckState(isEnabled=" + this.ShareDataUIState + ")";
        int i2 = copydefault + 95;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
