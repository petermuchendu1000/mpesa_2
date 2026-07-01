package com.huawei.digitalpayment.consumer.base.sim;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/sim/SimCardRemovalState;", "", "isSimRemoved", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SimCardRemovalState {
    private static int component1 = 1;
    private static int component3;
    private final boolean component2;

    public SimCardRemovalState(boolean z) {
        this.component2 = z;
    }

    public final boolean isSimRemoved() {
        int i = 2 % 2;
        int i2 = component1 + 31;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        throw null;
    }

    public static SimCardRemovalState copy$default(SimCardRemovalState simCardRemovalState, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component1;
            int i4 = i3 + 11;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            boolean z2 = simCardRemovalState.component2;
            int i6 = i3 + 63;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            z = z2;
        }
        return simCardRemovalState.copy(z);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = component3 + 29;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        throw null;
    }

    public final SimCardRemovalState copy(boolean isSimRemoved) {
        int i = 2 % 2;
        SimCardRemovalState simCardRemovalState = new SimCardRemovalState(isSimRemoved);
        int i2 = component1 + 29;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return simCardRemovalState;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 73;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this != other) {
            if (!(other instanceof SimCardRemovalState)) {
                return false;
            }
            if (this.component2 == ((SimCardRemovalState) other).component2) {
                return true;
            }
            int i4 = i2 + 97;
            component3 = i4 % 128;
            return i4 % 2 != 0;
        }
        int i5 = i2 + 15;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i2 + 3;
        component3 = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 66 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 83;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Boolean.hashCode(this.component2);
            obj.hashCode();
            throw null;
        }
        int iHashCode = Boolean.hashCode(this.component2);
        int i3 = component3 + 3;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SimCardRemovalState(isSimRemoved=" + this.component2 + ")";
        int i2 = component1 + 73;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
