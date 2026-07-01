package com.huawei.digitalpayment.consumer.home.ui.resp;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÇ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0019H×\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/resp/ProxiedRequest;", "", "needsIdentity", "", "needsPin", "requestInfo", "Lcom/huawei/digitalpayment/consumer/home/ui/resp/RequestInfoDto;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/huawei/digitalpayment/consumer/home/ui/resp/RequestInfoDto;)V", "getNeedsIdentity", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNeedsPin", "getRequestInfo", "()Lcom/huawei/digitalpayment/consumer/home/ui/resp/RequestInfoDto;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/huawei/digitalpayment/consumer/home/ui/resp/RequestInfoDto;)Lcom/huawei/digitalpayment/consumer/home/ui/resp/ProxiedRequest;", "equals", "other", "hashCode", "", "toString", "", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProxiedRequest {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("needsIdentity")
    private final Boolean needsIdentity;

    @SerializedName("needsPin")
    private final Boolean needsPin;

    @SerializedName("requestInfo")
    private final RequestInfoDto requestInfo;

    public ProxiedRequest(Boolean bool, Boolean bool2, RequestInfoDto requestInfoDto) {
        this.needsIdentity = bool;
        this.needsPin = bool2;
        this.requestInfo = requestInfoDto;
    }

    public final Boolean getNeedsIdentity() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Boolean bool = this.needsIdentity;
        int i4 = i3 + 37;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    public final Boolean getNeedsPin() {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.needsPin;
        }
        throw null;
    }

    public final RequestInfoDto getRequestInfo() {
        RequestInfoDto requestInfoDto;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            requestInfoDto = this.requestInfo;
            int i4 = 69 / 0;
        } else {
            requestInfoDto = this.requestInfo;
        }
        int i5 = i3 + 61;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 39 / 0;
        }
        return requestInfoDto;
    }

    static {
        int i = 1 + 101;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static ProxiedRequest copy$default(ProxiedRequest proxiedRequest, Boolean bool, Boolean bool2, RequestInfoDto requestInfoDto, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 97;
        int i4 = i3 % 128;
        copydefault = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 55;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            bool = proxiedRequest.needsIdentity;
        }
        Object obj2 = null;
        if ((i & 2) != 0) {
            int i8 = ShareDataUIState + 91;
            copydefault = i8 % 128;
            if (i8 % 2 == 0) {
                Boolean bool3 = proxiedRequest.needsPin;
                throw null;
            }
            bool2 = proxiedRequest.needsPin;
        }
        if ((i & 4) != 0) {
            requestInfoDto = proxiedRequest.requestInfo;
        }
        ProxiedRequest proxiedRequestCopy = proxiedRequest.copy(bool, bool2, requestInfoDto);
        int i9 = copydefault + 95;
        ShareDataUIState = i9 % 128;
        if (i9 % 2 == 0) {
            return proxiedRequestCopy;
        }
        obj2.hashCode();
        throw null;
    }

    public final Boolean component1() {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Boolean bool = this.needsIdentity;
        int i5 = i3 + 85;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Boolean component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 23;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.needsPin;
        int i5 = i2 + 35;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final RequestInfoDto component3() {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.requestInfo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ProxiedRequest copy(Boolean needsIdentity, Boolean needsPin, RequestInfoDto requestInfo) {
        int i = 2 % 2;
        ProxiedRequest proxiedRequest = new ProxiedRequest(needsIdentity, needsPin, requestInfo);
        int i2 = ShareDataUIState + 119;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return proxiedRequest;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 33;
            copydefault = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(other instanceof ProxiedRequest)) {
            return false;
        }
        ProxiedRequest proxiedRequest = (ProxiedRequest) other;
        if (!Intrinsics.areEqual(this.needsIdentity, proxiedRequest.needsIdentity)) {
            int i3 = copydefault + 65;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.needsPin, proxiedRequest.needsPin)) {
            return Intrinsics.areEqual(this.requestInfo, proxiedRequest.requestInfo);
        }
        int i5 = copydefault + 49;
        int i6 = i5 % 128;
        ShareDataUIState = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 73;
        copydefault = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 69 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 19;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.needsIdentity;
        if (bool == null) {
            int i5 = i2 + 1;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = bool.hashCode();
        }
        Boolean bool2 = this.needsPin;
        if (bool2 == null) {
            int i7 = copydefault + 49;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = bool2.hashCode();
        }
        RequestInfoDto requestInfoDto = this.requestInfo;
        return (((iHashCode * 31) + iHashCode2) * 31) + (requestInfoDto != null ? requestInfoDto.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ProxiedRequest(needsIdentity=" + this.needsIdentity + ", needsPin=" + this.needsPin + ", requestInfo=" + this.requestInfo + ")";
        int i2 = copydefault + 121;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 56 / 0;
        }
        return str;
    }
}
