package com.huawei.digitalpayment.consumer.home.ui.resp;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0019\u001a\u00020\u001aH×\u0001J\t\u0010\u001b\u001a\u00020\u0004H×\u0001R\u001e\u0010\u0002\u001a\u00020\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/resp/ProxiedResponse;", "", "datum", "requestId", "", "status", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "getDatum", "()Ljava/lang/Object;", "setDatum", "(Ljava/lang/Object;)V", "getRequestId", "()Ljava/lang/String;", "setRequestId", "(Ljava/lang/String;)V", "getStatus", "setStatus", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProxiedResponse {
    public static final int $stable = 8;
    private static int ShareDataUIState = 83 % 128;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("data")
    private Object datum;

    @SerializedName("requestId")
    private String requestId;

    @SerializedName("status")
    private String status;

    public ProxiedResponse(Object obj, String str, String str2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.datum = obj;
        this.requestId = str;
        this.status = str2;
    }

    public final Object getDatum() {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Object obj = this.datum;
        int i5 = i3 + 67;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    public final void setDatum(Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 53;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        this.datum = obj;
        int i4 = component3 + 19;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getRequestId() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 119;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.requestId;
            int i4 = 90 / 0;
        } else {
            str = this.requestId;
        }
        int i5 = i2 + 121;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setRequestId(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.requestId = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.requestId = str;
        int i3 = component3 + 89;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 29 / 0;
        }
    }

    public final String getStatus() {
        int i = 2 % 2;
        int i2 = component3 + 69;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.status;
        int i5 = i3 + 95;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 84 / 0;
        }
        return str;
    }

    public final void setStatus(String str) {
        int i = 2 % 2;
        int i2 = component3 + 29;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.status = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.status = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = 83 % 2;
    }

    public static ProxiedResponse copy$default(ProxiedResponse proxiedResponse, Object obj, String str, String str2, int i, Object obj2) {
        int i2 = 2 % 2;
        int i3 = copydefault + 57;
        int i4 = i3 % 128;
        component3 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 45;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            obj = proxiedResponse.datum;
            int i8 = i4 + 35;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
        }
        if ((i & 2) != 0) {
            str = proxiedResponse.requestId;
        }
        if ((i & 4) != 0) {
            int i10 = i4 + 103;
            copydefault = i10 % 128;
            int i11 = i10 % 2;
            str2 = proxiedResponse.status;
            int i12 = i4 + 47;
            copydefault = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 4 % 2;
            }
        }
        return proxiedResponse.copy(obj, str, str2);
    }

    public final Object component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 49;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = this.datum;
        int i5 = i2 + 85;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 39 / 0;
        }
        return obj;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.requestId;
        int i5 = i3 + 43;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 98 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.status;
        int i5 = i3 + 37;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 89 / 0;
        }
        return str;
    }

    public final ProxiedResponse copy(Object datum, String requestId, String status) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(datum, "");
        Intrinsics.checkNotNullParameter(requestId, "");
        Intrinsics.checkNotNullParameter(status, "");
        ProxiedResponse proxiedResponse = new ProxiedResponse(datum, requestId, status);
        int i2 = copydefault + 107;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return proxiedResponse;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            int i4 = i3 + 107;
            copydefault = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!(other instanceof ProxiedResponse)) {
            return false;
        }
        ProxiedResponse proxiedResponse = (ProxiedResponse) other;
        if (!Intrinsics.areEqual(this.datum, proxiedResponse.datum)) {
            return false;
        }
        if (Intrinsics.areEqual(this.requestId, proxiedResponse.requestId)) {
            return Intrinsics.areEqual(this.status, proxiedResponse.status);
        }
        int i5 = copydefault + 119;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        component3 = i2 % 128;
        return i2 % 2 != 0 ? (((r0 / 59) - this.requestId.hashCode()) - 120) * this.status.hashCode() : (((this.datum.hashCode() * 31) + this.requestId.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ProxiedResponse(datum=" + this.datum + ", requestId=" + this.requestId + ", status=" + this.status + ")";
        int i2 = copydefault + 77;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
