package com.huawei.digitalpayment.consumer.manageandviewdata.resp;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/DeleteLimit;", "", "msisdn", "", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeleteLimit {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component2 = 63 % 128;
    private static int copydefault = 0;
    private static int equals = 1;

    @SerializedName("msisdn")
    private final String component1;

    @SerializedName("limitType")
    private final String component3;

    public DeleteLimit(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.component1 = str;
        this.component3 = str2;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 15;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.component1;
        int i4 = i2 + 89;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
        return str;
    }

    public final String getType() {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 83;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = 63 % 2;
    }

    public static DeleteLimit copy$default(DeleteLimit deleteLimit, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 9;
        int i4 = i3 % 128;
        equals = i4;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = deleteLimit.component1;
        }
        if ((i & 2) != 0) {
            int i5 = i4 + 67;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            str2 = deleteLimit.component3;
        }
        return deleteLimit.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = equals + 97;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = equals + 31;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        throw null;
    }

    public final DeleteLimit copy(String msisdn, String type) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(msisdn, "");
        Intrinsics.checkNotNullParameter(type, "");
        DeleteLimit deleteLimit = new DeleteLimit(msisdn, type);
        int i2 = equals + 39;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return deleteLimit;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = equals + 47;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof DeleteLimit)) {
            int i4 = equals + 69;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        DeleteLimit deleteLimit = (DeleteLimit) other;
        if (Intrinsics.areEqual(this.component1, deleteLimit.component1)) {
            return Intrinsics.areEqual(this.component3, deleteLimit.component3);
        }
        int i6 = copydefault + 121;
        equals = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        equals = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.component1.hashCode() * 31) + this.component3.hashCode();
        int i4 = equals + 67;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DeleteLimit(msisdn=" + this.component1 + ", type=" + this.component3 + ")";
        int i2 = equals + 35;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
