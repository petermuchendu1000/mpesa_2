package com.huawei.digitalpayment.consumer.service;

import com.huawei.digitalpayment.consumer.constants.Keys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/service/UnreadState;", "", "total", "", "system", Keys.TRANSACTION, "promotion", "<init>", "(IIII)V", "getTotal", "()I", "setTotal", "(I)V", "getSystem", "setSystem", "getTransaction", "setTransaction", "getPromotion", "setPromotion", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "ServiceModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UnreadState {
    private static int component2 = 0;
    private static int copy = 1;
    private int ShareDataUIState;
    private int component1;
    private int component3;
    private int copydefault;

    public UnreadState(int i, int i2, int i3, int i4) {
        this.ShareDataUIState = i;
        this.component3 = i2;
        this.copydefault = i3;
        this.component1 = i4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UnreadState(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i5 & 1) != 0) {
            int i6 = copy + 97;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        }
        if ((i5 & 2) != 0) {
            int i8 = component2 + 57;
            copy = i8 % 128;
            int i9 = i8 % 2;
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            int i10 = copy + 101;
            component2 = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            int i13 = component2 + 109;
            copy = i13 % 128;
            int i14 = i13 % 2;
            int i15 = 2 % 2;
            i4 = 0;
        }
        this(i, i2, i3, i4);
    }

    public final int getTotal() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 85;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.ShareDataUIState;
        int i6 = i2 + 97;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final void setTotal(int i) {
        int i2 = 2 % 2;
        int i3 = copy + 27;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        this.ShareDataUIState = i;
        int i6 = i4 + 79;
        copy = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 66 / 0;
        }
    }

    public final int getSystem() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 89;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.component3;
        int i6 = i2 + 111;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final void setSystem(int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 53;
        int i4 = i3 % 128;
        copy = i4;
        int i5 = i3 % 2;
        Object obj = null;
        this.component3 = i;
        if (i5 == 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 51;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public final int getTransaction() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 93;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.copydefault;
        int i5 = i2 + 61;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public final void setTransaction(int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 17;
        copy = i3 % 128;
        int i4 = i3 % 2;
        this.copydefault = i;
        if (i4 == 0) {
            int i5 = 76 / 0;
        }
    }

    public final int getPromotion() {
        int i = 2 % 2;
        int i2 = copy + 61;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        throw null;
    }

    public final void setPromotion(int i) {
        int i2 = 2 % 2;
        int i3 = copy + 123;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        this.component1 = i;
        if (i5 != 0) {
            int i6 = 34 / 0;
        }
        int i7 = i4 + 31;
        copy = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 99 / 0;
        }
    }

    public UnreadState() {
        this(0, 0, 0, 0, 15, null);
    }

    public static UnreadState copy$default(UnreadState unreadState, int i, int i2, int i3, int i4, int i5, Object obj) {
        int i6 = 2 % 2;
        int i7 = component2 + 83;
        int i8 = i7 % 128;
        copy = i8;
        int i9 = i7 % 2;
        if ((i5 & 1) != 0) {
            int i10 = i8 + 27;
            component2 = i10 % 128;
            int i11 = i10 % 2;
            i = unreadState.ShareDataUIState;
        }
        if ((i5 & 2) != 0) {
            i2 = unreadState.component3;
        }
        if ((i5 & 4) != 0) {
            i3 = unreadState.copydefault;
        }
        if ((i5 & 8) != 0) {
            i4 = unreadState.component1;
        }
        UnreadState unreadStateCopy = unreadState.copy(i, i2, i3, i4);
        int i12 = component2 + 47;
        copy = i12 % 128;
        int i13 = i12 % 2;
        return unreadStateCopy;
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 51;
        copy = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.ShareDataUIState;
        int i6 = i2 + 63;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = copy + 85;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = this.component3;
        int i6 = i3 + 101;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component3() {
        int i;
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 95;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            i = this.copydefault;
            int i5 = 71 / 0;
        } else {
            i = this.copydefault;
        }
        int i6 = i3 + 47;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final int component4() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 17;
        copy = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.component1;
        int i6 = i2 + 25;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final UnreadState copy(int total, int system, int transaction, int promotion) {
        int i = 2 % 2;
        UnreadState unreadState = new UnreadState(total, system, transaction, promotion);
        int i2 = component2 + 53;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return unreadState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 51;
        int i4 = i3 % 128;
        component2 = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnreadState)) {
            int i5 = i4 + 81;
            copy = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        UnreadState unreadState = (UnreadState) other;
        if (this.ShareDataUIState == unreadState.ShareDataUIState) {
            return this.component3 == unreadState.component3 && this.copydefault == unreadState.copydefault && this.component1 == unreadState.component1;
        }
        int i7 = i2 + 45;
        component2 = i7 % 128;
        return i7 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copy + 11;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((Integer.hashCode(this.ShareDataUIState) * 31) + Integer.hashCode(this.component3)) * 31) + Integer.hashCode(this.copydefault)) * 31) + Integer.hashCode(this.component1);
        int i4 = component2 + 85;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UnreadState(total=" + this.ShareDataUIState + ", system=" + this.component3 + ", transaction=" + this.copydefault + ", promotion=" + this.component1 + ")";
        int i2 = component2 + 37;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
