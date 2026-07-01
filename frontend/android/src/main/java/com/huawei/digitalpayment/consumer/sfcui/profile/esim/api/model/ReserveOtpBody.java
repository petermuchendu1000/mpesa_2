package com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\r\u001a\u00020\u000eH×\u0001J\t\u0010\u000f\u001a\u00020\u0003H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/ReserveOtpBody;", "", "serviceRequestId", "", "<init>", "(Ljava/lang/String;)V", "getServiceRequestId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReserveOtpBody {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault;

    @SerializedName("serviceRequestId")
    private final String component3;

    public ReserveOtpBody(String str) {
        this.component3 = str;
    }

    public final String getServiceRequestId() {
        int i = 2 % 2;
        int i2 = component1 + 69;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 117;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 1 + 111;
        copydefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static ReserveOtpBody copy$default(ReserveOtpBody reserveOtpBody, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 3;
        int i4 = i3 % 128;
        component1 = i4;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            str = reserveOtpBody.component3;
            int i5 = i4 + 39;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
        }
        return reserveOtpBody.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 29;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final ReserveOtpBody copy(String serviceRequestId) {
        int i = 2 % 2;
        ReserveOtpBody reserveOtpBody = new ReserveOtpBody(serviceRequestId);
        int i2 = ShareDataUIState + 17;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return reserveOtpBody;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 73;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i3 % 2;
        Object obj = null;
        if (this == other) {
            int i6 = i2 + 107;
            component1 = i6 % 128;
            if (i6 % 2 == 0) {
                return true;
            }
            obj.hashCode();
            throw null;
        }
        if (!(other instanceof ReserveOtpBody)) {
            int i7 = i4 + 91;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component3, ((ReserveOtpBody) other).component3)) {
            int i9 = component1 + 125;
            ShareDataUIState = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        int i11 = component1 + 23;
        ShareDataUIState = i11 % 128;
        if (i11 % 2 != 0) {
            return true;
        }
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 105;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.component3;
        if (str != null) {
            return str.hashCode();
        }
        int i4 = i2 + 75;
        ShareDataUIState = i4 % 128;
        return i4 % 2 == 0 ? 1 : 0;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ReserveOtpBody(serviceRequestId=" + this.component3 + ")";
        int i2 = ShareDataUIState + 121;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
