package com.huawei.digitalpayment.consumer.manageandviewdata.resp;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/UpdateLimit;", "", "msisdn", "", "type", "oldLimit", "newLimit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "getType", "getOldLimit", "getNewLimit", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UpdateLimit {
    public static final int $stable = 0;
    private static int component3 = 0;
    private static int component4 = 1;
    private static int copy = 0;
    private static int getRequestBeneficiariesState = 113 % 128;

    @SerializedName("limitValue")
    private final String ShareDataUIState;

    @SerializedName("msisdn")
    private final String component1;

    @SerializedName("limitType")
    private final String component2;

    @SerializedName("newLimitValue")
    private final String copydefault;

    public UpdateLimit(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.component1 = str;
        this.component2 = str2;
        this.ShareDataUIState = str3;
        this.copydefault = str4;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 119;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 71;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getType() {
        int i = 2 % 2;
        int i2 = component4 + 27;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        throw null;
    }

    public final String getOldLimit() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 117;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 25;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getNewLimit() {
        int i = 2 % 2;
        int i2 = component4 + 5;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String str = this.copydefault;
        if (i3 != 0) {
            int i4 = 72 / 0;
        }
        return str;
    }

    static {
        int i = 113 % 2;
    }

    public static UpdateLimit copy$default(UpdateLimit updateLimit, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = updateLimit.component1;
            int i3 = copy + 31;
            component4 = i3 % 128;
            int i4 = i3 % 2;
        }
        if ((i & 2) != 0) {
            str2 = updateLimit.component2;
        }
        if ((i & 4) != 0) {
            str3 = updateLimit.ShareDataUIState;
        }
        if ((i & 8) != 0) {
            str4 = updateLimit.copydefault;
            int i5 = component4 + 69;
            copy = i5 % 128;
            int i6 = i5 % 2;
        }
        return updateLimit.copy(str, str2, str3, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copy + 91;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 19;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 95;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 109;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 19;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 67;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copy + 29;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 19;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 91 / 0;
        }
        return str;
    }

    public final UpdateLimit copy(String msisdn, String type, String oldLimit, String newLimit) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(msisdn, "");
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(oldLimit, "");
        Intrinsics.checkNotNullParameter(newLimit, "");
        UpdateLimit updateLimit = new UpdateLimit(msisdn, type, oldLimit, newLimit);
        int i2 = copy + 69;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return updateLimit;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 75;
        component4 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            int i4 = i2 + 15;
            component4 = i4 % 128;
            if (i4 % 2 != 0) {
                return true;
            }
            obj.hashCode();
            throw null;
        }
        if (!(!(other instanceof UpdateLimit))) {
            UpdateLimit updateLimit = (UpdateLimit) other;
            if (Intrinsics.areEqual(this.component1, updateLimit.component1) && Intrinsics.areEqual(this.component2, updateLimit.component2) && Intrinsics.areEqual(this.ShareDataUIState, updateLimit.ShareDataUIState)) {
                if (Intrinsics.areEqual(this.copydefault, updateLimit.copydefault)) {
                    return true;
                }
                int i5 = component4;
                int i6 = i5 + 23;
                copy = i6 % 128;
                int i7 = i6 % 2;
                int i8 = i5 + 53;
                copy = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copy + 5;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.component1.hashCode() * 31) + this.component2.hashCode()) * 31) + this.ShareDataUIState.hashCode()) * 31) + this.copydefault.hashCode();
        int i4 = copy + 33;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UpdateLimit(msisdn=" + this.component1 + ", type=" + this.component2 + ", oldLimit=" + this.ShareDataUIState + ", newLimit=" + this.copydefault + ")";
        int i2 = copy + 107;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
